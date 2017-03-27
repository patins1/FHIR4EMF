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

import org.hl7.fhir.CodeableConcept;
import org.hl7.fhir.FhirPackage;
import org.hl7.fhir.MedicationBatch;
import org.hl7.fhir.MedicationContent;
import org.hl7.fhir.MedicationPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Medication Package</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.hl7.fhir.impl.MedicationPackageImpl#getContainer <em>Container</em>}</li>
 *   <li>{@link org.hl7.fhir.impl.MedicationPackageImpl#getContent <em>Content</em>}</li>
 *   <li>{@link org.hl7.fhir.impl.MedicationPackageImpl#getBatch <em>Batch</em>}</li>
 * </ul>
 *
 * @generated
 */
@XmlType(name = "MedicationPackage", namespace = "http://hl7.org/fhir")
@XmlRootElement(name = "fhir.MedicationPackage")
public class MedicationPackageImpl extends BackboneElementImpl implements MedicationPackage {
	/**
	 * The cached value of the '{@link #getContainer() <em>Container</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getContainer()
	 * @generated
	 * @ordered
	 */
	protected CodeableConcept container;

	/**
	 * The cached value of the '{@link #getContent() <em>Content</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getContent()
	 * @generated
	 * @ordered
	 */
	protected EList<MedicationContent> content;

	/**
	 * The cached value of the '{@link #getBatch() <em>Batch</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getBatch()
	 * @generated
	 * @ordered
	 */
	protected EList<MedicationBatch> batch;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected MedicationPackageImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return FhirPackage.eINSTANCE.getMedicationPackage();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CodeableConcept getContainer() {
		return container;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetContainer(CodeableConcept newContainer, NotificationChain msgs) {
		CodeableConcept oldContainer = container;
		container = newContainer;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FhirPackage.MEDICATION_PACKAGE__CONTAINER, oldContainer, newContainer);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setContainer(CodeableConcept newContainer) {
		if (newContainer != container) {
			NotificationChain msgs = null;
			if (container != null)
				msgs = ((InternalEObject)container).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FhirPackage.MEDICATION_PACKAGE__CONTAINER, null, msgs);
			if (newContainer != null)
				msgs = ((InternalEObject)newContainer).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FhirPackage.MEDICATION_PACKAGE__CONTAINER, null, msgs);
			msgs = basicSetContainer(newContainer, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FhirPackage.MEDICATION_PACKAGE__CONTAINER, newContainer, newContainer));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@XmlElement
	public List<MedicationContent> getContent() {
		if (content == null) {
			content = new EObjectContainmentEList<MedicationContent>(MedicationContent.class, this, FhirPackage.MEDICATION_PACKAGE__CONTENT);
		}
		return content;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@XmlElement
	public List<MedicationBatch> getBatch() {
		if (batch == null) {
			batch = new EObjectContainmentEList<MedicationBatch>(MedicationBatch.class, this, FhirPackage.MEDICATION_PACKAGE__BATCH);
		}
		return batch;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case FhirPackage.MEDICATION_PACKAGE__CONTAINER:
				return basicSetContainer(null, msgs);
			case FhirPackage.MEDICATION_PACKAGE__CONTENT:
				return ((InternalEList<?>)getContent()).basicRemove(otherEnd, msgs);
			case FhirPackage.MEDICATION_PACKAGE__BATCH:
				return ((InternalEList<?>)getBatch()).basicRemove(otherEnd, msgs);
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
			case FhirPackage.MEDICATION_PACKAGE__CONTAINER:
				return getContainer();
			case FhirPackage.MEDICATION_PACKAGE__CONTENT:
				return getContent();
			case FhirPackage.MEDICATION_PACKAGE__BATCH:
				return getBatch();
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
			case FhirPackage.MEDICATION_PACKAGE__CONTAINER:
				setContainer((CodeableConcept)newValue);
				return;
			case FhirPackage.MEDICATION_PACKAGE__CONTENT:
				getContent().clear();
				getContent().addAll((Collection<? extends MedicationContent>)newValue);
				return;
			case FhirPackage.MEDICATION_PACKAGE__BATCH:
				getBatch().clear();
				getBatch().addAll((Collection<? extends MedicationBatch>)newValue);
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
			case FhirPackage.MEDICATION_PACKAGE__CONTAINER:
				setContainer((CodeableConcept)null);
				return;
			case FhirPackage.MEDICATION_PACKAGE__CONTENT:
				getContent().clear();
				return;
			case FhirPackage.MEDICATION_PACKAGE__BATCH:
				getBatch().clear();
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
			case FhirPackage.MEDICATION_PACKAGE__CONTAINER:
				return container != null;
			case FhirPackage.MEDICATION_PACKAGE__CONTENT:
				return content != null && !content.isEmpty();
			case FhirPackage.MEDICATION_PACKAGE__BATCH:
				return batch != null && !batch.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //MedicationPackageImpl
