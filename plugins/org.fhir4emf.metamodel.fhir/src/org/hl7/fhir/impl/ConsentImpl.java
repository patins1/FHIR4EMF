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

import org.hl7.fhir.Attachment;
import org.hl7.fhir.CodeableConcept;
import org.hl7.fhir.Coding;
import org.hl7.fhir.Consent;
import org.hl7.fhir.ConsentActor;
import org.hl7.fhir.ConsentData;
import org.hl7.fhir.ConsentExcept;
import org.hl7.fhir.ConsentStatus;
import org.hl7.fhir.DateTime;
import org.hl7.fhir.FhirPackage;
import org.hl7.fhir.Identifier;
import org.hl7.fhir.Period;
import org.hl7.fhir.Reference;
import org.hl7.fhir.Uri;
import org.hl7.fhir.jaxb.ConsentStatusImplAdapter;
import org.hl7.fhir.jaxb.DateTimeImplAdapter;
import org.hl7.fhir.jaxb.UriImplAdapter;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Consent</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.hl7.fhir.impl.ConsentImpl#getIdentifier <em>Identifier</em>}</li>
 *   <li>{@link org.hl7.fhir.impl.ConsentImpl#getStatus <em>Status</em>}</li>
 *   <li>{@link org.hl7.fhir.impl.ConsentImpl#getCategory <em>Category</em>}</li>
 *   <li>{@link org.hl7.fhir.impl.ConsentImpl#getPatient <em>Patient</em>}</li>
 *   <li>{@link org.hl7.fhir.impl.ConsentImpl#getPeriod <em>Period</em>}</li>
 *   <li>{@link org.hl7.fhir.impl.ConsentImpl#getDateTime <em>Date Time</em>}</li>
 *   <li>{@link org.hl7.fhir.impl.ConsentImpl#getConsentor <em>Consentor</em>}</li>
 *   <li>{@link org.hl7.fhir.impl.ConsentImpl#getActor <em>Actor</em>}</li>
 *   <li>{@link org.hl7.fhir.impl.ConsentImpl#getAction <em>Action</em>}</li>
 *   <li>{@link org.hl7.fhir.impl.ConsentImpl#getOrganization <em>Organization</em>}</li>
 *   <li>{@link org.hl7.fhir.impl.ConsentImpl#getSourceAttachment <em>Source Attachment</em>}</li>
 *   <li>{@link org.hl7.fhir.impl.ConsentImpl#getSourceIdentifier <em>Source Identifier</em>}</li>
 *   <li>{@link org.hl7.fhir.impl.ConsentImpl#getSourceReference <em>Source Reference</em>}</li>
 *   <li>{@link org.hl7.fhir.impl.ConsentImpl#getPolicy <em>Policy</em>}</li>
 *   <li>{@link org.hl7.fhir.impl.ConsentImpl#getPolicyRule <em>Policy Rule</em>}</li>
 *   <li>{@link org.hl7.fhir.impl.ConsentImpl#getSecurityLabel <em>Security Label</em>}</li>
 *   <li>{@link org.hl7.fhir.impl.ConsentImpl#getPurpose <em>Purpose</em>}</li>
 *   <li>{@link org.hl7.fhir.impl.ConsentImpl#getDataPeriod <em>Data Period</em>}</li>
 *   <li>{@link org.hl7.fhir.impl.ConsentImpl#getData <em>Data</em>}</li>
 *   <li>{@link org.hl7.fhir.impl.ConsentImpl#getExcept <em>Except</em>}</li>
 * </ul>
 *
 * @generated
 */
@XmlType(name = "Consent", namespace = "http://hl7.org/fhir")
@XmlRootElement(name = "fhir.Consent")
public class ConsentImpl extends DomainResourceImpl implements Consent {
	/**
	 * The cached value of the '{@link #getIdentifier() <em>Identifier</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getIdentifier()
	 * @generated
	 * @ordered
	 */
	protected Identifier identifier;

	/**
	 * The cached value of the '{@link #getStatus() <em>Status</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getStatus()
	 * @generated
	 * @ordered
	 */
	protected ConsentStatus status;

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
	 * The cached value of the '{@link #getPatient() <em>Patient</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPatient()
	 * @generated
	 * @ordered
	 */
	protected Reference patient;

	/**
	 * The cached value of the '{@link #getPeriod() <em>Period</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPeriod()
	 * @generated
	 * @ordered
	 */
	protected Period period;

	/**
	 * The cached value of the '{@link #getDateTime() <em>Date Time</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDateTime()
	 * @generated
	 * @ordered
	 */
	protected DateTime dateTime;

	/**
	 * The cached value of the '{@link #getConsentor() <em>Consentor</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getConsentor()
	 * @generated
	 * @ordered
	 */
	protected EList<Reference> consentor;

	/**
	 * The cached value of the '{@link #getActor() <em>Actor</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getActor()
	 * @generated
	 * @ordered
	 */
	protected EList<ConsentActor> actor;

	/**
	 * The cached value of the '{@link #getAction() <em>Action</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAction()
	 * @generated
	 * @ordered
	 */
	protected EList<CodeableConcept> action;

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
	 * The cached value of the '{@link #getSourceAttachment() <em>Source Attachment</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSourceAttachment()
	 * @generated
	 * @ordered
	 */
	protected Attachment sourceAttachment;

	/**
	 * The cached value of the '{@link #getSourceIdentifier() <em>Source Identifier</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSourceIdentifier()
	 * @generated
	 * @ordered
	 */
	protected Identifier sourceIdentifier;

	/**
	 * The cached value of the '{@link #getSourceReference() <em>Source Reference</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSourceReference()
	 * @generated
	 * @ordered
	 */
	protected Reference sourceReference;

	/**
	 * The cached value of the '{@link #getPolicy() <em>Policy</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPolicy()
	 * @generated
	 * @ordered
	 */
	protected EList<Uri> policy;

	/**
	 * The cached value of the '{@link #getPolicyRule() <em>Policy Rule</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPolicyRule()
	 * @generated
	 * @ordered
	 */
	protected Uri policyRule;

	/**
	 * The cached value of the '{@link #getSecurityLabel() <em>Security Label</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSecurityLabel()
	 * @generated
	 * @ordered
	 */
	protected EList<Coding> securityLabel;

	/**
	 * The cached value of the '{@link #getPurpose() <em>Purpose</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPurpose()
	 * @generated
	 * @ordered
	 */
	protected EList<Coding> purpose;

	/**
	 * The cached value of the '{@link #getDataPeriod() <em>Data Period</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDataPeriod()
	 * @generated
	 * @ordered
	 */
	protected Period dataPeriod;

	/**
	 * The cached value of the '{@link #getData() <em>Data</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getData()
	 * @generated
	 * @ordered
	 */
	protected EList<ConsentData> data;

	/**
	 * The cached value of the '{@link #getExcept() <em>Except</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getExcept()
	 * @generated
	 * @ordered
	 */
	protected EList<ConsentExcept> except;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ConsentImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return FhirPackage.eINSTANCE.getConsent();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Identifier getIdentifier() {
		return identifier;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetIdentifier(Identifier newIdentifier, NotificationChain msgs) {
		Identifier oldIdentifier = identifier;
		identifier = newIdentifier;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FhirPackage.CONSENT__IDENTIFIER, oldIdentifier, newIdentifier);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setIdentifier(Identifier newIdentifier) {
		if (newIdentifier != identifier) {
			NotificationChain msgs = null;
			if (identifier != null)
				msgs = ((InternalEObject)identifier).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FhirPackage.CONSENT__IDENTIFIER, null, msgs);
			if (newIdentifier != null)
				msgs = ((InternalEObject)newIdentifier).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FhirPackage.CONSENT__IDENTIFIER, null, msgs);
			msgs = basicSetIdentifier(newIdentifier, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FhirPackage.CONSENT__IDENTIFIER, newIdentifier, newIdentifier));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@XmlJavaTypeAdapter(ConsentStatusImplAdapter.class)
	@XmlElement(required = true)
	public ConsentStatus getStatus() {
		return status;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetStatus(ConsentStatus newStatus, NotificationChain msgs) {
		ConsentStatus oldStatus = status;
		status = newStatus;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FhirPackage.CONSENT__STATUS, oldStatus, newStatus);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setStatus(ConsentStatus newStatus) {
		if (newStatus != status) {
			NotificationChain msgs = null;
			if (status != null)
				msgs = ((InternalEObject)status).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FhirPackage.CONSENT__STATUS, null, msgs);
			if (newStatus != null)
				msgs = ((InternalEObject)newStatus).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FhirPackage.CONSENT__STATUS, null, msgs);
			msgs = basicSetStatus(newStatus, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FhirPackage.CONSENT__STATUS, newStatus, newStatus));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@XmlElement
	public List<CodeableConcept> getCategory() {
		if (category == null) {
			category = new EObjectContainmentEList<CodeableConcept>(CodeableConcept.class, this, FhirPackage.CONSENT__CATEGORY);
		}
		return category;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@XmlElement(required = true)
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
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FhirPackage.CONSENT__PATIENT, oldPatient, newPatient);
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
				msgs = ((InternalEObject)patient).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FhirPackage.CONSENT__PATIENT, null, msgs);
			if (newPatient != null)
				msgs = ((InternalEObject)newPatient).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FhirPackage.CONSENT__PATIENT, null, msgs);
			msgs = basicSetPatient(newPatient, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FhirPackage.CONSENT__PATIENT, newPatient, newPatient));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Period getPeriod() {
		return period;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetPeriod(Period newPeriod, NotificationChain msgs) {
		Period oldPeriod = period;
		period = newPeriod;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FhirPackage.CONSENT__PERIOD, oldPeriod, newPeriod);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setPeriod(Period newPeriod) {
		if (newPeriod != period) {
			NotificationChain msgs = null;
			if (period != null)
				msgs = ((InternalEObject)period).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FhirPackage.CONSENT__PERIOD, null, msgs);
			if (newPeriod != null)
				msgs = ((InternalEObject)newPeriod).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FhirPackage.CONSENT__PERIOD, null, msgs);
			msgs = basicSetPeriod(newPeriod, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FhirPackage.CONSENT__PERIOD, newPeriod, newPeriod));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@XmlJavaTypeAdapter(DateTimeImplAdapter.class)
	public DateTime getDateTime() {
		return dateTime;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetDateTime(DateTime newDateTime, NotificationChain msgs) {
		DateTime oldDateTime = dateTime;
		dateTime = newDateTime;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FhirPackage.CONSENT__DATE_TIME, oldDateTime, newDateTime);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setDateTime(DateTime newDateTime) {
		if (newDateTime != dateTime) {
			NotificationChain msgs = null;
			if (dateTime != null)
				msgs = ((InternalEObject)dateTime).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FhirPackage.CONSENT__DATE_TIME, null, msgs);
			if (newDateTime != null)
				msgs = ((InternalEObject)newDateTime).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FhirPackage.CONSENT__DATE_TIME, null, msgs);
			msgs = basicSetDateTime(newDateTime, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FhirPackage.CONSENT__DATE_TIME, newDateTime, newDateTime));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@XmlElement
	public List<Reference> getConsentor() {
		if (consentor == null) {
			consentor = new EObjectContainmentEList<Reference>(Reference.class, this, FhirPackage.CONSENT__CONSENTOR);
		}
		return consentor;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@XmlElement
	public List<ConsentActor> getActor() {
		if (actor == null) {
			actor = new EObjectContainmentEList<ConsentActor>(ConsentActor.class, this, FhirPackage.CONSENT__ACTOR);
		}
		return actor;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@XmlElement
	public List<CodeableConcept> getAction() {
		if (action == null) {
			action = new EObjectContainmentEList<CodeableConcept>(CodeableConcept.class, this, FhirPackage.CONSENT__ACTION);
		}
		return action;
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
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FhirPackage.CONSENT__ORGANIZATION, oldOrganization, newOrganization);
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
				msgs = ((InternalEObject)organization).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FhirPackage.CONSENT__ORGANIZATION, null, msgs);
			if (newOrganization != null)
				msgs = ((InternalEObject)newOrganization).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FhirPackage.CONSENT__ORGANIZATION, null, msgs);
			msgs = basicSetOrganization(newOrganization, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FhirPackage.CONSENT__ORGANIZATION, newOrganization, newOrganization));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Attachment getSourceAttachment() {
		return sourceAttachment;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetSourceAttachment(Attachment newSourceAttachment, NotificationChain msgs) {
		Attachment oldSourceAttachment = sourceAttachment;
		sourceAttachment = newSourceAttachment;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FhirPackage.CONSENT__SOURCE_ATTACHMENT, oldSourceAttachment, newSourceAttachment);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setSourceAttachment(Attachment newSourceAttachment) {
		if (newSourceAttachment != sourceAttachment) {
			NotificationChain msgs = null;
			if (sourceAttachment != null)
				msgs = ((InternalEObject)sourceAttachment).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FhirPackage.CONSENT__SOURCE_ATTACHMENT, null, msgs);
			if (newSourceAttachment != null)
				msgs = ((InternalEObject)newSourceAttachment).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FhirPackage.CONSENT__SOURCE_ATTACHMENT, null, msgs);
			msgs = basicSetSourceAttachment(newSourceAttachment, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FhirPackage.CONSENT__SOURCE_ATTACHMENT, newSourceAttachment, newSourceAttachment));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Identifier getSourceIdentifier() {
		return sourceIdentifier;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetSourceIdentifier(Identifier newSourceIdentifier, NotificationChain msgs) {
		Identifier oldSourceIdentifier = sourceIdentifier;
		sourceIdentifier = newSourceIdentifier;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FhirPackage.CONSENT__SOURCE_IDENTIFIER, oldSourceIdentifier, newSourceIdentifier);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setSourceIdentifier(Identifier newSourceIdentifier) {
		if (newSourceIdentifier != sourceIdentifier) {
			NotificationChain msgs = null;
			if (sourceIdentifier != null)
				msgs = ((InternalEObject)sourceIdentifier).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FhirPackage.CONSENT__SOURCE_IDENTIFIER, null, msgs);
			if (newSourceIdentifier != null)
				msgs = ((InternalEObject)newSourceIdentifier).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FhirPackage.CONSENT__SOURCE_IDENTIFIER, null, msgs);
			msgs = basicSetSourceIdentifier(newSourceIdentifier, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FhirPackage.CONSENT__SOURCE_IDENTIFIER, newSourceIdentifier, newSourceIdentifier));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Reference getSourceReference() {
		return sourceReference;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetSourceReference(Reference newSourceReference, NotificationChain msgs) {
		Reference oldSourceReference = sourceReference;
		sourceReference = newSourceReference;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FhirPackage.CONSENT__SOURCE_REFERENCE, oldSourceReference, newSourceReference);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setSourceReference(Reference newSourceReference) {
		if (newSourceReference != sourceReference) {
			NotificationChain msgs = null;
			if (sourceReference != null)
				msgs = ((InternalEObject)sourceReference).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FhirPackage.CONSENT__SOURCE_REFERENCE, null, msgs);
			if (newSourceReference != null)
				msgs = ((InternalEObject)newSourceReference).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FhirPackage.CONSENT__SOURCE_REFERENCE, null, msgs);
			msgs = basicSetSourceReference(newSourceReference, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FhirPackage.CONSENT__SOURCE_REFERENCE, newSourceReference, newSourceReference));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@XmlJavaTypeAdapter(UriImplAdapter.class)
	@XmlElement
	public List<Uri> getPolicy() {
		if (policy == null) {
			policy = new EObjectContainmentEList<Uri>(Uri.class, this, FhirPackage.CONSENT__POLICY);
		}
		return policy;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@XmlJavaTypeAdapter(UriImplAdapter.class)
	public Uri getPolicyRule() {
		return policyRule;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetPolicyRule(Uri newPolicyRule, NotificationChain msgs) {
		Uri oldPolicyRule = policyRule;
		policyRule = newPolicyRule;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FhirPackage.CONSENT__POLICY_RULE, oldPolicyRule, newPolicyRule);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setPolicyRule(Uri newPolicyRule) {
		if (newPolicyRule != policyRule) {
			NotificationChain msgs = null;
			if (policyRule != null)
				msgs = ((InternalEObject)policyRule).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FhirPackage.CONSENT__POLICY_RULE, null, msgs);
			if (newPolicyRule != null)
				msgs = ((InternalEObject)newPolicyRule).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FhirPackage.CONSENT__POLICY_RULE, null, msgs);
			msgs = basicSetPolicyRule(newPolicyRule, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FhirPackage.CONSENT__POLICY_RULE, newPolicyRule, newPolicyRule));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@XmlElement
	public List<Coding> getSecurityLabel() {
		if (securityLabel == null) {
			securityLabel = new EObjectContainmentEList<Coding>(Coding.class, this, FhirPackage.CONSENT__SECURITY_LABEL);
		}
		return securityLabel;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@XmlElement
	public List<Coding> getPurpose() {
		if (purpose == null) {
			purpose = new EObjectContainmentEList<Coding>(Coding.class, this, FhirPackage.CONSENT__PURPOSE);
		}
		return purpose;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Period getDataPeriod() {
		return dataPeriod;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetDataPeriod(Period newDataPeriod, NotificationChain msgs) {
		Period oldDataPeriod = dataPeriod;
		dataPeriod = newDataPeriod;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FhirPackage.CONSENT__DATA_PERIOD, oldDataPeriod, newDataPeriod);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setDataPeriod(Period newDataPeriod) {
		if (newDataPeriod != dataPeriod) {
			NotificationChain msgs = null;
			if (dataPeriod != null)
				msgs = ((InternalEObject)dataPeriod).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FhirPackage.CONSENT__DATA_PERIOD, null, msgs);
			if (newDataPeriod != null)
				msgs = ((InternalEObject)newDataPeriod).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FhirPackage.CONSENT__DATA_PERIOD, null, msgs);
			msgs = basicSetDataPeriod(newDataPeriod, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FhirPackage.CONSENT__DATA_PERIOD, newDataPeriod, newDataPeriod));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@XmlElement
	public List<ConsentData> getData() {
		if (data == null) {
			data = new EObjectContainmentEList<ConsentData>(ConsentData.class, this, FhirPackage.CONSENT__DATA);
		}
		return data;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@XmlElement
	public List<ConsentExcept> getExcept() {
		if (except == null) {
			except = new EObjectContainmentEList<ConsentExcept>(ConsentExcept.class, this, FhirPackage.CONSENT__EXCEPT);
		}
		return except;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case FhirPackage.CONSENT__IDENTIFIER:
				return basicSetIdentifier(null, msgs);
			case FhirPackage.CONSENT__STATUS:
				return basicSetStatus(null, msgs);
			case FhirPackage.CONSENT__CATEGORY:
				return ((InternalEList<?>)getCategory()).basicRemove(otherEnd, msgs);
			case FhirPackage.CONSENT__PATIENT:
				return basicSetPatient(null, msgs);
			case FhirPackage.CONSENT__PERIOD:
				return basicSetPeriod(null, msgs);
			case FhirPackage.CONSENT__DATE_TIME:
				return basicSetDateTime(null, msgs);
			case FhirPackage.CONSENT__CONSENTOR:
				return ((InternalEList<?>)getConsentor()).basicRemove(otherEnd, msgs);
			case FhirPackage.CONSENT__ACTOR:
				return ((InternalEList<?>)getActor()).basicRemove(otherEnd, msgs);
			case FhirPackage.CONSENT__ACTION:
				return ((InternalEList<?>)getAction()).basicRemove(otherEnd, msgs);
			case FhirPackage.CONSENT__ORGANIZATION:
				return basicSetOrganization(null, msgs);
			case FhirPackage.CONSENT__SOURCE_ATTACHMENT:
				return basicSetSourceAttachment(null, msgs);
			case FhirPackage.CONSENT__SOURCE_IDENTIFIER:
				return basicSetSourceIdentifier(null, msgs);
			case FhirPackage.CONSENT__SOURCE_REFERENCE:
				return basicSetSourceReference(null, msgs);
			case FhirPackage.CONSENT__POLICY:
				return ((InternalEList<?>)getPolicy()).basicRemove(otherEnd, msgs);
			case FhirPackage.CONSENT__POLICY_RULE:
				return basicSetPolicyRule(null, msgs);
			case FhirPackage.CONSENT__SECURITY_LABEL:
				return ((InternalEList<?>)getSecurityLabel()).basicRemove(otherEnd, msgs);
			case FhirPackage.CONSENT__PURPOSE:
				return ((InternalEList<?>)getPurpose()).basicRemove(otherEnd, msgs);
			case FhirPackage.CONSENT__DATA_PERIOD:
				return basicSetDataPeriod(null, msgs);
			case FhirPackage.CONSENT__DATA:
				return ((InternalEList<?>)getData()).basicRemove(otherEnd, msgs);
			case FhirPackage.CONSENT__EXCEPT:
				return ((InternalEList<?>)getExcept()).basicRemove(otherEnd, msgs);
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
			case FhirPackage.CONSENT__IDENTIFIER:
				return getIdentifier();
			case FhirPackage.CONSENT__STATUS:
				return getStatus();
			case FhirPackage.CONSENT__CATEGORY:
				return getCategory();
			case FhirPackage.CONSENT__PATIENT:
				return getPatient();
			case FhirPackage.CONSENT__PERIOD:
				return getPeriod();
			case FhirPackage.CONSENT__DATE_TIME:
				return getDateTime();
			case FhirPackage.CONSENT__CONSENTOR:
				return getConsentor();
			case FhirPackage.CONSENT__ACTOR:
				return getActor();
			case FhirPackage.CONSENT__ACTION:
				return getAction();
			case FhirPackage.CONSENT__ORGANIZATION:
				return getOrganization();
			case FhirPackage.CONSENT__SOURCE_ATTACHMENT:
				return getSourceAttachment();
			case FhirPackage.CONSENT__SOURCE_IDENTIFIER:
				return getSourceIdentifier();
			case FhirPackage.CONSENT__SOURCE_REFERENCE:
				return getSourceReference();
			case FhirPackage.CONSENT__POLICY:
				return getPolicy();
			case FhirPackage.CONSENT__POLICY_RULE:
				return getPolicyRule();
			case FhirPackage.CONSENT__SECURITY_LABEL:
				return getSecurityLabel();
			case FhirPackage.CONSENT__PURPOSE:
				return getPurpose();
			case FhirPackage.CONSENT__DATA_PERIOD:
				return getDataPeriod();
			case FhirPackage.CONSENT__DATA:
				return getData();
			case FhirPackage.CONSENT__EXCEPT:
				return getExcept();
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
			case FhirPackage.CONSENT__IDENTIFIER:
				setIdentifier((Identifier)newValue);
				return;
			case FhirPackage.CONSENT__STATUS:
				setStatus((ConsentStatus)newValue);
				return;
			case FhirPackage.CONSENT__CATEGORY:
				getCategory().clear();
				getCategory().addAll((Collection<? extends CodeableConcept>)newValue);
				return;
			case FhirPackage.CONSENT__PATIENT:
				setPatient((Reference)newValue);
				return;
			case FhirPackage.CONSENT__PERIOD:
				setPeriod((Period)newValue);
				return;
			case FhirPackage.CONSENT__DATE_TIME:
				setDateTime((DateTime)newValue);
				return;
			case FhirPackage.CONSENT__CONSENTOR:
				getConsentor().clear();
				getConsentor().addAll((Collection<? extends Reference>)newValue);
				return;
			case FhirPackage.CONSENT__ACTOR:
				getActor().clear();
				getActor().addAll((Collection<? extends ConsentActor>)newValue);
				return;
			case FhirPackage.CONSENT__ACTION:
				getAction().clear();
				getAction().addAll((Collection<? extends CodeableConcept>)newValue);
				return;
			case FhirPackage.CONSENT__ORGANIZATION:
				setOrganization((Reference)newValue);
				return;
			case FhirPackage.CONSENT__SOURCE_ATTACHMENT:
				setSourceAttachment((Attachment)newValue);
				return;
			case FhirPackage.CONSENT__SOURCE_IDENTIFIER:
				setSourceIdentifier((Identifier)newValue);
				return;
			case FhirPackage.CONSENT__SOURCE_REFERENCE:
				setSourceReference((Reference)newValue);
				return;
			case FhirPackage.CONSENT__POLICY:
				getPolicy().clear();
				getPolicy().addAll((Collection<? extends Uri>)newValue);
				return;
			case FhirPackage.CONSENT__POLICY_RULE:
				setPolicyRule((Uri)newValue);
				return;
			case FhirPackage.CONSENT__SECURITY_LABEL:
				getSecurityLabel().clear();
				getSecurityLabel().addAll((Collection<? extends Coding>)newValue);
				return;
			case FhirPackage.CONSENT__PURPOSE:
				getPurpose().clear();
				getPurpose().addAll((Collection<? extends Coding>)newValue);
				return;
			case FhirPackage.CONSENT__DATA_PERIOD:
				setDataPeriod((Period)newValue);
				return;
			case FhirPackage.CONSENT__DATA:
				getData().clear();
				getData().addAll((Collection<? extends ConsentData>)newValue);
				return;
			case FhirPackage.CONSENT__EXCEPT:
				getExcept().clear();
				getExcept().addAll((Collection<? extends ConsentExcept>)newValue);
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
			case FhirPackage.CONSENT__IDENTIFIER:
				setIdentifier((Identifier)null);
				return;
			case FhirPackage.CONSENT__STATUS:
				setStatus((ConsentStatus)null);
				return;
			case FhirPackage.CONSENT__CATEGORY:
				getCategory().clear();
				return;
			case FhirPackage.CONSENT__PATIENT:
				setPatient((Reference)null);
				return;
			case FhirPackage.CONSENT__PERIOD:
				setPeriod((Period)null);
				return;
			case FhirPackage.CONSENT__DATE_TIME:
				setDateTime((DateTime)null);
				return;
			case FhirPackage.CONSENT__CONSENTOR:
				getConsentor().clear();
				return;
			case FhirPackage.CONSENT__ACTOR:
				getActor().clear();
				return;
			case FhirPackage.CONSENT__ACTION:
				getAction().clear();
				return;
			case FhirPackage.CONSENT__ORGANIZATION:
				setOrganization((Reference)null);
				return;
			case FhirPackage.CONSENT__SOURCE_ATTACHMENT:
				setSourceAttachment((Attachment)null);
				return;
			case FhirPackage.CONSENT__SOURCE_IDENTIFIER:
				setSourceIdentifier((Identifier)null);
				return;
			case FhirPackage.CONSENT__SOURCE_REFERENCE:
				setSourceReference((Reference)null);
				return;
			case FhirPackage.CONSENT__POLICY:
				getPolicy().clear();
				return;
			case FhirPackage.CONSENT__POLICY_RULE:
				setPolicyRule((Uri)null);
				return;
			case FhirPackage.CONSENT__SECURITY_LABEL:
				getSecurityLabel().clear();
				return;
			case FhirPackage.CONSENT__PURPOSE:
				getPurpose().clear();
				return;
			case FhirPackage.CONSENT__DATA_PERIOD:
				setDataPeriod((Period)null);
				return;
			case FhirPackage.CONSENT__DATA:
				getData().clear();
				return;
			case FhirPackage.CONSENT__EXCEPT:
				getExcept().clear();
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
			case FhirPackage.CONSENT__IDENTIFIER:
				return identifier != null;
			case FhirPackage.CONSENT__STATUS:
				return status != null;
			case FhirPackage.CONSENT__CATEGORY:
				return category != null && !category.isEmpty();
			case FhirPackage.CONSENT__PATIENT:
				return patient != null;
			case FhirPackage.CONSENT__PERIOD:
				return period != null;
			case FhirPackage.CONSENT__DATE_TIME:
				return dateTime != null;
			case FhirPackage.CONSENT__CONSENTOR:
				return consentor != null && !consentor.isEmpty();
			case FhirPackage.CONSENT__ACTOR:
				return actor != null && !actor.isEmpty();
			case FhirPackage.CONSENT__ACTION:
				return action != null && !action.isEmpty();
			case FhirPackage.CONSENT__ORGANIZATION:
				return organization != null;
			case FhirPackage.CONSENT__SOURCE_ATTACHMENT:
				return sourceAttachment != null;
			case FhirPackage.CONSENT__SOURCE_IDENTIFIER:
				return sourceIdentifier != null;
			case FhirPackage.CONSENT__SOURCE_REFERENCE:
				return sourceReference != null;
			case FhirPackage.CONSENT__POLICY:
				return policy != null && !policy.isEmpty();
			case FhirPackage.CONSENT__POLICY_RULE:
				return policyRule != null;
			case FhirPackage.CONSENT__SECURITY_LABEL:
				return securityLabel != null && !securityLabel.isEmpty();
			case FhirPackage.CONSENT__PURPOSE:
				return purpose != null && !purpose.isEmpty();
			case FhirPackage.CONSENT__DATA_PERIOD:
				return dataPeriod != null;
			case FhirPackage.CONSENT__DATA:
				return data != null && !data.isEmpty();
			case FhirPackage.CONSENT__EXCEPT:
				return except != null && !except.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //ConsentImpl
