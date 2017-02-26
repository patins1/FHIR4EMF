/**
 */
package fhirrest;

import org.eclipse.emf.ecore.EFactory;

/**
 * <!-- begin-user-doc -->
 * The <b>Factory</b> for the model.
 * It provides a create method for each non-abstract class of the model.
 * <!-- end-user-doc -->
 * @see fhirrest.FhirrestPackage
 * @generated
 */
public interface FhirrestFactory extends EFactory {
	/**
	 * The singleton instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	FhirrestFactory eINSTANCE = fhirrest.impl.FhirrestFactoryImpl.init();

	/**
	 * Returns a new object of class '<em>Read Request</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Read Request</em>'.
	 * @generated
	 */
	ReadRequest createReadRequest();

	/**
	 * Returns a new object of class '<em>Read Response</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Read Response</em>'.
	 * @generated
	 */
	ReadResponse createReadResponse();

	/**
	 * Returns a new object of class '<em>VRead Request</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>VRead Request</em>'.
	 * @generated
	 */
	VReadRequest createVReadRequest();

	/**
	 * Returns a new object of class '<em>VRead Response</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>VRead Response</em>'.
	 * @generated
	 */
	VReadResponse createVReadResponse();

	/**
	 * Returns a new object of class '<em>Update Request</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Update Request</em>'.
	 * @generated
	 */
	UpdateRequest createUpdateRequest();

	/**
	 * Returns a new object of class '<em>Update Response</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Update Response</em>'.
	 * @generated
	 */
	UpdateResponse createUpdateResponse();

	/**
	 * Returns a new object of class '<em>Delete Request</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Delete Request</em>'.
	 * @generated
	 */
	DeleteRequest createDeleteRequest();

	/**
	 * Returns a new object of class '<em>Delete Response</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Delete Response</em>'.
	 * @generated
	 */
	DeleteResponse createDeleteResponse();

	/**
	 * Returns a new object of class '<em>Create Request</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Create Request</em>'.
	 * @generated
	 */
	CreateRequest createCreateRequest();

	/**
	 * Returns a new object of class '<em>Create Response</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Create Response</em>'.
	 * @generated
	 */
	CreateResponse createCreateResponse();

	/**
	 * Returns a new object of class '<em>Search Request</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Search Request</em>'.
	 * @generated
	 */
	SearchRequest createSearchRequest();

	/**
	 * Returns a new object of class '<em>Search Response</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Search Response</em>'.
	 * @generated
	 */
	SearchResponse createSearchResponse();

	/**
	 * Returns a new object of class '<em>Error Response</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Error Response</em>'.
	 * @generated
	 */
	ErrorResponse createErrorResponse();

	/**
	 * Returns a new object of class '<em>Transform Request</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Transform Request</em>'.
	 * @generated
	 */
	TransformRequest createTransformRequest();

	/**
	 * Returns a new object of class '<em>Transform Response</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Transform Response</em>'.
	 * @generated
	 */
	TransformResponse createTransformResponse();

	/**
	 * Returns the package supported by this factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the package supported by this factory.
	 * @generated
	 */
	FhirrestPackage getFhirrestPackage();

} //FhirrestFactory
