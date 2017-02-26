/**
 */
package org.hl7.fhir;

import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;

import org.hl7.fhir.jaxb.EligibilityResponseFinancialImplAdapter;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Eligibility Response Financial</b></em>'.
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
 *   <li>{@link org.hl7.fhir.EligibilityResponseFinancial#getType <em>Type</em>}</li>
 *   <li>{@link org.hl7.fhir.EligibilityResponseFinancial#getAllowedUnsignedInt <em>Allowed Unsigned Int</em>}</li>
 *   <li>{@link org.hl7.fhir.EligibilityResponseFinancial#getAllowedString <em>Allowed String</em>}</li>
 *   <li>{@link org.hl7.fhir.EligibilityResponseFinancial#getAllowedMoney <em>Allowed Money</em>}</li>
 *   <li>{@link org.hl7.fhir.EligibilityResponseFinancial#getUsedUnsignedInt <em>Used Unsigned Int</em>}</li>
 *   <li>{@link org.hl7.fhir.EligibilityResponseFinancial#getUsedMoney <em>Used Money</em>}</li>
 * </ul>
 *
 * @see org.hl7.fhir.FhirPackage#getEligibilityResponseFinancial()
 * @model extendedMetaData="name='EligibilityResponse.Financial' kind='elementOnly'"
 * @generated
 */
@XmlJavaTypeAdapter(EligibilityResponseFinancialImplAdapter.class)
public interface EligibilityResponseFinancial extends BackboneElement {
	/**
	 * Returns the value of the '<em><b>Type</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Deductable, visits, benefit amount.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Type</em>' containment reference.
	 * @see #setType(CodeableConcept)
	 * @see org.hl7.fhir.FhirPackage#getEligibilityResponseFinancial_Type()
	 * @model containment="true" required="true"
	 *        extendedMetaData="kind='element' name='type' namespace='##targetNamespace'"
	 * @generated
	 */
	CodeableConcept getType();

	/**
	 * Sets the value of the '{@link org.hl7.fhir.EligibilityResponseFinancial#getType <em>Type</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Type</em>' containment reference.
	 * @see #getType()
	 * @generated
	 */
	void setType(CodeableConcept value);

	/**
	 * Returns the value of the '<em><b>Allowed Unsigned Int</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Benefits allowed. (choose any one of allowed*, but only one)
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Allowed Unsigned Int</em>' containment reference.
	 * @see #setAllowedUnsignedInt(UnsignedInt)
	 * @see org.hl7.fhir.FhirPackage#getEligibilityResponseFinancial_AllowedUnsignedInt()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='allowedUnsignedInt' namespace='##targetNamespace'"
	 * @generated
	 */
	UnsignedInt getAllowedUnsignedInt();

	/**
	 * Sets the value of the '{@link org.hl7.fhir.EligibilityResponseFinancial#getAllowedUnsignedInt <em>Allowed Unsigned Int</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Allowed Unsigned Int</em>' containment reference.
	 * @see #getAllowedUnsignedInt()
	 * @generated
	 */
	void setAllowedUnsignedInt(UnsignedInt value);

	/**
	 * Returns the value of the '<em><b>Allowed String</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Benefits allowed. (choose any one of allowed*, but only one)
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Allowed String</em>' containment reference.
	 * @see #setAllowedString(org.hl7.fhir.String)
	 * @see org.hl7.fhir.FhirPackage#getEligibilityResponseFinancial_AllowedString()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='allowedString' namespace='##targetNamespace'"
	 * @generated
	 */
	org.hl7.fhir.String getAllowedString();

	/**
	 * Sets the value of the '{@link org.hl7.fhir.EligibilityResponseFinancial#getAllowedString <em>Allowed String</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Allowed String</em>' containment reference.
	 * @see #getAllowedString()
	 * @generated
	 */
	void setAllowedString(org.hl7.fhir.String value);

	/**
	 * Returns the value of the '<em><b>Allowed Money</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Benefits allowed. (choose any one of allowed*, but only one)
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Allowed Money</em>' containment reference.
	 * @see #setAllowedMoney(Money)
	 * @see org.hl7.fhir.FhirPackage#getEligibilityResponseFinancial_AllowedMoney()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='allowedMoney' namespace='##targetNamespace'"
	 * @generated
	 */
	Money getAllowedMoney();

	/**
	 * Sets the value of the '{@link org.hl7.fhir.EligibilityResponseFinancial#getAllowedMoney <em>Allowed Money</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Allowed Money</em>' containment reference.
	 * @see #getAllowedMoney()
	 * @generated
	 */
	void setAllowedMoney(Money value);

	/**
	 * Returns the value of the '<em><b>Used Unsigned Int</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Benefits used. (choose any one of used*, but only one)
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Used Unsigned Int</em>' containment reference.
	 * @see #setUsedUnsignedInt(UnsignedInt)
	 * @see org.hl7.fhir.FhirPackage#getEligibilityResponseFinancial_UsedUnsignedInt()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='usedUnsignedInt' namespace='##targetNamespace'"
	 * @generated
	 */
	UnsignedInt getUsedUnsignedInt();

	/**
	 * Sets the value of the '{@link org.hl7.fhir.EligibilityResponseFinancial#getUsedUnsignedInt <em>Used Unsigned Int</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Used Unsigned Int</em>' containment reference.
	 * @see #getUsedUnsignedInt()
	 * @generated
	 */
	void setUsedUnsignedInt(UnsignedInt value);

	/**
	 * Returns the value of the '<em><b>Used Money</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Benefits used. (choose any one of used*, but only one)
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Used Money</em>' containment reference.
	 * @see #setUsedMoney(Money)
	 * @see org.hl7.fhir.FhirPackage#getEligibilityResponseFinancial_UsedMoney()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='usedMoney' namespace='##targetNamespace'"
	 * @generated
	 */
	Money getUsedMoney();

	/**
	 * Sets the value of the '{@link org.hl7.fhir.EligibilityResponseFinancial#getUsedMoney <em>Used Money</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Used Money</em>' containment reference.
	 * @see #getUsedMoney()
	 * @generated
	 */
	void setUsedMoney(Money value);

} // EligibilityResponseFinancial
