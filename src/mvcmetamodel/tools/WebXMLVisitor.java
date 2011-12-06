package mvcmetamodel.tools;

import java.util.Iterator;

import org.eclipse.emf.common.util.EList;

import mvcmetamodel.InitParam;
import mvcmetamodel.Page;
import mvcmetamodel.ResourceRef;
import mvcmetamodel.Resources;
import mvcmetamodel.Servlet;
import mvcmetamodel.ServletMapping;
import mvcmetamodel.WebXML;
import mvcmetamodel.WelcomeFile;
import mvcmetamodel.WelcomeFileList;

public class WebXMLVisitor implements Visitor {

	@Override
	public String visit(WebXML webxml) {
		String result="";
		result+="<?xml version=\"1.0\" encoding=\"UTF-8\"?>\n" +
				"<web-app xmlns:xsi=\"http://www.w3.org/2001/XMLSchema-instance\" xmlns=\"http://java.sun.com/xml/ns/javaee\" " +
				"xmlns:web=\"http://java.sun.com/xml/ns/javaee/web-app_2_5.xsd\" xsi:schemaLocation= " +
				"\"http://java.sun.com/xml/ns/javaee http://java.sun.com/xml/ns/javaee/web-app_2_5.xsd\" id=\"WebApp_ID\" version=\"2.5\">\n" +
				"<display-name>" + webxml.getName() + "</display-name>\n";
		if (webxml.getWelcomeFileList()!=null){
			result+=this.visit(webxml.getWelcomeFileList());
		}
		if (webxml.getServlet()!=null){
			result+=this.visit(webxml.getServlet());
		}
		if (webxml.getServletMapping()!=null){
			result+=this.visit(webxml.getServletMapping());
		}
		if (webxml.getResourceRef()!=null){
			result+=this.visit(webxml.getResourceRef());
		}
		result+="</web-app>";
		return result;
	}

	@Override
	public String visit(Resources resources) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public String visit(Page page) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public String visit(WelcomeFileList welcomeFileList) {
		String result="";
		result+="<welcome-file-list>\n";
		if (welcomeFileList.getWelcomeFile()!=null){
			@SuppressWarnings("unchecked")
			EList<WelcomeFile> listWelcomeFiles = welcomeFileList.getWelcomeFile();
			for (WelcomeFile welcomeFile : listWelcomeFiles) {
				result+=this.visit(welcomeFile);
			}
		}
		result+="</welcome-file-list>\n";
		return result;
	}

	@Override
	public String visit(WelcomeFile welcomeFile) {
		String result="";
		result+="<welcome-file>" + welcomeFile.getPageName().getName()+"."+
				welcomeFile.getPageName().getType()+"</welcome-file>\n";
		return result;
	}

	@Override
	public String visit(ResourceRef resourceRef) {
		String result="";
		result+="<resource-ref>\n";
		if (!(resourceRef.getDescription().equals(""))){
			result+="<description>"+ resourceRef.getDescription() +"</description>\n";
		}
		if (!(resourceRef.getResRefName().equals(""))){
			result+="<res-ref-name>"+ resourceRef.getResRefName() +"</res-ref-name>\n";
		}
		if (!(resourceRef.getResType().equals(""))){
			result+="<res-type>"+ resourceRef.getResType() +"</res-type>\n";
		}
		if (!(resourceRef.getResAuth().equals(""))){
			result+="<res-auth>"+ resourceRef.getResAuth() +"</res-auth>\n";
		}
		result+="</resource-ref>\n";
		return result;
	}

	@Override
	public String visit(Servlet servlet) {
		String result="";
		result+="<servlet>\n";
		if (!(servlet.getName().equals(""))){
			result+="<servlet-name>"+ servlet.getName() +"</servlet-name>\n";
		}
		if (!(servlet.getClass_().equals(""))){
			result+="<servlet-class>"+ servlet.getClass_() +"</servlet-class>\n";
		}
		if (servlet.getInitParam()!=null){
			result+=this.visit(servlet.getInitParam());
		}
		result+="<load-on-startup>"+ servlet.getLoadOnStartup() + "</load-on-startup>\n" +
				"</servlet>\n";
		return result;
	}

	@Override
	public String visit(ServletMapping servletMapping) {
		String result="";
		result+="<servlet-mapping>\n";
		if (servletMapping.getServlet()!=null){
			result+="<servlet-name>"+ servletMapping.getServlet().getName() +"</servlet-name>\n";
		}
		if (!(servletMapping.getUrlPattern().equals(""))){
			result+="<url-pattern>"+ servletMapping.getUrlPattern() +"</url-pattern>\n";
		}
		result+="</servlet-mapping>\n";
		return result;
	}

	@Override
	public String visit(InitParam initParam) {
		String result="";
		result+="<init-param>\n";
		if (!(initParam.getName().equals(""))){
			result+="<param-name>"+ initParam.getName() +"</param-name>\n";
		}
		if (!(initParam.getValue().equals(""))){
			result+="<param-value>"+ initParam.getValue() +"</param-value>\n";
		}
		result+="</init-param>\n";
		return result;
	}

}
