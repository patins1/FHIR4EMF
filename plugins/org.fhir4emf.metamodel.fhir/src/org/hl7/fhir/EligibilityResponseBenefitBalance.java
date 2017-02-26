/**
 */
package org.hl7.fhir;

import java.util.List;

import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;

import org.hl7.fhir.jaxb.EligibilityResponseBenefitBalanceImplAdapter;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Eligibility Response Benefit Balance</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * This resource provides eligibility and plan details from the processing of an Eligibility resource.
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.hl7.fhir.EligibilityResponseBenefitBalance#getCategory <em>Category</em>}</li>
 *   <li>{@link org.hl7.fhir.EligibilityResponseBenefitBalance#getSubCategory <em>Sub Category</em>}</li>
 *   <li>{@link org.hl7.fhir.EligibilityResponseBenefitBalance#getExcluded <em>Excluded</em>}</li>
 *   <li>{@link org.hl7.fhir.EligibilityResponseBenefitBalance#getName <em>Name</em>}</li>
 *   <li>{@link org.hl7.fhir.EligibilityResponseBenefitBalance#getDescription <em>Description</em>}</li>
 *   <li>{@link org.hl7.fhir.EligibilityResponseBenefitBalance#getNetwork <em>Network</em>}</li>
 *   <li>{@link org.hl7.fhir.EligibilityResponseBenefitBalance#getUnit <em>Unit</em>}</li>
 *   <li>{@link org.hl7.fhir.EligibilityResponseBenefitBalance#getTerm <em>Term</em>}</li>
 *   <li>{@link org.hl7.fhir.EligibilityResponseBenefitBalance#getFinancial <em>Financial</em>}</li>
 * </ul>
 *
 * @see org.hl7.fhir.FhirPackage#getEligibilityResponseBenefitBalance()
 * @model extendedMetaData="name='EligibilityResponse.BenefitBalance' kind='elementOnly'"
 * @generated
 */
@XmlJavaTypeAdapter(EligibilityResponseBenefitBalanceImplAdapter.class)
public interface EligibilityResponseBenefitBalance extends BackboneElement {
	/**
	 * Returns the value of the '<em><b>Category</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Dental, Vision, Medical, Pharmacy, Rehab etc.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Category</em>' containment reference.
	 * @see #setCategory(CodeableConcept)
	 * @see org.hl7.fhir.FhirPackage#getEligibilityResponseBenefitBalance_Category()
	 * @model containment="true" required="true"
	 *        extendedMetaData="kind='element' name='category' namespace='##targetNamespace'"
	 * @generated
	 */
	CodeableConcept getCategory();

	/**
	 * Sets the value of the '{@link org.hl7.fhir.EligibilityResponseBenefitBalance#getCategory <em>Category</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Category</em>' containment reference.
	 * @see #getCategory()
	 * @generated
	 */
	void setCategory(CodeableConcept value);

	/**
	 * Returns the value of the '<em><b>Sub Category</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Dental: basic, major, ortho; Vision exam, glasses, contacts; etc.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Sub Category</em>' containment reference.
	 * @see #setSubCategory(CodeableConcept)
	 * @see org.hl7.fhir.FhirPackage#getEligibilityResponseBenefitBalance_SubCategory()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='subCategory' namespace='##targetNamespace'"
	 * @generated
	 */
	CodeableConcept getSubCategory();

	/**
	 * Sets the value of the '{@link org.hl7.fhir.EligibilityResponseBenefitBalance#getSubCategory <em>Sub Category</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Sub Category</em>' containment reference.
	 * @see #getSubCategory()
	 * @generated
	 */
	void setSubCategory(CodeableConcept value);

	/**
	 * Returns the value of the '<em><b>Excluded</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * True if the indicated class of service is excluded from the plan, missing or False indicated the service is included in the coverage.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Excluded</em>' containment reference.
	 * @see #setExcluded(org.hl7.fhir.Boolean)
	 * @see org.hl7.fhir.FhirPackage#getEligibilityResponseBenefitBalance_Excluded()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='excluded' namespace='##targetNamespace'"
	 * @generated
	 */
	org.hl7.fhir.Boolean getExcluded();

	/**
	 * Sets the value of the '{@link org.hl7.fhir.EligibilityResponseBenefitBalance#getExcluded <em>Excluded</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Excluded</em>' containment reference.
	 * @see #getExcluded()
	 * @generated
	 */
	void setExcluded(org.hl7.fhir.Boolean value);

	/**
	 * Returns the value of the '<em><b>Name</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * A short name or tag for the benefit, for example MED01, or DENT2.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Name</em>' containment reference.
	 * @see #setName(org.hl7.fhir.String)
	 * @see org.hl7.fhir.FhirPackage#getEligibilityResponseBenefitBalance_Name()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='name' namespace='##targetNamespace'"
	 * @generated
	 */
	org.hl7.fhir.String getName();

	/**
	 * Sets the value of the '{@link org.hl7.fhir.EligibilityResponseBenefitBalance#getName <em>Name</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Name</em>' containment reference.
	 * @see #getName()
	 * @generated
	 */
	void setName(org.hl7.fhir.String value);

	/**
	 * Returns the value of the '<em><b>Description</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * A richer description of the benefit, for example 'DENT2 covers 100% of basic, 50% of major but exclused Ortho, Implants and Costmetic services'.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Description</em>' containment reference.
	 * @see #setDescription(org.hl7.fhir.String)
	 * @see org.hl7.fhir.FhirPackage#getEligibilityResponseBenefitBalance_Description()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='description' namespace='##targetNamespace'"
	 * @generated
	 */
	org.hl7.fhir.String getDescription();

	/**
	 * Sets the value of the '{@link org.hl7.fhir.EligibilityResponseBenefitBalance#getDescription <em>Description</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Description</em>' containment reference.
	 * @see #getDescription()
	 * @generated
	 */
	void setDescription(org.hl7.fhir.String value);

	/**
	 * Returns the value of the '<em><b>Network</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Network designation.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Network</em>' containment reference.
	 * @see #setNetwork(CodeableConcept)
	 * @see org.hl7.fhir.FhirPackage#getEligibilityResponseBenefitBalance_Network()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='network' namespace='##targetNamespace'"
	 * @generated
	 */
	CodeableConcept getNetwork();

	/**
	 * Sets the value of the '{@link org.hl7.fhir.EligibilityResponseBenefitBalance#getNetwork <em>Network</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Network</em>' containment reference.
	 * @see #getNetwork()
	 * @generated
	 */
	void setNetwork(CodeableConcept value);

	/**
	 * Returns the value of the '<em><b>Unit</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Unit designation: individual or family.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Unit</em>' containment reference.
	 * @see #setUnit(CodeableConcept)
	 * @see org.hl7.fhir.FhirPackage#getEligibilityResponseBenefitBalance_Unit()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='unit' namespace='##targetNamespace'"
	 * @generated
	 */
	CodeableConcept getUnit();

	/**
	 * Sets the value of the '{@link org.hl7.fhir.EligibilityResponseBenefitBalance#getUnit <em>Unit</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Unit</em>' containment reference.
	 * @see #getUnit()
	 * @generated
	 */
	void setUnit(CodeableConcept value);

	/**
	 * Returns the value of the '<em><b>Term</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The term or period of the values such as 'maximum lifetime benefit' or 'maximum annual vistis'.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Term</em>' containment reference.
	 * @see #setTerm(CodeableConcept)
	 * @see org.hl7.fhir.FhirPackage#getEligibilityResponseBenefitBalance_Term()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='term' namespace='##targetNamespace'"
	 * @generated
	 */
	CodeableConcept getTerm();

	/**
	 * Sets the value of the '{@link org.hl7.fhir.EligibilityResponseBenefitBalance#getTerm <em>Term</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Term</em>' containment reference.
	 * @see #getTerm()
	 * @generated
	 */
	void setTerm(CodeableConcept value);

	/**
	 * Returns the value of the '<em><b>Financial</b></em>' containment reference list.
	 * The list contents are of type {@link org.hl7.fhir.EligibilityResponseFinancial}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Benefits Used to date.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Financial</em>' containment reference list.
	 * @see org.hl7.fhir.FhirPackage#getEligibilityResponseBenefitBalance_Financial()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='financial' namespace='##targetNamespace'"
	 * @generated
	 */
	List<EligibilityResponseFinancial> getFinancial();

} // EligibilityResponseBenefitBalance
