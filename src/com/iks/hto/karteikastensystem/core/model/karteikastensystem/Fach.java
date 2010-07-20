/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package com.iks.hto.karteikastensystem.core.model.karteikastensystem;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Fach</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link com.iks.hto.karteikastensystem.core.model.karteikastensystem.Fach#getTyp <em>Typ</em>}</li>
 *   <li>{@link com.iks.hto.karteikastensystem.core.model.karteikastensystem.Fach#getKarten <em>Karten</em>}</li>
 *   <li>{@link com.iks.hto.karteikastensystem.core.model.karteikastensystem.Fach#getKarteikasten <em>Karteikasten</em>}</li>
 *   <li>{@link com.iks.hto.karteikastensystem.core.model.karteikastensystem.Fach#getAnzahlKarten <em>Anzahl Karten</em>}</li>
 *   <li>{@link com.iks.hto.karteikastensystem.core.model.karteikastensystem.Fach#getAnzahlUnbekannt <em>Anzahl Unbekannt</em>}</li>
 * </ul>
 * </p>
 *
 * @see com.iks.hto.karteikastensystem.core.model.karteikastensystem.KarteikastensystemPackage#getFach()
 * @model
 * @generated
 */
public interface Fach extends EObject {
	/**
	 * Returns the value of the '<em><b>Typ</b></em>' attribute.
	 * The literals are from the enumeration {@link com.iks.hto.karteikastensystem.core.model.karteikastensystem.Karteifachtyp}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Typ</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Typ</em>' attribute.
	 * @see com.iks.hto.karteikastensystem.core.model.karteikastensystem.Karteifachtyp
	 * @see #setTyp(Karteifachtyp)
	 * @see com.iks.hto.karteikastensystem.core.model.karteikastensystem.KarteikastensystemPackage#getFach_Typ()
	 * @model
	 * @generated
	 */
	Karteifachtyp getTyp();

	/**
	 * Sets the value of the '{@link com.iks.hto.karteikastensystem.core.model.karteikastensystem.Fach#getTyp <em>Typ</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Typ</em>' attribute.
	 * @see com.iks.hto.karteikastensystem.core.model.karteikastensystem.Karteifachtyp
	 * @see #getTyp()
	 * @generated
	 */
	void setTyp(Karteifachtyp value);

	/**
	 * Returns the value of the '<em><b>Karten</b></em>' reference list.
	 * The list contents are of type {@link com.iks.hto.karteikastensystem.core.model.karteikastensystem.Karte}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Karten</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Karten</em>' reference list.
	 * @see com.iks.hto.karteikastensystem.core.model.karteikastensystem.KarteikastensystemPackage#getFach_Karten()
	 * @model
	 * @generated
	 */
	EList<Karte> getKarten();

	/**
	 * Returns the value of the '<em><b>Karteikasten</b></em>' container reference.
	 * It is bidirectional and its opposite is '{@link com.iks.hto.karteikastensystem.core.model.karteikastensystem.Karteikasten#getFaecher <em>Faecher</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Karteikasten</em>' container reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Karteikasten</em>' container reference.
	 * @see #setKarteikasten(Karteikasten)
	 * @see com.iks.hto.karteikastensystem.core.model.karteikastensystem.KarteikastensystemPackage#getFach_Karteikasten()
	 * @see com.iks.hto.karteikastensystem.core.model.karteikastensystem.Karteikasten#getFaecher
	 * @model opposite="faecher" required="true" transient="false"
	 * @generated
	 */
	Karteikasten getKarteikasten();

	/**
	 * Sets the value of the '{@link com.iks.hto.karteikastensystem.core.model.karteikastensystem.Fach#getKarteikasten <em>Karteikasten</em>}' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Karteikasten</em>' container reference.
	 * @see #getKarteikasten()
	 * @generated
	 */
	void setKarteikasten(Karteikasten value);

	/**
	 * Returns the value of the '<em><b>Anzahl Karten</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Anzahl Karten</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Anzahl Karten</em>' attribute.
	 * @see com.iks.hto.karteikastensystem.core.model.karteikastensystem.KarteikastensystemPackage#getFach_AnzahlKarten()
	 * @model unique="false" transient="true" changeable="false" volatile="true" derived="true" ordered="false"
	 * @generated
	 */
	int getAnzahlKarten();

	/**
	 * Returns the value of the '<em><b>Anzahl Unbekannt</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Anzahl Unbekannt</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Anzahl Unbekannt</em>' attribute.
	 * @see com.iks.hto.karteikastensystem.core.model.karteikastensystem.KarteikastensystemPackage#getFach_AnzahlUnbekannt()
	 * @model transient="true" changeable="false" volatile="true" derived="true"
	 * @generated
	 */
	int getAnzahlUnbekannt();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model
	 * @generated
	 */
	void addKarte(Karte karte);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model
	 * @generated
	 */
	boolean removeKarte(Karte karte);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model kind="operation"
	 * @generated
	 */
	Karte getNextKarte();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model
	 * @generated
	 */
	int getAnzahlKartenInFolgeGewusst(int inFolgeGewusst);

} // Fach
