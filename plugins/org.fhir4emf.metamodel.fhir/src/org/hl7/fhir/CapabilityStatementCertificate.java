/**
 */
package org.hl7.fhir;

import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;

import org.hl7.fhir.jaxb.CapabilityStatementCertificateImplAdapter;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Capability Statement Certificate</b></em>'.
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
 *   <li>{@link org.hl7.fhir.CapabilityStatementCertificate#getType <em>Type</em>}</li>
 *   <li>{@link org.hl7.fhir.CapabilityStatementCertificate#getBlob <em>Blob</em>}</li>
 * </ul>
 *
 * @see org.hl7.fhir.FhirPackage#getCapabilityStatementCertificate()
 * @model extendedMetaData="name='CapabilityStatement.Certificate' kind='elementOnly'"
 * @generated
 */
@XmlJavaTypeAdapter(CapabilityStatementCertificateImplAdapter.class)
public interface CapabilityStatementCertificate extends BackboneElement {
	/**
	 * Returns the value of the '<em><b>Type</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Mime type for a certificate.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Type</em>' containment reference.
	 * @see #setType(Code)
	 * @see org.hl7.fhir.FhirPackage#getCapabilityStatementCertificate_Type()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='type' namespace='##targetNamespace'"
	 * @generated
	 */
	Code getType();

	/**
	 * Sets the value of the '{@link org.hl7.fhir.CapabilityStatementCertificate#getType <em>Type</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Type</em>' containment reference.
	 * @see #getType()
	 * @generated
	 */
	void setType(Code value);

	/**
	 * Returns the value of the '<em><b>Blob</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Actual certificate.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Blob</em>' containment reference.
	 * @see #setBlob(Base64Binary)
	 * @see org.hl7.fhir.FhirPackage#getCapabilityStatementCertificate_Blob()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='blob' namespace='##targetNamespace'"
	 * @generated
	 */
	Base64Binary getBlob();

	/**
	 * Sets the value of the '{@link org.hl7.fhir.CapabilityStatementCertificate#getBlob <em>Blob</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Blob</em>' containment reference.
	 * @see #getBlob()
	 * @generated
	 */
	void setBlob(Base64Binary value);

} // CapabilityStatementCertificate
