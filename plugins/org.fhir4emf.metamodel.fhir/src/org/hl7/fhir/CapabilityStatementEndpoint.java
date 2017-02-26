/**
 */
package org.hl7.fhir;

import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;

import org.hl7.fhir.jaxb.CapabilityStatementEndpointImplAdapter;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Capability Statement Endpoint</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * A Capability Statement documents a set of capabilities (behaviors) of a FHIR Server that may be used as a statement of actual server functionality or a statement of required or desired server implementation.
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.hl7.fhir.CapabilityStatementEndpoint#getProtocol <em>Protocol</em>}</li>
 *   <li>{@link org.hl7.fhir.CapabilityStatementEndpoint#getAddress <em>Address</em>}</li>
 * </ul>
 *
 * @see org.hl7.fhir.FhirPackage#getCapabilityStatementEndpoint()
 * @model extendedMetaData="name='CapabilityStatement.Endpoint' kind='elementOnly'"
 * @generated
 */
@XmlJavaTypeAdapter(CapabilityStatementEndpointImplAdapter.class)
public interface CapabilityStatementEndpoint extends BackboneElement {
	/**
	 * Returns the value of the '<em><b>Protocol</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * A list of the messaging transport protocol(s) identifiers, supported by this endpoint.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Protocol</em>' containment reference.
	 * @see #setProtocol(Coding)
	 * @see org.hl7.fhir.FhirPackage#getCapabilityStatementEndpoint_Protocol()
	 * @model containment="true" required="true"
	 *        extendedMetaData="kind='element' name='protocol' namespace='##targetNamespace'"
	 * @generated
	 */
	Coding getProtocol();

	/**
	 * Sets the value of the '{@link org.hl7.fhir.CapabilityStatementEndpoint#getProtocol <em>Protocol</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Protocol</em>' containment reference.
	 * @see #getProtocol()
	 * @generated
	 */
	void setProtocol(Coding value);

	/**
	 * Returns the value of the '<em><b>Address</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The network address of the end-point. For solutions that do not use network addresses for routing, it can be just an identifier.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Address</em>' containment reference.
	 * @see #setAddress(Uri)
	 * @see org.hl7.fhir.FhirPackage#getCapabilityStatementEndpoint_Address()
	 * @model containment="true" required="true"
	 *        extendedMetaData="kind='element' name='address' namespace='##targetNamespace'"
	 * @generated
	 */
	Uri getAddress();

	/**
	 * Sets the value of the '{@link org.hl7.fhir.CapabilityStatementEndpoint#getAddress <em>Address</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Address</em>' containment reference.
	 * @see #getAddress()
	 * @generated
	 */
	void setAddress(Uri value);

} // CapabilityStatementEndpoint
