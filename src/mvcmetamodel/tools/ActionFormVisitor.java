package mvcmetamodel.tools;

import javax.jws.WebParam;

import mvcmetamodel.Body;
import mvcmetamodel.Cell;
import mvcmetamodel.CheckBox;
import mvcmetamodel.Component;
import mvcmetamodel.Container;
import mvcmetamodel.Content;
import mvcmetamodel.Final;
import mvcmetamodel.Form;
import mvcmetamodel.Head;
import mvcmetamodel.HeadTitle;
import mvcmetamodel.Input;
import mvcmetamodel.Line;
import mvcmetamodel.Link;
import mvcmetamodel.Page;
import mvcmetamodel.Paragraph;
import mvcmetamodel.Password;
import mvcmetamodel.RadioButton;
import mvcmetamodel.SubmitButton;
import mvcmetamodel.Table;
import mvcmetamodel.TextField;
import mvcmetamodel.TextLabel;
import mvcmetamodel.Title;
import mvcmetamodel.WebApp;

public class ActionFormVisitor implements Visitor {

	String fieldGetSet= "import javax.servlet.http.HttpServletRequest;\n" +
			"import org.apache.struts.action.ActionErrors;\n" +
			"import org.apache.struts.action.ActionForm;\n" +
			"import org.apache.struts.action.ActionMapping;\n" +
			"import org.apache.struts.action.ActionMessage;\n\n" +
			"public class AddContactValidationForm extends ActionForm {\n\n" +
			"private static final long serialVersionUID = 1L;\n";

	String reset="public void reset(ActionMapping mapping, HttpServletRequest request) {\n";

	String validate ="\n@Override\n" +
			"public ActionErrors validate(" +
			"ActionMapping mapping, HttpServletRequest request ) {\n" +
			"ActionErrors errors = new ActionErrors();\n\n";

	public String doAll(Form form){
		this.visit(form);
		return fieldGetSet+reset+"}\n"+validate+"return errors;\n}\n}";
	}

	@Override
	public String visit(Body body) {
		//no need
		return null;
	}

	@Override
	public String visit(Cell cell) {
		for (Component component : cell.getComponents()){
			this.visit(component);
		}
		return null;
	}

	@Override
	public String visit(CheckBox checkbox) {
		//no need
		return null;
	}

	@Override
	public String visit(Component component) {
		if (component instanceof Container){
			this.visit((Container)component);
		}
		if (component instanceof Final){
			this.visit((Final)component);
		}
		return null;
	}

	@Override
	public String visit(Container container) {
		if (container instanceof Link){
			this.visit((Link)container);
		}
		if (container instanceof Paragraph){
			this.visit((Paragraph)container);
		}
		if (container instanceof Title){
			this.visit((Title)container);
		}
		if (container instanceof Table){
			this.visit((Table)container);
		}
		return null;
	}

	@Override
	public String visit(Content content) {
		if (content instanceof Form){
			this.visit((Form)content);
		}
		return null;
	}

	@Override
	public String visit(Final mFinal) {
		if (mFinal instanceof TextField){
			this.visit((TextField)mFinal);
		}
		if (mFinal instanceof Password){
			this.visit((Password)mFinal);
		}
		return null;
	}

	@Override
	public String visit(Form form) {
		for (Component component : form.getComponents()){
			this.visit(component);
		}
		return null;
	}

	@Override
	public String visit(Head head) {
		//no need
		return null;
	}

	@Override
	public String visit(Input input) {
		if (input instanceof RadioButton){
			this.visit((RadioButton)input);
		}
		if (input instanceof CheckBox){
			this.visit((CheckBox)input);
		}
		if (input instanceof SubmitButton){
			this.visit((SubmitButton)input);
		}
		if (input instanceof TextField){
			this.visit((TextField)input);
		}
		if (input instanceof Password){
			this.visit((Password)input);
		}
		return null;
	}

	@Override
	public String visit(Line line) {
		for (Cell cell : line.getCells()){
			this.visit(cell);
		}
		return null;
	}

	@Override
	public String visit(Link link) {
		for (Component component : link.getComponents()){
			this.visit(component);
		}
		return null;
	}

	@Override
	public String visit(Page page) {
		//no need
		return null;
	}

	@Override
	public String visit(Paragraph paragraph) {
		for (Component component : paragraph.getComponents()){
			this.visit(component);
		}
		return null;
	}

	@Override
	public String visit(Password password) {
		fieldGetSet+="private String "+ password.getName() +"=null;\n\n" +
				"public String get"+ UsefulFunctions.setFirstCharToUpper(password.getName()) +"() {\n" +
				"return "+ password.getName() +";\n" +
				"}\n\n" +
				"public void set"+ UsefulFunctions.setFirstCharToUpper(password.getName()) +"(String "+ password.getName() + ") {\n" +
				"this."+ password.getName() +" = "+ password.getName() +";\n" +
				"}\n\n";

		reset+="this."+ password.getName() +"=null;\n";

		validate+="if( get"+ UsefulFunctions.setFirstCharToUpper(password.getName()) +"()== null || get"+ UsefulFunctions.setFirstCharToUpper(password.getName()) +"().length() < 1 ) {\n" +
				"errors.add(\""+ password.getName() +"\",new ActionMessage(\"Contact's fist name is required\"));\n" +
				"}\n";
		return null;
	}

	@Override
	public String visit(RadioButton radioButton) {
		//no need
		return null;
	}

	@Override
	public String visit(SubmitButton submitButton) {
		//no need
		return null;
	}

	@Override
	public String visit(Table table) {
		for (Line line : table.getLines()){
			this.visit(line);
		}
		return null;
	}

	@Override
	public String visit(TextField textField) {

		fieldGetSet+="private String "+ textField.getName() +"=null;\n\n" +
				"public String get"+ UsefulFunctions.setFirstCharToUpper(textField.getName()) +"() {\n" +
				"return "+ textField.getName() +";\n" +
				"}\n\n" +
				"public void set"+ UsefulFunctions.setFirstCharToUpper(textField.getName()) +"(String "+ textField.getName() + ") {\n" +
				"this."+ textField.getName() +" = "+ textField.getName() +";\n" +
				"}\n\n";

		reset+="this."+ textField.getName() +"=null;\n";

		validate+="if( get"+ UsefulFunctions.setFirstCharToUpper(textField.getName()) +"()== null || get"+ UsefulFunctions.setFirstCharToUpper(textField.getName()) +"().length() < 1 ) {\n" +
				"errors.add(\""+ textField.getName() +"\",new ActionMessage(\""+textField.getErrorText().getKey()+"\"));\n" +
				"}\n";

		return null;
	}

	@Override
	public String visit(TextLabel textLabel) {
		//no need
		return null;
	}

	@Override
	public String visit(Title title) {
		for (Component component : title.getComponents()){
			this.visit(component);
		}
		return null;
	}

	@Override
	public String visit(WebApp webApp) {
		//no need
		return null;
	}

	@Override
	public String visit(HeadTitle headTitle) {
		// TODO Auto-generated method stub
		return null;
	}


}
