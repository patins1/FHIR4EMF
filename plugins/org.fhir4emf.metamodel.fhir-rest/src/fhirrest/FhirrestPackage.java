/**
 */
package fhirrest;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

/**
 * <!-- begin-user-doc -->
 * The <b>Package</b> for the model.
 * It contains accessors for the meta objects to represent
 * <ul>
 *   <li>each class,</li>
 *   <li>each feature of each class,</li>
 *   <li>each operation of each class,</li>
 *   <li>each enum,</li>
 *   <li>and each data type</li>
 * </ul>
 * <!-- end-user-doc -->
 * @see fhirrest.FhirrestFactory
 * @model kind="package"
 * @generated
 */
public interface FhirrestPackage extends EPackage {
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "fhirrest";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "http://hl7.org/fhir-rest";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "fhirrest";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	FhirrestPackage eINSTANCE = fhirrest.impl.FhirrestPackageImpl.init();

	/**
	 * The meta object id for the '{@link fhirrest.impl.ReadRequestImpl <em>Read Request</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see fhirrest.impl.ReadRequestImpl
	 * @see fhirrest.impl.FhirrestPackageImpl#getReadRequest()
	 * @generated
	 */
	int READ_REQUEST = 0;

	/**
	 * The feature id for the '<em><b>Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int READ_REQUEST__TYPE = 0;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int READ_REQUEST__ID = 1;

	/**
	 * The feature id for the '<em><b>format</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int READ_REQUEST__FORMAT = 2;

	/**
	 * The number of structural features of the '<em>Read Request</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int READ_REQUEST_FEATURE_COUNT = 3;

	/**
	 * The number of operations of the '<em>Read Request</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int READ_REQUEST_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link fhirrest.impl.ReadResponseImpl <em>Read Response</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see fhirrest.impl.ReadResponseImpl
	 * @see fhirrest.impl.FhirrestPackageImpl#getReadResponse()
	 * @generated
	 */
	int READ_RESPONSE = 1;

	/**
	 * The feature id for the '<em><b>Content</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int READ_RESPONSE__CONTENT = 0;

	/**
	 * The number of structural features of the '<em>Read Response</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int READ_RESPONSE_FEATURE_COUNT = 1;

	/**
	 * The number of operations of the '<em>Read Response</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int READ_RESPONSE_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link fhirrest.impl.VReadRequestImpl <em>VRead Request</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see fhirrest.impl.VReadRequestImpl
	 * @see fhirrest.impl.FhirrestPackageImpl#getVReadRequest()
	 * @generated
	 */
	int VREAD_REQUEST = 2;

	/**
	 * The feature id for the '<em><b>Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VREAD_REQUEST__TYPE = READ_REQUEST__TYPE;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VREAD_REQUEST__ID = READ_REQUEST__ID;

	/**
	 * The feature id for the '<em><b>format</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VREAD_REQUEST__FORMAT = READ_REQUEST__FORMAT;

	/**
	 * The feature id for the '<em><b>Vid</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VREAD_REQUEST__VID = READ_REQUEST_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>VRead Request</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VREAD_REQUEST_FEATURE_COUNT = READ_REQUEST_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>VRead Request</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VREAD_REQUEST_OPERATION_COUNT = READ_REQUEST_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link fhirrest.impl.VReadResponseImpl <em>VRead Response</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see fhirrest.impl.VReadResponseImpl
	 * @see fhirrest.impl.FhirrestPackageImpl#getVReadResponse()
	 * @generated
	 */
	int VREAD_RESPONSE = 3;

	/**
	 * The feature id for the '<em><b>Content</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VREAD_RESPONSE__CONTENT = READ_RESPONSE__CONTENT;

	/**
	 * The number of structural features of the '<em>VRead Response</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VREAD_RESPONSE_FEATURE_COUNT = READ_RESPONSE_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>VRead Response</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VREAD_RESPONSE_OPERATION_COUNT = READ_RESPONSE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link fhirrest.impl.UpdateRequestImpl <em>Update Request</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see fhirrest.impl.UpdateRequestImpl
	 * @see fhirrest.impl.FhirrestPackageImpl#getUpdateRequest()
	 * @generated
	 */
	int UPDATE_REQUEST = 4;

