/**
 */
package fhirrest.util;

import fhirrest.*;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.util.Switch;

/**
 * <!-- begin-user-doc -->
 * The <b>Switch</b> for the model's inheritance hierarchy.
 * It supports the call {@link #doSwitch(EObject) doSwitch(object)}
 * to invoke the <code>caseXXX</code> method for each class of the model,
 * starting with the actual class of the object
 * and proceeding up the inheritance hierarchy
 * until a non-null result is returned,
 * which is the result of the switch.
 * <!-- end-user-doc -->
 * @see fhirrest.FhirrestPackage
 * @generated
 */
public class FhirrestSwitch<T> extends Switch<T> {
	/**
	 * The cached model package
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static FhirrestPackage modelPackage;

	/**
	 * Creates an instance of the switch.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public FhirrestSwitch() {
		if (modelPackage == null) {
			modelPackage = FhirrestPackage.eINSTANCE;
		}
	}

	/**
	 * Checks whether this is a switch for the given package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param ePackage the package in question.
	 * @return whether this is a switch for the given package.
	 * @generated
	 */
	@Override
	protected boolean isSwitchFor(EPackage ePackage) {
		return ePackage == modelPackage;
	}

	/**
	 * Calls <code>caseXXX</code> for each class of the model until one returns a non null result; it yields that result.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the first non-null result returned by a <code>caseXXX</code> call.
	 * @generated
	 */
	@Override
	protected T doSwitch(int classifierID, EObject theEObject) {
		switch (classifierID) {
			case FhirrestPackage.READ_REQUEST: {
				ReadRequest readRequest = (ReadRequest)theEObject;
				T result = caseReadRequest(readRequest);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case FhirrestPackage.READ_RESPONSE: {
				ReadResponse readResponse = (ReadResponse)theEObject;
				T result = caseReadResponse(readResponse);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case FhirrestPackage.VREAD_REQUEST: {
				VReadRequest vReadRequest = (VReadRequest)theEObject;
				T result = caseVReadRequest(vReadRequest);
				if (result == null) result = caseReadRequest(vReadRequest);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case FhirrestPackage.VREAD_RESPONSE: {
				VReadResponse vReadResponse = (VReadResponse)theEObject;
				T result = caseVReadResponse(vReadResponse);
				if (result == null) result = caseReadResponse(vReadResponse);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case FhirrestPackage.UPDATE_REQUEST: {
				UpdateRequest updateRequest = (UpdateRequest)theEObject;
				T result = caseUpdateRequest(updateRequest);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case FhirrestPackage.UPDATE_RESPONSE: {
				UpdateResponse updateResponse = (UpdateResponse)theEObject;
				T result = caseUpdateResponse(updateResponse);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case FhirrestPackage.DELETE_REQUEST: {
				DeleteRequest deleteRequest = (DeleteRequest)theEObject;
				T result = caseDeleteRequest(deleteRequest);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case FhirrestPackage.DELETE_RESPONSE: {
				DeleteResponse deleteResponse = (DeleteResponse)theEObject;
				T result = caseDeleteResponse(deleteResponse);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case FhirrestPackage.CREATE_REQUEST: {
				CreateRequest createRequest = (CreateRequest)theEObject;
				T result = caseCreateRequest(createRequest);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case FhirrestPackage.CREATE_RESPONSE: {
				CreateResponse createResponse = (CreateResponse)theEObject;
				T result = caseCreateResponse(createResponse);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case FhirrestPackage.SEARCH_REQUEST: {
				SearchRequest searchRequest = (SearchRequest)theEObject;
				T result = caseSearchRequest(searchRequest);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case FhirrestPackage.SEARCH_RESPONSE: {
				SearchResponse searchResponse = (SearchResponse)theEObject;
				T result = caseSearchResponse(searchResponse);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case FhirrestPackage.ERROR_RESPONSE: {
				ErrorResponse errorResponse = (ErrorResponse)theEObject;
				T result = caseErrorResponse(errorResponse);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case FhirrestPackage.TRANSFORM_REQUEST: {
				TransformRequest transformRequest = (TransformRequest)theEObject;
				T result = caseTransformRequest(transformRequest);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case FhirrestPackage.TRANSFORM_RESPONSE: {
				TransformResponse transformResponse = (TransformResponse)theEObject;
				T result = caseTransformResponse(transformResponse);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			default: return defaultCase(theEObject);
		}
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Read Request</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Read Request</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseReadRequest(ReadRequest object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Read Response</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Read Response</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseReadResponse(ReadResponse object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>VRead Request</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>VRead Request</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseVReadRequest(VReadRequest object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>VRead Response</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>VRead Response</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseVReadResponse(VReadResponse object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Update Request</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Update Request</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseUpdateRequest(UpdateRequest object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Update Response</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Update Response</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseUpdateResponse(UpdateResponse object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Delete Request</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Delete Request</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseDeleteRequest(DeleteRequest object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Delete Response</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Delete Response</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseDeleteResponse(DeleteResponse object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Create Request</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Create Request</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseCreateRequest(CreateRequest object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Create Response</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Create Response</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseCreateResponse(CreateResponse object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Search Request</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Search Request</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseSearchRequest(SearchRequest object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Search Response</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Search Response</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseSearchResponse(SearchResponse object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Error Response</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Error Response</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseErrorResponse(ErrorResponse object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Transform Request</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Transform Request</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseTransformRequest(TransformRequest object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Transform Response</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Transform Response</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseTransformResponse(TransformResponse object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>EObject</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch, but this is the last case anyway.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>EObject</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject)
	 * @generated
	 */
	@Override
	public T defaultCase(EObject object) {
		return null;
	}

} //FhirrestSwitch
