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

import org.hl7.fhir.CatalogDocument;
import org.hl7.fhir.CodeableConcept;
import org.hl7.fhir.DateTime;
import org.hl7.fhir.FhirPackage;
import org.hl7.fhir.Identifier;
import org.hl7.fhir.Reference;
import org.hl7.fhir.jaxb.DateTimeImplAdapter;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Catalog Document</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.hl7.fhir.impl.CatalogDocumentImpl#getStatus <em>Status</em>}</li>
 *   <li>{@link org.hl7.fhir.impl.CatalogDocumentImpl#getProvider <em>Provider</em>}</li>
 *   <li>{@link org.hl7.fhir.impl.CatalogDocumentImpl#getContentType <em>Content Type</em>}</li>
 *   <li>{@link org.hl7.fhir.impl.CatalogDocumentImpl#getUpdateMode <em>Update Mode</em>}</li>
 *   <li>{@link org.hl7.fhir.impl.CatalogDocumentImpl#getIdentifier <em>Identifier</em>}</li>
 *   <li>{@link org.hl7.fhir.impl.CatalogDocumentImpl#getContentVersion <em>Content Version</em>}</li>
 *   <li>{@link org.hl7.fhir.impl.CatalogDocumentImpl#getIssueDate <em>Issue Date</em>}</li>
 *   <li>{@link org.hl7.fhir.impl.CatalogDocumentImpl#getValidFrom <em>Valid From</em>}</li>
 *   <li>{@link org.hl7.fhir.impl.CatalogDocumentImpl#getValidTo <em>Valid To</em>}</li>
 * </ul>
 *
 * @generated
 */
@XmlType(name = "CatalogDocument", namespace = "http://hl7.org/fhir")
@XmlRootElement(name = "fhir.CatalogDocument")
public class CatalogDocumentImpl extends BackboneElementImpl implements CatalogDocument {
	/**
	 * The cached value of the '{@link #getStatus() <em>Status</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getStatus()
	 * @generated
	 * @ordered
	 */
	protected CodeableConcept status;

	/**
	 * The cached value of the '{@link #getProvider() <em>Provider</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getProvider()
	 * @generated
	 * @ordered
	 */
	protected Reference provider;

	/**
	 * The cached value of the '{@link #getContentType() <em>Content Type</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getContentType()
	 * @generated
	 * @ordered
	 */
	protected CodeableConcept contentType;

	/**
	 * The cached value of the '{@link #getUpdateMode() <em>Update Mode</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getUpdateMode()
	 * @generated
	 * @ordered
	 */
	protected CodeableConcept updateMode;

	/**
	 * The cached value of the '{@link #getIdentifier() <em>Identifier</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getIdentifier()
	 * @generated
	 * @ordered
	 */
	protected Identifier identifier;

	/**
	 * The cached value of the '{@link #getContentVersion() <em>Content Version</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getContentVersion()
	 * @generated
	 * @ordered
	 */
	protected Identifier contentVersion;

	/**
	 * The cached value of the '{@link #getIssueDate() <em>Issue Date</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getIssueDate()
	 * @generated
	 * @ordered
	 */
	protected DateTime issueDate;

	/**
	 * The cached value of the '{@link #getValidFrom() <em>Valid From</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getValidFrom()
	 * @generated
	 * @ordered
	 */
	protected DateTime validFrom;

	/**
	 * The cached value of the '{@link #getValidTo() <em>Valid To</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getValidTo()
	 * @generated
	 * @ordered
	 */
	protected DateTime validTo;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected CatalogDocumentImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return FhirPackage.eINSTANCE.getCatalogDocument();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@XmlElement(required = true)
	public CodeableConcept getStatus() {
		return status;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetStatus(CodeableConcept newStatus, NotificationChain msgs) {
		CodeableConcept oldStatus = status;
		status = newStatus;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FhirPackage.CATALOG_DOCUMENT__STATUS, oldStatus, newStatus);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setStatus(CodeableConcept newStatus) {
		if (newStatus != status) {
			NotificationChain msgs = null;
			if (status != null)
				msgs = ((InternalEObject)status).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FhirPackage.CATALOG_DOCUMENT__STATUS, null, msgs);
			if (newStatus != null)
				msgs = ((InternalEObject)newStatus).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FhirPackage.CATALOG_DOCUMENT__STATUS, null, msgs);
			msgs = basicSetStatus(newStatus, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FhirPackage.CATALOG_DOCUMENT__STATUS, newStatus, newStatus));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@XmlElement(required = true)
	public Reference getProvider() {
		return provider;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetProvider(Reference newProvider, NotificationChain msgs) {
		Reference oldProvider = provider;
		provider = newProvider;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FhirPackage.CATALOG_DOCUMENT__PROVIDER, oldProvider, newProvider);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setProvider(Reference newProvider) {
		if (newProvider != provider) {
			NotificationChain msgs = null;
			if (provider != null)
				msgs = ((InternalEObject)provider).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FhirPackage.CATALOG_DOCUMENT__PROVIDER, null, msgs);
			if (newProvider != null)
				msgs = ((InternalEObject)newProvider).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FhirPackage.CATALOG_DOCUMENT__PROVIDER, null, msgs);
			msgs = basicSetProvider(newProvider, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FhirPackage.CATALOG_DOCUMENT__PROVIDER, newProvider, newProvider));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@XmlElement(required = true)
	public CodeableConcept getContentType() {
		return contentType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetContentType(CodeableConcept newContentType, NotificationChain msgs) {
		CodeableConcept oldContentType = contentType;
		contentType = newContentType;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FhirPackage.CATALOG_DOCUMENT__CONTENT_TYPE, oldContentType, newContentType);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setContentType(CodeableConcept newContentType) {
		if (newContentType != contentType) {
			NotificationChain msgs = null;
			if (contentType != null)
				msgs = ((InternalEObject)contentType).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FhirPackage.CATALOG_DOCUMENT__CONTENT_TYPE, null, msgs);
			if (newContentType != null)
				msgs = ((InternalEObject)newContentType).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FhirPackage.CATALOG_DOCUMENT__CONTENT_TYPE, null, msgs);
			msgs = basicSetContentType(newContentType, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FhirPackage.CATALOG_DOCUMENT__CONTENT_TYPE, newContentType, newContentType));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@XmlElement(required = true)
	public CodeableConcept getUpdateMode() {
		return updateMode;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetUpdateMode(CodeableConcept newUpdateMode, NotificationChain msgs) {
		CodeableConcept oldUpdateMode = updateMode;
		updateMode = newUpdateMode;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FhirPackage.CATALOG_DOCUMENT__UPDATE_MODE, oldUpdateMode, newUpdateMode);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setUpdateMode(CodeableConcept newUpdateMode) {
		if (newUpdateMode != updateMode) {
			NotificationChain msgs = null;
			if (updateMode != null)
				msgs = ((InternalEObject)updateMode).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FhirPackage.CATALOG_DOCUMENT__UPDATE_MODE, null, msgs);
			if (newUpdateMode != null)
				msgs = ((InternalEObject)newUpdateMode).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FhirPackage.CATALOG_DOCUMENT__UPDATE_MODE, null, msgs);
			msgs = basicSetUpdateMode(newUpdateMode, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FhirPackage.CATALOG_DOCUMENT__UPDATE_MODE, newUpdateMode, newUpdateMode));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Identifier getIdentifier() {
		return identifier;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetIdentifier(Identifier newIdentifier, NotificationChain msgs) {
		Identifier oldIdentifier = identifier;
		identifier = newIdentifier;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FhirPackage.CATALOG_DOCUMENT__IDENTIFIER, oldIdentifier, newIdentifier);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setIdentifier(Identifier newIdentifier) {
		if (newIdentifier != identifier) {
			NotificationChain msgs = null;
			if (identifier != null)
				msgs = ((InternalEObject)identifier).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FhirPackage.CATALOG_DOCUMENT__IDENTIFIER, null, msgs);
			if (newIdentifier != null)
				msgs = ((InternalEObject)newIdentifier).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FhirPackage.CATALOG_DOCUMENT__IDENTIFIER, null, msgs);
			msgs = basicSetIdentifier(newIdentifier, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FhirPackage.CATALOG_DOCUMENT__IDENTIFIER, newIdentifier, newIdentifier));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Identifier getContentVersion() {
		return contentVersion;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetContentVersion(Identifier newContentVersion, NotificationChain msgs) {
		Identifier oldContentVersion = contentVersion;
		contentVersion = newContentVersion;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FhirPackage.CATALOG_DOCUMENT__CONTENT_VERSION, oldContentVersion, newContentVersion);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setContentVersion(Identifier newContentVersion) {
		if (newContentVersion != contentVersion) {
			NotificationChain msgs = null;
			if (contentVersion != null)
				msgs = ((InternalEObject)contentVersion).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FhirPackage.CATALOG_DOCUMENT__CONTENT_VERSION, null, msgs);
			if (newContentVersion != null)
				msgs = ((InternalEObject)newContentVersion).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FhirPackage.CATALOG_DOCUMENT__CONTENT_VERSION, null, msgs);
			msgs = basicSetContentVersion(newContentVersion, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FhirPackage.CATALOG_DOCUMENT__CONTENT_VERSION, newContentVersion, newContentVersion));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@XmlJavaTypeAdapter(DateTimeImplAdapter.class)
	public DateTime getIssueDate() {
		return issueDate;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetIssueDate(DateTime newIssueDate, NotificationChain msgs) {
		DateTime oldIssueDate = issueDate;
		issueDate = newIssueDate;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FhirPackage.CATALOG_DOCUMENT__ISSUE_DATE, oldIssueDate, newIssueDate);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setIssueDate(DateTime newIssueDate) {
		if (newIssueDate != issueDate) {
			NotificationChain msgs = null;
			if (issueDate != null)
				msgs = ((InternalEObject)issueDate).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FhirPackage.CATALOG_DOCUMENT__ISSUE_DATE, null, msgs);
			if (newIssueDate != null)
				msgs = ((InternalEObject)newIssueDate).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FhirPackage.CATALOG_DOCUMENT__ISSUE_DATE, null, msgs);
			msgs = basicSetIssueDate(newIssueDate, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FhirPackage.CATALOG_DOCUMENT__ISSUE_DATE, newIssueDate, newIssueDate));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@XmlJavaTypeAdapter(DateTimeImplAdapter.class)
	public DateTime getValidFrom() {
		return validFrom;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetValidFrom(DateTime newValidFrom, NotificationChain msgs) {
		DateTime oldValidFrom = validFrom;
		validFrom = newValidFrom;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FhirPackage.CATALOG_DOCUMENT__VALID_FROM, oldValidFrom, newValidFrom);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setValidFrom(DateTime newValidFrom) {
		if (newValidFrom != validFrom) {
			NotificationChain msgs = null;
			if (validFrom != null)
				msgs = ((InternalEObject)validFrom).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FhirPackage.CATALOG_DOCUMENT__VALID_FROM, null, msgs);
			if (newValidFrom != null)
				msgs = ((InternalEObject)newValidFrom).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FhirPackage.CATALOG_DOCUMENT__VALID_FROM, null, msgs);
			msgs = basicSetValidFrom(newValidFrom, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FhirPackage.CATALOG_DOCUMENT__VALID_FROM, newValidFrom, newValidFrom));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@XmlJavaTypeAdapter(DateTimeImplAdapter.class)
	public DateTime getValidTo() {
		return validTo;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetValidTo(DateTime newValidTo, NotificationChain msgs) {
		DateTime oldValidTo = validTo;
		validTo = newValidTo;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FhirPackage.CATALOG_DOCUMENT__VALID_TO, oldValidTo, newValidTo);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setValidTo(DateTime newValidTo) {
		if (newValidTo != validTo) {
			NotificationChain msgs = null;
			if (validTo != null)
				msgs = ((InternalEObject)validTo).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FhirPackage.CATALOG_DOCUMENT__VALID_TO, null, msgs);
			if (newValidTo != null)
				msgs = ((InternalEObject)newValidTo).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FhirPackage.CATALOG_DOCUMENT__VALID_TO, null, msgs);
			msgs = basicSetValidTo(newValidTo, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FhirPackage.CATALOG_DOCUMENT__VALID_TO, newValidTo, newValidTo));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case FhirPackage.CATALOG_DOCUMENT__STATUS:
				return basicSetStatus(null, msgs);
			case FhirPackage.CATALOG_DOCUMENT__PROVIDER:
				return basicSetProvider(null, msgs);
			case FhirPackage.CATALOG_DOCUMENT__CONTENT_TYPE:
				return basicSetContentType(null, msgs);
			case FhirPackage.CATALOG_DOCUMENT__UPDATE_MODE:
				return basicSetUpdateMode(null, msgs);
			case FhirPackage.CATALOG_DOCUMENT__IDENTIFIER:
				return basicSetIdentifier(null, msgs);
			case FhirPackage.CATALOG_DOCUMENT__CONTENT_VERSION:
				return basicSetContentVersion(null, msgs);
			case FhirPackage.CATALOG_DOCUMENT__ISSUE_DATE:
				return basicSetIssueDate(null, msgs);
			case FhirPackage.CATALOG_DOCUMENT__VALID_FROM:
				return basicSetValidFrom(null, msgs);
			case FhirPackage.CATALOG_DOCUMENT__VALID_TO:
				return basicSetValidTo(null, msgs);
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
			case FhirPackage.CATALOG_DOCUMENT__STATUS:
				return getStatus();
			case FhirPackage.CATALOG_DOCUMENT__PROVIDER:
				return getProvider();
			case FhirPackage.CATALOG_DOCUMENT__CONTENT_TYPE:
				return getContentType();
			case FhirPackage.CATALOG_DOCUMENT__UPDATE_MODE:
				return getUpdateMode();
			case FhirPackage.CATALOG_DOCUMENT__IDENTIFIER:
				return getIdentifier();
			case FhirPackage.CATALOG_DOCUMENT__CONTENT_VERSION:
				return getContentVersion();
			case FhirPackage.CATALOG_DOCUMENT__ISSUE_DATE:
				return getIssueDate();
			case FhirPackage.CATALOG_DOCUMENT__VALID_FROM:
				return getValidFrom();
			case FhirPackage.CATALOG_DOCUMENT__VALID_TO:
				return getValidTo();
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
			case FhirPackage.CATALOG_DOCUMENT__STATUS:
				setStatus((CodeableConcept)newValue);
				return;
			case FhirPackage.CATALOG_DOCUMENT__PROVIDER:
				setProvider((Reference)newValue);
				return;
			case FhirPackage.CATALOG_DOCUMENT__CONTENT_TYPE:
				setContentType((CodeableConcept)newValue);
				return;
			case FhirPackage.CATALOG_DOCUMENT__UPDATE_MODE:
				setUpdateMode((CodeableConcept)newValue);
				return;
			case FhirPackage.CATALOG_DOCUMENT__IDENTIFIER:
				setIdentifier((Identifier)newValue);
				return;
			case FhirPackage.CATALOG_DOCUMENT__CONTENT_VERSION:
				setContentVersion((Identifier)newValue);
				return;
			case FhirPackage.CATALOG_DOCUMENT__ISSUE_DATE:
				setIssueDate((DateTime)newValue);
				return;
			case FhirPackage.CATALOG_DOCUMENT__VALID_FROM:
				setValidFrom((DateTime)newValue);
				return;
			case FhirPackage.CATALOG_DOCUMENT__VALID_TO:
				setValidTo((DateTime)newValue);
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
			case FhirPackage.CATALOG_DOCUMENT__STATUS:
				setStatus((CodeableConcept)null);
				return;
			case FhirPackage.CATALOG_DOCUMENT__PROVIDER:
				setProvider((Reference)null);
				return;
			case FhirPackage.CATALOG_DOCUMENT__CONTENT_TYPE:
				setContentType((CodeableConcept)null);
				return;
			case FhirPackage.CATALOG_DOCUMENT__UPDATE_MODE:
				setUpdateMode((CodeableConcept)null);
				return;
			case FhirPackage.CATALOG_DOCUMENT__IDENTIFIER:
				setIdentifier((Identifier)null);
				return;
			case FhirPackage.CATALOG_DOCUMENT__CONTENT_VERSION:
				setContentVersion((Identifier)null);
				return;
			case FhirPackage.CATALOG_DOCUMENT__ISSUE_DATE:
				setIssueDate((DateTime)null);
				return;
			case FhirPackage.CATALOG_DOCUMENT__VALID_FROM:
				setValidFrom((DateTime)null);
				return;
			case FhirPackage.CATALOG_DOCUMENT__VALID_TO:
				setValidTo((DateTime)null);
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
			case FhirPackage.CATALOG_DOCUMENT__STATUS:
				return status != null;
			case FhirPackage.CATALOG_DOCUMENT__PROVIDER:
				return provider != null;
			case FhirPackage.CATALOG_DOCUMENT__CONTENT_TYPE:
				return contentType != null;
			case FhirPackage.CATALOG_DOCUMENT__UPDATE_MODE:
				return updateMode != null;
			case FhirPackage.CATALOG_DOCUMENT__IDENTIFIER:
				return identifier != null;
			case FhirPackage.CATALOG_DOCUMENT__CONTENT_VERSION:
				return contentVersion != null;
			case FhirPackage.CATALOG_DOCUMENT__ISSUE_DATE:
				return issueDate != null;
			case FhirPackage.CATALOG_DOCUMENT__VALID_FROM:
				return validFrom != null;
			case FhirPackage.CATALOG_DOCUMENT__VALID_TO:
				return validTo != null;
		}
		return super.eIsSet(featureID);
	}

} //CatalogDocumentImpl
