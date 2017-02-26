/**
 */
package org.hl7.fhir;

import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;

import org.hl7.fhir.jaxb.ExplanationOfBenefitCareTeamImplAdapter;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Explanation Of Benefit Care Team</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * This resource provides: the claim details; adjudication details from the processing of a Claim; and optionally account balance information, for informing the subscriber of the benefits provided.
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.hl7.fhir.ExplanationOfBenefitCareTeam#getSequence <em>Sequence</em>}</li>
 *   <li>{@link org.hl7.fhir.ExplanationOfBenefitCareTeam#getProvider <em>Provider</em>}</li>
 *   <li>{@link org.hl7.fhir.ExplanationOfBenefitCareTeam#getResponsible <em>Responsible</em>}</li>
 *   <li>{@link org.hl7.fhir.ExplanationOfBenefitCareTeam#getRole <em>Role</em>}</li>
 *   <li>{@link org.hl7.fhir.ExplanationOfBenefitCareTeam#getQualification <em>Qualification</em>}</li>
 * </ul>
 *
 * @see org.hl7.fhir.FhirPackage#getExplanationOfBenefitCareTeam()
 * @model extendedMetaData="name='ExplanationOfBenefit.CareTeam' kind='elementOnly'"
 * @generated
 */
@XmlJavaTypeAdapter(ExplanationOfBenefitCareTeamImplAdapter.class)
public interface ExplanationOfBenefitCareTeam extends BackboneElement {
	/**
	 * Returns the value of the '<em><b>Sequence</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Sequence of careteam which serves to order and provide a link.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Sequence</em>' containment reference.
	 * @see #setSequence(PositiveInt)
	 * @see org.hl7.fhir.FhirPackage#getExplanationOfBenefitCareTeam_Sequence()
	 * @model containment="true" required="true"
	 *        extendedMetaData="kind='element' name='sequence' namespace='##targetNamespace'"
	 * @generated
	 */
	PositiveInt getSequence();

	/**
	 * Sets the value of the '{@link org.hl7.fhir.ExplanationOfBenefitCareTeam#getSequence <em>Sequence</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Sequence</em>' containment reference.
	 * @see #getSequence()
	 * @generated
	 */
	void setSequence(PositiveInt value);

	/**
	 * Returns the value of the '<em><b>Provider</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The members of the team who provided the overall service.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Provider</em>' containment reference.
	 * @see #setProvider(Reference)
	 * @see org.hl7.fhir.FhirPackage#getExplanationOfBenefitCareTeam_Provider()
	 * @model containment="true" required="true"
	 *        extendedMetaData="kind='element' name='provider' namespace='##targetNamespace'"
	 * @generated
	 */
	Reference getProvider();

	/**
	 * Sets the value of the '{@link org.hl7.fhir.ExplanationOfBenefitCareTeam#getProvider <em>Provider</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Provider</em>' containment reference.
	 * @see #getProvider()
	 * @generated
	 */
	void setProvider(Reference value);

	/**
	 * Returns the value of the '<em><b>Responsible</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The practitioner who is billing and responsible for the claimed services rendered to the patient.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Responsible</em>' containment reference.
	 * @see #setResponsible(org.hl7.fhir.Boolean)
	 * @see org.hl7.fhir.FhirPackage#getExplanationOfBenefitCareTeam_Responsible()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='responsible' namespace='##targetNamespace'"
	 * @generated
	 */
	org.hl7.fhir.Boolean getResponsible();

	/**
	 * Sets the value of the '{@link org.hl7.fhir.ExplanationOfBenefitCareTeam#getResponsible <em>Responsible</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Responsible</em>' containment reference.
	 * @see #getResponsible()
	 * @generated
	 */
	void setResponsible(org.hl7.fhir.Boolean value);

	/**
	 * Returns the value of the '<em><b>Role</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The lead, assisting or supervising practitioner and their discipline if a multidisiplinary team.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Role</em>' containment reference.
	 * @see #setRole(CodeableConcept)
	 * @see org.hl7.fhir.FhirPackage#getExplanationOfBenefitCareTeam_Role()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='role' namespace='##targetNamespace'"
	 * @generated
	 */
	CodeableConcept getRole();

	/**
	 * Sets the value of the '{@link org.hl7.fhir.ExplanationOfBenefitCareTeam#getRole <em>Role</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Role</em>' containment reference.
	 * @see #getRole()
	 * @generated
	 */
	void setRole(CodeableConcept value);

	/**
	 * Returns the value of the '<em><b>Qualification</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The qualification which is applicable for this service.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Qualification</em>' containment reference.
	 * @see #setQualification(CodeableConcept)
	 * @see org.hl7.fhir.FhirPackage#getExplanationOfBenefitCareTeam_Qualification()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='qualification' namespace='##targetNamespace'"
	 * @generated
	 */
	CodeableConcept getQualification();

	/**
	 * Sets the value of the '{@link org.hl7.fhir.ExplanationOfBenefitCareTeam#getQualification <em>Qualification</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Qualification</em>' containment reference.
	 * @see #getQualification()
	 * @generated
	 */
	void setQualification(CodeableConcept value);

} // ExplanationOfBenefitCareTeam
