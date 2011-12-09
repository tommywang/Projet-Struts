package org.lip6.struts.actionForm;
import javax.servlet.http.HttpServletRequest;
import org.apache.struts.action.ActionErrors;
import org.apache.struts.action.ActionForm;
import org.apache.struts.action.ActionMapping;
import org.apache.struts.action.ActionMessage;

public class AddContactValidationForm extends ActionForm {

private static final long serialVersionUID = 1L;
private String toto=null;

public String getToto() {
return toto;
}

public void setToto(String toto) {
this.toto = toto;
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

private String password=null;

public String getPassword() {
return password;
}

public void setPassword(String password) {
this.password = password;
}

public void reset(ActionMapping mapping, HttpServletRequest request) {
this.toto=null;
this.lastName=null;
this.email=null;
this.password=null;
}

@Override
public ActionErrors validate(ActionMapping mapping, HttpServletRequest request ) {
ActionErrors errors = new ActionErrors();

if( getToto()== null || getToto().length() < 1 ) {
errors.add("toto",new ActionMessage("creation.fn.error.required"));
}
if( getLastName()== null || getLastName().length() < 1 ) {
errors.add("lastName",new ActionMessage("creation.ln.error.required"));
}
if( getEmail()== null || getEmail().length() < 1 ) {
errors.add("email",new ActionMessage("creation.email.error.required"));
}
if( getPassword()== null || getPassword().length() < 1 ) {
errors.add("password",new ActionMessage("creation.password.error.required"));
}
return errors;
}
}
