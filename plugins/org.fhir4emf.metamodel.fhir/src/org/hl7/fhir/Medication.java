/**
 */
package org.hl7.fhir;

import java.util.List;

import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;

import org.hl7.fhir.jaxb.MedicationImplAdapter;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Medication</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * This resource is primarily used for the identification and definition of a medication. It covers the ingredients and the packaging for a medication.
 * If the element is present, it must have either a @value, an @id, or extensions
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.hl7.fhir.Medication#getCode <em>Code</em>}</li>
 *   <li>{@link org.hl7.fhir.Medication#getStatus <em>Status</em>}</li>
 *   <li>{@link org.hl7.fhir.Medication#getIsBrand <em>Is Brand</em>}</li>
 *   <li>{@link org.hl7.fhir.Medication#getIsOverTheCounter <em>Is Over The Counter</em>}</li>
 *   <li>{@link org.hl7.fhir.Medication#getManufacturer <em>Manufacturer</em>}</li>
 *   <li>{@link org.hl7.fhir.Medication#getForm <em>Form</em>}</li>
 *   <li>{@link org.hl7.fhir.Medication#getIngredient <em>Ingredient</em>}</li>
 *   <li>{@link org.hl7.fhir.Medication#getPackage <em>Package</em>}</li>
 *   <li>{@link org.hl7.fhir.Medication#getImage <em>Image</em>}</li>
 * </ul>
 *
 * @see org.hl7.fhir.FhirPackage#getMedication()
 * @model extendedMetaData="name='Medication' kind='elementOnly'"
 * @generated
 */
@XmlJavaTypeAdapter(MedicationImplAdapter.class)
public interface Medication extends DomainResource {
	/**
	 * Returns the value of the '<em><b>Code</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * A code (or set of codes) that specify this medication, or a textual description if no code is available. Usage note: This could be a standard medication code such as a code from RxNorm, SNOMED CT, IDMP etc. It could also be a national or local formulary code, optionally with translations to other code systems.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Code</em>' containment reference.
	 * @see #setCode(CodeableConcept)
	 * @see org.hl7.fhir.FhirPackage#getMedication_Code()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='code' namespace='##targetNamespace'"
	 * @generated
	 */
	CodeableConcept getCode();

	/**
	 * Sets the value of the '{@link org.hl7.fhir.Medication#getCode <em>Code</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Code</em>' containment reference.
	 * @see #getCode()
	 * @generated
	 */
	void setCode(CodeableConcept value);

	/**
	 * Returns the value of the '<em><b>Status</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * A code to indicate if the medication is in active use.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Status</em>' containment reference.
	 * @see #setStatus(MedicationStatus)
	 * @see org.hl7.fhir.FhirPackage#getMedication_Status()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='status' namespace='##targetNamespace'"
	 * @generated
	 */
	MedicationStatus getStatus();

	/**
	 * Sets the value of the '{@link org.hl7.fhir.Medication#getStatus <em>Status</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Status</em>' containment reference.
	 * @see #getStatus()
	 * @generated
	 */
	void setStatus(MedicationStatus value);

	/**
	 * Returns the value of the '<em><b>Is Brand</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Set to true if the item is attributable to a specific manufacturer.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Is Brand</em>' containment reference.
	 * @see #setIsBrand(org.hl7.fhir.Boolean)
	 * @see org.hl7.fhir.FhirPackage#getMedication_IsBrand()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='isBrand' namespace='##targetNamespace'"
	 * @generated
	 */
	org.hl7.fhir.Boolean getIsBrand();

	/**
	 * Sets the value of the '{@link org.hl7.fhir.Medication#getIsBrand <em>Is Brand</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Is Brand</em>' containment reference.
	 * @see #getIsBrand()
	 * @generated
	 */
	void setIsBrand(org.hl7.fhir.Boolean value);

	/**
	 * Returns the value of the '<em><b>Is Over The Counter</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Set to true if the medication can be obtained without an order from a prescriber.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Is Over The Counter</em>' containment reference.
	 * @see #setIsOverTheCounter(org.hl7.fhir.Boolean)
	 * @see org.hl7.fhir.FhirPackage#getMedication_IsOverTheCounter()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='isOverTheCounter' namespace='##targetNamespace'"
	 * @generated
	 */
	org.hl7.fhir.Boolean getIsOverTheCounter();

	/**
	 * Sets the value of the '{@link org.hl7.fhir.Medication#getIsOverTheCounter <em>Is Over The Counter</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Is Over The Counter</em>' containment reference.
	 * @see #getIsOverTheCounter()
	 * @generated
	 */
	void setIsOverTheCounter(org.hl7.fhir.Boolean value);

	/**
	 * Returns the value of the '<em><b>Manufacturer</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Describes the details of the manufacturer of the medication product.  This is not intended to represent the distributor of a medication product.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Manufacturer</em>' containment reference.
	 * @see #setManufacturer(Reference)
	 * @see org.hl7.fhir.FhirPackage#getMedication_Manufacturer()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='manufacturer' namespace='##targetNamespace'"
	 * @generated
	 */
	Reference getManufacturer();

	/**
	 * Sets the value of the '{@link org.hl7.fhir.Medication#getManufacturer <em>Manufacturer</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Manufacturer</em>' containment reference.
	 * @see #getManufacturer()
	 * @generated
	 */
	void setManufacturer(Reference value);

	/**
	 * Returns the value of the '<em><b>Form</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Describes the form of the item.  Powder; tablets; capsule.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Form</em>' containment reference.
	 * @see #setForm(CodeableConcept)
	 * @see org.hl7.fhir.FhirPackage#getMedication_Form()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='form' namespace='##targetNamespace'"
	 * @generated
	 */
	CodeableConcept getForm();

	/**
	 * Sets the value of the '{@link org.hl7.fhir.Medication#getForm <em>Form</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Form</em>' containment reference.
	 * @see #getForm()
	 * @generated
	 */
	void setForm(CodeableConcept value);

	/**
	 * Returns the value of the '<em><b>Ingredient</b></em>' containment reference list.
	 * The list contents are of type {@link org.hl7.fhir.MedicationIngredient}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Identifies a particular constituent of interest in the product.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Ingredient</em>' containment reference list.
	 * @see org.hl7.fhir.FhirPackage#getMedication_Ingredient()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='ingredient' namespace='##targetNamespace'"
	 * @generated
	 */
	List<MedicationIngredient> getIngredient();

	/**
	 * Returns the value of the '<em><b>Package</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Information that only applies to packages (not products).
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Package</em>' containment reference.
	 * @see #setPackage(MedicationPackage)
	 * @see org.hl7.fhir.FhirPackage#getMedication_Package()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='package' namespace='##targetNamespace'"
	 * @generated
	 */
	MedicationPackage getPackage();

	/**
	 * Sets the value of the '{@link org.hl7.fhir.Medication#getPackage <em>Package</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Package</em>' containment reference.
	 * @see #getPackage()
	 * @generated
	 */
	void setPackage(MedicationPackage value);

	/**
	 * Returns the value of the '<em><b>Image</b></em>' containment reference list.
	 * The list contents are of type {@link org.hl7.fhir.Attachment}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Photo(s) or graphic representation(s) of the medication.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Image</em>' containment reference list.
	 * @see org.hl7.fhir.FhirPackage#getMedication_Image()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='image' namespace='##targetNamespace'"
	 * @generated
	 */
	List<Attachment> getImage();

} // Medication
