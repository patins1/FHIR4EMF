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

import org.hl7.fhir.Decimal;
import org.hl7.fhir.FhirPackage;
import org.hl7.fhir.MeasureReportPopulation1;
import org.hl7.fhir.MeasureReportStratum;
import org.hl7.fhir.jaxb.DecimalImplAdapter;
import org.hl7.fhir.jaxb.StringImplAdapter;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Measure Report Stratum</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.hl7.fhir.impl.MeasureReportStratumImpl#getValue <em>Value</em>}</li>
 *   <li>{@link org.hl7.fhir.impl.MeasureReportStratumImpl#getPopulation <em>Population</em>}</li>
 *   <li>{@link org.hl7.fhir.impl.MeasureReportStratumImpl#getMeasureScore <em>Measure Score</em>}</li>
 * </ul>
 *
 * @generated
 */
@XmlType(name = "MeasureReportStratum", namespace = "http://hl7.org/fhir")
@XmlRootElement(name = "fhir.MeasureReportStratum")
public class MeasureReportStratumImpl extends BackboneElementImpl implements MeasureReportStratum {
	/**
	 * The cached value of the '{@link #getValue() <em>Value</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getValue()
	 * @generated
	 * @ordered
	 */
	protected org.hl7.fhir.String value;

	/**
	 * The cached value of the '{@link #getPopulation() <em>Population</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPopulation()
	 * @generated
	 * @ordered
	 */
	protected EList<MeasureReportPopulation1> population;

	/**
	 * The cached value of the '{@link #getMeasureScore() <em>Measure Score</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMeasureScore()
	 * @generated
	 * @ordered
	 */
	protected Decimal measureScore;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected MeasureReportStratumImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return FhirPackage.eINSTANCE.getMeasureReportStratum();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@XmlJavaTypeAdapter(StringImplAdapter.class)
	@XmlElement(required = true)
	public org.hl7.fhir.String getValue() {
		return value;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetValue(org.hl7.fhir.String newValue, NotificationChain msgs) {
		org.hl7.fhir.String oldValue = value;
		value = newValue;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FhirPackage.MEASURE_REPORT_STRATUM__VALUE, oldValue, newValue);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setValue(org.hl7.fhir.String newValue) {
		if (newValue != value) {
			NotificationChain msgs = null;
			if (value != null)
				msgs = ((InternalEObject)value).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FhirPackage.MEASURE_REPORT_STRATUM__VALUE, null, msgs);
			if (newValue != null)
				msgs = ((InternalEObject)newValue).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FhirPackage.MEASURE_REPORT_STRATUM__VALUE, null, msgs);
			msgs = basicSetValue(newValue, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FhirPackage.MEASURE_REPORT_STRATUM__VALUE, newValue, newValue));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@XmlElement
	public List<MeasureReportPopulation1> getPopulation() {
		if (population == null) {
			population = new EObjectContainmentEList<MeasureReportPopulation1>(MeasureReportPopulation1.class, this, FhirPackage.MEASURE_REPORT_STRATUM__POPULATION);
		}
		return population;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@XmlJavaTypeAdapter(DecimalImplAdapter.class)
	public Decimal getMeasureScore() {
		return measureScore;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetMeasureScore(Decimal newMeasureScore, NotificationChain msgs) {
		Decimal oldMeasureScore = measureScore;
		measureScore = newMeasureScore;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FhirPackage.MEASURE_REPORT_STRATUM__MEASURE_SCORE, oldMeasureScore, newMeasureScore);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setMeasureScore(Decimal newMeasureScore) {
		if (newMeasureScore != measureScore) {
			NotificationChain msgs = null;
			if (measureScore != null)
				msgs = ((InternalEObject)measureScore).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FhirPackage.MEASURE_REPORT_STRATUM__MEASURE_SCORE, null, msgs);
			if (newMeasureScore != null)
				msgs = ((InternalEObject)newMeasureScore).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FhirPackage.MEASURE_REPORT_STRATUM__MEASURE_SCORE, null, msgs);
			msgs = basicSetMeasureScore(newMeasureScore, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FhirPackage.MEASURE_REPORT_STRATUM__MEASURE_SCORE, newMeasureScore, newMeasureScore));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case FhirPackage.MEASURE_REPORT_STRATUM__VALUE:
				return basicSetValue(null, msgs);
			case FhirPackage.MEASURE_REPORT_STRATUM__POPULATION:
				return ((InternalEList<?>)getPopulation()).basicRemove(otherEnd, msgs);
			case FhirPackage.MEASURE_REPORT_STRATUM__MEASURE_SCORE:
				return basicSetMeasureScore(null, msgs);
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
			case FhirPackage.MEASURE_REPORT_STRATUM__VALUE:
				return getValue();
			case FhirPackage.MEASURE_REPORT_STRATUM__POPULATION:
				return getPopulation();
			case FhirPackage.MEASURE_REPORT_STRATUM__MEASURE_SCORE:
				return getMeasureScore();
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
			case FhirPackage.MEASURE_REPORT_STRATUM__VALUE:
				setValue((org.hl7.fhir.String)newValue);
				return;
			case FhirPackage.MEASURE_REPORT_STRATUM__POPULATION:
				getPopulation().clear();
				getPopulation().addAll((Collection<? extends MeasureReportPopulation1>)newValue);
				return;
			case FhirPackage.MEASURE_REPORT_STRATUM__MEASURE_SCORE:
				setMeasureScore((Decimal)newValue);
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
			case FhirPackage.MEASURE_REPORT_STRATUM__VALUE:
				setValue((org.hl7.fhir.String)null);
				return;
			case FhirPackage.MEASURE_REPORT_STRATUM__POPULATION:
				getPopulation().clear();
				return;
			case FhirPackage.MEASURE_REPORT_STRATUM__MEASURE_SCORE:
				setMeasureScore((Decimal)null);
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
			case FhirPackage.MEASURE_REPORT_STRATUM__VALUE:
				return value != null;
			case FhirPackage.MEASURE_REPORT_STRATUM__POPULATION:
				return population != null && !population.isEmpty();
			case FhirPackage.MEASURE_REPORT_STRATUM__MEASURE_SCORE:
				return measureScore != null;
		}
		return super.eIsSet(featureID);
	}

} //MeasureReportStratumImpl
