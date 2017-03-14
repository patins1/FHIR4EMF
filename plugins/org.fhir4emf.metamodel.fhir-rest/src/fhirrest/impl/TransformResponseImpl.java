/**
 */
package fhirrest.impl;

import fhirrest.FhirrestPackage;
import fhirrest.TransformResponse;

import java.io.File;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Transform Response</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link fhirrest.impl.TransformResponseImpl#getContent <em>Content</em>}</li>
 *   <li>{@link fhirrest.impl.TransformResponseImpl#getBinaryContent <em>Binary Content</em>}</li>
 * </ul>
 *
 * @generated
 */
@XmlType(name = "TransformResponse", namespace = "http://hl7.org/fhir-rest")
@XmlRootElement(name = "fhirrest.TransformResponse")
public class TransformResponseImpl extends MinimalEObjectImpl.Container implements TransformResponse {
	/**
	 * The default value of the '{@link #getContent() <em>Content</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getContent()
	 * @generated
	 * @ordered
	 */
	protected static final String CONTENT_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getContent() <em>Content</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getContent()
	 * @generated
	 * @ordered
	 */
	protected String content = CONTENT_EDEFAULT;

	/**
	 * The default value of the '{@link #getBinaryContent() <em>Binary Content</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getBinaryContent()
	 * @generated
	 * @ordered
	 */
	protected static final File BINARY_CONTENT_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getBinaryContent() <em>Binary Content</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getBinaryContent()
	 * @generated
	 * @ordered
	 */
	protected File binaryContent = BINARY_CONTENT_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected TransformResponseImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return FhirrestPackage.Literals.TRANSFORM_RESPONSE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getContent() {
		return content;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setContent(String newContent) {
		String oldContent = content;
		content = newContent;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FhirrestPackage.TRANSFORM_RESPONSE__CONTENT, oldContent, content));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public File getBinaryContent() {
		return binaryContent;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setBinaryContent(File newBinaryContent) {
		File oldBinaryContent = binaryContent;
		binaryContent = newBinaryContent;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FhirrestPackage.TRANSFORM_RESPONSE__BINARY_CONTENT, oldBinaryContent, binaryContent));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case FhirrestPackage.TRANSFORM_RESPONSE__CONTENT:
				return getContent();
			case FhirrestPackage.TRANSFORM_RESPONSE__BINARY_CONTENT:
				return getBinaryContent();
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
			case FhirrestPackage.TRANSFORM_RESPONSE__CONTENT:
				setContent((String)newValue);
				return;
			case FhirrestPackage.TRANSFORM_RESPONSE__BINARY_CONTENT:
				setBinaryContent((File)newValue);
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
			case FhirrestPackage.TRANSFORM_RESPONSE__CONTENT:
				setContent(CONTENT_EDEFAULT);
				return;
			case FhirrestPackage.TRANSFORM_RESPONSE__BINARY_CONTENT:
				setBinaryContent(BINARY_CONTENT_EDEFAULT);
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
			case FhirrestPackage.TRANSFORM_RESPONSE__CONTENT:
				return CONTENT_EDEFAULT == null ? content != null : !CONTENT_EDEFAULT.equals(content);
			case FhirrestPackage.TRANSFORM_RESPONSE__BINARY_CONTENT:
				return BINARY_CONTENT_EDEFAULT == null ? binaryContent != null : !BINARY_CONTENT_EDEFAULT.equals(binaryContent);
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
		result.append(" (content: ");
		result.append(content);
		result.append(", binaryContent: ");
		result.append(binaryContent);
		result.append(')');
		return result.toString();
	}

} //TransformResponseImpl
