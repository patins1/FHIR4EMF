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

import org.hl7.fhir.FhirPackage;
import org.hl7.fhir.Markdown;
import org.hl7.fhir.MessageDefinitionAllowedResponse;
import org.hl7.fhir.Reference;
import org.hl7.fhir.jaxb.MarkdownImplAdapter;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Message Definition Allowed Response</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.hl7.fhir.impl.MessageDefinitionAllowedResponseImpl#getMessage <em>Message</em>}</li>
 *   <li>{@link org.hl7.fhir.impl.MessageDefinitionAllowedResponseImpl#getSituation <em>Situation</em>}</li>
 * </ul>
 *
 * @generated
 */
@XmlType(name = "MessageDefinitionAllowedResponse", namespace = "http://hl7.org/fhir")
@XmlRootElement(name = "fhir.MessageDefinitionAllowedResponse")
public class MessageDefinitionAllowedResponseImpl extends BackboneElementImpl implements MessageDefinitionAllowedResponse {
	/**
	 * The cached value of the '{@link #getMessage() <em>Message</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMessage()
	 * @generated
	 * @ordered
	 */
	protected Reference message;

	/**
	 * The cached value of the '{@link #getSituation() <em>Situation</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSituation()
	 * @generated
	 * @ordered
	 */
	protected Markdown situation;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected MessageDefinitionAllowedResponseImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return FhirPackage.eINSTANCE.getMessageDefinitionAllowedResponse();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@XmlElement(required = true)
	public Reference getMessage() {
		return message;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetMessage(Reference newMessage, NotificationChain msgs) {
		Reference oldMessage = message;
		message = newMessage;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FhirPackage.MESSAGE_DEFINITION_ALLOWED_RESPONSE__MESSAGE, oldMessage, newMessage);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setMessage(Reference newMessage) {
		if (newMessage != message) {
			NotificationChain msgs = null;
			if (message != null)
				msgs = ((InternalEObject)message).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FhirPackage.MESSAGE_DEFINITION_ALLOWED_RESPONSE__MESSAGE, null, msgs);
			if (newMessage != null)
				msgs = ((InternalEObject)newMessage).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FhirPackage.MESSAGE_DEFINITION_ALLOWED_RESPONSE__MESSAGE, null, msgs);
			msgs = basicSetMessage(newMessage, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FhirPackage.MESSAGE_DEFINITION_ALLOWED_RESPONSE__MESSAGE, newMessage, newMessage));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@XmlJavaTypeAdapter(MarkdownImplAdapter.class)
	public Markdown getSituation() {
		return situation;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetSituation(Markdown newSituation, NotificationChain msgs) {
		Markdown oldSituation = situation;
		situation = newSituation;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FhirPackage.MESSAGE_DEFINITION_ALLOWED_RESPONSE__SITUATION, oldSituation, newSituation);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setSituation(Markdown newSituation) {
		if (newSituation != situation) {
			NotificationChain msgs = null;
			if (situation != null)
				msgs = ((InternalEObject)situation).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FhirPackage.MESSAGE_DEFINITION_ALLOWED_RESPONSE__SITUATION, null, msgs);
			if (newSituation != null)
				msgs = ((InternalEObject)newSituation).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FhirPackage.MESSAGE_DEFINITION_ALLOWED_RESPONSE__SITUATION, null, msgs);
			msgs = basicSetSituation(newSituation, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FhirPackage.MESSAGE_DEFINITION_ALLOWED_RESPONSE__SITUATION, newSituation, newSituation));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case FhirPackage.MESSAGE_DEFINITION_ALLOWED_RESPONSE__MESSAGE:
				return basicSetMessage(null, msgs);
			case FhirPackage.MESSAGE_DEFINITION_ALLOWED_RESPONSE__SITUATION:
				return basicSetSituation(null, msgs);
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
			case FhirPackage.MESSAGE_DEFINITION_ALLOWED_RESPONSE__MESSAGE:
				return getMessage();
			case FhirPackage.MESSAGE_DEFINITION_ALLOWED_RESPONSE__SITUATION:
				return getSituation();
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
			case FhirPackage.MESSAGE_DEFINITION_ALLOWED_RESPONSE__MESSAGE:
				setMessage((Reference)newValue);
				return;
			case FhirPackage.MESSAGE_DEFINITION_ALLOWED_RESPONSE__SITUATION:
				setSituation((Markdown)newValue);
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
			case FhirPackage.MESSAGE_DEFINITION_ALLOWED_RESPONSE__MESSAGE:
				setMessage((Reference)null);
				return;
			case FhirPackage.MESSAGE_DEFINITION_ALLOWED_RESPONSE__SITUATION:
				setSituation((Markdown)null);
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
			case FhirPackage.MESSAGE_DEFINITION_ALLOWED_RESPONSE__MESSAGE:
				return message != null;
			case FhirPackage.MESSAGE_DEFINITION_ALLOWED_RESPONSE__SITUATION:
				return situation != null;
		}
		return super.eIsSet(featureID);
	}

} //MessageDefinitionAllowedResponseImpl
