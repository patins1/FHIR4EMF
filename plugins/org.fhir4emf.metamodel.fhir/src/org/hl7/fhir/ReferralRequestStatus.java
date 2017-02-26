/**
 */
package org.hl7.fhir;

import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;

import org.hl7.fhir.jaxb.ReferralRequestStatusImplAdapter;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Referral Request Status</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * The status of the referral.
 * If the element is present, it must have either a @value, an @id, or extensions
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.hl7.fhir.ReferralRequestStatus#getValue <em>Value</em>}</li>
 * </ul>
 *
 * @see org.hl7.fhir.FhirPackage#getReferralRequestStatus()
 * @model extendedMetaData="name='ReferralRequestStatus' kind='elementOnly'"
 * @generated
 */
@XmlJavaTypeAdapter(ReferralRequestStatusImplAdapter.class)
public interface ReferralRequestStatus extends Element {
	/**
	 * Returns the value of the '<em><b>Value</b></em>' attribute.
	 * The literals are from the enumeration {@link org.hl7.fhir.ReferralRequestStatusList}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Value</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Value</em>' attribute.
	 * @see org.hl7.fhir.ReferralRequestStatusList
	 * @see #isSetValue()
	 * @see #unsetValue()
	 * @see #setValue(ReferralRequestStatusList)
	 * @see org.hl7.fhir.FhirPackage#getReferralRequestStatus_Value()
	 * @model unsettable="true"
	 *        extendedMetaData="kind='attribute' name='value'"
	 * @generated
	 */
	ReferralRequestStatusList getValue();

	/**
	 * Sets the value of the '{@link org.hl7.fhir.ReferralRequestStatus#getValue <em>Value</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Value</em>' attribute.
	 * @see org.hl7.fhir.ReferralRequestStatusList
	 * @see #isSetValue()
	 * @see #unsetValue()
	 * @see #getValue()
	 * @generated
	 */
	void setValue(ReferralRequestStatusList value);

	/**
	 * Unsets the value of the '{@link org.hl7.fhir.ReferralRequestStatus#getValue <em>Value</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetValue()
	 * @see #getValue()
	 * @see #setValue(ReferralRequestStatusList)
	 * @generated
	 */
	void unsetValue();

	/**
	 * Returns whether the value of the '{@link org.hl7.fhir.ReferralRequestStatus#getValue <em>Value</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Value</em>' attribute is set.
	 * @see #unsetValue()
	 * @see #getValue()
	 * @see #setValue(ReferralRequestStatusList)
	 * @generated
	 */
	boolean isSetValue();

} // ReferralRequestStatus
