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

import org.hl7.fhir.CodeableConcept;
import org.hl7.fhir.Coding;
import org.hl7.fhir.DateTime;
import org.hl7.fhir.FhirPackage;
import org.hl7.fhir.Identifier;
import org.hl7.fhir.ImagingStudy;
import org.hl7.fhir.ImagingStudySeries;
import org.hl7.fhir.InstanceAvailability;
import org.hl7.fhir.Oid;
import org.hl7.fhir.Reference;
import org.hl7.fhir.UnsignedInt;
import org.hl7.fhir.jaxb.DateTimeImplAdapter;
import org.hl7.fhir.jaxb.InstanceAvailabilityImplAdapter;
import org.hl7.fhir.jaxb.OidImplAdapter;
import org.hl7.fhir.jaxb.StringImplAdapter;
import org.hl7.fhir.jaxb.UnsignedIntImplAdapter;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Imaging Study</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.hl7.fhir.impl.ImagingStudyImpl#getUid <em>Uid</em>}</li>
 *   <li>{@link org.hl7.fhir.impl.ImagingStudyImpl#getAccession <em>Accession</em>}</li>
 *   <li>{@link org.hl7.fhir.impl.ImagingStudyImpl#getIdentifier <em>Identifier</em>}</li>
 *   <li>{@link org.hl7.fhir.impl.ImagingStudyImpl#getAvailability <em>Availability</em>}</li>
 *   <li>{@link org.hl7.fhir.impl.ImagingStudyImpl#getModalityList <em>Modality List</em>}</li>
 *   <li>{@link org.hl7.fhir.impl.ImagingStudyImpl#getPatient <em>Patient</em>}</li>
 *   <li>{@link org.hl7.fhir.impl.ImagingStudyImpl#getContext <em>Context</em>}</li>
 *   <li>{@link org.hl7.fhir.impl.ImagingStudyImpl#getStarted <em>Started</em>}</li>
 *   <li>{@link org.hl7.fhir.impl.ImagingStudyImpl#getBasedOn <em>Based On</em>}</li>
 *   <li>{@link org.hl7.fhir.impl.ImagingStudyImpl#getReferrer <em>Referrer</em>}</li>
 *   <li>{@link org.hl7.fhir.impl.ImagingStudyImpl#getInterpreter <em>Interpreter</em>}</li>
 *   <li>{@link org.hl7.fhir.impl.ImagingStudyImpl#getEndpoint <em>Endpoint</em>}</li>
 *   <li>{@link org.hl7.fhir.impl.ImagingStudyImpl#getNumberOfSeries <em>Number Of Series</em>}</li>
 *   <li>{@link org.hl7.fhir.impl.ImagingStudyImpl#getNumberOfInstances <em>Number Of Instances</em>}</li>
 *   <li>{@link org.hl7.fhir.impl.ImagingStudyImpl#getProcedureReference <em>Procedure Reference</em>}</li>
 *   <li>{@link org.hl7.fhir.impl.ImagingStudyImpl#getProcedureCode <em>Procedure Code</em>}</li>
 *   <li>{@link org.hl7.fhir.impl.ImagingStudyImpl#getReason <em>Reason</em>}</li>
 *   <li>{@link org.hl7.fhir.impl.ImagingStudyImpl#getDescription <em>Description</em>}</li>
 *   <li>{@link org.hl7.fhir.impl.ImagingStudyImpl#getSeries <em>Series</em>}</li>
 * </ul>
 *
 * @generated
 */
@XmlType(name = "ImagingStudy", namespace = "http://hl7.org/fhir")
@XmlRootElement(name = "fhir.ImagingStudy")
public class ImagingStudyImpl extends DomainResourceImpl implements ImagingStudy {
	/**
	 * The cached value of the '{@link #getUid() <em>Uid</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getUid()
	 * @generated
	 * @ordered
	 */
	protected Oid uid;

	/**
	 * The cached value of the '{@link #getAccession() <em>Accession</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAccession()
	 * @generated
	 * @ordered
	 */
	protected Identifier accession;

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
	 * The cached value of the '{@link #getAvailability() <em>Availability</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAvailability()
	 * @generated
	 * @ordered
	 */
	protected InstanceAvailability availability;

	/**
	 * The cached value of the '{@link #getModalityList() <em>Modality List</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getModalityList()
	 * @generated
	 * @ordered
	 */
	protected EList<Coding> modalityList;

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
	 * The cached value of the '{@link #getStarted() <em>Started</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getStarted()
	 * @generated
	 * @ordered
	 */
	protected DateTime started;

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
	 * The cached value of the '{@link #getReferrer() <em>Referrer</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getReferrer()
	 * @generated
	 * @ordered
	 */
	protected Reference referrer;

	/**
	 * The cached value of the '{@link #getInterpreter() <em>Interpreter</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getInterpreter()
	 * @generated
	 * @ordered
	 */
	protected EList<Reference> interpreter;

	/**
	 * The cached value of the '{@link #getEndpoint() <em>Endpoint</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getEndpoint()
	 * @generated
	 * @ordered
	 */
	protected EList<Reference> endpoint;

	/**
	 * The cached value of the '{@link #getNumberOfSeries() <em>Number Of Series</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNumberOfSeries()
	 * @generated
	 * @ordered
	 */
	protected UnsignedInt numberOfSeries;

	/**
	 * The cached value of the '{@link #getNumberOfInstances() <em>Number Of Instances</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNumberOfInstances()
	 * @generated
	 * @ordered
	 */
	protected UnsignedInt numberOfInstances;

	/**
	 * The cached value of the '{@link #getProcedureReference() <em>Procedure Reference</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getProcedureReference()
	 * @generated
	 * @ordered
	 */
	protected EList<Reference> procedureReference;

	/**
	 * The cached value of the '{@link #getProcedureCode() <em>Procedure Code</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getProcedureCode()
	 * @generated
	 * @ordered
	 */
	protected EList<CodeableConcept> procedureCode;

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
	 * The cached value of the '{@link #getSeries() <em>Series</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSeries()
	 * @generated
	 * @ordered
	 */
	protected EList<ImagingStudySeries> series;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ImagingStudyImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return FhirPackage.eINSTANCE.getImagingStudy();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@XmlJavaTypeAdapter(OidImplAdapter.class)
	@XmlElement(required = true)
	public Oid getUid() {
		return uid;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetUid(Oid newUid, NotificationChain msgs) {
		Oid oldUid = uid;
		uid = newUid;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FhirPackage.IMAGING_STUDY__UID, oldUid, newUid);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setUid(Oid newUid) {
		if (newUid != uid) {
			NotificationChain msgs = null;
			if (uid != null)
				msgs = ((InternalEObject)uid).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FhirPackage.IMAGING_STUDY__UID, null, msgs);
			if (newUid != null)
				msgs = ((InternalEObject)newUid).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FhirPackage.IMAGING_STUDY__UID, null, msgs);
			msgs = basicSetUid(newUid, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FhirPackage.IMAGING_STUDY__UID, newUid, newUid));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Identifier getAccession() {
		return accession;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetAccession(Identifier newAccession, NotificationChain msgs) {
		Identifier oldAccession = accession;
		accession = newAccession;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FhirPackage.IMAGING_STUDY__ACCESSION, oldAccession, newAccession);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setAccession(Identifier newAccession) {
		if (newAccession != accession) {
			NotificationChain msgs = null;
			if (accession != null)
				msgs = ((InternalEObject)accession).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FhirPackage.IMAGING_STUDY__ACCESSION, null, msgs);
			if (newAccession != null)
				msgs = ((InternalEObject)newAccession).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FhirPackage.IMAGING_STUDY__ACCESSION, null, msgs);
			msgs = basicSetAccession(newAccession, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FhirPackage.IMAGING_STUDY__ACCESSION, newAccession, newAccession));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@XmlElement
	public List<Identifier> getIdentifier() {
		if (identifier == null) {
			identifier = new EObjectContainmentEList<Identifier>(Identifier.class, this, FhirPackage.IMAGING_STUDY__IDENTIFIER);
		}
		return identifier;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@XmlJavaTypeAdapter(InstanceAvailabilityImplAdapter.class)
	public InstanceAvailability getAvailability() {
		return availability;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetAvailability(InstanceAvailability newAvailability, NotificationChain msgs) {
		InstanceAvailability oldAvailability = availability;
		availability = newAvailability;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FhirPackage.IMAGING_STUDY__AVAILABILITY, oldAvailability, newAvailability);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setAvailability(InstanceAvailability newAvailability) {
		if (newAvailability != availability) {
			NotificationChain msgs = null;
			if (availability != null)
				msgs = ((InternalEObject)availability).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FhirPackage.IMAGING_STUDY__AVAILABILITY, null, msgs);
			if (newAvailability != null)
				msgs = ((InternalEObject)newAvailability).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FhirPackage.IMAGING_STUDY__AVAILABILITY, null, msgs);
			msgs = basicSetAvailability(newAvailability, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FhirPackage.IMAGING_STUDY__AVAILABILITY, newAvailability, newAvailability));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@XmlElement
	public List<Coding> getModalityList() {
		if (modalityList == null) {
			modalityList = new EObjectContainmentEList<Coding>(Coding.class, this, FhirPackage.IMAGING_STUDY__MODALITY_LIST);
		}
		return modalityList;
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
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FhirPackage.IMAGING_STUDY__PATIENT, oldPatient, newPatient);
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
				msgs = ((InternalEObject)patient).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FhirPackage.IMAGING_STUDY__PATIENT, null, msgs);
			if (newPatient != null)
				msgs = ((InternalEObject)newPatient).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FhirPackage.IMAGING_STUDY__PATIENT, null, msgs);
			msgs = basicSetPatient(newPatient, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FhirPackage.IMAGING_STUDY__PATIENT, newPatient, newPatient));
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
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FhirPackage.IMAGING_STUDY__CONTEXT, oldContext, newContext);
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
				msgs = ((InternalEObject)context).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FhirPackage.IMAGING_STUDY__CONTEXT, null, msgs);
			if (newContext != null)
				msgs = ((InternalEObject)newContext).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FhirPackage.IMAGING_STUDY__CONTEXT, null, msgs);
			msgs = basicSetContext(newContext, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FhirPackage.IMAGING_STUDY__CONTEXT, newContext, newContext));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@XmlJavaTypeAdapter(DateTimeImplAdapter.class)
	public DateTime getStarted() {
		return started;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetStarted(DateTime newStarted, NotificationChain msgs) {
		DateTime oldStarted = started;
		started = newStarted;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FhirPackage.IMAGING_STUDY__STARTED, oldStarted, newStarted);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setStarted(DateTime newStarted) {
		if (newStarted != started) {
			NotificationChain msgs = null;
			if (started != null)
				msgs = ((InternalEObject)started).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FhirPackage.IMAGING_STUDY__STARTED, null, msgs);
			if (newStarted != null)
				msgs = ((InternalEObject)newStarted).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FhirPackage.IMAGING_STUDY__STARTED, null, msgs);
			msgs = basicSetStarted(newStarted, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FhirPackage.IMAGING_STUDY__STARTED, newStarted, newStarted));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@XmlElement
	public List<Reference> getBasedOn() {
		if (basedOn == null) {
			basedOn = new EObjectContainmentEList<Reference>(Reference.class, this, FhirPackage.IMAGING_STUDY__BASED_ON);
		}
		return basedOn;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Reference getReferrer() {
		return referrer;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetReferrer(Reference newReferrer, NotificationChain msgs) {
		Reference oldReferrer = referrer;
		referrer = newReferrer;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FhirPackage.IMAGING_STUDY__REFERRER, oldReferrer, newReferrer);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setReferrer(Reference newReferrer) {
		if (newReferrer != referrer) {
			NotificationChain msgs = null;
			if (referrer != null)
				msgs = ((InternalEObject)referrer).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FhirPackage.IMAGING_STUDY__REFERRER, null, msgs);
			if (newReferrer != null)
				msgs = ((InternalEObject)newReferrer).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FhirPackage.IMAGING_STUDY__REFERRER, null, msgs);
			msgs = basicSetReferrer(newReferrer, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FhirPackage.IMAGING_STUDY__REFERRER, newReferrer, newReferrer));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@XmlElement
	public List<Reference> getInterpreter() {
		if (interpreter == null) {
			interpreter = new EObjectContainmentEList<Reference>(Reference.class, this, FhirPackage.IMAGING_STUDY__INTERPRETER);
		}
		return interpreter;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@XmlElement
	public List<Reference> getEndpoint() {
		if (endpoint == null) {
			endpoint = new EObjectContainmentEList<Reference>(Reference.class, this, FhirPackage.IMAGING_STUDY__ENDPOINT);
		}
		return endpoint;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@XmlJavaTypeAdapter(UnsignedIntImplAdapter.class)
	public UnsignedInt getNumberOfSeries() {
		return numberOfSeries;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetNumberOfSeries(UnsignedInt newNumberOfSeries, NotificationChain msgs) {
		UnsignedInt oldNumberOfSeries = numberOfSeries;
		numberOfSeries = newNumberOfSeries;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FhirPackage.IMAGING_STUDY__NUMBER_OF_SERIES, oldNumberOfSeries, newNumberOfSeries);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setNumberOfSeries(UnsignedInt newNumberOfSeries) {
		if (newNumberOfSeries != numberOfSeries) {
			NotificationChain msgs = null;
			if (numberOfSeries != null)
				msgs = ((InternalEObject)numberOfSeries).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FhirPackage.IMAGING_STUDY__NUMBER_OF_SERIES, null, msgs);
			if (newNumberOfSeries != null)
				msgs = ((InternalEObject)newNumberOfSeries).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FhirPackage.IMAGING_STUDY__NUMBER_OF_SERIES, null, msgs);
			msgs = basicSetNumberOfSeries(newNumberOfSeries, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FhirPackage.IMAGING_STUDY__NUMBER_OF_SERIES, newNumberOfSeries, newNumberOfSeries));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@XmlJavaTypeAdapter(UnsignedIntImplAdapter.class)
	public UnsignedInt getNumberOfInstances() {
		return numberOfInstances;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetNumberOfInstances(UnsignedInt newNumberOfInstances, NotificationChain msgs) {
		UnsignedInt oldNumberOfInstances = numberOfInstances;
		numberOfInstances = newNumberOfInstances;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FhirPackage.IMAGING_STUDY__NUMBER_OF_INSTANCES, oldNumberOfInstances, newNumberOfInstances);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setNumberOfInstances(UnsignedInt newNumberOfInstances) {
		if (newNumberOfInstances != numberOfInstances) {
			NotificationChain msgs = null;
			if (numberOfInstances != null)
				msgs = ((InternalEObject)numberOfInstances).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FhirPackage.IMAGING_STUDY__NUMBER_OF_INSTANCES, null, msgs);
			if (newNumberOfInstances != null)
				msgs = ((InternalEObject)newNumberOfInstances).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FhirPackage.IMAGING_STUDY__NUMBER_OF_INSTANCES, null, msgs);
			msgs = basicSetNumberOfInstances(newNumberOfInstances, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FhirPackage.IMAGING_STUDY__NUMBER_OF_INSTANCES, newNumberOfInstances, newNumberOfInstances));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@XmlElement
	public List<Reference> getProcedureReference() {
		if (procedureReference == null) {
			procedureReference = new EObjectContainmentEList<Reference>(Reference.class, this, FhirPackage.IMAGING_STUDY__PROCEDURE_REFERENCE);
		}
		return procedureReference;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@XmlElement
	public List<CodeableConcept> getProcedureCode() {
		if (procedureCode == null) {
			procedureCode = new EObjectContainmentEList<CodeableConcept>(CodeableConcept.class, this, FhirPackage.IMAGING_STUDY__PROCEDURE_CODE);
		}
		return procedureCode;
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
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FhirPackage.IMAGING_STUDY__REASON, oldReason, newReason);
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
				msgs = ((InternalEObject)reason).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FhirPackage.IMAGING_STUDY__REASON, null, msgs);
			if (newReason != null)
				msgs = ((InternalEObject)newReason).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FhirPackage.IMAGING_STUDY__REASON, null, msgs);
			msgs = basicSetReason(newReason, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FhirPackage.IMAGING_STUDY__REASON, newReason, newReason));
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
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FhirPackage.IMAGING_STUDY__DESCRIPTION, oldDescription, newDescription);
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
				msgs = ((InternalEObject)description).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FhirPackage.IMAGING_STUDY__DESCRIPTION, null, msgs);
			if (newDescription != null)
				msgs = ((InternalEObject)newDescription).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FhirPackage.IMAGING_STUDY__DESCRIPTION, null, msgs);
			msgs = basicSetDescription(newDescription, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FhirPackage.IMAGING_STUDY__DESCRIPTION, newDescription, newDescription));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@XmlElement
	public List<ImagingStudySeries> getSeries() {
		if (series == null) {
			series = new EObjectContainmentEList<ImagingStudySeries>(ImagingStudySeries.class, this, FhirPackage.IMAGING_STUDY__SERIES);
		}
		return series;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case FhirPackage.IMAGING_STUDY__UID:
				return basicSetUid(null, msgs);
			case FhirPackage.IMAGING_STUDY__ACCESSION:
				return basicSetAccession(null, msgs);
			case FhirPackage.IMAGING_STUDY__IDENTIFIER:
				return ((InternalEList<?>)getIdentifier()).basicRemove(otherEnd, msgs);
			case FhirPackage.IMAGING_STUDY__AVAILABILITY:
				return basicSetAvailability(null, msgs);
			case FhirPackage.IMAGING_STUDY__MODALITY_LIST:
				return ((InternalEList<?>)getModalityList()).basicRemove(otherEnd, msgs);
			case FhirPackage.IMAGING_STUDY__PATIENT:
				return basicSetPatient(null, msgs);
			case FhirPackage.IMAGING_STUDY__CONTEXT:
				return basicSetContext(null, msgs);
			case FhirPackage.IMAGING_STUDY__STARTED:
				return basicSetStarted(null, msgs);
			case FhirPackage.IMAGING_STUDY__BASED_ON:
				return ((InternalEList<?>)getBasedOn()).basicRemove(otherEnd, msgs);
			case FhirPackage.IMAGING_STUDY__REFERRER:
				return basicSetReferrer(null, msgs);
			case FhirPackage.IMAGING_STUDY__INTERPRETER:
				return ((InternalEList<?>)getInterpreter()).basicRemove(otherEnd, msgs);
			case FhirPackage.IMAGING_STUDY__ENDPOINT:
				return ((InternalEList<?>)getEndpoint()).basicRemove(otherEnd, msgs);
			case FhirPackage.IMAGING_STUDY__NUMBER_OF_SERIES:
				return basicSetNumberOfSeries(null, msgs);
			case FhirPackage.IMAGING_STUDY__NUMBER_OF_INSTANCES:
				return basicSetNumberOfInstances(null, msgs);
			case FhirPackage.IMAGING_STUDY__PROCEDURE_REFERENCE:
				return ((InternalEList<?>)getProcedureReference()).basicRemove(otherEnd, msgs);
			case FhirPackage.IMAGING_STUDY__PROCEDURE_CODE:
				return ((InternalEList<?>)getProcedureCode()).basicRemove(otherEnd, msgs);
			case FhirPackage.IMAGING_STUDY__REASON:
				return basicSetReason(null, msgs);
			case FhirPackage.IMAGING_STUDY__DESCRIPTION:
				return basicSetDescription(null, msgs);
			case FhirPackage.IMAGING_STUDY__SERIES:
				return ((InternalEList<?>)getSeries()).basicRemove(otherEnd, msgs);
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
			case FhirPackage.IMAGING_STUDY__UID:
				return getUid();
			case FhirPackage.IMAGING_STUDY__ACCESSION:
				return getAccession();
			case FhirPackage.IMAGING_STUDY__IDENTIFIER:
				return getIdentifier();
			case FhirPackage.IMAGING_STUDY__AVAILABILITY:
				return getAvailability();
			case FhirPackage.IMAGING_STUDY__MODALITY_LIST:
				return getModalityList();
			case FhirPackage.IMAGING_STUDY__PATIENT:
				return getPatient();
			case FhirPackage.IMAGING_STUDY__CONTEXT:
				return getContext();
			case FhirPackage.IMAGING_STUDY__STARTED:
				return getStarted();
			case FhirPackage.IMAGING_STUDY__BASED_ON:
				return getBasedOn();
			case FhirPackage.IMAGING_STUDY__REFERRER:
				return getReferrer();
			case FhirPackage.IMAGING_STUDY__INTERPRETER:
				return getInterpreter();
			case FhirPackage.IMAGING_STUDY__ENDPOINT:
				return getEndpoint();
			case FhirPackage.IMAGING_STUDY__NUMBER_OF_SERIES:
				return getNumberOfSeries();
			case FhirPackage.IMAGING_STUDY__NUMBER_OF_INSTANCES:
				return getNumberOfInstances();
			case FhirPackage.IMAGING_STUDY__PROCEDURE_REFERENCE:
				return getProcedureReference();
			case FhirPackage.IMAGING_STUDY__PROCEDURE_CODE:
				return getProcedureCode();
			case FhirPackage.IMAGING_STUDY__REASON:
				return getReason();
			case FhirPackage.IMAGING_STUDY__DESCRIPTION:
				return getDescription();
			case FhirPackage.IMAGING_STUDY__SERIES:
				return getSeries();
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
			case FhirPackage.IMAGING_STUDY__UID:
				setUid((Oid)newValue);
				return;
			case FhirPackage.IMAGING_STUDY__ACCESSION:
				setAccession((Identifier)newValue);
				return;
			case FhirPackage.IMAGING_STUDY__IDENTIFIER:
				getIdentifier().clear();
				getIdentifier().addAll((Collection<? extends Identifier>)newValue);
				return;
			case FhirPackage.IMAGING_STUDY__AVAILABILITY:
				setAvailability((InstanceAvailability)newValue);
				return;
			case FhirPackage.IMAGING_STUDY__MODALITY_LIST:
				getModalityList().clear();
				getModalityList().addAll((Collection<? extends Coding>)newValue);
				return;
			case FhirPackage.IMAGING_STUDY__PATIENT:
				setPatient((Reference)newValue);
				return;
			case FhirPackage.IMAGING_STUDY__CONTEXT:
				setContext((Reference)newValue);
				return;
			case FhirPackage.IMAGING_STUDY__STARTED:
				setStarted((DateTime)newValue);
				return;
			case FhirPackage.IMAGING_STUDY__BASED_ON:
				getBasedOn().clear();
				getBasedOn().addAll((Collection<? extends Reference>)newValue);
				return;
			case FhirPackage.IMAGING_STUDY__REFERRER:
				setReferrer((Reference)newValue);
				return;
			case FhirPackage.IMAGING_STUDY__INTERPRETER:
				getInterpreter().clear();
				getInterpreter().addAll((Collection<? extends Reference>)newValue);
				return;
			case FhirPackage.IMAGING_STUDY__ENDPOINT:
				getEndpoint().clear();
				getEndpoint().addAll((Collection<? extends Reference>)newValue);
				return;
			case FhirPackage.IMAGING_STUDY__NUMBER_OF_SERIES:
				setNumberOfSeries((UnsignedInt)newValue);
				return;
			case FhirPackage.IMAGING_STUDY__NUMBER_OF_INSTANCES:
				setNumberOfInstances((UnsignedInt)newValue);
				return;
			case FhirPackage.IMAGING_STUDY__PROCEDURE_REFERENCE:
				getProcedureReference().clear();
				getProcedureReference().addAll((Collection<? extends Reference>)newValue);
				return;
			case FhirPackage.IMAGING_STUDY__PROCEDURE_CODE:
				getProcedureCode().clear();
				getProcedureCode().addAll((Collection<? extends CodeableConcept>)newValue);
				return;
			case FhirPackage.IMAGING_STUDY__REASON:
				setReason((CodeableConcept)newValue);
				return;
			case FhirPackage.IMAGING_STUDY__DESCRIPTION:
				setDescription((org.hl7.fhir.String)newValue);
				return;
			case FhirPackage.IMAGING_STUDY__SERIES:
				getSeries().clear();
				getSeries().addAll((Collection<? extends ImagingStudySeries>)newValue);
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
			case FhirPackage.IMAGING_STUDY__UID:
				setUid((Oid)null);
				return;
			case FhirPackage.IMAGING_STUDY__ACCESSION:
				setAccession((Identifier)null);
				return;
			case FhirPackage.IMAGING_STUDY__IDENTIFIER:
				getIdentifier().clear();
				return;
			case FhirPackage.IMAGING_STUDY__AVAILABILITY:
				setAvailability((InstanceAvailability)null);
				return;
			case FhirPackage.IMAGING_STUDY__MODALITY_LIST:
				getModalityList().clear();
				return;
			case FhirPackage.IMAGING_STUDY__PATIENT:
				setPatient((Reference)null);
				return;
			case FhirPackage.IMAGING_STUDY__CONTEXT:
				setContext((Reference)null);
				return;
			case FhirPackage.IMAGING_STUDY__STARTED:
				setStarted((DateTime)null);
				return;
			case FhirPackage.IMAGING_STUDY__BASED_ON:
				getBasedOn().clear();
				return;
			case FhirPackage.IMAGING_STUDY__REFERRER:
				setReferrer((Reference)null);
				return;
			case FhirPackage.IMAGING_STUDY__INTERPRETER:
				getInterpreter().clear();
				return;
			case FhirPackage.IMAGING_STUDY__ENDPOINT:
				getEndpoint().clear();
				return;
			case FhirPackage.IMAGING_STUDY__NUMBER_OF_SERIES:
				setNumberOfSeries((UnsignedInt)null);
				return;
			case FhirPackage.IMAGING_STUDY__NUMBER_OF_INSTANCES:
				setNumberOfInstances((UnsignedInt)null);
				return;
			case FhirPackage.IMAGING_STUDY__PROCEDURE_REFERENCE:
				getProcedureReference().clear();
				return;
			case FhirPackage.IMAGING_STUDY__PROCEDURE_CODE:
				getProcedureCode().clear();
				return;
			case FhirPackage.IMAGING_STUDY__REASON:
				setReason((CodeableConcept)null);
				return;
			case FhirPackage.IMAGING_STUDY__DESCRIPTION:
				setDescription((org.hl7.fhir.String)null);
				return;
			case FhirPackage.IMAGING_STUDY__SERIES:
				getSeries().clear();
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
			case FhirPackage.IMAGING_STUDY__UID:
				return uid != null;
			case FhirPackage.IMAGING_STUDY__ACCESSION:
				return accession != null;
			case FhirPackage.IMAGING_STUDY__IDENTIFIER:
				return identifier != null && !identifier.isEmpty();
			case FhirPackage.IMAGING_STUDY__AVAILABILITY:
				return availability != null;
			case FhirPackage.IMAGING_STUDY__MODALITY_LIST:
				return modalityList != null && !modalityList.isEmpty();
			case FhirPackage.IMAGING_STUDY__PATIENT:
				return patient != null;
			case FhirPackage.IMAGING_STUDY__CONTEXT:
				return context != null;
			case FhirPackage.IMAGING_STUDY__STARTED:
				return started != null;
			case FhirPackage.IMAGING_STUDY__BASED_ON:
				return basedOn != null && !basedOn.isEmpty();
			case FhirPackage.IMAGING_STUDY__REFERRER:
				return referrer != null;
			case FhirPackage.IMAGING_STUDY__INTERPRETER:
				return interpreter != null && !interpreter.isEmpty();
			case FhirPackage.IMAGING_STUDY__ENDPOINT:
				return endpoint != null && !endpoint.isEmpty();
			case FhirPackage.IMAGING_STUDY__NUMBER_OF_SERIES:
				return numberOfSeries != null;
			case FhirPackage.IMAGING_STUDY__NUMBER_OF_INSTANCES:
				return numberOfInstances != null;
			case FhirPackage.IMAGING_STUDY__PROCEDURE_REFERENCE:
				return procedureReference != null && !procedureReference.isEmpty();
			case FhirPackage.IMAGING_STUDY__PROCEDURE_CODE:
				return procedureCode != null && !procedureCode.isEmpty();
			case FhirPackage.IMAGING_STUDY__REASON:
				return reason != null;
			case FhirPackage.IMAGING_STUDY__DESCRIPTION:
				return description != null;
			case FhirPackage.IMAGING_STUDY__SERIES:
				return series != null && !series.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //ImagingStudyImpl
