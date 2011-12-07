package mvcmetamodel.tools;

import org.eclipse.emf.common.util.EList;

import mvcmetamodel.*;

public class JSPVisitor implements Visitor {

	@Override
	public String visit(Page page) {
		String header="";
		String result="";
		
		result+="<html:html>\n";
		/*
		if (!(page.getHead().getTitle().equals(""))){
			result+="<title>" + page.getHead().getTitle() + "</title>\n";
		}*/
		result+=this.visit(page.getHead());
		result+=this.visit(page.getBody());
		
		result+="</html:html>";
		header+="<!DOCTYPE html PUBLIC \"-//W3C//DTD HTML 4.01 Transitional//EN\" \"http://www.w3.org/TR/html4/loose.dtd\"\n";
		return header+result;
		/*
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
		return result;*/
	}



	@Override
	public String visit(Body body) {
		String result="";
		if (!body.getComponents().isEmpty()){
			for (Component c:body.getComponents()){
				result+=this.visit(c);
			}
		}
		return result;
	}

	@Override
	public String visit(Cell cell) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public String visit(CheckBoxe checkboxe) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public String visit(Component component) {
		String result="";
		if (component instanceof Link){
			result+=this.visit((Link) component);
		}
		return result;
	}

	@Override
	public String visit(Form form) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public String visit(Head head) {
		String result="";
		if (!(head.getTitle().equals(""))){
			result+="<title>" + head.getTitle() + "</title>\n";
		}
		return result;
	}

	@Override
	public String visit(Input input) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public String visit(Link link) {
		String result="<A HREF="+link.getUrl()+"> "+"HELLO"+" </A>\n";
		return result;
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
		// TODO Auto-generated method stub
		return null;
	}

}
