/**
 */
package org.hl7.fhir;

import java.util.List;

import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;

import org.hl7.fhir.jaxb.EligibilityResponseInsuranceImplAdapter;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Eligibility Response Insurance</b></em>'.
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
 *   <li>{@link org.hl7.fhir.EligibilityResponseInsurance#getCoverage <em>Coverage</em>}</li>
 *   <li>{@link org.hl7.fhir.EligibilityResponseInsurance#getContract <em>Contract</em>}</li>
 *   <li>{@link org.hl7.fhir.EligibilityResponseInsurance#getBenefitBalance <em>Benefit Balance</em>}</li>
 * </ul>
 *
 * @see org.hl7.fhir.FhirPackage#getEligibilityResponseInsurance()
 * @model extendedMetaData="name='EligibilityResponse.Insurance' kind='elementOnly'"
 * @generated
 */
@XmlJavaTypeAdapter(EligibilityResponseInsuranceImplAdapter.class)
public interface EligibilityResponseInsurance extends BackboneElement {
	/**
	 * Returns the value of the '<em><b>Coverage</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * A suite of updated or additional Coverages from the Insurer.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Coverage</em>' containment reference.
	 * @see #setCoverage(Reference)
	 * @see org.hl7.fhir.FhirPackage#getEligibilityResponseInsurance_Coverage()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='coverage' namespace='##targetNamespace'"
	 * @generated
	 */
	Reference getCoverage();

	/**
	 * Sets the value of the '{@link org.hl7.fhir.EligibilityResponseInsurance#getCoverage <em>Coverage</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Coverage</em>' containment reference.
	 * @see #getCoverage()
	 * @generated
	 */
	void setCoverage(Reference value);

	/**
	 * Returns the value of the '<em><b>Contract</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The contract resource which may provide more detailed information.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Contract</em>' containment reference.
	 * @see #setContract(Reference)
	 * @see org.hl7.fhir.FhirPackage#getEligibilityResponseInsurance_Contract()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='contract' namespace='##targetNamespace'"
	 * @generated
	 */
	Reference getContract();

	/**
	 * Sets the value of the '{@link org.hl7.fhir.EligibilityResponseInsurance#getContract <em>Contract</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Contract</em>' containment reference.
	 * @see #getContract()
	 * @generated
	 */
	void setContract(Reference value);

	/**
	 * Returns the value of the '<em><b>Benefit Balance</b></em>' containment reference list.
	 * The list contents are of type {@link org.hl7.fhir.EligibilityResponseBenefitBalance}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Benefits and optionally current balances by Category.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Benefit Balance</em>' containment reference list.
	 * @see org.hl7.fhir.FhirPackage#getEligibilityResponseInsurance_BenefitBalance()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='benefitBalance' namespace='##targetNamespace'"
	 * @generated
	 */
	List<EligibilityResponseBenefitBalance> getBenefitBalance();

} // EligibilityResponseInsurance
