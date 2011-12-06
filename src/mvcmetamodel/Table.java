/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package mvcmetamodel;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Table</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link mvcmetamodel.Table#getNbRow <em>Nb Row</em>}</li>
 *   <li>{@link mvcmetamodel.Table#getNbCol <em>Nb Col</em>}</li>
 *   <li>{@link mvcmetamodel.Table#getCell <em>Cell</em>}</li>
 * </ul>
 * </p>
 *
 * @see mvcmetamodel.MvcmetamodelPackage#getTable()
 * @model
 * @generated
 */
public interface Table extends Component {
	/**
	 * Returns the value of the '<em><b>Nb Row</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Nb Row</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Nb Row</em>' attribute.
	 * @see #setNbRow(int)
	 * @see mvcmetamodel.MvcmetamodelPackage#getTable_NbRow()
	 * @model
	 * @generated
	 */
	int getNbRow();

	/**
	 * Sets the value of the '{@link mvcmetamodel.Table#getNbRow <em>Nb Row</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Nb Row</em>' attribute.
	 * @see #getNbRow()
	 * @generated
	 */
	void setNbRow(int value);

	/**
	 * Returns the value of the '<em><b>Nb Col</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Nb Col</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Nb Col</em>' attribute.
	 * @see #setNbCol(int)
	 * @see mvcmetamodel.MvcmetamodelPackage#getTable_NbCol()
	 * @model
	 * @generated
	 */
	int getNbCol();

	/**
	 * Sets the value of the '{@link mvcmetamodel.Table#getNbCol <em>Nb Col</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Nb Col</em>' attribute.
	 * @see #getNbCol()
	 * @generated
	 */
	void setNbCol(int value);

	/**
	 * Returns the value of the '<em><b>Cell</b></em>' containment reference list.
	 * The list contents are of type {@link mvcmetamodel.Cell}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Cell</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Cell</em>' containment reference list.
	 * @see mvcmetamodel.MvcmetamodelPackage#getTable_Cell()
	 * @model containment="true"
	 * @generated
	 */
	EList<Cell> getCell();

} // Table
