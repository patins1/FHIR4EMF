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
import org.hl7.fhir.Date;
import org.hl7.fhir.DateTime;
import org.hl7.fhir.FhirPackage;
import org.hl7.fhir.Identifier;
import org.hl7.fhir.Immunization;
import org.hl7.fhir.ImmunizationExplanation;
import org.hl7.fhir.ImmunizationPractitioner;
import org.hl7.fhir.ImmunizationReaction;
import org.hl7.fhir.ImmunizationStatusCodes;
import org.hl7.fhir.ImmunizationVaccinationProtocol;
import org.hl7.fhir.Quantity;
import org.hl7.fhir.Reference;
import org.hl7.fhir.jaxb.BooleanImplAdapter;
import org.hl7.fhir.jaxb.DateImplAdapter;
import org.hl7.fhir.jaxb.DateTimeImplAdapter;
import org.hl7.fhir.jaxb.ImmunizationStatusCodesImplAdapter;
import org.hl7.fhir.jaxb.StringImplAdapter;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Immunization</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.hl7.fhir.impl.ImmunizationImpl#getIdentifier <em>Identifier</em>}</li>
 *   <li>{@link org.hl7.fhir.impl.ImmunizationImpl#getStatus <em>Status</em>}</li>
 *   <li>{@link org.hl7.fhir.impl.ImmunizationImpl#getNotGiven <em>Not Given</em>}</li>
 *   <li>{@link org.hl7.fhir.impl.ImmunizationImpl#getVaccineCode <em>Vaccine Code</em>}</li>
 *   <li>{@link org.hl7.fhir.impl.ImmunizationImpl#getPatient <em>Patient</em>}</li>
 *   <li>{@link org.hl7.fhir.impl.ImmunizationImpl#getEncounter <em>Encounter</em>}</li>
 *   <li>{@link org.hl7.fhir.impl.ImmunizationImpl#getDate <em>Date</em>}</li>
 *   <li>{@link org.hl7.fhir.impl.ImmunizationImpl#getPrimarySource <em>Primary Source</em>}</li>
 *   <li>{@link org.hl7.fhir.impl.ImmunizationImpl#getReportOrigin <em>Report Origin</em>}</li>
 *   <li>{@link org.hl7.fhir.impl.ImmunizationImpl#getLocation <em>Location</em>}</li>
 *   <li>{@link org.hl7.fhir.impl.ImmunizationImpl#getManufacturer <em>Manufacturer</em>}</li>
 *   <li>{@link org.hl7.fhir.impl.ImmunizationImpl#getLotNumber <em>Lot Number</em>}</li>
 *   <li>{@link org.hl7.fhir.impl.ImmunizationImpl#getExpirationDate <em>Expiration Date</em>}</li>
 *   <li>{@link org.hl7.fhir.impl.ImmunizationImpl#getSite <em>Site</em>}</li>
 *   <li>{@link org.hl7.fhir.impl.ImmunizationImpl#getRoute <em>Route</em>}</li>
 *   <li>{@link org.hl7.fhir.impl.ImmunizationImpl#getDoseQuantity <em>Dose Quantity</em>}</li>
 *   <li>{@link org.hl7.fhir.impl.ImmunizationImpl#getPractitioner <em>Practitioner</em>}</li>
 *   <li>{@link org.hl7.fhir.impl.ImmunizationImpl#getNote <em>Note</em>}</li>
 *   <li>{@link org.hl7.fhir.impl.ImmunizationImpl#getExplanation <em>Explanation</em>}</li>
 *   <li>{@link org.hl7.fhir.impl.ImmunizationImpl#getReaction <em>Reaction</em>}</li>
 *   <li>{@link org.hl7.fhir.impl.ImmunizationImpl#getVaccinationProtocol <em>Vaccination Protocol</em>}</li>
 * </ul>
 *
 * @generated
 */
@XmlType(name = "Immunization", namespace = "http://hl7.org/fhir")
@XmlRootElement(name = "fhir.Immunization")
public class ImmunizationImpl extends DomainResourceImpl implements Immunization {
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
	protected ImmunizationStatusCodes status;

	/**
	 * The cached value of the '{@link #getNotGiven() <em>Not Given</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNotGiven()
	 * @generated
	 * @ordered
	 */
	protected org.hl7.fhir.Boolean notGiven;

	/**
	 * The cached value of the '{@link #getVaccineCode() <em>Vaccine Code</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getVaccineCode()
	 * @generated
	 * @ordered
	 */
	protected CodeableConcept vaccineCode;

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
	 * The cached value of the '{@link #getEncounter() <em>Encounter</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getEncounter()
	 * @generated
	 * @ordered
	 */
	protected Reference encounter;

	/**
	 * The cached value of the '{@link #getDate() <em>Date</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDate()
	 * @generated
	 * @ordered
	 */
	protected DateTime date;

	/**
	 * The cached value of the '{@link #getPrimarySource() <em>Primary Source</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPrimarySource()
	 * @generated
	 * @ordered
	 */
	protected org.hl7.fhir.Boolean primarySource;

	/**
	 * The cached value of the '{@link #getReportOrigin() <em>Report Origin</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getReportOrigin()
	 * @generated
	 * @ordered
	 */
	protected CodeableConcept reportOrigin;

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
	 * The cached value of the '{@link #getManufacturer() <em>Manufacturer</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getManufacturer()
	 * @generated
	 * @ordered
	 */
	protected Reference manufacturer;

	/**
	 * The cached value of the '{@link #getLotNumber() <em>Lot Number</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLotNumber()
	 * @generated
	 * @ordered
	 */
	protected org.hl7.fhir.String lotNumber;

	/**
	 * The cached value of the '{@link #getExpirationDate() <em>Expiration Date</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getExpirationDate()
	 * @generated
	 * @ordered
	 */
	protected Date expirationDate;

	/**
	 * The cached value of the '{@link #getSite() <em>Site</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSite()
	 * @generated
	 * @ordered
	 */
	protected CodeableConcept site;

	/**
	 * The cached value of the '{@link #getRoute() <em>Route</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRoute()
	 * @generated
	 * @ordered
	 */
	protected CodeableConcept route;

	/**
	 * The cached value of the '{@link #getDoseQuantity() <em>Dose Quantity</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDoseQuantity()
	 * @generated
	 * @ordered
	 */
	protected Quantity doseQuantity;

	/**
	 * The cached value of the '{@link #getPractitioner() <em>Practitioner</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPractitioner()
	 * @generated
	 * @ordered
	 */
	protected EList<ImmunizationPractitioner> practitioner;

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
	 * The cached value of the '{@link #getExplanation() <em>Explanation</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getExplanation()
	 * @generated
	 * @ordered
	 */
	protected ImmunizationExplanation explanation;

	/**
	 * The cached value of the '{@link #getReaction() <em>Reaction</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getReaction()
	 * @generated
	 * @ordered
	 */
	protected EList<ImmunizationReaction> reaction;

	/**
	 * The cached value of the '{@link #getVaccinationProtocol() <em>Vaccination Protocol</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getVaccinationProtocol()
	 * @generated
	 * @ordered
	 */
	protected EList<ImmunizationVaccinationProtocol> vaccinationProtocol;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ImmunizationImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return FhirPackage.eINSTANCE.getImmunization();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@XmlElement
	public List<Identifier> getIdentifier() {
		if (identifier == null) {
			identifier = new EObjectContainmentEList<Identifier>(Identifier.class, this, FhirPackage.IMMUNIZATION__IDENTIFIER);
		}
		return identifier;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@XmlJavaTypeAdapter(ImmunizationStatusCodesImplAdapter.class)
	@XmlElement(required = true)
	public ImmunizationStatusCodes getStatus() {
		return status;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetStatus(ImmunizationStatusCodes newStatus, NotificationChain msgs) {
		ImmunizationStatusCodes oldStatus = status;
		status = newStatus;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FhirPackage.IMMUNIZATION__STATUS, oldStatus, newStatus);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setStatus(ImmunizationStatusCodes newStatus) {
		if (newStatus != status) {
			NotificationChain msgs = null;
			if (status != null)
				msgs = ((InternalEObject)status).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FhirPackage.IMMUNIZATION__STATUS, null, msgs);
			if (newStatus != null)
				msgs = ((InternalEObject)newStatus).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FhirPackage.IMMUNIZATION__STATUS, null, msgs);
			msgs = basicSetStatus(newStatus, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FhirPackage.IMMUNIZATION__STATUS, newStatus, newStatus));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@XmlJavaTypeAdapter(BooleanImplAdapter.class)
	@XmlElement(required = true)
	public org.hl7.fhir.Boolean getNotGiven() {
		return notGiven;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetNotGiven(org.hl7.fhir.Boolean newNotGiven, NotificationChain msgs) {
		org.hl7.fhir.Boolean oldNotGiven = notGiven;
		notGiven = newNotGiven;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FhirPackage.IMMUNIZATION__NOT_GIVEN, oldNotGiven, newNotGiven);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setNotGiven(org.hl7.fhir.Boolean newNotGiven) {
		if (newNotGiven != notGiven) {
			NotificationChain msgs = null;
			if (notGiven != null)
				msgs = ((InternalEObject)notGiven).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FhirPackage.IMMUNIZATION__NOT_GIVEN, null, msgs);
			if (newNotGiven != null)
				msgs = ((InternalEObject)newNotGiven).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FhirPackage.IMMUNIZATION__NOT_GIVEN, null, msgs);
			msgs = basicSetNotGiven(newNotGiven, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FhirPackage.IMMUNIZATION__NOT_GIVEN, newNotGiven, newNotGiven));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@XmlElement(required = true)
	public CodeableConcept getVaccineCode() {
		return vaccineCode;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetVaccineCode(CodeableConcept newVaccineCode, NotificationChain msgs) {
		CodeableConcept oldVaccineCode = vaccineCode;
		vaccineCode = newVaccineCode;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FhirPackage.IMMUNIZATION__VACCINE_CODE, oldVaccineCode, newVaccineCode);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setVaccineCode(CodeableConcept newVaccineCode) {
		if (newVaccineCode != vaccineCode) {
			NotificationChain msgs = null;
			if (vaccineCode != null)
				msgs = ((InternalEObject)vaccineCode).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FhirPackage.IMMUNIZATION__VACCINE_CODE, null, msgs);
			if (newVaccineCode != null)
				msgs = ((InternalEObject)newVaccineCode).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FhirPackage.IMMUNIZATION__VACCINE_CODE, null, msgs);
			msgs = basicSetVaccineCode(newVaccineCode, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FhirPackage.IMMUNIZATION__VACCINE_CODE, newVaccineCode, newVaccineCode));
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
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FhirPackage.IMMUNIZATION__PATIENT, oldPatient, newPatient);
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
				msgs = ((InternalEObject)patient).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FhirPackage.IMMUNIZATION__PATIENT, null, msgs);
			if (newPatient != null)
				msgs = ((InternalEObject)newPatient).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FhirPackage.IMMUNIZATION__PATIENT, null, msgs);
			msgs = basicSetPatient(newPatient, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FhirPackage.IMMUNIZATION__PATIENT, newPatient, newPatient));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Reference getEncounter() {
		return encounter;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetEncounter(Reference newEncounter, NotificationChain msgs) {
		Reference oldEncounter = encounter;
		encounter = newEncounter;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FhirPackage.IMMUNIZATION__ENCOUNTER, oldEncounter, newEncounter);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setEncounter(Reference newEncounter) {
		if (newEncounter != encounter) {
			NotificationChain msgs = null;
			if (encounter != null)
				msgs = ((InternalEObject)encounter).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FhirPackage.IMMUNIZATION__ENCOUNTER, null, msgs);
			if (newEncounter != null)
				msgs = ((InternalEObject)newEncounter).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FhirPackage.IMMUNIZATION__ENCOUNTER, null, msgs);
			msgs = basicSetEncounter(newEncounter, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FhirPackage.IMMUNIZATION__ENCOUNTER, newEncounter, newEncounter));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@XmlJavaTypeAdapter(DateTimeImplAdapter.class)
	public DateTime getDate() {
		return date;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetDate(DateTime newDate, NotificationChain msgs) {
		DateTime oldDate = date;
		date = newDate;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FhirPackage.IMMUNIZATION__DATE, oldDate, newDate);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setDate(DateTime newDate) {
		if (newDate != date) {
			NotificationChain msgs = null;
			if (date != null)
				msgs = ((InternalEObject)date).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FhirPackage.IMMUNIZATION__DATE, null, msgs);
			if (newDate != null)
				msgs = ((InternalEObject)newDate).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FhirPackage.IMMUNIZATION__DATE, null, msgs);
			msgs = basicSetDate(newDate, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FhirPackage.IMMUNIZATION__DATE, newDate, newDate));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@XmlJavaTypeAdapter(BooleanImplAdapter.class)
	@XmlElement(required = true)
	public org.hl7.fhir.Boolean getPrimarySource() {
		return primarySource;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetPrimarySource(org.hl7.fhir.Boolean newPrimarySource, NotificationChain msgs) {
		org.hl7.fhir.Boolean oldPrimarySource = primarySource;
		primarySource = newPrimarySource;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FhirPackage.IMMUNIZATION__PRIMARY_SOURCE, oldPrimarySource, newPrimarySource);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setPrimarySource(org.hl7.fhir.Boolean newPrimarySource) {
		if (newPrimarySource != primarySource) {
			NotificationChain msgs = null;
			if (primarySource != null)
				msgs = ((InternalEObject)primarySource).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FhirPackage.IMMUNIZATION__PRIMARY_SOURCE, null, msgs);
			if (newPrimarySource != null)
				msgs = ((InternalEObject)newPrimarySource).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FhirPackage.IMMUNIZATION__PRIMARY_SOURCE, null, msgs);
			msgs = basicSetPrimarySource(newPrimarySource, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FhirPackage.IMMUNIZATION__PRIMARY_SOURCE, newPrimarySource, newPrimarySource));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CodeableConcept getReportOrigin() {
		return reportOrigin;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetReportOrigin(CodeableConcept newReportOrigin, NotificationChain msgs) {
		CodeableConcept oldReportOrigin = reportOrigin;
		reportOrigin = newReportOrigin;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FhirPackage.IMMUNIZATION__REPORT_ORIGIN, oldReportOrigin, newReportOrigin);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setReportOrigin(CodeableConcept newReportOrigin) {
		if (newReportOrigin != reportOrigin) {
			NotificationChain msgs = null;
			if (reportOrigin != null)
				msgs = ((InternalEObject)reportOrigin).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FhirPackage.IMMUNIZATION__REPORT_ORIGIN, null, msgs);
			if (newReportOrigin != null)
				msgs = ((InternalEObject)newReportOrigin).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FhirPackage.IMMUNIZATION__REPORT_ORIGIN, null, msgs);
			msgs = basicSetReportOrigin(newReportOrigin, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FhirPackage.IMMUNIZATION__REPORT_ORIGIN, newReportOrigin, newReportOrigin));
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
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FhirPackage.IMMUNIZATION__LOCATION, oldLocation, newLocation);
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
				msgs = ((InternalEObject)location).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FhirPackage.IMMUNIZATION__LOCATION, null, msgs);
			if (newLocation != null)
				msgs = ((InternalEObject)newLocation).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FhirPackage.IMMUNIZATION__LOCATION, null, msgs);
			msgs = basicSetLocation(newLocation, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FhirPackage.IMMUNIZATION__LOCATION, newLocation, newLocation));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Reference getManufacturer() {
		return manufacturer;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetManufacturer(Reference newManufacturer, NotificationChain msgs) {
		Reference oldManufacturer = manufacturer;
		manufacturer = newManufacturer;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FhirPackage.IMMUNIZATION__MANUFACTURER, oldManufacturer, newManufacturer);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setManufacturer(Reference newManufacturer) {
		if (newManufacturer != manufacturer) {
			NotificationChain msgs = null;
			if (manufacturer != null)
				msgs = ((InternalEObject)manufacturer).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FhirPackage.IMMUNIZATION__MANUFACTURER, null, msgs);
			if (newManufacturer != null)
				msgs = ((InternalEObject)newManufacturer).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FhirPackage.IMMUNIZATION__MANUFACTURER, null, msgs);
			msgs = basicSetManufacturer(newManufacturer, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FhirPackage.IMMUNIZATION__MANUFACTURER, newManufacturer, newManufacturer));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@XmlJavaTypeAdapter(StringImplAdapter.class)
	public org.hl7.fhir.String getLotNumber() {
		return lotNumber;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetLotNumber(org.hl7.fhir.String newLotNumber, NotificationChain msgs) {
		org.hl7.fhir.String oldLotNumber = lotNumber;
		lotNumber = newLotNumber;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FhirPackage.IMMUNIZATION__LOT_NUMBER, oldLotNumber, newLotNumber);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setLotNumber(org.hl7.fhir.String newLotNumber) {
		if (newLotNumber != lotNumber) {
			NotificationChain msgs = null;
			if (lotNumber != null)
				msgs = ((InternalEObject)lotNumber).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FhirPackage.IMMUNIZATION__LOT_NUMBER, null, msgs);
			if (newLotNumber != null)
				msgs = ((InternalEObject)newLotNumber).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FhirPackage.IMMUNIZATION__LOT_NUMBER, null, msgs);
			msgs = basicSetLotNumber(newLotNumber, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FhirPackage.IMMUNIZATION__LOT_NUMBER, newLotNumber, newLotNumber));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@XmlJavaTypeAdapter(DateImplAdapter.class)
	public Date getExpirationDate() {
		return expirationDate;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetExpirationDate(Date newExpirationDate, NotificationChain msgs) {
		Date oldExpirationDate = expirationDate;
		expirationDate = newExpirationDate;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FhirPackage.IMMUNIZATION__EXPIRATION_DATE, oldExpirationDate, newExpirationDate);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setExpirationDate(Date newExpirationDate) {
		if (newExpirationDate != expirationDate) {
			NotificationChain msgs = null;
			if (expirationDate != null)
				msgs = ((InternalEObject)expirationDate).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FhirPackage.IMMUNIZATION__EXPIRATION_DATE, null, msgs);
			if (newExpirationDate != null)
				msgs = ((InternalEObject)newExpirationDate).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FhirPackage.IMMUNIZATION__EXPIRATION_DATE, null, msgs);
			msgs = basicSetExpirationDate(newExpirationDate, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FhirPackage.IMMUNIZATION__EXPIRATION_DATE, newExpirationDate, newExpirationDate));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CodeableConcept getSite() {
		return site;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetSite(CodeableConcept newSite, NotificationChain msgs) {
		CodeableConcept oldSite = site;
		site = newSite;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FhirPackage.IMMUNIZATION__SITE, oldSite, newSite);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setSite(CodeableConcept newSite) {
		if (newSite != site) {
			NotificationChain msgs = null;
			if (site != null)
				msgs = ((InternalEObject)site).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FhirPackage.IMMUNIZATION__SITE, null, msgs);
			if (newSite != null)
				msgs = ((InternalEObject)newSite).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FhirPackage.IMMUNIZATION__SITE, null, msgs);
			msgs = basicSetSite(newSite, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FhirPackage.IMMUNIZATION__SITE, newSite, newSite));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CodeableConcept getRoute() {
		return route;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetRoute(CodeableConcept newRoute, NotificationChain msgs) {
		CodeableConcept oldRoute = route;
		route = newRoute;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FhirPackage.IMMUNIZATION__ROUTE, oldRoute, newRoute);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setRoute(CodeableConcept newRoute) {
		if (newRoute != route) {
			NotificationChain msgs = null;
			if (route != null)
				msgs = ((InternalEObject)route).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FhirPackage.IMMUNIZATION__ROUTE, null, msgs);
			if (newRoute != null)
				msgs = ((InternalEObject)newRoute).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FhirPackage.IMMUNIZATION__ROUTE, null, msgs);
			msgs = basicSetRoute(newRoute, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FhirPackage.IMMUNIZATION__ROUTE, newRoute, newRoute));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Quantity getDoseQuantity() {
		return doseQuantity;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetDoseQuantity(Quantity newDoseQuantity, NotificationChain msgs) {
		Quantity oldDoseQuantity = doseQuantity;
		doseQuantity = newDoseQuantity;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FhirPackage.IMMUNIZATION__DOSE_QUANTITY, oldDoseQuantity, newDoseQuantity);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setDoseQuantity(Quantity newDoseQuantity) {
		if (newDoseQuantity != doseQuantity) {
			NotificationChain msgs = null;
			if (doseQuantity != null)
				msgs = ((InternalEObject)doseQuantity).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FhirPackage.IMMUNIZATION__DOSE_QUANTITY, null, msgs);
			if (newDoseQuantity != null)
				msgs = ((InternalEObject)newDoseQuantity).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FhirPackage.IMMUNIZATION__DOSE_QUANTITY, null, msgs);
			msgs = basicSetDoseQuantity(newDoseQuantity, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FhirPackage.IMMUNIZATION__DOSE_QUANTITY, newDoseQuantity, newDoseQuantity));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@XmlElement
	public List<ImmunizationPractitioner> getPractitioner() {
		if (practitioner == null) {
			practitioner = new EObjectContainmentEList<ImmunizationPractitioner>(ImmunizationPractitioner.class, this, FhirPackage.IMMUNIZATION__PRACTITIONER);
		}
		return practitioner;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@XmlElement
	public List<Annotation> getNote() {
		if (note == null) {
			note = new EObjectContainmentEList<Annotation>(Annotation.class, this, FhirPackage.IMMUNIZATION__NOTE);
		}
		return note;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ImmunizationExplanation getExplanation() {
		return explanation;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetExplanation(ImmunizationExplanation newExplanation, NotificationChain msgs) {
		ImmunizationExplanation oldExplanation = explanation;
		explanation = newExplanation;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FhirPackage.IMMUNIZATION__EXPLANATION, oldExplanation, newExplanation);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setExplanation(ImmunizationExplanation newExplanation) {
		if (newExplanation != explanation) {
			NotificationChain msgs = null;
			if (explanation != null)
				msgs = ((InternalEObject)explanation).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FhirPackage.IMMUNIZATION__EXPLANATION, null, msgs);
			if (newExplanation != null)
				msgs = ((InternalEObject)newExplanation).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FhirPackage.IMMUNIZATION__EXPLANATION, null, msgs);
			msgs = basicSetExplanation(newExplanation, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FhirPackage.IMMUNIZATION__EXPLANATION, newExplanation, newExplanation));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@XmlElement
	public List<ImmunizationReaction> getReaction() {
		if (reaction == null) {
			reaction = new EObjectContainmentEList<ImmunizationReaction>(ImmunizationReaction.class, this, FhirPackage.IMMUNIZATION__REACTION);
		}
		return reaction;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@XmlElement
	public List<ImmunizationVaccinationProtocol> getVaccinationProtocol() {
		if (vaccinationProtocol == null) {
			vaccinationProtocol = new EObjectContainmentEList<ImmunizationVaccinationProtocol>(ImmunizationVaccinationProtocol.class, this, FhirPackage.IMMUNIZATION__VACCINATION_PROTOCOL);
		}
		return vaccinationProtocol;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case FhirPackage.IMMUNIZATION__IDENTIFIER:
				return ((InternalEList<?>)getIdentifier()).basicRemove(otherEnd, msgs);
			case FhirPackage.IMMUNIZATION__STATUS:
				return basicSetStatus(null, msgs);
			case FhirPackage.IMMUNIZATION__NOT_GIVEN:
				return basicSetNotGiven(null, msgs);
			case FhirPackage.IMMUNIZATION__VACCINE_CODE:
				return basicSetVaccineCode(null, msgs);
			case FhirPackage.IMMUNIZATION__PATIENT:
				return basicSetPatient(null, msgs);
			case FhirPackage.IMMUNIZATION__ENCOUNTER:
				return basicSetEncounter(null, msgs);
			case FhirPackage.IMMUNIZATION__DATE:
				return basicSetDate(null, msgs);
			case FhirPackage.IMMUNIZATION__PRIMARY_SOURCE:
				return basicSetPrimarySource(null, msgs);
			case FhirPackage.IMMUNIZATION__REPORT_ORIGIN:
				return basicSetReportOrigin(null, msgs);
			case FhirPackage.IMMUNIZATION__LOCATION:
				return basicSetLocation(null, msgs);
			case FhirPackage.IMMUNIZATION__MANUFACTURER:
				return basicSetManufacturer(null, msgs);
			case FhirPackage.IMMUNIZATION__LOT_NUMBER:
				return basicSetLotNumber(null, msgs);
			case FhirPackage.IMMUNIZATION__EXPIRATION_DATE:
				return basicSetExpirationDate(null, msgs);
			case FhirPackage.IMMUNIZATION__SITE:
				return basicSetSite(null, msgs);
			case FhirPackage.IMMUNIZATION__ROUTE:
				return basicSetRoute(null, msgs);
			case FhirPackage.IMMUNIZATION__DOSE_QUANTITY:
				return basicSetDoseQuantity(null, msgs);
			case FhirPackage.IMMUNIZATION__PRACTITIONER:
				return ((InternalEList<?>)getPractitioner()).basicRemove(otherEnd, msgs);
			case FhirPackage.IMMUNIZATION__NOTE:
				return ((InternalEList<?>)getNote()).basicRemove(otherEnd, msgs);
			case FhirPackage.IMMUNIZATION__EXPLANATION:
				return basicSetExplanation(null, msgs);
			case FhirPackage.IMMUNIZATION__REACTION:
				return ((InternalEList<?>)getReaction()).basicRemove(otherEnd, msgs);
			case FhirPackage.IMMUNIZATION__VACCINATION_PROTOCOL:
				return ((InternalEList<?>)getVaccinationProtocol()).basicRemove(otherEnd, msgs);
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
			case FhirPackage.IMMUNIZATION__IDENTIFIER:
				return getIdentifier();
			case FhirPackage.IMMUNIZATION__STATUS:
				return getStatus();
			case FhirPackage.IMMUNIZATION__NOT_GIVEN:
				return getNotGiven();
			case FhirPackage.IMMUNIZATION__VACCINE_CODE:
				return getVaccineCode();
			case FhirPackage.IMMUNIZATION__PATIENT:
				return getPatient();
			case FhirPackage.IMMUNIZATION__ENCOUNTER:
				return getEncounter();
			case FhirPackage.IMMUNIZATION__DATE:
				return getDate();
			case FhirPackage.IMMUNIZATION__PRIMARY_SOURCE:
				return getPrimarySource();
			case FhirPackage.IMMUNIZATION__REPORT_ORIGIN:
				return getReportOrigin();
			case FhirPackage.IMMUNIZATION__LOCATION:
				return getLocation();
			case FhirPackage.IMMUNIZATION__MANUFACTURER:
				return getManufacturer();
			case FhirPackage.IMMUNIZATION__LOT_NUMBER:
				return getLotNumber();
			case FhirPackage.IMMUNIZATION__EXPIRATION_DATE:
				return getExpirationDate();
			case FhirPackage.IMMUNIZATION__SITE:
				return getSite();
			case FhirPackage.IMMUNIZATION__ROUTE:
				return getRoute();
			case FhirPackage.IMMUNIZATION__DOSE_QUANTITY:
				return getDoseQuantity();
			case FhirPackage.IMMUNIZATION__PRACTITIONER:
				return getPractitioner();
			case FhirPackage.IMMUNIZATION__NOTE:
				return getNote();
			case FhirPackage.IMMUNIZATION__EXPLANATION:
				return getExplanation();
			case FhirPackage.IMMUNIZATION__REACTION:
				return getReaction();
			case FhirPackage.IMMUNIZATION__VACCINATION_PROTOCOL:
				return getVaccinationProtocol();
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
			case FhirPackage.IMMUNIZATION__IDENTIFIER:
				getIdentifier().clear();
				getIdentifier().addAll((Collection<? extends Identifier>)newValue);
				return;
			case FhirPackage.IMMUNIZATION__STATUS:
				setStatus((ImmunizationStatusCodes)newValue);
				return;
			case FhirPackage.IMMUNIZATION__NOT_GIVEN:
				setNotGiven((org.hl7.fhir.Boolean)newValue);
				return;
			case FhirPackage.IMMUNIZATION__VACCINE_CODE:
				setVaccineCode((CodeableConcept)newValue);
				return;
			case FhirPackage.IMMUNIZATION__PATIENT:
				setPatient((Reference)newValue);
				return;
			case FhirPackage.IMMUNIZATION__ENCOUNTER:
				setEncounter((Reference)newValue);
				return;
			case FhirPackage.IMMUNIZATION__DATE:
				setDate((DateTime)newValue);
				return;
			case FhirPackage.IMMUNIZATION__PRIMARY_SOURCE:
				setPrimarySource((org.hl7.fhir.Boolean)newValue);
				return;
			case FhirPackage.IMMUNIZATION__REPORT_ORIGIN:
				setReportOrigin((CodeableConcept)newValue);
				return;
			case FhirPackage.IMMUNIZATION__LOCATION:
				setLocation((Reference)newValue);
				return;
			case FhirPackage.IMMUNIZATION__MANUFACTURER:
				setManufacturer((Reference)newValue);
				return;
			case FhirPackage.IMMUNIZATION__LOT_NUMBER:
				setLotNumber((org.hl7.fhir.String)newValue);
				return;
			case FhirPackage.IMMUNIZATION__EXPIRATION_DATE:
				setExpirationDate((Date)newValue);
				return;
			case FhirPackage.IMMUNIZATION__SITE:
				setSite((CodeableConcept)newValue);
				return;
			case FhirPackage.IMMUNIZATION__ROUTE:
				setRoute((CodeableConcept)newValue);
				return;
			case FhirPackage.IMMUNIZATION__DOSE_QUANTITY:
				setDoseQuantity((Quantity)newValue);
				return;
			case FhirPackage.IMMUNIZATION__PRACTITIONER:
				getPractitioner().clear();
				getPractitioner().addAll((Collection<? extends ImmunizationPractitioner>)newValue);
				return;
			case FhirPackage.IMMUNIZATION__NOTE:
				getNote().clear();
				getNote().addAll((Collection<? extends Annotation>)newValue);
				return;
			case FhirPackage.IMMUNIZATION__EXPLANATION:
				setExplanation((ImmunizationExplanation)newValue);
				return;
			case FhirPackage.IMMUNIZATION__REACTION:
				getReaction().clear();
				getReaction().addAll((Collection<? extends ImmunizationReaction>)newValue);
				return;
			case FhirPackage.IMMUNIZATION__VACCINATION_PROTOCOL:
				getVaccinationProtocol().clear();
				getVaccinationProtocol().addAll((Collection<? extends ImmunizationVaccinationProtocol>)newValue);
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
			case FhirPackage.IMMUNIZATION__IDENTIFIER:
				getIdentifier().clear();
				return;
			case FhirPackage.IMMUNIZATION__STATUS:
				setStatus((ImmunizationStatusCodes)null);
				return;
			case FhirPackage.IMMUNIZATION__NOT_GIVEN:
				setNotGiven((org.hl7.fhir.Boolean)null);
				return;
			case FhirPackage.IMMUNIZATION__VACCINE_CODE:
				setVaccineCode((CodeableConcept)null);
				return;
			case FhirPackage.IMMUNIZATION__PATIENT:
				setPatient((Reference)null);
				return;
			case FhirPackage.IMMUNIZATION__ENCOUNTER:
				setEncounter((Reference)null);
				return;
			case FhirPackage.IMMUNIZATION__DATE:
				setDate((DateTime)null);
				return;
			case FhirPackage.IMMUNIZATION__PRIMARY_SOURCE:
				setPrimarySource((org.hl7.fhir.Boolean)null);
				return;
			case FhirPackage.IMMUNIZATION__REPORT_ORIGIN:
				setReportOrigin((CodeableConcept)null);
				return;
			case FhirPackage.IMMUNIZATION__LOCATION:
				setLocation((Reference)null);
				return;
			case FhirPackage.IMMUNIZATION__MANUFACTURER:
				setManufacturer((Reference)null);
				return;
			case FhirPackage.IMMUNIZATION__LOT_NUMBER:
				setLotNumber((org.hl7.fhir.String)null);
				return;
			case FhirPackage.IMMUNIZATION__EXPIRATION_DATE:
				setExpirationDate((Date)null);
				return;
			case FhirPackage.IMMUNIZATION__SITE:
				setSite((CodeableConcept)null);
				return;
			case FhirPackage.IMMUNIZATION__ROUTE:
				setRoute((CodeableConcept)null);
				return;
			case FhirPackage.IMMUNIZATION__DOSE_QUANTITY:
				setDoseQuantity((Quantity)null);
				return;
			case FhirPackage.IMMUNIZATION__PRACTITIONER:
				getPractitioner().clear();
				return;
			case FhirPackage.IMMUNIZATION__NOTE:
				getNote().clear();
				return;
			case FhirPackage.IMMUNIZATION__EXPLANATION:
				setExplanation((ImmunizationExplanation)null);
				return;
			case FhirPackage.IMMUNIZATION__REACTION:
				getReaction().clear();
				return;
			case FhirPackage.IMMUNIZATION__VACCINATION_PROTOCOL:
				getVaccinationProtocol().clear();
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
			case FhirPackage.IMMUNIZATION__IDENTIFIER:
				return identifier != null && !identifier.isEmpty();
			case FhirPackage.IMMUNIZATION__STATUS:
				return status != null;
			case FhirPackage.IMMUNIZATION__NOT_GIVEN:
				return notGiven != null;
			case FhirPackage.IMMUNIZATION__VACCINE_CODE:
				return vaccineCode != null;
			case FhirPackage.IMMUNIZATION__PATIENT:
				return patient != null;
			case FhirPackage.IMMUNIZATION__ENCOUNTER:
				return encounter != null;
			case FhirPackage.IMMUNIZATION__DATE:
				return date != null;
			case FhirPackage.IMMUNIZATION__PRIMARY_SOURCE:
				return primarySource != null;
			case FhirPackage.IMMUNIZATION__REPORT_ORIGIN:
				return reportOrigin != null;
			case FhirPackage.IMMUNIZATION__LOCATION:
				return location != null;
			case FhirPackage.IMMUNIZATION__MANUFACTURER:
				return manufacturer != null;
			case FhirPackage.IMMUNIZATION__LOT_NUMBER:
				return lotNumber != null;
			case FhirPackage.IMMUNIZATION__EXPIRATION_DATE:
				return expirationDate != null;
			case FhirPackage.IMMUNIZATION__SITE:
				return site != null;
			case FhirPackage.IMMUNIZATION__ROUTE:
				return route != null;
			case FhirPackage.IMMUNIZATION__DOSE_QUANTITY:
				return doseQuantity != null;
			case FhirPackage.IMMUNIZATION__PRACTITIONER:
				return practitioner != null && !practitioner.isEmpty();
			case FhirPackage.IMMUNIZATION__NOTE:
				return note != null && !note.isEmpty();
			case FhirPackage.IMMUNIZATION__EXPLANATION:
				return explanation != null;
			case FhirPackage.IMMUNIZATION__REACTION:
				return reaction != null && !reaction.isEmpty();
			case FhirPackage.IMMUNIZATION__VACCINATION_PROTOCOL:
				return vaccinationProtocol != null && !vaccinationProtocol.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //ImmunizationImpl
