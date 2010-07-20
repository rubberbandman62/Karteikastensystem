/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package com.iks.hto.karteikastensystem.core.model.karteikastensystem;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EEnum;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

/**
 * <!-- begin-user-doc -->
 * The <b>Package</b> for the model.
 * It contains accessors for the meta objects to represent
 * <ul>
 *   <li>each class,</li>
 *   <li>each feature of each class,</li>
 *   <li>each enum,</li>
 *   <li>and each data type</li>
 * </ul>
 * <!-- end-user-doc -->
 * @see com.iks.hto.karteikastensystem.core.model.karteikastensystem.KarteikastensystemFactory
 * @model kind="package"
 * @generated
 */
public interface KarteikastensystemPackage extends EPackage {
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "karteikastensystem";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "http://www.iks-gmbh.com/hto/karteikastensystem/1.0.0";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "kks";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	KarteikastensystemPackage eINSTANCE = com.iks.hto.karteikastensystem.core.model.karteikastensystem.impl.KarteikastensystemPackageImpl.init();

	/**
	 * The meta object id for the '{@link com.iks.hto.karteikastensystem.core.model.karteikastensystem.impl.KarteikastenSystemImpl <em>Karteikasten System</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see com.iks.hto.karteikastensystem.core.model.karteikastensystem.impl.KarteikastenSystemImpl
	 * @see com.iks.hto.karteikastensystem.core.model.karteikastensystem.impl.KarteikastensystemPackageImpl#getKarteikastenSystem()
	 * @generated
	 */
	int KARTEIKASTEN_SYSTEM = 0;

	/**
	 * The feature id for the '<em><b>Benutzer</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int KARTEIKASTEN_SYSTEM__BENUTZER = 0;

	/**
	 * The feature id for the '<em><b>Karten</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int KARTEIKASTEN_SYSTEM__KARTEN = 1;

	/**
	 * The feature id for the '<em><b>File Path</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int KARTEIKASTEN_SYSTEM__FILE_PATH = 2;

	/**
	 * The number of structural features of the '<em>Karteikasten System</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int KARTEIKASTEN_SYSTEM_FEATURE_COUNT = 3;

	/**
	 * The meta object id for the '{@link com.iks.hto.karteikastensystem.core.model.karteikastensystem.impl.PersonImpl <em>Person</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see com.iks.hto.karteikastensystem.core.model.karteikastensystem.impl.PersonImpl
	 * @see com.iks.hto.karteikastensystem.core.model.karteikastensystem.impl.KarteikastensystemPackageImpl#getPerson()
	 * @generated
	 */
	int PERSON = 1;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PERSON__NAME = 0;

	/**
	 * The feature id for the '<em><b>Karteikaesten</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PERSON__KARTEIKAESTEN = 1;

	/**
	 * The feature id for the '<em><b>Nick Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PERSON__NICK_NAME = 2;

	/**
	 * The number of structural features of the '<em>Person</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PERSON_FEATURE_COUNT = 3;

	/**
	 * The meta object id for the '{@link com.iks.hto.karteikastensystem.core.model.karteikastensystem.impl.KarteikastenImpl <em>Karteikasten</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see com.iks.hto.karteikastensystem.core.model.karteikastensystem.impl.KarteikastenImpl
	 * @see com.iks.hto.karteikastensystem.core.model.karteikastensystem.impl.KarteikastensystemPackageImpl#getKarteikasten()
	 * @generated
	 */
	int KARTEIKASTEN = 2;

	/**
	 * The feature id for the '<em><b>Von Sprache</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int KARTEIKASTEN__VON_SPRACHE = 0;

	/**
	 * The feature id for the '<em><b>Nach Sprache</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int KARTEIKASTEN__NACH_SPRACHE = 1;

	/**
	 * The feature id for the '<em><b>Faecher</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int KARTEIKASTEN__FAECHER = 2;

	/**
	 * The feature id for the '<em><b>Person</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int KARTEIKASTEN__PERSON = 3;

	/**
	 * The number of structural features of the '<em>Karteikasten</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int KARTEIKASTEN_FEATURE_COUNT = 4;

	/**
	 * The meta object id for the '{@link com.iks.hto.karteikastensystem.core.model.karteikastensystem.impl.FachImpl <em>Fach</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see com.iks.hto.karteikastensystem.core.model.karteikastensystem.impl.FachImpl
	 * @see com.iks.hto.karteikastensystem.core.model.karteikastensystem.impl.KarteikastensystemPackageImpl#getFach()
	 * @generated
	 */
	int FACH = 3;

