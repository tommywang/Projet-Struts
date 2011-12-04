/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package mvcmetamodel.impl;

import mvcmetamodel.MvcmetamodelPackage;
import mvcmetamodel.Servlet;
import mvcmetamodel.ServletMapping;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.EObjectImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Servlet Mapping</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link mvcmetamodel.impl.ServletMappingImpl#getName <em>Name</em>}</li>
 *   <li>{@link mvcmetamodel.impl.ServletMappingImpl#getUrlPattern <em>Url Pattern</em>}</li>
 *   <li>{@link mvcmetamodel.impl.ServletMappingImpl#getServlet <em>Servlet</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class ServletMappingImpl extends EObjectImpl implements ServletMapping {
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
	 * The default value of the '{@link #getUrlPattern() <em>Url Pattern</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getUrlPattern()
	 * @generated
	 * @ordered
	 */
	protected static final String URL_PATTERN_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getUrlPattern() <em>Url Pattern</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getUrlPattern()
	 * @generated
	 * @ordered
	 */
	protected String urlPattern = URL_PATTERN_EDEFAULT;

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
	protected ServletMappingImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected EClass eStaticClass() {
		return MvcmetamodelPackage.Literals.SERVLET_MAPPING;
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
			eNotify(new ENotificationImpl(this, Notification.SET, MvcmetamodelPackage.SERVLET_MAPPING__NAME, oldName, name));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getUrlPattern() {
		return urlPattern;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setUrlPattern(String newUrlPattern) {
		String oldUrlPattern = urlPattern;
		urlPattern = newUrlPattern;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, MvcmetamodelPackage.SERVLET_MAPPING__URL_PATTERN, oldUrlPattern, urlPattern));
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
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, MvcmetamodelPackage.SERVLET_MAPPING__SERVLET, oldServlet, servlet));
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
			eNotify(new ENotificationImpl(this, Notification.SET, MvcmetamodelPackage.SERVLET_MAPPING__SERVLET, oldServlet, servlet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case MvcmetamodelPackage.SERVLET_MAPPING__NAME:
				return getName();
			case MvcmetamodelPackage.SERVLET_MAPPING__URL_PATTERN:
				return getUrlPattern();
			case MvcmetamodelPackage.SERVLET_MAPPING__SERVLET:
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
			case MvcmetamodelPackage.SERVLET_MAPPING__NAME:
				setName((String)newValue);
				return;
			case MvcmetamodelPackage.SERVLET_MAPPING__URL_PATTERN:
				setUrlPattern((String)newValue);
				return;
			case MvcmetamodelPackage.SERVLET_MAPPING__SERVLET:
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
			case MvcmetamodelPackage.SERVLET_MAPPING__NAME:
				setName(NAME_EDEFAULT);
				return;
			case MvcmetamodelPackage.SERVLET_MAPPING__URL_PATTERN:
				setUrlPattern(URL_PATTERN_EDEFAULT);
				return;
			case MvcmetamodelPackage.SERVLET_MAPPING__SERVLET:
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
			case MvcmetamodelPackage.SERVLET_MAPPING__NAME:
				return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
			case MvcmetamodelPackage.SERVLET_MAPPING__URL_PATTERN:
				return URL_PATTERN_EDEFAULT == null ? urlPattern != null : !URL_PATTERN_EDEFAULT.equals(urlPattern);
			case MvcmetamodelPackage.SERVLET_MAPPING__SERVLET:
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
		result.append(", urlPattern: ");
		result.append(urlPattern);
		result.append(')');
		return result.toString();
	}

} //ServletMappingImpl
