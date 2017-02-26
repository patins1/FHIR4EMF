/**
 */
package fhirrest;

import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;

import org.eclipse.emf.ecore.EObject;

import org.hl7.fhir.Resource;

import fhirrest.jaxb.UpdateRequestImplAdapter;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Update Request</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link fhirrest.UpdateRequest#getType <em>Type</em>}</li>
 *   <li>{@link fhirrest.UpdateRequest#getId <em>Id</em>}</li>
 *   <li>{@link fhirrest.UpdateRequest#get_format <em>format</em>}</li>
 *   <li>{@link fhirrest.UpdateRequest#getResource <em>Resource</em>}</li>
 * </ul>
 *
 * @see fhirrest.FhirrestPackage#getUpdateRequest()
 * @model
 * @generated
 */
@XmlJavaTypeAdapter(UpdateRequestImplAdapter.class)
public interface UpdateRequest extends EObject {
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
	 * @see fhirrest.FhirrestPackage#getUpdateRequest_Type()
	 * @model
	 * @generated
	 */
	String getType();

	/**
	 * Sets the value of the '{@link fhirrest.UpdateRequest#getType <em>Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Type</em>' attribute.
	 * @see #getType()
	 * @generated
	 */
	void setType(String value);

	/**
	 * Returns the value of the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Id</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Id</em>' attribute.
	 * @see #setId(String)
	 * @see fhirrest.FhirrestPackage#getUpdateRequest_Id()
	 * @model
	 * @generated
	 */
	String getId();

	/**
	 * Sets the value of the '{@link fhirrest.UpdateRequest#getId <em>Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Id</em>' attribute.
	 * @see #getId()
	 * @generated
	 */
	void setId(String value);

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
	 * @see fhirrest.FhirrestPackage#getUpdateRequest__format()
	 * @model
	 * @generated
	 */
	String get_format();

	/**
	 * Sets the value of the '{@link fhirrest.UpdateRequest#get_format <em>format</em>}' attribute.
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
	 * @see fhirrest.FhirrestPackage#getUpdateRequest_Resource()
	 * @model containment="true" required="true"
	 * @generated
	 */
	Resource getResource();

	/**
	 * Sets the value of the '{@link fhirrest.UpdateRequest#getResource <em>Resource</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Resource</em>' containment reference.
	 * @see #getResource()
	 * @generated
	 */
	void setResource(Resource value);

} // UpdateRequest
