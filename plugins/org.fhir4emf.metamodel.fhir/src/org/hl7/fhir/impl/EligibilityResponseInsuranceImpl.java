/**
 */
package org.hl7.fhir.impl;

import java.util.Collection;
import java.util.List;

import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

import org.hl7.fhir.EligibilityResponseBenefitBalance;
import org.hl7.fhir.EligibilityResponseInsurance;
import org.hl7.fhir.FhirPackage;
import org.hl7.fhir.Reference;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Eligibility Response Insurance</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.hl7.fhir.impl.EligibilityResponseInsuranceImpl#getCoverage <em>Coverage</em>}</li>
 *   <li>{@link org.hl7.fhir.impl.EligibilityResponseInsuranceImpl#getContract <em>Contract</em>}</li>
 *   <li>{@link org.hl7.fhir.impl.EligibilityResponseInsuranceImpl#getBenefitBalance <em>Benefit Balance</em>}</li>
 * </ul>
 *
 * @generated
 */
@XmlType(name = "EligibilityResponseInsurance", namespace = "http://hl7.org/fhir")
@XmlRootElement(name = "fhir.EligibilityResponseInsurance")
public class EligibilityResponseInsuranceImpl extends BackboneElementImpl implements EligibilityResponseInsurance {
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
	 * The cached value of the '{@link #getContract() <em>Contract</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getContract()
	 * @generated
	 * @ordered
	 */
	protected Reference contract;

	/**
	 * The cached value of the '{@link #getBenefitBalance() <em>Benefit Balance</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getBenefitBalance()
	 * @generated
	 * @ordered
	 */
	protected EList<EligibilityResponseBenefitBalance> benefitBalance;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected EligibilityResponseInsuranceImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return FhirPackage.eINSTANCE.getEligibilityResponseInsurance();
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
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FhirPackage.ELIGIBILITY_RESPONSE_INSURANCE__COVERAGE, oldCoverage, newCoverage);
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
				msgs = ((InternalEObject)coverage).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FhirPackage.ELIGIBILITY_RESPONSE_INSURANCE__COVERAGE, null, msgs);
			if (newCoverage != null)
				msgs = ((InternalEObject)newCoverage).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FhirPackage.ELIGIBILITY_RESPONSE_INSURANCE__COVERAGE, null, msgs);
			msgs = basicSetCoverage(newCoverage, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FhirPackage.ELIGIBILITY_RESPONSE_INSURANCE__COVERAGE, newCoverage, newCoverage));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Reference getContract() {
		return contract;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetContract(Reference newContract, NotificationChain msgs) {
		Reference oldContract = contract;
		contract = newContract;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FhirPackage.ELIGIBILITY_RESPONSE_INSURANCE__CONTRACT, oldContract, newContract);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setContract(Reference newContract) {
		if (newContract != contract) {
			NotificationChain msgs = null;
			if (contract != null)
				msgs = ((InternalEObject)contract).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FhirPackage.ELIGIBILITY_RESPONSE_INSURANCE__CONTRACT, null, msgs);
			if (newContract != null)
				msgs = ((InternalEObject)newContract).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FhirPackage.ELIGIBILITY_RESPONSE_INSURANCE__CONTRACT, null, msgs);
			msgs = basicSetContract(newContract, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FhirPackage.ELIGIBILITY_RESPONSE_INSURANCE__CONTRACT, newContract, newContract));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@XmlElement
	public List<EligibilityResponseBenefitBalance> getBenefitBalance() {
		if (benefitBalance == null) {
			benefitBalance = new EObjectContainmentEList<EligibilityResponseBenefitBalance>(EligibilityResponseBenefitBalance.class, this, FhirPackage.ELIGIBILITY_RESPONSE_INSURANCE__BENEFIT_BALANCE);
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
			case FhirPackage.ELIGIBILITY_RESPONSE_INSURANCE__COVERAGE:
				return basicSetCoverage(null, msgs);
			case FhirPackage.ELIGIBILITY_RESPONSE_INSURANCE__CONTRACT:
				return basicSetContract(null, msgs);
			case FhirPackage.ELIGIBILITY_RESPONSE_INSURANCE__BENEFIT_BALANCE:
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
			case FhirPackage.ELIGIBILITY_RESPONSE_INSURANCE__COVERAGE:
				return getCoverage();
			case FhirPackage.ELIGIBILITY_RESPONSE_INSURANCE__CONTRACT:
				return getContract();
			case FhirPackage.ELIGIBILITY_RESPONSE_INSURANCE__BENEFIT_BALANCE:
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
			case FhirPackage.ELIGIBILITY_RESPONSE_INSURANCE__COVERAGE:
				setCoverage((Reference)newValue);
				return;
			case FhirPackage.ELIGIBILITY_RESPONSE_INSURANCE__CONTRACT:
				setContract((Reference)newValue);
				return;
			case FhirPackage.ELIGIBILITY_RESPONSE_INSURANCE__BENEFIT_BALANCE:
				getBenefitBalance().clear();
				getBenefitBalance().addAll((Collection<? extends EligibilityResponseBenefitBalance>)newValue);
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
			case FhirPackage.ELIGIBILITY_RESPONSE_INSURANCE__COVERAGE:
				setCoverage((Reference)null);
				return;
			case FhirPackage.ELIGIBILITY_RESPONSE_INSURANCE__CONTRACT:
				setContract((Reference)null);
				return;
			case FhirPackage.ELIGIBILITY_RESPONSE_INSURANCE__BENEFIT_BALANCE:
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
			case FhirPackage.ELIGIBILITY_RESPONSE_INSURANCE__COVERAGE:
				return coverage != null;
			case FhirPackage.ELIGIBILITY_RESPONSE_INSURANCE__CONTRACT:
				return contract != null;
			case FhirPackage.ELIGIBILITY_RESPONSE_INSURANCE__BENEFIT_BALANCE:
				return benefitBalance != null && !benefitBalance.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //EligibilityResponseInsuranceImpl
