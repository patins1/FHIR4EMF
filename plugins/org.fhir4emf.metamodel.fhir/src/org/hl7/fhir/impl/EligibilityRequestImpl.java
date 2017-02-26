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

import org.hl7.fhir.Code;
import org.hl7.fhir.CodeableConcept;
import org.hl7.fhir.Date;
import org.hl7.fhir.DateTime;
import org.hl7.fhir.EligibilityRequest;
import org.hl7.fhir.FhirPackage;
import org.hl7.fhir.Identifier;
import org.hl7.fhir.Period;
import org.hl7.fhir.Reference;
import org.hl7.fhir.jaxb.CodeImplAdapter;
import org.hl7.fhir.jaxb.DateImplAdapter;
import org.hl7.fhir.jaxb.DateTimeImplAdapter;
import org.hl7.fhir.jaxb.StringImplAdapter;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Eligibility Request</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.hl7.fhir.impl.EligibilityRequestImpl#getIdentifier <em>Identifier</em>}</li>
 *   <li>{@link org.hl7.fhir.impl.EligibilityRequestImpl#getStatus <em>Status</em>}</li>
 *   <li>{@link org.hl7.fhir.impl.EligibilityRequestImpl#getPriority <em>Priority</em>}</li>
 *   <li>{@link org.hl7.fhir.impl.EligibilityRequestImpl#getPatient <em>Patient</em>}</li>
 *   <li>{@link org.hl7.fhir.impl.EligibilityRequestImpl#getServicedDate <em>Serviced Date</em>}</li>
 *   <li>{@link org.hl7.fhir.impl.EligibilityRequestImpl#getServicedPeriod <em>Serviced Period</em>}</li>
 *   <li>{@link org.hl7.fhir.impl.EligibilityRequestImpl#getCreated <em>Created</em>}</li>
 *   <li>{@link org.hl7.fhir.impl.EligibilityRequestImpl#getEnterer <em>Enterer</em>}</li>
 *   <li>{@link org.hl7.fhir.impl.EligibilityRequestImpl#getProvider <em>Provider</em>}</li>
 *   <li>{@link org.hl7.fhir.impl.EligibilityRequestImpl#getOrganization <em>Organization</em>}</li>
 *   <li>{@link org.hl7.fhir.impl.EligibilityRequestImpl#getInsurer <em>Insurer</em>}</li>
 *   <li>{@link org.hl7.fhir.impl.EligibilityRequestImpl#getFacility <em>Facility</em>}</li>
 *   <li>{@link org.hl7.fhir.impl.EligibilityRequestImpl#getCoverage <em>Coverage</em>}</li>
 *   <li>{@link org.hl7.fhir.impl.EligibilityRequestImpl#getBusinessArrangement <em>Business Arrangement</em>}</li>
 *   <li>{@link org.hl7.fhir.impl.EligibilityRequestImpl#getBenefitCategory <em>Benefit Category</em>}</li>
 *   <li>{@link org.hl7.fhir.impl.EligibilityRequestImpl#getBenefitSubCategory <em>Benefit Sub Category</em>}</li>
 * </ul>
 *
 * @generated
 */
@XmlType(name = "EligibilityRequest", namespace = "http://hl7.org/fhir")
@XmlRootElement(name = "fhir.EligibilityRequest")
public class EligibilityRequestImpl extends DomainResourceImpl implements EligibilityRequest {
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
	 * The cached value of the '{@link #getPriority() <em>Priority</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPriority()
	 * @generated
	 * @ordered
	 */
	protected CodeableConcept priority;

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
	 * The cached value of the '{@link #getServicedDate() <em>Serviced Date</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getServicedDate()
	 * @generated
	 * @ordered
	 */
	protected Date servicedDate;

	/**
	 * The cached value of the '{@link #getServicedPeriod() <em>Serviced Period</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getServicedPeriod()
	 * @generated
	 * @ordered
	 */
	protected Period servicedPeriod;

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
	 * The cached value of the '{@link #getEnterer() <em>Enterer</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getEnterer()
	 * @generated
	 * @ordered
	 */
	protected Reference enterer;

	/**
	 * The cached value of the '{@link #getProvider() <em>Provider</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getProvider()
	 * @generated
	 * @ordered
	 */
	protected Reference provider;

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
	 * The cached value of the '{@link #getInsurer() <em>Insurer</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getInsurer()
	 * @generated
	 * @ordered
	 */
	protected Reference insurer;

	/**
	 * The cached value of the '{@link #getFacility() <em>Facility</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFacility()
	 * @generated
	 * @ordered
	 */
	protected Reference facility;

	/**
	 * The cached value of the '{@link #getCoverage() <em>Coverage</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCoverage()
	 * @generated
	 * @ordered
	 */
	protected Reference coverage;

	/**
	 * The cached value of the '{@link #getBusinessArrangement() <em>Business Arrangement</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getBusinessArrangement()
	 * @generated
	 * @ordered
	 */
	protected org.hl7.fhir.String businessArrangement;

	/**
	 * The cached value of the '{@link #getBenefitCategory() <em>Benefit Category</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getBenefitCategory()
	 * @generated
	 * @ordered
	 */
	protected CodeableConcept benefitCategory;

	/**
	 * The cached value of the '{@link #getBenefitSubCategory() <em>Benefit Sub Category</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getBenefitSubCategory()
	 * @generated
	 * @ordered
	 */
	protected CodeableConcept benefitSubCategory;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected EligibilityRequestImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return FhirPackage.eINSTANCE.getEligibilityRequest();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@XmlElement
	public List<Identifier> getIdentifier() {
		if (identifier == null) {
			identifier = new EObjectContainmentEList<Identifier>(Identifier.class, this, FhirPackage.ELIGIBILITY_REQUEST__IDENTIFIER);
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
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FhirPackage.ELIGIBILITY_REQUEST__STATUS, oldStatus, newStatus);
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
				msgs = ((InternalEObject)status).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FhirPackage.ELIGIBILITY_REQUEST__STATUS, null, msgs);
			if (newStatus != null)
				msgs = ((InternalEObject)newStatus).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FhirPackage.ELIGIBILITY_REQUEST__STATUS, null, msgs);
			msgs = basicSetStatus(newStatus, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FhirPackage.ELIGIBILITY_REQUEST__STATUS, newStatus, newStatus));
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
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FhirPackage.ELIGIBILITY_REQUEST__PRIORITY, oldPriority, newPriority);
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
				msgs = ((InternalEObject)priority).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FhirPackage.ELIGIBILITY_REQUEST__PRIORITY, null, msgs);
			if (newPriority != null)
				msgs = ((InternalEObject)newPriority).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FhirPackage.ELIGIBILITY_REQUEST__PRIORITY, null, msgs);
			msgs = basicSetPriority(newPriority, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FhirPackage.ELIGIBILITY_REQUEST__PRIORITY, newPriority, newPriority));
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
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FhirPackage.ELIGIBILITY_REQUEST__PATIENT, oldPatient, newPatient);
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
				msgs = ((InternalEObject)patient).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FhirPackage.ELIGIBILITY_REQUEST__PATIENT, null, msgs);
			if (newPatient != null)
				msgs = ((InternalEObject)newPatient).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FhirPackage.ELIGIBILITY_REQUEST__PATIENT, null, msgs);
			msgs = basicSetPatient(newPatient, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FhirPackage.ELIGIBILITY_REQUEST__PATIENT, newPatient, newPatient));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@XmlJavaTypeAdapter(DateImplAdapter.class)
	public Date getServicedDate() {
		return servicedDate;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetServicedDate(Date newServicedDate, NotificationChain msgs) {
		Date oldServicedDate = servicedDate;
		servicedDate = newServicedDate;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FhirPackage.ELIGIBILITY_REQUEST__SERVICED_DATE, oldServicedDate, newServicedDate);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setServicedDate(Date newServicedDate) {
		if (newServicedDate != servicedDate) {
			NotificationChain msgs = null;
			if (servicedDate != null)
				msgs = ((InternalEObject)servicedDate).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FhirPackage.ELIGIBILITY_REQUEST__SERVICED_DATE, null, msgs);
			if (newServicedDate != null)
				msgs = ((InternalEObject)newServicedDate).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FhirPackage.ELIGIBILITY_REQUEST__SERVICED_DATE, null, msgs);
			msgs = basicSetServicedDate(newServicedDate, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FhirPackage.ELIGIBILITY_REQUEST__SERVICED_DATE, newServicedDate, newServicedDate));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Period getServicedPeriod() {
		return servicedPeriod;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetServicedPeriod(Period newServicedPeriod, NotificationChain msgs) {
		Period oldServicedPeriod = servicedPeriod;
		servicedPeriod = newServicedPeriod;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FhirPackage.ELIGIBILITY_REQUEST__SERVICED_PERIOD, oldServicedPeriod, newServicedPeriod);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setServicedPeriod(Period newServicedPeriod) {
		if (newServicedPeriod != servicedPeriod) {
			NotificationChain msgs = null;
			if (servicedPeriod != null)
				msgs = ((InternalEObject)servicedPeriod).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FhirPackage.ELIGIBILITY_REQUEST__SERVICED_PERIOD, null, msgs);
			if (newServicedPeriod != null)
				msgs = ((InternalEObject)newServicedPeriod).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FhirPackage.ELIGIBILITY_REQUEST__SERVICED_PERIOD, null, msgs);
			msgs = basicSetServicedPeriod(newServicedPeriod, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FhirPackage.ELIGIBILITY_REQUEST__SERVICED_PERIOD, newServicedPeriod, newServicedPeriod));
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
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FhirPackage.ELIGIBILITY_REQUEST__CREATED, oldCreated, newCreated);
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
				msgs = ((InternalEObject)created).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FhirPackage.ELIGIBILITY_REQUEST__CREATED, null, msgs);
			if (newCreated != null)
				msgs = ((InternalEObject)newCreated).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FhirPackage.ELIGIBILITY_REQUEST__CREATED, null, msgs);
			msgs = basicSetCreated(newCreated, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FhirPackage.ELIGIBILITY_REQUEST__CREATED, newCreated, newCreated));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Reference getEnterer() {
		return enterer;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetEnterer(Reference newEnterer, NotificationChain msgs) {
		Reference oldEnterer = enterer;
		enterer = newEnterer;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FhirPackage.ELIGIBILITY_REQUEST__ENTERER, oldEnterer, newEnterer);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setEnterer(Reference newEnterer) {
		if (newEnterer != enterer) {
			NotificationChain msgs = null;
			if (enterer != null)
				msgs = ((InternalEObject)enterer).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FhirPackage.ELIGIBILITY_REQUEST__ENTERER, null, msgs);
			if (newEnterer != null)
				msgs = ((InternalEObject)newEnterer).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FhirPackage.ELIGIBILITY_REQUEST__ENTERER, null, msgs);
			msgs = basicSetEnterer(newEnterer, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FhirPackage.ELIGIBILITY_REQUEST__ENTERER, newEnterer, newEnterer));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Reference getProvider() {
		return provider;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetProvider(Reference newProvider, NotificationChain msgs) {
		Reference oldProvider = provider;
		provider = newProvider;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FhirPackage.ELIGIBILITY_REQUEST__PROVIDER, oldProvider, newProvider);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setProvider(Reference newProvider) {
		if (newProvider != provider) {
			NotificationChain msgs = null;
			if (provider != null)
				msgs = ((InternalEObject)provider).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FhirPackage.ELIGIBILITY_REQUEST__PROVIDER, null, msgs);
			if (newProvider != null)
				msgs = ((InternalEObject)newProvider).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FhirPackage.ELIGIBILITY_REQUEST__PROVIDER, null, msgs);
			msgs = basicSetProvider(newProvider, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FhirPackage.ELIGIBILITY_REQUEST__PROVIDER, newProvider, newProvider));
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
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FhirPackage.ELIGIBILITY_REQUEST__ORGANIZATION, oldOrganization, newOrganization);
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
				msgs = ((InternalEObject)organization).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FhirPackage.ELIGIBILITY_REQUEST__ORGANIZATION, null, msgs);
			if (newOrganization != null)
				msgs = ((InternalEObject)newOrganization).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FhirPackage.ELIGIBILITY_REQUEST__ORGANIZATION, null, msgs);
			msgs = basicSetOrganization(newOrganization, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FhirPackage.ELIGIBILITY_REQUEST__ORGANIZATION, newOrganization, newOrganization));
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
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FhirPackage.ELIGIBILITY_REQUEST__INSURER, oldInsurer, newInsurer);
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
				msgs = ((InternalEObject)insurer).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FhirPackage.ELIGIBILITY_REQUEST__INSURER, null, msgs);
			if (newInsurer != null)
				msgs = ((InternalEObject)newInsurer).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FhirPackage.ELIGIBILITY_REQUEST__INSURER, null, msgs);
			msgs = basicSetInsurer(newInsurer, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FhirPackage.ELIGIBILITY_REQUEST__INSURER, newInsurer, newInsurer));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Reference getFacility() {
		return facility;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetFacility(Reference newFacility, NotificationChain msgs) {
		Reference oldFacility = facility;
		facility = newFacility;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FhirPackage.ELIGIBILITY_REQUEST__FACILITY, oldFacility, newFacility);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setFacility(Reference newFacility) {
		if (newFacility != facility) {
			NotificationChain msgs = null;
			if (facility != null)
				msgs = ((InternalEObject)facility).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FhirPackage.ELIGIBILITY_REQUEST__FACILITY, null, msgs);
			if (newFacility != null)
				msgs = ((InternalEObject)newFacility).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FhirPackage.ELIGIBILITY_REQUEST__FACILITY, null, msgs);
			msgs = basicSetFacility(newFacility, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FhirPackage.ELIGIBILITY_REQUEST__FACILITY, newFacility, newFacility));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Reference getCoverage() {
		return coverage;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetCoverage(Reference newCoverage, NotificationChain msgs) {
		Reference oldCoverage = coverage;
		coverage = newCoverage;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FhirPackage.ELIGIBILITY_REQUEST__COVERAGE, oldCoverage, newCoverage);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setCoverage(Reference newCoverage) {
		if (newCoverage != coverage) {
			NotificationChain msgs = null;
			if (coverage != null)
				msgs = ((InternalEObject)coverage).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FhirPackage.ELIGIBILITY_REQUEST__COVERAGE, null, msgs);
			if (newCoverage != null)
				msgs = ((InternalEObject)newCoverage).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FhirPackage.ELIGIBILITY_REQUEST__COVERAGE, null, msgs);
			msgs = basicSetCoverage(newCoverage, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FhirPackage.ELIGIBILITY_REQUEST__COVERAGE, newCoverage, newCoverage));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@XmlJavaTypeAdapter(StringImplAdapter.class)
	public org.hl7.fhir.String getBusinessArrangement() {
		return businessArrangement;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetBusinessArrangement(org.hl7.fhir.String newBusinessArrangement, NotificationChain msgs) {
		org.hl7.fhir.String oldBusinessArrangement = businessArrangement;
		businessArrangement = newBusinessArrangement;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FhirPackage.ELIGIBILITY_REQUEST__BUSINESS_ARRANGEMENT, oldBusinessArrangement, newBusinessArrangement);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setBusinessArrangement(org.hl7.fhir.String newBusinessArrangement) {
		if (newBusinessArrangement != businessArrangement) {
			NotificationChain msgs = null;
			if (businessArrangement != null)
				msgs = ((InternalEObject)businessArrangement).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FhirPackage.ELIGIBILITY_REQUEST__BUSINESS_ARRANGEMENT, null, msgs);
			if (newBusinessArrangement != null)
				msgs = ((InternalEObject)newBusinessArrangement).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FhirPackage.ELIGIBILITY_REQUEST__BUSINESS_ARRANGEMENT, null, msgs);
			msgs = basicSetBusinessArrangement(newBusinessArrangement, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FhirPackage.ELIGIBILITY_REQUEST__BUSINESS_ARRANGEMENT, newBusinessArrangement, newBusinessArrangement));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CodeableConcept getBenefitCategory() {
		return benefitCategory;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetBenefitCategory(CodeableConcept newBenefitCategory, NotificationChain msgs) {
		CodeableConcept oldBenefitCategory = benefitCategory;
		benefitCategory = newBenefitCategory;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FhirPackage.ELIGIBILITY_REQUEST__BENEFIT_CATEGORY, oldBenefitCategory, newBenefitCategory);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setBenefitCategory(CodeableConcept newBenefitCategory) {
		if (newBenefitCategory != benefitCategory) {
			NotificationChain msgs = null;
			if (benefitCategory != null)
				msgs = ((InternalEObject)benefitCategory).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FhirPackage.ELIGIBILITY_REQUEST__BENEFIT_CATEGORY, null, msgs);
			if (newBenefitCategory != null)
				msgs = ((InternalEObject)newBenefitCategory).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FhirPackage.ELIGIBILITY_REQUEST__BENEFIT_CATEGORY, null, msgs);
			msgs = basicSetBenefitCategory(newBenefitCategory, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FhirPackage.ELIGIBILITY_REQUEST__BENEFIT_CATEGORY, newBenefitCategory, newBenefitCategory));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CodeableConcept getBenefitSubCategory() {
		return benefitSubCategory;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetBenefitSubCategory(CodeableConcept newBenefitSubCategory, NotificationChain msgs) {
		CodeableConcept oldBenefitSubCategory = benefitSubCategory;
		benefitSubCategory = newBenefitSubCategory;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FhirPackage.ELIGIBILITY_REQUEST__BENEFIT_SUB_CATEGORY, oldBenefitSubCategory, newBenefitSubCategory);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setBenefitSubCategory(CodeableConcept newBenefitSubCategory) {
		if (newBenefitSubCategory != benefitSubCategory) {
			NotificationChain msgs = null;
			if (benefitSubCategory != null)
				msgs = ((InternalEObject)benefitSubCategory).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FhirPackage.ELIGIBILITY_REQUEST__BENEFIT_SUB_CATEGORY, null, msgs);
			if (newBenefitSubCategory != null)
				msgs = ((InternalEObject)newBenefitSubCategory).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FhirPackage.ELIGIBILITY_REQUEST__BENEFIT_SUB_CATEGORY, null, msgs);
			msgs = basicSetBenefitSubCategory(newBenefitSubCategory, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FhirPackage.ELIGIBILITY_REQUEST__BENEFIT_SUB_CATEGORY, newBenefitSubCategory, newBenefitSubCategory));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case FhirPackage.ELIGIBILITY_REQUEST__IDENTIFIER:
				return ((InternalEList<?>)getIdentifier()).basicRemove(otherEnd, msgs);
			case FhirPackage.ELIGIBILITY_REQUEST__STATUS:
				return basicSetStatus(null, msgs);
			case FhirPackage.ELIGIBILITY_REQUEST__PRIORITY:
				return basicSetPriority(null, msgs);
			case FhirPackage.ELIGIBILITY_REQUEST__PATIENT:
				return basicSetPatient(null, msgs);
			case FhirPackage.ELIGIBILITY_REQUEST__SERVICED_DATE:
				return basicSetServicedDate(null, msgs);
			case FhirPackage.ELIGIBILITY_REQUEST__SERVICED_PERIOD:
				return basicSetServicedPeriod(null, msgs);
			case FhirPackage.ELIGIBILITY_REQUEST__CREATED:
				return basicSetCreated(null, msgs);
			case FhirPackage.ELIGIBILITY_REQUEST__ENTERER:
				return basicSetEnterer(null, msgs);
			case FhirPackage.ELIGIBILITY_REQUEST__PROVIDER:
				return basicSetProvider(null, msgs);
			case FhirPackage.ELIGIBILITY_REQUEST__ORGANIZATION:
				return basicSetOrganization(null, msgs);
			case FhirPackage.ELIGIBILITY_REQUEST__INSURER:
				return basicSetInsurer(null, msgs);
			case FhirPackage.ELIGIBILITY_REQUEST__FACILITY:
				return basicSetFacility(null, msgs);
			case FhirPackage.ELIGIBILITY_REQUEST__COVERAGE:
				return basicSetCoverage(null, msgs);
			case FhirPackage.ELIGIBILITY_REQUEST__BUSINESS_ARRANGEMENT:
				return basicSetBusinessArrangement(null, msgs);
			case FhirPackage.ELIGIBILITY_REQUEST__BENEFIT_CATEGORY:
				return basicSetBenefitCategory(null, msgs);
			case FhirPackage.ELIGIBILITY_REQUEST__BENEFIT_SUB_CATEGORY:
				return basicSetBenefitSubCategory(null, msgs);
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
			case FhirPackage.ELIGIBILITY_REQUEST__IDENTIFIER:
				return getIdentifier();
			case FhirPackage.ELIGIBILITY_REQUEST__STATUS:
				return getStatus();
			case FhirPackage.ELIGIBILITY_REQUEST__PRIORITY:
				return getPriority();
			case FhirPackage.ELIGIBILITY_REQUEST__PATIENT:
				return getPatient();
			case FhirPackage.ELIGIBILITY_REQUEST__SERVICED_DATE:
				return getServicedDate();
			case FhirPackage.ELIGIBILITY_REQUEST__SERVICED_PERIOD:
				return getServicedPeriod();
			case FhirPackage.ELIGIBILITY_REQUEST__CREATED:
				return getCreated();
			case FhirPackage.ELIGIBILITY_REQUEST__ENTERER:
				return getEnterer();
			case FhirPackage.ELIGIBILITY_REQUEST__PROVIDER:
				return getProvider();
			case FhirPackage.ELIGIBILITY_REQUEST__ORGANIZATION:
				return getOrganization();
			case FhirPackage.ELIGIBILITY_REQUEST__INSURER:
				return getInsurer();
			case FhirPackage.ELIGIBILITY_REQUEST__FACILITY:
				return getFacility();
			case FhirPackage.ELIGIBILITY_REQUEST__COVERAGE:
				return getCoverage();
			case FhirPackage.ELIGIBILITY_REQUEST__BUSINESS_ARRANGEMENT:
				return getBusinessArrangement();
			case FhirPackage.ELIGIBILITY_REQUEST__BENEFIT_CATEGORY:
				return getBenefitCategory();
			case FhirPackage.ELIGIBILITY_REQUEST__BENEFIT_SUB_CATEGORY:
				return getBenefitSubCategory();
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
			case FhirPackage.ELIGIBILITY_REQUEST__IDENTIFIER:
				getIdentifier().clear();
				getIdentifier().addAll((Collection<? extends Identifier>)newValue);
				return;
			case FhirPackage.ELIGIBILITY_REQUEST__STATUS:
				setStatus((Code)newValue);
				return;
			case FhirPackage.ELIGIBILITY_REQUEST__PRIORITY:
				setPriority((CodeableConcept)newValue);
				return;
			case FhirPackage.ELIGIBILITY_REQUEST__PATIENT:
				setPatient((Reference)newValue);
				return;
			case FhirPackage.ELIGIBILITY_REQUEST__SERVICED_DATE:
				setServicedDate((Date)newValue);
				return;
			case FhirPackage.ELIGIBILITY_REQUEST__SERVICED_PERIOD:
				setServicedPeriod((Period)newValue);
				return;
			case FhirPackage.ELIGIBILITY_REQUEST__CREATED:
				setCreated((DateTime)newValue);
				return;
			case FhirPackage.ELIGIBILITY_REQUEST__ENTERER:
				setEnterer((Reference)newValue);
				return;
			case FhirPackage.ELIGIBILITY_REQUEST__PROVIDER:
				setProvider((Reference)newValue);
				return;
			case FhirPackage.ELIGIBILITY_REQUEST__ORGANIZATION:
				setOrganization((Reference)newValue);
				return;
			case FhirPackage.ELIGIBILITY_REQUEST__INSURER:
				setInsurer((Reference)newValue);
				return;
			case FhirPackage.ELIGIBILITY_REQUEST__FACILITY:
				setFacility((Reference)newValue);
				return;
			case FhirPackage.ELIGIBILITY_REQUEST__COVERAGE:
				setCoverage((Reference)newValue);
				return;
			case FhirPackage.ELIGIBILITY_REQUEST__BUSINESS_ARRANGEMENT:
				setBusinessArrangement((org.hl7.fhir.String)newValue);
				return;
			case FhirPackage.ELIGIBILITY_REQUEST__BENEFIT_CATEGORY:
				setBenefitCategory((CodeableConcept)newValue);
				return;
			case FhirPackage.ELIGIBILITY_REQUEST__BENEFIT_SUB_CATEGORY:
				setBenefitSubCategory((CodeableConcept)newValue);
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
			case FhirPackage.ELIGIBILITY_REQUEST__IDENTIFIER:
				getIdentifier().clear();
				return;
			case FhirPackage.ELIGIBILITY_REQUEST__STATUS:
				setStatus((Code)null);
				return;
			case FhirPackage.ELIGIBILITY_REQUEST__PRIORITY:
				setPriority((CodeableConcept)null);
				return;
			case FhirPackage.ELIGIBILITY_REQUEST__PATIENT:
				setPatient((Reference)null);
				return;
			case FhirPackage.ELIGIBILITY_REQUEST__SERVICED_DATE:
				setServicedDate((Date)null);
				return;
			case FhirPackage.ELIGIBILITY_REQUEST__SERVICED_PERIOD:
				setServicedPeriod((Period)null);
				return;
			case FhirPackage.ELIGIBILITY_REQUEST__CREATED:
				setCreated((DateTime)null);
				return;
			case FhirPackage.ELIGIBILITY_REQUEST__ENTERER:
				setEnterer((Reference)null);
				return;
			case FhirPackage.ELIGIBILITY_REQUEST__PROVIDER:
				setProvider((Reference)null);
				return;
			case FhirPackage.ELIGIBILITY_REQUEST__ORGANIZATION:
				setOrganization((Reference)null);
				return;
			case FhirPackage.ELIGIBILITY_REQUEST__INSURER:
				setInsurer((Reference)null);
				return;
			case FhirPackage.ELIGIBILITY_REQUEST__FACILITY:
				setFacility((Reference)null);
				return;
			case FhirPackage.ELIGIBILITY_REQUEST__COVERAGE:
				setCoverage((Reference)null);
				return;
			case FhirPackage.ELIGIBILITY_REQUEST__BUSINESS_ARRANGEMENT:
				setBusinessArrangement((org.hl7.fhir.String)null);
				return;
			case FhirPackage.ELIGIBILITY_REQUEST__BENEFIT_CATEGORY:
				setBenefitCategory((CodeableConcept)null);
				return;
			case FhirPackage.ELIGIBILITY_REQUEST__BENEFIT_SUB_CATEGORY:
				setBenefitSubCategory((CodeableConcept)null);
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
			case FhirPackage.ELIGIBILITY_REQUEST__IDENTIFIER:
				return identifier != null && !identifier.isEmpty();
			case FhirPackage.ELIGIBILITY_REQUEST__STATUS:
				return status != null;
			case FhirPackage.ELIGIBILITY_REQUEST__PRIORITY:
				return priority != null;
			case FhirPackage.ELIGIBILITY_REQUEST__PATIENT:
				return patient != null;
			case FhirPackage.ELIGIBILITY_REQUEST__SERVICED_DATE:
				return servicedDate != null;
			case FhirPackage.ELIGIBILITY_REQUEST__SERVICED_PERIOD:
				return servicedPeriod != null;
			case FhirPackage.ELIGIBILITY_REQUEST__CREATED:
				return created != null;
			case FhirPackage.ELIGIBILITY_REQUEST__ENTERER:
				return enterer != null;
			case FhirPackage.ELIGIBILITY_REQUEST__PROVIDER:
				return provider != null;
			case FhirPackage.ELIGIBILITY_REQUEST__ORGANIZATION:
				return organization != null;
			case FhirPackage.ELIGIBILITY_REQUEST__INSURER:
				return insurer != null;
			case FhirPackage.ELIGIBILITY_REQUEST__FACILITY:
				return facility != null;
			case FhirPackage.ELIGIBILITY_REQUEST__COVERAGE:
				return coverage != null;
			case FhirPackage.ELIGIBILITY_REQUEST__BUSINESS_ARRANGEMENT:
				return businessArrangement != null;
			case FhirPackage.ELIGIBILITY_REQUEST__BENEFIT_CATEGORY:
				return benefitCategory != null;
			case FhirPackage.ELIGIBILITY_REQUEST__BENEFIT_SUB_CATEGORY:
				return benefitSubCategory != null;
		}
		return super.eIsSet(featureID);
	}

} //EligibilityRequestImpl
