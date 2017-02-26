/**
 */
package org.hl7.fhir;

import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;

import org.hl7.fhir.jaxb.StructureMapSourceImplAdapter;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Structure Map Source</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * A Map of relationships between 2 structures that can be used to transform data.
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.hl7.fhir.StructureMapSource#getContext <em>Context</em>}</li>
 *   <li>{@link org.hl7.fhir.StructureMapSource#getMin <em>Min</em>}</li>
 *   <li>{@link org.hl7.fhir.StructureMapSource#getMax <em>Max</em>}</li>
 *   <li>{@link org.hl7.fhir.StructureMapSource#getType <em>Type</em>}</li>
 *   <li>{@link org.hl7.fhir.StructureMapSource#getDefaultValueBase64Binary <em>Default Value Base64 Binary</em>}</li>
 *   <li>{@link org.hl7.fhir.StructureMapSource#getDefaultValueBoolean <em>Default Value Boolean</em>}</li>
 *   <li>{@link org.hl7.fhir.StructureMapSource#getDefaultValueCode <em>Default Value Code</em>}</li>
 *   <li>{@link org.hl7.fhir.StructureMapSource#getDefaultValueDate <em>Default Value Date</em>}</li>
 *   <li>{@link org.hl7.fhir.StructureMapSource#getDefaultValueDateTime <em>Default Value Date Time</em>}</li>
 *   <li>{@link org.hl7.fhir.StructureMapSource#getDefaultValueDecimal <em>Default Value Decimal</em>}</li>
 *   <li>{@link org.hl7.fhir.StructureMapSource#getDefaultValueId <em>Default Value Id</em>}</li>
 *   <li>{@link org.hl7.fhir.StructureMapSource#getDefaultValueInstant <em>Default Value Instant</em>}</li>
 *   <li>{@link org.hl7.fhir.StructureMapSource#getDefaultValueInteger <em>Default Value Integer</em>}</li>
 *   <li>{@link org.hl7.fhir.StructureMapSource#getDefaultValueMarkdown <em>Default Value Markdown</em>}</li>
 *   <li>{@link org.hl7.fhir.StructureMapSource#getDefaultValueOid <em>Default Value Oid</em>}</li>
 *   <li>{@link org.hl7.fhir.StructureMapSource#getDefaultValuePositiveInt <em>Default Value Positive Int</em>}</li>
 *   <li>{@link org.hl7.fhir.StructureMapSource#getDefaultValueString <em>Default Value String</em>}</li>
 *   <li>{@link org.hl7.fhir.StructureMapSource#getDefaultValueTime <em>Default Value Time</em>}</li>
 *   <li>{@link org.hl7.fhir.StructureMapSource#getDefaultValueUnsignedInt <em>Default Value Unsigned Int</em>}</li>
 *   <li>{@link org.hl7.fhir.StructureMapSource#getDefaultValueUri <em>Default Value Uri</em>}</li>
 *   <li>{@link org.hl7.fhir.StructureMapSource#getDefaultValueAddress <em>Default Value Address</em>}</li>
 *   <li>{@link org.hl7.fhir.StructureMapSource#getDefaultValueAge <em>Default Value Age</em>}</li>
 *   <li>{@link org.hl7.fhir.StructureMapSource#getDefaultValueAnnotation <em>Default Value Annotation</em>}</li>
 *   <li>{@link org.hl7.fhir.StructureMapSource#getDefaultValueAttachment <em>Default Value Attachment</em>}</li>
 *   <li>{@link org.hl7.fhir.StructureMapSource#getDefaultValueCodeableConcept <em>Default Value Codeable Concept</em>}</li>
 *   <li>{@link org.hl7.fhir.StructureMapSource#getDefaultValueCoding <em>Default Value Coding</em>}</li>
 *   <li>{@link org.hl7.fhir.StructureMapSource#getDefaultValueContactPoint <em>Default Value Contact Point</em>}</li>
 *   <li>{@link org.hl7.fhir.StructureMapSource#getDefaultValueCount <em>Default Value Count</em>}</li>
 *   <li>{@link org.hl7.fhir.StructureMapSource#getDefaultValueDistance <em>Default Value Distance</em>}</li>
 *   <li>{@link org.hl7.fhir.StructureMapSource#getDefaultValueDuration <em>Default Value Duration</em>}</li>
 *   <li>{@link org.hl7.fhir.StructureMapSource#getDefaultValueHumanName <em>Default Value Human Name</em>}</li>
 *   <li>{@link org.hl7.fhir.StructureMapSource#getDefaultValueIdentifier <em>Default Value Identifier</em>}</li>
 *   <li>{@link org.hl7.fhir.StructureMapSource#getDefaultValueMoney <em>Default Value Money</em>}</li>
 *   <li>{@link org.hl7.fhir.StructureMapSource#getDefaultValuePeriod <em>Default Value Period</em>}</li>
 *   <li>{@link org.hl7.fhir.StructureMapSource#getDefaultValueQuantity <em>Default Value Quantity</em>}</li>
 *   <li>{@link org.hl7.fhir.StructureMapSource#getDefaultValueRange <em>Default Value Range</em>}</li>
 *   <li>{@link org.hl7.fhir.StructureMapSource#getDefaultValueRatio <em>Default Value Ratio</em>}</li>
 *   <li>{@link org.hl7.fhir.StructureMapSource#getDefaultValueReference <em>Default Value Reference</em>}</li>
 *   <li>{@link org.hl7.fhir.StructureMapSource#getDefaultValueSampledData <em>Default Value Sampled Data</em>}</li>
 *   <li>{@link org.hl7.fhir.StructureMapSource#getDefaultValueSignature <em>Default Value Signature</em>}</li>
 *   <li>{@link org.hl7.fhir.StructureMapSource#getDefaultValueTiming <em>Default Value Timing</em>}</li>
 *   <li>{@link org.hl7.fhir.StructureMapSource#getDefaultValueMeta <em>Default Value Meta</em>}</li>
 *   <li>{@link org.hl7.fhir.StructureMapSource#getElement <em>Element</em>}</li>
 *   <li>{@link org.hl7.fhir.StructureMapSource#getListMode <em>List Mode</em>}</li>
 *   <li>{@link org.hl7.fhir.StructureMapSource#getVariable <em>Variable</em>}</li>
 *   <li>{@link org.hl7.fhir.StructureMapSource#getCondition <em>Condition</em>}</li>
 *   <li>{@link org.hl7.fhir.StructureMapSource#getCheck <em>Check</em>}</li>
 * </ul>
 *
 * @see org.hl7.fhir.FhirPackage#getStructureMapSource()
 * @model extendedMetaData="name='StructureMap.Source' kind='elementOnly'"
 * @generated
 */
@XmlJavaTypeAdapter(StructureMapSourceImplAdapter.class)
public interface StructureMapSource extends BackboneElement {
	/**
	 * Returns the value of the '<em><b>Context</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Type or variable this rule applies to.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Context</em>' containment reference.
	 * @see #setContext(Id)
	 * @see org.hl7.fhir.FhirPackage#getStructureMapSource_Context()
	 * @model containment="true" required="true"
	 *        extendedMetaData="kind='element' name='context' namespace='##targetNamespace'"
	 * @generated
	 */
	Id getContext();

	/**
	 * Sets the value of the '{@link org.hl7.fhir.StructureMapSource#getContext <em>Context</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Context</em>' containment reference.
	 * @see #getContext()
	 * @generated
	 */
	void setContext(Id value);

	/**
	 * Returns the value of the '<em><b>Min</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Specified minimum cardinality for the element. This is optional; if present, it acts an implicit check on the input content.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Min</em>' containment reference.
	 * @see #setMin(org.hl7.fhir.Integer)
	 * @see org.hl7.fhir.FhirPackage#getStructureMapSource_Min()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='min' namespace='##targetNamespace'"
	 * @generated
	 */
	org.hl7.fhir.Integer getMin();

	/**
	 * Sets the value of the '{@link org.hl7.fhir.StructureMapSource#getMin <em>Min</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Min</em>' containment reference.
	 * @see #getMin()
	 * @generated
	 */
	void setMin(org.hl7.fhir.Integer value);

	/**
	 * Returns the value of the '<em><b>Max</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Specified maximum cardinality for the element - a number or a "*". This is optional; if present, it acts an implicit check on the input content (* just serves as documentation; it's the default value).
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Max</em>' containment reference.
	 * @see #setMax(org.hl7.fhir.String)
	 * @see org.hl7.fhir.FhirPackage#getStructureMapSource_Max()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='max' namespace='##targetNamespace'"
	 * @generated
	 */
	org.hl7.fhir.String getMax();

	/**
	 * Sets the value of the '{@link org.hl7.fhir.StructureMapSource#getMax <em>Max</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Max</em>' containment reference.
	 * @see #getMax()
	 * @generated
	 */
	void setMax(org.hl7.fhir.String value);

	/**
	 * Returns the value of the '<em><b>Type</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Specified type for the element. This works as a condition on the mapping - use for polymorphic elements.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Type</em>' containment reference.
	 * @see #setType(org.hl7.fhir.String)
	 * @see org.hl7.fhir.FhirPackage#getStructureMapSource_Type()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='type' namespace='##targetNamespace'"
	 * @generated
	 */
	org.hl7.fhir.String getType();

	/**
	 * Sets the value of the '{@link org.hl7.fhir.StructureMapSource#getType <em>Type</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Type</em>' containment reference.
	 * @see #getType()
	 * @generated
	 */
	void setType(org.hl7.fhir.String value);

	/**
	 * Returns the value of the '<em><b>Default Value Base64 Binary</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * A value to use if there is no existing value in the source object. (choose any one of defaultValue*, but only one)
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Default Value Base64 Binary</em>' containment reference.
	 * @see #setDefaultValueBase64Binary(Base64Binary)
	 * @see org.hl7.fhir.FhirPackage#getStructureMapSource_DefaultValueBase64Binary()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='defaultValueBase64Binary' namespace='##targetNamespace'"
	 * @generated
	 */
	Base64Binary getDefaultValueBase64Binary();

	/**
	 * Sets the value of the '{@link org.hl7.fhir.StructureMapSource#getDefaultValueBase64Binary <em>Default Value Base64 Binary</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Default Value Base64 Binary</em>' containment reference.
	 * @see #getDefaultValueBase64Binary()
	 * @generated
	 */
	void setDefaultValueBase64Binary(Base64Binary value);

	/**
	 * Returns the value of the '<em><b>Default Value Boolean</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * A value to use if there is no existing value in the source object. (choose any one of defaultValue*, but only one)
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Default Value Boolean</em>' containment reference.
	 * @see #setDefaultValueBoolean(org.hl7.fhir.Boolean)
	 * @see org.hl7.fhir.FhirPackage#getStructureMapSource_DefaultValueBoolean()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='defaultValueBoolean' namespace='##targetNamespace'"
	 * @generated
	 */
	org.hl7.fhir.Boolean getDefaultValueBoolean();

	/**
	 * Sets the value of the '{@link org.hl7.fhir.StructureMapSource#getDefaultValueBoolean <em>Default Value Boolean</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Default Value Boolean</em>' containment reference.
	 * @see #getDefaultValueBoolean()
	 * @generated
	 */
	void setDefaultValueBoolean(org.hl7.fhir.Boolean value);

	/**
	 * Returns the value of the '<em><b>Default Value Code</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * A value to use if there is no existing value in the source object. (choose any one of defaultValue*, but only one)
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Default Value Code</em>' containment reference.
	 * @see #setDefaultValueCode(Code)
	 * @see org.hl7.fhir.FhirPackage#getStructureMapSource_DefaultValueCode()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='defaultValueCode' namespace='##targetNamespace'"
	 * @generated
	 */
	Code getDefaultValueCode();

	/**
	 * Sets the value of the '{@link org.hl7.fhir.StructureMapSource#getDefaultValueCode <em>Default Value Code</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Default Value Code</em>' containment reference.
	 * @see #getDefaultValueCode()
	 * @generated
	 */
	void setDefaultValueCode(Code value);

	/**
	 * Returns the value of the '<em><b>Default Value Date</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * A value to use if there is no existing value in the source object. (choose any one of defaultValue*, but only one)
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Default Value Date</em>' containment reference.
	 * @see #setDefaultValueDate(Date)
	 * @see org.hl7.fhir.FhirPackage#getStructureMapSource_DefaultValueDate()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='defaultValueDate' namespace='##targetNamespace'"
	 * @generated
	 */
	Date getDefaultValueDate();

	/**
	 * Sets the value of the '{@link org.hl7.fhir.StructureMapSource#getDefaultValueDate <em>Default Value Date</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Default Value Date</em>' containment reference.
	 * @see #getDefaultValueDate()
	 * @generated
	 */
	void setDefaultValueDate(Date value);

	/**
	 * Returns the value of the '<em><b>Default Value Date Time</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * A value to use if there is no existing value in the source object. (choose any one of defaultValue*, but only one)
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Default Value Date Time</em>' containment reference.
	 * @see #setDefaultValueDateTime(DateTime)
	 * @see org.hl7.fhir.FhirPackage#getStructureMapSource_DefaultValueDateTime()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='defaultValueDateTime' namespace='##targetNamespace'"
	 * @generated
	 */
	DateTime getDefaultValueDateTime();

	/**
	 * Sets the value of the '{@link org.hl7.fhir.StructureMapSource#getDefaultValueDateTime <em>Default Value Date Time</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Default Value Date Time</em>' containment reference.
	 * @see #getDefaultValueDateTime()
	 * @generated
	 */
	void setDefaultValueDateTime(DateTime value);

	/**
	 * Returns the value of the '<em><b>Default Value Decimal</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * A value to use if there is no existing value in the source object. (choose any one of defaultValue*, but only one)
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Default Value Decimal</em>' containment reference.
	 * @see #setDefaultValueDecimal(Decimal)
	 * @see org.hl7.fhir.FhirPackage#getStructureMapSource_DefaultValueDecimal()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='defaultValueDecimal' namespace='##targetNamespace'"
	 * @generated
	 */
	Decimal getDefaultValueDecimal();

	/**
	 * Sets the value of the '{@link org.hl7.fhir.StructureMapSource#getDefaultValueDecimal <em>Default Value Decimal</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Default Value Decimal</em>' containment reference.
	 * @see #getDefaultValueDecimal()
	 * @generated
	 */
	void setDefaultValueDecimal(Decimal value);

	/**
	 * Returns the value of the '<em><b>Default Value Id</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * A value to use if there is no existing value in the source object. (choose any one of defaultValue*, but only one)
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Default Value Id</em>' containment reference.
	 * @see #setDefaultValueId(Id)
	 * @see org.hl7.fhir.FhirPackage#getStructureMapSource_DefaultValueId()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='defaultValueId' namespace='##targetNamespace'"
	 * @generated
	 */
	Id getDefaultValueId();

	/**
	 * Sets the value of the '{@link org.hl7.fhir.StructureMapSource#getDefaultValueId <em>Default Value Id</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Default Value Id</em>' containment reference.
	 * @see #getDefaultValueId()
	 * @generated
	 */
	void setDefaultValueId(Id value);

	/**
	 * Returns the value of the '<em><b>Default Value Instant</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * A value to use if there is no existing value in the source object. (choose any one of defaultValue*, but only one)
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Default Value Instant</em>' containment reference.
	 * @see #setDefaultValueInstant(Instant)
	 * @see org.hl7.fhir.FhirPackage#getStructureMapSource_DefaultValueInstant()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='defaultValueInstant' namespace='##targetNamespace'"
	 * @generated
	 */
	Instant getDefaultValueInstant();

	/**
	 * Sets the value of the '{@link org.hl7.fhir.StructureMapSource#getDefaultValueInstant <em>Default Value Instant</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Default Value Instant</em>' containment reference.
	 * @see #getDefaultValueInstant()
	 * @generated
	 */
	void setDefaultValueInstant(Instant value);

	/**
	 * Returns the value of the '<em><b>Default Value Integer</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * A value to use if there is no existing value in the source object. (choose any one of defaultValue*, but only one)
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Default Value Integer</em>' containment reference.
	 * @see #setDefaultValueInteger(org.hl7.fhir.Integer)
	 * @see org.hl7.fhir.FhirPackage#getStructureMapSource_DefaultValueInteger()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='defaultValueInteger' namespace='##targetNamespace'"
	 * @generated
	 */
	org.hl7.fhir.Integer getDefaultValueInteger();

	/**
	 * Sets the value of the '{@link org.hl7.fhir.StructureMapSource#getDefaultValueInteger <em>Default Value Integer</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Default Value Integer</em>' containment reference.
	 * @see #getDefaultValueInteger()
	 * @generated
	 */
	void setDefaultValueInteger(org.hl7.fhir.Integer value);

	/**
	 * Returns the value of the '<em><b>Default Value Markdown</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * A value to use if there is no existing value in the source object. (choose any one of defaultValue*, but only one)
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Default Value Markdown</em>' containment reference.
	 * @see #setDefaultValueMarkdown(Markdown)
	 * @see org.hl7.fhir.FhirPackage#getStructureMapSource_DefaultValueMarkdown()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='defaultValueMarkdown' namespace='##targetNamespace'"
	 * @generated
	 */
	Markdown getDefaultValueMarkdown();

	/**
	 * Sets the value of the '{@link org.hl7.fhir.StructureMapSource#getDefaultValueMarkdown <em>Default Value Markdown</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Default Value Markdown</em>' containment reference.
	 * @see #getDefaultValueMarkdown()
	 * @generated
	 */
	void setDefaultValueMarkdown(Markdown value);

	/**
	 * Returns the value of the '<em><b>Default Value Oid</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * A value to use if there is no existing value in the source object. (choose any one of defaultValue*, but only one)
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Default Value Oid</em>' containment reference.
	 * @see #setDefaultValueOid(Oid)
	 * @see org.hl7.fhir.FhirPackage#getStructureMapSource_DefaultValueOid()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='defaultValueOid' namespace='##targetNamespace'"
	 * @generated
	 */
	Oid getDefaultValueOid();

	/**
	 * Sets the value of the '{@link org.hl7.fhir.StructureMapSource#getDefaultValueOid <em>Default Value Oid</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Default Value Oid</em>' containment reference.
	 * @see #getDefaultValueOid()
	 * @generated
	 */
	void setDefaultValueOid(Oid value);

	/**
	 * Returns the value of the '<em><b>Default Value Positive Int</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * A value to use if there is no existing value in the source object. (choose any one of defaultValue*, but only one)
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Default Value Positive Int</em>' containment reference.
	 * @see #setDefaultValuePositiveInt(PositiveInt)
	 * @see org.hl7.fhir.FhirPackage#getStructureMapSource_DefaultValuePositiveInt()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='defaultValuePositiveInt' namespace='##targetNamespace'"
	 * @generated
	 */
	PositiveInt getDefaultValuePositiveInt();

	/**
	 * Sets the value of the '{@link org.hl7.fhir.StructureMapSource#getDefaultValuePositiveInt <em>Default Value Positive Int</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Default Value Positive Int</em>' containment reference.
	 * @see #getDefaultValuePositiveInt()
	 * @generated
	 */
	void setDefaultValuePositiveInt(PositiveInt value);

	/**
	 * Returns the value of the '<em><b>Default Value String</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * A value to use if there is no existing value in the source object. (choose any one of defaultValue*, but only one)
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Default Value String</em>' containment reference.
	 * @see #setDefaultValueString(org.hl7.fhir.String)
	 * @see org.hl7.fhir.FhirPackage#getStructureMapSource_DefaultValueString()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='defaultValueString' namespace='##targetNamespace'"
	 * @generated
	 */
	org.hl7.fhir.String getDefaultValueString();

	/**
	 * Sets the value of the '{@link org.hl7.fhir.StructureMapSource#getDefaultValueString <em>Default Value String</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Default Value String</em>' containment reference.
	 * @see #getDefaultValueString()
	 * @generated
	 */
	void setDefaultValueString(org.hl7.fhir.String value);

	/**
	 * Returns the value of the '<em><b>Default Value Time</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * A value to use if there is no existing value in the source object. (choose any one of defaultValue*, but only one)
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Default Value Time</em>' containment reference.
	 * @see #setDefaultValueTime(Time)
	 * @see org.hl7.fhir.FhirPackage#getStructureMapSource_DefaultValueTime()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='defaultValueTime' namespace='##targetNamespace'"
	 * @generated
	 */
	Time getDefaultValueTime();

	/**
	 * Sets the value of the '{@link org.hl7.fhir.StructureMapSource#getDefaultValueTime <em>Default Value Time</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Default Value Time</em>' containment reference.
	 * @see #getDefaultValueTime()
	 * @generated
	 */
	void setDefaultValueTime(Time value);

	/**
	 * Returns the value of the '<em><b>Default Value Unsigned Int</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * A value to use if there is no existing value in the source object. (choose any one of defaultValue*, but only one)
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Default Value Unsigned Int</em>' containment reference.
	 * @see #setDefaultValueUnsignedInt(UnsignedInt)
	 * @see org.hl7.fhir.FhirPackage#getStructureMapSource_DefaultValueUnsignedInt()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='defaultValueUnsignedInt' namespace='##targetNamespace'"
	 * @generated
	 */
	UnsignedInt getDefaultValueUnsignedInt();

	/**
	 * Sets the value of the '{@link org.hl7.fhir.StructureMapSource#getDefaultValueUnsignedInt <em>Default Value Unsigned Int</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Default Value Unsigned Int</em>' containment reference.
	 * @see #getDefaultValueUnsignedInt()
	 * @generated
	 */
	void setDefaultValueUnsignedInt(UnsignedInt value);

	/**
	 * Returns the value of the '<em><b>Default Value Uri</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * A value to use if there is no existing value in the source object. (choose any one of defaultValue*, but only one)
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Default Value Uri</em>' containment reference.
	 * @see #setDefaultValueUri(Uri)
	 * @see org.hl7.fhir.FhirPackage#getStructureMapSource_DefaultValueUri()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='defaultValueUri' namespace='##targetNamespace'"
	 * @generated
	 */
	Uri getDefaultValueUri();

	/**
	 * Sets the value of the '{@link org.hl7.fhir.StructureMapSource#getDefaultValueUri <em>Default Value Uri</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Default Value Uri</em>' containment reference.
	 * @see #getDefaultValueUri()
	 * @generated
	 */
	void setDefaultValueUri(Uri value);

	/**
	 * Returns the value of the '<em><b>Default Value Address</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * A value to use if there is no existing value in the source object. (choose any one of defaultValue*, but only one)
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Default Value Address</em>' containment reference.
	 * @see #setDefaultValueAddress(Address)
	 * @see org.hl7.fhir.FhirPackage#getStructureMapSource_DefaultValueAddress()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='defaultValueAddress' namespace='##targetNamespace'"
	 * @generated
	 */
	Address getDefaultValueAddress();

	/**
	 * Sets the value of the '{@link org.hl7.fhir.StructureMapSource#getDefaultValueAddress <em>Default Value Address</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Default Value Address</em>' containment reference.
	 * @see #getDefaultValueAddress()
	 * @generated
	 */
	void setDefaultValueAddress(Address value);

	/**
	 * Returns the value of the '<em><b>Default Value Age</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * A value to use if there is no existing value in the source object. (choose any one of defaultValue*, but only one)
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Default Value Age</em>' containment reference.
	 * @see #setDefaultValueAge(Age)
	 * @see org.hl7.fhir.FhirPackage#getStructureMapSource_DefaultValueAge()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='defaultValueAge' namespace='##targetNamespace'"
	 * @generated
	 */
	Age getDefaultValueAge();

	/**
	 * Sets the value of the '{@link org.hl7.fhir.StructureMapSource#getDefaultValueAge <em>Default Value Age</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Default Value Age</em>' containment reference.
	 * @see #getDefaultValueAge()
	 * @generated
	 */
	void setDefaultValueAge(Age value);

	/**
	 * Returns the value of the '<em><b>Default Value Annotation</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * A value to use if there is no existing value in the source object. (choose any one of defaultValue*, but only one)
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Default Value Annotation</em>' containment reference.
	 * @see #setDefaultValueAnnotation(Annotation)
	 * @see org.hl7.fhir.FhirPackage#getStructureMapSource_DefaultValueAnnotation()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='defaultValueAnnotation' namespace='##targetNamespace'"
	 * @generated
	 */
	Annotation getDefaultValueAnnotation();

	/**
	 * Sets the value of the '{@link org.hl7.fhir.StructureMapSource#getDefaultValueAnnotation <em>Default Value Annotation</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Default Value Annotation</em>' containment reference.
	 * @see #getDefaultValueAnnotation()
	 * @generated
	 */
	void setDefaultValueAnnotation(Annotation value);

	/**
	 * Returns the value of the '<em><b>Default Value Attachment</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * A value to use if there is no existing value in the source object. (choose any one of defaultValue*, but only one)
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Default Value Attachment</em>' containment reference.
	 * @see #setDefaultValueAttachment(Attachment)
	 * @see org.hl7.fhir.FhirPackage#getStructureMapSource_DefaultValueAttachment()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='defaultValueAttachment' namespace='##targetNamespace'"
	 * @generated
	 */
	Attachment getDefaultValueAttachment();

	/**
	 * Sets the value of the '{@link org.hl7.fhir.StructureMapSource#getDefaultValueAttachment <em>Default Value Attachment</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Default Value Attachment</em>' containment reference.
	 * @see #getDefaultValueAttachment()
	 * @generated
	 */
	void setDefaultValueAttachment(Attachment value);

	/**
	 * Returns the value of the '<em><b>Default Value Codeable Concept</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * A value to use if there is no existing value in the source object. (choose any one of defaultValue*, but only one)
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Default Value Codeable Concept</em>' containment reference.
	 * @see #setDefaultValueCodeableConcept(CodeableConcept)
	 * @see org.hl7.fhir.FhirPackage#getStructureMapSource_DefaultValueCodeableConcept()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='defaultValueCodeableConcept' namespace='##targetNamespace'"
	 * @generated
	 */
	CodeableConcept getDefaultValueCodeableConcept();

	/**
	 * Sets the value of the '{@link org.hl7.fhir.StructureMapSource#getDefaultValueCodeableConcept <em>Default Value Codeable Concept</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Default Value Codeable Concept</em>' containment reference.
	 * @see #getDefaultValueCodeableConcept()
	 * @generated
	 */
	void setDefaultValueCodeableConcept(CodeableConcept value);

	/**
	 * Returns the value of the '<em><b>Default Value Coding</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * A value to use if there is no existing value in the source object. (choose any one of defaultValue*, but only one)
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Default Value Coding</em>' containment reference.
	 * @see #setDefaultValueCoding(Coding)
	 * @see org.hl7.fhir.FhirPackage#getStructureMapSource_DefaultValueCoding()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='defaultValueCoding' namespace='##targetNamespace'"
	 * @generated
	 */
	Coding getDefaultValueCoding();

	/**
	 * Sets the value of the '{@link org.hl7.fhir.StructureMapSource#getDefaultValueCoding <em>Default Value Coding</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Default Value Coding</em>' containment reference.
	 * @see #getDefaultValueCoding()
	 * @generated
	 */
	void setDefaultValueCoding(Coding value);

	/**
	 * Returns the value of the '<em><b>Default Value Contact Point</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * A value to use if there is no existing value in the source object. (choose any one of defaultValue*, but only one)
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Default Value Contact Point</em>' containment reference.
	 * @see #setDefaultValueContactPoint(ContactPoint)
	 * @see org.hl7.fhir.FhirPackage#getStructureMapSource_DefaultValueContactPoint()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='defaultValueContactPoint' namespace='##targetNamespace'"
	 * @generated
	 */
	ContactPoint getDefaultValueContactPoint();

	/**
	 * Sets the value of the '{@link org.hl7.fhir.StructureMapSource#getDefaultValueContactPoint <em>Default Value Contact Point</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Default Value Contact Point</em>' containment reference.
	 * @see #getDefaultValueContactPoint()
	 * @generated
	 */
	void setDefaultValueContactPoint(ContactPoint value);

	/**
	 * Returns the value of the '<em><b>Default Value Count</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * A value to use if there is no existing value in the source object. (choose any one of defaultValue*, but only one)
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Default Value Count</em>' containment reference.
	 * @see #setDefaultValueCount(Count)
	 * @see org.hl7.fhir.FhirPackage#getStructureMapSource_DefaultValueCount()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='defaultValueCount' namespace='##targetNamespace'"
	 * @generated
	 */
	Count getDefaultValueCount();

	/**
	 * Sets the value of the '{@link org.hl7.fhir.StructureMapSource#getDefaultValueCount <em>Default Value Count</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Default Value Count</em>' containment reference.
	 * @see #getDefaultValueCount()
	 * @generated
	 */
	void setDefaultValueCount(Count value);

	/**
	 * Returns the value of the '<em><b>Default Value Distance</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * A value to use if there is no existing value in the source object. (choose any one of defaultValue*, but only one)
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Default Value Distance</em>' containment reference.
	 * @see #setDefaultValueDistance(Distance)
	 * @see org.hl7.fhir.FhirPackage#getStructureMapSource_DefaultValueDistance()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='defaultValueDistance' namespace='##targetNamespace'"
	 * @generated
	 */
	Distance getDefaultValueDistance();

	/**
	 * Sets the value of the '{@link org.hl7.fhir.StructureMapSource#getDefaultValueDistance <em>Default Value Distance</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Default Value Distance</em>' containment reference.
	 * @see #getDefaultValueDistance()
	 * @generated
	 */
	void setDefaultValueDistance(Distance value);

	/**
	 * Returns the value of the '<em><b>Default Value Duration</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * A value to use if there is no existing value in the source object. (choose any one of defaultValue*, but only one)
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Default Value Duration</em>' containment reference.
	 * @see #setDefaultValueDuration(Duration)
	 * @see org.hl7.fhir.FhirPackage#getStructureMapSource_DefaultValueDuration()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='defaultValueDuration' namespace='##targetNamespace'"
	 * @generated
	 */
	Duration getDefaultValueDuration();

	/**
	 * Sets the value of the '{@link org.hl7.fhir.StructureMapSource#getDefaultValueDuration <em>Default Value Duration</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Default Value Duration</em>' containment reference.
	 * @see #getDefaultValueDuration()
	 * @generated
	 */
	void setDefaultValueDuration(Duration value);

	/**
	 * Returns the value of the '<em><b>Default Value Human Name</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * A value to use if there is no existing value in the source object. (choose any one of defaultValue*, but only one)
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Default Value Human Name</em>' containment reference.
	 * @see #setDefaultValueHumanName(HumanName)
	 * @see org.hl7.fhir.FhirPackage#getStructureMapSource_DefaultValueHumanName()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='defaultValueHumanName' namespace='##targetNamespace'"
	 * @generated
	 */
	HumanName getDefaultValueHumanName();

	/**
	 * Sets the value of the '{@link org.hl7.fhir.StructureMapSource#getDefaultValueHumanName <em>Default Value Human Name</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Default Value Human Name</em>' containment reference.
	 * @see #getDefaultValueHumanName()
	 * @generated
	 */
	void setDefaultValueHumanName(HumanName value);

	/**
	 * Returns the value of the '<em><b>Default Value Identifier</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * A value to use if there is no existing value in the source object. (choose any one of defaultValue*, but only one)
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Default Value Identifier</em>' containment reference.
	 * @see #setDefaultValueIdentifier(Identifier)
	 * @see org.hl7.fhir.FhirPackage#getStructureMapSource_DefaultValueIdentifier()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='defaultValueIdentifier' namespace='##targetNamespace'"
	 * @generated
	 */
	Identifier getDefaultValueIdentifier();

	/**
	 * Sets the value of the '{@link org.hl7.fhir.StructureMapSource#getDefaultValueIdentifier <em>Default Value Identifier</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Default Value Identifier</em>' containment reference.
	 * @see #getDefaultValueIdentifier()
	 * @generated
	 */
	void setDefaultValueIdentifier(Identifier value);

	/**
	 * Returns the value of the '<em><b>Default Value Money</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * A value to use if there is no existing value in the source object. (choose any one of defaultValue*, but only one)
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Default Value Money</em>' containment reference.
	 * @see #setDefaultValueMoney(Money)
	 * @see org.hl7.fhir.FhirPackage#getStructureMapSource_DefaultValueMoney()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='defaultValueMoney' namespace='##targetNamespace'"
	 * @generated
	 */
	Money getDefaultValueMoney();

	/**
	 * Sets the value of the '{@link org.hl7.fhir.StructureMapSource#getDefaultValueMoney <em>Default Value Money</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Default Value Money</em>' containment reference.
	 * @see #getDefaultValueMoney()
	 * @generated
	 */
	void setDefaultValueMoney(Money value);

	/**
	 * Returns the value of the '<em><b>Default Value Period</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * A value to use if there is no existing value in the source object. (choose any one of defaultValue*, but only one)
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Default Value Period</em>' containment reference.
	 * @see #setDefaultValuePeriod(Period)
	 * @see org.hl7.fhir.FhirPackage#getStructureMapSource_DefaultValuePeriod()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='defaultValuePeriod' namespace='##targetNamespace'"
	 * @generated
	 */
	Period getDefaultValuePeriod();

	/**
	 * Sets the value of the '{@link org.hl7.fhir.StructureMapSource#getDefaultValuePeriod <em>Default Value Period</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Default Value Period</em>' containment reference.
	 * @see #getDefaultValuePeriod()
	 * @generated
	 */
	void setDefaultValuePeriod(Period value);

	/**
	 * Returns the value of the '<em><b>Default Value Quantity</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * A value to use if there is no existing value in the source object. (choose any one of defaultValue*, but only one)
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Default Value Quantity</em>' containment reference.
	 * @see #setDefaultValueQuantity(Quantity)
	 * @see org.hl7.fhir.FhirPackage#getStructureMapSource_DefaultValueQuantity()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='defaultValueQuantity' namespace='##targetNamespace'"
	 * @generated
	 */
	Quantity getDefaultValueQuantity();

	/**
	 * Sets the value of the '{@link org.hl7.fhir.StructureMapSource#getDefaultValueQuantity <em>Default Value Quantity</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Default Value Quantity</em>' containment reference.
	 * @see #getDefaultValueQuantity()
	 * @generated
	 */
	void setDefaultValueQuantity(Quantity value);

	/**
	 * Returns the value of the '<em><b>Default Value Range</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * A value to use if there is no existing value in the source object. (choose any one of defaultValue*, but only one)
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Default Value Range</em>' containment reference.
	 * @see #setDefaultValueRange(Range)
	 * @see org.hl7.fhir.FhirPackage#getStructureMapSource_DefaultValueRange()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='defaultValueRange' namespace='##targetNamespace'"
	 * @generated
	 */
	Range getDefaultValueRange();

	/**
	 * Sets the value of the '{@link org.hl7.fhir.StructureMapSource#getDefaultValueRange <em>Default Value Range</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Default Value Range</em>' containment reference.
	 * @see #getDefaultValueRange()
	 * @generated
	 */
	void setDefaultValueRange(Range value);

	/**
	 * Returns the value of the '<em><b>Default Value Ratio</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * A value to use if there is no existing value in the source object. (choose any one of defaultValue*, but only one)
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Default Value Ratio</em>' containment reference.
	 * @see #setDefaultValueRatio(Ratio)
	 * @see org.hl7.fhir.FhirPackage#getStructureMapSource_DefaultValueRatio()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='defaultValueRatio' namespace='##targetNamespace'"
	 * @generated
	 */
	Ratio getDefaultValueRatio();

	/**
	 * Sets the value of the '{@link org.hl7.fhir.StructureMapSource#getDefaultValueRatio <em>Default Value Ratio</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Default Value Ratio</em>' containment reference.
	 * @see #getDefaultValueRatio()
	 * @generated
	 */
	void setDefaultValueRatio(Ratio value);

	/**
	 * Returns the value of the '<em><b>Default Value Reference</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * A value to use if there is no existing value in the source object. (choose any one of defaultValue*, but only one)
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Default Value Reference</em>' containment reference.
	 * @see #setDefaultValueReference(Reference)
	 * @see org.hl7.fhir.FhirPackage#getStructureMapSource_DefaultValueReference()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='defaultValueReference' namespace='##targetNamespace'"
	 * @generated
	 */
	Reference getDefaultValueReference();

	/**
	 * Sets the value of the '{@link org.hl7.fhir.StructureMapSource#getDefaultValueReference <em>Default Value Reference</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Default Value Reference</em>' containment reference.
	 * @see #getDefaultValueReference()
	 * @generated
	 */
	void setDefaultValueReference(Reference value);

	/**
	 * Returns the value of the '<em><b>Default Value Sampled Data</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * A value to use if there is no existing value in the source object. (choose any one of defaultValue*, but only one)
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Default Value Sampled Data</em>' containment reference.
	 * @see #setDefaultValueSampledData(SampledData)
	 * @see org.hl7.fhir.FhirPackage#getStructureMapSource_DefaultValueSampledData()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='defaultValueSampledData' namespace='##targetNamespace'"
	 * @generated
	 */
	SampledData getDefaultValueSampledData();

	/**
	 * Sets the value of the '{@link org.hl7.fhir.StructureMapSource#getDefaultValueSampledData <em>Default Value Sampled Data</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Default Value Sampled Data</em>' containment reference.
	 * @see #getDefaultValueSampledData()
	 * @generated
	 */
	void setDefaultValueSampledData(SampledData value);

	/**
	 * Returns the value of the '<em><b>Default Value Signature</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * A value to use if there is no existing value in the source object. (choose any one of defaultValue*, but only one)
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Default Value Signature</em>' containment reference.
	 * @see #setDefaultValueSignature(Signature)
	 * @see org.hl7.fhir.FhirPackage#getStructureMapSource_DefaultValueSignature()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='defaultValueSignature' namespace='##targetNamespace'"
	 * @generated
	 */
	Signature getDefaultValueSignature();

	/**
	 * Sets the value of the '{@link org.hl7.fhir.StructureMapSource#getDefaultValueSignature <em>Default Value Signature</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Default Value Signature</em>' containment reference.
	 * @see #getDefaultValueSignature()
	 * @generated
	 */
	void setDefaultValueSignature(Signature value);

	/**
	 * Returns the value of the '<em><b>Default Value Timing</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * A value to use if there is no existing value in the source object. (choose any one of defaultValue*, but only one)
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Default Value Timing</em>' containment reference.
	 * @see #setDefaultValueTiming(Timing)
	 * @see org.hl7.fhir.FhirPackage#getStructureMapSource_DefaultValueTiming()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='defaultValueTiming' namespace='##targetNamespace'"
	 * @generated
	 */
	Timing getDefaultValueTiming();

	/**
	 * Sets the value of the '{@link org.hl7.fhir.StructureMapSource#getDefaultValueTiming <em>Default Value Timing</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Default Value Timing</em>' containment reference.
	 * @see #getDefaultValueTiming()
	 * @generated
	 */
	void setDefaultValueTiming(Timing value);

	/**
	 * Returns the value of the '<em><b>Default Value Meta</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * A value to use if there is no existing value in the source object. (choose any one of defaultValue*, but only one)
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Default Value Meta</em>' containment reference.
	 * @see #setDefaultValueMeta(Meta)
	 * @see org.hl7.fhir.FhirPackage#getStructureMapSource_DefaultValueMeta()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='defaultValueMeta' namespace='##targetNamespace'"
	 * @generated
	 */
	Meta getDefaultValueMeta();

	/**
	 * Sets the value of the '{@link org.hl7.fhir.StructureMapSource#getDefaultValueMeta <em>Default Value Meta</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Default Value Meta</em>' containment reference.
	 * @see #getDefaultValueMeta()
	 * @generated
	 */
	void setDefaultValueMeta(Meta value);

	/**
	 * Returns the value of the '<em><b>Element</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Optional field for this source.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Element</em>' containment reference.
	 * @see #setElement(org.hl7.fhir.String)
	 * @see org.hl7.fhir.FhirPackage#getStructureMapSource_Element()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='element' namespace='##targetNamespace'"
	 * @generated
	 */
	org.hl7.fhir.String getElement();

	/**
	 * Sets the value of the '{@link org.hl7.fhir.StructureMapSource#getElement <em>Element</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Element</em>' containment reference.
	 * @see #getElement()
	 * @generated
	 */
	void setElement(org.hl7.fhir.String value);

	/**
	 * Returns the value of the '<em><b>List Mode</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * How to handle the list mode for this element.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>List Mode</em>' containment reference.
	 * @see #setListMode(StructureMapSourceListMode)
	 * @see org.hl7.fhir.FhirPackage#getStructureMapSource_ListMode()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='listMode' namespace='##targetNamespace'"
	 * @generated
	 */
	StructureMapSourceListMode getListMode();

	/**
	 * Sets the value of the '{@link org.hl7.fhir.StructureMapSource#getListMode <em>List Mode</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>List Mode</em>' containment reference.
	 * @see #getListMode()
	 * @generated
	 */
	void setListMode(StructureMapSourceListMode value);

	/**
	 * Returns the value of the '<em><b>Variable</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Named context for field, if a field is specified.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Variable</em>' containment reference.
	 * @see #setVariable(Id)
	 * @see org.hl7.fhir.FhirPackage#getStructureMapSource_Variable()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='variable' namespace='##targetNamespace'"
	 * @generated
	 */
	Id getVariable();

	/**
	 * Sets the value of the '{@link org.hl7.fhir.StructureMapSource#getVariable <em>Variable</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Variable</em>' containment reference.
	 * @see #getVariable()
	 * @generated
	 */
	void setVariable(Id value);

	/**
	 * Returns the value of the '<em><b>Condition</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * FHIRPath expression  - must be true or the rule does not apply.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Condition</em>' containment reference.
	 * @see #setCondition(org.hl7.fhir.String)
	 * @see org.hl7.fhir.FhirPackage#getStructureMapSource_Condition()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='condition' namespace='##targetNamespace'"
	 * @generated
	 */
	org.hl7.fhir.String getCondition();

	/**
	 * Sets the value of the '{@link org.hl7.fhir.StructureMapSource#getCondition <em>Condition</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Condition</em>' containment reference.
	 * @see #getCondition()
	 * @generated
	 */
	void setCondition(org.hl7.fhir.String value);

	/**
	 * Returns the value of the '<em><b>Check</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * FHIRPath expression  - must be true or the mapping engine throws an error instead of completing.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Check</em>' containment reference.
	 * @see #setCheck(org.hl7.fhir.String)
	 * @see org.hl7.fhir.FhirPackage#getStructureMapSource_Check()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='check' namespace='##targetNamespace'"
	 * @generated
	 */
	org.hl7.fhir.String getCheck();

	/**
	 * Sets the value of the '{@link org.hl7.fhir.StructureMapSource#getCheck <em>Check</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Check</em>' containment reference.
	 * @see #getCheck()
	 * @generated
	 */
	void setCheck(org.hl7.fhir.String value);

} // StructureMapSource
