/**
 */
package fhirrest.impl;

import fhirrest.FhirrestPackage;
import fhirrest.VReadResponse;

import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;

import org.eclipse.emf.ecore.EClass;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>VRead Response</b></em>'.
 * <!-- end-user-doc -->
 *
 * @generated
 */
@XmlType(name = "VReadResponse", namespace = "http://hl7.org/fhir-rest")
@XmlRootElement(name = "fhirrest.VReadResponse")
public class VReadResponseImpl extends ReadResponseImpl implements VReadResponse {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected VReadResponseImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return FhirrestPackage.Literals.VREAD_RESPONSE;
	}

} //VReadResponseImpl
