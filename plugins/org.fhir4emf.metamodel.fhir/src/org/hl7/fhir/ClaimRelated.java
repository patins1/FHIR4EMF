/**
 */
package org.hl7.fhir;

import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;

import org.hl7.fhir.jaxb.ClaimRelatedImplAdapter;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Claim Related</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * A provider issued list of services and products provided, or to be provided, to a patient which is provided to an insurer for payment recovery.
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.hl7.fhir.ClaimRelated#getClaim <em>Claim</em>}</li>
 *   <li>{@link org.hl7.fhir.ClaimRelated#getRelationship <em>Relationship</em>}</li>
 *   <li>{@link org.hl7.fhir.ClaimRelated#getReference <em>Reference</em>}</li>
 * </ul>
 *
 * @see org.hl7.fhir.FhirPackage#getClaimRelated()
 * @model extendedMetaData="name='Claim.Related' kind='elementOnly'"
 * @generated
 */
@XmlJavaTypeAdapter(ClaimRelatedImplAdapter.class)
public interface ClaimRelated extends BackboneElement {
	/**
	 * Returns the value of the '<em><b>Claim</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Other claims which are related to this claim such as prior claim versions or for related services.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Claim</em>' containment reference.
	 * @see #setClaim(Reference)
	 * @see org.hl7.fhir.FhirPackage#getClaimRelated_Claim()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='claim' namespace='##targetNamespace'"
	 * @generated
	 */
	Reference getClaim();

	/**
	 * Sets the value of the '{@link org.hl7.fhir.ClaimRelated#getClaim <em>Claim</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Claim</em>' containment reference.
	 * @see #getClaim()
	 * @generated
	 */
	void setClaim(Reference value);

	/**
	 * Returns the value of the '<em><b>Relationship</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * For example prior or umbrella.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Relationship</em>' containment reference.
	 * @see #setRelationship(CodeableConcept)
	 * @see org.hl7.fhir.FhirPackage#getClaimRelated_Relationship()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='relationship' namespace='##targetNamespace'"
	 * @generated
	 */
	CodeableConcept getRelationship();

	/**
	 * Sets the value of the '{@link org.hl7.fhir.ClaimRelated#getRelationship <em>Relationship</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Relationship</em>' containment reference.
	 * @see #getRelationship()
	 * @generated
	 */
	void setRelationship(CodeableConcept value);

	/**
	 * Returns the value of the '<em><b>Reference</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * An alternate organizational reference to the case or file to which this particular claim pertains - eg Property/Casualy insurer claim # or Workers Compensation case # .
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Reference</em>' containment reference.
	 * @see #setReference(Identifier)
	 * @see org.hl7.fhir.FhirPackage#getClaimRelated_Reference()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='reference' namespace='##targetNamespace'"
	 * @generated
	 */
	Identifier getReference();

	/**
	 * Sets the value of the '{@link org.hl7.fhir.ClaimRelated#getReference <em>Reference</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Reference</em>' containment reference.
	 * @see #getReference()
	 * @generated
	 */
	void setReference(Identifier value);

} // ClaimRelated
