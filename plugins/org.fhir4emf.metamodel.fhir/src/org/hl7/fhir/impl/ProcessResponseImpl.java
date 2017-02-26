/**
 */
package org.hl7.fhir.impl;

import java.util.Collection;
import java.util.List;

import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;
import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

import org.hl7.fhir.Code;
import org.hl7.fhir.CodeableConcept;
import org.hl7.fhir.DateTime;
import org.hl7.fhir.FhirPackage;
import org.hl7.fhir.Identifier;
import org.hl7.fhir.ProcessResponse;
import org.hl7.fhir.ProcessResponseProcessNote;
import org.hl7.fhir.Reference;
import org.hl7.fhir.jaxb.CodeImplAdapter;
import org.hl7.fhir.jaxb.DateTimeImplAdapter;
import org.hl7.fhir.jaxb.StringImplAdapter;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Process Response</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.hl7.fhir.impl.ProcessResponseImpl#getIdentifier <em>Identifier</em>}</li>
 *   <li>{@link org.hl7.fhir.impl.ProcessResponseImpl#getStatus <em>Status</em>}</li>
 *   <li>{@link org.hl7.fhir.impl.ProcessResponseImpl#getCreated <em>Created</em>}</li>
 *   <li>{@link org.hl7.fhir.impl.ProcessResponseImpl#getOrganization <em>Organization</em>}</li>
 *   <li>{@link org.hl7.fhir.impl.ProcessResponseImpl#getRequest <em>Request</em>}</li>
 *   <li>{@link org.hl7.fhir.impl.ProcessResponseImpl#getOutcome <em>Outcome</em>}</li>
 *   <li>{@link org.hl7.fhir.impl.ProcessResponseImpl#getDisposition <em>Disposition</em>}</li>
 *   <li>{@link org.hl7.fhir.impl.ProcessResponseImpl#getRequestProvider <em>Request Provider</em>}</li>
 *   <li>{@link org.hl7.fhir.impl.ProcessResponseImpl#getRequestOrganization <em>Request Organization</em>}</li>
 *   <li>{@link org.hl7.fhir.impl.ProcessResponseImpl#getForm <em>Form</em>}</li>
 *   <li>{@link org.hl7.fhir.impl.ProcessResponseImpl#getProcessNote <em>Process Note</em>}</li>
 *   <li>{@link org.hl7.fhir.impl.ProcessResponseImpl#getError <em>Error</em>}</li>
 *   <li>{@link org.hl7.fhir.impl.ProcessResponseImpl#getCommunicationRequest <em>Communication Request</em>}</li>
 * </ul>
 *
 * @generated
 */
@XmlType(name = "ProcessResponse", namespace = "http://hl7.org/fhir")
@XmlRootElement(name = "fhir.ProcessResponse")
public class ProcessResponseImpl extends DomainResourceImpl implements ProcessResponse {
	/**
	 * The cached value of the '{@link #getIdentifier() <em>Identifier</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getIdentifier()
	 * @generated
	 * @ordered
	 */
	protected EList<Identifier> identifier;

	/**
	 * The cached value of the '{@link #getStatus() <em>Status</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getStatus()
	 * @generated
	 * @ordered
	 */
	protected Code status;

	/**
	 * The cached value of the '{@link #getCreated() <em>Created</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCreated()
	 * @generated
	 * @ordered
	 */
	protected DateTime created;

	/**
	 * The cached value of the '{@link #getOrganization() <em>Organization</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOrganization()
	 * @generated
	 * @ordered
	 */
	protected Reference organization;

	/**
	 * The cached value of the '{@link #getRequest() <em>Request</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRequest()
	 * @generated
	 * @ordered
	 */
	protected Reference request;

	/**
	 * The cached value of the '{@link #getOutcome() <em>Outcome</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOutcome()
	 * @generated
	 * @ordered
	 */
	protected CodeableConcept outcome;

	/**
	 * The cached value of the '{@link #getDisposition() <em>Disposition</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDisposition()
	 * @generated
	 * @ordered
	 */
	protected org.hl7.fhir.String disposition;

	/**
	 * The cached value of the '{@link #getRequestProvider() <em>Request Provider</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRequestProvider()
	 * @generated
	 * @ordered
	 */
	protected Reference requestProvider;

	/**
	 * The cached value of the '{@link #getRequestOrganization() <em>Request Organization</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRequestOrganization()
	 * @generated
	 * @ordered
	 */
	protected Reference requestOrganization;

	/**
	 * The cached value of the '{@link #getForm() <em>Form</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getForm()
	 * @generated
	 * @ordered
	 */
	protected CodeableConcept form;

	/**
	 * The cached value of the '{@link #getProcessNote() <em>Process Note</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getProcessNote()
	 * @generated
	 * @ordered
	 */
	protected EList<ProcessResponseProcessNote> processNote;

	/**
	 * The cached value of the '{@link #getError() <em>Error</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getError()
	 * @generated
	 * @ordered
	 */
	protected EList<CodeableConcept> error;

	/**
	 * The cached value of the '{@link #getCommunicationRequest() <em>Communication Request</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCommunicationRequest()
	 * @generated
	 * @ordered
	 */
	protected EList<Reference> communicationRequest;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ProcessResponseImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return FhirPackage.eINSTANCE.getProcessResponse();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@XmlElement
	public List<Identifier> getIdentifier() {
		if (identifier == null) {
			identifier = new EObjectContainmentEList<Identifier>(Identifier.class, this, FhirPackage.PROCESS_RESPONSE__IDENTIFIER);
		}
		return identifier;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@XmlJavaTypeAdapter(CodeImplAdapter.class)
	public Code getStatus() {
		return status;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetStatus(Code newStatus, NotificationChain msgs) {
		Code oldStatus = status;
		status = newStatus;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FhirPackage.PROCESS_RESPONSE__STATUS, oldStatus, newStatus);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setStatus(Code newStatus) {
		if (newStatus != status) {
			NotificationChain msgs = null;
			if (status != null)
				msgs = ((InternalEObject)status).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FhirPackage.PROCESS_RESPONSE__STATUS, null, msgs);
			if (newStatus != null)
				msgs = ((InternalEObject)newStatus).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FhirPackage.PROCESS_RESPONSE__STATUS, null, msgs);
			msgs = basicSetStatus(newStatus, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FhirPackage.PROCESS_RESPONSE__STATUS, newStatus, newStatus));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@XmlJavaTypeAdapter(DateTimeImplAdapter.class)
	public DateTime getCreated() {
		return created;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetCreated(DateTime newCreated, NotificationChain msgs) {
		DateTime oldCreated = created;
		created = newCreated;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FhirPackage.PROCESS_RESPONSE__CREATED, oldCreated, newCreated);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setCreated(DateTime newCreated) {
		if (newCreated != created) {
			NotificationChain msgs = null;
			if (created != null)
				msgs = ((InternalEObject)created).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FhirPackage.PROCESS_RESPONSE__CREATED, null, msgs);
			if (newCreated != null)
				msgs = ((InternalEObject)newCreated).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FhirPackage.PROCESS_RESPONSE__CREATED, null, msgs);
			msgs = basicSetCreated(newCreated, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FhirPackage.PROCESS_RESPONSE__CREATED, newCreated, newCreated));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Reference getOrganization() {
		return organization;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetOrganization(Reference newOrganization, NotificationChain msgs) {
		Reference oldOrganization = organization;
		organization = newOrganization;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FhirPackage.PROCESS_RESPONSE__ORGANIZATION, oldOrganization, newOrganization);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setOrganization(Reference newOrganization) {
		if (newOrganization != organization) {
			NotificationChain msgs = null;
			if (organization != null)
				msgs = ((InternalEObject)organization).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FhirPackage.PROCESS_RESPONSE__ORGANIZATION, null, msgs);
			if (newOrganization != null)
				msgs = ((InternalEObject)newOrganization).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FhirPackage.PROCESS_RESPONSE__ORGANIZATION, null, msgs);
			msgs = basicSetOrganization(newOrganization, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FhirPackage.PROCESS_RESPONSE__ORGANIZATION, newOrganization, newOrganization));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Reference getRequest() {
		return request;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetRequest(Reference newRequest, NotificationChain msgs) {
		Reference oldRequest = request;
		request = newRequest;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FhirPackage.PROCESS_RESPONSE__REQUEST, oldRequest, newRequest);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setRequest(Reference newRequest) {
		if (newRequest != request) {
			NotificationChain msgs = null;
			if (request != null)
				msgs = ((InternalEObject)request).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FhirPackage.PROCESS_RESPONSE__REQUEST, null, msgs);
			if (newRequest != null)
				msgs = ((InternalEObject)newRequest).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FhirPackage.PROCESS_RESPONSE__REQUEST, null, msgs);
			msgs = basicSetRequest(newRequest, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FhirPackage.PROCESS_RESPONSE__REQUEST, newRequest, newRequest));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CodeableConcept getOutcome() {
		return outcome;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetOutcome(CodeableConcept newOutcome, NotificationChain msgs) {
		CodeableConcept oldOutcome = outcome;
		outcome = newOutcome;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FhirPackage.PROCESS_RESPONSE__OUTCOME, oldOutcome, newOutcome);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setOutcome(CodeableConcept newOutcome) {
		if (newOutcome != outcome) {
			NotificationChain msgs = null;
			if (outcome != null)
				msgs = ((InternalEObject)outcome).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FhirPackage.PROCESS_RESPONSE__OUTCOME, null, msgs);
			if (newOutcome != null)
				msgs = ((InternalEObject)newOutcome).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FhirPackage.PROCESS_RESPONSE__OUTCOME, null, msgs);
			msgs = basicSetOutcome(newOutcome, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FhirPackage.PROCESS_RESPONSE__OUTCOME, newOutcome, newOutcome));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@XmlJavaTypeAdapter(StringImplAdapter.class)
	public org.hl7.fhir.String getDisposition() {
		return disposition;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetDisposition(org.hl7.fhir.String newDisposition, NotificationChain msgs) {
		org.hl7.fhir.String oldDisposition = disposition;
		disposition = newDisposition;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FhirPackage.PROCESS_RESPONSE__DISPOSITION, oldDisposition, newDisposition);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setDisposition(org.hl7.fhir.String newDisposition) {
		if (newDisposition != disposition) {
			NotificationChain msgs = null;
			if (disposition != null)
				msgs = ((InternalEObject)disposition).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FhirPackage.PROCESS_RESPONSE__DISPOSITION, null, msgs);
			if (newDisposition != null)
				msgs = ((InternalEObject)newDisposition).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FhirPackage.PROCESS_RESPONSE__DISPOSITION, null, msgs);
			msgs = basicSetDisposition(newDisposition, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FhirPackage.PROCESS_RESPONSE__DISPOSITION, newDisposition, newDisposition));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Reference getRequestProvider() {
		return requestProvider;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetRequestProvider(Reference newRequestProvider, NotificationChain msgs) {
		Reference oldRequestProvider = requestProvider;
		requestProvider = newRequestProvider;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FhirPackage.PROCESS_RESPONSE__REQUEST_PROVIDER, oldRequestProvider, newRequestProvider);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setRequestProvider(Reference newRequestProvider) {
		if (newRequestProvider != requestProvider) {
			NotificationChain msgs = null;
			if (requestProvider != null)
				msgs = ((InternalEObject)requestProvider).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FhirPackage.PROCESS_RESPONSE__REQUEST_PROVIDER, null, msgs);
			if (newRequestProvider != null)
				msgs = ((InternalEObject)newRequestProvider).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FhirPackage.PROCESS_RESPONSE__REQUEST_PROVIDER, null, msgs);
			msgs = basicSetRequestProvider(newRequestProvider, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FhirPackage.PROCESS_RESPONSE__REQUEST_PROVIDER, newRequestProvider, newRequestProvider));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Reference getRequestOrganization() {
		return requestOrganization;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetRequestOrganization(Reference newRequestOrganization, NotificationChain msgs) {
		Reference oldRequestOrganization = requestOrganization;
		requestOrganization = newRequestOrganization;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FhirPackage.PROCESS_RESPONSE__REQUEST_ORGANIZATION, oldRequestOrganization, newRequestOrganization);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setRequestOrganization(Reference newRequestOrganization) {
		if (newRequestOrganization != requestOrganization) {
			NotificationChain msgs = null;
			if (requestOrganization != null)
				msgs = ((InternalEObject)requestOrganization).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FhirPackage.PROCESS_RESPONSE__REQUEST_ORGANIZATION, null, msgs);
			if (newRequestOrganization != null)
				msgs = ((InternalEObject)newRequestOrganization).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FhirPackage.PROCESS_RESPONSE__REQUEST_ORGANIZATION, null, msgs);
			msgs = basicSetRequestOrganization(newRequestOrganization, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FhirPackage.PROCESS_RESPONSE__REQUEST_ORGANIZATION, newRequestOrganization, newRequestOrganization));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CodeableConcept getForm() {
		return form;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetForm(CodeableConcept newForm, NotificationChain msgs) {
		CodeableConcept oldForm = form;
		form = newForm;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FhirPackage.PROCESS_RESPONSE__FORM, oldForm, newForm);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setForm(CodeableConcept newForm) {
		if (newForm != form) {
			NotificationChain msgs = null;
			if (form != null)
				msgs = ((InternalEObject)form).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FhirPackage.PROCESS_RESPONSE__FORM, null, msgs);
			if (newForm != null)
				msgs = ((InternalEObject)newForm).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FhirPackage.PROCESS_RESPONSE__FORM, null, msgs);
			msgs = basicSetForm(newForm, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FhirPackage.PROCESS_RESPONSE__FORM, newForm, newForm));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@XmlElement
	public List<ProcessResponseProcessNote> getProcessNote() {
		if (processNote == null) {
			processNote = new EObjectContainmentEList<ProcessResponseProcessNote>(ProcessResponseProcessNote.class, this, FhirPackage.PROCESS_RESPONSE__PROCESS_NOTE);
		}
		return processNote;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@XmlElement
	public List<CodeableConcept> getError() {
		if (error == null) {
			error = new EObjectContainmentEList<CodeableConcept>(CodeableConcept.class, this, FhirPackage.PROCESS_RESPONSE__ERROR);
		}
		return error;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@XmlElement
	public List<Reference> getCommunicationRequest() {
		if (communicationRequest == null) {
			communicationRequest = new EObjectContainmentEList<Reference>(Reference.class, this, FhirPackage.PROCESS_RESPONSE__COMMUNICATION_REQUEST);
		}
		return communicationRequest;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case FhirPackage.PROCESS_RESPONSE__IDENTIFIER:
				return ((InternalEList<?>)getIdentifier()).basicRemove(otherEnd, msgs);
			case FhirPackage.PROCESS_RESPONSE__STATUS:
				return basicSetStatus(null, msgs);
			case FhirPackage.PROCESS_RESPONSE__CREATED:
				return basicSetCreated(null, msgs);
			case FhirPackage.PROCESS_RESPONSE__ORGANIZATION:
				return basicSetOrganization(null, msgs);
			case FhirPackage.PROCESS_RESPONSE__REQUEST:
				return basicSetRequest(null, msgs);
			case FhirPackage.PROCESS_RESPONSE__OUTCOME:
				return basicSetOutcome(null, msgs);
			case FhirPackage.PROCESS_RESPONSE__DISPOSITION:
				return basicSetDisposition(null, msgs);
			case FhirPackage.PROCESS_RESPONSE__REQUEST_PROVIDER:
				return basicSetRequestProvider(null, msgs);
			case FhirPackage.PROCESS_RESPONSE__REQUEST_ORGANIZATION:
				return basicSetRequestOrganization(null, msgs);
			case FhirPackage.PROCESS_RESPONSE__FORM:
				return basicSetForm(null, msgs);
			case FhirPackage.PROCESS_RESPONSE__PROCESS_NOTE:
				return ((InternalEList<?>)getProcessNote()).basicRemove(otherEnd, msgs);
			case FhirPackage.PROCESS_RESPONSE__ERROR:
				return ((InternalEList<?>)getError()).basicRemove(otherEnd, msgs);
			case FhirPackage.PROCESS_RESPONSE__COMMUNICATION_REQUEST:
				return ((InternalEList<?>)getCommunicationRequest()).basicRemove(otherEnd, msgs);
		}
		return super.eInverseRemove(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case FhirPackage.PROCESS_RESPONSE__IDENTIFIER:
				return getIdentifier();
			case FhirPackage.PROCESS_RESPONSE__STATUS:
				return getStatus();
			case FhirPackage.PROCESS_RESPONSE__CREATED:
				return getCreated();
			case FhirPackage.PROCESS_RESPONSE__ORGANIZATION:
				return getOrganization();
			case FhirPackage.PROCESS_RESPONSE__REQUEST:
				return getRequest();
			case FhirPackage.PROCESS_RESPONSE__OUTCOME:
				return getOutcome();
			case FhirPackage.PROCESS_RESPONSE__DISPOSITION:
				return getDisposition();
			case FhirPackage.PROCESS_RESPONSE__REQUEST_PROVIDER:
				return getRequestProvider();
			case FhirPackage.PROCESS_RESPONSE__REQUEST_ORGANIZATION:
				return getRequestOrganization();
			case FhirPackage.PROCESS_RESPONSE__FORM:
				return getForm();
			case FhirPackage.PROCESS_RESPONSE__PROCESS_NOTE:
				return getProcessNote();
			case FhirPackage.PROCESS_RESPONSE__ERROR:
				return getError();
			case FhirPackage.PROCESS_RESPONSE__COMMUNICATION_REQUEST:
				return getCommunicationRequest();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case FhirPackage.PROCESS_RESPONSE__IDENTIFIER:
				getIdentifier().clear();
				getIdentifier().addAll((Collection<? extends Identifier>)newValue);
				return;
			case FhirPackage.PROCESS_RESPONSE__STATUS:
				setStatus((Code)newValue);
				return;
			case FhirPackage.PROCESS_RESPONSE__CREATED:
				setCreated((DateTime)newValue);
				return;
			case FhirPackage.PROCESS_RESPONSE__ORGANIZATION:
				setOrganization((Reference)newValue);
				return;
			case FhirPackage.PROCESS_RESPONSE__REQUEST:
				setRequest((Reference)newValue);
				return;
			case FhirPackage.PROCESS_RESPONSE__OUTCOME:
				setOutcome((CodeableConcept)newValue);
				return;
			case FhirPackage.PROCESS_RESPONSE__DISPOSITION:
				setDisposition((org.hl7.fhir.String)newValue);
				return;
			case FhirPackage.PROCESS_RESPONSE__REQUEST_PROVIDER:
				setRequestProvider((Reference)newValue);
				return;
			case FhirPackage.PROCESS_RESPONSE__REQUEST_ORGANIZATION:
				setRequestOrganization((Reference)newValue);
				return;
			case FhirPackage.PROCESS_RESPONSE__FORM:
				setForm((CodeableConcept)newValue);
				return;
			case FhirPackage.PROCESS_RESPONSE__PROCESS_NOTE:
				getProcessNote().clear();
				getProcessNote().addAll((Collection<? extends ProcessResponseProcessNote>)newValue);
				return;
			case FhirPackage.PROCESS_RESPONSE__ERROR:
				getError().clear();
				getError().addAll((Collection<? extends CodeableConcept>)newValue);
				return;
			case FhirPackage.PROCESS_RESPONSE__COMMUNICATION_REQUEST:
				getCommunicationRequest().clear();
				getCommunicationRequest().addAll((Collection<? extends Reference>)newValue);
				return;
		}
		super.eSet(featureID, newValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eUnset(int featureID) {
		switch (featureID) {
			case FhirPackage.PROCESS_RESPONSE__IDENTIFIER:
				getIdentifier().clear();
				return;
			case FhirPackage.PROCESS_RESPONSE__STATUS:
				setStatus((Code)null);
				return;
			case FhirPackage.PROCESS_RESPONSE__CREATED:
				setCreated((DateTime)null);
				return;
			case FhirPackage.PROCESS_RESPONSE__ORGANIZATION:
				setOrganization((Reference)null);
				return;
			case FhirPackage.PROCESS_RESPONSE__REQUEST:
				setRequest((Reference)null);
				return;
			case FhirPackage.PROCESS_RESPONSE__OUTCOME:
				setOutcome((CodeableConcept)null);
				return;
			case FhirPackage.PROCESS_RESPONSE__DISPOSITION:
				setDisposition((org.hl7.fhir.String)null);
				return;
			case FhirPackage.PROCESS_RESPONSE__REQUEST_PROVIDER:
				setRequestProvider((Reference)null);
				return;
			case FhirPackage.PROCESS_RESPONSE__REQUEST_ORGANIZATION:
				setRequestOrganization((Reference)null);
				return;
			case FhirPackage.PROCESS_RESPONSE__FORM:
				setForm((CodeableConcept)null);
				return;
			case FhirPackage.PROCESS_RESPONSE__PROCESS_NOTE:
				getProcessNote().clear();
				return;
			case FhirPackage.PROCESS_RESPONSE__ERROR:
				getError().clear();
				return;
			case FhirPackage.PROCESS_RESPONSE__COMMUNICATION_REQUEST:
				getCommunicationRequest().clear();
				return;
		}
		super.eUnset(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean eIsSet(int featureID) {
		switch (featureID) {
			case FhirPackage.PROCESS_RESPONSE__IDENTIFIER:
				return identifier != null && !identifier.isEmpty();
			case FhirPackage.PROCESS_RESPONSE__STATUS:
				return status != null;
			case FhirPackage.PROCESS_RESPONSE__CREATED:
				return created != null;
			case FhirPackage.PROCESS_RESPONSE__ORGANIZATION:
				return organization != null;
			case FhirPackage.PROCESS_RESPONSE__REQUEST:
				return request != null;
			case FhirPackage.PROCESS_RESPONSE__OUTCOME:
				return outcome != null;
			case FhirPackage.PROCESS_RESPONSE__DISPOSITION:
				return disposition != null;
			case FhirPackage.PROCESS_RESPONSE__REQUEST_PROVIDER:
				return requestProvider != null;
			case FhirPackage.PROCESS_RESPONSE__REQUEST_ORGANIZATION:
				return requestOrganization != null;
			case FhirPackage.PROCESS_RESPONSE__FORM:
				return form != null;
			case FhirPackage.PROCESS_RESPONSE__PROCESS_NOTE:
				return processNote != null && !processNote.isEmpty();
			case FhirPackage.PROCESS_RESPONSE__ERROR:
				return error != null && !error.isEmpty();
			case FhirPackage.PROCESS_RESPONSE__COMMUNICATION_REQUEST:
				return communicationRequest != null && !communicationRequest.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //ProcessResponseImpl
