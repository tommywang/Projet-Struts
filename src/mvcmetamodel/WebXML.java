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
 * A representation of the model object '<em><b>Web XML</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link mvcmetamodel.WebXML#getServletMapping <em>Servlet Mapping</em>}</li>
 *   <li>{@link mvcmetamodel.WebXML#getResourceRef <em>Resource Ref</em>}</li>
 *   <li>{@link mvcmetamodel.WebXML#getServlet <em>Servlet</em>}</li>
 *   <li>{@link mvcmetamodel.WebXML#getWelcomeFileList <em>Welcome File List</em>}</li>
 *   <li>{@link mvcmetamodel.WebXML#getName <em>Name</em>}</li>
 * </ul>
 * </p>
 *
 * @see mvcmetamodel.MvcmetamodelPackage#getWebXML()
 * @model
 * @generated
 */
public interface WebXML extends EObject {
	/**
	 * Returns the value of the '<em><b>Servlet Mapping</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Servlet Mapping</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Servlet Mapping</em>' containment reference.
	 * @see #setServletMapping(ServletMapping)
	 * @see mvcmetamodel.MvcmetamodelPackage#getWebXML_ServletMapping()
	 * @model containment="true"
	 * @generated
	 */
	ServletMapping getServletMapping();

	/**
	 * Sets the value of the '{@link mvcmetamodel.WebXML#getServletMapping <em>Servlet Mapping</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Servlet Mapping</em>' containment reference.
	 * @see #getServletMapping()
	 * @generated
	 */
	void setServletMapping(ServletMapping value);

	/**
	 * Returns the value of the '<em><b>Resource Ref</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Resource Ref</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Resource Ref</em>' containment reference.
	 * @see #setResourceRef(ResourceRef)
	 * @see mvcmetamodel.MvcmetamodelPackage#getWebXML_ResourceRef()
	 * @model containment="true"
	 * @generated
	 */
	ResourceRef getResourceRef();

	/**
	 * Sets the value of the '{@link mvcmetamodel.WebXML#getResourceRef <em>Resource Ref</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Resource Ref</em>' containment reference.
	 * @see #getResourceRef()
	 * @generated
	 */
	void setResourceRef(ResourceRef value);

	/**
	 * Returns the value of the '<em><b>Servlet</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Servlet</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Servlet</em>' containment reference.
	 * @see #setServlet(Servlet)
	 * @see mvcmetamodel.MvcmetamodelPackage#getWebXML_Servlet()
	 * @model containment="true"
	 * @generated
	 */
	Servlet getServlet();

	/**
	 * Sets the value of the '{@link mvcmetamodel.WebXML#getServlet <em>Servlet</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Servlet</em>' containment reference.
	 * @see #getServlet()
	 * @generated
	 */
	void setServlet(Servlet value);

	/**
	 * Returns the value of the '<em><b>Welcome File List</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Welcome File List</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Welcome File List</em>' containment reference.
	 * @see #setWelcomeFileList(WelcomeFileList)
	 * @see mvcmetamodel.MvcmetamodelPackage#getWebXML_WelcomeFileList()
	 * @model containment="true" required="true"
	 * @generated
	 */
	WelcomeFileList getWelcomeFileList();

	/**
	 * Sets the value of the '{@link mvcmetamodel.WebXML#getWelcomeFileList <em>Welcome File List</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Welcome File List</em>' containment reference.
	 * @see #getWelcomeFileList()
	 * @generated
	 */
	void setWelcomeFileList(WelcomeFileList value);

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
	 * @see mvcmetamodel.MvcmetamodelPackage#getWebXML_Name()
	 * @model
	 * @generated
	 */
	String getName();

	/**
	 * Sets the value of the '{@link mvcmetamodel.WebXML#getName <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Name</em>' attribute.
	 * @see #getName()
	 * @generated
	 */
	void setName(String value);

} // WebXML
