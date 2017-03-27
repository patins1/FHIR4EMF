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
import org.hl7.fhir.Identifier;
import org.hl7.fhir.ProvenanceAgent;
import org.hl7.fhir.ProvenanceEntity;
import org.hl7.fhir.ProvenanceEntityRole;
import org.hl7.fhir.Reference;
import org.hl7.fhir.Uri;
import org.hl7.fhir.jaxb.ProvenanceEntityRoleImplAdapter;
import org.hl7.fhir.jaxb.UriImplAdapter;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Provenance Entity</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.hl7.fhir.impl.ProvenanceEntityImpl#getRole <em>Role</em>}</li>
 *   <li>{@link org.hl7.fhir.impl.ProvenanceEntityImpl#getWhatUri <em>What Uri</em>}</li>
 *   <li>{@link org.hl7.fhir.impl.ProvenanceEntityImpl#getWhatReference <em>What Reference</em>}</li>
 *   <li>{@link org.hl7.fhir.impl.ProvenanceEntityImpl#getWhatIdentifier <em>What Identifier</em>}</li>
 *   <li>{@link org.hl7.fhir.impl.ProvenanceEntityImpl#getAgent <em>Agent</em>}</li>
 * </ul>
 *
 * @generated
 */
@XmlType(name = "ProvenanceEntity", namespace = "http://hl7.org/fhir")
@XmlRootElement(name = "fhir.ProvenanceEntity")
public class ProvenanceEntityImpl extends BackboneElementImpl implements ProvenanceEntity {
	/**
	 * The cached value of the '{@link #getRole() <em>Role</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRole()
	 * @generated
	 * @ordered
	 */
	protected ProvenanceEntityRole role;

	/**
	 * The cached value of the '{@link #getWhatUri() <em>What Uri</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getWhatUri()
	 * @generated
	 * @ordered
	 */
	protected Uri whatUri;

	/**
	 * The cached value of the '{@link #getWhatReference() <em>What Reference</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getWhatReference()
	 * @generated
	 * @ordered
	 */
	protected Reference whatReference;

	/**
	 * The cached value of the '{@link #getWhatIdentifier() <em>What Identifier</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getWhatIdentifier()
	 * @generated
	 * @ordered
	 */
	protected Identifier whatIdentifier;

	/**
	 * The cached value of the '{@link #getAgent() <em>Agent</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAgent()
	 * @generated
	 * @ordered
	 */
	protected EList<ProvenanceAgent> agent;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ProvenanceEntityImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return FhirPackage.eINSTANCE.getProvenanceEntity();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@XmlJavaTypeAdapter(ProvenanceEntityRoleImplAdapter.class)
	@XmlElement(required = true)
	public ProvenanceEntityRole getRole() {
		return role;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetRole(ProvenanceEntityRole newRole, NotificationChain msgs) {
		ProvenanceEntityRole oldRole = role;
		role = newRole;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FhirPackage.PROVENANCE_ENTITY__ROLE, oldRole, newRole);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setRole(ProvenanceEntityRole newRole) {
		if (newRole != role) {
			NotificationChain msgs = null;
			if (role != null)
				msgs = ((InternalEObject)role).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FhirPackage.PROVENANCE_ENTITY__ROLE, null, msgs);
			if (newRole != null)
				msgs = ((InternalEObject)newRole).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FhirPackage.PROVENANCE_ENTITY__ROLE, null, msgs);
			msgs = basicSetRole(newRole, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FhirPackage.PROVENANCE_ENTITY__ROLE, newRole, newRole));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@XmlJavaTypeAdapter(UriImplAdapter.class)
	public Uri getWhatUri() {
		return whatUri;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetWhatUri(Uri newWhatUri, NotificationChain msgs) {
		Uri oldWhatUri = whatUri;
		whatUri = newWhatUri;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FhirPackage.PROVENANCE_ENTITY__WHAT_URI, oldWhatUri, newWhatUri);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setWhatUri(Uri newWhatUri) {
		if (newWhatUri != whatUri) {
			NotificationChain msgs = null;
			if (whatUri != null)
				msgs = ((InternalEObject)whatUri).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FhirPackage.PROVENANCE_ENTITY__WHAT_URI, null, msgs);
			if (newWhatUri != null)
				msgs = ((InternalEObject)newWhatUri).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FhirPackage.PROVENANCE_ENTITY__WHAT_URI, null, msgs);
			msgs = basicSetWhatUri(newWhatUri, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FhirPackage.PROVENANCE_ENTITY__WHAT_URI, newWhatUri, newWhatUri));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Reference getWhatReference() {
		return whatReference;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetWhatReference(Reference newWhatReference, NotificationChain msgs) {
		Reference oldWhatReference = whatReference;
		whatReference = newWhatReference;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FhirPackage.PROVENANCE_ENTITY__WHAT_REFERENCE, oldWhatReference, newWhatReference);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setWhatReference(Reference newWhatReference) {
		if (newWhatReference != whatReference) {
			NotificationChain msgs = null;
			if (whatReference != null)
				msgs = ((InternalEObject)whatReference).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FhirPackage.PROVENANCE_ENTITY__WHAT_REFERENCE, null, msgs);
			if (newWhatReference != null)
				msgs = ((InternalEObject)newWhatReference).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FhirPackage.PROVENANCE_ENTITY__WHAT_REFERENCE, null, msgs);
			msgs = basicSetWhatReference(newWhatReference, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FhirPackage.PROVENANCE_ENTITY__WHAT_REFERENCE, newWhatReference, newWhatReference));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Identifier getWhatIdentifier() {
		return whatIdentifier;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetWhatIdentifier(Identifier newWhatIdentifier, NotificationChain msgs) {
		Identifier oldWhatIdentifier = whatIdentifier;
		whatIdentifier = newWhatIdentifier;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FhirPackage.PROVENANCE_ENTITY__WHAT_IDENTIFIER, oldWhatIdentifier, newWhatIdentifier);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setWhatIdentifier(Identifier newWhatIdentifier) {
		if (newWhatIdentifier != whatIdentifier) {
			NotificationChain msgs = null;
			if (whatIdentifier != null)
				msgs = ((InternalEObject)whatIdentifier).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FhirPackage.PROVENANCE_ENTITY__WHAT_IDENTIFIER, null, msgs);
			if (newWhatIdentifier != null)
				msgs = ((InternalEObject)newWhatIdentifier).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FhirPackage.PROVENANCE_ENTITY__WHAT_IDENTIFIER, null, msgs);
			msgs = basicSetWhatIdentifier(newWhatIdentifier, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FhirPackage.PROVENANCE_ENTITY__WHAT_IDENTIFIER, newWhatIdentifier, newWhatIdentifier));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@XmlElement
	public List<ProvenanceAgent> getAgent() {
		if (agent == null) {
			agent = new EObjectContainmentEList<ProvenanceAgent>(ProvenanceAgent.class, this, FhirPackage.PROVENANCE_ENTITY__AGENT);
		}
		return agent;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case FhirPackage.PROVENANCE_ENTITY__ROLE:
				return basicSetRole(null, msgs);
			case FhirPackage.PROVENANCE_ENTITY__WHAT_URI:
				return basicSetWhatUri(null, msgs);
			case FhirPackage.PROVENANCE_ENTITY__WHAT_REFERENCE:
				return basicSetWhatReference(null, msgs);
			case FhirPackage.PROVENANCE_ENTITY__WHAT_IDENTIFIER:
				return basicSetWhatIdentifier(null, msgs);
			case FhirPackage.PROVENANCE_ENTITY__AGENT:
				return ((InternalEList<?>)getAgent()).basicRemove(otherEnd, msgs);
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
			case FhirPackage.PROVENANCE_ENTITY__ROLE:
				return getRole();
			case FhirPackage.PROVENANCE_ENTITY__WHAT_URI:
				return getWhatUri();
			case FhirPackage.PROVENANCE_ENTITY__WHAT_REFERENCE:
				return getWhatReference();
			case FhirPackage.PROVENANCE_ENTITY__WHAT_IDENTIFIER:
				return getWhatIdentifier();
			case FhirPackage.PROVENANCE_ENTITY__AGENT:
				return getAgent();
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
			case FhirPackage.PROVENANCE_ENTITY__ROLE:
				setRole((ProvenanceEntityRole)newValue);
				return;
			case FhirPackage.PROVENANCE_ENTITY__WHAT_URI:
				setWhatUri((Uri)newValue);
				return;
			case FhirPackage.PROVENANCE_ENTITY__WHAT_REFERENCE:
				setWhatReference((Reference)newValue);
				return;
			case FhirPackage.PROVENANCE_ENTITY__WHAT_IDENTIFIER:
				setWhatIdentifier((Identifier)newValue);
				return;
			case FhirPackage.PROVENANCE_ENTITY__AGENT:
				getAgent().clear();
				getAgent().addAll((Collection<? extends ProvenanceAgent>)newValue);
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
			case FhirPackage.PROVENANCE_ENTITY__ROLE:
				setRole((ProvenanceEntityRole)null);
				return;
			case FhirPackage.PROVENANCE_ENTITY__WHAT_URI:
				setWhatUri((Uri)null);
				return;
			case FhirPackage.PROVENANCE_ENTITY__WHAT_REFERENCE:
				setWhatReference((Reference)null);
				return;
			case FhirPackage.PROVENANCE_ENTITY__WHAT_IDENTIFIER:
				setWhatIdentifier((Identifier)null);
				return;
			case FhirPackage.PROVENANCE_ENTITY__AGENT:
				getAgent().clear();
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
			case FhirPackage.PROVENANCE_ENTITY__ROLE:
				return role != null;
			case FhirPackage.PROVENANCE_ENTITY__WHAT_URI:
				return whatUri != null;
			case FhirPackage.PROVENANCE_ENTITY__WHAT_REFERENCE:
				return whatReference != null;
			case FhirPackage.PROVENANCE_ENTITY__WHAT_IDENTIFIER:
				return whatIdentifier != null;
			case FhirPackage.PROVENANCE_ENTITY__AGENT:
				return agent != null && !agent.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //ProvenanceEntityImpl
