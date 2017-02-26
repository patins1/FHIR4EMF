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

import org.hl7.fhir.CatalogEntry;
import org.hl7.fhir.CatalogRelatedItem;
import org.hl7.fhir.CodeableConcept;
import org.hl7.fhir.DateTime;
import org.hl7.fhir.FhirPackage;
import org.hl7.fhir.Identifier;
import org.hl7.fhir.Reference;
import org.hl7.fhir.jaxb.DateTimeImplAdapter;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Catalog Entry</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.hl7.fhir.impl.CatalogEntryImpl#getType <em>Type</em>}</li>
 *   <li>{@link org.hl7.fhir.impl.CatalogEntryImpl#getReferencedItem <em>Referenced Item</em>}</li>
 *   <li>{@link org.hl7.fhir.impl.CatalogEntryImpl#getIdentifier <em>Identifier</em>}</li>
 *   <li>{@link org.hl7.fhir.impl.CatalogEntryImpl#getAdditionalIdentifier <em>Additional Identifier</em>}</li>
 *   <li>{@link org.hl7.fhir.impl.CatalogEntryImpl#getClassification <em>Classification</em>}</li>
 *   <li>{@link org.hl7.fhir.impl.CatalogEntryImpl#getStatus <em>Status</em>}</li>
 *   <li>{@link org.hl7.fhir.impl.CatalogEntryImpl#getValidFrom <em>Valid From</em>}</li>
 *   <li>{@link org.hl7.fhir.impl.CatalogEntryImpl#getValidTo <em>Valid To</em>}</li>
 *   <li>{@link org.hl7.fhir.impl.CatalogEntryImpl#getLastUpdated <em>Last Updated</em>}</li>
 *   <li>{@link org.hl7.fhir.impl.CatalogEntryImpl#getAdditionalCharacteristic <em>Additional Characteristic</em>}</li>
 *   <li>{@link org.hl7.fhir.impl.CatalogEntryImpl#getAdditionalClassification <em>Additional Classification</em>}</li>
 *   <li>{@link org.hl7.fhir.impl.CatalogEntryImpl#getRelatedItem <em>Related Item</em>}</li>
 * </ul>
 *
 * @generated
 */
@XmlType(name = "CatalogEntry", namespace = "http://hl7.org/fhir")
@XmlRootElement(name = "fhir.CatalogEntry")
public class CatalogEntryImpl extends BackboneElementImpl implements CatalogEntry {
	/**
	 * The cached value of the '{@link #getType() <em>Type</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getType()
	 * @generated
	 * @ordered
	 */
	protected CodeableConcept type;

	/**
	 * The cached value of the '{@link #getReferencedItem() <em>Referenced Item</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getReferencedItem()
	 * @generated
	 * @ordered
	 */
	protected Reference referencedItem;

	/**
	 * The cached value of the '{@link #getIdentifier() <em>Identifier</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getIdentifier()
	 * @generated
	 * @ordered
	 */
	protected Identifier identifier;

	/**
	 * The cached value of the '{@link #getAdditionalIdentifier() <em>Additional Identifier</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAdditionalIdentifier()
	 * @generated
	 * @ordered
	 */
	protected EList<Identifier> additionalIdentifier;

	/**
	 * The cached value of the '{@link #getClassification() <em>Classification</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getClassification()
	 * @generated
	 * @ordered
	 */
	protected EList<Identifier> classification;

	/**
	 * The cached value of the '{@link #getStatus() <em>Status</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getStatus()
	 * @generated
	 * @ordered
	 */
	protected CodeableConcept status;

	/**
	 * The cached value of the '{@link #getValidFrom() <em>Valid From</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getValidFrom()
	 * @generated
	 * @ordered
	 */
	protected DateTime validFrom;

	/**
	 * The cached value of the '{@link #getValidTo() <em>Valid To</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getValidTo()
	 * @generated
	 * @ordered
	 */
	protected DateTime validTo;

	/**
	 * The cached value of the '{@link #getLastUpdated() <em>Last Updated</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLastUpdated()
	 * @generated
	 * @ordered
	 */
	protected DateTime lastUpdated;

	/**
	 * The cached value of the '{@link #getAdditionalCharacteristic() <em>Additional Characteristic</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAdditionalCharacteristic()
	 * @generated
	 * @ordered
	 */
	protected EList<CodeableConcept> additionalCharacteristic;

	/**
	 * The cached value of the '{@link #getAdditionalClassification() <em>Additional Classification</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAdditionalClassification()
	 * @generated
	 * @ordered
	 */
	protected EList<CodeableConcept> additionalClassification;

	/**
	 * The cached value of the '{@link #getRelatedItem() <em>Related Item</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRelatedItem()
	 * @generated
	 * @ordered
	 */
	protected EList<CatalogRelatedItem> relatedItem;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected CatalogEntryImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return FhirPackage.eINSTANCE.getCatalogEntry();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CodeableConcept getType() {
		return type;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetType(CodeableConcept newType, NotificationChain msgs) {
		CodeableConcept oldType = type;
		type = newType;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FhirPackage.CATALOG_ENTRY__TYPE, oldType, newType);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setType(CodeableConcept newType) {
		if (newType != type) {
			NotificationChain msgs = null;
			if (type != null)
				msgs = ((InternalEObject)type).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FhirPackage.CATALOG_ENTRY__TYPE, null, msgs);
			if (newType != null)
				msgs = ((InternalEObject)newType).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FhirPackage.CATALOG_ENTRY__TYPE, null, msgs);
			msgs = basicSetType(newType, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FhirPackage.CATALOG_ENTRY__TYPE, newType, newType));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Reference getReferencedItem() {
		return referencedItem;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetReferencedItem(Reference newReferencedItem, NotificationChain msgs) {
		Reference oldReferencedItem = referencedItem;
		referencedItem = newReferencedItem;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FhirPackage.CATALOG_ENTRY__REFERENCED_ITEM, oldReferencedItem, newReferencedItem);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setReferencedItem(Reference newReferencedItem) {
		if (newReferencedItem != referencedItem) {
			NotificationChain msgs = null;
			if (referencedItem != null)
				msgs = ((InternalEObject)referencedItem).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FhirPackage.CATALOG_ENTRY__REFERENCED_ITEM, null, msgs);
			if (newReferencedItem != null)
				msgs = ((InternalEObject)newReferencedItem).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FhirPackage.CATALOG_ENTRY__REFERENCED_ITEM, null, msgs);
			msgs = basicSetReferencedItem(newReferencedItem, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FhirPackage.CATALOG_ENTRY__REFERENCED_ITEM, newReferencedItem, newReferencedItem));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Identifier getIdentifier() {
		return identifier;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetIdentifier(Identifier newIdentifier, NotificationChain msgs) {
		Identifier oldIdentifier = identifier;
		identifier = newIdentifier;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FhirPackage.CATALOG_ENTRY__IDENTIFIER, oldIdentifier, newIdentifier);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setIdentifier(Identifier newIdentifier) {
		if (newIdentifier != identifier) {
			NotificationChain msgs = null;
			if (identifier != null)
				msgs = ((InternalEObject)identifier).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FhirPackage.CATALOG_ENTRY__IDENTIFIER, null, msgs);
			if (newIdentifier != null)
				msgs = ((InternalEObject)newIdentifier).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FhirPackage.CATALOG_ENTRY__IDENTIFIER, null, msgs);
			msgs = basicSetIdentifier(newIdentifier, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FhirPackage.CATALOG_ENTRY__IDENTIFIER, newIdentifier, newIdentifier));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@XmlElement
	public List<Identifier> getAdditionalIdentifier() {
		if (additionalIdentifier == null) {
			additionalIdentifier = new EObjectContainmentEList<Identifier>(Identifier.class, this, FhirPackage.CATALOG_ENTRY__ADDITIONAL_IDENTIFIER);
		}
		return additionalIdentifier;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@XmlElement
	public List<Identifier> getClassification() {
		if (classification == null) {
			classification = new EObjectContainmentEList<Identifier>(Identifier.class, this, FhirPackage.CATALOG_ENTRY__CLASSIFICATION);
		}
		return classification;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CodeableConcept getStatus() {
		return status;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetStatus(CodeableConcept newStatus, NotificationChain msgs) {
		CodeableConcept oldStatus = status;
		status = newStatus;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FhirPackage.CATALOG_ENTRY__STATUS, oldStatus, newStatus);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setStatus(CodeableConcept newStatus) {
		if (newStatus != status) {
			NotificationChain msgs = null;
			if (status != null)
				msgs = ((InternalEObject)status).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FhirPackage.CATALOG_ENTRY__STATUS, null, msgs);
			if (newStatus != null)
				msgs = ((InternalEObject)newStatus).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FhirPackage.CATALOG_ENTRY__STATUS, null, msgs);
			msgs = basicSetStatus(newStatus, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FhirPackage.CATALOG_ENTRY__STATUS, newStatus, newStatus));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@XmlJavaTypeAdapter(DateTimeImplAdapter.class)
	public DateTime getValidFrom() {
		return validFrom;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetValidFrom(DateTime newValidFrom, NotificationChain msgs) {
		DateTime oldValidFrom = validFrom;
		validFrom = newValidFrom;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FhirPackage.CATALOG_ENTRY__VALID_FROM, oldValidFrom, newValidFrom);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setValidFrom(DateTime newValidFrom) {
		if (newValidFrom != validFrom) {
			NotificationChain msgs = null;
			if (validFrom != null)
				msgs = ((InternalEObject)validFrom).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FhirPackage.CATALOG_ENTRY__VALID_FROM, null, msgs);
			if (newValidFrom != null)
				msgs = ((InternalEObject)newValidFrom).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FhirPackage.CATALOG_ENTRY__VALID_FROM, null, msgs);
			msgs = basicSetValidFrom(newValidFrom, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FhirPackage.CATALOG_ENTRY__VALID_FROM, newValidFrom, newValidFrom));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@XmlJavaTypeAdapter(DateTimeImplAdapter.class)
	public DateTime getValidTo() {
		return validTo;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetValidTo(DateTime newValidTo, NotificationChain msgs) {
		DateTime oldValidTo = validTo;
		validTo = newValidTo;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FhirPackage.CATALOG_ENTRY__VALID_TO, oldValidTo, newValidTo);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setValidTo(DateTime newValidTo) {
		if (newValidTo != validTo) {
			NotificationChain msgs = null;
			if (validTo != null)
				msgs = ((InternalEObject)validTo).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FhirPackage.CATALOG_ENTRY__VALID_TO, null, msgs);
			if (newValidTo != null)
				msgs = ((InternalEObject)newValidTo).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FhirPackage.CATALOG_ENTRY__VALID_TO, null, msgs);
			msgs = basicSetValidTo(newValidTo, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FhirPackage.CATALOG_ENTRY__VALID_TO, newValidTo, newValidTo));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@XmlJavaTypeAdapter(DateTimeImplAdapter.class)
	public DateTime getLastUpdated() {
		return lastUpdated;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetLastUpdated(DateTime newLastUpdated, NotificationChain msgs) {
		DateTime oldLastUpdated = lastUpdated;
		lastUpdated = newLastUpdated;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FhirPackage.CATALOG_ENTRY__LAST_UPDATED, oldLastUpdated, newLastUpdated);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setLastUpdated(DateTime newLastUpdated) {
		if (newLastUpdated != lastUpdated) {
			NotificationChain msgs = null;
			if (lastUpdated != null)
				msgs = ((InternalEObject)lastUpdated).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FhirPackage.CATALOG_ENTRY__LAST_UPDATED, null, msgs);
			if (newLastUpdated != null)
				msgs = ((InternalEObject)newLastUpdated).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FhirPackage.CATALOG_ENTRY__LAST_UPDATED, null, msgs);
			msgs = basicSetLastUpdated(newLastUpdated, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FhirPackage.CATALOG_ENTRY__LAST_UPDATED, newLastUpdated, newLastUpdated));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@XmlElement
	public List<CodeableConcept> getAdditionalCharacteristic() {
		if (additionalCharacteristic == null) {
			additionalCharacteristic = new EObjectContainmentEList<CodeableConcept>(CodeableConcept.class, this, FhirPackage.CATALOG_ENTRY__ADDITIONAL_CHARACTERISTIC);
		}
		return additionalCharacteristic;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@XmlElement
	public List<CodeableConcept> getAdditionalClassification() {
		if (additionalClassification == null) {
			additionalClassification = new EObjectContainmentEList<CodeableConcept>(CodeableConcept.class, this, FhirPackage.CATALOG_ENTRY__ADDITIONAL_CLASSIFICATION);
		}
		return additionalClassification;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@XmlElement
	public List<CatalogRelatedItem> getRelatedItem() {
		if (relatedItem == null) {
			relatedItem = new EObjectContainmentEList<CatalogRelatedItem>(CatalogRelatedItem.class, this, FhirPackage.CATALOG_ENTRY__RELATED_ITEM);
		}
		return relatedItem;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case FhirPackage.CATALOG_ENTRY__TYPE:
				return basicSetType(null, msgs);
			case FhirPackage.CATALOG_ENTRY__REFERENCED_ITEM:
				return basicSetReferencedItem(null, msgs);
			case FhirPackage.CATALOG_ENTRY__IDENTIFIER:
				return basicSetIdentifier(null, msgs);
			case FhirPackage.CATALOG_ENTRY__ADDITIONAL_IDENTIFIER:
				return ((InternalEList<?>)getAdditionalIdentifier()).basicRemove(otherEnd, msgs);
			case FhirPackage.CATALOG_ENTRY__CLASSIFICATION:
				return ((InternalEList<?>)getClassification()).basicRemove(otherEnd, msgs);
			case FhirPackage.CATALOG_ENTRY__STATUS:
				return basicSetStatus(null, msgs);
			case FhirPackage.CATALOG_ENTRY__VALID_FROM:
				return basicSetValidFrom(null, msgs);
			case FhirPackage.CATALOG_ENTRY__VALID_TO:
				return basicSetValidTo(null, msgs);
			case FhirPackage.CATALOG_ENTRY__LAST_UPDATED:
				return basicSetLastUpdated(null, msgs);
			case FhirPackage.CATALOG_ENTRY__ADDITIONAL_CHARACTERISTIC:
				return ((InternalEList<?>)getAdditionalCharacteristic()).basicRemove(otherEnd, msgs);
			case FhirPackage.CATALOG_ENTRY__ADDITIONAL_CLASSIFICATION:
				return ((InternalEList<?>)getAdditionalClassification()).basicRemove(otherEnd, msgs);
			case FhirPackage.CATALOG_ENTRY__RELATED_ITEM:
				return ((InternalEList<?>)getRelatedItem()).basicRemove(otherEnd, msgs);
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
			case FhirPackage.CATALOG_ENTRY__TYPE:
				return getType();
			case FhirPackage.CATALOG_ENTRY__REFERENCED_ITEM:
				return getReferencedItem();
			case FhirPackage.CATALOG_ENTRY__IDENTIFIER:
				return getIdentifier();
			case FhirPackage.CATALOG_ENTRY__ADDITIONAL_IDENTIFIER:
				return getAdditionalIdentifier();
			case FhirPackage.CATALOG_ENTRY__CLASSIFICATION:
				return getClassification();
			case FhirPackage.CATALOG_ENTRY__STATUS:
				return getStatus();
			case FhirPackage.CATALOG_ENTRY__VALID_FROM:
				return getValidFrom();
			case FhirPackage.CATALOG_ENTRY__VALID_TO:
				return getValidTo();
			case FhirPackage.CATALOG_ENTRY__LAST_UPDATED:
				return getLastUpdated();
			case FhirPackage.CATALOG_ENTRY__ADDITIONAL_CHARACTERISTIC:
				return getAdditionalCharacteristic();
			case FhirPackage.CATALOG_ENTRY__ADDITIONAL_CLASSIFICATION:
				return getAdditionalClassification();
			case FhirPackage.CATALOG_ENTRY__RELATED_ITEM:
				return getRelatedItem();
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
			case FhirPackage.CATALOG_ENTRY__TYPE:
				setType((CodeableConcept)newValue);
				return;
			case FhirPackage.CATALOG_ENTRY__REFERENCED_ITEM:
				setReferencedItem((Reference)newValue);
				return;
			case FhirPackage.CATALOG_ENTRY__IDENTIFIER:
				setIdentifier((Identifier)newValue);
				return;
			case FhirPackage.CATALOG_ENTRY__ADDITIONAL_IDENTIFIER:
				getAdditionalIdentifier().clear();
				getAdditionalIdentifier().addAll((Collection<? extends Identifier>)newValue);
				return;
			case FhirPackage.CATALOG_ENTRY__CLASSIFICATION:
				getClassification().clear();
				getClassification().addAll((Collection<? extends Identifier>)newValue);
				return;
			case FhirPackage.CATALOG_ENTRY__STATUS:
				setStatus((CodeableConcept)newValue);
				return;
			case FhirPackage.CATALOG_ENTRY__VALID_FROM:
				setValidFrom((DateTime)newValue);
				return;
			case FhirPackage.CATALOG_ENTRY__VALID_TO:
				setValidTo((DateTime)newValue);
				return;
			case FhirPackage.CATALOG_ENTRY__LAST_UPDATED:
				setLastUpdated((DateTime)newValue);
				return;
			case FhirPackage.CATALOG_ENTRY__ADDITIONAL_CHARACTERISTIC:
				getAdditionalCharacteristic().clear();
				getAdditionalCharacteristic().addAll((Collection<? extends CodeableConcept>)newValue);
				return;
			case FhirPackage.CATALOG_ENTRY__ADDITIONAL_CLASSIFICATION:
				getAdditionalClassification().clear();
				getAdditionalClassification().addAll((Collection<? extends CodeableConcept>)newValue);
				return;
			case FhirPackage.CATALOG_ENTRY__RELATED_ITEM:
				getRelatedItem().clear();
				getRelatedItem().addAll((Collection<? extends CatalogRelatedItem>)newValue);
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
			case FhirPackage.CATALOG_ENTRY__TYPE:
				setType((CodeableConcept)null);
				return;
			case FhirPackage.CATALOG_ENTRY__REFERENCED_ITEM:
				setReferencedItem((Reference)null);
				return;
			case FhirPackage.CATALOG_ENTRY__IDENTIFIER:
				setIdentifier((Identifier)null);
				return;
			case FhirPackage.CATALOG_ENTRY__ADDITIONAL_IDENTIFIER:
				getAdditionalIdentifier().clear();
				return;
			case FhirPackage.CATALOG_ENTRY__CLASSIFICATION:
				getClassification().clear();
				return;
			case FhirPackage.CATALOG_ENTRY__STATUS:
				setStatus((CodeableConcept)null);
				return;
			case FhirPackage.CATALOG_ENTRY__VALID_FROM:
				setValidFrom((DateTime)null);
				return;
			case FhirPackage.CATALOG_ENTRY__VALID_TO:
				setValidTo((DateTime)null);
				return;
			case FhirPackage.CATALOG_ENTRY__LAST_UPDATED:
				setLastUpdated((DateTime)null);
				return;
			case FhirPackage.CATALOG_ENTRY__ADDITIONAL_CHARACTERISTIC:
				getAdditionalCharacteristic().clear();
				return;
			case FhirPackage.CATALOG_ENTRY__ADDITIONAL_CLASSIFICATION:
				getAdditionalClassification().clear();
				return;
			case FhirPackage.CATALOG_ENTRY__RELATED_ITEM:
				getRelatedItem().clear();
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
			case FhirPackage.CATALOG_ENTRY__TYPE:
				return type != null;
			case FhirPackage.CATALOG_ENTRY__REFERENCED_ITEM:
				return referencedItem != null;
			case FhirPackage.CATALOG_ENTRY__IDENTIFIER:
				return identifier != null;
			case FhirPackage.CATALOG_ENTRY__ADDITIONAL_IDENTIFIER:
				return additionalIdentifier != null && !additionalIdentifier.isEmpty();
			case FhirPackage.CATALOG_ENTRY__CLASSIFICATION:
				return classification != null && !classification.isEmpty();
			case FhirPackage.CATALOG_ENTRY__STATUS:
				return status != null;
			case FhirPackage.CATALOG_ENTRY__VALID_FROM:
				return validFrom != null;
			case FhirPackage.CATALOG_ENTRY__VALID_TO:
				return validTo != null;
			case FhirPackage.CATALOG_ENTRY__LAST_UPDATED:
				return lastUpdated != null;
			case FhirPackage.CATALOG_ENTRY__ADDITIONAL_CHARACTERISTIC:
				return additionalCharacteristic != null && !additionalCharacteristic.isEmpty();
			case FhirPackage.CATALOG_ENTRY__ADDITIONAL_CLASSIFICATION:
				return additionalClassification != null && !additionalClassification.isEmpty();
			case FhirPackage.CATALOG_ENTRY__RELATED_ITEM:
				return relatedItem != null && !relatedItem.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //CatalogEntryImpl
