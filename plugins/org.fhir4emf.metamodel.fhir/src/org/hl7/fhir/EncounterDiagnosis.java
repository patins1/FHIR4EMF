/**
 */
package org.hl7.fhir;

import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;

import org.hl7.fhir.jaxb.EncounterDiagnosisImplAdapter;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Encounter Diagnosis</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * An interaction between a patient and healthcare provider(s) for the purpose of providing healthcare service(s) or assessing the health status of a patient.
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.hl7.fhir.EncounterDiagnosis#getCondition <em>Condition</em>}</li>
 *   <li>{@link org.hl7.fhir.EncounterDiagnosis#getRole <em>Role</em>}</li>
 *   <li>{@link org.hl7.fhir.EncounterDiagnosis#getRank <em>Rank</em>}</li>
 * </ul>
 *
 * @see org.hl7.fhir.FhirPackage#getEncounterDiagnosis()
 * @model extendedMetaData="name='Encounter.Diagnosis' kind='elementOnly'"
 * @generated
 */
@XmlJavaTypeAdapter(EncounterDiagnosisImplAdapter.class)
public interface EncounterDiagnosis extends BackboneElement {
	/**
	 * Returns the value of the '<em><b>Condition</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Reason the encounter takes place, as specified using information from another resource. For admissions, this is the admission diagnosis. The indication will typically be a Condition (with other resources referenced in the evidence.detail), or a Procedure.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Condition</em>' containment reference.
	 * @see #setCondition(Reference)
	 * @see org.hl7.fhir.FhirPackage#getEncounterDiagnosis_Condition()
	 * @model containment="true" required="true"
	 *        extendedMetaData="kind='element' name='condition' namespace='##targetNamespace'"
	 * @generated
	 */
	Reference getCondition();

	/**
	 * Sets the value of the '{@link org.hl7.fhir.EncounterDiagnosis#getCondition <em>Condition</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Condition</em>' containment reference.
	 * @see #getCondition()
	 * @generated
	 */
	void setCondition(Reference value);

	/**
	 * Returns the value of the '<em><b>Role</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Role that this diagnosis has within the encounter (e.g. admission, billing, discharge …).
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Role</em>' containment reference.
	 * @see #setRole(CodeableConcept)
	 * @see org.hl7.fhir.FhirPackage#getEncounterDiagnosis_Role()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='role' namespace='##targetNamespace'"
	 * @generated
	 */
	CodeableConcept getRole();

	/**
	 * Sets the value of the '{@link org.hl7.fhir.EncounterDiagnosis#getRole <em>Role</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Role</em>' containment reference.
	 * @see #getRole()
	 * @generated
	 */
	void setRole(CodeableConcept value);

	/**
	 * Returns the value of the '<em><b>Rank</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Ranking of the diagnosis (for each role type).
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Rank</em>' containment reference.
	 * @see #setRank(PositiveInt)
	 * @see org.hl7.fhir.FhirPackage#getEncounterDiagnosis_Rank()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='rank' namespace='##targetNamespace'"
	 * @generated
	 */
	PositiveInt getRank();

	/**
	 * Sets the value of the '{@link org.hl7.fhir.EncounterDiagnosis#getRank <em>Rank</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Rank</em>' containment reference.
	 * @see #getRank()
	 * @generated
	 */
	void setRank(PositiveInt value);

} // EncounterDiagnosis
