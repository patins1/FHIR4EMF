/**
 */
package fhirrest;

import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;

import org.eclipse.emf.ecore.EObject;

import fhirrest.jaxb.DeleteResponseImplAdapter;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Delete Response</b></em>'.
 * <!-- end-user-doc -->
 *
 *
 * @see fhirrest.FhirrestPackage#getDeleteResponse()
 * @model
 * @generated
 */
@XmlJavaTypeAdapter(DeleteResponseImplAdapter.class)
public interface DeleteResponse extends EObject {
} // DeleteResponse
