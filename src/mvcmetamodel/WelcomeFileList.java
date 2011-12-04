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
 * A representation of the model object '<em><b>Welcome File List</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link mvcmetamodel.WelcomeFileList#getWelcomeFile <em>Welcome File</em>}</li>
 * </ul>
 * </p>
 *
 * @see mvcmetamodel.MvcmetamodelPackage#getWelcomeFileList()
 * @model
 * @generated
 */
public interface WelcomeFileList extends EObject {
	/**
	 * Returns the value of the '<em><b>Welcome File</b></em>' containment reference list.
	 * The list contents are of type {@link mvcmetamodel.WelcomeFile}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Welcome File</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Welcome File</em>' containment reference list.
	 * @see mvcmetamodel.MvcmetamodelPackage#getWelcomeFileList_WelcomeFile()
	 * @model type="mvcmetamodel.WelcomeFile" containment="true" required="true"
	 * @generated
	 */
	EList getWelcomeFile();

} // WelcomeFileList
