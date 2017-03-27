/**
 */
package org.hl7.fhir;

import java.util.List;

import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;

import org.hl7.fhir.jaxb.CommunicationImplAdapter;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Communication</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * An occurrence of information being transmitted; e.g. an alert that was sent to a responsible provider, a public health agency was notified about a reportable condition.
 * If the element is present, it must have either a @value, an @id, or extensions
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.hl7.fhir.Communication#getIdentifier <em>Identifier</em>}</li>
 *   <li>{@link org.hl7.fhir.Communication#getDefinition <em>Definition</em>}</li>
 *   <li>{@link org.hl7.fhir.Communication#getBasedOn <em>Based On</em>}</li>
 *   <li>{@link org.hl7.fhir.Communication#getPartOf <em>Part Of</em>}</li>
 *   <li>{@link org.hl7.fhir.Communication#getStatus <em>Status</em>}</li>
 *   <li>{@link org.hl7.fhir.Communication#getNotDone <em>Not Done</em>}</li>
 *   <li>{@link org.hl7.fhir.Communication#getNotDoneReason <em>Not Done Reason</em>}</li>
 *   <li>{@link org.hl7.fhir.Communication#getCategory <em>Category</em>}</li>
 *   <li>{@link org.hl7.fhir.Communication#getMedium <em>Medium</em>}</li>
 *   <li>{@link org.hl7.fhir.Communication#getSubject <em>Subject</em>}</li>
 *   <li>{@link org.hl7.fhir.Communication#getRecipient <em>Recipient</em>}</li>
 *   <li>{@link org.hl7.fhir.Communication#getTopic <em>Topic</em>}</li>
 *   <li>{@link org.hl7.fhir.Communication#getContext <em>Context</em>}</li>
 *   <li>{@link org.hl7.fhir.Communication#getSent <em>Sent</em>}</li>
 *   <li>{@link org.hl7.fhir.Communication#getReceived <em>Received</em>}</li>
 *   <li>{@link org.hl7.fhir.Communication#getSender <em>Sender</em>}</li>
 *   <li>{@link org.hl7.fhir.Communication#getReasonCode <em>Reason Code</em>}</li>
 *   <li>{@link org.hl7.fhir.Communication#getReasonReference <em>Reason Reference</em>}</li>
 *   <li>{@link org.hl7.fhir.Communication#getPayload <em>Payload</em>}</li>
 *   <li>{@link org.hl7.fhir.Communication#getNote <em>Note</em>}</li>
 * </ul>
 *
 * @see org.hl7.fhir.FhirPackage#getCommunication()
 * @model extendedMetaData="name='Communication' kind='elementOnly'"
 * @generated
 */
@XmlJavaTypeAdapter(CommunicationImplAdapter.class)
public interface Communication extends DomainResource {
	/**
	 * Returns the value of the '<em><b>Identifier</b></em>' containment reference list.
	 * The list contents are of type {@link org.hl7.fhir.Identifier}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Identifiers associated with this Communication that are defined by business processes and/ or used to refer to it when a direct URL reference to the resource itself is not appropriate (e.g. in CDA documents, or in written / printed documentation).
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Identifier</em>' containment reference list.
	 * @see org.hl7.fhir.FhirPackage#getCommunication_Identifier()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='identifier' namespace='##targetNamespace'"
	 * @generated
	 */
	List<Identifier> getIdentifier();

	/**
	 * Returns the value of the '<em><b>Definition</b></em>' containment reference list.
	 * The list contents are of type {@link org.hl7.fhir.Reference}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * A protocol, guideline, or other definition that was adhered to in whole or in part by this communication event.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Definition</em>' containment reference list.
	 * @see org.hl7.fhir.FhirPackage#getCommunication_Definition()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='definition' namespace='##targetNamespace'"
	 * @generated
	 */
	List<Reference> getDefinition();

	/**
	 * Returns the value of the '<em><b>Based On</b></em>' containment reference list.
	 * The list contents are of type {@link org.hl7.fhir.Reference}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * An order, proposal or plan fulfilled in whole or in part by this Communication.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Based On</em>' containment reference list.
	 * @see org.hl7.fhir.FhirPackage#getCommunication_BasedOn()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='basedOn' namespace='##targetNamespace'"
	 * @generated
	 */
	List<Reference> getBasedOn();

	/**
	 * Returns the value of the '<em><b>Part Of</b></em>' containment reference list.
	 * The list contents are of type {@link org.hl7.fhir.Reference}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Part of this action.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Part Of</em>' containment reference list.
	 * @see org.hl7.fhir.FhirPackage#getCommunication_PartOf()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='partOf' namespace='##targetNamespace'"
	 * @generated
	 */
	List<Reference> getPartOf();

	/**
	 * Returns the value of the '<em><b>Status</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The status of the transmission.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Status</em>' containment reference.
	 * @see #setStatus(EventStatus)
	 * @see org.hl7.fhir.FhirPackage#getCommunication_Status()
	 * @model containment="true" required="true"
	 *        extendedMetaData="kind='element' name='status' namespace='##targetNamespace'"
	 * @generated
	 */
	EventStatus getStatus();

	/**
	 * Sets the value of the '{@link org.hl7.fhir.Communication#getStatus <em>Status</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Status</em>' containment reference.
	 * @see #getStatus()
	 * @generated
	 */
	void setStatus(EventStatus value);

	/**
	 * Returns the value of the '<em><b>Not Done</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * If true, indicates that the described communication event did not actually occur.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Not Done</em>' containment reference.
	 * @see #setNotDone(org.hl7.fhir.Boolean)
	 * @see org.hl7.fhir.FhirPackage#getCommunication_NotDone()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='notDone' namespace='##targetNamespace'"
	 * @generated
	 */
	org.hl7.fhir.Boolean getNotDone();

	/**
	 * Sets the value of the '{@link org.hl7.fhir.Communication#getNotDone <em>Not Done</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Not Done</em>' containment reference.
	 * @see #getNotDone()
	 * @generated
	 */
	void setNotDone(org.hl7.fhir.Boolean value);

	/**
	 * Returns the value of the '<em><b>Not Done Reason</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Describes why the communication event did not occur in coded and/or textual form.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Not Done Reason</em>' containment reference.
	 * @see #setNotDoneReason(CodeableConcept)
	 * @see org.hl7.fhir.FhirPackage#getCommunication_NotDoneReason()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='notDoneReason' namespace='##targetNamespace'"
	 * @generated
	 */
	CodeableConcept getNotDoneReason();

	/**
	 * Sets the value of the '{@link org.hl7.fhir.Communication#getNotDoneReason <em>Not Done Reason</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Not Done Reason</em>' containment reference.
	 * @see #getNotDoneReason()
	 * @generated
	 */
	void setNotDoneReason(CodeableConcept value);

	/**
	 * Returns the value of the '<em><b>Category</b></em>' containment reference list.
	 * The list contents are of type {@link org.hl7.fhir.CodeableConcept}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The type of message conveyed such as alert, notification, reminder, instruction, etc.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Category</em>' containment reference list.
	 * @see org.hl7.fhir.FhirPackage#getCommunication_Category()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='category' namespace='##targetNamespace'"
	 * @generated
	 */
	List<CodeableConcept> getCategory();

	/**
	 * Returns the value of the '<em><b>Medium</b></em>' containment reference list.
	 * The list contents are of type {@link org.hl7.fhir.CodeableConcept}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * A channel that was used for this communication (e.g. email, fax).
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Medium</em>' containment reference list.
	 * @see org.hl7.fhir.FhirPackage#getCommunication_Medium()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='medium' namespace='##targetNamespace'"
	 * @generated
	 */
	List<CodeableConcept> getMedium();

	/**
	 * Returns the value of the '<em><b>Subject</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The patient or group that was the focus of this communication.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Subject</em>' containment reference.
	 * @see #setSubject(Reference)
	 * @see org.hl7.fhir.FhirPackage#getCommunication_Subject()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='subject' namespace='##targetNamespace'"
	 * @generated
	 */
	Reference getSubject();

	/**
	 * Sets the value of the '{@link org.hl7.fhir.Communication#getSubject <em>Subject</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Subject</em>' containment reference.
	 * @see #getSubject()
	 * @generated
	 */
	void setSubject(Reference value);

	/**
	 * Returns the value of the '<em><b>Recipient</b></em>' containment reference list.
	 * The list contents are of type {@link org.hl7.fhir.Reference}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The entity (e.g. person, organization, clinical information system, or device) which was the target of the communication. If receipts need to be tracked by individual, a separate resource instance will need to be created for each recipient.  Multiple recipient communications are intended where either a receipt(s) is not tracked (e.g. a mass mail-out) or is captured in aggregate (all emails confirmed received by a particular time).
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Recipient</em>' containment reference list.
	 * @see org.hl7.fhir.FhirPackage#getCommunication_Recipient()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='recipient' namespace='##targetNamespace'"
	 * @generated
	 */
	List<Reference> getRecipient();

	/**
	 * Returns the value of the '<em><b>Topic</b></em>' containment reference list.
	 * The list contents are of type {@link org.hl7.fhir.Reference}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The resources which were responsible for or related to producing this communication.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Topic</em>' containment reference list.
	 * @see org.hl7.fhir.FhirPackage#getCommunication_Topic()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='topic' namespace='##targetNamespace'"
	 * @generated
	 */
	List<Reference> getTopic();

	/**
	 * Returns the value of the '<em><b>Context</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The encounter within which the communication was sent.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Context</em>' containment reference.
	 * @see #setContext(Reference)
	 * @see org.hl7.fhir.FhirPackage#getCommunication_Context()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='context' namespace='##targetNamespace'"
	 * @generated
	 */
	Reference getContext();

	/**
	 * Sets the value of the '{@link org.hl7.fhir.Communication#getContext <em>Context</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Context</em>' containment reference.
	 * @see #getContext()
	 * @generated
	 */
	void setContext(Reference value);

	/**
	 * Returns the value of the '<em><b>Sent</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The time when this communication was sent.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Sent</em>' containment reference.
	 * @see #setSent(DateTime)
	 * @see org.hl7.fhir.FhirPackage#getCommunication_Sent()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='sent' namespace='##targetNamespace'"
	 * @generated
	 */
	DateTime getSent();

	/**
	 * Sets the value of the '{@link org.hl7.fhir.Communication#getSent <em>Sent</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Sent</em>' containment reference.
	 * @see #getSent()
	 * @generated
	 */
	void setSent(DateTime value);

	/**
	 * Returns the value of the '<em><b>Received</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The time when this communication arrived at the destination.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Received</em>' containment reference.
	 * @see #setReceived(DateTime)
	 * @see org.hl7.fhir.FhirPackage#getCommunication_Received()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='received' namespace='##targetNamespace'"
	 * @generated
	 */
	DateTime getReceived();

	/**
	 * Sets the value of the '{@link org.hl7.fhir.Communication#getReceived <em>Received</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Received</em>' containment reference.
	 * @see #getReceived()
	 * @generated
	 */
	void setReceived(DateTime value);

	/**
	 * Returns the value of the '<em><b>Sender</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The entity (e.g. person, organization, clinical information system, or device) which was the source of the communication.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Sender</em>' containment reference.
	 * @see #setSender(Reference)
	 * @see org.hl7.fhir.FhirPackage#getCommunication_Sender()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='sender' namespace='##targetNamespace'"
	 * @generated
	 */
	Reference getSender();

	/**
	 * Sets the value of the '{@link org.hl7.fhir.Communication#getSender <em>Sender</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Sender</em>' containment reference.
	 * @see #getSender()
	 * @generated
	 */
	void setSender(Reference value);

	/**
	 * Returns the value of the '<em><b>Reason Code</b></em>' containment reference list.
	 * The list contents are of type {@link org.hl7.fhir.CodeableConcept}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The reason or justification for the communication.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Reason Code</em>' containment reference list.
	 * @see org.hl7.fhir.FhirPackage#getCommunication_ReasonCode()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='reasonCode' namespace='##targetNamespace'"
	 * @generated
	 */
	List<CodeableConcept> getReasonCode();

	/**
	 * Returns the value of the '<em><b>Reason Reference</b></em>' containment reference list.
	 * The list contents are of type {@link org.hl7.fhir.Reference}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Indicates another resource whose existence justifies this communication.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Reason Reference</em>' containment reference list.
	 * @see org.hl7.fhir.FhirPackage#getCommunication_ReasonReference()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='reasonReference' namespace='##targetNamespace'"
	 * @generated
	 */
	List<Reference> getReasonReference();

	/**
	 * Returns the value of the '<em><b>Payload</b></em>' containment reference list.
	 * The list contents are of type {@link org.hl7.fhir.CommunicationPayload}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Text, attachment(s), or resource(s) that was communicated to the recipient.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Payload</em>' containment reference list.
	 * @see org.hl7.fhir.FhirPackage#getCommunication_Payload()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='payload' namespace='##targetNamespace'"
	 * @generated
	 */
	List<CommunicationPayload> getPayload();

	/**
	 * Returns the value of the '<em><b>Note</b></em>' containment reference list.
	 * The list contents are of type {@link org.hl7.fhir.Annotation}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Additional notes or commentary about the communication by the sender, receiver or other interested parties.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Note</em>' containment reference list.
	 * @see org.hl7.fhir.FhirPackage#getCommunication_Note()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='note' namespace='##targetNamespace'"
	 * @generated
	 */
	List<Annotation> getNote();

} // Communication
