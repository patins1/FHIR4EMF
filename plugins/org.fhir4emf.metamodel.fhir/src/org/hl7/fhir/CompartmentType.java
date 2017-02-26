/**
 */
package org.hl7.fhir;

import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;

import org.hl7.fhir.jaxb.CompartmentTypeImplAdapter;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Compartment Type</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * Which compartment a compartmnet definition describes
 * If the element is present, it must have either a @value, an @id, or extensions
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.hl7.fhir.CompartmentType#getValue <em>Value</em>}</li>
 * </ul>
 *
 * @see org.hl7.fhir.FhirPackage#getCompartmentType()
 * @model extendedMetaData="name='CompartmentType' kind='elementOnly'"
 * @generated
 */
@XmlJavaTypeAdapter(CompartmentTypeImplAdapter.class)
public interface CompartmentType extends Element {
	/**
	 * Returns the value of the '<em><b>Value</b></em>' attribute.
	 * The literals are from the enumeration {@link org.hl7.fhir.CompartmentTypeList}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Value</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Value</em>' attribute.
	 * @see org.hl7.fhir.CompartmentTypeList
	 * @see #isSetValue()
	 * @see #unsetValue()
	 * @see #setValue(CompartmentTypeList)
	 * @see org.hl7.fhir.FhirPackage#getCompartmentType_Value()
	 * @model unsettable="true"
	 *        extendedMetaData="kind='attribute' name='value'"
	 * @generated
	 */
	CompartmentTypeList getValue();

	/**
	 * Sets the value of the '{@link org.hl7.fhir.CompartmentType#getValue <em>Value</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Value</em>' attribute.
	 * @see org.hl7.fhir.CompartmentTypeList
	 * @see #isSetValue()
	 * @see #unsetValue()
	 * @see #getValue()
	 * @generated
	 */
	void setValue(CompartmentTypeList value);

	/**
	 * Unsets the value of the '{@link org.hl7.fhir.CompartmentType#getValue <em>Value</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetValue()
	 * @see #getValue()
	 * @see #setValue(CompartmentTypeList)
	 * @generated
	 */
	void unsetValue();

	/**
	 * Returns whether the value of the '{@link org.hl7.fhir.CompartmentType#getValue <em>Value</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Value</em>' attribute is set.
	 * @see #unsetValue()
	 * @see #getValue()
	 * @see #setValue(CompartmentTypeList)
	 * @generated
	 */
	boolean isSetValue();

} // CompartmentType