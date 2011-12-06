package mvcmetamodel.tools;

import mvcmetamodel.*;

public interface Visitor {

	public String visit(WebXML webxml);
	
	public String visit(Resources resources);
	
	public String visit(Page page);
	
	public String visit(WelcomeFileList welcomeFileList);
	
	public String visit(WelcomeFile welcomeFile);
	
	public String visit(ResourceRef resourceRef);
	
	public String visit(Servlet servlet);
	
	public String visit(ServletMapping servletMapping);
	
	public String visit(InitParam initParam);
}
