/**
 */
package org.hl7.fhir;

import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;

import org.hl7.fhir.jaxb.ExpansionProfileDesignationImplAdapter;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Expansion Profile Designation</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * Resource to define constraints on the Expansion of a FHIR ValueSet.
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.hl7.fhir.ExpansionProfileDesignation#getInclude <em>Include</em>}</li>
 *   <li>{@link org.hl7.fhir.ExpansionProfileDesignation#getExclude <em>Exclude</em>}</li>
 * </ul>
 *
 * @see org.hl7.fhir.FhirPackage#getExpansionProfileDesignation()
 * @model extendedMetaData="name='ExpansionProfile.Designation' kind='elementOnly'"
 * @generated
 */
@XmlJavaTypeAdapter(ExpansionProfileDesignationImplAdapter.class)
public interface ExpansionProfileDesignation extends BackboneElement {
	/**
	 * Returns the value of the '<em><b>Include</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Designations to be included.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Include</em>' containment reference.
	 * @see #setInclude(ExpansionProfileInclude)
	 * @see org.hl7.fhir.FhirPackage#getExpansionProfileDesignation_Include()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='include' namespace='##targetNamespace'"
	 * @generated
	 */
	ExpansionProfileInclude getInclude();

	/**
	 * Sets the value of the '{@link org.hl7.fhir.ExpansionProfileDesignation#getInclude <em>Include</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Include</em>' containment reference.
	 * @see #getInclude()
	 * @generated
	 */
	void setInclude(ExpansionProfileInclude value);

	/**
	 * Returns the value of the '<em><b>Exclude</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Designations to be excluded.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Exclude</em>' containment reference.
	 * @see #setExclude(ExpansionProfileExclude)
	 * @see org.hl7.fhir.FhirPackage#getExpansionProfileDesignation_Exclude()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='exclude' namespace='##targetNamespace'"
	 * @generated
	 */
	ExpansionProfileExclude getExclude();

	/**
	 * Sets the value of the '{@link org.hl7.fhir.ExpansionProfileDesignation#getExclude <em>Exclude</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Exclude</em>' containment reference.
	 * @see #getExclude()
	 * @generated
	 */
	void setExclude(ExpansionProfileExclude value);

} // ExpansionProfileDesignation
