/**
 */
package org.hl7.fhir;

import java.util.List;

import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;

import org.hl7.fhir.jaxb.ConditionStageImplAdapter;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Condition Stage</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * A clinical condition, problem, diagnosis, or other event, situation, issue, or clinical concept that has risen to a level of concern.
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.hl7.fhir.ConditionStage#getSummary <em>Summary</em>}</li>
 *   <li>{@link org.hl7.fhir.ConditionStage#getAssessment <em>Assessment</em>}</li>
 * </ul>
 *
 * @see org.hl7.fhir.FhirPackage#getConditionStage()
 * @model extendedMetaData="name='Condition.Stage' kind='elementOnly'"
 * @generated
 */
@XmlJavaTypeAdapter(ConditionStageImplAdapter.class)
public interface ConditionStage extends BackboneElement {
	/**
	 * Returns the value of the '<em><b>Summary</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * A simple summary of the stage such as "Stage 3". The determination of the stage is disease-specific.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Summary</em>' containment reference.
	 * @see #setSummary(CodeableConcept)
	 * @see org.hl7.fhir.FhirPackage#getConditionStage_Summary()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='summary' namespace='##targetNamespace'"
	 * @generated
	 */
	CodeableConcept getSummary();

	/**
	 * Sets the value of the '{@link org.hl7.fhir.ConditionStage#getSummary <em>Summary</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Summary</em>' containment reference.
	 * @see #getSummary()
	 * @generated
	 */
	void setSummary(CodeableConcept value);

	/**
	 * Returns the value of the '<em><b>Assessment</b></em>' containment reference list.
	 * The list contents are of type {@link org.hl7.fhir.Reference}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Reference to a formal record of the evidence on which the staging assessment is based.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Assessment</em>' containment reference list.
	 * @see org.hl7.fhir.FhirPackage#getConditionStage_Assessment()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='assessment' namespace='##targetNamespace'"
	 * @generated
	 */
	List<Reference> getAssessment();

} // ConditionStage
