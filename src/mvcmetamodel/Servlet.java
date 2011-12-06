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
 * A representation of the model object '<em><b>Servlet</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link mvcmetamodel.Servlet#getName <em>Name</em>}</li>
 *   <li>{@link mvcmetamodel.Servlet#getClass_ <em>Class</em>}</li>
 *   <li>{@link mvcmetamodel.Servlet#getLoadOnStartup <em>Load On Startup</em>}</li>
 *   <li>{@link mvcmetamodel.Servlet#getInitParam <em>Init Param</em>}</li>
 * </ul>
 * </p>
 *
 * @see mvcmetamodel.MvcmetamodelPackage#getServlet()
 * @model
 * @generated
 */
public interface Servlet extends EObject {
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
	 * @see mvcmetamodel.MvcmetamodelPackage#getServlet_Name()
	 * @model
	 * @generated
	 */
	String getName();

	/**
	 * Sets the value of the '{@link mvcmetamodel.Servlet#getName <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Name</em>' attribute.
	 * @see #getName()
	 * @generated
	 */
	void setName(String value);

	/**
	 * Returns the value of the '<em><b>Class</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Class</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Class</em>' attribute.
	 * @see #setClass(String)
	 * @see mvcmetamodel.MvcmetamodelPackage#getServlet_Class()
	 * @model
	 * @generated
	 */
	String getClass_();

	/**
	 * Sets the value of the '{@link mvcmetamodel.Servlet#getClass_ <em>Class</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Class</em>' attribute.
	 * @see #getClass_()
	 * @generated
	 */
	void setClass(String value);

	/**
	 * Returns the value of the '<em><b>Load On Startup</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Load On Startup</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Load On Startup</em>' attribute.
	 * @see #setLoadOnStartup(int)
	 * @see mvcmetamodel.MvcmetamodelPackage#getServlet_LoadOnStartup()
	 * @model
	 * @generated
	 */
	int getLoadOnStartup();

	/**
	 * Sets the value of the '{@link mvcmetamodel.Servlet#getLoadOnStartup <em>Load On Startup</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Load On Startup</em>' attribute.
	 * @see #getLoadOnStartup()
	 * @generated
	 */
	void setLoadOnStartup(int value);

	/**
	 * Returns the value of the '<em><b>Init Param</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Init Param</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Init Param</em>' containment reference.
	 * @see #setInitParam(InitParam)
	 * @see mvcmetamodel.MvcmetamodelPackage#getServlet_InitParam()
	 * @model containment="true"
	 * @generated
	 */
	InitParam getInitParam();

	/**
	 * Sets the value of the '{@link mvcmetamodel.Servlet#getInitParam <em>Init Param</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Init Param</em>' containment reference.
	 * @see #getInitParam()
	 * @generated
	 */
	void setInitParam(InitParam value);

} // Servlet
