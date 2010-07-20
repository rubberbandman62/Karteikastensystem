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
import com.iks.hto.karteikastensystem.core.model.karteikastensystem.KarteikastensystemFactory;
import com.iks.hto.karteikastensystem.core.model.karteikastensystem.KarteikastensystemPackage;
import com.iks.hto.karteikastensystem.core.model.karteikastensystem.Person;
import com.iks.hto.karteikastensystem.core.model.karteikastensystem.Sprache;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.EObjectImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentWithInverseEList;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Karteikasten</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link com.iks.hto.karteikastensystem.core.model.karteikastensystem.impl.KarteikastenImpl#getVonSprache <em>Von Sprache</em>}</li>
 *   <li>{@link com.iks.hto.karteikastensystem.core.model.karteikastensystem.impl.KarteikastenImpl#getNachSprache <em>Nach Sprache</em>}</li>
 *   <li>{@link com.iks.hto.karteikastensystem.core.model.karteikastensystem.impl.KarteikastenImpl#getFaecher <em>Faecher</em>}</li>
 *   <li>{@link com.iks.hto.karteikastensystem.core.model.karteikastensystem.impl.KarteikastenImpl#getPerson <em>Person</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class KarteikastenImpl extends EObjectImpl implements Karteikasten {
	/**
	 * The default value of the '{@link #getVonSprache() <em>Von Sprache</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getVonSprache()
	 * @generated
	 * @ordered
	 */
	protected static final Sprache VON_SPRACHE_EDEFAULT = Sprache.DEUTSCH;

	/**
	 * The cached value of the '{@link #getVonSprache() <em>Von Sprache</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getVonSprache()
	 * @generated
	 * @ordered
	 */
	protected Sprache vonSprache = VON_SPRACHE_EDEFAULT;

	/**
	 * The default value of the '{@link #getNachSprache() <em>Nach Sprache</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNachSprache()
	 * @generated
	 * @ordered
	 */
	protected static final Sprache NACH_SPRACHE_EDEFAULT = Sprache.DEUTSCH;

	/**
	 * The cached value of the '{@link #getNachSprache() <em>Nach Sprache</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNachSprache()
	 * @generated
	 * @ordered
	 */
	protected Sprache nachSprache = NACH_SPRACHE_EDEFAULT;

	/**
	 * The cached value of the '{@link #getFaecher() <em>Faecher</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFaecher()
	 * @generated
	 * @ordered
	 */
	protected EList<Fach> faecher;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected KarteikastenImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return KarteikastensystemPackage.Literals.KARTEIKASTEN;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Sprache getVonSprache() {
		return vonSprache;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setVonSprache(Sprache newVonSprache) {
		Sprache oldVonSprache = vonSprache;
		vonSprache = newVonSprache == null ? VON_SPRACHE_EDEFAULT : newVonSprache;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, KarteikastensystemPackage.KARTEIKASTEN__VON_SPRACHE, oldVonSprache, vonSprache));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Sprache getNachSprache() {
		return nachSprache;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setNachSprache(Sprache newNachSprache) {
		Sprache oldNachSprache = nachSprache;
		nachSprache = newNachSprache == null ? NACH_SPRACHE_EDEFAULT : newNachSprache;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, KarteikastensystemPackage.KARTEIKASTEN__NACH_SPRACHE, oldNachSprache, nachSprache));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Fach> getFaecher() {
		if (faecher == null) {
			faecher = new EObjectContainmentWithInverseEList<Fach>(Fach.class, this, KarteikastensystemPackage.KARTEIKASTEN__FAECHER, KarteikastensystemPackage.FACH__KARTEIKASTEN);
		}
		return faecher;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Person getPerson() {
		if (eContainerFeatureID() != KarteikastensystemPackage.KARTEIKASTEN__PERSON) return null;
		return (Person)eContainer();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetPerson(Person newPerson, NotificationChain msgs) {
		msgs = eBasicSetContainer((InternalEObject)newPerson, KarteikastensystemPackage.KARTEIKASTEN__PERSON, msgs);
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setPerson(Person newPerson) {
		if (newPerson != eInternalContainer() || (eContainerFeatureID() != KarteikastensystemPackage.KARTEIKASTEN__PERSON && newPerson != null)) {
			if (EcoreUtil.isAncestor(this, newPerson))
				throw new IllegalArgumentException("Recursive containment not allowed for " + toString());
			NotificationChain msgs = null;
			if (eInternalContainer() != null)
				msgs = eBasicRemoveFromContainer(msgs);
			if (newPerson != null)
				msgs = ((InternalEObject)newPerson).eInverseAdd(this, KarteikastensystemPackage.PERSON__KARTEIKAESTEN, Person.class, msgs);
			msgs = basicSetPerson(newPerson, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, KarteikastensystemPackage.KARTEIKASTEN__PERSON, newPerson, newPerson));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 */
	public Fach getFach(Karteifachtyp typ) {
		for (Fach f : this.getFaecher()) {
			if (f.getTyp().equals(typ)) {
				return f;
			}
		}
		return null;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 */
	public Fach addFach(Karteifachtyp typ) {
		if (this.getFach(typ) != null) {
			return null;
		}
		Fach f = KarteikastensystemFactory.eINSTANCE.createFach();
		f.setTyp(typ);

		f.setKarteikasten(this);

		this.getFaecher().add(f);

		return f;	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 */
	public boolean moveKarteUp(Fach fromFach, Karte karte) {
		if (!this.getFaecher().contains(fromFach)) {
			return false;
		}
		if (fromFach.getTyp().equals(Karteifachtyp.ARCHIVIERT)) {
			return false;
		}
		if (!fromFach.removeKarte(karte)) {
			return false;
		}
		Fach toFach = this.getFach(Karteifachtyp.get(fromFach.getTyp()
				.getValue() + 1));
		toFach.addKarte(karte);
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 */
	public boolean moveKarteDown(Fach fach, Karte karte) {
		if (!this.getFaecher().contains(fach)) {
			return false;
		}
		if (fach.getTyp().equals(Karteifachtyp.NEU)) {
			return false;
		}
		if (!fach.removeKarte(karte)) {
			return false;
		}
		Fach toFach = this.getFach(Karteifachtyp
				.get(fach.getTyp().getValue() - 1));
		toFach.addKarte(karte);
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public NotificationChain eInverseAdd(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case KarteikastensystemPackage.KARTEIKASTEN__FAECHER:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getFaecher()).basicAdd(otherEnd, msgs);
			case KarteikastensystemPackage.KARTEIKASTEN__PERSON:
				if (eInternalContainer() != null)
					msgs = eBasicRemoveFromContainer(msgs);
				return basicSetPerson((Person)otherEnd, msgs);
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
			case KarteikastensystemPackage.KARTEIKASTEN__FAECHER:
				return ((InternalEList<?>)getFaecher()).basicRemove(otherEnd, msgs);
			case KarteikastensystemPackage.KARTEIKASTEN__PERSON:
				return basicSetPerson(null, msgs);
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
			case KarteikastensystemPackage.KARTEIKASTEN__PERSON:
				return eInternalContainer().eInverseRemove(this, KarteikastensystemPackage.PERSON__KARTEIKAESTEN, Person.class, msgs);
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
			case KarteikastensystemPackage.KARTEIKASTEN__VON_SPRACHE:
				return getVonSprache();
			case KarteikastensystemPackage.KARTEIKASTEN__NACH_SPRACHE:
				return getNachSprache();
			case KarteikastensystemPackage.KARTEIKASTEN__FAECHER:
				return getFaecher();
			case KarteikastensystemPackage.KARTEIKASTEN__PERSON:
				return getPerson();
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
			case KarteikastensystemPackage.KARTEIKASTEN__VON_SPRACHE:
				setVonSprache((Sprache)newValue);
				return;
			case KarteikastensystemPackage.KARTEIKASTEN__NACH_SPRACHE:
				setNachSprache((Sprache)newValue);
				return;
			case KarteikastensystemPackage.KARTEIKASTEN__FAECHER:
				getFaecher().clear();
				getFaecher().addAll((Collection<? extends Fach>)newValue);
				return;
			case KarteikastensystemPackage.KARTEIKASTEN__PERSON:
				setPerson((Person)newValue);
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
			case KarteikastensystemPackage.KARTEIKASTEN__VON_SPRACHE:
				setVonSprache(VON_SPRACHE_EDEFAULT);
				return;
			case KarteikastensystemPackage.KARTEIKASTEN__NACH_SPRACHE:
				setNachSprache(NACH_SPRACHE_EDEFAULT);
				return;
			case KarteikastensystemPackage.KARTEIKASTEN__FAECHER:
				getFaecher().clear();
				return;
			case KarteikastensystemPackage.KARTEIKASTEN__PERSON:
				setPerson((Person)null);
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
			case KarteikastensystemPackage.KARTEIKASTEN__VON_SPRACHE:
				return vonSprache != VON_SPRACHE_EDEFAULT;
			case KarteikastensystemPackage.KARTEIKASTEN__NACH_SPRACHE:
				return nachSprache != NACH_SPRACHE_EDEFAULT;
			case KarteikastensystemPackage.KARTEIKASTEN__FAECHER:
				return faecher != null && !faecher.isEmpty();
			case KarteikastensystemPackage.KARTEIKASTEN__PERSON:
				return getPerson() != null;
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
		result.append(" (vonSprache: ");
		result.append(vonSprache);
		result.append(", nachSprache: ");
		result.append(nachSprache);
		result.append(')');
		return result.toString();
	}

} //KarteikastenImpl
