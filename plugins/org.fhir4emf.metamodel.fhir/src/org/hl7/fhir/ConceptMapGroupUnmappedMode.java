/**
 */
package org.hl7.fhir;

import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;

import org.hl7.fhir.jaxb.ConceptMapGroupUnmappedModeImplAdapter;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Concept Map Group Unmapped Mode</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * Defines which action to take if there is no match in the group.
 * If the element is present, it must have either a @value, an @id, or extensions
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.hl7.fhir.ConceptMapGroupUnmappedMode#getValue <em>Value</em>}</li>
 * </ul>
 *
 * @see org.hl7.fhir.FhirPackage#getConceptMapGroupUnmappedMode()
 * @model extendedMetaData="name='ConceptMapGroupUnmappedMode' kind='elementOnly'"
 * @generated
 */
@XmlJavaTypeAdapter(ConceptMapGroupUnmappedModeImplAdapter.class)
public interface ConceptMapGroupUnmappedMode extends Element {
	/**
	 * Returns the value of the '<em><b>Value</b></em>' attribute.
	 * The literals are from the enumeration {@link org.hl7.fhir.ConceptMapGroupUnmappedModeList}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Value</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Value</em>' attribute.
	 * @see org.hl7.fhir.ConceptMapGroupUnmappedModeList
	 * @see #isSetValue()
	 * @see #unsetValue()
	 * @see #setValue(ConceptMapGroupUnmappedModeList)
	 * @see org.hl7.fhir.FhirPackage#getConceptMapGroupUnmappedMode_Value()
	 * @model unsettable="true"
	 *        extendedMetaData="kind='attribute' name='value'"
	 * @generated
	 */
	ConceptMapGroupUnmappedModeList getValue();

	/**
	 * Sets the value of the '{@link org.hl7.fhir.ConceptMapGroupUnmappedMode#getValue <em>Value</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Value</em>' attribute.
	 * @see org.hl7.fhir.ConceptMapGroupUnmappedModeList
	 * @see #isSetValue()
	 * @see #unsetValue()
	 * @see #getValue()
	 * @generated
	 */
	void setValue(ConceptMapGroupUnmappedModeList value);

	/**
	 * Unsets the value of the '{@link org.hl7.fhir.ConceptMapGroupUnmappedMode#getValue <em>Value</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetValue()
	 * @see #getValue()
	 * @see #setValue(ConceptMapGroupUnmappedModeList)
	 * @generated
	 */
	void unsetValue();

	/**
	 * Returns whether the value of the '{@link org.hl7.fhir.ConceptMapGroupUnmappedMode#getValue <em>Value</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Value</em>' attribute is set.
	 * @see #unsetValue()
	 * @see #getValue()
	 * @see #setValue(ConceptMapGroupUnmappedModeList)
	 * @generated
	 */
	boolean isSetValue();

} // ConceptMapGroupUnmappedMode
