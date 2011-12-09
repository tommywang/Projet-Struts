/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package mvcmetamodel;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Link</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link mvcmetamodel.Link#getPageName <em>Page Name</em>}</li>
 *   <li>{@link mvcmetamodel.Link#getPageType <em>Page Type</em>}</li>
 * </ul>
 * </p>
 *
 * @see mvcmetamodel.MvcmetamodelPackage#getLink()
 * @model
 * @generated
 */
public interface Link extends Container {
	/**
	 * Returns the value of the '<em><b>Page Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Page Name</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Page Name</em>' attribute.
	 * @see #setPageName(String)
	 * @see mvcmetamodel.MvcmetamodelPackage#getLink_PageName()
	 * @model
	 * @generated
	 */
	String getPageName();

	/**
	 * Sets the value of the '{@link mvcmetamodel.Link#getPageName <em>Page Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Page Name</em>' attribute.
	 * @see #getPageName()
	 * @generated
	 */
	void setPageName(String value);

	/**
	 * Returns the value of the '<em><b>Page Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Page Type</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Page Type</em>' attribute.
	 * @see #setPageType(String)
	 * @see mvcmetamodel.MvcmetamodelPackage#getLink_PageType()
	 * @model
	 * @generated
	 */
	String getPageType();

	/**
	 * Sets the value of the '{@link mvcmetamodel.Link#getPageType <em>Page Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Page Type</em>' attribute.
	 * @see #getPageType()
	 * @generated
	 */
	void setPageType(String value);

} // Link
