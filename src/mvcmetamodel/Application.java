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
 * A representation of the model object '<em><b>Application</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link mvcmetamodel.Application#getWebxml <em>Webxml</em>}</li>
 *   <li>{@link mvcmetamodel.Application#getResources <em>Resources</em>}</li>
 *   <li>{@link mvcmetamodel.Application#getName <em>Name</em>}</li>
 *   <li>{@link mvcmetamodel.Application#getPage <em>Page</em>}</li>
 * </ul>
 * </p>
 *
 * @see mvcmetamodel.MvcmetamodelPackage#getApplication()
 * @model
 * @generated
 */
public interface Application extends EObject {
	/**
	 * Returns the value of the '<em><b>Page</b></em>' containment reference list.
	 * The list contents are of type {@link mvcmetamodel.Page}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Page</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Page</em>' containment reference list.
	 * @see mvcmetamodel.MvcmetamodelPackage#getApplication_Page()
	 * @model type="mvcmetamodel.Page" containment="true"
	 * @generated
	 */
	EList getPage();

	/**
	 * Returns the value of the '<em><b>Webxml</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Webxml</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Webxml</em>' containment reference.
	 * @see #setWebxml(WebXML)
	 * @see mvcmetamodel.MvcmetamodelPackage#getApplication_Webxml()
	 * @model containment="true" required="true"
	 * @generated
	 */
	WebXML getWebxml();

	/**
	 * Sets the value of the '{@link mvcmetamodel.Application#getWebxml <em>Webxml</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Webxml</em>' containment reference.
	 * @see #getWebxml()
	 * @generated
	 */
	void setWebxml(WebXML value);

	/**
	 * Returns the value of the '<em><b>Resources</b></em>' containment reference list.
	 * The list contents are of type {@link mvcmetamodel.Resources}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Resources</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Resources</em>' containment reference list.
	 * @see mvcmetamodel.MvcmetamodelPackage#getApplication_Resources()
	 * @model type="mvcmetamodel.Resources" containment="true"
	 * @generated
	 */
	EList getResources();

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
	 * @see mvcmetamodel.MvcmetamodelPackage#getApplication_Name()
	 * @model
	 * @generated
	 */
	String getName();

	/**
	 * Sets the value of the '{@link mvcmetamodel.Application#getName <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Name</em>' attribute.
	 * @see #getName()
	 * @generated
	 */
	void setName(String value);

} // Application
