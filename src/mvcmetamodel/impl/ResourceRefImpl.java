/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package mvcmetamodel.impl;

import mvcmetamodel.MvcmetamodelPackage;
import mvcmetamodel.ResourceRef;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.EObjectImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Resource Ref</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link mvcmetamodel.impl.ResourceRefImpl#getResRefName <em>Res Ref Name</em>}</li>
 *   <li>{@link mvcmetamodel.impl.ResourceRefImpl#getDescription <em>Description</em>}</li>
 *   <li>{@link mvcmetamodel.impl.ResourceRefImpl#getResType <em>Res Type</em>}</li>
 *   <li>{@link mvcmetamodel.impl.ResourceRefImpl#getResAuth <em>Res Auth</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class ResourceRefImpl extends EObjectImpl implements ResourceRef {
	/**
	 * The default value of the '{@link #getResRefName() <em>Res Ref Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getResRefName()
	 * @generated
	 * @ordered
	 */
	protected static final String RES_REF_NAME_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getResRefName() <em>Res Ref Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getResRefName()
	 * @generated
	 * @ordered
	 */
	protected String resRefName = RES_REF_NAME_EDEFAULT;

	/**
	 * The default value of the '{@link #getDescription() <em>Description</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDescription()
	 * @generated
	 * @ordered
	 */
	protected static final String DESCRIPTION_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getDescription() <em>Description</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDescription()
	 * @generated
	 * @ordered
	 */
	protected String description = DESCRIPTION_EDEFAULT;

	/**
	 * The default value of the '{@link #getResType() <em>Res Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getResType()
	 * @generated
	 * @ordered
	 */
	protected static final String RES_TYPE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getResType() <em>Res Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getResType()
	 * @generated
	 * @ordered
	 */
	protected String resType = RES_TYPE_EDEFAULT;

	/**
	 * The default value of the '{@link #getResAuth() <em>Res Auth</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getResAuth()
	 * @generated
	 * @ordered
	 */
	protected static final String RES_AUTH_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getResAuth() <em>Res Auth</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getResAuth()
	 * @generated
	 * @ordered
	 */
	protected String resAuth = RES_AUTH_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ResourceRefImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected EClass eStaticClass() {
		return MvcmetamodelPackage.Literals.RESOURCE_REF;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getResRefName() {
		return resRefName;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setResRefName(String newResRefName) {
		String oldResRefName = resRefName;
		resRefName = newResRefName;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, MvcmetamodelPackage.RESOURCE_REF__RES_REF_NAME, oldResRefName, resRefName));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getDescription() {
		return description;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setDescription(String newDescription) {
		String oldDescription = description;
		description = newDescription;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, MvcmetamodelPackage.RESOURCE_REF__DESCRIPTION, oldDescription, description));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getResType() {
		return resType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setResType(String newResType) {
		String oldResType = resType;
		resType = newResType;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, MvcmetamodelPackage.RESOURCE_REF__RES_TYPE, oldResType, resType));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getResAuth() {
		return resAuth;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setResAuth(String newResAuth) {
		String oldResAuth = resAuth;
		resAuth = newResAuth;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, MvcmetamodelPackage.RESOURCE_REF__RES_AUTH, oldResAuth, resAuth));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case MvcmetamodelPackage.RESOURCE_REF__RES_REF_NAME:
				return getResRefName();
			case MvcmetamodelPackage.RESOURCE_REF__DESCRIPTION:
				return getDescription();
			case MvcmetamodelPackage.RESOURCE_REF__RES_TYPE:
				return getResType();
			case MvcmetamodelPackage.RESOURCE_REF__RES_AUTH:
				return getResAuth();
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
			case MvcmetamodelPackage.RESOURCE_REF__RES_REF_NAME:
				setResRefName((String)newValue);
				return;
			case MvcmetamodelPackage.RESOURCE_REF__DESCRIPTION:
				setDescription((String)newValue);
				return;
			case MvcmetamodelPackage.RESOURCE_REF__RES_TYPE:
				setResType((String)newValue);
				return;
			case MvcmetamodelPackage.RESOURCE_REF__RES_AUTH:
				setResAuth((String)newValue);
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
			case MvcmetamodelPackage.RESOURCE_REF__RES_REF_NAME:
				setResRefName(RES_REF_NAME_EDEFAULT);
				return;
			case MvcmetamodelPackage.RESOURCE_REF__DESCRIPTION:
				setDescription(DESCRIPTION_EDEFAULT);
				return;
			case MvcmetamodelPackage.RESOURCE_REF__RES_TYPE:
				setResType(RES_TYPE_EDEFAULT);
				return;
			case MvcmetamodelPackage.RESOURCE_REF__RES_AUTH:
				setResAuth(RES_AUTH_EDEFAULT);
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
			case MvcmetamodelPackage.RESOURCE_REF__RES_REF_NAME:
				return RES_REF_NAME_EDEFAULT == null ? resRefName != null : !RES_REF_NAME_EDEFAULT.equals(resRefName);
			case MvcmetamodelPackage.RESOURCE_REF__DESCRIPTION:
				return DESCRIPTION_EDEFAULT == null ? description != null : !DESCRIPTION_EDEFAULT.equals(description);
			case MvcmetamodelPackage.RESOURCE_REF__RES_TYPE:
				return RES_TYPE_EDEFAULT == null ? resType != null : !RES_TYPE_EDEFAULT.equals(resType);
			case MvcmetamodelPackage.RESOURCE_REF__RES_AUTH:
				return RES_AUTH_EDEFAULT == null ? resAuth != null : !RES_AUTH_EDEFAULT.equals(resAuth);
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
		result.append(" (resRefName: ");
		result.append(resRefName);
		result.append(", description: ");
		result.append(description);
		result.append(", resType: ");
		result.append(resType);
		result.append(", resAuth: ");
		result.append(resAuth);
		result.append(')');
		return result.toString();
	}

} //ResourceRefImpl
