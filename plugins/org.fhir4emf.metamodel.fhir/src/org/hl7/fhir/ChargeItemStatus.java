/**
 */
package org.hl7.fhir;

import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;

import org.hl7.fhir.jaxb.ChargeItemStatusImplAdapter;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Charge Item Status</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * Codes identifying the stage lifecycle stage of a ChargeItem
 * If the element is present, it must have either a @value, an @id, or extensions
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.hl7.fhir.ChargeItemStatus#getValue <em>Value</em>}</li>
 * </ul>
 *
 * @see org.hl7.fhir.FhirPackage#getChargeItemStatus()
 * @model extendedMetaData="name='ChargeItemStatus' kind='elementOnly'"
 * @generated
 */
@XmlJavaTypeAdapter(ChargeItemStatusImplAdapter.class)
public interface ChargeItemStatus extends Element {
	/**
	 * Returns the value of the '<em><b>Value</b></em>' attribute.
	 * The literals are from the enumeration {@link org.hl7.fhir.ChargeItemStatusList}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Value</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Value</em>' attribute.
	 * @see org.hl7.fhir.ChargeItemStatusList
	 * @see #isSetValue()
	 * @see #unsetValue()
	 * @see #setValue(ChargeItemStatusList)
	 * @see org.hl7.fhir.FhirPackage#getChargeItemStatus_Value()
	 * @model unsettable="true"
	 *        extendedMetaData="kind='attribute' name='value'"
	 * @generated
	 */
	ChargeItemStatusList getValue();

	/**
	 * Sets the value of the '{@link org.hl7.fhir.ChargeItemStatus#getValue <em>Value</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Value</em>' attribute.
	 * @see org.hl7.fhir.ChargeItemStatusList
	 * @see #isSetValue()
	 * @see #unsetValue()
	 * @see #getValue()
	 * @generated
	 */
	void setValue(ChargeItemStatusList value);

	/**
	 * Unsets the value of the '{@link org.hl7.fhir.ChargeItemStatus#getValue <em>Value</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetValue()
	 * @see #getValue()
	 * @see #setValue(ChargeItemStatusList)
	 * @generated
	 */
	void unsetValue();

	/**
	 * Returns whether the value of the '{@link org.hl7.fhir.ChargeItemStatus#getValue <em>Value</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Value</em>' attribute is set.
	 * @see #unsetValue()
	 * @see #getValue()
	 * @see #setValue(ChargeItemStatusList)
	 * @generated
	 */
	boolean isSetValue();

} // ChargeItemStatus
