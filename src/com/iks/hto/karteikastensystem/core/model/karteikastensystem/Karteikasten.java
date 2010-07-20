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
 * A representation of the model object '<em><b>Karteikasten</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link com.iks.hto.karteikastensystem.core.model.karteikastensystem.Karteikasten#getVonSprache <em>Von Sprache</em>}</li>
 *   <li>{@link com.iks.hto.karteikastensystem.core.model.karteikastensystem.Karteikasten#getNachSprache <em>Nach Sprache</em>}</li>
 *   <li>{@link com.iks.hto.karteikastensystem.core.model.karteikastensystem.Karteikasten#getFaecher <em>Faecher</em>}</li>
 *   <li>{@link com.iks.hto.karteikastensystem.core.model.karteikastensystem.Karteikasten#getPerson <em>Person</em>}</li>
 * </ul>
 * </p>
 *
 * @see com.iks.hto.karteikastensystem.core.model.karteikastensystem.KarteikastensystemPackage#getKarteikasten()
 * @model
 * @generated
 */
public interface Karteikasten extends EObject {
	/**
	 * Returns the value of the '<em><b>Von Sprache</b></em>' attribute.
	 * The literals are from the enumeration {@link com.iks.hto.karteikastensystem.core.model.karteikastensystem.Sprache}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Von Sprache</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Von Sprache</em>' attribute.
	 * @see com.iks.hto.karteikastensystem.core.model.karteikastensystem.Sprache
	 * @see #setVonSprache(Sprache)
	 * @see com.iks.hto.karteikastensystem.core.model.karteikastensystem.KarteikastensystemPackage#getKarteikasten_VonSprache()
	 * @model
	 * @generated
	 */
	Sprache getVonSprache();

	/**
	 * Sets the value of the '{@link com.iks.hto.karteikastensystem.core.model.karteikastensystem.Karteikasten#getVonSprache <em>Von Sprache</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Von Sprache</em>' attribute.
	 * @see com.iks.hto.karteikastensystem.core.model.karteikastensystem.Sprache
	 * @see #getVonSprache()
	 * @generated
	 */
	void setVonSprache(Sprache value);

	/**
	 * Returns the value of the '<em><b>Nach Sprache</b></em>' attribute.
	 * The literals are from the enumeration {@link com.iks.hto.karteikastensystem.core.model.karteikastensystem.Sprache}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Nach Sprache</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Nach Sprache</em>' attribute.
	 * @see com.iks.hto.karteikastensystem.core.model.karteikastensystem.Sprache
	 * @see #setNachSprache(Sprache)
	 * @see com.iks.hto.karteikastensystem.core.model.karteikastensystem.KarteikastensystemPackage#getKarteikasten_NachSprache()
	 * @model
	 * @generated
	 */
	Sprache getNachSprache();

	/**
	 * Sets the value of the '{@link com.iks.hto.karteikastensystem.core.model.karteikastensystem.Karteikasten#getNachSprache <em>Nach Sprache</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Nach Sprache</em>' attribute.
	 * @see com.iks.hto.karteikastensystem.core.model.karteikastensystem.Sprache
	 * @see #getNachSprache()
	 * @generated
	 */
	void setNachSprache(Sprache value);

	/**
	 * Returns the value of the '<em><b>Faecher</b></em>' containment reference list.
	 * The list contents are of type {@link com.iks.hto.karteikastensystem.core.model.karteikastensystem.Fach}.
	 * It is bidirectional and its opposite is '{@link com.iks.hto.karteikastensystem.core.model.karteikastensystem.Fach#getKarteikasten <em>Karteikasten</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Faecher</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Faecher</em>' containment reference list.
	 * @see com.iks.hto.karteikastensystem.core.model.karteikastensystem.KarteikastensystemPackage#getKarteikasten_Faecher()
	 * @see com.iks.hto.karteikastensystem.core.model.karteikastensystem.Fach#getKarteikasten
	 * @model opposite="karteikasten" containment="true" lower="5" upper="5"
	 * @generated
	 */
	EList<Fach> getFaecher();

	/**
	 * Returns the value of the '<em><b>Person</b></em>' container reference.
	 * It is bidirectional and its opposite is '{@link com.iks.hto.karteikastensystem.core.model.karteikastensystem.Person#getKarteikaesten <em>Karteikaesten</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Person</em>' container reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Person</em>' container reference.
	 * @see #setPerson(Person)
	 * @see com.iks.hto.karteikastensystem.core.model.karteikastensystem.KarteikastensystemPackage#getKarteikasten_Person()
	 * @see com.iks.hto.karteikastensystem.core.model.karteikastensystem.Person#getKarteikaesten
	 * @model opposite="karteikaesten" required="true" transient="false"
	 * @generated
	 */
	Person getPerson();

	/**
	 * Sets the value of the '{@link com.iks.hto.karteikastensystem.core.model.karteikastensystem.Karteikasten#getPerson <em>Person</em>}' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Person</em>' container reference.
	 * @see #getPerson()
	 * @generated
	 */
	void setPerson(Person value);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model
	 * @generated
	 */
	Fach getFach(Karteifachtyp typ);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model
	 * @generated
	 */
	Fach addFach(Karteifachtyp typ);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model
	 * @generated
	 */
	boolean moveKarteUp(Fach fromFach, Karte karte);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model
	 * @generated
	 */
	boolean moveKarteDown(Fach fach, Karte karte);

} // Karteikasten
