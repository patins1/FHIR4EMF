/**
 */
package org.hl7.fhir;

import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;

import org.hl7.fhir.jaxb.ProcedureRequestRequesterImplAdapter;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Procedure Request Requester</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * A record of a request for diagnostic investigations, treatments, or operations to be performed.
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.hl7.fhir.ProcedureRequestRequester#getAgent <em>Agent</em>}</li>
 *   <li>{@link org.hl7.fhir.ProcedureRequestRequester#getOnBehalfOf <em>On Behalf Of</em>}</li>
 * </ul>
 *
 * @see org.hl7.fhir.FhirPackage#getProcedureRequestRequester()
 * @model extendedMetaData="name='ProcedureRequest.Requester' kind='elementOnly'"
 * @generated
 */
@XmlJavaTypeAdapter(ProcedureRequestRequesterImplAdapter.class)
public interface ProcedureRequestRequester extends BackboneElement {
	/**
	 * Returns the value of the '<em><b>Agent</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The device, practitioner or organization who initiated the request.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Agent</em>' containment reference.
	 * @see #setAgent(Reference)
	 * @see org.hl7.fhir.FhirPackage#getProcedureRequestRequester_Agent()
	 * @model containment="true" required="true"
	 *        extendedMetaData="kind='element' name='agent' namespace='##targetNamespace'"
	 * @generated
	 */
	Reference getAgent();

	/**
	 * Sets the value of the '{@link org.hl7.fhir.ProcedureRequestRequester#getAgent <em>Agent</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Agent</em>' containment reference.
	 * @see #getAgent()
	 * @generated
	 */
	void setAgent(Reference value);

	/**
	 * Returns the value of the '<em><b>On Behalf Of</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The organization the device or practitioner was acting on behalf of.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>On Behalf Of</em>' containment reference.
	 * @see #setOnBehalfOf(Reference)
	 * @see org.hl7.fhir.FhirPackage#getProcedureRequestRequester_OnBehalfOf()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='onBehalfOf' namespace='##targetNamespace'"
	 * @generated
	 */
	Reference getOnBehalfOf();

	/**
	 * Sets the value of the '{@link org.hl7.fhir.ProcedureRequestRequester#getOnBehalfOf <em>On Behalf Of</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>On Behalf Of</em>' containment reference.
	 * @see #getOnBehalfOf()
	 * @generated
	 */
	void setOnBehalfOf(Reference value);

} // ProcedureRequestRequester
