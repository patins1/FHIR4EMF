/**
 */
package fhirrest;

import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;

import org.eclipse.emf.ecore.EObject;

import fhirrest.jaxb.CreateResponseImplAdapter;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Create Response</b></em>'.
 * <!-- end-user-doc -->
 *
 *
 * @see fhirrest.FhirrestPackage#getCreateResponse()
 * @model
 * @generated
 */
@XmlJavaTypeAdapter(CreateResponseImplAdapter.class)
public interface CreateResponse extends EObject {
} // CreateResponse
