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
import org.hl7.fhir.FhirPackage;
import org.hl7.fhir.ProvenanceAgent;
import org.hl7.fhir.Reference;
import org.hl7.fhir.Uri;
import org.hl7.fhir.jaxb.UriImplAdapter;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Provenance Agent</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.hl7.fhir.impl.ProvenanceAgentImpl#getRole <em>Role</em>}</li>
 *   <li>{@link org.hl7.fhir.impl.ProvenanceAgentImpl#getWhoUri <em>Who Uri</em>}</li>
 *   <li>{@link org.hl7.fhir.impl.ProvenanceAgentImpl#getWhoReference <em>Who Reference</em>}</li>
 *   <li>{@link org.hl7.fhir.impl.ProvenanceAgentImpl#getOnBehalfOfUri <em>On Behalf Of Uri</em>}</li>
 *   <li>{@link org.hl7.fhir.impl.ProvenanceAgentImpl#getOnBehalfOfReference <em>On Behalf Of Reference</em>}</li>
 *   <li>{@link org.hl7.fhir.impl.ProvenanceAgentImpl#getRelatedAgentType <em>Related Agent Type</em>}</li>
 * </ul>
 *
 * @generated
 */
@XmlType(name = "ProvenanceAgent", namespace = "http://hl7.org/fhir")
@XmlRootElement(name = "fhir.ProvenanceAgent")
public class ProvenanceAgentImpl extends BackboneElementImpl implements ProvenanceAgent {
	/**
	 * The cached value of the '{@link #getRole() <em>Role</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRole()
	 * @generated
	 * @ordered
	 */
	protected EList<CodeableConcept> role;

	/**
	 * The cached value of the '{@link #getWhoUri() <em>Who Uri</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getWhoUri()
	 * @generated
	 * @ordered
	 */
	protected Uri whoUri;

	/**
	 * The cached value of the '{@link #getWhoReference() <em>Who Reference</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getWhoReference()
	 * @generated
	 * @ordered
	 */
	protected Reference whoReference;

	/**
	 * The cached value of the '{@link #getOnBehalfOfUri() <em>On Behalf Of Uri</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOnBehalfOfUri()
	 * @generated
	 * @ordered
	 */
	protected Uri onBehalfOfUri;

	/**
	 * The cached value of the '{@link #getOnBehalfOfReference() <em>On Behalf Of Reference</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOnBehalfOfReference()
	 * @generated
	 * @ordered
	 */
	protected Reference onBehalfOfReference;

	/**
	 * The cached value of the '{@link #getRelatedAgentType() <em>Related Agent Type</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRelatedAgentType()
	 * @generated
	 * @ordered
	 */
	protected CodeableConcept relatedAgentType;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ProvenanceAgentImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return FhirPackage.eINSTANCE.getProvenanceAgent();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@XmlElement
	public List<CodeableConcept> getRole() {
		if (role == null) {
			role = new EObjectContainmentEList<CodeableConcept>(CodeableConcept.class, this, FhirPackage.PROVENANCE_AGENT__ROLE);
		}
		return role;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@XmlJavaTypeAdapter(UriImplAdapter.class)
	public Uri getWhoUri() {
		return whoUri;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetWhoUri(Uri newWhoUri, NotificationChain msgs) {
		Uri oldWhoUri = whoUri;
		whoUri = newWhoUri;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FhirPackage.PROVENANCE_AGENT__WHO_URI, oldWhoUri, newWhoUri);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setWhoUri(Uri newWhoUri) {
		if (newWhoUri != whoUri) {
			NotificationChain msgs = null;
			if (whoUri != null)
				msgs = ((InternalEObject)whoUri).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FhirPackage.PROVENANCE_AGENT__WHO_URI, null, msgs);
			if (newWhoUri != null)
				msgs = ((InternalEObject)newWhoUri).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FhirPackage.PROVENANCE_AGENT__WHO_URI, null, msgs);
			msgs = basicSetWhoUri(newWhoUri, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FhirPackage.PROVENANCE_AGENT__WHO_URI, newWhoUri, newWhoUri));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Reference getWhoReference() {
		return whoReference;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetWhoReference(Reference newWhoReference, NotificationChain msgs) {
		Reference oldWhoReference = whoReference;
		whoReference = newWhoReference;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FhirPackage.PROVENANCE_AGENT__WHO_REFERENCE, oldWhoReference, newWhoReference);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setWhoReference(Reference newWhoReference) {
		if (newWhoReference != whoReference) {
			NotificationChain msgs = null;
			if (whoReference != null)
				msgs = ((InternalEObject)whoReference).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FhirPackage.PROVENANCE_AGENT__WHO_REFERENCE, null, msgs);
			if (newWhoReference != null)
				msgs = ((InternalEObject)newWhoReference).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FhirPackage.PROVENANCE_AGENT__WHO_REFERENCE, null, msgs);
			msgs = basicSetWhoReference(newWhoReference, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FhirPackage.PROVENANCE_AGENT__WHO_REFERENCE, newWhoReference, newWhoReference));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@XmlJavaTypeAdapter(UriImplAdapter.class)
	public Uri getOnBehalfOfUri() {
		return onBehalfOfUri;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetOnBehalfOfUri(Uri newOnBehalfOfUri, NotificationChain msgs) {
		Uri oldOnBehalfOfUri = onBehalfOfUri;
		onBehalfOfUri = newOnBehalfOfUri;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FhirPackage.PROVENANCE_AGENT__ON_BEHALF_OF_URI, oldOnBehalfOfUri, newOnBehalfOfUri);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setOnBehalfOfUri(Uri newOnBehalfOfUri) {
		if (newOnBehalfOfUri != onBehalfOfUri) {
			NotificationChain msgs = null;
			if (onBehalfOfUri != null)
				msgs = ((InternalEObject)onBehalfOfUri).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FhirPackage.PROVENANCE_AGENT__ON_BEHALF_OF_URI, null, msgs);
			if (newOnBehalfOfUri != null)
				msgs = ((InternalEObject)newOnBehalfOfUri).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FhirPackage.PROVENANCE_AGENT__ON_BEHALF_OF_URI, null, msgs);
			msgs = basicSetOnBehalfOfUri(newOnBehalfOfUri, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FhirPackage.PROVENANCE_AGENT__ON_BEHALF_OF_URI, newOnBehalfOfUri, newOnBehalfOfUri));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Reference getOnBehalfOfReference() {
		return onBehalfOfReference;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetOnBehalfOfReference(Reference newOnBehalfOfReference, NotificationChain msgs) {
		Reference oldOnBehalfOfReference = onBehalfOfReference;
		onBehalfOfReference = newOnBehalfOfReference;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FhirPackage.PROVENANCE_AGENT__ON_BEHALF_OF_REFERENCE, oldOnBehalfOfReference, newOnBehalfOfReference);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setOnBehalfOfReference(Reference newOnBehalfOfReference) {
		if (newOnBehalfOfReference != onBehalfOfReference) {
			NotificationChain msgs = null;
			if (onBehalfOfReference != null)
				msgs = ((InternalEObject)onBehalfOfReference).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FhirPackage.PROVENANCE_AGENT__ON_BEHALF_OF_REFERENCE, null, msgs);
			if (newOnBehalfOfReference != null)
				msgs = ((InternalEObject)newOnBehalfOfReference).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FhirPackage.PROVENANCE_AGENT__ON_BEHALF_OF_REFERENCE, null, msgs);
			msgs = basicSetOnBehalfOfReference(newOnBehalfOfReference, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FhirPackage.PROVENANCE_AGENT__ON_BEHALF_OF_REFERENCE, newOnBehalfOfReference, newOnBehalfOfReference));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CodeableConcept getRelatedAgentType() {
		return relatedAgentType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetRelatedAgentType(CodeableConcept newRelatedAgentType, NotificationChain msgs) {
		CodeableConcept oldRelatedAgentType = relatedAgentType;
		relatedAgentType = newRelatedAgentType;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FhirPackage.PROVENANCE_AGENT__RELATED_AGENT_TYPE, oldRelatedAgentType, newRelatedAgentType);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setRelatedAgentType(CodeableConcept newRelatedAgentType) {
		if (newRelatedAgentType != relatedAgentType) {
			NotificationChain msgs = null;
			if (relatedAgentType != null)
				msgs = ((InternalEObject)relatedAgentType).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FhirPackage.PROVENANCE_AGENT__RELATED_AGENT_TYPE, null, msgs);
			if (newRelatedAgentType != null)
				msgs = ((InternalEObject)newRelatedAgentType).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FhirPackage.PROVENANCE_AGENT__RELATED_AGENT_TYPE, null, msgs);
			msgs = basicSetRelatedAgentType(newRelatedAgentType, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FhirPackage.PROVENANCE_AGENT__RELATED_AGENT_TYPE, newRelatedAgentType, newRelatedAgentType));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case FhirPackage.PROVENANCE_AGENT__ROLE:
				return ((InternalEList<?>)getRole()).basicRemove(otherEnd, msgs);
			case FhirPackage.PROVENANCE_AGENT__WHO_URI:
				return basicSetWhoUri(null, msgs);
			case FhirPackage.PROVENANCE_AGENT__WHO_REFERENCE:
				return basicSetWhoReference(null, msgs);
			case FhirPackage.PROVENANCE_AGENT__ON_BEHALF_OF_URI:
				return basicSetOnBehalfOfUri(null, msgs);
			case FhirPackage.PROVENANCE_AGENT__ON_BEHALF_OF_REFERENCE:
				return basicSetOnBehalfOfReference(null, msgs);
			case FhirPackage.PROVENANCE_AGENT__RELATED_AGENT_TYPE:
				return basicSetRelatedAgentType(null, msgs);
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
			case FhirPackage.PROVENANCE_AGENT__ROLE:
				return getRole();
			case FhirPackage.PROVENANCE_AGENT__WHO_URI:
				return getWhoUri();
			case FhirPackage.PROVENANCE_AGENT__WHO_REFERENCE:
				return getWhoReference();
			case FhirPackage.PROVENANCE_AGENT__ON_BEHALF_OF_URI:
				return getOnBehalfOfUri();
			case FhirPackage.PROVENANCE_AGENT__ON_BEHALF_OF_REFERENCE:
				return getOnBehalfOfReference();
			case FhirPackage.PROVENANCE_AGENT__RELATED_AGENT_TYPE:
				return getRelatedAgentType();
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
			case FhirPackage.PROVENANCE_AGENT__ROLE:
				getRole().clear();
				getRole().addAll((Collection<? extends CodeableConcept>)newValue);
				return;
			case FhirPackage.PROVENANCE_AGENT__WHO_URI:
				setWhoUri((Uri)newValue);
				return;
			case FhirPackage.PROVENANCE_AGENT__WHO_REFERENCE:
				setWhoReference((Reference)newValue);
				return;
			case FhirPackage.PROVENANCE_AGENT__ON_BEHALF_OF_URI:
				setOnBehalfOfUri((Uri)newValue);
				return;
			case FhirPackage.PROVENANCE_AGENT__ON_BEHALF_OF_REFERENCE:
				setOnBehalfOfReference((Reference)newValue);
				return;
			case FhirPackage.PROVENANCE_AGENT__RELATED_AGENT_TYPE:
				setRelatedAgentType((CodeableConcept)newValue);
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
			case FhirPackage.PROVENANCE_AGENT__ROLE:
				getRole().clear();
				return;
			case FhirPackage.PROVENANCE_AGENT__WHO_URI:
				setWhoUri((Uri)null);
				return;
			case FhirPackage.PROVENANCE_AGENT__WHO_REFERENCE:
				setWhoReference((Reference)null);
				return;
			case FhirPackage.PROVENANCE_AGENT__ON_BEHALF_OF_URI:
				setOnBehalfOfUri((Uri)null);
				return;
			case FhirPackage.PROVENANCE_AGENT__ON_BEHALF_OF_REFERENCE:
				setOnBehalfOfReference((Reference)null);
				return;
			case FhirPackage.PROVENANCE_AGENT__RELATED_AGENT_TYPE:
				setRelatedAgentType((CodeableConcept)null);
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
			case FhirPackage.PROVENANCE_AGENT__ROLE:
				return role != null && !role.isEmpty();
			case FhirPackage.PROVENANCE_AGENT__WHO_URI:
				return whoUri != null;
			case FhirPackage.PROVENANCE_AGENT__WHO_REFERENCE:
				return whoReference != null;
			case FhirPackage.PROVENANCE_AGENT__ON_BEHALF_OF_URI:
				return onBehalfOfUri != null;
			case FhirPackage.PROVENANCE_AGENT__ON_BEHALF_OF_REFERENCE:
				return onBehalfOfReference != null;
			case FhirPackage.PROVENANCE_AGENT__RELATED_AGENT_TYPE:
				return relatedAgentType != null;
		}
		return super.eIsSet(featureID);
	}

} //ProvenanceAgentImpl
