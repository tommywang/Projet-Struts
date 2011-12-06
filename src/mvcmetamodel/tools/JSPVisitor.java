package mvcmetamodel.tools;

import org.eclipse.emf.common.util.EList;

import mvcmetamodel.Component;
import mvcmetamodel.InitParam;
import mvcmetamodel.Page;
import mvcmetamodel.ResourceRef;
import mvcmetamodel.Resources;
import mvcmetamodel.Servlet;
import mvcmetamodel.ServletMapping;
import mvcmetamodel.WebXML;
import mvcmetamodel.WelcomeFile;
import mvcmetamodel.WelcomeFileList;

public class JSPVisitor implements Visitor {

	@Override
	public String visit(WebXML webxml) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public String visit(Resources resources) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public String visit(Page page) {
		String result="";
		result+="<%@ page language=\"java\" contentType=\"text/html; charset=ISO-8859-1\" pageEncoding=\"ISO-8859-1\"%>\n" +
				"<%@ taglib prefix=\"html\" uri=\"http://struts.apache.org/tags-html\" %>\n" +
				"<%@ taglib prefix=\"bean\" uri=\"http://struts.apache.org/tags-bean\" %>\n" +
				"<%@ taglib prefix=\"logic\" uri=\"http://struts.apache.org/tags-logic\" %>\n" +
				"<%@ taglib prefix=\"nested\" uri=\"http://struts.apache.org/tags-nested\" %>\n" +
				"<html:html>\n" +
				"<head>\n";
				if (!(page.getTitle().equals(""))){
					result+="<title><bean:message key=" + page.getTitle() + "/></title>\n";
				}
				result+="</head>\n";
				if (page.getComponents()!=null){
					@SuppressWarnings("unchecked")
					EList<Component> listComponents = page.getComponents();
					for (Component component : listComponents) {
						result+=page.accept(component);
					}
				}
		return result;
	}

	@Override
	public String visit(WelcomeFileList welcomeFileList) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public String visit(WelcomeFile welcomeFile) {
		// TODO Auto-generated method stub
		return null;
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

	@Override
	public String visit(InitParam initParam) {
		// TODO Auto-generated method stub
		return null;
	}

}
