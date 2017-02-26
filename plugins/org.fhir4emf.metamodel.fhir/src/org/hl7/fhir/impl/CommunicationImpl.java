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
import org.hl7.fhir.Communication;
import org.hl7.fhir.CommunicationPayload;
import org.hl7.fhir.DateTime;
import org.hl7.fhir.FhirPackage;
import org.hl7.fhir.Identifier;
import org.hl7.fhir.Reference;
import org.hl7.fhir.jaxb.BooleanImplAdapter;
import org.hl7.fhir.jaxb.CodeImplAdapter;
import org.hl7.fhir.jaxb.DateTimeImplAdapter;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Communication</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.hl7.fhir.impl.CommunicationImpl#getIdentifier <em>Identifier</em>}</li>
 *   <li>{@link org.hl7.fhir.impl.CommunicationImpl#getDefinition <em>Definition</em>}</li>
 *   <li>{@link org.hl7.fhir.impl.CommunicationImpl#getBasedOn <em>Based On</em>}</li>
 *   <li>{@link org.hl7.fhir.impl.CommunicationImpl#getPartOf <em>Part Of</em>}</li>
 *   <li>{@link org.hl7.fhir.impl.CommunicationImpl#getStatus <em>Status</em>}</li>
 *   <li>{@link org.hl7.fhir.impl.CommunicationImpl#getNotDone <em>Not Done</em>}</li>
 *   <li>{@link org.hl7.fhir.impl.CommunicationImpl#getNotDoneReason <em>Not Done Reason</em>}</li>
 *   <li>{@link org.hl7.fhir.impl.CommunicationImpl#getCategory <em>Category</em>}</li>
 *   <li>{@link org.hl7.fhir.impl.CommunicationImpl#getMedium <em>Medium</em>}</li>
 *   <li>{@link org.hl7.fhir.impl.CommunicationImpl#getSubject <em>Subject</em>}</li>
 *   <li>{@link org.hl7.fhir.impl.CommunicationImpl#getRecipient <em>Recipient</em>}</li>
 *   <li>{@link org.hl7.fhir.impl.CommunicationImpl#getTopic <em>Topic</em>}</li>
 *   <li>{@link org.hl7.fhir.impl.CommunicationImpl#getContext <em>Context</em>}</li>
 *   <li>{@link org.hl7.fhir.impl.CommunicationImpl#getSent <em>Sent</em>}</li>
 *   <li>{@link org.hl7.fhir.impl.CommunicationImpl#getReceived <em>Received</em>}</li>
 *   <li>{@link org.hl7.fhir.impl.CommunicationImpl#getSender <em>Sender</em>}</li>
 *   <li>{@link org.hl7.fhir.impl.CommunicationImpl#getReason <em>Reason</em>}</li>
 *   <li>{@link org.hl7.fhir.impl.CommunicationImpl#getPayload <em>Payload</em>}</li>
 *   <li>{@link org.hl7.fhir.impl.CommunicationImpl#getNote <em>Note</em>}</li>
 * </ul>
 *
 * @generated
 */
@XmlType(name = "Communication", namespace = "http://hl7.org/fhir")
@XmlRootElement(name = "fhir.Communication")
public class CommunicationImpl extends DomainResourceImpl implements Communication {
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
	 * The cached value of the '{@link #getPartOf() <em>Part Of</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPartOf()
	 * @generated
	 * @ordered
	 */
	protected EList<Reference> partOf;

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
	 * The cached value of the '{@link #getNotDone() <em>Not Done</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNotDone()
	 * @generated
	 * @ordered
	 */
	protected org.hl7.fhir.Boolean notDone;

	/**
	 * The cached value of the '{@link #getNotDoneReason() <em>Not Done Reason</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNotDoneReason()
	 * @generated
	 * @ordered
	 */
	protected CodeableConcept notDoneReason;

	/**
	 * The cached value of the '{@link #getCategory() <em>Category</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCategory()
	 * @generated
	 * @ordered
	 */
	protected EList<CodeableConcept> category;

	/**
	 * The cached value of the '{@link #getMedium() <em>Medium</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMedium()
	 * @generated
	 * @ordered
	 */
	protected EList<CodeableConcept> medium;

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
	 * The cached value of the '{@link #getRecipient() <em>Recipient</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRecipient()
	 * @generated
	 * @ordered
	 */
	protected EList<Reference> recipient;

	/**
	 * The cached value of the '{@link #getTopic() <em>Topic</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTopic()
	 * @generated
	 * @ordered
	 */
	protected EList<Reference> topic;

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
	 * The cached value of the '{@link #getSent() <em>Sent</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSent()
	 * @generated
	 * @ordered
	 */
	protected DateTime sent;

	/**
	 * The cached value of the '{@link #getReceived() <em>Received</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getReceived()
	 * @generated
	 * @ordered
	 */
	protected DateTime received;

	/**
	 * The cached value of the '{@link #getSender() <em>Sender</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSender()
	 * @generated
	 * @ordered
	 */
	protected Reference sender;

	/**
	 * The cached value of the '{@link #getReason() <em>Reason</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getReason()
	 * @generated
	 * @ordered
	 */
	protected EList<CodeableConcept> reason;

	/**
	 * The cached value of the '{@link #getPayload() <em>Payload</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPayload()
	 * @generated
	 * @ordered
	 */
	protected EList<CommunicationPayload> payload;

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
	protected CommunicationImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return FhirPackage.eINSTANCE.getCommunication();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@XmlElement
	public List<Identifier> getIdentifier() {
		if (identifier == null) {
			identifier = new EObjectContainmentEList<Identifier>(Identifier.class, this, FhirPackage.COMMUNICATION__IDENTIFIER);
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
			definition = new EObjectContainmentEList<Reference>(Reference.class, this, FhirPackage.COMMUNICATION__DEFINITION);
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
			basedOn = new EObjectContainmentEList<Reference>(Reference.class, this, FhirPackage.COMMUNICATION__BASED_ON);
		}
		return basedOn;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@XmlElement
	public List<Reference> getPartOf() {
		if (partOf == null) {
			partOf = new EObjectContainmentEList<Reference>(Reference.class, this, FhirPackage.COMMUNICATION__PART_OF);
		}
		return partOf;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@XmlJavaTypeAdapter(CodeImplAdapter.class)
	@XmlElement(required = true)
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
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FhirPackage.COMMUNICATION__STATUS, oldStatus, newStatus);
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
				msgs = ((InternalEObject)status).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FhirPackage.COMMUNICATION__STATUS, null, msgs);
			if (newStatus != null)
				msgs = ((InternalEObject)newStatus).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FhirPackage.COMMUNICATION__STATUS, null, msgs);
			msgs = basicSetStatus(newStatus, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FhirPackage.COMMUNICATION__STATUS, newStatus, newStatus));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@XmlJavaTypeAdapter(BooleanImplAdapter.class)
	public org.hl7.fhir.Boolean getNotDone() {
		return notDone;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetNotDone(org.hl7.fhir.Boolean newNotDone, NotificationChain msgs) {
		org.hl7.fhir.Boolean oldNotDone = notDone;
		notDone = newNotDone;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FhirPackage.COMMUNICATION__NOT_DONE, oldNotDone, newNotDone);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setNotDone(org.hl7.fhir.Boolean newNotDone) {
		if (newNotDone != notDone) {
			NotificationChain msgs = null;
			if (notDone != null)
				msgs = ((InternalEObject)notDone).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FhirPackage.COMMUNICATION__NOT_DONE, null, msgs);
			if (newNotDone != null)
				msgs = ((InternalEObject)newNotDone).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FhirPackage.COMMUNICATION__NOT_DONE, null, msgs);
			msgs = basicSetNotDone(newNotDone, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FhirPackage.COMMUNICATION__NOT_DONE, newNotDone, newNotDone));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CodeableConcept getNotDoneReason() {
		return notDoneReason;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetNotDoneReason(CodeableConcept newNotDoneReason, NotificationChain msgs) {
		CodeableConcept oldNotDoneReason = notDoneReason;
		notDoneReason = newNotDoneReason;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FhirPackage.COMMUNICATION__NOT_DONE_REASON, oldNotDoneReason, newNotDoneReason);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setNotDoneReason(CodeableConcept newNotDoneReason) {
		if (newNotDoneReason != notDoneReason) {
			NotificationChain msgs = null;
			if (notDoneReason != null)
				msgs = ((InternalEObject)notDoneReason).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FhirPackage.COMMUNICATION__NOT_DONE_REASON, null, msgs);
			if (newNotDoneReason != null)
				msgs = ((InternalEObject)newNotDoneReason).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FhirPackage.COMMUNICATION__NOT_DONE_REASON, null, msgs);
			msgs = basicSetNotDoneReason(newNotDoneReason, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FhirPackage.COMMUNICATION__NOT_DONE_REASON, newNotDoneReason, newNotDoneReason));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@XmlElement
	public List<CodeableConcept> getCategory() {
		if (category == null) {
			category = new EObjectContainmentEList<CodeableConcept>(CodeableConcept.class, this, FhirPackage.COMMUNICATION__CATEGORY);
		}
		return category;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@XmlElement
	public List<CodeableConcept> getMedium() {
		if (medium == null) {
			medium = new EObjectContainmentEList<CodeableConcept>(CodeableConcept.class, this, FhirPackage.COMMUNICATION__MEDIUM);
		}
		return medium;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
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
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FhirPackage.COMMUNICATION__SUBJECT, oldSubject, newSubject);
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
				msgs = ((InternalEObject)subject).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FhirPackage.COMMUNICATION__SUBJECT, null, msgs);
			if (newSubject != null)
				msgs = ((InternalEObject)newSubject).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FhirPackage.COMMUNICATION__SUBJECT, null, msgs);
			msgs = basicSetSubject(newSubject, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FhirPackage.COMMUNICATION__SUBJECT, newSubject, newSubject));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@XmlElement
	public List<Reference> getRecipient() {
		if (recipient == null) {
			recipient = new EObjectContainmentEList<Reference>(Reference.class, this, FhirPackage.COMMUNICATION__RECIPIENT);
		}
		return recipient;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@XmlElement
	public List<Reference> getTopic() {
		if (topic == null) {
			topic = new EObjectContainmentEList<Reference>(Reference.class, this, FhirPackage.COMMUNICATION__TOPIC);
		}
		return topic;
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
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FhirPackage.COMMUNICATION__CONTEXT, oldContext, newContext);
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
				msgs = ((InternalEObject)context).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FhirPackage.COMMUNICATION__CONTEXT, null, msgs);
			if (newContext != null)
				msgs = ((InternalEObject)newContext).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FhirPackage.COMMUNICATION__CONTEXT, null, msgs);
			msgs = basicSetContext(newContext, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FhirPackage.COMMUNICATION__CONTEXT, newContext, newContext));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@XmlJavaTypeAdapter(DateTimeImplAdapter.class)
	public DateTime getSent() {
		return sent;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetSent(DateTime newSent, NotificationChain msgs) {
		DateTime oldSent = sent;
		sent = newSent;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FhirPackage.COMMUNICATION__SENT, oldSent, newSent);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setSent(DateTime newSent) {
		if (newSent != sent) {
			NotificationChain msgs = null;
			if (sent != null)
				msgs = ((InternalEObject)sent).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FhirPackage.COMMUNICATION__SENT, null, msgs);
			if (newSent != null)
				msgs = ((InternalEObject)newSent).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FhirPackage.COMMUNICATION__SENT, null, msgs);
			msgs = basicSetSent(newSent, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FhirPackage.COMMUNICATION__SENT, newSent, newSent));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@XmlJavaTypeAdapter(DateTimeImplAdapter.class)
	public DateTime getReceived() {
		return received;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetReceived(DateTime newReceived, NotificationChain msgs) {
		DateTime oldReceived = received;
		received = newReceived;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FhirPackage.COMMUNICATION__RECEIVED, oldReceived, newReceived);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setReceived(DateTime newReceived) {
		if (newReceived != received) {
			NotificationChain msgs = null;
			if (received != null)
				msgs = ((InternalEObject)received).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FhirPackage.COMMUNICATION__RECEIVED, null, msgs);
			if (newReceived != null)
				msgs = ((InternalEObject)newReceived).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FhirPackage.COMMUNICATION__RECEIVED, null, msgs);
			msgs = basicSetReceived(newReceived, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FhirPackage.COMMUNICATION__RECEIVED, newReceived, newReceived));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Reference getSender() {
		return sender;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetSender(Reference newSender, NotificationChain msgs) {
		Reference oldSender = sender;
		sender = newSender;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FhirPackage.COMMUNICATION__SENDER, oldSender, newSender);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setSender(Reference newSender) {
		if (newSender != sender) {
			NotificationChain msgs = null;
			if (sender != null)
				msgs = ((InternalEObject)sender).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FhirPackage.COMMUNICATION__SENDER, null, msgs);
			if (newSender != null)
				msgs = ((InternalEObject)newSender).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FhirPackage.COMMUNICATION__SENDER, null, msgs);
			msgs = basicSetSender(newSender, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FhirPackage.COMMUNICATION__SENDER, newSender, newSender));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@XmlElement
	public List<CodeableConcept> getReason() {
		if (reason == null) {
			reason = new EObjectContainmentEList<CodeableConcept>(CodeableConcept.class, this, FhirPackage.COMMUNICATION__REASON);
		}
		return reason;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@XmlElement
	public List<CommunicationPayload> getPayload() {
		if (payload == null) {
			payload = new EObjectContainmentEList<CommunicationPayload>(CommunicationPayload.class, this, FhirPackage.COMMUNICATION__PAYLOAD);
		}
		return payload;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@XmlElement
	public List<Annotation> getNote() {
		if (note == null) {
			note = new EObjectContainmentEList<Annotation>(Annotation.class, this, FhirPackage.COMMUNICATION__NOTE);
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
			case FhirPackage.COMMUNICATION__IDENTIFIER:
				return ((InternalEList<?>)getIdentifier()).basicRemove(otherEnd, msgs);
			case FhirPackage.COMMUNICATION__DEFINITION:
				return ((InternalEList<?>)getDefinition()).basicRemove(otherEnd, msgs);
			case FhirPackage.COMMUNICATION__BASED_ON:
				return ((InternalEList<?>)getBasedOn()).basicRemove(otherEnd, msgs);
			case FhirPackage.COMMUNICATION__PART_OF:
				return ((InternalEList<?>)getPartOf()).basicRemove(otherEnd, msgs);
			case FhirPackage.COMMUNICATION__STATUS:
				return basicSetStatus(null, msgs);
			case FhirPackage.COMMUNICATION__NOT_DONE:
				return basicSetNotDone(null, msgs);
			case FhirPackage.COMMUNICATION__NOT_DONE_REASON:
				return basicSetNotDoneReason(null, msgs);
			case FhirPackage.COMMUNICATION__CATEGORY:
				return ((InternalEList<?>)getCategory()).basicRemove(otherEnd, msgs);
			case FhirPackage.COMMUNICATION__MEDIUM:
				return ((InternalEList<?>)getMedium()).basicRemove(otherEnd, msgs);
			case FhirPackage.COMMUNICATION__SUBJECT:
				return basicSetSubject(null, msgs);
			case FhirPackage.COMMUNICATION__RECIPIENT:
				return ((InternalEList<?>)getRecipient()).basicRemove(otherEnd, msgs);
			case FhirPackage.COMMUNICATION__TOPIC:
				return ((InternalEList<?>)getTopic()).basicRemove(otherEnd, msgs);
			case FhirPackage.COMMUNICATION__CONTEXT:
				return basicSetContext(null, msgs);
			case FhirPackage.COMMUNICATION__SENT:
				return basicSetSent(null, msgs);
			case FhirPackage.COMMUNICATION__RECEIVED:
				return basicSetReceived(null, msgs);
			case FhirPackage.COMMUNICATION__SENDER:
				return basicSetSender(null, msgs);
			case FhirPackage.COMMUNICATION__REASON:
				return ((InternalEList<?>)getReason()).basicRemove(otherEnd, msgs);
			case FhirPackage.COMMUNICATION__PAYLOAD:
				return ((InternalEList<?>)getPayload()).basicRemove(otherEnd, msgs);
			case FhirPackage.COMMUNICATION__NOTE:
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
			case FhirPackage.COMMUNICATION__IDENTIFIER:
				return getIdentifier();
			case FhirPackage.COMMUNICATION__DEFINITION:
				return getDefinition();
			case FhirPackage.COMMUNICATION__BASED_ON:
				return getBasedOn();
			case FhirPackage.COMMUNICATION__PART_OF:
				return getPartOf();
			case FhirPackage.COMMUNICATION__STATUS:
				return getStatus();
			case FhirPackage.COMMUNICATION__NOT_DONE:
				return getNotDone();
			case FhirPackage.COMMUNICATION__NOT_DONE_REASON:
				return getNotDoneReason();
			case FhirPackage.COMMUNICATION__CATEGORY:
				return getCategory();
			case FhirPackage.COMMUNICATION__MEDIUM:
				return getMedium();
			case FhirPackage.COMMUNICATION__SUBJECT:
				return getSubject();
			case FhirPackage.COMMUNICATION__RECIPIENT:
				return getRecipient();
			case FhirPackage.COMMUNICATION__TOPIC:
				return getTopic();
			case FhirPackage.COMMUNICATION__CONTEXT:
				return getContext();
			case FhirPackage.COMMUNICATION__SENT:
				return getSent();
			case FhirPackage.COMMUNICATION__RECEIVED:
				return getReceived();
			case FhirPackage.COMMUNICATION__SENDER:
				return getSender();
			case FhirPackage.COMMUNICATION__REASON:
				return getReason();
			case FhirPackage.COMMUNICATION__PAYLOAD:
				return getPayload();
			case FhirPackage.COMMUNICATION__NOTE:
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
			case FhirPackage.COMMUNICATION__IDENTIFIER:
				getIdentifier().clear();
				getIdentifier().addAll((Collection<? extends Identifier>)newValue);
				return;
			case FhirPackage.COMMUNICATION__DEFINITION:
				getDefinition().clear();
				getDefinition().addAll((Collection<? extends Reference>)newValue);
				return;
			case FhirPackage.COMMUNICATION__BASED_ON:
				getBasedOn().clear();
				getBasedOn().addAll((Collection<? extends Reference>)newValue);
				return;
			case FhirPackage.COMMUNICATION__PART_OF:
				getPartOf().clear();
				getPartOf().addAll((Collection<? extends Reference>)newValue);
				return;
			case FhirPackage.COMMUNICATION__STATUS:
				setStatus((Code)newValue);
				return;
			case FhirPackage.COMMUNICATION__NOT_DONE:
				setNotDone((org.hl7.fhir.Boolean)newValue);
				return;
			case FhirPackage.COMMUNICATION__NOT_DONE_REASON:
				setNotDoneReason((CodeableConcept)newValue);
				return;
			case FhirPackage.COMMUNICATION__CATEGORY:
				getCategory().clear();
				getCategory().addAll((Collection<? extends CodeableConcept>)newValue);
				return;
			case FhirPackage.COMMUNICATION__MEDIUM:
				getMedium().clear();
				getMedium().addAll((Collection<? extends CodeableConcept>)newValue);
				return;
			case FhirPackage.COMMUNICATION__SUBJECT:
				setSubject((Reference)newValue);
				return;
			case FhirPackage.COMMUNICATION__RECIPIENT:
				getRecipient().clear();
				getRecipient().addAll((Collection<? extends Reference>)newValue);
				return;
			case FhirPackage.COMMUNICATION__TOPIC:
				getTopic().clear();
				getTopic().addAll((Collection<? extends Reference>)newValue);
				return;
			case FhirPackage.COMMUNICATION__CONTEXT:
				setContext((Reference)newValue);
				return;
			case FhirPackage.COMMUNICATION__SENT:
				setSent((DateTime)newValue);
				return;
			case FhirPackage.COMMUNICATION__RECEIVED:
				setReceived((DateTime)newValue);
				return;
			case FhirPackage.COMMUNICATION__SENDER:
				setSender((Reference)newValue);
				return;
			case FhirPackage.COMMUNICATION__REASON:
				getReason().clear();
				getReason().addAll((Collection<? extends CodeableConcept>)newValue);
				return;
			case FhirPackage.COMMUNICATION__PAYLOAD:
				getPayload().clear();
				getPayload().addAll((Collection<? extends CommunicationPayload>)newValue);
				return;
			case FhirPackage.COMMUNICATION__NOTE:
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
			case FhirPackage.COMMUNICATION__IDENTIFIER:
				getIdentifier().clear();
				return;
			case FhirPackage.COMMUNICATION__DEFINITION:
				getDefinition().clear();
				return;
			case FhirPackage.COMMUNICATION__BASED_ON:
				getBasedOn().clear();
				return;
			case FhirPackage.COMMUNICATION__PART_OF:
				getPartOf().clear();
				return;
			case FhirPackage.COMMUNICATION__STATUS:
				setStatus((Code)null);
				return;
			case FhirPackage.COMMUNICATION__NOT_DONE:
				setNotDone((org.hl7.fhir.Boolean)null);
				return;
			case FhirPackage.COMMUNICATION__NOT_DONE_REASON:
				setNotDoneReason((CodeableConcept)null);
				return;
			case FhirPackage.COMMUNICATION__CATEGORY:
				getCategory().clear();
				return;
			case FhirPackage.COMMUNICATION__MEDIUM:
				getMedium().clear();
				return;
			case FhirPackage.COMMUNICATION__SUBJECT:
				setSubject((Reference)null);
				return;
			case FhirPackage.COMMUNICATION__RECIPIENT:
				getRecipient().clear();
				return;
			case FhirPackage.COMMUNICATION__TOPIC:
				getTopic().clear();
				return;
			case FhirPackage.COMMUNICATION__CONTEXT:
				setContext((Reference)null);
				return;
			case FhirPackage.COMMUNICATION__SENT:
				setSent((DateTime)null);
				return;
			case FhirPackage.COMMUNICATION__RECEIVED:
				setReceived((DateTime)null);
				return;
			case FhirPackage.COMMUNICATION__SENDER:
				setSender((Reference)null);
				return;
			case FhirPackage.COMMUNICATION__REASON:
				getReason().clear();
				return;
			case FhirPackage.COMMUNICATION__PAYLOAD:
				getPayload().clear();
				return;
			case FhirPackage.COMMUNICATION__NOTE:
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
			case FhirPackage.COMMUNICATION__IDENTIFIER:
				return identifier != null && !identifier.isEmpty();
			case FhirPackage.COMMUNICATION__DEFINITION:
				return definition != null && !definition.isEmpty();
			case FhirPackage.COMMUNICATION__BASED_ON:
				return basedOn != null && !basedOn.isEmpty();
			case FhirPackage.COMMUNICATION__PART_OF:
				return partOf != null && !partOf.isEmpty();
			case FhirPackage.COMMUNICATION__STATUS:
				return status != null;
			case FhirPackage.COMMUNICATION__NOT_DONE:
				return notDone != null;
			case FhirPackage.COMMUNICATION__NOT_DONE_REASON:
				return notDoneReason != null;
			case FhirPackage.COMMUNICATION__CATEGORY:
				return category != null && !category.isEmpty();
			case FhirPackage.COMMUNICATION__MEDIUM:
				return medium != null && !medium.isEmpty();
			case FhirPackage.COMMUNICATION__SUBJECT:
				return subject != null;
			case FhirPackage.COMMUNICATION__RECIPIENT:
				return recipient != null && !recipient.isEmpty();
			case FhirPackage.COMMUNICATION__TOPIC:
				return topic != null && !topic.isEmpty();
			case FhirPackage.COMMUNICATION__CONTEXT:
				return context != null;
			case FhirPackage.COMMUNICATION__SENT:
				return sent != null;
			case FhirPackage.COMMUNICATION__RECEIVED:
				return received != null;
			case FhirPackage.COMMUNICATION__SENDER:
				return sender != null;
			case FhirPackage.COMMUNICATION__REASON:
				return reason != null && !reason.isEmpty();
			case FhirPackage.COMMUNICATION__PAYLOAD:
				return payload != null && !payload.isEmpty();
			case FhirPackage.COMMUNICATION__NOTE:
				return note != null && !note.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //CommunicationImpl
