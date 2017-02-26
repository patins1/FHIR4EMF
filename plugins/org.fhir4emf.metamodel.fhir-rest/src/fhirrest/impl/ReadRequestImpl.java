/**
 */
package fhirrest.impl;

import fhirrest.FhirrestPackage;
import fhirrest.ReadRequest;

import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.bind.annotation.XmlType;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Read Request</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link fhirrest.impl.ReadRequestImpl#getType <em>Type</em>}</li>
 *   <li>{@link fhirrest.impl.ReadRequestImpl#getId <em>Id</em>}</li>
 *   <li>{@link fhirrest.impl.ReadRequestImpl#get_format <em>format</em>}</li>
 * </ul>
 *
 * @generated
 */
@XmlType(name = "ReadRequest", namespace = "http://hl7.org/fhir-rest")
@XmlSeeAlso({ VReadRequestImpl.class })
@XmlRootElement(name = "fhirrest.ReadRequest")
public class ReadRequestImpl extends MinimalEObjectImpl.Container implements ReadRequest {
	/**
	 * The default value of the '{@link #getType() <em>Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getType()
	 * @generated
	 * @ordered
	 */
	protected static final String TYPE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getType() <em>Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getType()
	 * @generated
	 * @ordered
	 */
	protected String type = TYPE_EDEFAULT;

	/**
	 * The default value of the '{@link #getId() <em>Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getId()
	 * @generated
	 * @ordered
	 */
	protected static final String ID_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getId() <em>Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getId()
	 * @generated
	 * @ordered
	 */
	protected String id = ID_EDEFAULT;

	/**
	 * The default value of the '{@link #get_format() <em>format</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #get_format()
	 * @generated
	 * @ordered
	 */
	protected static final String _FORMAT_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #get_format() <em>format</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #get_format()
	 * @generated
	 * @ordered
	 */
	protected String _format = _FORMAT_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ReadRequestImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return FhirrestPackage.Literals.READ_REQUEST;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getType() {
		return type;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setType(String newType) {
		String oldType = type;
		type = newType;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FhirrestPackage.READ_REQUEST__TYPE, oldType, type));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getId() {
		return id;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setId(String newId) {
		String oldId = id;
		id = newId;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FhirrestPackage.READ_REQUEST__ID, oldId, id));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String get_format() {
		return _format;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void set_format(String new_format) {
		String old_format = _format;
		_format = new_format;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FhirrestPackage.READ_REQUEST__FORMAT, old_format, _format));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case FhirrestPackage.READ_REQUEST__TYPE:
				return getType();
			case FhirrestPackage.READ_REQUEST__ID:
				return getId();
			case FhirrestPackage.READ_REQUEST__FORMAT:
				return get_format();
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
			case FhirrestPackage.READ_REQUEST__TYPE:
				setType((String)newValue);
				return;
			case FhirrestPackage.READ_REQUEST__ID:
				setId((String)newValue);
				return;
			case FhirrestPackage.READ_REQUEST__FORMAT:
				set_format((String)newValue);
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
			case FhirrestPackage.READ_REQUEST__TYPE:
				setType(TYPE_EDEFAULT);
				return;
			case FhirrestPackage.READ_REQUEST__ID:
				setId(ID_EDEFAULT);
				return;
			case FhirrestPackage.READ_REQUEST__FORMAT:
				set_format(_FORMAT_EDEFAULT);
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
			case FhirrestPackage.READ_REQUEST__TYPE:
				return TYPE_EDEFAULT == null ? type != null : !TYPE_EDEFAULT.equals(type);
			case FhirrestPackage.READ_REQUEST__ID:
				return ID_EDEFAULT == null ? id != null : !ID_EDEFAULT.equals(id);
			case FhirrestPackage.READ_REQUEST__FORMAT:
				return _FORMAT_EDEFAULT == null ? _format != null : !_FORMAT_EDEFAULT.equals(_format);
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
		result.append(" (type: ");
		result.append(type);
		result.append(", id: ");
		result.append(id);
		result.append(", _format: ");
		result.append(_format);
		result.append(')');
		return result.toString();
	}

} //ReadRequestImpl
