/**
 */
package fhirrest.impl;

import fhirrest.FhirrestPackage;
import fhirrest.TransformRequest;

import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Transform Request</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link fhirrest.impl.TransformRequestImpl#getInputFormat <em>Input Format</em>}</li>
 *   <li>{@link fhirrest.impl.TransformRequestImpl#getContent <em>Content</em>}</li>
 *   <li>{@link fhirrest.impl.TransformRequestImpl#getOutputFormat <em>Output Format</em>}</li>
 * </ul>
 *
 * @generated
 */
@XmlType(name = "TransformRequest", namespace = "http://hl7.org/fhir-rest")
@XmlRootElement(name = "fhirrest.TransformRequest")
public class TransformRequestImpl extends MinimalEObjectImpl.Container implements TransformRequest {
	/**
	 * The default value of the '{@link #getInputFormat() <em>Input Format</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getInputFormat()
	 * @generated
	 * @ordered
	 */
	protected static final String INPUT_FORMAT_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getInputFormat() <em>Input Format</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getInputFormat()
	 * @generated
	 * @ordered
	 */
	protected String inputFormat = INPUT_FORMAT_EDEFAULT;

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
	 * The default value of the '{@link #getOutputFormat() <em>Output Format</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOutputFormat()
	 * @generated
	 * @ordered
	 */
	protected static final String OUTPUT_FORMAT_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getOutputFormat() <em>Output Format</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOutputFormat()
	 * @generated
	 * @ordered
	 */
	protected String outputFormat = OUTPUT_FORMAT_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected TransformRequestImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return FhirrestPackage.Literals.TRANSFORM_REQUEST;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getInputFormat() {
		return inputFormat;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setInputFormat(String newInputFormat) {
		String oldInputFormat = inputFormat;
		inputFormat = newInputFormat;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FhirrestPackage.TRANSFORM_REQUEST__INPUT_FORMAT, oldInputFormat, inputFormat));
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
			eNotify(new ENotificationImpl(this, Notification.SET, FhirrestPackage.TRANSFORM_REQUEST__CONTENT, oldContent, content));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getOutputFormat() {
		return outputFormat;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setOutputFormat(String newOutputFormat) {
		String oldOutputFormat = outputFormat;
		outputFormat = newOutputFormat;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FhirrestPackage.TRANSFORM_REQUEST__OUTPUT_FORMAT, oldOutputFormat, outputFormat));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case FhirrestPackage.TRANSFORM_REQUEST__INPUT_FORMAT:
				return getInputFormat();
			case FhirrestPackage.TRANSFORM_REQUEST__CONTENT:
				return getContent();
			case FhirrestPackage.TRANSFORM_REQUEST__OUTPUT_FORMAT:
				return getOutputFormat();
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
			case FhirrestPackage.TRANSFORM_REQUEST__INPUT_FORMAT:
				setInputFormat((String)newValue);
				return;
			case FhirrestPackage.TRANSFORM_REQUEST__CONTENT:
				setContent((String)newValue);
				return;
			case FhirrestPackage.TRANSFORM_REQUEST__OUTPUT_FORMAT:
				setOutputFormat((String)newValue);
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
			case FhirrestPackage.TRANSFORM_REQUEST__INPUT_FORMAT:
				setInputFormat(INPUT_FORMAT_EDEFAULT);
				return;
			case FhirrestPackage.TRANSFORM_REQUEST__CONTENT:
				setContent(CONTENT_EDEFAULT);
				return;
			case FhirrestPackage.TRANSFORM_REQUEST__OUTPUT_FORMAT:
				setOutputFormat(OUTPUT_FORMAT_EDEFAULT);
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
			case FhirrestPackage.TRANSFORM_REQUEST__INPUT_FORMAT:
				return INPUT_FORMAT_EDEFAULT == null ? inputFormat != null : !INPUT_FORMAT_EDEFAULT.equals(inputFormat);
			case FhirrestPackage.TRANSFORM_REQUEST__CONTENT:
				return CONTENT_EDEFAULT == null ? content != null : !CONTENT_EDEFAULT.equals(content);
			case FhirrestPackage.TRANSFORM_REQUEST__OUTPUT_FORMAT:
				return OUTPUT_FORMAT_EDEFAULT == null ? outputFormat != null : !OUTPUT_FORMAT_EDEFAULT.equals(outputFormat);
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
		result.append(" (inputFormat: ");
		result.append(inputFormat);
		result.append(", content: ");
		result.append(content);
		result.append(", outputFormat: ");
		result.append(outputFormat);
		result.append(')');
		return result.toString();
	}

} //TransformRequestImpl
