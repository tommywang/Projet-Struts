package mvcmetamodel.tools;

import mvcmetamodel.*;

public interface Visitor {

	public String visit(Body body);
	
	public String visit(Cell cell);
	
	public String visit(CheckBoxe checkboxe);
	
	public String visit(Component component);
	
	public String visit(Form form);
	
	public String visit(Head head);
	
	public String visit(Input input);
	
	public String visit(Link link);
	
	public String visit(Page page);
	
	public String visit(Paragraphe paragraphe);
	
	public String visit(Password password);
	
	public String visit(RadioButton radioButton);
	
	public String visit(SubmitButton submitButton);
	
	public String visit(Table table);
	
	public String visit(TextField textField);
	
	public String visit(Text text);
	
	public String visit(Title title);
	
	public String visit(WebApp webApp);
}
