/**
 */
package org.hl7.fhir.impl;

import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.hl7.fhir.CatalogRelatedItem;
import org.hl7.fhir.CodeableConcept;
import org.hl7.fhir.FhirPackage;
import org.hl7.fhir.Reference;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Catalog Related Item</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.hl7.fhir.impl.CatalogRelatedItemImpl#getRelationtype <em>Relationtype</em>}</li>
 *   <li>{@link org.hl7.fhir.impl.CatalogRelatedItemImpl#getType <em>Type</em>}</li>
 *   <li>{@link org.hl7.fhir.impl.CatalogRelatedItemImpl#getIdentifier <em>Identifier</em>}</li>
 * </ul>
 *
 * @generated
 */
@XmlType(name = "CatalogRelatedItem", namespace = "http://hl7.org/fhir")
@XmlRootElement(name = "fhir.CatalogRelatedItem")
public class CatalogRelatedItemImpl extends BackboneElementImpl implements CatalogRelatedItem {
	/**
	 * The cached value of the '{@link #getRelationtype() <em>Relationtype</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRelationtype()
	 * @generated
	 * @ordered
	 */
	protected CodeableConcept relationtype;

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
	 * The cached value of the '{@link #getIdentifier() <em>Identifier</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getIdentifier()
	 * @generated
	 * @ordered
	 */
	protected Reference identifier;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected CatalogRelatedItemImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return FhirPackage.eINSTANCE.getCatalogRelatedItem();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@XmlElement(required = true)
	public CodeableConcept getRelationtype() {
		return relationtype;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetRelationtype(CodeableConcept newRelationtype, NotificationChain msgs) {
		CodeableConcept oldRelationtype = relationtype;
		relationtype = newRelationtype;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FhirPackage.CATALOG_RELATED_ITEM__RELATIONTYPE, oldRelationtype, newRelationtype);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setRelationtype(CodeableConcept newRelationtype) {
		if (newRelationtype != relationtype) {
			NotificationChain msgs = null;
			if (relationtype != null)
				msgs = ((InternalEObject)relationtype).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FhirPackage.CATALOG_RELATED_ITEM__RELATIONTYPE, null, msgs);
			if (newRelationtype != null)
				msgs = ((InternalEObject)newRelationtype).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FhirPackage.CATALOG_RELATED_ITEM__RELATIONTYPE, null, msgs);
			msgs = basicSetRelationtype(newRelationtype, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FhirPackage.CATALOG_RELATED_ITEM__RELATIONTYPE, newRelationtype, newRelationtype));
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
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FhirPackage.CATALOG_RELATED_ITEM__TYPE, oldType, newType);
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
				msgs = ((InternalEObject)type).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FhirPackage.CATALOG_RELATED_ITEM__TYPE, null, msgs);
			if (newType != null)
				msgs = ((InternalEObject)newType).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FhirPackage.CATALOG_RELATED_ITEM__TYPE, null, msgs);
			msgs = basicSetType(newType, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FhirPackage.CATALOG_RELATED_ITEM__TYPE, newType, newType));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@XmlElement(required = true)
	public Reference getIdentifier() {
		return identifier;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetIdentifier(Reference newIdentifier, NotificationChain msgs) {
		Reference oldIdentifier = identifier;
		identifier = newIdentifier;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FhirPackage.CATALOG_RELATED_ITEM__IDENTIFIER, oldIdentifier, newIdentifier);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setIdentifier(Reference newIdentifier) {
		if (newIdentifier != identifier) {
			NotificationChain msgs = null;
			if (identifier != null)
				msgs = ((InternalEObject)identifier).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FhirPackage.CATALOG_RELATED_ITEM__IDENTIFIER, null, msgs);
			if (newIdentifier != null)
				msgs = ((InternalEObject)newIdentifier).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FhirPackage.CATALOG_RELATED_ITEM__IDENTIFIER, null, msgs);
			msgs = basicSetIdentifier(newIdentifier, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FhirPackage.CATALOG_RELATED_ITEM__IDENTIFIER, newIdentifier, newIdentifier));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case FhirPackage.CATALOG_RELATED_ITEM__RELATIONTYPE:
				return basicSetRelationtype(null, msgs);
			case FhirPackage.CATALOG_RELATED_ITEM__TYPE:
				return basicSetType(null, msgs);
			case FhirPackage.CATALOG_RELATED_ITEM__IDENTIFIER:
				return basicSetIdentifier(null, msgs);
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
			case FhirPackage.CATALOG_RELATED_ITEM__RELATIONTYPE:
				return getRelationtype();
			case FhirPackage.CATALOG_RELATED_ITEM__TYPE:
				return getType();
			case FhirPackage.CATALOG_RELATED_ITEM__IDENTIFIER:
				return getIdentifier();
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
			case FhirPackage.CATALOG_RELATED_ITEM__RELATIONTYPE:
				setRelationtype((CodeableConcept)newValue);
				return;
			case FhirPackage.CATALOG_RELATED_ITEM__TYPE:
				setType((CodeableConcept)newValue);
				return;
			case FhirPackage.CATALOG_RELATED_ITEM__IDENTIFIER:
				setIdentifier((Reference)newValue);
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
			case FhirPackage.CATALOG_RELATED_ITEM__RELATIONTYPE:
				setRelationtype((CodeableConcept)null);
				return;
			case FhirPackage.CATALOG_RELATED_ITEM__TYPE:
				setType((CodeableConcept)null);
				return;
			case FhirPackage.CATALOG_RELATED_ITEM__IDENTIFIER:
				setIdentifier((Reference)null);
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
			case FhirPackage.CATALOG_RELATED_ITEM__RELATIONTYPE:
				return relationtype != null;
			case FhirPackage.CATALOG_RELATED_ITEM__TYPE:
				return type != null;
			case FhirPackage.CATALOG_RELATED_ITEM__IDENTIFIER:
				return identifier != null;
		}
		return super.eIsSet(featureID);
	}

} //CatalogRelatedItemImpl
