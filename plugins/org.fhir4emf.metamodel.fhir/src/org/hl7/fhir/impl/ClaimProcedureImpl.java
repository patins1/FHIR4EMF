/**
 */
package org.hl7.fhir.impl;

import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;
import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.hl7.fhir.ClaimProcedure;
import org.hl7.fhir.CodeableConcept;
import org.hl7.fhir.DateTime;
import org.hl7.fhir.FhirPackage;
import org.hl7.fhir.PositiveInt;
import org.hl7.fhir.Reference;
import org.hl7.fhir.jaxb.DateTimeImplAdapter;
import org.hl7.fhir.jaxb.PositiveIntImplAdapter;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Claim Procedure</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.hl7.fhir.impl.ClaimProcedureImpl#getSequence <em>Sequence</em>}</li>
 *   <li>{@link org.hl7.fhir.impl.ClaimProcedureImpl#getDate <em>Date</em>}</li>
 *   <li>{@link org.hl7.fhir.impl.ClaimProcedureImpl#getProcedureCodeableConcept <em>Procedure Codeable Concept</em>}</li>
 *   <li>{@link org.hl7.fhir.impl.ClaimProcedureImpl#getProcedureReference <em>Procedure Reference</em>}</li>
 * </ul>
 *
 * @generated
 */
@XmlType(name = "ClaimProcedure", namespace = "http://hl7.org/fhir")
@XmlRootElement(name = "fhir.ClaimProcedure")
public class ClaimProcedureImpl extends BackboneElementImpl implements ClaimProcedure {
	/**
	 * The cached value of the '{@link #getSequence() <em>Sequence</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSequence()
	 * @generated
	 * @ordered
	 */
	protected PositiveInt sequence;

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
	 * The cached value of the '{@link #getProcedureCodeableConcept() <em>Procedure Codeable Concept</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getProcedureCodeableConcept()
	 * @generated
	 * @ordered
	 */
	protected CodeableConcept procedureCodeableConcept;

	/**
	 * The cached value of the '{@link #getProcedureReference() <em>Procedure Reference</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getProcedureReference()
	 * @generated
	 * @ordered
	 */
	protected Reference procedureReference;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ClaimProcedureImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return FhirPackage.eINSTANCE.getClaimProcedure();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@XmlJavaTypeAdapter(PositiveIntImplAdapter.class)
	@XmlElement(required = true)
	public PositiveInt getSequence() {
		return sequence;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetSequence(PositiveInt newSequence, NotificationChain msgs) {
		PositiveInt oldSequence = sequence;
		sequence = newSequence;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FhirPackage.CLAIM_PROCEDURE__SEQUENCE, oldSequence, newSequence);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setSequence(PositiveInt newSequence) {
		if (newSequence != sequence) {
			NotificationChain msgs = null;
			if (sequence != null)
				msgs = ((InternalEObject)sequence).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FhirPackage.CLAIM_PROCEDURE__SEQUENCE, null, msgs);
			if (newSequence != null)
				msgs = ((InternalEObject)newSequence).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FhirPackage.CLAIM_PROCEDURE__SEQUENCE, null, msgs);
			msgs = basicSetSequence(newSequence, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FhirPackage.CLAIM_PROCEDURE__SEQUENCE, newSequence, newSequence));
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
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FhirPackage.CLAIM_PROCEDURE__DATE, oldDate, newDate);
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
				msgs = ((InternalEObject)date).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FhirPackage.CLAIM_PROCEDURE__DATE, null, msgs);
			if (newDate != null)
				msgs = ((InternalEObject)newDate).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FhirPackage.CLAIM_PROCEDURE__DATE, null, msgs);
			msgs = basicSetDate(newDate, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FhirPackage.CLAIM_PROCEDURE__DATE, newDate, newDate));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CodeableConcept getProcedureCodeableConcept() {
		return procedureCodeableConcept;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetProcedureCodeableConcept(CodeableConcept newProcedureCodeableConcept, NotificationChain msgs) {
		CodeableConcept oldProcedureCodeableConcept = procedureCodeableConcept;
		procedureCodeableConcept = newProcedureCodeableConcept;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FhirPackage.CLAIM_PROCEDURE__PROCEDURE_CODEABLE_CONCEPT, oldProcedureCodeableConcept, newProcedureCodeableConcept);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setProcedureCodeableConcept(CodeableConcept newProcedureCodeableConcept) {
		if (newProcedureCodeableConcept != procedureCodeableConcept) {
			NotificationChain msgs = null;
			if (procedureCodeableConcept != null)
				msgs = ((InternalEObject)procedureCodeableConcept).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FhirPackage.CLAIM_PROCEDURE__PROCEDURE_CODEABLE_CONCEPT, null, msgs);
			if (newProcedureCodeableConcept != null)
				msgs = ((InternalEObject)newProcedureCodeableConcept).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FhirPackage.CLAIM_PROCEDURE__PROCEDURE_CODEABLE_CONCEPT, null, msgs);
			msgs = basicSetProcedureCodeableConcept(newProcedureCodeableConcept, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FhirPackage.CLAIM_PROCEDURE__PROCEDURE_CODEABLE_CONCEPT, newProcedureCodeableConcept, newProcedureCodeableConcept));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Reference getProcedureReference() {
		return procedureReference;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetProcedureReference(Reference newProcedureReference, NotificationChain msgs) {
		Reference oldProcedureReference = procedureReference;
		procedureReference = newProcedureReference;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FhirPackage.CLAIM_PROCEDURE__PROCEDURE_REFERENCE, oldProcedureReference, newProcedureReference);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setProcedureReference(Reference newProcedureReference) {
		if (newProcedureReference != procedureReference) {
			NotificationChain msgs = null;
			if (procedureReference != null)
				msgs = ((InternalEObject)procedureReference).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FhirPackage.CLAIM_PROCEDURE__PROCEDURE_REFERENCE, null, msgs);
			if (newProcedureReference != null)
				msgs = ((InternalEObject)newProcedureReference).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FhirPackage.CLAIM_PROCEDURE__PROCEDURE_REFERENCE, null, msgs);
			msgs = basicSetProcedureReference(newProcedureReference, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FhirPackage.CLAIM_PROCEDURE__PROCEDURE_REFERENCE, newProcedureReference, newProcedureReference));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case FhirPackage.CLAIM_PROCEDURE__SEQUENCE:
				return basicSetSequence(null, msgs);
			case FhirPackage.CLAIM_PROCEDURE__DATE:
				return basicSetDate(null, msgs);
			case FhirPackage.CLAIM_PROCEDURE__PROCEDURE_CODEABLE_CONCEPT:
				return basicSetProcedureCodeableConcept(null, msgs);
			case FhirPackage.CLAIM_PROCEDURE__PROCEDURE_REFERENCE:
				return basicSetProcedureReference(null, msgs);
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
			case FhirPackage.CLAIM_PROCEDURE__SEQUENCE:
				return getSequence();
			case FhirPackage.CLAIM_PROCEDURE__DATE:
				return getDate();
			case FhirPackage.CLAIM_PROCEDURE__PROCEDURE_CODEABLE_CONCEPT:
				return getProcedureCodeableConcept();
			case FhirPackage.CLAIM_PROCEDURE__PROCEDURE_REFERENCE:
				return getProcedureReference();
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
			case FhirPackage.CLAIM_PROCEDURE__SEQUENCE:
				setSequence((PositiveInt)newValue);
				return;
			case FhirPackage.CLAIM_PROCEDURE__DATE:
				setDate((DateTime)newValue);
				return;
			case FhirPackage.CLAIM_PROCEDURE__PROCEDURE_CODEABLE_CONCEPT:
				setProcedureCodeableConcept((CodeableConcept)newValue);
				return;
			case FhirPackage.CLAIM_PROCEDURE__PROCEDURE_REFERENCE:
				setProcedureReference((Reference)newValue);
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
			case FhirPackage.CLAIM_PROCEDURE__SEQUENCE:
				setSequence((PositiveInt)null);
				return;
			case FhirPackage.CLAIM_PROCEDURE__DATE:
				setDate((DateTime)null);
				return;
			case FhirPackage.CLAIM_PROCEDURE__PROCEDURE_CODEABLE_CONCEPT:
				setProcedureCodeableConcept((CodeableConcept)null);
				return;
			case FhirPackage.CLAIM_PROCEDURE__PROCEDURE_REFERENCE:
				setProcedureReference((Reference)null);
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
			case FhirPackage.CLAIM_PROCEDURE__SEQUENCE:
				return sequence != null;
			case FhirPackage.CLAIM_PROCEDURE__DATE:
				return date != null;
			case FhirPackage.CLAIM_PROCEDURE__PROCEDURE_CODEABLE_CONCEPT:
				return procedureCodeableConcept != null;
			case FhirPackage.CLAIM_PROCEDURE__PROCEDURE_REFERENCE:
				return procedureReference != null;
		}
		return super.eIsSet(featureID);
	}

} //ClaimProcedureImpl