	/**
	 * The feature id for the '<em><b>Typ</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FACH__TYP = 0;

	/**
	 * The feature id for the '<em><b>Karten</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FACH__KARTEN = 1;

	/**
	 * The feature id for the '<em><b>Karteikasten</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FACH__KARTEIKASTEN = 2;

	/**
	 * The feature id for the '<em><b>Anzahl Karten</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FACH__ANZAHL_KARTEN = 3;

	/**
	 * The feature id for the '<em><b>Anzahl Unbekannt</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FACH__ANZAHL_UNBEKANNT = 4;

	/**
	 * The number of structural features of the '<em>Fach</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FACH_FEATURE_COUNT = 5;

	/**
	 * The meta object id for the '{@link com.iks.hto.karteikastensystem.core.model.karteikastensystem.impl.KarteImpl <em>Karte</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see com.iks.hto.karteikastensystem.core.model.karteikastensystem.impl.KarteImpl
	 * @see com.iks.hto.karteikastensystem.core.model.karteikastensystem.impl.KarteikastensystemPackageImpl#getKarte()
	 * @generated
	 */
	int KARTE = 4;

	/**
	 * The feature id for the '<em><b>Seiten</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int KARTE__SEITEN = 0;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int KARTE__ID = 1;

	/**
	 * The feature id for the '<em><b>Anzahl Gewusst In Folge</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int KARTE__ANZAHL_GEWUSST_IN_FOLGE = 2;

	/**
	 * The number of structural features of the '<em>Karte</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int KARTE_FEATURE_COUNT = 3;

	/**
	 * The meta object id for the '{@link com.iks.hto.karteikastensystem.core.model.karteikastensystem.impl.KartenseiteImpl <em>Kartenseite</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see com.iks.hto.karteikastensystem.core.model.karteikastensystem.impl.KartenseiteImpl
	 * @see com.iks.hto.karteikastensystem.core.model.karteikastensystem.impl.KarteikastensystemPackageImpl#getKartenseite()
	 * @generated
	 */
	int KARTENSEITE = 5;

	/**
	 * The feature id for the '<em><b>Sprache</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int KARTENSEITE__SPRACHE = 0;

	/**
	 * The feature id for the '<em><b>Vokabel</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int KARTENSEITE__VOKABEL = 1;

	/**
	 * The feature id for the '<em><b>Beispiel</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int KARTENSEITE__BEISPIEL = 2;

	/**
	 * The feature id for the '<em><b>Karte</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int KARTENSEITE__KARTE = 3;

	/**
	 * The number of structural features of the '<em>Kartenseite</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int KARTENSEITE_FEATURE_COUNT = 4;

	/**
	 * The meta object id for the '{@link com.iks.hto.karteikastensystem.core.model.karteikastensystem.Sprache <em>Sprache</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see com.iks.hto.karteikastensystem.core.model.karteikastensystem.Sprache
	 * @see com.iks.hto.karteikastensystem.core.model.karteikastensystem.impl.KarteikastensystemPackageImpl#getSprache()
	 * @generated
	 */
	int SPRACHE = 6;

	/**
	 * The meta object id for the '{@link com.iks.hto.karteikastensystem.core.model.karteikastensystem.Karteifachtyp <em>Karteifachtyp</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see com.iks.hto.karteikastensystem.core.model.karteikastensystem.Karteifachtyp
	 * @see com.iks.hto.karteikastensystem.core.model.karteikastensystem.impl.KarteikastensystemPackageImpl#getKarteifachtyp()
	 * @generated
	 */
	int KARTEIFACHTYP = 7;