	/**
	 * The feature id for the '<em><b>Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UPDATE_REQUEST__TYPE = 0;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UPDATE_REQUEST__ID = 1;

	/**
	 * The feature id for the '<em><b>format</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UPDATE_REQUEST__FORMAT = 2;

	/**
	 * The feature id for the '<em><b>Resource</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UPDATE_REQUEST__RESOURCE = 3;

	/**
	 * The number of structural features of the '<em>Update Request</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UPDATE_REQUEST_FEATURE_COUNT = 4;

	/**
	 * The number of operations of the '<em>Update Request</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UPDATE_REQUEST_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link fhirrest.impl.UpdateResponseImpl <em>Update Response</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see fhirrest.impl.UpdateResponseImpl
	 * @see fhirrest.impl.FhirrestPackageImpl#getUpdateResponse()
	 * @generated
	 */
	int UPDATE_RESPONSE = 5;

	/**
	 * The number of structural features of the '<em>Update Response</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UPDATE_RESPONSE_FEATURE_COUNT = 0;

	/**
	 * The number of operations of the '<em>Update Response</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UPDATE_RESPONSE_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link fhirrest.impl.DeleteRequestImpl <em>Delete Request</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see fhirrest.impl.DeleteRequestImpl
	 * @see fhirrest.impl.FhirrestPackageImpl#getDeleteRequest()
	 * @generated
	 */
	int DELETE_REQUEST = 6;

	/**
	 * The feature id for the '<em><b>Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DELETE_REQUEST__TYPE = 0;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DELETE_REQUEST__ID = 1;

	/**
	 * The number of structural features of the '<em>Delete Request</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DELETE_REQUEST_FEATURE_COUNT = 2;

	/**
	 * The number of operations of the '<em>Delete Request</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DELETE_REQUEST_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link fhirrest.impl.DeleteResponseImpl <em>Delete Response</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see fhirrest.impl.DeleteResponseImpl
	 * @see fhirrest.impl.FhirrestPackageImpl#getDeleteResponse()
	 * @generated
	 */
	int DELETE_RESPONSE = 7;

	/**
	 * The number of structural features of the '<em>Delete Response</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DELETE_RESPONSE_FEATURE_COUNT = 0;

	/**
	 * The number of operations of the '<em>Delete Response</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DELETE_RESPONSE_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link fhirrest.impl.CreateRequestImpl <em>Create Request</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see fhirrest.impl.CreateRequestImpl
	 * @see fhirrest.impl.FhirrestPackageImpl#getCreateRequest()
	 * @generated
	 */
	int CREATE_REQUEST = 8;

	/**
	 * The feature id for the '<em><b>Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CREATE_REQUEST__TYPE = 0;

	/**
	 * The feature id for the '<em><b>format</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CREATE_REQUEST__FORMAT = 1;

	/**
	 * The feature id for the '<em><b>Resource</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CREATE_REQUEST__RESOURCE = 2;

	/**
	 * The number of structural features of the '<em>Create Request</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CREATE_REQUEST_FEATURE_COUNT = 3;

	/**
	 * The number of operations of the '<em>Create Request</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CREATE_REQUEST_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link fhirrest.impl.CreateResponseImpl <em>Create Response</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see fhirrest.impl.CreateResponseImpl
	 * @see fhirrest.impl.FhirrestPackageImpl#getCreateResponse()
	 * @generated
	 */
	int CREATE_RESPONSE = 9;

	/**
	 * The number of structural features of the '<em>Create Response</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CREATE_RESPONSE_FEATURE_COUNT = 0;

	/**
	 * The number of operations of the '<em>Create Response</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CREATE_RESPONSE_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link fhirrest.impl.SearchRequestImpl <em>Search Request</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see fhirrest.impl.SearchRequestImpl
	 * @see fhirrest.impl.FhirrestPackageImpl#getSearchRequest()
	 * @generated
	 */
	int SEARCH_REQUEST = 10;

	/**
	 * The feature id for the '<em><b>type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SEARCH_REQUEST__TYPE = 0;

	/**
	 * The number of structural features of the '<em>Search Request</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SEARCH_REQUEST_FEATURE_COUNT = 1;

	/**
	 * The number of operations of the '<em>Search Request</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SEARCH_REQUEST_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link fhirrest.impl.SearchResponseImpl <em>Search Response</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see fhirrest.impl.SearchResponseImpl
	 * @see fhirrest.impl.FhirrestPackageImpl#getSearchResponse()
	 * @generated
	 */
	int SEARCH_RESPONSE = 11;

