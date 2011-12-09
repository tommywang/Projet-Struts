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
 * A representation of the model object '<em><b>Head</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link mvcmetamodel.Head#getComponents <em>Components</em>}</li>
 *   <li>{@link mvcmetamodel.Head#getHeadTitle <em>Head Title</em>}</li>
 * </ul>
 * </p>
 *
 * @see mvcmetamodel.MvcmetamodelPackage#getHead()
 * @model
 * @generated
 */
public interface Head extends EObject {
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
	 * @see mvcmetamodel.MvcmetamodelPackage#getHead_Components()
	 * @model containment="true"
	 * @generated
	 */
	EList<Component> getComponents();

	/**
	 * Returns the value of the '<em><b>Head Title</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Head Title</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Head Title</em>' containment reference.
	 * @see #setHeadTitle(HeadTitle)
	 * @see mvcmetamodel.MvcmetamodelPackage#getHead_HeadTitle()
	 * @model containment="true" required="true"
	 * @generated
	 */
	HeadTitle getHeadTitle();

	/**
	 * Sets the value of the '{@link mvcmetamodel.Head#getHeadTitle <em>Head Title</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Head Title</em>' containment reference.
	 * @see #getHeadTitle()
	 * @generated
	 */
	void setHeadTitle(HeadTitle value);

} // Head
