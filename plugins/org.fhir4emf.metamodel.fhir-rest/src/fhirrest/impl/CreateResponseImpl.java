/**
 */
package fhirrest.impl;

import fhirrest.CreateResponse;
import fhirrest.FhirrestPackage;

import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Create Response</b></em>'.
 * <!-- end-user-doc -->
 *
 * @generated
 */
@XmlType(name = "CreateResponse", namespace = "http://hl7.org/fhir-rest")
@XmlRootElement(name = "fhirrest.CreateResponse")
public class CreateResponseImpl extends MinimalEObjectImpl.Container implements CreateResponse {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected CreateResponseImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return FhirrestPackage.Literals.CREATE_RESPONSE;
	}

} //CreateResponseImpl
