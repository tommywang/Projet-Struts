/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package mvcmetamodel.impl;

import java.util.Collection;

import mvcmetamodel.Cell;
import mvcmetamodel.MvcmetamodelPackage;
import mvcmetamodel.Table;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Table</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link mvcmetamodel.impl.TableImpl#getNbRow <em>Nb Row</em>}</li>
 *   <li>{@link mvcmetamodel.impl.TableImpl#getNbCol <em>Nb Col</em>}</li>
 *   <li>{@link mvcmetamodel.impl.TableImpl#getCell <em>Cell</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class TableImpl extends ComponentImpl implements Table {
	/**
	 * The default value of the '{@link #getNbRow() <em>Nb Row</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNbRow()
	 * @generated
	 * @ordered
	 */
	protected static final int NB_ROW_EDEFAULT = 0;

	/**
	 * The cached value of the '{@link #getNbRow() <em>Nb Row</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNbRow()
	 * @generated
	 * @ordered
	 */
	protected int nbRow = NB_ROW_EDEFAULT;

	/**
	 * The default value of the '{@link #getNbCol() <em>Nb Col</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNbCol()
	 * @generated
	 * @ordered
	 */
	protected static final int NB_COL_EDEFAULT = 0;

	/**
	 * The cached value of the '{@link #getNbCol() <em>Nb Col</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNbCol()
	 * @generated
	 * @ordered
	 */
	protected int nbCol = NB_COL_EDEFAULT;

	/**
	 * The cached value of the '{@link #getCell() <em>Cell</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCell()
	 * @generated
	 * @ordered
	 */
	protected EList<Cell> cell;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected TableImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return MvcmetamodelPackage.Literals.TABLE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public int getNbRow() {
		return nbRow;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setNbRow(int newNbRow) {
		int oldNbRow = nbRow;
		nbRow = newNbRow;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, MvcmetamodelPackage.TABLE__NB_ROW, oldNbRow, nbRow));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public int getNbCol() {
		return nbCol;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setNbCol(int newNbCol) {
		int oldNbCol = nbCol;
		nbCol = newNbCol;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, MvcmetamodelPackage.TABLE__NB_COL, oldNbCol, nbCol));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Cell> getCell() {
		if (cell == null) {
			cell = new EObjectContainmentEList<Cell>(Cell.class, this, MvcmetamodelPackage.TABLE__CELL);
		}
		return cell;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case MvcmetamodelPackage.TABLE__CELL:
				return ((InternalEList<?>)getCell()).basicRemove(otherEnd, msgs);
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
			case MvcmetamodelPackage.TABLE__NB_ROW:
				return getNbRow();
			case MvcmetamodelPackage.TABLE__NB_COL:
				return getNbCol();
			case MvcmetamodelPackage.TABLE__CELL:
				return getCell();
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
			case MvcmetamodelPackage.TABLE__NB_ROW:
				setNbRow((Integer)newValue);
				return;
			case MvcmetamodelPackage.TABLE__NB_COL:
				setNbCol((Integer)newValue);
				return;
			case MvcmetamodelPackage.TABLE__CELL:
				getCell().clear();
				getCell().addAll((Collection<? extends Cell>)newValue);
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
			case MvcmetamodelPackage.TABLE__NB_ROW:
				setNbRow(NB_ROW_EDEFAULT);
				return;
			case MvcmetamodelPackage.TABLE__NB_COL:
				setNbCol(NB_COL_EDEFAULT);
				return;
			case MvcmetamodelPackage.TABLE__CELL:
				getCell().clear();
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
			case MvcmetamodelPackage.TABLE__NB_ROW:
				return nbRow != NB_ROW_EDEFAULT;
			case MvcmetamodelPackage.TABLE__NB_COL:
				return nbCol != NB_COL_EDEFAULT;
			case MvcmetamodelPackage.TABLE__CELL:
				return cell != null && !cell.isEmpty();
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
		result.append(" (nbRow: ");
		result.append(nbRow);
		result.append(", nbCol: ");
		result.append(nbCol);
		result.append(')');
		return result.toString();
	}

} //TableImpl
