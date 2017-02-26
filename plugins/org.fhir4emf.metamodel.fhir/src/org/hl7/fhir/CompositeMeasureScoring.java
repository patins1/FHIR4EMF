/**
 */
package org.hl7.fhir;

import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;

import org.hl7.fhir.jaxb.CompositeMeasureScoringImplAdapter;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Composite Measure Scoring</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * The composite scoring method of the measure
 * If the element is present, it must have either a @value, an @id, or extensions
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.hl7.fhir.CompositeMeasureScoring#getValue <em>Value</em>}</li>
 * </ul>
 *
 * @see org.hl7.fhir.FhirPackage#getCompositeMeasureScoring()
 * @model extendedMetaData="name='CompositeMeasureScoring' kind='elementOnly'"
 * @generated
 */
@XmlJavaTypeAdapter(CompositeMeasureScoringImplAdapter.class)
public interface CompositeMeasureScoring extends Element {
	/**
	 * Returns the value of the '<em><b>Value</b></em>' attribute.
	 * The literals are from the enumeration {@link org.hl7.fhir.CompositeMeasureScoringList}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Value</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Value</em>' attribute.
	 * @see org.hl7.fhir.CompositeMeasureScoringList
	 * @see #isSetValue()
	 * @see #unsetValue()
	 * @see #setValue(CompositeMeasureScoringList)
	 * @see org.hl7.fhir.FhirPackage#getCompositeMeasureScoring_Value()
	 * @model unsettable="true"
	 *        extendedMetaData="kind='attribute' name='value'"
	 * @generated
	 */
	CompositeMeasureScoringList getValue();

	/**
	 * Sets the value of the '{@link org.hl7.fhir.CompositeMeasureScoring#getValue <em>Value</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Value</em>' attribute.
	 * @see org.hl7.fhir.CompositeMeasureScoringList
	 * @see #isSetValue()
	 * @see #unsetValue()
	 * @see #getValue()
	 * @generated
	 */
	void setValue(CompositeMeasureScoringList value);

	/**
	 * Unsets the value of the '{@link org.hl7.fhir.CompositeMeasureScoring#getValue <em>Value</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetValue()
	 * @see #getValue()
	 * @see #setValue(CompositeMeasureScoringList)
	 * @generated
	 */
	void unsetValue();

	/**
	 * Returns whether the value of the '{@link org.hl7.fhir.CompositeMeasureScoring#getValue <em>Value</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Value</em>' attribute is set.
	 * @see #unsetValue()
	 * @see #getValue()
	 * @see #setValue(CompositeMeasureScoringList)
	 * @generated
	 */
	boolean isSetValue();

} // CompositeMeasureScoring
