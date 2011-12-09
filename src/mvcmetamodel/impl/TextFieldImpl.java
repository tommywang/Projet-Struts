/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package mvcmetamodel.impl;

import mvcmetamodel.MvcmetamodelPackage;
import mvcmetamodel.TextField;

import mvcmetamodel.TextLabel;
import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Text Field</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link mvcmetamodel.impl.TextFieldImpl#getSize <em>Size</em>}</li>
 *   <li>{@link mvcmetamodel.impl.TextFieldImpl#getName <em>Name</em>}</li>
 *   <li>{@link mvcmetamodel.impl.TextFieldImpl#getMaxLength <em>Max Length</em>}</li>
 *   <li>{@link mvcmetamodel.impl.TextFieldImpl#getErrorText <em>Error Text</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class TextFieldImpl extends InputImpl implements TextField {
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
	 * The cached value of the '{@link #getErrorText() <em>Error Text</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getErrorText()
	 * @generated
	 * @ordered
	 */
	protected TextLabel errorText;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected TextFieldImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return MvcmetamodelPackage.Literals.TEXT_FIELD;
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
			eNotify(new ENotificationImpl(this, Notification.SET, MvcmetamodelPackage.TEXT_FIELD__SIZE, oldSize, size));
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
			eNotify(new ENotificationImpl(this, Notification.SET, MvcmetamodelPackage.TEXT_FIELD__MAX_LENGTH, oldMaxLength, maxLength));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TextLabel getErrorText() {
		return errorText;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetErrorText(TextLabel newErrorText, NotificationChain msgs) {
		TextLabel oldErrorText = errorText;
		errorText = newErrorText;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, MvcmetamodelPackage.TEXT_FIELD__ERROR_TEXT, oldErrorText, newErrorText);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setErrorText(TextLabel newErrorText) {
		if (newErrorText != errorText) {
			NotificationChain msgs = null;
			if (errorText != null)
				msgs = ((InternalEObject)errorText).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - MvcmetamodelPackage.TEXT_FIELD__ERROR_TEXT, null, msgs);
			if (newErrorText != null)
				msgs = ((InternalEObject)newErrorText).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - MvcmetamodelPackage.TEXT_FIELD__ERROR_TEXT, null, msgs);
			msgs = basicSetErrorText(newErrorText, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, MvcmetamodelPackage.TEXT_FIELD__ERROR_TEXT, newErrorText, newErrorText));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case MvcmetamodelPackage.TEXT_FIELD__ERROR_TEXT:
				return basicSetErrorText(null, msgs);
		}
		return super.eInverseRemove(otherEnd, featureID, msgs);
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
			eNotify(new ENotificationImpl(this, Notification.SET, MvcmetamodelPackage.TEXT_FIELD__NAME, oldName, name));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case MvcmetamodelPackage.TEXT_FIELD__SIZE:
				return getSize();
			case MvcmetamodelPackage.TEXT_FIELD__NAME:
				return getName();
			case MvcmetamodelPackage.TEXT_FIELD__MAX_LENGTH:
				return getMaxLength();
			case MvcmetamodelPackage.TEXT_FIELD__ERROR_TEXT:
				return getErrorText();
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
			case MvcmetamodelPackage.TEXT_FIELD__SIZE:
				setSize((Integer)newValue);
				return;
			case MvcmetamodelPackage.TEXT_FIELD__NAME:
				setName((String)newValue);
				return;
			case MvcmetamodelPackage.TEXT_FIELD__MAX_LENGTH:
				setMaxLength((Integer)newValue);
				return;
			case MvcmetamodelPackage.TEXT_FIELD__ERROR_TEXT:
				setErrorText((TextLabel)newValue);
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
			case MvcmetamodelPackage.TEXT_FIELD__SIZE:
				setSize(SIZE_EDEFAULT);
				return;
			case MvcmetamodelPackage.TEXT_FIELD__NAME:
				setName(NAME_EDEFAULT);
				return;
			case MvcmetamodelPackage.TEXT_FIELD__MAX_LENGTH:
				setMaxLength(MAX_LENGTH_EDEFAULT);
				return;
			case MvcmetamodelPackage.TEXT_FIELD__ERROR_TEXT:
				setErrorText((TextLabel)null);
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
			case MvcmetamodelPackage.TEXT_FIELD__SIZE:
				return size != SIZE_EDEFAULT;
			case MvcmetamodelPackage.TEXT_FIELD__NAME:
				return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
			case MvcmetamodelPackage.TEXT_FIELD__MAX_LENGTH:
				return maxLength != MAX_LENGTH_EDEFAULT;
			case MvcmetamodelPackage.TEXT_FIELD__ERROR_TEXT:
				return errorText != null;
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
		result.append(" (size: ");
		result.append(size);
		result.append(", name: ");
		result.append(name);
		result.append(", maxLength: ");
		result.append(maxLength);
		result.append(')');
		return result.toString();
	}

} //TextFieldImpl
