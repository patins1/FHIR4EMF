/**
 */
package fhirrest;

import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;

import org.eclipse.emf.ecore.EObject;

import fhirrest.jaxb.SearchRequestImplAdapter;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Search Request</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link fhirrest.SearchRequest#get_type <em>type</em>}</li>
 * </ul>
 *
 * @see fhirrest.FhirrestPackage#getSearchRequest()
 * @model
 * @generated
 */
@XmlJavaTypeAdapter(SearchRequestImplAdapter.class)
public interface SearchRequest extends EObject {
	/**
	 * Returns the value of the '<em><b>type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>type</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>type</em>' attribute.
	 * @see #set_type(String)
	 * @see fhirrest.FhirrestPackage#getSearchRequest__type()
	 * @model
	 * @generated
	 */
	String get_type();

	/**
	 * Sets the value of the '{@link fhirrest.SearchRequest#get_type <em>type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>type</em>' attribute.
	 * @see #get_type()
	 * @generated
	 */
	void set_type(String value);

} // SearchRequest
