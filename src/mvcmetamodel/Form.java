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
 * A representation of the model object '<em><b>Form</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link mvcmetamodel.Form#getName <em>Name</em>}</li>
 *   <li>{@link mvcmetamodel.Form#getMethod <em>Method</em>}</li>
 *   <li>{@link mvcmetamodel.Form#getAction <em>Action</em>}</li>
 *   <li>{@link mvcmetamodel.Form#getComponent <em>Component</em>}</li>
 *   <li>{@link mvcmetamodel.Form#getButtonForm <em>Button Form</em>}</li>
 *   <li>{@link mvcmetamodel.Form#getServlet <em>Servlet</em>}</li>
 * </ul>
 * </p>
 *
 * @see mvcmetamodel.MvcmetamodelPackage#getForm()
 * @model
 * @generated
 */
public interface Form extends EObject {
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
	 * @see mvcmetamodel.MvcmetamodelPackage#getForm_Name()
	 * @model
	 * @generated
	 */
	String getName();

	/**
	 * Sets the value of the '{@link mvcmetamodel.Form#getName <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Name</em>' attribute.
	 * @see #getName()
	 * @generated
	 */
	void setName(String value);

	/**
	 * Returns the value of the '<em><b>Method</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Method</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Method</em>' attribute.
	 * @see #setMethod(String)
	 * @see mvcmetamodel.MvcmetamodelPackage#getForm_Method()
	 * @model
	 * @generated
	 */
	String getMethod();

	/**
	 * Sets the value of the '{@link mvcmetamodel.Form#getMethod <em>Method</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Method</em>' attribute.
	 * @see #getMethod()
	 * @generated
	 */
	void setMethod(String value);

	/**
	 * Returns the value of the '<em><b>Action</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Action</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Action</em>' attribute.
	 * @see #setAction(String)
	 * @see mvcmetamodel.MvcmetamodelPackage#getForm_Action()
	 * @model
	 * @generated
	 */
	String getAction();

	/**
	 * Sets the value of the '{@link mvcmetamodel.Form#getAction <em>Action</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Action</em>' attribute.
	 * @see #getAction()
	 * @generated
	 */
	void setAction(String value);

	/**
	 * Returns the value of the '<em><b>Component</b></em>' containment reference list.
	 * The list contents are of type {@link mvcmetamodel.Component}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Component</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Component</em>' containment reference list.
	 * @see mvcmetamodel.MvcmetamodelPackage#getForm_Component()
	 * @model type="mvcmetamodel.Component" containment="true"
	 * @generated
	 */
	EList getComponent();

	/**
	 * Returns the value of the '<em><b>Button Form</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Button Form</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Button Form</em>' containment reference.
	 * @see #setButtonForm(Input)
	 * @see mvcmetamodel.MvcmetamodelPackage#getForm_ButtonForm()
	 * @model containment="true"
	 * @generated
	 */
	Input getButtonForm();

	/**
	 * Sets the value of the '{@link mvcmetamodel.Form#getButtonForm <em>Button Form</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Button Form</em>' containment reference.
	 * @see #getButtonForm()
	 * @generated
	 */
	void setButtonForm(Input value);

	/**
	 * Returns the value of the '<em><b>Servlet</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Servlet</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Servlet</em>' reference.
	 * @see #setServlet(Servlet)
	 * @see mvcmetamodel.MvcmetamodelPackage#getForm_Servlet()
	 * @model
	 * @generated
	 */
	Servlet getServlet();

	/**
	 * Sets the value of the '{@link mvcmetamodel.Form#getServlet <em>Servlet</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Servlet</em>' reference.
	 * @see #getServlet()
	 * @generated
	 */
	void setServlet(Servlet value);

} // Form