	/**
	 * The feature id for the '<em><b>Result</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SEARCH_RESPONSE__RESULT = 0;

	/**
	 * The number of structural features of the '<em>Search Response</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SEARCH_RESPONSE_FEATURE_COUNT = 1;

	/**
	 * The number of operations of the '<em>Search Response</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SEARCH_RESPONSE_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link fhirrest.impl.ErrorResponseImpl <em>Error Response</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see fhirrest.impl.ErrorResponseImpl
	 * @see fhirrest.impl.FhirrestPackageImpl#getErrorResponse()
	 * @generated
	 */
	int ERROR_RESPONSE = 12;

	/**
	 * The feature id for the '<em><b>Error Message</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ERROR_RESPONSE__ERROR_MESSAGE = 0;

	/**
	 * The number of structural features of the '<em>Error Response</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ERROR_RESPONSE_FEATURE_COUNT = 1;

	/**
	 * The number of operations of the '<em>Error Response</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ERROR_RESPONSE_OPERATION_COUNT = 0;


	/**
	 * The meta object id for the '{@link fhirrest.impl.TransformRequestImpl <em>Transform Request</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see fhirrest.impl.TransformRequestImpl
	 * @see fhirrest.impl.FhirrestPackageImpl#getTransformRequest()
	 * @generated
	 */
	int TRANSFORM_REQUEST = 13;

	/**
	 * The feature id for the '<em><b>Input Format</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRANSFORM_REQUEST__INPUT_FORMAT = 0;

	/**
	 * The feature id for the '<em><b>Content</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRANSFORM_REQUEST__CONTENT = 1;

	/**
	 * The feature id for the '<em><b>Output Format</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRANSFORM_REQUEST__OUTPUT_FORMAT = 2;

	/**
	 * The number of structural features of the '<em>Transform Request</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRANSFORM_REQUEST_FEATURE_COUNT = 3;

	/**
	 * The number of operations of the '<em>Transform Request</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRANSFORM_REQUEST_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link fhirrest.impl.TransformResponseImpl <em>Transform Response</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see fhirrest.impl.TransformResponseImpl
	 * @see fhirrest.impl.FhirrestPackageImpl#getTransformResponse()
	 * @generated
	 */
	int TRANSFORM_RESPONSE = 14;

	/**
	 * The feature id for the '<em><b>Content</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRANSFORM_RESPONSE__CONTENT = 0;

	/**
	 * The number of structural features of the '<em>Transform Response</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRANSFORM_RESPONSE_FEATURE_COUNT = 1;

	/**
	 * The number of operations of the '<em>Transform Response</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRANSFORM_RESPONSE_OPERATION_COUNT = 0;


	/**
	 * Returns the meta object for class '{@link fhirrest.ReadRequest <em>Read Request</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Read Request</em>'.
	 * @see fhirrest.ReadRequest
	 * @generated
	 */
	EClass getReadRequest();

	/**
	 * Returns the meta object for the attribute '{@link fhirrest.ReadRequest#getType <em>Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Type</em>'.
	 * @see fhirrest.ReadRequest#getType()
	 * @see #getReadRequest()
	 * @generated
	 */
	EAttribute getReadRequest_Type();

	/**
	 * Returns the meta object for the attribute '{@link fhirrest.ReadRequest#getId <em>Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Id</em>'.
	 * @see fhirrest.ReadRequest#getId()
	 * @see #getReadRequest()
	 * @generated
	 */
	EAttribute getReadRequest_Id();

	/**
	 * Returns the meta object for the attribute '{@link fhirrest.ReadRequest#get_format <em>format</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>format</em>'.
	 * @see fhirrest.ReadRequest#get_format()
	 * @see #getReadRequest()
	 * @generated
	 */
	EAttribute getReadRequest__format();

	/**
	 * Returns the meta object for class '{@link fhirrest.ReadResponse <em>Read Response</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Read Response</em>'.
	 * @see fhirrest.ReadResponse
	 * @generated
	 */
	EClass getReadResponse();

	/**
	 * Returns the meta object for the attribute '{@link fhirrest.ReadResponse#getContent <em>Content</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Content</em>'.
	 * @see fhirrest.ReadResponse#getContent()
	 * @see #getReadResponse()
	 * @generated
	 */
	EAttribute getReadResponse_Content();

	/**
	 * Returns the meta object for class '{@link fhirrest.VReadRequest <em>VRead Request</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>VRead Request</em>'.
	 * @see fhirrest.VReadRequest
	 * @generated
	 */
	EClass getVReadRequest();

