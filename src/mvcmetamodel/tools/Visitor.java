package mvcmetamodel.tools;

import mvcmetamodel.*;

public interface Visitor {

	public String visit(Body body);
	
	public String visit(Cell cell);
	
	public String visit(CheckBox checkbox);
	
	public String visit(Component component);
	
	public String visit(Container container);
	
	public String visit(Content content);
	
	public String visit(Final mFinal);
	
	public String visit(Form form);
	
	public String visit(Head head);
	
	public String visit(Input input);
	
	public String visit(Line line);
	
	public String visit(Link link);
	
	public String visit(Page page);
	
	public String visit(Paragraph paragraph);
	
	public String visit(Password password);
	
	public String visit(RadioButton radioButton);
	
	public String visit(SubmitButton submitButton);
	
	public String visit(Table table);
	
	public String visit(TextField textField);
	
	public String visit(TextLabel textLabel);
	
	public String visit(Title title);
	
	public String visit(WebApp webApp);
}
