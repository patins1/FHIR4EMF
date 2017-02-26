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

import org.hl7.fhir.Annotation;
import org.hl7.fhir.Code;
import org.hl7.fhir.CodeableConcept;
import org.hl7.fhir.DateTime;
import org.hl7.fhir.FhirPackage;
import org.hl7.fhir.Identifier;
import org.hl7.fhir.Period;
import org.hl7.fhir.Reference;
import org.hl7.fhir.ReferralRequest;
import org.hl7.fhir.ReferralRequestStatus;
import org.hl7.fhir.jaxb.CodeImplAdapter;
import org.hl7.fhir.jaxb.DateTimeImplAdapter;
import org.hl7.fhir.jaxb.ReferralRequestStatusImplAdapter;
import org.hl7.fhir.jaxb.StringImplAdapter;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Referral Request</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.hl7.fhir.impl.ReferralRequestImpl#getIdentifier <em>Identifier</em>}</li>
 *   <li>{@link org.hl7.fhir.impl.ReferralRequestImpl#getBasedOn <em>Based On</em>}</li>
 *   <li>{@link org.hl7.fhir.impl.ReferralRequestImpl#getGroupIdentifier <em>Group Identifier</em>}</li>
 *   <li>{@link org.hl7.fhir.impl.ReferralRequestImpl#getStatus <em>Status</em>}</li>
 *   <li>{@link org.hl7.fhir.impl.ReferralRequestImpl#getIntent <em>Intent</em>}</li>
 *   <li>{@link org.hl7.fhir.impl.ReferralRequestImpl#getType <em>Type</em>}</li>
 *   <li>{@link org.hl7.fhir.impl.ReferralRequestImpl#getPriority <em>Priority</em>}</li>
 *   <li>{@link org.hl7.fhir.impl.ReferralRequestImpl#getServiceRequested <em>Service Requested</em>}</li>
 *   <li>{@link org.hl7.fhir.impl.ReferralRequestImpl#getPatient <em>Patient</em>}</li>
 *   <li>{@link org.hl7.fhir.impl.ReferralRequestImpl#getContext <em>Context</em>}</li>
 *   <li>{@link org.hl7.fhir.impl.ReferralRequestImpl#getFulfillmentTime <em>Fulfillment Time</em>}</li>
 *   <li>{@link org.hl7.fhir.impl.ReferralRequestImpl#getAuthoredOn <em>Authored On</em>}</li>
 *   <li>{@link org.hl7.fhir.impl.ReferralRequestImpl#getRequester <em>Requester</em>}</li>
 *   <li>{@link org.hl7.fhir.impl.ReferralRequestImpl#getSpecialty <em>Specialty</em>}</li>
 *   <li>{@link org.hl7.fhir.impl.ReferralRequestImpl#getRecipient <em>Recipient</em>}</li>
 *   <li>{@link org.hl7.fhir.impl.ReferralRequestImpl#getReason <em>Reason</em>}</li>
 *   <li>{@link org.hl7.fhir.impl.ReferralRequestImpl#getDescription <em>Description</em>}</li>
 *   <li>{@link org.hl7.fhir.impl.ReferralRequestImpl#getSupportingInfo <em>Supporting Info</em>}</li>
 *   <li>{@link org.hl7.fhir.impl.ReferralRequestImpl#getNote <em>Note</em>}</li>
 * </ul>
 *
 * @generated
 */
@XmlType(name = "ReferralRequest", namespace = "http://hl7.org/fhir")
@XmlRootElement(name = "fhir.ReferralRequest")
public class ReferralRequestImpl extends DomainResourceImpl implements ReferralRequest {
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
	 * The cached value of the '{@link #getBasedOn() <em>Based On</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getBasedOn()
	 * @generated
	 * @ordered
	 */
	protected EList<Reference> basedOn;

	/**
	 * The cached value of the '{@link #getGroupIdentifier() <em>Group Identifier</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getGroupIdentifier()
	 * @generated
	 * @ordered
	 */
	protected Identifier groupIdentifier;

	/**
	 * The cached value of the '{@link #getStatus() <em>Status</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getStatus()
	 * @generated
	 * @ordered
	 */
	protected ReferralRequestStatus status;

	/**
	 * The cached value of the '{@link #getIntent() <em>Intent</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getIntent()
	 * @generated
	 * @ordered
	 */
	protected Code intent;

	/**
	 * The cached value of the '{@link #getType() <em>Type</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getType()
	 * @generated
	 * @ordered
	 */
	protected CodeableConcept type;

	/**
	 * The cached value of the '{@link #getPriority() <em>Priority</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPriority()
	 * @generated
	 * @ordered
	 */
	protected CodeableConcept priority;

	/**
	 * The cached value of the '{@link #getServiceRequested() <em>Service Requested</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getServiceRequested()
	 * @generated
	 * @ordered
	 */
	protected EList<CodeableConcept> serviceRequested;

	/**
	 * The cached value of the '{@link #getPatient() <em>Patient</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPatient()
	 * @generated
	 * @ordered
	 */
	protected Reference patient;

	/**
	 * The cached value of the '{@link #getContext() <em>Context</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getContext()
	 * @generated
	 * @ordered
	 */
	protected Reference context;

	/**
	 * The cached value of the '{@link #getFulfillmentTime() <em>Fulfillment Time</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFulfillmentTime()
	 * @generated
	 * @ordered
	 */
	protected Period fulfillmentTime;

	/**
	 * The cached value of the '{@link #getAuthoredOn() <em>Authored On</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAuthoredOn()
	 * @generated
	 * @ordered
	 */
	protected DateTime authoredOn;

	/**
	 * The cached value of the '{@link #getRequester() <em>Requester</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRequester()
	 * @generated
	 * @ordered
	 */
	protected Reference requester;

	/**
	 * The cached value of the '{@link #getSpecialty() <em>Specialty</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSpecialty()
	 * @generated
	 * @ordered
	 */
	protected CodeableConcept specialty;

	/**
	 * The cached value of the '{@link #getRecipient() <em>Recipient</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRecipient()
	 * @generated
	 * @ordered
	 */
	protected EList<Reference> recipient;

	/**
	 * The cached value of the '{@link #getReason() <em>Reason</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getReason()
	 * @generated
	 * @ordered
	 */
	protected CodeableConcept reason;

	/**
	 * The cached value of the '{@link #getDescription() <em>Description</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDescription()
	 * @generated
	 * @ordered
	 */
	protected org.hl7.fhir.String description;

	/**
	 * The cached value of the '{@link #getSupportingInfo() <em>Supporting Info</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSupportingInfo()
	 * @generated
	 * @ordered
	 */
	protected EList<Reference> supportingInfo;

	/**
	 * The cached value of the '{@link #getNote() <em>Note</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNote()
	 * @generated
	 * @ordered
	 */
	protected EList<Annotation> note;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ReferralRequestImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return FhirPackage.eINSTANCE.getReferralRequest();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@XmlElement
	public List<Identifier> getIdentifier() {
		if (identifier == null) {
			identifier = new EObjectContainmentEList<Identifier>(Identifier.class, this, FhirPackage.REFERRAL_REQUEST__IDENTIFIER);
		}
		return identifier;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@XmlElement
	public List<Reference> getBasedOn() {
		if (basedOn == null) {
			basedOn = new EObjectContainmentEList<Reference>(Reference.class, this, FhirPackage.REFERRAL_REQUEST__BASED_ON);
		}
		return basedOn;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Identifier getGroupIdentifier() {
		return groupIdentifier;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetGroupIdentifier(Identifier newGroupIdentifier, NotificationChain msgs) {
		Identifier oldGroupIdentifier = groupIdentifier;
		groupIdentifier = newGroupIdentifier;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FhirPackage.REFERRAL_REQUEST__GROUP_IDENTIFIER, oldGroupIdentifier, newGroupIdentifier);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setGroupIdentifier(Identifier newGroupIdentifier) {
		if (newGroupIdentifier != groupIdentifier) {
			NotificationChain msgs = null;
			if (groupIdentifier != null)
				msgs = ((InternalEObject)groupIdentifier).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FhirPackage.REFERRAL_REQUEST__GROUP_IDENTIFIER, null, msgs);
			if (newGroupIdentifier != null)
				msgs = ((InternalEObject)newGroupIdentifier).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FhirPackage.REFERRAL_REQUEST__GROUP_IDENTIFIER, null, msgs);
			msgs = basicSetGroupIdentifier(newGroupIdentifier, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FhirPackage.REFERRAL_REQUEST__GROUP_IDENTIFIER, newGroupIdentifier, newGroupIdentifier));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@XmlJavaTypeAdapter(ReferralRequestStatusImplAdapter.class)
	@XmlElement(required = true)
	public ReferralRequestStatus getStatus() {
		return status;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetStatus(ReferralRequestStatus newStatus, NotificationChain msgs) {
		ReferralRequestStatus oldStatus = status;
		status = newStatus;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FhirPackage.REFERRAL_REQUEST__STATUS, oldStatus, newStatus);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setStatus(ReferralRequestStatus newStatus) {
		if (newStatus != status) {
			NotificationChain msgs = null;
			if (status != null)
				msgs = ((InternalEObject)status).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FhirPackage.REFERRAL_REQUEST__STATUS, null, msgs);
			if (newStatus != null)
				msgs = ((InternalEObject)newStatus).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FhirPackage.REFERRAL_REQUEST__STATUS, null, msgs);
			msgs = basicSetStatus(newStatus, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FhirPackage.REFERRAL_REQUEST__STATUS, newStatus, newStatus));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@XmlJavaTypeAdapter(CodeImplAdapter.class)
	@XmlElement(required = true)
	public Code getIntent() {
		return intent;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetIntent(Code newIntent, NotificationChain msgs) {
		Code oldIntent = intent;
		intent = newIntent;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FhirPackage.REFERRAL_REQUEST__INTENT, oldIntent, newIntent);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setIntent(Code newIntent) {
		if (newIntent != intent) {
			NotificationChain msgs = null;
			if (intent != null)
				msgs = ((InternalEObject)intent).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FhirPackage.REFERRAL_REQUEST__INTENT, null, msgs);
			if (newIntent != null)
				msgs = ((InternalEObject)newIntent).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FhirPackage.REFERRAL_REQUEST__INTENT, null, msgs);
			msgs = basicSetIntent(newIntent, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FhirPackage.REFERRAL_REQUEST__INTENT, newIntent, newIntent));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CodeableConcept getType() {
		return type;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetType(CodeableConcept newType, NotificationChain msgs) {
		CodeableConcept oldType = type;
		type = newType;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FhirPackage.REFERRAL_REQUEST__TYPE, oldType, newType);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setType(CodeableConcept newType) {
		if (newType != type) {
			NotificationChain msgs = null;
			if (type != null)
				msgs = ((InternalEObject)type).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FhirPackage.REFERRAL_REQUEST__TYPE, null, msgs);
			if (newType != null)
				msgs = ((InternalEObject)newType).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FhirPackage.REFERRAL_REQUEST__TYPE, null, msgs);
			msgs = basicSetType(newType, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FhirPackage.REFERRAL_REQUEST__TYPE, newType, newType));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CodeableConcept getPriority() {
		return priority;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetPriority(CodeableConcept newPriority, NotificationChain msgs) {
		CodeableConcept oldPriority = priority;
		priority = newPriority;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FhirPackage.REFERRAL_REQUEST__PRIORITY, oldPriority, newPriority);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setPriority(CodeableConcept newPriority) {
		if (newPriority != priority) {
			NotificationChain msgs = null;
			if (priority != null)
				msgs = ((InternalEObject)priority).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FhirPackage.REFERRAL_REQUEST__PRIORITY, null, msgs);
			if (newPriority != null)
				msgs = ((InternalEObject)newPriority).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FhirPackage.REFERRAL_REQUEST__PRIORITY, null, msgs);
			msgs = basicSetPriority(newPriority, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FhirPackage.REFERRAL_REQUEST__PRIORITY, newPriority, newPriority));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@XmlElement
	public List<CodeableConcept> getServiceRequested() {
		if (serviceRequested == null) {
			serviceRequested = new EObjectContainmentEList<CodeableConcept>(CodeableConcept.class, this, FhirPackage.REFERRAL_REQUEST__SERVICE_REQUESTED);
		}
		return serviceRequested;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Reference getPatient() {
		return patient;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetPatient(Reference newPatient, NotificationChain msgs) {
		Reference oldPatient = patient;
		patient = newPatient;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FhirPackage.REFERRAL_REQUEST__PATIENT, oldPatient, newPatient);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setPatient(Reference newPatient) {
		if (newPatient != patient) {
			NotificationChain msgs = null;
			if (patient != null)
				msgs = ((InternalEObject)patient).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FhirPackage.REFERRAL_REQUEST__PATIENT, null, msgs);
			if (newPatient != null)
				msgs = ((InternalEObject)newPatient).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FhirPackage.REFERRAL_REQUEST__PATIENT, null, msgs);
			msgs = basicSetPatient(newPatient, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FhirPackage.REFERRAL_REQUEST__PATIENT, newPatient, newPatient));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Reference getContext() {
		return context;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetContext(Reference newContext, NotificationChain msgs) {
		Reference oldContext = context;
		context = newContext;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FhirPackage.REFERRAL_REQUEST__CONTEXT, oldContext, newContext);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setContext(Reference newContext) {
		if (newContext != context) {
			NotificationChain msgs = null;
			if (context != null)
				msgs = ((InternalEObject)context).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FhirPackage.REFERRAL_REQUEST__CONTEXT, null, msgs);
			if (newContext != null)
				msgs = ((InternalEObject)newContext).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FhirPackage.REFERRAL_REQUEST__CONTEXT, null, msgs);
			msgs = basicSetContext(newContext, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FhirPackage.REFERRAL_REQUEST__CONTEXT, newContext, newContext));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Period getFulfillmentTime() {
		return fulfillmentTime;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetFulfillmentTime(Period newFulfillmentTime, NotificationChain msgs) {
		Period oldFulfillmentTime = fulfillmentTime;
		fulfillmentTime = newFulfillmentTime;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FhirPackage.REFERRAL_REQUEST__FULFILLMENT_TIME, oldFulfillmentTime, newFulfillmentTime);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setFulfillmentTime(Period newFulfillmentTime) {
		if (newFulfillmentTime != fulfillmentTime) {
			NotificationChain msgs = null;
			if (fulfillmentTime != null)
				msgs = ((InternalEObject)fulfillmentTime).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FhirPackage.REFERRAL_REQUEST__FULFILLMENT_TIME, null, msgs);
			if (newFulfillmentTime != null)
				msgs = ((InternalEObject)newFulfillmentTime).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FhirPackage.REFERRAL_REQUEST__FULFILLMENT_TIME, null, msgs);
			msgs = basicSetFulfillmentTime(newFulfillmentTime, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FhirPackage.REFERRAL_REQUEST__FULFILLMENT_TIME, newFulfillmentTime, newFulfillmentTime));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@XmlJavaTypeAdapter(DateTimeImplAdapter.class)
	public DateTime getAuthoredOn() {
		return authoredOn;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetAuthoredOn(DateTime newAuthoredOn, NotificationChain msgs) {
		DateTime oldAuthoredOn = authoredOn;
		authoredOn = newAuthoredOn;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FhirPackage.REFERRAL_REQUEST__AUTHORED_ON, oldAuthoredOn, newAuthoredOn);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setAuthoredOn(DateTime newAuthoredOn) {
		if (newAuthoredOn != authoredOn) {
			NotificationChain msgs = null;
			if (authoredOn != null)
				msgs = ((InternalEObject)authoredOn).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FhirPackage.REFERRAL_REQUEST__AUTHORED_ON, null, msgs);
			if (newAuthoredOn != null)
				msgs = ((InternalEObject)newAuthoredOn).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FhirPackage.REFERRAL_REQUEST__AUTHORED_ON, null, msgs);
			msgs = basicSetAuthoredOn(newAuthoredOn, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FhirPackage.REFERRAL_REQUEST__AUTHORED_ON, newAuthoredOn, newAuthoredOn));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Reference getRequester() {
		return requester;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetRequester(Reference newRequester, NotificationChain msgs) {
		Reference oldRequester = requester;
		requester = newRequester;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FhirPackage.REFERRAL_REQUEST__REQUESTER, oldRequester, newRequester);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setRequester(Reference newRequester) {
		if (newRequester != requester) {
			NotificationChain msgs = null;
			if (requester != null)
				msgs = ((InternalEObject)requester).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FhirPackage.REFERRAL_REQUEST__REQUESTER, null, msgs);
			if (newRequester != null)
				msgs = ((InternalEObject)newRequester).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FhirPackage.REFERRAL_REQUEST__REQUESTER, null, msgs);
			msgs = basicSetRequester(newRequester, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FhirPackage.REFERRAL_REQUEST__REQUESTER, newRequester, newRequester));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CodeableConcept getSpecialty() {
		return specialty;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetSpecialty(CodeableConcept newSpecialty, NotificationChain msgs) {
		CodeableConcept oldSpecialty = specialty;
		specialty = newSpecialty;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FhirPackage.REFERRAL_REQUEST__SPECIALTY, oldSpecialty, newSpecialty);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setSpecialty(CodeableConcept newSpecialty) {
		if (newSpecialty != specialty) {
			NotificationChain msgs = null;
			if (specialty != null)
				msgs = ((InternalEObject)specialty).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FhirPackage.REFERRAL_REQUEST__SPECIALTY, null, msgs);
			if (newSpecialty != null)
				msgs = ((InternalEObject)newSpecialty).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FhirPackage.REFERRAL_REQUEST__SPECIALTY, null, msgs);
			msgs = basicSetSpecialty(newSpecialty, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FhirPackage.REFERRAL_REQUEST__SPECIALTY, newSpecialty, newSpecialty));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@XmlElement
	public List<Reference> getRecipient() {
		if (recipient == null) {
			recipient = new EObjectContainmentEList<Reference>(Reference.class, this, FhirPackage.REFERRAL_REQUEST__RECIPIENT);
		}
		return recipient;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CodeableConcept getReason() {
		return reason;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetReason(CodeableConcept newReason, NotificationChain msgs) {
		CodeableConcept oldReason = reason;
		reason = newReason;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FhirPackage.REFERRAL_REQUEST__REASON, oldReason, newReason);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setReason(CodeableConcept newReason) {
		if (newReason != reason) {
			NotificationChain msgs = null;
			if (reason != null)
				msgs = ((InternalEObject)reason).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FhirPackage.REFERRAL_REQUEST__REASON, null, msgs);
			if (newReason != null)
				msgs = ((InternalEObject)newReason).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FhirPackage.REFERRAL_REQUEST__REASON, null, msgs);
			msgs = basicSetReason(newReason, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FhirPackage.REFERRAL_REQUEST__REASON, newReason, newReason));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@XmlJavaTypeAdapter(StringImplAdapter.class)
	public org.hl7.fhir.String getDescription() {
		return description;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetDescription(org.hl7.fhir.String newDescription, NotificationChain msgs) {
		org.hl7.fhir.String oldDescription = description;
		description = newDescription;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FhirPackage.REFERRAL_REQUEST__DESCRIPTION, oldDescription, newDescription);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setDescription(org.hl7.fhir.String newDescription) {
		if (newDescription != description) {
			NotificationChain msgs = null;
			if (description != null)
				msgs = ((InternalEObject)description).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FhirPackage.REFERRAL_REQUEST__DESCRIPTION, null, msgs);
			if (newDescription != null)
				msgs = ((InternalEObject)newDescription).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FhirPackage.REFERRAL_REQUEST__DESCRIPTION, null, msgs);
			msgs = basicSetDescription(newDescription, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FhirPackage.REFERRAL_REQUEST__DESCRIPTION, newDescription, newDescription));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@XmlElement
	public List<Reference> getSupportingInfo() {
		if (supportingInfo == null) {
			supportingInfo = new EObjectContainmentEList<Reference>(Reference.class, this, FhirPackage.REFERRAL_REQUEST__SUPPORTING_INFO);
		}
		return supportingInfo;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@XmlElement
	public List<Annotation> getNote() {
		if (note == null) {
			note = new EObjectContainmentEList<Annotation>(Annotation.class, this, FhirPackage.REFERRAL_REQUEST__NOTE);
		}
		return note;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case FhirPackage.REFERRAL_REQUEST__IDENTIFIER:
				return ((InternalEList<?>)getIdentifier()).basicRemove(otherEnd, msgs);
			case FhirPackage.REFERRAL_REQUEST__BASED_ON:
				return ((InternalEList<?>)getBasedOn()).basicRemove(otherEnd, msgs);
			case FhirPackage.REFERRAL_REQUEST__GROUP_IDENTIFIER:
				return basicSetGroupIdentifier(null, msgs);
			case FhirPackage.REFERRAL_REQUEST__STATUS:
				return basicSetStatus(null, msgs);
			case FhirPackage.REFERRAL_REQUEST__INTENT:
				return basicSetIntent(null, msgs);
			case FhirPackage.REFERRAL_REQUEST__TYPE:
				return basicSetType(null, msgs);
			case FhirPackage.REFERRAL_REQUEST__PRIORITY:
				return basicSetPriority(null, msgs);
			case FhirPackage.REFERRAL_REQUEST__SERVICE_REQUESTED:
				return ((InternalEList<?>)getServiceRequested()).basicRemove(otherEnd, msgs);
			case FhirPackage.REFERRAL_REQUEST__PATIENT:
				return basicSetPatient(null, msgs);
			case FhirPackage.REFERRAL_REQUEST__CONTEXT:
				return basicSetContext(null, msgs);
			case FhirPackage.REFERRAL_REQUEST__FULFILLMENT_TIME:
				return basicSetFulfillmentTime(null, msgs);
			case FhirPackage.REFERRAL_REQUEST__AUTHORED_ON:
				return basicSetAuthoredOn(null, msgs);
			case FhirPackage.REFERRAL_REQUEST__REQUESTER:
				return basicSetRequester(null, msgs);
			case FhirPackage.REFERRAL_REQUEST__SPECIALTY:
				return basicSetSpecialty(null, msgs);
			case FhirPackage.REFERRAL_REQUEST__RECIPIENT:
				return ((InternalEList<?>)getRecipient()).basicRemove(otherEnd, msgs);
			case FhirPackage.REFERRAL_REQUEST__REASON:
				return basicSetReason(null, msgs);
			case FhirPackage.REFERRAL_REQUEST__DESCRIPTION:
				return basicSetDescription(null, msgs);
			case FhirPackage.REFERRAL_REQUEST__SUPPORTING_INFO:
				return ((InternalEList<?>)getSupportingInfo()).basicRemove(otherEnd, msgs);
			case FhirPackage.REFERRAL_REQUEST__NOTE:
				return ((InternalEList<?>)getNote()).basicRemove(otherEnd, msgs);
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
			case FhirPackage.REFERRAL_REQUEST__IDENTIFIER:
				return getIdentifier();
			case FhirPackage.REFERRAL_REQUEST__BASED_ON:
				return getBasedOn();
			case FhirPackage.REFERRAL_REQUEST__GROUP_IDENTIFIER:
				return getGroupIdentifier();
			case FhirPackage.REFERRAL_REQUEST__STATUS:
				return getStatus();
			case FhirPackage.REFERRAL_REQUEST__INTENT:
				return getIntent();
			case FhirPackage.REFERRAL_REQUEST__TYPE:
				return getType();
			case FhirPackage.REFERRAL_REQUEST__PRIORITY:
				return getPriority();
			case FhirPackage.REFERRAL_REQUEST__SERVICE_REQUESTED:
				return getServiceRequested();
			case FhirPackage.REFERRAL_REQUEST__PATIENT:
				return getPatient();
			case FhirPackage.REFERRAL_REQUEST__CONTEXT:
				return getContext();
			case FhirPackage.REFERRAL_REQUEST__FULFILLMENT_TIME:
				return getFulfillmentTime();
			case FhirPackage.REFERRAL_REQUEST__AUTHORED_ON:
				return getAuthoredOn();
			case FhirPackage.REFERRAL_REQUEST__REQUESTER:
				return getRequester();
			case FhirPackage.REFERRAL_REQUEST__SPECIALTY:
				return getSpecialty();
			case FhirPackage.REFERRAL_REQUEST__RECIPIENT:
				return getRecipient();
			case FhirPackage.REFERRAL_REQUEST__REASON:
				return getReason();
			case FhirPackage.REFERRAL_REQUEST__DESCRIPTION:
				return getDescription();
			case FhirPackage.REFERRAL_REQUEST__SUPPORTING_INFO:
				return getSupportingInfo();
			case FhirPackage.REFERRAL_REQUEST__NOTE:
				return getNote();
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
			case FhirPackage.REFERRAL_REQUEST__IDENTIFIER:
				getIdentifier().clear();
				getIdentifier().addAll((Collection<? extends Identifier>)newValue);
				return;
			case FhirPackage.REFERRAL_REQUEST__BASED_ON:
				getBasedOn().clear();
				getBasedOn().addAll((Collection<? extends Reference>)newValue);
				return;
			case FhirPackage.REFERRAL_REQUEST__GROUP_IDENTIFIER:
				setGroupIdentifier((Identifier)newValue);
				return;
			case FhirPackage.REFERRAL_REQUEST__STATUS:
				setStatus((ReferralRequestStatus)newValue);
				return;
			case FhirPackage.REFERRAL_REQUEST__INTENT:
				setIntent((Code)newValue);
				return;
			case FhirPackage.REFERRAL_REQUEST__TYPE:
				setType((CodeableConcept)newValue);
				return;
			case FhirPackage.REFERRAL_REQUEST__PRIORITY:
				setPriority((CodeableConcept)newValue);
				return;
			case FhirPackage.REFERRAL_REQUEST__SERVICE_REQUESTED:
				getServiceRequested().clear();
				getServiceRequested().addAll((Collection<? extends CodeableConcept>)newValue);
				return;
			case FhirPackage.REFERRAL_REQUEST__PATIENT:
				setPatient((Reference)newValue);
				return;
			case FhirPackage.REFERRAL_REQUEST__CONTEXT:
				setContext((Reference)newValue);
				return;
			case FhirPackage.REFERRAL_REQUEST__FULFILLMENT_TIME:
				setFulfillmentTime((Period)newValue);
				return;
			case FhirPackage.REFERRAL_REQUEST__AUTHORED_ON:
				setAuthoredOn((DateTime)newValue);
				return;
			case FhirPackage.REFERRAL_REQUEST__REQUESTER:
				setRequester((Reference)newValue);
				return;
			case FhirPackage.REFERRAL_REQUEST__SPECIALTY:
				setSpecialty((CodeableConcept)newValue);
				return;
			case FhirPackage.REFERRAL_REQUEST__RECIPIENT:
				getRecipient().clear();
				getRecipient().addAll((Collection<? extends Reference>)newValue);
				return;
			case FhirPackage.REFERRAL_REQUEST__REASON:
				setReason((CodeableConcept)newValue);
				return;
			case FhirPackage.REFERRAL_REQUEST__DESCRIPTION:
				setDescription((org.hl7.fhir.String)newValue);
				return;
			case FhirPackage.REFERRAL_REQUEST__SUPPORTING_INFO:
				getSupportingInfo().clear();
				getSupportingInfo().addAll((Collection<? extends Reference>)newValue);
				return;
			case FhirPackage.REFERRAL_REQUEST__NOTE:
				getNote().clear();
				getNote().addAll((Collection<? extends Annotation>)newValue);
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
			case FhirPackage.REFERRAL_REQUEST__IDENTIFIER:
				getIdentifier().clear();
				return;
			case FhirPackage.REFERRAL_REQUEST__BASED_ON:
				getBasedOn().clear();
				return;
			case FhirPackage.REFERRAL_REQUEST__GROUP_IDENTIFIER:
				setGroupIdentifier((Identifier)null);
				return;
			case FhirPackage.REFERRAL_REQUEST__STATUS:
				setStatus((ReferralRequestStatus)null);
				return;
			case FhirPackage.REFERRAL_REQUEST__INTENT:
				setIntent((Code)null);
				return;
			case FhirPackage.REFERRAL_REQUEST__TYPE:
				setType((CodeableConcept)null);
				return;
			case FhirPackage.REFERRAL_REQUEST__PRIORITY:
				setPriority((CodeableConcept)null);
				return;
			case FhirPackage.REFERRAL_REQUEST__SERVICE_REQUESTED:
				getServiceRequested().clear();
				return;
			case FhirPackage.REFERRAL_REQUEST__PATIENT:
				setPatient((Reference)null);
				return;
			case FhirPackage.REFERRAL_REQUEST__CONTEXT:
				setContext((Reference)null);
				return;
			case FhirPackage.REFERRAL_REQUEST__FULFILLMENT_TIME:
				setFulfillmentTime((Period)null);
				return;
			case FhirPackage.REFERRAL_REQUEST__AUTHORED_ON:
				setAuthoredOn((DateTime)null);
				return;
			case FhirPackage.REFERRAL_REQUEST__REQUESTER:
				setRequester((Reference)null);
				return;
			case FhirPackage.REFERRAL_REQUEST__SPECIALTY:
				setSpecialty((CodeableConcept)null);
				return;
			case FhirPackage.REFERRAL_REQUEST__RECIPIENT:
				getRecipient().clear();
				return;
			case FhirPackage.REFERRAL_REQUEST__REASON:
				setReason((CodeableConcept)null);
				return;
			case FhirPackage.REFERRAL_REQUEST__DESCRIPTION:
				setDescription((org.hl7.fhir.String)null);
				return;
			case FhirPackage.REFERRAL_REQUEST__SUPPORTING_INFO:
				getSupportingInfo().clear();
				return;
			case FhirPackage.REFERRAL_REQUEST__NOTE:
				getNote().clear();
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
			case FhirPackage.REFERRAL_REQUEST__IDENTIFIER:
				return identifier != null && !identifier.isEmpty();
			case FhirPackage.REFERRAL_REQUEST__BASED_ON:
				return basedOn != null && !basedOn.isEmpty();
			case FhirPackage.REFERRAL_REQUEST__GROUP_IDENTIFIER:
				return groupIdentifier != null;
			case FhirPackage.REFERRAL_REQUEST__STATUS:
				return status != null;
			case FhirPackage.REFERRAL_REQUEST__INTENT:
				return intent != null;
			case FhirPackage.REFERRAL_REQUEST__TYPE:
				return type != null;
			case FhirPackage.REFERRAL_REQUEST__PRIORITY:
				return priority != null;
			case FhirPackage.REFERRAL_REQUEST__SERVICE_REQUESTED:
				return serviceRequested != null && !serviceRequested.isEmpty();
			case FhirPackage.REFERRAL_REQUEST__PATIENT:
				return patient != null;
			case FhirPackage.REFERRAL_REQUEST__CONTEXT:
				return context != null;
			case FhirPackage.REFERRAL_REQUEST__FULFILLMENT_TIME:
				return fulfillmentTime != null;
			case FhirPackage.REFERRAL_REQUEST__AUTHORED_ON:
				return authoredOn != null;
			case FhirPackage.REFERRAL_REQUEST__REQUESTER:
				return requester != null;
			case FhirPackage.REFERRAL_REQUEST__SPECIALTY:
				return specialty != null;
			case FhirPackage.REFERRAL_REQUEST__RECIPIENT:
				return recipient != null && !recipient.isEmpty();
			case FhirPackage.REFERRAL_REQUEST__REASON:
				return reason != null;
			case FhirPackage.REFERRAL_REQUEST__DESCRIPTION:
				return description != null;
			case FhirPackage.REFERRAL_REQUEST__SUPPORTING_INFO:
				return supportingInfo != null && !supportingInfo.isEmpty();
			case FhirPackage.REFERRAL_REQUEST__NOTE:
				return note != null && !note.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //ReferralRequestImpl
