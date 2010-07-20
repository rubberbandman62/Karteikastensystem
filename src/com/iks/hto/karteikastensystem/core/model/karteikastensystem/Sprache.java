/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package com.iks.hto.karteikastensystem.core.model.karteikastensystem;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

import org.eclipse.emf.common.util.Enumerator;

/**
 * <!-- begin-user-doc -->
 * A representation of the literals of the enumeration '<em><b>Sprache</b></em>',
 * and utility methods for working with them.
 * <!-- end-user-doc -->
 * @see com.iks.hto.karteikastensystem.core.model.karteikastensystem.KarteikastensystemPackage#getSprache()
 * @model
 * @generated
 */
public enum Sprache implements Enumerator {
	/**
	 * The '<em><b>Deutsch</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #DEUTSCH_VALUE
	 * @generated
	 * @ordered
	 */
	DEUTSCH(0, "deutsch", "deutsch"),

	/**
	 * The '<em><b>Englisch</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #ENGLISCH_VALUE
	 * @generated
	 * @ordered
	 */
	ENGLISCH(1, "englisch", "englisch"),

	/**
	 * The '<em><b>Spanisch</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #SPANISCH_VALUE
	 * @generated
	 * @ordered
	 */
	SPANISCH(2, "spanisch", "spanisch"),

	/**
	 * The '<em><b>Franzoesisch</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #FRANZOESISCH_VALUE
	 * @generated
	 * @ordered
	 */
	FRANZOESISCH(3, "franzoesisch", "franzoesisch");

	/**
	 * The '<em><b>Deutsch</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Deutsch</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #DEUTSCH
	 * @model name="deutsch"
	 * @generated
	 * @ordered
	 */
	public static final int DEUTSCH_VALUE = 0;

	/**
	 * The '<em><b>Englisch</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Englisch</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #ENGLISCH
	 * @model name="englisch"
	 * @generated
	 * @ordered
	 */
	public static final int ENGLISCH_VALUE = 1;

	/**
	 * The '<em><b>Spanisch</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Spanisch</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #SPANISCH
	 * @model name="spanisch"
	 * @generated
	 * @ordered
	 */
	public static final int SPANISCH_VALUE = 2;

	/**
	 * The '<em><b>Franzoesisch</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Franzoesisch</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #FRANZOESISCH
	 * @model name="franzoesisch"
	 * @generated
	 * @ordered
	 */
	public static final int FRANZOESISCH_VALUE = 3;

	/**
	 * An array of all the '<em><b>Sprache</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static final Sprache[] VALUES_ARRAY =
		new Sprache[] {
			DEUTSCH,
			ENGLISCH,
			SPANISCH,
			FRANZOESISCH,
		};

	/**
	 * A public read-only list of all the '<em><b>Sprache</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final List<Sprache> VALUES = Collections.unmodifiableList(Arrays.asList(VALUES_ARRAY));

	/**
	 * Returns the '<em><b>Sprache</b></em>' literal with the specified literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static Sprache get(String literal) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			Sprache result = VALUES_ARRAY[i];
			if (result.toString().equals(literal)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>Sprache</b></em>' literal with the specified name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static Sprache getByName(String name) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			Sprache result = VALUES_ARRAY[i];
			if (result.getName().equals(name)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>Sprache</b></em>' literal with the specified integer value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static Sprache get(int value) {
		switch (value) {
			case DEUTSCH_VALUE: return DEUTSCH;
			case ENGLISCH_VALUE: return ENGLISCH;
			case SPANISCH_VALUE: return SPANISCH;
			case FRANZOESISCH_VALUE: return FRANZOESISCH;
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
	private Sprache(int value, String name, String literal) {
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
	
} //Sprache
