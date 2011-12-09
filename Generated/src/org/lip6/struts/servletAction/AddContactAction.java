package org.lip6.struts.servletAction;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import org.apache.struts.Globals;
import org.apache.struts.action.Action;
import org.apache.struts.action.ActionForm;
import org.apache.struts.action.ActionForward;
import org.apache.struts.action.ActionMapping;
import org.apache.struts.action.ActionMessage;
import org.apache.struts.action.ActionMessages;
import org.lip6.struts.actionForm.AddContactValidationForm;

public class AddContactAction extends Action {

@Override
public ActionForward execute(final ActionMapping pMapping,
ActionForm pForm, final HttpServletRequest pRequest,
final HttpServletResponse pResponse) {

final AddContactValidationForm lForm=(AddContactValidationForm)pForm;

String lError = "ok";

final String toto= lForm.getToto();
final String lastName= lForm.getLastName();
final String email= lForm.getEmail();
final String password= lForm.getPassword();
if (lError != null) {
return pMapping.findForward("success");
}
else {
return pMapping.findForward("error");
}
}
}

