/**
 */
package fhirrest.impl;

import fhirrest.CreateRequest;
import fhirrest.CreateResponse;
import fhirrest.DeleteRequest;
import fhirrest.DeleteResponse;
import fhirrest.ErrorResponse;
import fhirrest.FhirrestFactory;
import fhirrest.FhirrestPackage;
import fhirrest.ReadRequest;
import fhirrest.ReadResponse;
import fhirrest.SearchRequest;
import fhirrest.SearchResponse;
import fhirrest.TransformRequest;
import fhirrest.TransformResponse;
import fhirrest.UpdateRequest;
import fhirrest.UpdateResponse;
import fhirrest.VReadRequest;
import fhirrest.VReadResponse;

import java.io.File;
import java.io.InputStream;
import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EDataType;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

import org.eclipse.emf.ecore.impl.EPackageImpl;

import org.hl7.fhir.FhirPackage;

import org.w3._1999.xhtml.XhtmlPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Package</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class FhirrestPackageImpl extends EPackageImpl implements FhirrestPackage {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass readRequestEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass readResponseEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass vReadRequestEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass vReadResponseEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass updateRequestEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass updateResponseEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass deleteRequestEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass deleteResponseEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass createRequestEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass createResponseEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass searchRequestEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass searchResponseEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass errorResponseEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass transformRequestEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass transformResponseEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EDataType binaryContentEDataType = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EDataType fileDownloadEDataType = null;

	/**
	 * Creates an instance of the model <b>Package</b>, registered with
	 * {@link org.eclipse.emf.ecore.EPackage.Registry EPackage.Registry} by the package
	 * package URI value.
	 * <p>Note: the correct way to create the package is via the static
	 * factory method {@link #init init()}, which also performs
	 * initialization of the package, or returns the registered package,
	 * if one already exists.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.emf.ecore.EPackage.Registry
	 * @see fhirrest.FhirrestPackage#eNS_URI
	 * @see #init()
	 * @generated
	 */
	private FhirrestPackageImpl() {
		super(eNS_URI, FhirrestFactory.eINSTANCE);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static boolean isInited = false;

	/**
	 * Creates, registers, and initializes the <b>Package</b> for this model, and for any others upon which it depends.
	 * 
	 * <p>This method is used to initialize {@link FhirrestPackage#eINSTANCE} when that field is accessed.
	 * Clients should not invoke it directly. Instead, they should simply access that field to obtain the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #eNS_URI
	 * @see #createPackageContents()
	 * @see #initializePackageContents()
	 * @generated
	 */
	public static FhirrestPackage init() {
		if (isInited) return (FhirrestPackage)EPackage.Registry.INSTANCE.getEPackage(FhirrestPackage.eNS_URI);

		// Obtain or create and register package
		FhirrestPackageImpl theFhirrestPackage = (FhirrestPackageImpl)(EPackage.Registry.INSTANCE.get(eNS_URI) instanceof FhirrestPackageImpl ? EPackage.Registry.INSTANCE.get(eNS_URI) : new FhirrestPackageImpl());

		isInited = true;

		// Initialize simple dependencies
		XhtmlPackage.eINSTANCE.eClass();
		FhirPackage.eINSTANCE.eClass();

		// Create package meta-data objects
		theFhirrestPackage.createPackageContents();

		// Initialize created meta-data
		theFhirrestPackage.initializePackageContents();

		// Mark meta-data to indicate it can't be changed
		theFhirrestPackage.freeze();

  
		// Update the registry and return the package
		EPackage.Registry.INSTANCE.put(FhirrestPackage.eNS_URI, theFhirrestPackage);
		return theFhirrestPackage;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getReadRequest() {
		return readRequestEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getReadRequest_Type() {
		return (EAttribute)readRequestEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getReadRequest_Id() {
		return (EAttribute)readRequestEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getReadRequest__format() {
		return (EAttribute)readRequestEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getReadResponse() {
		return readResponseEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getReadResponse_Content() {
		return (EAttribute)readResponseEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getVReadRequest() {
		return vReadRequestEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getVReadRequest_Vid() {
		return (EAttribute)vReadRequestEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getVReadResponse() {
		return vReadResponseEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getUpdateRequest() {
		return updateRequestEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getUpdateRequest_Type() {
		return (EAttribute)updateRequestEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getUpdateRequest_Id() {
		return (EAttribute)updateRequestEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getUpdateRequest__format() {
		return (EAttribute)updateRequestEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getUpdateRequest_Resource() {
		return (EReference)updateRequestEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getUpdateResponse() {
		return updateResponseEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getDeleteRequest() {
		return deleteRequestEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getDeleteRequest_Type() {
		return (EAttribute)deleteRequestEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getDeleteRequest_Id() {
		return (EAttribute)deleteRequestEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getDeleteResponse() {
		return deleteResponseEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getCreateRequest() {
		return createRequestEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getCreateRequest_Type() {
		return (EAttribute)createRequestEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getCreateRequest__format() {
		return (EAttribute)createRequestEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getCreateRequest_Resource() {
		return (EReference)createRequestEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getCreateResponse() {
		return createResponseEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getSearchRequest() {
		return searchRequestEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getSearchRequest__type() {
		return (EAttribute)searchRequestEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getSearchResponse() {
		return searchResponseEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getSearchResponse_Result() {
		return (EReference)searchResponseEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getErrorResponse() {
		return errorResponseEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getErrorResponse_ErrorMessage() {
		return (EAttribute)errorResponseEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getTransformRequest() {
		return transformRequestEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getTransformRequest_InputFormat() {
		return (EAttribute)transformRequestEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getTransformRequest_Content() {
		return (EAttribute)transformRequestEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getTransformRequest_OutputFormat() {
		return (EAttribute)transformRequestEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getTransformRequest_BinaryContent() {
		return (EAttribute)transformRequestEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getTransformResponse() {
		return transformResponseEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getTransformResponse_Content() {
		return (EAttribute)transformResponseEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getTransformResponse_BinaryContent() {
		return (EAttribute)transformResponseEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EDataType getBinaryContent() {
		return binaryContentEDataType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EDataType getFileDownload() {
		return fileDownloadEDataType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public FhirrestFactory getFhirrestFactory() {
		return (FhirrestFactory)getEFactoryInstance();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private boolean isCreated = false;

	/**
	 * Creates the meta-model objects for the package.  This method is
	 * guarded to have no affect on any invocation but its first.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void createPackageContents() {
		if (isCreated) return;
		isCreated = true;

		// Create classes and their features
		readRequestEClass = createEClass(READ_REQUEST);
		createEAttribute(readRequestEClass, READ_REQUEST__TYPE);
		createEAttribute(readRequestEClass, READ_REQUEST__ID);
		createEAttribute(readRequestEClass, READ_REQUEST__FORMAT);

		readResponseEClass = createEClass(READ_RESPONSE);
		createEAttribute(readResponseEClass, READ_RESPONSE__CONTENT);

		vReadRequestEClass = createEClass(VREAD_REQUEST);
		createEAttribute(vReadRequestEClass, VREAD_REQUEST__VID);

		vReadResponseEClass = createEClass(VREAD_RESPONSE);

		updateRequestEClass = createEClass(UPDATE_REQUEST);
		createEAttribute(updateRequestEClass, UPDATE_REQUEST__TYPE);
		createEAttribute(updateRequestEClass, UPDATE_REQUEST__ID);
		createEAttribute(updateRequestEClass, UPDATE_REQUEST__FORMAT);
		createEReference(updateRequestEClass, UPDATE_REQUEST__RESOURCE);

		updateResponseEClass = createEClass(UPDATE_RESPONSE);

		deleteRequestEClass = createEClass(DELETE_REQUEST);
		createEAttribute(deleteRequestEClass, DELETE_REQUEST__TYPE);
		createEAttribute(deleteRequestEClass, DELETE_REQUEST__ID);

		deleteResponseEClass = createEClass(DELETE_RESPONSE);

		createRequestEClass = createEClass(CREATE_REQUEST);
		createEAttribute(createRequestEClass, CREATE_REQUEST__TYPE);
		createEAttribute(createRequestEClass, CREATE_REQUEST__FORMAT);
		createEReference(createRequestEClass, CREATE_REQUEST__RESOURCE);

		createResponseEClass = createEClass(CREATE_RESPONSE);

		searchRequestEClass = createEClass(SEARCH_REQUEST);
		createEAttribute(searchRequestEClass, SEARCH_REQUEST__TYPE);

		searchResponseEClass = createEClass(SEARCH_RESPONSE);
		createEReference(searchResponseEClass, SEARCH_RESPONSE__RESULT);

		errorResponseEClass = createEClass(ERROR_RESPONSE);
		createEAttribute(errorResponseEClass, ERROR_RESPONSE__ERROR_MESSAGE);

		transformRequestEClass = createEClass(TRANSFORM_REQUEST);
		createEAttribute(transformRequestEClass, TRANSFORM_REQUEST__INPUT_FORMAT);
		createEAttribute(transformRequestEClass, TRANSFORM_REQUEST__CONTENT);
		createEAttribute(transformRequestEClass, TRANSFORM_REQUEST__OUTPUT_FORMAT);
		createEAttribute(transformRequestEClass, TRANSFORM_REQUEST__BINARY_CONTENT);

		transformResponseEClass = createEClass(TRANSFORM_RESPONSE);
		createEAttribute(transformResponseEClass, TRANSFORM_RESPONSE__CONTENT);
		createEAttribute(transformResponseEClass, TRANSFORM_RESPONSE__BINARY_CONTENT);

		// Create data types
		binaryContentEDataType = createEDataType(BINARY_CONTENT);
		fileDownloadEDataType = createEDataType(FILE_DOWNLOAD);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private boolean isInitialized = false;

	/**
	 * Complete the initialization of the package and its meta-model.  This
	 * method is guarded to have no affect on any invocation but its first.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void initializePackageContents() {
		if (isInitialized) return;
		isInitialized = true;

		// Initialize package
		setName(eNAME);
		setNsPrefix(eNS_PREFIX);
		setNsURI(eNS_URI);

		// Obtain other dependent packages
		FhirPackage theFhirPackage = (FhirPackage)EPackage.Registry.INSTANCE.getEPackage(FhirPackage.eNS_URI);

		// Create type parameters

		// Set bounds for type parameters

		// Add supertypes to classes
		vReadRequestEClass.getESuperTypes().add(this.getReadRequest());
		vReadResponseEClass.getESuperTypes().add(this.getReadResponse());

		// Initialize classes, features, and operations; add parameters
		initEClass(readRequestEClass, ReadRequest.class, "ReadRequest", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getReadRequest_Type(), ecorePackage.getEString(), "type", null, 0, 1, ReadRequest.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getReadRequest_Id(), ecorePackage.getEString(), "id", null, 0, 1, ReadRequest.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getReadRequest__format(), ecorePackage.getEString(), "_format", null, 0, 1, ReadRequest.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(readResponseEClass, ReadResponse.class, "ReadResponse", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getReadResponse_Content(), ecorePackage.getEString(), "content", null, 0, 1, ReadResponse.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(vReadRequestEClass, VReadRequest.class, "VReadRequest", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getVReadRequest_Vid(), ecorePackage.getEString(), "vid", null, 0, 1, VReadRequest.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(vReadResponseEClass, VReadResponse.class, "VReadResponse", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(updateRequestEClass, UpdateRequest.class, "UpdateRequest", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getUpdateRequest_Type(), ecorePackage.getEString(), "type", null, 0, 1, UpdateRequest.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getUpdateRequest_Id(), ecorePackage.getEString(), "id", null, 0, 1, UpdateRequest.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getUpdateRequest__format(), ecorePackage.getEString(), "_format", null, 0, 1, UpdateRequest.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getUpdateRequest_Resource(), theFhirPackage.getResource(), null, "resource", null, 1, 1, UpdateRequest.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(updateResponseEClass, UpdateResponse.class, "UpdateResponse", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(deleteRequestEClass, DeleteRequest.class, "DeleteRequest", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getDeleteRequest_Type(), ecorePackage.getEString(), "type", null, 0, 1, DeleteRequest.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getDeleteRequest_Id(), ecorePackage.getEString(), "id", null, 0, 1, DeleteRequest.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(deleteResponseEClass, DeleteResponse.class, "DeleteResponse", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(createRequestEClass, CreateRequest.class, "CreateRequest", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getCreateRequest_Type(), ecorePackage.getEString(), "type", null, 0, 1, CreateRequest.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getCreateRequest__format(), ecorePackage.getEString(), "_format", null, 0, 1, CreateRequest.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getCreateRequest_Resource(), theFhirPackage.getResource(), null, "resource", null, 1, 1, CreateRequest.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(createResponseEClass, CreateResponse.class, "CreateResponse", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(searchRequestEClass, SearchRequest.class, "SearchRequest", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getSearchRequest__type(), ecorePackage.getEString(), "_type", null, 0, 1, SearchRequest.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(searchResponseEClass, SearchResponse.class, "SearchResponse", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getSearchResponse_Result(), theFhirPackage.getBundle(), null, "result", null, 1, 1, SearchResponse.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(errorResponseEClass, ErrorResponse.class, "ErrorResponse", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getErrorResponse_ErrorMessage(), ecorePackage.getEString(), "errorMessage", null, 0, 1, ErrorResponse.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(transformRequestEClass, TransformRequest.class, "TransformRequest", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getTransformRequest_InputFormat(), ecorePackage.getEString(), "inputFormat", null, 0, 1, TransformRequest.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getTransformRequest_Content(), ecorePackage.getEString(), "content", null, 0, 1, TransformRequest.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getTransformRequest_OutputFormat(), ecorePackage.getEString(), "outputFormat", null, 0, 1, TransformRequest.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getTransformRequest_BinaryContent(), this.getBinaryContent(), "binaryContent", null, 0, 1, TransformRequest.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(transformResponseEClass, TransformResponse.class, "TransformResponse", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getTransformResponse_Content(), ecorePackage.getEString(), "content", null, 0, 1, TransformResponse.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getTransformResponse_BinaryContent(), this.getFileDownload(), "binaryContent", null, 0, 1, TransformResponse.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		// Initialize data types
		initEDataType(binaryContentEDataType, InputStream.class, "BinaryContent", IS_SERIALIZABLE, !IS_GENERATED_INSTANCE_CLASS);
		initEDataType(fileDownloadEDataType, File.class, "FileDownload", IS_SERIALIZABLE, !IS_GENERATED_INSTANCE_CLASS);

		// Create resource
		createResource(eNS_URI);
	}

} //FhirrestPackageImpl