	/**
	 * Returns the meta object for class '{@link com.iks.hto.karteikastensystem.core.model.karteikastensystem.KarteikastenSystem <em>Karteikasten System</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Karteikasten System</em>'.
	 * @see com.iks.hto.karteikastensystem.core.model.karteikastensystem.KarteikastenSystem
	 * @generated
	 */
	EClass getKarteikastenSystem();

	/**
	 * Returns the meta object for the containment reference list '{@link com.iks.hto.karteikastensystem.core.model.karteikastensystem.KarteikastenSystem#getBenutzer <em>Benutzer</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Benutzer</em>'.
	 * @see com.iks.hto.karteikastensystem.core.model.karteikastensystem.KarteikastenSystem#getBenutzer()
	 * @see #getKarteikastenSystem()
	 * @generated
	 */
	EReference getKarteikastenSystem_Benutzer();

	/**
	 * Returns the meta object for the containment reference list '{@link com.iks.hto.karteikastensystem.core.model.karteikastensystem.KarteikastenSystem#getKarten <em>Karten</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Karten</em>'.
	 * @see com.iks.hto.karteikastensystem.core.model.karteikastensystem.KarteikastenSystem#getKarten()
	 * @see #getKarteikastenSystem()
	 * @generated
	 */
	EReference getKarteikastenSystem_Karten();

	/**
	 * Returns the meta object for the attribute '{@link com.iks.hto.karteikastensystem.core.model.karteikastensystem.KarteikastenSystem#getFilePath <em>File Path</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>File Path</em>'.
	 * @see com.iks.hto.karteikastensystem.core.model.karteikastensystem.KarteikastenSystem#getFilePath()
	 * @see #getKarteikastenSystem()
	 * @generated
	 */
	EAttribute getKarteikastenSystem_FilePath();

	/**
	 * Returns the meta object for class '{@link com.iks.hto.karteikastensystem.core.model.karteikastensystem.Person <em>Person</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Person</em>'.
	 * @see com.iks.hto.karteikastensystem.core.model.karteikastensystem.Person
	 * @generated
	 */
	EClass getPerson();

	/**
	 * Returns the meta object for the attribute '{@link com.iks.hto.karteikastensystem.core.model.karteikastensystem.Person#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see com.iks.hto.karteikastensystem.core.model.karteikastensystem.Person#getName()
	 * @see #getPerson()
	 * @generated
	 */
	EAttribute getPerson_Name();

	/**
	 * Returns the meta object for the containment reference list '{@link com.iks.hto.karteikastensystem.core.model.karteikastensystem.Person#getKarteikaesten <em>Karteikaesten</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Karteikaesten</em>'.
	 * @see com.iks.hto.karteikastensystem.core.model.karteikastensystem.Person#getKarteikaesten()
	 * @see #getPerson()
	 * @generated
	 */
	EReference getPerson_Karteikaesten();

	/**
	 * Returns the meta object for the attribute '{@link com.iks.hto.karteikastensystem.core.model.karteikastensystem.Person#getNickName <em>Nick Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Nick Name</em>'.
	 * @see com.iks.hto.karteikastensystem.core.model.karteikastensystem.Person#getNickName()
	 * @see #getPerson()
	 * @generated
	 */
	EAttribute getPerson_NickName();

	/**
	 * Returns the meta object for class '{@link com.iks.hto.karteikastensystem.core.model.karteikastensystem.Karteikasten <em>Karteikasten</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Karteikasten</em>'.
	 * @see com.iks.hto.karteikastensystem.core.model.karteikastensystem.Karteikasten
	 * @generated
	 */
	EClass getKarteikasten();

	/**
	 * Returns the meta object for the attribute '{@link com.iks.hto.karteikastensystem.core.model.karteikastensystem.Karteikasten#getVonSprache <em>Von Sprache</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Von Sprache</em>'.
	 * @see com.iks.hto.karteikastensystem.core.model.karteikastensystem.Karteikasten#getVonSprache()
	 * @see #getKarteikasten()
	 * @generated
	 */
	EAttribute getKarteikasten_VonSprache();

