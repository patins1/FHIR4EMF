/**
 */
package org.hl7.fhir;

import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;

import org.hl7.fhir.jaxb.ExpansionProfileFixedVersionImplAdapter;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Expansion Profile Fixed Version</b></em>'.
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
 *   <li>{@link org.hl7.fhir.ExpansionProfileFixedVersion#getSystem <em>System</em>}</li>
 *   <li>{@link org.hl7.fhir.ExpansionProfileFixedVersion#getVersion <em>Version</em>}</li>
 *   <li>{@link org.hl7.fhir.ExpansionProfileFixedVersion#getMode <em>Mode</em>}</li>
 * </ul>
 *
 * @see org.hl7.fhir.FhirPackage#getExpansionProfileFixedVersion()
 * @model extendedMetaData="name='ExpansionProfile.FixedVersion' kind='elementOnly'"
 * @generated
 */
@XmlJavaTypeAdapter(ExpansionProfileFixedVersionImplAdapter.class)
public interface ExpansionProfileFixedVersion extends BackboneElement {
	/**
	 * Returns the value of the '<em><b>System</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The specific system for which to fix the version.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>System</em>' containment reference.
	 * @see #setSystem(Uri)
	 * @see org.hl7.fhir.FhirPackage#getExpansionProfileFixedVersion_System()
	 * @model containment="true" required="true"
	 *        extendedMetaData="kind='element' name='system' namespace='##targetNamespace'"
	 * @generated
	 */
	Uri getSystem();

	/**
	 * Sets the value of the '{@link org.hl7.fhir.ExpansionProfileFixedVersion#getSystem <em>System</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>System</em>' containment reference.
	 * @see #getSystem()
	 * @generated
	 */
	void setSystem(Uri value);

	/**
	 * Returns the value of the '<em><b>Version</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The version of the code system from which codes in the expansion should be included.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Version</em>' containment reference.
	 * @see #setVersion(org.hl7.fhir.String)
	 * @see org.hl7.fhir.FhirPackage#getExpansionProfileFixedVersion_Version()
	 * @model containment="true" required="true"
	 *        extendedMetaData="kind='element' name='version' namespace='##targetNamespace'"
	 * @generated
	 */
	org.hl7.fhir.String getVersion();

	/**
	 * Sets the value of the '{@link org.hl7.fhir.ExpansionProfileFixedVersion#getVersion <em>Version</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Version</em>' containment reference.
	 * @see #getVersion()
	 * @generated
	 */
	void setVersion(org.hl7.fhir.String value);

	/**
	 * Returns the value of the '<em><b>Mode</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * How to manage the intersection between a fixed version in a value set, and this fixed version of the system in the expansion profile.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Mode</em>' containment reference.
	 * @see #setMode(SystemVersionProcessingMode)
	 * @see org.hl7.fhir.FhirPackage#getExpansionProfileFixedVersion_Mode()
	 * @model containment="true" required="true"
	 *        extendedMetaData="kind='element' name='mode' namespace='##targetNamespace'"
	 * @generated
	 */
	SystemVersionProcessingMode getMode();

	/**
	 * Sets the value of the '{@link org.hl7.fhir.ExpansionProfileFixedVersion#getMode <em>Mode</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Mode</em>' containment reference.
	 * @see #getMode()
	 * @generated
	 */
	void setMode(SystemVersionProcessingMode value);

} // ExpansionProfileFixedVersion
