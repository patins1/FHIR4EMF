/**
 */
package org.hl7.fhir;

import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;

import org.hl7.fhir.jaxb.AdverseEventCategoryImplAdapter;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Adverse Event Category</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * Overall categorization of the event, e.g. real or potential
 * If the element is present, it must have either a @value, an @id, or extensions
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.hl7.fhir.AdverseEventCategory#getValue <em>Value</em>}</li>
 * </ul>
 *
 * @see org.hl7.fhir.FhirPackage#getAdverseEventCategory()
 * @model extendedMetaData="name='AdverseEventCategory' kind='elementOnly'"
 * @generated
 */
@XmlJavaTypeAdapter(AdverseEventCategoryImplAdapter.class)
public interface AdverseEventCategory extends Element {
	/**
	 * Returns the value of the '<em><b>Value</b></em>' attribute.
	 * The literals are from the enumeration {@link org.hl7.fhir.AdverseEventCategoryList}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Value</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Value</em>' attribute.
	 * @see org.hl7.fhir.AdverseEventCategoryList
	 * @see #isSetValue()
	 * @see #unsetValue()
	 * @see #setValue(AdverseEventCategoryList)
	 * @see org.hl7.fhir.FhirPackage#getAdverseEventCategory_Value()
	 * @model unsettable="true"
	 *        extendedMetaData="kind='attribute' name='value'"
	 * @generated
	 */
	AdverseEventCategoryList getValue();

	/**
	 * Sets the value of the '{@link org.hl7.fhir.AdverseEventCategory#getValue <em>Value</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Value</em>' attribute.
	 * @see org.hl7.fhir.AdverseEventCategoryList
	 * @see #isSetValue()
	 * @see #unsetValue()
	 * @see #getValue()
	 * @generated
	 */
	void setValue(AdverseEventCategoryList value);

	/**
	 * Unsets the value of the '{@link org.hl7.fhir.AdverseEventCategory#getValue <em>Value</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetValue()
	 * @see #getValue()
	 * @see #setValue(AdverseEventCategoryList)
	 * @generated
	 */
	void unsetValue();

	/**
	 * Returns whether the value of the '{@link org.hl7.fhir.AdverseEventCategory#getValue <em>Value</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Value</em>' attribute is set.
	 * @see #unsetValue()
	 * @see #getValue()
	 * @see #setValue(AdverseEventCategoryList)
	 * @generated
	 */
	boolean isSetValue();

} // AdverseEventCategory
