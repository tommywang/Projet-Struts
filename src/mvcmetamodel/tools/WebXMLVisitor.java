package mvcmetamodel.tools;

import java.util.Iterator;

import org.eclipse.emf.common.util.EList;

import mvcmetamodel.Body;
import mvcmetamodel.Cell;
import mvcmetamodel.CheckBox;
import mvcmetamodel.CheckBoxe;
import mvcmetamodel.Component;
import mvcmetamodel.Form;
import mvcmetamodel.Head;
import mvcmetamodel.Input;
import mvcmetamodel.Line;
import mvcmetamodel.Link;
import mvcmetamodel.Page;
import mvcmetamodel.Paragraphe;
import mvcmetamodel.Password;
import mvcmetamodel.RadioButton;
import mvcmetamodel.SubmitButton;
import mvcmetamodel.Table;
import mvcmetamodel.Text;
import mvcmetamodel.TextField;
import mvcmetamodel.Title;
import mvcmetamodel.WebApp;

public class WebXMLVisitor implements Visitor {

	@Override
	public String visit(Body body) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public String visit(Cell cell) {
		// TODO Auto-generated method stub
		return null;
	}


	@Override
	public String visit(Component component) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public String visit(Form form) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public String visit(Head head) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public String visit(Input input) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public String visit(Link link) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public String visit(Page page) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public String visit(Paragraphe paragraphe) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public String visit(Password password) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public String visit(RadioButton radioButton) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public String visit(SubmitButton submitButton) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public String visit(Table table) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public String visit(TextField textField) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public String visit(Text text) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public String visit(Title title) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public String visit(WebApp webApp) {
		String s="";
		s+="<?xml version=\"1.0\" encoding=\"UTF-8\"?>\n" +
		"<web-app xmlns:xsi=\"http://www.w3.org/2001/XMLSchema-instance\"" +
		"xmlns=\"http://java.sun.com/xml/ns/javaee\" xmlns:web=\"http://java.sun.com/xml/ns/javaee/web-app_2_5.xsd\" " +
		"xsi:schemaLocation=\"http://java.sun.com/xml/ns/javaee http://java.sun.com/xml/ns/javaee/web-app_2_5.xsd\" " +
		"id=\"WebApp_ID\" version=\"2.5\">\n" +
		"<display-name>"+webApp.getName()+"</display-name>\n" +
		"<welcome-file-list>\n" +
			"<welcome-file>" + webApp.getStartPage().getName() + "</welcome-file>" +
		"</welcome-file-list>\n" +	
		"<servlet>\n" +
		"<servlet-name>action</servlet-name>\n" +
		"<servlet-class>org.apache.struts.action.ActionServlet</servlet-class>\n" +
		"<init-param>\n" +
			"<param-name>config</param-name>\n" +
			"<param-value>struts-config.xml</param-value>\n" +
		"</init-param>\n" +
		"<load-on-startup>1</load-on-startup>\n" +
		"</servlet>\n" +
		"<servlet-mapping>" +
			"<servlet-name>action</servlet-name>\n" +
			"<url-pattern>*.do</url-pattern>\n" +
		"</servlet-mapping>\n";
		return s;
	}

