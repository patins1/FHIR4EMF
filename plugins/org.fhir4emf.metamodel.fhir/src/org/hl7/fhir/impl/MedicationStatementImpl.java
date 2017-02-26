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
import org.hl7.fhir.MedicationStatement;
import org.hl7.fhir.MedicationStatementStatus;
import org.hl7.fhir.MedicationStatementTaken;
import org.hl7.fhir.Period;
import org.hl7.fhir.Reference;
import org.hl7.fhir.jaxb.DateTimeImplAdapter;
import org.hl7.fhir.jaxb.MedicationStatementStatusImplAdapter;
import org.hl7.fhir.jaxb.MedicationStatementTakenImplAdapter;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Medication Statement</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.hl7.fhir.impl.MedicationStatementImpl#getIdentifier <em>Identifier</em>}</li>
 *   <li>{@link org.hl7.fhir.impl.MedicationStatementImpl#getBasedOn <em>Based On</em>}</li>
 *   <li>{@link org.hl7.fhir.impl.MedicationStatementImpl#getPartOf <em>Part Of</em>}</li>
 *   <li>{@link org.hl7.fhir.impl.MedicationStatementImpl#getContext <em>Context</em>}</li>
 *   <li>{@link org.hl7.fhir.impl.MedicationStatementImpl#getStatus <em>Status</em>}</li>
 *   <li>{@link org.hl7.fhir.impl.MedicationStatementImpl#getCategory <em>Category</em>}</li>
 *   <li>{@link org.hl7.fhir.impl.MedicationStatementImpl#getMedicationCodeableConcept <em>Medication Codeable Concept</em>}</li>
 *   <li>{@link org.hl7.fhir.impl.MedicationStatementImpl#getMedicationReference <em>Medication Reference</em>}</li>
 *   <li>{@link org.hl7.fhir.impl.MedicationStatementImpl#getSubject <em>Subject</em>}</li>
 *   <li>{@link org.hl7.fhir.impl.MedicationStatementImpl#getEffectiveDateTime <em>Effective Date Time</em>}</li>
 *   <li>{@link org.hl7.fhir.impl.MedicationStatementImpl#getEffectivePeriod <em>Effective Period</em>}</li>
 *   <li>{@link org.hl7.fhir.impl.MedicationStatementImpl#getInformationSource <em>Information Source</em>}</li>
 *   <li>{@link org.hl7.fhir.impl.MedicationStatementImpl#getDerivedFrom <em>Derived From</em>}</li>
 *   <li>{@link org.hl7.fhir.impl.MedicationStatementImpl#getDateAsserted <em>Date Asserted</em>}</li>
 *   <li>{@link org.hl7.fhir.impl.MedicationStatementImpl#getTaken <em>Taken</em>}</li>
 *   <li>{@link org.hl7.fhir.impl.MedicationStatementImpl#getReasonNotTaken <em>Reason Not Taken</em>}</li>
 *   <li>{@link org.hl7.fhir.impl.MedicationStatementImpl#getReasonForUseCodeableConcept <em>Reason For Use Codeable Concept</em>}</li>
 *   <li>{@link org.hl7.fhir.impl.MedicationStatementImpl#getReasonForUseReference <em>Reason For Use Reference</em>}</li>
 *   <li>{@link org.hl7.fhir.impl.MedicationStatementImpl#getNote <em>Note</em>}</li>
 *   <li>{@link org.hl7.fhir.impl.MedicationStatementImpl#getDosage <em>Dosage</em>}</li>
 * </ul>
 *
 * @generated
 */
@XmlType(name = "MedicationStatement", namespace = "http://hl7.org/fhir")
@XmlRootElement(name = "fhir.MedicationStatement")
public class MedicationStatementImpl extends DomainResourceImpl implements MedicationStatement {
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
	 * The cached value of the '{@link #getPartOf() <em>Part Of</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPartOf()
	 * @generated
	 * @ordered
	 */
	protected EList<Reference> partOf;

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
	 * The cached value of the '{@link #getStatus() <em>Status</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getStatus()
	 * @generated
	 * @ordered
	 */
	protected MedicationStatementStatus status;

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
	 * The cached value of the '{@link #getEffectiveDateTime() <em>Effective Date Time</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getEffectiveDateTime()
	 * @generated
	 * @ordered
	 */
	protected DateTime effectiveDateTime;

	/**
	 * The cached value of the '{@link #getEffectivePeriod() <em>Effective Period</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getEffectivePeriod()
	 * @generated
	 * @ordered
	 */
	protected Period effectivePeriod;

	/**
	 * The cached value of the '{@link #getInformationSource() <em>Information Source</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getInformationSource()
	 * @generated
	 * @ordered
	 */
	protected Reference informationSource;

	/**
	 * The cached value of the '{@link #getDerivedFrom() <em>Derived From</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDerivedFrom()
	 * @generated
	 * @ordered
	 */
	protected EList<Reference> derivedFrom;

	/**
	 * The cached value of the '{@link #getDateAsserted() <em>Date Asserted</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDateAsserted()
	 * @generated
	 * @ordered
	 */
	protected DateTime dateAsserted;

	/**
	 * The cached value of the '{@link #getTaken() <em>Taken</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTaken()
	 * @generated
	 * @ordered
	 */
	protected MedicationStatementTaken taken;

	/**
	 * The cached value of the '{@link #getReasonNotTaken() <em>Reason Not Taken</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getReasonNotTaken()
	 * @generated
	 * @ordered
	 */
	protected EList<CodeableConcept> reasonNotTaken;

	/**
	 * The cached value of the '{@link #getReasonForUseCodeableConcept() <em>Reason For Use Codeable Concept</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getReasonForUseCodeableConcept()
	 * @generated
	 * @ordered
	 */
	protected EList<CodeableConcept> reasonForUseCodeableConcept;

	/**
	 * The cached value of the '{@link #getReasonForUseReference() <em>Reason For Use Reference</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getReasonForUseReference()
	 * @generated
	 * @ordered
	 */
	protected EList<Reference> reasonForUseReference;

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
	 * The cached value of the '{@link #getDosage() <em>Dosage</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDosage()
	 * @generated
	 * @ordered
	 */
	protected EList<DosageInstruction> dosage;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected MedicationStatementImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return FhirPackage.eINSTANCE.getMedicationStatement();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@XmlElement
	public List<Identifier> getIdentifier() {
		if (identifier == null) {
			identifier = new EObjectContainmentEList<Identifier>(Identifier.class, this, FhirPackage.MEDICATION_STATEMENT__IDENTIFIER);
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
			basedOn = new EObjectContainmentEList<Reference>(Reference.class, this, FhirPackage.MEDICATION_STATEMENT__BASED_ON);
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
			partOf = new EObjectContainmentEList<Reference>(Reference.class, this, FhirPackage.MEDICATION_STATEMENT__PART_OF);
		}
		return partOf;
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
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FhirPackage.MEDICATION_STATEMENT__CONTEXT, oldContext, newContext);
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
				msgs = ((InternalEObject)context).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FhirPackage.MEDICATION_STATEMENT__CONTEXT, null, msgs);
			if (newContext != null)
				msgs = ((InternalEObject)newContext).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FhirPackage.MEDICATION_STATEMENT__CONTEXT, null, msgs);
			msgs = basicSetContext(newContext, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FhirPackage.MEDICATION_STATEMENT__CONTEXT, newContext, newContext));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@XmlJavaTypeAdapter(MedicationStatementStatusImplAdapter.class)
	@XmlElement(required = true)
	public MedicationStatementStatus getStatus() {
		return status;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetStatus(MedicationStatementStatus newStatus, NotificationChain msgs) {
		MedicationStatementStatus oldStatus = status;
		status = newStatus;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FhirPackage.MEDICATION_STATEMENT__STATUS, oldStatus, newStatus);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setStatus(MedicationStatementStatus newStatus) {
		if (newStatus != status) {
			NotificationChain msgs = null;
			if (status != null)
				msgs = ((InternalEObject)status).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FhirPackage.MEDICATION_STATEMENT__STATUS, null, msgs);
			if (newStatus != null)
				msgs = ((InternalEObject)newStatus).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FhirPackage.MEDICATION_STATEMENT__STATUS, null, msgs);
			msgs = basicSetStatus(newStatus, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FhirPackage.MEDICATION_STATEMENT__STATUS, newStatus, newStatus));
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
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FhirPackage.MEDICATION_STATEMENT__CATEGORY, oldCategory, newCategory);
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
				msgs = ((InternalEObject)category).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FhirPackage.MEDICATION_STATEMENT__CATEGORY, null, msgs);
			if (newCategory != null)
				msgs = ((InternalEObject)newCategory).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FhirPackage.MEDICATION_STATEMENT__CATEGORY, null, msgs);
			msgs = basicSetCategory(newCategory, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FhirPackage.MEDICATION_STATEMENT__CATEGORY, newCategory, newCategory));
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
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FhirPackage.MEDICATION_STATEMENT__MEDICATION_CODEABLE_CONCEPT, oldMedicationCodeableConcept, newMedicationCodeableConcept);
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
				msgs = ((InternalEObject)medicationCodeableConcept).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FhirPackage.MEDICATION_STATEMENT__MEDICATION_CODEABLE_CONCEPT, null, msgs);
			if (newMedicationCodeableConcept != null)
				msgs = ((InternalEObject)newMedicationCodeableConcept).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FhirPackage.MEDICATION_STATEMENT__MEDICATION_CODEABLE_CONCEPT, null, msgs);
			msgs = basicSetMedicationCodeableConcept(newMedicationCodeableConcept, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FhirPackage.MEDICATION_STATEMENT__MEDICATION_CODEABLE_CONCEPT, newMedicationCodeableConcept, newMedicationCodeableConcept));
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
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FhirPackage.MEDICATION_STATEMENT__MEDICATION_REFERENCE, oldMedicationReference, newMedicationReference);
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
				msgs = ((InternalEObject)medicationReference).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FhirPackage.MEDICATION_STATEMENT__MEDICATION_REFERENCE, null, msgs);
			if (newMedicationReference != null)
				msgs = ((InternalEObject)newMedicationReference).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FhirPackage.MEDICATION_STATEMENT__MEDICATION_REFERENCE, null, msgs);
			msgs = basicSetMedicationReference(newMedicationReference, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FhirPackage.MEDICATION_STATEMENT__MEDICATION_REFERENCE, newMedicationReference, newMedicationReference));
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
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FhirPackage.MEDICATION_STATEMENT__SUBJECT, oldSubject, newSubject);
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
				msgs = ((InternalEObject)subject).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FhirPackage.MEDICATION_STATEMENT__SUBJECT, null, msgs);
			if (newSubject != null)
				msgs = ((InternalEObject)newSubject).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FhirPackage.MEDICATION_STATEMENT__SUBJECT, null, msgs);
			msgs = basicSetSubject(newSubject, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FhirPackage.MEDICATION_STATEMENT__SUBJECT, newSubject, newSubject));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@XmlJavaTypeAdapter(DateTimeImplAdapter.class)
	public DateTime getEffectiveDateTime() {
		return effectiveDateTime;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetEffectiveDateTime(DateTime newEffectiveDateTime, NotificationChain msgs) {
		DateTime oldEffectiveDateTime = effectiveDateTime;
		effectiveDateTime = newEffectiveDateTime;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FhirPackage.MEDICATION_STATEMENT__EFFECTIVE_DATE_TIME, oldEffectiveDateTime, newEffectiveDateTime);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setEffectiveDateTime(DateTime newEffectiveDateTime) {
		if (newEffectiveDateTime != effectiveDateTime) {
			NotificationChain msgs = null;
			if (effectiveDateTime != null)
				msgs = ((InternalEObject)effectiveDateTime).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FhirPackage.MEDICATION_STATEMENT__EFFECTIVE_DATE_TIME, null, msgs);
			if (newEffectiveDateTime != null)
				msgs = ((InternalEObject)newEffectiveDateTime).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FhirPackage.MEDICATION_STATEMENT__EFFECTIVE_DATE_TIME, null, msgs);
			msgs = basicSetEffectiveDateTime(newEffectiveDateTime, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FhirPackage.MEDICATION_STATEMENT__EFFECTIVE_DATE_TIME, newEffectiveDateTime, newEffectiveDateTime));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Period getEffectivePeriod() {
		return effectivePeriod;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetEffectivePeriod(Period newEffectivePeriod, NotificationChain msgs) {
		Period oldEffectivePeriod = effectivePeriod;
		effectivePeriod = newEffectivePeriod;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FhirPackage.MEDICATION_STATEMENT__EFFECTIVE_PERIOD, oldEffectivePeriod, newEffectivePeriod);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setEffectivePeriod(Period newEffectivePeriod) {
		if (newEffectivePeriod != effectivePeriod) {
			NotificationChain msgs = null;
			if (effectivePeriod != null)
				msgs = ((InternalEObject)effectivePeriod).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FhirPackage.MEDICATION_STATEMENT__EFFECTIVE_PERIOD, null, msgs);
			if (newEffectivePeriod != null)
				msgs = ((InternalEObject)newEffectivePeriod).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FhirPackage.MEDICATION_STATEMENT__EFFECTIVE_PERIOD, null, msgs);
			msgs = basicSetEffectivePeriod(newEffectivePeriod, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FhirPackage.MEDICATION_STATEMENT__EFFECTIVE_PERIOD, newEffectivePeriod, newEffectivePeriod));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Reference getInformationSource() {
		return informationSource;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetInformationSource(Reference newInformationSource, NotificationChain msgs) {
		Reference oldInformationSource = informationSource;
		informationSource = newInformationSource;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FhirPackage.MEDICATION_STATEMENT__INFORMATION_SOURCE, oldInformationSource, newInformationSource);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setInformationSource(Reference newInformationSource) {
		if (newInformationSource != informationSource) {
			NotificationChain msgs = null;
			if (informationSource != null)
				msgs = ((InternalEObject)informationSource).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FhirPackage.MEDICATION_STATEMENT__INFORMATION_SOURCE, null, msgs);
			if (newInformationSource != null)
				msgs = ((InternalEObject)newInformationSource).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FhirPackage.MEDICATION_STATEMENT__INFORMATION_SOURCE, null, msgs);
			msgs = basicSetInformationSource(newInformationSource, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FhirPackage.MEDICATION_STATEMENT__INFORMATION_SOURCE, newInformationSource, newInformationSource));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@XmlElement
	public List<Reference> getDerivedFrom() {
		if (derivedFrom == null) {
			derivedFrom = new EObjectContainmentEList<Reference>(Reference.class, this, FhirPackage.MEDICATION_STATEMENT__DERIVED_FROM);
		}
		return derivedFrom;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@XmlJavaTypeAdapter(DateTimeImplAdapter.class)
	public DateTime getDateAsserted() {
		return dateAsserted;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetDateAsserted(DateTime newDateAsserted, NotificationChain msgs) {
		DateTime oldDateAsserted = dateAsserted;
		dateAsserted = newDateAsserted;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FhirPackage.MEDICATION_STATEMENT__DATE_ASSERTED, oldDateAsserted, newDateAsserted);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setDateAsserted(DateTime newDateAsserted) {
		if (newDateAsserted != dateAsserted) {
			NotificationChain msgs = null;
			if (dateAsserted != null)
				msgs = ((InternalEObject)dateAsserted).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FhirPackage.MEDICATION_STATEMENT__DATE_ASSERTED, null, msgs);
			if (newDateAsserted != null)
				msgs = ((InternalEObject)newDateAsserted).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FhirPackage.MEDICATION_STATEMENT__DATE_ASSERTED, null, msgs);
			msgs = basicSetDateAsserted(newDateAsserted, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FhirPackage.MEDICATION_STATEMENT__DATE_ASSERTED, newDateAsserted, newDateAsserted));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@XmlJavaTypeAdapter(MedicationStatementTakenImplAdapter.class)
	@XmlElement(required = true)
	public MedicationStatementTaken getTaken() {
		return taken;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetTaken(MedicationStatementTaken newTaken, NotificationChain msgs) {
		MedicationStatementTaken oldTaken = taken;
		taken = newTaken;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FhirPackage.MEDICATION_STATEMENT__TAKEN, oldTaken, newTaken);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setTaken(MedicationStatementTaken newTaken) {
		if (newTaken != taken) {
			NotificationChain msgs = null;
			if (taken != null)
				msgs = ((InternalEObject)taken).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FhirPackage.MEDICATION_STATEMENT__TAKEN, null, msgs);
			if (newTaken != null)
				msgs = ((InternalEObject)newTaken).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FhirPackage.MEDICATION_STATEMENT__TAKEN, null, msgs);
			msgs = basicSetTaken(newTaken, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FhirPackage.MEDICATION_STATEMENT__TAKEN, newTaken, newTaken));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@XmlElement
	public List<CodeableConcept> getReasonNotTaken() {
		if (reasonNotTaken == null) {
			reasonNotTaken = new EObjectContainmentEList<CodeableConcept>(CodeableConcept.class, this, FhirPackage.MEDICATION_STATEMENT__REASON_NOT_TAKEN);
		}
		return reasonNotTaken;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@XmlElement
	public List<CodeableConcept> getReasonForUseCodeableConcept() {
		if (reasonForUseCodeableConcept == null) {
			reasonForUseCodeableConcept = new EObjectContainmentEList<CodeableConcept>(CodeableConcept.class, this, FhirPackage.MEDICATION_STATEMENT__REASON_FOR_USE_CODEABLE_CONCEPT);
		}
		return reasonForUseCodeableConcept;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@XmlElement
	public List<Reference> getReasonForUseReference() {
		if (reasonForUseReference == null) {
			reasonForUseReference = new EObjectContainmentEList<Reference>(Reference.class, this, FhirPackage.MEDICATION_STATEMENT__REASON_FOR_USE_REFERENCE);
		}
		return reasonForUseReference;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@XmlElement
	public List<Annotation> getNote() {
		if (note == null) {
			note = new EObjectContainmentEList<Annotation>(Annotation.class, this, FhirPackage.MEDICATION_STATEMENT__NOTE);
		}
		return note;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@XmlElement
	public List<DosageInstruction> getDosage() {
		if (dosage == null) {
			dosage = new EObjectContainmentEList<DosageInstruction>(DosageInstruction.class, this, FhirPackage.MEDICATION_STATEMENT__DOSAGE);
		}
		return dosage;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case FhirPackage.MEDICATION_STATEMENT__IDENTIFIER:
				return ((InternalEList<?>)getIdentifier()).basicRemove(otherEnd, msgs);
			case FhirPackage.MEDICATION_STATEMENT__BASED_ON:
				return ((InternalEList<?>)getBasedOn()).basicRemove(otherEnd, msgs);
			case FhirPackage.MEDICATION_STATEMENT__PART_OF:
				return ((InternalEList<?>)getPartOf()).basicRemove(otherEnd, msgs);
			case FhirPackage.MEDICATION_STATEMENT__CONTEXT:
				return basicSetContext(null, msgs);
			case FhirPackage.MEDICATION_STATEMENT__STATUS:
				return basicSetStatus(null, msgs);
			case FhirPackage.MEDICATION_STATEMENT__CATEGORY:
				return basicSetCategory(null, msgs);
			case FhirPackage.MEDICATION_STATEMENT__MEDICATION_CODEABLE_CONCEPT:
				return basicSetMedicationCodeableConcept(null, msgs);
			case FhirPackage.MEDICATION_STATEMENT__MEDICATION_REFERENCE:
				return basicSetMedicationReference(null, msgs);
			case FhirPackage.MEDICATION_STATEMENT__SUBJECT:
				return basicSetSubject(null, msgs);
			case FhirPackage.MEDICATION_STATEMENT__EFFECTIVE_DATE_TIME:
				return basicSetEffectiveDateTime(null, msgs);
			case FhirPackage.MEDICATION_STATEMENT__EFFECTIVE_PERIOD:
				return basicSetEffectivePeriod(null, msgs);
			case FhirPackage.MEDICATION_STATEMENT__INFORMATION_SOURCE:
				return basicSetInformationSource(null, msgs);
			case FhirPackage.MEDICATION_STATEMENT__DERIVED_FROM:
				return ((InternalEList<?>)getDerivedFrom()).basicRemove(otherEnd, msgs);
			case FhirPackage.MEDICATION_STATEMENT__DATE_ASSERTED:
				return basicSetDateAsserted(null, msgs);
			case FhirPackage.MEDICATION_STATEMENT__TAKEN:
				return basicSetTaken(null, msgs);
			case FhirPackage.MEDICATION_STATEMENT__REASON_NOT_TAKEN:
				return ((InternalEList<?>)getReasonNotTaken()).basicRemove(otherEnd, msgs);
			case FhirPackage.MEDICATION_STATEMENT__REASON_FOR_USE_CODEABLE_CONCEPT:
				return ((InternalEList<?>)getReasonForUseCodeableConcept()).basicRemove(otherEnd, msgs);
			case FhirPackage.MEDICATION_STATEMENT__REASON_FOR_USE_REFERENCE:
				return ((InternalEList<?>)getReasonForUseReference()).basicRemove(otherEnd, msgs);
			case FhirPackage.MEDICATION_STATEMENT__NOTE:
				return ((InternalEList<?>)getNote()).basicRemove(otherEnd, msgs);
			case FhirPackage.MEDICATION_STATEMENT__DOSAGE:
				return ((InternalEList<?>)getDosage()).basicRemove(otherEnd, msgs);
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
			case FhirPackage.MEDICATION_STATEMENT__IDENTIFIER:
				return getIdentifier();
			case FhirPackage.MEDICATION_STATEMENT__BASED_ON:
				return getBasedOn();
			case FhirPackage.MEDICATION_STATEMENT__PART_OF:
				return getPartOf();
			case FhirPackage.MEDICATION_STATEMENT__CONTEXT:
				return getContext();
			case FhirPackage.MEDICATION_STATEMENT__STATUS:
				return getStatus();
			case FhirPackage.MEDICATION_STATEMENT__CATEGORY:
				return getCategory();
			case FhirPackage.MEDICATION_STATEMENT__MEDICATION_CODEABLE_CONCEPT:
				return getMedicationCodeableConcept();
			case FhirPackage.MEDICATION_STATEMENT__MEDICATION_REFERENCE:
				return getMedicationReference();
			case FhirPackage.MEDICATION_STATEMENT__SUBJECT:
				return getSubject();
			case FhirPackage.MEDICATION_STATEMENT__EFFECTIVE_DATE_TIME:
				return getEffectiveDateTime();
			case FhirPackage.MEDICATION_STATEMENT__EFFECTIVE_PERIOD:
				return getEffectivePeriod();
			case FhirPackage.MEDICATION_STATEMENT__INFORMATION_SOURCE:
				return getInformationSource();
			case FhirPackage.MEDICATION_STATEMENT__DERIVED_FROM:
				return getDerivedFrom();
			case FhirPackage.MEDICATION_STATEMENT__DATE_ASSERTED:
				return getDateAsserted();
			case FhirPackage.MEDICATION_STATEMENT__TAKEN:
				return getTaken();
			case FhirPackage.MEDICATION_STATEMENT__REASON_NOT_TAKEN:
				return getReasonNotTaken();
			case FhirPackage.MEDICATION_STATEMENT__REASON_FOR_USE_CODEABLE_CONCEPT:
				return getReasonForUseCodeableConcept();
			case FhirPackage.MEDICATION_STATEMENT__REASON_FOR_USE_REFERENCE:
				return getReasonForUseReference();
			case FhirPackage.MEDICATION_STATEMENT__NOTE:
				return getNote();
			case FhirPackage.MEDICATION_STATEMENT__DOSAGE:
				return getDosage();
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
			case FhirPackage.MEDICATION_STATEMENT__IDENTIFIER:
				getIdentifier().clear();
				getIdentifier().addAll((Collection<? extends Identifier>)newValue);
				return;
			case FhirPackage.MEDICATION_STATEMENT__BASED_ON:
				getBasedOn().clear();
				getBasedOn().addAll((Collection<? extends Reference>)newValue);
				return;
			case FhirPackage.MEDICATION_STATEMENT__PART_OF:
				getPartOf().clear();
				getPartOf().addAll((Collection<? extends Reference>)newValue);
				return;
			case FhirPackage.MEDICATION_STATEMENT__CONTEXT:
				setContext((Reference)newValue);
				return;
			case FhirPackage.MEDICATION_STATEMENT__STATUS:
				setStatus((MedicationStatementStatus)newValue);
				return;
			case FhirPackage.MEDICATION_STATEMENT__CATEGORY:
				setCategory((CodeableConcept)newValue);
				return;
			case FhirPackage.MEDICATION_STATEMENT__MEDICATION_CODEABLE_CONCEPT:
				setMedicationCodeableConcept((CodeableConcept)newValue);
				return;
			case FhirPackage.MEDICATION_STATEMENT__MEDICATION_REFERENCE:
				setMedicationReference((Reference)newValue);
				return;
			case FhirPackage.MEDICATION_STATEMENT__SUBJECT:
				setSubject((Reference)newValue);
				return;
			case FhirPackage.MEDICATION_STATEMENT__EFFECTIVE_DATE_TIME:
				setEffectiveDateTime((DateTime)newValue);
				return;
			case FhirPackage.MEDICATION_STATEMENT__EFFECTIVE_PERIOD:
				setEffectivePeriod((Period)newValue);
				return;
			case FhirPackage.MEDICATION_STATEMENT__INFORMATION_SOURCE:
				setInformationSource((Reference)newValue);
				return;
			case FhirPackage.MEDICATION_STATEMENT__DERIVED_FROM:
				getDerivedFrom().clear();
				getDerivedFrom().addAll((Collection<? extends Reference>)newValue);
				return;
			case FhirPackage.MEDICATION_STATEMENT__DATE_ASSERTED:
				setDateAsserted((DateTime)newValue);
				return;
			case FhirPackage.MEDICATION_STATEMENT__TAKEN:
				setTaken((MedicationStatementTaken)newValue);
				return;
			case FhirPackage.MEDICATION_STATEMENT__REASON_NOT_TAKEN:
				getReasonNotTaken().clear();
				getReasonNotTaken().addAll((Collection<? extends CodeableConcept>)newValue);
				return;
			case FhirPackage.MEDICATION_STATEMENT__REASON_FOR_USE_CODEABLE_CONCEPT:
				getReasonForUseCodeableConcept().clear();
				getReasonForUseCodeableConcept().addAll((Collection<? extends CodeableConcept>)newValue);
				return;
			case FhirPackage.MEDICATION_STATEMENT__REASON_FOR_USE_REFERENCE:
				getReasonForUseReference().clear();
				getReasonForUseReference().addAll((Collection<? extends Reference>)newValue);
				return;
			case FhirPackage.MEDICATION_STATEMENT__NOTE:
				getNote().clear();
				getNote().addAll((Collection<? extends Annotation>)newValue);
				return;
			case FhirPackage.MEDICATION_STATEMENT__DOSAGE:
				getDosage().clear();
				getDosage().addAll((Collection<? extends DosageInstruction>)newValue);
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
			case FhirPackage.MEDICATION_STATEMENT__IDENTIFIER:
				getIdentifier().clear();
				return;
			case FhirPackage.MEDICATION_STATEMENT__BASED_ON:
				getBasedOn().clear();
				return;
			case FhirPackage.MEDICATION_STATEMENT__PART_OF:
				getPartOf().clear();
				return;
			case FhirPackage.MEDICATION_STATEMENT__CONTEXT:
				setContext((Reference)null);
				return;
			case FhirPackage.MEDICATION_STATEMENT__STATUS:
				setStatus((MedicationStatementStatus)null);
				return;
			case FhirPackage.MEDICATION_STATEMENT__CATEGORY:
				setCategory((CodeableConcept)null);
				return;
			case FhirPackage.MEDICATION_STATEMENT__MEDICATION_CODEABLE_CONCEPT:
				setMedicationCodeableConcept((CodeableConcept)null);
				return;
			case FhirPackage.MEDICATION_STATEMENT__MEDICATION_REFERENCE:
				setMedicationReference((Reference)null);
				return;
			case FhirPackage.MEDICATION_STATEMENT__SUBJECT:
				setSubject((Reference)null);
				return;
			case FhirPackage.MEDICATION_STATEMENT__EFFECTIVE_DATE_TIME:
				setEffectiveDateTime((DateTime)null);
				return;
			case FhirPackage.MEDICATION_STATEMENT__EFFECTIVE_PERIOD:
				setEffectivePeriod((Period)null);
				return;
			case FhirPackage.MEDICATION_STATEMENT__INFORMATION_SOURCE:
				setInformationSource((Reference)null);
				return;
			case FhirPackage.MEDICATION_STATEMENT__DERIVED_FROM:
				getDerivedFrom().clear();
				return;
			case FhirPackage.MEDICATION_STATEMENT__DATE_ASSERTED:
				setDateAsserted((DateTime)null);
				return;
			case FhirPackage.MEDICATION_STATEMENT__TAKEN:
				setTaken((MedicationStatementTaken)null);
				return;
			case FhirPackage.MEDICATION_STATEMENT__REASON_NOT_TAKEN:
				getReasonNotTaken().clear();
				return;
			case FhirPackage.MEDICATION_STATEMENT__REASON_FOR_USE_CODEABLE_CONCEPT:
				getReasonForUseCodeableConcept().clear();
				return;
			case FhirPackage.MEDICATION_STATEMENT__REASON_FOR_USE_REFERENCE:
				getReasonForUseReference().clear();
				return;
			case FhirPackage.MEDICATION_STATEMENT__NOTE:
				getNote().clear();
				return;
			case FhirPackage.MEDICATION_STATEMENT__DOSAGE:
				getDosage().clear();
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
			case FhirPackage.MEDICATION_STATEMENT__IDENTIFIER:
				return identifier != null && !identifier.isEmpty();
			case FhirPackage.MEDICATION_STATEMENT__BASED_ON:
				return basedOn != null && !basedOn.isEmpty();
			case FhirPackage.MEDICATION_STATEMENT__PART_OF:
				return partOf != null && !partOf.isEmpty();
			case FhirPackage.MEDICATION_STATEMENT__CONTEXT:
				return context != null;
			case FhirPackage.MEDICATION_STATEMENT__STATUS:
				return status != null;
			case FhirPackage.MEDICATION_STATEMENT__CATEGORY:
				return category != null;
			case FhirPackage.MEDICATION_STATEMENT__MEDICATION_CODEABLE_CONCEPT:
				return medicationCodeableConcept != null;
			case FhirPackage.MEDICATION_STATEMENT__MEDICATION_REFERENCE:
				return medicationReference != null;
			case FhirPackage.MEDICATION_STATEMENT__SUBJECT:
				return subject != null;
			case FhirPackage.MEDICATION_STATEMENT__EFFECTIVE_DATE_TIME:
				return effectiveDateTime != null;
			case FhirPackage.MEDICATION_STATEMENT__EFFECTIVE_PERIOD:
				return effectivePeriod != null;
			case FhirPackage.MEDICATION_STATEMENT__INFORMATION_SOURCE:
				return informationSource != null;
			case FhirPackage.MEDICATION_STATEMENT__DERIVED_FROM:
				return derivedFrom != null && !derivedFrom.isEmpty();
			case FhirPackage.MEDICATION_STATEMENT__DATE_ASSERTED:
				return dateAsserted != null;
			case FhirPackage.MEDICATION_STATEMENT__TAKEN:
				return taken != null;
			case FhirPackage.MEDICATION_STATEMENT__REASON_NOT_TAKEN:
				return reasonNotTaken != null && !reasonNotTaken.isEmpty();
			case FhirPackage.MEDICATION_STATEMENT__REASON_FOR_USE_CODEABLE_CONCEPT:
				return reasonForUseCodeableConcept != null && !reasonForUseCodeableConcept.isEmpty();
			case FhirPackage.MEDICATION_STATEMENT__REASON_FOR_USE_REFERENCE:
				return reasonForUseReference != null && !reasonForUseReference.isEmpty();
			case FhirPackage.MEDICATION_STATEMENT__NOTE:
				return note != null && !note.isEmpty();
			case FhirPackage.MEDICATION_STATEMENT__DOSAGE:
				return dosage != null && !dosage.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //MedicationStatementImpl
