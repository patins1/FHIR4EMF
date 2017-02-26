/**
 */
package org.hl7.fhir;

import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;

import org.hl7.fhir.jaxb.CatalogDocumentImplAdapter;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Catalog Document</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * A document that bundles a set of catalog entries. A catalog entry contains metadata about an item and a pointer to the item’s representative resource. The item is an entity that can be ordered or consulted from a catalog: Medications, devices, lab services, organizations...
 * The catalog resource provides the data necessary for a synchronization of the item data – e.g. the version or last update date which allows systems to obtain differential updates. 
 * The catalog does not replicate the content of the item, since that is expected to be in the resource that is referenced. There is however some metadata that is important for the catalog synchronization and not in the “clinical” resource. Examples are different classifications and related identifiers, or packaging information, or device components, or different characteristics.
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.hl7.fhir.CatalogDocument#getStatus <em>Status</em>}</li>
 *   <li>{@link org.hl7.fhir.CatalogDocument#getProvider <em>Provider</em>}</li>
 *   <li>{@link org.hl7.fhir.CatalogDocument#getContentType <em>Content Type</em>}</li>
 *   <li>{@link org.hl7.fhir.CatalogDocument#getUpdateMode <em>Update Mode</em>}</li>
 *   <li>{@link org.hl7.fhir.CatalogDocument#getIdentifier <em>Identifier</em>}</li>
 *   <li>{@link org.hl7.fhir.CatalogDocument#getContentVersion <em>Content Version</em>}</li>
 *   <li>{@link org.hl7.fhir.CatalogDocument#getIssueDate <em>Issue Date</em>}</li>
 *   <li>{@link org.hl7.fhir.CatalogDocument#getValidFrom <em>Valid From</em>}</li>
 *   <li>{@link org.hl7.fhir.CatalogDocument#getValidTo <em>Valid To</em>}</li>
 * </ul>
 *
 * @see org.hl7.fhir.FhirPackage#getCatalogDocument()
 * @model extendedMetaData="name='Catalog.Document' kind='elementOnly'"
 * @generated
 */
@XmlJavaTypeAdapter(CatalogDocumentImplAdapter.class)
public interface CatalogDocument extends BackboneElement {
	/**
	 * Returns the value of the '<em><b>Status</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Used for presenting.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Status</em>' containment reference.
	 * @see #setStatus(CodeableConcept)
	 * @see org.hl7.fhir.FhirPackage#getCatalogDocument_Status()
	 * @model containment="true" required="true"
	 *        extendedMetaData="kind='element' name='status' namespace='##targetNamespace'"
	 * @generated
	 */
	CodeableConcept getStatus();

	/**
	 * Sets the value of the '{@link org.hl7.fhir.CatalogDocument#getStatus <em>Status</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Status</em>' containment reference.
	 * @see #getStatus()
	 * @generated
	 */
	void setStatus(CodeableConcept value);

	/**
	 * Returns the value of the '<em><b>Provider</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The entity that is issuing (sending, submitting, publishing) the catalog.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Provider</em>' containment reference.
	 * @see #setProvider(Reference)
	 * @see org.hl7.fhir.FhirPackage#getCatalogDocument_Provider()
	 * @model containment="true" required="true"
	 *        extendedMetaData="kind='element' name='provider' namespace='##targetNamespace'"
	 * @generated
	 */
	Reference getProvider();

	/**
	 * Sets the value of the '{@link org.hl7.fhir.CatalogDocument#getProvider <em>Provider</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Provider</em>' containment reference.
	 * @see #getProvider()
	 * @generated
	 */
	void setProvider(Reference value);

	/**
	 * Returns the value of the '<em><b>Content Type</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * For example FormularyOnly items, or Full Catalog, or SingleSubmission, or others.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Content Type</em>' containment reference.
	 * @see #setContentType(CodeableConcept)
	 * @see org.hl7.fhir.FhirPackage#getCatalogDocument_ContentType()
	 * @model containment="true" required="true"
	 *        extendedMetaData="kind='element' name='contentType' namespace='##targetNamespace'"
	 * @generated
	 */
	CodeableConcept getContentType();

	/**
	 * Sets the value of the '{@link org.hl7.fhir.CatalogDocument#getContentType <em>Content Type</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Content Type</em>' containment reference.
	 * @see #getContentType()
	 * @generated
	 */
	void setContentType(CodeableConcept value);

	/**
	 * Returns the value of the '<em><b>Update Mode</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Used to define a full update, or appending information (e.g. sending the catalog of substances does not replace the catalog of medications, but rather updates the characteristics).
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Update Mode</em>' containment reference.
	 * @see #setUpdateMode(CodeableConcept)
	 * @see org.hl7.fhir.FhirPackage#getCatalogDocument_UpdateMode()
	 * @model containment="true" required="true"
	 *        extendedMetaData="kind='element' name='updateMode' namespace='##targetNamespace'"
	 * @generated
	 */
	CodeableConcept getUpdateMode();

	/**
	 * Sets the value of the '{@link org.hl7.fhir.CatalogDocument#getUpdateMode <em>Update Mode</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Update Mode</em>' containment reference.
	 * @see #getUpdateMode()
	 * @generated
	 */
	void setUpdateMode(CodeableConcept value);

	/**
	 * Returns the value of the '<em><b>Identifier</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Uniquely identifies the catalog for archiving, versioning, duplicate checking, etc.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Identifier</em>' containment reference.
	 * @see #setIdentifier(Identifier)
	 * @see org.hl7.fhir.FhirPackage#getCatalogDocument_Identifier()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='identifier' namespace='##targetNamespace'"
	 * @generated
	 */
	Identifier getIdentifier();

	/**
	 * Sets the value of the '{@link org.hl7.fhir.CatalogDocument#getIdentifier <em>Identifier</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Identifier</em>' containment reference.
	 * @see #getIdentifier()
	 * @generated
	 */
	void setIdentifier(Identifier value);

	/**
	 * Returns the value of the '<em><b>Content Version</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * To support versioning and deciding when to overwrite /update content.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Content Version</em>' containment reference.
	 * @see #setContentVersion(Identifier)
	 * @see org.hl7.fhir.FhirPackage#getCatalogDocument_ContentVersion()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='contentVersion' namespace='##targetNamespace'"
	 * @generated
	 */
	Identifier getContentVersion();

	/**
	 * Sets the value of the '{@link org.hl7.fhir.CatalogDocument#getContentVersion <em>Content Version</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Content Version</em>' containment reference.
	 * @see #getContentVersion()
	 * @generated
	 */
	void setContentVersion(Identifier value);

	/**
	 * Returns the value of the '<em><b>Issue Date</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The date when the catalog document is issued.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Issue Date</em>' containment reference.
	 * @see #setIssueDate(DateTime)
	 * @see org.hl7.fhir.FhirPackage#getCatalogDocument_IssueDate()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='issueDate' namespace='##targetNamespace'"
	 * @generated
	 */
	DateTime getIssueDate();

	/**
	 * Sets the value of the '{@link org.hl7.fhir.CatalogDocument#getIssueDate <em>Issue Date</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Issue Date</em>' containment reference.
	 * @see #getIssueDate()
	 * @generated
	 */
	void setIssueDate(DateTime value);

	/**
	 * Returns the value of the '<em><b>Valid From</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * To support delayed or timed activation of items, e.g. "next year this product will be available".
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Valid From</em>' containment reference.
	 * @see #setValidFrom(DateTime)
	 * @see org.hl7.fhir.FhirPackage#getCatalogDocument_ValidFrom()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='validFrom' namespace='##targetNamespace'"
	 * @generated
	 */
	DateTime getValidFrom();

	/**
	 * Sets the value of the '{@link org.hl7.fhir.CatalogDocument#getValidFrom <em>Valid From</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Valid From</em>' containment reference.
	 * @see #getValidFrom()
	 * @generated
	 */
	void setValidFrom(DateTime value);

	/**
	 * Returns the value of the '<em><b>Valid To</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * To support delayed or timed deactivation of items, e.g. "next year this product will no longer be available".
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Valid To</em>' containment reference.
	 * @see #setValidTo(DateTime)
	 * @see org.hl7.fhir.FhirPackage#getCatalogDocument_ValidTo()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='validTo' namespace='##targetNamespace'"
	 * @generated
	 */
	DateTime getValidTo();

	/**
	 * Sets the value of the '{@link org.hl7.fhir.CatalogDocument#getValidTo <em>Valid To</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Valid To</em>' containment reference.
	 * @see #getValidTo()
	 * @generated
	 */
	void setValidTo(DateTime value);

} // CatalogDocument
