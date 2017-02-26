/**
 */
package org.hl7.fhir;

import java.util.List;

import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;

import org.hl7.fhir.jaxb.ImagingManifestStudyImplAdapter;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Imaging Manifest Study</b></em>'.
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
 *   <li>{@link org.hl7.fhir.ImagingManifestStudy#getUid <em>Uid</em>}</li>
 *   <li>{@link org.hl7.fhir.ImagingManifestStudy#getImagingStudy <em>Imaging Study</em>}</li>
 *   <li>{@link org.hl7.fhir.ImagingManifestStudy#getEndpoint <em>Endpoint</em>}</li>
 *   <li>{@link org.hl7.fhir.ImagingManifestStudy#getSeries <em>Series</em>}</li>
 * </ul>
 *
 * @see org.hl7.fhir.FhirPackage#getImagingManifestStudy()
 * @model extendedMetaData="name='ImagingManifest.Study' kind='elementOnly'"
 * @generated
 */
@XmlJavaTypeAdapter(ImagingManifestStudyImplAdapter.class)
public interface ImagingManifestStudy extends BackboneElement {
	/**
	 * Returns the value of the '<em><b>Uid</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Study instance UID of the SOP instances in the selection.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Uid</em>' containment reference.
	 * @see #setUid(Oid)
	 * @see org.hl7.fhir.FhirPackage#getImagingManifestStudy_Uid()
	 * @model containment="true" required="true"
	 *        extendedMetaData="kind='element' name='uid' namespace='##targetNamespace'"
	 * @generated
	 */
	Oid getUid();

	/**
	 * Sets the value of the '{@link org.hl7.fhir.ImagingManifestStudy#getUid <em>Uid</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Uid</em>' containment reference.
	 * @see #getUid()
	 * @generated
	 */
	void setUid(Oid value);

	/**
	 * Returns the value of the '<em><b>Imaging Study</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Reference to the Imaging Study in FHIR form.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Imaging Study</em>' containment reference.
	 * @see #setImagingStudy(Reference)
	 * @see org.hl7.fhir.FhirPackage#getImagingManifestStudy_ImagingStudy()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='imagingStudy' namespace='##targetNamespace'"
	 * @generated
	 */
	Reference getImagingStudy();

	/**
	 * Sets the value of the '{@link org.hl7.fhir.ImagingManifestStudy#getImagingStudy <em>Imaging Study</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Imaging Study</em>' containment reference.
	 * @see #getImagingStudy()
	 * @generated
	 */
	void setImagingStudy(Reference value);

	/**
	 * Returns the value of the '<em><b>Endpoint</b></em>' containment reference list.
	 * The list contents are of type {@link org.hl7.fhir.Reference}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The network service providing access (e.g., query, view, or retrieval) for the study. See implementation notes for information about using DICOM endpoints. A study-level endpoint applies to each series in the study, unless overridden by a series-level endpoint with the same Endpoint.type.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Endpoint</em>' containment reference list.
	 * @see org.hl7.fhir.FhirPackage#getImagingManifestStudy_Endpoint()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='endpoint' namespace='##targetNamespace'"
	 * @generated
	 */
	List<Reference> getEndpoint();

	/**
	 * Returns the value of the '<em><b>Series</b></em>' containment reference list.
	 * The list contents are of type {@link org.hl7.fhir.ImagingManifestSeries}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Series identity and locating information of the DICOM SOP instances in the selection.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Series</em>' containment reference list.
	 * @see org.hl7.fhir.FhirPackage#getImagingManifestStudy_Series()
	 * @model containment="true" required="true"
	 *        extendedMetaData="kind='element' name='series' namespace='##targetNamespace'"
	 * @generated
	 */
	List<ImagingManifestSeries> getSeries();

} // ImagingManifestStudy
