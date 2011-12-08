/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package mvcmetamodel;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Submit Button</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link mvcmetamodel.SubmitButton#getValue <em>Value</em>}</li>
 *   <li>{@link mvcmetamodel.SubmitButton#getSuccessTarget <em>Success Target</em>}</li>
 *   <li>{@link mvcmetamodel.SubmitButton#getErrorTarget <em>Error Target</em>}</li>
 * </ul>
 * </p>
 *
 * @see mvcmetamodel.MvcmetamodelPackage#getSubmitButton()
 * @model
 * @generated
 */
public interface SubmitButton extends Input {
	/**
	 * Returns the value of the '<em><b>Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Value</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Value</em>' attribute.
	 * @see #setValue(String)
	 * @see mvcmetamodel.MvcmetamodelPackage#getSubmitButton_Value()
	 * @model
	 * @generated
	 */
	String getValue();

	/**
	 * Sets the value of the '{@link mvcmetamodel.SubmitButton#getValue <em>Value</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Value</em>' attribute.
	 * @see #getValue()
	 * @generated
	 */
	void setValue(String value);

	/**
	 * Returns the value of the '<em><b>Success Target</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Success Target</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Success Target</em>' attribute.
	 * @see #setSuccessTarget(String)
	 * @see mvcmetamodel.MvcmetamodelPackage#getSubmitButton_SuccessTarget()
	 * @model
	 * @generated
	 */
	String getSuccessTarget();

	/**
	 * Sets the value of the '{@link mvcmetamodel.SubmitButton#getSuccessTarget <em>Success Target</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Success Target</em>' attribute.
	 * @see #getSuccessTarget()
	 * @generated
	 */
	void setSuccessTarget(String value);

	/**
	 * Returns the value of the '<em><b>Error Target</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Error Target</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Error Target</em>' attribute.
	 * @see #setErrorTarget(String)
	 * @see mvcmetamodel.MvcmetamodelPackage#getSubmitButton_ErrorTarget()
	 * @model
	 * @generated
	 */
	String getErrorTarget();

	/**
	 * Sets the value of the '{@link mvcmetamodel.SubmitButton#getErrorTarget <em>Error Target</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Error Target</em>' attribute.
	 * @see #getErrorTarget()
	 * @generated
	 */
	void setErrorTarget(String value);

} // SubmitButton
