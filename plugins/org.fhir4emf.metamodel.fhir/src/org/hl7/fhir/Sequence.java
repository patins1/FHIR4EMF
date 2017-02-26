/**
 */
package org.hl7.fhir;

import java.util.List;

import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;

import org.hl7.fhir.jaxb.SequenceImplAdapter;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Sequence</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * Raw data describing a biological sequence.
 * If the element is present, it must have either a @value, an @id, or extensions
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.hl7.fhir.Sequence#getIdentifier <em>Identifier</em>}</li>
 *   <li>{@link org.hl7.fhir.Sequence#getType <em>Type</em>}</li>
 *   <li>{@link org.hl7.fhir.Sequence#getCoordinateSystem <em>Coordinate System</em>}</li>
 *   <li>{@link org.hl7.fhir.Sequence#getPatient <em>Patient</em>}</li>
 *   <li>{@link org.hl7.fhir.Sequence#getSpecimen <em>Specimen</em>}</li>
 *   <li>{@link org.hl7.fhir.Sequence#getDevice <em>Device</em>}</li>
 *   <li>{@link org.hl7.fhir.Sequence#getPerformer <em>Performer</em>}</li>
 *   <li>{@link org.hl7.fhir.Sequence#getQuantity <em>Quantity</em>}</li>
 *   <li>{@link org.hl7.fhir.Sequence#getReferenceSeq <em>Reference Seq</em>}</li>
 *   <li>{@link org.hl7.fhir.Sequence#getVariant <em>Variant</em>}</li>
 *   <li>{@link org.hl7.fhir.Sequence#getObservedSeq <em>Observed Seq</em>}</li>
 *   <li>{@link org.hl7.fhir.Sequence#getQuality <em>Quality</em>}</li>
 *   <li>{@link org.hl7.fhir.Sequence#getReadCoverage <em>Read Coverage</em>}</li>
 *   <li>{@link org.hl7.fhir.Sequence#getRepository <em>Repository</em>}</li>
 *   <li>{@link org.hl7.fhir.Sequence#getPointer <em>Pointer</em>}</li>
 * </ul>
 *
 * @see org.hl7.fhir.FhirPackage#getSequence()
 * @model extendedMetaData="name='Sequence' kind='elementOnly'"
 * @generated
 */
@XmlJavaTypeAdapter(SequenceImplAdapter.class)
public interface Sequence extends DomainResource {
	/**
	 * Returns the value of the '<em><b>Identifier</b></em>' containment reference list.
	 * The list contents are of type {@link org.hl7.fhir.Identifier}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * A unique identifier for this particular sequence instance. This is a FHIR-defined id.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Identifier</em>' containment reference list.
	 * @see org.hl7.fhir.FhirPackage#getSequence_Identifier()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='identifier' namespace='##targetNamespace'"
	 * @generated
	 */
	List<Identifier> getIdentifier();

	/**
	 * Returns the value of the '<em><b>Type</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Amino Acid Sequence/ DNA Sequence / RNA Sequence.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Type</em>' containment reference.
	 * @see #setType(SequenceType)
	 * @see org.hl7.fhir.FhirPackage#getSequence_Type()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='type' namespace='##targetNamespace'"
	 * @generated
	 */
	SequenceType getType();

	/**
	 * Sets the value of the '{@link org.hl7.fhir.Sequence#getType <em>Type</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Type</em>' containment reference.
	 * @see #getType()
	 * @generated
	 */
	void setType(SequenceType value);

	/**
	 * Returns the value of the '<em><b>Coordinate System</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Whether the sequence is numbered starting at 0 (0-based numbering or coordinates, inclusive start, exclusive end) or starting at 1 (1-based numbering, inclusive start and inclusive end).
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Coordinate System</em>' containment reference.
	 * @see #setCoordinateSystem(org.hl7.fhir.Integer)
	 * @see org.hl7.fhir.FhirPackage#getSequence_CoordinateSystem()
	 * @model containment="true" required="true"
	 *        extendedMetaData="kind='element' name='coordinateSystem' namespace='##targetNamespace'"
	 * @generated
	 */
	org.hl7.fhir.Integer getCoordinateSystem();

	/**
	 * Sets the value of the '{@link org.hl7.fhir.Sequence#getCoordinateSystem <em>Coordinate System</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Coordinate System</em>' containment reference.
	 * @see #getCoordinateSystem()
	 * @generated
	 */
	void setCoordinateSystem(org.hl7.fhir.Integer value);

	/**
	 * Returns the value of the '<em><b>Patient</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The patient whose sequencing results are described by this resource.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Patient</em>' containment reference.
	 * @see #setPatient(Reference)
	 * @see org.hl7.fhir.FhirPackage#getSequence_Patient()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='patient' namespace='##targetNamespace'"
	 * @generated
	 */
	Reference getPatient();

	/**
	 * Sets the value of the '{@link org.hl7.fhir.Sequence#getPatient <em>Patient</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Patient</em>' containment reference.
	 * @see #getPatient()
	 * @generated
	 */
	void setPatient(Reference value);

	/**
	 * Returns the value of the '<em><b>Specimen</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Specimen used for sequencing.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Specimen</em>' containment reference.
	 * @see #setSpecimen(Reference)
	 * @see org.hl7.fhir.FhirPackage#getSequence_Specimen()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='specimen' namespace='##targetNamespace'"
	 * @generated
	 */
	Reference getSpecimen();

	/**
	 * Sets the value of the '{@link org.hl7.fhir.Sequence#getSpecimen <em>Specimen</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Specimen</em>' containment reference.
	 * @see #getSpecimen()
	 * @generated
	 */
	void setSpecimen(Reference value);

	/**
	 * Returns the value of the '<em><b>Device</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The method for sequencing, for example, chip information.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Device</em>' containment reference.
	 * @see #setDevice(Reference)
	 * @see org.hl7.fhir.FhirPackage#getSequence_Device()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='device' namespace='##targetNamespace'"
	 * @generated
	 */
	Reference getDevice();

	/**
	 * Sets the value of the '{@link org.hl7.fhir.Sequence#getDevice <em>Device</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Device</em>' containment reference.
	 * @see #getDevice()
	 * @generated
	 */
	void setDevice(Reference value);

	/**
	 * Returns the value of the '<em><b>Performer</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The organization or lab that should be responsible for this result.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Performer</em>' containment reference.
	 * @see #setPerformer(Reference)
	 * @see org.hl7.fhir.FhirPackage#getSequence_Performer()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='performer' namespace='##targetNamespace'"
	 * @generated
	 */
	Reference getPerformer();

	/**
	 * Sets the value of the '{@link org.hl7.fhir.Sequence#getPerformer <em>Performer</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Performer</em>' containment reference.
	 * @see #getPerformer()
	 * @generated
	 */
	void setPerformer(Reference value);

	/**
	 * Returns the value of the '<em><b>Quantity</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The number of copies of the seqeunce of interest. (RNASeq).
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Quantity</em>' containment reference.
	 * @see #setQuantity(Quantity)
	 * @see org.hl7.fhir.FhirPackage#getSequence_Quantity()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='quantity' namespace='##targetNamespace'"
	 * @generated
	 */
	Quantity getQuantity();

	/**
	 * Sets the value of the '{@link org.hl7.fhir.Sequence#getQuantity <em>Quantity</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Quantity</em>' containment reference.
	 * @see #getQuantity()
	 * @generated
	 */
	void setQuantity(Quantity value);

	/**
	 * Returns the value of the '<em><b>Reference Seq</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * A sequence that is used as a reference to describe variants that are present in a sequence analyzed.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Reference Seq</em>' containment reference.
	 * @see #setReferenceSeq(SequenceReferenceSeq)
	 * @see org.hl7.fhir.FhirPackage#getSequence_ReferenceSeq()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='referenceSeq' namespace='##targetNamespace'"
	 * @generated
	 */
	SequenceReferenceSeq getReferenceSeq();

	/**
	 * Sets the value of the '{@link org.hl7.fhir.Sequence#getReferenceSeq <em>Reference Seq</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Reference Seq</em>' containment reference.
	 * @see #getReferenceSeq()
	 * @generated
	 */
	void setReferenceSeq(SequenceReferenceSeq value);

	/**
	 * Returns the value of the '<em><b>Variant</b></em>' containment reference list.
	 * The list contents are of type {@link org.hl7.fhir.SequenceVariant}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The definition of variant here originates from Sequence ontology ([variant_of](http://www.sequenceontology.org/browser/current_svn/term/variant_of)). This element can represent amino acid or nucleic sequence change(including insertion,deletion,SNP,etc.)  It can represent some complex mutation or segment variation with the assist of CIGAR string.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Variant</em>' containment reference list.
	 * @see org.hl7.fhir.FhirPackage#getSequence_Variant()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='variant' namespace='##targetNamespace'"
	 * @generated
	 */
	List<SequenceVariant> getVariant();

	/**
	 * Returns the value of the '<em><b>Observed Seq</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Sequence that was observed. It is the result marked by referenceSeq along with variant records on referenceSeq. This shall starts from referenceSeq.windowStart and end by referenceSeq.windowEnd.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Observed Seq</em>' containment reference.
	 * @see #setObservedSeq(org.hl7.fhir.String)
	 * @see org.hl7.fhir.FhirPackage#getSequence_ObservedSeq()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='observedSeq' namespace='##targetNamespace'"
	 * @generated
	 */
	org.hl7.fhir.String getObservedSeq();

	/**
	 * Sets the value of the '{@link org.hl7.fhir.Sequence#getObservedSeq <em>Observed Seq</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Observed Seq</em>' containment reference.
	 * @see #getObservedSeq()
	 * @generated
	 */
	void setObservedSeq(org.hl7.fhir.String value);

	/**
	 * Returns the value of the '<em><b>Quality</b></em>' containment reference list.
	 * The list contents are of type {@link org.hl7.fhir.SequenceQuality}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * An experimental feature attribute that defines the quality of the feature in a quantitative way, such as a phred quality score ([SO:0001686](http://www.sequenceontology.org/browser/current_svn/term/SO:0001686)).
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Quality</em>' containment reference list.
	 * @see org.hl7.fhir.FhirPackage#getSequence_Quality()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='quality' namespace='##targetNamespace'"
	 * @generated
	 */
	List<SequenceQuality> getQuality();

	/**
	 * Returns the value of the '<em><b>Read Coverage</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Coverage (read depth or depth) is the average number of reads representing a given nucleotide in the reconstructed sequence.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Read Coverage</em>' containment reference.
	 * @see #setReadCoverage(org.hl7.fhir.Integer)
	 * @see org.hl7.fhir.FhirPackage#getSequence_ReadCoverage()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='readCoverage' namespace='##targetNamespace'"
	 * @generated
	 */
	org.hl7.fhir.Integer getReadCoverage();

	/**
	 * Sets the value of the '{@link org.hl7.fhir.Sequence#getReadCoverage <em>Read Coverage</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Read Coverage</em>' containment reference.
	 * @see #getReadCoverage()
	 * @generated
	 */
	void setReadCoverage(org.hl7.fhir.Integer value);

	/**
	 * Returns the value of the '<em><b>Repository</b></em>' containment reference list.
	 * The list contents are of type {@link org.hl7.fhir.SequenceRepository}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Configurations of the external repository. The repository shall store target's observedSeq or records related with target's observedSeq.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Repository</em>' containment reference list.
	 * @see org.hl7.fhir.FhirPackage#getSequence_Repository()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='repository' namespace='##targetNamespace'"
	 * @generated
	 */
	List<SequenceRepository> getRepository();

	/**
	 * Returns the value of the '<em><b>Pointer</b></em>' containment reference list.
	 * The list contents are of type {@link org.hl7.fhir.Reference}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Pointer to next atomic sequence which at most contains one variant.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Pointer</em>' containment reference list.
	 * @see org.hl7.fhir.FhirPackage#getSequence_Pointer()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='pointer' namespace='##targetNamespace'"
	 * @generated
	 */
	List<Reference> getPointer();

} // Sequence
