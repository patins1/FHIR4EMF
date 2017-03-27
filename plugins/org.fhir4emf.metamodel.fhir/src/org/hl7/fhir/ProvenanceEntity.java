/**
 */
package org.hl7.fhir;

import java.util.List;

import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;

import org.hl7.fhir.jaxb.ProvenanceEntityImplAdapter;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Provenance Entity</b></em>'.
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
 *   <li>{@link org.hl7.fhir.ProvenanceEntity#getRole <em>Role</em>}</li>
 *   <li>{@link org.hl7.fhir.ProvenanceEntity#getWhatUri <em>What Uri</em>}</li>
 *   <li>{@link org.hl7.fhir.ProvenanceEntity#getWhatReference <em>What Reference</em>}</li>
 *   <li>{@link org.hl7.fhir.ProvenanceEntity#getWhatIdentifier <em>What Identifier</em>}</li>
 *   <li>{@link org.hl7.fhir.ProvenanceEntity#getAgent <em>Agent</em>}</li>
 * </ul>
 *
 * @see org.hl7.fhir.FhirPackage#getProvenanceEntity()
 * @model extendedMetaData="name='Provenance.Entity' kind='elementOnly'"
 * @generated
 */
@XmlJavaTypeAdapter(ProvenanceEntityImplAdapter.class)
public interface ProvenanceEntity extends BackboneElement {
	/**
	 * Returns the value of the '<em><b>Role</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * How the entity was used during the activity.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Role</em>' containment reference.
	 * @see #setRole(ProvenanceEntityRole)
	 * @see org.hl7.fhir.FhirPackage#getProvenanceEntity_Role()
	 * @model containment="true" required="true"
	 *        extendedMetaData="kind='element' name='role' namespace='##targetNamespace'"
	 * @generated
	 */
	ProvenanceEntityRole getRole();

	/**
	 * Sets the value of the '{@link org.hl7.fhir.ProvenanceEntity#getRole <em>Role</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Role</em>' containment reference.
	 * @see #getRole()
	 * @generated
	 */
	void setRole(ProvenanceEntityRole value);

	/**
	 * Returns the value of the '<em><b>What Uri</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Identity of the  Entity used. May be a logical or physical uri and maybe absolute or relative. (choose any one of what*, but only one)
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>What Uri</em>' containment reference.
	 * @see #setWhatUri(Uri)
	 * @see org.hl7.fhir.FhirPackage#getProvenanceEntity_WhatUri()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='whatUri' namespace='##targetNamespace'"
	 * @generated
	 */
	Uri getWhatUri();

	/**
	 * Sets the value of the '{@link org.hl7.fhir.ProvenanceEntity#getWhatUri <em>What Uri</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>What Uri</em>' containment reference.
	 * @see #getWhatUri()
	 * @generated
	 */
	void setWhatUri(Uri value);

	/**
	 * Returns the value of the '<em><b>What Reference</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Identity of the  Entity used. May be a logical or physical uri and maybe absolute or relative. (choose any one of what*, but only one)
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>What Reference</em>' containment reference.
	 * @see #setWhatReference(Reference)
	 * @see org.hl7.fhir.FhirPackage#getProvenanceEntity_WhatReference()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='whatReference' namespace='##targetNamespace'"
	 * @generated
	 */
	Reference getWhatReference();

	/**
	 * Sets the value of the '{@link org.hl7.fhir.ProvenanceEntity#getWhatReference <em>What Reference</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>What Reference</em>' containment reference.
	 * @see #getWhatReference()
	 * @generated
	 */
	void setWhatReference(Reference value);

	/**
	 * Returns the value of the '<em><b>What Identifier</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Identity of the  Entity used. May be a logical or physical uri and maybe absolute or relative. (choose any one of what*, but only one)
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>What Identifier</em>' containment reference.
	 * @see #setWhatIdentifier(Identifier)
	 * @see org.hl7.fhir.FhirPackage#getProvenanceEntity_WhatIdentifier()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='whatIdentifier' namespace='##targetNamespace'"
	 * @generated
	 */
	Identifier getWhatIdentifier();

	/**
	 * Sets the value of the '{@link org.hl7.fhir.ProvenanceEntity#getWhatIdentifier <em>What Identifier</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>What Identifier</em>' containment reference.
	 * @see #getWhatIdentifier()
	 * @generated
	 */
	void setWhatIdentifier(Identifier value);

	/**
	 * Returns the value of the '<em><b>Agent</b></em>' containment reference list.
	 * The list contents are of type {@link org.hl7.fhir.ProvenanceAgent}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The entity is attributed to an agent to express the agent's responsibility for that entity, possibly along with other agents. This description can be understood as shorthand for saying that the agent was responsible for the activity which generated the entity.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Agent</em>' containment reference list.
	 * @see org.hl7.fhir.FhirPackage#getProvenanceEntity_Agent()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='agent' namespace='##targetNamespace'"
	 * @generated
	 */
	List<ProvenanceAgent> getAgent();

} // ProvenanceEntity
