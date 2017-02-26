/**
 */
package org.hl7.fhir.impl;

import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;
import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.hl7.fhir.CodeableConcept;
import org.hl7.fhir.Date;
import org.hl7.fhir.Duration;
import org.hl7.fhir.FhirPackage;
import org.hl7.fhir.GoalTarget;
import org.hl7.fhir.Quantity;
import org.hl7.fhir.Range;
import org.hl7.fhir.jaxb.DateImplAdapter;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Goal Target</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.hl7.fhir.impl.GoalTargetImpl#getMeasure <em>Measure</em>}</li>
 *   <li>{@link org.hl7.fhir.impl.GoalTargetImpl#getDetailQuantity <em>Detail Quantity</em>}</li>
 *   <li>{@link org.hl7.fhir.impl.GoalTargetImpl#getDetailRange <em>Detail Range</em>}</li>
 *   <li>{@link org.hl7.fhir.impl.GoalTargetImpl#getDetailCodeableConcept <em>Detail Codeable Concept</em>}</li>
 *   <li>{@link org.hl7.fhir.impl.GoalTargetImpl#getDueDate <em>Due Date</em>}</li>
 *   <li>{@link org.hl7.fhir.impl.GoalTargetImpl#getDueDuration <em>Due Duration</em>}</li>
 * </ul>
 *
 * @generated
 */
@XmlType(name = "GoalTarget", namespace = "http://hl7.org/fhir")
@XmlRootElement(name = "fhir.GoalTarget")
public class GoalTargetImpl extends BackboneElementImpl implements GoalTarget {
	/**
	 * The cached value of the '{@link #getMeasure() <em>Measure</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMeasure()
	 * @generated
	 * @ordered
	 */
	protected CodeableConcept measure;

	/**
	 * The cached value of the '{@link #getDetailQuantity() <em>Detail Quantity</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDetailQuantity()
	 * @generated
	 * @ordered
	 */
	protected Quantity detailQuantity;

	/**
	 * The cached value of the '{@link #getDetailRange() <em>Detail Range</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDetailRange()
	 * @generated
	 * @ordered
	 */
	protected Range detailRange;

	/**
	 * The cached value of the '{@link #getDetailCodeableConcept() <em>Detail Codeable Concept</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDetailCodeableConcept()
	 * @generated
	 * @ordered
	 */
	protected CodeableConcept detailCodeableConcept;

	/**
	 * The cached value of the '{@link #getDueDate() <em>Due Date</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDueDate()
	 * @generated
	 * @ordered
	 */
	protected Date dueDate;

	/**
	 * The cached value of the '{@link #getDueDuration() <em>Due Duration</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDueDuration()
	 * @generated
	 * @ordered
	 */
	protected Duration dueDuration;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected GoalTargetImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return FhirPackage.eINSTANCE.getGoalTarget();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CodeableConcept getMeasure() {
		return measure;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetMeasure(CodeableConcept newMeasure, NotificationChain msgs) {
		CodeableConcept oldMeasure = measure;
		measure = newMeasure;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FhirPackage.GOAL_TARGET__MEASURE, oldMeasure, newMeasure);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setMeasure(CodeableConcept newMeasure) {
		if (newMeasure != measure) {
			NotificationChain msgs = null;
			if (measure != null)
				msgs = ((InternalEObject)measure).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FhirPackage.GOAL_TARGET__MEASURE, null, msgs);
			if (newMeasure != null)
				msgs = ((InternalEObject)newMeasure).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FhirPackage.GOAL_TARGET__MEASURE, null, msgs);
			msgs = basicSetMeasure(newMeasure, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FhirPackage.GOAL_TARGET__MEASURE, newMeasure, newMeasure));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Quantity getDetailQuantity() {
		return detailQuantity;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetDetailQuantity(Quantity newDetailQuantity, NotificationChain msgs) {
		Quantity oldDetailQuantity = detailQuantity;
		detailQuantity = newDetailQuantity;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FhirPackage.GOAL_TARGET__DETAIL_QUANTITY, oldDetailQuantity, newDetailQuantity);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setDetailQuantity(Quantity newDetailQuantity) {
		if (newDetailQuantity != detailQuantity) {
			NotificationChain msgs = null;
			if (detailQuantity != null)
				msgs = ((InternalEObject)detailQuantity).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FhirPackage.GOAL_TARGET__DETAIL_QUANTITY, null, msgs);
			if (newDetailQuantity != null)
				msgs = ((InternalEObject)newDetailQuantity).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FhirPackage.GOAL_TARGET__DETAIL_QUANTITY, null, msgs);
			msgs = basicSetDetailQuantity(newDetailQuantity, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FhirPackage.GOAL_TARGET__DETAIL_QUANTITY, newDetailQuantity, newDetailQuantity));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Range getDetailRange() {
		return detailRange;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetDetailRange(Range newDetailRange, NotificationChain msgs) {
		Range oldDetailRange = detailRange;
		detailRange = newDetailRange;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FhirPackage.GOAL_TARGET__DETAIL_RANGE, oldDetailRange, newDetailRange);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setDetailRange(Range newDetailRange) {
		if (newDetailRange != detailRange) {
			NotificationChain msgs = null;
			if (detailRange != null)
				msgs = ((InternalEObject)detailRange).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FhirPackage.GOAL_TARGET__DETAIL_RANGE, null, msgs);
			if (newDetailRange != null)
				msgs = ((InternalEObject)newDetailRange).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FhirPackage.GOAL_TARGET__DETAIL_RANGE, null, msgs);
			msgs = basicSetDetailRange(newDetailRange, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FhirPackage.GOAL_TARGET__DETAIL_RANGE, newDetailRange, newDetailRange));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CodeableConcept getDetailCodeableConcept() {
		return detailCodeableConcept;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetDetailCodeableConcept(CodeableConcept newDetailCodeableConcept, NotificationChain msgs) {
		CodeableConcept oldDetailCodeableConcept = detailCodeableConcept;
		detailCodeableConcept = newDetailCodeableConcept;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FhirPackage.GOAL_TARGET__DETAIL_CODEABLE_CONCEPT, oldDetailCodeableConcept, newDetailCodeableConcept);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setDetailCodeableConcept(CodeableConcept newDetailCodeableConcept) {
		if (newDetailCodeableConcept != detailCodeableConcept) {
			NotificationChain msgs = null;
			if (detailCodeableConcept != null)
				msgs = ((InternalEObject)detailCodeableConcept).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FhirPackage.GOAL_TARGET__DETAIL_CODEABLE_CONCEPT, null, msgs);
			if (newDetailCodeableConcept != null)
				msgs = ((InternalEObject)newDetailCodeableConcept).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FhirPackage.GOAL_TARGET__DETAIL_CODEABLE_CONCEPT, null, msgs);
			msgs = basicSetDetailCodeableConcept(newDetailCodeableConcept, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FhirPackage.GOAL_TARGET__DETAIL_CODEABLE_CONCEPT, newDetailCodeableConcept, newDetailCodeableConcept));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@XmlJavaTypeAdapter(DateImplAdapter.class)
	public Date getDueDate() {
		return dueDate;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetDueDate(Date newDueDate, NotificationChain msgs) {
		Date oldDueDate = dueDate;
		dueDate = newDueDate;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FhirPackage.GOAL_TARGET__DUE_DATE, oldDueDate, newDueDate);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setDueDate(Date newDueDate) {
		if (newDueDate != dueDate) {
			NotificationChain msgs = null;
			if (dueDate != null)
				msgs = ((InternalEObject)dueDate).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FhirPackage.GOAL_TARGET__DUE_DATE, null, msgs);
			if (newDueDate != null)
				msgs = ((InternalEObject)newDueDate).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FhirPackage.GOAL_TARGET__DUE_DATE, null, msgs);
			msgs = basicSetDueDate(newDueDate, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FhirPackage.GOAL_TARGET__DUE_DATE, newDueDate, newDueDate));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Duration getDueDuration() {
		return dueDuration;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetDueDuration(Duration newDueDuration, NotificationChain msgs) {
		Duration oldDueDuration = dueDuration;
		dueDuration = newDueDuration;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FhirPackage.GOAL_TARGET__DUE_DURATION, oldDueDuration, newDueDuration);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setDueDuration(Duration newDueDuration) {
		if (newDueDuration != dueDuration) {
			NotificationChain msgs = null;
			if (dueDuration != null)
				msgs = ((InternalEObject)dueDuration).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FhirPackage.GOAL_TARGET__DUE_DURATION, null, msgs);
			if (newDueDuration != null)
				msgs = ((InternalEObject)newDueDuration).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FhirPackage.GOAL_TARGET__DUE_DURATION, null, msgs);
			msgs = basicSetDueDuration(newDueDuration, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FhirPackage.GOAL_TARGET__DUE_DURATION, newDueDuration, newDueDuration));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case FhirPackage.GOAL_TARGET__MEASURE:
				return basicSetMeasure(null, msgs);
			case FhirPackage.GOAL_TARGET__DETAIL_QUANTITY:
				return basicSetDetailQuantity(null, msgs);
			case FhirPackage.GOAL_TARGET__DETAIL_RANGE:
				return basicSetDetailRange(null, msgs);
			case FhirPackage.GOAL_TARGET__DETAIL_CODEABLE_CONCEPT:
				return basicSetDetailCodeableConcept(null, msgs);
			case FhirPackage.GOAL_TARGET__DUE_DATE:
				return basicSetDueDate(null, msgs);
			case FhirPackage.GOAL_TARGET__DUE_DURATION:
				return basicSetDueDuration(null, msgs);
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
			case FhirPackage.GOAL_TARGET__MEASURE:
				return getMeasure();
			case FhirPackage.GOAL_TARGET__DETAIL_QUANTITY:
				return getDetailQuantity();
			case FhirPackage.GOAL_TARGET__DETAIL_RANGE:
				return getDetailRange();
			case FhirPackage.GOAL_TARGET__DETAIL_CODEABLE_CONCEPT:
				return getDetailCodeableConcept();
			case FhirPackage.GOAL_TARGET__DUE_DATE:
				return getDueDate();
			case FhirPackage.GOAL_TARGET__DUE_DURATION:
				return getDueDuration();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case FhirPackage.GOAL_TARGET__MEASURE:
				setMeasure((CodeableConcept)newValue);
				return;
			case FhirPackage.GOAL_TARGET__DETAIL_QUANTITY:
				setDetailQuantity((Quantity)newValue);
				return;
			case FhirPackage.GOAL_TARGET__DETAIL_RANGE:
				setDetailRange((Range)newValue);
				return;
			case FhirPackage.GOAL_TARGET__DETAIL_CODEABLE_CONCEPT:
				setDetailCodeableConcept((CodeableConcept)newValue);
				return;
			case FhirPackage.GOAL_TARGET__DUE_DATE:
				setDueDate((Date)newValue);
				return;
			case FhirPackage.GOAL_TARGET__DUE_DURATION:
				setDueDuration((Duration)newValue);
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
			case FhirPackage.GOAL_TARGET__MEASURE:
				setMeasure((CodeableConcept)null);
				return;
			case FhirPackage.GOAL_TARGET__DETAIL_QUANTITY:
				setDetailQuantity((Quantity)null);
				return;
			case FhirPackage.GOAL_TARGET__DETAIL_RANGE:
				setDetailRange((Range)null);
				return;
			case FhirPackage.GOAL_TARGET__DETAIL_CODEABLE_CONCEPT:
				setDetailCodeableConcept((CodeableConcept)null);
				return;
			case FhirPackage.GOAL_TARGET__DUE_DATE:
				setDueDate((Date)null);
				return;
			case FhirPackage.GOAL_TARGET__DUE_DURATION:
				setDueDuration((Duration)null);
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
			case FhirPackage.GOAL_TARGET__MEASURE:
				return measure != null;
			case FhirPackage.GOAL_TARGET__DETAIL_QUANTITY:
				return detailQuantity != null;
			case FhirPackage.GOAL_TARGET__DETAIL_RANGE:
				return detailRange != null;
			case FhirPackage.GOAL_TARGET__DETAIL_CODEABLE_CONCEPT:
				return detailCodeableConcept != null;
			case FhirPackage.GOAL_TARGET__DUE_DATE:
				return dueDate != null;
			case FhirPackage.GOAL_TARGET__DUE_DURATION:
				return dueDuration != null;
		}
		return super.eIsSet(featureID);
	}

} //GoalTargetImpl