	/**
	 * Returns the meta object for the attribute '{@link fhirrest.VReadRequest#getVid <em>Vid</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Vid</em>'.
	 * @see fhirrest.VReadRequest#getVid()
	 * @see #getVReadRequest()
	 * @generated
	 */
	EAttribute getVReadRequest_Vid();

	/**
	 * Returns the meta object for class '{@link fhirrest.VReadResponse <em>VRead Response</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>VRead Response</em>'.
	 * @see fhirrest.VReadResponse
	 * @generated
	 */
	EClass getVReadResponse();

	/**
	 * Returns the meta object for class '{@link fhirrest.UpdateRequest <em>Update Request</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Update Request</em>'.
	 * @see fhirrest.UpdateRequest
	 * @generated
	 */
	EClass getUpdateRequest();

	/**
	 * Returns the meta object for the attribute '{@link fhirrest.UpdateRequest#getType <em>Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Type</em>'.
	 * @see fhirrest.UpdateRequest#getType()
	 * @see #getUpdateRequest()
	 * @generated
	 */
	EAttribute getUpdateRequest_Type();

	/**
	 * Returns the meta object for the attribute '{@link fhirrest.UpdateRequest#getId <em>Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Id</em>'.
	 * @see fhirrest.UpdateRequest#getId()
	 * @see #getUpdateRequest()
	 * @generated
	 */
	EAttribute getUpdateRequest_Id();

	/**
	 * Returns the meta object for the attribute '{@link fhirrest.UpdateRequest#get_format <em>format</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>format</em>'.
	 * @see fhirrest.UpdateRequest#get_format()
	 * @see #getUpdateRequest()
	 * @generated
	 */
	EAttribute getUpdateRequest__format();

	/**
	 * Returns the meta object for the containment reference '{@link fhirrest.UpdateRequest#getResource <em>Resource</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Resource</em>'.
	 * @see fhirrest.UpdateRequest#getResource()
	 * @see #getUpdateRequest()
	 * @generated
	 */
	EReference getUpdateRequest_Resource();

	/**
	 * Returns the meta object for class '{@link fhirrest.UpdateResponse <em>Update Response</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Update Response</em>'.
	 * @see fhirrest.UpdateResponse
	 * @generated
	 */
	EClass getUpdateResponse();

	/**
	 * Returns the meta object for class '{@link fhirrest.DeleteRequest <em>Delete Request</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Delete Request</em>'.
	 * @see fhirrest.DeleteRequest
	 * @generated
	 */
	EClass getDeleteRequest();

	/**
	 * Returns the meta object for the attribute '{@link fhirrest.DeleteRequest#getType <em>Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Type</em>'.
	 * @see fhirrest.DeleteRequest#getType()
	 * @see #getDeleteRequest()
	 * @generated
	 */
	EAttribute getDeleteRequest_Type();

	/**
	 * Returns the meta object for the attribute '{@link fhirrest.DeleteRequest#getId <em>Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Id</em>'.
	 * @see fhirrest.DeleteRequest#getId()
	 * @see #getDeleteRequest()
	 * @generated
	 */
	EAttribute getDeleteRequest_Id();

	/**
	 * Returns the meta object for class '{@link fhirrest.DeleteResponse <em>Delete Response</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Delete Response</em>'.
	 * @see fhirrest.DeleteResponse
	 * @generated
	 */
	EClass getDeleteResponse();

	/**
	 * Returns the meta object for class '{@link fhirrest.CreateRequest <em>Create Request</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Create Request</em>'.
	 * @see fhirrest.CreateRequest
	 * @generated
	 */
	EClass getCreateRequest();

	/**
	 * Returns the meta object for the attribute '{@link fhirrest.CreateRequest#getType <em>Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Type</em>'.
	 * @see fhirrest.CreateRequest#getType()
	 * @see #getCreateRequest()
	 * @generated
	 */
	EAttribute getCreateRequest_Type();

	/**
	 * Returns the meta object for the attribute '{@link fhirrest.CreateRequest#get_format <em>format</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>format</em>'.
	 * @see fhirrest.CreateRequest#get_format()
	 * @see #getCreateRequest()
	 * @generated
	 */
	EAttribute getCreateRequest__format();

	/**
	 * Returns the meta object for the containment reference '{@link fhirrest.CreateRequest#getResource <em>Resource</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Resource</em>'.
	 * @see fhirrest.CreateRequest#getResource()
	 * @see #getCreateRequest()
	 * @generated
	 */
	EReference getCreateRequest_Resource();

