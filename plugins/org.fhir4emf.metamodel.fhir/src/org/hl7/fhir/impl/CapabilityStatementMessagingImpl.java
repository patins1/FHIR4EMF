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

import org.hl7.fhir.CapabilityStatementEndpoint;
import org.hl7.fhir.CapabilityStatementEvent;
import org.hl7.fhir.CapabilityStatementMessaging;
import org.hl7.fhir.CapabilityStatementSupportedMessage;
import org.hl7.fhir.FhirPackage;
import org.hl7.fhir.UnsignedInt;
import org.hl7.fhir.jaxb.StringImplAdapter;
import org.hl7.fhir.jaxb.UnsignedIntImplAdapter;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Capability Statement Messaging</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.hl7.fhir.impl.CapabilityStatementMessagingImpl#getEndpoint <em>Endpoint</em>}</li>
 *   <li>{@link org.hl7.fhir.impl.CapabilityStatementMessagingImpl#getReliableCache <em>Reliable Cache</em>}</li>
 *   <li>{@link org.hl7.fhir.impl.CapabilityStatementMessagingImpl#getDocumentation <em>Documentation</em>}</li>
 *   <li>{@link org.hl7.fhir.impl.CapabilityStatementMessagingImpl#getSupportedMessage <em>Supported Message</em>}</li>
 *   <li>{@link org.hl7.fhir.impl.CapabilityStatementMessagingImpl#getEvent <em>Event</em>}</li>
 * </ul>
 *
 * @generated
 */
@XmlType(name = "CapabilityStatementMessaging", namespace = "http://hl7.org/fhir")
@XmlRootElement(name = "fhir.CapabilityStatementMessaging")
public class CapabilityStatementMessagingImpl extends BackboneElementImpl implements CapabilityStatementMessaging {
	/**
	 * The cached value of the '{@link #getEndpoint() <em>Endpoint</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getEndpoint()
	 * @generated
	 * @ordered
	 */
	protected EList<CapabilityStatementEndpoint> endpoint;

	/**
	 * The cached value of the '{@link #getReliableCache() <em>Reliable Cache</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getReliableCache()
	 * @generated
	 * @ordered
	 */
	protected UnsignedInt reliableCache;

	/**
	 * The cached value of the '{@link #getDocumentation() <em>Documentation</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDocumentation()
	 * @generated
	 * @ordered
	 */
	protected org.hl7.fhir.String documentation;

	/**
	 * The cached value of the '{@link #getSupportedMessage() <em>Supported Message</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSupportedMessage()
	 * @generated
	 * @ordered
	 */
	protected EList<CapabilityStatementSupportedMessage> supportedMessage;

	/**
	 * The cached value of the '{@link #getEvent() <em>Event</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getEvent()
	 * @generated
	 * @ordered
	 */
	protected EList<CapabilityStatementEvent> event;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected CapabilityStatementMessagingImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return FhirPackage.eINSTANCE.getCapabilityStatementMessaging();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@XmlElement
	public List<CapabilityStatementEndpoint> getEndpoint() {
		if (endpoint == null) {
			endpoint = new EObjectContainmentEList<CapabilityStatementEndpoint>(CapabilityStatementEndpoint.class, this, FhirPackage.CAPABILITY_STATEMENT_MESSAGING__ENDPOINT);
		}
		return endpoint;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@XmlJavaTypeAdapter(UnsignedIntImplAdapter.class)
	public UnsignedInt getReliableCache() {
		return reliableCache;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetReliableCache(UnsignedInt newReliableCache, NotificationChain msgs) {
		UnsignedInt oldReliableCache = reliableCache;
		reliableCache = newReliableCache;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FhirPackage.CAPABILITY_STATEMENT_MESSAGING__RELIABLE_CACHE, oldReliableCache, newReliableCache);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setReliableCache(UnsignedInt newReliableCache) {
		if (newReliableCache != reliableCache) {
			NotificationChain msgs = null;
			if (reliableCache != null)
				msgs = ((InternalEObject)reliableCache).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FhirPackage.CAPABILITY_STATEMENT_MESSAGING__RELIABLE_CACHE, null, msgs);
			if (newReliableCache != null)
				msgs = ((InternalEObject)newReliableCache).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FhirPackage.CAPABILITY_STATEMENT_MESSAGING__RELIABLE_CACHE, null, msgs);
			msgs = basicSetReliableCache(newReliableCache, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FhirPackage.CAPABILITY_STATEMENT_MESSAGING__RELIABLE_CACHE, newReliableCache, newReliableCache));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@XmlJavaTypeAdapter(StringImplAdapter.class)
	public org.hl7.fhir.String getDocumentation() {
		return documentation;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetDocumentation(org.hl7.fhir.String newDocumentation, NotificationChain msgs) {
		org.hl7.fhir.String oldDocumentation = documentation;
		documentation = newDocumentation;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FhirPackage.CAPABILITY_STATEMENT_MESSAGING__DOCUMENTATION, oldDocumentation, newDocumentation);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setDocumentation(org.hl7.fhir.String newDocumentation) {
		if (newDocumentation != documentation) {
			NotificationChain msgs = null;
			if (documentation != null)
				msgs = ((InternalEObject)documentation).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FhirPackage.CAPABILITY_STATEMENT_MESSAGING__DOCUMENTATION, null, msgs);
			if (newDocumentation != null)
				msgs = ((InternalEObject)newDocumentation).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FhirPackage.CAPABILITY_STATEMENT_MESSAGING__DOCUMENTATION, null, msgs);
			msgs = basicSetDocumentation(newDocumentation, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FhirPackage.CAPABILITY_STATEMENT_MESSAGING__DOCUMENTATION, newDocumentation, newDocumentation));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@XmlElement
	public List<CapabilityStatementSupportedMessage> getSupportedMessage() {
		if (supportedMessage == null) {
			supportedMessage = new EObjectContainmentEList<CapabilityStatementSupportedMessage>(CapabilityStatementSupportedMessage.class, this, FhirPackage.CAPABILITY_STATEMENT_MESSAGING__SUPPORTED_MESSAGE);
		}
		return supportedMessage;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@XmlElement
	public List<CapabilityStatementEvent> getEvent() {
		if (event == null) {
			event = new EObjectContainmentEList<CapabilityStatementEvent>(CapabilityStatementEvent.class, this, FhirPackage.CAPABILITY_STATEMENT_MESSAGING__EVENT);
		}
		return event;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case FhirPackage.CAPABILITY_STATEMENT_MESSAGING__ENDPOINT:
				return ((InternalEList<?>)getEndpoint()).basicRemove(otherEnd, msgs);
			case FhirPackage.CAPABILITY_STATEMENT_MESSAGING__RELIABLE_CACHE:
				return basicSetReliableCache(null, msgs);
			case FhirPackage.CAPABILITY_STATEMENT_MESSAGING__DOCUMENTATION:
				return basicSetDocumentation(null, msgs);
			case FhirPackage.CAPABILITY_STATEMENT_MESSAGING__SUPPORTED_MESSAGE:
				return ((InternalEList<?>)getSupportedMessage()).basicRemove(otherEnd, msgs);
			case FhirPackage.CAPABILITY_STATEMENT_MESSAGING__EVENT:
				return ((InternalEList<?>)getEvent()).basicRemove(otherEnd, msgs);
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
			case FhirPackage.CAPABILITY_STATEMENT_MESSAGING__ENDPOINT:
				return getEndpoint();
			case FhirPackage.CAPABILITY_STATEMENT_MESSAGING__RELIABLE_CACHE:
				return getReliableCache();
			case FhirPackage.CAPABILITY_STATEMENT_MESSAGING__DOCUMENTATION:
				return getDocumentation();
			case FhirPackage.CAPABILITY_STATEMENT_MESSAGING__SUPPORTED_MESSAGE:
				return getSupportedMessage();
			case FhirPackage.CAPABILITY_STATEMENT_MESSAGING__EVENT:
				return getEvent();
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
			case FhirPackage.CAPABILITY_STATEMENT_MESSAGING__ENDPOINT:
				getEndpoint().clear();
				getEndpoint().addAll((Collection<? extends CapabilityStatementEndpoint>)newValue);
				return;
			case FhirPackage.CAPABILITY_STATEMENT_MESSAGING__RELIABLE_CACHE:
				setReliableCache((UnsignedInt)newValue);
				return;
			case FhirPackage.CAPABILITY_STATEMENT_MESSAGING__DOCUMENTATION:
				setDocumentation((org.hl7.fhir.String)newValue);
				return;
			case FhirPackage.CAPABILITY_STATEMENT_MESSAGING__SUPPORTED_MESSAGE:
				getSupportedMessage().clear();
				getSupportedMessage().addAll((Collection<? extends CapabilityStatementSupportedMessage>)newValue);
				return;
			case FhirPackage.CAPABILITY_STATEMENT_MESSAGING__EVENT:
				getEvent().clear();
				getEvent().addAll((Collection<? extends CapabilityStatementEvent>)newValue);
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
			case FhirPackage.CAPABILITY_STATEMENT_MESSAGING__ENDPOINT:
				getEndpoint().clear();
				return;
			case FhirPackage.CAPABILITY_STATEMENT_MESSAGING__RELIABLE_CACHE:
				setReliableCache((UnsignedInt)null);
				return;
			case FhirPackage.CAPABILITY_STATEMENT_MESSAGING__DOCUMENTATION:
				setDocumentation((org.hl7.fhir.String)null);
				return;
			case FhirPackage.CAPABILITY_STATEMENT_MESSAGING__SUPPORTED_MESSAGE:
				getSupportedMessage().clear();
				return;
			case FhirPackage.CAPABILITY_STATEMENT_MESSAGING__EVENT:
				getEvent().clear();
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
			case FhirPackage.CAPABILITY_STATEMENT_MESSAGING__ENDPOINT:
				return endpoint != null && !endpoint.isEmpty();
			case FhirPackage.CAPABILITY_STATEMENT_MESSAGING__RELIABLE_CACHE:
				return reliableCache != null;
			case FhirPackage.CAPABILITY_STATEMENT_MESSAGING__DOCUMENTATION:
				return documentation != null;
			case FhirPackage.CAPABILITY_STATEMENT_MESSAGING__SUPPORTED_MESSAGE:
				return supportedMessage != null && !supportedMessage.isEmpty();
			case FhirPackage.CAPABILITY_STATEMENT_MESSAGING__EVENT:
				return event != null && !event.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //CapabilityStatementMessagingImpl
