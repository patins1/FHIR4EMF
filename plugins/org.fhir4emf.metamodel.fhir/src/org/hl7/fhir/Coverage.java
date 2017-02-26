/**
 */
package org.hl7.fhir;

import java.util.List;

import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;

import org.hl7.fhir.jaxb.CoverageImplAdapter;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Coverage</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * Financial instrument which may be used to reimburse or pay for health care products and services.
 * If the element is present, it must have either a @value, an @id, or extensions
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.hl7.fhir.Coverage#getIdentifier <em>Identifier</em>}</li>
 *   <li>{@link org.hl7.fhir.Coverage#getStatus <em>Status</em>}</li>
 *   <li>{@link org.hl7.fhir.Coverage#getType <em>Type</em>}</li>
 *   <li>{@link org.hl7.fhir.Coverage#getPolicyHolder <em>Policy Holder</em>}</li>
 *   <li>{@link org.hl7.fhir.Coverage#getSubscriber <em>Subscriber</em>}</li>
 *   <li>{@link org.hl7.fhir.Coverage#getSubscriberId <em>Subscriber Id</em>}</li>
 *   <li>{@link org.hl7.fhir.Coverage#getBeneficiary <em>Beneficiary</em>}</li>
 *   <li>{@link org.hl7.fhir.Coverage#getRelationship <em>Relationship</em>}</li>
 *   <li>{@link org.hl7.fhir.Coverage#getPeriod <em>Period</em>}</li>
 *   <li>{@link org.hl7.fhir.Coverage#getPayor <em>Payor</em>}</li>
 *   <li>{@link org.hl7.fhir.Coverage#getGrouping <em>Grouping</em>}</li>
 *   <li>{@link org.hl7.fhir.Coverage#getDependent <em>Dependent</em>}</li>
 *   <li>{@link org.hl7.fhir.Coverage#getSequence <em>Sequence</em>}</li>
 *   <li>{@link org.hl7.fhir.Coverage#getOrder <em>Order</em>}</li>
 *   <li>{@link org.hl7.fhir.Coverage#getNetwork <em>Network</em>}</li>
 *   <li>{@link org.hl7.fhir.Coverage#getContract <em>Contract</em>}</li>
 * </ul>
 *
 * @see org.hl7.fhir.FhirPackage#getCoverage()
 * @model extendedMetaData="name='Coverage' kind='elementOnly'"
 * @generated
 */
@XmlJavaTypeAdapter(CoverageImplAdapter.class)
public interface Coverage extends DomainResource {
	/**
	 * Returns the value of the '<em><b>Identifier</b></em>' containment reference list.
	 * The list contents are of type {@link org.hl7.fhir.Identifier}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The main (and possibly only) identifier for the coverage - often referred to as a Member Id, Certificate number, Personal Health Number or Case ID. May be constructed as the concatination of the Coverage.SubscriberID and the Coverage.dependant.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Identifier</em>' containment reference list.
	 * @see org.hl7.fhir.FhirPackage#getCoverage_Identifier()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='identifier' namespace='##targetNamespace'"
	 * @generated
	 */
	List<Identifier> getIdentifier();

	/**
	 * Returns the value of the '<em><b>Status</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The status of the resource instance.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Status</em>' containment reference.
	 * @see #setStatus(Code)
	 * @see org.hl7.fhir.FhirPackage#getCoverage_Status()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='status' namespace='##targetNamespace'"
	 * @generated
	 */
	Code getStatus();

	/**
	 * Sets the value of the '{@link org.hl7.fhir.Coverage#getStatus <em>Status</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Status</em>' containment reference.
	 * @see #getStatus()
	 * @generated
	 */
	void setStatus(Code value);

	/**
	 * Returns the value of the '<em><b>Type</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The type of coverage: social program, medical plan, accident coverage (workers compensation, auto), group health or payment by an individual or organization.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Type</em>' containment reference.
	 * @see #setType(CodeableConcept)
	 * @see org.hl7.fhir.FhirPackage#getCoverage_Type()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='type' namespace='##targetNamespace'"
	 * @generated
	 */
	CodeableConcept getType();

	/**
	 * Sets the value of the '{@link org.hl7.fhir.Coverage#getType <em>Type</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Type</em>' containment reference.
	 * @see #getType()
	 * @generated
	 */
	void setType(CodeableConcept value);

	/**
	 * Returns the value of the '<em><b>Policy Holder</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The party who 'owns' the insurance policy,  may be an individual, corporation or the subscriber's employer.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Policy Holder</em>' containment reference.
	 * @see #setPolicyHolder(Reference)
	 * @see org.hl7.fhir.FhirPackage#getCoverage_PolicyHolder()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='policyHolder' namespace='##targetNamespace'"
	 * @generated
	 */
	Reference getPolicyHolder();

	/**
	 * Sets the value of the '{@link org.hl7.fhir.Coverage#getPolicyHolder <em>Policy Holder</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Policy Holder</em>' containment reference.
	 * @see #getPolicyHolder()
	 * @generated
	 */
	void setPolicyHolder(Reference value);

	/**
	 * Returns the value of the '<em><b>Subscriber</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The party who has signed-up for or 'owns' the contractual relationship to the policy or to whom the benefit of the policy for services rendered to them or their family is due.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Subscriber</em>' containment reference.
	 * @see #setSubscriber(Reference)
	 * @see org.hl7.fhir.FhirPackage#getCoverage_Subscriber()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='subscriber' namespace='##targetNamespace'"
	 * @generated
	 */
	Reference getSubscriber();

	/**
	 * Sets the value of the '{@link org.hl7.fhir.Coverage#getSubscriber <em>Subscriber</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Subscriber</em>' containment reference.
	 * @see #getSubscriber()
	 * @generated
	 */
	void setSubscriber(Reference value);

	/**
	 * Returns the value of the '<em><b>Subscriber Id</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The insurer assigned ID for the Subscriber.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Subscriber Id</em>' containment reference.
	 * @see #setSubscriberId(org.hl7.fhir.String)
	 * @see org.hl7.fhir.FhirPackage#getCoverage_SubscriberId()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='subscriberId' namespace='##targetNamespace'"
	 * @generated
	 */
	org.hl7.fhir.String getSubscriberId();

	/**
	 * Sets the value of the '{@link org.hl7.fhir.Coverage#getSubscriberId <em>Subscriber Id</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Subscriber Id</em>' containment reference.
	 * @see #getSubscriberId()
	 * @generated
	 */
	void setSubscriberId(org.hl7.fhir.String value);

	/**
	 * Returns the value of the '<em><b>Beneficiary</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The party who benefits from the insurance coverage., the patient when services are provided.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Beneficiary</em>' containment reference.
	 * @see #setBeneficiary(Reference)
	 * @see org.hl7.fhir.FhirPackage#getCoverage_Beneficiary()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='beneficiary' namespace='##targetNamespace'"
	 * @generated
	 */
	Reference getBeneficiary();

	/**
	 * Sets the value of the '{@link org.hl7.fhir.Coverage#getBeneficiary <em>Beneficiary</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Beneficiary</em>' containment reference.
	 * @see #getBeneficiary()
	 * @generated
	 */
	void setBeneficiary(Reference value);

	/**
	 * Returns the value of the '<em><b>Relationship</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The relationship of beneficiary (patient) to the subscriber.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Relationship</em>' containment reference.
	 * @see #setRelationship(CodeableConcept)
	 * @see org.hl7.fhir.FhirPackage#getCoverage_Relationship()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='relationship' namespace='##targetNamespace'"
	 * @generated
	 */
	CodeableConcept getRelationship();

	/**
	 * Sets the value of the '{@link org.hl7.fhir.Coverage#getRelationship <em>Relationship</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Relationship</em>' containment reference.
	 * @see #getRelationship()
	 * @generated
	 */
	void setRelationship(CodeableConcept value);

	/**
	 * Returns the value of the '<em><b>Period</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Time period during which the coverage is in force. A missing start date indicates the start date isn't known, a missing end date means the coverage is continuing to be in force.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Period</em>' containment reference.
	 * @see #setPeriod(Period)
	 * @see org.hl7.fhir.FhirPackage#getCoverage_Period()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='period' namespace='##targetNamespace'"
	 * @generated
	 */
	Period getPeriod();

	/**
	 * Sets the value of the '{@link org.hl7.fhir.Coverage#getPeriod <em>Period</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Period</em>' containment reference.
	 * @see #getPeriod()
	 * @generated
	 */
	void setPeriod(Period value);

	/**
	 * Returns the value of the '<em><b>Payor</b></em>' containment reference list.
	 * The list contents are of type {@link org.hl7.fhir.Reference}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The program or plan underwriter or payor including both insurance and non-insurance agreements, such as patient-pay agreements. May provide multiple identifiers such as insurance company identifier or business identifier (BIN number).
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Payor</em>' containment reference list.
	 * @see org.hl7.fhir.FhirPackage#getCoverage_Payor()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='payor' namespace='##targetNamespace'"
	 * @generated
	 */
	List<Reference> getPayor();

	/**
	 * Returns the value of the '<em><b>Grouping</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * A suite of underwrite specific classifiers, for example may be used to identify a class of coverage or employer group, Policy, Plan.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Grouping</em>' containment reference.
	 * @see #setGrouping(CoverageGrouping)
	 * @see org.hl7.fhir.FhirPackage#getCoverage_Grouping()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='grouping' namespace='##targetNamespace'"
	 * @generated
	 */
	CoverageGrouping getGrouping();

	/**
	 * Sets the value of the '{@link org.hl7.fhir.Coverage#getGrouping <em>Grouping</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Grouping</em>' containment reference.
	 * @see #getGrouping()
	 * @generated
	 */
	void setGrouping(CoverageGrouping value);

	/**
	 * Returns the value of the '<em><b>Dependent</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * A unique identifier for a dependent under the coverage.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Dependent</em>' containment reference.
	 * @see #setDependent(org.hl7.fhir.String)
	 * @see org.hl7.fhir.FhirPackage#getCoverage_Dependent()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='dependent' namespace='##targetNamespace'"
	 * @generated
	 */
	org.hl7.fhir.String getDependent();

	/**
	 * Sets the value of the '{@link org.hl7.fhir.Coverage#getDependent <em>Dependent</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Dependent</em>' containment reference.
	 * @see #getDependent()
	 * @generated
	 */
	void setDependent(org.hl7.fhir.String value);

	/**
	 * Returns the value of the '<em><b>Sequence</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * An optional counter for a particular instance of the identified coverage which increments upon each renewal.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Sequence</em>' containment reference.
	 * @see #setSequence(org.hl7.fhir.String)
	 * @see org.hl7.fhir.FhirPackage#getCoverage_Sequence()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='sequence' namespace='##targetNamespace'"
	 * @generated
	 */
	org.hl7.fhir.String getSequence();

	/**
	 * Sets the value of the '{@link org.hl7.fhir.Coverage#getSequence <em>Sequence</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Sequence</em>' containment reference.
	 * @see #getSequence()
	 * @generated
	 */
	void setSequence(org.hl7.fhir.String value);

	/**
	 * Returns the value of the '<em><b>Order</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The order of applicability of this coverage relative to other coverages which are currently inforce. Note, there may be gaps in the numbering and this does not imply primary, secondard etc. as the specific positioning of coverages depends upon the episode of care.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Order</em>' containment reference.
	 * @see #setOrder(PositiveInt)
	 * @see org.hl7.fhir.FhirPackage#getCoverage_Order()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='order' namespace='##targetNamespace'"
	 * @generated
	 */
	PositiveInt getOrder();

	/**
	 * Sets the value of the '{@link org.hl7.fhir.Coverage#getOrder <em>Order</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Order</em>' containment reference.
	 * @see #getOrder()
	 * @generated
	 */
	void setOrder(PositiveInt value);

	/**
	 * Returns the value of the '<em><b>Network</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The insurer-specific identifier for the insurer-defined network of providers to which the beneficiary may seek treatment which will be covered at the 'in-network' rate, otherwise 'out of network' terms and conditions apply.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Network</em>' containment reference.
	 * @see #setNetwork(org.hl7.fhir.String)
	 * @see org.hl7.fhir.FhirPackage#getCoverage_Network()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='network' namespace='##targetNamespace'"
	 * @generated
	 */
	org.hl7.fhir.String getNetwork();

	/**
	 * Sets the value of the '{@link org.hl7.fhir.Coverage#getNetwork <em>Network</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Network</em>' containment reference.
	 * @see #getNetwork()
	 * @generated
	 */
	void setNetwork(org.hl7.fhir.String value);

	/**
	 * Returns the value of the '<em><b>Contract</b></em>' containment reference list.
	 * The list contents are of type {@link org.hl7.fhir.Reference}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The policy(s) which constitute this insurance coverage.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Contract</em>' containment reference list.
	 * @see org.hl7.fhir.FhirPackage#getCoverage_Contract()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='contract' namespace='##targetNamespace'"
	 * @generated
	 */
	List<Reference> getContract();

} // Coverage
