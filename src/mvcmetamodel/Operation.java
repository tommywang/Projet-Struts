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

import org.eclipse.emf.common.util.Enumerator;

/**
 * <!-- begin-user-doc -->
 * A representation of the literals of the enumeration '<em><b>Operation</b></em>',
 * and utility methods for working with them.
 * <!-- end-user-doc -->
 * @see mvcmetamodel.MvcmetamodelPackage#getOperation()
 * @model
 * @generated
 */
public enum Operation implements Enumerator {
	/**
	 * The '<em><b>ADD</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #ADD_VALUE
	 * @generated
	 * @ordered
	 */
	ADD(0, "ADD", "ADD"),

	/**
	 * The '<em><b>REMOVE</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #REMOVE_VALUE
	 * @generated
	 * @ordered
	 */
	REMOVE(1, "REMOVE", "REMOVE"),

	/**
	 * The '<em><b>SEARCH</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #SEARCH_VALUE
	 * @generated
	 * @ordered
	 */
	SEARCH(2, "SEARCH", "SEARCH"),

	/**
	 * The '<em><b>UPDATE</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #UPDATE_VALUE
	 * @generated
	 * @ordered
	 */
	UPDATE(3, "UPDATE", "UPDATE");

	/**
	 * The '<em><b>ADD</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>ADD</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #ADD
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int ADD_VALUE = 0;

	/**
	 * The '<em><b>REMOVE</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>REMOVE</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #REMOVE
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int REMOVE_VALUE = 1;

	/**
	 * The '<em><b>SEARCH</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>SEARCH</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #SEARCH
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int SEARCH_VALUE = 2;

	/**
	 * The '<em><b>UPDATE</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>UPDATE</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #UPDATE
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int UPDATE_VALUE = 3;

	/**
	 * An array of all the '<em><b>Operation</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static final Operation[] VALUES_ARRAY =
		new Operation[] {
			ADD,
			REMOVE,
			SEARCH,
			UPDATE,
		};

	/**
	 * A public read-only list of all the '<em><b>Operation</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final List<Operation> VALUES = Collections.unmodifiableList(Arrays.asList(VALUES_ARRAY));

	/**
	 * Returns the '<em><b>Operation</b></em>' literal with the specified literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static Operation get(String literal) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			Operation result = VALUES_ARRAY[i];
			if (result.toString().equals(literal)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>Operation</b></em>' literal with the specified name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static Operation getByName(String name) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			Operation result = VALUES_ARRAY[i];
			if (result.getName().equals(name)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>Operation</b></em>' literal with the specified integer value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static Operation get(int value) {
		switch (value) {
			case ADD_VALUE: return ADD;
			case REMOVE_VALUE: return REMOVE;
			case SEARCH_VALUE: return SEARCH;
			case UPDATE_VALUE: return UPDATE;
		}
		return null;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private final int value;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private final String name;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private final String literal;

	/**
	 * Only this class can construct instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private Operation(int value, String name, String literal) {
		this.value = value;
		this.name = name;
		this.literal = literal;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public int getValue() {
	  return value;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getName() {
	  return name;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getLiteral() {
	  return literal;
	}

	/**
	 * Returns the literal value of the enumerator, which is its string representation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String toString() {
		return literal;
	}
	
} //Operation
