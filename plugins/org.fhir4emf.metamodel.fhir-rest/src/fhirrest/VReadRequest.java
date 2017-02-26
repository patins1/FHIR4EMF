/**
 */
package fhirrest;

import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;

import fhirrest.jaxb.VReadRequestImplAdapter;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>VRead Request</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link fhirrest.VReadRequest#getVid <em>Vid</em>}</li>
 * </ul>
 *
 * @see fhirrest.FhirrestPackage#getVReadRequest()
 * @model
 * @generated
 */
@XmlJavaTypeAdapter(VReadRequestImplAdapter.class)
public interface VReadRequest extends ReadRequest {
	/**
	 * Returns the value of the '<em><b>Vid</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Vid</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Vid</em>' attribute.
	 * @see #setVid(String)
	 * @see fhirrest.FhirrestPackage#getVReadRequest_Vid()
	 * @model
	 * @generated
	 */
	String getVid();

	/**
	 * Sets the value of the '{@link fhirrest.VReadRequest#getVid <em>Vid</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Vid</em>' attribute.
	 * @see #getVid()
	 * @generated
	 */
	void setVid(String value);

} // VReadRequest
