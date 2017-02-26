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
import org.hl7.fhir.DateTime;
import org.hl7.fhir.ExplanationOfBenefit;
import org.hl7.fhir.ExplanationOfBenefitAccident;
import org.hl7.fhir.ExplanationOfBenefitAddItem;
import org.hl7.fhir.ExplanationOfBenefitBenefitBalance;
import org.hl7.fhir.ExplanationOfBenefitCareTeam;
import org.hl7.fhir.ExplanationOfBenefitDiagnosis;
import org.hl7.fhir.ExplanationOfBenefitInformation;
import org.hl7.fhir.ExplanationOfBenefitInsurance;
import org.hl7.fhir.ExplanationOfBenefitItem;
import org.hl7.fhir.ExplanationOfBenefitPayee;
import org.hl7.fhir.ExplanationOfBenefitPayment;
import org.hl7.fhir.ExplanationOfBenefitProcedure;
import org.hl7.fhir.ExplanationOfBenefitProcessNote;
import org.hl7.fhir.ExplanationOfBenefitRelated;
import org.hl7.fhir.ExplanationOfBenefitStatus;
import org.hl7.fhir.FhirPackage;
import org.hl7.fhir.Identifier;
import org.hl7.fhir.Money;
import org.hl7.fhir.Period;
import org.hl7.fhir.PositiveInt;
import org.hl7.fhir.Reference;
import org.hl7.fhir.jaxb.DateTimeImplAdapter;
import org.hl7.fhir.jaxb.ExplanationOfBenefitStatusImplAdapter;
import org.hl7.fhir.jaxb.PositiveIntImplAdapter;
import org.hl7.fhir.jaxb.StringImplAdapter;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Explanation Of Benefit</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.hl7.fhir.impl.ExplanationOfBenefitImpl#getIdentifier <em>Identifier</em>}</li>
 *   <li>{@link org.hl7.fhir.impl.ExplanationOfBenefitImpl#getStatus <em>Status</em>}</li>
 *   <li>{@link org.hl7.fhir.impl.ExplanationOfBenefitImpl#getType <em>Type</em>}</li>
 *   <li>{@link org.hl7.fhir.impl.ExplanationOfBenefitImpl#getSubType <em>Sub Type</em>}</li>
 *   <li>{@link org.hl7.fhir.impl.ExplanationOfBenefitImpl#getPatient <em>Patient</em>}</li>
 *   <li>{@link org.hl7.fhir.impl.ExplanationOfBenefitImpl#getBillablePeriod <em>Billable Period</em>}</li>
 *   <li>{@link org.hl7.fhir.impl.ExplanationOfBenefitImpl#getCreated <em>Created</em>}</li>
 *   <li>{@link org.hl7.fhir.impl.ExplanationOfBenefitImpl#getEnterer <em>Enterer</em>}</li>
 *   <li>{@link org.hl7.fhir.impl.ExplanationOfBenefitImpl#getInsurer <em>Insurer</em>}</li>
 *   <li>{@link org.hl7.fhir.impl.ExplanationOfBenefitImpl#getProvider <em>Provider</em>}</li>
 *   <li>{@link org.hl7.fhir.impl.ExplanationOfBenefitImpl#getOrganization <em>Organization</em>}</li>
 *   <li>{@link org.hl7.fhir.impl.ExplanationOfBenefitImpl#getReferral <em>Referral</em>}</li>
 *   <li>{@link org.hl7.fhir.impl.ExplanationOfBenefitImpl#getFacility <em>Facility</em>}</li>
 *   <li>{@link org.hl7.fhir.impl.ExplanationOfBenefitImpl#getClaim <em>Claim</em>}</li>
 *   <li>{@link org.hl7.fhir.impl.ExplanationOfBenefitImpl#getClaimResponse <em>Claim Response</em>}</li>
 *   <li>{@link org.hl7.fhir.impl.ExplanationOfBenefitImpl#getOutcome <em>Outcome</em>}</li>
 *   <li>{@link org.hl7.fhir.impl.ExplanationOfBenefitImpl#getDisposition <em>Disposition</em>}</li>
 *   <li>{@link org.hl7.fhir.impl.ExplanationOfBenefitImpl#getRelated <em>Related</em>}</li>
 *   <li>{@link org.hl7.fhir.impl.ExplanationOfBenefitImpl#getPrescription <em>Prescription</em>}</li>
 *   <li>{@link org.hl7.fhir.impl.ExplanationOfBenefitImpl#getOriginalPrescription <em>Original Prescription</em>}</li>
 *   <li>{@link org.hl7.fhir.impl.ExplanationOfBenefitImpl#getPayee <em>Payee</em>}</li>
 *   <li>{@link org.hl7.fhir.impl.ExplanationOfBenefitImpl#getInformation <em>Information</em>}</li>
 *   <li>{@link org.hl7.fhir.impl.ExplanationOfBenefitImpl#getCareTeam <em>Care Team</em>}</li>
 *   <li>{@link org.hl7.fhir.impl.ExplanationOfBenefitImpl#getDiagnosis <em>Diagnosis</em>}</li>
 *   <li>{@link org.hl7.fhir.impl.ExplanationOfBenefitImpl#getProcedure <em>Procedure</em>}</li>
 *   <li>{@link org.hl7.fhir.impl.ExplanationOfBenefitImpl#getPrecedence <em>Precedence</em>}</li>
 *   <li>{@link org.hl7.fhir.impl.ExplanationOfBenefitImpl#getInsurance <em>Insurance</em>}</li>
 *   <li>{@link org.hl7.fhir.impl.ExplanationOfBenefitImpl#getAccident <em>Accident</em>}</li>
 *   <li>{@link org.hl7.fhir.impl.ExplanationOfBenefitImpl#getEmploymentImpacted <em>Employment Impacted</em>}</li>
 *   <li>{@link org.hl7.fhir.impl.ExplanationOfBenefitImpl#getHospitalization <em>Hospitalization</em>}</li>
 *   <li>{@link org.hl7.fhir.impl.ExplanationOfBenefitImpl#getItem <em>Item</em>}</li>
 *   <li>{@link org.hl7.fhir.impl.ExplanationOfBenefitImpl#getAddItem <em>Add Item</em>}</li>
 *   <li>{@link org.hl7.fhir.impl.ExplanationOfBenefitImpl#getTotalCost <em>Total Cost</em>}</li>
 *   <li>{@link org.hl7.fhir.impl.ExplanationOfBenefitImpl#getUnallocDeductable <em>Unalloc Deductable</em>}</li>
 *   <li>{@link org.hl7.fhir.impl.ExplanationOfBenefitImpl#getTotalBenefit <em>Total Benefit</em>}</li>
 *   <li>{@link org.hl7.fhir.impl.ExplanationOfBenefitImpl#getPayment <em>Payment</em>}</li>
 *   <li>{@link org.hl7.fhir.impl.ExplanationOfBenefitImpl#getForm <em>Form</em>}</li>
 *   <li>{@link org.hl7.fhir.impl.ExplanationOfBenefitImpl#getProcessNote <em>Process Note</em>}</li>
 *   <li>{@link org.hl7.fhir.impl.ExplanationOfBenefitImpl#getBenefitBalance <em>Benefit Balance</em>}</li>
 * </ul>
 *
 * @generated
 */
@XmlType(name = "ExplanationOfBenefit", namespace = "http://hl7.org/fhir")
@XmlRootElement(name = "fhir.ExplanationOfBenefit")
public class ExplanationOfBenefitImpl extends DomainResourceImpl implements ExplanationOfBenefit {
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
	protected ExplanationOfBenefitStatus status;

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
	 * The cached value of the '{@link #getSubType() <em>Sub Type</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSubType()
	 * @generated
	 * @ordered
	 */
	protected EList<CodeableConcept> subType;

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
	 * The cached value of the '{@link #getBillablePeriod() <em>Billable Period</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getBillablePeriod()
	 * @generated
	 * @ordered
	 */
	protected Period billablePeriod;

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
	 * The cached value of the '{@link #getInsurer() <em>Insurer</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getInsurer()
	 * @generated
	 * @ordered
	 */
	protected Reference insurer;

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
	 * The cached value of the '{@link #getReferral() <em>Referral</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getReferral()
	 * @generated
	 * @ordered
	 */
	protected Reference referral;

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
	 * The cached value of the '{@link #getClaim() <em>Claim</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getClaim()
	 * @generated
	 * @ordered
	 */
	protected Reference claim;

	/**
	 * The cached value of the '{@link #getClaimResponse() <em>Claim Response</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getClaimResponse()
	 * @generated
	 * @ordered
	 */
	protected Reference claimResponse;

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
	 * The cached value of the '{@link #getDisposition() <em>Disposition</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDisposition()
	 * @generated
	 * @ordered
	 */
	protected org.hl7.fhir.String disposition;

	/**
	 * The cached value of the '{@link #getRelated() <em>Related</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRelated()
	 * @generated
	 * @ordered
	 */
	protected EList<ExplanationOfBenefitRelated> related;

	/**
	 * The cached value of the '{@link #getPrescription() <em>Prescription</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPrescription()
	 * @generated
	 * @ordered
	 */
	protected Reference prescription;

	/**
	 * The cached value of the '{@link #getOriginalPrescription() <em>Original Prescription</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOriginalPrescription()
	 * @generated
	 * @ordered
	 */
	protected Reference originalPrescription;

	/**
	 * The cached value of the '{@link #getPayee() <em>Payee</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPayee()
	 * @generated
	 * @ordered
	 */
	protected ExplanationOfBenefitPayee payee;

	/**
	 * The cached value of the '{@link #getInformation() <em>Information</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getInformation()
	 * @generated
	 * @ordered
	 */
	protected EList<ExplanationOfBenefitInformation> information;

	/**
	 * The cached value of the '{@link #getCareTeam() <em>Care Team</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCareTeam()
	 * @generated
	 * @ordered
	 */
	protected EList<ExplanationOfBenefitCareTeam> careTeam;

	/**
	 * The cached value of the '{@link #getDiagnosis() <em>Diagnosis</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDiagnosis()
	 * @generated
	 * @ordered
	 */
	protected EList<ExplanationOfBenefitDiagnosis> diagnosis;

	/**
	 * The cached value of the '{@link #getProcedure() <em>Procedure</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getProcedure()
	 * @generated
	 * @ordered
	 */
	protected EList<ExplanationOfBenefitProcedure> procedure;

	/**
	 * The cached value of the '{@link #getPrecedence() <em>Precedence</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPrecedence()
	 * @generated
	 * @ordered
	 */
	protected PositiveInt precedence;

	/**
	 * The cached value of the '{@link #getInsurance() <em>Insurance</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getInsurance()
	 * @generated
	 * @ordered
	 */
	protected ExplanationOfBenefitInsurance insurance;

	/**
	 * The cached value of the '{@link #getAccident() <em>Accident</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAccident()
	 * @generated
	 * @ordered
	 */
	protected ExplanationOfBenefitAccident accident;

	/**
	 * The cached value of the '{@link #getEmploymentImpacted() <em>Employment Impacted</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getEmploymentImpacted()
	 * @generated
	 * @ordered
	 */
	protected Period employmentImpacted;

	/**
	 * The cached value of the '{@link #getHospitalization() <em>Hospitalization</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getHospitalization()
	 * @generated
	 * @ordered
	 */
	protected Period hospitalization;

	/**
	 * The cached value of the '{@link #getItem() <em>Item</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getItem()
	 * @generated
	 * @ordered
	 */
	protected EList<ExplanationOfBenefitItem> item;

	/**
	 * The cached value of the '{@link #getAddItem() <em>Add Item</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAddItem()
	 * @generated
	 * @ordered
	 */
	protected EList<ExplanationOfBenefitAddItem> addItem;

	/**
	 * The cached value of the '{@link #getTotalCost() <em>Total Cost</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTotalCost()
	 * @generated
	 * @ordered
	 */
	protected Money totalCost;

	/**
	 * The cached value of the '{@link #getUnallocDeductable() <em>Unalloc Deductable</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getUnallocDeductable()
	 * @generated
	 * @ordered
	 */
	protected Money unallocDeductable;

	/**
	 * The cached value of the '{@link #getTotalBenefit() <em>Total Benefit</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTotalBenefit()
	 * @generated
	 * @ordered
	 */
	protected Money totalBenefit;

	/**
	 * The cached value of the '{@link #getPayment() <em>Payment</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPayment()
	 * @generated
	 * @ordered
	 */
	protected ExplanationOfBenefitPayment payment;

	/**
	 * The cached value of the '{@link #getForm() <em>Form</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getForm()
	 * @generated
	 * @ordered
	 */
	protected CodeableConcept form;

	/**
	 * The cached value of the '{@link #getProcessNote() <em>Process Note</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getProcessNote()
	 * @generated
	 * @ordered
	 */
	protected EList<ExplanationOfBenefitProcessNote> processNote;

	/**
	 * The cached value of the '{@link #getBenefitBalance() <em>Benefit Balance</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getBenefitBalance()
	 * @generated
	 * @ordered
	 */
	protected EList<ExplanationOfBenefitBenefitBalance> benefitBalance;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ExplanationOfBenefitImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return FhirPackage.eINSTANCE.getExplanationOfBenefit();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@XmlElement
	public List<Identifier> getIdentifier() {
		if (identifier == null) {
			identifier = new EObjectContainmentEList<Identifier>(Identifier.class, this, FhirPackage.EXPLANATION_OF_BENEFIT__IDENTIFIER);
		}
		return identifier;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@XmlJavaTypeAdapter(ExplanationOfBenefitStatusImplAdapter.class)
	public ExplanationOfBenefitStatus getStatus() {
		return status;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetStatus(ExplanationOfBenefitStatus newStatus, NotificationChain msgs) {
		ExplanationOfBenefitStatus oldStatus = status;
		status = newStatus;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FhirPackage.EXPLANATION_OF_BENEFIT__STATUS, oldStatus, newStatus);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setStatus(ExplanationOfBenefitStatus newStatus) {
		if (newStatus != status) {
			NotificationChain msgs = null;
			if (status != null)
				msgs = ((InternalEObject)status).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FhirPackage.EXPLANATION_OF_BENEFIT__STATUS, null, msgs);
			if (newStatus != null)
				msgs = ((InternalEObject)newStatus).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FhirPackage.EXPLANATION_OF_BENEFIT__STATUS, null, msgs);
			msgs = basicSetStatus(newStatus, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FhirPackage.EXPLANATION_OF_BENEFIT__STATUS, newStatus, newStatus));
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
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FhirPackage.EXPLANATION_OF_BENEFIT__TYPE, oldType, newType);
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
				msgs = ((InternalEObject)type).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FhirPackage.EXPLANATION_OF_BENEFIT__TYPE, null, msgs);
			if (newType != null)
				msgs = ((InternalEObject)newType).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FhirPackage.EXPLANATION_OF_BENEFIT__TYPE, null, msgs);
			msgs = basicSetType(newType, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FhirPackage.EXPLANATION_OF_BENEFIT__TYPE, newType, newType));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@XmlElement
	public List<CodeableConcept> getSubType() {
		if (subType == null) {
			subType = new EObjectContainmentEList<CodeableConcept>(CodeableConcept.class, this, FhirPackage.EXPLANATION_OF_BENEFIT__SUB_TYPE);
		}
		return subType;
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
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FhirPackage.EXPLANATION_OF_BENEFIT__PATIENT, oldPatient, newPatient);
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
				msgs = ((InternalEObject)patient).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FhirPackage.EXPLANATION_OF_BENEFIT__PATIENT, null, msgs);
			if (newPatient != null)
				msgs = ((InternalEObject)newPatient).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FhirPackage.EXPLANATION_OF_BENEFIT__PATIENT, null, msgs);
			msgs = basicSetPatient(newPatient, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FhirPackage.EXPLANATION_OF_BENEFIT__PATIENT, newPatient, newPatient));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Period getBillablePeriod() {
		return billablePeriod;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetBillablePeriod(Period newBillablePeriod, NotificationChain msgs) {
		Period oldBillablePeriod = billablePeriod;
		billablePeriod = newBillablePeriod;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FhirPackage.EXPLANATION_OF_BENEFIT__BILLABLE_PERIOD, oldBillablePeriod, newBillablePeriod);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setBillablePeriod(Period newBillablePeriod) {
		if (newBillablePeriod != billablePeriod) {
			NotificationChain msgs = null;
			if (billablePeriod != null)
				msgs = ((InternalEObject)billablePeriod).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FhirPackage.EXPLANATION_OF_BENEFIT__BILLABLE_PERIOD, null, msgs);
			if (newBillablePeriod != null)
				msgs = ((InternalEObject)newBillablePeriod).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FhirPackage.EXPLANATION_OF_BENEFIT__BILLABLE_PERIOD, null, msgs);
			msgs = basicSetBillablePeriod(newBillablePeriod, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FhirPackage.EXPLANATION_OF_BENEFIT__BILLABLE_PERIOD, newBillablePeriod, newBillablePeriod));
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
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FhirPackage.EXPLANATION_OF_BENEFIT__CREATED, oldCreated, newCreated);
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
				msgs = ((InternalEObject)created).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FhirPackage.EXPLANATION_OF_BENEFIT__CREATED, null, msgs);
			if (newCreated != null)
				msgs = ((InternalEObject)newCreated).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FhirPackage.EXPLANATION_OF_BENEFIT__CREATED, null, msgs);
			msgs = basicSetCreated(newCreated, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FhirPackage.EXPLANATION_OF_BENEFIT__CREATED, newCreated, newCreated));
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
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FhirPackage.EXPLANATION_OF_BENEFIT__ENTERER, oldEnterer, newEnterer);
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
				msgs = ((InternalEObject)enterer).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FhirPackage.EXPLANATION_OF_BENEFIT__ENTERER, null, msgs);
			if (newEnterer != null)
				msgs = ((InternalEObject)newEnterer).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FhirPackage.EXPLANATION_OF_BENEFIT__ENTERER, null, msgs);
			msgs = basicSetEnterer(newEnterer, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FhirPackage.EXPLANATION_OF_BENEFIT__ENTERER, newEnterer, newEnterer));
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
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FhirPackage.EXPLANATION_OF_BENEFIT__INSURER, oldInsurer, newInsurer);
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
				msgs = ((InternalEObject)insurer).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FhirPackage.EXPLANATION_OF_BENEFIT__INSURER, null, msgs);
			if (newInsurer != null)
				msgs = ((InternalEObject)newInsurer).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FhirPackage.EXPLANATION_OF_BENEFIT__INSURER, null, msgs);
			msgs = basicSetInsurer(newInsurer, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FhirPackage.EXPLANATION_OF_BENEFIT__INSURER, newInsurer, newInsurer));
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
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FhirPackage.EXPLANATION_OF_BENEFIT__PROVIDER, oldProvider, newProvider);
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
				msgs = ((InternalEObject)provider).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FhirPackage.EXPLANATION_OF_BENEFIT__PROVIDER, null, msgs);
			if (newProvider != null)
				msgs = ((InternalEObject)newProvider).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FhirPackage.EXPLANATION_OF_BENEFIT__PROVIDER, null, msgs);
			msgs = basicSetProvider(newProvider, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FhirPackage.EXPLANATION_OF_BENEFIT__PROVIDER, newProvider, newProvider));
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
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FhirPackage.EXPLANATION_OF_BENEFIT__ORGANIZATION, oldOrganization, newOrganization);
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
				msgs = ((InternalEObject)organization).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FhirPackage.EXPLANATION_OF_BENEFIT__ORGANIZATION, null, msgs);
			if (newOrganization != null)
				msgs = ((InternalEObject)newOrganization).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FhirPackage.EXPLANATION_OF_BENEFIT__ORGANIZATION, null, msgs);
			msgs = basicSetOrganization(newOrganization, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FhirPackage.EXPLANATION_OF_BENEFIT__ORGANIZATION, newOrganization, newOrganization));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Reference getReferral() {
		return referral;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetReferral(Reference newReferral, NotificationChain msgs) {
		Reference oldReferral = referral;
		referral = newReferral;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FhirPackage.EXPLANATION_OF_BENEFIT__REFERRAL, oldReferral, newReferral);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setReferral(Reference newReferral) {
		if (newReferral != referral) {
			NotificationChain msgs = null;
			if (referral != null)
				msgs = ((InternalEObject)referral).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FhirPackage.EXPLANATION_OF_BENEFIT__REFERRAL, null, msgs);
			if (newReferral != null)
				msgs = ((InternalEObject)newReferral).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FhirPackage.EXPLANATION_OF_BENEFIT__REFERRAL, null, msgs);
			msgs = basicSetReferral(newReferral, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FhirPackage.EXPLANATION_OF_BENEFIT__REFERRAL, newReferral, newReferral));
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
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FhirPackage.EXPLANATION_OF_BENEFIT__FACILITY, oldFacility, newFacility);
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
				msgs = ((InternalEObject)facility).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FhirPackage.EXPLANATION_OF_BENEFIT__FACILITY, null, msgs);
			if (newFacility != null)
				msgs = ((InternalEObject)newFacility).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FhirPackage.EXPLANATION_OF_BENEFIT__FACILITY, null, msgs);
			msgs = basicSetFacility(newFacility, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FhirPackage.EXPLANATION_OF_BENEFIT__FACILITY, newFacility, newFacility));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Reference getClaim() {
		return claim;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetClaim(Reference newClaim, NotificationChain msgs) {
		Reference oldClaim = claim;
		claim = newClaim;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FhirPackage.EXPLANATION_OF_BENEFIT__CLAIM, oldClaim, newClaim);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setClaim(Reference newClaim) {
		if (newClaim != claim) {
			NotificationChain msgs = null;
			if (claim != null)
				msgs = ((InternalEObject)claim).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FhirPackage.EXPLANATION_OF_BENEFIT__CLAIM, null, msgs);
			if (newClaim != null)
				msgs = ((InternalEObject)newClaim).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FhirPackage.EXPLANATION_OF_BENEFIT__CLAIM, null, msgs);
			msgs = basicSetClaim(newClaim, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FhirPackage.EXPLANATION_OF_BENEFIT__CLAIM, newClaim, newClaim));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Reference getClaimResponse() {
		return claimResponse;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetClaimResponse(Reference newClaimResponse, NotificationChain msgs) {
		Reference oldClaimResponse = claimResponse;
		claimResponse = newClaimResponse;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FhirPackage.EXPLANATION_OF_BENEFIT__CLAIM_RESPONSE, oldClaimResponse, newClaimResponse);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setClaimResponse(Reference newClaimResponse) {
		if (newClaimResponse != claimResponse) {
			NotificationChain msgs = null;
			if (claimResponse != null)
				msgs = ((InternalEObject)claimResponse).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FhirPackage.EXPLANATION_OF_BENEFIT__CLAIM_RESPONSE, null, msgs);
			if (newClaimResponse != null)
				msgs = ((InternalEObject)newClaimResponse).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FhirPackage.EXPLANATION_OF_BENEFIT__CLAIM_RESPONSE, null, msgs);
			msgs = basicSetClaimResponse(newClaimResponse, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FhirPackage.EXPLANATION_OF_BENEFIT__CLAIM_RESPONSE, newClaimResponse, newClaimResponse));
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
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FhirPackage.EXPLANATION_OF_BENEFIT__OUTCOME, oldOutcome, newOutcome);
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
				msgs = ((InternalEObject)outcome).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FhirPackage.EXPLANATION_OF_BENEFIT__OUTCOME, null, msgs);
			if (newOutcome != null)
				msgs = ((InternalEObject)newOutcome).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FhirPackage.EXPLANATION_OF_BENEFIT__OUTCOME, null, msgs);
			msgs = basicSetOutcome(newOutcome, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FhirPackage.EXPLANATION_OF_BENEFIT__OUTCOME, newOutcome, newOutcome));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@XmlJavaTypeAdapter(StringImplAdapter.class)
	public org.hl7.fhir.String getDisposition() {
		return disposition;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetDisposition(org.hl7.fhir.String newDisposition, NotificationChain msgs) {
		org.hl7.fhir.String oldDisposition = disposition;
		disposition = newDisposition;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FhirPackage.EXPLANATION_OF_BENEFIT__DISPOSITION, oldDisposition, newDisposition);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setDisposition(org.hl7.fhir.String newDisposition) {
		if (newDisposition != disposition) {
			NotificationChain msgs = null;
			if (disposition != null)
				msgs = ((InternalEObject)disposition).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FhirPackage.EXPLANATION_OF_BENEFIT__DISPOSITION, null, msgs);
			if (newDisposition != null)
				msgs = ((InternalEObject)newDisposition).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FhirPackage.EXPLANATION_OF_BENEFIT__DISPOSITION, null, msgs);
			msgs = basicSetDisposition(newDisposition, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FhirPackage.EXPLANATION_OF_BENEFIT__DISPOSITION, newDisposition, newDisposition));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@XmlElement
	public List<ExplanationOfBenefitRelated> getRelated() {
		if (related == null) {
			related = new EObjectContainmentEList<ExplanationOfBenefitRelated>(ExplanationOfBenefitRelated.class, this, FhirPackage.EXPLANATION_OF_BENEFIT__RELATED);
		}
		return related;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Reference getPrescription() {
		return prescription;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetPrescription(Reference newPrescription, NotificationChain msgs) {
		Reference oldPrescription = prescription;
		prescription = newPrescription;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FhirPackage.EXPLANATION_OF_BENEFIT__PRESCRIPTION, oldPrescription, newPrescription);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setPrescription(Reference newPrescription) {
		if (newPrescription != prescription) {
			NotificationChain msgs = null;
			if (prescription != null)
				msgs = ((InternalEObject)prescription).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FhirPackage.EXPLANATION_OF_BENEFIT__PRESCRIPTION, null, msgs);
			if (newPrescription != null)
				msgs = ((InternalEObject)newPrescription).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FhirPackage.EXPLANATION_OF_BENEFIT__PRESCRIPTION, null, msgs);
			msgs = basicSetPrescription(newPrescription, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FhirPackage.EXPLANATION_OF_BENEFIT__PRESCRIPTION, newPrescription, newPrescription));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Reference getOriginalPrescription() {
		return originalPrescription;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetOriginalPrescription(Reference newOriginalPrescription, NotificationChain msgs) {
		Reference oldOriginalPrescription = originalPrescription;
		originalPrescription = newOriginalPrescription;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FhirPackage.EXPLANATION_OF_BENEFIT__ORIGINAL_PRESCRIPTION, oldOriginalPrescription, newOriginalPrescription);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setOriginalPrescription(Reference newOriginalPrescription) {
		if (newOriginalPrescription != originalPrescription) {
			NotificationChain msgs = null;
			if (originalPrescription != null)
				msgs = ((InternalEObject)originalPrescription).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FhirPackage.EXPLANATION_OF_BENEFIT__ORIGINAL_PRESCRIPTION, null, msgs);
			if (newOriginalPrescription != null)
				msgs = ((InternalEObject)newOriginalPrescription).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FhirPackage.EXPLANATION_OF_BENEFIT__ORIGINAL_PRESCRIPTION, null, msgs);
			msgs = basicSetOriginalPrescription(newOriginalPrescription, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FhirPackage.EXPLANATION_OF_BENEFIT__ORIGINAL_PRESCRIPTION, newOriginalPrescription, newOriginalPrescription));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ExplanationOfBenefitPayee getPayee() {
		return payee;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetPayee(ExplanationOfBenefitPayee newPayee, NotificationChain msgs) {
		ExplanationOfBenefitPayee oldPayee = payee;
		payee = newPayee;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FhirPackage.EXPLANATION_OF_BENEFIT__PAYEE, oldPayee, newPayee);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setPayee(ExplanationOfBenefitPayee newPayee) {
		if (newPayee != payee) {
			NotificationChain msgs = null;
			if (payee != null)
				msgs = ((InternalEObject)payee).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FhirPackage.EXPLANATION_OF_BENEFIT__PAYEE, null, msgs);
			if (newPayee != null)
				msgs = ((InternalEObject)newPayee).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FhirPackage.EXPLANATION_OF_BENEFIT__PAYEE, null, msgs);
			msgs = basicSetPayee(newPayee, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FhirPackage.EXPLANATION_OF_BENEFIT__PAYEE, newPayee, newPayee));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@XmlElement
	public List<ExplanationOfBenefitInformation> getInformation() {
		if (information == null) {
			information = new EObjectContainmentEList<ExplanationOfBenefitInformation>(ExplanationOfBenefitInformation.class, this, FhirPackage.EXPLANATION_OF_BENEFIT__INFORMATION);
		}
		return information;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@XmlElement
	public List<ExplanationOfBenefitCareTeam> getCareTeam() {
		if (careTeam == null) {
			careTeam = new EObjectContainmentEList<ExplanationOfBenefitCareTeam>(ExplanationOfBenefitCareTeam.class, this, FhirPackage.EXPLANATION_OF_BENEFIT__CARE_TEAM);
		}
		return careTeam;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@XmlElement
	public List<ExplanationOfBenefitDiagnosis> getDiagnosis() {
		if (diagnosis == null) {
			diagnosis = new EObjectContainmentEList<ExplanationOfBenefitDiagnosis>(ExplanationOfBenefitDiagnosis.class, this, FhirPackage.EXPLANATION_OF_BENEFIT__DIAGNOSIS);
		}
		return diagnosis;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@XmlElement
	public List<ExplanationOfBenefitProcedure> getProcedure() {
		if (procedure == null) {
			procedure = new EObjectContainmentEList<ExplanationOfBenefitProcedure>(ExplanationOfBenefitProcedure.class, this, FhirPackage.EXPLANATION_OF_BENEFIT__PROCEDURE);
		}
		return procedure;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@XmlJavaTypeAdapter(PositiveIntImplAdapter.class)
	public PositiveInt getPrecedence() {
		return precedence;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetPrecedence(PositiveInt newPrecedence, NotificationChain msgs) {
		PositiveInt oldPrecedence = precedence;
		precedence = newPrecedence;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FhirPackage.EXPLANATION_OF_BENEFIT__PRECEDENCE, oldPrecedence, newPrecedence);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setPrecedence(PositiveInt newPrecedence) {
		if (newPrecedence != precedence) {
			NotificationChain msgs = null;
			if (precedence != null)
				msgs = ((InternalEObject)precedence).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FhirPackage.EXPLANATION_OF_BENEFIT__PRECEDENCE, null, msgs);
			if (newPrecedence != null)
				msgs = ((InternalEObject)newPrecedence).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FhirPackage.EXPLANATION_OF_BENEFIT__PRECEDENCE, null, msgs);
			msgs = basicSetPrecedence(newPrecedence, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FhirPackage.EXPLANATION_OF_BENEFIT__PRECEDENCE, newPrecedence, newPrecedence));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ExplanationOfBenefitInsurance getInsurance() {
		return insurance;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetInsurance(ExplanationOfBenefitInsurance newInsurance, NotificationChain msgs) {
		ExplanationOfBenefitInsurance oldInsurance = insurance;
		insurance = newInsurance;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FhirPackage.EXPLANATION_OF_BENEFIT__INSURANCE, oldInsurance, newInsurance);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setInsurance(ExplanationOfBenefitInsurance newInsurance) {
		if (newInsurance != insurance) {
			NotificationChain msgs = null;
			if (insurance != null)
				msgs = ((InternalEObject)insurance).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FhirPackage.EXPLANATION_OF_BENEFIT__INSURANCE, null, msgs);
			if (newInsurance != null)
				msgs = ((InternalEObject)newInsurance).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FhirPackage.EXPLANATION_OF_BENEFIT__INSURANCE, null, msgs);
			msgs = basicSetInsurance(newInsurance, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FhirPackage.EXPLANATION_OF_BENEFIT__INSURANCE, newInsurance, newInsurance));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ExplanationOfBenefitAccident getAccident() {
		return accident;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetAccident(ExplanationOfBenefitAccident newAccident, NotificationChain msgs) {
		ExplanationOfBenefitAccident oldAccident = accident;
		accident = newAccident;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FhirPackage.EXPLANATION_OF_BENEFIT__ACCIDENT, oldAccident, newAccident);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setAccident(ExplanationOfBenefitAccident newAccident) {
		if (newAccident != accident) {
			NotificationChain msgs = null;
			if (accident != null)
				msgs = ((InternalEObject)accident).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FhirPackage.EXPLANATION_OF_BENEFIT__ACCIDENT, null, msgs);
			if (newAccident != null)
				msgs = ((InternalEObject)newAccident).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FhirPackage.EXPLANATION_OF_BENEFIT__ACCIDENT, null, msgs);
			msgs = basicSetAccident(newAccident, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FhirPackage.EXPLANATION_OF_BENEFIT__ACCIDENT, newAccident, newAccident));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Period getEmploymentImpacted() {
		return employmentImpacted;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetEmploymentImpacted(Period newEmploymentImpacted, NotificationChain msgs) {
		Period oldEmploymentImpacted = employmentImpacted;
		employmentImpacted = newEmploymentImpacted;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FhirPackage.EXPLANATION_OF_BENEFIT__EMPLOYMENT_IMPACTED, oldEmploymentImpacted, newEmploymentImpacted);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setEmploymentImpacted(Period newEmploymentImpacted) {
		if (newEmploymentImpacted != employmentImpacted) {
			NotificationChain msgs = null;
			if (employmentImpacted != null)
				msgs = ((InternalEObject)employmentImpacted).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FhirPackage.EXPLANATION_OF_BENEFIT__EMPLOYMENT_IMPACTED, null, msgs);
			if (newEmploymentImpacted != null)
				msgs = ((InternalEObject)newEmploymentImpacted).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FhirPackage.EXPLANATION_OF_BENEFIT__EMPLOYMENT_IMPACTED, null, msgs);
			msgs = basicSetEmploymentImpacted(newEmploymentImpacted, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FhirPackage.EXPLANATION_OF_BENEFIT__EMPLOYMENT_IMPACTED, newEmploymentImpacted, newEmploymentImpacted));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Period getHospitalization() {
		return hospitalization;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetHospitalization(Period newHospitalization, NotificationChain msgs) {
		Period oldHospitalization = hospitalization;
		hospitalization = newHospitalization;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FhirPackage.EXPLANATION_OF_BENEFIT__HOSPITALIZATION, oldHospitalization, newHospitalization);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setHospitalization(Period newHospitalization) {
		if (newHospitalization != hospitalization) {
			NotificationChain msgs = null;
			if (hospitalization != null)
				msgs = ((InternalEObject)hospitalization).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FhirPackage.EXPLANATION_OF_BENEFIT__HOSPITALIZATION, null, msgs);
			if (newHospitalization != null)
				msgs = ((InternalEObject)newHospitalization).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FhirPackage.EXPLANATION_OF_BENEFIT__HOSPITALIZATION, null, msgs);
			msgs = basicSetHospitalization(newHospitalization, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FhirPackage.EXPLANATION_OF_BENEFIT__HOSPITALIZATION, newHospitalization, newHospitalization));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@XmlElement
	public List<ExplanationOfBenefitItem> getItem() {
		if (item == null) {
			item = new EObjectContainmentEList<ExplanationOfBenefitItem>(ExplanationOfBenefitItem.class, this, FhirPackage.EXPLANATION_OF_BENEFIT__ITEM);
		}
		return item;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@XmlElement
	public List<ExplanationOfBenefitAddItem> getAddItem() {
		if (addItem == null) {
			addItem = new EObjectContainmentEList<ExplanationOfBenefitAddItem>(ExplanationOfBenefitAddItem.class, this, FhirPackage.EXPLANATION_OF_BENEFIT__ADD_ITEM);
		}
		return addItem;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Money getTotalCost() {
		return totalCost;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetTotalCost(Money newTotalCost, NotificationChain msgs) {
		Money oldTotalCost = totalCost;
		totalCost = newTotalCost;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FhirPackage.EXPLANATION_OF_BENEFIT__TOTAL_COST, oldTotalCost, newTotalCost);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setTotalCost(Money newTotalCost) {
		if (newTotalCost != totalCost) {
			NotificationChain msgs = null;
			if (totalCost != null)
				msgs = ((InternalEObject)totalCost).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FhirPackage.EXPLANATION_OF_BENEFIT__TOTAL_COST, null, msgs);
			if (newTotalCost != null)
				msgs = ((InternalEObject)newTotalCost).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FhirPackage.EXPLANATION_OF_BENEFIT__TOTAL_COST, null, msgs);
			msgs = basicSetTotalCost(newTotalCost, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FhirPackage.EXPLANATION_OF_BENEFIT__TOTAL_COST, newTotalCost, newTotalCost));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Money getUnallocDeductable() {
		return unallocDeductable;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetUnallocDeductable(Money newUnallocDeductable, NotificationChain msgs) {
		Money oldUnallocDeductable = unallocDeductable;
		unallocDeductable = newUnallocDeductable;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FhirPackage.EXPLANATION_OF_BENEFIT__UNALLOC_DEDUCTABLE, oldUnallocDeductable, newUnallocDeductable);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setUnallocDeductable(Money newUnallocDeductable) {
		if (newUnallocDeductable != unallocDeductable) {
			NotificationChain msgs = null;
			if (unallocDeductable != null)
				msgs = ((InternalEObject)unallocDeductable).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FhirPackage.EXPLANATION_OF_BENEFIT__UNALLOC_DEDUCTABLE, null, msgs);
			if (newUnallocDeductable != null)
				msgs = ((InternalEObject)newUnallocDeductable).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FhirPackage.EXPLANATION_OF_BENEFIT__UNALLOC_DEDUCTABLE, null, msgs);
			msgs = basicSetUnallocDeductable(newUnallocDeductable, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FhirPackage.EXPLANATION_OF_BENEFIT__UNALLOC_DEDUCTABLE, newUnallocDeductable, newUnallocDeductable));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Money getTotalBenefit() {
		return totalBenefit;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetTotalBenefit(Money newTotalBenefit, NotificationChain msgs) {
		Money oldTotalBenefit = totalBenefit;
		totalBenefit = newTotalBenefit;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FhirPackage.EXPLANATION_OF_BENEFIT__TOTAL_BENEFIT, oldTotalBenefit, newTotalBenefit);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setTotalBenefit(Money newTotalBenefit) {
		if (newTotalBenefit != totalBenefit) {
			NotificationChain msgs = null;
			if (totalBenefit != null)
				msgs = ((InternalEObject)totalBenefit).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FhirPackage.EXPLANATION_OF_BENEFIT__TOTAL_BENEFIT, null, msgs);
			if (newTotalBenefit != null)
				msgs = ((InternalEObject)newTotalBenefit).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FhirPackage.EXPLANATION_OF_BENEFIT__TOTAL_BENEFIT, null, msgs);
			msgs = basicSetTotalBenefit(newTotalBenefit, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FhirPackage.EXPLANATION_OF_BENEFIT__TOTAL_BENEFIT, newTotalBenefit, newTotalBenefit));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ExplanationOfBenefitPayment getPayment() {
		return payment;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetPayment(ExplanationOfBenefitPayment newPayment, NotificationChain msgs) {
		ExplanationOfBenefitPayment oldPayment = payment;
		payment = newPayment;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FhirPackage.EXPLANATION_OF_BENEFIT__PAYMENT, oldPayment, newPayment);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setPayment(ExplanationOfBenefitPayment newPayment) {
		if (newPayment != payment) {
			NotificationChain msgs = null;
			if (payment != null)
				msgs = ((InternalEObject)payment).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FhirPackage.EXPLANATION_OF_BENEFIT__PAYMENT, null, msgs);
			if (newPayment != null)
				msgs = ((InternalEObject)newPayment).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FhirPackage.EXPLANATION_OF_BENEFIT__PAYMENT, null, msgs);
			msgs = basicSetPayment(newPayment, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FhirPackage.EXPLANATION_OF_BENEFIT__PAYMENT, newPayment, newPayment));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CodeableConcept getForm() {
		return form;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetForm(CodeableConcept newForm, NotificationChain msgs) {
		CodeableConcept oldForm = form;
		form = newForm;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FhirPackage.EXPLANATION_OF_BENEFIT__FORM, oldForm, newForm);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setForm(CodeableConcept newForm) {
		if (newForm != form) {
			NotificationChain msgs = null;
			if (form != null)
				msgs = ((InternalEObject)form).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FhirPackage.EXPLANATION_OF_BENEFIT__FORM, null, msgs);
			if (newForm != null)
				msgs = ((InternalEObject)newForm).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FhirPackage.EXPLANATION_OF_BENEFIT__FORM, null, msgs);
			msgs = basicSetForm(newForm, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FhirPackage.EXPLANATION_OF_BENEFIT__FORM, newForm, newForm));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@XmlElement
	public List<ExplanationOfBenefitProcessNote> getProcessNote() {
		if (processNote == null) {
			processNote = new EObjectContainmentEList<ExplanationOfBenefitProcessNote>(ExplanationOfBenefitProcessNote.class, this, FhirPackage.EXPLANATION_OF_BENEFIT__PROCESS_NOTE);
		}
		return processNote;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@XmlElement
	public List<ExplanationOfBenefitBenefitBalance> getBenefitBalance() {
		if (benefitBalance == null) {
			benefitBalance = new EObjectContainmentEList<ExplanationOfBenefitBenefitBalance>(ExplanationOfBenefitBenefitBalance.class, this, FhirPackage.EXPLANATION_OF_BENEFIT__BENEFIT_BALANCE);
		}
		return benefitBalance;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case FhirPackage.EXPLANATION_OF_BENEFIT__IDENTIFIER:
				return ((InternalEList<?>)getIdentifier()).basicRemove(otherEnd, msgs);
			case FhirPackage.EXPLANATION_OF_BENEFIT__STATUS:
				return basicSetStatus(null, msgs);
			case FhirPackage.EXPLANATION_OF_BENEFIT__TYPE:
				return basicSetType(null, msgs);
			case FhirPackage.EXPLANATION_OF_BENEFIT__SUB_TYPE:
				return ((InternalEList<?>)getSubType()).basicRemove(otherEnd, msgs);
			case FhirPackage.EXPLANATION_OF_BENEFIT__PATIENT:
				return basicSetPatient(null, msgs);
			case FhirPackage.EXPLANATION_OF_BENEFIT__BILLABLE_PERIOD:
				return basicSetBillablePeriod(null, msgs);
			case FhirPackage.EXPLANATION_OF_BENEFIT__CREATED:
				return basicSetCreated(null, msgs);
			case FhirPackage.EXPLANATION_OF_BENEFIT__ENTERER:
				return basicSetEnterer(null, msgs);
			case FhirPackage.EXPLANATION_OF_BENEFIT__INSURER:
				return basicSetInsurer(null, msgs);
			case FhirPackage.EXPLANATION_OF_BENEFIT__PROVIDER:
				return basicSetProvider(null, msgs);
			case FhirPackage.EXPLANATION_OF_BENEFIT__ORGANIZATION:
				return basicSetOrganization(null, msgs);
			case FhirPackage.EXPLANATION_OF_BENEFIT__REFERRAL:
				return basicSetReferral(null, msgs);
			case FhirPackage.EXPLANATION_OF_BENEFIT__FACILITY:
				return basicSetFacility(null, msgs);
			case FhirPackage.EXPLANATION_OF_BENEFIT__CLAIM:
				return basicSetClaim(null, msgs);
			case FhirPackage.EXPLANATION_OF_BENEFIT__CLAIM_RESPONSE:
				return basicSetClaimResponse(null, msgs);
			case FhirPackage.EXPLANATION_OF_BENEFIT__OUTCOME:
				return basicSetOutcome(null, msgs);
			case FhirPackage.EXPLANATION_OF_BENEFIT__DISPOSITION:
				return basicSetDisposition(null, msgs);
			case FhirPackage.EXPLANATION_OF_BENEFIT__RELATED:
				return ((InternalEList<?>)getRelated()).basicRemove(otherEnd, msgs);
			case FhirPackage.EXPLANATION_OF_BENEFIT__PRESCRIPTION:
				return basicSetPrescription(null, msgs);
			case FhirPackage.EXPLANATION_OF_BENEFIT__ORIGINAL_PRESCRIPTION:
				return basicSetOriginalPrescription(null, msgs);
			case FhirPackage.EXPLANATION_OF_BENEFIT__PAYEE:
				return basicSetPayee(null, msgs);
			case FhirPackage.EXPLANATION_OF_BENEFIT__INFORMATION:
				return ((InternalEList<?>)getInformation()).basicRemove(otherEnd, msgs);
			case FhirPackage.EXPLANATION_OF_BENEFIT__CARE_TEAM:
				return ((InternalEList<?>)getCareTeam()).basicRemove(otherEnd, msgs);
			case FhirPackage.EXPLANATION_OF_BENEFIT__DIAGNOSIS:
				return ((InternalEList<?>)getDiagnosis()).basicRemove(otherEnd, msgs);
			case FhirPackage.EXPLANATION_OF_BENEFIT__PROCEDURE:
				return ((InternalEList<?>)getProcedure()).basicRemove(otherEnd, msgs);
			case FhirPackage.EXPLANATION_OF_BENEFIT__PRECEDENCE:
				return basicSetPrecedence(null, msgs);
			case FhirPackage.EXPLANATION_OF_BENEFIT__INSURANCE:
				return basicSetInsurance(null, msgs);
			case FhirPackage.EXPLANATION_OF_BENEFIT__ACCIDENT:
				return basicSetAccident(null, msgs);
			case FhirPackage.EXPLANATION_OF_BENEFIT__EMPLOYMENT_IMPACTED:
				return basicSetEmploymentImpacted(null, msgs);
			case FhirPackage.EXPLANATION_OF_BENEFIT__HOSPITALIZATION:
				return basicSetHospitalization(null, msgs);
			case FhirPackage.EXPLANATION_OF_BENEFIT__ITEM:
				return ((InternalEList<?>)getItem()).basicRemove(otherEnd, msgs);
			case FhirPackage.EXPLANATION_OF_BENEFIT__ADD_ITEM:
				return ((InternalEList<?>)getAddItem()).basicRemove(otherEnd, msgs);
			case FhirPackage.EXPLANATION_OF_BENEFIT__TOTAL_COST:
				return basicSetTotalCost(null, msgs);
			case FhirPackage.EXPLANATION_OF_BENEFIT__UNALLOC_DEDUCTABLE:
				return basicSetUnallocDeductable(null, msgs);
			case FhirPackage.EXPLANATION_OF_BENEFIT__TOTAL_BENEFIT:
				return basicSetTotalBenefit(null, msgs);
			case FhirPackage.EXPLANATION_OF_BENEFIT__PAYMENT:
				return basicSetPayment(null, msgs);
			case FhirPackage.EXPLANATION_OF_BENEFIT__FORM:
				return basicSetForm(null, msgs);
			case FhirPackage.EXPLANATION_OF_BENEFIT__PROCESS_NOTE:
				return ((InternalEList<?>)getProcessNote()).basicRemove(otherEnd, msgs);
			case FhirPackage.EXPLANATION_OF_BENEFIT__BENEFIT_BALANCE:
				return ((InternalEList<?>)getBenefitBalance()).basicRemove(otherEnd, msgs);
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
			case FhirPackage.EXPLANATION_OF_BENEFIT__IDENTIFIER:
				return getIdentifier();
			case FhirPackage.EXPLANATION_OF_BENEFIT__STATUS:
				return getStatus();
			case FhirPackage.EXPLANATION_OF_BENEFIT__TYPE:
				return getType();
			case FhirPackage.EXPLANATION_OF_BENEFIT__SUB_TYPE:
				return getSubType();
			case FhirPackage.EXPLANATION_OF_BENEFIT__PATIENT:
				return getPatient();
			case FhirPackage.EXPLANATION_OF_BENEFIT__BILLABLE_PERIOD:
				return getBillablePeriod();
			case FhirPackage.EXPLANATION_OF_BENEFIT__CREATED:
				return getCreated();
			case FhirPackage.EXPLANATION_OF_BENEFIT__ENTERER:
				return getEnterer();
			case FhirPackage.EXPLANATION_OF_BENEFIT__INSURER:
				return getInsurer();
			case FhirPackage.EXPLANATION_OF_BENEFIT__PROVIDER:
				return getProvider();
			case FhirPackage.EXPLANATION_OF_BENEFIT__ORGANIZATION:
				return getOrganization();
			case FhirPackage.EXPLANATION_OF_BENEFIT__REFERRAL:
				return getReferral();
			case FhirPackage.EXPLANATION_OF_BENEFIT__FACILITY:
				return getFacility();
			case FhirPackage.EXPLANATION_OF_BENEFIT__CLAIM:
				return getClaim();
			case FhirPackage.EXPLANATION_OF_BENEFIT__CLAIM_RESPONSE:
				return getClaimResponse();
			case FhirPackage.EXPLANATION_OF_BENEFIT__OUTCOME:
				return getOutcome();
			case FhirPackage.EXPLANATION_OF_BENEFIT__DISPOSITION:
				return getDisposition();
			case FhirPackage.EXPLANATION_OF_BENEFIT__RELATED:
				return getRelated();
			case FhirPackage.EXPLANATION_OF_BENEFIT__PRESCRIPTION:
				return getPrescription();
			case FhirPackage.EXPLANATION_OF_BENEFIT__ORIGINAL_PRESCRIPTION:
				return getOriginalPrescription();
			case FhirPackage.EXPLANATION_OF_BENEFIT__PAYEE:
				return getPayee();
			case FhirPackage.EXPLANATION_OF_BENEFIT__INFORMATION:
				return getInformation();
			case FhirPackage.EXPLANATION_OF_BENEFIT__CARE_TEAM:
				return getCareTeam();
			case FhirPackage.EXPLANATION_OF_BENEFIT__DIAGNOSIS:
				return getDiagnosis();
			case FhirPackage.EXPLANATION_OF_BENEFIT__PROCEDURE:
				return getProcedure();
			case FhirPackage.EXPLANATION_OF_BENEFIT__PRECEDENCE:
				return getPrecedence();
			case FhirPackage.EXPLANATION_OF_BENEFIT__INSURANCE:
				return getInsurance();
			case FhirPackage.EXPLANATION_OF_BENEFIT__ACCIDENT:
				return getAccident();
			case FhirPackage.EXPLANATION_OF_BENEFIT__EMPLOYMENT_IMPACTED:
				return getEmploymentImpacted();
			case FhirPackage.EXPLANATION_OF_BENEFIT__HOSPITALIZATION:
				return getHospitalization();
			case FhirPackage.EXPLANATION_OF_BENEFIT__ITEM:
				return getItem();
			case FhirPackage.EXPLANATION_OF_BENEFIT__ADD_ITEM:
				return getAddItem();
			case FhirPackage.EXPLANATION_OF_BENEFIT__TOTAL_COST:
				return getTotalCost();
			case FhirPackage.EXPLANATION_OF_BENEFIT__UNALLOC_DEDUCTABLE:
				return getUnallocDeductable();
			case FhirPackage.EXPLANATION_OF_BENEFIT__TOTAL_BENEFIT:
				return getTotalBenefit();
			case FhirPackage.EXPLANATION_OF_BENEFIT__PAYMENT:
				return getPayment();
			case FhirPackage.EXPLANATION_OF_BENEFIT__FORM:
				return getForm();
			case FhirPackage.EXPLANATION_OF_BENEFIT__PROCESS_NOTE:
				return getProcessNote();
			case FhirPackage.EXPLANATION_OF_BENEFIT__BENEFIT_BALANCE:
				return getBenefitBalance();
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
			case FhirPackage.EXPLANATION_OF_BENEFIT__IDENTIFIER:
				getIdentifier().clear();
				getIdentifier().addAll((Collection<? extends Identifier>)newValue);
				return;
			case FhirPackage.EXPLANATION_OF_BENEFIT__STATUS:
				setStatus((ExplanationOfBenefitStatus)newValue);
				return;
			case FhirPackage.EXPLANATION_OF_BENEFIT__TYPE:
				setType((CodeableConcept)newValue);
				return;
			case FhirPackage.EXPLANATION_OF_BENEFIT__SUB_TYPE:
				getSubType().clear();
				getSubType().addAll((Collection<? extends CodeableConcept>)newValue);
				return;
			case FhirPackage.EXPLANATION_OF_BENEFIT__PATIENT:
				setPatient((Reference)newValue);
				return;
			case FhirPackage.EXPLANATION_OF_BENEFIT__BILLABLE_PERIOD:
				setBillablePeriod((Period)newValue);
				return;
			case FhirPackage.EXPLANATION_OF_BENEFIT__CREATED:
				setCreated((DateTime)newValue);
				return;
			case FhirPackage.EXPLANATION_OF_BENEFIT__ENTERER:
				setEnterer((Reference)newValue);
				return;
			case FhirPackage.EXPLANATION_OF_BENEFIT__INSURER:
				setInsurer((Reference)newValue);
				return;
			case FhirPackage.EXPLANATION_OF_BENEFIT__PROVIDER:
				setProvider((Reference)newValue);
				return;
			case FhirPackage.EXPLANATION_OF_BENEFIT__ORGANIZATION:
				setOrganization((Reference)newValue);
				return;
			case FhirPackage.EXPLANATION_OF_BENEFIT__REFERRAL:
				setReferral((Reference)newValue);
				return;
			case FhirPackage.EXPLANATION_OF_BENEFIT__FACILITY:
				setFacility((Reference)newValue);
				return;
			case FhirPackage.EXPLANATION_OF_BENEFIT__CLAIM:
				setClaim((Reference)newValue);
				return;
			case FhirPackage.EXPLANATION_OF_BENEFIT__CLAIM_RESPONSE:
				setClaimResponse((Reference)newValue);
				return;
			case FhirPackage.EXPLANATION_OF_BENEFIT__OUTCOME:
				setOutcome((CodeableConcept)newValue);
				return;
			case FhirPackage.EXPLANATION_OF_BENEFIT__DISPOSITION:
				setDisposition((org.hl7.fhir.String)newValue);
				return;
			case FhirPackage.EXPLANATION_OF_BENEFIT__RELATED:
				getRelated().clear();
				getRelated().addAll((Collection<? extends ExplanationOfBenefitRelated>)newValue);
				return;
			case FhirPackage.EXPLANATION_OF_BENEFIT__PRESCRIPTION:
				setPrescription((Reference)newValue);
				return;
			case FhirPackage.EXPLANATION_OF_BENEFIT__ORIGINAL_PRESCRIPTION:
				setOriginalPrescription((Reference)newValue);
				return;
			case FhirPackage.EXPLANATION_OF_BENEFIT__PAYEE:
				setPayee((ExplanationOfBenefitPayee)newValue);
				return;
			case FhirPackage.EXPLANATION_OF_BENEFIT__INFORMATION:
				getInformation().clear();
				getInformation().addAll((Collection<? extends ExplanationOfBenefitInformation>)newValue);
				return;
			case FhirPackage.EXPLANATION_OF_BENEFIT__CARE_TEAM:
				getCareTeam().clear();
				getCareTeam().addAll((Collection<? extends ExplanationOfBenefitCareTeam>)newValue);
				return;
			case FhirPackage.EXPLANATION_OF_BENEFIT__DIAGNOSIS:
				getDiagnosis().clear();
				getDiagnosis().addAll((Collection<? extends ExplanationOfBenefitDiagnosis>)newValue);
				return;
			case FhirPackage.EXPLANATION_OF_BENEFIT__PROCEDURE:
				getProcedure().clear();
				getProcedure().addAll((Collection<? extends ExplanationOfBenefitProcedure>)newValue);
				return;
			case FhirPackage.EXPLANATION_OF_BENEFIT__PRECEDENCE:
				setPrecedence((PositiveInt)newValue);
				return;
			case FhirPackage.EXPLANATION_OF_BENEFIT__INSURANCE:
				setInsurance((ExplanationOfBenefitInsurance)newValue);
				return;
			case FhirPackage.EXPLANATION_OF_BENEFIT__ACCIDENT:
				setAccident((ExplanationOfBenefitAccident)newValue);
				return;
			case FhirPackage.EXPLANATION_OF_BENEFIT__EMPLOYMENT_IMPACTED:
				setEmploymentImpacted((Period)newValue);
				return;
			case FhirPackage.EXPLANATION_OF_BENEFIT__HOSPITALIZATION:
				setHospitalization((Period)newValue);
				return;
			case FhirPackage.EXPLANATION_OF_BENEFIT__ITEM:
				getItem().clear();
				getItem().addAll((Collection<? extends ExplanationOfBenefitItem>)newValue);
				return;
			case FhirPackage.EXPLANATION_OF_BENEFIT__ADD_ITEM:
				getAddItem().clear();
				getAddItem().addAll((Collection<? extends ExplanationOfBenefitAddItem>)newValue);
				return;
			case FhirPackage.EXPLANATION_OF_BENEFIT__TOTAL_COST:
				setTotalCost((Money)newValue);
				return;
			case FhirPackage.EXPLANATION_OF_BENEFIT__UNALLOC_DEDUCTABLE:
				setUnallocDeductable((Money)newValue);
				return;
			case FhirPackage.EXPLANATION_OF_BENEFIT__TOTAL_BENEFIT:
				setTotalBenefit((Money)newValue);
				return;
			case FhirPackage.EXPLANATION_OF_BENEFIT__PAYMENT:
				setPayment((ExplanationOfBenefitPayment)newValue);
				return;
			case FhirPackage.EXPLANATION_OF_BENEFIT__FORM:
				setForm((CodeableConcept)newValue);
				return;
			case FhirPackage.EXPLANATION_OF_BENEFIT__PROCESS_NOTE:
				getProcessNote().clear();
				getProcessNote().addAll((Collection<? extends ExplanationOfBenefitProcessNote>)newValue);
				return;
			case FhirPackage.EXPLANATION_OF_BENEFIT__BENEFIT_BALANCE:
				getBenefitBalance().clear();
				getBenefitBalance().addAll((Collection<? extends ExplanationOfBenefitBenefitBalance>)newValue);
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
			case FhirPackage.EXPLANATION_OF_BENEFIT__IDENTIFIER:
				getIdentifier().clear();
				return;
			case FhirPackage.EXPLANATION_OF_BENEFIT__STATUS:
				setStatus((ExplanationOfBenefitStatus)null);
				return;
			case FhirPackage.EXPLANATION_OF_BENEFIT__TYPE:
				setType((CodeableConcept)null);
				return;
			case FhirPackage.EXPLANATION_OF_BENEFIT__SUB_TYPE:
				getSubType().clear();
				return;
			case FhirPackage.EXPLANATION_OF_BENEFIT__PATIENT:
				setPatient((Reference)null);
				return;
			case FhirPackage.EXPLANATION_OF_BENEFIT__BILLABLE_PERIOD:
				setBillablePeriod((Period)null);
				return;
			case FhirPackage.EXPLANATION_OF_BENEFIT__CREATED:
				setCreated((DateTime)null);
				return;
			case FhirPackage.EXPLANATION_OF_BENEFIT__ENTERER:
				setEnterer((Reference)null);
				return;
			case FhirPackage.EXPLANATION_OF_BENEFIT__INSURER:
				setInsurer((Reference)null);
				return;
			case FhirPackage.EXPLANATION_OF_BENEFIT__PROVIDER:
				setProvider((Reference)null);
				return;
			case FhirPackage.EXPLANATION_OF_BENEFIT__ORGANIZATION:
				setOrganization((Reference)null);
				return;
			case FhirPackage.EXPLANATION_OF_BENEFIT__REFERRAL:
				setReferral((Reference)null);
				return;
			case FhirPackage.EXPLANATION_OF_BENEFIT__FACILITY:
				setFacility((Reference)null);
				return;
			case FhirPackage.EXPLANATION_OF_BENEFIT__CLAIM:
				setClaim((Reference)null);
				return;
			case FhirPackage.EXPLANATION_OF_BENEFIT__CLAIM_RESPONSE:
				setClaimResponse((Reference)null);
				return;
			case FhirPackage.EXPLANATION_OF_BENEFIT__OUTCOME:
				setOutcome((CodeableConcept)null);
				return;
			case FhirPackage.EXPLANATION_OF_BENEFIT__DISPOSITION:
				setDisposition((org.hl7.fhir.String)null);
				return;
			case FhirPackage.EXPLANATION_OF_BENEFIT__RELATED:
				getRelated().clear();
				return;
			case FhirPackage.EXPLANATION_OF_BENEFIT__PRESCRIPTION:
				setPrescription((Reference)null);
				return;
			case FhirPackage.EXPLANATION_OF_BENEFIT__ORIGINAL_PRESCRIPTION:
				setOriginalPrescription((Reference)null);
				return;
			case FhirPackage.EXPLANATION_OF_BENEFIT__PAYEE:
				setPayee((ExplanationOfBenefitPayee)null);
				return;
			case FhirPackage.EXPLANATION_OF_BENEFIT__INFORMATION:
				getInformation().clear();
				return;
			case FhirPackage.EXPLANATION_OF_BENEFIT__CARE_TEAM:
				getCareTeam().clear();
				return;
			case FhirPackage.EXPLANATION_OF_BENEFIT__DIAGNOSIS:
				getDiagnosis().clear();
				return;
			case FhirPackage.EXPLANATION_OF_BENEFIT__PROCEDURE:
				getProcedure().clear();
				return;
			case FhirPackage.EXPLANATION_OF_BENEFIT__PRECEDENCE:
				setPrecedence((PositiveInt)null);
				return;
			case FhirPackage.EXPLANATION_OF_BENEFIT__INSURANCE:
				setInsurance((ExplanationOfBenefitInsurance)null);
				return;
			case FhirPackage.EXPLANATION_OF_BENEFIT__ACCIDENT:
				setAccident((ExplanationOfBenefitAccident)null);
				return;
			case FhirPackage.EXPLANATION_OF_BENEFIT__EMPLOYMENT_IMPACTED:
				setEmploymentImpacted((Period)null);
				return;
			case FhirPackage.EXPLANATION_OF_BENEFIT__HOSPITALIZATION:
				setHospitalization((Period)null);
				return;
			case FhirPackage.EXPLANATION_OF_BENEFIT__ITEM:
				getItem().clear();
				return;
			case FhirPackage.EXPLANATION_OF_BENEFIT__ADD_ITEM:
				getAddItem().clear();
				return;
			case FhirPackage.EXPLANATION_OF_BENEFIT__TOTAL_COST:
				setTotalCost((Money)null);
				return;
			case FhirPackage.EXPLANATION_OF_BENEFIT__UNALLOC_DEDUCTABLE:
				setUnallocDeductable((Money)null);
				return;
			case FhirPackage.EXPLANATION_OF_BENEFIT__TOTAL_BENEFIT:
				setTotalBenefit((Money)null);
				return;
			case FhirPackage.EXPLANATION_OF_BENEFIT__PAYMENT:
				setPayment((ExplanationOfBenefitPayment)null);
				return;
			case FhirPackage.EXPLANATION_OF_BENEFIT__FORM:
				setForm((CodeableConcept)null);
				return;
			case FhirPackage.EXPLANATION_OF_BENEFIT__PROCESS_NOTE:
				getProcessNote().clear();
				return;
			case FhirPackage.EXPLANATION_OF_BENEFIT__BENEFIT_BALANCE:
				getBenefitBalance().clear();
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
			case FhirPackage.EXPLANATION_OF_BENEFIT__IDENTIFIER:
				return identifier != null && !identifier.isEmpty();
			case FhirPackage.EXPLANATION_OF_BENEFIT__STATUS:
				return status != null;
			case FhirPackage.EXPLANATION_OF_BENEFIT__TYPE:
				return type != null;
			case FhirPackage.EXPLANATION_OF_BENEFIT__SUB_TYPE:
				return subType != null && !subType.isEmpty();
			case FhirPackage.EXPLANATION_OF_BENEFIT__PATIENT:
				return patient != null;
			case FhirPackage.EXPLANATION_OF_BENEFIT__BILLABLE_PERIOD:
				return billablePeriod != null;
			case FhirPackage.EXPLANATION_OF_BENEFIT__CREATED:
				return created != null;
			case FhirPackage.EXPLANATION_OF_BENEFIT__ENTERER:
				return enterer != null;
			case FhirPackage.EXPLANATION_OF_BENEFIT__INSURER:
				return insurer != null;
			case FhirPackage.EXPLANATION_OF_BENEFIT__PROVIDER:
				return provider != null;
			case FhirPackage.EXPLANATION_OF_BENEFIT__ORGANIZATION:
				return organization != null;
			case FhirPackage.EXPLANATION_OF_BENEFIT__REFERRAL:
				return referral != null;
			case FhirPackage.EXPLANATION_OF_BENEFIT__FACILITY:
				return facility != null;
			case FhirPackage.EXPLANATION_OF_BENEFIT__CLAIM:
				return claim != null;
			case FhirPackage.EXPLANATION_OF_BENEFIT__CLAIM_RESPONSE:
				return claimResponse != null;
			case FhirPackage.EXPLANATION_OF_BENEFIT__OUTCOME:
				return outcome != null;
			case FhirPackage.EXPLANATION_OF_BENEFIT__DISPOSITION:
				return disposition != null;
			case FhirPackage.EXPLANATION_OF_BENEFIT__RELATED:
				return related != null && !related.isEmpty();
			case FhirPackage.EXPLANATION_OF_BENEFIT__PRESCRIPTION:
				return prescription != null;
			case FhirPackage.EXPLANATION_OF_BENEFIT__ORIGINAL_PRESCRIPTION:
				return originalPrescription != null;
			case FhirPackage.EXPLANATION_OF_BENEFIT__PAYEE:
				return payee != null;
			case FhirPackage.EXPLANATION_OF_BENEFIT__INFORMATION:
				return information != null && !information.isEmpty();
			case FhirPackage.EXPLANATION_OF_BENEFIT__CARE_TEAM:
				return careTeam != null && !careTeam.isEmpty();
			case FhirPackage.EXPLANATION_OF_BENEFIT__DIAGNOSIS:
				return diagnosis != null && !diagnosis.isEmpty();
			case FhirPackage.EXPLANATION_OF_BENEFIT__PROCEDURE:
				return procedure != null && !procedure.isEmpty();
			case FhirPackage.EXPLANATION_OF_BENEFIT__PRECEDENCE:
				return precedence != null;
			case FhirPackage.EXPLANATION_OF_BENEFIT__INSURANCE:
				return insurance != null;
			case FhirPackage.EXPLANATION_OF_BENEFIT__ACCIDENT:
				return accident != null;
			case FhirPackage.EXPLANATION_OF_BENEFIT__EMPLOYMENT_IMPACTED:
				return employmentImpacted != null;
			case FhirPackage.EXPLANATION_OF_BENEFIT__HOSPITALIZATION:
				return hospitalization != null;
			case FhirPackage.EXPLANATION_OF_BENEFIT__ITEM:
				return item != null && !item.isEmpty();
			case FhirPackage.EXPLANATION_OF_BENEFIT__ADD_ITEM:
				return addItem != null && !addItem.isEmpty();
			case FhirPackage.EXPLANATION_OF_BENEFIT__TOTAL_COST:
				return totalCost != null;
			case FhirPackage.EXPLANATION_OF_BENEFIT__UNALLOC_DEDUCTABLE:
				return unallocDeductable != null;
			case FhirPackage.EXPLANATION_OF_BENEFIT__TOTAL_BENEFIT:
				return totalBenefit != null;
			case FhirPackage.EXPLANATION_OF_BENEFIT__PAYMENT:
				return payment != null;
			case FhirPackage.EXPLANATION_OF_BENEFIT__FORM:
				return form != null;
			case FhirPackage.EXPLANATION_OF_BENEFIT__PROCESS_NOTE:
				return processNote != null && !processNote.isEmpty();
			case FhirPackage.EXPLANATION_OF_BENEFIT__BENEFIT_BALANCE:
				return benefitBalance != null && !benefitBalance.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //ExplanationOfBenefitImpl
