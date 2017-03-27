/**
 */
package org.hl7.fhir;

import java.util.List;

import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;

import org.hl7.fhir.jaxb.ExpansionProfileImplAdapter;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Expansion Profile</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * Resource to define constraints on the Expansion of a FHIR ValueSet.
 * If the element is present, it must have either a @value, an @id, or extensions
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.hl7.fhir.ExpansionProfile#getUrl <em>Url</em>}</li>
 *   <li>{@link org.hl7.fhir.ExpansionProfile#getIdentifier <em>Identifier</em>}</li>
 *   <li>{@link org.hl7.fhir.ExpansionProfile#getVersion <em>Version</em>}</li>
 *   <li>{@link org.hl7.fhir.ExpansionProfile#getName <em>Name</em>}</li>
 *   <li>{@link org.hl7.fhir.ExpansionProfile#getStatus <em>Status</em>}</li>
 *   <li>{@link org.hl7.fhir.ExpansionProfile#getExperimental <em>Experimental</em>}</li>
 *   <li>{@link org.hl7.fhir.ExpansionProfile#getDate <em>Date</em>}</li>
 *   <li>{@link org.hl7.fhir.ExpansionProfile#getPublisher <em>Publisher</em>}</li>
 *   <li>{@link org.hl7.fhir.ExpansionProfile#getContact <em>Contact</em>}</li>
 *   <li>{@link org.hl7.fhir.ExpansionProfile#getDescription <em>Description</em>}</li>
 *   <li>{@link org.hl7.fhir.ExpansionProfile#getUseContext <em>Use Context</em>}</li>
 *   <li>{@link org.hl7.fhir.ExpansionProfile#getJurisdiction <em>Jurisdiction</em>}</li>
 *   <li>{@link org.hl7.fhir.ExpansionProfile#getFixedVersion <em>Fixed Version</em>}</li>
 *   <li>{@link org.hl7.fhir.ExpansionProfile#getExcludedSystem <em>Excluded System</em>}</li>
 *   <li>{@link org.hl7.fhir.ExpansionProfile#getIncludeDesignations <em>Include Designations</em>}</li>
 *   <li>{@link org.hl7.fhir.ExpansionProfile#getDesignation <em>Designation</em>}</li>
 *   <li>{@link org.hl7.fhir.ExpansionProfile#getIncludeDefinition <em>Include Definition</em>}</li>
 *   <li>{@link org.hl7.fhir.ExpansionProfile#getActiveOnly <em>Active Only</em>}</li>
 *   <li>{@link org.hl7.fhir.ExpansionProfile#getExcludeNested <em>Exclude Nested</em>}</li>
 *   <li>{@link org.hl7.fhir.ExpansionProfile#getExcludeNotForUI <em>Exclude Not For UI</em>}</li>
 *   <li>{@link org.hl7.fhir.ExpansionProfile#getExcludePostCoordinated <em>Exclude Post Coordinated</em>}</li>
 *   <li>{@link org.hl7.fhir.ExpansionProfile#getDisplayLanguage <em>Display Language</em>}</li>
 *   <li>{@link org.hl7.fhir.ExpansionProfile#getLimitedExpansion <em>Limited Expansion</em>}</li>
 * </ul>
 *
 * @see org.hl7.fhir.FhirPackage#getExpansionProfile()
 * @model extendedMetaData="name='ExpansionProfile' kind='elementOnly'"
 * @generated
 */
@XmlJavaTypeAdapter(ExpansionProfileImplAdapter.class)
public interface ExpansionProfile extends DomainResource {
	/**
	 * Returns the value of the '<em><b>Url</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * An absolute URI that is used to identify this expansion profile when it is referenced in a specification, model, design or an instance. This SHALL be a URL, SHOULD be globally unique, and SHOULD be an address at which this expansion profile is (or will be) published. The URL SHOULD include the major version of the expansion profile. For more information see [Technical and Business Versions](resource.html#versions).
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Url</em>' containment reference.
	 * @see #setUrl(Uri)
	 * @see org.hl7.fhir.FhirPackage#getExpansionProfile_Url()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='url' namespace='##targetNamespace'"
	 * @generated
	 */
	Uri getUrl();

	/**
	 * Sets the value of the '{@link org.hl7.fhir.ExpansionProfile#getUrl <em>Url</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Url</em>' containment reference.
	 * @see #getUrl()
	 * @generated
	 */
	void setUrl(Uri value);

	/**
	 * Returns the value of the '<em><b>Identifier</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * A formal identifier that is used to identify this expansion profile when it is represented in other formats, or referenced in a specification, model, design or an instance.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Identifier</em>' containment reference.
	 * @see #setIdentifier(Identifier)
	 * @see org.hl7.fhir.FhirPackage#getExpansionProfile_Identifier()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='identifier' namespace='##targetNamespace'"
	 * @generated
	 */
	Identifier getIdentifier();

	/**
	 * Sets the value of the '{@link org.hl7.fhir.ExpansionProfile#getIdentifier <em>Identifier</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Identifier</em>' containment reference.
	 * @see #getIdentifier()
	 * @generated
	 */
	void setIdentifier(Identifier value);

	/**
	 * Returns the value of the '<em><b>Version</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The identifier that is used to identify this version of the expansion profile when it is referenced in a specification, model, design or instance. This is an arbitrary value managed by the expansion profile author and is not expected to be globally unique. For example, it might be a timestamp (e.g. yyyymmdd) if a managed version is not available. There is also no expectation that versions can be placed in a lexicographical sequence.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Version</em>' containment reference.
	 * @see #setVersion(org.hl7.fhir.String)
	 * @see org.hl7.fhir.FhirPackage#getExpansionProfile_Version()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='version' namespace='##targetNamespace'"
	 * @generated
	 */
	org.hl7.fhir.String getVersion();

	/**
	 * Sets the value of the '{@link org.hl7.fhir.ExpansionProfile#getVersion <em>Version</em>}' containment reference.
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
	 * A natural language name identifying the expansion profile. This name should be usable as an identifier for the module by machine processing applications such as code generation.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Name</em>' containment reference.
	 * @see #setName(org.hl7.fhir.String)
	 * @see org.hl7.fhir.FhirPackage#getExpansionProfile_Name()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='name' namespace='##targetNamespace'"
	 * @generated
	 */
	org.hl7.fhir.String getName();

	/**
	 * Sets the value of the '{@link org.hl7.fhir.ExpansionProfile#getName <em>Name</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Name</em>' containment reference.
	 * @see #getName()
	 * @generated
	 */
	void setName(org.hl7.fhir.String value);

	/**
	 * Returns the value of the '<em><b>Status</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The status of this expansion profile. Enables tracking the life-cycle of the content.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Status</em>' containment reference.
	 * @see #setStatus(PublicationStatus)
	 * @see org.hl7.fhir.FhirPackage#getExpansionProfile_Status()
	 * @model containment="true" required="true"
	 *        extendedMetaData="kind='element' name='status' namespace='##targetNamespace'"
	 * @generated
	 */
	PublicationStatus getStatus();

	/**
	 * Sets the value of the '{@link org.hl7.fhir.ExpansionProfile#getStatus <em>Status</em>}' containment reference.
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
	 * A boolean value to indicate that this expansion profile is authored for testing purposes (or education/evaluation/marketing), and is not intended to be used for genuine usage.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Experimental</em>' containment reference.
	 * @see #setExperimental(org.hl7.fhir.Boolean)
	 * @see org.hl7.fhir.FhirPackage#getExpansionProfile_Experimental()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='experimental' namespace='##targetNamespace'"
	 * @generated
	 */
	org.hl7.fhir.Boolean getExperimental();

	/**
	 * Sets the value of the '{@link org.hl7.fhir.ExpansionProfile#getExperimental <em>Experimental</em>}' containment reference.
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
	 * The date  (and optionally time) when the expansion profile was published. The date must change if and when the business version changes and it must change if the status code changes. In addition, it should change when the substantive content of the expansion profile changes.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Date</em>' containment reference.
	 * @see #setDate(DateTime)
	 * @see org.hl7.fhir.FhirPackage#getExpansionProfile_Date()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='date' namespace='##targetNamespace'"
	 * @generated
	 */
	DateTime getDate();

	/**
	 * Sets the value of the '{@link org.hl7.fhir.ExpansionProfile#getDate <em>Date</em>}' containment reference.
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
	 * The name of the individual or organization that published the expansion profile.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Publisher</em>' containment reference.
	 * @see #setPublisher(org.hl7.fhir.String)
	 * @see org.hl7.fhir.FhirPackage#getExpansionProfile_Publisher()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='publisher' namespace='##targetNamespace'"
	 * @generated
	 */
	org.hl7.fhir.String getPublisher();

	/**
	 * Sets the value of the '{@link org.hl7.fhir.ExpansionProfile#getPublisher <em>Publisher</em>}' containment reference.
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
	 * @see org.hl7.fhir.FhirPackage#getExpansionProfile_Contact()
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
	 * A free text natural language description of the expansion profile from a consumer's perspective.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Description</em>' containment reference.
	 * @see #setDescription(Markdown)
	 * @see org.hl7.fhir.FhirPackage#getExpansionProfile_Description()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='description' namespace='##targetNamespace'"
	 * @generated
	 */
	Markdown getDescription();

	/**
	 * Sets the value of the '{@link org.hl7.fhir.ExpansionProfile#getDescription <em>Description</em>}' containment reference.
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
	 * The content was developed with a focus and intent of supporting the contexts that are listed. These terms may be used to assist with indexing and searching for appropriate expansion profile instances.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Use Context</em>' containment reference list.
	 * @see org.hl7.fhir.FhirPackage#getExpansionProfile_UseContext()
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
	 * A legal or geographic region in which the expansion profile is intended to be used.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Jurisdiction</em>' containment reference list.
	 * @see org.hl7.fhir.FhirPackage#getExpansionProfile_Jurisdiction()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='jurisdiction' namespace='##targetNamespace'"
	 * @generated
	 */
	List<CodeableConcept> getJurisdiction();

	/**
	 * Returns the value of the '<em><b>Fixed Version</b></em>' containment reference list.
	 * The list contents are of type {@link org.hl7.fhir.ExpansionProfileFixedVersion}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Fix use of a particular code system to a particular version.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Fixed Version</em>' containment reference list.
	 * @see org.hl7.fhir.FhirPackage#getExpansionProfile_FixedVersion()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='fixedVersion' namespace='##targetNamespace'"
	 * @generated
	 */
	List<ExpansionProfileFixedVersion> getFixedVersion();

	/**
	 * Returns the value of the '<em><b>Excluded System</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Code system, or a particular version of a code system to be excluded from value set expansions.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Excluded System</em>' containment reference.
	 * @see #setExcludedSystem(ExpansionProfileExcludedSystem)
	 * @see org.hl7.fhir.FhirPackage#getExpansionProfile_ExcludedSystem()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='excludedSystem' namespace='##targetNamespace'"
	 * @generated
	 */
	ExpansionProfileExcludedSystem getExcludedSystem();

	/**
	 * Sets the value of the '{@link org.hl7.fhir.ExpansionProfile#getExcludedSystem <em>Excluded System</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Excluded System</em>' containment reference.
	 * @see #getExcludedSystem()
	 * @generated
	 */
	void setExcludedSystem(ExpansionProfileExcludedSystem value);

	/**
	 * Returns the value of the '<em><b>Include Designations</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Controls whether concept designations are to be included or excluded in value set expansions.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Include Designations</em>' containment reference.
	 * @see #setIncludeDesignations(org.hl7.fhir.Boolean)
	 * @see org.hl7.fhir.FhirPackage#getExpansionProfile_IncludeDesignations()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='includeDesignations' namespace='##targetNamespace'"
	 * @generated
	 */
	org.hl7.fhir.Boolean getIncludeDesignations();

	/**
	 * Sets the value of the '{@link org.hl7.fhir.ExpansionProfile#getIncludeDesignations <em>Include Designations</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Include Designations</em>' containment reference.
	 * @see #getIncludeDesignations()
	 * @generated
	 */
	void setIncludeDesignations(org.hl7.fhir.Boolean value);

	/**
	 * Returns the value of the '<em><b>Designation</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * A set of criteria that provide the constraints imposed on the value set expansion by including or excluding designations.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Designation</em>' containment reference.
	 * @see #setDesignation(ExpansionProfileDesignation)
	 * @see org.hl7.fhir.FhirPackage#getExpansionProfile_Designation()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='designation' namespace='##targetNamespace'"
	 * @generated
	 */
	ExpansionProfileDesignation getDesignation();

	/**
	 * Sets the value of the '{@link org.hl7.fhir.ExpansionProfile#getDesignation <em>Designation</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Designation</em>' containment reference.
	 * @see #getDesignation()
	 * @generated
	 */
	void setDesignation(ExpansionProfileDesignation value);

	/**
	 * Returns the value of the '<em><b>Include Definition</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Controls whether the value set definition is included or excluded in value set expansions.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Include Definition</em>' containment reference.
	 * @see #setIncludeDefinition(org.hl7.fhir.Boolean)
	 * @see org.hl7.fhir.FhirPackage#getExpansionProfile_IncludeDefinition()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='includeDefinition' namespace='##targetNamespace'"
	 * @generated
	 */
	org.hl7.fhir.Boolean getIncludeDefinition();

	/**
	 * Sets the value of the '{@link org.hl7.fhir.ExpansionProfile#getIncludeDefinition <em>Include Definition</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Include Definition</em>' containment reference.
	 * @see #getIncludeDefinition()
	 * @generated
	 */
	void setIncludeDefinition(org.hl7.fhir.Boolean value);

	/**
	 * Returns the value of the '<em><b>Active Only</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Controls whether inactive concepts are included or excluded in value set expansions.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Active Only</em>' containment reference.
	 * @see #setActiveOnly(org.hl7.fhir.Boolean)
	 * @see org.hl7.fhir.FhirPackage#getExpansionProfile_ActiveOnly()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='activeOnly' namespace='##targetNamespace'"
	 * @generated
	 */
	org.hl7.fhir.Boolean getActiveOnly();

	/**
	 * Sets the value of the '{@link org.hl7.fhir.ExpansionProfile#getActiveOnly <em>Active Only</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Active Only</em>' containment reference.
	 * @see #getActiveOnly()
	 * @generated
	 */
	void setActiveOnly(org.hl7.fhir.Boolean value);

	/**
	 * Returns the value of the '<em><b>Exclude Nested</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Controls whether or not the value set expansion nests codes or not (i.e. ValueSet.expansion.contains.contains).
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Exclude Nested</em>' containment reference.
	 * @see #setExcludeNested(org.hl7.fhir.Boolean)
	 * @see org.hl7.fhir.FhirPackage#getExpansionProfile_ExcludeNested()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='excludeNested' namespace='##targetNamespace'"
	 * @generated
	 */
	org.hl7.fhir.Boolean getExcludeNested();

	/**
	 * Sets the value of the '{@link org.hl7.fhir.ExpansionProfile#getExcludeNested <em>Exclude Nested</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Exclude Nested</em>' containment reference.
	 * @see #getExcludeNested()
	 * @generated
	 */
	void setExcludeNested(org.hl7.fhir.Boolean value);

	/**
	 * Returns the value of the '<em><b>Exclude Not For UI</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Controls whether or not the value set expansion includes codes which cannot be displayed in user interfaces.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Exclude Not For UI</em>' containment reference.
	 * @see #setExcludeNotForUI(org.hl7.fhir.Boolean)
	 * @see org.hl7.fhir.FhirPackage#getExpansionProfile_ExcludeNotForUI()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='excludeNotForUI' namespace='##targetNamespace'"
	 * @generated
	 */
	org.hl7.fhir.Boolean getExcludeNotForUI();

	/**
	 * Sets the value of the '{@link org.hl7.fhir.ExpansionProfile#getExcludeNotForUI <em>Exclude Not For UI</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Exclude Not For UI</em>' containment reference.
	 * @see #getExcludeNotForUI()
	 * @generated
	 */
	void setExcludeNotForUI(org.hl7.fhir.Boolean value);

	/**
	 * Returns the value of the '<em><b>Exclude Post Coordinated</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Controls whether or not the value set expansion includes post coordinated codes.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Exclude Post Coordinated</em>' containment reference.
	 * @see #setExcludePostCoordinated(org.hl7.fhir.Boolean)
	 * @see org.hl7.fhir.FhirPackage#getExpansionProfile_ExcludePostCoordinated()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='excludePostCoordinated' namespace='##targetNamespace'"
	 * @generated
	 */
	org.hl7.fhir.Boolean getExcludePostCoordinated();

	/**
	 * Sets the value of the '{@link org.hl7.fhir.ExpansionProfile#getExcludePostCoordinated <em>Exclude Post Coordinated</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Exclude Post Coordinated</em>' containment reference.
	 * @see #getExcludePostCoordinated()
	 * @generated
	 */
	void setExcludePostCoordinated(org.hl7.fhir.Boolean value);

	/**
	 * Returns the value of the '<em><b>Display Language</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Specifies the language to be used for description in the expansions i.e. the language to be used for ValueSet.expansion.contains.display.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Display Language</em>' containment reference.
	 * @see #setDisplayLanguage(Code)
	 * @see org.hl7.fhir.FhirPackage#getExpansionProfile_DisplayLanguage()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='displayLanguage' namespace='##targetNamespace'"
	 * @generated
	 */
	Code getDisplayLanguage();

	/**
	 * Sets the value of the '{@link org.hl7.fhir.ExpansionProfile#getDisplayLanguage <em>Display Language</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Display Language</em>' containment reference.
	 * @see #getDisplayLanguage()
	 * @generated
	 */
	void setDisplayLanguage(Code value);

	/**
	 * Returns the value of the '<em><b>Limited Expansion</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * If the value set being expanded is incomplete (because it is too big to expand), return a limited expansion (a subset) with an indicator that expansion is incomplete, using the extension [http://hl7.org/fhir/StructureDefinition/valueset-toocostly](extension-valueset-toocostly.html).
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Limited Expansion</em>' containment reference.
	 * @see #setLimitedExpansion(org.hl7.fhir.Boolean)
	 * @see org.hl7.fhir.FhirPackage#getExpansionProfile_LimitedExpansion()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='limitedExpansion' namespace='##targetNamespace'"
	 * @generated
	 */
	org.hl7.fhir.Boolean getLimitedExpansion();

	/**
	 * Sets the value of the '{@link org.hl7.fhir.ExpansionProfile#getLimitedExpansion <em>Limited Expansion</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Limited Expansion</em>' containment reference.
	 * @see #getLimitedExpansion()
	 * @generated
	 */
	void setLimitedExpansion(org.hl7.fhir.Boolean value);

} // ExpansionProfile
