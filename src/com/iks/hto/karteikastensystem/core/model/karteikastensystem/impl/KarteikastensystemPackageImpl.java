/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package com.iks.hto.karteikastensystem.core.model.karteikastensystem.impl;

import com.iks.hto.karteikastensystem.core.model.karteikastensystem.Fach;
import com.iks.hto.karteikastensystem.core.model.karteikastensystem.Karte;
import com.iks.hto.karteikastensystem.core.model.karteikastensystem.Karteifachtyp;
import com.iks.hto.karteikastensystem.core.model.karteikastensystem.Karteikasten;
import com.iks.hto.karteikastensystem.core.model.karteikastensystem.KarteikastenSystem;
import com.iks.hto.karteikastensystem.core.model.karteikastensystem.KarteikastensystemFactory;
import com.iks.hto.karteikastensystem.core.model.karteikastensystem.KarteikastensystemPackage;
import com.iks.hto.karteikastensystem.core.model.karteikastensystem.Kartenseite;
import com.iks.hto.karteikastensystem.core.model.karteikastensystem.Person;
import com.iks.hto.karteikastensystem.core.model.karteikastensystem.Sprache;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EEnum;
import org.eclipse.emf.ecore.EOperation;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

import org.eclipse.emf.ecore.impl.EPackageImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Package</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class KarteikastensystemPackageImpl extends EPackageImpl implements KarteikastensystemPackage {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass karteikastenSystemEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass personEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass karteikastenEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass fachEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass karteEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass kartenseiteEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum spracheEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum karteifachtypEEnum = null;

	/**
	 * Creates an instance of the model <b>Package</b>, registered with
	 * {@link org.eclipse.emf.ecore.EPackage.Registry EPackage.Registry} by the package
	 * package URI value.
	 * <p>Note: the correct way to create the package is via the static
	 * factory method {@link #init init()}, which also performs
	 * initialization of the package, or returns the registered package,
	 * if one already exists.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.emf.ecore.EPackage.Registry
	 * @see com.iks.hto.karteikastensystem.core.model.karteikastensystem.KarteikastensystemPackage#eNS_URI
	 * @see #init()
	 * @generated
	 */
	private KarteikastensystemPackageImpl() {
		super(eNS_URI, KarteikastensystemFactory.eINSTANCE);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static boolean isInited = false;

	/**
	 * Creates, registers, and initializes the <b>Package</b> for this model, and for any others upon which it depends.
	 * 
	 * <p>This method is used to initialize {@link KarteikastensystemPackage#eINSTANCE} when that field is accessed.
	 * Clients should not invoke it directly. Instead, they should simply access that field to obtain the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #eNS_URI
	 * @see #createPackageContents()
	 * @see #initializePackageContents()
	 * @generated
	 */
	public static KarteikastensystemPackage init() {
		if (isInited) return (KarteikastensystemPackage)EPackage.Registry.INSTANCE.getEPackage(KarteikastensystemPackage.eNS_URI);

		// Obtain or create and register package
		KarteikastensystemPackageImpl theKarteikastensystemPackage = (KarteikastensystemPackageImpl)(EPackage.Registry.INSTANCE.get(eNS_URI) instanceof KarteikastensystemPackageImpl ? EPackage.Registry.INSTANCE.get(eNS_URI) : new KarteikastensystemPackageImpl());

		isInited = true;

		// Create package meta-data objects
		theKarteikastensystemPackage.createPackageContents();

		// Initialize created meta-data
		theKarteikastensystemPackage.initializePackageContents();

		// Mark meta-data to indicate it can't be changed
		theKarteikastensystemPackage.freeze();

  
		// Update the registry and return the package
		EPackage.Registry.INSTANCE.put(KarteikastensystemPackage.eNS_URI, theKarteikastensystemPackage);
		return theKarteikastensystemPackage;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getKarteikastenSystem() {
		return karteikastenSystemEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getKarteikastenSystem_Benutzer() {
		return (EReference)karteikastenSystemEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getKarteikastenSystem_Karten() {
		return (EReference)karteikastenSystemEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getKarteikastenSystem_FilePath() {
		return (EAttribute)karteikastenSystemEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getPerson() {
		return personEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getPerson_Name() {
		return (EAttribute)personEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getPerson_Karteikaesten() {
		return (EReference)personEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getPerson_NickName() {
		return (EAttribute)personEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getKarteikasten() {
		return karteikastenEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getKarteikasten_VonSprache() {
		return (EAttribute)karteikastenEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getKarteikasten_NachSprache() {
		return (EAttribute)karteikastenEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getKarteikasten_Faecher() {
		return (EReference)karteikastenEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getKarteikasten_Person() {
		return (EReference)karteikastenEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getFach() {
		return fachEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getFach_Typ() {
		return (EAttribute)fachEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getFach_Karten() {
		return (EReference)fachEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getFach_Karteikasten() {
		return (EReference)fachEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getFach_AnzahlKarten() {
		return (EAttribute)fachEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getFach_AnzahlUnbekannt() {
		return (EAttribute)fachEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getKarte() {
		return karteEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getKarte_Seiten() {
		return (EReference)karteEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getKarte_Id() {
		return (EAttribute)karteEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getKarte_AnzahlGewusstInFolge() {
		return (EAttribute)karteEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getKartenseite() {
		return kartenseiteEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getKartenseite_Sprache() {
		return (EAttribute)kartenseiteEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getKartenseite_Vokabel() {
		return (EAttribute)kartenseiteEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getKartenseite_Beispiel() {
		return (EAttribute)kartenseiteEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getKartenseite_Karte() {
		return (EReference)kartenseiteEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getSprache() {
		return spracheEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getKarteifachtyp() {
		return karteifachtypEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public KarteikastensystemFactory getKarteikastensystemFactory() {
		return (KarteikastensystemFactory)getEFactoryInstance();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private boolean isCreated = false;

	/**
	 * Creates the meta-model objects for the package.  This method is
	 * guarded to have no affect on any invocation but its first.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void createPackageContents() {
		if (isCreated) return;
		isCreated = true;

		// Create classes and their features
		karteikastenSystemEClass = createEClass(KARTEIKASTEN_SYSTEM);
		createEReference(karteikastenSystemEClass, KARTEIKASTEN_SYSTEM__BENUTZER);
		createEReference(karteikastenSystemEClass, KARTEIKASTEN_SYSTEM__KARTEN);
		createEAttribute(karteikastenSystemEClass, KARTEIKASTEN_SYSTEM__FILE_PATH);

		personEClass = createEClass(PERSON);
		createEAttribute(personEClass, PERSON__NAME);
		createEReference(personEClass, PERSON__KARTEIKAESTEN);
		createEAttribute(personEClass, PERSON__NICK_NAME);

		karteikastenEClass = createEClass(KARTEIKASTEN);
		createEAttribute(karteikastenEClass, KARTEIKASTEN__VON_SPRACHE);
		createEAttribute(karteikastenEClass, KARTEIKASTEN__NACH_SPRACHE);
		createEReference(karteikastenEClass, KARTEIKASTEN__FAECHER);
		createEReference(karteikastenEClass, KARTEIKASTEN__PERSON);

		fachEClass = createEClass(FACH);
		createEAttribute(fachEClass, FACH__TYP);
		createEReference(fachEClass, FACH__KARTEN);
		createEReference(fachEClass, FACH__KARTEIKASTEN);
		createEAttribute(fachEClass, FACH__ANZAHL_KARTEN);
		createEAttribute(fachEClass, FACH__ANZAHL_UNBEKANNT);

		karteEClass = createEClass(KARTE);
		createEReference(karteEClass, KARTE__SEITEN);
		createEAttribute(karteEClass, KARTE__ID);
		createEAttribute(karteEClass, KARTE__ANZAHL_GEWUSST_IN_FOLGE);

		kartenseiteEClass = createEClass(KARTENSEITE);
		createEAttribute(kartenseiteEClass, KARTENSEITE__SPRACHE);
		createEAttribute(kartenseiteEClass, KARTENSEITE__VOKABEL);
		createEAttribute(kartenseiteEClass, KARTENSEITE__BEISPIEL);
		createEReference(kartenseiteEClass, KARTENSEITE__KARTE);

		// Create enums
		spracheEEnum = createEEnum(SPRACHE);
		karteifachtypEEnum = createEEnum(KARTEIFACHTYP);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private boolean isInitialized = false;

	/**
	 * Complete the initialization of the package and its meta-model.  This
	 * method is guarded to have no affect on any invocation but its first.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void initializePackageContents() {
		if (isInitialized) return;
		isInitialized = true;

		// Initialize package
		setName(eNAME);
		setNsPrefix(eNS_PREFIX);
		setNsURI(eNS_URI);

		// Create type parameters

		// Set bounds for type parameters

		// Add supertypes to classes

		// Initialize classes and features; add operations and parameters
		initEClass(karteikastenSystemEClass, KarteikastenSystem.class, "KarteikastenSystem", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getKarteikastenSystem_Benutzer(), this.getPerson(), null, "benutzer", null, 0, -1, KarteikastenSystem.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		getKarteikastenSystem_Benutzer().getEKeys().add(this.getPerson_Name());
		initEReference(getKarteikastenSystem_Karten(), this.getKarte(), null, "karten", null, 0, -1, KarteikastenSystem.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		getKarteikastenSystem_Karten().getEKeys().add(this.getKarte_Id());
		initEAttribute(getKarteikastenSystem_FilePath(), ecorePackage.getEString(), "filePath", "", 0, 1, KarteikastenSystem.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		EOperation op = addEOperation(karteikastenSystemEClass, this.getPerson(), "addBenutzer", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getEString(), "name", 0, 1, IS_UNIQUE, IS_ORDERED);

		op = addEOperation(karteikastenSystemEClass, this.getKarte(), "addKarte", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getEString(), "id", 0, 1, IS_UNIQUE, IS_ORDERED);

		initEClass(personEClass, Person.class, "Person", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getPerson_Name(), ecorePackage.getEString(), "name", null, 0, 1, Person.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getPerson_Karteikaesten(), this.getKarteikasten(), this.getKarteikasten_Person(), "karteikaesten", null, 0, 12, Person.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getPerson_NickName(), ecorePackage.getEString(), "nickName", null, 0, 1, Person.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		op = addEOperation(personEClass, this.getKarteikasten(), "getKarteikasten", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, this.getSprache(), "von", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, this.getSprache(), "nach", 0, 1, IS_UNIQUE, IS_ORDERED);

		op = addEOperation(personEClass, this.getKarteikasten(), "addKarteikasten", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, this.getSprache(), "von", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, this.getSprache(), "nach", 0, 1, IS_UNIQUE, IS_ORDERED);

		initEClass(karteikastenEClass, Karteikasten.class, "Karteikasten", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getKarteikasten_VonSprache(), this.getSprache(), "vonSprache", null, 0, 1, Karteikasten.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getKarteikasten_NachSprache(), this.getSprache(), "nachSprache", null, 0, 1, Karteikasten.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getKarteikasten_Faecher(), this.getFach(), this.getFach_Karteikasten(), "faecher", null, 5, 5, Karteikasten.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getKarteikasten_Person(), this.getPerson(), this.getPerson_Karteikaesten(), "person", null, 1, 1, Karteikasten.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		op = addEOperation(karteikastenEClass, this.getFach(), "getFach", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, this.getKarteifachtyp(), "typ", 0, 1, IS_UNIQUE, IS_ORDERED);

		op = addEOperation(karteikastenEClass, this.getFach(), "addFach", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, this.getKarteifachtyp(), "typ", 0, 1, IS_UNIQUE, IS_ORDERED);

		op = addEOperation(karteikastenEClass, ecorePackage.getEBoolean(), "moveKarteUp", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, this.getFach(), "fromFach", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, this.getKarte(), "karte", 0, 1, IS_UNIQUE, IS_ORDERED);

		op = addEOperation(karteikastenEClass, ecorePackage.getEBoolean(), "moveKarteDown", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, this.getFach(), "fach", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, this.getKarte(), "karte", 0, 1, IS_UNIQUE, IS_ORDERED);

		initEClass(fachEClass, Fach.class, "Fach", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getFach_Typ(), this.getKarteifachtyp(), "typ", null, 0, 1, Fach.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getFach_Karten(), this.getKarte(), null, "karten", null, 0, -1, Fach.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getFach_Karteikasten(), this.getKarteikasten(), this.getKarteikasten_Faecher(), "karteikasten", null, 1, 1, Fach.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getFach_AnzahlKarten(), ecorePackage.getEInt(), "anzahlKarten", null, 0, 1, Fach.class, IS_TRANSIENT, IS_VOLATILE, !IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, IS_DERIVED, !IS_ORDERED);
		initEAttribute(getFach_AnzahlUnbekannt(), ecorePackage.getEInt(), "anzahlUnbekannt", null, 0, 1, Fach.class, IS_TRANSIENT, IS_VOLATILE, !IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, IS_DERIVED, IS_ORDERED);

		op = addEOperation(fachEClass, null, "addKarte", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, this.getKarte(), "karte", 0, 1, IS_UNIQUE, IS_ORDERED);

		op = addEOperation(fachEClass, ecorePackage.getEBoolean(), "removeKarte", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, this.getKarte(), "karte", 0, 1, IS_UNIQUE, IS_ORDERED);

		addEOperation(fachEClass, this.getKarte(), "getNextKarte", 0, 1, IS_UNIQUE, IS_ORDERED);

		op = addEOperation(fachEClass, ecorePackage.getEInt(), "getAnzahlKartenInFolgeGewusst", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getEInt(), "inFolgeGewusst", 0, 1, IS_UNIQUE, IS_ORDERED);

		initEClass(karteEClass, Karte.class, "Karte", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getKarte_Seiten(), this.getKartenseite(), this.getKartenseite_Karte(), "seiten", null, 1, 2, Karte.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getKarte_Id(), ecorePackage.getEString(), "id", null, 0, 1, Karte.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getKarte_AnzahlGewusstInFolge(), ecorePackage.getEInt(), "anzahlGewusstInFolge", null, 0, 1, Karte.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		op = addEOperation(karteEClass, this.getKartenseite(), "beschrifteSeite", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, this.getSprache(), "sprache", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getEString(), "vokabel", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getEString(), "beispiel", 0, 1, IS_UNIQUE, IS_ORDERED);

		op = addEOperation(karteEClass, this.getKartenseite(), "getSeite", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, this.getSprache(), "sprache", 0, 1, IS_UNIQUE, IS_ORDERED);

		op = addEOperation(karteEClass, this.getKartenseite(), "addSeite", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, this.getSprache(), "sprache", 0, 1, IS_UNIQUE, IS_ORDERED);

		addEOperation(karteEClass, ecorePackage.getEInt(), "richtig", 0, 1, IS_UNIQUE, IS_ORDERED);

		addEOperation(karteEClass, ecorePackage.getEInt(), "falsch", 0, 1, IS_UNIQUE, IS_ORDERED);

		initEClass(kartenseiteEClass, Kartenseite.class, "Kartenseite", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getKartenseite_Sprache(), this.getSprache(), "sprache", null, 0, 1, Kartenseite.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getKartenseite_Vokabel(), ecorePackage.getEString(), "vokabel", null, 0, 1, Kartenseite.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getKartenseite_Beispiel(), ecorePackage.getEString(), "beispiel", null, 0, 1, Kartenseite.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getKartenseite_Karte(), this.getKarte(), this.getKarte_Seiten(), "karte", null, 0, 1, Kartenseite.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		// Initialize enums and add enum literals
		initEEnum(spracheEEnum, Sprache.class, "Sprache");
		addEEnumLiteral(spracheEEnum, Sprache.DEUTSCH);
		addEEnumLiteral(spracheEEnum, Sprache.ENGLISCH);
		addEEnumLiteral(spracheEEnum, Sprache.SPANISCH);
		addEEnumLiteral(spracheEEnum, Sprache.FRANZOESISCH);

		initEEnum(karteifachtypEEnum, Karteifachtyp.class, "Karteifachtyp");
		addEEnumLiteral(karteifachtypEEnum, Karteifachtyp.NEU);
		addEEnumLiteral(karteifachtypEEnum, Karteifachtyp.GELERNT);
		addEEnumLiteral(karteifachtypEEnum, Karteifachtyp.BEKANNT);
		addEEnumLiteral(karteifachtypEEnum, Karteifachtyp.GESICHERT);
		addEEnumLiteral(karteifachtypEEnum, Karteifachtyp.ARCHIVIERT);

		// Create resource
		createResource(eNS_URI);
	}

} //KarteikastensystemPackageImpl
