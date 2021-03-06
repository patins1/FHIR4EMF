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

import org.hl7.fhir.FhirPackage;
import org.hl7.fhir.SubscriptionChannel;
import org.hl7.fhir.SubscriptionChannelType;
import org.hl7.fhir.Uri;
import org.hl7.fhir.jaxb.StringImplAdapter;
import org.hl7.fhir.jaxb.SubscriptionChannelTypeImplAdapter;
import org.hl7.fhir.jaxb.UriImplAdapter;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Subscription Channel</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.hl7.fhir.impl.SubscriptionChannelImpl#getType <em>Type</em>}</li>
 *   <li>{@link org.hl7.fhir.impl.SubscriptionChannelImpl#getEndpoint <em>Endpoint</em>}</li>
 *   <li>{@link org.hl7.fhir.impl.SubscriptionChannelImpl#getPayload <em>Payload</em>}</li>
 *   <li>{@link org.hl7.fhir.impl.SubscriptionChannelImpl#getHeader <em>Header</em>}</li>
 * </ul>
 *
 * @generated
 */
@XmlType(name = "SubscriptionChannel", namespace = "http://hl7.org/fhir")
@XmlRootElement(name = "fhir.SubscriptionChannel")
public class SubscriptionChannelImpl extends BackboneElementImpl implements SubscriptionChannel {
	/**
	 * The cached value of the '{@link #getType() <em>Type</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getType()
	 * @generated
	 * @ordered
	 */
	protected SubscriptionChannelType type;

	/**
	 * The cached value of the '{@link #getEndpoint() <em>Endpoint</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getEndpoint()
	 * @generated
	 * @ordered
	 */
	protected Uri endpoint;

	/**
	 * The cached value of the '{@link #getPayload() <em>Payload</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPayload()
	 * @generated
	 * @ordered
	 */
	protected org.hl7.fhir.String payload;

	/**
	 * The cached value of the '{@link #getHeader() <em>Header</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getHeader()
	 * @generated
	 * @ordered
	 */
	protected EList<org.hl7.fhir.String> header;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected SubscriptionChannelImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return FhirPackage.eINSTANCE.getSubscriptionChannel();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@XmlJavaTypeAdapter(SubscriptionChannelTypeImplAdapter.class)
	@XmlElement(required = true)
	public SubscriptionChannelType getType() {
		return type;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetType(SubscriptionChannelType newType, NotificationChain msgs) {
		SubscriptionChannelType oldType = type;
		type = newType;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FhirPackage.SUBSCRIPTION_CHANNEL__TYPE, oldType, newType);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setType(SubscriptionChannelType newType) {
		if (newType != type) {
			NotificationChain msgs = null;
			if (type != null)
				msgs = ((InternalEObject)type).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FhirPackage.SUBSCRIPTION_CHANNEL__TYPE, null, msgs);
			if (newType != null)
				msgs = ((InternalEObject)newType).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FhirPackage.SUBSCRIPTION_CHANNEL__TYPE, null, msgs);
			msgs = basicSetType(newType, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FhirPackage.SUBSCRIPTION_CHANNEL__TYPE, newType, newType));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@XmlJavaTypeAdapter(UriImplAdapter.class)
	public Uri getEndpoint() {
		return endpoint;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetEndpoint(Uri newEndpoint, NotificationChain msgs) {
		Uri oldEndpoint = endpoint;
		endpoint = newEndpoint;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FhirPackage.SUBSCRIPTION_CHANNEL__ENDPOINT, oldEndpoint, newEndpoint);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setEndpoint(Uri newEndpoint) {
		if (newEndpoint != endpoint) {
			NotificationChain msgs = null;
			if (endpoint != null)
				msgs = ((InternalEObject)endpoint).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FhirPackage.SUBSCRIPTION_CHANNEL__ENDPOINT, null, msgs);
			if (newEndpoint != null)
				msgs = ((InternalEObject)newEndpoint).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FhirPackage.SUBSCRIPTION_CHANNEL__ENDPOINT, null, msgs);
			msgs = basicSetEndpoint(newEndpoint, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FhirPackage.SUBSCRIPTION_CHANNEL__ENDPOINT, newEndpoint, newEndpoint));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@XmlJavaTypeAdapter(StringImplAdapter.class)
	public org.hl7.fhir.String getPayload() {
		return payload;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetPayload(org.hl7.fhir.String newPayload, NotificationChain msgs) {
		org.hl7.fhir.String oldPayload = payload;
		payload = newPayload;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FhirPackage.SUBSCRIPTION_CHANNEL__PAYLOAD, oldPayload, newPayload);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setPayload(org.hl7.fhir.String newPayload) {
		if (newPayload != payload) {
			NotificationChain msgs = null;
			if (payload != null)
				msgs = ((InternalEObject)payload).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FhirPackage.SUBSCRIPTION_CHANNEL__PAYLOAD, null, msgs);
			if (newPayload != null)
				msgs = ((InternalEObject)newPayload).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FhirPackage.SUBSCRIPTION_CHANNEL__PAYLOAD, null, msgs);
			msgs = basicSetPayload(newPayload, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FhirPackage.SUBSCRIPTION_CHANNEL__PAYLOAD, newPayload, newPayload));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@XmlJavaTypeAdapter(StringImplAdapter.class)
	@XmlElement
	public List<org.hl7.fhir.String> getHeader() {
		if (header == null) {
			header = new EObjectContainmentEList<org.hl7.fhir.String>(org.hl7.fhir.String.class, this, FhirPackage.SUBSCRIPTION_CHANNEL__HEADER);
		}
		return header;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case FhirPackage.SUBSCRIPTION_CHANNEL__TYPE:
				return basicSetType(null, msgs);
			case FhirPackage.SUBSCRIPTION_CHANNEL__ENDPOINT:
				return basicSetEndpoint(null, msgs);
			case FhirPackage.SUBSCRIPTION_CHANNEL__PAYLOAD:
				return basicSetPayload(null, msgs);
			case FhirPackage.SUBSCRIPTION_CHANNEL__HEADER:
				return ((InternalEList<?>)getHeader()).basicRemove(otherEnd, msgs);
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
			case FhirPackage.SUBSCRIPTION_CHANNEL__TYPE:
				return getType();
			case FhirPackage.SUBSCRIPTION_CHANNEL__ENDPOINT:
				return getEndpoint();
			case FhirPackage.SUBSCRIPTION_CHANNEL__PAYLOAD:
				return getPayload();
			case FhirPackage.SUBSCRIPTION_CHANNEL__HEADER:
				return getHeader();
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
			case FhirPackage.SUBSCRIPTION_CHANNEL__TYPE:
				setType((SubscriptionChannelType)newValue);
				return;
			case FhirPackage.SUBSCRIPTION_CHANNEL__ENDPOINT:
				setEndpoint((Uri)newValue);
				return;
			case FhirPackage.SUBSCRIPTION_CHANNEL__PAYLOAD:
				setPayload((org.hl7.fhir.String)newValue);
				return;
			case FhirPackage.SUBSCRIPTION_CHANNEL__HEADER:
				getHeader().clear();
				getHeader().addAll((Collection<? extends org.hl7.fhir.String>)newValue);
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
			case FhirPackage.SUBSCRIPTION_CHANNEL__TYPE:
				setType((SubscriptionChannelType)null);
				return;
			case FhirPackage.SUBSCRIPTION_CHANNEL__ENDPOINT:
				setEndpoint((Uri)null);
				return;
			case FhirPackage.SUBSCRIPTION_CHANNEL__PAYLOAD:
				setPayload((org.hl7.fhir.String)null);
				return;
			case FhirPackage.SUBSCRIPTION_CHANNEL__HEADER:
				getHeader().clear();
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
			case FhirPackage.SUBSCRIPTION_CHANNEL__TYPE:
				return type != null;
			case FhirPackage.SUBSCRIPTION_CHANNEL__ENDPOINT:
				return endpoint != null;
			case FhirPackage.SUBSCRIPTION_CHANNEL__PAYLOAD:
				return payload != null;
			case FhirPackage.SUBSCRIPTION_CHANNEL__HEADER:
				return header != null && !header.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //SubscriptionChannelImpl
