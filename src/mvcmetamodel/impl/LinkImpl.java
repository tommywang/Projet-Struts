/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package mvcmetamodel.impl;

import mvcmetamodel.Link;
import mvcmetamodel.MvcmetamodelPackage;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Link</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link mvcmetamodel.impl.LinkImpl#getPageName <em>Page Name</em>}</li>
 *   <li>{@link mvcmetamodel.impl.LinkImpl#getPageType <em>Page Type</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class LinkImpl extends ContainerImpl implements Link {
	/**
	 * The default value of the '{@link #getPageName() <em>Page Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPageName()
	 * @generated
	 * @ordered
	 */
	protected static final String PAGE_NAME_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getPageName() <em>Page Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPageName()
	 * @generated
	 * @ordered
	 */
	protected String pageName = PAGE_NAME_EDEFAULT;

	/**
	 * The default value of the '{@link #getPageType() <em>Page Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPageType()
	 * @generated
	 * @ordered
	 */
	protected static final String PAGE_TYPE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getPageType() <em>Page Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPageType()
	 * @generated
	 * @ordered
	 */
	protected String pageType = PAGE_TYPE_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected LinkImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return MvcmetamodelPackage.Literals.LINK;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getPageName() {
		return pageName;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setPageName(String newPageName) {
		String oldPageName = pageName;
		pageName = newPageName;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, MvcmetamodelPackage.LINK__PAGE_NAME, oldPageName, pageName));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getPageType() {
		return pageType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setPageType(String newPageType) {
		String oldPageType = pageType;
		pageType = newPageType;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, MvcmetamodelPackage.LINK__PAGE_TYPE, oldPageType, pageType));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case MvcmetamodelPackage.LINK__PAGE_NAME:
				return getPageName();
			case MvcmetamodelPackage.LINK__PAGE_TYPE:
				return getPageType();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case MvcmetamodelPackage.LINK__PAGE_NAME:
				setPageName((String)newValue);
				return;
			case MvcmetamodelPackage.LINK__PAGE_TYPE:
				setPageType((String)newValue);
				return;
		}
		super.eSet(featureID, newValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eUnset(int featureID) {
		switch (featureID) {
			case MvcmetamodelPackage.LINK__PAGE_NAME:
				setPageName(PAGE_NAME_EDEFAULT);
				return;
			case MvcmetamodelPackage.LINK__PAGE_TYPE:
				setPageType(PAGE_TYPE_EDEFAULT);
				return;
		}
		super.eUnset(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean eIsSet(int featureID) {
		switch (featureID) {
			case MvcmetamodelPackage.LINK__PAGE_NAME:
				return PAGE_NAME_EDEFAULT == null ? pageName != null : !PAGE_NAME_EDEFAULT.equals(pageName);
			case MvcmetamodelPackage.LINK__PAGE_TYPE:
				return PAGE_TYPE_EDEFAULT == null ? pageType != null : !PAGE_TYPE_EDEFAULT.equals(pageType);
		}
		return super.eIsSet(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String toString() {
		if (eIsProxy()) return super.toString();

		StringBuffer result = new StringBuffer(super.toString());
		result.append(" (pageName: ");
		result.append(pageName);
		result.append(", pageType: ");
		result.append(pageType);
		result.append(')');
		return result.toString();
	}

} //LinkImpl
