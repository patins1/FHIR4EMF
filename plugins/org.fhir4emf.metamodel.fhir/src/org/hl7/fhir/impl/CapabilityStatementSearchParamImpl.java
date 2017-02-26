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

import org.hl7.fhir.CapabilityStatementSearchParam;
import org.hl7.fhir.FhirPackage;
import org.hl7.fhir.SearchParamType;
import org.hl7.fhir.Uri;
import org.hl7.fhir.jaxb.SearchParamTypeImplAdapter;
import org.hl7.fhir.jaxb.StringImplAdapter;
import org.hl7.fhir.jaxb.UriImplAdapter;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Capability Statement Search Param</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.hl7.fhir.impl.CapabilityStatementSearchParamImpl#getName <em>Name</em>}</li>
 *   <li>{@link org.hl7.fhir.impl.CapabilityStatementSearchParamImpl#getDefinition <em>Definition</em>}</li>
 *   <li>{@link org.hl7.fhir.impl.CapabilityStatementSearchParamImpl#getType <em>Type</em>}</li>
 *   <li>{@link org.hl7.fhir.impl.CapabilityStatementSearchParamImpl#getDocumentation <em>Documentation</em>}</li>
 * </ul>
 *
 * @generated
 */
@XmlType(name = "CapabilityStatementSearchParam", namespace = "http://hl7.org/fhir")
@XmlRootElement(name = "fhir.CapabilityStatementSearchParam")
public class CapabilityStatementSearchParamImpl extends BackboneElementImpl implements CapabilityStatementSearchParam {
	/**
	 * The cached value of the '{@link #getName() <em>Name</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getName()
	 * @generated
	 * @ordered
	 */
	protected org.hl7.fhir.String name;

	/**
	 * The cached value of the '{@link #getDefinition() <em>Definition</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDefinition()
	 * @generated
	 * @ordered
	 */
	protected Uri definition;

	/**
	 * The cached value of the '{@link #getType() <em>Type</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getType()
	 * @generated
	 * @ordered
	 */
	protected SearchParamType type;

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
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected CapabilityStatementSearchParamImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return FhirPackage.eINSTANCE.getCapabilityStatementSearchParam();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@XmlJavaTypeAdapter(StringImplAdapter.class)
	@XmlElement(required = true)
	public org.hl7.fhir.String getName() {
		return name;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetName(org.hl7.fhir.String newName, NotificationChain msgs) {
		org.hl7.fhir.String oldName = name;
		name = newName;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FhirPackage.CAPABILITY_STATEMENT_SEARCH_PARAM__NAME, oldName, newName);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setName(org.hl7.fhir.String newName) {
		if (newName != name) {
			NotificationChain msgs = null;
			if (name != null)
				msgs = ((InternalEObject)name).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FhirPackage.CAPABILITY_STATEMENT_SEARCH_PARAM__NAME, null, msgs);
			if (newName != null)
				msgs = ((InternalEObject)newName).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FhirPackage.CAPABILITY_STATEMENT_SEARCH_PARAM__NAME, null, msgs);
			msgs = basicSetName(newName, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FhirPackage.CAPABILITY_STATEMENT_SEARCH_PARAM__NAME, newName, newName));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@XmlJavaTypeAdapter(UriImplAdapter.class)
	public Uri getDefinition() {
		return definition;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetDefinition(Uri newDefinition, NotificationChain msgs) {
		Uri oldDefinition = definition;
		definition = newDefinition;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FhirPackage.CAPABILITY_STATEMENT_SEARCH_PARAM__DEFINITION, oldDefinition, newDefinition);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setDefinition(Uri newDefinition) {
		if (newDefinition != definition) {
			NotificationChain msgs = null;
			if (definition != null)
				msgs = ((InternalEObject)definition).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FhirPackage.CAPABILITY_STATEMENT_SEARCH_PARAM__DEFINITION, null, msgs);
			if (newDefinition != null)
				msgs = ((InternalEObject)newDefinition).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FhirPackage.CAPABILITY_STATEMENT_SEARCH_PARAM__DEFINITION, null, msgs);
			msgs = basicSetDefinition(newDefinition, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FhirPackage.CAPABILITY_STATEMENT_SEARCH_PARAM__DEFINITION, newDefinition, newDefinition));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@XmlJavaTypeAdapter(SearchParamTypeImplAdapter.class)
	@XmlElement(required = true)
	public SearchParamType getType() {
		return type;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetType(SearchParamType newType, NotificationChain msgs) {
		SearchParamType oldType = type;
		type = newType;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FhirPackage.CAPABILITY_STATEMENT_SEARCH_PARAM__TYPE, oldType, newType);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setType(SearchParamType newType) {
		if (newType != type) {
			NotificationChain msgs = null;
			if (type != null)
				msgs = ((InternalEObject)type).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FhirPackage.CAPABILITY_STATEMENT_SEARCH_PARAM__TYPE, null, msgs);
			if (newType != null)
				msgs = ((InternalEObject)newType).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FhirPackage.CAPABILITY_STATEMENT_SEARCH_PARAM__TYPE, null, msgs);
			msgs = basicSetType(newType, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FhirPackage.CAPABILITY_STATEMENT_SEARCH_PARAM__TYPE, newType, newType));
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
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FhirPackage.CAPABILITY_STATEMENT_SEARCH_PARAM__DOCUMENTATION, oldDocumentation, newDocumentation);
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
				msgs = ((InternalEObject)documentation).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FhirPackage.CAPABILITY_STATEMENT_SEARCH_PARAM__DOCUMENTATION, null, msgs);
			if (newDocumentation != null)
				msgs = ((InternalEObject)newDocumentation).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FhirPackage.CAPABILITY_STATEMENT_SEARCH_PARAM__DOCUMENTATION, null, msgs);
			msgs = basicSetDocumentation(newDocumentation, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FhirPackage.CAPABILITY_STATEMENT_SEARCH_PARAM__DOCUMENTATION, newDocumentation, newDocumentation));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case FhirPackage.CAPABILITY_STATEMENT_SEARCH_PARAM__NAME:
				return basicSetName(null, msgs);
			case FhirPackage.CAPABILITY_STATEMENT_SEARCH_PARAM__DEFINITION:
				return basicSetDefinition(null, msgs);
			case FhirPackage.CAPABILITY_STATEMENT_SEARCH_PARAM__TYPE:
				return basicSetType(null, msgs);
			case FhirPackage.CAPABILITY_STATEMENT_SEARCH_PARAM__DOCUMENTATION:
				return basicSetDocumentation(null, msgs);
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
			case FhirPackage.CAPABILITY_STATEMENT_SEARCH_PARAM__NAME:
				return getName();
			case FhirPackage.CAPABILITY_STATEMENT_SEARCH_PARAM__DEFINITION:
				return getDefinition();
			case FhirPackage.CAPABILITY_STATEMENT_SEARCH_PARAM__TYPE:
				return getType();
			case FhirPackage.CAPABILITY_STATEMENT_SEARCH_PARAM__DOCUMENTATION:
				return getDocumentation();
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
			case FhirPackage.CAPABILITY_STATEMENT_SEARCH_PARAM__NAME:
				setName((org.hl7.fhir.String)newValue);
				return;
			case FhirPackage.CAPABILITY_STATEMENT_SEARCH_PARAM__DEFINITION:
				setDefinition((Uri)newValue);
				return;
			case FhirPackage.CAPABILITY_STATEMENT_SEARCH_PARAM__TYPE:
				setType((SearchParamType)newValue);
				return;
			case FhirPackage.CAPABILITY_STATEMENT_SEARCH_PARAM__DOCUMENTATION:
				setDocumentation((org.hl7.fhir.String)newValue);
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
			case FhirPackage.CAPABILITY_STATEMENT_SEARCH_PARAM__NAME:
				setName((org.hl7.fhir.String)null);
				return;
			case FhirPackage.CAPABILITY_STATEMENT_SEARCH_PARAM__DEFINITION:
				setDefinition((Uri)null);
				return;
			case FhirPackage.CAPABILITY_STATEMENT_SEARCH_PARAM__TYPE:
				setType((SearchParamType)null);
				return;
			case FhirPackage.CAPABILITY_STATEMENT_SEARCH_PARAM__DOCUMENTATION:
				setDocumentation((org.hl7.fhir.String)null);
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
			case FhirPackage.CAPABILITY_STATEMENT_SEARCH_PARAM__NAME:
				return name != null;
			case FhirPackage.CAPABILITY_STATEMENT_SEARCH_PARAM__DEFINITION:
				return definition != null;
			case FhirPackage.CAPABILITY_STATEMENT_SEARCH_PARAM__TYPE:
				return type != null;
			case FhirPackage.CAPABILITY_STATEMENT_SEARCH_PARAM__DOCUMENTATION:
				return documentation != null;
		}
		return super.eIsSet(featureID);
	}

} //CapabilityStatementSearchParamImpl
