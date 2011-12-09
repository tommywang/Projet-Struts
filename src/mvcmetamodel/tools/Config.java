package mvcmetamodel.tools;

import mvcmetamodel.*;

public class Config implements Visitor{
	private String head;
	private String formBean;//="<form-beans>\n";
	private String actionMapping;//="<action-mappings>\n";
	private String pageName;
	
	public Config(){
		this.head="<?xml version=\"1.0\" encoding=\"ISO-8859-1\" ?>\n"+
		"<!DOCTYPE struts-config PUBLIC "+
		"\"-//Apache Software Foundation//DTD Struts Configuration 1.1//EN\""+
		" \"http://jakarta.apache.org/struts/dtds/struts-config_1_3.dtd\">\n";
		this.formBean="";
		this.actionMapping="";
		this.pageName="";
	}
	
	public String getHead(){
		return head;
	}
	
	public String getFormBean(){
		return formBean;
	}
	
	public String getActionMapping(){
		return actionMapping;
	}
	
	
	@Override
	public String visit(Body body) {
		for (Content c:body.getContents()){
			this.visit(c);
		}
		return null;
	}

	@Override
	public String visit(Cell cell) {
		for (Component c: cell.getComponents()){
			this.visit(c);
		}
		return null;
	}

	@Override
	public String visit(CheckBox checkbox) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public String visit(Component component) {
		
		if (component instanceof Final){
			this.visit((Final) component);
		}
		else if (component instanceof Container){
			this.visit((Container) component);
		}
		return null;
	}

	@Override
	public String visit(Container container) {
		if (container instanceof Link){
			
			this.visit((Link) container);
		}
		else if (container instanceof TextField){
			this.visit((TextField) container);
		}
		else if (container instanceof Table){
			
			this.visit((Table) container);
		}
		else if (container instanceof Title){
			this.visit((Title) container);
		}
		else if (container instanceof Paragraph){
			this.visit((Paragraph) container);
		}
		return null;
	}

	@Override
	public String visit(Content content) {
		
		if (content instanceof Form){
			this.visit((Form) content);
		}
		else if (content instanceof Component){
			
			this.visit((Component) content);
		}
		else if (content instanceof Table){
			this.visit((Table) content);
		}
		return null;
	}

	@Override
	public String visit(Final mFinal) {
		if (mFinal instanceof TextLabel){
			this.visit((TextLabel) mFinal);
		}
		else if (mFinal instanceof Input){
			this.visit((Input) mFinal);
		}
		return null;
	}

	@Override
	public String visit(Form form) {
		
		String actionName=form.getAction();
		formBean+="<form-bean name=\""+actionName+"ValidationForm\" type=\"actionForm."+actionName+"ValidationForm\"/>\n";
		actionMapping+="<action path=\"/"+actionName;
		actionMapping+="\" type=\"servletAction."+actionName+"Action\"";
		actionMapping+=" name=\""+actionName+"ValidationForm\" scope=\"request\"";
		actionMapping+=" input=\""+pageName+"\">\n";
		for (Component c:form.getComponents()){
			this.visit(c);
		}
		return null;
	}

	@Override
	public String visit(Head head) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public String visit(Input input) {
		if (input instanceof RadioButton){
			this.visit((RadioButton) input);
		}
		else if (input instanceof TextField){
			this.visit((TextField) input);
		}
		else if (input instanceof Password){
			this.visit((Password) input);
		}
		else if (input instanceof CheckBox){
			this.visit((CheckBox) input);
		}
		else if (input instanceof SubmitButton){
			this.visit((SubmitButton) input);
		}
		return null;
	}

	@Override
	public String visit(Line line) {
		
		for (Cell c:line.getCells()){
			this.visit(c);
		}
		return null;
	}

	@Override
	public String visit(Link link) {
		actionMapping+="<action path=\"/"+upperFirstCase(link.getPageName())+"\" forward=\""+link.getPageName()+"."+link.getPageType()+"\" />\n";
		for (Component c:link.getComponents()){
			this.visit(c);
		}
		return null;
	}

	@Override
	public String visit(Page page) {
		pageName=page.getName()+"."+page.getType();
		this.visit(page.getHead());
		this.visit(page.getBody());
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
		actionMapping+="<forward name=\""+submitButton.getSuccessTarget()+
			"\" path=\""+submitButton.getSuccessTarget()+"."+submitButton.getSuccessType()+"\" />\n";
		actionMapping+="<forward name=\""+submitButton.getErrorTarget()+
			"\" path=\""+submitButton.getErrorTarget()+"."+submitButton.getErrorType()+"\" />\n";
		actionMapping+="</action>\n";
		return null;
	}

	@Override
	public String visit(Table table) {
		for (Line l:table.getLines()){
			this.visit(l);
		}
		return null;
	}

	@Override
	public String visit(TextField textField) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public String visit(TextLabel textLabel) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public String visit(Title title) {
		for (Component c:title.getComponents()){
			this.visit(c);
		}
		return null;
	}

	@Override
	public String visit(WebApp webApp) {
		// TODO Auto-generated method stub
		return null;
	}
	
	public static String upperFirstCase(String s){
		char c=Character.toUpperCase(s.charAt(0));
		return Character.toString(c)+s.substring(1);
	}
	@Override
	public String visit(HeadTitle headTitle) {
		// TODO Auto-generated method stub
		return null;
	}
	
}
