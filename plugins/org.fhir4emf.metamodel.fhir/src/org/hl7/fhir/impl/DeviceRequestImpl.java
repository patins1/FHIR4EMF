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
import org.hl7.fhir.DeviceRequest;
import org.hl7.fhir.DeviceRequestRequester;
import org.hl7.fhir.FhirPackage;
import org.hl7.fhir.Identifier;
import org.hl7.fhir.Period;
import org.hl7.fhir.Reference;
import org.hl7.fhir.Timing;
import org.hl7.fhir.jaxb.CodeImplAdapter;
import org.hl7.fhir.jaxb.DateTimeImplAdapter;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Device Request</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.hl7.fhir.impl.DeviceRequestImpl#getIdentifier <em>Identifier</em>}</li>
 *   <li>{@link org.hl7.fhir.impl.DeviceRequestImpl#getDefinition <em>Definition</em>}</li>
 *   <li>{@link org.hl7.fhir.impl.DeviceRequestImpl#getBasedOn <em>Based On</em>}</li>
 *   <li>{@link org.hl7.fhir.impl.DeviceRequestImpl#getPriorRequest <em>Prior Request</em>}</li>
 *   <li>{@link org.hl7.fhir.impl.DeviceRequestImpl#getGroupIdentifier <em>Group Identifier</em>}</li>
 *   <li>{@link org.hl7.fhir.impl.DeviceRequestImpl#getStatus <em>Status</em>}</li>
 *   <li>{@link org.hl7.fhir.impl.DeviceRequestImpl#getIntent <em>Intent</em>}</li>
 *   <li>{@link org.hl7.fhir.impl.DeviceRequestImpl#getPriority <em>Priority</em>}</li>
 *   <li>{@link org.hl7.fhir.impl.DeviceRequestImpl#getCodeReference <em>Code Reference</em>}</li>
 *   <li>{@link org.hl7.fhir.impl.DeviceRequestImpl#getCodeCodeableConcept <em>Code Codeable Concept</em>}</li>
 *   <li>{@link org.hl7.fhir.impl.DeviceRequestImpl#getSubject <em>Subject</em>}</li>
 *   <li>{@link org.hl7.fhir.impl.DeviceRequestImpl#getContext <em>Context</em>}</li>
 *   <li>{@link org.hl7.fhir.impl.DeviceRequestImpl#getOccurrenceDateTime <em>Occurrence Date Time</em>}</li>
 *   <li>{@link org.hl7.fhir.impl.DeviceRequestImpl#getOccurrencePeriod <em>Occurrence Period</em>}</li>
 *   <li>{@link org.hl7.fhir.impl.DeviceRequestImpl#getOccurrenceTiming <em>Occurrence Timing</em>}</li>
 *   <li>{@link org.hl7.fhir.impl.DeviceRequestImpl#getAuthoredOn <em>Authored On</em>}</li>
 *   <li>{@link org.hl7.fhir.impl.DeviceRequestImpl#getRequester <em>Requester</em>}</li>
 *   <li>{@link org.hl7.fhir.impl.DeviceRequestImpl#getPerformerType <em>Performer Type</em>}</li>
 *   <li>{@link org.hl7.fhir.impl.DeviceRequestImpl#getPerformer <em>Performer</em>}</li>
 *   <li>{@link org.hl7.fhir.impl.DeviceRequestImpl#getReasonCode <em>Reason Code</em>}</li>
 *   <li>{@link org.hl7.fhir.impl.DeviceRequestImpl#getReasonReference <em>Reason Reference</em>}</li>
 *   <li>{@link org.hl7.fhir.impl.DeviceRequestImpl#getSupportingInfo <em>Supporting Info</em>}</li>
 *   <li>{@link org.hl7.fhir.impl.DeviceRequestImpl#getNote <em>Note</em>}</li>
 *   <li>{@link org.hl7.fhir.impl.DeviceRequestImpl#getRelevantHistory <em>Relevant History</em>}</li>
 * </ul>
 *
 * @generated
 */
@XmlType(name = "DeviceRequest", namespace = "http://hl7.org/fhir")
@XmlRootElement(name = "fhir.DeviceRequest")
public class DeviceRequestImpl extends DomainResourceImpl implements DeviceRequest {
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
	 * The cached value of the '{@link #getDefinition() <em>Definition</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDefinition()
	 * @generated
	 * @ordered
	 */
	protected EList<Reference> definition;

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
	 * The cached value of the '{@link #getPriorRequest() <em>Prior Request</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPriorRequest()
	 * @generated
	 * @ordered
	 */
	protected EList<Reference> priorRequest;

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
	protected Code status;

	/**
	 * The cached value of the '{@link #getIntent() <em>Intent</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getIntent()
	 * @generated
	 * @ordered
	 */
	protected CodeableConcept intent;

	/**
	 * The cached value of the '{@link #getPriority() <em>Priority</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPriority()
	 * @generated
	 * @ordered
	 */
	protected Code priority;

	/**
	 * The cached value of the '{@link #getCodeReference() <em>Code Reference</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCodeReference()
	 * @generated
	 * @ordered
	 */
	protected Reference codeReference;

	/**
	 * The cached value of the '{@link #getCodeCodeableConcept() <em>Code Codeable Concept</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCodeCodeableConcept()
	 * @generated
	 * @ordered
	 */
	protected CodeableConcept codeCodeableConcept;

	/**
	 * The cached value of the '{@link #getSubject() <em>Subject</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSubject()
	 * @generated
	 * @ordered
	 */
	protected Reference subject;

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
	 * The cached value of the '{@link #getOccurrenceDateTime() <em>Occurrence Date Time</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOccurrenceDateTime()
	 * @generated
	 * @ordered
	 */
	protected DateTime occurrenceDateTime;

	/**
	 * The cached value of the '{@link #getOccurrencePeriod() <em>Occurrence Period</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOccurrencePeriod()
	 * @generated
	 * @ordered
	 */
	protected Period occurrencePeriod;

	/**
	 * The cached value of the '{@link #getOccurrenceTiming() <em>Occurrence Timing</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOccurrenceTiming()
	 * @generated
	 * @ordered
	 */
	protected Timing occurrenceTiming;

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
	protected DeviceRequestRequester requester;

	/**
	 * The cached value of the '{@link #getPerformerType() <em>Performer Type</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPerformerType()
	 * @generated
	 * @ordered
	 */
	protected CodeableConcept performerType;

	/**
	 * The cached value of the '{@link #getPerformer() <em>Performer</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPerformer()
	 * @generated
	 * @ordered
	 */
	protected Reference performer;

	/**
	 * The cached value of the '{@link #getReasonCode() <em>Reason Code</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getReasonCode()
	 * @generated
	 * @ordered
	 */
	protected EList<CodeableConcept> reasonCode;

	/**
	 * The cached value of the '{@link #getReasonReference() <em>Reason Reference</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getReasonReference()
	 * @generated
	 * @ordered
	 */
	protected EList<Reference> reasonReference;

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
	 * The cached value of the '{@link #getRelevantHistory() <em>Relevant History</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRelevantHistory()
	 * @generated
	 * @ordered
	 */
	protected EList<Reference> relevantHistory;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected DeviceRequestImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return FhirPackage.eINSTANCE.getDeviceRequest();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@XmlElement
	public List<Identifier> getIdentifier() {
		if (identifier == null) {
			identifier = new EObjectContainmentEList<Identifier>(Identifier.class, this, FhirPackage.DEVICE_REQUEST__IDENTIFIER);
		}
		return identifier;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@XmlElement
	public List<Reference> getDefinition() {
		if (definition == null) {
			definition = new EObjectContainmentEList<Reference>(Reference.class, this, FhirPackage.DEVICE_REQUEST__DEFINITION);
		}
		return definition;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@XmlElement
	public List<Reference> getBasedOn() {
		if (basedOn == null) {
			basedOn = new EObjectContainmentEList<Reference>(Reference.class, this, FhirPackage.DEVICE_REQUEST__BASED_ON);
		}
		return basedOn;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@XmlElement
	public List<Reference> getPriorRequest() {
		if (priorRequest == null) {
			priorRequest = new EObjectContainmentEList<Reference>(Reference.class, this, FhirPackage.DEVICE_REQUEST__PRIOR_REQUEST);
		}
		return priorRequest;
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
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FhirPackage.DEVICE_REQUEST__GROUP_IDENTIFIER, oldGroupIdentifier, newGroupIdentifier);
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
				msgs = ((InternalEObject)groupIdentifier).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FhirPackage.DEVICE_REQUEST__GROUP_IDENTIFIER, null, msgs);
			if (newGroupIdentifier != null)
				msgs = ((InternalEObject)newGroupIdentifier).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FhirPackage.DEVICE_REQUEST__GROUP_IDENTIFIER, null, msgs);
			msgs = basicSetGroupIdentifier(newGroupIdentifier, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FhirPackage.DEVICE_REQUEST__GROUP_IDENTIFIER, newGroupIdentifier, newGroupIdentifier));
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
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FhirPackage.DEVICE_REQUEST__STATUS, oldStatus, newStatus);
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
				msgs = ((InternalEObject)status).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FhirPackage.DEVICE_REQUEST__STATUS, null, msgs);
			if (newStatus != null)
				msgs = ((InternalEObject)newStatus).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FhirPackage.DEVICE_REQUEST__STATUS, null, msgs);
			msgs = basicSetStatus(newStatus, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FhirPackage.DEVICE_REQUEST__STATUS, newStatus, newStatus));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@XmlElement(required = true)
	public CodeableConcept getIntent() {
		return intent;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetIntent(CodeableConcept newIntent, NotificationChain msgs) {
		CodeableConcept oldIntent = intent;
		intent = newIntent;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FhirPackage.DEVICE_REQUEST__INTENT, oldIntent, newIntent);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setIntent(CodeableConcept newIntent) {
		if (newIntent != intent) {
			NotificationChain msgs = null;
			if (intent != null)
				msgs = ((InternalEObject)intent).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FhirPackage.DEVICE_REQUEST__INTENT, null, msgs);
			if (newIntent != null)
				msgs = ((InternalEObject)newIntent).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FhirPackage.DEVICE_REQUEST__INTENT, null, msgs);
			msgs = basicSetIntent(newIntent, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FhirPackage.DEVICE_REQUEST__INTENT, newIntent, newIntent));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@XmlJavaTypeAdapter(CodeImplAdapter.class)
	public Code getPriority() {
		return priority;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetPriority(Code newPriority, NotificationChain msgs) {
		Code oldPriority = priority;
		priority = newPriority;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FhirPackage.DEVICE_REQUEST__PRIORITY, oldPriority, newPriority);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setPriority(Code newPriority) {
		if (newPriority != priority) {
			NotificationChain msgs = null;
			if (priority != null)
				msgs = ((InternalEObject)priority).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FhirPackage.DEVICE_REQUEST__PRIORITY, null, msgs);
			if (newPriority != null)
				msgs = ((InternalEObject)newPriority).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FhirPackage.DEVICE_REQUEST__PRIORITY, null, msgs);
			msgs = basicSetPriority(newPriority, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FhirPackage.DEVICE_REQUEST__PRIORITY, newPriority, newPriority));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Reference getCodeReference() {
		return codeReference;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetCodeReference(Reference newCodeReference, NotificationChain msgs) {
		Reference oldCodeReference = codeReference;
		codeReference = newCodeReference;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FhirPackage.DEVICE_REQUEST__CODE_REFERENCE, oldCodeReference, newCodeReference);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setCodeReference(Reference newCodeReference) {
		if (newCodeReference != codeReference) {
			NotificationChain msgs = null;
			if (codeReference != null)
				msgs = ((InternalEObject)codeReference).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FhirPackage.DEVICE_REQUEST__CODE_REFERENCE, null, msgs);
			if (newCodeReference != null)
				msgs = ((InternalEObject)newCodeReference).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FhirPackage.DEVICE_REQUEST__CODE_REFERENCE, null, msgs);
			msgs = basicSetCodeReference(newCodeReference, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FhirPackage.DEVICE_REQUEST__CODE_REFERENCE, newCodeReference, newCodeReference));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CodeableConcept getCodeCodeableConcept() {
		return codeCodeableConcept;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetCodeCodeableConcept(CodeableConcept newCodeCodeableConcept, NotificationChain msgs) {
		CodeableConcept oldCodeCodeableConcept = codeCodeableConcept;
		codeCodeableConcept = newCodeCodeableConcept;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FhirPackage.DEVICE_REQUEST__CODE_CODEABLE_CONCEPT, oldCodeCodeableConcept, newCodeCodeableConcept);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setCodeCodeableConcept(CodeableConcept newCodeCodeableConcept) {
		if (newCodeCodeableConcept != codeCodeableConcept) {
			NotificationChain msgs = null;
			if (codeCodeableConcept != null)
				msgs = ((InternalEObject)codeCodeableConcept).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FhirPackage.DEVICE_REQUEST__CODE_CODEABLE_CONCEPT, null, msgs);
			if (newCodeCodeableConcept != null)
				msgs = ((InternalEObject)newCodeCodeableConcept).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FhirPackage.DEVICE_REQUEST__CODE_CODEABLE_CONCEPT, null, msgs);
			msgs = basicSetCodeCodeableConcept(newCodeCodeableConcept, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FhirPackage.DEVICE_REQUEST__CODE_CODEABLE_CONCEPT, newCodeCodeableConcept, newCodeCodeableConcept));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@XmlElement(required = true)
	public Reference getSubject() {
		return subject;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetSubject(Reference newSubject, NotificationChain msgs) {
		Reference oldSubject = subject;
		subject = newSubject;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FhirPackage.DEVICE_REQUEST__SUBJECT, oldSubject, newSubject);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setSubject(Reference newSubject) {
		if (newSubject != subject) {
			NotificationChain msgs = null;
			if (subject != null)
				msgs = ((InternalEObject)subject).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FhirPackage.DEVICE_REQUEST__SUBJECT, null, msgs);
			if (newSubject != null)
				msgs = ((InternalEObject)newSubject).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FhirPackage.DEVICE_REQUEST__SUBJECT, null, msgs);
			msgs = basicSetSubject(newSubject, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FhirPackage.DEVICE_REQUEST__SUBJECT, newSubject, newSubject));
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
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FhirPackage.DEVICE_REQUEST__CONTEXT, oldContext, newContext);
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
				msgs = ((InternalEObject)context).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FhirPackage.DEVICE_REQUEST__CONTEXT, null, msgs);
			if (newContext != null)
				msgs = ((InternalEObject)newContext).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FhirPackage.DEVICE_REQUEST__CONTEXT, null, msgs);
			msgs = basicSetContext(newContext, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FhirPackage.DEVICE_REQUEST__CONTEXT, newContext, newContext));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@XmlJavaTypeAdapter(DateTimeImplAdapter.class)
	public DateTime getOccurrenceDateTime() {
		return occurrenceDateTime;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetOccurrenceDateTime(DateTime newOccurrenceDateTime, NotificationChain msgs) {
		DateTime oldOccurrenceDateTime = occurrenceDateTime;
		occurrenceDateTime = newOccurrenceDateTime;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FhirPackage.DEVICE_REQUEST__OCCURRENCE_DATE_TIME, oldOccurrenceDateTime, newOccurrenceDateTime);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setOccurrenceDateTime(DateTime newOccurrenceDateTime) {
		if (newOccurrenceDateTime != occurrenceDateTime) {
			NotificationChain msgs = null;
			if (occurrenceDateTime != null)
				msgs = ((InternalEObject)occurrenceDateTime).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FhirPackage.DEVICE_REQUEST__OCCURRENCE_DATE_TIME, null, msgs);
			if (newOccurrenceDateTime != null)
				msgs = ((InternalEObject)newOccurrenceDateTime).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FhirPackage.DEVICE_REQUEST__OCCURRENCE_DATE_TIME, null, msgs);
			msgs = basicSetOccurrenceDateTime(newOccurrenceDateTime, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FhirPackage.DEVICE_REQUEST__OCCURRENCE_DATE_TIME, newOccurrenceDateTime, newOccurrenceDateTime));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Period getOccurrencePeriod() {
		return occurrencePeriod;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetOccurrencePeriod(Period newOccurrencePeriod, NotificationChain msgs) {
		Period oldOccurrencePeriod = occurrencePeriod;
		occurrencePeriod = newOccurrencePeriod;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FhirPackage.DEVICE_REQUEST__OCCURRENCE_PERIOD, oldOccurrencePeriod, newOccurrencePeriod);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setOccurrencePeriod(Period newOccurrencePeriod) {
		if (newOccurrencePeriod != occurrencePeriod) {
			NotificationChain msgs = null;
			if (occurrencePeriod != null)
				msgs = ((InternalEObject)occurrencePeriod).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FhirPackage.DEVICE_REQUEST__OCCURRENCE_PERIOD, null, msgs);
			if (newOccurrencePeriod != null)
				msgs = ((InternalEObject)newOccurrencePeriod).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FhirPackage.DEVICE_REQUEST__OCCURRENCE_PERIOD, null, msgs);
			msgs = basicSetOccurrencePeriod(newOccurrencePeriod, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FhirPackage.DEVICE_REQUEST__OCCURRENCE_PERIOD, newOccurrencePeriod, newOccurrencePeriod));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Timing getOccurrenceTiming() {
		return occurrenceTiming;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetOccurrenceTiming(Timing newOccurrenceTiming, NotificationChain msgs) {
		Timing oldOccurrenceTiming = occurrenceTiming;
		occurrenceTiming = newOccurrenceTiming;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FhirPackage.DEVICE_REQUEST__OCCURRENCE_TIMING, oldOccurrenceTiming, newOccurrenceTiming);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setOccurrenceTiming(Timing newOccurrenceTiming) {
		if (newOccurrenceTiming != occurrenceTiming) {
			NotificationChain msgs = null;
			if (occurrenceTiming != null)
				msgs = ((InternalEObject)occurrenceTiming).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FhirPackage.DEVICE_REQUEST__OCCURRENCE_TIMING, null, msgs);
			if (newOccurrenceTiming != null)
				msgs = ((InternalEObject)newOccurrenceTiming).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FhirPackage.DEVICE_REQUEST__OCCURRENCE_TIMING, null, msgs);
			msgs = basicSetOccurrenceTiming(newOccurrenceTiming, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FhirPackage.DEVICE_REQUEST__OCCURRENCE_TIMING, newOccurrenceTiming, newOccurrenceTiming));
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
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FhirPackage.DEVICE_REQUEST__AUTHORED_ON, oldAuthoredOn, newAuthoredOn);
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
				msgs = ((InternalEObject)authoredOn).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FhirPackage.DEVICE_REQUEST__AUTHORED_ON, null, msgs);
			if (newAuthoredOn != null)
				msgs = ((InternalEObject)newAuthoredOn).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FhirPackage.DEVICE_REQUEST__AUTHORED_ON, null, msgs);
			msgs = basicSetAuthoredOn(newAuthoredOn, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FhirPackage.DEVICE_REQUEST__AUTHORED_ON, newAuthoredOn, newAuthoredOn));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DeviceRequestRequester getRequester() {
		return requester;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetRequester(DeviceRequestRequester newRequester, NotificationChain msgs) {
		DeviceRequestRequester oldRequester = requester;
		requester = newRequester;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FhirPackage.DEVICE_REQUEST__REQUESTER, oldRequester, newRequester);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setRequester(DeviceRequestRequester newRequester) {
		if (newRequester != requester) {
			NotificationChain msgs = null;
			if (requester != null)
				msgs = ((InternalEObject)requester).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FhirPackage.DEVICE_REQUEST__REQUESTER, null, msgs);
			if (newRequester != null)
				msgs = ((InternalEObject)newRequester).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FhirPackage.DEVICE_REQUEST__REQUESTER, null, msgs);
			msgs = basicSetRequester(newRequester, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FhirPackage.DEVICE_REQUEST__REQUESTER, newRequester, newRequester));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CodeableConcept getPerformerType() {
		return performerType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetPerformerType(CodeableConcept newPerformerType, NotificationChain msgs) {
		CodeableConcept oldPerformerType = performerType;
		performerType = newPerformerType;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FhirPackage.DEVICE_REQUEST__PERFORMER_TYPE, oldPerformerType, newPerformerType);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setPerformerType(CodeableConcept newPerformerType) {
		if (newPerformerType != performerType) {
			NotificationChain msgs = null;
			if (performerType != null)
				msgs = ((InternalEObject)performerType).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FhirPackage.DEVICE_REQUEST__PERFORMER_TYPE, null, msgs);
			if (newPerformerType != null)
				msgs = ((InternalEObject)newPerformerType).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FhirPackage.DEVICE_REQUEST__PERFORMER_TYPE, null, msgs);
			msgs = basicSetPerformerType(newPerformerType, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FhirPackage.DEVICE_REQUEST__PERFORMER_TYPE, newPerformerType, newPerformerType));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Reference getPerformer() {
		return performer;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetPerformer(Reference newPerformer, NotificationChain msgs) {
		Reference oldPerformer = performer;
		performer = newPerformer;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FhirPackage.DEVICE_REQUEST__PERFORMER, oldPerformer, newPerformer);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setPerformer(Reference newPerformer) {
		if (newPerformer != performer) {
			NotificationChain msgs = null;
			if (performer != null)
				msgs = ((InternalEObject)performer).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FhirPackage.DEVICE_REQUEST__PERFORMER, null, msgs);
			if (newPerformer != null)
				msgs = ((InternalEObject)newPerformer).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FhirPackage.DEVICE_REQUEST__PERFORMER, null, msgs);
			msgs = basicSetPerformer(newPerformer, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FhirPackage.DEVICE_REQUEST__PERFORMER, newPerformer, newPerformer));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@XmlElement
	public List<CodeableConcept> getReasonCode() {
		if (reasonCode == null) {
			reasonCode = new EObjectContainmentEList<CodeableConcept>(CodeableConcept.class, this, FhirPackage.DEVICE_REQUEST__REASON_CODE);
		}
		return reasonCode;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@XmlElement
	public List<Reference> getReasonReference() {
		if (reasonReference == null) {
			reasonReference = new EObjectContainmentEList<Reference>(Reference.class, this, FhirPackage.DEVICE_REQUEST__REASON_REFERENCE);
		}
		return reasonReference;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@XmlElement
	public List<Reference> getSupportingInfo() {
		if (supportingInfo == null) {
			supportingInfo = new EObjectContainmentEList<Reference>(Reference.class, this, FhirPackage.DEVICE_REQUEST__SUPPORTING_INFO);
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
			note = new EObjectContainmentEList<Annotation>(Annotation.class, this, FhirPackage.DEVICE_REQUEST__NOTE);
		}
		return note;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@XmlElement
	public List<Reference> getRelevantHistory() {
		if (relevantHistory == null) {
			relevantHistory = new EObjectContainmentEList<Reference>(Reference.class, this, FhirPackage.DEVICE_REQUEST__RELEVANT_HISTORY);
		}
		return relevantHistory;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case FhirPackage.DEVICE_REQUEST__IDENTIFIER:
				return ((InternalEList<?>)getIdentifier()).basicRemove(otherEnd, msgs);
			case FhirPackage.DEVICE_REQUEST__DEFINITION:
				return ((InternalEList<?>)getDefinition()).basicRemove(otherEnd, msgs);
			case FhirPackage.DEVICE_REQUEST__BASED_ON:
				return ((InternalEList<?>)getBasedOn()).basicRemove(otherEnd, msgs);
			case FhirPackage.DEVICE_REQUEST__PRIOR_REQUEST:
				return ((InternalEList<?>)getPriorRequest()).basicRemove(otherEnd, msgs);
			case FhirPackage.DEVICE_REQUEST__GROUP_IDENTIFIER:
				return basicSetGroupIdentifier(null, msgs);
			case FhirPackage.DEVICE_REQUEST__STATUS:
				return basicSetStatus(null, msgs);
			case FhirPackage.DEVICE_REQUEST__INTENT:
				return basicSetIntent(null, msgs);
			case FhirPackage.DEVICE_REQUEST__PRIORITY:
				return basicSetPriority(null, msgs);
			case FhirPackage.DEVICE_REQUEST__CODE_REFERENCE:
				return basicSetCodeReference(null, msgs);
			case FhirPackage.DEVICE_REQUEST__CODE_CODEABLE_CONCEPT:
				return basicSetCodeCodeableConcept(null, msgs);
			case FhirPackage.DEVICE_REQUEST__SUBJECT:
				return basicSetSubject(null, msgs);
			case FhirPackage.DEVICE_REQUEST__CONTEXT:
				return basicSetContext(null, msgs);
			case FhirPackage.DEVICE_REQUEST__OCCURRENCE_DATE_TIME:
				return basicSetOccurrenceDateTime(null, msgs);
			case FhirPackage.DEVICE_REQUEST__OCCURRENCE_PERIOD:
				return basicSetOccurrencePeriod(null, msgs);
			case FhirPackage.DEVICE_REQUEST__OCCURRENCE_TIMING:
				return basicSetOccurrenceTiming(null, msgs);
			case FhirPackage.DEVICE_REQUEST__AUTHORED_ON:
				return basicSetAuthoredOn(null, msgs);
			case FhirPackage.DEVICE_REQUEST__REQUESTER:
				return basicSetRequester(null, msgs);
			case FhirPackage.DEVICE_REQUEST__PERFORMER_TYPE:
				return basicSetPerformerType(null, msgs);
			case FhirPackage.DEVICE_REQUEST__PERFORMER:
				return basicSetPerformer(null, msgs);
			case FhirPackage.DEVICE_REQUEST__REASON_CODE:
				return ((InternalEList<?>)getReasonCode()).basicRemove(otherEnd, msgs);
			case FhirPackage.DEVICE_REQUEST__REASON_REFERENCE:
				return ((InternalEList<?>)getReasonReference()).basicRemove(otherEnd, msgs);
			case FhirPackage.DEVICE_REQUEST__SUPPORTING_INFO:
				return ((InternalEList<?>)getSupportingInfo()).basicRemove(otherEnd, msgs);
			case FhirPackage.DEVICE_REQUEST__NOTE:
				return ((InternalEList<?>)getNote()).basicRemove(otherEnd, msgs);
			case FhirPackage.DEVICE_REQUEST__RELEVANT_HISTORY:
				return ((InternalEList<?>)getRelevantHistory()).basicRemove(otherEnd, msgs);
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
			case FhirPackage.DEVICE_REQUEST__IDENTIFIER:
				return getIdentifier();
			case FhirPackage.DEVICE_REQUEST__DEFINITION:
				return getDefinition();
			case FhirPackage.DEVICE_REQUEST__BASED_ON:
				return getBasedOn();
			case FhirPackage.DEVICE_REQUEST__PRIOR_REQUEST:
				return getPriorRequest();
			case FhirPackage.DEVICE_REQUEST__GROUP_IDENTIFIER:
				return getGroupIdentifier();
			case FhirPackage.DEVICE_REQUEST__STATUS:
				return getStatus();
			case FhirPackage.DEVICE_REQUEST__INTENT:
				return getIntent();
			case FhirPackage.DEVICE_REQUEST__PRIORITY:
				return getPriority();
			case FhirPackage.DEVICE_REQUEST__CODE_REFERENCE:
				return getCodeReference();
			case FhirPackage.DEVICE_REQUEST__CODE_CODEABLE_CONCEPT:
				return getCodeCodeableConcept();
			case FhirPackage.DEVICE_REQUEST__SUBJECT:
				return getSubject();
			case FhirPackage.DEVICE_REQUEST__CONTEXT:
				return getContext();
			case FhirPackage.DEVICE_REQUEST__OCCURRENCE_DATE_TIME:
				return getOccurrenceDateTime();
			case FhirPackage.DEVICE_REQUEST__OCCURRENCE_PERIOD:
				return getOccurrencePeriod();
			case FhirPackage.DEVICE_REQUEST__OCCURRENCE_TIMING:
				return getOccurrenceTiming();
			case FhirPackage.DEVICE_REQUEST__AUTHORED_ON:
				return getAuthoredOn();
			case FhirPackage.DEVICE_REQUEST__REQUESTER:
				return getRequester();
			case FhirPackage.DEVICE_REQUEST__PERFORMER_TYPE:
				return getPerformerType();
			case FhirPackage.DEVICE_REQUEST__PERFORMER:
				return getPerformer();
			case FhirPackage.DEVICE_REQUEST__REASON_CODE:
				return getReasonCode();
			case FhirPackage.DEVICE_REQUEST__REASON_REFERENCE:
				return getReasonReference();
			case FhirPackage.DEVICE_REQUEST__SUPPORTING_INFO:
				return getSupportingInfo();
			case FhirPackage.DEVICE_REQUEST__NOTE:
				return getNote();
			case FhirPackage.DEVICE_REQUEST__RELEVANT_HISTORY:
				return getRelevantHistory();
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
			case FhirPackage.DEVICE_REQUEST__IDENTIFIER:
				getIdentifier().clear();
				getIdentifier().addAll((Collection<? extends Identifier>)newValue);
				return;
			case FhirPackage.DEVICE_REQUEST__DEFINITION:
				getDefinition().clear();
				getDefinition().addAll((Collection<? extends Reference>)newValue);
				return;
			case FhirPackage.DEVICE_REQUEST__BASED_ON:
				getBasedOn().clear();
				getBasedOn().addAll((Collection<? extends Reference>)newValue);
				return;
			case FhirPackage.DEVICE_REQUEST__PRIOR_REQUEST:
				getPriorRequest().clear();
				getPriorRequest().addAll((Collection<? extends Reference>)newValue);
				return;
			case FhirPackage.DEVICE_REQUEST__GROUP_IDENTIFIER:
				setGroupIdentifier((Identifier)newValue);
				return;
			case FhirPackage.DEVICE_REQUEST__STATUS:
				setStatus((Code)newValue);
				return;
			case FhirPackage.DEVICE_REQUEST__INTENT:
				setIntent((CodeableConcept)newValue);
				return;
			case FhirPackage.DEVICE_REQUEST__PRIORITY:
				setPriority((Code)newValue);
				return;
			case FhirPackage.DEVICE_REQUEST__CODE_REFERENCE:
				setCodeReference((Reference)newValue);
				return;
			case FhirPackage.DEVICE_REQUEST__CODE_CODEABLE_CONCEPT:
				setCodeCodeableConcept((CodeableConcept)newValue);
				return;
			case FhirPackage.DEVICE_REQUEST__SUBJECT:
				setSubject((Reference)newValue);
				return;
			case FhirPackage.DEVICE_REQUEST__CONTEXT:
				setContext((Reference)newValue);
				return;
			case FhirPackage.DEVICE_REQUEST__OCCURRENCE_DATE_TIME:
				setOccurrenceDateTime((DateTime)newValue);
				return;
			case FhirPackage.DEVICE_REQUEST__OCCURRENCE_PERIOD:
				setOccurrencePeriod((Period)newValue);
				return;
			case FhirPackage.DEVICE_REQUEST__OCCURRENCE_TIMING:
				setOccurrenceTiming((Timing)newValue);
				return;
			case FhirPackage.DEVICE_REQUEST__AUTHORED_ON:
				setAuthoredOn((DateTime)newValue);
				return;
			case FhirPackage.DEVICE_REQUEST__REQUESTER:
				setRequester((DeviceRequestRequester)newValue);
				return;
			case FhirPackage.DEVICE_REQUEST__PERFORMER_TYPE:
				setPerformerType((CodeableConcept)newValue);
				return;
			case FhirPackage.DEVICE_REQUEST__PERFORMER:
				setPerformer((Reference)newValue);
				return;
			case FhirPackage.DEVICE_REQUEST__REASON_CODE:
				getReasonCode().clear();
				getReasonCode().addAll((Collection<? extends CodeableConcept>)newValue);
				return;
			case FhirPackage.DEVICE_REQUEST__REASON_REFERENCE:
				getReasonReference().clear();
				getReasonReference().addAll((Collection<? extends Reference>)newValue);
				return;
			case FhirPackage.DEVICE_REQUEST__SUPPORTING_INFO:
				getSupportingInfo().clear();
				getSupportingInfo().addAll((Collection<? extends Reference>)newValue);
				return;
			case FhirPackage.DEVICE_REQUEST__NOTE:
				getNote().clear();
				getNote().addAll((Collection<? extends Annotation>)newValue);
				return;
			case FhirPackage.DEVICE_REQUEST__RELEVANT_HISTORY:
				getRelevantHistory().clear();
				getRelevantHistory().addAll((Collection<? extends Reference>)newValue);
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
			case FhirPackage.DEVICE_REQUEST__IDENTIFIER:
				getIdentifier().clear();
				return;
			case FhirPackage.DEVICE_REQUEST__DEFINITION:
				getDefinition().clear();
				return;
			case FhirPackage.DEVICE_REQUEST__BASED_ON:
				getBasedOn().clear();
				return;
			case FhirPackage.DEVICE_REQUEST__PRIOR_REQUEST:
				getPriorRequest().clear();
				return;
			case FhirPackage.DEVICE_REQUEST__GROUP_IDENTIFIER:
				setGroupIdentifier((Identifier)null);
				return;
			case FhirPackage.DEVICE_REQUEST__STATUS:
				setStatus((Code)null);
				return;
			case FhirPackage.DEVICE_REQUEST__INTENT:
				setIntent((CodeableConcept)null);
				return;
			case FhirPackage.DEVICE_REQUEST__PRIORITY:
				setPriority((Code)null);
				return;
			case FhirPackage.DEVICE_REQUEST__CODE_REFERENCE:
				setCodeReference((Reference)null);
				return;
			case FhirPackage.DEVICE_REQUEST__CODE_CODEABLE_CONCEPT:
				setCodeCodeableConcept((CodeableConcept)null);
				return;
			case FhirPackage.DEVICE_REQUEST__SUBJECT:
				setSubject((Reference)null);
				return;
			case FhirPackage.DEVICE_REQUEST__CONTEXT:
				setContext((Reference)null);
				return;
			case FhirPackage.DEVICE_REQUEST__OCCURRENCE_DATE_TIME:
				setOccurrenceDateTime((DateTime)null);
				return;
			case FhirPackage.DEVICE_REQUEST__OCCURRENCE_PERIOD:
				setOccurrencePeriod((Period)null);
				return;
			case FhirPackage.DEVICE_REQUEST__OCCURRENCE_TIMING:
				setOccurrenceTiming((Timing)null);
				return;
			case FhirPackage.DEVICE_REQUEST__AUTHORED_ON:
				setAuthoredOn((DateTime)null);
				return;
			case FhirPackage.DEVICE_REQUEST__REQUESTER:
				setRequester((DeviceRequestRequester)null);
				return;
			case FhirPackage.DEVICE_REQUEST__PERFORMER_TYPE:
				setPerformerType((CodeableConcept)null);
				return;
			case FhirPackage.DEVICE_REQUEST__PERFORMER:
				setPerformer((Reference)null);
				return;
			case FhirPackage.DEVICE_REQUEST__REASON_CODE:
				getReasonCode().clear();
				return;
			case FhirPackage.DEVICE_REQUEST__REASON_REFERENCE:
				getReasonReference().clear();
				return;
			case FhirPackage.DEVICE_REQUEST__SUPPORTING_INFO:
				getSupportingInfo().clear();
				return;
			case FhirPackage.DEVICE_REQUEST__NOTE:
				getNote().clear();
				return;
			case FhirPackage.DEVICE_REQUEST__RELEVANT_HISTORY:
				getRelevantHistory().clear();
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
			case FhirPackage.DEVICE_REQUEST__IDENTIFIER:
				return identifier != null && !identifier.isEmpty();
			case FhirPackage.DEVICE_REQUEST__DEFINITION:
				return definition != null && !definition.isEmpty();
			case FhirPackage.DEVICE_REQUEST__BASED_ON:
				return basedOn != null && !basedOn.isEmpty();
			case FhirPackage.DEVICE_REQUEST__PRIOR_REQUEST:
				return priorRequest != null && !priorRequest.isEmpty();
			case FhirPackage.DEVICE_REQUEST__GROUP_IDENTIFIER:
				return groupIdentifier != null;
			case FhirPackage.DEVICE_REQUEST__STATUS:
				return status != null;
			case FhirPackage.DEVICE_REQUEST__INTENT:
				return intent != null;
			case FhirPackage.DEVICE_REQUEST__PRIORITY:
				return priority != null;
			case FhirPackage.DEVICE_REQUEST__CODE_REFERENCE:
				return codeReference != null;
			case FhirPackage.DEVICE_REQUEST__CODE_CODEABLE_CONCEPT:
				return codeCodeableConcept != null;
			case FhirPackage.DEVICE_REQUEST__SUBJECT:
				return subject != null;
			case FhirPackage.DEVICE_REQUEST__CONTEXT:
				return context != null;
			case FhirPackage.DEVICE_REQUEST__OCCURRENCE_DATE_TIME:
				return occurrenceDateTime != null;
			case FhirPackage.DEVICE_REQUEST__OCCURRENCE_PERIOD:
				return occurrencePeriod != null;
			case FhirPackage.DEVICE_REQUEST__OCCURRENCE_TIMING:
				return occurrenceTiming != null;
			case FhirPackage.DEVICE_REQUEST__AUTHORED_ON:
				return authoredOn != null;
			case FhirPackage.DEVICE_REQUEST__REQUESTER:
				return requester != null;
			case FhirPackage.DEVICE_REQUEST__PERFORMER_TYPE:
				return performerType != null;
			case FhirPackage.DEVICE_REQUEST__PERFORMER:
				return performer != null;
			case FhirPackage.DEVICE_REQUEST__REASON_CODE:
				return reasonCode != null && !reasonCode.isEmpty();
			case FhirPackage.DEVICE_REQUEST__REASON_REFERENCE:
				return reasonReference != null && !reasonReference.isEmpty();
			case FhirPackage.DEVICE_REQUEST__SUPPORTING_INFO:
				return supportingInfo != null && !supportingInfo.isEmpty();
			case FhirPackage.DEVICE_REQUEST__NOTE:
				return note != null && !note.isEmpty();
			case FhirPackage.DEVICE_REQUEST__RELEVANT_HISTORY:
				return relevantHistory != null && !relevantHistory.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //DeviceRequestImpl
