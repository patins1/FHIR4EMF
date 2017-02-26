/**
 */
package org.hl7.fhir;

import java.util.List;

import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;

import org.hl7.fhir.jaxb.TaskImplAdapter;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Task</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * A task to be performed.
 * If the element is present, it must have either a @value, an @id, or extensions
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.hl7.fhir.Task#getIdentifier <em>Identifier</em>}</li>
 *   <li>{@link org.hl7.fhir.Task#getDefinitionUri <em>Definition Uri</em>}</li>
 *   <li>{@link org.hl7.fhir.Task#getDefinitionReference <em>Definition Reference</em>}</li>
 *   <li>{@link org.hl7.fhir.Task#getBasedOn <em>Based On</em>}</li>
 *   <li>{@link org.hl7.fhir.Task#getGroupIdentifier <em>Group Identifier</em>}</li>
 *   <li>{@link org.hl7.fhir.Task#getPartOf <em>Part Of</em>}</li>
 *   <li>{@link org.hl7.fhir.Task#getStatus <em>Status</em>}</li>
 *   <li>{@link org.hl7.fhir.Task#getStatusReason <em>Status Reason</em>}</li>
 *   <li>{@link org.hl7.fhir.Task#getBusinessStatus <em>Business Status</em>}</li>
 *   <li>{@link org.hl7.fhir.Task#getIntent <em>Intent</em>}</li>
 *   <li>{@link org.hl7.fhir.Task#getPriority <em>Priority</em>}</li>
 *   <li>{@link org.hl7.fhir.Task#getCode <em>Code</em>}</li>
 *   <li>{@link org.hl7.fhir.Task#getDescription <em>Description</em>}</li>
 *   <li>{@link org.hl7.fhir.Task#getFocus <em>Focus</em>}</li>
 *   <li>{@link org.hl7.fhir.Task#getFor <em>For</em>}</li>
 *   <li>{@link org.hl7.fhir.Task#getContext <em>Context</em>}</li>
 *   <li>{@link org.hl7.fhir.Task#getExecutionPeriod <em>Execution Period</em>}</li>
 *   <li>{@link org.hl7.fhir.Task#getAuthoredOn <em>Authored On</em>}</li>
 *   <li>{@link org.hl7.fhir.Task#getLastModified <em>Last Modified</em>}</li>
 *   <li>{@link org.hl7.fhir.Task#getRequester <em>Requester</em>}</li>
 *   <li>{@link org.hl7.fhir.Task#getPerformerType <em>Performer Type</em>}</li>
 *   <li>{@link org.hl7.fhir.Task#getOwner <em>Owner</em>}</li>
 *   <li>{@link org.hl7.fhir.Task#getReason <em>Reason</em>}</li>
 *   <li>{@link org.hl7.fhir.Task#getNote <em>Note</em>}</li>
 *   <li>{@link org.hl7.fhir.Task#getRelevantHistory <em>Relevant History</em>}</li>
 *   <li>{@link org.hl7.fhir.Task#getRestriction <em>Restriction</em>}</li>
 *   <li>{@link org.hl7.fhir.Task#getInput <em>Input</em>}</li>
 *   <li>{@link org.hl7.fhir.Task#getOutput <em>Output</em>}</li>
 * </ul>
 *
 * @see org.hl7.fhir.FhirPackage#getTask()
 * @model extendedMetaData="name='Task' kind='elementOnly'"
 * @generated
 */
@XmlJavaTypeAdapter(TaskImplAdapter.class)
public interface Task extends DomainResource {
	/**
	 * Returns the value of the '<em><b>Identifier</b></em>' containment reference list.
	 * The list contents are of type {@link org.hl7.fhir.Identifier}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The business identifier for this task.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Identifier</em>' containment reference list.
	 * @see org.hl7.fhir.FhirPackage#getTask_Identifier()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='identifier' namespace='##targetNamespace'"
	 * @generated
	 */
	List<Identifier> getIdentifier();

	/**
	 * Returns the value of the '<em><b>Definition Uri</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * A reference to a formal or informal definition of the task.  For example, a protocol, a step within a defined workflow definition, etc. (choose any one of definition*, but only one)
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Definition Uri</em>' containment reference.
	 * @see #setDefinitionUri(Uri)
	 * @see org.hl7.fhir.FhirPackage#getTask_DefinitionUri()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='definitionUri' namespace='##targetNamespace'"
	 * @generated
	 */
	Uri getDefinitionUri();

	/**
	 * Sets the value of the '{@link org.hl7.fhir.Task#getDefinitionUri <em>Definition Uri</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Definition Uri</em>' containment reference.
	 * @see #getDefinitionUri()
	 * @generated
	 */
	void setDefinitionUri(Uri value);

	/**
	 * Returns the value of the '<em><b>Definition Reference</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * A reference to a formal or informal definition of the task.  For example, a protocol, a step within a defined workflow definition, etc. (choose any one of definition*, but only one)
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Definition Reference</em>' containment reference.
	 * @see #setDefinitionReference(Reference)
	 * @see org.hl7.fhir.FhirPackage#getTask_DefinitionReference()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='definitionReference' namespace='##targetNamespace'"
	 * @generated
	 */
	Reference getDefinitionReference();

	/**
	 * Sets the value of the '{@link org.hl7.fhir.Task#getDefinitionReference <em>Definition Reference</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Definition Reference</em>' containment reference.
	 * @see #getDefinitionReference()
	 * @generated
	 */
	void setDefinitionReference(Reference value);

	/**
	 * Returns the value of the '<em><b>Based On</b></em>' containment reference list.
	 * The list contents are of type {@link org.hl7.fhir.Reference}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * BasedOn refers to a higher-level authorization that triggered the creation of the task.  It references a "request" resource such as a ProcedureRequest, MedicationRequest, ProcedureRequest, CarePlan, etc. which is distinct from the "request" resource the task is seeking to fulfil.  This latter resource is referenced by FocusOn.  For example, based on a ProcedureRequest (= BasedOn), a task is created to fulfil a procedureRequest ( = FocusOn ) to collect a specimen from a patient.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Based On</em>' containment reference list.
	 * @see org.hl7.fhir.FhirPackage#getTask_BasedOn()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='basedOn' namespace='##targetNamespace'"
	 * @generated
	 */
	List<Reference> getBasedOn();

	/**
	 * Returns the value of the '<em><b>Group Identifier</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * An identifier that links together multiple tasks and other requests that were created in the same context.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Group Identifier</em>' containment reference.
	 * @see #setGroupIdentifier(Identifier)
	 * @see org.hl7.fhir.FhirPackage#getTask_GroupIdentifier()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='groupIdentifier' namespace='##targetNamespace'"
	 * @generated
	 */
	Identifier getGroupIdentifier();

	/**
	 * Sets the value of the '{@link org.hl7.fhir.Task#getGroupIdentifier <em>Group Identifier</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Group Identifier</em>' containment reference.
	 * @see #getGroupIdentifier()
	 * @generated
	 */
	void setGroupIdentifier(Identifier value);

	/**
	 * Returns the value of the '<em><b>Part Of</b></em>' containment reference list.
	 * The list contents are of type {@link org.hl7.fhir.Reference}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Task that this particular task is part of.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Part Of</em>' containment reference list.
	 * @see org.hl7.fhir.FhirPackage#getTask_PartOf()
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
	 * The current status of the task.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Status</em>' containment reference.
	 * @see #setStatus(TaskStatus)
	 * @see org.hl7.fhir.FhirPackage#getTask_Status()
	 * @model containment="true" required="true"
	 *        extendedMetaData="kind='element' name='status' namespace='##targetNamespace'"
	 * @generated
	 */
	TaskStatus getStatus();

	/**
	 * Sets the value of the '{@link org.hl7.fhir.Task#getStatus <em>Status</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Status</em>' containment reference.
	 * @see #getStatus()
	 * @generated
	 */
	void setStatus(TaskStatus value);

	/**
	 * Returns the value of the '<em><b>Status Reason</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * An explanation as to why this task is held, failed, was refused, etc.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Status Reason</em>' containment reference.
	 * @see #setStatusReason(CodeableConcept)
	 * @see org.hl7.fhir.FhirPackage#getTask_StatusReason()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='statusReason' namespace='##targetNamespace'"
	 * @generated
	 */
	CodeableConcept getStatusReason();

	/**
	 * Sets the value of the '{@link org.hl7.fhir.Task#getStatusReason <em>Status Reason</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Status Reason</em>' containment reference.
	 * @see #getStatusReason()
	 * @generated
	 */
	void setStatusReason(CodeableConcept value);

	/**
	 * Returns the value of the '<em><b>Business Status</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Contains business-specific nuances of the business state.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Business Status</em>' containment reference.
	 * @see #setBusinessStatus(CodeableConcept)
	 * @see org.hl7.fhir.FhirPackage#getTask_BusinessStatus()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='businessStatus' namespace='##targetNamespace'"
	 * @generated
	 */
	CodeableConcept getBusinessStatus();

	/**
	 * Sets the value of the '{@link org.hl7.fhir.Task#getBusinessStatus <em>Business Status</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Business Status</em>' containment reference.
	 * @see #getBusinessStatus()
	 * @generated
	 */
	void setBusinessStatus(CodeableConcept value);

	/**
	 * Returns the value of the '<em><b>Intent</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Indicates the "level" of actionability associated with the Task.  I.e. Is this a proposed task, a planned task, an actionable task, etc.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Intent</em>' containment reference.
	 * @see #setIntent(Code)
	 * @see org.hl7.fhir.FhirPackage#getTask_Intent()
	 * @model containment="true" required="true"
	 *        extendedMetaData="kind='element' name='intent' namespace='##targetNamespace'"
	 * @generated
	 */
	Code getIntent();

	/**
	 * Sets the value of the '{@link org.hl7.fhir.Task#getIntent <em>Intent</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Intent</em>' containment reference.
	 * @see #getIntent()
	 * @generated
	 */
	void setIntent(Code value);

	/**
	 * Returns the value of the '<em><b>Priority</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Indicates how quickly the Task should be addressed with respect to other requests.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Priority</em>' containment reference.
	 * @see #setPriority(Code)
	 * @see org.hl7.fhir.FhirPackage#getTask_Priority()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='priority' namespace='##targetNamespace'"
	 * @generated
	 */
	Code getPriority();

	/**
	 * Sets the value of the '{@link org.hl7.fhir.Task#getPriority <em>Priority</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Priority</em>' containment reference.
	 * @see #getPriority()
	 * @generated
	 */
	void setPriority(Code value);

	/**
	 * Returns the value of the '<em><b>Code</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * A name or code (or both) briefly describing what the task involves.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Code</em>' containment reference.
	 * @see #setCode(CodeableConcept)
	 * @see org.hl7.fhir.FhirPackage#getTask_Code()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='code' namespace='##targetNamespace'"
	 * @generated
	 */
	CodeableConcept getCode();

	/**
	 * Sets the value of the '{@link org.hl7.fhir.Task#getCode <em>Code</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Code</em>' containment reference.
	 * @see #getCode()
	 * @generated
	 */
	void setCode(CodeableConcept value);

	/**
	 * Returns the value of the '<em><b>Description</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * A free-text description of what is to be performed.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Description</em>' containment reference.
	 * @see #setDescription(org.hl7.fhir.String)
	 * @see org.hl7.fhir.FhirPackage#getTask_Description()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='description' namespace='##targetNamespace'"
	 * @generated
	 */
	org.hl7.fhir.String getDescription();

	/**
	 * Sets the value of the '{@link org.hl7.fhir.Task#getDescription <em>Description</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Description</em>' containment reference.
	 * @see #getDescription()
	 * @generated
	 */
	void setDescription(org.hl7.fhir.String value);

	/**
	 * Returns the value of the '<em><b>Focus</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The request being actioned or the resource being manipulated by this task.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Focus</em>' containment reference.
	 * @see #setFocus(Reference)
	 * @see org.hl7.fhir.FhirPackage#getTask_Focus()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='focus' namespace='##targetNamespace'"
	 * @generated
	 */
	Reference getFocus();

	/**
	 * Sets the value of the '{@link org.hl7.fhir.Task#getFocus <em>Focus</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Focus</em>' containment reference.
	 * @see #getFocus()
	 * @generated
	 */
	void setFocus(Reference value);

	/**
	 * Returns the value of the '<em><b>For</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The entity who benefits from the performance of the service specified in the task (e.g., the patient).
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>For</em>' containment reference.
	 * @see #setFor(Reference)
	 * @see org.hl7.fhir.FhirPackage#getTask_For()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='for' namespace='##targetNamespace'"
	 * @generated
	 */
	Reference getFor();

	/**
	 * Sets the value of the '{@link org.hl7.fhir.Task#getFor <em>For</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>For</em>' containment reference.
	 * @see #getFor()
	 * @generated
	 */
	void setFor(Reference value);

	/**
	 * Returns the value of the '<em><b>Context</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The healthcare event  (e.g. a patient and healthcare provider interaction) during which this task was created.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Context</em>' containment reference.
	 * @see #setContext(Reference)
	 * @see org.hl7.fhir.FhirPackage#getTask_Context()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='context' namespace='##targetNamespace'"
	 * @generated
	 */
	Reference getContext();

	/**
	 * Sets the value of the '{@link org.hl7.fhir.Task#getContext <em>Context</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Context</em>' containment reference.
	 * @see #getContext()
	 * @generated
	 */
	void setContext(Reference value);

	/**
	 * Returns the value of the '<em><b>Execution Period</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Identifies the time action was first taken against the task (start) and/or the time final action was taken against the task prior to marking it as completed (end).
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Execution Period</em>' containment reference.
	 * @see #setExecutionPeriod(Period)
	 * @see org.hl7.fhir.FhirPackage#getTask_ExecutionPeriod()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='executionPeriod' namespace='##targetNamespace'"
	 * @generated
	 */
	Period getExecutionPeriod();

	/**
	 * Sets the value of the '{@link org.hl7.fhir.Task#getExecutionPeriod <em>Execution Period</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Execution Period</em>' containment reference.
	 * @see #getExecutionPeriod()
	 * @generated
	 */
	void setExecutionPeriod(Period value);

	/**
	 * Returns the value of the '<em><b>Authored On</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The date and time this task was created.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Authored On</em>' containment reference.
	 * @see #setAuthoredOn(DateTime)
	 * @see org.hl7.fhir.FhirPackage#getTask_AuthoredOn()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='authoredOn' namespace='##targetNamespace'"
	 * @generated
	 */
	DateTime getAuthoredOn();

	/**
	 * Sets the value of the '{@link org.hl7.fhir.Task#getAuthoredOn <em>Authored On</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Authored On</em>' containment reference.
	 * @see #getAuthoredOn()
	 * @generated
	 */
	void setAuthoredOn(DateTime value);

	/**
	 * Returns the value of the '<em><b>Last Modified</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The date and time of last modification to this task.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Last Modified</em>' containment reference.
	 * @see #setLastModified(DateTime)
	 * @see org.hl7.fhir.FhirPackage#getTask_LastModified()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='lastModified' namespace='##targetNamespace'"
	 * @generated
	 */
	DateTime getLastModified();

	/**
	 * Sets the value of the '{@link org.hl7.fhir.Task#getLastModified <em>Last Modified</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Last Modified</em>' containment reference.
	 * @see #getLastModified()
	 * @generated
	 */
	void setLastModified(DateTime value);

	/**
	 * Returns the value of the '<em><b>Requester</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The creator of the task.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Requester</em>' containment reference.
	 * @see #setRequester(TaskRequester)
	 * @see org.hl7.fhir.FhirPackage#getTask_Requester()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='requester' namespace='##targetNamespace'"
	 * @generated
	 */
	TaskRequester getRequester();

	/**
	 * Sets the value of the '{@link org.hl7.fhir.Task#getRequester <em>Requester</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Requester</em>' containment reference.
	 * @see #getRequester()
	 * @generated
	 */
	void setRequester(TaskRequester value);

	/**
	 * Returns the value of the '<em><b>Performer Type</b></em>' containment reference list.
	 * The list contents are of type {@link org.hl7.fhir.CodeableConcept}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The type of participant that can execute the task.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Performer Type</em>' containment reference list.
	 * @see org.hl7.fhir.FhirPackage#getTask_PerformerType()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='performerType' namespace='##targetNamespace'"
	 * @generated
	 */
	List<CodeableConcept> getPerformerType();

	/**
	 * Returns the value of the '<em><b>Owner</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The owner of this task.  The participant who can execute this task.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Owner</em>' containment reference.
	 * @see #setOwner(Reference)
	 * @see org.hl7.fhir.FhirPackage#getTask_Owner()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='owner' namespace='##targetNamespace'"
	 * @generated
	 */
	Reference getOwner();

	/**
	 * Sets the value of the '{@link org.hl7.fhir.Task#getOwner <em>Owner</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Owner</em>' containment reference.
	 * @see #getOwner()
	 * @generated
	 */
	void setOwner(Reference value);

	/**
	 * Returns the value of the '<em><b>Reason</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * A description or code indicating why this task needs to be performed.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Reason</em>' containment reference.
	 * @see #setReason(CodeableConcept)
	 * @see org.hl7.fhir.FhirPackage#getTask_Reason()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='reason' namespace='##targetNamespace'"
	 * @generated
	 */
	CodeableConcept getReason();

	/**
	 * Sets the value of the '{@link org.hl7.fhir.Task#getReason <em>Reason</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Reason</em>' containment reference.
	 * @see #getReason()
	 * @generated
	 */
	void setReason(CodeableConcept value);

	/**
	 * Returns the value of the '<em><b>Note</b></em>' containment reference list.
	 * The list contents are of type {@link org.hl7.fhir.Annotation}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Free-text information captured about the task as it progresses.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Note</em>' containment reference list.
	 * @see org.hl7.fhir.FhirPackage#getTask_Note()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='note' namespace='##targetNamespace'"
	 * @generated
	 */
	List<Annotation> getNote();

	/**
	 * Returns the value of the '<em><b>Relevant History</b></em>' containment reference list.
	 * The list contents are of type {@link org.hl7.fhir.Reference}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Links to Provenance records for past versions of this Task that identify key state transitions or updates that are likely to be relevant to a user looking at the current version of the task.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Relevant History</em>' containment reference list.
	 * @see org.hl7.fhir.FhirPackage#getTask_RelevantHistory()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='relevantHistory' namespace='##targetNamespace'"
	 * @generated
	 */
	List<Reference> getRelevantHistory();

	/**
	 * Returns the value of the '<em><b>Restriction</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * If the Task.focus is a request resource and the task is seeking fulfillment (i.e is asking for the request to be actioned), this element identifies any limitations on what parts of the referenced request should be actioned.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Restriction</em>' containment reference.
	 * @see #setRestriction(TaskRestriction)
	 * @see org.hl7.fhir.FhirPackage#getTask_Restriction()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='restriction' namespace='##targetNamespace'"
	 * @generated
	 */
	TaskRestriction getRestriction();

	/**
	 * Sets the value of the '{@link org.hl7.fhir.Task#getRestriction <em>Restriction</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Restriction</em>' containment reference.
	 * @see #getRestriction()
	 * @generated
	 */
	void setRestriction(TaskRestriction value);

	/**
	 * Returns the value of the '<em><b>Input</b></em>' containment reference list.
	 * The list contents are of type {@link org.hl7.fhir.TaskInput}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Additional information that may be needed in the execution of the task.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Input</em>' containment reference list.
	 * @see org.hl7.fhir.FhirPackage#getTask_Input()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='input' namespace='##targetNamespace'"
	 * @generated
	 */
	List<TaskInput> getInput();

	/**
	 * Returns the value of the '<em><b>Output</b></em>' containment reference list.
	 * The list contents are of type {@link org.hl7.fhir.TaskOutput}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Outputs produced by the Task.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Output</em>' containment reference list.
	 * @see org.hl7.fhir.FhirPackage#getTask_Output()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='output' namespace='##targetNamespace'"
	 * @generated
	 */
	List<TaskOutput> getOutput();

} // Task
