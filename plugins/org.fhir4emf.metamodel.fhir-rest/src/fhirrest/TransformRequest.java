/**
 */
package fhirrest;

import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;

import org.eclipse.emf.ecore.EObject;

import fhirrest.jaxb.TransformRequestImplAdapter;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Transform Request</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link fhirrest.TransformRequest#getInputFormat <em>Input Format</em>}</li>
 *   <li>{@link fhirrest.TransformRequest#getContent <em>Content</em>}</li>
 *   <li>{@link fhirrest.TransformRequest#getOutputFormat <em>Output Format</em>}</li>
 * </ul>
 *
 * @see fhirrest.FhirrestPackage#getTransformRequest()
 * @model
 * @generated
 */
@XmlJavaTypeAdapter(TransformRequestImplAdapter.class)
public interface TransformRequest extends EObject {
	/**
	 * Returns the value of the '<em><b>Input Format</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Input Format</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Input Format</em>' attribute.
	 * @see #setInputFormat(String)
	 * @see fhirrest.FhirrestPackage#getTransformRequest_InputFormat()
	 * @model
	 * @generated
	 */
	String getInputFormat();

	/**
	 * Sets the value of the '{@link fhirrest.TransformRequest#getInputFormat <em>Input Format</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Input Format</em>' attribute.
	 * @see #getInputFormat()
	 * @generated
	 */
	void setInputFormat(String value);

	/**
	 * Returns the value of the '<em><b>Content</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Content</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Content</em>' attribute.
	 * @see #setContent(String)
	 * @see fhirrest.FhirrestPackage#getTransformRequest_Content()
	 * @model
	 * @generated
	 */
	String getContent();

	/**
	 * Sets the value of the '{@link fhirrest.TransformRequest#getContent <em>Content</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Content</em>' attribute.
	 * @see #getContent()
	 * @generated
	 */
	void setContent(String value);

	/**
	 * Returns the value of the '<em><b>Output Format</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Output Format</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Output Format</em>' attribute.
	 * @see #setOutputFormat(String)
	 * @see fhirrest.FhirrestPackage#getTransformRequest_OutputFormat()
	 * @model
	 * @generated
	 */
	String getOutputFormat();

	/**
	 * Sets the value of the '{@link fhirrest.TransformRequest#getOutputFormat <em>Output Format</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Output Format</em>' attribute.
	 * @see #getOutputFormat()
	 * @generated
	 */
	void setOutputFormat(String value);

} // TransformRequest
