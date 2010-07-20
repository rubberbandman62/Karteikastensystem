/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package com.iks.hto.karteikastensystem.core.model.karteikastensystem.impl;

import com.iks.hto.karteikastensystem.core.model.karteikastensystem.Karte;
import com.iks.hto.karteikastensystem.core.model.karteikastensystem.KarteikastensystemPackage;
import com.iks.hto.karteikastensystem.core.model.karteikastensystem.Kartenseite;
import com.iks.hto.karteikastensystem.core.model.karteikastensystem.Sprache;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.EObjectImpl;

import org.eclipse.emf.ecore.util.EcoreUtil;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Kartenseite</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link com.iks.hto.karteikastensystem.core.model.karteikastensystem.impl.KartenseiteImpl#getSprache <em>Sprache</em>}</li>
 *   <li>{@link com.iks.hto.karteikastensystem.core.model.karteikastensystem.impl.KartenseiteImpl#getVokabel <em>Vokabel</em>}</li>
 *   <li>{@link com.iks.hto.karteikastensystem.core.model.karteikastensystem.impl.KartenseiteImpl#getBeispiel <em>Beispiel</em>}</li>
 *   <li>{@link com.iks.hto.karteikastensystem.core.model.karteikastensystem.impl.KartenseiteImpl#getKarte <em>Karte</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class KartenseiteImpl extends EObjectImpl implements Kartenseite {
	/**
	 * The default value of the '{@link #getSprache() <em>Sprache</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSprache()
	 * @generated
	 * @ordered
	 */
	protected static final Sprache SPRACHE_EDEFAULT = Sprache.DEUTSCH;

	/**
	 * The cached value of the '{@link #getSprache() <em>Sprache</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSprache()
	 * @generated
	 * @ordered
	 */
	protected Sprache sprache = SPRACHE_EDEFAULT;

	/**
	 * The default value of the '{@link #getVokabel() <em>Vokabel</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getVokabel()
	 * @generated
	 * @ordered
	 */
	protected static final String VOKABEL_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getVokabel() <em>Vokabel</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getVokabel()
	 * @generated
	 * @ordered
	 */
	protected String vokabel = VOKABEL_EDEFAULT;

	/**
	 * The default value of the '{@link #getBeispiel() <em>Beispiel</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getBeispiel()
	 * @generated
	 * @ordered
	 */
	protected static final String BEISPIEL_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getBeispiel() <em>Beispiel</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getBeispiel()
	 * @generated
	 * @ordered
	 */
	protected String beispiel = BEISPIEL_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected KartenseiteImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return KarteikastensystemPackage.Literals.KARTENSEITE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Sprache getSprache() {
		return sprache;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setSprache(Sprache newSprache) {
		Sprache oldSprache = sprache;
		sprache = newSprache == null ? SPRACHE_EDEFAULT : newSprache;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, KarteikastensystemPackage.KARTENSEITE__SPRACHE, oldSprache, sprache));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getVokabel() {
		return vokabel;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setVokabel(String newVokabel) {
		String oldVokabel = vokabel;
		vokabel = newVokabel;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, KarteikastensystemPackage.KARTENSEITE__VOKABEL, oldVokabel, vokabel));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getBeispiel() {
		return beispiel;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setBeispiel(String newBeispiel) {
		String oldBeispiel = beispiel;
		beispiel = newBeispiel;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, KarteikastensystemPackage.KARTENSEITE__BEISPIEL, oldBeispiel, beispiel));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Karte getKarte() {
		if (eContainerFeatureID() != KarteikastensystemPackage.KARTENSEITE__KARTE) return null;
		return (Karte)eContainer();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetKarte(Karte newKarte, NotificationChain msgs) {
		msgs = eBasicSetContainer((InternalEObject)newKarte, KarteikastensystemPackage.KARTENSEITE__KARTE, msgs);
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setKarte(Karte newKarte) {
		if (newKarte != eInternalContainer() || (eContainerFeatureID() != KarteikastensystemPackage.KARTENSEITE__KARTE && newKarte != null)) {
			if (EcoreUtil.isAncestor(this, newKarte))
				throw new IllegalArgumentException("Recursive containment not allowed for " + toString());
			NotificationChain msgs = null;
			if (eInternalContainer() != null)
				msgs = eBasicRemoveFromContainer(msgs);
			if (newKarte != null)
				msgs = ((InternalEObject)newKarte).eInverseAdd(this, KarteikastensystemPackage.KARTE__SEITEN, Karte.class, msgs);
			msgs = basicSetKarte(newKarte, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, KarteikastensystemPackage.KARTENSEITE__KARTE, newKarte, newKarte));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseAdd(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case KarteikastensystemPackage.KARTENSEITE__KARTE:
				if (eInternalContainer() != null)
					msgs = eBasicRemoveFromContainer(msgs);
				return basicSetKarte((Karte)otherEnd, msgs);
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
			case KarteikastensystemPackage.KARTENSEITE__KARTE:
				return basicSetKarte(null, msgs);
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
			case KarteikastensystemPackage.KARTENSEITE__KARTE:
				return eInternalContainer().eInverseRemove(this, KarteikastensystemPackage.KARTE__SEITEN, Karte.class, msgs);
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
			case KarteikastensystemPackage.KARTENSEITE__SPRACHE:
				return getSprache();
			case KarteikastensystemPackage.KARTENSEITE__VOKABEL:
				return getVokabel();
			case KarteikastensystemPackage.KARTENSEITE__BEISPIEL:
				return getBeispiel();
			case KarteikastensystemPackage.KARTENSEITE__KARTE:
				return getKarte();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case KarteikastensystemPackage.KARTENSEITE__SPRACHE:
				setSprache((Sprache)newValue);
				return;
			case KarteikastensystemPackage.KARTENSEITE__VOKABEL:
				setVokabel((String)newValue);
				return;
			case KarteikastensystemPackage.KARTENSEITE__BEISPIEL:
				setBeispiel((String)newValue);
				return;
			case KarteikastensystemPackage.KARTENSEITE__KARTE:
				setKarte((Karte)newValue);
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
			case KarteikastensystemPackage.KARTENSEITE__SPRACHE:
				setSprache(SPRACHE_EDEFAULT);
				return;
			case KarteikastensystemPackage.KARTENSEITE__VOKABEL:
				setVokabel(VOKABEL_EDEFAULT);
				return;
			case KarteikastensystemPackage.KARTENSEITE__BEISPIEL:
				setBeispiel(BEISPIEL_EDEFAULT);
				return;
			case KarteikastensystemPackage.KARTENSEITE__KARTE:
				setKarte((Karte)null);
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
			case KarteikastensystemPackage.KARTENSEITE__SPRACHE:
				return sprache != SPRACHE_EDEFAULT;
			case KarteikastensystemPackage.KARTENSEITE__VOKABEL:
				return VOKABEL_EDEFAULT == null ? vokabel != null : !VOKABEL_EDEFAULT.equals(vokabel);
			case KarteikastensystemPackage.KARTENSEITE__BEISPIEL:
				return BEISPIEL_EDEFAULT == null ? beispiel != null : !BEISPIEL_EDEFAULT.equals(beispiel);
			case KarteikastensystemPackage.KARTENSEITE__KARTE:
				return getKarte() != null;
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
		result.append(" (sprache: ");
		result.append(sprache);
		result.append(", vokabel: ");
		result.append(vokabel);
		result.append(", beispiel: ");
		result.append(beispiel);
		result.append(')');
		return result.toString();
	}

} //KartenseiteImpl
