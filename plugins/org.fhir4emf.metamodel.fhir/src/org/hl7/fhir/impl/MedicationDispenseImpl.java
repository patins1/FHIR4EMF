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
import org.hl7.fhir.DosageInstruction;
import org.hl7.fhir.FhirPackage;
import org.hl7.fhir.Identifier;
import org.hl7.fhir.MedicationDispense;
import org.hl7.fhir.MedicationDispensePerformer;
import org.hl7.fhir.MedicationDispenseStatus;
import org.hl7.fhir.MedicationDispenseSubstitution;
import org.hl7.fhir.Quantity;
import org.hl7.fhir.Reference;
import org.hl7.fhir.jaxb.BooleanImplAdapter;
import org.hl7.fhir.jaxb.DateTimeImplAdapter;
import org.hl7.fhir.jaxb.MedicationDispenseStatusImplAdapter;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Medication Dispense</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.hl7.fhir.impl.MedicationDispenseImpl#getIdentifier <em>Identifier</em>}</li>
 *   <li>{@link org.hl7.fhir.impl.MedicationDispenseImpl#getPartOf <em>Part Of</em>}</li>
 *   <li>{@link org.hl7.fhir.impl.MedicationDispenseImpl#getStatus <em>Status</em>}</li>
 *   <li>{@link org.hl7.fhir.impl.MedicationDispenseImpl#getCategory <em>Category</em>}</li>
 *   <li>{@link org.hl7.fhir.impl.MedicationDispenseImpl#getMedicationCodeableConcept <em>Medication Codeable Concept</em>}</li>
 *   <li>{@link org.hl7.fhir.impl.MedicationDispenseImpl#getMedicationReference <em>Medication Reference</em>}</li>
 *   <li>{@link org.hl7.fhir.impl.MedicationDispenseImpl#getSubject <em>Subject</em>}</li>
 *   <li>{@link org.hl7.fhir.impl.MedicationDispenseImpl#getContext <em>Context</em>}</li>
 *   <li>{@link org.hl7.fhir.impl.MedicationDispenseImpl#getSupportingInformation <em>Supporting Information</em>}</li>
 *   <li>{@link org.hl7.fhir.impl.MedicationDispenseImpl#getPerformer <em>Performer</em>}</li>
 *   <li>{@link org.hl7.fhir.impl.MedicationDispenseImpl#getAuthorizingPrescription <em>Authorizing Prescription</em>}</li>
 *   <li>{@link org.hl7.fhir.impl.MedicationDispenseImpl#getType <em>Type</em>}</li>
 *   <li>{@link org.hl7.fhir.impl.MedicationDispenseImpl#getQuantity <em>Quantity</em>}</li>
 *   <li>{@link org.hl7.fhir.impl.MedicationDispenseImpl#getDaysSupply <em>Days Supply</em>}</li>
 *   <li>{@link org.hl7.fhir.impl.MedicationDispenseImpl#getWhenPrepared <em>When Prepared</em>}</li>
 *   <li>{@link org.hl7.fhir.impl.MedicationDispenseImpl#getWhenHandedOver <em>When Handed Over</em>}</li>
 *   <li>{@link org.hl7.fhir.impl.MedicationDispenseImpl#getDestination <em>Destination</em>}</li>
 *   <li>{@link org.hl7.fhir.impl.MedicationDispenseImpl#getReceiver <em>Receiver</em>}</li>
 *   <li>{@link org.hl7.fhir.impl.MedicationDispenseImpl#getNote <em>Note</em>}</li>
 *   <li>{@link org.hl7.fhir.impl.MedicationDispenseImpl#getDosageInstruction <em>Dosage Instruction</em>}</li>
 *   <li>{@link org.hl7.fhir.impl.MedicationDispenseImpl#getSubstitution <em>Substitution</em>}</li>
 *   <li>{@link org.hl7.fhir.impl.MedicationDispenseImpl#getDetectedIssue <em>Detected Issue</em>}</li>
 *   <li>{@link org.hl7.fhir.impl.MedicationDispenseImpl#getNotDone <em>Not Done</em>}</li>
 *   <li>{@link org.hl7.fhir.impl.MedicationDispenseImpl#getNotDoneReasonCodeableConcept <em>Not Done Reason Codeable Concept</em>}</li>
 *   <li>{@link org.hl7.fhir.impl.MedicationDispenseImpl#getNotDoneReasonReference <em>Not Done Reason Reference</em>}</li>
 *   <li>{@link org.hl7.fhir.impl.MedicationDispenseImpl#getEventHistory <em>Event History</em>}</li>
 * </ul>
 *
 * @generated
 */
@XmlType(name = "MedicationDispense", namespace = "http://hl7.org/fhir")
@XmlRootElement(name = "fhir.MedicationDispense")
public class MedicationDispenseImpl extends DomainResourceImpl implements MedicationDispense {
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
	protected MedicationDispenseStatus status;

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
	 * The cached value of the '{@link #getMedicationCodeableConcept() <em>Medication Codeable Concept</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMedicationCodeableConcept()
	 * @generated
	 * @ordered
	 */
	protected CodeableConcept medicationCodeableConcept;

	/**
	 * The cached value of the '{@link #getMedicationReference() <em>Medication Reference</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMedicationReference()
	 * @generated
	 * @ordered
	 */
	protected Reference medicationReference;

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
	 * The cached value of the '{@link #getSupportingInformation() <em>Supporting Information</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSupportingInformation()
	 * @generated
	 * @ordered
	 */
	protected EList<Reference> supportingInformation;

	/**
	 * The cached value of the '{@link #getPerformer() <em>Performer</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPerformer()
	 * @generated
	 * @ordered
	 */
	protected EList<MedicationDispensePerformer> performer;

	/**
	 * The cached value of the '{@link #getAuthorizingPrescription() <em>Authorizing Prescription</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAuthorizingPrescription()
	 * @generated
	 * @ordered
	 */
	protected EList<Reference> authorizingPrescription;

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
	 * The cached value of the '{@link #getQuantity() <em>Quantity</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getQuantity()
	 * @generated
	 * @ordered
	 */
	protected Quantity quantity;

	/**
	 * The cached value of the '{@link #getDaysSupply() <em>Days Supply</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDaysSupply()
	 * @generated
	 * @ordered
	 */
	protected Quantity daysSupply;

	/**
	 * The cached value of the '{@link #getWhenPrepared() <em>When Prepared</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getWhenPrepared()
	 * @generated
	 * @ordered
	 */
	protected DateTime whenPrepared;

	/**
	 * The cached value of the '{@link #getWhenHandedOver() <em>When Handed Over</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getWhenHandedOver()
	 * @generated
	 * @ordered
	 */
	protected DateTime whenHandedOver;

	/**
	 * The cached value of the '{@link #getDestination() <em>Destination</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDestination()
	 * @generated
	 * @ordered
	 */
	protected Reference destination;

	/**
	 * The cached value of the '{@link #getReceiver() <em>Receiver</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getReceiver()
	 * @generated
	 * @ordered
	 */
	protected EList<Reference> receiver;

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
	 * The cached value of the '{@link #getDosageInstruction() <em>Dosage Instruction</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDosageInstruction()
	 * @generated
	 * @ordered
	 */
	protected EList<DosageInstruction> dosageInstruction;

	/**
	 * The cached value of the '{@link #getSubstitution() <em>Substitution</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSubstitution()
	 * @generated
	 * @ordered
	 */
	protected MedicationDispenseSubstitution substitution;

	/**
	 * The cached value of the '{@link #getDetectedIssue() <em>Detected Issue</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDetectedIssue()
	 * @generated
	 * @ordered
	 */
	protected EList<Reference> detectedIssue;

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
	 * The cached value of the '{@link #getNotDoneReasonCodeableConcept() <em>Not Done Reason Codeable Concept</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNotDoneReasonCodeableConcept()
	 * @generated
	 * @ordered
	 */
	protected CodeableConcept notDoneReasonCodeableConcept;

	/**
	 * The cached value of the '{@link #getNotDoneReasonReference() <em>Not Done Reason Reference</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNotDoneReasonReference()
	 * @generated
	 * @ordered
	 */
	protected Reference notDoneReasonReference;

	/**
	 * The cached value of the '{@link #getEventHistory() <em>Event History</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getEventHistory()
	 * @generated
	 * @ordered
	 */
	protected EList<Reference> eventHistory;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected MedicationDispenseImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return FhirPackage.eINSTANCE.getMedicationDispense();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@XmlElement
	public List<Identifier> getIdentifier() {
		if (identifier == null) {
			identifier = new EObjectContainmentEList<Identifier>(Identifier.class, this, FhirPackage.MEDICATION_DISPENSE__IDENTIFIER);
		}
		return identifier;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@XmlElement
	public List<Reference> getPartOf() {
		if (partOf == null) {
			partOf = new EObjectContainmentEList<Reference>(Reference.class, this, FhirPackage.MEDICATION_DISPENSE__PART_OF);
		}
		return partOf;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@XmlJavaTypeAdapter(MedicationDispenseStatusImplAdapter.class)
	public MedicationDispenseStatus getStatus() {
		return status;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetStatus(MedicationDispenseStatus newStatus, NotificationChain msgs) {
		MedicationDispenseStatus oldStatus = status;
		status = newStatus;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FhirPackage.MEDICATION_DISPENSE__STATUS, oldStatus, newStatus);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setStatus(MedicationDispenseStatus newStatus) {
		if (newStatus != status) {
			NotificationChain msgs = null;
			if (status != null)
				msgs = ((InternalEObject)status).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FhirPackage.MEDICATION_DISPENSE__STATUS, null, msgs);
			if (newStatus != null)
				msgs = ((InternalEObject)newStatus).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FhirPackage.MEDICATION_DISPENSE__STATUS, null, msgs);
			msgs = basicSetStatus(newStatus, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FhirPackage.MEDICATION_DISPENSE__STATUS, newStatus, newStatus));
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
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FhirPackage.MEDICATION_DISPENSE__CATEGORY, oldCategory, newCategory);
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
				msgs = ((InternalEObject)category).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FhirPackage.MEDICATION_DISPENSE__CATEGORY, null, msgs);
			if (newCategory != null)
				msgs = ((InternalEObject)newCategory).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FhirPackage.MEDICATION_DISPENSE__CATEGORY, null, msgs);
			msgs = basicSetCategory(newCategory, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FhirPackage.MEDICATION_DISPENSE__CATEGORY, newCategory, newCategory));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CodeableConcept getMedicationCodeableConcept() {
		return medicationCodeableConcept;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetMedicationCodeableConcept(CodeableConcept newMedicationCodeableConcept, NotificationChain msgs) {
		CodeableConcept oldMedicationCodeableConcept = medicationCodeableConcept;
		medicationCodeableConcept = newMedicationCodeableConcept;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FhirPackage.MEDICATION_DISPENSE__MEDICATION_CODEABLE_CONCEPT, oldMedicationCodeableConcept, newMedicationCodeableConcept);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setMedicationCodeableConcept(CodeableConcept newMedicationCodeableConcept) {
		if (newMedicationCodeableConcept != medicationCodeableConcept) {
			NotificationChain msgs = null;
			if (medicationCodeableConcept != null)
				msgs = ((InternalEObject)medicationCodeableConcept).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FhirPackage.MEDICATION_DISPENSE__MEDICATION_CODEABLE_CONCEPT, null, msgs);
			if (newMedicationCodeableConcept != null)
				msgs = ((InternalEObject)newMedicationCodeableConcept).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FhirPackage.MEDICATION_DISPENSE__MEDICATION_CODEABLE_CONCEPT, null, msgs);
			msgs = basicSetMedicationCodeableConcept(newMedicationCodeableConcept, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FhirPackage.MEDICATION_DISPENSE__MEDICATION_CODEABLE_CONCEPT, newMedicationCodeableConcept, newMedicationCodeableConcept));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Reference getMedicationReference() {
		return medicationReference;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetMedicationReference(Reference newMedicationReference, NotificationChain msgs) {
		Reference oldMedicationReference = medicationReference;
		medicationReference = newMedicationReference;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FhirPackage.MEDICATION_DISPENSE__MEDICATION_REFERENCE, oldMedicationReference, newMedicationReference);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setMedicationReference(Reference newMedicationReference) {
		if (newMedicationReference != medicationReference) {
			NotificationChain msgs = null;
			if (medicationReference != null)
				msgs = ((InternalEObject)medicationReference).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FhirPackage.MEDICATION_DISPENSE__MEDICATION_REFERENCE, null, msgs);
			if (newMedicationReference != null)
				msgs = ((InternalEObject)newMedicationReference).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FhirPackage.MEDICATION_DISPENSE__MEDICATION_REFERENCE, null, msgs);
			msgs = basicSetMedicationReference(newMedicationReference, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FhirPackage.MEDICATION_DISPENSE__MEDICATION_REFERENCE, newMedicationReference, newMedicationReference));
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
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FhirPackage.MEDICATION_DISPENSE__SUBJECT, oldSubject, newSubject);
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
				msgs = ((InternalEObject)subject).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FhirPackage.MEDICATION_DISPENSE__SUBJECT, null, msgs);
			if (newSubject != null)
				msgs = ((InternalEObject)newSubject).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FhirPackage.MEDICATION_DISPENSE__SUBJECT, null, msgs);
			msgs = basicSetSubject(newSubject, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FhirPackage.MEDICATION_DISPENSE__SUBJECT, newSubject, newSubject));
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
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FhirPackage.MEDICATION_DISPENSE__CONTEXT, oldContext, newContext);
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
				msgs = ((InternalEObject)context).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FhirPackage.MEDICATION_DISPENSE__CONTEXT, null, msgs);
			if (newContext != null)
				msgs = ((InternalEObject)newContext).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FhirPackage.MEDICATION_DISPENSE__CONTEXT, null, msgs);
			msgs = basicSetContext(newContext, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FhirPackage.MEDICATION_DISPENSE__CONTEXT, newContext, newContext));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@XmlElement
	public List<Reference> getSupportingInformation() {
		if (supportingInformation == null) {
			supportingInformation = new EObjectContainmentEList<Reference>(Reference.class, this, FhirPackage.MEDICATION_DISPENSE__SUPPORTING_INFORMATION);
		}
		return supportingInformation;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@XmlElement
	public List<MedicationDispensePerformer> getPerformer() {
		if (performer == null) {
			performer = new EObjectContainmentEList<MedicationDispensePerformer>(MedicationDispensePerformer.class, this, FhirPackage.MEDICATION_DISPENSE__PERFORMER);
		}
		return performer;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@XmlElement
	public List<Reference> getAuthorizingPrescription() {
		if (authorizingPrescription == null) {
			authorizingPrescription = new EObjectContainmentEList<Reference>(Reference.class, this, FhirPackage.MEDICATION_DISPENSE__AUTHORIZING_PRESCRIPTION);
		}
		return authorizingPrescription;
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
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FhirPackage.MEDICATION_DISPENSE__TYPE, oldType, newType);
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
				msgs = ((InternalEObject)type).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FhirPackage.MEDICATION_DISPENSE__TYPE, null, msgs);
			if (newType != null)
				msgs = ((InternalEObject)newType).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FhirPackage.MEDICATION_DISPENSE__TYPE, null, msgs);
			msgs = basicSetType(newType, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FhirPackage.MEDICATION_DISPENSE__TYPE, newType, newType));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Quantity getQuantity() {
		return quantity;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetQuantity(Quantity newQuantity, NotificationChain msgs) {
		Quantity oldQuantity = quantity;
		quantity = newQuantity;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FhirPackage.MEDICATION_DISPENSE__QUANTITY, oldQuantity, newQuantity);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setQuantity(Quantity newQuantity) {
		if (newQuantity != quantity) {
			NotificationChain msgs = null;
			if (quantity != null)
				msgs = ((InternalEObject)quantity).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FhirPackage.MEDICATION_DISPENSE__QUANTITY, null, msgs);
			if (newQuantity != null)
				msgs = ((InternalEObject)newQuantity).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FhirPackage.MEDICATION_DISPENSE__QUANTITY, null, msgs);
			msgs = basicSetQuantity(newQuantity, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FhirPackage.MEDICATION_DISPENSE__QUANTITY, newQuantity, newQuantity));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Quantity getDaysSupply() {
		return daysSupply;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetDaysSupply(Quantity newDaysSupply, NotificationChain msgs) {
		Quantity oldDaysSupply = daysSupply;
		daysSupply = newDaysSupply;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FhirPackage.MEDICATION_DISPENSE__DAYS_SUPPLY, oldDaysSupply, newDaysSupply);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setDaysSupply(Quantity newDaysSupply) {
		if (newDaysSupply != daysSupply) {
			NotificationChain msgs = null;
			if (daysSupply != null)
				msgs = ((InternalEObject)daysSupply).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FhirPackage.MEDICATION_DISPENSE__DAYS_SUPPLY, null, msgs);
			if (newDaysSupply != null)
				msgs = ((InternalEObject)newDaysSupply).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FhirPackage.MEDICATION_DISPENSE__DAYS_SUPPLY, null, msgs);
			msgs = basicSetDaysSupply(newDaysSupply, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FhirPackage.MEDICATION_DISPENSE__DAYS_SUPPLY, newDaysSupply, newDaysSupply));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@XmlJavaTypeAdapter(DateTimeImplAdapter.class)
	public DateTime getWhenPrepared() {
		return whenPrepared;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetWhenPrepared(DateTime newWhenPrepared, NotificationChain msgs) {
		DateTime oldWhenPrepared = whenPrepared;
		whenPrepared = newWhenPrepared;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FhirPackage.MEDICATION_DISPENSE__WHEN_PREPARED, oldWhenPrepared, newWhenPrepared);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setWhenPrepared(DateTime newWhenPrepared) {
		if (newWhenPrepared != whenPrepared) {
			NotificationChain msgs = null;
			if (whenPrepared != null)
				msgs = ((InternalEObject)whenPrepared).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FhirPackage.MEDICATION_DISPENSE__WHEN_PREPARED, null, msgs);
			if (newWhenPrepared != null)
				msgs = ((InternalEObject)newWhenPrepared).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FhirPackage.MEDICATION_DISPENSE__WHEN_PREPARED, null, msgs);
			msgs = basicSetWhenPrepared(newWhenPrepared, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FhirPackage.MEDICATION_DISPENSE__WHEN_PREPARED, newWhenPrepared, newWhenPrepared));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@XmlJavaTypeAdapter(DateTimeImplAdapter.class)
	public DateTime getWhenHandedOver() {
		return whenHandedOver;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetWhenHandedOver(DateTime newWhenHandedOver, NotificationChain msgs) {
		DateTime oldWhenHandedOver = whenHandedOver;
		whenHandedOver = newWhenHandedOver;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FhirPackage.MEDICATION_DISPENSE__WHEN_HANDED_OVER, oldWhenHandedOver, newWhenHandedOver);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setWhenHandedOver(DateTime newWhenHandedOver) {
		if (newWhenHandedOver != whenHandedOver) {
			NotificationChain msgs = null;
			if (whenHandedOver != null)
				msgs = ((InternalEObject)whenHandedOver).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FhirPackage.MEDICATION_DISPENSE__WHEN_HANDED_OVER, null, msgs);
			if (newWhenHandedOver != null)
				msgs = ((InternalEObject)newWhenHandedOver).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FhirPackage.MEDICATION_DISPENSE__WHEN_HANDED_OVER, null, msgs);
			msgs = basicSetWhenHandedOver(newWhenHandedOver, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FhirPackage.MEDICATION_DISPENSE__WHEN_HANDED_OVER, newWhenHandedOver, newWhenHandedOver));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Reference getDestination() {
		return destination;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetDestination(Reference newDestination, NotificationChain msgs) {
		Reference oldDestination = destination;
		destination = newDestination;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FhirPackage.MEDICATION_DISPENSE__DESTINATION, oldDestination, newDestination);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setDestination(Reference newDestination) {
		if (newDestination != destination) {
			NotificationChain msgs = null;
			if (destination != null)
				msgs = ((InternalEObject)destination).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FhirPackage.MEDICATION_DISPENSE__DESTINATION, null, msgs);
			if (newDestination != null)
				msgs = ((InternalEObject)newDestination).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FhirPackage.MEDICATION_DISPENSE__DESTINATION, null, msgs);
			msgs = basicSetDestination(newDestination, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FhirPackage.MEDICATION_DISPENSE__DESTINATION, newDestination, newDestination));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@XmlElement
	public List<Reference> getReceiver() {
		if (receiver == null) {
			receiver = new EObjectContainmentEList<Reference>(Reference.class, this, FhirPackage.MEDICATION_DISPENSE__RECEIVER);
		}
		return receiver;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@XmlElement
	public List<Annotation> getNote() {
		if (note == null) {
			note = new EObjectContainmentEList<Annotation>(Annotation.class, this, FhirPackage.MEDICATION_DISPENSE__NOTE);
		}
		return note;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@XmlElement
	public List<DosageInstruction> getDosageInstruction() {
		if (dosageInstruction == null) {
			dosageInstruction = new EObjectContainmentEList<DosageInstruction>(DosageInstruction.class, this, FhirPackage.MEDICATION_DISPENSE__DOSAGE_INSTRUCTION);
		}
		return dosageInstruction;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public MedicationDispenseSubstitution getSubstitution() {
		return substitution;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetSubstitution(MedicationDispenseSubstitution newSubstitution, NotificationChain msgs) {
		MedicationDispenseSubstitution oldSubstitution = substitution;
		substitution = newSubstitution;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FhirPackage.MEDICATION_DISPENSE__SUBSTITUTION, oldSubstitution, newSubstitution);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setSubstitution(MedicationDispenseSubstitution newSubstitution) {
		if (newSubstitution != substitution) {
			NotificationChain msgs = null;
			if (substitution != null)
				msgs = ((InternalEObject)substitution).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FhirPackage.MEDICATION_DISPENSE__SUBSTITUTION, null, msgs);
			if (newSubstitution != null)
				msgs = ((InternalEObject)newSubstitution).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FhirPackage.MEDICATION_DISPENSE__SUBSTITUTION, null, msgs);
			msgs = basicSetSubstitution(newSubstitution, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FhirPackage.MEDICATION_DISPENSE__SUBSTITUTION, newSubstitution, newSubstitution));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@XmlElement
	public List<Reference> getDetectedIssue() {
		if (detectedIssue == null) {
			detectedIssue = new EObjectContainmentEList<Reference>(Reference.class, this, FhirPackage.MEDICATION_DISPENSE__DETECTED_ISSUE);
		}
		return detectedIssue;
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
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FhirPackage.MEDICATION_DISPENSE__NOT_DONE, oldNotDone, newNotDone);
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
				msgs = ((InternalEObject)notDone).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FhirPackage.MEDICATION_DISPENSE__NOT_DONE, null, msgs);
			if (newNotDone != null)
				msgs = ((InternalEObject)newNotDone).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FhirPackage.MEDICATION_DISPENSE__NOT_DONE, null, msgs);
			msgs = basicSetNotDone(newNotDone, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FhirPackage.MEDICATION_DISPENSE__NOT_DONE, newNotDone, newNotDone));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CodeableConcept getNotDoneReasonCodeableConcept() {
		return notDoneReasonCodeableConcept;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetNotDoneReasonCodeableConcept(CodeableConcept newNotDoneReasonCodeableConcept, NotificationChain msgs) {
		CodeableConcept oldNotDoneReasonCodeableConcept = notDoneReasonCodeableConcept;
		notDoneReasonCodeableConcept = newNotDoneReasonCodeableConcept;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FhirPackage.MEDICATION_DISPENSE__NOT_DONE_REASON_CODEABLE_CONCEPT, oldNotDoneReasonCodeableConcept, newNotDoneReasonCodeableConcept);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setNotDoneReasonCodeableConcept(CodeableConcept newNotDoneReasonCodeableConcept) {
		if (newNotDoneReasonCodeableConcept != notDoneReasonCodeableConcept) {
			NotificationChain msgs = null;
			if (notDoneReasonCodeableConcept != null)
				msgs = ((InternalEObject)notDoneReasonCodeableConcept).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FhirPackage.MEDICATION_DISPENSE__NOT_DONE_REASON_CODEABLE_CONCEPT, null, msgs);
			if (newNotDoneReasonCodeableConcept != null)
				msgs = ((InternalEObject)newNotDoneReasonCodeableConcept).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FhirPackage.MEDICATION_DISPENSE__NOT_DONE_REASON_CODEABLE_CONCEPT, null, msgs);
			msgs = basicSetNotDoneReasonCodeableConcept(newNotDoneReasonCodeableConcept, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FhirPackage.MEDICATION_DISPENSE__NOT_DONE_REASON_CODEABLE_CONCEPT, newNotDoneReasonCodeableConcept, newNotDoneReasonCodeableConcept));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Reference getNotDoneReasonReference() {
		return notDoneReasonReference;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetNotDoneReasonReference(Reference newNotDoneReasonReference, NotificationChain msgs) {
		Reference oldNotDoneReasonReference = notDoneReasonReference;
		notDoneReasonReference = newNotDoneReasonReference;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FhirPackage.MEDICATION_DISPENSE__NOT_DONE_REASON_REFERENCE, oldNotDoneReasonReference, newNotDoneReasonReference);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setNotDoneReasonReference(Reference newNotDoneReasonReference) {
		if (newNotDoneReasonReference != notDoneReasonReference) {
			NotificationChain msgs = null;
			if (notDoneReasonReference != null)
				msgs = ((InternalEObject)notDoneReasonReference).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FhirPackage.MEDICATION_DISPENSE__NOT_DONE_REASON_REFERENCE, null, msgs);
			if (newNotDoneReasonReference != null)
				msgs = ((InternalEObject)newNotDoneReasonReference).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FhirPackage.MEDICATION_DISPENSE__NOT_DONE_REASON_REFERENCE, null, msgs);
			msgs = basicSetNotDoneReasonReference(newNotDoneReasonReference, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FhirPackage.MEDICATION_DISPENSE__NOT_DONE_REASON_REFERENCE, newNotDoneReasonReference, newNotDoneReasonReference));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@XmlElement
	public List<Reference> getEventHistory() {
		if (eventHistory == null) {
			eventHistory = new EObjectContainmentEList<Reference>(Reference.class, this, FhirPackage.MEDICATION_DISPENSE__EVENT_HISTORY);
		}
		return eventHistory;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case FhirPackage.MEDICATION_DISPENSE__IDENTIFIER:
				return ((InternalEList<?>)getIdentifier()).basicRemove(otherEnd, msgs);
			case FhirPackage.MEDICATION_DISPENSE__PART_OF:
				return ((InternalEList<?>)getPartOf()).basicRemove(otherEnd, msgs);
			case FhirPackage.MEDICATION_DISPENSE__STATUS:
				return basicSetStatus(null, msgs);
			case FhirPackage.MEDICATION_DISPENSE__CATEGORY:
				return basicSetCategory(null, msgs);
			case FhirPackage.MEDICATION_DISPENSE__MEDICATION_CODEABLE_CONCEPT:
				return basicSetMedicationCodeableConcept(null, msgs);
			case FhirPackage.MEDICATION_DISPENSE__MEDICATION_REFERENCE:
				return basicSetMedicationReference(null, msgs);
			case FhirPackage.MEDICATION_DISPENSE__SUBJECT:
				return basicSetSubject(null, msgs);
			case FhirPackage.MEDICATION_DISPENSE__CONTEXT:
				return basicSetContext(null, msgs);
			case FhirPackage.MEDICATION_DISPENSE__SUPPORTING_INFORMATION:
				return ((InternalEList<?>)getSupportingInformation()).basicRemove(otherEnd, msgs);
			case FhirPackage.MEDICATION_DISPENSE__PERFORMER:
				return ((InternalEList<?>)getPerformer()).basicRemove(otherEnd, msgs);
			case FhirPackage.MEDICATION_DISPENSE__AUTHORIZING_PRESCRIPTION:
				return ((InternalEList<?>)getAuthorizingPrescription()).basicRemove(otherEnd, msgs);
			case FhirPackage.MEDICATION_DISPENSE__TYPE:
				return basicSetType(null, msgs);
			case FhirPackage.MEDICATION_DISPENSE__QUANTITY:
				return basicSetQuantity(null, msgs);
			case FhirPackage.MEDICATION_DISPENSE__DAYS_SUPPLY:
				return basicSetDaysSupply(null, msgs);
			case FhirPackage.MEDICATION_DISPENSE__WHEN_PREPARED:
				return basicSetWhenPrepared(null, msgs);
			case FhirPackage.MEDICATION_DISPENSE__WHEN_HANDED_OVER:
				return basicSetWhenHandedOver(null, msgs);
			case FhirPackage.MEDICATION_DISPENSE__DESTINATION:
				return basicSetDestination(null, msgs);
			case FhirPackage.MEDICATION_DISPENSE__RECEIVER:
				return ((InternalEList<?>)getReceiver()).basicRemove(otherEnd, msgs);
			case FhirPackage.MEDICATION_DISPENSE__NOTE:
				return ((InternalEList<?>)getNote()).basicRemove(otherEnd, msgs);
			case FhirPackage.MEDICATION_DISPENSE__DOSAGE_INSTRUCTION:
				return ((InternalEList<?>)getDosageInstruction()).basicRemove(otherEnd, msgs);
			case FhirPackage.MEDICATION_DISPENSE__SUBSTITUTION:
				return basicSetSubstitution(null, msgs);
			case FhirPackage.MEDICATION_DISPENSE__DETECTED_ISSUE:
				return ((InternalEList<?>)getDetectedIssue()).basicRemove(otherEnd, msgs);
			case FhirPackage.MEDICATION_DISPENSE__NOT_DONE:
				return basicSetNotDone(null, msgs);
			case FhirPackage.MEDICATION_DISPENSE__NOT_DONE_REASON_CODEABLE_CONCEPT:
				return basicSetNotDoneReasonCodeableConcept(null, msgs);
			case FhirPackage.MEDICATION_DISPENSE__NOT_DONE_REASON_REFERENCE:
				return basicSetNotDoneReasonReference(null, msgs);
			case FhirPackage.MEDICATION_DISPENSE__EVENT_HISTORY:
				return ((InternalEList<?>)getEventHistory()).basicRemove(otherEnd, msgs);
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
			case FhirPackage.MEDICATION_DISPENSE__IDENTIFIER:
				return getIdentifier();
			case FhirPackage.MEDICATION_DISPENSE__PART_OF:
				return getPartOf();
			case FhirPackage.MEDICATION_DISPENSE__STATUS:
				return getStatus();
			case FhirPackage.MEDICATION_DISPENSE__CATEGORY:
				return getCategory();
			case FhirPackage.MEDICATION_DISPENSE__MEDICATION_CODEABLE_CONCEPT:
				return getMedicationCodeableConcept();
			case FhirPackage.MEDICATION_DISPENSE__MEDICATION_REFERENCE:
				return getMedicationReference();
			case FhirPackage.MEDICATION_DISPENSE__SUBJECT:
				return getSubject();
			case FhirPackage.MEDICATION_DISPENSE__CONTEXT:
				return getContext();
			case FhirPackage.MEDICATION_DISPENSE__SUPPORTING_INFORMATION:
				return getSupportingInformation();
			case FhirPackage.MEDICATION_DISPENSE__PERFORMER:
				return getPerformer();
			case FhirPackage.MEDICATION_DISPENSE__AUTHORIZING_PRESCRIPTION:
				return getAuthorizingPrescription();
			case FhirPackage.MEDICATION_DISPENSE__TYPE:
				return getType();
			case FhirPackage.MEDICATION_DISPENSE__QUANTITY:
				return getQuantity();
			case FhirPackage.MEDICATION_DISPENSE__DAYS_SUPPLY:
				return getDaysSupply();
			case FhirPackage.MEDICATION_DISPENSE__WHEN_PREPARED:
				return getWhenPrepared();
			case FhirPackage.MEDICATION_DISPENSE__WHEN_HANDED_OVER:
				return getWhenHandedOver();
			case FhirPackage.MEDICATION_DISPENSE__DESTINATION:
				return getDestination();
			case FhirPackage.MEDICATION_DISPENSE__RECEIVER:
				return getReceiver();
			case FhirPackage.MEDICATION_DISPENSE__NOTE:
				return getNote();
			case FhirPackage.MEDICATION_DISPENSE__DOSAGE_INSTRUCTION:
				return getDosageInstruction();
			case FhirPackage.MEDICATION_DISPENSE__SUBSTITUTION:
				return getSubstitution();
			case FhirPackage.MEDICATION_DISPENSE__DETECTED_ISSUE:
				return getDetectedIssue();
			case FhirPackage.MEDICATION_DISPENSE__NOT_DONE:
				return getNotDone();
			case FhirPackage.MEDICATION_DISPENSE__NOT_DONE_REASON_CODEABLE_CONCEPT:
				return getNotDoneReasonCodeableConcept();
			case FhirPackage.MEDICATION_DISPENSE__NOT_DONE_REASON_REFERENCE:
				return getNotDoneReasonReference();
			case FhirPackage.MEDICATION_DISPENSE__EVENT_HISTORY:
				return getEventHistory();
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
			case FhirPackage.MEDICATION_DISPENSE__IDENTIFIER:
				getIdentifier().clear();
				getIdentifier().addAll((Collection<? extends Identifier>)newValue);
				return;
			case FhirPackage.MEDICATION_DISPENSE__PART_OF:
				getPartOf().clear();
				getPartOf().addAll((Collection<? extends Reference>)newValue);
				return;
			case FhirPackage.MEDICATION_DISPENSE__STATUS:
				setStatus((MedicationDispenseStatus)newValue);
				return;
			case FhirPackage.MEDICATION_DISPENSE__CATEGORY:
				setCategory((CodeableConcept)newValue);
				return;
			case FhirPackage.MEDICATION_DISPENSE__MEDICATION_CODEABLE_CONCEPT:
				setMedicationCodeableConcept((CodeableConcept)newValue);
				return;
			case FhirPackage.MEDICATION_DISPENSE__MEDICATION_REFERENCE:
				setMedicationReference((Reference)newValue);
				return;
			case FhirPackage.MEDICATION_DISPENSE__SUBJECT:
				setSubject((Reference)newValue);
				return;
			case FhirPackage.MEDICATION_DISPENSE__CONTEXT:
				setContext((Reference)newValue);
				return;
			case FhirPackage.MEDICATION_DISPENSE__SUPPORTING_INFORMATION:
				getSupportingInformation().clear();
				getSupportingInformation().addAll((Collection<? extends Reference>)newValue);
				return;
			case FhirPackage.MEDICATION_DISPENSE__PERFORMER:
				getPerformer().clear();
				getPerformer().addAll((Collection<? extends MedicationDispensePerformer>)newValue);
				return;
			case FhirPackage.MEDICATION_DISPENSE__AUTHORIZING_PRESCRIPTION:
				getAuthorizingPrescription().clear();
				getAuthorizingPrescription().addAll((Collection<? extends Reference>)newValue);
				return;
			case FhirPackage.MEDICATION_DISPENSE__TYPE:
				setType((CodeableConcept)newValue);
				return;
			case FhirPackage.MEDICATION_DISPENSE__QUANTITY:
				setQuantity((Quantity)newValue);
				return;
			case FhirPackage.MEDICATION_DISPENSE__DAYS_SUPPLY:
				setDaysSupply((Quantity)newValue);
				return;
			case FhirPackage.MEDICATION_DISPENSE__WHEN_PREPARED:
				setWhenPrepared((DateTime)newValue);
				return;
			case FhirPackage.MEDICATION_DISPENSE__WHEN_HANDED_OVER:
				setWhenHandedOver((DateTime)newValue);
				return;
			case FhirPackage.MEDICATION_DISPENSE__DESTINATION:
				setDestination((Reference)newValue);
				return;
			case FhirPackage.MEDICATION_DISPENSE__RECEIVER:
				getReceiver().clear();
				getReceiver().addAll((Collection<? extends Reference>)newValue);
				return;
			case FhirPackage.MEDICATION_DISPENSE__NOTE:
				getNote().clear();
				getNote().addAll((Collection<? extends Annotation>)newValue);
				return;
			case FhirPackage.MEDICATION_DISPENSE__DOSAGE_INSTRUCTION:
				getDosageInstruction().clear();
				getDosageInstruction().addAll((Collection<? extends DosageInstruction>)newValue);
				return;
			case FhirPackage.MEDICATION_DISPENSE__SUBSTITUTION:
				setSubstitution((MedicationDispenseSubstitution)newValue);
				return;
			case FhirPackage.MEDICATION_DISPENSE__DETECTED_ISSUE:
				getDetectedIssue().clear();
				getDetectedIssue().addAll((Collection<? extends Reference>)newValue);
				return;
			case FhirPackage.MEDICATION_DISPENSE__NOT_DONE:
				setNotDone((org.hl7.fhir.Boolean)newValue);
				return;
			case FhirPackage.MEDICATION_DISPENSE__NOT_DONE_REASON_CODEABLE_CONCEPT:
				setNotDoneReasonCodeableConcept((CodeableConcept)newValue);
				return;
			case FhirPackage.MEDICATION_DISPENSE__NOT_DONE_REASON_REFERENCE:
				setNotDoneReasonReference((Reference)newValue);
				return;
			case FhirPackage.MEDICATION_DISPENSE__EVENT_HISTORY:
				getEventHistory().clear();
				getEventHistory().addAll((Collection<? extends Reference>)newValue);
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
			case FhirPackage.MEDICATION_DISPENSE__IDENTIFIER:
				getIdentifier().clear();
				return;
			case FhirPackage.MEDICATION_DISPENSE__PART_OF:
				getPartOf().clear();
				return;
			case FhirPackage.MEDICATION_DISPENSE__STATUS:
				setStatus((MedicationDispenseStatus)null);
				return;
			case FhirPackage.MEDICATION_DISPENSE__CATEGORY:
				setCategory((CodeableConcept)null);
				return;
			case FhirPackage.MEDICATION_DISPENSE__MEDICATION_CODEABLE_CONCEPT:
				setMedicationCodeableConcept((CodeableConcept)null);
				return;
			case FhirPackage.MEDICATION_DISPENSE__MEDICATION_REFERENCE:
				setMedicationReference((Reference)null);
				return;
			case FhirPackage.MEDICATION_DISPENSE__SUBJECT:
				setSubject((Reference)null);
				return;
			case FhirPackage.MEDICATION_DISPENSE__CONTEXT:
				setContext((Reference)null);
				return;
			case FhirPackage.MEDICATION_DISPENSE__SUPPORTING_INFORMATION:
				getSupportingInformation().clear();
				return;
			case FhirPackage.MEDICATION_DISPENSE__PERFORMER:
				getPerformer().clear();
				return;
			case FhirPackage.MEDICATION_DISPENSE__AUTHORIZING_PRESCRIPTION:
				getAuthorizingPrescription().clear();
				return;
			case FhirPackage.MEDICATION_DISPENSE__TYPE:
				setType((CodeableConcept)null);
				return;
			case FhirPackage.MEDICATION_DISPENSE__QUANTITY:
				setQuantity((Quantity)null);
				return;
			case FhirPackage.MEDICATION_DISPENSE__DAYS_SUPPLY:
				setDaysSupply((Quantity)null);
				return;
			case FhirPackage.MEDICATION_DISPENSE__WHEN_PREPARED:
				setWhenPrepared((DateTime)null);
				return;
			case FhirPackage.MEDICATION_DISPENSE__WHEN_HANDED_OVER:
				setWhenHandedOver((DateTime)null);
				return;
			case FhirPackage.MEDICATION_DISPENSE__DESTINATION:
				setDestination((Reference)null);
				return;
			case FhirPackage.MEDICATION_DISPENSE__RECEIVER:
				getReceiver().clear();
				return;
			case FhirPackage.MEDICATION_DISPENSE__NOTE:
				getNote().clear();
				return;
			case FhirPackage.MEDICATION_DISPENSE__DOSAGE_INSTRUCTION:
				getDosageInstruction().clear();
				return;
			case FhirPackage.MEDICATION_DISPENSE__SUBSTITUTION:
				setSubstitution((MedicationDispenseSubstitution)null);
				return;
			case FhirPackage.MEDICATION_DISPENSE__DETECTED_ISSUE:
				getDetectedIssue().clear();
				return;
			case FhirPackage.MEDICATION_DISPENSE__NOT_DONE:
				setNotDone((org.hl7.fhir.Boolean)null);
				return;
			case FhirPackage.MEDICATION_DISPENSE__NOT_DONE_REASON_CODEABLE_CONCEPT:
				setNotDoneReasonCodeableConcept((CodeableConcept)null);
				return;
			case FhirPackage.MEDICATION_DISPENSE__NOT_DONE_REASON_REFERENCE:
				setNotDoneReasonReference((Reference)null);
				return;
			case FhirPackage.MEDICATION_DISPENSE__EVENT_HISTORY:
				getEventHistory().clear();
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
			case FhirPackage.MEDICATION_DISPENSE__IDENTIFIER:
				return identifier != null && !identifier.isEmpty();
			case FhirPackage.MEDICATION_DISPENSE__PART_OF:
				return partOf != null && !partOf.isEmpty();
			case FhirPackage.MEDICATION_DISPENSE__STATUS:
				return status != null;
			case FhirPackage.MEDICATION_DISPENSE__CATEGORY:
				return category != null;
			case FhirPackage.MEDICATION_DISPENSE__MEDICATION_CODEABLE_CONCEPT:
				return medicationCodeableConcept != null;
			case FhirPackage.MEDICATION_DISPENSE__MEDICATION_REFERENCE:
				return medicationReference != null;
			case FhirPackage.MEDICATION_DISPENSE__SUBJECT:
				return subject != null;
			case FhirPackage.MEDICATION_DISPENSE__CONTEXT:
				return context != null;
			case FhirPackage.MEDICATION_DISPENSE__SUPPORTING_INFORMATION:
				return supportingInformation != null && !supportingInformation.isEmpty();
			case FhirPackage.MEDICATION_DISPENSE__PERFORMER:
				return performer != null && !performer.isEmpty();
			case FhirPackage.MEDICATION_DISPENSE__AUTHORIZING_PRESCRIPTION:
				return authorizingPrescription != null && !authorizingPrescription.isEmpty();
			case FhirPackage.MEDICATION_DISPENSE__TYPE:
				return type != null;
			case FhirPackage.MEDICATION_DISPENSE__QUANTITY:
				return quantity != null;
			case FhirPackage.MEDICATION_DISPENSE__DAYS_SUPPLY:
				return daysSupply != null;
			case FhirPackage.MEDICATION_DISPENSE__WHEN_PREPARED:
				return whenPrepared != null;
			case FhirPackage.MEDICATION_DISPENSE__WHEN_HANDED_OVER:
				return whenHandedOver != null;
			case FhirPackage.MEDICATION_DISPENSE__DESTINATION:
				return destination != null;
			case FhirPackage.MEDICATION_DISPENSE__RECEIVER:
				return receiver != null && !receiver.isEmpty();
			case FhirPackage.MEDICATION_DISPENSE__NOTE:
				return note != null && !note.isEmpty();
			case FhirPackage.MEDICATION_DISPENSE__DOSAGE_INSTRUCTION:
				return dosageInstruction != null && !dosageInstruction.isEmpty();
			case FhirPackage.MEDICATION_DISPENSE__SUBSTITUTION:
				return substitution != null;
			case FhirPackage.MEDICATION_DISPENSE__DETECTED_ISSUE:
				return detectedIssue != null && !detectedIssue.isEmpty();
			case FhirPackage.MEDICATION_DISPENSE__NOT_DONE:
				return notDone != null;
			case FhirPackage.MEDICATION_DISPENSE__NOT_DONE_REASON_CODEABLE_CONCEPT:
				return notDoneReasonCodeableConcept != null;
			case FhirPackage.MEDICATION_DISPENSE__NOT_DONE_REASON_REFERENCE:
				return notDoneReasonReference != null;
			case FhirPackage.MEDICATION_DISPENSE__EVENT_HISTORY:
				return eventHistory != null && !eventHistory.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //MedicationDispenseImpl