	/**
	 * Returns the meta object for class '{@link fhirrest.CreateResponse <em>Create Response</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Create Response</em>'.
	 * @see fhirrest.CreateResponse
	 * @generated
	 */
	EClass getCreateResponse();

	/**
	 * Returns the meta object for class '{@link fhirrest.SearchRequest <em>Search Request</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Search Request</em>'.
	 * @see fhirrest.SearchRequest
	 * @generated
	 */
	EClass getSearchRequest();

	/**
	 * Returns the meta object for the attribute '{@link fhirrest.SearchRequest#get_type <em>type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>type</em>'.
	 * @see fhirrest.SearchRequest#get_type()
	 * @see #getSearchRequest()
	 * @generated
	 */
	EAttribute getSearchRequest__type();

	/**
	 * Returns the meta object for class '{@link fhirrest.SearchResponse <em>Search Response</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Search Response</em>'.
	 * @see fhirrest.SearchResponse
	 * @generated
	 */
	EClass getSearchResponse();

	/**
	 * Returns the meta object for the containment reference '{@link fhirrest.SearchResponse#getResult <em>Result</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Result</em>'.
	 * @see fhirrest.SearchResponse#getResult()
	 * @see #getSearchResponse()
	 * @generated
	 */
	EReference getSearchResponse_Result();

	/**
	 * Returns the meta object for class '{@link fhirrest.ErrorResponse <em>Error Response</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Error Response</em>'.
	 * @see fhirrest.ErrorResponse
	 * @generated
	 */
	EClass getErrorResponse();

	/**
	 * Returns the meta object for the attribute '{@link fhirrest.ErrorResponse#getErrorMessage <em>Error Message</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Error Message</em>'.
	 * @see fhirrest.ErrorResponse#getErrorMessage()
	 * @see #getErrorResponse()
	 * @generated
	 */
	EAttribute getErrorResponse_ErrorMessage();

	/**
	 * Returns the meta object for class '{@link fhirrest.TransformRequest <em>Transform Request</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Transform Request</em>'.
	 * @see fhirrest.TransformRequest
	 * @generated
	 */
	EClass getTransformRequest();

	/**
	 * Returns the meta object for the attribute '{@link fhirrest.TransformRequest#getInputFormat <em>Input Format</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Input Format</em>'.
	 * @see fhirrest.TransformRequest#getInputFormat()
	 * @see #getTransformRequest()
	 * @generated
	 */
	EAttribute getTransformRequest_InputFormat();

	/**
	 * Returns the meta object for the attribute '{@link fhirrest.TransformRequest#getContent <em>Content</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Content</em>'.
	 * @see fhirrest.TransformRequest#getContent()
	 * @see #getTransformRequest()
	 * @generated
	 */
	EAttribute getTransformRequest_Content();

	/**
	 * Returns the meta object for the attribute '{@link fhirrest.TransformRequest#getOutputFormat <em>Output Format</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Output Format</em>'.
	 * @see fhirrest.TransformRequest#getOutputFormat()
	 * @see #getTransformRequest()
	 * @generated
	 */
	EAttribute getTransformRequest_OutputFormat();

	/**
	 * Returns the meta object for class '{@link fhirrest.TransformResponse <em>Transform Response</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Transform Response</em>'.
	 * @see fhirrest.TransformResponse
	 * @generated
	 */
	EClass getTransformResponse();

	/**
	 * Returns the meta object for the attribute '{@link fhirrest.TransformResponse#getContent <em>Content</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Content</em>'.
	 * @see fhirrest.TransformResponse#getContent()
	 * @see #getTransformResponse()
	 * @generated
	 */
	EAttribute getTransformResponse_Content();

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	FhirrestFactory getFhirrestFactory();

	/**
	 * <!-- begin-user-doc -->
	 * Defines literals for the meta objects that represent
	 * <ul>
	 *   <li>each class,</li>
	 *   <li>each feature of each class,</li>
	 *   <li>each operation of each class,</li>
	 *   <li>each enum,</li>
	 *   <li>and each data type</li>
	 * </ul>
	 * <!-- end-user-doc -->
	 * @generated
	 */
	interface Literals {
		/**
		 * The meta object literal for the '{@link fhirrest.impl.ReadRequestImpl <em>Read Request</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see fhirrest.impl.ReadRequestImpl
		 * @see fhirrest.impl.FhirrestPackageImpl#getReadRequest()
		 * @generated
		 */
		EClass READ_REQUEST = eINSTANCE.getReadRequest();

