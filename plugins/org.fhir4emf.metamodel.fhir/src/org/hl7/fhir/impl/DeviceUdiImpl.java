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
import org.hl7.fhir.DeviceUdi;
import org.hl7.fhir.FhirPackage;
import org.hl7.fhir.UDIEntryType;
import org.hl7.fhir.Uri;
import org.hl7.fhir.jaxb.Base64BinaryImplAdapter;
import org.hl7.fhir.jaxb.StringImplAdapter;
import org.hl7.fhir.jaxb.UDIEntryTypeImplAdapter;
import org.hl7.fhir.jaxb.UriImplAdapter;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Device Udi</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.hl7.fhir.impl.DeviceUdiImpl#getDeviceIdentifier <em>Device Identifier</em>}</li>
 *   <li>{@link org.hl7.fhir.impl.DeviceUdiImpl#getName <em>Name</em>}</li>
 *   <li>{@link org.hl7.fhir.impl.DeviceUdiImpl#getJurisdiction <em>Jurisdiction</em>}</li>
 *   <li>{@link org.hl7.fhir.impl.DeviceUdiImpl#getCarrierHRF <em>Carrier HRF</em>}</li>
 *   <li>{@link org.hl7.fhir.impl.DeviceUdiImpl#getCarrierAIDC <em>Carrier AIDC</em>}</li>
 *   <li>{@link org.hl7.fhir.impl.DeviceUdiImpl#getIssuer <em>Issuer</em>}</li>
 *   <li>{@link org.hl7.fhir.impl.DeviceUdiImpl#getEntryType <em>Entry Type</em>}</li>
 * </ul>
 *
 * @generated
 */
@XmlType(name = "DeviceUdi", namespace = "http://hl7.org/fhir")
@XmlRootElement(name = "fhir.DeviceUdi")
public class DeviceUdiImpl extends BackboneElementImpl implements DeviceUdi {
	/**
	 * The cached value of the '{@link #getDeviceIdentifier() <em>Device Identifier</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDeviceIdentifier()
	 * @generated
	 * @ordered
	 */
	protected org.hl7.fhir.String deviceIdentifier;

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
	 * The cached value of the '{@link #getJurisdiction() <em>Jurisdiction</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getJurisdiction()
	 * @generated
	 * @ordered
	 */
	protected Uri jurisdiction;

	/**
	 * The cached value of the '{@link #getCarrierHRF() <em>Carrier HRF</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCarrierHRF()
	 * @generated
	 * @ordered
	 */
	protected org.hl7.fhir.String carrierHRF;

	/**
	 * The cached value of the '{@link #getCarrierAIDC() <em>Carrier AIDC</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCarrierAIDC()
	 * @generated
	 * @ordered
	 */
	protected Base64Binary carrierAIDC;

	/**
	 * The cached value of the '{@link #getIssuer() <em>Issuer</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getIssuer()
	 * @generated
	 * @ordered
	 */
	protected Uri issuer;

	/**
	 * The cached value of the '{@link #getEntryType() <em>Entry Type</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getEntryType()
	 * @generated
	 * @ordered
	 */
	protected UDIEntryType entryType;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected DeviceUdiImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return FhirPackage.eINSTANCE.getDeviceUdi();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@XmlJavaTypeAdapter(StringImplAdapter.class)
	public org.hl7.fhir.String getDeviceIdentifier() {
		return deviceIdentifier;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetDeviceIdentifier(org.hl7.fhir.String newDeviceIdentifier, NotificationChain msgs) {
		org.hl7.fhir.String oldDeviceIdentifier = deviceIdentifier;
		deviceIdentifier = newDeviceIdentifier;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FhirPackage.DEVICE_UDI__DEVICE_IDENTIFIER, oldDeviceIdentifier, newDeviceIdentifier);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setDeviceIdentifier(org.hl7.fhir.String newDeviceIdentifier) {
		if (newDeviceIdentifier != deviceIdentifier) {
			NotificationChain msgs = null;
			if (deviceIdentifier != null)
				msgs = ((InternalEObject)deviceIdentifier).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FhirPackage.DEVICE_UDI__DEVICE_IDENTIFIER, null, msgs);
			if (newDeviceIdentifier != null)
				msgs = ((InternalEObject)newDeviceIdentifier).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FhirPackage.DEVICE_UDI__DEVICE_IDENTIFIER, null, msgs);
			msgs = basicSetDeviceIdentifier(newDeviceIdentifier, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FhirPackage.DEVICE_UDI__DEVICE_IDENTIFIER, newDeviceIdentifier, newDeviceIdentifier));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@XmlJavaTypeAdapter(StringImplAdapter.class)
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
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FhirPackage.DEVICE_UDI__NAME, oldName, newName);
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
				msgs = ((InternalEObject)name).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FhirPackage.DEVICE_UDI__NAME, null, msgs);
			if (newName != null)
				msgs = ((InternalEObject)newName).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FhirPackage.DEVICE_UDI__NAME, null, msgs);
			msgs = basicSetName(newName, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FhirPackage.DEVICE_UDI__NAME, newName, newName));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@XmlJavaTypeAdapter(UriImplAdapter.class)
	public Uri getJurisdiction() {
		return jurisdiction;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetJurisdiction(Uri newJurisdiction, NotificationChain msgs) {
		Uri oldJurisdiction = jurisdiction;
		jurisdiction = newJurisdiction;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FhirPackage.DEVICE_UDI__JURISDICTION, oldJurisdiction, newJurisdiction);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setJurisdiction(Uri newJurisdiction) {
		if (newJurisdiction != jurisdiction) {
			NotificationChain msgs = null;
			if (jurisdiction != null)
				msgs = ((InternalEObject)jurisdiction).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FhirPackage.DEVICE_UDI__JURISDICTION, null, msgs);
			if (newJurisdiction != null)
				msgs = ((InternalEObject)newJurisdiction).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FhirPackage.DEVICE_UDI__JURISDICTION, null, msgs);
			msgs = basicSetJurisdiction(newJurisdiction, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FhirPackage.DEVICE_UDI__JURISDICTION, newJurisdiction, newJurisdiction));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@XmlJavaTypeAdapter(StringImplAdapter.class)
	public org.hl7.fhir.String getCarrierHRF() {
		return carrierHRF;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetCarrierHRF(org.hl7.fhir.String newCarrierHRF, NotificationChain msgs) {
		org.hl7.fhir.String oldCarrierHRF = carrierHRF;
		carrierHRF = newCarrierHRF;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FhirPackage.DEVICE_UDI__CARRIER_HRF, oldCarrierHRF, newCarrierHRF);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setCarrierHRF(org.hl7.fhir.String newCarrierHRF) {
		if (newCarrierHRF != carrierHRF) {
			NotificationChain msgs = null;
			if (carrierHRF != null)
				msgs = ((InternalEObject)carrierHRF).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FhirPackage.DEVICE_UDI__CARRIER_HRF, null, msgs);
			if (newCarrierHRF != null)
				msgs = ((InternalEObject)newCarrierHRF).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FhirPackage.DEVICE_UDI__CARRIER_HRF, null, msgs);
			msgs = basicSetCarrierHRF(newCarrierHRF, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FhirPackage.DEVICE_UDI__CARRIER_HRF, newCarrierHRF, newCarrierHRF));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@XmlJavaTypeAdapter(Base64BinaryImplAdapter.class)
	public Base64Binary getCarrierAIDC() {
		return carrierAIDC;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetCarrierAIDC(Base64Binary newCarrierAIDC, NotificationChain msgs) {
		Base64Binary oldCarrierAIDC = carrierAIDC;
		carrierAIDC = newCarrierAIDC;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FhirPackage.DEVICE_UDI__CARRIER_AIDC, oldCarrierAIDC, newCarrierAIDC);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setCarrierAIDC(Base64Binary newCarrierAIDC) {
		if (newCarrierAIDC != carrierAIDC) {
			NotificationChain msgs = null;
			if (carrierAIDC != null)
				msgs = ((InternalEObject)carrierAIDC).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FhirPackage.DEVICE_UDI__CARRIER_AIDC, null, msgs);
			if (newCarrierAIDC != null)
				msgs = ((InternalEObject)newCarrierAIDC).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FhirPackage.DEVICE_UDI__CARRIER_AIDC, null, msgs);
			msgs = basicSetCarrierAIDC(newCarrierAIDC, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FhirPackage.DEVICE_UDI__CARRIER_AIDC, newCarrierAIDC, newCarrierAIDC));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@XmlJavaTypeAdapter(UriImplAdapter.class)
	public Uri getIssuer() {
		return issuer;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetIssuer(Uri newIssuer, NotificationChain msgs) {
		Uri oldIssuer = issuer;
		issuer = newIssuer;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FhirPackage.DEVICE_UDI__ISSUER, oldIssuer, newIssuer);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setIssuer(Uri newIssuer) {
		if (newIssuer != issuer) {
			NotificationChain msgs = null;
			if (issuer != null)
				msgs = ((InternalEObject)issuer).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FhirPackage.DEVICE_UDI__ISSUER, null, msgs);
			if (newIssuer != null)
				msgs = ((InternalEObject)newIssuer).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FhirPackage.DEVICE_UDI__ISSUER, null, msgs);
			msgs = basicSetIssuer(newIssuer, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FhirPackage.DEVICE_UDI__ISSUER, newIssuer, newIssuer));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@XmlJavaTypeAdapter(UDIEntryTypeImplAdapter.class)
	public UDIEntryType getEntryType() {
		return entryType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetEntryType(UDIEntryType newEntryType, NotificationChain msgs) {
		UDIEntryType oldEntryType = entryType;
		entryType = newEntryType;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FhirPackage.DEVICE_UDI__ENTRY_TYPE, oldEntryType, newEntryType);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setEntryType(UDIEntryType newEntryType) {
		if (newEntryType != entryType) {
			NotificationChain msgs = null;
			if (entryType != null)
				msgs = ((InternalEObject)entryType).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FhirPackage.DEVICE_UDI__ENTRY_TYPE, null, msgs);
			if (newEntryType != null)
				msgs = ((InternalEObject)newEntryType).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FhirPackage.DEVICE_UDI__ENTRY_TYPE, null, msgs);
			msgs = basicSetEntryType(newEntryType, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FhirPackage.DEVICE_UDI__ENTRY_TYPE, newEntryType, newEntryType));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case FhirPackage.DEVICE_UDI__DEVICE_IDENTIFIER:
				return basicSetDeviceIdentifier(null, msgs);
			case FhirPackage.DEVICE_UDI__NAME:
				return basicSetName(null, msgs);
			case FhirPackage.DEVICE_UDI__JURISDICTION:
				return basicSetJurisdiction(null, msgs);
			case FhirPackage.DEVICE_UDI__CARRIER_HRF:
				return basicSetCarrierHRF(null, msgs);
			case FhirPackage.DEVICE_UDI__CARRIER_AIDC:
				return basicSetCarrierAIDC(null, msgs);
			case FhirPackage.DEVICE_UDI__ISSUER:
				return basicSetIssuer(null, msgs);
			case FhirPackage.DEVICE_UDI__ENTRY_TYPE:
				return basicSetEntryType(null, msgs);
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
			case FhirPackage.DEVICE_UDI__DEVICE_IDENTIFIER:
				return getDeviceIdentifier();
			case FhirPackage.DEVICE_UDI__NAME:
				return getName();
			case FhirPackage.DEVICE_UDI__JURISDICTION:
				return getJurisdiction();
			case FhirPackage.DEVICE_UDI__CARRIER_HRF:
				return getCarrierHRF();
			case FhirPackage.DEVICE_UDI__CARRIER_AIDC:
				return getCarrierAIDC();
			case FhirPackage.DEVICE_UDI__ISSUER:
				return getIssuer();
			case FhirPackage.DEVICE_UDI__ENTRY_TYPE:
				return getEntryType();
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
			case FhirPackage.DEVICE_UDI__DEVICE_IDENTIFIER:
				setDeviceIdentifier((org.hl7.fhir.String)newValue);
				return;
			case FhirPackage.DEVICE_UDI__NAME:
				setName((org.hl7.fhir.String)newValue);
				return;
			case FhirPackage.DEVICE_UDI__JURISDICTION:
				setJurisdiction((Uri)newValue);
				return;
			case FhirPackage.DEVICE_UDI__CARRIER_HRF:
				setCarrierHRF((org.hl7.fhir.String)newValue);
				return;
			case FhirPackage.DEVICE_UDI__CARRIER_AIDC:
				setCarrierAIDC((Base64Binary)newValue);
				return;
			case FhirPackage.DEVICE_UDI__ISSUER:
				setIssuer((Uri)newValue);
				return;
			case FhirPackage.DEVICE_UDI__ENTRY_TYPE:
				setEntryType((UDIEntryType)newValue);
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
			case FhirPackage.DEVICE_UDI__DEVICE_IDENTIFIER:
				setDeviceIdentifier((org.hl7.fhir.String)null);
				return;
			case FhirPackage.DEVICE_UDI__NAME:
				setName((org.hl7.fhir.String)null);
				return;
			case FhirPackage.DEVICE_UDI__JURISDICTION:
				setJurisdiction((Uri)null);
				return;
			case FhirPackage.DEVICE_UDI__CARRIER_HRF:
				setCarrierHRF((org.hl7.fhir.String)null);
				return;
			case FhirPackage.DEVICE_UDI__CARRIER_AIDC:
				setCarrierAIDC((Base64Binary)null);
				return;
			case FhirPackage.DEVICE_UDI__ISSUER:
				setIssuer((Uri)null);
				return;
			case FhirPackage.DEVICE_UDI__ENTRY_TYPE:
				setEntryType((UDIEntryType)null);
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
			case FhirPackage.DEVICE_UDI__DEVICE_IDENTIFIER:
				return deviceIdentifier != null;
			case FhirPackage.DEVICE_UDI__NAME:
				return name != null;
			case FhirPackage.DEVICE_UDI__JURISDICTION:
				return jurisdiction != null;
			case FhirPackage.DEVICE_UDI__CARRIER_HRF:
				return carrierHRF != null;
			case FhirPackage.DEVICE_UDI__CARRIER_AIDC:
				return carrierAIDC != null;
			case FhirPackage.DEVICE_UDI__ISSUER:
				return issuer != null;
			case FhirPackage.DEVICE_UDI__ENTRY_TYPE:
				return entryType != null;
		}
		return super.eIsSet(featureID);
	}

} //DeviceUdiImpl
