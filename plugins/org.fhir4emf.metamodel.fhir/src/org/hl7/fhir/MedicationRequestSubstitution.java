/**
 */
package org.hl7.fhir;

import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;

import org.hl7.fhir.jaxb.MedicationRequestSubstitutionImplAdapter;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Medication Request Substitution</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * An order or request for both supply of the medication and the instructions for administration of the medication to a patient. The resource is called "MedicationRequest" rather than "MedicationPrescription" or "MedicationOrder" to generalize the use across inpatient and outpatient settings, including care plans, etc., and to harmonize with workflow patterns.
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.hl7.fhir.MedicationRequestSubstitution#getAllowed <em>Allowed</em>}</li>
 *   <li>{@link org.hl7.fhir.MedicationRequestSubstitution#getReason <em>Reason</em>}</li>
 * </ul>
 *
 * @see org.hl7.fhir.FhirPackage#getMedicationRequestSubstitution()
 * @model extendedMetaData="name='MedicationRequest.Substitution' kind='elementOnly'"
 * @generated
 */
@XmlJavaTypeAdapter(MedicationRequestSubstitutionImplAdapter.class)
public interface MedicationRequestSubstitution extends BackboneElement {
	/**
	 * Returns the value of the '<em><b>Allowed</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * True if the prescriber allows a different drug to be dispensed from what was prescribed.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Allowed</em>' containment reference.
	 * @see #setAllowed(org.hl7.fhir.Boolean)
	 * @see org.hl7.fhir.FhirPackage#getMedicationRequestSubstitution_Allowed()
	 * @model containment="true" required="true"
	 *        extendedMetaData="kind='element' name='allowed' namespace='##targetNamespace'"
	 * @generated
	 */
	org.hl7.fhir.Boolean getAllowed();

	/**
	 * Sets the value of the '{@link org.hl7.fhir.MedicationRequestSubstitution#getAllowed <em>Allowed</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Allowed</em>' containment reference.
	 * @see #getAllowed()
	 * @generated
	 */
	void setAllowed(org.hl7.fhir.Boolean value);

	/**
	 * Returns the value of the '<em><b>Reason</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Indicates the reason for the substitution, or why substitution must or must not be performed.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Reason</em>' containment reference.
	 * @see #setReason(CodeableConcept)
	 * @see org.hl7.fhir.FhirPackage#getMedicationRequestSubstitution_Reason()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='reason' namespace='##targetNamespace'"
	 * @generated
	 */
	CodeableConcept getReason();

	/**
	 * Sets the value of the '{@link org.hl7.fhir.MedicationRequestSubstitution#getReason <em>Reason</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Reason</em>' containment reference.
	 * @see #getReason()
	 * @generated
	 */
	void setReason(CodeableConcept value);

} // MedicationRequestSubstitution
