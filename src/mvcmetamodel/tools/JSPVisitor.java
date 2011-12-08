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
		String result="";
		if (cell.getAlign()==Align.CENTER)
			result+="<td align=\"center\" ";
		else if (cell.getAlign()==Align.LEFT)
			result+="<td align=\"left\" ";
		else
			result+="<td align=\"right\" ";
		
		if (cell.getColspan()!=0){
			result+="colspan=" + cell.getColspan() + ">\n";
		}
		else{
			result+=">\n";
		}
		
		for (Component c: cell.getComponents()){
			result+=this.visit(c);
		}
		result+="</td>\n";
		return result;
	}

	@Override
	public String visit(Component component) {
		String result="";
		if (component instanceof Final){
			System.out.println("hell");
			result+=this.visit((Final) component);
		}
		else if (component instanceof Container){
			System.out.println("hell");
			result+=this.visit((Container) component);
		}
		return result;
	}

	@Override
	public String visit(Form form) {
		String result="";
		result+="<html:form "+ "action=\"/" +form.getAction()+ "\">\n";
		for (Component c:form.getComponents()){
			result+=this.visit(c);
		}
		result+="</html:form>\n";
		return result;
	}

	@Override
	public String visit(Head head) {
		String result="";
		result+="<head>\n";
		if (!(head.getTitle().equals(""))){
			result+="<title>" + head.getTitle() + "</title>\n";
		}
		result+="</head>\n";
		return result;
	}

	@Override
	public String visit(Input input) {
		String result="";
		if (input instanceof RadioButton){
			result+=this.visit((RadioButton) input);
		}
		else if (input instanceof TextField){
			result+=this.visit((TextField) input);
		}
		else if (input instanceof Password){
			result+=this.visit((Password) input);
		}
		else if (input instanceof CheckBox){
			result+=this.visit((CheckBox) input);
		}
		else if (input instanceof SubmitButton){
			result+=this.visit((SubmitButton) input);
		}
		return result;
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
	public String visit(Password password) {
		String result="";
		result+="<html:password property=\""+password.getName()+"\" size=\""+password.getSize()
		+"\" maxlength=\""+password.getMaxLength()+"\"/>\n";
		return result;
	}

	@Override
	public String visit(RadioButton radioButton) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public String visit(SubmitButton submitButton) {
		String result="";
		result+="<html:submit>"+submitButton.getValue()+"</html:submit>\n";
		return result;
	}

	@Override
	public String visit(Table table) {
		String result="";
		result+="<table>\n";
		for (Line l:table.getLines()){
			result+=this.visit(l);
		}
		result+="</table>\n";
		return result;
	}

	@Override
	public String visit(TextField textField) {
		String result="";
		result+="<html:text property=\""+textField.getName()+"\" size=\""+textField.getSize()
		+"\" maxlength=\""+textField.getMaxLength()+"\"/>\n";
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
			for (Cell c:line.getCells()){
				result+=this.visit(c);
			}
		result+="</tr>\n";
		return result;
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

	@Override
	public String visit(Container container) {
		String result="conta";
		if (container instanceof Link){
			result+=this.visit((Link) container);
		}
		else if (container instanceof TextField){
			result+=this.visit((TextField) container);
		}
		else if (container instanceof Table){
			result+=this.visit((Table) container);
		}
		else if (container instanceof Title){
			result+=this.visit((Title) container);
		}
		else if (container instanceof Paragraph){
			result+=this.visit((Paragraph) container);
		}
		return result;
	}

	@Override
	public String visit(Final mFinal) {
		String result="final";
		if (mFinal instanceof TextLabel){
			result+=this.visit((TextLabel) mFinal);
		}
		else if (mFinal instanceof Input){
			result+=this.visit((Input) mFinal);
		}
		
		return result;
	}

	@Override
	public String visit(Paragraph paragraph) {
		String result="";
		result+="<p>\n";
		for (Component c:paragraph.getComponents()){
			result+=this.visit(c);
		}
		result+="</p>\n";
		return null;
	}

	@Override
	public String visit(TextLabel textLabel) {
		String result="testLabel";
		result=textLabel.getValue()+"\n";
		return result;
	}

}
