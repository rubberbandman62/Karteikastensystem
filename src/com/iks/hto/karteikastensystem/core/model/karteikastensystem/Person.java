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
 * A representation of the model object '<em><b>Person</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link com.iks.hto.karteikastensystem.core.model.karteikastensystem.Person#getName <em>Name</em>}</li>
 *   <li>{@link com.iks.hto.karteikastensystem.core.model.karteikastensystem.Person#getKarteikaesten <em>Karteikaesten</em>}</li>
 *   <li>{@link com.iks.hto.karteikastensystem.core.model.karteikastensystem.Person#getNickName <em>Nick Name</em>}</li>
 * </ul>
 * </p>
 *
 * @see com.iks.hto.karteikastensystem.core.model.karteikastensystem.KarteikastensystemPackage#getPerson()
 * @model
 * @generated
 */
public interface Person extends EObject {
	/**
	 * Returns the value of the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Name</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Name</em>' attribute.
	 * @see #setName(String)
	 * @see com.iks.hto.karteikastensystem.core.model.karteikastensystem.KarteikastensystemPackage#getPerson_Name()
	 * @model
	 * @generated
	 */
	String getName();

	/**
	 * Sets the value of the '{@link com.iks.hto.karteikastensystem.core.model.karteikastensystem.Person#getName <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Name</em>' attribute.
	 * @see #getName()
	 * @generated
	 */
	void setName(String value);

	/**
	 * Returns the value of the '<em><b>Karteikaesten</b></em>' containment reference list.
	 * The list contents are of type {@link com.iks.hto.karteikastensystem.core.model.karteikastensystem.Karteikasten}.
	 * It is bidirectional and its opposite is '{@link com.iks.hto.karteikastensystem.core.model.karteikastensystem.Karteikasten#getPerson <em>Person</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Karteikaesten</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Karteikaesten</em>' containment reference list.
	 * @see com.iks.hto.karteikastensystem.core.model.karteikastensystem.KarteikastensystemPackage#getPerson_Karteikaesten()
	 * @see com.iks.hto.karteikastensystem.core.model.karteikastensystem.Karteikasten#getPerson
	 * @model opposite="person" containment="true" upper="12"
	 * @generated
	 */
	EList<Karteikasten> getKarteikaesten();

	/**
	 * Returns the value of the '<em><b>Nick Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Nick Name</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Nick Name</em>' attribute.
	 * @see #setNickName(String)
	 * @see com.iks.hto.karteikastensystem.core.model.karteikastensystem.KarteikastensystemPackage#getPerson_NickName()
	 * @model
	 * @generated
	 */
	String getNickName();

	/**
	 * Sets the value of the '{@link com.iks.hto.karteikastensystem.core.model.karteikastensystem.Person#getNickName <em>Nick Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Nick Name</em>' attribute.
	 * @see #getNickName()
	 * @generated
	 */
	void setNickName(String value);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model
	 * @generated
	 */
	Karteikasten getKarteikasten(Sprache von, Sprache nach);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model
	 * @generated
	 */
	Karteikasten addKarteikasten(Sprache von, Sprache nach);

} // Person
