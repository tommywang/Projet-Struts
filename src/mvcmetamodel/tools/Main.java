package mvcmetamodel.tools;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Map;
import mvcmetamodel.*;
import mvcmetamodel.impl.*;
import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.resource.ResourceSet;
import org.eclipse.emf.ecore.resource.impl.ResourceSetImpl;
import org.eclipse.emf.ecore.xmi.impl.XMIResourceFactoryImpl;

public class Main {

	/**
	* @param args
	*/
	public static WebApp load(File f) {
		ResourceSet rs = new ResourceSetImpl();
		Resource.Factory.Registry registry = rs.getResourceFactoryRegistry();
		Map<String,Object> m = registry.getExtensionToFactoryMap();
		m.put("xmi", new XMIResourceFactoryImpl());
		rs.getPackageRegistry().put(MvcmetamodelPackage.eNS_URI,MvcmetamodelPackage.eINSTANCE);

		URI uri = URI.createFileURI(f.getAbsolutePath());
		Resource resource = rs.getResource(uri, true);
	
		if (resource.isLoaded() && resource.getContents().size() > 0) {
			return (WebApp) resource.getContents().get(0);
		}
		return null;
	}
	
    public static void ecrireFichier(File file, String content){
      try{
        PrintWriter out  = new PrintWriter(new FileWriter(file));
        out.println(content);
        out.close();
      }
      catch(Exception e){
    	System.out.println("BUG!!!!!!!!!!!");
        e.printStackTrace();
      }
    }
	
    public static String generateConfig(WebApp webApp){
    	Config config=new Config();
    	config.visit(webApp.getStartPage());
    	for (Page p:webApp.getPages()){
			config.visit(p);
		}
    	
    	String result=config.getHead();
    	result+="<struts-config>\n";
    	result+="<form-beans>\n"+config.getFormBean()+"</form-beans>\n";
    	result+="<action-mappings>\n"+config.getActionMapping()+"</action-mappings>\n";
    	result+="<message-resources parameter=\"Resources\" />\n";
    	result+="</struts-config>\n";
		return result;
    }
    
	public static void main(String[] args) { 
		File f = new File("model/WebApp2.xmi");
		WebApp appli=load(f);	
		MvcmetamodelFactoryImpl fac=new MvcmetamodelFactoryImpl();
		
		JSPVisitor jspVisitor=new JSPVisitor();
		
		//create the index
		try
		{
			Page mainPage=appli.getStartPage();
			String result=jspVisitor.visit(mainPage);
			String pageName="Generated/pages/"+mainPage.getName()+"."+mainPage.getType();
			File mFichier = new File(pageName);
			mFichier.createNewFile();
			Main.ecrireFichier(mFichier, result);
			System.out.println("Index generated with success");
		}
		catch (IOException e)
		{
			System.out.println("Impossible de créer l'index");
		}
		
		//create the others pages
		for (Page p :appli.getPages()){
			try
			{
				String result1=jspVisitor.visit(p);
				String pageName="Generated/pages/"+p.getName()+"."+p.getType();
				File mFile = new File(pageName);
				mFile.createNewFile();
				Main.ecrireFichier(mFile, result1);
				System.out.println(pageName+" generated with success");
			}
			catch (IOException e)
			{
				System.out.println("Impossible de créer la page");
			}
		}
		
		//create struts-config.xml
		Config con=new Config();
		for (Page p:appli.getPages()){con.visit(p);}
		try
		{
			String pageName="Generated/WEB-INF/struts-config.xml";
			File mFile = new File(pageName);
			mFile.createNewFile();
			Main.ecrireFichier(mFile, generateConfig(appli));
			System.out.println("struts-config.xml generated with success");
		}
		catch (IOException e)
		{
			System.out.println("Impossible de créer struts-config.xml");
		}
		
		//create Resource
		try
		{
			String pageName="Generated/src/Resources.properties";
			File mFile = new File(pageName);
			mFile.createNewFile();
			Main.ecrireFichier(mFile, jspVisitor.getContentRessource());
			System.out.println("Resources.properties generated with success");
		}
		catch (IOException e)
		{
			System.out.println("Impossible de créer le fichier resource");
		}
		
		String result=new WebXMLVisitor().visit(appli);
		File webXMLFile;
		try
		{
			String pageName="Generated/WEB-INF/web.xml";
			webXMLFile = new File(pageName);
			webXMLFile.createNewFile();
			Main.ecrireFichier(webXMLFile, result);
			System.out.println("web.xml generated with success");
		}
		catch (IOException e)
		{
			System.out.println("Impossible de creer le fichier");
		}
		
		String resultAction="";
		String resultActionForm="";
		for (Page p :appli.getPages()){
			for (Content content : (p.getBody().getContents())){
				if (content instanceof Form){
					File actionFile;
					File actionFormFile;
					try
					{
						resultAction=(new ActionVisitor()).visit((Form)content);
						resultActionForm=(new ActionFormVisitor()).doAll((Form)content);
						String pageNameAction="Generated/src/org/lip6/struts/servletAction/" + ((Form)content).getAction() + "Action.java";
						String pageNameActionForm="Generated/src/org/lip6/struts/actionForm/" + ((Form)content).getAction() + "ValidationForm.java";
						actionFile = new File(pageNameAction);
						actionFormFile = new File(pageNameActionForm);
						actionFile.createNewFile();
						actionFormFile.createNewFile();
						Main.ecrireFichier(actionFile, resultAction);
						Main.ecrireFichier(actionFormFile, resultActionForm);
						System.out.println(((Form)content).getAction() + "Action.java"+" and "+
								((Form)content).getAction() + "ValidationForm.java"+ " generated with success");
					}
					catch (IOException e)
					{
						System.out.println("Impossible de creer le fichier");
					}
				}
			}
		}

	}
}
