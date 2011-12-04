/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package mvcmetamodel.impl;

import java.util.Collection;

import mvcmetamodel.Application;
import mvcmetamodel.MvcmetamodelPackage;
import mvcmetamodel.Page;
import mvcmetamodel.Resources;
import mvcmetamodel.WebXML;

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
 * An implementation of the model object '<em><b>Application</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link mvcmetamodel.impl.ApplicationImpl#getWebxml <em>Webxml</em>}</li>
 *   <li>{@link mvcmetamodel.impl.ApplicationImpl#getResources <em>Resources</em>}</li>
 *   <li>{@link mvcmetamodel.impl.ApplicationImpl#getName <em>Name</em>}</li>
 *   <li>{@link mvcmetamodel.impl.ApplicationImpl#getPage <em>Page</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class ApplicationImpl extends EObjectImpl implements Application {
	/**
	 * The cached value of the '{@link #getWebxml() <em>Webxml</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getWebxml()
	 * @generated
	 * @ordered
	 */
	protected WebXML webxml;

	/**
	 * The cached value of the '{@link #getResources() <em>Resources</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getResources()
	 * @generated
	 * @ordered
	 */
	protected EList resources;

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
	 * The cached value of the '{@link #getPage() <em>Page</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPage()
	 * @generated
	 * @ordered
	 */
	protected EList page;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ApplicationImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected EClass eStaticClass() {
		return MvcmetamodelPackage.Literals.APPLICATION;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList getPage() {
		if (page == null) {
			page = new EObjectContainmentEList(Page.class, this, MvcmetamodelPackage.APPLICATION__PAGE);
		}
		return page;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public WebXML getWebxml() {
		return webxml;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetWebxml(WebXML newWebxml, NotificationChain msgs) {
		WebXML oldWebxml = webxml;
		webxml = newWebxml;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, MvcmetamodelPackage.APPLICATION__WEBXML, oldWebxml, newWebxml);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setWebxml(WebXML newWebxml) {
		if (newWebxml != webxml) {
			NotificationChain msgs = null;
			if (webxml != null)
				msgs = ((InternalEObject)webxml).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - MvcmetamodelPackage.APPLICATION__WEBXML, null, msgs);
			if (newWebxml != null)
				msgs = ((InternalEObject)newWebxml).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - MvcmetamodelPackage.APPLICATION__WEBXML, null, msgs);
			msgs = basicSetWebxml(newWebxml, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, MvcmetamodelPackage.APPLICATION__WEBXML, newWebxml, newWebxml));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList getResources() {
		if (resources == null) {
			resources = new EObjectContainmentEList(Resources.class, this, MvcmetamodelPackage.APPLICATION__RESOURCES);
		}
		return resources;
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
			eNotify(new ENotificationImpl(this, Notification.SET, MvcmetamodelPackage.APPLICATION__NAME, oldName, name));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case MvcmetamodelPackage.APPLICATION__WEBXML:
				return basicSetWebxml(null, msgs);
			case MvcmetamodelPackage.APPLICATION__RESOURCES:
				return ((InternalEList)getResources()).basicRemove(otherEnd, msgs);
			case MvcmetamodelPackage.APPLICATION__PAGE:
				return ((InternalEList)getPage()).basicRemove(otherEnd, msgs);
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
			case MvcmetamodelPackage.APPLICATION__WEBXML:
				return getWebxml();
			case MvcmetamodelPackage.APPLICATION__RESOURCES:
				return getResources();
			case MvcmetamodelPackage.APPLICATION__NAME:
				return getName();
			case MvcmetamodelPackage.APPLICATION__PAGE:
				return getPage();
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
			case MvcmetamodelPackage.APPLICATION__WEBXML:
				setWebxml((WebXML)newValue);
				return;
			case MvcmetamodelPackage.APPLICATION__RESOURCES:
				getResources().clear();
				getResources().addAll((Collection)newValue);
				return;
			case MvcmetamodelPackage.APPLICATION__NAME:
				setName((String)newValue);
				return;
			case MvcmetamodelPackage.APPLICATION__PAGE:
				getPage().clear();
				getPage().addAll((Collection)newValue);
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
			case MvcmetamodelPackage.APPLICATION__WEBXML:
				setWebxml((WebXML)null);
				return;
			case MvcmetamodelPackage.APPLICATION__RESOURCES:
				getResources().clear();
				return;
			case MvcmetamodelPackage.APPLICATION__NAME:
				setName(NAME_EDEFAULT);
				return;
			case MvcmetamodelPackage.APPLICATION__PAGE:
				getPage().clear();
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
			case MvcmetamodelPackage.APPLICATION__WEBXML:
				return webxml != null;
			case MvcmetamodelPackage.APPLICATION__RESOURCES:
				return resources != null && !resources.isEmpty();
			case MvcmetamodelPackage.APPLICATION__NAME:
				return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
			case MvcmetamodelPackage.APPLICATION__PAGE:
				return page != null && !page.isEmpty();
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
		result.append(')');
		return result.toString();
	}

} //ApplicationImpl
