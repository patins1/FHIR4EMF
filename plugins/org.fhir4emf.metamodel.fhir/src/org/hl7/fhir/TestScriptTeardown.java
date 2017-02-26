/**
 */
package org.hl7.fhir;

import java.util.List;

import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;

import org.hl7.fhir.jaxb.TestScriptTeardownImplAdapter;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Test Script Teardown</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * TestScript is a resource that specifies a suite of tests against a FHIR server implementation to determine compliance against the FHIR specification.
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.hl7.fhir.TestScriptTeardown#getAction <em>Action</em>}</li>
 * </ul>
 *
 * @see org.hl7.fhir.FhirPackage#getTestScriptTeardown()
 * @model extendedMetaData="name='TestScript.Teardown' kind='elementOnly'"
 * @generated
 */
@XmlJavaTypeAdapter(TestScriptTeardownImplAdapter.class)
public interface TestScriptTeardown extends BackboneElement {
	/**
	 * Returns the value of the '<em><b>Action</b></em>' containment reference list.
	 * The list contents are of type {@link org.hl7.fhir.TestScriptAction2}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The teardown action will only contain an operation.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Action</em>' containment reference list.
	 * @see org.hl7.fhir.FhirPackage#getTestScriptTeardown_Action()
	 * @model containment="true" required="true"
	 *        extendedMetaData="kind='element' name='action' namespace='##targetNamespace'"
	 * @generated
	 */
	List<TestScriptAction2> getAction();

} // TestScriptTeardown
