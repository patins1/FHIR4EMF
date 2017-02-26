/**
 */
package org.hl7.fhir;

import java.util.List;

import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;

import org.hl7.fhir.jaxb.ExplanationOfBenefitItemImplAdapter;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Explanation Of Benefit Item</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * This resource provides: the claim details; adjudication details from the processing of a Claim; and optionally account balance information, for informing the subscriber of the benefits provided.
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.hl7.fhir.ExplanationOfBenefitItem#getSequence <em>Sequence</em>}</li>
 *   <li>{@link org.hl7.fhir.ExplanationOfBenefitItem#getCareTeamLinkId <em>Care Team Link Id</em>}</li>
 *   <li>{@link org.hl7.fhir.ExplanationOfBenefitItem#getDiagnosisLinkId <em>Diagnosis Link Id</em>}</li>
 *   <li>{@link org.hl7.fhir.ExplanationOfBenefitItem#getProcedureLinkId <em>Procedure Link Id</em>}</li>
 *   <li>{@link org.hl7.fhir.ExplanationOfBenefitItem#getInformationLinkId <em>Information Link Id</em>}</li>
 *   <li>{@link org.hl7.fhir.ExplanationOfBenefitItem#getRevenue <em>Revenue</em>}</li>
 *   <li>{@link org.hl7.fhir.ExplanationOfBenefitItem#getCategory <em>Category</em>}</li>
 *   <li>{@link org.hl7.fhir.ExplanationOfBenefitItem#getService <em>Service</em>}</li>
 *   <li>{@link org.hl7.fhir.ExplanationOfBenefitItem#getModifier <em>Modifier</em>}</li>
 *   <li>{@link org.hl7.fhir.ExplanationOfBenefitItem#getProgramCode <em>Program Code</em>}</li>
 *   <li>{@link org.hl7.fhir.ExplanationOfBenefitItem#getServicedDate <em>Serviced Date</em>}</li>
 *   <li>{@link org.hl7.fhir.ExplanationOfBenefitItem#getServicedPeriod <em>Serviced Period</em>}</li>
 *   <li>{@link org.hl7.fhir.ExplanationOfBenefitItem#getLocationCodeableConcept <em>Location Codeable Concept</em>}</li>
 *   <li>{@link org.hl7.fhir.ExplanationOfBenefitItem#getLocationAddress <em>Location Address</em>}</li>
 *   <li>{@link org.hl7.fhir.ExplanationOfBenefitItem#getLocationReference <em>Location Reference</em>}</li>
 *   <li>{@link org.hl7.fhir.ExplanationOfBenefitItem#getQuantity <em>Quantity</em>}</li>
 *   <li>{@link org.hl7.fhir.ExplanationOfBenefitItem#getUnitPrice <em>Unit Price</em>}</li>
 *   <li>{@link org.hl7.fhir.ExplanationOfBenefitItem#getFactor <em>Factor</em>}</li>
 *   <li>{@link org.hl7.fhir.ExplanationOfBenefitItem#getNet <em>Net</em>}</li>
 *   <li>{@link org.hl7.fhir.ExplanationOfBenefitItem#getUdi <em>Udi</em>}</li>
 *   <li>{@link org.hl7.fhir.ExplanationOfBenefitItem#getBodySite <em>Body Site</em>}</li>
 *   <li>{@link org.hl7.fhir.ExplanationOfBenefitItem#getSubSite <em>Sub Site</em>}</li>
 *   <li>{@link org.hl7.fhir.ExplanationOfBenefitItem#getNoteNumber <em>Note Number</em>}</li>
 *   <li>{@link org.hl7.fhir.ExplanationOfBenefitItem#getAdjudication <em>Adjudication</em>}</li>
 *   <li>{@link org.hl7.fhir.ExplanationOfBenefitItem#getDetail <em>Detail</em>}</li>
 * </ul>
 *
 * @see org.hl7.fhir.FhirPackage#getExplanationOfBenefitItem()
 * @model extendedMetaData="name='ExplanationOfBenefit.Item' kind='elementOnly'"
 * @generated
 */
@XmlJavaTypeAdapter(ExplanationOfBenefitItemImplAdapter.class)
public interface ExplanationOfBenefitItem extends BackboneElement {
	/**
	 * Returns the value of the '<em><b>Sequence</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * A service line number.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Sequence</em>' containment reference.
	 * @see #setSequence(PositiveInt)
	 * @see org.hl7.fhir.FhirPackage#getExplanationOfBenefitItem_Sequence()
	 * @model containment="true" required="true"
	 *        extendedMetaData="kind='element' name='sequence' namespace='##targetNamespace'"
	 * @generated
	 */
	PositiveInt getSequence();

	/**
	 * Sets the value of the '{@link org.hl7.fhir.ExplanationOfBenefitItem#getSequence <em>Sequence</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Sequence</em>' containment reference.
	 * @see #getSequence()
	 * @generated
	 */
	void setSequence(PositiveInt value);

	/**
	 * Returns the value of the '<em><b>Care Team Link Id</b></em>' containment reference list.
	 * The list contents are of type {@link org.hl7.fhir.PositiveInt}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Careteam applicable for this service or product line.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Care Team Link Id</em>' containment reference list.
	 * @see org.hl7.fhir.FhirPackage#getExplanationOfBenefitItem_CareTeamLinkId()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='careTeamLinkId' namespace='##targetNamespace'"
	 * @generated
	 */
	List<PositiveInt> getCareTeamLinkId();

	/**
	 * Returns the value of the '<em><b>Diagnosis Link Id</b></em>' containment reference list.
	 * The list contents are of type {@link org.hl7.fhir.PositiveInt}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Diagnosis applicable for this service or product line.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Diagnosis Link Id</em>' containment reference list.
	 * @see org.hl7.fhir.FhirPackage#getExplanationOfBenefitItem_DiagnosisLinkId()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='diagnosisLinkId' namespace='##targetNamespace'"
	 * @generated
	 */
	List<PositiveInt> getDiagnosisLinkId();

	/**
	 * Returns the value of the '<em><b>Procedure Link Id</b></em>' containment reference list.
	 * The list contents are of type {@link org.hl7.fhir.PositiveInt}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Procedures applicable for this service or product line.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Procedure Link Id</em>' containment reference list.
	 * @see org.hl7.fhir.FhirPackage#getExplanationOfBenefitItem_ProcedureLinkId()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='procedureLinkId' namespace='##targetNamespace'"
	 * @generated
	 */
	List<PositiveInt> getProcedureLinkId();

	/**
	 * Returns the value of the '<em><b>Information Link Id</b></em>' containment reference list.
	 * The list contents are of type {@link org.hl7.fhir.PositiveInt}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Exceptions, special conditions and supporting information pplicable for this service or product line.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Information Link Id</em>' containment reference list.
	 * @see org.hl7.fhir.FhirPackage#getExplanationOfBenefitItem_InformationLinkId()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='informationLinkId' namespace='##targetNamespace'"
	 * @generated
	 */
	List<PositiveInt> getInformationLinkId();

	/**
	 * Returns the value of the '<em><b>Revenue</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The type of reveneu or cost center providing the product and/or service.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Revenue</em>' containment reference.
	 * @see #setRevenue(CodeableConcept)
	 * @see org.hl7.fhir.FhirPackage#getExplanationOfBenefitItem_Revenue()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='revenue' namespace='##targetNamespace'"
	 * @generated
	 */
	CodeableConcept getRevenue();

	/**
	 * Sets the value of the '{@link org.hl7.fhir.ExplanationOfBenefitItem#getRevenue <em>Revenue</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Revenue</em>' containment reference.
	 * @see #getRevenue()
	 * @generated
	 */
	void setRevenue(CodeableConcept value);

	/**
	 * Returns the value of the '<em><b>Category</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Health Care Service Type Codes  to identify the classification of service or benefits.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Category</em>' containment reference.
	 * @see #setCategory(CodeableConcept)
	 * @see org.hl7.fhir.FhirPackage#getExplanationOfBenefitItem_Category()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='category' namespace='##targetNamespace'"
	 * @generated
	 */
	CodeableConcept getCategory();

	/**
	 * Sets the value of the '{@link org.hl7.fhir.ExplanationOfBenefitItem#getCategory <em>Category</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Category</em>' containment reference.
	 * @see #getCategory()
	 * @generated
	 */
	void setCategory(CodeableConcept value);

	/**
	 * Returns the value of the '<em><b>Service</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * If this is an actual service or product line, ie. not a Group, then use code to indicate the Professional Service or Product supplied (eg. CTP, HCPCS,USCLS,ICD10, NCPDP,DIN,ACHI,CCI). If a grouping item then use a group code to indicate the type of thing being grouped eg. 'glasses' or 'compound'.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Service</em>' containment reference.
	 * @see #setService(CodeableConcept)
	 * @see org.hl7.fhir.FhirPackage#getExplanationOfBenefitItem_Service()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='service' namespace='##targetNamespace'"
	 * @generated
	 */
	CodeableConcept getService();

	/**
	 * Sets the value of the '{@link org.hl7.fhir.ExplanationOfBenefitItem#getService <em>Service</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Service</em>' containment reference.
	 * @see #getService()
	 * @generated
	 */
	void setService(CodeableConcept value);

	/**
	 * Returns the value of the '<em><b>Modifier</b></em>' containment reference list.
	 * The list contents are of type {@link org.hl7.fhir.CodeableConcept}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Item typification or modifiers codes, eg for Oral whether the treatment is cosmetic or associated with TMJ, or for medical whether the treatment was outside the clinic or out of office hours.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Modifier</em>' containment reference list.
	 * @see org.hl7.fhir.FhirPackage#getExplanationOfBenefitItem_Modifier()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='modifier' namespace='##targetNamespace'"
	 * @generated
	 */
	List<CodeableConcept> getModifier();

	/**
	 * Returns the value of the '<em><b>Program Code</b></em>' containment reference list.
	 * The list contents are of type {@link org.hl7.fhir.CodeableConcept}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * For programs which require reson codes for the inclusion, covering, of this billed item under the program or sub-program.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Program Code</em>' containment reference list.
	 * @see org.hl7.fhir.FhirPackage#getExplanationOfBenefitItem_ProgramCode()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='programCode' namespace='##targetNamespace'"
	 * @generated
	 */
	List<CodeableConcept> getProgramCode();

	/**
	 * Returns the value of the '<em><b>Serviced Date</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The date or dates when the enclosed suite of services were performed or completed. (choose any one of serviced*, but only one)
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Serviced Date</em>' containment reference.
	 * @see #setServicedDate(Date)
	 * @see org.hl7.fhir.FhirPackage#getExplanationOfBenefitItem_ServicedDate()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='servicedDate' namespace='##targetNamespace'"
	 * @generated
	 */
	Date getServicedDate();

	/**
	 * Sets the value of the '{@link org.hl7.fhir.ExplanationOfBenefitItem#getServicedDate <em>Serviced Date</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Serviced Date</em>' containment reference.
	 * @see #getServicedDate()
	 * @generated
	 */
	void setServicedDate(Date value);

	/**
	 * Returns the value of the '<em><b>Serviced Period</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The date or dates when the enclosed suite of services were performed or completed. (choose any one of serviced*, but only one)
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Serviced Period</em>' containment reference.
	 * @see #setServicedPeriod(Period)
	 * @see org.hl7.fhir.FhirPackage#getExplanationOfBenefitItem_ServicedPeriod()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='servicedPeriod' namespace='##targetNamespace'"
	 * @generated
	 */
	Period getServicedPeriod();

	/**
	 * Sets the value of the '{@link org.hl7.fhir.ExplanationOfBenefitItem#getServicedPeriod <em>Serviced Period</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Serviced Period</em>' containment reference.
	 * @see #getServicedPeriod()
	 * @generated
	 */
	void setServicedPeriod(Period value);

	/**
	 * Returns the value of the '<em><b>Location Codeable Concept</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Where the service was provided. (choose any one of location*, but only one)
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Location Codeable Concept</em>' containment reference.
	 * @see #setLocationCodeableConcept(CodeableConcept)
	 * @see org.hl7.fhir.FhirPackage#getExplanationOfBenefitItem_LocationCodeableConcept()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='locationCodeableConcept' namespace='##targetNamespace'"
	 * @generated
	 */
	CodeableConcept getLocationCodeableConcept();

	/**
	 * Sets the value of the '{@link org.hl7.fhir.ExplanationOfBenefitItem#getLocationCodeableConcept <em>Location Codeable Concept</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Location Codeable Concept</em>' containment reference.
	 * @see #getLocationCodeableConcept()
	 * @generated
	 */
	void setLocationCodeableConcept(CodeableConcept value);

	/**
	 * Returns the value of the '<em><b>Location Address</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Where the service was provided. (choose any one of location*, but only one)
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Location Address</em>' containment reference.
	 * @see #setLocationAddress(Address)
	 * @see org.hl7.fhir.FhirPackage#getExplanationOfBenefitItem_LocationAddress()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='locationAddress' namespace='##targetNamespace'"
	 * @generated
	 */
	Address getLocationAddress();

	/**
	 * Sets the value of the '{@link org.hl7.fhir.ExplanationOfBenefitItem#getLocationAddress <em>Location Address</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Location Address</em>' containment reference.
	 * @see #getLocationAddress()
	 * @generated
	 */
	void setLocationAddress(Address value);

	/**
	 * Returns the value of the '<em><b>Location Reference</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Where the service was provided. (choose any one of location*, but only one)
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Location Reference</em>' containment reference.
	 * @see #setLocationReference(Reference)
	 * @see org.hl7.fhir.FhirPackage#getExplanationOfBenefitItem_LocationReference()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='locationReference' namespace='##targetNamespace'"
	 * @generated
	 */
	Reference getLocationReference();

	/**
	 * Sets the value of the '{@link org.hl7.fhir.ExplanationOfBenefitItem#getLocationReference <em>Location Reference</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Location Reference</em>' containment reference.
	 * @see #getLocationReference()
	 * @generated
	 */
	void setLocationReference(Reference value);

	/**
	 * Returns the value of the '<em><b>Quantity</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The number of repetitions of a service or product.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Quantity</em>' containment reference.
	 * @see #setQuantity(Quantity)
	 * @see org.hl7.fhir.FhirPackage#getExplanationOfBenefitItem_Quantity()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='quantity' namespace='##targetNamespace'"
	 * @generated
	 */
	Quantity getQuantity();

	/**
	 * Sets the value of the '{@link org.hl7.fhir.ExplanationOfBenefitItem#getQuantity <em>Quantity</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Quantity</em>' containment reference.
	 * @see #getQuantity()
	 * @generated
	 */
	void setQuantity(Quantity value);

	/**
	 * Returns the value of the '<em><b>Unit Price</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * If the item is a node then this is the fee for the product or service, otherwise this is the total of the fees for the children of the group.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Unit Price</em>' containment reference.
	 * @see #setUnitPrice(Money)
	 * @see org.hl7.fhir.FhirPackage#getExplanationOfBenefitItem_UnitPrice()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='unitPrice' namespace='##targetNamespace'"
	 * @generated
	 */
	Money getUnitPrice();

	/**
	 * Sets the value of the '{@link org.hl7.fhir.ExplanationOfBenefitItem#getUnitPrice <em>Unit Price</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Unit Price</em>' containment reference.
	 * @see #getUnitPrice()
	 * @generated
	 */
	void setUnitPrice(Money value);

	/**
	 * Returns the value of the '<em><b>Factor</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * A real number that represents a multiplier used in determining the overall value of services delivered and/or goods received. The concept of a Factor allows for a discount or surcharge multiplier to be applied to a monetary amount.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Factor</em>' containment reference.
	 * @see #setFactor(Decimal)
	 * @see org.hl7.fhir.FhirPackage#getExplanationOfBenefitItem_Factor()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='factor' namespace='##targetNamespace'"
	 * @generated
	 */
	Decimal getFactor();

	/**
	 * Sets the value of the '{@link org.hl7.fhir.ExplanationOfBenefitItem#getFactor <em>Factor</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Factor</em>' containment reference.
	 * @see #getFactor()
	 * @generated
	 */
	void setFactor(Decimal value);

	/**
	 * Returns the value of the '<em><b>Net</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The quantity times the unit price for an addittional service or product or charge. For example, the formula: unit Quantity * unit Price (Cost per Point) * factor Number  * points = net Amount. Quantity, factor and points are assumed to be 1 if not supplied.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Net</em>' containment reference.
	 * @see #setNet(Money)
	 * @see org.hl7.fhir.FhirPackage#getExplanationOfBenefitItem_Net()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='net' namespace='##targetNamespace'"
	 * @generated
	 */
	Money getNet();

	/**
	 * Sets the value of the '{@link org.hl7.fhir.ExplanationOfBenefitItem#getNet <em>Net</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Net</em>' containment reference.
	 * @see #getNet()
	 * @generated
	 */
	void setNet(Money value);

	/**
	 * Returns the value of the '<em><b>Udi</b></em>' containment reference list.
	 * The list contents are of type {@link org.hl7.fhir.Reference}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * List of Unique Device Identifiers associated with this line item.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Udi</em>' containment reference list.
	 * @see org.hl7.fhir.FhirPackage#getExplanationOfBenefitItem_Udi()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='udi' namespace='##targetNamespace'"
	 * @generated
	 */
	List<Reference> getUdi();

	/**
	 * Returns the value of the '<em><b>Body Site</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Physical service site on the patient (limb, tooth, etc).
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Body Site</em>' containment reference.
	 * @see #setBodySite(CodeableConcept)
	 * @see org.hl7.fhir.FhirPackage#getExplanationOfBenefitItem_BodySite()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='bodySite' namespace='##targetNamespace'"
	 * @generated
	 */
	CodeableConcept getBodySite();

	/**
	 * Sets the value of the '{@link org.hl7.fhir.ExplanationOfBenefitItem#getBodySite <em>Body Site</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Body Site</em>' containment reference.
	 * @see #getBodySite()
	 * @generated
	 */
	void setBodySite(CodeableConcept value);

	/**
	 * Returns the value of the '<em><b>Sub Site</b></em>' containment reference list.
	 * The list contents are of type {@link org.hl7.fhir.CodeableConcept}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * A region or surface of the site, eg. limb region or tooth surface(s).
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Sub Site</em>' containment reference list.
	 * @see org.hl7.fhir.FhirPackage#getExplanationOfBenefitItem_SubSite()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='subSite' namespace='##targetNamespace'"
	 * @generated
	 */
	List<CodeableConcept> getSubSite();

	/**
	 * Returns the value of the '<em><b>Note Number</b></em>' containment reference list.
	 * The list contents are of type {@link org.hl7.fhir.PositiveInt}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * A list of note references to the notes provided below.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Note Number</em>' containment reference list.
	 * @see org.hl7.fhir.FhirPackage#getExplanationOfBenefitItem_NoteNumber()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='noteNumber' namespace='##targetNamespace'"
	 * @generated
	 */
	List<PositiveInt> getNoteNumber();

	/**
	 * Returns the value of the '<em><b>Adjudication</b></em>' containment reference list.
	 * The list contents are of type {@link org.hl7.fhir.ExplanationOfBenefitAdjudication}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The adjudications results.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Adjudication</em>' containment reference list.
	 * @see org.hl7.fhir.FhirPackage#getExplanationOfBenefitItem_Adjudication()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='adjudication' namespace='##targetNamespace'"
	 * @generated
	 */
	List<ExplanationOfBenefitAdjudication> getAdjudication();

	/**
	 * Returns the value of the '<em><b>Detail</b></em>' containment reference list.
	 * The list contents are of type {@link org.hl7.fhir.ExplanationOfBenefitDetail}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Second tier of goods and services.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Detail</em>' containment reference list.
	 * @see org.hl7.fhir.FhirPackage#getExplanationOfBenefitItem_Detail()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='detail' namespace='##targetNamespace'"
	 * @generated
	 */
	List<ExplanationOfBenefitDetail> getDetail();

} // ExplanationOfBenefitItem
