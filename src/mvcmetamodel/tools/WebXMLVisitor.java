package mvcmetamodel.tools;

import mvcmetamodel.*;

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
	public String visit(Paragraph paragraph) {
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
	public String visit(Title title) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public String visit(WebApp webApp) {
		String s="";
		s+="<?xml version=\"1.0\" encoding=\"UTF-8\"?>\n" +
		"<web-app xmlns:xsi=\"http://www.w3.org/2001/XMLSchema-instance\" " +
		"xmlns=\"http://java.sun.com/xml/ns/javaee\" xmlns:web=\"http://java.sun.com/xml/ns/javaee/web-app_2_5.xsd\" " +
		"xsi:schemaLocation=\"http://java.sun.com/xml/ns/javaee http://java.sun.com/xml/ns/javaee/web-app_2_5.xsd\" " +
		"id=\"WebApp_ID\" version=\"2.5\">\n" +
		"<display-name>"+webApp.getName()+"</display-name>\n" +
		"<welcome-file-list>\n" +
			"<welcome-file>" + webApp.getStartPage().getName() +"." + webApp.getStartPage().getType()+ "</welcome-file>\n" +
		"</welcome-file-list>\n" +	
		"<servlet>\n" +
		"<servlet-name>action</servlet-name>\n" +
		"<servlet-class>action.ActionServlet</servlet-class>\n" +
		"<init-param>\n" +
			"<param-name>config</param-name>\n" +
			"<param-value>struts-config.xml</param-value>\n" +
		"</init-param>\n" +
		"<load-on-startup>1</load-on-startup>\n" +
		"</servlet>\n" +
		"<servlet-mapping>" +
			"<servlet-name>action</servlet-name>\n" +
			"<url-pattern>*.do</url-pattern>\n" +
		"</servlet-mapping>\n"+
		"</web-app>";
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

	@Override
	public String visit(Content content) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public String visit(Container container) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public String visit(Final mFinal) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public String visit(TextLabel textLabel) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public String visit(HeadTitle headTitle) {
		// TODO Auto-generated method stub
		return null;
	}


}
