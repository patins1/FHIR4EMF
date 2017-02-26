/**
 */
package org.hl7.fhir;

import java.util.List;

import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;

import org.hl7.fhir.jaxb.ClaimDiagnosisImplAdapter;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Claim Diagnosis</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * A provider issued list of services and products provided, or to be provided, to a patient which is provided to an insurer for payment recovery.
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.hl7.fhir.ClaimDiagnosis#getSequence <em>Sequence</em>}</li>
 *   <li>{@link org.hl7.fhir.ClaimDiagnosis#getDiagnosisCodeableConcept <em>Diagnosis Codeable Concept</em>}</li>
 *   <li>{@link org.hl7.fhir.ClaimDiagnosis#getDiagnosisReference <em>Diagnosis Reference</em>}</li>
 *   <li>{@link org.hl7.fhir.ClaimDiagnosis#getType <em>Type</em>}</li>
 *   <li>{@link org.hl7.fhir.ClaimDiagnosis#getPackageCode <em>Package Code</em>}</li>
 * </ul>
 *
 * @see org.hl7.fhir.FhirPackage#getClaimDiagnosis()
 * @model extendedMetaData="name='Claim.Diagnosis' kind='elementOnly'"
 * @generated
 */
@XmlJavaTypeAdapter(ClaimDiagnosisImplAdapter.class)
public interface ClaimDiagnosis extends BackboneElement {
	/**
	 * Returns the value of the '<em><b>Sequence</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Sequence of diagnosis which serves to provide a link.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Sequence</em>' containment reference.
	 * @see #setSequence(PositiveInt)
	 * @see org.hl7.fhir.FhirPackage#getClaimDiagnosis_Sequence()
	 * @model containment="true" required="true"
	 *        extendedMetaData="kind='element' name='sequence' namespace='##targetNamespace'"
	 * @generated
	 */
	PositiveInt getSequence();

	/**
	 * Sets the value of the '{@link org.hl7.fhir.ClaimDiagnosis#getSequence <em>Sequence</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Sequence</em>' containment reference.
	 * @see #getSequence()
	 * @generated
	 */
	void setSequence(PositiveInt value);

	/**
	 * Returns the value of the '<em><b>Diagnosis Codeable Concept</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The diagnosis. (choose any one of diagnosis*, but only one)
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Diagnosis Codeable Concept</em>' containment reference.
	 * @see #setDiagnosisCodeableConcept(CodeableConcept)
	 * @see org.hl7.fhir.FhirPackage#getClaimDiagnosis_DiagnosisCodeableConcept()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='diagnosisCodeableConcept' namespace='##targetNamespace'"
	 * @generated
	 */
	CodeableConcept getDiagnosisCodeableConcept();

	/**
	 * Sets the value of the '{@link org.hl7.fhir.ClaimDiagnosis#getDiagnosisCodeableConcept <em>Diagnosis Codeable Concept</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Diagnosis Codeable Concept</em>' containment reference.
	 * @see #getDiagnosisCodeableConcept()
	 * @generated
	 */
	void setDiagnosisCodeableConcept(CodeableConcept value);

	/**
	 * Returns the value of the '<em><b>Diagnosis Reference</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The diagnosis. (choose any one of diagnosis*, but only one)
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Diagnosis Reference</em>' containment reference.
	 * @see #setDiagnosisReference(Reference)
	 * @see org.hl7.fhir.FhirPackage#getClaimDiagnosis_DiagnosisReference()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='diagnosisReference' namespace='##targetNamespace'"
	 * @generated
	 */
	Reference getDiagnosisReference();

	/**
	 * Sets the value of the '{@link org.hl7.fhir.ClaimDiagnosis#getDiagnosisReference <em>Diagnosis Reference</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Diagnosis Reference</em>' containment reference.
	 * @see #getDiagnosisReference()
	 * @generated
	 */
	void setDiagnosisReference(Reference value);

	/**
	 * Returns the value of the '<em><b>Type</b></em>' containment reference list.
	 * The list contents are of type {@link org.hl7.fhir.CodeableConcept}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The type of the Diagnosis, for example: admitting, primary, secondary, discharge.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Type</em>' containment reference list.
	 * @see org.hl7.fhir.FhirPackage#getClaimDiagnosis_Type()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='type' namespace='##targetNamespace'"
	 * @generated
	 */
	List<CodeableConcept> getType();

	/**
	 * Returns the value of the '<em><b>Package Code</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The package billing code, for example DRG, based on the assigned grouping code system.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Package Code</em>' containment reference.
	 * @see #setPackageCode(CodeableConcept)
	 * @see org.hl7.fhir.FhirPackage#getClaimDiagnosis_PackageCode()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='packageCode' namespace='##targetNamespace'"
	 * @generated
	 */
	CodeableConcept getPackageCode();

	/**
	 * Sets the value of the '{@link org.hl7.fhir.ClaimDiagnosis#getPackageCode <em>Package Code</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Package Code</em>' containment reference.
	 * @see #getPackageCode()
	 * @generated
	 */
	void setPackageCode(CodeableConcept value);

} // ClaimDiagnosis
