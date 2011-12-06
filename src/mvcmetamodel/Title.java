/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package mvcmetamodel;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Title</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link mvcmetamodel.Title#getSize <em>Size</em>}</li>
 * </ul>
 * </p>
 *
 * @see mvcmetamodel.MvcmetamodelPackage#getTitle()
 * @model
 * @generated
 */
public interface Title extends Component {
	/**
	 * Returns the value of the '<em><b>Size</b></em>' attribute.
	 * The literals are from the enumeration {@link mvcmetamodel.Size}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Size</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Size</em>' attribute.
	 * @see mvcmetamodel.Size
	 * @see #setSize(Size)
	 * @see mvcmetamodel.MvcmetamodelPackage#getTitle_Size()
	 * @model
	 * @generated
	 */
	Size getSize();

	/**
	 * Sets the value of the '{@link mvcmetamodel.Title#getSize <em>Size</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Size</em>' attribute.
	 * @see mvcmetamodel.Size
	 * @see #getSize()
	 * @generated
	 */
	void setSize(Size value);

} // Title