	/**
	 * Returns the meta object for the attribute '{@link com.iks.hto.karteikastensystem.core.model.karteikastensystem.Karteikasten#getNachSprache <em>Nach Sprache</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Nach Sprache</em>'.
	 * @see com.iks.hto.karteikastensystem.core.model.karteikastensystem.Karteikasten#getNachSprache()
	 * @see #getKarteikasten()
	 * @generated
	 */
	EAttribute getKarteikasten_NachSprache();

	/**
	 * Returns the meta object for the containment reference list '{@link com.iks.hto.karteikastensystem.core.model.karteikastensystem.Karteikasten#getFaecher <em>Faecher</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Faecher</em>'.
	 * @see com.iks.hto.karteikastensystem.core.model.karteikastensystem.Karteikasten#getFaecher()
	 * @see #getKarteikasten()
	 * @generated
	 */
	EReference getKarteikasten_Faecher();

	/**
	 * Returns the meta object for the container reference '{@link com.iks.hto.karteikastensystem.core.model.karteikastensystem.Karteikasten#getPerson <em>Person</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the container reference '<em>Person</em>'.
	 * @see com.iks.hto.karteikastensystem.core.model.karteikastensystem.Karteikasten#getPerson()
	 * @see #getKarteikasten()
	 * @generated
	 */
	EReference getKarteikasten_Person();

	/**
	 * Returns the meta object for class '{@link com.iks.hto.karteikastensystem.core.model.karteikastensystem.Fach <em>Fach</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Fach</em>'.
	 * @see com.iks.hto.karteikastensystem.core.model.karteikastensystem.Fach
	 * @generated
	 */
	EClass getFach();

	/**
	 * Returns the meta object for the attribute '{@link com.iks.hto.karteikastensystem.core.model.karteikastensystem.Fach#getTyp <em>Typ</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Typ</em>'.
	 * @see com.iks.hto.karteikastensystem.core.model.karteikastensystem.Fach#getTyp()
	 * @see #getFach()
	 * @generated
	 */
	EAttribute getFach_Typ();

	/**
	 * Returns the meta object for the reference list '{@link com.iks.hto.karteikastensystem.core.model.karteikastensystem.Fach#getKarten <em>Karten</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Karten</em>'.
	 * @see com.iks.hto.karteikastensystem.core.model.karteikastensystem.Fach#getKarten()
	 * @see #getFach()
	 * @generated
	 */
	EReference getFach_Karten();

	/**
	 * Returns the meta object for the container reference '{@link com.iks.hto.karteikastensystem.core.model.karteikastensystem.Fach#getKarteikasten <em>Karteikasten</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the container reference '<em>Karteikasten</em>'.
	 * @see com.iks.hto.karteikastensystem.core.model.karteikastensystem.Fach#getKarteikasten()
	 * @see #getFach()
	 * @generated
	 */
	EReference getFach_Karteikasten();

	/**
	 * Returns the meta object for the attribute '{@link com.iks.hto.karteikastensystem.core.model.karteikastensystem.Fach#getAnzahlKarten <em>Anzahl Karten</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Anzahl Karten</em>'.
	 * @see com.iks.hto.karteikastensystem.core.model.karteikastensystem.Fach#getAnzahlKarten()
	 * @see #getFach()
	 * @generated
	 */
	EAttribute getFach_AnzahlKarten();

	/**
	 * Returns the meta object for the attribute '{@link com.iks.hto.karteikastensystem.core.model.karteikastensystem.Fach#getAnzahlUnbekannt <em>Anzahl Unbekannt</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Anzahl Unbekannt</em>'.
	 * @see com.iks.hto.karteikastensystem.core.model.karteikastensystem.Fach#getAnzahlUnbekannt()
	 * @see #getFach()
	 * @generated
	 */
	EAttribute getFach_AnzahlUnbekannt();

	/**
	 * Returns the meta object for class '{@link com.iks.hto.karteikastensystem.core.model.karteikastensystem.Karte <em>Karte</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Karte</em>'.
	 * @see com.iks.hto.karteikastensystem.core.model.karteikastensystem.Karte
	 * @generated
	 */
	EClass getKarte();

