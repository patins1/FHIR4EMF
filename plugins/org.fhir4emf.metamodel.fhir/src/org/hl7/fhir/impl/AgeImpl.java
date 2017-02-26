/**
 */
package org.hl7.fhir.impl;

import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;

import org.eclipse.emf.ecore.EClass;

import org.hl7.fhir.Age;
import org.hl7.fhir.FhirPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Age</b></em>'.
 * <!-- end-user-doc -->
 *
 * @generated
 */
@XmlType(name = "Age", namespace = "http://hl7.org/fhir")
@XmlRootElement(name = "fhir.Age")
public class AgeImpl extends QuantityImpl implements Age {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected AgeImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return FhirPackage.eINSTANCE.getAge();
	}

} //AgeImpl
