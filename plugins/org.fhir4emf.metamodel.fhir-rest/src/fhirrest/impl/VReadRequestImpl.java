/**
 */
package fhirrest.impl;

import fhirrest.FhirrestPackage;
import fhirrest.VReadRequest;

import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>VRead Request</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link fhirrest.impl.VReadRequestImpl#getVid <em>Vid</em>}</li>
 * </ul>
 *
 * @generated
 */
@XmlType(name = "VReadRequest", namespace = "http://hl7.org/fhir-rest")
@XmlRootElement(name = "fhirrest.VReadRequest")
public class VReadRequestImpl extends ReadRequestImpl implements VReadRequest {
	/**
	 * The default value of the '{@link #getVid() <em>Vid</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getVid()
	 * @generated
	 * @ordered
	 */
	protected static final String VID_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getVid() <em>Vid</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getVid()
	 * @generated
	 * @ordered
	 */
	protected String vid = VID_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected VReadRequestImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return FhirrestPackage.Literals.VREAD_REQUEST;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getVid() {
		return vid;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setVid(String newVid) {
		String oldVid = vid;
		vid = newVid;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FhirrestPackage.VREAD_REQUEST__VID, oldVid, vid));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case FhirrestPackage.VREAD_REQUEST__VID:
				return getVid();
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
			case FhirrestPackage.VREAD_REQUEST__VID:
				setVid((String)newValue);
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
			case FhirrestPackage.VREAD_REQUEST__VID:
				setVid(VID_EDEFAULT);
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
			case FhirrestPackage.VREAD_REQUEST__VID:
				return VID_EDEFAULT == null ? vid != null : !VID_EDEFAULT.equals(vid);
		}
		return super.eIsSet(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String toString() {
		if (eIsProxy()) return super.toString();

		StringBuffer result = new StringBuffer(super.toString());
		result.append(" (vid: ");
		result.append(vid);
		result.append(')');
		return result.toString();
	}

} //VReadRequestImpl
