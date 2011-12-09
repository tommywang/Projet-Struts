package mvcmetamodel.tools;

import mvcmetamodel.*;

public class ActionVisitor implements Visitor {

	@Override
	public String visit(Body body) {
		String s="";
		for (Content content : body.getContents()){
			s+=this.visit(content);
		}
		return s;
	}

	@Override
	public String visit(Cell cell) {
		String s="";
		for (Component component : cell.getComponents()){
			s+=this.visit(component);
		}
		return s;
	}

	@Override
	public String visit(CheckBox checkbox) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public String visit(Content content) {
		String s="";
		if (content instanceof Component){
			s+=this.visit((Component)content);
		}
		if (content instanceof Form){
			s+=this.visit((Form)content);
		}
		return s;
	}

	@Override
	public String visit(Component component) {
		String s="";
		if (component instanceof Container){
			s+=this.visit((Container)component);
		}
		if (component instanceof Final){
			s+=this.visit((Final)component);
		}
		return s;
	}

	@Override
	public String visit(Form form) {
		String s="";
		s+="import javax.servlet.http.HttpServletRequest;\n" +
		"import javax.servlet.http.HttpServletResponse;\n" +
		"import org.apache.struts.Globals;\n" +
		"import org.apache.struts.action.Action;\n" +
		"import org.apache.struts.action.ActionForm;\n" +
		"import org.apache.struts.action.ActionForward;\n" +
		"import org.apache.struts.action.ActionMapping;\n" +
		"import org.apache.struts.action.ActionMessage;\n" +
		"import org.apache.struts.action.ActionMessages;\n" +
		"import org.lip6.struts.actionForm."+form.getAction()+"ValidationForm;\n"+
		"\n" +
		"public class "+ form.getAction() +"Action extends Action {\n" +
		"\n" +
		"@Override\n" +
		"public ActionForward execute(final ActionMapping pMapping,\n" +
		"ActionForm pForm, final HttpServletRequest pRequest,\n" +
		"final HttpServletResponse pResponse) {\n" +
		"\n" +
		"final "+form.getAction()+"ValidationForm lForm=("+form.getAction()+"ValidationForm)pForm;\n" +
		"\n" +
		"String lError = \"ok\";\n\n";
		for (Component component : form.getComponents()){
			s+=this.visit(component);
		}
		s+="}\n" +
		"}\n";
		return s;
	}

	@Override
	public String visit(Head head) {
		return null;
	}

	@Override
	public String visit(Input input) {
		String s="";
		if (input instanceof SubmitButton){
			s+=this.visit((SubmitButton)input);
		}
		if (input instanceof RadioButton){
			s+=this.visit((RadioButton)input);
		}
		if (input instanceof CheckBox){
			s+=this.visit((CheckBox)input);
		}
		if  (input instanceof TextField){
			s+=this.visit((TextField)input);
		}
		if (input instanceof Password){
			s+=this.visit((Password)input);
		}
		return s;
	}

	@Override
	public String visit(Line line) {
		String s="";
		for (Cell cell : line.getCells()){
			s+=this.visit(cell);
		}
		return s;
	}

	@Override
	public String visit(Link link) {
		String s="";
		for (Component component : link.getComponents()){
			s+=this.visit(component);
		}
		return s;
	}

	@Override
	public String visit(Page page) {
		String s="";
		if (page.getBody()!=null){
			s+=this.visit(page.getBody());
		}
		return s;
	}

	@Override
	public String visit(Paragraph paragraph) {
		String s="";
		for (Component component : paragraph.getComponents()){
			s+=this.visit(component);
		}
		return s;
	}

	@Override
	public String visit(Password password) {
		String s="";
		s+="final String "+ password.getName() +"= lForm.get"+ UsefulFunctions.setFirstCharToUpper(password.getName())+"();\n" +
		"if (" + password.getName() +".equals(\"\")){\n" +
		"lError=null;\n" +
		"}\n";
		return s;
	}

	@Override
	public String visit(RadioButton radioButton) {
		// no need
		return null;
	}

	@Override
	public String visit(SubmitButton submitButton) {
		String s="";
		s+="if (lError != null) {\n" +
		"return pMapping.findForward(\"" + submitButton.getSuccessTarget() + "\");\n" +
		"}\n" +
		"else {\n" +
		"return pMapping.findForward(\"" + submitButton.getErrorTarget() + "\");\n" +
		"}\n";
		return s;
	}

	@Override
	public String visit(Table table) {
		String s="";
		for (Line line : table.getLines()){
			s+=this.visit(line);
		}
		return s;
	}

	@Override
	public String visit(TextField textField) {
		String s="";
		s+="final String "+ textField.getName() +"= lForm.get"+ UsefulFunctions.setFirstCharToUpper(textField.getName())+"();\n" +
		"if (" + textField.getName() +".equals(\"\")){\n" +
		"lError=null;\n" +
		"}\n";
		return s;
	}

	@Override
	public String visit(Title title) {
		String s="";
		for (Component component : title.getComponents()){
			s+=this.visit(component);
		}
		return s;
	}

	@Override
	public String visit(WebApp webApp) {
		String s="";
		for (Page page : webApp.getPages()){
			s+=this.visit(page);
		}
		return s;
	}

	@Override
	public String visit(Container container) {
		String s="";
		if (container instanceof Table){
			s+=this.visit((Table)container);
		}
		if (container instanceof Link){
			s+=this.visit((Link)container);
		}
		if (container instanceof Paragraph){
			s+=this.visit((Paragraph)container);
		}
		if (container instanceof Title){
			s+=this.visit((Title)container);
		}
		return s;
	}

	@Override
	public String visit(Final mFinal) {
		String s="";
		if (mFinal instanceof Input){
			s+= this.visit((Input)mFinal);
		}
		return s;
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
