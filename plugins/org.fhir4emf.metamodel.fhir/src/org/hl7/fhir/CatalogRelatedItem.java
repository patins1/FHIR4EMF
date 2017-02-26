/**
 */
package org.hl7.fhir;

import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;

import org.hl7.fhir.jaxb.CatalogRelatedItemImplAdapter;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Catalog Related Item</b></em>'.
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
 *   <li>{@link org.hl7.fhir.CatalogRelatedItem#getRelationtype <em>Relationtype</em>}</li>
 *   <li>{@link org.hl7.fhir.CatalogRelatedItem#getType <em>Type</em>}</li>
 *   <li>{@link org.hl7.fhir.CatalogRelatedItem#getIdentifier <em>Identifier</em>}</li>
 * </ul>
 *
 * @see org.hl7.fhir.FhirPackage#getCatalogRelatedItem()
 * @model extendedMetaData="name='Catalog.RelatedItem' kind='elementOnly'"
 * @generated
 */
@XmlJavaTypeAdapter(CatalogRelatedItemImplAdapter.class)
public interface CatalogRelatedItem extends BackboneElement {
	/**
	 * Returns the value of the '<em><b>Relationtype</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The type of relation to the related item: child, parent, packageContent, containerPackage, usedIn, uses, requires, etc.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Relationtype</em>' containment reference.
	 * @see #setRelationtype(CodeableConcept)
	 * @see org.hl7.fhir.FhirPackage#getCatalogRelatedItem_Relationtype()
	 * @model containment="true" required="true"
	 *        extendedMetaData="kind='element' name='relationtype' namespace='##targetNamespace'"
	 * @generated
	 */
	CodeableConcept getRelationtype();

	/**
	 * Sets the value of the '{@link org.hl7.fhir.CatalogRelatedItem#getRelationtype <em>Relationtype</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Relationtype</em>' containment reference.
	 * @see #getRelationtype()
	 * @generated
	 */
	void setRelationtype(CodeableConcept value);

	/**
	 * Returns the value of the '<em><b>Type</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The type of related item.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Type</em>' containment reference.
	 * @see #setType(CodeableConcept)
	 * @see org.hl7.fhir.FhirPackage#getCatalogRelatedItem_Type()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='type' namespace='##targetNamespace'"
	 * @generated
	 */
	CodeableConcept getType();

	/**
	 * Sets the value of the '{@link org.hl7.fhir.CatalogRelatedItem#getType <em>Type</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Type</em>' containment reference.
	 * @see #getType()
	 * @generated
	 */
	void setType(CodeableConcept value);

	/**
	 * Returns the value of the '<em><b>Identifier</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The reference to the related item.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Identifier</em>' containment reference.
	 * @see #setIdentifier(Reference)
	 * @see org.hl7.fhir.FhirPackage#getCatalogRelatedItem_Identifier()
	 * @model containment="true" required="true"
	 *        extendedMetaData="kind='element' name='identifier' namespace='##targetNamespace'"
	 * @generated
	 */
	Reference getIdentifier();

	/**
	 * Sets the value of the '{@link org.hl7.fhir.CatalogRelatedItem#getIdentifier <em>Identifier</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Identifier</em>' containment reference.
	 * @see #getIdentifier()
	 * @generated
	 */
	void setIdentifier(Reference value);

} // CatalogRelatedItem
