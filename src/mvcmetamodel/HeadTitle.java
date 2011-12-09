/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package mvcmetamodel;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Head Title</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link mvcmetamodel.HeadTitle#getText <em>Text</em>}</li>
 * </ul>
 * </p>
 *
 * @see mvcmetamodel.MvcmetamodelPackage#getHeadTitle()
 * @model
 * @generated
 */
public interface HeadTitle extends EObject {
	/**
	 * Returns the value of the '<em><b>Text</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Text</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Text</em>' containment reference.
	 * @see #setText(TextLabel)
	 * @see mvcmetamodel.MvcmetamodelPackage#getHeadTitle_Text()
	 * @model containment="true" required="true"
	 * @generated
	 */
	TextLabel getText();

	/**
	 * Sets the value of the '{@link mvcmetamodel.HeadTitle#getText <em>Text</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Text</em>' containment reference.
	 * @see #getText()
	 * @generated
	 */
	void setText(TextLabel value);

} // HeadTitle
