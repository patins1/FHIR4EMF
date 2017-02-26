/**
 */
package org.hl7.fhir;

import java.util.List;

import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;

import org.hl7.fhir.jaxb.ValueSetComposeImplAdapter;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Value Set Compose</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * A value set specifies a set of codes drawn from one or more code systems.
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.hl7.fhir.ValueSetCompose#getLockedDate <em>Locked Date</em>}</li>
 *   <li>{@link org.hl7.fhir.ValueSetCompose#getInactive <em>Inactive</em>}</li>
 *   <li>{@link org.hl7.fhir.ValueSetCompose#getInclude <em>Include</em>}</li>
 *   <li>{@link org.hl7.fhir.ValueSetCompose#getExclude <em>Exclude</em>}</li>
 * </ul>
 *
 * @see org.hl7.fhir.FhirPackage#getValueSetCompose()
 * @model extendedMetaData="name='ValueSet.Compose' kind='elementOnly'"
 * @generated
 */
@XmlJavaTypeAdapter(ValueSetComposeImplAdapter.class)
public interface ValueSetCompose extends BackboneElement {
	/**
	 * Returns the value of the '<em><b>Locked Date</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * If a locked date is defined, then the Content Logical Definition must be evaluated using the current version as of the locked date for referenced code system(s) and value set instances where ValueSet.compose.include.version is not defined.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Locked Date</em>' containment reference.
	 * @see #setLockedDate(Date)
	 * @see org.hl7.fhir.FhirPackage#getValueSetCompose_LockedDate()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='lockedDate' namespace='##targetNamespace'"
	 * @generated
	 */
	Date getLockedDate();

	/**
	 * Sets the value of the '{@link org.hl7.fhir.ValueSetCompose#getLockedDate <em>Locked Date</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Locked Date</em>' containment reference.
	 * @see #getLockedDate()
	 * @generated
	 */
	void setLockedDate(Date value);

	/**
	 * Returns the value of the '<em><b>Inactive</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Whether inactive codes - codes that are not approved for current use - are in the value set. If inactive = true, inactive codes are to be included in the expansion, if inactive = false, the inactive codes will not be included in the expansion. If absent, the behavior is determined by the implementation, or by the applicable ExpansionProfile (but generally, inactive codes would be expected to be included).
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Inactive</em>' containment reference.
	 * @see #setInactive(org.hl7.fhir.Boolean)
	 * @see org.hl7.fhir.FhirPackage#getValueSetCompose_Inactive()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='inactive' namespace='##targetNamespace'"
	 * @generated
	 */
	org.hl7.fhir.Boolean getInactive();

	/**
	 * Sets the value of the '{@link org.hl7.fhir.ValueSetCompose#getInactive <em>Inactive</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Inactive</em>' containment reference.
	 * @see #getInactive()
	 * @generated
	 */
	void setInactive(org.hl7.fhir.Boolean value);

	/**
	 * Returns the value of the '<em><b>Include</b></em>' containment reference list.
	 * The list contents are of type {@link org.hl7.fhir.ValueSetInclude}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Include one or more codes from a code system or other value set(s).
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Include</em>' containment reference list.
	 * @see org.hl7.fhir.FhirPackage#getValueSetCompose_Include()
	 * @model containment="true" required="true"
	 *        extendedMetaData="kind='element' name='include' namespace='##targetNamespace'"
	 * @generated
	 */
	List<ValueSetInclude> getInclude();

	/**
	 * Returns the value of the '<em><b>Exclude</b></em>' containment reference list.
	 * The list contents are of type {@link org.hl7.fhir.ValueSetInclude}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Exclude one or more codes from the value set based on code system filters and/or other value sets.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Exclude</em>' containment reference list.
	 * @see org.hl7.fhir.FhirPackage#getValueSetCompose_Exclude()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='exclude' namespace='##targetNamespace'"
	 * @generated
	 */
	List<ValueSetInclude> getExclude();

} // ValueSetCompose
