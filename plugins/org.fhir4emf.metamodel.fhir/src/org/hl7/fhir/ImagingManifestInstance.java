/**
 */
package org.hl7.fhir;

import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;

import org.hl7.fhir.jaxb.ImagingManifestInstanceImplAdapter;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Imaging Manifest Instance</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * A text description of the DICOM SOP instances selected in the ImagingManifest; or the reason for, or significance of, the selection.
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.hl7.fhir.ImagingManifestInstance#getSopClass <em>Sop Class</em>}</li>
 *   <li>{@link org.hl7.fhir.ImagingManifestInstance#getUid <em>Uid</em>}</li>
 * </ul>
 *
 * @see org.hl7.fhir.FhirPackage#getImagingManifestInstance()
 * @model extendedMetaData="name='ImagingManifest.Instance' kind='elementOnly'"
 * @generated
 */
@XmlJavaTypeAdapter(ImagingManifestInstanceImplAdapter.class)
public interface ImagingManifestInstance extends BackboneElement {
	/**
	 * Returns the value of the '<em><b>Sop Class</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * SOP class UID of the selected instance.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Sop Class</em>' containment reference.
	 * @see #setSopClass(Oid)
	 * @see org.hl7.fhir.FhirPackage#getImagingManifestInstance_SopClass()
	 * @model containment="true" required="true"
	 *        extendedMetaData="kind='element' name='sopClass' namespace='##targetNamespace'"
	 * @generated
	 */
	Oid getSopClass();

	/**
	 * Sets the value of the '{@link org.hl7.fhir.ImagingManifestInstance#getSopClass <em>Sop Class</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Sop Class</em>' containment reference.
	 * @see #getSopClass()
	 * @generated
	 */
	void setSopClass(Oid value);

	/**
	 * Returns the value of the '<em><b>Uid</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * SOP Instance UID of the selected instance.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Uid</em>' containment reference.
	 * @see #setUid(Oid)
	 * @see org.hl7.fhir.FhirPackage#getImagingManifestInstance_Uid()
	 * @model containment="true" required="true"
	 *        extendedMetaData="kind='element' name='uid' namespace='##targetNamespace'"
	 * @generated
	 */
	Oid getUid();

	/**
	 * Sets the value of the '{@link org.hl7.fhir.ImagingManifestInstance#getUid <em>Uid</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Uid</em>' containment reference.
	 * @see #getUid()
	 * @generated
	 */
	void setUid(Oid value);

} // ImagingManifestInstance
