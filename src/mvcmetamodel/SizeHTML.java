/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package mvcmetamodel;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

import org.eclipse.emf.common.util.AbstractEnumerator;

/**
 * <!-- begin-user-doc -->
 * A representation of the literals of the enumeration '<em><b>Size HTML</b></em>',
 * and utility methods for working with them.
 * <!-- end-user-doc -->
 * @see mvcmetamodel.MvcmetamodelPackage#getSizeHTML()
 * @model
 * @generated
 */
public final class SizeHTML extends AbstractEnumerator {
	/**
	 * The '<em><b>BIG</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>BIG</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #BIG_LITERAL
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int BIG = 0;

	/**
	 * The '<em><b>NORMAL</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>NORMAL</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #NORMAL_LITERAL
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int NORMAL = 1;

	/**
	 * The '<em><b>SMALL</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>SMALL</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #SMALL_LITERAL
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int SMALL = 2;

	/**
	 * The '<em><b>TINY</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>TINY</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #TINY_LITERAL
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int TINY = 3;

	/**
	 * The '<em><b>HUGE</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>HUGE</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #HUGE_LITERAL
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int HUGE = 4;

	/**
	 * The '<em><b>BIG</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #BIG
	 * @generated
	 * @ordered
	 */
	public static final SizeHTML BIG_LITERAL = new SizeHTML(BIG, "BIG", "BIG");

	/**
	 * The '<em><b>NORMAL</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #NORMAL
	 * @generated
	 * @ordered
	 */
	public static final SizeHTML NORMAL_LITERAL = new SizeHTML(NORMAL, "NORMAL", "NORMAL");

	/**
	 * The '<em><b>SMALL</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #SMALL
	 * @generated
	 * @ordered
	 */
	public static final SizeHTML SMALL_LITERAL = new SizeHTML(SMALL, "SMALL", "SMALL");

	/**
	 * The '<em><b>TINY</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #TINY
	 * @generated
	 * @ordered
	 */
	public static final SizeHTML TINY_LITERAL = new SizeHTML(TINY, "TINY", "TINY");

	/**
	 * The '<em><b>HUGE</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #HUGE
	 * @generated
	 * @ordered
	 */
	public static final SizeHTML HUGE_LITERAL = new SizeHTML(HUGE, "HUGE", "HUGE");

	/**
	 * An array of all the '<em><b>Size HTML</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static final SizeHTML[] VALUES_ARRAY =
		new SizeHTML[] {
			BIG_LITERAL,
			NORMAL_LITERAL,
			SMALL_LITERAL,
			TINY_LITERAL,
			HUGE_LITERAL,
		};

	/**
	 * A public read-only list of all the '<em><b>Size HTML</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final List VALUES = Collections.unmodifiableList(Arrays.asList(VALUES_ARRAY));

	/**
	 * Returns the '<em><b>Size HTML</b></em>' literal with the specified literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static SizeHTML get(String literal) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			SizeHTML result = VALUES_ARRAY[i];
			if (result.toString().equals(literal)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>Size HTML</b></em>' literal with the specified name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static SizeHTML getByName(String name) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			SizeHTML result = VALUES_ARRAY[i];
			if (result.getName().equals(name)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>Size HTML</b></em>' literal with the specified integer value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static SizeHTML get(int value) {
		switch (value) {
			case BIG: return BIG_LITERAL;
			case NORMAL: return NORMAL_LITERAL;
			case SMALL: return SMALL_LITERAL;
			case TINY: return TINY_LITERAL;
			case HUGE: return HUGE_LITERAL;
		}
		return null;
	}

	/**
	 * Only this class can construct instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private SizeHTML(int value, String name, String literal) {
		super(value, name, literal);
	}

} //SizeHTML
