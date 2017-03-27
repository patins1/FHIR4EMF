/**
 */
package org.hl7.fhir;

import java.util.List;

import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;

import org.hl7.fhir.jaxb.ImmunizationImplAdapter;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Immunization</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * Describes the event of a patient being administered a vaccination or a record of a vaccination as reported by a patient, a clinician or another party and may include vaccine reaction information and what vaccination protocol was followed.
 * If the element is present, it must have either a @value, an @id, or extensions
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.hl7.fhir.Immunization#getIdentifier <em>Identifier</em>}</li>
 *   <li>{@link org.hl7.fhir.Immunization#getStatus <em>Status</em>}</li>
 *   <li>{@link org.hl7.fhir.Immunization#getNotGiven <em>Not Given</em>}</li>
 *   <li>{@link org.hl7.fhir.Immunization#getVaccineCode <em>Vaccine Code</em>}</li>
 *   <li>{@link org.hl7.fhir.Immunization#getPatient <em>Patient</em>}</li>
 *   <li>{@link org.hl7.fhir.Immunization#getEncounter <em>Encounter</em>}</li>
 *   <li>{@link org.hl7.fhir.Immunization#getDate <em>Date</em>}</li>
 *   <li>{@link org.hl7.fhir.Immunization#getPrimarySource <em>Primary Source</em>}</li>
 *   <li>{@link org.hl7.fhir.Immunization#getReportOrigin <em>Report Origin</em>}</li>
 *   <li>{@link org.hl7.fhir.Immunization#getLocation <em>Location</em>}</li>
 *   <li>{@link org.hl7.fhir.Immunization#getManufacturer <em>Manufacturer</em>}</li>
 *   <li>{@link org.hl7.fhir.Immunization#getLotNumber <em>Lot Number</em>}</li>
 *   <li>{@link org.hl7.fhir.Immunization#getExpirationDate <em>Expiration Date</em>}</li>
 *   <li>{@link org.hl7.fhir.Immunization#getSite <em>Site</em>}</li>
 *   <li>{@link org.hl7.fhir.Immunization#getRoute <em>Route</em>}</li>
 *   <li>{@link org.hl7.fhir.Immunization#getDoseQuantity <em>Dose Quantity</em>}</li>
 *   <li>{@link org.hl7.fhir.Immunization#getPractitioner <em>Practitioner</em>}</li>
 *   <li>{@link org.hl7.fhir.Immunization#getNote <em>Note</em>}</li>
 *   <li>{@link org.hl7.fhir.Immunization#getExplanation <em>Explanation</em>}</li>
 *   <li>{@link org.hl7.fhir.Immunization#getReaction <em>Reaction</em>}</li>
 *   <li>{@link org.hl7.fhir.Immunization#getVaccinationProtocol <em>Vaccination Protocol</em>}</li>
 * </ul>
 *
 * @see org.hl7.fhir.FhirPackage#getImmunization()
 * @model extendedMetaData="name='Immunization' kind='elementOnly'"
 * @generated
 */
@XmlJavaTypeAdapter(ImmunizationImplAdapter.class)
public interface Immunization extends DomainResource {
	/**
	 * Returns the value of the '<em><b>Identifier</b></em>' containment reference list.
	 * The list contents are of type {@link org.hl7.fhir.Identifier}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * A unique identifier assigned to this immunization record.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Identifier</em>' containment reference list.
	 * @see org.hl7.fhir.FhirPackage#getImmunization_Identifier()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='identifier' namespace='##targetNamespace'"
	 * @generated
	 */
	List<Identifier> getIdentifier();

	/**
	 * Returns the value of the '<em><b>Status</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Indicates the current status of the vaccination event.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Status</em>' containment reference.
	 * @see #setStatus(ImmunizationStatusCodes)
	 * @see org.hl7.fhir.FhirPackage#getImmunization_Status()
	 * @model containment="true" required="true"
	 *        extendedMetaData="kind='element' name='status' namespace='##targetNamespace'"
	 * @generated
	 */
	ImmunizationStatusCodes getStatus();

	/**
	 * Sets the value of the '{@link org.hl7.fhir.Immunization#getStatus <em>Status</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Status</em>' containment reference.
	 * @see #getStatus()
	 * @generated
	 */
	void setStatus(ImmunizationStatusCodes value);

	/**
	 * Returns the value of the '<em><b>Not Given</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Indicates if the vaccination was or was not given.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Not Given</em>' containment reference.
	 * @see #setNotGiven(org.hl7.fhir.Boolean)
	 * @see org.hl7.fhir.FhirPackage#getImmunization_NotGiven()
	 * @model containment="true" required="true"
	 *        extendedMetaData="kind='element' name='notGiven' namespace='##targetNamespace'"
	 * @generated
	 */
	org.hl7.fhir.Boolean getNotGiven();

	/**
	 * Sets the value of the '{@link org.hl7.fhir.Immunization#getNotGiven <em>Not Given</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Not Given</em>' containment reference.
	 * @see #getNotGiven()
	 * @generated
	 */
	void setNotGiven(org.hl7.fhir.Boolean value);

	/**
	 * Returns the value of the '<em><b>Vaccine Code</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Vaccine that was administered or was to be administered.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Vaccine Code</em>' containment reference.
	 * @see #setVaccineCode(CodeableConcept)
	 * @see org.hl7.fhir.FhirPackage#getImmunization_VaccineCode()
	 * @model containment="true" required="true"
	 *        extendedMetaData="kind='element' name='vaccineCode' namespace='##targetNamespace'"
	 * @generated
	 */
	CodeableConcept getVaccineCode();

	/**
	 * Sets the value of the '{@link org.hl7.fhir.Immunization#getVaccineCode <em>Vaccine Code</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Vaccine Code</em>' containment reference.
	 * @see #getVaccineCode()
	 * @generated
	 */
	void setVaccineCode(CodeableConcept value);

	/**
	 * Returns the value of the '<em><b>Patient</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The patient who either received or did not receive the immunization.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Patient</em>' containment reference.
	 * @see #setPatient(Reference)
	 * @see org.hl7.fhir.FhirPackage#getImmunization_Patient()
	 * @model containment="true" required="true"
	 *        extendedMetaData="kind='element' name='patient' namespace='##targetNamespace'"
	 * @generated
	 */
	Reference getPatient();

	/**
	 * Sets the value of the '{@link org.hl7.fhir.Immunization#getPatient <em>Patient</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Patient</em>' containment reference.
	 * @see #getPatient()
	 * @generated
	 */
	void setPatient(Reference value);

	/**
	 * Returns the value of the '<em><b>Encounter</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The visit or admission or other contact between patient and health care provider the immunization was performed as part of.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Encounter</em>' containment reference.
	 * @see #setEncounter(Reference)
	 * @see org.hl7.fhir.FhirPackage#getImmunization_Encounter()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='encounter' namespace='##targetNamespace'"
	 * @generated
	 */
	Reference getEncounter();

	/**
	 * Sets the value of the '{@link org.hl7.fhir.Immunization#getEncounter <em>Encounter</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Encounter</em>' containment reference.
	 * @see #getEncounter()
	 * @generated
	 */
	void setEncounter(Reference value);

	/**
	 * Returns the value of the '<em><b>Date</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Date vaccine administered or was to be administered.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Date</em>' containment reference.
	 * @see #setDate(DateTime)
	 * @see org.hl7.fhir.FhirPackage#getImmunization_Date()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='date' namespace='##targetNamespace'"
	 * @generated
	 */
	DateTime getDate();

	/**
	 * Sets the value of the '{@link org.hl7.fhir.Immunization#getDate <em>Date</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Date</em>' containment reference.
	 * @see #getDate()
	 * @generated
	 */
	void setDate(DateTime value);

	/**
	 * Returns the value of the '<em><b>Primary Source</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * An indication that the content of the record is based on information from the person who administered the vaccine. This reflects the context under which the data was originally recorded.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Primary Source</em>' containment reference.
	 * @see #setPrimarySource(org.hl7.fhir.Boolean)
	 * @see org.hl7.fhir.FhirPackage#getImmunization_PrimarySource()
	 * @model containment="true" required="true"
	 *        extendedMetaData="kind='element' name='primarySource' namespace='##targetNamespace'"
	 * @generated
	 */
	org.hl7.fhir.Boolean getPrimarySource();

	/**
	 * Sets the value of the '{@link org.hl7.fhir.Immunization#getPrimarySource <em>Primary Source</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Primary Source</em>' containment reference.
	 * @see #getPrimarySource()
	 * @generated
	 */
	void setPrimarySource(org.hl7.fhir.Boolean value);

	/**
	 * Returns the value of the '<em><b>Report Origin</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The source of the data when the report of the immunization event is not based on information from the person who administered the vaccine.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Report Origin</em>' containment reference.
	 * @see #setReportOrigin(CodeableConcept)
	 * @see org.hl7.fhir.FhirPackage#getImmunization_ReportOrigin()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='reportOrigin' namespace='##targetNamespace'"
	 * @generated
	 */
	CodeableConcept getReportOrigin();

	/**
	 * Sets the value of the '{@link org.hl7.fhir.Immunization#getReportOrigin <em>Report Origin</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Report Origin</em>' containment reference.
	 * @see #getReportOrigin()
	 * @generated
	 */
	void setReportOrigin(CodeableConcept value);

	/**
	 * Returns the value of the '<em><b>Location</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The service delivery location where the vaccine administration occurred.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Location</em>' containment reference.
	 * @see #setLocation(Reference)
	 * @see org.hl7.fhir.FhirPackage#getImmunization_Location()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='location' namespace='##targetNamespace'"
	 * @generated
	 */
	Reference getLocation();

	/**
	 * Sets the value of the '{@link org.hl7.fhir.Immunization#getLocation <em>Location</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Location</em>' containment reference.
	 * @see #getLocation()
	 * @generated
	 */
	void setLocation(Reference value);

	/**
	 * Returns the value of the '<em><b>Manufacturer</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Name of vaccine manufacturer.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Manufacturer</em>' containment reference.
	 * @see #setManufacturer(Reference)
	 * @see org.hl7.fhir.FhirPackage#getImmunization_Manufacturer()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='manufacturer' namespace='##targetNamespace'"
	 * @generated
	 */
	Reference getManufacturer();

	/**
	 * Sets the value of the '{@link org.hl7.fhir.Immunization#getManufacturer <em>Manufacturer</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Manufacturer</em>' containment reference.
	 * @see #getManufacturer()
	 * @generated
	 */
	void setManufacturer(Reference value);

	/**
	 * Returns the value of the '<em><b>Lot Number</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Lot number of the  vaccine product.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Lot Number</em>' containment reference.
	 * @see #setLotNumber(org.hl7.fhir.String)
	 * @see org.hl7.fhir.FhirPackage#getImmunization_LotNumber()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='lotNumber' namespace='##targetNamespace'"
	 * @generated
	 */
	org.hl7.fhir.String getLotNumber();

	/**
	 * Sets the value of the '{@link org.hl7.fhir.Immunization#getLotNumber <em>Lot Number</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Lot Number</em>' containment reference.
	 * @see #getLotNumber()
	 * @generated
	 */
	void setLotNumber(org.hl7.fhir.String value);

	/**
	 * Returns the value of the '<em><b>Expiration Date</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Date vaccine batch expires.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Expiration Date</em>' containment reference.
	 * @see #setExpirationDate(Date)
	 * @see org.hl7.fhir.FhirPackage#getImmunization_ExpirationDate()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='expirationDate' namespace='##targetNamespace'"
	 * @generated
	 */
	Date getExpirationDate();

	/**
	 * Sets the value of the '{@link org.hl7.fhir.Immunization#getExpirationDate <em>Expiration Date</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Expiration Date</em>' containment reference.
	 * @see #getExpirationDate()
	 * @generated
	 */
	void setExpirationDate(Date value);

	/**
	 * Returns the value of the '<em><b>Site</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Body site where vaccine was administered.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Site</em>' containment reference.
	 * @see #setSite(CodeableConcept)
	 * @see org.hl7.fhir.FhirPackage#getImmunization_Site()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='site' namespace='##targetNamespace'"
	 * @generated
	 */
	CodeableConcept getSite();

	/**
	 * Sets the value of the '{@link org.hl7.fhir.Immunization#getSite <em>Site</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Site</em>' containment reference.
	 * @see #getSite()
	 * @generated
	 */
	void setSite(CodeableConcept value);

	/**
	 * Returns the value of the '<em><b>Route</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The path by which the vaccine product is taken into the body.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Route</em>' containment reference.
	 * @see #setRoute(CodeableConcept)
	 * @see org.hl7.fhir.FhirPackage#getImmunization_Route()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='route' namespace='##targetNamespace'"
	 * @generated
	 */
	CodeableConcept getRoute();

	/**
	 * Sets the value of the '{@link org.hl7.fhir.Immunization#getRoute <em>Route</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Route</em>' containment reference.
	 * @see #getRoute()
	 * @generated
	 */
	void setRoute(CodeableConcept value);

	/**
	 * Returns the value of the '<em><b>Dose Quantity</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The quantity of vaccine product that was administered.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Dose Quantity</em>' containment reference.
	 * @see #setDoseQuantity(Quantity)
	 * @see org.hl7.fhir.FhirPackage#getImmunization_DoseQuantity()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='doseQuantity' namespace='##targetNamespace'"
	 * @generated
	 */
	Quantity getDoseQuantity();

	/**
	 * Sets the value of the '{@link org.hl7.fhir.Immunization#getDoseQuantity <em>Dose Quantity</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Dose Quantity</em>' containment reference.
	 * @see #getDoseQuantity()
	 * @generated
	 */
	void setDoseQuantity(Quantity value);

	/**
	 * Returns the value of the '<em><b>Practitioner</b></em>' containment reference list.
	 * The list contents are of type {@link org.hl7.fhir.ImmunizationPractitioner}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Indicates who or what performed the event.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Practitioner</em>' containment reference list.
	 * @see org.hl7.fhir.FhirPackage#getImmunization_Practitioner()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='practitioner' namespace='##targetNamespace'"
	 * @generated
	 */
	List<ImmunizationPractitioner> getPractitioner();

	/**
	 * Returns the value of the '<em><b>Note</b></em>' containment reference list.
	 * The list contents are of type {@link org.hl7.fhir.Annotation}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Extra information about the immunization that is not conveyed by the other attributes.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Note</em>' containment reference list.
	 * @see org.hl7.fhir.FhirPackage#getImmunization_Note()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='note' namespace='##targetNamespace'"
	 * @generated
	 */
	List<Annotation> getNote();

	/**
	 * Returns the value of the '<em><b>Explanation</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Reasons why a vaccine was or was not administered.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Explanation</em>' containment reference.
	 * @see #setExplanation(ImmunizationExplanation)
	 * @see org.hl7.fhir.FhirPackage#getImmunization_Explanation()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='explanation' namespace='##targetNamespace'"
	 * @generated
	 */
	ImmunizationExplanation getExplanation();

	/**
	 * Sets the value of the '{@link org.hl7.fhir.Immunization#getExplanation <em>Explanation</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Explanation</em>' containment reference.
	 * @see #getExplanation()
	 * @generated
	 */
	void setExplanation(ImmunizationExplanation value);

	/**
	 * Returns the value of the '<em><b>Reaction</b></em>' containment reference list.
	 * The list contents are of type {@link org.hl7.fhir.ImmunizationReaction}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Categorical data indicating that an adverse event is associated in time to an immunization.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Reaction</em>' containment reference list.
	 * @see org.hl7.fhir.FhirPackage#getImmunization_Reaction()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='reaction' namespace='##targetNamespace'"
	 * @generated
	 */
	List<ImmunizationReaction> getReaction();

	/**
	 * Returns the value of the '<em><b>Vaccination Protocol</b></em>' containment reference list.
	 * The list contents are of type {@link org.hl7.fhir.ImmunizationVaccinationProtocol}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Contains information about the protocol(s) under which the vaccine was administered.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Vaccination Protocol</em>' containment reference list.
	 * @see org.hl7.fhir.FhirPackage#getImmunization_VaccinationProtocol()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='vaccinationProtocol' namespace='##targetNamespace'"
	 * @generated
	 */
	List<ImmunizationVaccinationProtocol> getVaccinationProtocol();

} // Immunization
