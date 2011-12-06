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
 * A representation of the model object '<em><b>Servlet Mapping</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link mvcmetamodel.ServletMapping#getUrlPattern <em>Url Pattern</em>}</li>
 *   <li>{@link mvcmetamodel.ServletMapping#getServlet <em>Servlet</em>}</li>
 * </ul>
 * </p>
 *
 * @see mvcmetamodel.MvcmetamodelPackage#getServletMapping()
 * @model
 * @generated
 */
public interface ServletMapping extends EObject {
	/**
	 * Returns the value of the '<em><b>Url Pattern</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Url Pattern</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Url Pattern</em>' attribute.
	 * @see #setUrlPattern(String)
	 * @see mvcmetamodel.MvcmetamodelPackage#getServletMapping_UrlPattern()
	 * @model
	 * @generated
	 */
	String getUrlPattern();

	/**
	 * Sets the value of the '{@link mvcmetamodel.ServletMapping#getUrlPattern <em>Url Pattern</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Url Pattern</em>' attribute.
	 * @see #getUrlPattern()
	 * @generated
	 */
	void setUrlPattern(String value);

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
	 * @see mvcmetamodel.MvcmetamodelPackage#getServletMapping_Servlet()
	 * @model
	 * @generated
	 */
	Servlet getServlet();

	/**
	 * Sets the value of the '{@link mvcmetamodel.ServletMapping#getServlet <em>Servlet</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Servlet</em>' reference.
	 * @see #getServlet()
	 * @generated
	 */
	void setServlet(Servlet value);

} // ServletMapping
