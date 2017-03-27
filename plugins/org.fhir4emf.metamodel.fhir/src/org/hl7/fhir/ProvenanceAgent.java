/**
 */
package org.hl7.fhir;

import java.util.List;

import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;

import org.hl7.fhir.jaxb.ProvenanceAgentImplAdapter;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Provenance Agent</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * Provenance of a resource is a record that describes entities and processes involved in producing and delivering or otherwise influencing that resource. Provenance provides a critical foundation for assessing authenticity, enabling trust, and allowing reproducibility. Provenance assertions are a form of contextual metadata and can themselves become important records with their own provenance. Provenance statement indicates clinical significance in terms of confidence in authenticity, reliability, and trustworthiness, integrity, and stage in lifecycle (e.g. Document Completion - has the artifact been legally authenticated), all of which may impact security, privacy, and trust policies.
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.hl7.fhir.ProvenanceAgent#getRole <em>Role</em>}</li>
 *   <li>{@link org.hl7.fhir.ProvenanceAgent#getWhoUri <em>Who Uri</em>}</li>
 *   <li>{@link org.hl7.fhir.ProvenanceAgent#getWhoReference <em>Who Reference</em>}</li>
 *   <li>{@link org.hl7.fhir.ProvenanceAgent#getOnBehalfOfUri <em>On Behalf Of Uri</em>}</li>
 *   <li>{@link org.hl7.fhir.ProvenanceAgent#getOnBehalfOfReference <em>On Behalf Of Reference</em>}</li>
 *   <li>{@link org.hl7.fhir.ProvenanceAgent#getRelatedAgentType <em>Related Agent Type</em>}</li>
 * </ul>
 *
 * @see org.hl7.fhir.FhirPackage#getProvenanceAgent()
 * @model extendedMetaData="name='Provenance.Agent' kind='elementOnly'"
 * @generated
 */
@XmlJavaTypeAdapter(ProvenanceAgentImplAdapter.class)
public interface ProvenanceAgent extends BackboneElement {
	/**
	 * Returns the value of the '<em><b>Role</b></em>' containment reference list.
	 * The list contents are of type {@link org.hl7.fhir.CodeableConcept}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The function of the agent with respect to the activity. The security role enabling the agent with respect to the activity.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Role</em>' containment reference list.
	 * @see org.hl7.fhir.FhirPackage#getProvenanceAgent_Role()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='role' namespace='##targetNamespace'"
	 * @generated
	 */
	List<CodeableConcept> getRole();

	/**
	 * Returns the value of the '<em><b>Who Uri</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The individual, device or organization that participated in the event. (choose any one of who*, but only one)
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Who Uri</em>' containment reference.
	 * @see #setWhoUri(Uri)
	 * @see org.hl7.fhir.FhirPackage#getProvenanceAgent_WhoUri()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='whoUri' namespace='##targetNamespace'"
	 * @generated
	 */
	Uri getWhoUri();

	/**
	 * Sets the value of the '{@link org.hl7.fhir.ProvenanceAgent#getWhoUri <em>Who Uri</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Who Uri</em>' containment reference.
	 * @see #getWhoUri()
	 * @generated
	 */
	void setWhoUri(Uri value);

	/**
	 * Returns the value of the '<em><b>Who Reference</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The individual, device or organization that participated in the event. (choose any one of who*, but only one)
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Who Reference</em>' containment reference.
	 * @see #setWhoReference(Reference)
	 * @see org.hl7.fhir.FhirPackage#getProvenanceAgent_WhoReference()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='whoReference' namespace='##targetNamespace'"
	 * @generated
	 */
	Reference getWhoReference();

	/**
	 * Sets the value of the '{@link org.hl7.fhir.ProvenanceAgent#getWhoReference <em>Who Reference</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Who Reference</em>' containment reference.
	 * @see #getWhoReference()
	 * @generated
	 */
	void setWhoReference(Reference value);

	/**
	 * Returns the value of the '<em><b>On Behalf Of Uri</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The individual, device, or organization for whom the change was made. (choose any one of onBehalfOf*, but only one)
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>On Behalf Of Uri</em>' containment reference.
	 * @see #setOnBehalfOfUri(Uri)
	 * @see org.hl7.fhir.FhirPackage#getProvenanceAgent_OnBehalfOfUri()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='onBehalfOfUri' namespace='##targetNamespace'"
	 * @generated
	 */
	Uri getOnBehalfOfUri();

	/**
	 * Sets the value of the '{@link org.hl7.fhir.ProvenanceAgent#getOnBehalfOfUri <em>On Behalf Of Uri</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>On Behalf Of Uri</em>' containment reference.
	 * @see #getOnBehalfOfUri()
	 * @generated
	 */
	void setOnBehalfOfUri(Uri value);

	/**
	 * Returns the value of the '<em><b>On Behalf Of Reference</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The individual, device, or organization for whom the change was made. (choose any one of onBehalfOf*, but only one)
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>On Behalf Of Reference</em>' containment reference.
	 * @see #setOnBehalfOfReference(Reference)
	 * @see org.hl7.fhir.FhirPackage#getProvenanceAgent_OnBehalfOfReference()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='onBehalfOfReference' namespace='##targetNamespace'"
	 * @generated
	 */
	Reference getOnBehalfOfReference();

	/**
	 * Sets the value of the '{@link org.hl7.fhir.ProvenanceAgent#getOnBehalfOfReference <em>On Behalf Of Reference</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>On Behalf Of Reference</em>' containment reference.
	 * @see #getOnBehalfOfReference()
	 * @generated
	 */
	void setOnBehalfOfReference(Reference value);

	/**
	 * Returns the value of the '<em><b>Related Agent Type</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The type of relationship between agents.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Related Agent Type</em>' containment reference.
	 * @see #setRelatedAgentType(CodeableConcept)
	 * @see org.hl7.fhir.FhirPackage#getProvenanceAgent_RelatedAgentType()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='relatedAgentType' namespace='##targetNamespace'"
	 * @generated
	 */
	CodeableConcept getRelatedAgentType();

	/**
	 * Sets the value of the '{@link org.hl7.fhir.ProvenanceAgent#getRelatedAgentType <em>Related Agent Type</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Related Agent Type</em>' containment reference.
	 * @see #getRelatedAgentType()
	 * @generated
	 */
	void setRelatedAgentType(CodeableConcept value);

} // ProvenanceAgent
