/**
 */
package fhirrest;

import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;

import fhirrest.jaxb.VReadResponseImplAdapter;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>VRead Response</b></em>'.
 * <!-- end-user-doc -->
 *
 *
 * @see fhirrest.FhirrestPackage#getVReadResponse()
 * @model
 * @generated
 */
@XmlJavaTypeAdapter(VReadResponseImplAdapter.class)
public interface VReadResponse extends ReadResponse {
} // VReadResponse