		/**
		 * The meta object literal for the '<em><b>Type</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute READ_REQUEST__TYPE = eINSTANCE.getReadRequest_Type();

		/**
		 * The meta object literal for the '<em><b>Id</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute READ_REQUEST__ID = eINSTANCE.getReadRequest_Id();

		/**
		 * The meta object literal for the '<em><b>format</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute READ_REQUEST__FORMAT = eINSTANCE.getReadRequest__format();

		/**
		 * The meta object literal for the '{@link fhirrest.impl.ReadResponseImpl <em>Read Response</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see fhirrest.impl.ReadResponseImpl
		 * @see fhirrest.impl.FhirrestPackageImpl#getReadResponse()
		 * @generated
		 */
		EClass READ_RESPONSE = eINSTANCE.getReadResponse();

		/**
		 * The meta object literal for the '<em><b>Content</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute READ_RESPONSE__CONTENT = eINSTANCE.getReadResponse_Content();

		/**
		 * The meta object literal for the '{@link fhirrest.impl.VReadRequestImpl <em>VRead Request</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see fhirrest.impl.VReadRequestImpl
		 * @see fhirrest.impl.FhirrestPackageImpl#getVReadRequest()
		 * @generated
		 */
		EClass VREAD_REQUEST = eINSTANCE.getVReadRequest();

		/**
		 * The meta object literal for the '<em><b>Vid</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute VREAD_REQUEST__VID = eINSTANCE.getVReadRequest_Vid();

		/**
		 * The meta object literal for the '{@link fhirrest.impl.VReadResponseImpl <em>VRead Response</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see fhirrest.impl.VReadResponseImpl
		 * @see fhirrest.impl.FhirrestPackageImpl#getVReadResponse()
		 * @generated
		 */
		EClass VREAD_RESPONSE = eINSTANCE.getVReadResponse();

		/**
		 * The meta object literal for the '{@link fhirrest.impl.UpdateRequestImpl <em>Update Request</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see fhirrest.impl.UpdateRequestImpl
		 * @see fhirrest.impl.FhirrestPackageImpl#getUpdateRequest()
		 * @generated
		 */
		EClass UPDATE_REQUEST = eINSTANCE.getUpdateRequest();

		/**
		 * The meta object literal for the '<em><b>Type</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute UPDATE_REQUEST__TYPE = eINSTANCE.getUpdateRequest_Type();

		/**
		 * The meta object literal for the '<em><b>Id</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute UPDATE_REQUEST__ID = eINSTANCE.getUpdateRequest_Id();

		/**
		 * The meta object literal for the '<em><b>format</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute UPDATE_REQUEST__FORMAT = eINSTANCE.getUpdateRequest__format();

		/**
		 * The meta object literal for the '<em><b>Resource</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference UPDATE_REQUEST__RESOURCE = eINSTANCE.getUpdateRequest_Resource();

		/**
		 * The meta object literal for the '{@link fhirrest.impl.UpdateResponseImpl <em>Update Response</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see fhirrest.impl.UpdateResponseImpl
		 * @see fhirrest.impl.FhirrestPackageImpl#getUpdateResponse()
		 * @generated
		 */
		EClass UPDATE_RESPONSE = eINSTANCE.getUpdateResponse();

		/**
		 * The meta object literal for the '{@link fhirrest.impl.DeleteRequestImpl <em>Delete Request</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see fhirrest.impl.DeleteRequestImpl
		 * @see fhirrest.impl.FhirrestPackageImpl#getDeleteRequest()
		 * @generated
		 */
		EClass DELETE_REQUEST = eINSTANCE.getDeleteRequest();

		/**
		 * The meta object literal for the '<em><b>Type</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DELETE_REQUEST__TYPE = eINSTANCE.getDeleteRequest_Type();

		/**
		 * The meta object literal for the '<em><b>Id</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DELETE_REQUEST__ID = eINSTANCE.getDeleteRequest_Id();

		/**
		 * The meta object literal for the '{@link fhirrest.impl.DeleteResponseImpl <em>Delete Response</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see fhirrest.impl.DeleteResponseImpl
		 * @see fhirrest.impl.FhirrestPackageImpl#getDeleteResponse()
		 * @generated
		 */
		EClass DELETE_RESPONSE = eINSTANCE.getDeleteResponse();

