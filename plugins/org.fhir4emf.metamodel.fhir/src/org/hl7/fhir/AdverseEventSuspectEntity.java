/**
 */
package org.hl7.fhir;

import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;

import org.hl7.fhir.jaxb.AdverseEventSuspectEntityImplAdapter;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Adverse Event Suspect Entity</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * Actual or  potential/avoided event causing unintended physical injury resulting from or contributed to by medical care, a research study or other healthcare setting factors that requires additional monitoring, treatment, or hospitalization, or that results in death.
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.hl7.fhir.AdverseEventSuspectEntity#getInstance <em>Instance</em>}</li>
 *   <li>{@link org.hl7.fhir.AdverseEventSuspectEntity#getCausality <em>Causality</em>}</li>
 *   <li>{@link org.hl7.fhir.AdverseEventSuspectEntity#getCausalityAssessment <em>Causality Assessment</em>}</li>
 *   <li>{@link org.hl7.fhir.AdverseEventSuspectEntity#getCausalityProductRelatedness <em>Causality Product Relatedness</em>}</li>
 *   <li>{@link org.hl7.fhir.AdverseEventSuspectEntity#getCausalityMethod <em>Causality Method</em>}</li>
 *   <li>{@link org.hl7.fhir.AdverseEventSuspectEntity#getCausalityAuthor <em>Causality Author</em>}</li>
 *   <li>{@link org.hl7.fhir.AdverseEventSuspectEntity#getCausalityResult <em>Causality Result</em>}</li>
 * </ul>
 *
 * @see org.hl7.fhir.FhirPackage#getAdverseEventSuspectEntity()
 * @model extendedMetaData="name='AdverseEvent.SuspectEntity' kind='elementOnly'"
 * @generated
 */
@XmlJavaTypeAdapter(AdverseEventSuspectEntityImplAdapter.class)
public interface AdverseEventSuspectEntity extends BackboneElement {
	/**
	 * Returns the value of the '<em><b>Instance</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Identifies the actual instance of what caused the adverse event.  May be a substance, medication, medication administration, medication statement or a device.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Instance</em>' containment reference.
	 * @see #setInstance(Reference)
	 * @see org.hl7.fhir.FhirPackage#getAdverseEventSuspectEntity_Instance()
	 * @model containment="true" required="true"
	 *        extendedMetaData="kind='element' name='instance' namespace='##targetNamespace'"
	 * @generated
	 */
	Reference getInstance();

	/**
	 * Sets the value of the '{@link org.hl7.fhir.AdverseEventSuspectEntity#getInstance <em>Instance</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Instance</em>' containment reference.
	 * @see #getInstance()
	 * @generated
	 */
	void setInstance(Reference value);

	/**
	 * Returns the value of the '<em><b>Causality</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * causality1 | causality2.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Causality</em>' containment reference.
	 * @see #setCausality(AdverseEventCausality)
	 * @see org.hl7.fhir.FhirPackage#getAdverseEventSuspectEntity_Causality()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='causality' namespace='##targetNamespace'"
	 * @generated
	 */
	AdverseEventCausality getCausality();

	/**
	 * Sets the value of the '{@link org.hl7.fhir.AdverseEventSuspectEntity#getCausality <em>Causality</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Causality</em>' containment reference.
	 * @see #getCausality()
	 * @generated
	 */
	void setCausality(AdverseEventCausality value);

	/**
	 * Returns the value of the '<em><b>Causality Assessment</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * assess1 | assess2.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Causality Assessment</em>' containment reference.
	 * @see #setCausalityAssessment(CodeableConcept)
	 * @see org.hl7.fhir.FhirPackage#getAdverseEventSuspectEntity_CausalityAssessment()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='causalityAssessment' namespace='##targetNamespace'"
	 * @generated
	 */
	CodeableConcept getCausalityAssessment();

	/**
	 * Sets the value of the '{@link org.hl7.fhir.AdverseEventSuspectEntity#getCausalityAssessment <em>Causality Assessment</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Causality Assessment</em>' containment reference.
	 * @see #getCausalityAssessment()
	 * @generated
	 */
	void setCausalityAssessment(CodeableConcept value);

	/**
	 * Returns the value of the '<em><b>Causality Product Relatedness</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * AdverseEvent.suspectEntity.causalityProductRelatedness.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Causality Product Relatedness</em>' containment reference.
	 * @see #setCausalityProductRelatedness(org.hl7.fhir.String)
	 * @see org.hl7.fhir.FhirPackage#getAdverseEventSuspectEntity_CausalityProductRelatedness()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='causalityProductRelatedness' namespace='##targetNamespace'"
	 * @generated
	 */
	org.hl7.fhir.String getCausalityProductRelatedness();

	/**
	 * Sets the value of the '{@link org.hl7.fhir.AdverseEventSuspectEntity#getCausalityProductRelatedness <em>Causality Product Relatedness</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Causality Product Relatedness</em>' containment reference.
	 * @see #getCausalityProductRelatedness()
	 * @generated
	 */
	void setCausalityProductRelatedness(org.hl7.fhir.String value);

	/**
	 * Returns the value of the '<em><b>Causality Method</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * method1 | method2.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Causality Method</em>' containment reference.
	 * @see #setCausalityMethod(CodeableConcept)
	 * @see org.hl7.fhir.FhirPackage#getAdverseEventSuspectEntity_CausalityMethod()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='causalityMethod' namespace='##targetNamespace'"
	 * @generated
	 */
	CodeableConcept getCausalityMethod();

	/**
	 * Sets the value of the '{@link org.hl7.fhir.AdverseEventSuspectEntity#getCausalityMethod <em>Causality Method</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Causality Method</em>' containment reference.
	 * @see #getCausalityMethod()
	 * @generated
	 */
	void setCausalityMethod(CodeableConcept value);

	/**
	 * Returns the value of the '<em><b>Causality Author</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * AdverseEvent.suspectEntity.causalityAuthor.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Causality Author</em>' containment reference.
	 * @see #setCausalityAuthor(Reference)
	 * @see org.hl7.fhir.FhirPackage#getAdverseEventSuspectEntity_CausalityAuthor()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='causalityAuthor' namespace='##targetNamespace'"
	 * @generated
	 */
	Reference getCausalityAuthor();

	/**
	 * Sets the value of the '{@link org.hl7.fhir.AdverseEventSuspectEntity#getCausalityAuthor <em>Causality Author</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Causality Author</em>' containment reference.
	 * @see #getCausalityAuthor()
	 * @generated
	 */
	void setCausalityAuthor(Reference value);

	/**
	 * Returns the value of the '<em><b>Causality Result</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * result1 | result2.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Causality Result</em>' containment reference.
	 * @see #setCausalityResult(CodeableConcept)
	 * @see org.hl7.fhir.FhirPackage#getAdverseEventSuspectEntity_CausalityResult()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='causalityResult' namespace='##targetNamespace'"
	 * @generated
	 */
	CodeableConcept getCausalityResult();

	/**
	 * Sets the value of the '{@link org.hl7.fhir.AdverseEventSuspectEntity#getCausalityResult <em>Causality Result</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Causality Result</em>' containment reference.
	 * @see #getCausalityResult()
	 * @generated
	 */
	void setCausalityResult(CodeableConcept value);

} // AdverseEventSuspectEntity
