/**
 */
package org.hl7.fhir;

import java.util.List;

import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;

import org.hl7.fhir.jaxb.DosageInstructionImplAdapter;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Dosage Instruction</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * Indicates how the medication is to be used by the patient.
 * If the element is present, it must have a value for at least one of the defined elements, an @id referenced from the Narrative, or extensions
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.hl7.fhir.DosageInstruction#getSequence <em>Sequence</em>}</li>
 *   <li>{@link org.hl7.fhir.DosageInstruction#getText <em>Text</em>}</li>
 *   <li>{@link org.hl7.fhir.DosageInstruction#getAdditionalInstructions <em>Additional Instructions</em>}</li>
 *   <li>{@link org.hl7.fhir.DosageInstruction#getTiming <em>Timing</em>}</li>
 *   <li>{@link org.hl7.fhir.DosageInstruction#getAsNeededBoolean <em>As Needed Boolean</em>}</li>
 *   <li>{@link org.hl7.fhir.DosageInstruction#getAsNeededCodeableConcept <em>As Needed Codeable Concept</em>}</li>
 *   <li>{@link org.hl7.fhir.DosageInstruction#getSite <em>Site</em>}</li>
 *   <li>{@link org.hl7.fhir.DosageInstruction#getRoute <em>Route</em>}</li>
 *   <li>{@link org.hl7.fhir.DosageInstruction#getMethod <em>Method</em>}</li>
 *   <li>{@link org.hl7.fhir.DosageInstruction#getDoseRange <em>Dose Range</em>}</li>
 *   <li>{@link org.hl7.fhir.DosageInstruction#getDoseQuantity <em>Dose Quantity</em>}</li>
 *   <li>{@link org.hl7.fhir.DosageInstruction#getMaxDosePerPeriod <em>Max Dose Per Period</em>}</li>
 *   <li>{@link org.hl7.fhir.DosageInstruction#getMaxDosePerAdministration <em>Max Dose Per Administration</em>}</li>
 *   <li>{@link org.hl7.fhir.DosageInstruction#getMaxDosePerLifetime <em>Max Dose Per Lifetime</em>}</li>
 *   <li>{@link org.hl7.fhir.DosageInstruction#getRateRatio <em>Rate Ratio</em>}</li>
 *   <li>{@link org.hl7.fhir.DosageInstruction#getRateRange <em>Rate Range</em>}</li>
 *   <li>{@link org.hl7.fhir.DosageInstruction#getRateQuantity <em>Rate Quantity</em>}</li>
 * </ul>
 *
 * @see org.hl7.fhir.FhirPackage#getDosageInstruction()
 * @model extendedMetaData="name='DosageInstruction' kind='elementOnly'"
 * @generated
 */
@XmlJavaTypeAdapter(DosageInstructionImplAdapter.class)
public interface DosageInstruction extends Element {
	/**
	 * Returns the value of the '<em><b>Sequence</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Indicates the order in which the dosage instructions should be applied or interpreted.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Sequence</em>' containment reference.
	 * @see #setSequence(org.hl7.fhir.Integer)
	 * @see org.hl7.fhir.FhirPackage#getDosageInstruction_Sequence()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='sequence' namespace='##targetNamespace'"
	 * @generated
	 */
	org.hl7.fhir.Integer getSequence();

	/**
	 * Sets the value of the '{@link org.hl7.fhir.DosageInstruction#getSequence <em>Sequence</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Sequence</em>' containment reference.
	 * @see #getSequence()
	 * @generated
	 */
	void setSequence(org.hl7.fhir.Integer value);

	/**
	 * Returns the value of the '<em><b>Text</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Free text dosage instructions e.g. SIG.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Text</em>' containment reference.
	 * @see #setText(org.hl7.fhir.String)
	 * @see org.hl7.fhir.FhirPackage#getDosageInstruction_Text()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='text' namespace='##targetNamespace'"
	 * @generated
	 */
	org.hl7.fhir.String getText();

	/**
	 * Sets the value of the '{@link org.hl7.fhir.DosageInstruction#getText <em>Text</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Text</em>' containment reference.
	 * @see #getText()
	 * @generated
	 */
	void setText(org.hl7.fhir.String value);

	/**
	 * Returns the value of the '<em><b>Additional Instructions</b></em>' containment reference list.
	 * The list contents are of type {@link org.hl7.fhir.CodeableConcept}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Supplemental instructions - e.g. "with meals".
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Additional Instructions</em>' containment reference list.
	 * @see org.hl7.fhir.FhirPackage#getDosageInstruction_AdditionalInstructions()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='additionalInstructions' namespace='##targetNamespace'"
	 * @generated
	 */
	List<CodeableConcept> getAdditionalInstructions();

	/**
	 * Returns the value of the '<em><b>Timing</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * When medication should be administered.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Timing</em>' containment reference.
	 * @see #setTiming(Timing)
	 * @see org.hl7.fhir.FhirPackage#getDosageInstruction_Timing()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='timing' namespace='##targetNamespace'"
	 * @generated
	 */
	Timing getTiming();

	/**
	 * Sets the value of the '{@link org.hl7.fhir.DosageInstruction#getTiming <em>Timing</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Timing</em>' containment reference.
	 * @see #getTiming()
	 * @generated
	 */
	void setTiming(Timing value);

	/**
	 * Returns the value of the '<em><b>As Needed Boolean</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Take "as needed" (for x). (choose any one of asNeeded*, but only one)
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>As Needed Boolean</em>' containment reference.
	 * @see #setAsNeededBoolean(org.hl7.fhir.Boolean)
	 * @see org.hl7.fhir.FhirPackage#getDosageInstruction_AsNeededBoolean()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='asNeededBoolean' namespace='##targetNamespace'"
	 * @generated
	 */
	org.hl7.fhir.Boolean getAsNeededBoolean();

	/**
	 * Sets the value of the '{@link org.hl7.fhir.DosageInstruction#getAsNeededBoolean <em>As Needed Boolean</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>As Needed Boolean</em>' containment reference.
	 * @see #getAsNeededBoolean()
	 * @generated
	 */
	void setAsNeededBoolean(org.hl7.fhir.Boolean value);

	/**
	 * Returns the value of the '<em><b>As Needed Codeable Concept</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Take "as needed" (for x). (choose any one of asNeeded*, but only one)
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>As Needed Codeable Concept</em>' containment reference.
	 * @see #setAsNeededCodeableConcept(CodeableConcept)
	 * @see org.hl7.fhir.FhirPackage#getDosageInstruction_AsNeededCodeableConcept()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='asNeededCodeableConcept' namespace='##targetNamespace'"
	 * @generated
	 */
	CodeableConcept getAsNeededCodeableConcept();

	/**
	 * Sets the value of the '{@link org.hl7.fhir.DosageInstruction#getAsNeededCodeableConcept <em>As Needed Codeable Concept</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>As Needed Codeable Concept</em>' containment reference.
	 * @see #getAsNeededCodeableConcept()
	 * @generated
	 */
	void setAsNeededCodeableConcept(CodeableConcept value);

	/**
	 * Returns the value of the '<em><b>Site</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Body site to administer to.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Site</em>' containment reference.
	 * @see #setSite(CodeableConcept)
	 * @see org.hl7.fhir.FhirPackage#getDosageInstruction_Site()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='site' namespace='##targetNamespace'"
	 * @generated
	 */
	CodeableConcept getSite();

	/**
	 * Sets the value of the '{@link org.hl7.fhir.DosageInstruction#getSite <em>Site</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Site</em>' containment reference.
	 * @see #getSite()
	 * @generated
	 */
	void setSite(CodeableConcept value);

	/**
	 * Returns the value of the '<em><b>Route</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * How drug should enter body.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Route</em>' containment reference.
	 * @see #setRoute(CodeableConcept)
	 * @see org.hl7.fhir.FhirPackage#getDosageInstruction_Route()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='route' namespace='##targetNamespace'"
	 * @generated
	 */
	CodeableConcept getRoute();

	/**
	 * Sets the value of the '{@link org.hl7.fhir.DosageInstruction#getRoute <em>Route</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Route</em>' containment reference.
	 * @see #getRoute()
	 * @generated
	 */
	void setRoute(CodeableConcept value);

	/**
	 * Returns the value of the '<em><b>Method</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Technique for administering medication.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Method</em>' containment reference.
	 * @see #setMethod(CodeableConcept)
	 * @see org.hl7.fhir.FhirPackage#getDosageInstruction_Method()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='method' namespace='##targetNamespace'"
	 * @generated
	 */
	CodeableConcept getMethod();

	/**
	 * Sets the value of the '{@link org.hl7.fhir.DosageInstruction#getMethod <em>Method</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Method</em>' containment reference.
	 * @see #getMethod()
	 * @generated
	 */
	void setMethod(CodeableConcept value);

	/**
	 * Returns the value of the '<em><b>Dose Range</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Amount of medication per dose. (choose any one of dose*, but only one)
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Dose Range</em>' containment reference.
	 * @see #setDoseRange(Range)
	 * @see org.hl7.fhir.FhirPackage#getDosageInstruction_DoseRange()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='doseRange' namespace='##targetNamespace'"
	 * @generated
	 */
	Range getDoseRange();

	/**
	 * Sets the value of the '{@link org.hl7.fhir.DosageInstruction#getDoseRange <em>Dose Range</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Dose Range</em>' containment reference.
	 * @see #getDoseRange()
	 * @generated
	 */
	void setDoseRange(Range value);

	/**
	 * Returns the value of the '<em><b>Dose Quantity</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Amount of medication per dose. (choose any one of dose*, but only one)
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Dose Quantity</em>' containment reference.
	 * @see #setDoseQuantity(Quantity)
	 * @see org.hl7.fhir.FhirPackage#getDosageInstruction_DoseQuantity()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='doseQuantity' namespace='##targetNamespace'"
	 * @generated
	 */
	Quantity getDoseQuantity();

	/**
	 * Sets the value of the '{@link org.hl7.fhir.DosageInstruction#getDoseQuantity <em>Dose Quantity</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Dose Quantity</em>' containment reference.
	 * @see #getDoseQuantity()
	 * @generated
	 */
	void setDoseQuantity(Quantity value);

	/**
	 * Returns the value of the '<em><b>Max Dose Per Period</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Upper limit on medication per unit of time.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Max Dose Per Period</em>' containment reference.
	 * @see #setMaxDosePerPeriod(Ratio)
	 * @see org.hl7.fhir.FhirPackage#getDosageInstruction_MaxDosePerPeriod()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='maxDosePerPeriod' namespace='##targetNamespace'"
	 * @generated
	 */
	Ratio getMaxDosePerPeriod();

	/**
	 * Sets the value of the '{@link org.hl7.fhir.DosageInstruction#getMaxDosePerPeriod <em>Max Dose Per Period</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Max Dose Per Period</em>' containment reference.
	 * @see #getMaxDosePerPeriod()
	 * @generated
	 */
	void setMaxDosePerPeriod(Ratio value);

	/**
	 * Returns the value of the '<em><b>Max Dose Per Administration</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Upper limit on medication per administration.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Max Dose Per Administration</em>' containment reference.
	 * @see #setMaxDosePerAdministration(Quantity)
	 * @see org.hl7.fhir.FhirPackage#getDosageInstruction_MaxDosePerAdministration()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='maxDosePerAdministration' namespace='##targetNamespace'"
	 * @generated
	 */
	Quantity getMaxDosePerAdministration();

	/**
	 * Sets the value of the '{@link org.hl7.fhir.DosageInstruction#getMaxDosePerAdministration <em>Max Dose Per Administration</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Max Dose Per Administration</em>' containment reference.
	 * @see #getMaxDosePerAdministration()
	 * @generated
	 */
	void setMaxDosePerAdministration(Quantity value);

	/**
	 * Returns the value of the '<em><b>Max Dose Per Lifetime</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Upper limit on medication per lifetime of the patient.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Max Dose Per Lifetime</em>' containment reference.
	 * @see #setMaxDosePerLifetime(Quantity)
	 * @see org.hl7.fhir.FhirPackage#getDosageInstruction_MaxDosePerLifetime()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='maxDosePerLifetime' namespace='##targetNamespace'"
	 * @generated
	 */
	Quantity getMaxDosePerLifetime();

	/**
	 * Sets the value of the '{@link org.hl7.fhir.DosageInstruction#getMaxDosePerLifetime <em>Max Dose Per Lifetime</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Max Dose Per Lifetime</em>' containment reference.
	 * @see #getMaxDosePerLifetime()
	 * @generated
	 */
	void setMaxDosePerLifetime(Quantity value);

	/**
	 * Returns the value of the '<em><b>Rate Ratio</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Amount of medication per unit of time. (choose any one of rate*, but only one)
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Rate Ratio</em>' containment reference.
	 * @see #setRateRatio(Ratio)
	 * @see org.hl7.fhir.FhirPackage#getDosageInstruction_RateRatio()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='rateRatio' namespace='##targetNamespace'"
	 * @generated
	 */
	Ratio getRateRatio();

	/**
	 * Sets the value of the '{@link org.hl7.fhir.DosageInstruction#getRateRatio <em>Rate Ratio</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Rate Ratio</em>' containment reference.
	 * @see #getRateRatio()
	 * @generated
	 */
	void setRateRatio(Ratio value);

	/**
	 * Returns the value of the '<em><b>Rate Range</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Amount of medication per unit of time. (choose any one of rate*, but only one)
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Rate Range</em>' containment reference.
	 * @see #setRateRange(Range)
	 * @see org.hl7.fhir.FhirPackage#getDosageInstruction_RateRange()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='rateRange' namespace='##targetNamespace'"
	 * @generated
	 */
	Range getRateRange();

	/**
	 * Sets the value of the '{@link org.hl7.fhir.DosageInstruction#getRateRange <em>Rate Range</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Rate Range</em>' containment reference.
	 * @see #getRateRange()
	 * @generated
	 */
	void setRateRange(Range value);

	/**
	 * Returns the value of the '<em><b>Rate Quantity</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Amount of medication per unit of time. (choose any one of rate*, but only one)
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Rate Quantity</em>' containment reference.
	 * @see #setRateQuantity(Quantity)
	 * @see org.hl7.fhir.FhirPackage#getDosageInstruction_RateQuantity()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='rateQuantity' namespace='##targetNamespace'"
	 * @generated
	 */
	Quantity getRateQuantity();

	/**
	 * Sets the value of the '{@link org.hl7.fhir.DosageInstruction#getRateQuantity <em>Rate Quantity</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Rate Quantity</em>' containment reference.
	 * @see #getRateQuantity()
	 * @generated
	 */
	void setRateQuantity(Quantity value);

} // DosageInstruction
