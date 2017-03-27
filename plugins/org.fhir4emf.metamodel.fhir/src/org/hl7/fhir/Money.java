/**
 */
package org.hl7.fhir;

import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;

import org.hl7.fhir.jaxb.MoneyImplAdapter;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Money</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * An amount of economic utility in some recognized currency.
 * If the element is present, it must have a value for at least one of the defined elements, an @id referenced from the Narrative, or extensions
 * <!-- end-model-doc -->
 *
 *
 * @see org.hl7.fhir.FhirPackage#getMoney()
 * @model extendedMetaData="name='Money' kind='elementOnly'"
 * @generated
 */
@XmlJavaTypeAdapter(MoneyImplAdapter.class)
public interface Money extends Quantity {
} // Money
