/**
 */
package fhirrest.impl;

import fhirrest.DeleteResponse;
import fhirrest.FhirrestPackage;

import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Delete Response</b></em>'.
 * <!-- end-user-doc -->
 *
 * @generated
 */
@XmlType(name = "DeleteResponse", namespace = "http://hl7.org/fhir-rest")
@XmlRootElement(name = "fhirrest.DeleteResponse")
public class DeleteResponseImpl extends MinimalEObjectImpl.Container implements DeleteResponse {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected DeleteResponseImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return FhirrestPackage.Literals.DELETE_RESPONSE;
	}

} //DeleteResponseImpl
