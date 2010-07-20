/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package com.iks.hto.karteikastensystem.core.model.karteikastensystem;

import org.eclipse.emf.ecore.EFactory;

/**
 * <!-- begin-user-doc -->
 * The <b>Factory</b> for the model.
 * It provides a create method for each non-abstract class of the model.
 * <!-- end-user-doc -->
 * @see com.iks.hto.karteikastensystem.core.model.karteikastensystem.KarteikastensystemPackage
 * @generated
 */
public interface KarteikastensystemFactory extends EFactory {
	/**
	 * The singleton instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	KarteikastensystemFactory eINSTANCE = com.iks.hto.karteikastensystem.core.model.karteikastensystem.impl.KarteikastensystemFactoryImpl.init();

	/**
	 * Returns a new object of class '<em>Karteikasten System</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Karteikasten System</em>'.
	 * @generated
	 */
	KarteikastenSystem createKarteikastenSystem();

	/**
	 * Returns a new object of class '<em>Person</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Person</em>'.
	 * @generated
	 */
	Person createPerson();

	/**
	 * Returns a new object of class '<em>Karteikasten</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Karteikasten</em>'.
	 * @generated
	 */
	Karteikasten createKarteikasten();

	/**
	 * Returns a new object of class '<em>Fach</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Fach</em>'.
	 * @generated
	 */
	Fach createFach();

	/**
	 * Returns a new object of class '<em>Karte</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Karte</em>'.
	 * @generated
	 */
	Karte createKarte();

	/**
	 * Returns a new object of class '<em>Kartenseite</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Kartenseite</em>'.
	 * @generated
	 */
	Kartenseite createKartenseite();

	/**
	 * Returns the package supported by this factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the package supported by this factory.
	 * @generated
	 */
	KarteikastensystemPackage getKarteikastensystemPackage();

} //KarteikastensystemFactory
