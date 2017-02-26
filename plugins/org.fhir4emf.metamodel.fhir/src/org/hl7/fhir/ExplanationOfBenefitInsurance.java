/**
 */
package org.hl7.fhir;

import java.util.List;

import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;

import org.hl7.fhir.jaxb.ExplanationOfBenefitInsuranceImplAdapter;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Explanation Of Benefit Insurance</b></em>'.
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
 *   <li>{@link org.hl7.fhir.ExplanationOfBenefitInsurance#getCoverage <em>Coverage</em>}</li>
 *   <li>{@link org.hl7.fhir.ExplanationOfBenefitInsurance#getPreAuthRef <em>Pre Auth Ref</em>}</li>
 * </ul>
 *
 * @see org.hl7.fhir.FhirPackage#getExplanationOfBenefitInsurance()
 * @model extendedMetaData="name='ExplanationOfBenefit.Insurance' kind='elementOnly'"
 * @generated
 */
@XmlJavaTypeAdapter(ExplanationOfBenefitInsuranceImplAdapter.class)
public interface ExplanationOfBenefitInsurance extends BackboneElement {
	/**
	 * Returns the value of the '<em><b>Coverage</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Reference to the program or plan identification, underwriter or payor.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Coverage</em>' containment reference.
	 * @see #setCoverage(Reference)
	 * @see org.hl7.fhir.FhirPackage#getExplanationOfBenefitInsurance_Coverage()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='coverage' namespace='##targetNamespace'"
	 * @generated
	 */
	Reference getCoverage();

	/**
	 * Sets the value of the '{@link org.hl7.fhir.ExplanationOfBenefitInsurance#getCoverage <em>Coverage</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Coverage</em>' containment reference.
	 * @see #getCoverage()
	 * @generated
	 */
	void setCoverage(Reference value);

	/**
	 * Returns the value of the '<em><b>Pre Auth Ref</b></em>' containment reference list.
	 * The list contents are of type {@link org.hl7.fhir.String}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * A list of references from the Insurer to which these services pertain.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Pre Auth Ref</em>' containment reference list.
	 * @see org.hl7.fhir.FhirPackage#getExplanationOfBenefitInsurance_PreAuthRef()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='preAuthRef' namespace='##targetNamespace'"
	 * @generated
	 */
	List<org.hl7.fhir.String> getPreAuthRef();

} // ExplanationOfBenefitInsurance
