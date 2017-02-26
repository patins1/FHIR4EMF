/**
 */
package fhirrest;

import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;

import org.eclipse.emf.ecore.EObject;

import fhirrest.jaxb.UpdateResponseImplAdapter;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Update Response</b></em>'.
 * <!-- end-user-doc -->
 *
 *
 * @see fhirrest.FhirrestPackage#getUpdateResponse()
 * @model
 * @generated
 */
@XmlJavaTypeAdapter(UpdateResponseImplAdapter.class)
public interface UpdateResponse extends EObject {
} // UpdateResponse
