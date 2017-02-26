/**
 */
package fhirrest.impl;

import fhirrest.*;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.impl.EFactoryImpl;

import org.eclipse.emf.ecore.plugin.EcorePlugin;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Factory</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class FhirrestFactoryImpl extends EFactoryImpl implements FhirrestFactory {
	/**
	 * Creates the default factory implementation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static FhirrestFactory init() {
		try {
			FhirrestFactory theFhirrestFactory = (FhirrestFactory)EPackage.Registry.INSTANCE.getEFactory(FhirrestPackage.eNS_URI);
			if (theFhirrestFactory != null) {
				return theFhirrestFactory;
			}
		}
		catch (Exception exception) {
			EcorePlugin.INSTANCE.log(exception);
		}
		return new FhirrestFactoryImpl();
	}

	/**
	 * Creates an instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public FhirrestFactoryImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EObject create(EClass eClass) {
		switch (eClass.getClassifierID()) {
			case FhirrestPackage.READ_REQUEST: return createReadRequest();
			case FhirrestPackage.READ_RESPONSE: return createReadResponse();
			case FhirrestPackage.VREAD_REQUEST: return createVReadRequest();
			case FhirrestPackage.VREAD_RESPONSE: return createVReadResponse();
			case FhirrestPackage.UPDATE_REQUEST: return createUpdateRequest();
			case FhirrestPackage.UPDATE_RESPONSE: return createUpdateResponse();
			case FhirrestPackage.DELETE_REQUEST: return createDeleteRequest();
			case FhirrestPackage.DELETE_RESPONSE: return createDeleteResponse();
			case FhirrestPackage.CREATE_REQUEST: return createCreateRequest();
			case FhirrestPackage.CREATE_RESPONSE: return createCreateResponse();
			case FhirrestPackage.SEARCH_REQUEST: return createSearchRequest();
			case FhirrestPackage.SEARCH_RESPONSE: return createSearchResponse();
			case FhirrestPackage.ERROR_RESPONSE: return createErrorResponse();
			case FhirrestPackage.TRANSFORM_REQUEST: return createTransformRequest();
			case FhirrestPackage.TRANSFORM_RESPONSE: return createTransformResponse();
			default:
				throw new IllegalArgumentException("The class '" + eClass.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ReadRequest createReadRequest() {
		ReadRequestImpl readRequest = new ReadRequestImpl();
		return readRequest;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ReadResponse createReadResponse() {
		ReadResponseImpl readResponse = new ReadResponseImpl();
		return readResponse;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public VReadRequest createVReadRequest() {
		VReadRequestImpl vReadRequest = new VReadRequestImpl();
		return vReadRequest;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public VReadResponse createVReadResponse() {
		VReadResponseImpl vReadResponse = new VReadResponseImpl();
		return vReadResponse;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public UpdateRequest createUpdateRequest() {
		UpdateRequestImpl updateRequest = new UpdateRequestImpl();
		return updateRequest;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public UpdateResponse createUpdateResponse() {
		UpdateResponseImpl updateResponse = new UpdateResponseImpl();
		return updateResponse;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DeleteRequest createDeleteRequest() {
		DeleteRequestImpl deleteRequest = new DeleteRequestImpl();
		return deleteRequest;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DeleteResponse createDeleteResponse() {
		DeleteResponseImpl deleteResponse = new DeleteResponseImpl();
		return deleteResponse;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CreateRequest createCreateRequest() {
		CreateRequestImpl createRequest = new CreateRequestImpl();
		return createRequest;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CreateResponse createCreateResponse() {
		CreateResponseImpl createResponse = new CreateResponseImpl();
		return createResponse;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SearchRequest createSearchRequest() {
		SearchRequestImpl searchRequest = new SearchRequestImpl();
		return searchRequest;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SearchResponse createSearchResponse() {
		SearchResponseImpl searchResponse = new SearchResponseImpl();
		return searchResponse;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ErrorResponse createErrorResponse() {
		ErrorResponseImpl errorResponse = new ErrorResponseImpl();
		return errorResponse;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TransformRequest createTransformRequest() {
		TransformRequestImpl transformRequest = new TransformRequestImpl();
		return transformRequest;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TransformResponse createTransformResponse() {
		TransformResponseImpl transformResponse = new TransformResponseImpl();
		return transformResponse;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public FhirrestPackage getFhirrestPackage() {
		return (FhirrestPackage)getEPackage();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @deprecated
	 * @generated
	 */
	@Deprecated
	public static FhirrestPackage getPackage() {
		return FhirrestPackage.eINSTANCE;
	}

} //FhirrestFactoryImpl
