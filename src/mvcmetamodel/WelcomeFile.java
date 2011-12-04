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
 * A representation of the model object '<em><b>Welcome File</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link mvcmetamodel.WelcomeFile#getPageName <em>Page Name</em>}</li>
 * </ul>
 * </p>
 *
 * @see mvcmetamodel.MvcmetamodelPackage#getWelcomeFile()
 * @model
 * @generated
 */
public interface WelcomeFile extends EObject {
	/**
	 * Returns the value of the '<em><b>Page Name</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Page Name</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Page Name</em>' reference.
	 * @see #setPageName(Page)
	 * @see mvcmetamodel.MvcmetamodelPackage#getWelcomeFile_PageName()
	 * @model
	 * @generated
	 */
	Page getPageName();

	/**
	 * Sets the value of the '{@link mvcmetamodel.WelcomeFile#getPageName <em>Page Name</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Page Name</em>' reference.
	 * @see #getPageName()
	 * @generated
	 */
	void setPageName(Page value);

} // WelcomeFile
