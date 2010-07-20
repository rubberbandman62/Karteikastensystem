/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package com.iks.hto.karteikastensystem.core.model.karteikastensystem.impl;

import com.iks.hto.karteikastensystem.core.model.karteikastensystem.*;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EDataType;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.impl.EFactoryImpl;
import org.eclipse.emf.ecore.plugin.EcorePlugin;

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

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Factory</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class KarteikastensystemFactoryImpl extends EFactoryImpl implements KarteikastensystemFactory {
	/**
	 * Creates the default factory implementation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static KarteikastensystemFactory init() {
		try {
			KarteikastensystemFactory theKarteikastensystemFactory = (KarteikastensystemFactory)EPackage.Registry.INSTANCE.getEFactory("http://www.iks-gmbh.com/hto/karteikastensystem/1.0.0"); 
			if (theKarteikastensystemFactory != null) {
				return theKarteikastensystemFactory;
			}
		}
		catch (Exception exception) {
			EcorePlugin.INSTANCE.log(exception);
		}
		return new KarteikastensystemFactoryImpl();
	}

	/**
	 * Creates an instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public KarteikastensystemFactoryImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EObject create(EClass eClass) {
		switch (eClass.getClassifierID()) {
			case KarteikastensystemPackage.KARTEIKASTEN_SYSTEM: return createKarteikastenSystem();
			case KarteikastensystemPackage.PERSON: return createPerson();
			case KarteikastensystemPackage.KARTEIKASTEN: return createKarteikasten();
			case KarteikastensystemPackage.FACH: return createFach();
			case KarteikastensystemPackage.KARTE: return createKarte();
			case KarteikastensystemPackage.KARTENSEITE: return createKartenseite();
			default:
				throw new IllegalArgumentException("The class '" + eClass.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object createFromString(EDataType eDataType, String initialValue) {
		switch (eDataType.getClassifierID()) {
			case KarteikastensystemPackage.SPRACHE:
				return createSpracheFromString(eDataType, initialValue);
			case KarteikastensystemPackage.KARTEIFACHTYP:
				return createKarteifachtypFromString(eDataType, initialValue);
			default:
				throw new IllegalArgumentException("The datatype '" + eDataType.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String convertToString(EDataType eDataType, Object instanceValue) {
		switch (eDataType.getClassifierID()) {
			case KarteikastensystemPackage.SPRACHE:
				return convertSpracheToString(eDataType, instanceValue);
			case KarteikastensystemPackage.KARTEIFACHTYP:
				return convertKarteifachtypToString(eDataType, instanceValue);
			default:
				throw new IllegalArgumentException("The datatype '" + eDataType.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public KarteikastenSystem createKarteikastenSystem() {
		KarteikastenSystemImpl karteikastenSystem = new KarteikastenSystemImpl();
		return karteikastenSystem;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Person createPerson() {
		PersonImpl person = new PersonImpl();
		return person;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Karteikasten createKarteikasten() {
		KarteikastenImpl karteikasten = new KarteikastenImpl();
		return karteikasten;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Fach createFach() {
		FachImpl fach = new FachImpl();
		return fach;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Karte createKarte() {
		KarteImpl karte = new KarteImpl();
		return karte;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Kartenseite createKartenseite() {
		KartenseiteImpl kartenseite = new KartenseiteImpl();
		return kartenseite;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Sprache createSpracheFromString(EDataType eDataType, String initialValue) {
		Sprache result = Sprache.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertSpracheToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Karteifachtyp createKarteifachtypFromString(EDataType eDataType, String initialValue) {
		Karteifachtyp result = Karteifachtyp.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertKarteifachtypToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public KarteikastensystemPackage getKarteikastensystemPackage() {
		return (KarteikastensystemPackage)getEPackage();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @deprecated
	 * @generated
	 */
	@Deprecated
	public static KarteikastensystemPackage getPackage() {
		return KarteikastensystemPackage.eINSTANCE;
	}

//	@Override
//	public KarteikastenSystem loadKarteikastenSystem(
//			String filePath) {
//		URI filePathURI = URI.createFileURI(filePath);
//		ResourceSet resourceSet = new ResourceSetImpl();
//
//		// Register the appropriate resource factory to handle all file
//		// extensions.
//		resourceSet.getResourceFactoryRegistry().getExtensionToFactoryMap()
//				.put(Resource.Factory.Registry.DEFAULT_EXTENSION,
//						new XMIResourceFactoryImpl());
//
//		// Register the package to ensure it is available during loading.
//		resourceSet.getPackageRegistry().put(KarteikastensystemPackage.eNS_URI,
//				KarteikastensystemPackage.eINSTANCE);
//
//		boolean result = true;
//		try {
//			// Demand load resource for this file.
//			Resource resource = resourceSet.getResource(filePathURI, true);
//			System.out.println("Loaded " + filePathURI);
//
//			// Validate the contents of the loaded resource.
//			for (EObject eObject : resource.getContents()) {
//				Diagnostic diagnostic = Diagnostician.INSTANCE
//						.validate(eObject);
//				if (diagnostic.getSeverity() != Diagnostic.OK) {
//					result = false;
//					printDiagnostic(diagnostic, "");
//				}
//			}
//			if (result) {
//				return (KarteikastenSystem) resource.getContents().get(0);
//			}
//		} catch (RuntimeException exception) {
//			System.out.println("Problem loading " + filePathURI);
//			exception.printStackTrace();
//		}
//
//		return null;
//	}

	/**
	 * <!-- begin-user-doc --> Prints diagnostics with indentation. <!--
	 * end-user-doc -->
	 * 
	 * @param diagnostic
	 *            the diagnostic to print.
	 * @param indent
	 *            the indentation for printing.
	 */
//	private void printDiagnostic(Diagnostic diagnostic, String indent) {
//		System.out.print(indent);
//		System.out.println(diagnostic.getMessage());
//		for (Diagnostic child : diagnostic.getChildren()) {
//			printDiagnostic(child, indent + "  ");
//		}
//	}

} //KarteikastensystemFactoryImpl
