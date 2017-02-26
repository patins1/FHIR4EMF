/**
 */
package fhirrest;

import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;

import org.eclipse.emf.ecore.EObject;

import org.hl7.fhir.Resource;

import fhirrest.jaxb.CreateRequestImplAdapter;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Create Request</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link fhirrest.CreateRequest#getType <em>Type</em>}</li>
 *   <li>{@link fhirrest.CreateRequest#get_format <em>format</em>}</li>
 *   <li>{@link fhirrest.CreateRequest#getResource <em>Resource</em>}</li>
 * </ul>
 *
 * @see fhirrest.FhirrestPackage#getCreateRequest()
 * @model
 * @generated
 */
@XmlJavaTypeAdapter(CreateRequestImplAdapter.class)
public interface CreateRequest extends EObject {
	/**
	 * Returns the value of the '<em><b>Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Type</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Type</em>' attribute.
	 * @see #setType(String)
	 * @see fhirrest.FhirrestPackage#getCreateRequest_Type()
	 * @model
	 * @generated
	 */
	String getType();

	/**
	 * Sets the value of the '{@link fhirrest.CreateRequest#getType <em>Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Type</em>' attribute.
	 * @see #getType()
	 * @generated
	 */
	void setType(String value);

	/**
	 * Returns the value of the '<em><b>format</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>format</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>format</em>' attribute.
	 * @see #set_format(String)
	 * @see fhirrest.FhirrestPackage#getCreateRequest__format()
	 * @model
	 * @generated
	 */
	String get_format();

	/**
	 * Sets the value of the '{@link fhirrest.CreateRequest#get_format <em>format</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>format</em>' attribute.
	 * @see #get_format()
	 * @generated
	 */
	void set_format(String value);

	/**
	 * Returns the value of the '<em><b>Resource</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Resource</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Resource</em>' containment reference.
	 * @see #setResource(Resource)
	 * @see fhirrest.FhirrestPackage#getCreateRequest_Resource()
	 * @model containment="true" required="true"
	 * @generated
	 */
	Resource getResource();

	/**
	 * Sets the value of the '{@link fhirrest.CreateRequest#getResource <em>Resource</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Resource</em>' containment reference.
	 * @see #getResource()
	 * @generated
	 */
	void setResource(Resource value);

} // CreateRequest
