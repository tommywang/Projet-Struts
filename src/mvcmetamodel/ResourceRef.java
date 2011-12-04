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
 * A representation of the model object '<em><b>Resource Ref</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link mvcmetamodel.ResourceRef#getResRefName <em>Res Ref Name</em>}</li>
 *   <li>{@link mvcmetamodel.ResourceRef#getDescription <em>Description</em>}</li>
 *   <li>{@link mvcmetamodel.ResourceRef#getResType <em>Res Type</em>}</li>
 *   <li>{@link mvcmetamodel.ResourceRef#getResAuth <em>Res Auth</em>}</li>
 * </ul>
 * </p>
 *
 * @see mvcmetamodel.MvcmetamodelPackage#getResourceRef()
 * @model
 * @generated
 */
public interface ResourceRef extends EObject {
	/**
	 * Returns the value of the '<em><b>Res Ref Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Res Ref Name</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Res Ref Name</em>' attribute.
	 * @see #setResRefName(String)
	 * @see mvcmetamodel.MvcmetamodelPackage#getResourceRef_ResRefName()
	 * @model
	 * @generated
	 */
	String getResRefName();

	/**
	 * Sets the value of the '{@link mvcmetamodel.ResourceRef#getResRefName <em>Res Ref Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Res Ref Name</em>' attribute.
	 * @see #getResRefName()
	 * @generated
	 */
	void setResRefName(String value);

	/**
	 * Returns the value of the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Description</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Description</em>' attribute.
	 * @see #setDescription(String)
	 * @see mvcmetamodel.MvcmetamodelPackage#getResourceRef_Description()
	 * @model
	 * @generated
	 */
	String getDescription();

	/**
	 * Sets the value of the '{@link mvcmetamodel.ResourceRef#getDescription <em>Description</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Description</em>' attribute.
	 * @see #getDescription()
	 * @generated
	 */
	void setDescription(String value);

	/**
	 * Returns the value of the '<em><b>Res Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Res Type</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Res Type</em>' attribute.
	 * @see #setResType(String)
	 * @see mvcmetamodel.MvcmetamodelPackage#getResourceRef_ResType()
	 * @model
	 * @generated
	 */
	String getResType();

	/**
	 * Sets the value of the '{@link mvcmetamodel.ResourceRef#getResType <em>Res Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Res Type</em>' attribute.
	 * @see #getResType()
	 * @generated
	 */
	void setResType(String value);

	/**
	 * Returns the value of the '<em><b>Res Auth</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Res Auth</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Res Auth</em>' attribute.
	 * @see #setResAuth(String)
	 * @see mvcmetamodel.MvcmetamodelPackage#getResourceRef_ResAuth()
	 * @model
	 * @generated
	 */
	String getResAuth();

	/**
	 * Sets the value of the '{@link mvcmetamodel.ResourceRef#getResAuth <em>Res Auth</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Res Auth</em>' attribute.
	 * @see #getResAuth()
	 * @generated
	 */
	void setResAuth(String value);

} // ResourceRef
