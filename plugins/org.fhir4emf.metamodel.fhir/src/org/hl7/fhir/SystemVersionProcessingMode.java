/**
 */
package org.hl7.fhir;

import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;

import org.hl7.fhir.jaxb.SystemVersionProcessingModeImplAdapter;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>System Version Processing Mode</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * How to manage the intersection between a fixed version in a value set, and a fixed version of the system in the expansion profile
 * If the element is present, it must have either a @value, an @id, or extensions
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.hl7.fhir.SystemVersionProcessingMode#getValue <em>Value</em>}</li>
 * </ul>
 *
 * @see org.hl7.fhir.FhirPackage#getSystemVersionProcessingMode()
 * @model extendedMetaData="name='SystemVersionProcessingMode' kind='elementOnly'"
 * @generated
 */
@XmlJavaTypeAdapter(SystemVersionProcessingModeImplAdapter.class)
public interface SystemVersionProcessingMode extends Element {
	/**
	 * Returns the value of the '<em><b>Value</b></em>' attribute.
	 * The literals are from the enumeration {@link org.hl7.fhir.SystemVersionProcessingModeList}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Value</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Value</em>' attribute.
	 * @see org.hl7.fhir.SystemVersionProcessingModeList
	 * @see #isSetValue()
	 * @see #unsetValue()
	 * @see #setValue(SystemVersionProcessingModeList)
	 * @see org.hl7.fhir.FhirPackage#getSystemVersionProcessingMode_Value()
	 * @model unsettable="true"
	 *        extendedMetaData="kind='attribute' name='value'"
	 * @generated
	 */
	SystemVersionProcessingModeList getValue();

	/**
	 * Sets the value of the '{@link org.hl7.fhir.SystemVersionProcessingMode#getValue <em>Value</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Value</em>' attribute.
	 * @see org.hl7.fhir.SystemVersionProcessingModeList
	 * @see #isSetValue()
	 * @see #unsetValue()
	 * @see #getValue()
	 * @generated
	 */
	void setValue(SystemVersionProcessingModeList value);

	/**
	 * Unsets the value of the '{@link org.hl7.fhir.SystemVersionProcessingMode#getValue <em>Value</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetValue()
	 * @see #getValue()
	 * @see #setValue(SystemVersionProcessingModeList)
	 * @generated
	 */
	void unsetValue();

	/**
	 * Returns whether the value of the '{@link org.hl7.fhir.SystemVersionProcessingMode#getValue <em>Value</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Value</em>' attribute is set.
	 * @see #unsetValue()
	 * @see #getValue()
	 * @see #setValue(SystemVersionProcessingModeList)
	 * @generated
	 */
	boolean isSetValue();

} // SystemVersionProcessingMode