/**
 */
package org.hl7.fhir;

import java.util.List;

import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;

import org.hl7.fhir.jaxb.CapabilityStatementImplAdapter;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Capability Statement</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * A Capability Statement documents a set of capabilities (behaviors) of a FHIR Server that may be used as a statement of actual server functionality or a statement of required or desired server implementation.
 * If the element is present, it must have either a @value, an @id, or extensions
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.hl7.fhir.CapabilityStatement#getUrl <em>Url</em>}</li>
 *   <li>{@link org.hl7.fhir.CapabilityStatement#getVersion <em>Version</em>}</li>
 *   <li>{@link org.hl7.fhir.CapabilityStatement#getName <em>Name</em>}</li>
 *   <li>{@link org.hl7.fhir.CapabilityStatement#getTitle <em>Title</em>}</li>
 *   <li>{@link org.hl7.fhir.CapabilityStatement#getStatus <em>Status</em>}</li>
 *   <li>{@link org.hl7.fhir.CapabilityStatement#getExperimental <em>Experimental</em>}</li>
 *   <li>{@link org.hl7.fhir.CapabilityStatement#getDate <em>Date</em>}</li>
 *   <li>{@link org.hl7.fhir.CapabilityStatement#getPublisher <em>Publisher</em>}</li>
 *   <li>{@link org.hl7.fhir.CapabilityStatement#getContact <em>Contact</em>}</li>
 *   <li>{@link org.hl7.fhir.CapabilityStatement#getDescription <em>Description</em>}</li>
 *   <li>{@link org.hl7.fhir.CapabilityStatement#getUseContext <em>Use Context</em>}</li>
 *   <li>{@link org.hl7.fhir.CapabilityStatement#getJurisdiction <em>Jurisdiction</em>}</li>
 *   <li>{@link org.hl7.fhir.CapabilityStatement#getPurpose <em>Purpose</em>}</li>
 *   <li>{@link org.hl7.fhir.CapabilityStatement#getCopyright <em>Copyright</em>}</li>
 *   <li>{@link org.hl7.fhir.CapabilityStatement#getKind <em>Kind</em>}</li>
 *   <li>{@link org.hl7.fhir.CapabilityStatement#getInstantiates <em>Instantiates</em>}</li>
 *   <li>{@link org.hl7.fhir.CapabilityStatement#getSoftware <em>Software</em>}</li>
 *   <li>{@link org.hl7.fhir.CapabilityStatement#getImplementation <em>Implementation</em>}</li>
 *   <li>{@link org.hl7.fhir.CapabilityStatement#getFhirVersion <em>Fhir Version</em>}</li>
 *   <li>{@link org.hl7.fhir.CapabilityStatement#getAcceptUnknown <em>Accept Unknown</em>}</li>
 *   <li>{@link org.hl7.fhir.CapabilityStatement#getFormat <em>Format</em>}</li>
 *   <li>{@link org.hl7.fhir.CapabilityStatement#getPatchFormat <em>Patch Format</em>}</li>
 *   <li>{@link org.hl7.fhir.CapabilityStatement#getImplementationGuide <em>Implementation Guide</em>}</li>
 *   <li>{@link org.hl7.fhir.CapabilityStatement#getProfile <em>Profile</em>}</li>
 *   <li>{@link org.hl7.fhir.CapabilityStatement#getRest <em>Rest</em>}</li>
 *   <li>{@link org.hl7.fhir.CapabilityStatement#getMessaging <em>Messaging</em>}</li>
 *   <li>{@link org.hl7.fhir.CapabilityStatement#getDocument <em>Document</em>}</li>
 * </ul>
 *
 * @see org.hl7.fhir.FhirPackage#getCapabilityStatement()
 * @model extendedMetaData="name='CapabilityStatement' kind='elementOnly'"
 * @generated
 */
@XmlJavaTypeAdapter(CapabilityStatementImplAdapter.class)
public interface CapabilityStatement extends DomainResource {
	/**
	 * Returns the value of the '<em><b>Url</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * An absolute URL that is used to identify this capability statement when it is referenced in a specification, model, design or an instance. This SHALL be a URL, SHOULD be globally unique, and SHOULD be an address at which this capability statement is (or will be) published. The URL SHOULD include the major version of the capability statement. For more information see [Technical and Business Versions](resource.html#versions).
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Url</em>' containment reference.
	 * @see #setUrl(Uri)
	 * @see org.hl7.fhir.FhirPackage#getCapabilityStatement_Url()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='url' namespace='##targetNamespace'"
	 * @generated
	 */
	Uri getUrl();

	/**
	 * Sets the value of the '{@link org.hl7.fhir.CapabilityStatement#getUrl <em>Url</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Url</em>' containment reference.
	 * @see #getUrl()
	 * @generated
	 */
	void setUrl(Uri value);

	/**
	 * Returns the value of the '<em><b>Version</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The identifier that is used to identify this version of the capability statement when it is referenced in a specification, model, design or instance. This is an arbitrary value managed by the capability statement author and is not expected to be globally unique. For example, it might be a timestamp (e.g. yyyymmdd) if a managed version is not available. There is also no expectation that versions are orderable.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Version</em>' containment reference.
	 * @see #setVersion(org.hl7.fhir.String)
	 * @see org.hl7.fhir.FhirPackage#getCapabilityStatement_Version()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='version' namespace='##targetNamespace'"
	 * @generated
	 */
	org.hl7.fhir.String getVersion();

	/**
	 * Sets the value of the '{@link org.hl7.fhir.CapabilityStatement#getVersion <em>Version</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Version</em>' containment reference.
	 * @see #getVersion()
	 * @generated
	 */
	void setVersion(org.hl7.fhir.String value);

	/**
	 * Returns the value of the '<em><b>Name</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * A natural language name identifying the capability statement. This name should be usable as an identifier for the module by machine processing applications such as code generation.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Name</em>' containment reference.
	 * @see #setName(org.hl7.fhir.String)
	 * @see org.hl7.fhir.FhirPackage#getCapabilityStatement_Name()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='name' namespace='##targetNamespace'"
	 * @generated
	 */
	org.hl7.fhir.String getName();

	/**
	 * Sets the value of the '{@link org.hl7.fhir.CapabilityStatement#getName <em>Name</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Name</em>' containment reference.
	 * @see #getName()
	 * @generated
	 */
	void setName(org.hl7.fhir.String value);

	/**
	 * Returns the value of the '<em><b>Title</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * A short, descriptive, user-friendly title for the capability statement.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Title</em>' containment reference.
	 * @see #setTitle(org.hl7.fhir.String)
	 * @see org.hl7.fhir.FhirPackage#getCapabilityStatement_Title()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='title' namespace='##targetNamespace'"
	 * @generated
	 */
	org.hl7.fhir.String getTitle();

	/**
	 * Sets the value of the '{@link org.hl7.fhir.CapabilityStatement#getTitle <em>Title</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Title</em>' containment reference.
	 * @see #getTitle()
	 * @generated
	 */
	void setTitle(org.hl7.fhir.String value);

	/**
	 * Returns the value of the '<em><b>Status</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The status of this capability statement. Enables tracking the life-cycle of the content.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Status</em>' containment reference.
	 * @see #setStatus(PublicationStatus)
	 * @see org.hl7.fhir.FhirPackage#getCapabilityStatement_Status()
	 * @model containment="true" required="true"
	 *        extendedMetaData="kind='element' name='status' namespace='##targetNamespace'"
	 * @generated
	 */
	PublicationStatus getStatus();

	/**
	 * Sets the value of the '{@link org.hl7.fhir.CapabilityStatement#getStatus <em>Status</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Status</em>' containment reference.
	 * @see #getStatus()
	 * @generated
	 */
	void setStatus(PublicationStatus value);

	/**
	 * Returns the value of the '<em><b>Experimental</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * A flag to indicate that this capability statement is authored for testing purposes (or education/evaluation/marketing), and is not intended to be used for genuine usage.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Experimental</em>' containment reference.
	 * @see #setExperimental(org.hl7.fhir.Boolean)
	 * @see org.hl7.fhir.FhirPackage#getCapabilityStatement_Experimental()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='experimental' namespace='##targetNamespace'"
	 * @generated
	 */
	org.hl7.fhir.Boolean getExperimental();

	/**
	 * Sets the value of the '{@link org.hl7.fhir.CapabilityStatement#getExperimental <em>Experimental</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Experimental</em>' containment reference.
	 * @see #getExperimental()
	 * @generated
	 */
	void setExperimental(org.hl7.fhir.Boolean value);

	/**
	 * Returns the value of the '<em><b>Date</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The date  (and optionally time) when the capability statement was published. The date must change when the business version changes, if it does, and it must change if the status code changes. In addition, it should change when the substantive content of the capability statement changes.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Date</em>' containment reference.
	 * @see #setDate(DateTime)
	 * @see org.hl7.fhir.FhirPackage#getCapabilityStatement_Date()
	 * @model containment="true" required="true"
	 *        extendedMetaData="kind='element' name='date' namespace='##targetNamespace'"
	 * @generated
	 */
	DateTime getDate();

	/**
	 * Sets the value of the '{@link org.hl7.fhir.CapabilityStatement#getDate <em>Date</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Date</em>' containment reference.
	 * @see #getDate()
	 * @generated
	 */
	void setDate(DateTime value);

	/**
	 * Returns the value of the '<em><b>Publisher</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The name of the individual or organization that published the capability statement.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Publisher</em>' containment reference.
	 * @see #setPublisher(org.hl7.fhir.String)
	 * @see org.hl7.fhir.FhirPackage#getCapabilityStatement_Publisher()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='publisher' namespace='##targetNamespace'"
	 * @generated
	 */
	org.hl7.fhir.String getPublisher();

	/**
	 * Sets the value of the '{@link org.hl7.fhir.CapabilityStatement#getPublisher <em>Publisher</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Publisher</em>' containment reference.
	 * @see #getPublisher()
	 * @generated
	 */
	void setPublisher(org.hl7.fhir.String value);

	/**
	 * Returns the value of the '<em><b>Contact</b></em>' containment reference list.
	 * The list contents are of type {@link org.hl7.fhir.ContactDetail}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Contact details to assist a user in finding and communicating with the publisher.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Contact</em>' containment reference list.
	 * @see org.hl7.fhir.FhirPackage#getCapabilityStatement_Contact()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='contact' namespace='##targetNamespace'"
	 * @generated
	 */
	List<ContactDetail> getContact();

	/**
	 * Returns the value of the '<em><b>Description</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * A free text natural language description of the capability statement from the consumer's perspective. Typically, this is used when the capability statement describes a desired rather than an actual solution, for example as a formal expression of requirements as part of an RFP.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Description</em>' containment reference.
	 * @see #setDescription(Markdown)
	 * @see org.hl7.fhir.FhirPackage#getCapabilityStatement_Description()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='description' namespace='##targetNamespace'"
	 * @generated
	 */
	Markdown getDescription();

	/**
	 * Sets the value of the '{@link org.hl7.fhir.CapabilityStatement#getDescription <em>Description</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Description</em>' containment reference.
	 * @see #getDescription()
	 * @generated
	 */
	void setDescription(Markdown value);

	/**
	 * Returns the value of the '<em><b>Use Context</b></em>' containment reference list.
	 * The list contents are of type {@link org.hl7.fhir.UsageContext}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The content was developed with a focus and intent of supporting the contexts that are listed. These terms may be used to assist with indexing and searching of code system definitions.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Use Context</em>' containment reference list.
	 * @see org.hl7.fhir.FhirPackage#getCapabilityStatement_UseContext()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='useContext' namespace='##targetNamespace'"
	 * @generated
	 */
	List<UsageContext> getUseContext();

	/**
	 * Returns the value of the '<em><b>Jurisdiction</b></em>' containment reference list.
	 * The list contents are of type {@link org.hl7.fhir.CodeableConcept}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * A jurisdiction in which the capability statement is intended to be used.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Jurisdiction</em>' containment reference list.
	 * @see org.hl7.fhir.FhirPackage#getCapabilityStatement_Jurisdiction()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='jurisdiction' namespace='##targetNamespace'"
	 * @generated
	 */
	List<CodeableConcept> getJurisdiction();

	/**
	 * Returns the value of the '<em><b>Purpose</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Explains why this capability statement is needed and why it has been designed as it has.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Purpose</em>' containment reference.
	 * @see #setPurpose(Markdown)
	 * @see org.hl7.fhir.FhirPackage#getCapabilityStatement_Purpose()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='purpose' namespace='##targetNamespace'"
	 * @generated
	 */
	Markdown getPurpose();

	/**
	 * Sets the value of the '{@link org.hl7.fhir.CapabilityStatement#getPurpose <em>Purpose</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Purpose</em>' containment reference.
	 * @see #getPurpose()
	 * @generated
	 */
	void setPurpose(Markdown value);

	/**
	 * Returns the value of the '<em><b>Copyright</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * A copyright statement relating to the capability statement and/or its contents. Copyright statements are generally legal restrictions on the use and publishing of the capability statement.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Copyright</em>' containment reference.
	 * @see #setCopyright(Markdown)
	 * @see org.hl7.fhir.FhirPackage#getCapabilityStatement_Copyright()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='copyright' namespace='##targetNamespace'"
	 * @generated
	 */
	Markdown getCopyright();

	/**
	 * Sets the value of the '{@link org.hl7.fhir.CapabilityStatement#getCopyright <em>Copyright</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Copyright</em>' containment reference.
	 * @see #getCopyright()
	 * @generated
	 */
	void setCopyright(Markdown value);

	/**
	 * Returns the value of the '<em><b>Kind</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The way that this statement is intended to be used, to describe an actual running instance of software, a particular product (kind not instance of software) or a class of implementation (e.g. a desired purchase).
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Kind</em>' containment reference.
	 * @see #setKind(CapabilityStatementKind)
	 * @see org.hl7.fhir.FhirPackage#getCapabilityStatement_Kind()
	 * @model containment="true" required="true"
	 *        extendedMetaData="kind='element' name='kind' namespace='##targetNamespace'"
	 * @generated
	 */
	CapabilityStatementKind getKind();

	/**
	 * Sets the value of the '{@link org.hl7.fhir.CapabilityStatement#getKind <em>Kind</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Kind</em>' containment reference.
	 * @see #getKind()
	 * @generated
	 */
	void setKind(CapabilityStatementKind value);

	/**
	 * Returns the value of the '<em><b>Instantiates</b></em>' containment reference list.
	 * The list contents are of type {@link org.hl7.fhir.Uri}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Reference to a canonical URL of another CapabilityStatement that this software implements or uses. This capability statement is a published API description that corresponds to a business service. The rest of the capability statement does not need to repeat the details of the referenced resource, but can do so.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Instantiates</em>' containment reference list.
	 * @see org.hl7.fhir.FhirPackage#getCapabilityStatement_Instantiates()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='instantiates' namespace='##targetNamespace'"
	 * @generated
	 */
	List<Uri> getInstantiates();

	/**
	 * Returns the value of the '<em><b>Software</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Software that is covered by this capability statement.  It is used when the capability statement describes the capabilities of a particular software version, independent of an installation.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Software</em>' containment reference.
	 * @see #setSoftware(CapabilityStatementSoftware)
	 * @see org.hl7.fhir.FhirPackage#getCapabilityStatement_Software()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='software' namespace='##targetNamespace'"
	 * @generated
	 */
	CapabilityStatementSoftware getSoftware();

	/**
	 * Sets the value of the '{@link org.hl7.fhir.CapabilityStatement#getSoftware <em>Software</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Software</em>' containment reference.
	 * @see #getSoftware()
	 * @generated
	 */
	void setSoftware(CapabilityStatementSoftware value);

	/**
	 * Returns the value of the '<em><b>Implementation</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Identifies a specific implementation instance that is described by the capability statement - i.e. a particular installation, rather than the capabilities of a software program.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Implementation</em>' containment reference.
	 * @see #setImplementation(CapabilityStatementImplementation)
	 * @see org.hl7.fhir.FhirPackage#getCapabilityStatement_Implementation()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='implementation' namespace='##targetNamespace'"
	 * @generated
	 */
	CapabilityStatementImplementation getImplementation();

	/**
	 * Sets the value of the '{@link org.hl7.fhir.CapabilityStatement#getImplementation <em>Implementation</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Implementation</em>' containment reference.
	 * @see #getImplementation()
	 * @generated
	 */
	void setImplementation(CapabilityStatementImplementation value);

	/**
	 * Returns the value of the '<em><b>Fhir Version</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The version of the FHIR specification on which this capability statement is based.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Fhir Version</em>' containment reference.
	 * @see #setFhirVersion(Id)
	 * @see org.hl7.fhir.FhirPackage#getCapabilityStatement_FhirVersion()
	 * @model containment="true" required="true"
	 *        extendedMetaData="kind='element' name='fhirVersion' namespace='##targetNamespace'"
	 * @generated
	 */
	Id getFhirVersion();

	/**
	 * Sets the value of the '{@link org.hl7.fhir.CapabilityStatement#getFhirVersion <em>Fhir Version</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Fhir Version</em>' containment reference.
	 * @see #getFhirVersion()
	 * @generated
	 */
	void setFhirVersion(Id value);

	/**
	 * Returns the value of the '<em><b>Accept Unknown</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * A code that indicates whether the application accepts unknown elements or extensions when reading resources.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Accept Unknown</em>' containment reference.
	 * @see #setAcceptUnknown(UnknownContentCode)
	 * @see org.hl7.fhir.FhirPackage#getCapabilityStatement_AcceptUnknown()
	 * @model containment="true" required="true"
	 *        extendedMetaData="kind='element' name='acceptUnknown' namespace='##targetNamespace'"
	 * @generated
	 */
	UnknownContentCode getAcceptUnknown();

	/**
	 * Sets the value of the '{@link org.hl7.fhir.CapabilityStatement#getAcceptUnknown <em>Accept Unknown</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Accept Unknown</em>' containment reference.
	 * @see #getAcceptUnknown()
	 * @generated
	 */
	void setAcceptUnknown(UnknownContentCode value);

	/**
	 * Returns the value of the '<em><b>Format</b></em>' containment reference list.
	 * The list contents are of type {@link org.hl7.fhir.Code}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * A list of the formats supported by this implementation using their content types.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Format</em>' containment reference list.
	 * @see org.hl7.fhir.FhirPackage#getCapabilityStatement_Format()
	 * @model containment="true" required="true"
	 *        extendedMetaData="kind='element' name='format' namespace='##targetNamespace'"
	 * @generated
	 */
	List<Code> getFormat();

	/**
	 * Returns the value of the '<em><b>Patch Format</b></em>' containment reference list.
	 * The list contents are of type {@link org.hl7.fhir.Code}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * A list of the patch formats supported by this implementation using their content types.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Patch Format</em>' containment reference list.
	 * @see org.hl7.fhir.FhirPackage#getCapabilityStatement_PatchFormat()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='patchFormat' namespace='##targetNamespace'"
	 * @generated
	 */
	List<Code> getPatchFormat();

	/**
	 * Returns the value of the '<em><b>Implementation Guide</b></em>' containment reference list.
	 * The list contents are of type {@link org.hl7.fhir.Uri}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * A list of implementation guides that the server does (or should) support in their entirety.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Implementation Guide</em>' containment reference list.
	 * @see org.hl7.fhir.FhirPackage#getCapabilityStatement_ImplementationGuide()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='implementationGuide' namespace='##targetNamespace'"
	 * @generated
	 */
	List<Uri> getImplementationGuide();

	/**
	 * Returns the value of the '<em><b>Profile</b></em>' containment reference list.
	 * The list contents are of type {@link org.hl7.fhir.Reference}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * A list of profiles that represent different use cases supported by the system. For a server, "supported by the system" means the system hosts/produces a set of resources that are conformant to a particular profile, and allows clients that use its services to search using this profile and to find appropriate data. For a client, it means the system will search by this profile and process data according to the guidance implicit in the profile. See further discussion in [Using Profiles](profiling.html#profile-uses).
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Profile</em>' containment reference list.
	 * @see org.hl7.fhir.FhirPackage#getCapabilityStatement_Profile()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='profile' namespace='##targetNamespace'"
	 * @generated
	 */
	List<Reference> getProfile();

	/**
	 * Returns the value of the '<em><b>Rest</b></em>' containment reference list.
	 * The list contents are of type {@link org.hl7.fhir.CapabilityStatementRest}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * A definition of the restful capabilities of the solution, if any.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Rest</em>' containment reference list.
	 * @see org.hl7.fhir.FhirPackage#getCapabilityStatement_Rest()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='rest' namespace='##targetNamespace'"
	 * @generated
	 */
	List<CapabilityStatementRest> getRest();

	/**
	 * Returns the value of the '<em><b>Messaging</b></em>' containment reference list.
	 * The list contents are of type {@link org.hl7.fhir.CapabilityStatementMessaging}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * A description of the messaging capabilities of the solution.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Messaging</em>' containment reference list.
	 * @see org.hl7.fhir.FhirPackage#getCapabilityStatement_Messaging()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='messaging' namespace='##targetNamespace'"
	 * @generated
	 */
	List<CapabilityStatementMessaging> getMessaging();

	/**
	 * Returns the value of the '<em><b>Document</b></em>' containment reference list.
	 * The list contents are of type {@link org.hl7.fhir.CapabilityStatementDocument}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * A document definition.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Document</em>' containment reference list.
	 * @see org.hl7.fhir.FhirPackage#getCapabilityStatement_Document()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='document' namespace='##targetNamespace'"
	 * @generated
	 */
	List<CapabilityStatementDocument> getDocument();

} // CapabilityStatement
