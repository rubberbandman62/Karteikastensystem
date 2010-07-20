/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package com.iks.hto.karteikastensystem.core.model.karteikastensystem.util;

import com.iks.hto.karteikastensystem.core.model.karteikastensystem.*;

import org.eclipse.emf.common.notify.Adapter;
import org.eclipse.emf.common.notify.Notifier;

import org.eclipse.emf.common.notify.impl.AdapterFactoryImpl;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * The <b>Adapter Factory</b> for the model.
 * It provides an adapter <code>createXXX</code> method for each class of the model.
 * <!-- end-user-doc -->
 * @see com.iks.hto.karteikastensystem.core.model.karteikastensystem.KarteikastensystemPackage
 * @generated
 */
public class KarteikastensystemAdapterFactory extends AdapterFactoryImpl {
	/**
	 * The cached model package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static KarteikastensystemPackage modelPackage;

	/**
	 * Creates an instance of the adapter factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public KarteikastensystemAdapterFactory() {
		if (modelPackage == null) {
			modelPackage = KarteikastensystemPackage.eINSTANCE;
		}
	}

	/**
	 * Returns whether this factory is applicable for the type of the object.
	 * <!-- begin-user-doc -->
	 * This implementation returns <code>true</code> if the object is either the model's package or is an instance object of the model.
	 * <!-- end-user-doc -->
	 * @return whether this factory is applicable for the type of the object.
	 * @generated
	 */
	@Override
	public boolean isFactoryForType(Object object) {
		if (object == modelPackage) {
			return true;
		}
		if (object instanceof EObject) {
			return ((EObject)object).eClass().getEPackage() == modelPackage;
		}
		return false;
	}

	/**
	 * The switch that delegates to the <code>createXXX</code> methods.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected KarteikastensystemSwitch<Adapter> modelSwitch =
		new KarteikastensystemSwitch<Adapter>() {
			@Override
			public Adapter caseKarteikastenSystem(KarteikastenSystem object) {
				return createKarteikastenSystemAdapter();
			}
			@Override
			public Adapter casePerson(Person object) {
				return createPersonAdapter();
			}
			@Override
			public Adapter caseKarteikasten(Karteikasten object) {
				return createKarteikastenAdapter();
			}
			@Override
			public Adapter caseFach(Fach object) {
				return createFachAdapter();
			}
			@Override
			public Adapter caseKarte(Karte object) {
				return createKarteAdapter();
			}
			@Override
			public Adapter caseKartenseite(Kartenseite object) {
				return createKartenseiteAdapter();
			}
			@Override
			public Adapter defaultCase(EObject object) {
				return createEObjectAdapter();
			}
		};

	/**
	 * Creates an adapter for the <code>target</code>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param target the object to adapt.
	 * @return the adapter for the <code>target</code>.
	 * @generated
	 */
	@Override
	public Adapter createAdapter(Notifier target) {
		return modelSwitch.doSwitch((EObject)target);
	}


	/**
	 * Creates a new adapter for an object of class '{@link com.iks.hto.karteikastensystem.core.model.karteikastensystem.KarteikastenSystem <em>Karteikasten System</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see com.iks.hto.karteikastensystem.core.model.karteikastensystem.KarteikastenSystem
	 * @generated
	 */
	public Adapter createKarteikastenSystemAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link com.iks.hto.karteikastensystem.core.model.karteikastensystem.Person <em>Person</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see com.iks.hto.karteikastensystem.core.model.karteikastensystem.Person
	 * @generated
	 */
	public Adapter createPersonAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link com.iks.hto.karteikastensystem.core.model.karteikastensystem.Karteikasten <em>Karteikasten</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see com.iks.hto.karteikastensystem.core.model.karteikastensystem.Karteikasten
	 * @generated
	 */
	public Adapter createKarteikastenAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link com.iks.hto.karteikastensystem.core.model.karteikastensystem.Fach <em>Fach</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see com.iks.hto.karteikastensystem.core.model.karteikastensystem.Fach
	 * @generated
	 */
	public Adapter createFachAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link com.iks.hto.karteikastensystem.core.model.karteikastensystem.Karte <em>Karte</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see com.iks.hto.karteikastensystem.core.model.karteikastensystem.Karte
	 * @generated
	 */
	public Adapter createKarteAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link com.iks.hto.karteikastensystem.core.model.karteikastensystem.Kartenseite <em>Kartenseite</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see com.iks.hto.karteikastensystem.core.model.karteikastensystem.Kartenseite
	 * @generated
	 */
	public Adapter createKartenseiteAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for the default case.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @generated
	 */
	public Adapter createEObjectAdapter() {
		return null;
	}

} //KarteikastensystemAdapterFactory