		/**
		 * The meta object literal for the '{@link fhirrest.impl.CreateRequestImpl <em>Create Request</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see fhirrest.impl.CreateRequestImpl
		 * @see fhirrest.impl.FhirrestPackageImpl#getCreateRequest()
		 * @generated
		 */
		EClass CREATE_REQUEST = eINSTANCE.getCreateRequest();

		/**
		 * The meta object literal for the '<em><b>Type</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CREATE_REQUEST__TYPE = eINSTANCE.getCreateRequest_Type();

		/**
		 * The meta object literal for the '<em><b>format</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CREATE_REQUEST__FORMAT = eINSTANCE.getCreateRequest__format();

		/**
		 * The meta object literal for the '<em><b>Resource</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CREATE_REQUEST__RESOURCE = eINSTANCE.getCreateRequest_Resource();

		/**
		 * The meta object literal for the '{@link fhirrest.impl.CreateResponseImpl <em>Create Response</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see fhirrest.impl.CreateResponseImpl
		 * @see fhirrest.impl.FhirrestPackageImpl#getCreateResponse()
		 * @generated
		 */
		EClass CREATE_RESPONSE = eINSTANCE.getCreateResponse();

		/**
		 * The meta object literal for the '{@link fhirrest.impl.SearchRequestImpl <em>Search Request</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see fhirrest.impl.SearchRequestImpl
		 * @see fhirrest.impl.FhirrestPackageImpl#getSearchRequest()
		 * @generated
		 */
		EClass SEARCH_REQUEST = eINSTANCE.getSearchRequest();

		/**
		 * The meta object literal for the '<em><b>type</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SEARCH_REQUEST__TYPE = eINSTANCE.getSearchRequest__type();

		/**
		 * The meta object literal for the '{@link fhirrest.impl.SearchResponseImpl <em>Search Response</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see fhirrest.impl.SearchResponseImpl
		 * @see fhirrest.impl.FhirrestPackageImpl#getSearchResponse()
		 * @generated
		 */
		EClass SEARCH_RESPONSE = eINSTANCE.getSearchResponse();

		/**
		 * The meta object literal for the '<em><b>Result</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SEARCH_RESPONSE__RESULT = eINSTANCE.getSearchResponse_Result();

		/**
		 * The meta object literal for the '{@link fhirrest.impl.ErrorResponseImpl <em>Error Response</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see fhirrest.impl.ErrorResponseImpl
		 * @see fhirrest.impl.FhirrestPackageImpl#getErrorResponse()
		 * @generated
		 */
		EClass ERROR_RESPONSE = eINSTANCE.getErrorResponse();

		/**
		 * The meta object literal for the '<em><b>Error Message</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ERROR_RESPONSE__ERROR_MESSAGE = eINSTANCE.getErrorResponse_ErrorMessage();

		/**
		 * The meta object literal for the '{@link fhirrest.impl.TransformRequestImpl <em>Transform Request</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see fhirrest.impl.TransformRequestImpl
		 * @see fhirrest.impl.FhirrestPackageImpl#getTransformRequest()
		 * @generated
		 */
		EClass TRANSFORM_REQUEST = eINSTANCE.getTransformRequest();

		/**
		 * The meta object literal for the '<em><b>Input Format</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TRANSFORM_REQUEST__INPUT_FORMAT = eINSTANCE.getTransformRequest_InputFormat();

		/**
		 * The meta object literal for the '<em><b>Content</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TRANSFORM_REQUEST__CONTENT = eINSTANCE.getTransformRequest_Content();

		/**
		 * The meta object literal for the '<em><b>Output Format</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TRANSFORM_REQUEST__OUTPUT_FORMAT = eINSTANCE.getTransformRequest_OutputFormat();

		/**
		 * The meta object literal for the '{@link fhirrest.impl.TransformResponseImpl <em>Transform Response</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see fhirrest.impl.TransformResponseImpl
		 * @see fhirrest.impl.FhirrestPackageImpl#getTransformResponse()
		 * @generated
		 */
		EClass TRANSFORM_RESPONSE = eINSTANCE.getTransformResponse();

		/**
		 * The meta object literal for the '<em><b>Content</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TRANSFORM_RESPONSE__CONTENT = eINSTANCE.getTransformResponse_Content();

	}

} //FhirrestPackage
