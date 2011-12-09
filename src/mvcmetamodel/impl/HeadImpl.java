/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package mvcmetamodel.impl;

import java.util.Collection;
import mvcmetamodel.Component;
import mvcmetamodel.Head;
import mvcmetamodel.HeadTitle;
import mvcmetamodel.MvcmetamodelPackage;

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
 * An implementation of the model object '<em><b>Head</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link mvcmetamodel.impl.HeadImpl#getComponents <em>Components</em>}</li>
 *   <li>{@link mvcmetamodel.impl.HeadImpl#getHeadTitle <em>Head Title</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class HeadImpl extends EObjectImpl implements Head {
	/**
	 * The cached value of the '{@link #getComponents() <em>Components</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getComponents()
	 * @generated
	 * @ordered
	 */
	protected EList<Component> components;

	/**
	 * The cached value of the '{@link #getHeadTitle() <em>Head Title</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getHeadTitle()
	 * @generated
	 * @ordered
	 */
	protected HeadTitle headTitle;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected HeadImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return MvcmetamodelPackage.Literals.HEAD;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Component> getComponents() {
		if (components == null) {
			components = new EObjectContainmentEList<Component>(Component.class, this, MvcmetamodelPackage.HEAD__COMPONENTS);
		}
		return components;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public HeadTitle getHeadTitle() {
		return headTitle;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetHeadTitle(HeadTitle newHeadTitle, NotificationChain msgs) {
		HeadTitle oldHeadTitle = headTitle;
		headTitle = newHeadTitle;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, MvcmetamodelPackage.HEAD__HEAD_TITLE, oldHeadTitle, newHeadTitle);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setHeadTitle(HeadTitle newHeadTitle) {
		if (newHeadTitle != headTitle) {
			NotificationChain msgs = null;
			if (headTitle != null)
				msgs = ((InternalEObject)headTitle).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - MvcmetamodelPackage.HEAD__HEAD_TITLE, null, msgs);
			if (newHeadTitle != null)
				msgs = ((InternalEObject)newHeadTitle).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - MvcmetamodelPackage.HEAD__HEAD_TITLE, null, msgs);
			msgs = basicSetHeadTitle(newHeadTitle, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, MvcmetamodelPackage.HEAD__HEAD_TITLE, newHeadTitle, newHeadTitle));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case MvcmetamodelPackage.HEAD__COMPONENTS:
				return ((InternalEList<?>)getComponents()).basicRemove(otherEnd, msgs);
			case MvcmetamodelPackage.HEAD__HEAD_TITLE:
				return basicSetHeadTitle(null, msgs);
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
			case MvcmetamodelPackage.HEAD__COMPONENTS:
				return getComponents();
			case MvcmetamodelPackage.HEAD__HEAD_TITLE:
				return getHeadTitle();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case MvcmetamodelPackage.HEAD__COMPONENTS:
				getComponents().clear();
				getComponents().addAll((Collection<? extends Component>)newValue);
				return;
			case MvcmetamodelPackage.HEAD__HEAD_TITLE:
				setHeadTitle((HeadTitle)newValue);
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
			case MvcmetamodelPackage.HEAD__COMPONENTS:
				getComponents().clear();
				return;
			case MvcmetamodelPackage.HEAD__HEAD_TITLE:
				setHeadTitle((HeadTitle)null);
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
			case MvcmetamodelPackage.HEAD__COMPONENTS:
				return components != null && !components.isEmpty();
			case MvcmetamodelPackage.HEAD__HEAD_TITLE:
				return headTitle != null;
		}
		return super.eIsSet(featureID);
	}

} //HeadImpl
