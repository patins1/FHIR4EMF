/**
 */
package org.hl7.fhir;

import java.util.List;

import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;

import org.hl7.fhir.jaxb.ExpansionProfileExcludeImplAdapter;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Expansion Profile Exclude</b></em>'.
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
 *   <li>{@link org.hl7.fhir.ExpansionProfileExclude#getDesignation <em>Designation</em>}</li>
 * </ul>
 *
 * @see org.hl7.fhir.FhirPackage#getExpansionProfileExclude()
 * @model extendedMetaData="name='ExpansionProfile.Exclude' kind='elementOnly'"
 * @generated
 */
@XmlJavaTypeAdapter(ExpansionProfileExcludeImplAdapter.class)
public interface ExpansionProfileExclude extends BackboneElement {
	/**
	 * Returns the value of the '<em><b>Designation</b></em>' containment reference list.
	 * The list contents are of type {@link org.hl7.fhir.ExpansionProfileDesignation2}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * A data group for each designation to be excluded.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Designation</em>' containment reference list.
	 * @see org.hl7.fhir.FhirPackage#getExpansionProfileExclude_Designation()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='designation' namespace='##targetNamespace'"
	 * @generated
	 */
	List<ExpansionProfileDesignation2> getDesignation();

} // ExpansionProfileExclude
