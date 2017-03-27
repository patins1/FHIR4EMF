/**
 */
package org.hl7.fhir;

import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;

import org.hl7.fhir.jaxb.SupplyRequestRequesterImplAdapter;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Supply Request Requester</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * A record of a request for a medication, substance or device used in the healthcare setting.
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.hl7.fhir.SupplyRequestRequester#getAgent <em>Agent</em>}</li>
 *   <li>{@link org.hl7.fhir.SupplyRequestRequester#getOnBehalfOf <em>On Behalf Of</em>}</li>
 * </ul>
 *
 * @see org.hl7.fhir.FhirPackage#getSupplyRequestRequester()
 * @model extendedMetaData="name='SupplyRequest.Requester' kind='elementOnly'"
 * @generated
 */
@XmlJavaTypeAdapter(SupplyRequestRequesterImplAdapter.class)
public interface SupplyRequestRequester extends BackboneElement {
	/**
	 * Returns the value of the '<em><b>Agent</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The device, practitioner, etc. who initiated the request.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Agent</em>' containment reference.
	 * @see #setAgent(Reference)
	 * @see org.hl7.fhir.FhirPackage#getSupplyRequestRequester_Agent()
	 * @model containment="true" required="true"
	 *        extendedMetaData="kind='element' name='agent' namespace='##targetNamespace'"
	 * @generated
	 */
	Reference getAgent();

	/**
	 * Sets the value of the '{@link org.hl7.fhir.SupplyRequestRequester#getAgent <em>Agent</em>}' containment reference.
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
	 * @see org.hl7.fhir.FhirPackage#getSupplyRequestRequester_OnBehalfOf()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='onBehalfOf' namespace='##targetNamespace'"
	 * @generated
	 */
	Reference getOnBehalfOf();

	/**
	 * Sets the value of the '{@link org.hl7.fhir.SupplyRequestRequester#getOnBehalfOf <em>On Behalf Of</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>On Behalf Of</em>' containment reference.
	 * @see #getOnBehalfOf()
	 * @generated
	 */
	void setOnBehalfOf(Reference value);

} // SupplyRequestRequester
