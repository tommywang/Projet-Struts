/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package mvcmetamodel;

import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Cell</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link mvcmetamodel.Cell#getComponents <em>Components</em>}</li>
 *   <li>{@link mvcmetamodel.Cell#getAlign <em>Align</em>}</li>
 *   <li>{@link mvcmetamodel.Cell#getColspan <em>Colspan</em>}</li>
 * </ul>
 * </p>
 *
 * @see mvcmetamodel.MvcmetamodelPackage#getCell()
 * @model
 * @generated
 */
public interface Cell extends EObject {
	/**
	 * Returns the value of the '<em><b>Components</b></em>' containment reference list.
	 * The list contents are of type {@link mvcmetamodel.Component}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Components</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Components</em>' containment reference list.
	 * @see mvcmetamodel.MvcmetamodelPackage#getCell_Components()
	 * @model containment="true"
	 * @generated
	 */
	EList<Component> getComponents();

	/**
	 * Returns the value of the '<em><b>Align</b></em>' attribute.
	 * The literals are from the enumeration {@link mvcmetamodel.Align}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Align</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Align</em>' attribute.
	 * @see mvcmetamodel.Align
	 * @see #setAlign(Align)
	 * @see mvcmetamodel.MvcmetamodelPackage#getCell_Align()
	 * @model
	 * @generated
	 */
	Align getAlign();

	/**
	 * Sets the value of the '{@link mvcmetamodel.Cell#getAlign <em>Align</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Align</em>' attribute.
	 * @see mvcmetamodel.Align
	 * @see #getAlign()
	 * @generated
	 */
	void setAlign(Align value);

	/**
	 * Returns the value of the '<em><b>Colspan</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Colspan</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Colspan</em>' attribute.
	 * @see #setColspan(int)
	 * @see mvcmetamodel.MvcmetamodelPackage#getCell_Colspan()
	 * @model
	 * @generated
	 */
	int getColspan();

	/**
	 * Sets the value of the '{@link mvcmetamodel.Cell#getColspan <em>Colspan</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Colspan</em>' attribute.
	 * @see #getColspan()
	 * @generated
	 */
	void setColspan(int value);

} // Cell