	/**
	 * Returns the meta object for the containment reference list '{@link com.iks.hto.karteikastensystem.core.model.karteikastensystem.Karte#getSeiten <em>Seiten</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Seiten</em>'.
	 * @see com.iks.hto.karteikastensystem.core.model.karteikastensystem.Karte#getSeiten()
	 * @see #getKarte()
	 * @generated
	 */
	EReference getKarte_Seiten();

	/**
	 * Returns the meta object for the attribute '{@link com.iks.hto.karteikastensystem.core.model.karteikastensystem.Karte#getId <em>Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Id</em>'.
	 * @see com.iks.hto.karteikastensystem.core.model.karteikastensystem.Karte#getId()
	 * @see #getKarte()
	 * @generated
	 */
	EAttribute getKarte_Id();

	/**
	 * Returns the meta object for the attribute '{@link com.iks.hto.karteikastensystem.core.model.karteikastensystem.Karte#getAnzahlGewusstInFolge <em>Anzahl Gewusst In Folge</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Anzahl Gewusst In Folge</em>'.
	 * @see com.iks.hto.karteikastensystem.core.model.karteikastensystem.Karte#getAnzahlGewusstInFolge()
	 * @see #getKarte()
	 * @generated
	 */
	EAttribute getKarte_AnzahlGewusstInFolge();

	/**
	 * Returns the meta object for class '{@link com.iks.hto.karteikastensystem.core.model.karteikastensystem.Kartenseite <em>Kartenseite</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Kartenseite</em>'.
	 * @see com.iks.hto.karteikastensystem.core.model.karteikastensystem.Kartenseite
	 * @generated
	 */
	EClass getKartenseite();

	/**
	 * Returns the meta object for the attribute '{@link com.iks.hto.karteikastensystem.core.model.karteikastensystem.Kartenseite#getSprache <em>Sprache</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Sprache</em>'.
	 * @see com.iks.hto.karteikastensystem.core.model.karteikastensystem.Kartenseite#getSprache()
	 * @see #getKartenseite()
	 * @generated
	 */
	EAttribute getKartenseite_Sprache();

	/**
	 * Returns the meta object for the attribute '{@link com.iks.hto.karteikastensystem.core.model.karteikastensystem.Kartenseite#getVokabel <em>Vokabel</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Vokabel</em>'.
	 * @see com.iks.hto.karteikastensystem.core.model.karteikastensystem.Kartenseite#getVokabel()
	 * @see #getKartenseite()
	 * @generated
	 */
	EAttribute getKartenseite_Vokabel();

	/**
	 * Returns the meta object for the attribute '{@link com.iks.hto.karteikastensystem.core.model.karteikastensystem.Kartenseite#getBeispiel <em>Beispiel</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Beispiel</em>'.
	 * @see com.iks.hto.karteikastensystem.core.model.karteikastensystem.Kartenseite#getBeispiel()
	 * @see #getKartenseite()
	 * @generated
	 */
	EAttribute getKartenseite_Beispiel();

	/**
	 * Returns the meta object for the container reference '{@link com.iks.hto.karteikastensystem.core.model.karteikastensystem.Kartenseite#getKarte <em>Karte</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the container reference '<em>Karte</em>'.
	 * @see com.iks.hto.karteikastensystem.core.model.karteikastensystem.Kartenseite#getKarte()
	 * @see #getKartenseite()
	 * @generated
	 */
	EReference getKartenseite_Karte();

	/**
	 * Returns the meta object for enum '{@link com.iks.hto.karteikastensystem.core.model.karteikastensystem.Sprache <em>Sprache</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Sprache</em>'.
	 * @see com.iks.hto.karteikastensystem.core.model.karteikastensystem.Sprache
	 * @generated
	 */
	EEnum getSprache();

	/**
	 * Returns the meta object for enum '{@link com.iks.hto.karteikastensystem.core.model.karteikastensystem.Karteifachtyp <em>Karteifachtyp</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Karteifachtyp</em>'.
	 * @see com.iks.hto.karteikastensystem.core.model.karteikastensystem.Karteifachtyp
	 * @generated
	 */
	EEnum getKarteifachtyp();

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	KarteikastensystemFactory getKarteikastensystemFactory();

