/**
 */
package org.hl7.fhir;

import java.util.List;

import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;

import org.hl7.fhir.jaxb.ImagingManifestSeriesImplAdapter;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Imaging Manifest Series</b></em>'.
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
 *   <li>{@link org.hl7.fhir.ImagingManifestSeries#getUid <em>Uid</em>}</li>
 *   <li>{@link org.hl7.fhir.ImagingManifestSeries#getEndpoint <em>Endpoint</em>}</li>
 *   <li>{@link org.hl7.fhir.ImagingManifestSeries#getInstance <em>Instance</em>}</li>
 * </ul>
 *
 * @see org.hl7.fhir.FhirPackage#getImagingManifestSeries()
 * @model extendedMetaData="name='ImagingManifest.Series' kind='elementOnly'"
 * @generated
 */
@XmlJavaTypeAdapter(ImagingManifestSeriesImplAdapter.class)
public interface ImagingManifestSeries extends BackboneElement {
	/**
	 * Returns the value of the '<em><b>Uid</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Series instance UID of the SOP instances in the selection.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Uid</em>' containment reference.
	 * @see #setUid(Oid)
	 * @see org.hl7.fhir.FhirPackage#getImagingManifestSeries_Uid()
	 * @model containment="true" required="true"
	 *        extendedMetaData="kind='element' name='uid' namespace='##targetNamespace'"
	 * @generated
	 */
	Oid getUid();

	/**
	 * Sets the value of the '{@link org.hl7.fhir.ImagingManifestSeries#getUid <em>Uid</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Uid</em>' containment reference.
	 * @see #getUid()
	 * @generated
	 */
	void setUid(Oid value);

	/**
	 * Returns the value of the '<em><b>Endpoint</b></em>' containment reference list.
	 * The list contents are of type {@link org.hl7.fhir.Reference}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The network service providing access (e.g., query, view, or retrieval) for this series. See implementation notes for information about using DICOM endpoints. A series-level endpoint, if present, has precedence over a study-level endpoint with the same Endpoint.type.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Endpoint</em>' containment reference list.
	 * @see org.hl7.fhir.FhirPackage#getImagingManifestSeries_Endpoint()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='endpoint' namespace='##targetNamespace'"
	 * @generated
	 */
	List<Reference> getEndpoint();

	/**
	 * Returns the value of the '<em><b>Instance</b></em>' containment reference list.
	 * The list contents are of type {@link org.hl7.fhir.ImagingManifestInstance}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Identity and locating information of the selected DICOM SOP instances.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Instance</em>' containment reference list.
	 * @see org.hl7.fhir.FhirPackage#getImagingManifestSeries_Instance()
	 * @model containment="true" required="true"
	 *        extendedMetaData="kind='element' name='instance' namespace='##targetNamespace'"
	 * @generated
	 */
	List<ImagingManifestInstance> getInstance();

} // ImagingManifestSeries
