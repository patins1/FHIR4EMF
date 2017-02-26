/**
 */
package org.hl7.fhir;

import java.util.List;

import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;

import org.hl7.fhir.jaxb.ImagingStudyImplAdapter;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Imaging Study</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * Representation of the content produced in a DICOM imaging study. A study comprises a set of series, each of which includes a set of Service-Object Pair Instances (SOP Instances - images or other data) acquired or produced in a common context.  A series is of only one modality (e.g. X-ray, CT, MR, ultrasound), but a study may have multiple series of different modalities.
 * If the element is present, it must have either a @value, an @id, or extensions
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.hl7.fhir.ImagingStudy#getUid <em>Uid</em>}</li>
 *   <li>{@link org.hl7.fhir.ImagingStudy#getAccession <em>Accession</em>}</li>
 *   <li>{@link org.hl7.fhir.ImagingStudy#getIdentifier <em>Identifier</em>}</li>
 *   <li>{@link org.hl7.fhir.ImagingStudy#getAvailability <em>Availability</em>}</li>
 *   <li>{@link org.hl7.fhir.ImagingStudy#getModalityList <em>Modality List</em>}</li>
 *   <li>{@link org.hl7.fhir.ImagingStudy#getPatient <em>Patient</em>}</li>
 *   <li>{@link org.hl7.fhir.ImagingStudy#getContext <em>Context</em>}</li>
 *   <li>{@link org.hl7.fhir.ImagingStudy#getStarted <em>Started</em>}</li>
 *   <li>{@link org.hl7.fhir.ImagingStudy#getBasedOn <em>Based On</em>}</li>
 *   <li>{@link org.hl7.fhir.ImagingStudy#getReferrer <em>Referrer</em>}</li>
 *   <li>{@link org.hl7.fhir.ImagingStudy#getInterpreter <em>Interpreter</em>}</li>
 *   <li>{@link org.hl7.fhir.ImagingStudy#getEndpoint <em>Endpoint</em>}</li>
 *   <li>{@link org.hl7.fhir.ImagingStudy#getNumberOfSeries <em>Number Of Series</em>}</li>
 *   <li>{@link org.hl7.fhir.ImagingStudy#getNumberOfInstances <em>Number Of Instances</em>}</li>
 *   <li>{@link org.hl7.fhir.ImagingStudy#getProcedureReference <em>Procedure Reference</em>}</li>
 *   <li>{@link org.hl7.fhir.ImagingStudy#getProcedureCode <em>Procedure Code</em>}</li>
 *   <li>{@link org.hl7.fhir.ImagingStudy#getReason <em>Reason</em>}</li>
 *   <li>{@link org.hl7.fhir.ImagingStudy#getDescription <em>Description</em>}</li>
 *   <li>{@link org.hl7.fhir.ImagingStudy#getSeries <em>Series</em>}</li>
 * </ul>
 *
 * @see org.hl7.fhir.FhirPackage#getImagingStudy()
 * @model extendedMetaData="name='ImagingStudy' kind='elementOnly'"
 * @generated
 */
@XmlJavaTypeAdapter(ImagingStudyImplAdapter.class)
public interface ImagingStudy extends DomainResource {
	/**
	 * Returns the value of the '<em><b>Uid</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Formal identifier for the study.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Uid</em>' containment reference.
	 * @see #setUid(Oid)
	 * @see org.hl7.fhir.FhirPackage#getImagingStudy_Uid()
	 * @model containment="true" required="true"
	 *        extendedMetaData="kind='element' name='uid' namespace='##targetNamespace'"
	 * @generated
	 */
	Oid getUid();

	/**
	 * Sets the value of the '{@link org.hl7.fhir.ImagingStudy#getUid <em>Uid</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Uid</em>' containment reference.
	 * @see #getUid()
	 * @generated
	 */
	void setUid(Oid value);

	/**
	 * Returns the value of the '<em><b>Accession</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Accession Number is an identifier related to some aspect of imaging workflow and data management. Usage may vary across different institutions.  See for instance [IHE Radiology Technical Framework Volume 1 Appendix A](http://www.ihe.net/uploadedFiles/Documents/Radiology/IHE_RAD_TF_Rev13.0_Vol1_FT_2014-07-30.pdf).
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Accession</em>' containment reference.
	 * @see #setAccession(Identifier)
	 * @see org.hl7.fhir.FhirPackage#getImagingStudy_Accession()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='accession' namespace='##targetNamespace'"
	 * @generated
	 */
	Identifier getAccession();

	/**
	 * Sets the value of the '{@link org.hl7.fhir.ImagingStudy#getAccession <em>Accession</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Accession</em>' containment reference.
	 * @see #getAccession()
	 * @generated
	 */
	void setAccession(Identifier value);

	/**
	 * Returns the value of the '<em><b>Identifier</b></em>' containment reference list.
	 * The list contents are of type {@link org.hl7.fhir.Identifier}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Other identifiers for the study.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Identifier</em>' containment reference list.
	 * @see org.hl7.fhir.FhirPackage#getImagingStudy_Identifier()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='identifier' namespace='##targetNamespace'"
	 * @generated
	 */
	List<Identifier> getIdentifier();

	/**
	 * Returns the value of the '<em><b>Availability</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Availability of study (online, offline or nearline).
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Availability</em>' containment reference.
	 * @see #setAvailability(InstanceAvailability)
	 * @see org.hl7.fhir.FhirPackage#getImagingStudy_Availability()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='availability' namespace='##targetNamespace'"
	 * @generated
	 */
	InstanceAvailability getAvailability();

	/**
	 * Sets the value of the '{@link org.hl7.fhir.ImagingStudy#getAvailability <em>Availability</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Availability</em>' containment reference.
	 * @see #getAvailability()
	 * @generated
	 */
	void setAvailability(InstanceAvailability value);

	/**
	 * Returns the value of the '<em><b>Modality List</b></em>' containment reference list.
	 * The list contents are of type {@link org.hl7.fhir.Coding}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * A list of all the Series.ImageModality values that are actual acquisition modalities, i.e. those in the DICOM Context Group 29 (value set OID 1.2.840.10008.6.1.19).
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Modality List</em>' containment reference list.
	 * @see org.hl7.fhir.FhirPackage#getImagingStudy_ModalityList()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='modalityList' namespace='##targetNamespace'"
	 * @generated
	 */
	List<Coding> getModalityList();

	/**
	 * Returns the value of the '<em><b>Patient</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The patient imaged in the study.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Patient</em>' containment reference.
	 * @see #setPatient(Reference)
	 * @see org.hl7.fhir.FhirPackage#getImagingStudy_Patient()
	 * @model containment="true" required="true"
	 *        extendedMetaData="kind='element' name='patient' namespace='##targetNamespace'"
	 * @generated
	 */
	Reference getPatient();

	/**
	 * Sets the value of the '{@link org.hl7.fhir.ImagingStudy#getPatient <em>Patient</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Patient</em>' containment reference.
	 * @see #getPatient()
	 * @generated
	 */
	void setPatient(Reference value);

	/**
	 * Returns the value of the '<em><b>Context</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The encounter at which the request is initiated.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Context</em>' containment reference.
	 * @see #setContext(Reference)
	 * @see org.hl7.fhir.FhirPackage#getImagingStudy_Context()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='context' namespace='##targetNamespace'"
	 * @generated
	 */
	Reference getContext();

	/**
	 * Sets the value of the '{@link org.hl7.fhir.ImagingStudy#getContext <em>Context</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Context</em>' containment reference.
	 * @see #getContext()
	 * @generated
	 */
	void setContext(Reference value);

	/**
	 * Returns the value of the '<em><b>Started</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Date and Time the study started.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Started</em>' containment reference.
	 * @see #setStarted(DateTime)
	 * @see org.hl7.fhir.FhirPackage#getImagingStudy_Started()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='started' namespace='##targetNamespace'"
	 * @generated
	 */
	DateTime getStarted();

	/**
	 * Sets the value of the '{@link org.hl7.fhir.ImagingStudy#getStarted <em>Started</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Started</em>' containment reference.
	 * @see #getStarted()
	 * @generated
	 */
	void setStarted(DateTime value);

	/**
	 * Returns the value of the '<em><b>Based On</b></em>' containment reference list.
	 * The list contents are of type {@link org.hl7.fhir.Reference}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * A list of the diagnostic requests that resulted in this imaging study being performed.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Based On</em>' containment reference list.
	 * @see org.hl7.fhir.FhirPackage#getImagingStudy_BasedOn()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='basedOn' namespace='##targetNamespace'"
	 * @generated
	 */
	List<Reference> getBasedOn();

	/**
	 * Returns the value of the '<em><b>Referrer</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The requesting/referring physician.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Referrer</em>' containment reference.
	 * @see #setReferrer(Reference)
	 * @see org.hl7.fhir.FhirPackage#getImagingStudy_Referrer()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='referrer' namespace='##targetNamespace'"
	 * @generated
	 */
	Reference getReferrer();

	/**
	 * Sets the value of the '{@link org.hl7.fhir.ImagingStudy#getReferrer <em>Referrer</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Referrer</em>' containment reference.
	 * @see #getReferrer()
	 * @generated
	 */
	void setReferrer(Reference value);

	/**
	 * Returns the value of the '<em><b>Interpreter</b></em>' containment reference list.
	 * The list contents are of type {@link org.hl7.fhir.Reference}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Who read the study and interpreted the images or other content.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Interpreter</em>' containment reference list.
	 * @see org.hl7.fhir.FhirPackage#getImagingStudy_Interpreter()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='interpreter' namespace='##targetNamespace'"
	 * @generated
	 */
	List<Reference> getInterpreter();

	/**
	 * Returns the value of the '<em><b>Endpoint</b></em>' containment reference list.
	 * The list contents are of type {@link org.hl7.fhir.Reference}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The network service providing access (e.g., query, view, or retrieval) for the study. See implementation notes for information about using DICOM endpoints. A study-level endpoint applies to each series in the study, unless overridden by a series-level endpoint with the same Endpoint.type.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Endpoint</em>' containment reference list.
	 * @see org.hl7.fhir.FhirPackage#getImagingStudy_Endpoint()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='endpoint' namespace='##targetNamespace'"
	 * @generated
	 */
	List<Reference> getEndpoint();

	/**
	 * Returns the value of the '<em><b>Number Of Series</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Number of Series in the Study. This value given may be larger than the number of series elements this Resource contains due to resource availability, security, or other factors. This element should be present if any series elements are present.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Number Of Series</em>' containment reference.
	 * @see #setNumberOfSeries(UnsignedInt)
	 * @see org.hl7.fhir.FhirPackage#getImagingStudy_NumberOfSeries()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='numberOfSeries' namespace='##targetNamespace'"
	 * @generated
	 */
	UnsignedInt getNumberOfSeries();

	/**
	 * Sets the value of the '{@link org.hl7.fhir.ImagingStudy#getNumberOfSeries <em>Number Of Series</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Number Of Series</em>' containment reference.
	 * @see #getNumberOfSeries()
	 * @generated
	 */
	void setNumberOfSeries(UnsignedInt value);

	/**
	 * Returns the value of the '<em><b>Number Of Instances</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Number of SOP Instances in Study. This value given may be larger than the number of instance elements this Resource contains due to resource availability, security, or other factors. This element should be present if any instance elements are present.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Number Of Instances</em>' containment reference.
	 * @see #setNumberOfInstances(UnsignedInt)
	 * @see org.hl7.fhir.FhirPackage#getImagingStudy_NumberOfInstances()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='numberOfInstances' namespace='##targetNamespace'"
	 * @generated
	 */
	UnsignedInt getNumberOfInstances();

	/**
	 * Sets the value of the '{@link org.hl7.fhir.ImagingStudy#getNumberOfInstances <em>Number Of Instances</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Number Of Instances</em>' containment reference.
	 * @see #getNumberOfInstances()
	 * @generated
	 */
	void setNumberOfInstances(UnsignedInt value);

	/**
	 * Returns the value of the '<em><b>Procedure Reference</b></em>' containment reference list.
	 * The list contents are of type {@link org.hl7.fhir.Reference}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * A reference to the performed Procedure.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Procedure Reference</em>' containment reference list.
	 * @see org.hl7.fhir.FhirPackage#getImagingStudy_ProcedureReference()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='procedureReference' namespace='##targetNamespace'"
	 * @generated
	 */
	List<Reference> getProcedureReference();

	/**
	 * Returns the value of the '<em><b>Procedure Code</b></em>' containment reference list.
	 * The list contents are of type {@link org.hl7.fhir.CodeableConcept}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The code for the performed procedure type.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Procedure Code</em>' containment reference list.
	 * @see org.hl7.fhir.FhirPackage#getImagingStudy_ProcedureCode()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='procedureCode' namespace='##targetNamespace'"
	 * @generated
	 */
	List<CodeableConcept> getProcedureCode();

	/**
	 * Returns the value of the '<em><b>Reason</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Description of clinical codition indicating why the ImagingStudy was requested.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Reason</em>' containment reference.
	 * @see #setReason(CodeableConcept)
	 * @see org.hl7.fhir.FhirPackage#getImagingStudy_Reason()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='reason' namespace='##targetNamespace'"
	 * @generated
	 */
	CodeableConcept getReason();

	/**
	 * Sets the value of the '{@link org.hl7.fhir.ImagingStudy#getReason <em>Reason</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Reason</em>' containment reference.
	 * @see #getReason()
	 * @generated
	 */
	void setReason(CodeableConcept value);

	/**
	 * Returns the value of the '<em><b>Description</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Institution-generated description or classification of the Study performed.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Description</em>' containment reference.
	 * @see #setDescription(org.hl7.fhir.String)
	 * @see org.hl7.fhir.FhirPackage#getImagingStudy_Description()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='description' namespace='##targetNamespace'"
	 * @generated
	 */
	org.hl7.fhir.String getDescription();

	/**
	 * Sets the value of the '{@link org.hl7.fhir.ImagingStudy#getDescription <em>Description</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Description</em>' containment reference.
	 * @see #getDescription()
	 * @generated
	 */
	void setDescription(org.hl7.fhir.String value);

	/**
	 * Returns the value of the '<em><b>Series</b></em>' containment reference list.
	 * The list contents are of type {@link org.hl7.fhir.ImagingStudySeries}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Each study has one or more series of images or other content.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Series</em>' containment reference list.
	 * @see org.hl7.fhir.FhirPackage#getImagingStudy_Series()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='series' namespace='##targetNamespace'"
	 * @generated
	 */
	List<ImagingStudySeries> getSeries();

} // ImagingStudy
