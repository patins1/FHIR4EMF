/**
 */
package fhirrest.impl;

import fhirrest.FhirrestPackage;
import fhirrest.UpdateResponse;

import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Update Response</b></em>'.
 * <!-- end-user-doc -->
 *
 * @generated
 */
@XmlType(name = "UpdateResponse", namespace = "http://hl7.org/fhir-rest")
@XmlRootElement(name = "fhirrest.UpdateResponse")
public class UpdateResponseImpl extends MinimalEObjectImpl.Container implements UpdateResponse {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected UpdateResponseImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return FhirrestPackage.Literals.UPDATE_RESPONSE;
	}

} //UpdateResponseImpl
