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
 * A representation of the model object '<em><b>Karte</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link com.iks.hto.karteikastensystem.core.model.karteikastensystem.Karte#getSeiten <em>Seiten</em>}</li>
 *   <li>{@link com.iks.hto.karteikastensystem.core.model.karteikastensystem.Karte#getId <em>Id</em>}</li>
 *   <li>{@link com.iks.hto.karteikastensystem.core.model.karteikastensystem.Karte#getAnzahlGewusstInFolge <em>Anzahl Gewusst In Folge</em>}</li>
 * </ul>
 * </p>
 *
 * @see com.iks.hto.karteikastensystem.core.model.karteikastensystem.KarteikastensystemPackage#getKarte()
 * @model
 * @generated
 */
public interface Karte extends EObject {
	/**
	 * Returns the value of the '<em><b>Seiten</b></em>' containment reference list.
	 * The list contents are of type {@link com.iks.hto.karteikastensystem.core.model.karteikastensystem.Kartenseite}.
	 * It is bidirectional and its opposite is '{@link com.iks.hto.karteikastensystem.core.model.karteikastensystem.Kartenseite#getKarte <em>Karte</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Seiten</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Seiten</em>' containment reference list.
	 * @see com.iks.hto.karteikastensystem.core.model.karteikastensystem.KarteikastensystemPackage#getKarte_Seiten()
	 * @see com.iks.hto.karteikastensystem.core.model.karteikastensystem.Kartenseite#getKarte
	 * @model opposite="karte" containment="true" required="true" upper="2"
	 * @generated
	 */
	EList<Kartenseite> getSeiten();

	/**
	 * Returns the value of the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Id</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Id</em>' attribute.
	 * @see #setId(String)
	 * @see com.iks.hto.karteikastensystem.core.model.karteikastensystem.KarteikastensystemPackage#getKarte_Id()
	 * @model
	 * @generated
	 */
	String getId();

	/**
	 * Sets the value of the '{@link com.iks.hto.karteikastensystem.core.model.karteikastensystem.Karte#getId <em>Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Id</em>' attribute.
	 * @see #getId()
	 * @generated
	 */
	void setId(String value);

	/**
	 * Returns the value of the '<em><b>Anzahl Gewusst In Folge</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Anzahl Gewusst In Folge</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Anzahl Gewusst In Folge</em>' attribute.
	 * @see #setAnzahlGewusstInFolge(int)
	 * @see com.iks.hto.karteikastensystem.core.model.karteikastensystem.KarteikastensystemPackage#getKarte_AnzahlGewusstInFolge()
	 * @model
	 * @generated
	 */
	int getAnzahlGewusstInFolge();

	/**
	 * Sets the value of the '{@link com.iks.hto.karteikastensystem.core.model.karteikastensystem.Karte#getAnzahlGewusstInFolge <em>Anzahl Gewusst In Folge</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Anzahl Gewusst In Folge</em>' attribute.
	 * @see #getAnzahlGewusstInFolge()
	 * @generated
	 */
	void setAnzahlGewusstInFolge(int value);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model
	 * @generated
	 */
	Kartenseite beschrifteSeite(Sprache sprache, String vokabel, String beispiel);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model
	 * @generated
	 */
	Kartenseite getSeite(Sprache sprache);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model
	 * @generated
	 */
	Kartenseite addSeite(Sprache sprache);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Eine Vokabel wurde bei der Abfrage gewusst. Zurückgegeben wird die Anzahl der der in Folge gewussten Versuche.
	 * <!-- end-model-doc -->
	 * @model
	 * @generated
	 */
	int richtig();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Eine Vokabel wurde bei der Abfragenicht gewusst. Zurückgegeben wird 0.
	 * <!-- end-model-doc -->
	 * @model
	 * @generated
	 */
	int falsch();

} // Karte
