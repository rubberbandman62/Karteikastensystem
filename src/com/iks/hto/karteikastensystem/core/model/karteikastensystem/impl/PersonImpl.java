/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package com.iks.hto.karteikastensystem.core.model.karteikastensystem.impl;

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
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc --> An implementation of the model object '
 * <em><b>Person</b></em>'. <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link com.iks.hto.karteikastensystem.core.model.karteikastensystem.impl.PersonImpl#getName <em>Name</em>}</li>
 *   <li>{@link com.iks.hto.karteikastensystem.core.model.karteikastensystem.impl.PersonImpl#getKarteikaesten <em>Karteikaesten</em>}</li>
 *   <li>{@link com.iks.hto.karteikastensystem.core.model.karteikastensystem.impl.PersonImpl#getNickName <em>Nick Name</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class PersonImpl extends EObjectImpl implements Person {
	/**
	 * The default value of the '{@link #getName() <em>Name</em>}' attribute.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @see #getName()
	 * @generated
	 * @ordered
	 */
	protected static final String NAME_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getName() <em>Name</em>}' attribute.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @see #getName()
	 * @generated
	 * @ordered
	 */
	protected String name = NAME_EDEFAULT;

	/**
	 * The cached value of the '{@link #getKarteikaesten() <em>Karteikaesten</em>}' containment reference list.
	 * <!-- begin-user-doc
	 * --> <!-- end-user-doc -->
	 * @see #getKarteikaesten()
	 * @generated
	 * @ordered
	 */
	protected EList<Karteikasten> karteikaesten;

	/**
	 * The default value of the '{@link #getNickName() <em>Nick Name</em>}' attribute.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @see #getNickName()
	 * @generated
	 * @ordered
	 */
	protected static final String NICK_NAME_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getNickName() <em>Nick Name</em>}' attribute.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @see #getNickName()
	 * @generated
	 * @ordered
	 */
	protected String nickName = NICK_NAME_EDEFAULT;

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	protected PersonImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return KarteikastensystemPackage.Literals.PERSON;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public String getName() {
		return name;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public void setName(String newName) {
		String oldName = name;
		name = newName;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, KarteikastensystemPackage.PERSON__NAME, oldName, name));
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Karteikasten> getKarteikaesten() {
		if (karteikaesten == null) {
			karteikaesten = new EObjectContainmentWithInverseEList<Karteikasten>(Karteikasten.class, this, KarteikastensystemPackage.PERSON__KARTEIKAESTEN, KarteikastensystemPackage.KARTEIKASTEN__PERSON);
		}
		return karteikaesten;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public String getNickName() {
		return nickName;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public void setNickName(String newNickName) {
		String oldNickName = nickName;
		nickName = newNickName;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, KarteikastensystemPackage.PERSON__NICK_NAME, oldNickName, nickName));
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 */
	public Karteikasten getKarteikasten(Sprache von, Sprache nach) {
		for (Karteikasten kk : this.getKarteikaesten()) {
			if (kk.getVonSprache().equals(von)
					&& kk.getNachSprache().equals(nach)) {
				return kk;
			}
		}
		return null;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 */
	public Karteikasten addKarteikasten(Sprache von, Sprache nach) {
		if (this.getKarteikasten(von, nach) != null) {
			return null;
		}
		
		Karteikasten kk = KarteikastensystemFactory.eINSTANCE
				.createKarteikasten();
		kk.setVonSprache(von);
		kk.setNachSprache(nach);

		kk.addFach(Karteifachtyp.NEU);
		kk.addFach(Karteifachtyp.GELERNT);
		kk.addFach(Karteifachtyp.BEKANNT);
		kk.addFach(Karteifachtyp.GESICHERT);
		kk.addFach(Karteifachtyp.ARCHIVIERT);

		kk.setPerson(this);

		this.getKarteikaesten().add(kk);

		return kk;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public NotificationChain eInverseAdd(InternalEObject otherEnd,
			int featureID, NotificationChain msgs) {
		switch (featureID) {
			case KarteikastensystemPackage.PERSON__KARTEIKAESTEN:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getKarteikaesten()).basicAdd(otherEnd, msgs);
		}
		return super.eInverseAdd(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd,
			int featureID, NotificationChain msgs) {
		switch (featureID) {
			case KarteikastensystemPackage.PERSON__KARTEIKAESTEN:
				return ((InternalEList<?>)getKarteikaesten()).basicRemove(otherEnd, msgs);
		}
		return super.eInverseRemove(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case KarteikastensystemPackage.PERSON__NAME:
				return getName();
			case KarteikastensystemPackage.PERSON__KARTEIKAESTEN:
				return getKarteikaesten();
			case KarteikastensystemPackage.PERSON__NICK_NAME:
				return getNickName();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case KarteikastensystemPackage.PERSON__NAME:
				setName((String)newValue);
				return;
			case KarteikastensystemPackage.PERSON__KARTEIKAESTEN:
				getKarteikaesten().clear();
				getKarteikaesten().addAll((Collection<? extends Karteikasten>)newValue);
				return;
			case KarteikastensystemPackage.PERSON__NICK_NAME:
				setNickName((String)newValue);
				return;
		}
		super.eSet(featureID, newValue);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eUnset(int featureID) {
		switch (featureID) {
			case KarteikastensystemPackage.PERSON__NAME:
				setName(NAME_EDEFAULT);
				return;
			case KarteikastensystemPackage.PERSON__KARTEIKAESTEN:
				getKarteikaesten().clear();
				return;
			case KarteikastensystemPackage.PERSON__NICK_NAME:
				setNickName(NICK_NAME_EDEFAULT);
				return;
		}
		super.eUnset(featureID);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean eIsSet(int featureID) {
		switch (featureID) {
			case KarteikastensystemPackage.PERSON__NAME:
				return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
			case KarteikastensystemPackage.PERSON__KARTEIKAESTEN:
				return karteikaesten != null && !karteikaesten.isEmpty();
			case KarteikastensystemPackage.PERSON__NICK_NAME:
				return NICK_NAME_EDEFAULT == null ? nickName != null : !NICK_NAME_EDEFAULT.equals(nickName);
		}
		return super.eIsSet(featureID);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String toString() {
		if (eIsProxy()) return super.toString();

		StringBuffer result = new StringBuffer(super.toString());
		result.append(" (name: ");
		result.append(name);
		result.append(", nickName: ");
		result.append(nickName);
		result.append(')');
		return result.toString();
	}

} // PersonImpl
