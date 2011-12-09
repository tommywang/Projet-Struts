/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package mvcmetamodel.impl;

import mvcmetamodel.MvcmetamodelPackage;
import mvcmetamodel.Password;

import mvcmetamodel.TextLabel;
import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Password</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link mvcmetamodel.impl.PasswordImpl#getName <em>Name</em>}</li>
 *   <li>{@link mvcmetamodel.impl.PasswordImpl#getSize <em>Size</em>}</li>
 *   <li>{@link mvcmetamodel.impl.PasswordImpl#getMaxLength <em>Max Length</em>}</li>
 *   <li>{@link mvcmetamodel.impl.PasswordImpl#getErrorPassword <em>Error Password</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class PasswordImpl extends InputImpl implements Password {
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
	 * The default value of the '{@link #getSize() <em>Size</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSize()
	 * @generated
	 * @ordered
	 */
	protected static final int SIZE_EDEFAULT = 0;
	/**
	 * The cached value of the '{@link #getSize() <em>Size</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSize()
	 * @generated
	 * @ordered
	 */
	protected int size = SIZE_EDEFAULT;
	/**
	 * The default value of the '{@link #getMaxLength() <em>Max Length</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMaxLength()
	 * @generated
	 * @ordered
	 */
	protected static final int MAX_LENGTH_EDEFAULT = 0;
	/**
	 * The cached value of the '{@link #getMaxLength() <em>Max Length</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMaxLength()
	 * @generated
	 * @ordered
	 */
	protected int maxLength = MAX_LENGTH_EDEFAULT;

	/**
	 * The cached value of the '{@link #getErrorPassword() <em>Error Password</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getErrorPassword()
	 * @generated
	 * @ordered
	 */
	protected TextLabel errorPassword;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected PasswordImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return MvcmetamodelPackage.Literals.PASSWORD;
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
			eNotify(new ENotificationImpl(this, Notification.SET, MvcmetamodelPackage.PASSWORD__NAME, oldName, name));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public int getSize() {
		return size;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setSize(int newSize) {
		int oldSize = size;
		size = newSize;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, MvcmetamodelPackage.PASSWORD__SIZE, oldSize, size));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public int getMaxLength() {
		return maxLength;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setMaxLength(int newMaxLength) {
		int oldMaxLength = maxLength;
		maxLength = newMaxLength;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, MvcmetamodelPackage.PASSWORD__MAX_LENGTH, oldMaxLength, maxLength));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TextLabel getErrorPassword() {
		return errorPassword;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetErrorPassword(TextLabel newErrorPassword, NotificationChain msgs) {
		TextLabel oldErrorPassword = errorPassword;
		errorPassword = newErrorPassword;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, MvcmetamodelPackage.PASSWORD__ERROR_PASSWORD, oldErrorPassword, newErrorPassword);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setErrorPassword(TextLabel newErrorPassword) {
		if (newErrorPassword != errorPassword) {
			NotificationChain msgs = null;
			if (errorPassword != null)
				msgs = ((InternalEObject)errorPassword).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - MvcmetamodelPackage.PASSWORD__ERROR_PASSWORD, null, msgs);
			if (newErrorPassword != null)
				msgs = ((InternalEObject)newErrorPassword).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - MvcmetamodelPackage.PASSWORD__ERROR_PASSWORD, null, msgs);
			msgs = basicSetErrorPassword(newErrorPassword, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, MvcmetamodelPackage.PASSWORD__ERROR_PASSWORD, newErrorPassword, newErrorPassword));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case MvcmetamodelPackage.PASSWORD__ERROR_PASSWORD:
				return basicSetErrorPassword(null, msgs);
		}
		return super.eInverseRemove(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case MvcmetamodelPackage.PASSWORD__NAME:
				return getName();
			case MvcmetamodelPackage.PASSWORD__SIZE:
				return getSize();
			case MvcmetamodelPackage.PASSWORD__MAX_LENGTH:
				return getMaxLength();
			case MvcmetamodelPackage.PASSWORD__ERROR_PASSWORD:
				return getErrorPassword();
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
			case MvcmetamodelPackage.PASSWORD__NAME:
				setName((String)newValue);
				return;
			case MvcmetamodelPackage.PASSWORD__SIZE:
				setSize((Integer)newValue);
				return;
			case MvcmetamodelPackage.PASSWORD__MAX_LENGTH:
				setMaxLength((Integer)newValue);
				return;
			case MvcmetamodelPackage.PASSWORD__ERROR_PASSWORD:
				setErrorPassword((TextLabel)newValue);
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
			case MvcmetamodelPackage.PASSWORD__NAME:
				setName(NAME_EDEFAULT);
				return;
			case MvcmetamodelPackage.PASSWORD__SIZE:
				setSize(SIZE_EDEFAULT);
				return;
			case MvcmetamodelPackage.PASSWORD__MAX_LENGTH:
				setMaxLength(MAX_LENGTH_EDEFAULT);
				return;
			case MvcmetamodelPackage.PASSWORD__ERROR_PASSWORD:
				setErrorPassword((TextLabel)null);
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
			case MvcmetamodelPackage.PASSWORD__NAME:
				return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
			case MvcmetamodelPackage.PASSWORD__SIZE:
				return size != SIZE_EDEFAULT;
			case MvcmetamodelPackage.PASSWORD__MAX_LENGTH:
				return maxLength != MAX_LENGTH_EDEFAULT;
			case MvcmetamodelPackage.PASSWORD__ERROR_PASSWORD:
				return errorPassword != null;
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
		result.append(" (name: ");
		result.append(name);
		result.append(", size: ");
		result.append(size);
		result.append(", maxLength: ");
		result.append(maxLength);
		result.append(')');
		return result.toString();
	}

} //PasswordImpl
