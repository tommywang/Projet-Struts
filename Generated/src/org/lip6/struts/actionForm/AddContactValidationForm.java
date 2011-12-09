package org.lip6.struts.actionForm;
import javax.servlet.http.HttpServletRequest;
import org.apache.struts.action.ActionErrors;
import org.apache.struts.action.ActionForm;
import org.apache.struts.action.ActionMapping;
import org.apache.struts.action.ActionMessage;

public class AddContactValidationForm extends ActionForm {

private static final long serialVersionUID = 1L;
private String firstName=null;

public String getFirstName() {
return firstName;
}

public void setFirstName(String firstName) {
this.firstName = firstName;
}

private String lastName=null;

public String getLastName() {
return lastName;
}

public void setLastName(String lastName) {
this.lastName = lastName;
}

private String email=null;

public String getEmail() {
return email;
}

public void setEmail(String email) {
this.email = email;
}

public void reset(ActionMapping mapping, HttpServletRequest request) {
this.firstName=null;
this.lastName=null;
this.email=null;
}

@Override
public ActionErrors validate(ActionMapping mapping, HttpServletRequest request ) {
ActionErrors errors = new ActionErrors();

if( getFirstName()== null || getFirstName().length() < 1 ) {
errors.add("firstName",new ActionMessage("creation.fn.error.required"));
}
if( getLastName()== null || getLastName().length() < 1 ) {
errors.add("lastName",new ActionMessage("creation.ln.error.required"));
}
if( getEmail()== null || getEmail().length() < 1 ) {
errors.add("email",new ActionMessage("creation.email.error.required"));
}
return errors;
}
}
