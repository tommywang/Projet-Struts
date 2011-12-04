package mvcmetamodel.tools;

import java.util.Iterator;

import org.eclipse.emf.common.util.EList;

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
		result+=this.visit(webxml.getWelcomeFileList());
		result+=this.visit(webxml.getServlet());
		result+=this.visit(webxml.getServletMapping());
		result+=this.visit(webxml.getResourceRef());
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
			@SuppressWarnings("unchecked")
			EList<WelcomeFile> listWelcomeFiles = welcomeFileList.getWelcomeFile();
			for (WelcomeFile welcomeFile : listWelcomeFiles) {
				result+=this.visit(welcomeFile);
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
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public String visit(Servlet servlet) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public String visit(ServletMapping servletMapping) {
		// TODO Auto-generated method stub
		return null;
	}

}
