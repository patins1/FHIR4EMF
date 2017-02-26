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

import org.hl7.fhir.AdverseEventCausality;
import org.hl7.fhir.AdverseEventSuspectEntity;
import org.hl7.fhir.CodeableConcept;
import org.hl7.fhir.FhirPackage;
import org.hl7.fhir.Reference;
import org.hl7.fhir.jaxb.AdverseEventCausalityImplAdapter;
import org.hl7.fhir.jaxb.StringImplAdapter;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Adverse Event Suspect Entity</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.hl7.fhir.impl.AdverseEventSuspectEntityImpl#getInstance <em>Instance</em>}</li>
 *   <li>{@link org.hl7.fhir.impl.AdverseEventSuspectEntityImpl#getCausality <em>Causality</em>}</li>
 *   <li>{@link org.hl7.fhir.impl.AdverseEventSuspectEntityImpl#getCausalityAssessment <em>Causality Assessment</em>}</li>
 *   <li>{@link org.hl7.fhir.impl.AdverseEventSuspectEntityImpl#getCausalityProductRelatedness <em>Causality Product Relatedness</em>}</li>
 *   <li>{@link org.hl7.fhir.impl.AdverseEventSuspectEntityImpl#getCausalityMethod <em>Causality Method</em>}</li>
 *   <li>{@link org.hl7.fhir.impl.AdverseEventSuspectEntityImpl#getCausalityAuthor <em>Causality Author</em>}</li>
 *   <li>{@link org.hl7.fhir.impl.AdverseEventSuspectEntityImpl#getCausalityResult <em>Causality Result</em>}</li>
 * </ul>
 *
 * @generated
 */
@XmlType(name = "AdverseEventSuspectEntity", namespace = "http://hl7.org/fhir")
@XmlRootElement(name = "fhir.AdverseEventSuspectEntity")
public class AdverseEventSuspectEntityImpl extends BackboneElementImpl implements AdverseEventSuspectEntity {
	/**
	 * The cached value of the '{@link #getInstance() <em>Instance</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getInstance()
	 * @generated
	 * @ordered
	 */
	protected Reference instance;

	/**
	 * The cached value of the '{@link #getCausality() <em>Causality</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCausality()
	 * @generated
	 * @ordered
	 */
	protected AdverseEventCausality causality;

	/**
	 * The cached value of the '{@link #getCausalityAssessment() <em>Causality Assessment</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCausalityAssessment()
	 * @generated
	 * @ordered
	 */
	protected CodeableConcept causalityAssessment;

	/**
	 * The cached value of the '{@link #getCausalityProductRelatedness() <em>Causality Product Relatedness</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCausalityProductRelatedness()
	 * @generated
	 * @ordered
	 */
	protected org.hl7.fhir.String causalityProductRelatedness;

	/**
	 * The cached value of the '{@link #getCausalityMethod() <em>Causality Method</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCausalityMethod()
	 * @generated
	 * @ordered
	 */
	protected CodeableConcept causalityMethod;

	/**
	 * The cached value of the '{@link #getCausalityAuthor() <em>Causality Author</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCausalityAuthor()
	 * @generated
	 * @ordered
	 */
	protected Reference causalityAuthor;

	/**
	 * The cached value of the '{@link #getCausalityResult() <em>Causality Result</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCausalityResult()
	 * @generated
	 * @ordered
	 */
	protected CodeableConcept causalityResult;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected AdverseEventSuspectEntityImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return FhirPackage.eINSTANCE.getAdverseEventSuspectEntity();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@XmlElement(required = true)
	public Reference getInstance() {
		return instance;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetInstance(Reference newInstance, NotificationChain msgs) {
		Reference oldInstance = instance;
		instance = newInstance;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FhirPackage.ADVERSE_EVENT_SUSPECT_ENTITY__INSTANCE, oldInstance, newInstance);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setInstance(Reference newInstance) {
		if (newInstance != instance) {
			NotificationChain msgs = null;
			if (instance != null)
				msgs = ((InternalEObject)instance).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FhirPackage.ADVERSE_EVENT_SUSPECT_ENTITY__INSTANCE, null, msgs);
			if (newInstance != null)
				msgs = ((InternalEObject)newInstance).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FhirPackage.ADVERSE_EVENT_SUSPECT_ENTITY__INSTANCE, null, msgs);
			msgs = basicSetInstance(newInstance, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FhirPackage.ADVERSE_EVENT_SUSPECT_ENTITY__INSTANCE, newInstance, newInstance));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@XmlJavaTypeAdapter(AdverseEventCausalityImplAdapter.class)
	public AdverseEventCausality getCausality() {
		return causality;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetCausality(AdverseEventCausality newCausality, NotificationChain msgs) {
		AdverseEventCausality oldCausality = causality;
		causality = newCausality;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FhirPackage.ADVERSE_EVENT_SUSPECT_ENTITY__CAUSALITY, oldCausality, newCausality);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setCausality(AdverseEventCausality newCausality) {
		if (newCausality != causality) {
			NotificationChain msgs = null;
			if (causality != null)
				msgs = ((InternalEObject)causality).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FhirPackage.ADVERSE_EVENT_SUSPECT_ENTITY__CAUSALITY, null, msgs);
			if (newCausality != null)
				msgs = ((InternalEObject)newCausality).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FhirPackage.ADVERSE_EVENT_SUSPECT_ENTITY__CAUSALITY, null, msgs);
			msgs = basicSetCausality(newCausality, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FhirPackage.ADVERSE_EVENT_SUSPECT_ENTITY__CAUSALITY, newCausality, newCausality));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CodeableConcept getCausalityAssessment() {
		return causalityAssessment;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetCausalityAssessment(CodeableConcept newCausalityAssessment, NotificationChain msgs) {
		CodeableConcept oldCausalityAssessment = causalityAssessment;
		causalityAssessment = newCausalityAssessment;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FhirPackage.ADVERSE_EVENT_SUSPECT_ENTITY__CAUSALITY_ASSESSMENT, oldCausalityAssessment, newCausalityAssessment);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setCausalityAssessment(CodeableConcept newCausalityAssessment) {
		if (newCausalityAssessment != causalityAssessment) {
			NotificationChain msgs = null;
			if (causalityAssessment != null)
				msgs = ((InternalEObject)causalityAssessment).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FhirPackage.ADVERSE_EVENT_SUSPECT_ENTITY__CAUSALITY_ASSESSMENT, null, msgs);
			if (newCausalityAssessment != null)
				msgs = ((InternalEObject)newCausalityAssessment).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FhirPackage.ADVERSE_EVENT_SUSPECT_ENTITY__CAUSALITY_ASSESSMENT, null, msgs);
			msgs = basicSetCausalityAssessment(newCausalityAssessment, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FhirPackage.ADVERSE_EVENT_SUSPECT_ENTITY__CAUSALITY_ASSESSMENT, newCausalityAssessment, newCausalityAssessment));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@XmlJavaTypeAdapter(StringImplAdapter.class)
	public org.hl7.fhir.String getCausalityProductRelatedness() {
		return causalityProductRelatedness;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetCausalityProductRelatedness(org.hl7.fhir.String newCausalityProductRelatedness, NotificationChain msgs) {
		org.hl7.fhir.String oldCausalityProductRelatedness = causalityProductRelatedness;
		causalityProductRelatedness = newCausalityProductRelatedness;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FhirPackage.ADVERSE_EVENT_SUSPECT_ENTITY__CAUSALITY_PRODUCT_RELATEDNESS, oldCausalityProductRelatedness, newCausalityProductRelatedness);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setCausalityProductRelatedness(org.hl7.fhir.String newCausalityProductRelatedness) {
		if (newCausalityProductRelatedness != causalityProductRelatedness) {
			NotificationChain msgs = null;
			if (causalityProductRelatedness != null)
				msgs = ((InternalEObject)causalityProductRelatedness).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FhirPackage.ADVERSE_EVENT_SUSPECT_ENTITY__CAUSALITY_PRODUCT_RELATEDNESS, null, msgs);
			if (newCausalityProductRelatedness != null)
				msgs = ((InternalEObject)newCausalityProductRelatedness).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FhirPackage.ADVERSE_EVENT_SUSPECT_ENTITY__CAUSALITY_PRODUCT_RELATEDNESS, null, msgs);
			msgs = basicSetCausalityProductRelatedness(newCausalityProductRelatedness, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FhirPackage.ADVERSE_EVENT_SUSPECT_ENTITY__CAUSALITY_PRODUCT_RELATEDNESS, newCausalityProductRelatedness, newCausalityProductRelatedness));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CodeableConcept getCausalityMethod() {
		return causalityMethod;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetCausalityMethod(CodeableConcept newCausalityMethod, NotificationChain msgs) {
		CodeableConcept oldCausalityMethod = causalityMethod;
		causalityMethod = newCausalityMethod;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FhirPackage.ADVERSE_EVENT_SUSPECT_ENTITY__CAUSALITY_METHOD, oldCausalityMethod, newCausalityMethod);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setCausalityMethod(CodeableConcept newCausalityMethod) {
		if (newCausalityMethod != causalityMethod) {
			NotificationChain msgs = null;
			if (causalityMethod != null)
				msgs = ((InternalEObject)causalityMethod).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FhirPackage.ADVERSE_EVENT_SUSPECT_ENTITY__CAUSALITY_METHOD, null, msgs);
			if (newCausalityMethod != null)
				msgs = ((InternalEObject)newCausalityMethod).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FhirPackage.ADVERSE_EVENT_SUSPECT_ENTITY__CAUSALITY_METHOD, null, msgs);
			msgs = basicSetCausalityMethod(newCausalityMethod, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FhirPackage.ADVERSE_EVENT_SUSPECT_ENTITY__CAUSALITY_METHOD, newCausalityMethod, newCausalityMethod));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Reference getCausalityAuthor() {
		return causalityAuthor;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetCausalityAuthor(Reference newCausalityAuthor, NotificationChain msgs) {
		Reference oldCausalityAuthor = causalityAuthor;
		causalityAuthor = newCausalityAuthor;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FhirPackage.ADVERSE_EVENT_SUSPECT_ENTITY__CAUSALITY_AUTHOR, oldCausalityAuthor, newCausalityAuthor);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setCausalityAuthor(Reference newCausalityAuthor) {
		if (newCausalityAuthor != causalityAuthor) {
			NotificationChain msgs = null;
			if (causalityAuthor != null)
				msgs = ((InternalEObject)causalityAuthor).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FhirPackage.ADVERSE_EVENT_SUSPECT_ENTITY__CAUSALITY_AUTHOR, null, msgs);
			if (newCausalityAuthor != null)
				msgs = ((InternalEObject)newCausalityAuthor).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FhirPackage.ADVERSE_EVENT_SUSPECT_ENTITY__CAUSALITY_AUTHOR, null, msgs);
			msgs = basicSetCausalityAuthor(newCausalityAuthor, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FhirPackage.ADVERSE_EVENT_SUSPECT_ENTITY__CAUSALITY_AUTHOR, newCausalityAuthor, newCausalityAuthor));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CodeableConcept getCausalityResult() {
		return causalityResult;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetCausalityResult(CodeableConcept newCausalityResult, NotificationChain msgs) {
		CodeableConcept oldCausalityResult = causalityResult;
		causalityResult = newCausalityResult;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FhirPackage.ADVERSE_EVENT_SUSPECT_ENTITY__CAUSALITY_RESULT, oldCausalityResult, newCausalityResult);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setCausalityResult(CodeableConcept newCausalityResult) {
		if (newCausalityResult != causalityResult) {
			NotificationChain msgs = null;
			if (causalityResult != null)
				msgs = ((InternalEObject)causalityResult).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FhirPackage.ADVERSE_EVENT_SUSPECT_ENTITY__CAUSALITY_RESULT, null, msgs);
			if (newCausalityResult != null)
				msgs = ((InternalEObject)newCausalityResult).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FhirPackage.ADVERSE_EVENT_SUSPECT_ENTITY__CAUSALITY_RESULT, null, msgs);
			msgs = basicSetCausalityResult(newCausalityResult, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FhirPackage.ADVERSE_EVENT_SUSPECT_ENTITY__CAUSALITY_RESULT, newCausalityResult, newCausalityResult));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case FhirPackage.ADVERSE_EVENT_SUSPECT_ENTITY__INSTANCE:
				return basicSetInstance(null, msgs);
			case FhirPackage.ADVERSE_EVENT_SUSPECT_ENTITY__CAUSALITY:
				return basicSetCausality(null, msgs);
			case FhirPackage.ADVERSE_EVENT_SUSPECT_ENTITY__CAUSALITY_ASSESSMENT:
				return basicSetCausalityAssessment(null, msgs);
			case FhirPackage.ADVERSE_EVENT_SUSPECT_ENTITY__CAUSALITY_PRODUCT_RELATEDNESS:
				return basicSetCausalityProductRelatedness(null, msgs);
			case FhirPackage.ADVERSE_EVENT_SUSPECT_ENTITY__CAUSALITY_METHOD:
				return basicSetCausalityMethod(null, msgs);
			case FhirPackage.ADVERSE_EVENT_SUSPECT_ENTITY__CAUSALITY_AUTHOR:
				return basicSetCausalityAuthor(null, msgs);
			case FhirPackage.ADVERSE_EVENT_SUSPECT_ENTITY__CAUSALITY_RESULT:
				return basicSetCausalityResult(null, msgs);
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
			case FhirPackage.ADVERSE_EVENT_SUSPECT_ENTITY__INSTANCE:
				return getInstance();
			case FhirPackage.ADVERSE_EVENT_SUSPECT_ENTITY__CAUSALITY:
				return getCausality();
			case FhirPackage.ADVERSE_EVENT_SUSPECT_ENTITY__CAUSALITY_ASSESSMENT:
				return getCausalityAssessment();
			case FhirPackage.ADVERSE_EVENT_SUSPECT_ENTITY__CAUSALITY_PRODUCT_RELATEDNESS:
				return getCausalityProductRelatedness();
			case FhirPackage.ADVERSE_EVENT_SUSPECT_ENTITY__CAUSALITY_METHOD:
				return getCausalityMethod();
			case FhirPackage.ADVERSE_EVENT_SUSPECT_ENTITY__CAUSALITY_AUTHOR:
				return getCausalityAuthor();
			case FhirPackage.ADVERSE_EVENT_SUSPECT_ENTITY__CAUSALITY_RESULT:
				return getCausalityResult();
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
			case FhirPackage.ADVERSE_EVENT_SUSPECT_ENTITY__INSTANCE:
				setInstance((Reference)newValue);
				return;
			case FhirPackage.ADVERSE_EVENT_SUSPECT_ENTITY__CAUSALITY:
				setCausality((AdverseEventCausality)newValue);
				return;
			case FhirPackage.ADVERSE_EVENT_SUSPECT_ENTITY__CAUSALITY_ASSESSMENT:
				setCausalityAssessment((CodeableConcept)newValue);
				return;
			case FhirPackage.ADVERSE_EVENT_SUSPECT_ENTITY__CAUSALITY_PRODUCT_RELATEDNESS:
				setCausalityProductRelatedness((org.hl7.fhir.String)newValue);
				return;
			case FhirPackage.ADVERSE_EVENT_SUSPECT_ENTITY__CAUSALITY_METHOD:
				setCausalityMethod((CodeableConcept)newValue);
				return;
			case FhirPackage.ADVERSE_EVENT_SUSPECT_ENTITY__CAUSALITY_AUTHOR:
				setCausalityAuthor((Reference)newValue);
				return;
			case FhirPackage.ADVERSE_EVENT_SUSPECT_ENTITY__CAUSALITY_RESULT:
				setCausalityResult((CodeableConcept)newValue);
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
			case FhirPackage.ADVERSE_EVENT_SUSPECT_ENTITY__INSTANCE:
				setInstance((Reference)null);
				return;
			case FhirPackage.ADVERSE_EVENT_SUSPECT_ENTITY__CAUSALITY:
				setCausality((AdverseEventCausality)null);
				return;
			case FhirPackage.ADVERSE_EVENT_SUSPECT_ENTITY__CAUSALITY_ASSESSMENT:
				setCausalityAssessment((CodeableConcept)null);
				return;
			case FhirPackage.ADVERSE_EVENT_SUSPECT_ENTITY__CAUSALITY_PRODUCT_RELATEDNESS:
				setCausalityProductRelatedness((org.hl7.fhir.String)null);
				return;
			case FhirPackage.ADVERSE_EVENT_SUSPECT_ENTITY__CAUSALITY_METHOD:
				setCausalityMethod((CodeableConcept)null);
				return;
			case FhirPackage.ADVERSE_EVENT_SUSPECT_ENTITY__CAUSALITY_AUTHOR:
				setCausalityAuthor((Reference)null);
				return;
			case FhirPackage.ADVERSE_EVENT_SUSPECT_ENTITY__CAUSALITY_RESULT:
				setCausalityResult((CodeableConcept)null);
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
			case FhirPackage.ADVERSE_EVENT_SUSPECT_ENTITY__INSTANCE:
				return instance != null;
			case FhirPackage.ADVERSE_EVENT_SUSPECT_ENTITY__CAUSALITY:
				return causality != null;
			case FhirPackage.ADVERSE_EVENT_SUSPECT_ENTITY__CAUSALITY_ASSESSMENT:
				return causalityAssessment != null;
			case FhirPackage.ADVERSE_EVENT_SUSPECT_ENTITY__CAUSALITY_PRODUCT_RELATEDNESS:
				return causalityProductRelatedness != null;
			case FhirPackage.ADVERSE_EVENT_SUSPECT_ENTITY__CAUSALITY_METHOD:
				return causalityMethod != null;
			case FhirPackage.ADVERSE_EVENT_SUSPECT_ENTITY__CAUSALITY_AUTHOR:
				return causalityAuthor != null;
			case FhirPackage.ADVERSE_EVENT_SUSPECT_ENTITY__CAUSALITY_RESULT:
				return causalityResult != null;
		}
		return super.eIsSet(featureID);
	}

} //AdverseEventSuspectEntityImpl
