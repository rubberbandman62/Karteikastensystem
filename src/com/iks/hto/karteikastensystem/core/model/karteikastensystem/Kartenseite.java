/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package com.iks.hto.karteikastensystem.core.model.karteikastensystem;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Kartenseite</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link com.iks.hto.karteikastensystem.core.model.karteikastensystem.Kartenseite#getSprache <em>Sprache</em>}</li>
 *   <li>{@link com.iks.hto.karteikastensystem.core.model.karteikastensystem.Kartenseite#getVokabel <em>Vokabel</em>}</li>
 *   <li>{@link com.iks.hto.karteikastensystem.core.model.karteikastensystem.Kartenseite#getBeispiel <em>Beispiel</em>}</li>
 *   <li>{@link com.iks.hto.karteikastensystem.core.model.karteikastensystem.Kartenseite#getKarte <em>Karte</em>}</li>
 * </ul>
 * </p>
 *
 * @see com.iks.hto.karteikastensystem.core.model.karteikastensystem.KarteikastensystemPackage#getKartenseite()
 * @model
 * @generated
 */
public interface Kartenseite extends EObject {
	/**
	 * Returns the value of the '<em><b>Sprache</b></em>' attribute.
	 * The literals are from the enumeration {@link com.iks.hto.karteikastensystem.core.model.karteikastensystem.Sprache}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Sprache</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Sprache</em>' attribute.
	 * @see com.iks.hto.karteikastensystem.core.model.karteikastensystem.Sprache
	 * @see #setSprache(Sprache)
	 * @see com.iks.hto.karteikastensystem.core.model.karteikastensystem.KarteikastensystemPackage#getKartenseite_Sprache()
	 * @model
	 * @generated
	 */
	Sprache getSprache();

	/**
	 * Sets the value of the '{@link com.iks.hto.karteikastensystem.core.model.karteikastensystem.Kartenseite#getSprache <em>Sprache</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Sprache</em>' attribute.
	 * @see com.iks.hto.karteikastensystem.core.model.karteikastensystem.Sprache
	 * @see #getSprache()
	 * @generated
	 */
	void setSprache(Sprache value);

	/**
	 * Returns the value of the '<em><b>Vokabel</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Vokabel</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Vokabel</em>' attribute.
	 * @see #setVokabel(String)
	 * @see com.iks.hto.karteikastensystem.core.model.karteikastensystem.KarteikastensystemPackage#getKartenseite_Vokabel()
	 * @model
	 * @generated
	 */
	String getVokabel();

	/**
	 * Sets the value of the '{@link com.iks.hto.karteikastensystem.core.model.karteikastensystem.Kartenseite#getVokabel <em>Vokabel</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Vokabel</em>' attribute.
	 * @see #getVokabel()
	 * @generated
	 */
	void setVokabel(String value);

	/**
	 * Returns the value of the '<em><b>Beispiel</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Beispiel</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Beispiel</em>' attribute.
	 * @see #setBeispiel(String)
	 * @see com.iks.hto.karteikastensystem.core.model.karteikastensystem.KarteikastensystemPackage#getKartenseite_Beispiel()
	 * @model
	 * @generated
	 */
	String getBeispiel();

	/**
	 * Sets the value of the '{@link com.iks.hto.karteikastensystem.core.model.karteikastensystem.Kartenseite#getBeispiel <em>Beispiel</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Beispiel</em>' attribute.
	 * @see #getBeispiel()
	 * @generated
	 */
	void setBeispiel(String value);

	/**
	 * Returns the value of the '<em><b>Karte</b></em>' container reference.
	 * It is bidirectional and its opposite is '{@link com.iks.hto.karteikastensystem.core.model.karteikastensystem.Karte#getSeiten <em>Seiten</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Karte</em>' container reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Karte</em>' container reference.
	 * @see #setKarte(Karte)
	 * @see com.iks.hto.karteikastensystem.core.model.karteikastensystem.KarteikastensystemPackage#getKartenseite_Karte()
	 * @see com.iks.hto.karteikastensystem.core.model.karteikastensystem.Karte#getSeiten
	 * @model opposite="seiten" transient="false"
	 * @generated
	 */
	Karte getKarte();

	/**
	 * Sets the value of the '{@link com.iks.hto.karteikastensystem.core.model.karteikastensystem.Kartenseite#getKarte <em>Karte</em>}' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Karte</em>' container reference.
	 * @see #getKarte()
	 * @generated
	 */
	void setKarte(Karte value);

} // Kartenseite
