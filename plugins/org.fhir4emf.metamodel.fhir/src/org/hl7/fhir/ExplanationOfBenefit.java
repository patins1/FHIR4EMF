/**
 */
package org.hl7.fhir;

import java.util.List;

import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;

import org.hl7.fhir.jaxb.ExplanationOfBenefitImplAdapter;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Explanation Of Benefit</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * This resource provides: the claim details; adjudication details from the processing of a Claim; and optionally account balance information, for informing the subscriber of the benefits provided.
 * If the element is present, it must have either a @value, an @id, or extensions
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.hl7.fhir.ExplanationOfBenefit#getIdentifier <em>Identifier</em>}</li>
 *   <li>{@link org.hl7.fhir.ExplanationOfBenefit#getStatus <em>Status</em>}</li>
 *   <li>{@link org.hl7.fhir.ExplanationOfBenefit#getType <em>Type</em>}</li>
 *   <li>{@link org.hl7.fhir.ExplanationOfBenefit#getSubType <em>Sub Type</em>}</li>
 *   <li>{@link org.hl7.fhir.ExplanationOfBenefit#getPatient <em>Patient</em>}</li>
 *   <li>{@link org.hl7.fhir.ExplanationOfBenefit#getBillablePeriod <em>Billable Period</em>}</li>
 *   <li>{@link org.hl7.fhir.ExplanationOfBenefit#getCreated <em>Created</em>}</li>
 *   <li>{@link org.hl7.fhir.ExplanationOfBenefit#getEnterer <em>Enterer</em>}</li>
 *   <li>{@link org.hl7.fhir.ExplanationOfBenefit#getInsurer <em>Insurer</em>}</li>
 *   <li>{@link org.hl7.fhir.ExplanationOfBenefit#getProvider <em>Provider</em>}</li>
 *   <li>{@link org.hl7.fhir.ExplanationOfBenefit#getOrganization <em>Organization</em>}</li>
 *   <li>{@link org.hl7.fhir.ExplanationOfBenefit#getReferral <em>Referral</em>}</li>
 *   <li>{@link org.hl7.fhir.ExplanationOfBenefit#getFacility <em>Facility</em>}</li>
 *   <li>{@link org.hl7.fhir.ExplanationOfBenefit#getClaim <em>Claim</em>}</li>
 *   <li>{@link org.hl7.fhir.ExplanationOfBenefit#getClaimResponse <em>Claim Response</em>}</li>
 *   <li>{@link org.hl7.fhir.ExplanationOfBenefit#getOutcome <em>Outcome</em>}</li>
 *   <li>{@link org.hl7.fhir.ExplanationOfBenefit#getDisposition <em>Disposition</em>}</li>
 *   <li>{@link org.hl7.fhir.ExplanationOfBenefit#getRelated <em>Related</em>}</li>
 *   <li>{@link org.hl7.fhir.ExplanationOfBenefit#getPrescription <em>Prescription</em>}</li>
 *   <li>{@link org.hl7.fhir.ExplanationOfBenefit#getOriginalPrescription <em>Original Prescription</em>}</li>
 *   <li>{@link org.hl7.fhir.ExplanationOfBenefit#getPayee <em>Payee</em>}</li>
 *   <li>{@link org.hl7.fhir.ExplanationOfBenefit#getInformation <em>Information</em>}</li>
 *   <li>{@link org.hl7.fhir.ExplanationOfBenefit#getCareTeam <em>Care Team</em>}</li>
 *   <li>{@link org.hl7.fhir.ExplanationOfBenefit#getDiagnosis <em>Diagnosis</em>}</li>
 *   <li>{@link org.hl7.fhir.ExplanationOfBenefit#getProcedure <em>Procedure</em>}</li>
 *   <li>{@link org.hl7.fhir.ExplanationOfBenefit#getPrecedence <em>Precedence</em>}</li>
 *   <li>{@link org.hl7.fhir.ExplanationOfBenefit#getInsurance <em>Insurance</em>}</li>
 *   <li>{@link org.hl7.fhir.ExplanationOfBenefit#getAccident <em>Accident</em>}</li>
 *   <li>{@link org.hl7.fhir.ExplanationOfBenefit#getEmploymentImpacted <em>Employment Impacted</em>}</li>
 *   <li>{@link org.hl7.fhir.ExplanationOfBenefit#getHospitalization <em>Hospitalization</em>}</li>
 *   <li>{@link org.hl7.fhir.ExplanationOfBenefit#getItem <em>Item</em>}</li>
 *   <li>{@link org.hl7.fhir.ExplanationOfBenefit#getAddItem <em>Add Item</em>}</li>
 *   <li>{@link org.hl7.fhir.ExplanationOfBenefit#getTotalCost <em>Total Cost</em>}</li>
 *   <li>{@link org.hl7.fhir.ExplanationOfBenefit#getUnallocDeductable <em>Unalloc Deductable</em>}</li>
 *   <li>{@link org.hl7.fhir.ExplanationOfBenefit#getTotalBenefit <em>Total Benefit</em>}</li>
 *   <li>{@link org.hl7.fhir.ExplanationOfBenefit#getPayment <em>Payment</em>}</li>
 *   <li>{@link org.hl7.fhir.ExplanationOfBenefit#getForm <em>Form</em>}</li>
 *   <li>{@link org.hl7.fhir.ExplanationOfBenefit#getProcessNote <em>Process Note</em>}</li>
 *   <li>{@link org.hl7.fhir.ExplanationOfBenefit#getBenefitBalance <em>Benefit Balance</em>}</li>
 * </ul>
 *
 * @see org.hl7.fhir.FhirPackage#getExplanationOfBenefit()
 * @model extendedMetaData="name='ExplanationOfBenefit' kind='elementOnly'"
 * @generated
 */
@XmlJavaTypeAdapter(ExplanationOfBenefitImplAdapter.class)
public interface ExplanationOfBenefit extends DomainResource {
	/**
	 * Returns the value of the '<em><b>Identifier</b></em>' containment reference list.
	 * The list contents are of type {@link org.hl7.fhir.Identifier}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The EOB Business Identifier.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Identifier</em>' containment reference list.
	 * @see org.hl7.fhir.FhirPackage#getExplanationOfBenefit_Identifier()
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
	 * @see #setStatus(ExplanationOfBenefitStatus)
	 * @see org.hl7.fhir.FhirPackage#getExplanationOfBenefit_Status()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='status' namespace='##targetNamespace'"
	 * @generated
	 */
	ExplanationOfBenefitStatus getStatus();

	/**
	 * Sets the value of the '{@link org.hl7.fhir.ExplanationOfBenefit#getStatus <em>Status</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Status</em>' containment reference.
	 * @see #getStatus()
	 * @generated
	 */
	void setStatus(ExplanationOfBenefitStatus value);

	/**
	 * Returns the value of the '<em><b>Type</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The category of claim, eg, oral, pharmacy, vision, insitutional, professional.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Type</em>' containment reference.
	 * @see #setType(CodeableConcept)
	 * @see org.hl7.fhir.FhirPackage#getExplanationOfBenefit_Type()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='type' namespace='##targetNamespace'"
	 * @generated
	 */
	CodeableConcept getType();

	/**
	 * Sets the value of the '{@link org.hl7.fhir.ExplanationOfBenefit#getType <em>Type</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Type</em>' containment reference.
	 * @see #getType()
	 * @generated
	 */
	void setType(CodeableConcept value);

	/**
	 * Returns the value of the '<em><b>Sub Type</b></em>' containment reference list.
	 * The list contents are of type {@link org.hl7.fhir.CodeableConcept}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * A finer grained suite of claim subtype codes which may convey Inpatient vs Outpatient and/or a specialty service. In the US the BillType.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Sub Type</em>' containment reference list.
	 * @see org.hl7.fhir.FhirPackage#getExplanationOfBenefit_SubType()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='subType' namespace='##targetNamespace'"
	 * @generated
	 */
	List<CodeableConcept> getSubType();

	/**
	 * Returns the value of the '<em><b>Patient</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Patient Resource.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Patient</em>' containment reference.
	 * @see #setPatient(Reference)
	 * @see org.hl7.fhir.FhirPackage#getExplanationOfBenefit_Patient()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='patient' namespace='##targetNamespace'"
	 * @generated
	 */
	Reference getPatient();

	/**
	 * Sets the value of the '{@link org.hl7.fhir.ExplanationOfBenefit#getPatient <em>Patient</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Patient</em>' containment reference.
	 * @see #getPatient()
	 * @generated
	 */
	void setPatient(Reference value);

	/**
	 * Returns the value of the '<em><b>Billable Period</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The billable period for which charges are being submitted.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Billable Period</em>' containment reference.
	 * @see #setBillablePeriod(Period)
	 * @see org.hl7.fhir.FhirPackage#getExplanationOfBenefit_BillablePeriod()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='billablePeriod' namespace='##targetNamespace'"
	 * @generated
	 */
	Period getBillablePeriod();

	/**
	 * Sets the value of the '{@link org.hl7.fhir.ExplanationOfBenefit#getBillablePeriod <em>Billable Period</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Billable Period</em>' containment reference.
	 * @see #getBillablePeriod()
	 * @generated
	 */
	void setBillablePeriod(Period value);

	/**
	 * Returns the value of the '<em><b>Created</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The date when the EOB was created.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Created</em>' containment reference.
	 * @see #setCreated(DateTime)
	 * @see org.hl7.fhir.FhirPackage#getExplanationOfBenefit_Created()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='created' namespace='##targetNamespace'"
	 * @generated
	 */
	DateTime getCreated();

	/**
	 * Sets the value of the '{@link org.hl7.fhir.ExplanationOfBenefit#getCreated <em>Created</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Created</em>' containment reference.
	 * @see #getCreated()
	 * @generated
	 */
	void setCreated(DateTime value);

	/**
	 * Returns the value of the '<em><b>Enterer</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The person who created the explanation of benefit.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Enterer</em>' containment reference.
	 * @see #setEnterer(Reference)
	 * @see org.hl7.fhir.FhirPackage#getExplanationOfBenefit_Enterer()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='enterer' namespace='##targetNamespace'"
	 * @generated
	 */
	Reference getEnterer();

	/**
	 * Sets the value of the '{@link org.hl7.fhir.ExplanationOfBenefit#getEnterer <em>Enterer</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Enterer</em>' containment reference.
	 * @see #getEnterer()
	 * @generated
	 */
	void setEnterer(Reference value);

	/**
	 * Returns the value of the '<em><b>Insurer</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The insurer which is responsible for the explanation of benefit.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Insurer</em>' containment reference.
	 * @see #setInsurer(Reference)
	 * @see org.hl7.fhir.FhirPackage#getExplanationOfBenefit_Insurer()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='insurer' namespace='##targetNamespace'"
	 * @generated
	 */
	Reference getInsurer();

	/**
	 * Sets the value of the '{@link org.hl7.fhir.ExplanationOfBenefit#getInsurer <em>Insurer</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Insurer</em>' containment reference.
	 * @see #getInsurer()
	 * @generated
	 */
	void setInsurer(Reference value);

	/**
	 * Returns the value of the '<em><b>Provider</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The provider which is responsible for the claim.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Provider</em>' containment reference.
	 * @see #setProvider(Reference)
	 * @see org.hl7.fhir.FhirPackage#getExplanationOfBenefit_Provider()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='provider' namespace='##targetNamespace'"
	 * @generated
	 */
	Reference getProvider();

	/**
	 * Sets the value of the '{@link org.hl7.fhir.ExplanationOfBenefit#getProvider <em>Provider</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Provider</em>' containment reference.
	 * @see #getProvider()
	 * @generated
	 */
	void setProvider(Reference value);

	/**
	 * Returns the value of the '<em><b>Organization</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The provider which is responsible for the claim.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Organization</em>' containment reference.
	 * @see #setOrganization(Reference)
	 * @see org.hl7.fhir.FhirPackage#getExplanationOfBenefit_Organization()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='organization' namespace='##targetNamespace'"
	 * @generated
	 */
	Reference getOrganization();

	/**
	 * Sets the value of the '{@link org.hl7.fhir.ExplanationOfBenefit#getOrganization <em>Organization</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Organization</em>' containment reference.
	 * @see #getOrganization()
	 * @generated
	 */
	void setOrganization(Reference value);

	/**
	 * Returns the value of the '<em><b>Referral</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The referral resource which lists the date, practitioner, reason and other supporting information.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Referral</em>' containment reference.
	 * @see #setReferral(Reference)
	 * @see org.hl7.fhir.FhirPackage#getExplanationOfBenefit_Referral()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='referral' namespace='##targetNamespace'"
	 * @generated
	 */
	Reference getReferral();

	/**
	 * Sets the value of the '{@link org.hl7.fhir.ExplanationOfBenefit#getReferral <em>Referral</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Referral</em>' containment reference.
	 * @see #getReferral()
	 * @generated
	 */
	void setReferral(Reference value);

	/**
	 * Returns the value of the '<em><b>Facility</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Facility where the services were provided.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Facility</em>' containment reference.
	 * @see #setFacility(Reference)
	 * @see org.hl7.fhir.FhirPackage#getExplanationOfBenefit_Facility()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='facility' namespace='##targetNamespace'"
	 * @generated
	 */
	Reference getFacility();

	/**
	 * Sets the value of the '{@link org.hl7.fhir.ExplanationOfBenefit#getFacility <em>Facility</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Facility</em>' containment reference.
	 * @see #getFacility()
	 * @generated
	 */
	void setFacility(Reference value);

	/**
	 * Returns the value of the '<em><b>Claim</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The business identifier for the instance: invoice number, claim number, pre-determination or pre-authorization number.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Claim</em>' containment reference.
	 * @see #setClaim(Reference)
	 * @see org.hl7.fhir.FhirPackage#getExplanationOfBenefit_Claim()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='claim' namespace='##targetNamespace'"
	 * @generated
	 */
	Reference getClaim();

	/**
	 * Sets the value of the '{@link org.hl7.fhir.ExplanationOfBenefit#getClaim <em>Claim</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Claim</em>' containment reference.
	 * @see #getClaim()
	 * @generated
	 */
	void setClaim(Reference value);

	/**
	 * Returns the value of the '<em><b>Claim Response</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The business identifier for the instance: invoice number, claim number, pre-determination or pre-authorization number.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Claim Response</em>' containment reference.
	 * @see #setClaimResponse(Reference)
	 * @see org.hl7.fhir.FhirPackage#getExplanationOfBenefit_ClaimResponse()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='claimResponse' namespace='##targetNamespace'"
	 * @generated
	 */
	Reference getClaimResponse();

	/**
	 * Sets the value of the '{@link org.hl7.fhir.ExplanationOfBenefit#getClaimResponse <em>Claim Response</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Claim Response</em>' containment reference.
	 * @see #getClaimResponse()
	 * @generated
	 */
	void setClaimResponse(Reference value);

	/**
	 * Returns the value of the '<em><b>Outcome</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Processing outcome errror, partial or complete processing.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Outcome</em>' containment reference.
	 * @see #setOutcome(CodeableConcept)
	 * @see org.hl7.fhir.FhirPackage#getExplanationOfBenefit_Outcome()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='outcome' namespace='##targetNamespace'"
	 * @generated
	 */
	CodeableConcept getOutcome();

	/**
	 * Sets the value of the '{@link org.hl7.fhir.ExplanationOfBenefit#getOutcome <em>Outcome</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Outcome</em>' containment reference.
	 * @see #getOutcome()
	 * @generated
	 */
	void setOutcome(CodeableConcept value);

	/**
	 * Returns the value of the '<em><b>Disposition</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * A description of the status of the adjudication.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Disposition</em>' containment reference.
	 * @see #setDisposition(org.hl7.fhir.String)
	 * @see org.hl7.fhir.FhirPackage#getExplanationOfBenefit_Disposition()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='disposition' namespace='##targetNamespace'"
	 * @generated
	 */
	org.hl7.fhir.String getDisposition();

	/**
	 * Sets the value of the '{@link org.hl7.fhir.ExplanationOfBenefit#getDisposition <em>Disposition</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Disposition</em>' containment reference.
	 * @see #getDisposition()
	 * @generated
	 */
	void setDisposition(org.hl7.fhir.String value);

	/**
	 * Returns the value of the '<em><b>Related</b></em>' containment reference list.
	 * The list contents are of type {@link org.hl7.fhir.ExplanationOfBenefitRelated}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Other claims which are related to this claim such as prior claim versions or for related services.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Related</em>' containment reference list.
	 * @see org.hl7.fhir.FhirPackage#getExplanationOfBenefit_Related()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='related' namespace='##targetNamespace'"
	 * @generated
	 */
	List<ExplanationOfBenefitRelated> getRelated();

	/**
	 * Returns the value of the '<em><b>Prescription</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Prescription to support the dispensing of Pharmacy or Vision products.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Prescription</em>' containment reference.
	 * @see #setPrescription(Reference)
	 * @see org.hl7.fhir.FhirPackage#getExplanationOfBenefit_Prescription()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='prescription' namespace='##targetNamespace'"
	 * @generated
	 */
	Reference getPrescription();

	/**
	 * Sets the value of the '{@link org.hl7.fhir.ExplanationOfBenefit#getPrescription <em>Prescription</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Prescription</em>' containment reference.
	 * @see #getPrescription()
	 * @generated
	 */
	void setPrescription(Reference value);

	/**
	 * Returns the value of the '<em><b>Original Prescription</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Original prescription which has been superceded by this prescription to support the dispensing of pharmacy services, medications or products. For example, a physician may prescribe a medication which the pharmacy determines is contraindicated, or for which the patient has an intolerance, and therefor issues a new precription for an alternate medication which has the same theraputic intent. The prescription from the pharmacy becomes the 'prescription' and that from the physician becomes the 'original prescription'.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Original Prescription</em>' containment reference.
	 * @see #setOriginalPrescription(Reference)
	 * @see org.hl7.fhir.FhirPackage#getExplanationOfBenefit_OriginalPrescription()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='originalPrescription' namespace='##targetNamespace'"
	 * @generated
	 */
	Reference getOriginalPrescription();

	/**
	 * Sets the value of the '{@link org.hl7.fhir.ExplanationOfBenefit#getOriginalPrescription <em>Original Prescription</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Original Prescription</em>' containment reference.
	 * @see #getOriginalPrescription()
	 * @generated
	 */
	void setOriginalPrescription(Reference value);

	/**
	 * Returns the value of the '<em><b>Payee</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The party to be reimbursed for the services.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Payee</em>' containment reference.
	 * @see #setPayee(ExplanationOfBenefitPayee)
	 * @see org.hl7.fhir.FhirPackage#getExplanationOfBenefit_Payee()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='payee' namespace='##targetNamespace'"
	 * @generated
	 */
	ExplanationOfBenefitPayee getPayee();

	/**
	 * Sets the value of the '{@link org.hl7.fhir.ExplanationOfBenefit#getPayee <em>Payee</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Payee</em>' containment reference.
	 * @see #getPayee()
	 * @generated
	 */
	void setPayee(ExplanationOfBenefitPayee value);

	/**
	 * Returns the value of the '<em><b>Information</b></em>' containment reference list.
	 * The list contents are of type {@link org.hl7.fhir.ExplanationOfBenefitInformation}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Additional information codes regarding exceptions, special considerations, the condition, situation, prior or concurrent issues. Often there are mutiple jurisdiction specific valuesets which are required.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Information</em>' containment reference list.
	 * @see org.hl7.fhir.FhirPackage#getExplanationOfBenefit_Information()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='information' namespace='##targetNamespace'"
	 * @generated
	 */
	List<ExplanationOfBenefitInformation> getInformation();

	/**
	 * Returns the value of the '<em><b>Care Team</b></em>' containment reference list.
	 * The list contents are of type {@link org.hl7.fhir.ExplanationOfBenefitCareTeam}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The members of the team who provided the overall service as well as their role and whether responsible and qualifications.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Care Team</em>' containment reference list.
	 * @see org.hl7.fhir.FhirPackage#getExplanationOfBenefit_CareTeam()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='careTeam' namespace='##targetNamespace'"
	 * @generated
	 */
	List<ExplanationOfBenefitCareTeam> getCareTeam();

	/**
	 * Returns the value of the '<em><b>Diagnosis</b></em>' containment reference list.
	 * The list contents are of type {@link org.hl7.fhir.ExplanationOfBenefitDiagnosis}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Ordered list of patient diagnosis for which care is sought.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Diagnosis</em>' containment reference list.
	 * @see org.hl7.fhir.FhirPackage#getExplanationOfBenefit_Diagnosis()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='diagnosis' namespace='##targetNamespace'"
	 * @generated
	 */
	List<ExplanationOfBenefitDiagnosis> getDiagnosis();

	/**
	 * Returns the value of the '<em><b>Procedure</b></em>' containment reference list.
	 * The list contents are of type {@link org.hl7.fhir.ExplanationOfBenefitProcedure}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Ordered list of patient procedures performed to support the adjudication.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Procedure</em>' containment reference list.
	 * @see org.hl7.fhir.FhirPackage#getExplanationOfBenefit_Procedure()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='procedure' namespace='##targetNamespace'"
	 * @generated
	 */
	List<ExplanationOfBenefitProcedure> getProcedure();

	/**
	 * Returns the value of the '<em><b>Precedence</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Precedence (primary, secondary, etc.).
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Precedence</em>' containment reference.
	 * @see #setPrecedence(PositiveInt)
	 * @see org.hl7.fhir.FhirPackage#getExplanationOfBenefit_Precedence()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='precedence' namespace='##targetNamespace'"
	 * @generated
	 */
	PositiveInt getPrecedence();

	/**
	 * Sets the value of the '{@link org.hl7.fhir.ExplanationOfBenefit#getPrecedence <em>Precedence</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Precedence</em>' containment reference.
	 * @see #getPrecedence()
	 * @generated
	 */
	void setPrecedence(PositiveInt value);

	/**
	 * Returns the value of the '<em><b>Insurance</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Financial instrument by which payment information for health care.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Insurance</em>' containment reference.
	 * @see #setInsurance(ExplanationOfBenefitInsurance)
	 * @see org.hl7.fhir.FhirPackage#getExplanationOfBenefit_Insurance()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='insurance' namespace='##targetNamespace'"
	 * @generated
	 */
	ExplanationOfBenefitInsurance getInsurance();

	/**
	 * Sets the value of the '{@link org.hl7.fhir.ExplanationOfBenefit#getInsurance <em>Insurance</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Insurance</em>' containment reference.
	 * @see #getInsurance()
	 * @generated
	 */
	void setInsurance(ExplanationOfBenefitInsurance value);

	/**
	 * Returns the value of the '<em><b>Accident</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * An accident which resulted in the need for healthcare services.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Accident</em>' containment reference.
	 * @see #setAccident(ExplanationOfBenefitAccident)
	 * @see org.hl7.fhir.FhirPackage#getExplanationOfBenefit_Accident()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='accident' namespace='##targetNamespace'"
	 * @generated
	 */
	ExplanationOfBenefitAccident getAccident();

	/**
	 * Sets the value of the '{@link org.hl7.fhir.ExplanationOfBenefit#getAccident <em>Accident</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Accident</em>' containment reference.
	 * @see #getAccident()
	 * @generated
	 */
	void setAccident(ExplanationOfBenefitAccident value);

	/**
	 * Returns the value of the '<em><b>Employment Impacted</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The start and optional end dates of when the patient was precluded from working due to the treatable condition(s).
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Employment Impacted</em>' containment reference.
	 * @see #setEmploymentImpacted(Period)
	 * @see org.hl7.fhir.FhirPackage#getExplanationOfBenefit_EmploymentImpacted()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='employmentImpacted' namespace='##targetNamespace'"
	 * @generated
	 */
	Period getEmploymentImpacted();

	/**
	 * Sets the value of the '{@link org.hl7.fhir.ExplanationOfBenefit#getEmploymentImpacted <em>Employment Impacted</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Employment Impacted</em>' containment reference.
	 * @see #getEmploymentImpacted()
	 * @generated
	 */
	void setEmploymentImpacted(Period value);

	/**
	 * Returns the value of the '<em><b>Hospitalization</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The start and optional end dates of when the patient was confined to a treatment center.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Hospitalization</em>' containment reference.
	 * @see #setHospitalization(Period)
	 * @see org.hl7.fhir.FhirPackage#getExplanationOfBenefit_Hospitalization()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='hospitalization' namespace='##targetNamespace'"
	 * @generated
	 */
	Period getHospitalization();

	/**
	 * Sets the value of the '{@link org.hl7.fhir.ExplanationOfBenefit#getHospitalization <em>Hospitalization</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Hospitalization</em>' containment reference.
	 * @see #getHospitalization()
	 * @generated
	 */
	void setHospitalization(Period value);

	/**
	 * Returns the value of the '<em><b>Item</b></em>' containment reference list.
	 * The list contents are of type {@link org.hl7.fhir.ExplanationOfBenefitItem}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * First tier of goods and services.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Item</em>' containment reference list.
	 * @see org.hl7.fhir.FhirPackage#getExplanationOfBenefit_Item()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='item' namespace='##targetNamespace'"
	 * @generated
	 */
	List<ExplanationOfBenefitItem> getItem();

	/**
	 * Returns the value of the '<em><b>Add Item</b></em>' containment reference list.
	 * The list contents are of type {@link org.hl7.fhir.ExplanationOfBenefitAddItem}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The first tier service adjudications for payor added services.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Add Item</em>' containment reference list.
	 * @see org.hl7.fhir.FhirPackage#getExplanationOfBenefit_AddItem()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='addItem' namespace='##targetNamespace'"
	 * @generated
	 */
	List<ExplanationOfBenefitAddItem> getAddItem();

	/**
	 * Returns the value of the '<em><b>Total Cost</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The total cost of the services reported.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Total Cost</em>' containment reference.
	 * @see #setTotalCost(Money)
	 * @see org.hl7.fhir.FhirPackage#getExplanationOfBenefit_TotalCost()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='totalCost' namespace='##targetNamespace'"
	 * @generated
	 */
	Money getTotalCost();

	/**
	 * Sets the value of the '{@link org.hl7.fhir.ExplanationOfBenefit#getTotalCost <em>Total Cost</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Total Cost</em>' containment reference.
	 * @see #getTotalCost()
	 * @generated
	 */
	void setTotalCost(Money value);

	/**
	 * Returns the value of the '<em><b>Unalloc Deductable</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The amount of deductable applied which was not allocated to any particular service line.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Unalloc Deductable</em>' containment reference.
	 * @see #setUnallocDeductable(Money)
	 * @see org.hl7.fhir.FhirPackage#getExplanationOfBenefit_UnallocDeductable()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='unallocDeductable' namespace='##targetNamespace'"
	 * @generated
	 */
	Money getUnallocDeductable();

	/**
	 * Sets the value of the '{@link org.hl7.fhir.ExplanationOfBenefit#getUnallocDeductable <em>Unalloc Deductable</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Unalloc Deductable</em>' containment reference.
	 * @see #getUnallocDeductable()
	 * @generated
	 */
	void setUnallocDeductable(Money value);

	/**
	 * Returns the value of the '<em><b>Total Benefit</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Total amount of benefit payable (Equal to sum of the Benefit amounts from all detail lines and additions less the Unallocated Deductable).
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Total Benefit</em>' containment reference.
	 * @see #setTotalBenefit(Money)
	 * @see org.hl7.fhir.FhirPackage#getExplanationOfBenefit_TotalBenefit()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='totalBenefit' namespace='##targetNamespace'"
	 * @generated
	 */
	Money getTotalBenefit();

	/**
	 * Sets the value of the '{@link org.hl7.fhir.ExplanationOfBenefit#getTotalBenefit <em>Total Benefit</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Total Benefit</em>' containment reference.
	 * @see #getTotalBenefit()
	 * @generated
	 */
	void setTotalBenefit(Money value);

	/**
	 * Returns the value of the '<em><b>Payment</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Payment details for the claim if the claim has been paid.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Payment</em>' containment reference.
	 * @see #setPayment(ExplanationOfBenefitPayment)
	 * @see org.hl7.fhir.FhirPackage#getExplanationOfBenefit_Payment()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='payment' namespace='##targetNamespace'"
	 * @generated
	 */
	ExplanationOfBenefitPayment getPayment();

	/**
	 * Sets the value of the '{@link org.hl7.fhir.ExplanationOfBenefit#getPayment <em>Payment</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Payment</em>' containment reference.
	 * @see #getPayment()
	 * @generated
	 */
	void setPayment(ExplanationOfBenefitPayment value);

	/**
	 * Returns the value of the '<em><b>Form</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The form to be used for printing the content.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Form</em>' containment reference.
	 * @see #setForm(CodeableConcept)
	 * @see org.hl7.fhir.FhirPackage#getExplanationOfBenefit_Form()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='form' namespace='##targetNamespace'"
	 * @generated
	 */
	CodeableConcept getForm();

	/**
	 * Sets the value of the '{@link org.hl7.fhir.ExplanationOfBenefit#getForm <em>Form</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Form</em>' containment reference.
	 * @see #getForm()
	 * @generated
	 */
	void setForm(CodeableConcept value);

	/**
	 * Returns the value of the '<em><b>Process Note</b></em>' containment reference list.
	 * The list contents are of type {@link org.hl7.fhir.ExplanationOfBenefitProcessNote}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Note text.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Process Note</em>' containment reference list.
	 * @see org.hl7.fhir.FhirPackage#getExplanationOfBenefit_ProcessNote()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='processNote' namespace='##targetNamespace'"
	 * @generated
	 */
	List<ExplanationOfBenefitProcessNote> getProcessNote();

	/**
	 * Returns the value of the '<em><b>Benefit Balance</b></em>' containment reference list.
	 * The list contents are of type {@link org.hl7.fhir.ExplanationOfBenefitBenefitBalance}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Balance by Benefit Category.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Benefit Balance</em>' containment reference list.
	 * @see org.hl7.fhir.FhirPackage#getExplanationOfBenefit_BenefitBalance()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='benefitBalance' namespace='##targetNamespace'"
	 * @generated
	 */
	List<ExplanationOfBenefitBenefitBalance> getBenefitBalance();

} // ExplanationOfBenefit
