/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package com.iks.hto.karteikastensystem.core.model.karteikastensystem.impl;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.EObjectImpl;
import org.eclipse.emf.ecore.util.EObjectContainmentWithInverseEList;
import org.eclipse.emf.ecore.util.InternalEList;

import com.iks.hto.karteikastensystem.core.model.karteikastensystem.Karte;
import com.iks.hto.karteikastensystem.core.model.karteikastensystem.KarteikastensystemFactory;
import com.iks.hto.karteikastensystem.core.model.karteikastensystem.KarteikastensystemPackage;
import com.iks.hto.karteikastensystem.core.model.karteikastensystem.Kartenseite;
import com.iks.hto.karteikastensystem.core.model.karteikastensystem.Sprache;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Karte</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link com.iks.hto.karteikastensystem.core.model.karteikastensystem.impl.KarteImpl#getSeiten <em>Seiten</em>}</li>
 *   <li>{@link com.iks.hto.karteikastensystem.core.model.karteikastensystem.impl.KarteImpl#getId <em>Id</em>}</li>
 *   <li>{@link com.iks.hto.karteikastensystem.core.model.karteikastensystem.impl.KarteImpl#getAnzahlGewusstInFolge <em>Anzahl Gewusst In Folge</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class KarteImpl extends EObjectImpl implements Karte {
	/**
	 * The cached value of the '{@link #getSeiten() <em>Seiten</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSeiten()
	 * @generated
	 * @ordered
	 */
	protected EList<Kartenseite> seiten;

	/**
	 * The default value of the '{@link #getId() <em>Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getId()
	 * @generated
	 * @ordered
	 */
	protected static final String ID_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getId() <em>Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getId()
	 * @generated
	 * @ordered
	 */
	protected String id = ID_EDEFAULT;

	/**
	 * The default value of the '{@link #getAnzahlGewusstInFolge() <em>Anzahl Gewusst In Folge</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAnzahlGewusstInFolge()
	 * @generated
	 * @ordered
	 */
	protected static final int ANZAHL_GEWUSST_IN_FOLGE_EDEFAULT = 0;

	/**
	 * The cached value of the '{@link #getAnzahlGewusstInFolge() <em>Anzahl Gewusst In Folge</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAnzahlGewusstInFolge()
	 * @generated
	 * @ordered
	 */
	protected int anzahlGewusstInFolge = ANZAHL_GEWUSST_IN_FOLGE_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected KarteImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return KarteikastensystemPackage.Literals.KARTE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Kartenseite> getSeiten() {
		if (seiten == null) {
			seiten = new EObjectContainmentWithInverseEList<Kartenseite>(Kartenseite.class, this, KarteikastensystemPackage.KARTE__SEITEN, KarteikastensystemPackage.KARTENSEITE__KARTE);
		}
		return seiten;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getId() {
		return id;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setId(String newId) {
		String oldId = id;
		id = newId;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, KarteikastensystemPackage.KARTE__ID, oldId, id));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public int getAnzahlGewusstInFolge() {
		return anzahlGewusstInFolge;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setAnzahlGewusstInFolge(int newAnzahlGewusstInFolge) {
		int oldAnzahlGewusstInFolge = anzahlGewusstInFolge;
		anzahlGewusstInFolge = newAnzahlGewusstInFolge;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, KarteikastensystemPackage.KARTE__ANZAHL_GEWUSST_IN_FOLGE, oldAnzahlGewusstInFolge, anzahlGewusstInFolge));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 */
	public Kartenseite beschrifteSeite(Sprache sprache, String vokabel, String beispiel) {
		Kartenseite ks = this.getSeite(sprache);
		if (ks == null) {
			ks = this.addSeite(sprache);
		}
		
		ks.setVokabel(vokabel);
		ks.setBeispiel(beispiel);
		
		return ks;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 */
	public Kartenseite getSeite(Sprache sprache) {
		for (Kartenseite ks : this.getSeiten()) {
			if (ks.getSprache().equals(sprache)) {
				return ks;
			}
		}
		return null;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 */
	public Kartenseite addSeite(Sprache sprache) {
		if (this.getSeite(sprache) != null) {
			return null;
		}
		Kartenseite s = KarteikastensystemFactory.eINSTANCE.createKartenseite();
		s.setSprache(sprache);

		s.setKarte(this);

		this.getSeiten().add(s);

		return s;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 */
	public int richtig() {
		this.setAnzahlGewusstInFolge(this.anzahlGewusstInFolge+1);
		return this.anzahlGewusstInFolge;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 */
	public int falsch() {
		this.setAnzahlGewusstInFolge(0);
		return 0;
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
			case KarteikastensystemPackage.KARTE__SEITEN:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getSeiten()).basicAdd(otherEnd, msgs);
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
			case KarteikastensystemPackage.KARTE__SEITEN:
				return ((InternalEList<?>)getSeiten()).basicRemove(otherEnd, msgs);
		}
		return super.eInverseRemove(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case KarteikastensystemPackage.KARTE__SEITEN:
				return getSeiten();
			case KarteikastensystemPackage.KARTE__ID:
				return getId();
			case KarteikastensystemPackage.KARTE__ANZAHL_GEWUSST_IN_FOLGE:
				return getAnzahlGewusstInFolge();
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
			case KarteikastensystemPackage.KARTE__SEITEN:
				getSeiten().clear();
				getSeiten().addAll((Collection<? extends Kartenseite>)newValue);
				return;
			case KarteikastensystemPackage.KARTE__ID:
				setId((String)newValue);
				return;
			case KarteikastensystemPackage.KARTE__ANZAHL_GEWUSST_IN_FOLGE:
				setAnzahlGewusstInFolge((Integer)newValue);
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
			case KarteikastensystemPackage.KARTE__SEITEN:
				getSeiten().clear();
				return;
			case KarteikastensystemPackage.KARTE__ID:
				setId(ID_EDEFAULT);
				return;
			case KarteikastensystemPackage.KARTE__ANZAHL_GEWUSST_IN_FOLGE:
				setAnzahlGewusstInFolge(ANZAHL_GEWUSST_IN_FOLGE_EDEFAULT);
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
			case KarteikastensystemPackage.KARTE__SEITEN:
				return seiten != null && !seiten.isEmpty();
			case KarteikastensystemPackage.KARTE__ID:
				return ID_EDEFAULT == null ? id != null : !ID_EDEFAULT.equals(id);
			case KarteikastensystemPackage.KARTE__ANZAHL_GEWUSST_IN_FOLGE:
				return anzahlGewusstInFolge != ANZAHL_GEWUSST_IN_FOLGE_EDEFAULT;
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
		result.append(" (id: ");
		result.append(id);
		result.append(", anzahlGewusstInFolge: ");
		result.append(anzahlGewusstInFolge);
		result.append(')');
		return result.toString();
	}

} //KarteImpl
