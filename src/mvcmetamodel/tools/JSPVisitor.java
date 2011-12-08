package mvcmetamodel.tools;

import org.eclipse.emf.common.util.EList;

import mvcmetamodel.*;

public class JSPVisitor implements Visitor {

	@Override
	public String visit(Page page) {
		String tagHtml="<%@ taglib prefix=\"html\" uri=\"http://struts.apache.org/tags-html\"%>\n";
		String tagBean="<%@ taglib prefix=\"bean\" uri=\"http://struts.apache.org/tags-bean\"%>\n";
		String tagLogic="<%@ taglib prefix=\"logic\" uri=\"http://struts.apache.org/tags-logic\"%>\n";
		String tagNested="<%@ taglib prefix=\"nested\" uri=\"http://struts.apache.org/tags-nested\"%>\n";
		
		String header="<%@ page language=\"java\" contentType=\"text/html; charset=ISO-8859-1\" pageEncoding=\"ISO-8859-1\"%>";
		String result="";
		
		header+=tagHtml+tagBean;
		
		result+="<html:html>\n";
		result+=this.visit(page.getHead());
		result+=this.visit(page.getBody());
		result+="</html:html>";
		//header+="<!DOCTYPE html PUBLIC \"-//W3C//DTD HTML 4.01 Transitional//EN\" \"http://www.w3.org/TR/html4/loose.dtd>\"\n";
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
		result+="<body>\n";
		if (!body.getContents().isEmpty()){
			for (Content c:body.getContents()){
				result+=this.visit(c);
			}
		}
		result+="</body>\n";
		return result;
	}

	@Override
	public String visit(Cell cell) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public String visit(Component component) {
		String result="";
		if (component instanceof Link){
			result+=this.visit((Link) component);
		}
		else if (component instanceof Text){
			result+=this.visit((Text) component);
		}
		return result;
	}

	@Override
	public String visit(Form form) {
		String result="";

		result+="<html:form "+ "action=\"/" +form.getAction()+ "\">\n";
		//for ()



		result+="</html:form>\n";
		return result;
	}

	@Override
	public String visit(Head head) {
		String result="";
		result+="<head>\n";
		if (!(head.getTitle().equals(""))){
			result+="<title>" + head.getTitle() + "</title>\n";
		}/*
		if (!head.getComponents().isEmpty()){
			for (Component c:head.getComponents()){
				result+=this.visit(c);
			}
		}*/
		result+="</head>\n";
		return result;
	}

	@Override
	public String visit(Input input) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public String visit(Link link) {
		String result="<A HREF="+link.getUrl()+"> ";
		if (!link.getComponents().isEmpty()){
			for (Component c:link.getComponents()){
				result+=this.visit(c);
			}
		}
		result+=" </A>\n";
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
		String result="";
		result="<table>\n";
		for (Line l:table.getLines()){
			result+=this.visit(l);
		}
		result="</table>\n";
		return result;
	}

	@Override
	public String visit(TextField textField) {
		/*
		String result="";
		result="<html:text property=\"";
		<html:text property="firstName" size="30"
			maxlength="30" />*/
		return null;
	}

	@Override
	public String visit(Text text) {
		String result="";
		result=text.getValue()+"\n";
		return result;
	}

	@Override
	public String visit(Title title) {
		System.out.println("pass here");
		String result="";
		result+="<h"+title.getSize()+">";
		for (Component c:title.getComponents()){
			result+=this.visit(c);
		}
		result+="</h"+title.getSize()+">\n";
		/*
		switch (title.getSize()){
			case HUGE:
				result+="<h1> ";
				
				result+="<h1/> ";
			case HUGE:
				result+="<h1> ";
				
				result+="<h1/> ";
			case HUGE:
				result+="<h1> ";
				
				result+="<h1/> ";
			case HUGE:
				result+="<h1> ";
				
				result+="<h1/> ";
		}*/
		return result;
	}

	@Override
	public String visit(WebApp webApp) {
		// TODO Auto-generated method stub
		return null;
	}



	@Override
	public String visit(CheckBox checkbox) {
		// TODO Auto-generated method stub
		return null;
	}



	@Override
	public String visit(Line line) {
		String result="";
		result+="<tr>\n";
		
		result+="</tr>\n";
		return null;
	}



	@Override
	public String visit(Content content) {
		String result="";
		if (content instanceof Form){
			System.out.println("form");
			result+=this.visit((Form) content);
		}
		else if (content instanceof Component){
			System.out.println("comp");
			result+=this.visit((Component) content);
		}
		else if (content instanceof Table){
			System.out.println("table");
			result+=this.visit((Table) content);
		}
		return result;
	}

}
