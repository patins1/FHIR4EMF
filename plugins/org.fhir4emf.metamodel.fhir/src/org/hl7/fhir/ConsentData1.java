/**
 */
package org.hl7.fhir;

import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;

import org.hl7.fhir.jaxb.ConsentData1ImplAdapter;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Consent Data1</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * A record of a healthcare consumer’s policy choices, which permits or denies identified recipient(s) or recipient role(s) to perform one or more actions within a given policy context, for specific purposes and periods of time.
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.hl7.fhir.ConsentData1#getMeaning <em>Meaning</em>}</li>
 *   <li>{@link org.hl7.fhir.ConsentData1#getReference <em>Reference</em>}</li>
 * </ul>
 *
 * @see org.hl7.fhir.FhirPackage#getConsentData1()
 * @model extendedMetaData="name='Consent.Data1' kind='elementOnly'"
 * @generated
 */
@XmlJavaTypeAdapter(ConsentData1ImplAdapter.class)
public interface ConsentData1 extends BackboneElement {
	/**
	 * Returns the value of the '<em><b>Meaning</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * How the resource reference is interpreted when testing consent restrictions.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Meaning</em>' containment reference.
	 * @see #setMeaning(ConsentDataMeaning)
	 * @see org.hl7.fhir.FhirPackage#getConsentData1_Meaning()
	 * @model containment="true" required="true"
	 *        extendedMetaData="kind='element' name='meaning' namespace='##targetNamespace'"
	 * @generated
	 */
	ConsentDataMeaning getMeaning();

	/**
	 * Sets the value of the '{@link org.hl7.fhir.ConsentData1#getMeaning <em>Meaning</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Meaning</em>' containment reference.
	 * @see #getMeaning()
	 * @generated
	 */
	void setMeaning(ConsentDataMeaning value);

	/**
	 * Returns the value of the '<em><b>Reference</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * A reference to a specific resource that defines which resources are covered by this consent.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Reference</em>' containment reference.
	 * @see #setReference(Reference)
	 * @see org.hl7.fhir.FhirPackage#getConsentData1_Reference()
	 * @model containment="true" required="true"
	 *        extendedMetaData="kind='element' name='reference' namespace='##targetNamespace'"
	 * @generated
	 */
	Reference getReference();

	/**
	 * Sets the value of the '{@link org.hl7.fhir.ConsentData1#getReference <em>Reference</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Reference</em>' containment reference.
	 * @see #getReference()
	 * @generated
	 */
	void setReference(Reference value);

} // ConsentData1
