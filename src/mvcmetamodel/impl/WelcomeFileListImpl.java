/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package mvcmetamodel.impl;

import java.util.Collection;

import mvcmetamodel.MvcmetamodelPackage;
import mvcmetamodel.WelcomeFile;
import mvcmetamodel.WelcomeFileList;

import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.EObjectImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Welcome File List</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link mvcmetamodel.impl.WelcomeFileListImpl#getWelcomeFile <em>Welcome File</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class WelcomeFileListImpl extends EObjectImpl implements WelcomeFileList {
	/**
	 * The cached value of the '{@link #getWelcomeFile() <em>Welcome File</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getWelcomeFile()
	 * @generated
	 * @ordered
	 */
	protected EList welcomeFile;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected WelcomeFileListImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected EClass eStaticClass() {
		return MvcmetamodelPackage.Literals.WELCOME_FILE_LIST;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList getWelcomeFile() {
		if (welcomeFile == null) {
			welcomeFile = new EObjectContainmentEList(WelcomeFile.class, this, MvcmetamodelPackage.WELCOME_FILE_LIST__WELCOME_FILE);
		}
		return welcomeFile;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case MvcmetamodelPackage.WELCOME_FILE_LIST__WELCOME_FILE:
				return ((InternalEList)getWelcomeFile()).basicRemove(otherEnd, msgs);
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
			case MvcmetamodelPackage.WELCOME_FILE_LIST__WELCOME_FILE:
				return getWelcomeFile();
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
			case MvcmetamodelPackage.WELCOME_FILE_LIST__WELCOME_FILE:
				getWelcomeFile().clear();
				getWelcomeFile().addAll((Collection)newValue);
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
			case MvcmetamodelPackage.WELCOME_FILE_LIST__WELCOME_FILE:
				getWelcomeFile().clear();
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
			case MvcmetamodelPackage.WELCOME_FILE_LIST__WELCOME_FILE:
				return welcomeFile != null && !welcomeFile.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //WelcomeFileListImpl
