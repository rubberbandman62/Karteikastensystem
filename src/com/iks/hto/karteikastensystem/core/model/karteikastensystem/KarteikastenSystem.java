/**
* <copyright>
 * </copyright>
 *
 * $Id$
 */
package com.iks.hto.karteikastensystem.core.model.karteikastensystem;

import java.io.OutputStream;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Karteikasten System</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link com.iks.hto.karteikastensystem.core.model.karteikastensystem.KarteikastenSystem#getBenutzer <em>Benutzer</em>}</li>
 *   <li>{@link com.iks.hto.karteikastensystem.core.model.karteikastensystem.KarteikastenSystem#getKarten <em>Karten</em>}</li>
 *   <li>{@link com.iks.hto.karteikastensystem.core.model.karteikastensystem.KarteikastenSystem#getFilePath <em>File Path</em>}</li>
 * </ul>
 * </p>
 *
 * @see com.iks.hto.karteikastensystem.core.model.karteikastensystem.KarteikastensystemPackage#getKarteikastenSystem()
 * @model
 * @generated
 */
public interface KarteikastenSystem extends EObject {
	/**
	 * Returns the value of the '<em><b>Benutzer</b></em>' containment reference list.
	 * The list contents are of type {@link com.iks.hto.karteikastensystem.core.model.karteikastensystem.Person}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Benutzer</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Benutzer</em>' containment reference list.
	 * @see com.iks.hto.karteikastensystem.core.model.karteikastensystem.KarteikastensystemPackage#getKarteikastenSystem_Benutzer()
	 * @model containment="true" keys="name"
	 * @generated
	 */
	EList<Person> getBenutzer();

	/**
	 * Returns the value of the '<em><b>Karten</b></em>' containment reference list.
	 * The list contents are of type {@link com.iks.hto.karteikastensystem.core.model.karteikastensystem.Karte}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Karten</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Karten</em>' containment reference list.
	 * @see com.iks.hto.karteikastensystem.core.model.karteikastensystem.KarteikastensystemPackage#getKarteikastenSystem_Karten()
	 * @model containment="true" keys="id"
	 * @generated
	 */
	EList<Karte> getKarten();

	/**
	 * Returns the value of the '<em><b>File Path</b></em>' attribute.
	 * The default value is <code>""</code>.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>File Path</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>File Path</em>' attribute.
	 * @see #setFilePath(String)
	 * @see com.iks.hto.karteikastensystem.core.model.karteikastensystem.KarteikastensystemPackage#getKarteikastenSystem_FilePath()
	 * @model default=""
	 * @generated
	 */
	String getFilePath();

	/**
	 * Sets the value of the '{@link com.iks.hto.karteikastensystem.core.model.karteikastensystem.KarteikastenSystem#getFilePath <em>File Path</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>File Path</em>' attribute.
	 * @see #getFilePath()
	 * @generated
	 */
	void setFilePath(String value);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model
	 * @generated
	 */
	Person addBenutzer(String name);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model
	 * @generated
	 */
	Karte addKarte(String id);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model
	 */
//	void print(OutputStream out);
//	
//	public boolean save();
//	
//	public boolean saveAs(String filePath);

} // KarteikastenSystem
