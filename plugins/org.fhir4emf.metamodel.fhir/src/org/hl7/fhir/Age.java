/**
 */
package org.hl7.fhir;

import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;

import org.hl7.fhir.jaxb.AgeImplAdapter;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Age</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * A duration of time during which an organism (or a process) has existed.
 * If the element is present, it must have a value for at least one of the defined elements, an @id referenced from the Narrative, or extensions
 * <!-- end-model-doc -->
 *
 *
 * @see org.hl7.fhir.FhirPackage#getAge()
 * @model extendedMetaData="name='Age' kind='elementOnly'"
 * @generated
 */
@XmlJavaTypeAdapter(AgeImplAdapter.class)
public interface Age extends Quantity {
} // Age
