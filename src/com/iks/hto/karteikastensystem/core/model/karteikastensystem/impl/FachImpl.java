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
import com.iks.hto.karteikastensystem.core.model.karteikastensystem.KarteikastensystemPackage;

import java.util.Collection;
import java.util.Date;
import java.util.Random;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.EObjectImpl;

import org.eclipse.emf.ecore.util.EObjectResolvingEList;
import org.eclipse.emf.ecore.util.EcoreUtil;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Fach</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link com.iks.hto.karteikastensystem.core.model.karteikastensystem.impl.FachImpl#getTyp <em>Typ</em>}</li>
 *   <li>{@link com.iks.hto.karteikastensystem.core.model.karteikastensystem.impl.FachImpl#getKarten <em>Karten</em>}</li>
 *   <li>{@link com.iks.hto.karteikastensystem.core.model.karteikastensystem.impl.FachImpl#getKarteikasten <em>Karteikasten</em>}</li>
 *   <li>{@link com.iks.hto.karteikastensystem.core.model.karteikastensystem.impl.FachImpl#getAnzahlKarten <em>Anzahl Karten</em>}</li>
 *   <li>{@link com.iks.hto.karteikastensystem.core.model.karteikastensystem.impl.FachImpl#getAnzahlUnbekannt <em>Anzahl Unbekannt</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class FachImpl extends EObjectImpl implements Fach {
	/**
	 * The default value of the '{@link #getTyp() <em>Typ</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTyp()
	 * @generated
	 * @ordered
	 */
	protected static final Karteifachtyp TYP_EDEFAULT = Karteifachtyp.NEU;

	/**
	 * The cached value of the '{@link #getTyp() <em>Typ</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTyp()
	 * @generated
	 * @ordered
	 */
	protected Karteifachtyp typ = TYP_EDEFAULT;

	/**
	 * The cached value of the '{@link #getKarten() <em>Karten</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getKarten()
	 * @generated
	 * @ordered
	 */
	protected EList<Karte> karten;

	/**
	 * The default value of the '{@link #getAnzahlKarten() <em>Anzahl Karten</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAnzahlKarten()
	 * @generated
	 * @ordered
	 */
	protected static final int ANZAHL_KARTEN_EDEFAULT = 0;

	/**
	 * The default value of the '{@link #getAnzahlUnbekannt() <em>Anzahl Unbekannt</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAnzahlUnbekannt()
	 * @generated
	 * @ordered
	 */
	protected static final int ANZAHL_UNBEKANNT_EDEFAULT = 0;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected FachImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return KarteikastensystemPackage.Literals.FACH;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Karteifachtyp getTyp() {
		return typ;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setTyp(Karteifachtyp newTyp) {
		Karteifachtyp oldTyp = typ;
		typ = newTyp == null ? TYP_EDEFAULT : newTyp;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, KarteikastensystemPackage.FACH__TYP, oldTyp, typ));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Karte> getKarten() {
		if (karten == null) {
			karten = new EObjectResolvingEList<Karte>(Karte.class, this, KarteikastensystemPackage.FACH__KARTEN);
		}
		return karten;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Karteikasten getKarteikasten() {
		if (eContainerFeatureID() != KarteikastensystemPackage.FACH__KARTEIKASTEN) return null;
		return (Karteikasten)eContainer();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetKarteikasten(Karteikasten newKarteikasten, NotificationChain msgs) {
		msgs = eBasicSetContainer((InternalEObject)newKarteikasten, KarteikastensystemPackage.FACH__KARTEIKASTEN, msgs);
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setKarteikasten(Karteikasten newKarteikasten) {
		if (newKarteikasten != eInternalContainer() || (eContainerFeatureID() != KarteikastensystemPackage.FACH__KARTEIKASTEN && newKarteikasten != null)) {
			if (EcoreUtil.isAncestor(this, newKarteikasten))
				throw new IllegalArgumentException("Recursive containment not allowed for " + toString());
			NotificationChain msgs = null;
			if (eInternalContainer() != null)
				msgs = eBasicRemoveFromContainer(msgs);
			if (newKarteikasten != null)
				msgs = ((InternalEObject)newKarteikasten).eInverseAdd(this, KarteikastensystemPackage.KARTEIKASTEN__FAECHER, Karteikasten.class, msgs);
			msgs = basicSetKarteikasten(newKarteikasten, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, KarteikastensystemPackage.FACH__KARTEIKASTEN, newKarteikasten, newKarteikasten));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 */
	public int getAnzahlKarten() {
		return this.karten.size();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 */
	public int getAnzahlUnbekannt() {
		return this.getAnzahlKartenInFolgeGewusst(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 */
	public void addKarte(Karte karte) {
		this.getKarten().add(karte);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 */
	public boolean removeKarte(Karte karte) {
		return this.getKarten().remove(karte);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 */
	public Karte getNextKarte() {
		Random r = new Random((new Date()).getTime());
		int i = r.nextInt(this.getKarten().size());
		return this.getKarten().get(i);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 */
	public int getAnzahlKartenInFolgeGewusst(int inFolgeGewusst) {
		int count = 0;
		for (Karte k : this.karten) {
			if (k.getAnzahlGewusstInFolge() == inFolgeGewusst) {
				count++;
			}
		}
		return count;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseAdd(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case KarteikastensystemPackage.FACH__KARTEIKASTEN:
				if (eInternalContainer() != null)
					msgs = eBasicRemoveFromContainer(msgs);
				return basicSetKarteikasten((Karteikasten)otherEnd, msgs);
		}
		return super.eInverseAdd(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case KarteikastensystemPackage.FACH__KARTEIKASTEN:
				return basicSetKarteikasten(null, msgs);
		}
		return super.eInverseRemove(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eBasicRemoveFromContainerFeature(NotificationChain msgs) {
		switch (eContainerFeatureID()) {
			case KarteikastensystemPackage.FACH__KARTEIKASTEN:
				return eInternalContainer().eInverseRemove(this, KarteikastensystemPackage.KARTEIKASTEN__FAECHER, Karteikasten.class, msgs);
		}
		return super.eBasicRemoveFromContainerFeature(msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case KarteikastensystemPackage.FACH__TYP:
				return getTyp();
			case KarteikastensystemPackage.FACH__KARTEN:
				return getKarten();
			case KarteikastensystemPackage.FACH__KARTEIKASTEN:
				return getKarteikasten();
			case KarteikastensystemPackage.FACH__ANZAHL_KARTEN:
				return getAnzahlKarten();
			case KarteikastensystemPackage.FACH__ANZAHL_UNBEKANNT:
				return getAnzahlUnbekannt();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case KarteikastensystemPackage.FACH__TYP:
				setTyp((Karteifachtyp)newValue);
				return;
			case KarteikastensystemPackage.FACH__KARTEN:
				getKarten().clear();
				getKarten().addAll((Collection<? extends Karte>)newValue);
				return;
			case KarteikastensystemPackage.FACH__KARTEIKASTEN:
				setKarteikasten((Karteikasten)newValue);
				return;
		}
		super.eSet(featureID, newValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eUnset(int featureID) {
		switch (featureID) {
			case KarteikastensystemPackage.FACH__TYP:
				setTyp(TYP_EDEFAULT);
				return;
			case KarteikastensystemPackage.FACH__KARTEN:
				getKarten().clear();
				return;
			case KarteikastensystemPackage.FACH__KARTEIKASTEN:
				setKarteikasten((Karteikasten)null);
				return;
		}
		super.eUnset(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean eIsSet(int featureID) {
		switch (featureID) {
			case KarteikastensystemPackage.FACH__TYP:
				return typ != TYP_EDEFAULT;
			case KarteikastensystemPackage.FACH__KARTEN:
				return karten != null && !karten.isEmpty();
			case KarteikastensystemPackage.FACH__KARTEIKASTEN:
				return getKarteikasten() != null;
			case KarteikastensystemPackage.FACH__ANZAHL_KARTEN:
				return getAnzahlKarten() != ANZAHL_KARTEN_EDEFAULT;
			case KarteikastensystemPackage.FACH__ANZAHL_UNBEKANNT:
				return getAnzahlUnbekannt() != ANZAHL_UNBEKANNT_EDEFAULT;
		}
		return super.eIsSet(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String toString() {
		if (eIsProxy()) return super.toString();

		StringBuffer result = new StringBuffer(super.toString());
		result.append(" (typ: ");
		result.append(typ);
		result.append(')');
		return result.toString();
	}

} //FachImpl