	@Override
	public String visit(CheckBox checkbox) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public String visit(Line line) {
		// TODO Auto-generated method stub
		return null;
	}
	
	
	
//
//	@Override
//	public String visit(WebXML webxml) {
//		String result="";
//		result+="<?xml version=\"1.0\" encoding=\"UTF-8\"?>\n" +
//				"<web-app xmlns:xsi=\"http://www.w3.org/2001/XMLSchema-instance\" xmlns=\"http://java.sun.com/xml/ns/javaee\" " +
//				"xmlns:web=\"http://java.sun.com/xml/ns/javaee/web-app_2_5.xsd\" xsi:schemaLocation= " +
//				"\"http://java.sun.com/xml/ns/javaee http://java.sun.com/xml/ns/javaee/web-app_2_5.xsd\" id=\"WebApp_ID\" version=\"2.5\">\n" +
//				"<display-name>" + webxml.getName() + "</display-name>\n";
//		if (webxml.getWelcomeFileList()!=null){
//			result+=this.visit(webxml.getWelcomeFileList());
//		}
//		if (webxml.getServlet()!=null){
//			result+=this.visit(webxml.getServlet());
//		}
//		if (webxml.getServletMapping()!=null){
//			result+=this.visit(webxml.getServletMapping());
//		}
//		if (webxml.getResourceRef()!=null){
//			result+=this.visit(webxml.getResourceRef());
//		}
//		result+="</web-app>";
//		return result;
//	}
//
//	@Override
//	public String visit(Resources resources) {
//		// TODO Auto-generated method stub
//		return null;
//	}
//
//	@Override
//	public String visit(Page page) {
//		// TODO Auto-generated method stub
//		return null;
//	}
//
//	@Override
//	public String visit(WelcomeFileList welcomeFileList) {
//		String result="";
//		result+="<welcome-file-list>\n";
//		if (welcomeFileList.getWelcomeFile()!=null){
//			@SuppressWarnings("unchecked")
//			EList<WelcomeFile> listWelcomeFiles = welcomeFileList.getWelcomeFile();
//			for (WelcomeFile welcomeFile : listWelcomeFiles) {
//				result+=this.visit(welcomeFile);
//			}
//		}
//		result+="</welcome-file-list>\n";
//		return result;
//	}
//
//	@Override
//	public String visit(WelcomeFile welcomeFile) {
//		String result="";
//		result+="<welcome-file>" + welcomeFile.getPageName().getName()+"."+
//				welcomeFile.getPageName().getType()+"</welcome-file>\n";
//		return result;
//	}
//
//	@Override
//	public String visit(ResourceRef resourceRef) {
//		String result="";
//		result+="<resource-ref>\n";
//		if (!(resourceRef.getDescription().equals(""))){
//			result+="<description>"+ resourceRef.getDescription() +"</description>\n";
//		}
//		if (!(resourceRef.getResRefName().equals(""))){
//			result+="<res-ref-name>"+ resourceRef.getResRefName() +"</res-ref-name>\n";
//		}
//		if (!(resourceRef.getResType().equals(""))){
//			result+="<res-type>"+ resourceRef.getResType() +"</res-type>\n";
//		}
//		if (!(resourceRef.getResAuth().equals(""))){
//			result+="<res-auth>"+ resourceRef.getResAuth() +"</res-auth>\n";
//		}
//		result+="</resource-ref>\n";
//		return result;
//	}
//
//	@Override
//	public String visit(Servlet servlet) {
//		String result="";
//		result+="<servlet>\n";
//		if (!(servlet.getName().equals(""))){
//			result+="<servlet-name>"+ servlet.getName() +"</servlet-name>\n";
//		}
//		if (!(servlet.getClass_().equals(""))){
//			result+="<servlet-class>"+ servlet.getClass_() +"</servlet-class>\n";
//		}
//		if (servlet.getInitParam()!=null){
//			result+=this.visit(servlet.getInitParam());
//		}
//		result+="<load-on-startup>"+ servlet.getLoadOnStartup() + "</load-on-startup>\n" +
//				"</servlet>\n";
//		return result;
//	}
//
//	@Override
//	public String visit(ServletMapping servletMapping) {
//		String result="";
//		result+="<servlet-mapping>\n";
//		if (servletMapping.getServlet()!=null){
//			result+="<servlet-name>"+ servletMapping.getServlet().getName() +"</servlet-name>\n";
//		}
//		if (!(servletMapping.getUrlPattern().equals(""))){
//			result+="<url-pattern>"+ servletMapping.getUrlPattern() +"</url-pattern>\n";
//		}
//		result+="</servlet-mapping>\n";
//		return result;
//	}
//
//	@Override
//	public String visit(InitParam initParam) {
//		String result="";
//		result+="<init-param>\n";
//		if (!(initParam.getName().equals(""))){
//			result+="<param-name>"+ initParam.getName() +"</param-name>\n";
//		}
//		if (!(initParam.getValue().equals(""))){
//			result+="<param-value>"+ initParam.getValue() +"</param-value>\n";
//		}
//		result+="</init-param>\n";
//		return result;
//	}

}
