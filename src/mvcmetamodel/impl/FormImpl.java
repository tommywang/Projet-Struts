/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package mvcmetamodel.impl;

import java.util.Collection;

import mvcmetamodel.Component;
import mvcmetamodel.Form;
import mvcmetamodel.Input;
import mvcmetamodel.MvcmetamodelPackage;
import mvcmetamodel.Servlet;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.EObjectImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Form</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link mvcmetamodel.impl.FormImpl#getName <em>Name</em>}</li>
 *   <li>{@link mvcmetamodel.impl.FormImpl#getMethod <em>Method</em>}</li>
 *   <li>{@link mvcmetamodel.impl.FormImpl#getAction <em>Action</em>}</li>
 *   <li>{@link mvcmetamodel.impl.FormImpl#getComponent <em>Component</em>}</li>
 *   <li>{@link mvcmetamodel.impl.FormImpl#getButtonForm <em>Button Form</em>}</li>
 *   <li>{@link mvcmetamodel.impl.FormImpl#getServlet <em>Servlet</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class FormImpl extends EObjectImpl implements Form {
	/**
	 * The default value of the '{@link #getName() <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getName()
	 * @generated
	 * @ordered
	 */
	protected static final String NAME_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getName() <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getName()
	 * @generated
	 * @ordered
	 */
	protected String name = NAME_EDEFAULT;

	/**
	 * The default value of the '{@link #getMethod() <em>Method</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMethod()
	 * @generated
	 * @ordered
	 */
	protected static final String METHOD_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getMethod() <em>Method</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMethod()
	 * @generated
	 * @ordered
	 */
	protected String method = METHOD_EDEFAULT;

	/**
	 * The default value of the '{@link #getAction() <em>Action</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAction()
	 * @generated
	 * @ordered
	 */
	protected static final String ACTION_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getAction() <em>Action</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAction()
	 * @generated
	 * @ordered
	 */
	protected String action = ACTION_EDEFAULT;

	/**
	 * The cached value of the '{@link #getComponent() <em>Component</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getComponent()
	 * @generated
	 * @ordered
	 */
	protected EList component;

	/**
	 * The cached value of the '{@link #getButtonForm() <em>Button Form</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getButtonForm()
	 * @generated
	 * @ordered
	 */
	protected Input buttonForm;

	/**
	 * The cached value of the '{@link #getServlet() <em>Servlet</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getServlet()
	 * @generated
	 * @ordered
	 */
	protected Servlet servlet;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected FormImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected EClass eStaticClass() {
		return MvcmetamodelPackage.Literals.FORM;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getName() {
		return name;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setName(String newName) {
		String oldName = name;
		name = newName;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, MvcmetamodelPackage.FORM__NAME, oldName, name));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getMethod() {
		return method;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setMethod(String newMethod) {
		String oldMethod = method;
		method = newMethod;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, MvcmetamodelPackage.FORM__METHOD, oldMethod, method));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getAction() {
		return action;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setAction(String newAction) {
		String oldAction = action;
		action = newAction;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, MvcmetamodelPackage.FORM__ACTION, oldAction, action));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList getComponent() {
		if (component == null) {
			component = new EObjectContainmentEList(Component.class, this, MvcmetamodelPackage.FORM__COMPONENT);
		}
		return component;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Input getButtonForm() {
		return buttonForm;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetButtonForm(Input newButtonForm, NotificationChain msgs) {
		Input oldButtonForm = buttonForm;
		buttonForm = newButtonForm;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, MvcmetamodelPackage.FORM__BUTTON_FORM, oldButtonForm, newButtonForm);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setButtonForm(Input newButtonForm) {
		if (newButtonForm != buttonForm) {
			NotificationChain msgs = null;
			if (buttonForm != null)
				msgs = ((InternalEObject)buttonForm).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - MvcmetamodelPackage.FORM__BUTTON_FORM, null, msgs);
			if (newButtonForm != null)
				msgs = ((InternalEObject)newButtonForm).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - MvcmetamodelPackage.FORM__BUTTON_FORM, null, msgs);
			msgs = basicSetButtonForm(newButtonForm, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, MvcmetamodelPackage.FORM__BUTTON_FORM, newButtonForm, newButtonForm));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Servlet getServlet() {
		if (servlet != null && servlet.eIsProxy()) {
			InternalEObject oldServlet = (InternalEObject)servlet;
			servlet = (Servlet)eResolveProxy(oldServlet);
			if (servlet != oldServlet) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, MvcmetamodelPackage.FORM__SERVLET, oldServlet, servlet));
			}
		}
		return servlet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Servlet basicGetServlet() {
		return servlet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setServlet(Servlet newServlet) {
		Servlet oldServlet = servlet;
		servlet = newServlet;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, MvcmetamodelPackage.FORM__SERVLET, oldServlet, servlet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case MvcmetamodelPackage.FORM__COMPONENT:
				return ((InternalEList)getComponent()).basicRemove(otherEnd, msgs);
			case MvcmetamodelPackage.FORM__BUTTON_FORM:
				return basicSetButtonForm(null, msgs);
		}
		return super.eInverseRemove(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case MvcmetamodelPackage.FORM__NAME:
				return getName();
			case MvcmetamodelPackage.FORM__METHOD:
				return getMethod();
			case MvcmetamodelPackage.FORM__ACTION:
				return getAction();
			case MvcmetamodelPackage.FORM__COMPONENT:
				return getComponent();
			case MvcmetamodelPackage.FORM__BUTTON_FORM:
				return getButtonForm();
			case MvcmetamodelPackage.FORM__SERVLET:
				if (resolve) return getServlet();
				return basicGetServlet();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case MvcmetamodelPackage.FORM__NAME:
				setName((String)newValue);
				return;
			case MvcmetamodelPackage.FORM__METHOD:
				setMethod((String)newValue);
				return;
			case MvcmetamodelPackage.FORM__ACTION:
				setAction((String)newValue);
				return;
			case MvcmetamodelPackage.FORM__COMPONENT:
				getComponent().clear();
				getComponent().addAll((Collection)newValue);
				return;
			case MvcmetamodelPackage.FORM__BUTTON_FORM:
				setButtonForm((Input)newValue);
				return;
			case MvcmetamodelPackage.FORM__SERVLET:
				setServlet((Servlet)newValue);
				return;
		}
		super.eSet(featureID, newValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void eUnset(int featureID) {
		switch (featureID) {
			case MvcmetamodelPackage.FORM__NAME:
				setName(NAME_EDEFAULT);
				return;
			case MvcmetamodelPackage.FORM__METHOD:
				setMethod(METHOD_EDEFAULT);
				return;
			case MvcmetamodelPackage.FORM__ACTION:
				setAction(ACTION_EDEFAULT);
				return;
			case MvcmetamodelPackage.FORM__COMPONENT:
				getComponent().clear();
				return;
			case MvcmetamodelPackage.FORM__BUTTON_FORM:
				setButtonForm((Input)null);
				return;
			case MvcmetamodelPackage.FORM__SERVLET:
				setServlet((Servlet)null);
				return;
		}
		super.eUnset(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean eIsSet(int featureID) {
		switch (featureID) {
			case MvcmetamodelPackage.FORM__NAME:
				return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
			case MvcmetamodelPackage.FORM__METHOD:
				return METHOD_EDEFAULT == null ? method != null : !METHOD_EDEFAULT.equals(method);
			case MvcmetamodelPackage.FORM__ACTION:
				return ACTION_EDEFAULT == null ? action != null : !ACTION_EDEFAULT.equals(action);
			case MvcmetamodelPackage.FORM__COMPONENT:
				return component != null && !component.isEmpty();
			case MvcmetamodelPackage.FORM__BUTTON_FORM:
				return buttonForm != null;
			case MvcmetamodelPackage.FORM__SERVLET:
				return servlet != null;
		}
		return super.eIsSet(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String toString() {
		if (eIsProxy()) return super.toString();

		StringBuffer result = new StringBuffer(super.toString());
		result.append(" (name: ");
		result.append(name);
		result.append(", method: ");
		result.append(method);
		result.append(", action: ");
		result.append(action);
		result.append(')');
		return result.toString();
	}

} //FormImpl