	/**
	 * <!-- begin-user-doc -->
	 * Defines literals for the meta objects that represent
	 * <ul>
	 *   <li>each class,</li>
	 *   <li>each feature of each class,</li>
	 *   <li>each enum,</li>
	 *   <li>and each data type</li>
	 * </ul>
	 * <!-- end-user-doc -->
	 * @generated
	 */
	interface Literals {
		/**
		 * The meta object literal for the '{@link com.iks.hto.karteikastensystem.core.model.karteikastensystem.impl.KarteikastenSystemImpl <em>Karteikasten System</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see com.iks.hto.karteikastensystem.core.model.karteikastensystem.impl.KarteikastenSystemImpl
		 * @see com.iks.hto.karteikastensystem.core.model.karteikastensystem.impl.KarteikastensystemPackageImpl#getKarteikastenSystem()
		 * @generated
		 */
		EClass KARTEIKASTEN_SYSTEM = eINSTANCE.getKarteikastenSystem();

		/**
		 * The meta object literal for the '<em><b>Benutzer</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference KARTEIKASTEN_SYSTEM__BENUTZER = eINSTANCE.getKarteikastenSystem_Benutzer();

		/**
		 * The meta object literal for the '<em><b>Karten</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference KARTEIKASTEN_SYSTEM__KARTEN = eINSTANCE.getKarteikastenSystem_Karten();

		/**
		 * The meta object literal for the '<em><b>File Path</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute KARTEIKASTEN_SYSTEM__FILE_PATH = eINSTANCE.getKarteikastenSystem_FilePath();

		/**
		 * The meta object literal for the '{@link com.iks.hto.karteikastensystem.core.model.karteikastensystem.impl.PersonImpl <em>Person</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see com.iks.hto.karteikastensystem.core.model.karteikastensystem.impl.PersonImpl
		 * @see com.iks.hto.karteikastensystem.core.model.karteikastensystem.impl.KarteikastensystemPackageImpl#getPerson()
		 * @generated
		 */
		EClass PERSON = eINSTANCE.getPerson();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PERSON__NAME = eINSTANCE.getPerson_Name();

		/**
		 * The meta object literal for the '<em><b>Karteikaesten</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PERSON__KARTEIKAESTEN = eINSTANCE.getPerson_Karteikaesten();

		/**
		 * The meta object literal for the '<em><b>Nick Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PERSON__NICK_NAME = eINSTANCE.getPerson_NickName();

		/**
		 * The meta object literal for the '{@link com.iks.hto.karteikastensystem.core.model.karteikastensystem.impl.KarteikastenImpl <em>Karteikasten</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see com.iks.hto.karteikastensystem.core.model.karteikastensystem.impl.KarteikastenImpl
		 * @see com.iks.hto.karteikastensystem.core.model.karteikastensystem.impl.KarteikastensystemPackageImpl#getKarteikasten()
		 * @generated
		 */
		EClass KARTEIKASTEN = eINSTANCE.getKarteikasten();

		/**
		 * The meta object literal for the '<em><b>Von Sprache</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute KARTEIKASTEN__VON_SPRACHE = eINSTANCE.getKarteikasten_VonSprache();

		/**
		 * The meta object literal for the '<em><b>Nach Sprache</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute KARTEIKASTEN__NACH_SPRACHE = eINSTANCE.getKarteikasten_NachSprache();

		/**
		 * The meta object literal for the '<em><b>Faecher</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference KARTEIKASTEN__FAECHER = eINSTANCE.getKarteikasten_Faecher();

		/**
		 * The meta object literal for the '<em><b>Person</b></em>' container reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference KARTEIKASTEN__PERSON = eINSTANCE.getKarteikasten_Person();

		/**
		 * The meta object literal for the '{@link com.iks.hto.karteikastensystem.core.model.karteikastensystem.impl.FachImpl <em>Fach</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see com.iks.hto.karteikastensystem.core.model.karteikastensystem.impl.FachImpl
		 * @see com.iks.hto.karteikastensystem.core.model.karteikastensystem.impl.KarteikastensystemPackageImpl#getFach()
		 * @generated
		 */
		EClass FACH = eINSTANCE.getFach();

