/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package mvcmetamodel.impl;

import mvcmetamodel.InitParam;
import mvcmetamodel.MvcmetamodelPackage;
import mvcmetamodel.Servlet;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.EObjectImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Servlet</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link mvcmetamodel.impl.ServletImpl#getName <em>Name</em>}</li>
 *   <li>{@link mvcmetamodel.impl.ServletImpl#getClass_ <em>Class</em>}</li>
 *   <li>{@link mvcmetamodel.impl.ServletImpl#getContains <em>Contains</em>}</li>
 *   <li>{@link mvcmetamodel.impl.ServletImpl#getLoadOnStartup <em>Load On Startup</em>}</li>
 *   <li>{@link mvcmetamodel.impl.ServletImpl#getInitParam <em>Init Param</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class ServletImpl extends EObjectImpl implements Servlet {
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
	 * The default value of the '{@link #getClass_() <em>Class</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getClass_()
	 * @generated
	 * @ordered
	 */
	protected static final String CLASS_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getClass_() <em>Class</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getClass_()
	 * @generated
	 * @ordered
	 */
	protected String class_ = CLASS_EDEFAULT;

	/**
	 * The cached value of the '{@link #getContains() <em>Contains</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getContains()
	 * @generated
	 * @ordered
	 */
	protected InitParam contains;

	/**
	 * The default value of the '{@link #getLoadOnStartup() <em>Load On Startup</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLoadOnStartup()
	 * @generated
	 * @ordered
	 */
	protected static final int LOAD_ON_STARTUP_EDEFAULT = 0;

	/**
	 * The cached value of the '{@link #getLoadOnStartup() <em>Load On Startup</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLoadOnStartup()
	 * @generated
	 * @ordered
	 */
	protected int loadOnStartup = LOAD_ON_STARTUP_EDEFAULT;

	/**
	 * The cached value of the '{@link #getInitParam() <em>Init Param</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getInitParam()
	 * @generated
	 * @ordered
	 */
	protected InitParam initParam;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ServletImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected EClass eStaticClass() {
		return MvcmetamodelPackage.Literals.SERVLET;
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
			eNotify(new ENotificationImpl(this, Notification.SET, MvcmetamodelPackage.SERVLET__NAME, oldName, name));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getClass_() {
		return class_;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setClass(String newClass) {
		String oldClass = class_;
		class_ = newClass;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, MvcmetamodelPackage.SERVLET__CLASS, oldClass, class_));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public InitParam getContains() {
		return contains;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetContains(InitParam newContains, NotificationChain msgs) {
		InitParam oldContains = contains;
		contains = newContains;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, MvcmetamodelPackage.SERVLET__CONTAINS, oldContains, newContains);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setContains(InitParam newContains) {
		if (newContains != contains) {
			NotificationChain msgs = null;
			if (contains != null)
				msgs = ((InternalEObject)contains).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - MvcmetamodelPackage.SERVLET__CONTAINS, null, msgs);
			if (newContains != null)
				msgs = ((InternalEObject)newContains).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - MvcmetamodelPackage.SERVLET__CONTAINS, null, msgs);
			msgs = basicSetContains(newContains, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, MvcmetamodelPackage.SERVLET__CONTAINS, newContains, newContains));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public int getLoadOnStartup() {
		return loadOnStartup;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setLoadOnStartup(int newLoadOnStartup) {
		int oldLoadOnStartup = loadOnStartup;
		loadOnStartup = newLoadOnStartup;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, MvcmetamodelPackage.SERVLET__LOAD_ON_STARTUP, oldLoadOnStartup, loadOnStartup));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public InitParam getInitParam() {
		return initParam;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetInitParam(InitParam newInitParam, NotificationChain msgs) {
		InitParam oldInitParam = initParam;
		initParam = newInitParam;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, MvcmetamodelPackage.SERVLET__INIT_PARAM, oldInitParam, newInitParam);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setInitParam(InitParam newInitParam) {
		if (newInitParam != initParam) {
			NotificationChain msgs = null;
			if (initParam != null)
				msgs = ((InternalEObject)initParam).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - MvcmetamodelPackage.SERVLET__INIT_PARAM, null, msgs);
			if (newInitParam != null)
				msgs = ((InternalEObject)newInitParam).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - MvcmetamodelPackage.SERVLET__INIT_PARAM, null, msgs);
			msgs = basicSetInitParam(newInitParam, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, MvcmetamodelPackage.SERVLET__INIT_PARAM, newInitParam, newInitParam));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case MvcmetamodelPackage.SERVLET__CONTAINS:
				return basicSetContains(null, msgs);
			case MvcmetamodelPackage.SERVLET__INIT_PARAM:
				return basicSetInitParam(null, msgs);
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
			case MvcmetamodelPackage.SERVLET__NAME:
				return getName();
			case MvcmetamodelPackage.SERVLET__CLASS:
				return getClass_();
			case MvcmetamodelPackage.SERVLET__CONTAINS:
				return getContains();
			case MvcmetamodelPackage.SERVLET__LOAD_ON_STARTUP:
				return new Integer(getLoadOnStartup());
			case MvcmetamodelPackage.SERVLET__INIT_PARAM:
				return getInitParam();
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
			case MvcmetamodelPackage.SERVLET__NAME:
				setName((String)newValue);
				return;
			case MvcmetamodelPackage.SERVLET__CLASS:
				setClass((String)newValue);
				return;
			case MvcmetamodelPackage.SERVLET__CONTAINS:
				setContains((InitParam)newValue);
				return;
			case MvcmetamodelPackage.SERVLET__LOAD_ON_STARTUP:
				setLoadOnStartup(((Integer)newValue).intValue());
				return;
			case MvcmetamodelPackage.SERVLET__INIT_PARAM:
				setInitParam((InitParam)newValue);
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
			case MvcmetamodelPackage.SERVLET__NAME:
				setName(NAME_EDEFAULT);
				return;
			case MvcmetamodelPackage.SERVLET__CLASS:
				setClass(CLASS_EDEFAULT);
				return;
			case MvcmetamodelPackage.SERVLET__CONTAINS:
				setContains((InitParam)null);
				return;
			case MvcmetamodelPackage.SERVLET__LOAD_ON_STARTUP:
				setLoadOnStartup(LOAD_ON_STARTUP_EDEFAULT);
				return;
			case MvcmetamodelPackage.SERVLET__INIT_PARAM:
				setInitParam((InitParam)null);
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
			case MvcmetamodelPackage.SERVLET__NAME:
				return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
			case MvcmetamodelPackage.SERVLET__CLASS:
				return CLASS_EDEFAULT == null ? class_ != null : !CLASS_EDEFAULT.equals(class_);
			case MvcmetamodelPackage.SERVLET__CONTAINS:
				return contains != null;
			case MvcmetamodelPackage.SERVLET__LOAD_ON_STARTUP:
				return loadOnStartup != LOAD_ON_STARTUP_EDEFAULT;
			case MvcmetamodelPackage.SERVLET__INIT_PARAM:
				return initParam != null;
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
		result.append(", class: ");
		result.append(class_);
		result.append(", loadOnStartup: ");
		result.append(loadOnStartup);
		result.append(')');
		return result.toString();
	}

} //ServletImpl
