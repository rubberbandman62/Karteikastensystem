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
 * A representation of the literals of the enumeration '<em><b>Karteifachtyp</b></em>',
 * and utility methods for working with them.
 * <!-- end-user-doc -->
 * @see com.iks.hto.karteikastensystem.core.model.karteikastensystem.KarteikastensystemPackage#getKarteifachtyp()
 * @model
 * @generated
 */
public enum Karteifachtyp implements Enumerator {
	/**
	 * The '<em><b>Neu</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #NEU_VALUE
	 * @generated
	 * @ordered
	 */
	NEU(0, "neu", "neu"),

	/**
	 * The '<em><b>Gelernt</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #GELERNT_VALUE
	 * @generated
	 * @ordered
	 */
	GELERNT(1, "gelernt", "gelernt"),

	/**
	 * The '<em><b>Bekannt</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #BEKANNT_VALUE
	 * @generated
	 * @ordered
	 */
	BEKANNT(2, "bekannt", "bekannt"),

	/**
	 * The '<em><b>Gesichert</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #GESICHERT_VALUE
	 * @generated
	 * @ordered
	 */
	GESICHERT(3, "gesichert", "gesichert"),

	/**
	 * The '<em><b>Archiviert</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #ARCHIVIERT_VALUE
	 * @generated
	 * @ordered
	 */
	ARCHIVIERT(5, "archiviert", "archiviert");

	/**
	 * The '<em><b>Neu</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Neu</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #NEU
	 * @model name="neu"
	 * @generated
	 * @ordered
	 */
	public static final int NEU_VALUE = 0;

	/**
	 * The '<em><b>Gelernt</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Gelernt</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #GELERNT
	 * @model name="gelernt"
	 * @generated
	 * @ordered
	 */
	public static final int GELERNT_VALUE = 1;

	/**
	 * The '<em><b>Bekannt</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Bekannt</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #BEKANNT
	 * @model name="bekannt"
	 * @generated
	 * @ordered
	 */
	public static final int BEKANNT_VALUE = 2;

	/**
	 * The '<em><b>Gesichert</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Gesichert</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #GESICHERT
	 * @model name="gesichert"
	 * @generated
	 * @ordered
	 */
	public static final int GESICHERT_VALUE = 3;

	/**
	 * The '<em><b>Archiviert</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Archiviert</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #ARCHIVIERT
	 * @model name="archiviert"
	 * @generated
	 * @ordered
	 */
	public static final int ARCHIVIERT_VALUE = 5;

	/**
	 * An array of all the '<em><b>Karteifachtyp</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static final Karteifachtyp[] VALUES_ARRAY =
		new Karteifachtyp[] {
			NEU,
			GELERNT,
			BEKANNT,
			GESICHERT,
			ARCHIVIERT,
		};

	/**
	 * A public read-only list of all the '<em><b>Karteifachtyp</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final List<Karteifachtyp> VALUES = Collections.unmodifiableList(Arrays.asList(VALUES_ARRAY));

	/**
	 * Returns the '<em><b>Karteifachtyp</b></em>' literal with the specified literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static Karteifachtyp get(String literal) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			Karteifachtyp result = VALUES_ARRAY[i];
			if (result.toString().equals(literal)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>Karteifachtyp</b></em>' literal with the specified name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static Karteifachtyp getByName(String name) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			Karteifachtyp result = VALUES_ARRAY[i];
			if (result.getName().equals(name)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>Karteifachtyp</b></em>' literal with the specified integer value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static Karteifachtyp get(int value) {
		switch (value) {
			case NEU_VALUE: return NEU;
			case GELERNT_VALUE: return GELERNT;
			case BEKANNT_VALUE: return BEKANNT;
			case GESICHERT_VALUE: return GESICHERT;
			case ARCHIVIERT_VALUE: return ARCHIVIERT;
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
	private Karteifachtyp(int value, String name, String literal) {
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
	
} //Karteifachtyp
