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
import org.hl7.fhir.CodeableConcept;
import org.hl7.fhir.DateTime;
import org.hl7.fhir.FhirPackage;
import org.hl7.fhir.Identifier;
import org.hl7.fhir.Period;
import org.hl7.fhir.Procedure;
import org.hl7.fhir.ProcedureFocalDevice;
import org.hl7.fhir.ProcedurePerformer;
import org.hl7.fhir.ProcedureStatus;
import org.hl7.fhir.Reference;
import org.hl7.fhir.Timing;
import org.hl7.fhir.jaxb.BooleanImplAdapter;
import org.hl7.fhir.jaxb.DateTimeImplAdapter;
import org.hl7.fhir.jaxb.ProcedureStatusImplAdapter;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Procedure</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.hl7.fhir.impl.ProcedureImpl#getIdentifier <em>Identifier</em>}</li>
 *   <li>{@link org.hl7.fhir.impl.ProcedureImpl#getDefinition <em>Definition</em>}</li>
 *   <li>{@link org.hl7.fhir.impl.ProcedureImpl#getBasedOn <em>Based On</em>}</li>
 *   <li>{@link org.hl7.fhir.impl.ProcedureImpl#getPartOf <em>Part Of</em>}</li>
 *   <li>{@link org.hl7.fhir.impl.ProcedureImpl#getStatus <em>Status</em>}</li>
 *   <li>{@link org.hl7.fhir.impl.ProcedureImpl#getCategory <em>Category</em>}</li>
 *   <li>{@link org.hl7.fhir.impl.ProcedureImpl#getCode <em>Code</em>}</li>
 *   <li>{@link org.hl7.fhir.impl.ProcedureImpl#getSubject <em>Subject</em>}</li>
 *   <li>{@link org.hl7.fhir.impl.ProcedureImpl#getContext <em>Context</em>}</li>
 *   <li>{@link org.hl7.fhir.impl.ProcedureImpl#getPerformedDateTime <em>Performed Date Time</em>}</li>
 *   <li>{@link org.hl7.fhir.impl.ProcedureImpl#getPerformedPeriod <em>Performed Period</em>}</li>
 *   <li>{@link org.hl7.fhir.impl.ProcedureImpl#getPerformedTiming <em>Performed Timing</em>}</li>
 *   <li>{@link org.hl7.fhir.impl.ProcedureImpl#getPerformer <em>Performer</em>}</li>
 *   <li>{@link org.hl7.fhir.impl.ProcedureImpl#getLocation <em>Location</em>}</li>
 *   <li>{@link org.hl7.fhir.impl.ProcedureImpl#getReasonCodeableConcept <em>Reason Codeable Concept</em>}</li>
 *   <li>{@link org.hl7.fhir.impl.ProcedureImpl#getReasonReference <em>Reason Reference</em>}</li>
 *   <li>{@link org.hl7.fhir.impl.ProcedureImpl#getNotDone <em>Not Done</em>}</li>
 *   <li>{@link org.hl7.fhir.impl.ProcedureImpl#getNotDoneReason <em>Not Done Reason</em>}</li>
 *   <li>{@link org.hl7.fhir.impl.ProcedureImpl#getBodySite <em>Body Site</em>}</li>
 *   <li>{@link org.hl7.fhir.impl.ProcedureImpl#getOutcome <em>Outcome</em>}</li>
 *   <li>{@link org.hl7.fhir.impl.ProcedureImpl#getReport <em>Report</em>}</li>
 *   <li>{@link org.hl7.fhir.impl.ProcedureImpl#getComplication <em>Complication</em>}</li>
 *   <li>{@link org.hl7.fhir.impl.ProcedureImpl#getComplicationDetail <em>Complication Detail</em>}</li>
 *   <li>{@link org.hl7.fhir.impl.ProcedureImpl#getFollowUp <em>Follow Up</em>}</li>
 *   <li>{@link org.hl7.fhir.impl.ProcedureImpl#getNote <em>Note</em>}</li>
 *   <li>{@link org.hl7.fhir.impl.ProcedureImpl#getFocalDevice <em>Focal Device</em>}</li>
 *   <li>{@link org.hl7.fhir.impl.ProcedureImpl#getUsedReference <em>Used Reference</em>}</li>
 *   <li>{@link org.hl7.fhir.impl.ProcedureImpl#getUsedCode <em>Used Code</em>}</li>
 * </ul>
 *
 * @generated
 */
@XmlType(name = "Procedure", namespace = "http://hl7.org/fhir")
@XmlRootElement(name = "fhir.Procedure")
public class ProcedureImpl extends DomainResourceImpl implements Procedure {
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
	protected ProcedureStatus status;

	/**
	 * The cached value of the '{@link #getCategory() <em>Category</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCategory()
	 * @generated
	 * @ordered
	 */
	protected CodeableConcept category;

	/**
	 * The cached value of the '{@link #getCode() <em>Code</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCode()
	 * @generated
	 * @ordered
	 */
	protected CodeableConcept code;

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
	 * The cached value of the '{@link #getPerformedDateTime() <em>Performed Date Time</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPerformedDateTime()
	 * @generated
	 * @ordered
	 */
	protected DateTime performedDateTime;

	/**
	 * The cached value of the '{@link #getPerformedPeriod() <em>Performed Period</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPerformedPeriod()
	 * @generated
	 * @ordered
	 */
	protected Period performedPeriod;

	/**
	 * The cached value of the '{@link #getPerformedTiming() <em>Performed Timing</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPerformedTiming()
	 * @generated
	 * @ordered
	 */
	protected Timing performedTiming;

	/**
	 * The cached value of the '{@link #getPerformer() <em>Performer</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPerformer()
	 * @generated
	 * @ordered
	 */
	protected EList<ProcedurePerformer> performer;

	/**
	 * The cached value of the '{@link #getLocation() <em>Location</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLocation()
	 * @generated
	 * @ordered
	 */
	protected Reference location;

	/**
	 * The cached value of the '{@link #getReasonCodeableConcept() <em>Reason Codeable Concept</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getReasonCodeableConcept()
	 * @generated
	 * @ordered
	 */
	protected EList<CodeableConcept> reasonCodeableConcept;

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
	 * The cached value of the '{@link #getBodySite() <em>Body Site</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getBodySite()
	 * @generated
	 * @ordered
	 */
	protected EList<CodeableConcept> bodySite;

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
	 * The cached value of the '{@link #getReport() <em>Report</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getReport()
	 * @generated
	 * @ordered
	 */
	protected EList<Reference> report;

	/**
	 * The cached value of the '{@link #getComplication() <em>Complication</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getComplication()
	 * @generated
	 * @ordered
	 */
	protected EList<CodeableConcept> complication;

	/**
	 * The cached value of the '{@link #getComplicationDetail() <em>Complication Detail</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getComplicationDetail()
	 * @generated
	 * @ordered
	 */
	protected EList<Reference> complicationDetail;

	/**
	 * The cached value of the '{@link #getFollowUp() <em>Follow Up</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFollowUp()
	 * @generated
	 * @ordered
	 */
	protected EList<CodeableConcept> followUp;

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
	 * The cached value of the '{@link #getFocalDevice() <em>Focal Device</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFocalDevice()
	 * @generated
	 * @ordered
	 */
	protected EList<ProcedureFocalDevice> focalDevice;

	/**
	 * The cached value of the '{@link #getUsedReference() <em>Used Reference</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getUsedReference()
	 * @generated
	 * @ordered
	 */
	protected EList<Reference> usedReference;

	/**
	 * The cached value of the '{@link #getUsedCode() <em>Used Code</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getUsedCode()
	 * @generated
	 * @ordered
	 */
	protected EList<CodeableConcept> usedCode;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ProcedureImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return FhirPackage.eINSTANCE.getProcedure();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@XmlElement
	public List<Identifier> getIdentifier() {
		if (identifier == null) {
			identifier = new EObjectContainmentEList<Identifier>(Identifier.class, this, FhirPackage.PROCEDURE__IDENTIFIER);
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
			definition = new EObjectContainmentEList<Reference>(Reference.class, this, FhirPackage.PROCEDURE__DEFINITION);
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
			basedOn = new EObjectContainmentEList<Reference>(Reference.class, this, FhirPackage.PROCEDURE__BASED_ON);
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
			partOf = new EObjectContainmentEList<Reference>(Reference.class, this, FhirPackage.PROCEDURE__PART_OF);
		}
		return partOf;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@XmlJavaTypeAdapter(ProcedureStatusImplAdapter.class)
	@XmlElement(required = true)
	public ProcedureStatus getStatus() {
		return status;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetStatus(ProcedureStatus newStatus, NotificationChain msgs) {
		ProcedureStatus oldStatus = status;
		status = newStatus;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FhirPackage.PROCEDURE__STATUS, oldStatus, newStatus);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setStatus(ProcedureStatus newStatus) {
		if (newStatus != status) {
			NotificationChain msgs = null;
			if (status != null)
				msgs = ((InternalEObject)status).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FhirPackage.PROCEDURE__STATUS, null, msgs);
			if (newStatus != null)
				msgs = ((InternalEObject)newStatus).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FhirPackage.PROCEDURE__STATUS, null, msgs);
			msgs = basicSetStatus(newStatus, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FhirPackage.PROCEDURE__STATUS, newStatus, newStatus));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CodeableConcept getCategory() {
		return category;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetCategory(CodeableConcept newCategory, NotificationChain msgs) {
		CodeableConcept oldCategory = category;
		category = newCategory;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FhirPackage.PROCEDURE__CATEGORY, oldCategory, newCategory);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setCategory(CodeableConcept newCategory) {
		if (newCategory != category) {
			NotificationChain msgs = null;
			if (category != null)
				msgs = ((InternalEObject)category).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FhirPackage.PROCEDURE__CATEGORY, null, msgs);
			if (newCategory != null)
				msgs = ((InternalEObject)newCategory).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FhirPackage.PROCEDURE__CATEGORY, null, msgs);
			msgs = basicSetCategory(newCategory, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FhirPackage.PROCEDURE__CATEGORY, newCategory, newCategory));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CodeableConcept getCode() {
		return code;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetCode(CodeableConcept newCode, NotificationChain msgs) {
		CodeableConcept oldCode = code;
		code = newCode;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FhirPackage.PROCEDURE__CODE, oldCode, newCode);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setCode(CodeableConcept newCode) {
		if (newCode != code) {
			NotificationChain msgs = null;
			if (code != null)
				msgs = ((InternalEObject)code).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FhirPackage.PROCEDURE__CODE, null, msgs);
			if (newCode != null)
				msgs = ((InternalEObject)newCode).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FhirPackage.PROCEDURE__CODE, null, msgs);
			msgs = basicSetCode(newCode, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FhirPackage.PROCEDURE__CODE, newCode, newCode));
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
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FhirPackage.PROCEDURE__SUBJECT, oldSubject, newSubject);
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
				msgs = ((InternalEObject)subject).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FhirPackage.PROCEDURE__SUBJECT, null, msgs);
			if (newSubject != null)
				msgs = ((InternalEObject)newSubject).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FhirPackage.PROCEDURE__SUBJECT, null, msgs);
			msgs = basicSetSubject(newSubject, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FhirPackage.PROCEDURE__SUBJECT, newSubject, newSubject));
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
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FhirPackage.PROCEDURE__CONTEXT, oldContext, newContext);
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
				msgs = ((InternalEObject)context).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FhirPackage.PROCEDURE__CONTEXT, null, msgs);
			if (newContext != null)
				msgs = ((InternalEObject)newContext).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FhirPackage.PROCEDURE__CONTEXT, null, msgs);
			msgs = basicSetContext(newContext, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FhirPackage.PROCEDURE__CONTEXT, newContext, newContext));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@XmlJavaTypeAdapter(DateTimeImplAdapter.class)
	public DateTime getPerformedDateTime() {
		return performedDateTime;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetPerformedDateTime(DateTime newPerformedDateTime, NotificationChain msgs) {
		DateTime oldPerformedDateTime = performedDateTime;
		performedDateTime = newPerformedDateTime;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FhirPackage.PROCEDURE__PERFORMED_DATE_TIME, oldPerformedDateTime, newPerformedDateTime);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setPerformedDateTime(DateTime newPerformedDateTime) {
		if (newPerformedDateTime != performedDateTime) {
			NotificationChain msgs = null;
			if (performedDateTime != null)
				msgs = ((InternalEObject)performedDateTime).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FhirPackage.PROCEDURE__PERFORMED_DATE_TIME, null, msgs);
			if (newPerformedDateTime != null)
				msgs = ((InternalEObject)newPerformedDateTime).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FhirPackage.PROCEDURE__PERFORMED_DATE_TIME, null, msgs);
			msgs = basicSetPerformedDateTime(newPerformedDateTime, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FhirPackage.PROCEDURE__PERFORMED_DATE_TIME, newPerformedDateTime, newPerformedDateTime));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Period getPerformedPeriod() {
		return performedPeriod;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetPerformedPeriod(Period newPerformedPeriod, NotificationChain msgs) {
		Period oldPerformedPeriod = performedPeriod;
		performedPeriod = newPerformedPeriod;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FhirPackage.PROCEDURE__PERFORMED_PERIOD, oldPerformedPeriod, newPerformedPeriod);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setPerformedPeriod(Period newPerformedPeriod) {
		if (newPerformedPeriod != performedPeriod) {
			NotificationChain msgs = null;
			if (performedPeriod != null)
				msgs = ((InternalEObject)performedPeriod).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FhirPackage.PROCEDURE__PERFORMED_PERIOD, null, msgs);
			if (newPerformedPeriod != null)
				msgs = ((InternalEObject)newPerformedPeriod).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FhirPackage.PROCEDURE__PERFORMED_PERIOD, null, msgs);
			msgs = basicSetPerformedPeriod(newPerformedPeriod, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FhirPackage.PROCEDURE__PERFORMED_PERIOD, newPerformedPeriod, newPerformedPeriod));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Timing getPerformedTiming() {
		return performedTiming;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetPerformedTiming(Timing newPerformedTiming, NotificationChain msgs) {
		Timing oldPerformedTiming = performedTiming;
		performedTiming = newPerformedTiming;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FhirPackage.PROCEDURE__PERFORMED_TIMING, oldPerformedTiming, newPerformedTiming);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setPerformedTiming(Timing newPerformedTiming) {
		if (newPerformedTiming != performedTiming) {
			NotificationChain msgs = null;
			if (performedTiming != null)
				msgs = ((InternalEObject)performedTiming).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FhirPackage.PROCEDURE__PERFORMED_TIMING, null, msgs);
			if (newPerformedTiming != null)
				msgs = ((InternalEObject)newPerformedTiming).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FhirPackage.PROCEDURE__PERFORMED_TIMING, null, msgs);
			msgs = basicSetPerformedTiming(newPerformedTiming, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FhirPackage.PROCEDURE__PERFORMED_TIMING, newPerformedTiming, newPerformedTiming));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@XmlElement
	public List<ProcedurePerformer> getPerformer() {
		if (performer == null) {
			performer = new EObjectContainmentEList<ProcedurePerformer>(ProcedurePerformer.class, this, FhirPackage.PROCEDURE__PERFORMER);
		}
		return performer;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Reference getLocation() {
		return location;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetLocation(Reference newLocation, NotificationChain msgs) {
		Reference oldLocation = location;
		location = newLocation;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FhirPackage.PROCEDURE__LOCATION, oldLocation, newLocation);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setLocation(Reference newLocation) {
		if (newLocation != location) {
			NotificationChain msgs = null;
			if (location != null)
				msgs = ((InternalEObject)location).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FhirPackage.PROCEDURE__LOCATION, null, msgs);
			if (newLocation != null)
				msgs = ((InternalEObject)newLocation).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FhirPackage.PROCEDURE__LOCATION, null, msgs);
			msgs = basicSetLocation(newLocation, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FhirPackage.PROCEDURE__LOCATION, newLocation, newLocation));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@XmlElement
	public List<CodeableConcept> getReasonCodeableConcept() {
		if (reasonCodeableConcept == null) {
			reasonCodeableConcept = new EObjectContainmentEList<CodeableConcept>(CodeableConcept.class, this, FhirPackage.PROCEDURE__REASON_CODEABLE_CONCEPT);
		}
		return reasonCodeableConcept;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@XmlElement
	public List<Reference> getReasonReference() {
		if (reasonReference == null) {
			reasonReference = new EObjectContainmentEList<Reference>(Reference.class, this, FhirPackage.PROCEDURE__REASON_REFERENCE);
		}
		return reasonReference;
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
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FhirPackage.PROCEDURE__NOT_DONE, oldNotDone, newNotDone);
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
				msgs = ((InternalEObject)notDone).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FhirPackage.PROCEDURE__NOT_DONE, null, msgs);
			if (newNotDone != null)
				msgs = ((InternalEObject)newNotDone).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FhirPackage.PROCEDURE__NOT_DONE, null, msgs);
			msgs = basicSetNotDone(newNotDone, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FhirPackage.PROCEDURE__NOT_DONE, newNotDone, newNotDone));
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
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FhirPackage.PROCEDURE__NOT_DONE_REASON, oldNotDoneReason, newNotDoneReason);
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
				msgs = ((InternalEObject)notDoneReason).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FhirPackage.PROCEDURE__NOT_DONE_REASON, null, msgs);
			if (newNotDoneReason != null)
				msgs = ((InternalEObject)newNotDoneReason).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FhirPackage.PROCEDURE__NOT_DONE_REASON, null, msgs);
			msgs = basicSetNotDoneReason(newNotDoneReason, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FhirPackage.PROCEDURE__NOT_DONE_REASON, newNotDoneReason, newNotDoneReason));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@XmlElement
	public List<CodeableConcept> getBodySite() {
		if (bodySite == null) {
			bodySite = new EObjectContainmentEList<CodeableConcept>(CodeableConcept.class, this, FhirPackage.PROCEDURE__BODY_SITE);
		}
		return bodySite;
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
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FhirPackage.PROCEDURE__OUTCOME, oldOutcome, newOutcome);
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
				msgs = ((InternalEObject)outcome).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FhirPackage.PROCEDURE__OUTCOME, null, msgs);
			if (newOutcome != null)
				msgs = ((InternalEObject)newOutcome).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FhirPackage.PROCEDURE__OUTCOME, null, msgs);
			msgs = basicSetOutcome(newOutcome, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FhirPackage.PROCEDURE__OUTCOME, newOutcome, newOutcome));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@XmlElement
	public List<Reference> getReport() {
		if (report == null) {
			report = new EObjectContainmentEList<Reference>(Reference.class, this, FhirPackage.PROCEDURE__REPORT);
		}
		return report;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@XmlElement
	public List<CodeableConcept> getComplication() {
		if (complication == null) {
			complication = new EObjectContainmentEList<CodeableConcept>(CodeableConcept.class, this, FhirPackage.PROCEDURE__COMPLICATION);
		}
		return complication;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@XmlElement
	public List<Reference> getComplicationDetail() {
		if (complicationDetail == null) {
			complicationDetail = new EObjectContainmentEList<Reference>(Reference.class, this, FhirPackage.PROCEDURE__COMPLICATION_DETAIL);
		}
		return complicationDetail;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@XmlElement
	public List<CodeableConcept> getFollowUp() {
		if (followUp == null) {
			followUp = new EObjectContainmentEList<CodeableConcept>(CodeableConcept.class, this, FhirPackage.PROCEDURE__FOLLOW_UP);
		}
		return followUp;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@XmlElement
	public List<Annotation> getNote() {
		if (note == null) {
			note = new EObjectContainmentEList<Annotation>(Annotation.class, this, FhirPackage.PROCEDURE__NOTE);
		}
		return note;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@XmlElement
	public List<ProcedureFocalDevice> getFocalDevice() {
		if (focalDevice == null) {
			focalDevice = new EObjectContainmentEList<ProcedureFocalDevice>(ProcedureFocalDevice.class, this, FhirPackage.PROCEDURE__FOCAL_DEVICE);
		}
		return focalDevice;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@XmlElement
	public List<Reference> getUsedReference() {
		if (usedReference == null) {
			usedReference = new EObjectContainmentEList<Reference>(Reference.class, this, FhirPackage.PROCEDURE__USED_REFERENCE);
		}
		return usedReference;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@XmlElement
	public List<CodeableConcept> getUsedCode() {
		if (usedCode == null) {
			usedCode = new EObjectContainmentEList<CodeableConcept>(CodeableConcept.class, this, FhirPackage.PROCEDURE__USED_CODE);
		}
		return usedCode;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case FhirPackage.PROCEDURE__IDENTIFIER:
				return ((InternalEList<?>)getIdentifier()).basicRemove(otherEnd, msgs);
			case FhirPackage.PROCEDURE__DEFINITION:
				return ((InternalEList<?>)getDefinition()).basicRemove(otherEnd, msgs);
			case FhirPackage.PROCEDURE__BASED_ON:
				return ((InternalEList<?>)getBasedOn()).basicRemove(otherEnd, msgs);
			case FhirPackage.PROCEDURE__PART_OF:
				return ((InternalEList<?>)getPartOf()).basicRemove(otherEnd, msgs);
			case FhirPackage.PROCEDURE__STATUS:
				return basicSetStatus(null, msgs);
			case FhirPackage.PROCEDURE__CATEGORY:
				return basicSetCategory(null, msgs);
			case FhirPackage.PROCEDURE__CODE:
				return basicSetCode(null, msgs);
			case FhirPackage.PROCEDURE__SUBJECT:
				return basicSetSubject(null, msgs);
			case FhirPackage.PROCEDURE__CONTEXT:
				return basicSetContext(null, msgs);
			case FhirPackage.PROCEDURE__PERFORMED_DATE_TIME:
				return basicSetPerformedDateTime(null, msgs);
			case FhirPackage.PROCEDURE__PERFORMED_PERIOD:
				return basicSetPerformedPeriod(null, msgs);
			case FhirPackage.PROCEDURE__PERFORMED_TIMING:
				return basicSetPerformedTiming(null, msgs);
			case FhirPackage.PROCEDURE__PERFORMER:
				return ((InternalEList<?>)getPerformer()).basicRemove(otherEnd, msgs);
			case FhirPackage.PROCEDURE__LOCATION:
				return basicSetLocation(null, msgs);
			case FhirPackage.PROCEDURE__REASON_CODEABLE_CONCEPT:
				return ((InternalEList<?>)getReasonCodeableConcept()).basicRemove(otherEnd, msgs);
			case FhirPackage.PROCEDURE__REASON_REFERENCE:
				return ((InternalEList<?>)getReasonReference()).basicRemove(otherEnd, msgs);
			case FhirPackage.PROCEDURE__NOT_DONE:
				return basicSetNotDone(null, msgs);
			case FhirPackage.PROCEDURE__NOT_DONE_REASON:
				return basicSetNotDoneReason(null, msgs);
			case FhirPackage.PROCEDURE__BODY_SITE:
				return ((InternalEList<?>)getBodySite()).basicRemove(otherEnd, msgs);
			case FhirPackage.PROCEDURE__OUTCOME:
				return basicSetOutcome(null, msgs);
			case FhirPackage.PROCEDURE__REPORT:
				return ((InternalEList<?>)getReport()).basicRemove(otherEnd, msgs);
			case FhirPackage.PROCEDURE__COMPLICATION:
				return ((InternalEList<?>)getComplication()).basicRemove(otherEnd, msgs);
			case FhirPackage.PROCEDURE__COMPLICATION_DETAIL:
				return ((InternalEList<?>)getComplicationDetail()).basicRemove(otherEnd, msgs);
			case FhirPackage.PROCEDURE__FOLLOW_UP:
				return ((InternalEList<?>)getFollowUp()).basicRemove(otherEnd, msgs);
			case FhirPackage.PROCEDURE__NOTE:
				return ((InternalEList<?>)getNote()).basicRemove(otherEnd, msgs);
			case FhirPackage.PROCEDURE__FOCAL_DEVICE:
				return ((InternalEList<?>)getFocalDevice()).basicRemove(otherEnd, msgs);
			case FhirPackage.PROCEDURE__USED_REFERENCE:
				return ((InternalEList<?>)getUsedReference()).basicRemove(otherEnd, msgs);
			case FhirPackage.PROCEDURE__USED_CODE:
				return ((InternalEList<?>)getUsedCode()).basicRemove(otherEnd, msgs);
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
			case FhirPackage.PROCEDURE__IDENTIFIER:
				return getIdentifier();
			case FhirPackage.PROCEDURE__DEFINITION:
				return getDefinition();
			case FhirPackage.PROCEDURE__BASED_ON:
				return getBasedOn();
			case FhirPackage.PROCEDURE__PART_OF:
				return getPartOf();
			case FhirPackage.PROCEDURE__STATUS:
				return getStatus();
			case FhirPackage.PROCEDURE__CATEGORY:
				return getCategory();
			case FhirPackage.PROCEDURE__CODE:
				return getCode();
			case FhirPackage.PROCEDURE__SUBJECT:
				return getSubject();
			case FhirPackage.PROCEDURE__CONTEXT:
				return getContext();
			case FhirPackage.PROCEDURE__PERFORMED_DATE_TIME:
				return getPerformedDateTime();
			case FhirPackage.PROCEDURE__PERFORMED_PERIOD:
				return getPerformedPeriod();
			case FhirPackage.PROCEDURE__PERFORMED_TIMING:
				return getPerformedTiming();
			case FhirPackage.PROCEDURE__PERFORMER:
				return getPerformer();
			case FhirPackage.PROCEDURE__LOCATION:
				return getLocation();
			case FhirPackage.PROCEDURE__REASON_CODEABLE_CONCEPT:
				return getReasonCodeableConcept();
			case FhirPackage.PROCEDURE__REASON_REFERENCE:
				return getReasonReference();
			case FhirPackage.PROCEDURE__NOT_DONE:
				return getNotDone();
			case FhirPackage.PROCEDURE__NOT_DONE_REASON:
				return getNotDoneReason();
			case FhirPackage.PROCEDURE__BODY_SITE:
				return getBodySite();
			case FhirPackage.PROCEDURE__OUTCOME:
				return getOutcome();
			case FhirPackage.PROCEDURE__REPORT:
				return getReport();
			case FhirPackage.PROCEDURE__COMPLICATION:
				return getComplication();
			case FhirPackage.PROCEDURE__COMPLICATION_DETAIL:
				return getComplicationDetail();
			case FhirPackage.PROCEDURE__FOLLOW_UP:
				return getFollowUp();
			case FhirPackage.PROCEDURE__NOTE:
				return getNote();
			case FhirPackage.PROCEDURE__FOCAL_DEVICE:
				return getFocalDevice();
			case FhirPackage.PROCEDURE__USED_REFERENCE:
				return getUsedReference();
			case FhirPackage.PROCEDURE__USED_CODE:
				return getUsedCode();
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
			case FhirPackage.PROCEDURE__IDENTIFIER:
				getIdentifier().clear();
				getIdentifier().addAll((Collection<? extends Identifier>)newValue);
				return;
			case FhirPackage.PROCEDURE__DEFINITION:
				getDefinition().clear();
				getDefinition().addAll((Collection<? extends Reference>)newValue);
				return;
			case FhirPackage.PROCEDURE__BASED_ON:
				getBasedOn().clear();
				getBasedOn().addAll((Collection<? extends Reference>)newValue);
				return;
			case FhirPackage.PROCEDURE__PART_OF:
				getPartOf().clear();
				getPartOf().addAll((Collection<? extends Reference>)newValue);
				return;
			case FhirPackage.PROCEDURE__STATUS:
				setStatus((ProcedureStatus)newValue);
				return;
			case FhirPackage.PROCEDURE__CATEGORY:
				setCategory((CodeableConcept)newValue);
				return;
			case FhirPackage.PROCEDURE__CODE:
				setCode((CodeableConcept)newValue);
				return;
			case FhirPackage.PROCEDURE__SUBJECT:
				setSubject((Reference)newValue);
				return;
			case FhirPackage.PROCEDURE__CONTEXT:
				setContext((Reference)newValue);
				return;
			case FhirPackage.PROCEDURE__PERFORMED_DATE_TIME:
				setPerformedDateTime((DateTime)newValue);
				return;
			case FhirPackage.PROCEDURE__PERFORMED_PERIOD:
				setPerformedPeriod((Period)newValue);
				return;
			case FhirPackage.PROCEDURE__PERFORMED_TIMING:
				setPerformedTiming((Timing)newValue);
				return;
			case FhirPackage.PROCEDURE__PERFORMER:
				getPerformer().clear();
				getPerformer().addAll((Collection<? extends ProcedurePerformer>)newValue);
				return;
			case FhirPackage.PROCEDURE__LOCATION:
				setLocation((Reference)newValue);
				return;
			case FhirPackage.PROCEDURE__REASON_CODEABLE_CONCEPT:
				getReasonCodeableConcept().clear();
				getReasonCodeableConcept().addAll((Collection<? extends CodeableConcept>)newValue);
				return;
			case FhirPackage.PROCEDURE__REASON_REFERENCE:
				getReasonReference().clear();
				getReasonReference().addAll((Collection<? extends Reference>)newValue);
				return;
			case FhirPackage.PROCEDURE__NOT_DONE:
				setNotDone((org.hl7.fhir.Boolean)newValue);
				return;
			case FhirPackage.PROCEDURE__NOT_DONE_REASON:
				setNotDoneReason((CodeableConcept)newValue);
				return;
			case FhirPackage.PROCEDURE__BODY_SITE:
				getBodySite().clear();
				getBodySite().addAll((Collection<? extends CodeableConcept>)newValue);
				return;
			case FhirPackage.PROCEDURE__OUTCOME:
				setOutcome((CodeableConcept)newValue);
				return;
			case FhirPackage.PROCEDURE__REPORT:
				getReport().clear();
				getReport().addAll((Collection<? extends Reference>)newValue);
				return;
			case FhirPackage.PROCEDURE__COMPLICATION:
				getComplication().clear();
				getComplication().addAll((Collection<? extends CodeableConcept>)newValue);
				return;
			case FhirPackage.PROCEDURE__COMPLICATION_DETAIL:
				getComplicationDetail().clear();
				getComplicationDetail().addAll((Collection<? extends Reference>)newValue);
				return;
			case FhirPackage.PROCEDURE__FOLLOW_UP:
				getFollowUp().clear();
				getFollowUp().addAll((Collection<? extends CodeableConcept>)newValue);
				return;
			case FhirPackage.PROCEDURE__NOTE:
				getNote().clear();
				getNote().addAll((Collection<? extends Annotation>)newValue);
				return;
			case FhirPackage.PROCEDURE__FOCAL_DEVICE:
				getFocalDevice().clear();
				getFocalDevice().addAll((Collection<? extends ProcedureFocalDevice>)newValue);
				return;
			case FhirPackage.PROCEDURE__USED_REFERENCE:
				getUsedReference().clear();
				getUsedReference().addAll((Collection<? extends Reference>)newValue);
				return;
			case FhirPackage.PROCEDURE__USED_CODE:
				getUsedCode().clear();
				getUsedCode().addAll((Collection<? extends CodeableConcept>)newValue);
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
			case FhirPackage.PROCEDURE__IDENTIFIER:
				getIdentifier().clear();
				return;
			case FhirPackage.PROCEDURE__DEFINITION:
				getDefinition().clear();
				return;
			case FhirPackage.PROCEDURE__BASED_ON:
				getBasedOn().clear();
				return;
			case FhirPackage.PROCEDURE__PART_OF:
				getPartOf().clear();
				return;
			case FhirPackage.PROCEDURE__STATUS:
				setStatus((ProcedureStatus)null);
				return;
			case FhirPackage.PROCEDURE__CATEGORY:
				setCategory((CodeableConcept)null);
				return;
			case FhirPackage.PROCEDURE__CODE:
				setCode((CodeableConcept)null);
				return;
			case FhirPackage.PROCEDURE__SUBJECT:
				setSubject((Reference)null);
				return;
			case FhirPackage.PROCEDURE__CONTEXT:
				setContext((Reference)null);
				return;
			case FhirPackage.PROCEDURE__PERFORMED_DATE_TIME:
				setPerformedDateTime((DateTime)null);
				return;
			case FhirPackage.PROCEDURE__PERFORMED_PERIOD:
				setPerformedPeriod((Period)null);
				return;
			case FhirPackage.PROCEDURE__PERFORMED_TIMING:
				setPerformedTiming((Timing)null);
				return;
			case FhirPackage.PROCEDURE__PERFORMER:
				getPerformer().clear();
				return;
			case FhirPackage.PROCEDURE__LOCATION:
				setLocation((Reference)null);
				return;
			case FhirPackage.PROCEDURE__REASON_CODEABLE_CONCEPT:
				getReasonCodeableConcept().clear();
				return;
			case FhirPackage.PROCEDURE__REASON_REFERENCE:
				getReasonReference().clear();
				return;
			case FhirPackage.PROCEDURE__NOT_DONE:
				setNotDone((org.hl7.fhir.Boolean)null);
				return;
			case FhirPackage.PROCEDURE__NOT_DONE_REASON:
				setNotDoneReason((CodeableConcept)null);
				return;
			case FhirPackage.PROCEDURE__BODY_SITE:
				getBodySite().clear();
				return;
			case FhirPackage.PROCEDURE__OUTCOME:
				setOutcome((CodeableConcept)null);
				return;
			case FhirPackage.PROCEDURE__REPORT:
				getReport().clear();
				return;
			case FhirPackage.PROCEDURE__COMPLICATION:
				getComplication().clear();
				return;
			case FhirPackage.PROCEDURE__COMPLICATION_DETAIL:
				getComplicationDetail().clear();
				return;
			case FhirPackage.PROCEDURE__FOLLOW_UP:
				getFollowUp().clear();
				return;
			case FhirPackage.PROCEDURE__NOTE:
				getNote().clear();
				return;
			case FhirPackage.PROCEDURE__FOCAL_DEVICE:
				getFocalDevice().clear();
				return;
			case FhirPackage.PROCEDURE__USED_REFERENCE:
				getUsedReference().clear();
				return;
			case FhirPackage.PROCEDURE__USED_CODE:
				getUsedCode().clear();
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
			case FhirPackage.PROCEDURE__IDENTIFIER:
				return identifier != null && !identifier.isEmpty();
			case FhirPackage.PROCEDURE__DEFINITION:
				return definition != null && !definition.isEmpty();
			case FhirPackage.PROCEDURE__BASED_ON:
				return basedOn != null && !basedOn.isEmpty();
			case FhirPackage.PROCEDURE__PART_OF:
				return partOf != null && !partOf.isEmpty();
			case FhirPackage.PROCEDURE__STATUS:
				return status != null;
			case FhirPackage.PROCEDURE__CATEGORY:
				return category != null;
			case FhirPackage.PROCEDURE__CODE:
				return code != null;
			case FhirPackage.PROCEDURE__SUBJECT:
				return subject != null;
			case FhirPackage.PROCEDURE__CONTEXT:
				return context != null;
			case FhirPackage.PROCEDURE__PERFORMED_DATE_TIME:
				return performedDateTime != null;
			case FhirPackage.PROCEDURE__PERFORMED_PERIOD:
				return performedPeriod != null;
			case FhirPackage.PROCEDURE__PERFORMED_TIMING:
				return performedTiming != null;
			case FhirPackage.PROCEDURE__PERFORMER:
				return performer != null && !performer.isEmpty();
			case FhirPackage.PROCEDURE__LOCATION:
				return location != null;
			case FhirPackage.PROCEDURE__REASON_CODEABLE_CONCEPT:
				return reasonCodeableConcept != null && !reasonCodeableConcept.isEmpty();
			case FhirPackage.PROCEDURE__REASON_REFERENCE:
				return reasonReference != null && !reasonReference.isEmpty();
			case FhirPackage.PROCEDURE__NOT_DONE:
				return notDone != null;
			case FhirPackage.PROCEDURE__NOT_DONE_REASON:
				return notDoneReason != null;
			case FhirPackage.PROCEDURE__BODY_SITE:
				return bodySite != null && !bodySite.isEmpty();
			case FhirPackage.PROCEDURE__OUTCOME:
				return outcome != null;
			case FhirPackage.PROCEDURE__REPORT:
				return report != null && !report.isEmpty();
			case FhirPackage.PROCEDURE__COMPLICATION:
				return complication != null && !complication.isEmpty();
			case FhirPackage.PROCEDURE__COMPLICATION_DETAIL:
				return complicationDetail != null && !complicationDetail.isEmpty();
			case FhirPackage.PROCEDURE__FOLLOW_UP:
				return followUp != null && !followUp.isEmpty();
			case FhirPackage.PROCEDURE__NOTE:
				return note != null && !note.isEmpty();
			case FhirPackage.PROCEDURE__FOCAL_DEVICE:
				return focalDevice != null && !focalDevice.isEmpty();
			case FhirPackage.PROCEDURE__USED_REFERENCE:
				return usedReference != null && !usedReference.isEmpty();
			case FhirPackage.PROCEDURE__USED_CODE:
				return usedCode != null && !usedCode.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //ProcedureImpl
