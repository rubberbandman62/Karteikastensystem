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
import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

import com.iks.hto.karteikastensystem.core.model.karteikastensystem.Karte;
import com.iks.hto.karteikastensystem.core.model.karteikastensystem.KarteikastenSystem;
import com.iks.hto.karteikastensystem.core.model.karteikastensystem.KarteikastensystemFactory;
import com.iks.hto.karteikastensystem.core.model.karteikastensystem.KarteikastensystemPackage;
import com.iks.hto.karteikastensystem.core.model.karteikastensystem.Person;
import com.iks.hto.karteikastensystem.core.model.karteikastensystem.Sprache;

/**
 * <!-- begin-user-doc --> An implementation of the model object '
 * <em><b>Karteikasten System</b></em>'. <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link com.iks.hto.karteikastensystem.core.model.karteikastensystem.impl.KarteikastenSystemImpl#getBenutzer <em>Benutzer</em>}</li>
 *   <li>{@link com.iks.hto.karteikastensystem.core.model.karteikastensystem.impl.KarteikastenSystemImpl#getKarten <em>Karten</em>}</li>
 *   <li>{@link com.iks.hto.karteikastensystem.core.model.karteikastensystem.impl.KarteikastenSystemImpl#getFilePath <em>File Path</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class KarteikastenSystemImpl extends EObjectImpl implements
		KarteikastenSystem {
	/**
	 * The cached value of the '{@link #getBenutzer() <em>Benutzer</em>}' containment reference list.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @see #getBenutzer()
	 * @generated
	 * @ordered
	 */
	protected EList<Person> benutzer;

	/**
	 * The cached value of the '{@link #getKarten() <em>Karten</em>}' containment reference list.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @see #getKarten()
	 * @generated
	 * @ordered
	 */
	protected EList<Karte> karten;

	/**
	 * The default value of the '{@link #getFilePath() <em>File Path</em>}' attribute.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @see #getFilePath()
	 * @generated
	 * @ordered
	 */
	protected static final String FILE_PATH_EDEFAULT = "";

	/**
	 * The cached value of the '{@link #getFilePath() <em>File Path</em>}' attribute.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @see #getFilePath()
	 * @generated
	 * @ordered
	 */
	protected String filePath = FILE_PATH_EDEFAULT;

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	protected KarteikastenSystemImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return KarteikastensystemPackage.Literals.KARTEIKASTEN_SYSTEM;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Person> getBenutzer() {
		if (benutzer == null) {
			benutzer = new EObjectContainmentEList<Person>(Person.class, this, KarteikastensystemPackage.KARTEIKASTEN_SYSTEM__BENUTZER);
		}
		return benutzer;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Karte> getKarten() {
		if (karten == null) {
			karten = new EObjectContainmentEList<Karte>(Karte.class, this, KarteikastensystemPackage.KARTEIKASTEN_SYSTEM__KARTEN);
		}
		return karten;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public String getFilePath() {
		return filePath;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public void setFilePath(String newFilePath) {
		String oldFilePath = filePath;
		filePath = newFilePath;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, KarteikastensystemPackage.KARTEIKASTEN_SYSTEM__FILE_PATH, oldFilePath, filePath));
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 */
	public Person addBenutzer(String name) {
		Person p = KarteikastensystemFactory.eINSTANCE.createPerson();
		p.setName(name);
		this.getBenutzer().add(p);
		return p;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 */
	public Karte addKarte(String id) {
		Karte k = KarteikastensystemFactory.eINSTANCE.createKarte();
		k.setId(id);

		k.addSeite(Sprache.DEUTSCH);
		k.addSeite(Sprache.ENGLISCH);
		k.addSeite(Sprache.FRANZOESISCH);
		k.addSeite(Sprache.SPANISCH);

		this.getKarten().add(k);
		return k;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 */
//	public boolean save() {
//		if (this.filePath == null || this.filePath == "") {
//			(new IOException("filePath not set!")).printStackTrace();
//			return false;
//		}
//		URI filePathURI = URI.createFileURI(this.filePath);
//		Resource poResource = new XMLResourceFactoryImpl()
//				.createResource(filePathURI);
//		poResource.getContents().add(this);
//		try {
//			poResource.save(null);
//			return true;
//		} catch (IOException e) {
//			e.printStackTrace();
//			return false;
//		}
//	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 */
//	public boolean saveAs(String filePath) {
//		this.filePath = filePath;
//		return save();
//	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd,
			int featureID, NotificationChain msgs) {
		switch (featureID) {
			case KarteikastensystemPackage.KARTEIKASTEN_SYSTEM__BENUTZER:
				return ((InternalEList<?>)getBenutzer()).basicRemove(otherEnd, msgs);
			case KarteikastensystemPackage.KARTEIKASTEN_SYSTEM__KARTEN:
				return ((InternalEList<?>)getKarten()).basicRemove(otherEnd, msgs);
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
			case KarteikastensystemPackage.KARTEIKASTEN_SYSTEM__BENUTZER:
				return getBenutzer();
			case KarteikastensystemPackage.KARTEIKASTEN_SYSTEM__KARTEN:
				return getKarten();
			case KarteikastensystemPackage.KARTEIKASTEN_SYSTEM__FILE_PATH:
				return getFilePath();
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
			case KarteikastensystemPackage.KARTEIKASTEN_SYSTEM__BENUTZER:
				getBenutzer().clear();
				getBenutzer().addAll((Collection<? extends Person>)newValue);
				return;
			case KarteikastensystemPackage.KARTEIKASTEN_SYSTEM__KARTEN:
				getKarten().clear();
				getKarten().addAll((Collection<? extends Karte>)newValue);
				return;
			case KarteikastensystemPackage.KARTEIKASTEN_SYSTEM__FILE_PATH:
				setFilePath((String)newValue);
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
			case KarteikastensystemPackage.KARTEIKASTEN_SYSTEM__BENUTZER:
				getBenutzer().clear();
				return;
			case KarteikastensystemPackage.KARTEIKASTEN_SYSTEM__KARTEN:
				getKarten().clear();
				return;
			case KarteikastensystemPackage.KARTEIKASTEN_SYSTEM__FILE_PATH:
				setFilePath(FILE_PATH_EDEFAULT);
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
			case KarteikastensystemPackage.KARTEIKASTEN_SYSTEM__BENUTZER:
				return benutzer != null && !benutzer.isEmpty();
			case KarteikastensystemPackage.KARTEIKASTEN_SYSTEM__KARTEN:
				return karten != null && !karten.isEmpty();
			case KarteikastensystemPackage.KARTEIKASTEN_SYSTEM__FILE_PATH:
				return FILE_PATH_EDEFAULT == null ? filePath != null : !FILE_PATH_EDEFAULT.equals(filePath);
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
		result.append(" (filePath: ");
		result.append(filePath);
		result.append(')');
		return result.toString();
	}

//	@Override
//	public void print(OutputStream out) {
//		Resource resource = new XMLResourceFactoryImpl().createResource(null);
//		resource.getContents().add(this);
//		try {
//			resource.save(out, null);
//		} catch (IOException e) {
//			e.printStackTrace();
//		}
//	}

} // KarteikastenSystemImpl
