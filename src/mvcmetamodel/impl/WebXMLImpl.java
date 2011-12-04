/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package mvcmetamodel.impl;

import mvcmetamodel.MvcmetamodelPackage;
import mvcmetamodel.ResourceRef;
import mvcmetamodel.Servlet;
import mvcmetamodel.ServletMapping;
import mvcmetamodel.WebXML;
import mvcmetamodel.WelcomeFileList;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.EObjectImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Web XML</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link mvcmetamodel.impl.WebXMLImpl#getServletMapping <em>Servlet Mapping</em>}</li>
 *   <li>{@link mvcmetamodel.impl.WebXMLImpl#getResourceRef <em>Resource Ref</em>}</li>
 *   <li>{@link mvcmetamodel.impl.WebXMLImpl#getServlet <em>Servlet</em>}</li>
 *   <li>{@link mvcmetamodel.impl.WebXMLImpl#getWelcomeFileList <em>Welcome File List</em>}</li>
 *   <li>{@link mvcmetamodel.impl.WebXMLImpl#getName <em>Name</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class WebXMLImpl extends EObjectImpl implements WebXML {
	/**
	 * The cached value of the '{@link #getServletMapping() <em>Servlet Mapping</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getServletMapping()
	 * @generated
	 * @ordered
	 */
	protected ServletMapping servletMapping;

	/**
	 * The cached value of the '{@link #getResourceRef() <em>Resource Ref</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getResourceRef()
	 * @generated
	 * @ordered
	 */
	protected ResourceRef resourceRef;

	/**
	 * The cached value of the '{@link #getServlet() <em>Servlet</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getServlet()
	 * @generated
	 * @ordered
	 */
	protected Servlet servlet;

	/**
	 * The cached value of the '{@link #getWelcomeFileList() <em>Welcome File List</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getWelcomeFileList()
	 * @generated
	 * @ordered
	 */
	protected WelcomeFileList welcomeFileList;

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
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected WebXMLImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected EClass eStaticClass() {
		return MvcmetamodelPackage.Literals.WEB_XML;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ServletMapping getServletMapping() {
		return servletMapping;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetServletMapping(ServletMapping newServletMapping, NotificationChain msgs) {
		ServletMapping oldServletMapping = servletMapping;
		servletMapping = newServletMapping;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, MvcmetamodelPackage.WEB_XML__SERVLET_MAPPING, oldServletMapping, newServletMapping);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setServletMapping(ServletMapping newServletMapping) {
		if (newServletMapping != servletMapping) {
			NotificationChain msgs = null;
			if (servletMapping != null)
				msgs = ((InternalEObject)servletMapping).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - MvcmetamodelPackage.WEB_XML__SERVLET_MAPPING, null, msgs);
			if (newServletMapping != null)
				msgs = ((InternalEObject)newServletMapping).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - MvcmetamodelPackage.WEB_XML__SERVLET_MAPPING, null, msgs);
			msgs = basicSetServletMapping(newServletMapping, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, MvcmetamodelPackage.WEB_XML__SERVLET_MAPPING, newServletMapping, newServletMapping));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ResourceRef getResourceRef() {
		return resourceRef;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetResourceRef(ResourceRef newResourceRef, NotificationChain msgs) {
		ResourceRef oldResourceRef = resourceRef;
		resourceRef = newResourceRef;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, MvcmetamodelPackage.WEB_XML__RESOURCE_REF, oldResourceRef, newResourceRef);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setResourceRef(ResourceRef newResourceRef) {
		if (newResourceRef != resourceRef) {
			NotificationChain msgs = null;
			if (resourceRef != null)
				msgs = ((InternalEObject)resourceRef).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - MvcmetamodelPackage.WEB_XML__RESOURCE_REF, null, msgs);
			if (newResourceRef != null)
				msgs = ((InternalEObject)newResourceRef).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - MvcmetamodelPackage.WEB_XML__RESOURCE_REF, null, msgs);
			msgs = basicSetResourceRef(newResourceRef, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, MvcmetamodelPackage.WEB_XML__RESOURCE_REF, newResourceRef, newResourceRef));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Servlet getServlet() {
		return servlet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetServlet(Servlet newServlet, NotificationChain msgs) {
		Servlet oldServlet = servlet;
		servlet = newServlet;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, MvcmetamodelPackage.WEB_XML__SERVLET, oldServlet, newServlet);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setServlet(Servlet newServlet) {
		if (newServlet != servlet) {
			NotificationChain msgs = null;
			if (servlet != null)
				msgs = ((InternalEObject)servlet).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - MvcmetamodelPackage.WEB_XML__SERVLET, null, msgs);
			if (newServlet != null)
				msgs = ((InternalEObject)newServlet).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - MvcmetamodelPackage.WEB_XML__SERVLET, null, msgs);
			msgs = basicSetServlet(newServlet, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, MvcmetamodelPackage.WEB_XML__SERVLET, newServlet, newServlet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public WelcomeFileList getWelcomeFileList() {
		return welcomeFileList;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetWelcomeFileList(WelcomeFileList newWelcomeFileList, NotificationChain msgs) {
		WelcomeFileList oldWelcomeFileList = welcomeFileList;
		welcomeFileList = newWelcomeFileList;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, MvcmetamodelPackage.WEB_XML__WELCOME_FILE_LIST, oldWelcomeFileList, newWelcomeFileList);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setWelcomeFileList(WelcomeFileList newWelcomeFileList) {
		if (newWelcomeFileList != welcomeFileList) {
			NotificationChain msgs = null;
			if (welcomeFileList != null)
				msgs = ((InternalEObject)welcomeFileList).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - MvcmetamodelPackage.WEB_XML__WELCOME_FILE_LIST, null, msgs);
			if (newWelcomeFileList != null)
				msgs = ((InternalEObject)newWelcomeFileList).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - MvcmetamodelPackage.WEB_XML__WELCOME_FILE_LIST, null, msgs);
			msgs = basicSetWelcomeFileList(newWelcomeFileList, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, MvcmetamodelPackage.WEB_XML__WELCOME_FILE_LIST, newWelcomeFileList, newWelcomeFileList));
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
			eNotify(new ENotificationImpl(this, Notification.SET, MvcmetamodelPackage.WEB_XML__NAME, oldName, name));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case MvcmetamodelPackage.WEB_XML__SERVLET_MAPPING:
				return basicSetServletMapping(null, msgs);
			case MvcmetamodelPackage.WEB_XML__RESOURCE_REF:
				return basicSetResourceRef(null, msgs);
			case MvcmetamodelPackage.WEB_XML__SERVLET:
				return basicSetServlet(null, msgs);
			case MvcmetamodelPackage.WEB_XML__WELCOME_FILE_LIST:
				return basicSetWelcomeFileList(null, msgs);
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
			case MvcmetamodelPackage.WEB_XML__SERVLET_MAPPING:
				return getServletMapping();
			case MvcmetamodelPackage.WEB_XML__RESOURCE_REF:
				return getResourceRef();
			case MvcmetamodelPackage.WEB_XML__SERVLET:
				return getServlet();
			case MvcmetamodelPackage.WEB_XML__WELCOME_FILE_LIST:
				return getWelcomeFileList();
			case MvcmetamodelPackage.WEB_XML__NAME:
				return getName();
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
			case MvcmetamodelPackage.WEB_XML__SERVLET_MAPPING:
				setServletMapping((ServletMapping)newValue);
				return;
			case MvcmetamodelPackage.WEB_XML__RESOURCE_REF:
				setResourceRef((ResourceRef)newValue);
				return;
			case MvcmetamodelPackage.WEB_XML__SERVLET:
				setServlet((Servlet)newValue);
				return;
			case MvcmetamodelPackage.WEB_XML__WELCOME_FILE_LIST:
				setWelcomeFileList((WelcomeFileList)newValue);
				return;
			case MvcmetamodelPackage.WEB_XML__NAME:
				setName((String)newValue);
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
			case MvcmetamodelPackage.WEB_XML__SERVLET_MAPPING:
				setServletMapping((ServletMapping)null);
				return;
			case MvcmetamodelPackage.WEB_XML__RESOURCE_REF:
				setResourceRef((ResourceRef)null);
				return;
			case MvcmetamodelPackage.WEB_XML__SERVLET:
				setServlet((Servlet)null);
				return;
			case MvcmetamodelPackage.WEB_XML__WELCOME_FILE_LIST:
				setWelcomeFileList((WelcomeFileList)null);
				return;
			case MvcmetamodelPackage.WEB_XML__NAME:
				setName(NAME_EDEFAULT);
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
			case MvcmetamodelPackage.WEB_XML__SERVLET_MAPPING:
				return servletMapping != null;
			case MvcmetamodelPackage.WEB_XML__RESOURCE_REF:
				return resourceRef != null;
			case MvcmetamodelPackage.WEB_XML__SERVLET:
				return servlet != null;
			case MvcmetamodelPackage.WEB_XML__WELCOME_FILE_LIST:
				return welcomeFileList != null;
			case MvcmetamodelPackage.WEB_XML__NAME:
				return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
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

} //WebXMLImpl
