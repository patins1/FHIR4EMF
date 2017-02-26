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

import org.hl7.fhir.ClaimResponse;
import org.hl7.fhir.ClaimResponseAddItem;
import org.hl7.fhir.ClaimResponseError;
import org.hl7.fhir.ClaimResponseInsurance;
import org.hl7.fhir.ClaimResponseItem;
import org.hl7.fhir.ClaimResponsePayment;
import org.hl7.fhir.ClaimResponseProcessNote;
import org.hl7.fhir.Code;
import org.hl7.fhir.CodeableConcept;
import org.hl7.fhir.Coding;
import org.hl7.fhir.DateTime;
import org.hl7.fhir.FhirPackage;
import org.hl7.fhir.Identifier;
import org.hl7.fhir.Money;
import org.hl7.fhir.Reference;
import org.hl7.fhir.jaxb.CodeImplAdapter;
import org.hl7.fhir.jaxb.DateTimeImplAdapter;
import org.hl7.fhir.jaxb.StringImplAdapter;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Claim Response</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.hl7.fhir.impl.ClaimResponseImpl#getIdentifier <em>Identifier</em>}</li>
 *   <li>{@link org.hl7.fhir.impl.ClaimResponseImpl#getStatus <em>Status</em>}</li>
 *   <li>{@link org.hl7.fhir.impl.ClaimResponseImpl#getCreated <em>Created</em>}</li>
 *   <li>{@link org.hl7.fhir.impl.ClaimResponseImpl#getInsurer <em>Insurer</em>}</li>
 *   <li>{@link org.hl7.fhir.impl.ClaimResponseImpl#getRequestProvider <em>Request Provider</em>}</li>
 *   <li>{@link org.hl7.fhir.impl.ClaimResponseImpl#getRequestOrganization <em>Request Organization</em>}</li>
 *   <li>{@link org.hl7.fhir.impl.ClaimResponseImpl#getRequest <em>Request</em>}</li>
 *   <li>{@link org.hl7.fhir.impl.ClaimResponseImpl#getOutcome <em>Outcome</em>}</li>
 *   <li>{@link org.hl7.fhir.impl.ClaimResponseImpl#getDisposition <em>Disposition</em>}</li>
 *   <li>{@link org.hl7.fhir.impl.ClaimResponseImpl#getPayeeType <em>Payee Type</em>}</li>
 *   <li>{@link org.hl7.fhir.impl.ClaimResponseImpl#getItem <em>Item</em>}</li>
 *   <li>{@link org.hl7.fhir.impl.ClaimResponseImpl#getAddItem <em>Add Item</em>}</li>
 *   <li>{@link org.hl7.fhir.impl.ClaimResponseImpl#getError <em>Error</em>}</li>
 *   <li>{@link org.hl7.fhir.impl.ClaimResponseImpl#getTotalCost <em>Total Cost</em>}</li>
 *   <li>{@link org.hl7.fhir.impl.ClaimResponseImpl#getUnallocDeductable <em>Unalloc Deductable</em>}</li>
 *   <li>{@link org.hl7.fhir.impl.ClaimResponseImpl#getTotalBenefit <em>Total Benefit</em>}</li>
 *   <li>{@link org.hl7.fhir.impl.ClaimResponseImpl#getPayment <em>Payment</em>}</li>
 *   <li>{@link org.hl7.fhir.impl.ClaimResponseImpl#getReserved <em>Reserved</em>}</li>
 *   <li>{@link org.hl7.fhir.impl.ClaimResponseImpl#getForm <em>Form</em>}</li>
 *   <li>{@link org.hl7.fhir.impl.ClaimResponseImpl#getProcessNote <em>Process Note</em>}</li>
 *   <li>{@link org.hl7.fhir.impl.ClaimResponseImpl#getCommunicationRequest <em>Communication Request</em>}</li>
 *   <li>{@link org.hl7.fhir.impl.ClaimResponseImpl#getInsurance <em>Insurance</em>}</li>
 * </ul>
 *
 * @generated
 */
@XmlType(name = "ClaimResponse", namespace = "http://hl7.org/fhir")
@XmlRootElement(name = "fhir.ClaimResponse")
public class ClaimResponseImpl extends DomainResourceImpl implements ClaimResponse {
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
	 * The cached value of the '{@link #getInsurer() <em>Insurer</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getInsurer()
	 * @generated
	 * @ordered
	 */
	protected Reference insurer;

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
	 * The cached value of the '{@link #getPayeeType() <em>Payee Type</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPayeeType()
	 * @generated
	 * @ordered
	 */
	protected CodeableConcept payeeType;

	/**
	 * The cached value of the '{@link #getItem() <em>Item</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getItem()
	 * @generated
	 * @ordered
	 */
	protected EList<ClaimResponseItem> item;

	/**
	 * The cached value of the '{@link #getAddItem() <em>Add Item</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAddItem()
	 * @generated
	 * @ordered
	 */
	protected EList<ClaimResponseAddItem> addItem;

	/**
	 * The cached value of the '{@link #getError() <em>Error</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getError()
	 * @generated
	 * @ordered
	 */
	protected EList<ClaimResponseError> error;

	/**
	 * The cached value of the '{@link #getTotalCost() <em>Total Cost</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTotalCost()
	 * @generated
	 * @ordered
	 */
	protected Money totalCost;

	/**
	 * The cached value of the '{@link #getUnallocDeductable() <em>Unalloc Deductable</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getUnallocDeductable()
	 * @generated
	 * @ordered
	 */
	protected Money unallocDeductable;

	/**
	 * The cached value of the '{@link #getTotalBenefit() <em>Total Benefit</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTotalBenefit()
	 * @generated
	 * @ordered
	 */
	protected Money totalBenefit;

	/**
	 * The cached value of the '{@link #getPayment() <em>Payment</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPayment()
	 * @generated
	 * @ordered
	 */
	protected ClaimResponsePayment payment;

	/**
	 * The cached value of the '{@link #getReserved() <em>Reserved</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getReserved()
	 * @generated
	 * @ordered
	 */
	protected Coding reserved;

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
	protected EList<ClaimResponseProcessNote> processNote;

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
	 * The cached value of the '{@link #getInsurance() <em>Insurance</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getInsurance()
	 * @generated
	 * @ordered
	 */
	protected EList<ClaimResponseInsurance> insurance;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ClaimResponseImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return FhirPackage.eINSTANCE.getClaimResponse();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@XmlElement
	public List<Identifier> getIdentifier() {
		if (identifier == null) {
			identifier = new EObjectContainmentEList<Identifier>(Identifier.class, this, FhirPackage.CLAIM_RESPONSE__IDENTIFIER);
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
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FhirPackage.CLAIM_RESPONSE__STATUS, oldStatus, newStatus);
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
				msgs = ((InternalEObject)status).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FhirPackage.CLAIM_RESPONSE__STATUS, null, msgs);
			if (newStatus != null)
				msgs = ((InternalEObject)newStatus).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FhirPackage.CLAIM_RESPONSE__STATUS, null, msgs);
			msgs = basicSetStatus(newStatus, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FhirPackage.CLAIM_RESPONSE__STATUS, newStatus, newStatus));
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
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FhirPackage.CLAIM_RESPONSE__CREATED, oldCreated, newCreated);
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
				msgs = ((InternalEObject)created).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FhirPackage.CLAIM_RESPONSE__CREATED, null, msgs);
			if (newCreated != null)
				msgs = ((InternalEObject)newCreated).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FhirPackage.CLAIM_RESPONSE__CREATED, null, msgs);
			msgs = basicSetCreated(newCreated, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FhirPackage.CLAIM_RESPONSE__CREATED, newCreated, newCreated));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Reference getInsurer() {
		return insurer;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetInsurer(Reference newInsurer, NotificationChain msgs) {
		Reference oldInsurer = insurer;
		insurer = newInsurer;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FhirPackage.CLAIM_RESPONSE__INSURER, oldInsurer, newInsurer);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setInsurer(Reference newInsurer) {
		if (newInsurer != insurer) {
			NotificationChain msgs = null;
			if (insurer != null)
				msgs = ((InternalEObject)insurer).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FhirPackage.CLAIM_RESPONSE__INSURER, null, msgs);
			if (newInsurer != null)
				msgs = ((InternalEObject)newInsurer).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FhirPackage.CLAIM_RESPONSE__INSURER, null, msgs);
			msgs = basicSetInsurer(newInsurer, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FhirPackage.CLAIM_RESPONSE__INSURER, newInsurer, newInsurer));
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
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FhirPackage.CLAIM_RESPONSE__REQUEST_PROVIDER, oldRequestProvider, newRequestProvider);
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
				msgs = ((InternalEObject)requestProvider).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FhirPackage.CLAIM_RESPONSE__REQUEST_PROVIDER, null, msgs);
			if (newRequestProvider != null)
				msgs = ((InternalEObject)newRequestProvider).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FhirPackage.CLAIM_RESPONSE__REQUEST_PROVIDER, null, msgs);
			msgs = basicSetRequestProvider(newRequestProvider, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FhirPackage.CLAIM_RESPONSE__REQUEST_PROVIDER, newRequestProvider, newRequestProvider));
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
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FhirPackage.CLAIM_RESPONSE__REQUEST_ORGANIZATION, oldRequestOrganization, newRequestOrganization);
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
				msgs = ((InternalEObject)requestOrganization).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FhirPackage.CLAIM_RESPONSE__REQUEST_ORGANIZATION, null, msgs);
			if (newRequestOrganization != null)
				msgs = ((InternalEObject)newRequestOrganization).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FhirPackage.CLAIM_RESPONSE__REQUEST_ORGANIZATION, null, msgs);
			msgs = basicSetRequestOrganization(newRequestOrganization, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FhirPackage.CLAIM_RESPONSE__REQUEST_ORGANIZATION, newRequestOrganization, newRequestOrganization));
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
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FhirPackage.CLAIM_RESPONSE__REQUEST, oldRequest, newRequest);
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
				msgs = ((InternalEObject)request).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FhirPackage.CLAIM_RESPONSE__REQUEST, null, msgs);
			if (newRequest != null)
				msgs = ((InternalEObject)newRequest).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FhirPackage.CLAIM_RESPONSE__REQUEST, null, msgs);
			msgs = basicSetRequest(newRequest, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FhirPackage.CLAIM_RESPONSE__REQUEST, newRequest, newRequest));
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
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FhirPackage.CLAIM_RESPONSE__OUTCOME, oldOutcome, newOutcome);
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
				msgs = ((InternalEObject)outcome).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FhirPackage.CLAIM_RESPONSE__OUTCOME, null, msgs);
			if (newOutcome != null)
				msgs = ((InternalEObject)newOutcome).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FhirPackage.CLAIM_RESPONSE__OUTCOME, null, msgs);
			msgs = basicSetOutcome(newOutcome, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FhirPackage.CLAIM_RESPONSE__OUTCOME, newOutcome, newOutcome));
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
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FhirPackage.CLAIM_RESPONSE__DISPOSITION, oldDisposition, newDisposition);
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
				msgs = ((InternalEObject)disposition).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FhirPackage.CLAIM_RESPONSE__DISPOSITION, null, msgs);
			if (newDisposition != null)
				msgs = ((InternalEObject)newDisposition).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FhirPackage.CLAIM_RESPONSE__DISPOSITION, null, msgs);
			msgs = basicSetDisposition(newDisposition, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FhirPackage.CLAIM_RESPONSE__DISPOSITION, newDisposition, newDisposition));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CodeableConcept getPayeeType() {
		return payeeType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetPayeeType(CodeableConcept newPayeeType, NotificationChain msgs) {
		CodeableConcept oldPayeeType = payeeType;
		payeeType = newPayeeType;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FhirPackage.CLAIM_RESPONSE__PAYEE_TYPE, oldPayeeType, newPayeeType);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setPayeeType(CodeableConcept newPayeeType) {
		if (newPayeeType != payeeType) {
			NotificationChain msgs = null;
			if (payeeType != null)
				msgs = ((InternalEObject)payeeType).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FhirPackage.CLAIM_RESPONSE__PAYEE_TYPE, null, msgs);
			if (newPayeeType != null)
				msgs = ((InternalEObject)newPayeeType).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FhirPackage.CLAIM_RESPONSE__PAYEE_TYPE, null, msgs);
			msgs = basicSetPayeeType(newPayeeType, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FhirPackage.CLAIM_RESPONSE__PAYEE_TYPE, newPayeeType, newPayeeType));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@XmlElement
	public List<ClaimResponseItem> getItem() {
		if (item == null) {
			item = new EObjectContainmentEList<ClaimResponseItem>(ClaimResponseItem.class, this, FhirPackage.CLAIM_RESPONSE__ITEM);
		}
		return item;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@XmlElement
	public List<ClaimResponseAddItem> getAddItem() {
		if (addItem == null) {
			addItem = new EObjectContainmentEList<ClaimResponseAddItem>(ClaimResponseAddItem.class, this, FhirPackage.CLAIM_RESPONSE__ADD_ITEM);
		}
		return addItem;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@XmlElement
	public List<ClaimResponseError> getError() {
		if (error == null) {
			error = new EObjectContainmentEList<ClaimResponseError>(ClaimResponseError.class, this, FhirPackage.CLAIM_RESPONSE__ERROR);
		}
		return error;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Money getTotalCost() {
		return totalCost;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetTotalCost(Money newTotalCost, NotificationChain msgs) {
		Money oldTotalCost = totalCost;
		totalCost = newTotalCost;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FhirPackage.CLAIM_RESPONSE__TOTAL_COST, oldTotalCost, newTotalCost);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setTotalCost(Money newTotalCost) {
		if (newTotalCost != totalCost) {
			NotificationChain msgs = null;
			if (totalCost != null)
				msgs = ((InternalEObject)totalCost).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FhirPackage.CLAIM_RESPONSE__TOTAL_COST, null, msgs);
			if (newTotalCost != null)
				msgs = ((InternalEObject)newTotalCost).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FhirPackage.CLAIM_RESPONSE__TOTAL_COST, null, msgs);
			msgs = basicSetTotalCost(newTotalCost, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FhirPackage.CLAIM_RESPONSE__TOTAL_COST, newTotalCost, newTotalCost));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Money getUnallocDeductable() {
		return unallocDeductable;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetUnallocDeductable(Money newUnallocDeductable, NotificationChain msgs) {
		Money oldUnallocDeductable = unallocDeductable;
		unallocDeductable = newUnallocDeductable;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FhirPackage.CLAIM_RESPONSE__UNALLOC_DEDUCTABLE, oldUnallocDeductable, newUnallocDeductable);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setUnallocDeductable(Money newUnallocDeductable) {
		if (newUnallocDeductable != unallocDeductable) {
			NotificationChain msgs = null;
			if (unallocDeductable != null)
				msgs = ((InternalEObject)unallocDeductable).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FhirPackage.CLAIM_RESPONSE__UNALLOC_DEDUCTABLE, null, msgs);
			if (newUnallocDeductable != null)
				msgs = ((InternalEObject)newUnallocDeductable).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FhirPackage.CLAIM_RESPONSE__UNALLOC_DEDUCTABLE, null, msgs);
			msgs = basicSetUnallocDeductable(newUnallocDeductable, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FhirPackage.CLAIM_RESPONSE__UNALLOC_DEDUCTABLE, newUnallocDeductable, newUnallocDeductable));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Money getTotalBenefit() {
		return totalBenefit;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetTotalBenefit(Money newTotalBenefit, NotificationChain msgs) {
		Money oldTotalBenefit = totalBenefit;
		totalBenefit = newTotalBenefit;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FhirPackage.CLAIM_RESPONSE__TOTAL_BENEFIT, oldTotalBenefit, newTotalBenefit);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setTotalBenefit(Money newTotalBenefit) {
		if (newTotalBenefit != totalBenefit) {
			NotificationChain msgs = null;
			if (totalBenefit != null)
				msgs = ((InternalEObject)totalBenefit).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FhirPackage.CLAIM_RESPONSE__TOTAL_BENEFIT, null, msgs);
			if (newTotalBenefit != null)
				msgs = ((InternalEObject)newTotalBenefit).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FhirPackage.CLAIM_RESPONSE__TOTAL_BENEFIT, null, msgs);
			msgs = basicSetTotalBenefit(newTotalBenefit, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FhirPackage.CLAIM_RESPONSE__TOTAL_BENEFIT, newTotalBenefit, newTotalBenefit));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ClaimResponsePayment getPayment() {
		return payment;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetPayment(ClaimResponsePayment newPayment, NotificationChain msgs) {
		ClaimResponsePayment oldPayment = payment;
		payment = newPayment;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FhirPackage.CLAIM_RESPONSE__PAYMENT, oldPayment, newPayment);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setPayment(ClaimResponsePayment newPayment) {
		if (newPayment != payment) {
			NotificationChain msgs = null;
			if (payment != null)
				msgs = ((InternalEObject)payment).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FhirPackage.CLAIM_RESPONSE__PAYMENT, null, msgs);
			if (newPayment != null)
				msgs = ((InternalEObject)newPayment).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FhirPackage.CLAIM_RESPONSE__PAYMENT, null, msgs);
			msgs = basicSetPayment(newPayment, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FhirPackage.CLAIM_RESPONSE__PAYMENT, newPayment, newPayment));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Coding getReserved() {
		return reserved;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetReserved(Coding newReserved, NotificationChain msgs) {
		Coding oldReserved = reserved;
		reserved = newReserved;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FhirPackage.CLAIM_RESPONSE__RESERVED, oldReserved, newReserved);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setReserved(Coding newReserved) {
		if (newReserved != reserved) {
			NotificationChain msgs = null;
			if (reserved != null)
				msgs = ((InternalEObject)reserved).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FhirPackage.CLAIM_RESPONSE__RESERVED, null, msgs);
			if (newReserved != null)
				msgs = ((InternalEObject)newReserved).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FhirPackage.CLAIM_RESPONSE__RESERVED, null, msgs);
			msgs = basicSetReserved(newReserved, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FhirPackage.CLAIM_RESPONSE__RESERVED, newReserved, newReserved));
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
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FhirPackage.CLAIM_RESPONSE__FORM, oldForm, newForm);
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
				msgs = ((InternalEObject)form).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FhirPackage.CLAIM_RESPONSE__FORM, null, msgs);
			if (newForm != null)
				msgs = ((InternalEObject)newForm).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FhirPackage.CLAIM_RESPONSE__FORM, null, msgs);
			msgs = basicSetForm(newForm, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FhirPackage.CLAIM_RESPONSE__FORM, newForm, newForm));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@XmlElement
	public List<ClaimResponseProcessNote> getProcessNote() {
		if (processNote == null) {
			processNote = new EObjectContainmentEList<ClaimResponseProcessNote>(ClaimResponseProcessNote.class, this, FhirPackage.CLAIM_RESPONSE__PROCESS_NOTE);
		}
		return processNote;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@XmlElement
	public List<Reference> getCommunicationRequest() {
		if (communicationRequest == null) {
			communicationRequest = new EObjectContainmentEList<Reference>(Reference.class, this, FhirPackage.CLAIM_RESPONSE__COMMUNICATION_REQUEST);
		}
		return communicationRequest;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@XmlElement
	public List<ClaimResponseInsurance> getInsurance() {
		if (insurance == null) {
			insurance = new EObjectContainmentEList<ClaimResponseInsurance>(ClaimResponseInsurance.class, this, FhirPackage.CLAIM_RESPONSE__INSURANCE);
		}
		return insurance;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case FhirPackage.CLAIM_RESPONSE__IDENTIFIER:
				return ((InternalEList<?>)getIdentifier()).basicRemove(otherEnd, msgs);
			case FhirPackage.CLAIM_RESPONSE__STATUS:
				return basicSetStatus(null, msgs);
			case FhirPackage.CLAIM_RESPONSE__CREATED:
				return basicSetCreated(null, msgs);
			case FhirPackage.CLAIM_RESPONSE__INSURER:
				return basicSetInsurer(null, msgs);
			case FhirPackage.CLAIM_RESPONSE__REQUEST_PROVIDER:
				return basicSetRequestProvider(null, msgs);
			case FhirPackage.CLAIM_RESPONSE__REQUEST_ORGANIZATION:
				return basicSetRequestOrganization(null, msgs);
			case FhirPackage.CLAIM_RESPONSE__REQUEST:
				return basicSetRequest(null, msgs);
			case FhirPackage.CLAIM_RESPONSE__OUTCOME:
				return basicSetOutcome(null, msgs);
			case FhirPackage.CLAIM_RESPONSE__DISPOSITION:
				return basicSetDisposition(null, msgs);
			case FhirPackage.CLAIM_RESPONSE__PAYEE_TYPE:
				return basicSetPayeeType(null, msgs);
			case FhirPackage.CLAIM_RESPONSE__ITEM:
				return ((InternalEList<?>)getItem()).basicRemove(otherEnd, msgs);
			case FhirPackage.CLAIM_RESPONSE__ADD_ITEM:
				return ((InternalEList<?>)getAddItem()).basicRemove(otherEnd, msgs);
			case FhirPackage.CLAIM_RESPONSE__ERROR:
				return ((InternalEList<?>)getError()).basicRemove(otherEnd, msgs);
			case FhirPackage.CLAIM_RESPONSE__TOTAL_COST:
				return basicSetTotalCost(null, msgs);
			case FhirPackage.CLAIM_RESPONSE__UNALLOC_DEDUCTABLE:
				return basicSetUnallocDeductable(null, msgs);
			case FhirPackage.CLAIM_RESPONSE__TOTAL_BENEFIT:
				return basicSetTotalBenefit(null, msgs);
			case FhirPackage.CLAIM_RESPONSE__PAYMENT:
				return basicSetPayment(null, msgs);
			case FhirPackage.CLAIM_RESPONSE__RESERVED:
				return basicSetReserved(null, msgs);
			case FhirPackage.CLAIM_RESPONSE__FORM:
				return basicSetForm(null, msgs);
			case FhirPackage.CLAIM_RESPONSE__PROCESS_NOTE:
				return ((InternalEList<?>)getProcessNote()).basicRemove(otherEnd, msgs);
			case FhirPackage.CLAIM_RESPONSE__COMMUNICATION_REQUEST:
				return ((InternalEList<?>)getCommunicationRequest()).basicRemove(otherEnd, msgs);
			case FhirPackage.CLAIM_RESPONSE__INSURANCE:
				return ((InternalEList<?>)getInsurance()).basicRemove(otherEnd, msgs);
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
			case FhirPackage.CLAIM_RESPONSE__IDENTIFIER:
				return getIdentifier();
			case FhirPackage.CLAIM_RESPONSE__STATUS:
				return getStatus();
			case FhirPackage.CLAIM_RESPONSE__CREATED:
				return getCreated();
			case FhirPackage.CLAIM_RESPONSE__INSURER:
				return getInsurer();
			case FhirPackage.CLAIM_RESPONSE__REQUEST_PROVIDER:
				return getRequestProvider();
			case FhirPackage.CLAIM_RESPONSE__REQUEST_ORGANIZATION:
				return getRequestOrganization();
			case FhirPackage.CLAIM_RESPONSE__REQUEST:
				return getRequest();
			case FhirPackage.CLAIM_RESPONSE__OUTCOME:
				return getOutcome();
			case FhirPackage.CLAIM_RESPONSE__DISPOSITION:
				return getDisposition();
			case FhirPackage.CLAIM_RESPONSE__PAYEE_TYPE:
				return getPayeeType();
			case FhirPackage.CLAIM_RESPONSE__ITEM:
				return getItem();
			case FhirPackage.CLAIM_RESPONSE__ADD_ITEM:
				return getAddItem();
			case FhirPackage.CLAIM_RESPONSE__ERROR:
				return getError();
			case FhirPackage.CLAIM_RESPONSE__TOTAL_COST:
				return getTotalCost();
			case FhirPackage.CLAIM_RESPONSE__UNALLOC_DEDUCTABLE:
				return getUnallocDeductable();
			case FhirPackage.CLAIM_RESPONSE__TOTAL_BENEFIT:
				return getTotalBenefit();
			case FhirPackage.CLAIM_RESPONSE__PAYMENT:
				return getPayment();
			case FhirPackage.CLAIM_RESPONSE__RESERVED:
				return getReserved();
			case FhirPackage.CLAIM_RESPONSE__FORM:
				return getForm();
			case FhirPackage.CLAIM_RESPONSE__PROCESS_NOTE:
				return getProcessNote();
			case FhirPackage.CLAIM_RESPONSE__COMMUNICATION_REQUEST:
				return getCommunicationRequest();
			case FhirPackage.CLAIM_RESPONSE__INSURANCE:
				return getInsurance();
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
			case FhirPackage.CLAIM_RESPONSE__IDENTIFIER:
				getIdentifier().clear();
				getIdentifier().addAll((Collection<? extends Identifier>)newValue);
				return;
			case FhirPackage.CLAIM_RESPONSE__STATUS:
				setStatus((Code)newValue);
				return;
			case FhirPackage.CLAIM_RESPONSE__CREATED:
				setCreated((DateTime)newValue);
				return;
			case FhirPackage.CLAIM_RESPONSE__INSURER:
				setInsurer((Reference)newValue);
				return;
			case FhirPackage.CLAIM_RESPONSE__REQUEST_PROVIDER:
				setRequestProvider((Reference)newValue);
				return;
			case FhirPackage.CLAIM_RESPONSE__REQUEST_ORGANIZATION:
				setRequestOrganization((Reference)newValue);
				return;
			case FhirPackage.CLAIM_RESPONSE__REQUEST:
				setRequest((Reference)newValue);
				return;
			case FhirPackage.CLAIM_RESPONSE__OUTCOME:
				setOutcome((CodeableConcept)newValue);
				return;
			case FhirPackage.CLAIM_RESPONSE__DISPOSITION:
				setDisposition((org.hl7.fhir.String)newValue);
				return;
			case FhirPackage.CLAIM_RESPONSE__PAYEE_TYPE:
				setPayeeType((CodeableConcept)newValue);
				return;
			case FhirPackage.CLAIM_RESPONSE__ITEM:
				getItem().clear();
				getItem().addAll((Collection<? extends ClaimResponseItem>)newValue);
				return;
			case FhirPackage.CLAIM_RESPONSE__ADD_ITEM:
				getAddItem().clear();
				getAddItem().addAll((Collection<? extends ClaimResponseAddItem>)newValue);
				return;
			case FhirPackage.CLAIM_RESPONSE__ERROR:
				getError().clear();
				getError().addAll((Collection<? extends ClaimResponseError>)newValue);
				return;
			case FhirPackage.CLAIM_RESPONSE__TOTAL_COST:
				setTotalCost((Money)newValue);
				return;
			case FhirPackage.CLAIM_RESPONSE__UNALLOC_DEDUCTABLE:
				setUnallocDeductable((Money)newValue);
				return;
			case FhirPackage.CLAIM_RESPONSE__TOTAL_BENEFIT:
				setTotalBenefit((Money)newValue);
				return;
			case FhirPackage.CLAIM_RESPONSE__PAYMENT:
				setPayment((ClaimResponsePayment)newValue);
				return;
			case FhirPackage.CLAIM_RESPONSE__RESERVED:
				setReserved((Coding)newValue);
				return;
			case FhirPackage.CLAIM_RESPONSE__FORM:
				setForm((CodeableConcept)newValue);
				return;
			case FhirPackage.CLAIM_RESPONSE__PROCESS_NOTE:
				getProcessNote().clear();
				getProcessNote().addAll((Collection<? extends ClaimResponseProcessNote>)newValue);
				return;
			case FhirPackage.CLAIM_RESPONSE__COMMUNICATION_REQUEST:
				getCommunicationRequest().clear();
				getCommunicationRequest().addAll((Collection<? extends Reference>)newValue);
				return;
			case FhirPackage.CLAIM_RESPONSE__INSURANCE:
				getInsurance().clear();
				getInsurance().addAll((Collection<? extends ClaimResponseInsurance>)newValue);
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
			case FhirPackage.CLAIM_RESPONSE__IDENTIFIER:
				getIdentifier().clear();
				return;
			case FhirPackage.CLAIM_RESPONSE__STATUS:
				setStatus((Code)null);
				return;
			case FhirPackage.CLAIM_RESPONSE__CREATED:
				setCreated((DateTime)null);
				return;
			case FhirPackage.CLAIM_RESPONSE__INSURER:
				setInsurer((Reference)null);
				return;
			case FhirPackage.CLAIM_RESPONSE__REQUEST_PROVIDER:
				setRequestProvider((Reference)null);
				return;
			case FhirPackage.CLAIM_RESPONSE__REQUEST_ORGANIZATION:
				setRequestOrganization((Reference)null);
				return;
			case FhirPackage.CLAIM_RESPONSE__REQUEST:
				setRequest((Reference)null);
				return;
			case FhirPackage.CLAIM_RESPONSE__OUTCOME:
				setOutcome((CodeableConcept)null);
				return;
			case FhirPackage.CLAIM_RESPONSE__DISPOSITION:
				setDisposition((org.hl7.fhir.String)null);
				return;
			case FhirPackage.CLAIM_RESPONSE__PAYEE_TYPE:
				setPayeeType((CodeableConcept)null);
				return;
			case FhirPackage.CLAIM_RESPONSE__ITEM:
				getItem().clear();
				return;
			case FhirPackage.CLAIM_RESPONSE__ADD_ITEM:
				getAddItem().clear();
				return;
			case FhirPackage.CLAIM_RESPONSE__ERROR:
				getError().clear();
				return;
			case FhirPackage.CLAIM_RESPONSE__TOTAL_COST:
				setTotalCost((Money)null);
				return;
			case FhirPackage.CLAIM_RESPONSE__UNALLOC_DEDUCTABLE:
				setUnallocDeductable((Money)null);
				return;
			case FhirPackage.CLAIM_RESPONSE__TOTAL_BENEFIT:
				setTotalBenefit((Money)null);
				return;
			case FhirPackage.CLAIM_RESPONSE__PAYMENT:
				setPayment((ClaimResponsePayment)null);
				return;
			case FhirPackage.CLAIM_RESPONSE__RESERVED:
				setReserved((Coding)null);
				return;
			case FhirPackage.CLAIM_RESPONSE__FORM:
				setForm((CodeableConcept)null);
				return;
			case FhirPackage.CLAIM_RESPONSE__PROCESS_NOTE:
				getProcessNote().clear();
				return;
			case FhirPackage.CLAIM_RESPONSE__COMMUNICATION_REQUEST:
				getCommunicationRequest().clear();
				return;
			case FhirPackage.CLAIM_RESPONSE__INSURANCE:
				getInsurance().clear();
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
			case FhirPackage.CLAIM_RESPONSE__IDENTIFIER:
				return identifier != null && !identifier.isEmpty();
			case FhirPackage.CLAIM_RESPONSE__STATUS:
				return status != null;
			case FhirPackage.CLAIM_RESPONSE__CREATED:
				return created != null;
			case FhirPackage.CLAIM_RESPONSE__INSURER:
				return insurer != null;
			case FhirPackage.CLAIM_RESPONSE__REQUEST_PROVIDER:
				return requestProvider != null;
			case FhirPackage.CLAIM_RESPONSE__REQUEST_ORGANIZATION:
				return requestOrganization != null;
			case FhirPackage.CLAIM_RESPONSE__REQUEST:
				return request != null;
			case FhirPackage.CLAIM_RESPONSE__OUTCOME:
				return outcome != null;
			case FhirPackage.CLAIM_RESPONSE__DISPOSITION:
				return disposition != null;
			case FhirPackage.CLAIM_RESPONSE__PAYEE_TYPE:
				return payeeType != null;
			case FhirPackage.CLAIM_RESPONSE__ITEM:
				return item != null && !item.isEmpty();
			case FhirPackage.CLAIM_RESPONSE__ADD_ITEM:
				return addItem != null && !addItem.isEmpty();
			case FhirPackage.CLAIM_RESPONSE__ERROR:
				return error != null && !error.isEmpty();
			case FhirPackage.CLAIM_RESPONSE__TOTAL_COST:
				return totalCost != null;
			case FhirPackage.CLAIM_RESPONSE__UNALLOC_DEDUCTABLE:
				return unallocDeductable != null;
			case FhirPackage.CLAIM_RESPONSE__TOTAL_BENEFIT:
				return totalBenefit != null;
			case FhirPackage.CLAIM_RESPONSE__PAYMENT:
				return payment != null;
			case FhirPackage.CLAIM_RESPONSE__RESERVED:
				return reserved != null;
			case FhirPackage.CLAIM_RESPONSE__FORM:
				return form != null;
			case FhirPackage.CLAIM_RESPONSE__PROCESS_NOTE:
				return processNote != null && !processNote.isEmpty();
			case FhirPackage.CLAIM_RESPONSE__COMMUNICATION_REQUEST:
				return communicationRequest != null && !communicationRequest.isEmpty();
			case FhirPackage.CLAIM_RESPONSE__INSURANCE:
				return insurance != null && !insurance.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //ClaimResponseImpl
