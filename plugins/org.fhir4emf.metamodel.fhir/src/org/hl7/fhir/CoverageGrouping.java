/**
 */
package org.hl7.fhir;

import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;

import org.hl7.fhir.jaxb.CoverageGroupingImplAdapter;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Coverage Grouping</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * Financial instrument which may be used to reimburse or pay for health care products and services.
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.hl7.fhir.CoverageGrouping#getGroup <em>Group</em>}</li>
 *   <li>{@link org.hl7.fhir.CoverageGrouping#getGroupDisplay <em>Group Display</em>}</li>
 *   <li>{@link org.hl7.fhir.CoverageGrouping#getSubGroup <em>Sub Group</em>}</li>
 *   <li>{@link org.hl7.fhir.CoverageGrouping#getSubGroupDisplay <em>Sub Group Display</em>}</li>
 *   <li>{@link org.hl7.fhir.CoverageGrouping#getPlan <em>Plan</em>}</li>
 *   <li>{@link org.hl7.fhir.CoverageGrouping#getPlanDisplay <em>Plan Display</em>}</li>
 *   <li>{@link org.hl7.fhir.CoverageGrouping#getSubPlan <em>Sub Plan</em>}</li>
 *   <li>{@link org.hl7.fhir.CoverageGrouping#getSubPlanDisplay <em>Sub Plan Display</em>}</li>
 *   <li>{@link org.hl7.fhir.CoverageGrouping#getClass_ <em>Class</em>}</li>
 *   <li>{@link org.hl7.fhir.CoverageGrouping#getClassDisplay <em>Class Display</em>}</li>
 *   <li>{@link org.hl7.fhir.CoverageGrouping#getSubClass <em>Sub Class</em>}</li>
 *   <li>{@link org.hl7.fhir.CoverageGrouping#getSubClassDisplay <em>Sub Class Display</em>}</li>
 * </ul>
 *
 * @see org.hl7.fhir.FhirPackage#getCoverageGrouping()
 * @model extendedMetaData="name='Coverage.Grouping' kind='elementOnly'"
 * @generated
 */
@XmlJavaTypeAdapter(CoverageGroupingImplAdapter.class)
public interface CoverageGrouping extends BackboneElement {
	/**
	 * Returns the value of the '<em><b>Group</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Identifies a style or collective of coverage issued by the underwriter, for example may be used to identify an employer group. May also be referred to as a Policy or Group ID.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Group</em>' containment reference.
	 * @see #setGroup(org.hl7.fhir.String)
	 * @see org.hl7.fhir.FhirPackage#getCoverageGrouping_Group()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='group' namespace='##targetNamespace'"
	 * @generated
	 */
	org.hl7.fhir.String getGroup();

	/**
	 * Sets the value of the '{@link org.hl7.fhir.CoverageGrouping#getGroup <em>Group</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Group</em>' containment reference.
	 * @see #getGroup()
	 * @generated
	 */
	void setGroup(org.hl7.fhir.String value);

	/**
	 * Returns the value of the '<em><b>Group Display</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * A short description for the group.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Group Display</em>' containment reference.
	 * @see #setGroupDisplay(org.hl7.fhir.String)
	 * @see org.hl7.fhir.FhirPackage#getCoverageGrouping_GroupDisplay()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='groupDisplay' namespace='##targetNamespace'"
	 * @generated
	 */
	org.hl7.fhir.String getGroupDisplay();

	/**
	 * Sets the value of the '{@link org.hl7.fhir.CoverageGrouping#getGroupDisplay <em>Group Display</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Group Display</em>' containment reference.
	 * @see #getGroupDisplay()
	 * @generated
	 */
	void setGroupDisplay(org.hl7.fhir.String value);

	/**
	 * Returns the value of the '<em><b>Sub Group</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Identifies a style or collective of coverage issued by the underwriter, for example may be used to identify a subset of an employer group.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Sub Group</em>' containment reference.
	 * @see #setSubGroup(org.hl7.fhir.String)
	 * @see org.hl7.fhir.FhirPackage#getCoverageGrouping_SubGroup()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='subGroup' namespace='##targetNamespace'"
	 * @generated
	 */
	org.hl7.fhir.String getSubGroup();

	/**
	 * Sets the value of the '{@link org.hl7.fhir.CoverageGrouping#getSubGroup <em>Sub Group</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Sub Group</em>' containment reference.
	 * @see #getSubGroup()
	 * @generated
	 */
	void setSubGroup(org.hl7.fhir.String value);

	/**
	 * Returns the value of the '<em><b>Sub Group Display</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * A short description for the subgroup.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Sub Group Display</em>' containment reference.
	 * @see #setSubGroupDisplay(org.hl7.fhir.String)
	 * @see org.hl7.fhir.FhirPackage#getCoverageGrouping_SubGroupDisplay()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='subGroupDisplay' namespace='##targetNamespace'"
	 * @generated
	 */
	org.hl7.fhir.String getSubGroupDisplay();

	/**
	 * Sets the value of the '{@link org.hl7.fhir.CoverageGrouping#getSubGroupDisplay <em>Sub Group Display</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Sub Group Display</em>' containment reference.
	 * @see #getSubGroupDisplay()
	 * @generated
	 */
	void setSubGroupDisplay(org.hl7.fhir.String value);

	/**
	 * Returns the value of the '<em><b>Plan</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Identifies a style or collective of coverage issued by the underwriter, for example may be used to identify a collection of benefits provided to employees. May be referred to as a Section or Division ID.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Plan</em>' containment reference.
	 * @see #setPlan(org.hl7.fhir.String)
	 * @see org.hl7.fhir.FhirPackage#getCoverageGrouping_Plan()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='plan' namespace='##targetNamespace'"
	 * @generated
	 */
	org.hl7.fhir.String getPlan();

	/**
	 * Sets the value of the '{@link org.hl7.fhir.CoverageGrouping#getPlan <em>Plan</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Plan</em>' containment reference.
	 * @see #getPlan()
	 * @generated
	 */
	void setPlan(org.hl7.fhir.String value);

	/**
	 * Returns the value of the '<em><b>Plan Display</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * A short description for the plan.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Plan Display</em>' containment reference.
	 * @see #setPlanDisplay(org.hl7.fhir.String)
	 * @see org.hl7.fhir.FhirPackage#getCoverageGrouping_PlanDisplay()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='planDisplay' namespace='##targetNamespace'"
	 * @generated
	 */
	org.hl7.fhir.String getPlanDisplay();

	/**
	 * Sets the value of the '{@link org.hl7.fhir.CoverageGrouping#getPlanDisplay <em>Plan Display</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Plan Display</em>' containment reference.
	 * @see #getPlanDisplay()
	 * @generated
	 */
	void setPlanDisplay(org.hl7.fhir.String value);

	/**
	 * Returns the value of the '<em><b>Sub Plan</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Identifies a sub-style or sub-collective of coverage issued by the underwriter, for example may be used to identify a subset of a collection of benefits provided to employees.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Sub Plan</em>' containment reference.
	 * @see #setSubPlan(org.hl7.fhir.String)
	 * @see org.hl7.fhir.FhirPackage#getCoverageGrouping_SubPlan()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='subPlan' namespace='##targetNamespace'"
	 * @generated
	 */
	org.hl7.fhir.String getSubPlan();

	/**
	 * Sets the value of the '{@link org.hl7.fhir.CoverageGrouping#getSubPlan <em>Sub Plan</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Sub Plan</em>' containment reference.
	 * @see #getSubPlan()
	 * @generated
	 */
	void setSubPlan(org.hl7.fhir.String value);

	/**
	 * Returns the value of the '<em><b>Sub Plan Display</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * A short description for the subplan.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Sub Plan Display</em>' containment reference.
	 * @see #setSubPlanDisplay(org.hl7.fhir.String)
	 * @see org.hl7.fhir.FhirPackage#getCoverageGrouping_SubPlanDisplay()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='subPlanDisplay' namespace='##targetNamespace'"
	 * @generated
	 */
	org.hl7.fhir.String getSubPlanDisplay();

	/**
	 * Sets the value of the '{@link org.hl7.fhir.CoverageGrouping#getSubPlanDisplay <em>Sub Plan Display</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Sub Plan Display</em>' containment reference.
	 * @see #getSubPlanDisplay()
	 * @generated
	 */
	void setSubPlanDisplay(org.hl7.fhir.String value);

	/**
	 * Returns the value of the '<em><b>Class</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Identifies a style or collective of coverage issues by the underwriter, for example may be used to identify a class of coverage such as a level of deductables or co-payment.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Class</em>' containment reference.
	 * @see #setClass(org.hl7.fhir.String)
	 * @see org.hl7.fhir.FhirPackage#getCoverageGrouping_Class()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='class' namespace='##targetNamespace'"
	 * @generated
	 */
	org.hl7.fhir.String getClass_();

	/**
	 * Sets the value of the '{@link org.hl7.fhir.CoverageGrouping#getClass_ <em>Class</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Class</em>' containment reference.
	 * @see #getClass_()
	 * @generated
	 */
	void setClass(org.hl7.fhir.String value);

	/**
	 * Returns the value of the '<em><b>Class Display</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * A short description for the class.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Class Display</em>' containment reference.
	 * @see #setClassDisplay(org.hl7.fhir.String)
	 * @see org.hl7.fhir.FhirPackage#getCoverageGrouping_ClassDisplay()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='classDisplay' namespace='##targetNamespace'"
	 * @generated
	 */
	org.hl7.fhir.String getClassDisplay();

	/**
	 * Sets the value of the '{@link org.hl7.fhir.CoverageGrouping#getClassDisplay <em>Class Display</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Class Display</em>' containment reference.
	 * @see #getClassDisplay()
	 * @generated
	 */
	void setClassDisplay(org.hl7.fhir.String value);

	/**
	 * Returns the value of the '<em><b>Sub Class</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Identifies a sub-style or sub-collective of coverage issues by the underwriter, for example may be used to identify a subclass of coverage such as a sub-level of deductables or co-payment.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Sub Class</em>' containment reference.
	 * @see #setSubClass(org.hl7.fhir.String)
	 * @see org.hl7.fhir.FhirPackage#getCoverageGrouping_SubClass()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='subClass' namespace='##targetNamespace'"
	 * @generated
	 */
	org.hl7.fhir.String getSubClass();

	/**
	 * Sets the value of the '{@link org.hl7.fhir.CoverageGrouping#getSubClass <em>Sub Class</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Sub Class</em>' containment reference.
	 * @see #getSubClass()
	 * @generated
	 */
	void setSubClass(org.hl7.fhir.String value);

	/**
	 * Returns the value of the '<em><b>Sub Class Display</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * A short description for the subclass.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Sub Class Display</em>' containment reference.
	 * @see #setSubClassDisplay(org.hl7.fhir.String)
	 * @see org.hl7.fhir.FhirPackage#getCoverageGrouping_SubClassDisplay()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='subClassDisplay' namespace='##targetNamespace'"
	 * @generated
	 */
	org.hl7.fhir.String getSubClassDisplay();

	/**
	 * Sets the value of the '{@link org.hl7.fhir.CoverageGrouping#getSubClassDisplay <em>Sub Class Display</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Sub Class Display</em>' containment reference.
	 * @see #getSubClassDisplay()
	 * @generated
	 */
	void setSubClassDisplay(org.hl7.fhir.String value);

} // CoverageGrouping
