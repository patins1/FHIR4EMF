/**
 */
package org.hl7.fhir.impl;

import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.hl7.fhir.CodeableConcept;
import org.hl7.fhir.ExplanationOfBenefitPayee;
import org.hl7.fhir.FhirPackage;
import org.hl7.fhir.Identifier;
import org.hl7.fhir.Reference;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Explanation Of Benefit Payee</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.hl7.fhir.impl.ExplanationOfBenefitPayeeImpl#getType <em>Type</em>}</li>
 *   <li>{@link org.hl7.fhir.impl.ExplanationOfBenefitPayeeImpl#getResourceType <em>Resource Type</em>}</li>
 *   <li>{@link org.hl7.fhir.impl.ExplanationOfBenefitPayeeImpl#getPartyIdentifier <em>Party Identifier</em>}</li>
 *   <li>{@link org.hl7.fhir.impl.ExplanationOfBenefitPayeeImpl#getPartyReference <em>Party Reference</em>}</li>
 * </ul>
 *
 * @generated
 */
@XmlType(name = "ExplanationOfBenefitPayee", namespace = "http://hl7.org/fhir")
@XmlRootElement(name = "fhir.ExplanationOfBenefitPayee")
public class ExplanationOfBenefitPayeeImpl extends BackboneElementImpl implements ExplanationOfBenefitPayee {
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
	 * The cached value of the '{@link #getResourceType() <em>Resource Type</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getResourceType()
	 * @generated
	 * @ordered
	 */
	protected CodeableConcept resourceType;

	/**
	 * The cached value of the '{@link #getPartyIdentifier() <em>Party Identifier</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPartyIdentifier()
	 * @generated
	 * @ordered
	 */
	protected Identifier partyIdentifier;

	/**
	 * The cached value of the '{@link #getPartyReference() <em>Party Reference</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPartyReference()
	 * @generated
	 * @ordered
	 */
	protected Reference partyReference;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ExplanationOfBenefitPayeeImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return FhirPackage.eINSTANCE.getExplanationOfBenefitPayee();
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
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FhirPackage.EXPLANATION_OF_BENEFIT_PAYEE__TYPE, oldType, newType);
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
				msgs = ((InternalEObject)type).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FhirPackage.EXPLANATION_OF_BENEFIT_PAYEE__TYPE, null, msgs);
			if (newType != null)
				msgs = ((InternalEObject)newType).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FhirPackage.EXPLANATION_OF_BENEFIT_PAYEE__TYPE, null, msgs);
			msgs = basicSetType(newType, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FhirPackage.EXPLANATION_OF_BENEFIT_PAYEE__TYPE, newType, newType));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CodeableConcept getResourceType() {
		return resourceType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetResourceType(CodeableConcept newResourceType, NotificationChain msgs) {
		CodeableConcept oldResourceType = resourceType;
		resourceType = newResourceType;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FhirPackage.EXPLANATION_OF_BENEFIT_PAYEE__RESOURCE_TYPE, oldResourceType, newResourceType);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setResourceType(CodeableConcept newResourceType) {
		if (newResourceType != resourceType) {
			NotificationChain msgs = null;
			if (resourceType != null)
				msgs = ((InternalEObject)resourceType).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FhirPackage.EXPLANATION_OF_BENEFIT_PAYEE__RESOURCE_TYPE, null, msgs);
			if (newResourceType != null)
				msgs = ((InternalEObject)newResourceType).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FhirPackage.EXPLANATION_OF_BENEFIT_PAYEE__RESOURCE_TYPE, null, msgs);
			msgs = basicSetResourceType(newResourceType, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FhirPackage.EXPLANATION_OF_BENEFIT_PAYEE__RESOURCE_TYPE, newResourceType, newResourceType));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Identifier getPartyIdentifier() {
		return partyIdentifier;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetPartyIdentifier(Identifier newPartyIdentifier, NotificationChain msgs) {
		Identifier oldPartyIdentifier = partyIdentifier;
		partyIdentifier = newPartyIdentifier;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FhirPackage.EXPLANATION_OF_BENEFIT_PAYEE__PARTY_IDENTIFIER, oldPartyIdentifier, newPartyIdentifier);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setPartyIdentifier(Identifier newPartyIdentifier) {
		if (newPartyIdentifier != partyIdentifier) {
			NotificationChain msgs = null;
			if (partyIdentifier != null)
				msgs = ((InternalEObject)partyIdentifier).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FhirPackage.EXPLANATION_OF_BENEFIT_PAYEE__PARTY_IDENTIFIER, null, msgs);
			if (newPartyIdentifier != null)
				msgs = ((InternalEObject)newPartyIdentifier).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FhirPackage.EXPLANATION_OF_BENEFIT_PAYEE__PARTY_IDENTIFIER, null, msgs);
			msgs = basicSetPartyIdentifier(newPartyIdentifier, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FhirPackage.EXPLANATION_OF_BENEFIT_PAYEE__PARTY_IDENTIFIER, newPartyIdentifier, newPartyIdentifier));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Reference getPartyReference() {
		return partyReference;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetPartyReference(Reference newPartyReference, NotificationChain msgs) {
		Reference oldPartyReference = partyReference;
		partyReference = newPartyReference;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FhirPackage.EXPLANATION_OF_BENEFIT_PAYEE__PARTY_REFERENCE, oldPartyReference, newPartyReference);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setPartyReference(Reference newPartyReference) {
		if (newPartyReference != partyReference) {
			NotificationChain msgs = null;
			if (partyReference != null)
				msgs = ((InternalEObject)partyReference).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FhirPackage.EXPLANATION_OF_BENEFIT_PAYEE__PARTY_REFERENCE, null, msgs);
			if (newPartyReference != null)
				msgs = ((InternalEObject)newPartyReference).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FhirPackage.EXPLANATION_OF_BENEFIT_PAYEE__PARTY_REFERENCE, null, msgs);
			msgs = basicSetPartyReference(newPartyReference, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FhirPackage.EXPLANATION_OF_BENEFIT_PAYEE__PARTY_REFERENCE, newPartyReference, newPartyReference));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case FhirPackage.EXPLANATION_OF_BENEFIT_PAYEE__TYPE:
				return basicSetType(null, msgs);
			case FhirPackage.EXPLANATION_OF_BENEFIT_PAYEE__RESOURCE_TYPE:
				return basicSetResourceType(null, msgs);
			case FhirPackage.EXPLANATION_OF_BENEFIT_PAYEE__PARTY_IDENTIFIER:
				return basicSetPartyIdentifier(null, msgs);
			case FhirPackage.EXPLANATION_OF_BENEFIT_PAYEE__PARTY_REFERENCE:
				return basicSetPartyReference(null, msgs);
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
			case FhirPackage.EXPLANATION_OF_BENEFIT_PAYEE__TYPE:
				return getType();
			case FhirPackage.EXPLANATION_OF_BENEFIT_PAYEE__RESOURCE_TYPE:
				return getResourceType();
			case FhirPackage.EXPLANATION_OF_BENEFIT_PAYEE__PARTY_IDENTIFIER:
				return getPartyIdentifier();
			case FhirPackage.EXPLANATION_OF_BENEFIT_PAYEE__PARTY_REFERENCE:
				return getPartyReference();
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
			case FhirPackage.EXPLANATION_OF_BENEFIT_PAYEE__TYPE:
				setType((CodeableConcept)newValue);
				return;
			case FhirPackage.EXPLANATION_OF_BENEFIT_PAYEE__RESOURCE_TYPE:
				setResourceType((CodeableConcept)newValue);
				return;
			case FhirPackage.EXPLANATION_OF_BENEFIT_PAYEE__PARTY_IDENTIFIER:
				setPartyIdentifier((Identifier)newValue);
				return;
			case FhirPackage.EXPLANATION_OF_BENEFIT_PAYEE__PARTY_REFERENCE:
				setPartyReference((Reference)newValue);
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
			case FhirPackage.EXPLANATION_OF_BENEFIT_PAYEE__TYPE:
				setType((CodeableConcept)null);
				return;
			case FhirPackage.EXPLANATION_OF_BENEFIT_PAYEE__RESOURCE_TYPE:
				setResourceType((CodeableConcept)null);
				return;
			case FhirPackage.EXPLANATION_OF_BENEFIT_PAYEE__PARTY_IDENTIFIER:
				setPartyIdentifier((Identifier)null);
				return;
			case FhirPackage.EXPLANATION_OF_BENEFIT_PAYEE__PARTY_REFERENCE:
				setPartyReference((Reference)null);
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
			case FhirPackage.EXPLANATION_OF_BENEFIT_PAYEE__TYPE:
				return type != null;
			case FhirPackage.EXPLANATION_OF_BENEFIT_PAYEE__RESOURCE_TYPE:
				return resourceType != null;
			case FhirPackage.EXPLANATION_OF_BENEFIT_PAYEE__PARTY_IDENTIFIER:
				return partyIdentifier != null;
			case FhirPackage.EXPLANATION_OF_BENEFIT_PAYEE__PARTY_REFERENCE:
				return partyReference != null;
		}
		return super.eIsSet(featureID);
	}

} //ExplanationOfBenefitPayeeImpl