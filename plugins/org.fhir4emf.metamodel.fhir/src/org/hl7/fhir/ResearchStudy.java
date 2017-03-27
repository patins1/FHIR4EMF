/**
 */
package org.hl7.fhir;

import java.util.List;

import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;

import org.hl7.fhir.jaxb.ResearchStudyImplAdapter;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Research Study</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * A process where a researcher or organization plans and then executes a series of steps intended to increase the field of healthcare-related knowledge.  This includes studies of safety, efficacy, comparative effectiveness and other information about medications, devices, therapies and other interventional and investigative techniques.  A ResearchStudy involves the gathering of information about human or animal subjects.
 * If the element is present, it must have either a @value, an @id, or extensions
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.hl7.fhir.ResearchStudy#getIdentifier <em>Identifier</em>}</li>
 *   <li>{@link org.hl7.fhir.ResearchStudy#getTitle <em>Title</em>}</li>
 *   <li>{@link org.hl7.fhir.ResearchStudy#getProtocol <em>Protocol</em>}</li>
 *   <li>{@link org.hl7.fhir.ResearchStudy#getPartOf <em>Part Of</em>}</li>
 *   <li>{@link org.hl7.fhir.ResearchStudy#getStatus <em>Status</em>}</li>
 *   <li>{@link org.hl7.fhir.ResearchStudy#getCategory <em>Category</em>}</li>
 *   <li>{@link org.hl7.fhir.ResearchStudy#getFocus <em>Focus</em>}</li>
 *   <li>{@link org.hl7.fhir.ResearchStudy#getContact <em>Contact</em>}</li>
 *   <li>{@link org.hl7.fhir.ResearchStudy#getRelatedArtifact <em>Related Artifact</em>}</li>
 *   <li>{@link org.hl7.fhir.ResearchStudy#getKeyword <em>Keyword</em>}</li>
 *   <li>{@link org.hl7.fhir.ResearchStudy#getJurisdiction <em>Jurisdiction</em>}</li>
 *   <li>{@link org.hl7.fhir.ResearchStudy#getDescription <em>Description</em>}</li>
 *   <li>{@link org.hl7.fhir.ResearchStudy#getEnrollment <em>Enrollment</em>}</li>
 *   <li>{@link org.hl7.fhir.ResearchStudy#getPeriod <em>Period</em>}</li>
 *   <li>{@link org.hl7.fhir.ResearchStudy#getSponsor <em>Sponsor</em>}</li>
 *   <li>{@link org.hl7.fhir.ResearchStudy#getPrincipalInvestigator <em>Principal Investigator</em>}</li>
 *   <li>{@link org.hl7.fhir.ResearchStudy#getSite <em>Site</em>}</li>
 *   <li>{@link org.hl7.fhir.ResearchStudy#getReasonStopped <em>Reason Stopped</em>}</li>
 *   <li>{@link org.hl7.fhir.ResearchStudy#getNote <em>Note</em>}</li>
 *   <li>{@link org.hl7.fhir.ResearchStudy#getArm <em>Arm</em>}</li>
 * </ul>
 *
 * @see org.hl7.fhir.FhirPackage#getResearchStudy()
 * @model extendedMetaData="name='ResearchStudy' kind='elementOnly'"
 * @generated
 */
@XmlJavaTypeAdapter(ResearchStudyImplAdapter.class)
public interface ResearchStudy extends DomainResource {
	/**
	 * Returns the value of the '<em><b>Identifier</b></em>' containment reference list.
	 * The list contents are of type {@link org.hl7.fhir.Identifier}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Identifiers assigned to this research study by the sponsor or other systems.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Identifier</em>' containment reference list.
	 * @see org.hl7.fhir.FhirPackage#getResearchStudy_Identifier()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='identifier' namespace='##targetNamespace'"
	 * @generated
	 */
	List<Identifier> getIdentifier();

	/**
	 * Returns the value of the '<em><b>Title</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * A short, descriptive user-friendly label for the study.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Title</em>' containment reference.
	 * @see #setTitle(org.hl7.fhir.String)
	 * @see org.hl7.fhir.FhirPackage#getResearchStudy_Title()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='title' namespace='##targetNamespace'"
	 * @generated
	 */
	org.hl7.fhir.String getTitle();

	/**
	 * Sets the value of the '{@link org.hl7.fhir.ResearchStudy#getTitle <em>Title</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Title</em>' containment reference.
	 * @see #getTitle()
	 * @generated
	 */
	void setTitle(org.hl7.fhir.String value);

	/**
	 * Returns the value of the '<em><b>Protocol</b></em>' containment reference list.
	 * The list contents are of type {@link org.hl7.fhir.Reference}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The set of steps expected to be performed as part of the execution of the study.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Protocol</em>' containment reference list.
	 * @see org.hl7.fhir.FhirPackage#getResearchStudy_Protocol()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='protocol' namespace='##targetNamespace'"
	 * @generated
	 */
	List<Reference> getProtocol();

	/**
	 * Returns the value of the '<em><b>Part Of</b></em>' containment reference list.
	 * The list contents are of type {@link org.hl7.fhir.Reference}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * A larger research study of which this particular study is a component or step.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Part Of</em>' containment reference list.
	 * @see org.hl7.fhir.FhirPackage#getResearchStudy_PartOf()
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
	 * The current state of the study.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Status</em>' containment reference.
	 * @see #setStatus(ResearchStudyStatus)
	 * @see org.hl7.fhir.FhirPackage#getResearchStudy_Status()
	 * @model containment="true" required="true"
	 *        extendedMetaData="kind='element' name='status' namespace='##targetNamespace'"
	 * @generated
	 */
	ResearchStudyStatus getStatus();

	/**
	 * Sets the value of the '{@link org.hl7.fhir.ResearchStudy#getStatus <em>Status</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Status</em>' containment reference.
	 * @see #getStatus()
	 * @generated
	 */
	void setStatus(ResearchStudyStatus value);

	/**
	 * Returns the value of the '<em><b>Category</b></em>' containment reference list.
	 * The list contents are of type {@link org.hl7.fhir.CodeableConcept}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Codes categorizing the type of study such as investigational vs. observational, type of blinding, type of randomization, safety vs. efficacy, etc.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Category</em>' containment reference list.
	 * @see org.hl7.fhir.FhirPackage#getResearchStudy_Category()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='category' namespace='##targetNamespace'"
	 * @generated
	 */
	List<CodeableConcept> getCategory();

	/**
	 * Returns the value of the '<em><b>Focus</b></em>' containment reference list.
	 * The list contents are of type {@link org.hl7.fhir.CodeableConcept}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The condition(s), medication(s), food(s), therapy(ies), device(s) or other concerns or interventions that the study is seeking to gain more information about.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Focus</em>' containment reference list.
	 * @see org.hl7.fhir.FhirPackage#getResearchStudy_Focus()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='focus' namespace='##targetNamespace'"
	 * @generated
	 */
	List<CodeableConcept> getFocus();

	/**
	 * Returns the value of the '<em><b>Contact</b></em>' containment reference list.
	 * The list contents are of type {@link org.hl7.fhir.ContactDetail}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Contact details to assist a user in learning more about or engaging with the study.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Contact</em>' containment reference list.
	 * @see org.hl7.fhir.FhirPackage#getResearchStudy_Contact()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='contact' namespace='##targetNamespace'"
	 * @generated
	 */
	List<ContactDetail> getContact();

	/**
	 * Returns the value of the '<em><b>Related Artifact</b></em>' containment reference list.
	 * The list contents are of type {@link org.hl7.fhir.RelatedArtifact}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Citations, references and other related documents.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Related Artifact</em>' containment reference list.
	 * @see org.hl7.fhir.FhirPackage#getResearchStudy_RelatedArtifact()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='relatedArtifact' namespace='##targetNamespace'"
	 * @generated
	 */
	List<RelatedArtifact> getRelatedArtifact();

	/**
	 * Returns the value of the '<em><b>Keyword</b></em>' containment reference list.
	 * The list contents are of type {@link org.hl7.fhir.CodeableConcept}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Key terms to aid in searching for or filtering the study.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Keyword</em>' containment reference list.
	 * @see org.hl7.fhir.FhirPackage#getResearchStudy_Keyword()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='keyword' namespace='##targetNamespace'"
	 * @generated
	 */
	List<CodeableConcept> getKeyword();

	/**
	 * Returns the value of the '<em><b>Jurisdiction</b></em>' containment reference list.
	 * The list contents are of type {@link org.hl7.fhir.CodeableConcept}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Indicates a country, state or other region where the study is taking place.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Jurisdiction</em>' containment reference list.
	 * @see org.hl7.fhir.FhirPackage#getResearchStudy_Jurisdiction()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='jurisdiction' namespace='##targetNamespace'"
	 * @generated
	 */
	List<CodeableConcept> getJurisdiction();

	/**
	 * Returns the value of the '<em><b>Description</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * A full description of how the study is being conducted.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Description</em>' containment reference.
	 * @see #setDescription(Markdown)
	 * @see org.hl7.fhir.FhirPackage#getResearchStudy_Description()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='description' namespace='##targetNamespace'"
	 * @generated
	 */
	Markdown getDescription();

	/**
	 * Sets the value of the '{@link org.hl7.fhir.ResearchStudy#getDescription <em>Description</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Description</em>' containment reference.
	 * @see #getDescription()
	 * @generated
	 */
	void setDescription(Markdown value);

	/**
	 * Returns the value of the '<em><b>Enrollment</b></em>' containment reference list.
	 * The list contents are of type {@link org.hl7.fhir.Reference}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Reference to a Group that defines the criteria for and quantity of subjects participating in the study.  E.g. " 200 female Europeans between the ages of 20 and 45 with early onset diabetes".
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Enrollment</em>' containment reference list.
	 * @see org.hl7.fhir.FhirPackage#getResearchStudy_Enrollment()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='enrollment' namespace='##targetNamespace'"
	 * @generated
	 */
	List<Reference> getEnrollment();

	/**
	 * Returns the value of the '<em><b>Period</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Identifies the start date and the expected (or actual, depending on status) end date for the study.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Period</em>' containment reference.
	 * @see #setPeriod(Period)
	 * @see org.hl7.fhir.FhirPackage#getResearchStudy_Period()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='period' namespace='##targetNamespace'"
	 * @generated
	 */
	Period getPeriod();

	/**
	 * Sets the value of the '{@link org.hl7.fhir.ResearchStudy#getPeriod <em>Period</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Period</em>' containment reference.
	 * @see #getPeriod()
	 * @generated
	 */
	void setPeriod(Period value);

	/**
	 * Returns the value of the '<em><b>Sponsor</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The organization responsible for the execution of the study.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Sponsor</em>' containment reference.
	 * @see #setSponsor(Reference)
	 * @see org.hl7.fhir.FhirPackage#getResearchStudy_Sponsor()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='sponsor' namespace='##targetNamespace'"
	 * @generated
	 */
	Reference getSponsor();

	/**
	 * Sets the value of the '{@link org.hl7.fhir.ResearchStudy#getSponsor <em>Sponsor</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Sponsor</em>' containment reference.
	 * @see #getSponsor()
	 * @generated
	 */
	void setSponsor(Reference value);

	/**
	 * Returns the value of the '<em><b>Principal Investigator</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Indicates the individual who has primary oversite of the execution of the study.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Principal Investigator</em>' containment reference.
	 * @see #setPrincipalInvestigator(Reference)
	 * @see org.hl7.fhir.FhirPackage#getResearchStudy_PrincipalInvestigator()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='principalInvestigator' namespace='##targetNamespace'"
	 * @generated
	 */
	Reference getPrincipalInvestigator();

	/**
	 * Sets the value of the '{@link org.hl7.fhir.ResearchStudy#getPrincipalInvestigator <em>Principal Investigator</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Principal Investigator</em>' containment reference.
	 * @see #getPrincipalInvestigator()
	 * @generated
	 */
	void setPrincipalInvestigator(Reference value);

	/**
	 * Returns the value of the '<em><b>Site</b></em>' containment reference list.
	 * The list contents are of type {@link org.hl7.fhir.Reference}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Clinic, hospital or other healthcare location that is participating in the study.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Site</em>' containment reference list.
	 * @see org.hl7.fhir.FhirPackage#getResearchStudy_Site()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='site' namespace='##targetNamespace'"
	 * @generated
	 */
	List<Reference> getSite();

	/**
	 * Returns the value of the '<em><b>Reason Stopped</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * A description and/or code explaining the premature termination of the study.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Reason Stopped</em>' containment reference.
	 * @see #setReasonStopped(CodeableConcept)
	 * @see org.hl7.fhir.FhirPackage#getResearchStudy_ReasonStopped()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='reasonStopped' namespace='##targetNamespace'"
	 * @generated
	 */
	CodeableConcept getReasonStopped();

	/**
	 * Sets the value of the '{@link org.hl7.fhir.ResearchStudy#getReasonStopped <em>Reason Stopped</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Reason Stopped</em>' containment reference.
	 * @see #getReasonStopped()
	 * @generated
	 */
	void setReasonStopped(CodeableConcept value);

	/**
	 * Returns the value of the '<em><b>Note</b></em>' containment reference list.
	 * The list contents are of type {@link org.hl7.fhir.Annotation}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Comments made about the event by the performer, subject or other participants.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Note</em>' containment reference list.
	 * @see org.hl7.fhir.FhirPackage#getResearchStudy_Note()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='note' namespace='##targetNamespace'"
	 * @generated
	 */
	List<Annotation> getNote();

	/**
	 * Returns the value of the '<em><b>Arm</b></em>' containment reference list.
	 * The list contents are of type {@link org.hl7.fhir.ResearchStudyArm}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Describes an expected sequence of events for one of the participants of a study.  E.g. Exposure to drug A, wash-out, exposure to drug B, wash-out, follow-up.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Arm</em>' containment reference list.
	 * @see org.hl7.fhir.FhirPackage#getResearchStudy_Arm()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='arm' namespace='##targetNamespace'"
	 * @generated
	 */
	List<ResearchStudyArm> getArm();

} // ResearchStudy
