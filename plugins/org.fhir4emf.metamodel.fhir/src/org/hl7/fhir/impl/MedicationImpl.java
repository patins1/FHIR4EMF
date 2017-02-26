/**
 */
package org.hl7.fhir.impl;

import java.util.Collection;
import java.util.List;

import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;
import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

import org.hl7.fhir.Attachment;
import org.hl7.fhir.CodeableConcept;
import org.hl7.fhir.FhirPackage;
import org.hl7.fhir.Medication;
import org.hl7.fhir.MedicationPackage;
import org.hl7.fhir.MedicationProduct;
import org.hl7.fhir.MedicationStatus;
import org.hl7.fhir.Reference;
import org.hl7.fhir.jaxb.BooleanImplAdapter;
import org.hl7.fhir.jaxb.MedicationStatusImplAdapter;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Medication</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.hl7.fhir.impl.MedicationImpl#getCode <em>Code</em>}</li>
 *   <li>{@link org.hl7.fhir.impl.MedicationImpl#getStatus <em>Status</em>}</li>
 *   <li>{@link org.hl7.fhir.impl.MedicationImpl#getIsBrand <em>Is Brand</em>}</li>
 *   <li>{@link org.hl7.fhir.impl.MedicationImpl#getIsOverTheCounter <em>Is Over The Counter</em>}</li>
 *   <li>{@link org.hl7.fhir.impl.MedicationImpl#getManufacturer <em>Manufacturer</em>}</li>
 *   <li>{@link org.hl7.fhir.impl.MedicationImpl#getProduct <em>Product</em>}</li>
 *   <li>{@link org.hl7.fhir.impl.MedicationImpl#getPackage <em>Package</em>}</li>
 *   <li>{@link org.hl7.fhir.impl.MedicationImpl#getImage <em>Image</em>}</li>
 * </ul>
 *
 * @generated
 */
@XmlType(name = "Medication", namespace = "http://hl7.org/fhir")
@XmlRootElement(name = "fhir.Medication")
public class MedicationImpl extends DomainResourceImpl implements Medication {
	/**
	 * The cached value of the '{@link #getCode() <em>Code</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCode()
	 * @generated
	 * @ordered
	 */
	protected CodeableConcept code;

	/**
	 * The cached value of the '{@link #getStatus() <em>Status</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getStatus()
	 * @generated
	 * @ordered
	 */
	protected MedicationStatus status;

	/**
	 * The cached value of the '{@link #getIsBrand() <em>Is Brand</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getIsBrand()
	 * @generated
	 * @ordered
	 */
	protected org.hl7.fhir.Boolean isBrand;

	/**
	 * The cached value of the '{@link #getIsOverTheCounter() <em>Is Over The Counter</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getIsOverTheCounter()
	 * @generated
	 * @ordered
	 */
	protected org.hl7.fhir.Boolean isOverTheCounter;

	/**
	 * The cached value of the '{@link #getManufacturer() <em>Manufacturer</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getManufacturer()
	 * @generated
	 * @ordered
	 */
	protected Reference manufacturer;

	/**
	 * The cached value of the '{@link #getProduct() <em>Product</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getProduct()
	 * @generated
	 * @ordered
	 */
	protected MedicationProduct product;

	/**
	 * The cached value of the '{@link #getPackage() <em>Package</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPackage()
	 * @generated
	 * @ordered
	 */
	protected MedicationPackage package_;

	/**
	 * The cached value of the '{@link #getImage() <em>Image</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getImage()
	 * @generated
	 * @ordered
	 */
	protected EList<Attachment> image;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected MedicationImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return FhirPackage.eINSTANCE.getMedication();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CodeableConcept getCode() {
		return code;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetCode(CodeableConcept newCode, NotificationChain msgs) {
		CodeableConcept oldCode = code;
		code = newCode;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FhirPackage.MEDICATION__CODE, oldCode, newCode);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setCode(CodeableConcept newCode) {
		if (newCode != code) {
			NotificationChain msgs = null;
			if (code != null)
				msgs = ((InternalEObject)code).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FhirPackage.MEDICATION__CODE, null, msgs);
			if (newCode != null)
				msgs = ((InternalEObject)newCode).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FhirPackage.MEDICATION__CODE, null, msgs);
			msgs = basicSetCode(newCode, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FhirPackage.MEDICATION__CODE, newCode, newCode));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@XmlJavaTypeAdapter(MedicationStatusImplAdapter.class)
	public MedicationStatus getStatus() {
		return status;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetStatus(MedicationStatus newStatus, NotificationChain msgs) {
		MedicationStatus oldStatus = status;
		status = newStatus;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FhirPackage.MEDICATION__STATUS, oldStatus, newStatus);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setStatus(MedicationStatus newStatus) {
		if (newStatus != status) {
			NotificationChain msgs = null;
			if (status != null)
				msgs = ((InternalEObject)status).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FhirPackage.MEDICATION__STATUS, null, msgs);
			if (newStatus != null)
				msgs = ((InternalEObject)newStatus).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FhirPackage.MEDICATION__STATUS, null, msgs);
			msgs = basicSetStatus(newStatus, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FhirPackage.MEDICATION__STATUS, newStatus, newStatus));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@XmlJavaTypeAdapter(BooleanImplAdapter.class)
	public org.hl7.fhir.Boolean getIsBrand() {
		return isBrand;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetIsBrand(org.hl7.fhir.Boolean newIsBrand, NotificationChain msgs) {
		org.hl7.fhir.Boolean oldIsBrand = isBrand;
		isBrand = newIsBrand;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FhirPackage.MEDICATION__IS_BRAND, oldIsBrand, newIsBrand);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setIsBrand(org.hl7.fhir.Boolean newIsBrand) {
		if (newIsBrand != isBrand) {
			NotificationChain msgs = null;
			if (isBrand != null)
				msgs = ((InternalEObject)isBrand).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FhirPackage.MEDICATION__IS_BRAND, null, msgs);
			if (newIsBrand != null)
				msgs = ((InternalEObject)newIsBrand).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FhirPackage.MEDICATION__IS_BRAND, null, msgs);
			msgs = basicSetIsBrand(newIsBrand, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FhirPackage.MEDICATION__IS_BRAND, newIsBrand, newIsBrand));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@XmlJavaTypeAdapter(BooleanImplAdapter.class)
	public org.hl7.fhir.Boolean getIsOverTheCounter() {
		return isOverTheCounter;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetIsOverTheCounter(org.hl7.fhir.Boolean newIsOverTheCounter, NotificationChain msgs) {
		org.hl7.fhir.Boolean oldIsOverTheCounter = isOverTheCounter;
		isOverTheCounter = newIsOverTheCounter;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FhirPackage.MEDICATION__IS_OVER_THE_COUNTER, oldIsOverTheCounter, newIsOverTheCounter);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setIsOverTheCounter(org.hl7.fhir.Boolean newIsOverTheCounter) {
		if (newIsOverTheCounter != isOverTheCounter) {
			NotificationChain msgs = null;
			if (isOverTheCounter != null)
				msgs = ((InternalEObject)isOverTheCounter).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FhirPackage.MEDICATION__IS_OVER_THE_COUNTER, null, msgs);
			if (newIsOverTheCounter != null)
				msgs = ((InternalEObject)newIsOverTheCounter).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FhirPackage.MEDICATION__IS_OVER_THE_COUNTER, null, msgs);
			msgs = basicSetIsOverTheCounter(newIsOverTheCounter, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FhirPackage.MEDICATION__IS_OVER_THE_COUNTER, newIsOverTheCounter, newIsOverTheCounter));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Reference getManufacturer() {
		return manufacturer;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetManufacturer(Reference newManufacturer, NotificationChain msgs) {
		Reference oldManufacturer = manufacturer;
		manufacturer = newManufacturer;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FhirPackage.MEDICATION__MANUFACTURER, oldManufacturer, newManufacturer);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setManufacturer(Reference newManufacturer) {
		if (newManufacturer != manufacturer) {
			NotificationChain msgs = null;
			if (manufacturer != null)
				msgs = ((InternalEObject)manufacturer).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FhirPackage.MEDICATION__MANUFACTURER, null, msgs);
			if (newManufacturer != null)
				msgs = ((InternalEObject)newManufacturer).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FhirPackage.MEDICATION__MANUFACTURER, null, msgs);
			msgs = basicSetManufacturer(newManufacturer, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FhirPackage.MEDICATION__MANUFACTURER, newManufacturer, newManufacturer));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public MedicationProduct getProduct() {
		return product;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetProduct(MedicationProduct newProduct, NotificationChain msgs) {
		MedicationProduct oldProduct = product;
		product = newProduct;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FhirPackage.MEDICATION__PRODUCT, oldProduct, newProduct);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setProduct(MedicationProduct newProduct) {
		if (newProduct != product) {
			NotificationChain msgs = null;
			if (product != null)
				msgs = ((InternalEObject)product).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FhirPackage.MEDICATION__PRODUCT, null, msgs);
			if (newProduct != null)
				msgs = ((InternalEObject)newProduct).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FhirPackage.MEDICATION__PRODUCT, null, msgs);
			msgs = basicSetProduct(newProduct, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FhirPackage.MEDICATION__PRODUCT, newProduct, newProduct));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public MedicationPackage getPackage() {
		return package_;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetPackage(MedicationPackage newPackage, NotificationChain msgs) {
		MedicationPackage oldPackage = package_;
		package_ = newPackage;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FhirPackage.MEDICATION__PACKAGE, oldPackage, newPackage);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setPackage(MedicationPackage newPackage) {
		if (newPackage != package_) {
			NotificationChain msgs = null;
			if (package_ != null)
				msgs = ((InternalEObject)package_).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FhirPackage.MEDICATION__PACKAGE, null, msgs);
			if (newPackage != null)
				msgs = ((InternalEObject)newPackage).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FhirPackage.MEDICATION__PACKAGE, null, msgs);
			msgs = basicSetPackage(newPackage, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FhirPackage.MEDICATION__PACKAGE, newPackage, newPackage));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@XmlElement
	public List<Attachment> getImage() {
		if (image == null) {
			image = new EObjectContainmentEList<Attachment>(Attachment.class, this, FhirPackage.MEDICATION__IMAGE);
		}
		return image;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case FhirPackage.MEDICATION__CODE:
				return basicSetCode(null, msgs);
			case FhirPackage.MEDICATION__STATUS:
				return basicSetStatus(null, msgs);
			case FhirPackage.MEDICATION__IS_BRAND:
				return basicSetIsBrand(null, msgs);
			case FhirPackage.MEDICATION__IS_OVER_THE_COUNTER:
				return basicSetIsOverTheCounter(null, msgs);
			case FhirPackage.MEDICATION__MANUFACTURER:
				return basicSetManufacturer(null, msgs);
			case FhirPackage.MEDICATION__PRODUCT:
				return basicSetProduct(null, msgs);
			case FhirPackage.MEDICATION__PACKAGE:
				return basicSetPackage(null, msgs);
			case FhirPackage.MEDICATION__IMAGE:
				return ((InternalEList<?>)getImage()).basicRemove(otherEnd, msgs);
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
			case FhirPackage.MEDICATION__CODE:
				return getCode();
			case FhirPackage.MEDICATION__STATUS:
				return getStatus();
			case FhirPackage.MEDICATION__IS_BRAND:
				return getIsBrand();
			case FhirPackage.MEDICATION__IS_OVER_THE_COUNTER:
				return getIsOverTheCounter();
			case FhirPackage.MEDICATION__MANUFACTURER:
				return getManufacturer();
			case FhirPackage.MEDICATION__PRODUCT:
				return getProduct();
			case FhirPackage.MEDICATION__PACKAGE:
				return getPackage();
			case FhirPackage.MEDICATION__IMAGE:
				return getImage();
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
			case FhirPackage.MEDICATION__CODE:
				setCode((CodeableConcept)newValue);
				return;
			case FhirPackage.MEDICATION__STATUS:
				setStatus((MedicationStatus)newValue);
				return;
			case FhirPackage.MEDICATION__IS_BRAND:
				setIsBrand((org.hl7.fhir.Boolean)newValue);
				return;
			case FhirPackage.MEDICATION__IS_OVER_THE_COUNTER:
				setIsOverTheCounter((org.hl7.fhir.Boolean)newValue);
				return;
			case FhirPackage.MEDICATION__MANUFACTURER:
				setManufacturer((Reference)newValue);
				return;
			case FhirPackage.MEDICATION__PRODUCT:
				setProduct((MedicationProduct)newValue);
				return;
			case FhirPackage.MEDICATION__PACKAGE:
				setPackage((MedicationPackage)newValue);
				return;
			case FhirPackage.MEDICATION__IMAGE:
				getImage().clear();
				getImage().addAll((Collection<? extends Attachment>)newValue);
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
			case FhirPackage.MEDICATION__CODE:
				setCode((CodeableConcept)null);
				return;
			case FhirPackage.MEDICATION__STATUS:
				setStatus((MedicationStatus)null);
				return;
			case FhirPackage.MEDICATION__IS_BRAND:
				setIsBrand((org.hl7.fhir.Boolean)null);
				return;
			case FhirPackage.MEDICATION__IS_OVER_THE_COUNTER:
				setIsOverTheCounter((org.hl7.fhir.Boolean)null);
				return;
			case FhirPackage.MEDICATION__MANUFACTURER:
				setManufacturer((Reference)null);
				return;
			case FhirPackage.MEDICATION__PRODUCT:
				setProduct((MedicationProduct)null);
				return;
			case FhirPackage.MEDICATION__PACKAGE:
				setPackage((MedicationPackage)null);
				return;
			case FhirPackage.MEDICATION__IMAGE:
				getImage().clear();
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
			case FhirPackage.MEDICATION__CODE:
				return code != null;
			case FhirPackage.MEDICATION__STATUS:
				return status != null;
			case FhirPackage.MEDICATION__IS_BRAND:
				return isBrand != null;
			case FhirPackage.MEDICATION__IS_OVER_THE_COUNTER:
				return isOverTheCounter != null;
			case FhirPackage.MEDICATION__MANUFACTURER:
				return manufacturer != null;
			case FhirPackage.MEDICATION__PRODUCT:
				return product != null;
			case FhirPackage.MEDICATION__PACKAGE:
				return package_ != null;
			case FhirPackage.MEDICATION__IMAGE:
				return image != null && !image.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //MedicationImpl
