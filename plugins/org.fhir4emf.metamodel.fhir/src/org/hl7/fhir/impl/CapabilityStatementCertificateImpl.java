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

import org.hl7.fhir.Base64Binary;
import org.hl7.fhir.CapabilityStatementCertificate;
import org.hl7.fhir.Code;
import org.hl7.fhir.FhirPackage;
import org.hl7.fhir.jaxb.Base64BinaryImplAdapter;
import org.hl7.fhir.jaxb.CodeImplAdapter;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Capability Statement Certificate</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.hl7.fhir.impl.CapabilityStatementCertificateImpl#getType <em>Type</em>}</li>
 *   <li>{@link org.hl7.fhir.impl.CapabilityStatementCertificateImpl#getBlob <em>Blob</em>}</li>
 * </ul>
 *
 * @generated
 */
@XmlType(name = "CapabilityStatementCertificate", namespace = "http://hl7.org/fhir")
@XmlRootElement(name = "fhir.CapabilityStatementCertificate")
public class CapabilityStatementCertificateImpl extends BackboneElementImpl implements CapabilityStatementCertificate {
	/**
	 * The cached value of the '{@link #getType() <em>Type</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getType()
	 * @generated
	 * @ordered
	 */
	protected Code type;

	/**
	 * The cached value of the '{@link #getBlob() <em>Blob</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getBlob()
	 * @generated
	 * @ordered
	 */
	protected Base64Binary blob;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected CapabilityStatementCertificateImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return FhirPackage.eINSTANCE.getCapabilityStatementCertificate();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@XmlJavaTypeAdapter(CodeImplAdapter.class)
	public Code getType() {
		return type;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetType(Code newType, NotificationChain msgs) {
		Code oldType = type;
		type = newType;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FhirPackage.CAPABILITY_STATEMENT_CERTIFICATE__TYPE, oldType, newType);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setType(Code newType) {
		if (newType != type) {
			NotificationChain msgs = null;
			if (type != null)
				msgs = ((InternalEObject)type).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FhirPackage.CAPABILITY_STATEMENT_CERTIFICATE__TYPE, null, msgs);
			if (newType != null)
				msgs = ((InternalEObject)newType).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FhirPackage.CAPABILITY_STATEMENT_CERTIFICATE__TYPE, null, msgs);
			msgs = basicSetType(newType, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FhirPackage.CAPABILITY_STATEMENT_CERTIFICATE__TYPE, newType, newType));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@XmlJavaTypeAdapter(Base64BinaryImplAdapter.class)
	public Base64Binary getBlob() {
		return blob;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetBlob(Base64Binary newBlob, NotificationChain msgs) {
		Base64Binary oldBlob = blob;
		blob = newBlob;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FhirPackage.CAPABILITY_STATEMENT_CERTIFICATE__BLOB, oldBlob, newBlob);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setBlob(Base64Binary newBlob) {
		if (newBlob != blob) {
			NotificationChain msgs = null;
			if (blob != null)
				msgs = ((InternalEObject)blob).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FhirPackage.CAPABILITY_STATEMENT_CERTIFICATE__BLOB, null, msgs);
			if (newBlob != null)
				msgs = ((InternalEObject)newBlob).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FhirPackage.CAPABILITY_STATEMENT_CERTIFICATE__BLOB, null, msgs);
			msgs = basicSetBlob(newBlob, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FhirPackage.CAPABILITY_STATEMENT_CERTIFICATE__BLOB, newBlob, newBlob));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case FhirPackage.CAPABILITY_STATEMENT_CERTIFICATE__TYPE:
				return basicSetType(null, msgs);
			case FhirPackage.CAPABILITY_STATEMENT_CERTIFICATE__BLOB:
				return basicSetBlob(null, msgs);
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
			case FhirPackage.CAPABILITY_STATEMENT_CERTIFICATE__TYPE:
				return getType();
			case FhirPackage.CAPABILITY_STATEMENT_CERTIFICATE__BLOB:
				return getBlob();
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
			case FhirPackage.CAPABILITY_STATEMENT_CERTIFICATE__TYPE:
				setType((Code)newValue);
				return;
			case FhirPackage.CAPABILITY_STATEMENT_CERTIFICATE__BLOB:
				setBlob((Base64Binary)newValue);
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
			case FhirPackage.CAPABILITY_STATEMENT_CERTIFICATE__TYPE:
				setType((Code)null);
				return;
			case FhirPackage.CAPABILITY_STATEMENT_CERTIFICATE__BLOB:
				setBlob((Base64Binary)null);
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
			case FhirPackage.CAPABILITY_STATEMENT_CERTIFICATE__TYPE:
				return type != null;
			case FhirPackage.CAPABILITY_STATEMENT_CERTIFICATE__BLOB:
				return blob != null;
		}
		return super.eIsSet(featureID);
	}

} //CapabilityStatementCertificateImpl
