/**
 */
package org.hl7.fhir;

import java.util.List;

import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;

import org.hl7.fhir.jaxb.ConsentImplAdapter;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Consent</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * A record of a healthcare consumer’s policy choices, which permits or denies identified recipient(s) or recipient role(s) to perform one or more actions within a given policy context, for specific purposes and periods of time.
 * If the element is present, it must have either a @value, an @id, or extensions
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.hl7.fhir.Consent#getIdentifier <em>Identifier</em>}</li>
 *   <li>{@link org.hl7.fhir.Consent#getStatus <em>Status</em>}</li>
 *   <li>{@link org.hl7.fhir.Consent#getCategory <em>Category</em>}</li>
 *   <li>{@link org.hl7.fhir.Consent#getPatient <em>Patient</em>}</li>
 *   <li>{@link org.hl7.fhir.Consent#getPeriod <em>Period</em>}</li>
 *   <li>{@link org.hl7.fhir.Consent#getDateTime <em>Date Time</em>}</li>
 *   <li>{@link org.hl7.fhir.Consent#getConsentingParty <em>Consenting Party</em>}</li>
 *   <li>{@link org.hl7.fhir.Consent#getActor <em>Actor</em>}</li>
 *   <li>{@link org.hl7.fhir.Consent#getAction <em>Action</em>}</li>
 *   <li>{@link org.hl7.fhir.Consent#getOrganization <em>Organization</em>}</li>
 *   <li>{@link org.hl7.fhir.Consent#getSourceAttachment <em>Source Attachment</em>}</li>
 *   <li>{@link org.hl7.fhir.Consent#getSourceIdentifier <em>Source Identifier</em>}</li>
 *   <li>{@link org.hl7.fhir.Consent#getSourceReference <em>Source Reference</em>}</li>
 *   <li>{@link org.hl7.fhir.Consent#getPolicy <em>Policy</em>}</li>
 *   <li>{@link org.hl7.fhir.Consent#getPolicyRule <em>Policy Rule</em>}</li>
 *   <li>{@link org.hl7.fhir.Consent#getSecurityLabel <em>Security Label</em>}</li>
 *   <li>{@link org.hl7.fhir.Consent#getPurpose <em>Purpose</em>}</li>
 *   <li>{@link org.hl7.fhir.Consent#getDataPeriod <em>Data Period</em>}</li>
 *   <li>{@link org.hl7.fhir.Consent#getData <em>Data</em>}</li>
 *   <li>{@link org.hl7.fhir.Consent#getExcept <em>Except</em>}</li>
 * </ul>
 *
 * @see org.hl7.fhir.FhirPackage#getConsent()
 * @model extendedMetaData="name='Consent' kind='elementOnly'"
 * @generated
 */
@XmlJavaTypeAdapter(ConsentImplAdapter.class)
public interface Consent extends DomainResource {
	/**
	 * Returns the value of the '<em><b>Identifier</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Unique identifier for this copy of the Consent Statement.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Identifier</em>' containment reference.
	 * @see #setIdentifier(Identifier)
	 * @see org.hl7.fhir.FhirPackage#getConsent_Identifier()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='identifier' namespace='##targetNamespace'"
	 * @generated
	 */
	Identifier getIdentifier();

	/**
	 * Sets the value of the '{@link org.hl7.fhir.Consent#getIdentifier <em>Identifier</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Identifier</em>' containment reference.
	 * @see #getIdentifier()
	 * @generated
	 */
	void setIdentifier(Identifier value);

	/**
	 * Returns the value of the '<em><b>Status</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Indicates the current state of this consent.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Status</em>' containment reference.
	 * @see #setStatus(ConsentState)
	 * @see org.hl7.fhir.FhirPackage#getConsent_Status()
	 * @model containment="true" required="true"
	 *        extendedMetaData="kind='element' name='status' namespace='##targetNamespace'"
	 * @generated
	 */
	ConsentState getStatus();

	/**
	 * Sets the value of the '{@link org.hl7.fhir.Consent#getStatus <em>Status</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Status</em>' containment reference.
	 * @see #getStatus()
	 * @generated
	 */
	void setStatus(ConsentState value);

	/**
	 * Returns the value of the '<em><b>Category</b></em>' containment reference list.
	 * The list contents are of type {@link org.hl7.fhir.CodeableConcept}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * A classification of the type of consents found in the statement. This element supports indexing and retrieval of consent statements.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Category</em>' containment reference list.
	 * @see org.hl7.fhir.FhirPackage#getConsent_Category()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='category' namespace='##targetNamespace'"
	 * @generated
	 */
	List<CodeableConcept> getCategory();

	/**
	 * Returns the value of the '<em><b>Patient</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The patient/healthcare consumer to whom this consent applies.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Patient</em>' containment reference.
	 * @see #setPatient(Reference)
	 * @see org.hl7.fhir.FhirPackage#getConsent_Patient()
	 * @model containment="true" required="true"
	 *        extendedMetaData="kind='element' name='patient' namespace='##targetNamespace'"
	 * @generated
	 */
	Reference getPatient();

	/**
	 * Sets the value of the '{@link org.hl7.fhir.Consent#getPatient <em>Patient</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Patient</em>' containment reference.
	 * @see #getPatient()
	 * @generated
	 */
	void setPatient(Reference value);

	/**
	 * Returns the value of the '<em><b>Period</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Relevant time or time-period when this Consent is applicable.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Period</em>' containment reference.
	 * @see #setPeriod(Period)
	 * @see org.hl7.fhir.FhirPackage#getConsent_Period()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='period' namespace='##targetNamespace'"
	 * @generated
	 */
	Period getPeriod();

	/**
	 * Sets the value of the '{@link org.hl7.fhir.Consent#getPeriod <em>Period</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Period</em>' containment reference.
	 * @see #getPeriod()
	 * @generated
	 */
	void setPeriod(Period value);

	/**
	 * Returns the value of the '<em><b>Date Time</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * When this  Consent was issued / created / indexed.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Date Time</em>' containment reference.
	 * @see #setDateTime(DateTime)
	 * @see org.hl7.fhir.FhirPackage#getConsent_DateTime()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='dateTime' namespace='##targetNamespace'"
	 * @generated
	 */
	DateTime getDateTime();

	/**
	 * Sets the value of the '{@link org.hl7.fhir.Consent#getDateTime <em>Date Time</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Date Time</em>' containment reference.
	 * @see #getDateTime()
	 * @generated
	 */
	void setDateTime(DateTime value);

	/**
	 * Returns the value of the '<em><b>Consenting Party</b></em>' containment reference list.
	 * The list contents are of type {@link org.hl7.fhir.Reference}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Either the Grantor, which is the entity responsible for granting the rights listed in a Consent Directive or the Grantee, which is the entity responsible for complying with the Consent Directive, including any obligations or limitations on authorizations and enforcement of prohibitions.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Consenting Party</em>' containment reference list.
	 * @see org.hl7.fhir.FhirPackage#getConsent_ConsentingParty()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='consentingParty' namespace='##targetNamespace'"
	 * @generated
	 */
	List<Reference> getConsentingParty();

	/**
	 * Returns the value of the '<em><b>Actor</b></em>' containment reference list.
	 * The list contents are of type {@link org.hl7.fhir.ConsentActor}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Who or what is controlled by this consent. Use group to identify a set of actors by some property they share (e.g. 'admitting officers').
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Actor</em>' containment reference list.
	 * @see org.hl7.fhir.FhirPackage#getConsent_Actor()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='actor' namespace='##targetNamespace'"
	 * @generated
	 */
	List<ConsentActor> getActor();

	/**
	 * Returns the value of the '<em><b>Action</b></em>' containment reference list.
	 * The list contents are of type {@link org.hl7.fhir.CodeableConcept}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Actions controlled by this consent.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Action</em>' containment reference list.
	 * @see org.hl7.fhir.FhirPackage#getConsent_Action()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='action' namespace='##targetNamespace'"
	 * @generated
	 */
	List<CodeableConcept> getAction();

	/**
	 * Returns the value of the '<em><b>Organization</b></em>' containment reference list.
	 * The list contents are of type {@link org.hl7.fhir.Reference}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The organization that manages the consent, and the framework within which it is executed.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Organization</em>' containment reference list.
	 * @see org.hl7.fhir.FhirPackage#getConsent_Organization()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='organization' namespace='##targetNamespace'"
	 * @generated
	 */
	List<Reference> getOrganization();

	/**
	 * Returns the value of the '<em><b>Source Attachment</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The source on which this consent statement is based. The source might be a scanned original paper form, or a reference to a consent that links back to such a source, a reference to a document repository (e.g. XDS) that stores the original consent document. (choose any one of source*, but only one)
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Source Attachment</em>' containment reference.
	 * @see #setSourceAttachment(Attachment)
	 * @see org.hl7.fhir.FhirPackage#getConsent_SourceAttachment()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='sourceAttachment' namespace='##targetNamespace'"
	 * @generated
	 */
	Attachment getSourceAttachment();

	/**
	 * Sets the value of the '{@link org.hl7.fhir.Consent#getSourceAttachment <em>Source Attachment</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Source Attachment</em>' containment reference.
	 * @see #getSourceAttachment()
	 * @generated
	 */
	void setSourceAttachment(Attachment value);

	/**
	 * Returns the value of the '<em><b>Source Identifier</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The source on which this consent statement is based. The source might be a scanned original paper form, or a reference to a consent that links back to such a source, a reference to a document repository (e.g. XDS) that stores the original consent document. (choose any one of source*, but only one)
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Source Identifier</em>' containment reference.
	 * @see #setSourceIdentifier(Identifier)
	 * @see org.hl7.fhir.FhirPackage#getConsent_SourceIdentifier()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='sourceIdentifier' namespace='##targetNamespace'"
	 * @generated
	 */
	Identifier getSourceIdentifier();

	/**
	 * Sets the value of the '{@link org.hl7.fhir.Consent#getSourceIdentifier <em>Source Identifier</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Source Identifier</em>' containment reference.
	 * @see #getSourceIdentifier()
	 * @generated
	 */
	void setSourceIdentifier(Identifier value);

	/**
	 * Returns the value of the '<em><b>Source Reference</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The source on which this consent statement is based. The source might be a scanned original paper form, or a reference to a consent that links back to such a source, a reference to a document repository (e.g. XDS) that stores the original consent document. (choose any one of source*, but only one)
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Source Reference</em>' containment reference.
	 * @see #setSourceReference(Reference)
	 * @see org.hl7.fhir.FhirPackage#getConsent_SourceReference()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='sourceReference' namespace='##targetNamespace'"
	 * @generated
	 */
	Reference getSourceReference();

	/**
	 * Sets the value of the '{@link org.hl7.fhir.Consent#getSourceReference <em>Source Reference</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Source Reference</em>' containment reference.
	 * @see #getSourceReference()
	 * @generated
	 */
	void setSourceReference(Reference value);

	/**
	 * Returns the value of the '<em><b>Policy</b></em>' containment reference list.
	 * The list contents are of type {@link org.hl7.fhir.ConsentPolicy}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The references to the policies that are included in this consent scope. Policies may be organizational, but are often defined jurisdictionally, or in law.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Policy</em>' containment reference list.
	 * @see org.hl7.fhir.FhirPackage#getConsent_Policy()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='policy' namespace='##targetNamespace'"
	 * @generated
	 */
	List<ConsentPolicy> getPolicy();

	/**
	 * Returns the value of the '<em><b>Policy Rule</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * A referece to the specific computable policy.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Policy Rule</em>' containment reference.
	 * @see #setPolicyRule(Uri)
	 * @see org.hl7.fhir.FhirPackage#getConsent_PolicyRule()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='policyRule' namespace='##targetNamespace'"
	 * @generated
	 */
	Uri getPolicyRule();

	/**
	 * Sets the value of the '{@link org.hl7.fhir.Consent#getPolicyRule <em>Policy Rule</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Policy Rule</em>' containment reference.
	 * @see #getPolicyRule()
	 * @generated
	 */
	void setPolicyRule(Uri value);

	/**
	 * Returns the value of the '<em><b>Security Label</b></em>' containment reference list.
	 * The list contents are of type {@link org.hl7.fhir.Coding}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * A set of security labels that define which resources are controlled by this consent. If more than one label is specified, all resources must have all the specified labels.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Security Label</em>' containment reference list.
	 * @see org.hl7.fhir.FhirPackage#getConsent_SecurityLabel()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='securityLabel' namespace='##targetNamespace'"
	 * @generated
	 */
	List<Coding> getSecurityLabel();

	/**
	 * Returns the value of the '<em><b>Purpose</b></em>' containment reference list.
	 * The list contents are of type {@link org.hl7.fhir.Coding}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The context of the activities a user is taking - why the user is accessing the data - that are controlled by this consent.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Purpose</em>' containment reference list.
	 * @see org.hl7.fhir.FhirPackage#getConsent_Purpose()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='purpose' namespace='##targetNamespace'"
	 * @generated
	 */
	List<Coding> getPurpose();

	/**
	 * Returns the value of the '<em><b>Data Period</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Clinical or Operational Relevant period of time that bounds the data controlled by this consent.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Data Period</em>' containment reference.
	 * @see #setDataPeriod(Period)
	 * @see org.hl7.fhir.FhirPackage#getConsent_DataPeriod()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='dataPeriod' namespace='##targetNamespace'"
	 * @generated
	 */
	Period getDataPeriod();

	/**
	 * Sets the value of the '{@link org.hl7.fhir.Consent#getDataPeriod <em>Data Period</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Data Period</em>' containment reference.
	 * @see #getDataPeriod()
	 * @generated
	 */
	void setDataPeriod(Period value);

	/**
	 * Returns the value of the '<em><b>Data</b></em>' containment reference list.
	 * The list contents are of type {@link org.hl7.fhir.ConsentData}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The resources controlled by this consent, if specific resources are referenced.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Data</em>' containment reference list.
	 * @see org.hl7.fhir.FhirPackage#getConsent_Data()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='data' namespace='##targetNamespace'"
	 * @generated
	 */
	List<ConsentData> getData();

	/**
	 * Returns the value of the '<em><b>Except</b></em>' containment reference list.
	 * The list contents are of type {@link org.hl7.fhir.ConsentExcept}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * An exception to the base policy of this consent. An exception can be an addition or removal of access permissions.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Except</em>' containment reference list.
	 * @see org.hl7.fhir.FhirPackage#getConsent_Except()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='except' namespace='##targetNamespace'"
	 * @generated
	 */
	List<ConsentExcept> getExcept();

} // Consent
