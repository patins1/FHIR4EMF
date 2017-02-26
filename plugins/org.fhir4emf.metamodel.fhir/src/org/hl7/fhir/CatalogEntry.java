/**
 */
package org.hl7.fhir;

import java.util.List;

import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;

import org.hl7.fhir.jaxb.CatalogEntryImplAdapter;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Catalog Entry</b></em>'.
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
 *   <li>{@link org.hl7.fhir.CatalogEntry#getType <em>Type</em>}</li>
 *   <li>{@link org.hl7.fhir.CatalogEntry#getReferencedItem <em>Referenced Item</em>}</li>
 *   <li>{@link org.hl7.fhir.CatalogEntry#getIdentifier <em>Identifier</em>}</li>
 *   <li>{@link org.hl7.fhir.CatalogEntry#getAdditionalIdentifier <em>Additional Identifier</em>}</li>
 *   <li>{@link org.hl7.fhir.CatalogEntry#getClassification <em>Classification</em>}</li>
 *   <li>{@link org.hl7.fhir.CatalogEntry#getStatus <em>Status</em>}</li>
 *   <li>{@link org.hl7.fhir.CatalogEntry#getValidFrom <em>Valid From</em>}</li>
 *   <li>{@link org.hl7.fhir.CatalogEntry#getValidTo <em>Valid To</em>}</li>
 *   <li>{@link org.hl7.fhir.CatalogEntry#getLastUpdated <em>Last Updated</em>}</li>
 *   <li>{@link org.hl7.fhir.CatalogEntry#getAdditionalCharacteristic <em>Additional Characteristic</em>}</li>
 *   <li>{@link org.hl7.fhir.CatalogEntry#getAdditionalClassification <em>Additional Classification</em>}</li>
 *   <li>{@link org.hl7.fhir.CatalogEntry#getRelatedItem <em>Related Item</em>}</li>
 * </ul>
 *
 * @see org.hl7.fhir.FhirPackage#getCatalogEntry()
 * @model extendedMetaData="name='Catalog.Entry' kind='elementOnly'"
 * @generated
 */
@XmlJavaTypeAdapter(CatalogEntryImplAdapter.class)
public interface CatalogEntry extends BackboneElement {
	/**
	 * Returns the value of the '<em><b>Type</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The type of item - medication, device, service, protocol or other.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Type</em>' containment reference.
	 * @see #setType(CodeableConcept)
	 * @see org.hl7.fhir.FhirPackage#getCatalogEntry_Type()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='type' namespace='##targetNamespace'"
	 * @generated
	 */
	CodeableConcept getType();

	/**
	 * Sets the value of the '{@link org.hl7.fhir.CatalogEntry#getType <em>Type</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Type</em>' containment reference.
	 * @see #getType()
	 * @generated
	 */
	void setType(CodeableConcept value);

	/**
	 * Returns the value of the '<em><b>Referenced Item</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Content of the catalog.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Referenced Item</em>' containment reference.
	 * @see #setReferencedItem(Reference)
	 * @see org.hl7.fhir.FhirPackage#getCatalogEntry_ReferencedItem()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='referencedItem' namespace='##targetNamespace'"
	 * @generated
	 */
	Reference getReferencedItem();

	/**
	 * Sets the value of the '{@link org.hl7.fhir.CatalogEntry#getReferencedItem <em>Referenced Item</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Referenced Item</em>' containment reference.
	 * @see #getReferencedItem()
	 * @generated
	 */
	void setReferencedItem(Reference value);

	/**
	 * Returns the value of the '<em><b>Identifier</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Used in supporting different identifiers for the same product, e.g. manufacturer code and retailer code.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Identifier</em>' containment reference.
	 * @see #setIdentifier(Identifier)
	 * @see org.hl7.fhir.FhirPackage#getCatalogEntry_Identifier()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='identifier' namespace='##targetNamespace'"
	 * @generated
	 */
	Identifier getIdentifier();

	/**
	 * Sets the value of the '{@link org.hl7.fhir.CatalogEntry#getIdentifier <em>Identifier</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Identifier</em>' containment reference.
	 * @see #getIdentifier()
	 * @generated
	 */
	void setIdentifier(Identifier value);

	/**
	 * Returns the value of the '<em><b>Additional Identifier</b></em>' containment reference list.
	 * The list contents are of type {@link org.hl7.fhir.Identifier}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Used in supporting related concepts, e.g. NDC to RxNorm.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Additional Identifier</em>' containment reference list.
	 * @see org.hl7.fhir.FhirPackage#getCatalogEntry_AdditionalIdentifier()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='additionalIdentifier' namespace='##targetNamespace'"
	 * @generated
	 */
	List<Identifier> getAdditionalIdentifier();

	/**
	 * Returns the value of the '<em><b>Classification</b></em>' containment reference list.
	 * The list contents are of type {@link org.hl7.fhir.Identifier}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Classes of devices, or ATC for medication.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Classification</em>' containment reference list.
	 * @see org.hl7.fhir.FhirPackage#getCatalogEntry_Classification()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='classification' namespace='##targetNamespace'"
	 * @generated
	 */
	List<Identifier> getClassification();

	/**
	 * Returns the value of the '<em><b>Status</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Used to support catalog exchange even for unsupported products, e.g. getting list of medications even if not prescribable.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Status</em>' containment reference.
	 * @see #setStatus(CodeableConcept)
	 * @see org.hl7.fhir.FhirPackage#getCatalogEntry_Status()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='status' namespace='##targetNamespace'"
	 * @generated
	 */
	CodeableConcept getStatus();

	/**
	 * Sets the value of the '{@link org.hl7.fhir.CatalogEntry#getStatus <em>Status</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Status</em>' containment reference.
	 * @see #getStatus()
	 * @generated
	 */
	void setStatus(CodeableConcept value);

	/**
	 * Returns the value of the '<em><b>Valid From</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The date from which this catalog entry is expected to be active.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Valid From</em>' containment reference.
	 * @see #setValidFrom(DateTime)
	 * @see org.hl7.fhir.FhirPackage#getCatalogEntry_ValidFrom()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='validFrom' namespace='##targetNamespace'"
	 * @generated
	 */
	DateTime getValidFrom();

	/**
	 * Sets the value of the '{@link org.hl7.fhir.CatalogEntry#getValidFrom <em>Valid From</em>}' containment reference.
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
	 * The date until which this catalog entry is expected to be active.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Valid To</em>' containment reference.
	 * @see #setValidTo(DateTime)
	 * @see org.hl7.fhir.FhirPackage#getCatalogEntry_ValidTo()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='validTo' namespace='##targetNamespace'"
	 * @generated
	 */
	DateTime getValidTo();

	/**
	 * Sets the value of the '{@link org.hl7.fhir.CatalogEntry#getValidTo <em>Valid To</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Valid To</em>' containment reference.
	 * @see #getValidTo()
	 * @generated
	 */
	void setValidTo(DateTime value);

	/**
	 * Returns the value of the '<em><b>Last Updated</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Perhaps not needed.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Last Updated</em>' containment reference.
	 * @see #setLastUpdated(DateTime)
	 * @see org.hl7.fhir.FhirPackage#getCatalogEntry_LastUpdated()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='lastUpdated' namespace='##targetNamespace'"
	 * @generated
	 */
	DateTime getLastUpdated();

	/**
	 * Sets the value of the '{@link org.hl7.fhir.CatalogEntry#getLastUpdated <em>Last Updated</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Last Updated</em>' containment reference.
	 * @see #getLastUpdated()
	 * @generated
	 */
	void setLastUpdated(DateTime value);

	/**
	 * Returns the value of the '<em><b>Additional Characteristic</b></em>' containment reference list.
	 * The list contents are of type {@link org.hl7.fhir.CodeableConcept}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Used for examplefor Out of Formulary, or any specifics.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Additional Characteristic</em>' containment reference list.
	 * @see org.hl7.fhir.FhirPackage#getCatalogEntry_AdditionalCharacteristic()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='additionalCharacteristic' namespace='##targetNamespace'"
	 * @generated
	 */
	List<CodeableConcept> getAdditionalCharacteristic();

	/**
	 * Returns the value of the '<em><b>Additional Classification</b></em>' containment reference list.
	 * The list contents are of type {@link org.hl7.fhir.CodeableConcept}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * User for example for ATC classification, or.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Additional Classification</em>' containment reference list.
	 * @see org.hl7.fhir.FhirPackage#getCatalogEntry_AdditionalClassification()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='additionalClassification' namespace='##targetNamespace'"
	 * @generated
	 */
	List<CodeableConcept> getAdditionalClassification();

	/**
	 * Returns the value of the '<em><b>Related Item</b></em>' containment reference list.
	 * The list contents are of type {@link org.hl7.fhir.CatalogRelatedItem}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Used for example,  to point to a substance, or to a device used to administer a medication.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Related Item</em>' containment reference list.
	 * @see org.hl7.fhir.FhirPackage#getCatalogEntry_RelatedItem()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='relatedItem' namespace='##targetNamespace'"
	 * @generated
	 */
	List<CatalogRelatedItem> getRelatedItem();

} // CatalogEntry
