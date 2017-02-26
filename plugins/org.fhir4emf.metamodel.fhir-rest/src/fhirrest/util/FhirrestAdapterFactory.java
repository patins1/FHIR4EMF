/**
 */
package fhirrest.util;

import fhirrest.*;

import org.eclipse.emf.common.notify.Adapter;
import org.eclipse.emf.common.notify.Notifier;

import org.eclipse.emf.common.notify.impl.AdapterFactoryImpl;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * The <b>Adapter Factory</b> for the model.
 * It provides an adapter <code>createXXX</code> method for each class of the model.
 * <!-- end-user-doc -->
 * @see fhirrest.FhirrestPackage
 * @generated
 */
public class FhirrestAdapterFactory extends AdapterFactoryImpl {
	/**
	 * The cached model package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static FhirrestPackage modelPackage;

	/**
	 * Creates an instance of the adapter factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public FhirrestAdapterFactory() {
		if (modelPackage == null) {
			modelPackage = FhirrestPackage.eINSTANCE;
		}
	}

	/**
	 * Returns whether this factory is applicable for the type of the object.
	 * <!-- begin-user-doc -->
	 * This implementation returns <code>true</code> if the object is either the model's package or is an instance object of the model.
	 * <!-- end-user-doc -->
	 * @return whether this factory is applicable for the type of the object.
	 * @generated
	 */
	@Override
	public boolean isFactoryForType(Object object) {
		if (object == modelPackage) {
			return true;
		}
		if (object instanceof EObject) {
			return ((EObject)object).eClass().getEPackage() == modelPackage;
		}
		return false;
	}

	/**
	 * The switch that delegates to the <code>createXXX</code> methods.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected FhirrestSwitch<Adapter> modelSwitch =
		new FhirrestSwitch<Adapter>() {
			@Override
			public Adapter caseReadRequest(ReadRequest object) {
				return createReadRequestAdapter();
			}
			@Override
			public Adapter caseReadResponse(ReadResponse object) {
				return createReadResponseAdapter();
			}
			@Override
			public Adapter caseVReadRequest(VReadRequest object) {
				return createVReadRequestAdapter();
			}
			@Override
			public Adapter caseVReadResponse(VReadResponse object) {
				return createVReadResponseAdapter();
			}
			@Override
			public Adapter caseUpdateRequest(UpdateRequest object) {
				return createUpdateRequestAdapter();
			}
			@Override
			public Adapter caseUpdateResponse(UpdateResponse object) {
				return createUpdateResponseAdapter();
			}
			@Override
			public Adapter caseDeleteRequest(DeleteRequest object) {
				return createDeleteRequestAdapter();
			}
			@Override
			public Adapter caseDeleteResponse(DeleteResponse object) {
				return createDeleteResponseAdapter();
			}
			@Override
			public Adapter caseCreateRequest(CreateRequest object) {
				return createCreateRequestAdapter();
			}
			@Override
			public Adapter caseCreateResponse(CreateResponse object) {
				return createCreateResponseAdapter();
			}
			@Override
			public Adapter caseSearchRequest(SearchRequest object) {
				return createSearchRequestAdapter();
			}
			@Override
			public Adapter caseSearchResponse(SearchResponse object) {
				return createSearchResponseAdapter();
			}
			@Override
			public Adapter caseErrorResponse(ErrorResponse object) {
				return createErrorResponseAdapter();
			}
			@Override
			public Adapter caseTransformRequest(TransformRequest object) {
				return createTransformRequestAdapter();
			}
			@Override
			public Adapter caseTransformResponse(TransformResponse object) {
				return createTransformResponseAdapter();
			}
			@Override
			public Adapter defaultCase(EObject object) {
				return createEObjectAdapter();
			}
		};

	/**
	 * Creates an adapter for the <code>target</code>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param target the object to adapt.
	 * @return the adapter for the <code>target</code>.
	 * @generated
	 */
	@Override
	public Adapter createAdapter(Notifier target) {
		return modelSwitch.doSwitch((EObject)target);
	}


	/**
	 * Creates a new adapter for an object of class '{@link fhirrest.ReadRequest <em>Read Request</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see fhirrest.ReadRequest
	 * @generated
	 */
	public Adapter createReadRequestAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link fhirrest.ReadResponse <em>Read Response</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see fhirrest.ReadResponse
	 * @generated
	 */
	public Adapter createReadResponseAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link fhirrest.VReadRequest <em>VRead Request</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see fhirrest.VReadRequest
	 * @generated
	 */
	public Adapter createVReadRequestAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link fhirrest.VReadResponse <em>VRead Response</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see fhirrest.VReadResponse
	 * @generated
	 */
	public Adapter createVReadResponseAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link fhirrest.UpdateRequest <em>Update Request</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see fhirrest.UpdateRequest
	 * @generated
	 */
	public Adapter createUpdateRequestAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link fhirrest.UpdateResponse <em>Update Response</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see fhirrest.UpdateResponse
	 * @generated
	 */
	public Adapter createUpdateResponseAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link fhirrest.DeleteRequest <em>Delete Request</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see fhirrest.DeleteRequest
	 * @generated
	 */
	public Adapter createDeleteRequestAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link fhirrest.DeleteResponse <em>Delete Response</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see fhirrest.DeleteResponse
	 * @generated
	 */
	public Adapter createDeleteResponseAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link fhirrest.CreateRequest <em>Create Request</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see fhirrest.CreateRequest
	 * @generated
	 */
	public Adapter createCreateRequestAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link fhirrest.CreateResponse <em>Create Response</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see fhirrest.CreateResponse
	 * @generated
	 */
	public Adapter createCreateResponseAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link fhirrest.SearchRequest <em>Search Request</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see fhirrest.SearchRequest
	 * @generated
	 */
	public Adapter createSearchRequestAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link fhirrest.SearchResponse <em>Search Response</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see fhirrest.SearchResponse
	 * @generated
	 */
	public Adapter createSearchResponseAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link fhirrest.ErrorResponse <em>Error Response</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see fhirrest.ErrorResponse
	 * @generated
	 */
	public Adapter createErrorResponseAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link fhirrest.TransformRequest <em>Transform Request</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see fhirrest.TransformRequest
	 * @generated
	 */
	public Adapter createTransformRequestAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link fhirrest.TransformResponse <em>Transform Response</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see fhirrest.TransformResponse
	 * @generated
	 */
	public Adapter createTransformResponseAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for the default case.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @generated
	 */
	public Adapter createEObjectAdapter() {
		return null;
	}

} //FhirrestAdapterFactory