		/**
		 * The meta object literal for the '<em><b>Typ</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute FACH__TYP = eINSTANCE.getFach_Typ();

		/**
		 * The meta object literal for the '<em><b>Karten</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference FACH__KARTEN = eINSTANCE.getFach_Karten();

		/**
		 * The meta object literal for the '<em><b>Karteikasten</b></em>' container reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference FACH__KARTEIKASTEN = eINSTANCE.getFach_Karteikasten();

		/**
		 * The meta object literal for the '<em><b>Anzahl Karten</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute FACH__ANZAHL_KARTEN = eINSTANCE.getFach_AnzahlKarten();

		/**
		 * The meta object literal for the '<em><b>Anzahl Unbekannt</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute FACH__ANZAHL_UNBEKANNT = eINSTANCE.getFach_AnzahlUnbekannt();

		/**
		 * The meta object literal for the '{@link com.iks.hto.karteikastensystem.core.model.karteikastensystem.impl.KarteImpl <em>Karte</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see com.iks.hto.karteikastensystem.core.model.karteikastensystem.impl.KarteImpl
		 * @see com.iks.hto.karteikastensystem.core.model.karteikastensystem.impl.KarteikastensystemPackageImpl#getKarte()
		 * @generated
		 */
		EClass KARTE = eINSTANCE.getKarte();

		/**
		 * The meta object literal for the '<em><b>Seiten</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference KARTE__SEITEN = eINSTANCE.getKarte_Seiten();

		/**
		 * The meta object literal for the '<em><b>Id</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute KARTE__ID = eINSTANCE.getKarte_Id();

		/**
		 * The meta object literal for the '<em><b>Anzahl Gewusst In Folge</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute KARTE__ANZAHL_GEWUSST_IN_FOLGE = eINSTANCE.getKarte_AnzahlGewusstInFolge();

		/**
		 * The meta object literal for the '{@link com.iks.hto.karteikastensystem.core.model.karteikastensystem.impl.KartenseiteImpl <em>Kartenseite</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see com.iks.hto.karteikastensystem.core.model.karteikastensystem.impl.KartenseiteImpl
		 * @see com.iks.hto.karteikastensystem.core.model.karteikastensystem.impl.KarteikastensystemPackageImpl#getKartenseite()
		 * @generated
		 */
		EClass KARTENSEITE = eINSTANCE.getKartenseite();

		/**
		 * The meta object literal for the '<em><b>Sprache</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute KARTENSEITE__SPRACHE = eINSTANCE.getKartenseite_Sprache();

		/**
		 * The meta object literal for the '<em><b>Vokabel</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute KARTENSEITE__VOKABEL = eINSTANCE.getKartenseite_Vokabel();

		/**
		 * The meta object literal for the '<em><b>Beispiel</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute KARTENSEITE__BEISPIEL = eINSTANCE.getKartenseite_Beispiel();

		/**
		 * The meta object literal for the '<em><b>Karte</b></em>' container reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference KARTENSEITE__KARTE = eINSTANCE.getKartenseite_Karte();

		/**
		 * The meta object literal for the '{@link com.iks.hto.karteikastensystem.core.model.karteikastensystem.Sprache <em>Sprache</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see com.iks.hto.karteikastensystem.core.model.karteikastensystem.Sprache
		 * @see com.iks.hto.karteikastensystem.core.model.karteikastensystem.impl.KarteikastensystemPackageImpl#getSprache()
		 * @generated
		 */
		EEnum SPRACHE = eINSTANCE.getSprache();

		/**
		 * The meta object literal for the '{@link com.iks.hto.karteikastensystem.core.model.karteikastensystem.Karteifachtyp <em>Karteifachtyp</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see com.iks.hto.karteikastensystem.core.model.karteikastensystem.Karteifachtyp
		 * @see com.iks.hto.karteikastensystem.core.model.karteikastensystem.impl.KarteikastensystemPackageImpl#getKarteifachtyp()
		 * @generated
		 */
		EEnum KARTEIFACHTYP = eINSTANCE.getKarteifachtyp();

	}

} //KarteikastensystemPackage
