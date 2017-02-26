/**
 */
package org.hl7.fhir;

import java.util.List;

import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;

import org.hl7.fhir.jaxb.ExpansionProfileIncludeImplAdapter;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Expansion Profile Include</b></em>'.
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
 *   <li>{@link org.hl7.fhir.ExpansionProfileInclude#getDesignation <em>Designation</em>}</li>
 * </ul>
 *
 * @see org.hl7.fhir.FhirPackage#getExpansionProfileInclude()
 * @model extendedMetaData="name='ExpansionProfile.Include' kind='elementOnly'"
 * @generated
 */
@XmlJavaTypeAdapter(ExpansionProfileIncludeImplAdapter.class)
public interface ExpansionProfileInclude extends BackboneElement {
	/**
	 * Returns the value of the '<em><b>Designation</b></em>' containment reference list.
	 * The list contents are of type {@link org.hl7.fhir.ExpansionProfileDesignation1}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * A data group for each designation to be included.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Designation</em>' containment reference list.
	 * @see org.hl7.fhir.FhirPackage#getExpansionProfileInclude_Designation()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='designation' namespace='##targetNamespace'"
	 * @generated
	 */
	List<ExpansionProfileDesignation1> getDesignation();

} // ExpansionProfileInclude
