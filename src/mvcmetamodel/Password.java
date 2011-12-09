/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package mvcmetamodel;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Password</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link mvcmetamodel.Password#getName <em>Name</em>}</li>
 *   <li>{@link mvcmetamodel.Password#getSize <em>Size</em>}</li>
 *   <li>{@link mvcmetamodel.Password#getMaxLength <em>Max Length</em>}</li>
 *   <li>{@link mvcmetamodel.Password#getErrorPassword <em>Error Password</em>}</li>
 * </ul>
 * </p>
 *
 * @see mvcmetamodel.MvcmetamodelPackage#getPassword()
 * @model
 * @generated
 */
public interface Password extends Input {

	/**
	 * Returns the value of the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Name</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Name</em>' attribute.
	 * @see #setName(String)
	 * @see mvcmetamodel.MvcmetamodelPackage#getPassword_Name()
	 * @model
	 * @generated
	 */
	String getName();

	/**
	 * Sets the value of the '{@link mvcmetamodel.Password#getName <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Name</em>' attribute.
	 * @see #getName()
	 * @generated
	 */
	void setName(String value);

	/**
	 * Returns the value of the '<em><b>Size</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Size</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Size</em>' attribute.
	 * @see #setSize(int)
	 * @see mvcmetamodel.MvcmetamodelPackage#getPassword_Size()
	 * @model
	 * @generated
	 */
	int getSize();

	/**
	 * Sets the value of the '{@link mvcmetamodel.Password#getSize <em>Size</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Size</em>' attribute.
	 * @see #getSize()
	 * @generated
	 */
	void setSize(int value);

	/**
	 * Returns the value of the '<em><b>Max Length</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Max Length</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Max Length</em>' attribute.
	 * @see #setMaxLength(int)
	 * @see mvcmetamodel.MvcmetamodelPackage#getPassword_MaxLength()
	 * @model
	 * @generated
	 */
	int getMaxLength();

	/**
	 * Sets the value of the '{@link mvcmetamodel.Password#getMaxLength <em>Max Length</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Max Length</em>' attribute.
	 * @see #getMaxLength()
	 * @generated
	 */
	void setMaxLength(int value);

	/**
	 * Returns the value of the '<em><b>Error Password</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Error Password</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Error Password</em>' containment reference.
	 * @see #setErrorPassword(TextLabel)
	 * @see mvcmetamodel.MvcmetamodelPackage#getPassword_ErrorPassword()
	 * @model containment="true" required="true"
	 * @generated
	 */
	TextLabel getErrorPassword();

	/**
	 * Sets the value of the '{@link mvcmetamodel.Password#getErrorPassword <em>Error Password</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Error Password</em>' containment reference.
	 * @see #getErrorPassword()
	 * @generated
	 */
	void setErrorPassword(TextLabel value);
} // Password
