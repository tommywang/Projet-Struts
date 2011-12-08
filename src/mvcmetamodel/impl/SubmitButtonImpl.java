/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package mvcmetamodel.impl;

import mvcmetamodel.MvcmetamodelPackage;
import mvcmetamodel.SubmitButton;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Submit Button</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link mvcmetamodel.impl.SubmitButtonImpl#getValue <em>Value</em>}</li>
 *   <li>{@link mvcmetamodel.impl.SubmitButtonImpl#getSuccessTarget <em>Success Target</em>}</li>
 *   <li>{@link mvcmetamodel.impl.SubmitButtonImpl#getErrorTarget <em>Error Target</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class SubmitButtonImpl extends InputImpl implements SubmitButton {
	/**
	 * The default value of the '{@link #getValue() <em>Value</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getValue()
	 * @generated
	 * @ordered
	 */
	protected static final String VALUE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getValue() <em>Value</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getValue()
	 * @generated
	 * @ordered
	 */
	protected String value = VALUE_EDEFAULT;

	/**
	 * The default value of the '{@link #getSuccessTarget() <em>Success Target</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSuccessTarget()
	 * @generated
	 * @ordered
	 */
	protected static final String SUCCESS_TARGET_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getSuccessTarget() <em>Success Target</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSuccessTarget()
	 * @generated
	 * @ordered
	 */
	protected String successTarget = SUCCESS_TARGET_EDEFAULT;

	/**
	 * The default value of the '{@link #getErrorTarget() <em>Error Target</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getErrorTarget()
	 * @generated
	 * @ordered
	 */
	protected static final String ERROR_TARGET_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getErrorTarget() <em>Error Target</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getErrorTarget()
	 * @generated
	 * @ordered
	 */
	protected String errorTarget = ERROR_TARGET_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected SubmitButtonImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return MvcmetamodelPackage.Literals.SUBMIT_BUTTON;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getValue() {
		return value;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setValue(String newValue) {
		String oldValue = value;
		value = newValue;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, MvcmetamodelPackage.SUBMIT_BUTTON__VALUE, oldValue, value));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getSuccessTarget() {
		return successTarget;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setSuccessTarget(String newSuccessTarget) {
		String oldSuccessTarget = successTarget;
		successTarget = newSuccessTarget;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, MvcmetamodelPackage.SUBMIT_BUTTON__SUCCESS_TARGET, oldSuccessTarget, successTarget));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getErrorTarget() {
		return errorTarget;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setErrorTarget(String newErrorTarget) {
		String oldErrorTarget = errorTarget;
		errorTarget = newErrorTarget;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, MvcmetamodelPackage.SUBMIT_BUTTON__ERROR_TARGET, oldErrorTarget, errorTarget));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case MvcmetamodelPackage.SUBMIT_BUTTON__VALUE:
				return getValue();
			case MvcmetamodelPackage.SUBMIT_BUTTON__SUCCESS_TARGET:
				return getSuccessTarget();
			case MvcmetamodelPackage.SUBMIT_BUTTON__ERROR_TARGET:
				return getErrorTarget();
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
			case MvcmetamodelPackage.SUBMIT_BUTTON__VALUE:
				setValue((String)newValue);
				return;
			case MvcmetamodelPackage.SUBMIT_BUTTON__SUCCESS_TARGET:
				setSuccessTarget((String)newValue);
				return;
			case MvcmetamodelPackage.SUBMIT_BUTTON__ERROR_TARGET:
				setErrorTarget((String)newValue);
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
			case MvcmetamodelPackage.SUBMIT_BUTTON__VALUE:
				setValue(VALUE_EDEFAULT);
				return;
			case MvcmetamodelPackage.SUBMIT_BUTTON__SUCCESS_TARGET:
				setSuccessTarget(SUCCESS_TARGET_EDEFAULT);
				return;
			case MvcmetamodelPackage.SUBMIT_BUTTON__ERROR_TARGET:
				setErrorTarget(ERROR_TARGET_EDEFAULT);
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
			case MvcmetamodelPackage.SUBMIT_BUTTON__VALUE:
				return VALUE_EDEFAULT == null ? value != null : !VALUE_EDEFAULT.equals(value);
			case MvcmetamodelPackage.SUBMIT_BUTTON__SUCCESS_TARGET:
				return SUCCESS_TARGET_EDEFAULT == null ? successTarget != null : !SUCCESS_TARGET_EDEFAULT.equals(successTarget);
			case MvcmetamodelPackage.SUBMIT_BUTTON__ERROR_TARGET:
				return ERROR_TARGET_EDEFAULT == null ? errorTarget != null : !ERROR_TARGET_EDEFAULT.equals(errorTarget);
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
		result.append(" (value: ");
		result.append(value);
		result.append(", successTarget: ");
		result.append(successTarget);
		result.append(", errorTarget: ");
		result.append(errorTarget);
		result.append(')');
		return result.toString();
	}

} //SubmitButtonImpl
