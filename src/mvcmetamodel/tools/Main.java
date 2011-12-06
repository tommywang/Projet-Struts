package mvcmetamodel.tools;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Map;
import mvcmetamodel.Application;
import mvcmetamodel.MvcmetamodelPackage;
import mvcmetamodel.WebXML;
import mvcmetamodel.impl.MvcmetamodelFactoryImpl;
import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.resource.ResourceSet;
import org.eclipse.emf.ecore.resource.impl.ResourceSetImpl;
import org.eclipse.emf.ecore.xmi.impl.XMIResourceFactoryImpl;

public class Main {

	/**
	* @param args
	*/
	public static Application load(File f) {
		ResourceSet rs = new ResourceSetImpl();
		Resource.Factory.Registry registry = rs.getResourceFactoryRegistry();
		Map<String,Object> m = registry.getExtensionToFactoryMap();
		m.put("xmi", new XMIResourceFactoryImpl());
		rs.getPackageRegistry().put(MvcmetamodelPackage.eNS_URI,MvcmetamodelPackage.eINSTANCE);

		URI uri = URI.createFileURI(f.getAbsolutePath());
		Resource resource = rs.getResource(uri, true);
	
		if (resource.isLoaded() && resource.getContents().size() > 0) {
			return (Application) resource.getContents().get(0);
		}
		return null;
	}
	
    //écrit le résultat des trie
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
	
	public static void main(String[] args) { 
		File f = new File("model/Application.xmi");
		Application appli=load(f);	
		MvcmetamodelFactoryImpl fac=new MvcmetamodelFactoryImpl();
		System.out.println(appli.getName());
		WebXML webxml = appli.getWebxml();
		String result= new WebXMLVisitor().visit(webxml);
		File monFichier;
		try
		{
			monFichier = new File("test/web.xml");
			monFichier.createNewFile();
			Main.ecrireFichier(monFichier, result);
			System.out.println("tout va bien");
		}
		catch (IOException e)
		{
			System.out.println("Impossible de créer le fichier");
		}
	}
	
}
