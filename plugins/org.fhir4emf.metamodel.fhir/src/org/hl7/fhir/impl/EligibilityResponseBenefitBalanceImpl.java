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
import org.hl7.fhir.EligibilityResponseBenefitBalance;
import org.hl7.fhir.EligibilityResponseFinancial;
import org.hl7.fhir.FhirPackage;
import org.hl7.fhir.jaxb.BooleanImplAdapter;
import org.hl7.fhir.jaxb.StringImplAdapter;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Eligibility Response Benefit Balance</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.hl7.fhir.impl.EligibilityResponseBenefitBalanceImpl#getCategory <em>Category</em>}</li>
 *   <li>{@link org.hl7.fhir.impl.EligibilityResponseBenefitBalanceImpl#getSubCategory <em>Sub Category</em>}</li>
 *   <li>{@link org.hl7.fhir.impl.EligibilityResponseBenefitBalanceImpl#getExcluded <em>Excluded</em>}</li>
 *   <li>{@link org.hl7.fhir.impl.EligibilityResponseBenefitBalanceImpl#getName <em>Name</em>}</li>
 *   <li>{@link org.hl7.fhir.impl.EligibilityResponseBenefitBalanceImpl#getDescription <em>Description</em>}</li>
 *   <li>{@link org.hl7.fhir.impl.EligibilityResponseBenefitBalanceImpl#getNetwork <em>Network</em>}</li>
 *   <li>{@link org.hl7.fhir.impl.EligibilityResponseBenefitBalanceImpl#getUnit <em>Unit</em>}</li>
 *   <li>{@link org.hl7.fhir.impl.EligibilityResponseBenefitBalanceImpl#getTerm <em>Term</em>}</li>
 *   <li>{@link org.hl7.fhir.impl.EligibilityResponseBenefitBalanceImpl#getFinancial <em>Financial</em>}</li>
 * </ul>
 *
 * @generated
 */
@XmlType(name = "EligibilityResponseBenefitBalance", namespace = "http://hl7.org/fhir")
@XmlRootElement(name = "fhir.EligibilityResponseBenefitBalance")
public class EligibilityResponseBenefitBalanceImpl extends BackboneElementImpl implements EligibilityResponseBenefitBalance {
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
	 * The cached value of the '{@link #getSubCategory() <em>Sub Category</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSubCategory()
	 * @generated
	 * @ordered
	 */
	protected CodeableConcept subCategory;

	/**
	 * The cached value of the '{@link #getExcluded() <em>Excluded</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getExcluded()
	 * @generated
	 * @ordered
	 */
	protected org.hl7.fhir.Boolean excluded;

	/**
	 * The cached value of the '{@link #getName() <em>Name</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getName()
	 * @generated
	 * @ordered
	 */
	protected org.hl7.fhir.String name;

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
	 * The cached value of the '{@link #getNetwork() <em>Network</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNetwork()
	 * @generated
	 * @ordered
	 */
	protected CodeableConcept network;

	/**
	 * The cached value of the '{@link #getUnit() <em>Unit</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getUnit()
	 * @generated
	 * @ordered
	 */
	protected CodeableConcept unit;

	/**
	 * The cached value of the '{@link #getTerm() <em>Term</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTerm()
	 * @generated
	 * @ordered
	 */
	protected CodeableConcept term;

	/**
	 * The cached value of the '{@link #getFinancial() <em>Financial</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFinancial()
	 * @generated
	 * @ordered
	 */
	protected EList<EligibilityResponseFinancial> financial;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected EligibilityResponseBenefitBalanceImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return FhirPackage.eINSTANCE.getEligibilityResponseBenefitBalance();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@XmlElement(required = true)
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
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FhirPackage.ELIGIBILITY_RESPONSE_BENEFIT_BALANCE__CATEGORY, oldCategory, newCategory);
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
				msgs = ((InternalEObject)category).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FhirPackage.ELIGIBILITY_RESPONSE_BENEFIT_BALANCE__CATEGORY, null, msgs);
			if (newCategory != null)
				msgs = ((InternalEObject)newCategory).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FhirPackage.ELIGIBILITY_RESPONSE_BENEFIT_BALANCE__CATEGORY, null, msgs);
			msgs = basicSetCategory(newCategory, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FhirPackage.ELIGIBILITY_RESPONSE_BENEFIT_BALANCE__CATEGORY, newCategory, newCategory));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CodeableConcept getSubCategory() {
		return subCategory;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetSubCategory(CodeableConcept newSubCategory, NotificationChain msgs) {
		CodeableConcept oldSubCategory = subCategory;
		subCategory = newSubCategory;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FhirPackage.ELIGIBILITY_RESPONSE_BENEFIT_BALANCE__SUB_CATEGORY, oldSubCategory, newSubCategory);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setSubCategory(CodeableConcept newSubCategory) {
		if (newSubCategory != subCategory) {
			NotificationChain msgs = null;
			if (subCategory != null)
				msgs = ((InternalEObject)subCategory).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FhirPackage.ELIGIBILITY_RESPONSE_BENEFIT_BALANCE__SUB_CATEGORY, null, msgs);
			if (newSubCategory != null)
				msgs = ((InternalEObject)newSubCategory).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FhirPackage.ELIGIBILITY_RESPONSE_BENEFIT_BALANCE__SUB_CATEGORY, null, msgs);
			msgs = basicSetSubCategory(newSubCategory, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FhirPackage.ELIGIBILITY_RESPONSE_BENEFIT_BALANCE__SUB_CATEGORY, newSubCategory, newSubCategory));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@XmlJavaTypeAdapter(BooleanImplAdapter.class)
	public org.hl7.fhir.Boolean getExcluded() {
		return excluded;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetExcluded(org.hl7.fhir.Boolean newExcluded, NotificationChain msgs) {
		org.hl7.fhir.Boolean oldExcluded = excluded;
		excluded = newExcluded;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FhirPackage.ELIGIBILITY_RESPONSE_BENEFIT_BALANCE__EXCLUDED, oldExcluded, newExcluded);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setExcluded(org.hl7.fhir.Boolean newExcluded) {
		if (newExcluded != excluded) {
			NotificationChain msgs = null;
			if (excluded != null)
				msgs = ((InternalEObject)excluded).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FhirPackage.ELIGIBILITY_RESPONSE_BENEFIT_BALANCE__EXCLUDED, null, msgs);
			if (newExcluded != null)
				msgs = ((InternalEObject)newExcluded).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FhirPackage.ELIGIBILITY_RESPONSE_BENEFIT_BALANCE__EXCLUDED, null, msgs);
			msgs = basicSetExcluded(newExcluded, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FhirPackage.ELIGIBILITY_RESPONSE_BENEFIT_BALANCE__EXCLUDED, newExcluded, newExcluded));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@XmlJavaTypeAdapter(StringImplAdapter.class)
	public org.hl7.fhir.String getName() {
		return name;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetName(org.hl7.fhir.String newName, NotificationChain msgs) {
		org.hl7.fhir.String oldName = name;
		name = newName;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FhirPackage.ELIGIBILITY_RESPONSE_BENEFIT_BALANCE__NAME, oldName, newName);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setName(org.hl7.fhir.String newName) {
		if (newName != name) {
			NotificationChain msgs = null;
			if (name != null)
				msgs = ((InternalEObject)name).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FhirPackage.ELIGIBILITY_RESPONSE_BENEFIT_BALANCE__NAME, null, msgs);
			if (newName != null)
				msgs = ((InternalEObject)newName).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FhirPackage.ELIGIBILITY_RESPONSE_BENEFIT_BALANCE__NAME, null, msgs);
			msgs = basicSetName(newName, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FhirPackage.ELIGIBILITY_RESPONSE_BENEFIT_BALANCE__NAME, newName, newName));
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
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FhirPackage.ELIGIBILITY_RESPONSE_BENEFIT_BALANCE__DESCRIPTION, oldDescription, newDescription);
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
				msgs = ((InternalEObject)description).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FhirPackage.ELIGIBILITY_RESPONSE_BENEFIT_BALANCE__DESCRIPTION, null, msgs);
			if (newDescription != null)
				msgs = ((InternalEObject)newDescription).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FhirPackage.ELIGIBILITY_RESPONSE_BENEFIT_BALANCE__DESCRIPTION, null, msgs);
			msgs = basicSetDescription(newDescription, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FhirPackage.ELIGIBILITY_RESPONSE_BENEFIT_BALANCE__DESCRIPTION, newDescription, newDescription));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CodeableConcept getNetwork() {
		return network;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetNetwork(CodeableConcept newNetwork, NotificationChain msgs) {
		CodeableConcept oldNetwork = network;
		network = newNetwork;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FhirPackage.ELIGIBILITY_RESPONSE_BENEFIT_BALANCE__NETWORK, oldNetwork, newNetwork);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setNetwork(CodeableConcept newNetwork) {
		if (newNetwork != network) {
			NotificationChain msgs = null;
			if (network != null)
				msgs = ((InternalEObject)network).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FhirPackage.ELIGIBILITY_RESPONSE_BENEFIT_BALANCE__NETWORK, null, msgs);
			if (newNetwork != null)
				msgs = ((InternalEObject)newNetwork).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FhirPackage.ELIGIBILITY_RESPONSE_BENEFIT_BALANCE__NETWORK, null, msgs);
			msgs = basicSetNetwork(newNetwork, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FhirPackage.ELIGIBILITY_RESPONSE_BENEFIT_BALANCE__NETWORK, newNetwork, newNetwork));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CodeableConcept getUnit() {
		return unit;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetUnit(CodeableConcept newUnit, NotificationChain msgs) {
		CodeableConcept oldUnit = unit;
		unit = newUnit;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FhirPackage.ELIGIBILITY_RESPONSE_BENEFIT_BALANCE__UNIT, oldUnit, newUnit);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setUnit(CodeableConcept newUnit) {
		if (newUnit != unit) {
			NotificationChain msgs = null;
			if (unit != null)
				msgs = ((InternalEObject)unit).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FhirPackage.ELIGIBILITY_RESPONSE_BENEFIT_BALANCE__UNIT, null, msgs);
			if (newUnit != null)
				msgs = ((InternalEObject)newUnit).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FhirPackage.ELIGIBILITY_RESPONSE_BENEFIT_BALANCE__UNIT, null, msgs);
			msgs = basicSetUnit(newUnit, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FhirPackage.ELIGIBILITY_RESPONSE_BENEFIT_BALANCE__UNIT, newUnit, newUnit));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CodeableConcept getTerm() {
		return term;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetTerm(CodeableConcept newTerm, NotificationChain msgs) {
		CodeableConcept oldTerm = term;
		term = newTerm;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FhirPackage.ELIGIBILITY_RESPONSE_BENEFIT_BALANCE__TERM, oldTerm, newTerm);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setTerm(CodeableConcept newTerm) {
		if (newTerm != term) {
			NotificationChain msgs = null;
			if (term != null)
				msgs = ((InternalEObject)term).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FhirPackage.ELIGIBILITY_RESPONSE_BENEFIT_BALANCE__TERM, null, msgs);
			if (newTerm != null)
				msgs = ((InternalEObject)newTerm).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FhirPackage.ELIGIBILITY_RESPONSE_BENEFIT_BALANCE__TERM, null, msgs);
			msgs = basicSetTerm(newTerm, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FhirPackage.ELIGIBILITY_RESPONSE_BENEFIT_BALANCE__TERM, newTerm, newTerm));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@XmlElement
	public List<EligibilityResponseFinancial> getFinancial() {
		if (financial == null) {
			financial = new EObjectContainmentEList<EligibilityResponseFinancial>(EligibilityResponseFinancial.class, this, FhirPackage.ELIGIBILITY_RESPONSE_BENEFIT_BALANCE__FINANCIAL);
		}
		return financial;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case FhirPackage.ELIGIBILITY_RESPONSE_BENEFIT_BALANCE__CATEGORY:
				return basicSetCategory(null, msgs);
			case FhirPackage.ELIGIBILITY_RESPONSE_BENEFIT_BALANCE__SUB_CATEGORY:
				return basicSetSubCategory(null, msgs);
			case FhirPackage.ELIGIBILITY_RESPONSE_BENEFIT_BALANCE__EXCLUDED:
				return basicSetExcluded(null, msgs);
			case FhirPackage.ELIGIBILITY_RESPONSE_BENEFIT_BALANCE__NAME:
				return basicSetName(null, msgs);
			case FhirPackage.ELIGIBILITY_RESPONSE_BENEFIT_BALANCE__DESCRIPTION:
				return basicSetDescription(null, msgs);
			case FhirPackage.ELIGIBILITY_RESPONSE_BENEFIT_BALANCE__NETWORK:
				return basicSetNetwork(null, msgs);
			case FhirPackage.ELIGIBILITY_RESPONSE_BENEFIT_BALANCE__UNIT:
				return basicSetUnit(null, msgs);
			case FhirPackage.ELIGIBILITY_RESPONSE_BENEFIT_BALANCE__TERM:
				return basicSetTerm(null, msgs);
			case FhirPackage.ELIGIBILITY_RESPONSE_BENEFIT_BALANCE__FINANCIAL:
				return ((InternalEList<?>)getFinancial()).basicRemove(otherEnd, msgs);
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
			case FhirPackage.ELIGIBILITY_RESPONSE_BENEFIT_BALANCE__CATEGORY:
				return getCategory();
			case FhirPackage.ELIGIBILITY_RESPONSE_BENEFIT_BALANCE__SUB_CATEGORY:
				return getSubCategory();
			case FhirPackage.ELIGIBILITY_RESPONSE_BENEFIT_BALANCE__EXCLUDED:
				return getExcluded();
			case FhirPackage.ELIGIBILITY_RESPONSE_BENEFIT_BALANCE__NAME:
				return getName();
			case FhirPackage.ELIGIBILITY_RESPONSE_BENEFIT_BALANCE__DESCRIPTION:
				return getDescription();
			case FhirPackage.ELIGIBILITY_RESPONSE_BENEFIT_BALANCE__NETWORK:
				return getNetwork();
			case FhirPackage.ELIGIBILITY_RESPONSE_BENEFIT_BALANCE__UNIT:
				return getUnit();
			case FhirPackage.ELIGIBILITY_RESPONSE_BENEFIT_BALANCE__TERM:
				return getTerm();
			case FhirPackage.ELIGIBILITY_RESPONSE_BENEFIT_BALANCE__FINANCIAL:
				return getFinancial();
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
			case FhirPackage.ELIGIBILITY_RESPONSE_BENEFIT_BALANCE__CATEGORY:
				setCategory((CodeableConcept)newValue);
				return;
			case FhirPackage.ELIGIBILITY_RESPONSE_BENEFIT_BALANCE__SUB_CATEGORY:
				setSubCategory((CodeableConcept)newValue);
				return;
			case FhirPackage.ELIGIBILITY_RESPONSE_BENEFIT_BALANCE__EXCLUDED:
				setExcluded((org.hl7.fhir.Boolean)newValue);
				return;
			case FhirPackage.ELIGIBILITY_RESPONSE_BENEFIT_BALANCE__NAME:
				setName((org.hl7.fhir.String)newValue);
				return;
			case FhirPackage.ELIGIBILITY_RESPONSE_BENEFIT_BALANCE__DESCRIPTION:
				setDescription((org.hl7.fhir.String)newValue);
				return;
			case FhirPackage.ELIGIBILITY_RESPONSE_BENEFIT_BALANCE__NETWORK:
				setNetwork((CodeableConcept)newValue);
				return;
			case FhirPackage.ELIGIBILITY_RESPONSE_BENEFIT_BALANCE__UNIT:
				setUnit((CodeableConcept)newValue);
				return;
			case FhirPackage.ELIGIBILITY_RESPONSE_BENEFIT_BALANCE__TERM:
				setTerm((CodeableConcept)newValue);
				return;
			case FhirPackage.ELIGIBILITY_RESPONSE_BENEFIT_BALANCE__FINANCIAL:
				getFinancial().clear();
				getFinancial().addAll((Collection<? extends EligibilityResponseFinancial>)newValue);
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
			case FhirPackage.ELIGIBILITY_RESPONSE_BENEFIT_BALANCE__CATEGORY:
				setCategory((CodeableConcept)null);
				return;
			case FhirPackage.ELIGIBILITY_RESPONSE_BENEFIT_BALANCE__SUB_CATEGORY:
				setSubCategory((CodeableConcept)null);
				return;
			case FhirPackage.ELIGIBILITY_RESPONSE_BENEFIT_BALANCE__EXCLUDED:
				setExcluded((org.hl7.fhir.Boolean)null);
				return;
			case FhirPackage.ELIGIBILITY_RESPONSE_BENEFIT_BALANCE__NAME:
				setName((org.hl7.fhir.String)null);
				return;
			case FhirPackage.ELIGIBILITY_RESPONSE_BENEFIT_BALANCE__DESCRIPTION:
				setDescription((org.hl7.fhir.String)null);
				return;
			case FhirPackage.ELIGIBILITY_RESPONSE_BENEFIT_BALANCE__NETWORK:
				setNetwork((CodeableConcept)null);
				return;
			case FhirPackage.ELIGIBILITY_RESPONSE_BENEFIT_BALANCE__UNIT:
				setUnit((CodeableConcept)null);
				return;
			case FhirPackage.ELIGIBILITY_RESPONSE_BENEFIT_BALANCE__TERM:
				setTerm((CodeableConcept)null);
				return;
			case FhirPackage.ELIGIBILITY_RESPONSE_BENEFIT_BALANCE__FINANCIAL:
				getFinancial().clear();
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
			case FhirPackage.ELIGIBILITY_RESPONSE_BENEFIT_BALANCE__CATEGORY:
				return category != null;
			case FhirPackage.ELIGIBILITY_RESPONSE_BENEFIT_BALANCE__SUB_CATEGORY:
				return subCategory != null;
			case FhirPackage.ELIGIBILITY_RESPONSE_BENEFIT_BALANCE__EXCLUDED:
				return excluded != null;
			case FhirPackage.ELIGIBILITY_RESPONSE_BENEFIT_BALANCE__NAME:
				return name != null;
			case FhirPackage.ELIGIBILITY_RESPONSE_BENEFIT_BALANCE__DESCRIPTION:
				return description != null;
			case FhirPackage.ELIGIBILITY_RESPONSE_BENEFIT_BALANCE__NETWORK:
				return network != null;
			case FhirPackage.ELIGIBILITY_RESPONSE_BENEFIT_BALANCE__UNIT:
				return unit != null;
			case FhirPackage.ELIGIBILITY_RESPONSE_BENEFIT_BALANCE__TERM:
				return term != null;
			case FhirPackage.ELIGIBILITY_RESPONSE_BENEFIT_BALANCE__FINANCIAL:
				return financial != null && !financial.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //EligibilityResponseBenefitBalanceImpl
