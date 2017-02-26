/**
 */
package fhirrest;

import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;

import org.eclipse.emf.ecore.EObject;

import org.hl7.fhir.Bundle;

import fhirrest.jaxb.SearchResponseImplAdapter;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Search Response</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link fhirrest.SearchResponse#getResult <em>Result</em>}</li>
 * </ul>
 *
 * @see fhirrest.FhirrestPackage#getSearchResponse()
 * @model
 * @generated
 */
@XmlJavaTypeAdapter(SearchResponseImplAdapter.class)
public interface SearchResponse extends EObject {
	/**
	 * Returns the value of the '<em><b>Result</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Result</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Result</em>' containment reference.
	 * @see #setResult(Bundle)
	 * @see fhirrest.FhirrestPackage#getSearchResponse_Result()
	 * @model containment="true" required="true"
	 * @generated
	 */
	Bundle getResult();

	/**
	 * Sets the value of the '{@link fhirrest.SearchResponse#getResult <em>Result</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Result</em>' containment reference.
	 * @see #getResult()
	 * @generated
	 */
	void setResult(Bundle value);

} // SearchResponse
