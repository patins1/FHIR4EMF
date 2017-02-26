/**
 */
package org.hl7.fhir.impl;

import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;
import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.hl7.fhir.CoverageGrouping;
import org.hl7.fhir.FhirPackage;
import org.hl7.fhir.jaxb.StringImplAdapter;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Coverage Grouping</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.hl7.fhir.impl.CoverageGroupingImpl#getGroup <em>Group</em>}</li>
 *   <li>{@link org.hl7.fhir.impl.CoverageGroupingImpl#getGroupDisplay <em>Group Display</em>}</li>
 *   <li>{@link org.hl7.fhir.impl.CoverageGroupingImpl#getSubGroup <em>Sub Group</em>}</li>
 *   <li>{@link org.hl7.fhir.impl.CoverageGroupingImpl#getSubGroupDisplay <em>Sub Group Display</em>}</li>
 *   <li>{@link org.hl7.fhir.impl.CoverageGroupingImpl#getPlan <em>Plan</em>}</li>
 *   <li>{@link org.hl7.fhir.impl.CoverageGroupingImpl#getPlanDisplay <em>Plan Display</em>}</li>
 *   <li>{@link org.hl7.fhir.impl.CoverageGroupingImpl#getSubPlan <em>Sub Plan</em>}</li>
 *   <li>{@link org.hl7.fhir.impl.CoverageGroupingImpl#getSubPlanDisplay <em>Sub Plan Display</em>}</li>
 *   <li>{@link org.hl7.fhir.impl.CoverageGroupingImpl#getClass_ <em>Class</em>}</li>
 *   <li>{@link org.hl7.fhir.impl.CoverageGroupingImpl#getClassDisplay <em>Class Display</em>}</li>
 *   <li>{@link org.hl7.fhir.impl.CoverageGroupingImpl#getSubClass <em>Sub Class</em>}</li>
 *   <li>{@link org.hl7.fhir.impl.CoverageGroupingImpl#getSubClassDisplay <em>Sub Class Display</em>}</li>
 * </ul>
 *
 * @generated
 */
@XmlType(name = "CoverageGrouping", namespace = "http://hl7.org/fhir")
@XmlRootElement(name = "fhir.CoverageGrouping")
public class CoverageGroupingImpl extends BackboneElementImpl implements CoverageGrouping {
	/**
	 * The cached value of the '{@link #getGroup() <em>Group</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getGroup()
	 * @generated
	 * @ordered
	 */
	protected org.hl7.fhir.String group;

	/**
	 * The cached value of the '{@link #getGroupDisplay() <em>Group Display</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getGroupDisplay()
	 * @generated
	 * @ordered
	 */
	protected org.hl7.fhir.String groupDisplay;

	/**
	 * The cached value of the '{@link #getSubGroup() <em>Sub Group</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSubGroup()
	 * @generated
	 * @ordered
	 */
	protected org.hl7.fhir.String subGroup;

	/**
	 * The cached value of the '{@link #getSubGroupDisplay() <em>Sub Group Display</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSubGroupDisplay()
	 * @generated
	 * @ordered
	 */
	protected org.hl7.fhir.String subGroupDisplay;

	/**
	 * The cached value of the '{@link #getPlan() <em>Plan</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPlan()
	 * @generated
	 * @ordered
	 */
	protected org.hl7.fhir.String plan;

	/**
	 * The cached value of the '{@link #getPlanDisplay() <em>Plan Display</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPlanDisplay()
	 * @generated
	 * @ordered
	 */
	protected org.hl7.fhir.String planDisplay;

	/**
	 * The cached value of the '{@link #getSubPlan() <em>Sub Plan</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSubPlan()
	 * @generated
	 * @ordered
	 */
	protected org.hl7.fhir.String subPlan;

	/**
	 * The cached value of the '{@link #getSubPlanDisplay() <em>Sub Plan Display</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSubPlanDisplay()
	 * @generated
	 * @ordered
	 */
	protected org.hl7.fhir.String subPlanDisplay;

	/**
	 * The cached value of the '{@link #getClass_() <em>Class</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getClass_()
	 * @generated
	 * @ordered
	 */
	protected org.hl7.fhir.String class_;

	/**
	 * The cached value of the '{@link #getClassDisplay() <em>Class Display</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getClassDisplay()
	 * @generated
	 * @ordered
	 */
	protected org.hl7.fhir.String classDisplay;

	/**
	 * The cached value of the '{@link #getSubClass() <em>Sub Class</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSubClass()
	 * @generated
	 * @ordered
	 */
	protected org.hl7.fhir.String subClass;

	/**
	 * The cached value of the '{@link #getSubClassDisplay() <em>Sub Class Display</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSubClassDisplay()
	 * @generated
	 * @ordered
	 */
	protected org.hl7.fhir.String subClassDisplay;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected CoverageGroupingImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return FhirPackage.eINSTANCE.getCoverageGrouping();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@XmlJavaTypeAdapter(StringImplAdapter.class)
	public org.hl7.fhir.String getGroup() {
		return group;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetGroup(org.hl7.fhir.String newGroup, NotificationChain msgs) {
		org.hl7.fhir.String oldGroup = group;
		group = newGroup;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FhirPackage.COVERAGE_GROUPING__GROUP, oldGroup, newGroup);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setGroup(org.hl7.fhir.String newGroup) {
		if (newGroup != group) {
			NotificationChain msgs = null;
			if (group != null)
				msgs = ((InternalEObject)group).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FhirPackage.COVERAGE_GROUPING__GROUP, null, msgs);
			if (newGroup != null)
				msgs = ((InternalEObject)newGroup).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FhirPackage.COVERAGE_GROUPING__GROUP, null, msgs);
			msgs = basicSetGroup(newGroup, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FhirPackage.COVERAGE_GROUPING__GROUP, newGroup, newGroup));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@XmlJavaTypeAdapter(StringImplAdapter.class)
	public org.hl7.fhir.String getGroupDisplay() {
		return groupDisplay;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetGroupDisplay(org.hl7.fhir.String newGroupDisplay, NotificationChain msgs) {
		org.hl7.fhir.String oldGroupDisplay = groupDisplay;
		groupDisplay = newGroupDisplay;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FhirPackage.COVERAGE_GROUPING__GROUP_DISPLAY, oldGroupDisplay, newGroupDisplay);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setGroupDisplay(org.hl7.fhir.String newGroupDisplay) {
		if (newGroupDisplay != groupDisplay) {
			NotificationChain msgs = null;
			if (groupDisplay != null)
				msgs = ((InternalEObject)groupDisplay).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FhirPackage.COVERAGE_GROUPING__GROUP_DISPLAY, null, msgs);
			if (newGroupDisplay != null)
				msgs = ((InternalEObject)newGroupDisplay).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FhirPackage.COVERAGE_GROUPING__GROUP_DISPLAY, null, msgs);
			msgs = basicSetGroupDisplay(newGroupDisplay, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FhirPackage.COVERAGE_GROUPING__GROUP_DISPLAY, newGroupDisplay, newGroupDisplay));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@XmlJavaTypeAdapter(StringImplAdapter.class)
	public org.hl7.fhir.String getSubGroup() {
		return subGroup;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetSubGroup(org.hl7.fhir.String newSubGroup, NotificationChain msgs) {
		org.hl7.fhir.String oldSubGroup = subGroup;
		subGroup = newSubGroup;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FhirPackage.COVERAGE_GROUPING__SUB_GROUP, oldSubGroup, newSubGroup);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setSubGroup(org.hl7.fhir.String newSubGroup) {
		if (newSubGroup != subGroup) {
			NotificationChain msgs = null;
			if (subGroup != null)
				msgs = ((InternalEObject)subGroup).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FhirPackage.COVERAGE_GROUPING__SUB_GROUP, null, msgs);
			if (newSubGroup != null)
				msgs = ((InternalEObject)newSubGroup).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FhirPackage.COVERAGE_GROUPING__SUB_GROUP, null, msgs);
			msgs = basicSetSubGroup(newSubGroup, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FhirPackage.COVERAGE_GROUPING__SUB_GROUP, newSubGroup, newSubGroup));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@XmlJavaTypeAdapter(StringImplAdapter.class)
	public org.hl7.fhir.String getSubGroupDisplay() {
		return subGroupDisplay;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetSubGroupDisplay(org.hl7.fhir.String newSubGroupDisplay, NotificationChain msgs) {
		org.hl7.fhir.String oldSubGroupDisplay = subGroupDisplay;
		subGroupDisplay = newSubGroupDisplay;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FhirPackage.COVERAGE_GROUPING__SUB_GROUP_DISPLAY, oldSubGroupDisplay, newSubGroupDisplay);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setSubGroupDisplay(org.hl7.fhir.String newSubGroupDisplay) {
		if (newSubGroupDisplay != subGroupDisplay) {
			NotificationChain msgs = null;
			if (subGroupDisplay != null)
				msgs = ((InternalEObject)subGroupDisplay).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FhirPackage.COVERAGE_GROUPING__SUB_GROUP_DISPLAY, null, msgs);
			if (newSubGroupDisplay != null)
				msgs = ((InternalEObject)newSubGroupDisplay).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FhirPackage.COVERAGE_GROUPING__SUB_GROUP_DISPLAY, null, msgs);
			msgs = basicSetSubGroupDisplay(newSubGroupDisplay, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FhirPackage.COVERAGE_GROUPING__SUB_GROUP_DISPLAY, newSubGroupDisplay, newSubGroupDisplay));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@XmlJavaTypeAdapter(StringImplAdapter.class)
	public org.hl7.fhir.String getPlan() {
		return plan;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetPlan(org.hl7.fhir.String newPlan, NotificationChain msgs) {
		org.hl7.fhir.String oldPlan = plan;
		plan = newPlan;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FhirPackage.COVERAGE_GROUPING__PLAN, oldPlan, newPlan);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setPlan(org.hl7.fhir.String newPlan) {
		if (newPlan != plan) {
			NotificationChain msgs = null;
			if (plan != null)
				msgs = ((InternalEObject)plan).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FhirPackage.COVERAGE_GROUPING__PLAN, null, msgs);
			if (newPlan != null)
				msgs = ((InternalEObject)newPlan).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FhirPackage.COVERAGE_GROUPING__PLAN, null, msgs);
			msgs = basicSetPlan(newPlan, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FhirPackage.COVERAGE_GROUPING__PLAN, newPlan, newPlan));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@XmlJavaTypeAdapter(StringImplAdapter.class)
	public org.hl7.fhir.String getPlanDisplay() {
		return planDisplay;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetPlanDisplay(org.hl7.fhir.String newPlanDisplay, NotificationChain msgs) {
		org.hl7.fhir.String oldPlanDisplay = planDisplay;
		planDisplay = newPlanDisplay;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FhirPackage.COVERAGE_GROUPING__PLAN_DISPLAY, oldPlanDisplay, newPlanDisplay);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setPlanDisplay(org.hl7.fhir.String newPlanDisplay) {
		if (newPlanDisplay != planDisplay) {
			NotificationChain msgs = null;
			if (planDisplay != null)
				msgs = ((InternalEObject)planDisplay).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FhirPackage.COVERAGE_GROUPING__PLAN_DISPLAY, null, msgs);
			if (newPlanDisplay != null)
				msgs = ((InternalEObject)newPlanDisplay).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FhirPackage.COVERAGE_GROUPING__PLAN_DISPLAY, null, msgs);
			msgs = basicSetPlanDisplay(newPlanDisplay, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FhirPackage.COVERAGE_GROUPING__PLAN_DISPLAY, newPlanDisplay, newPlanDisplay));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@XmlJavaTypeAdapter(StringImplAdapter.class)
	public org.hl7.fhir.String getSubPlan() {
		return subPlan;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetSubPlan(org.hl7.fhir.String newSubPlan, NotificationChain msgs) {
		org.hl7.fhir.String oldSubPlan = subPlan;
		subPlan = newSubPlan;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FhirPackage.COVERAGE_GROUPING__SUB_PLAN, oldSubPlan, newSubPlan);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setSubPlan(org.hl7.fhir.String newSubPlan) {
		if (newSubPlan != subPlan) {
			NotificationChain msgs = null;
			if (subPlan != null)
				msgs = ((InternalEObject)subPlan).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FhirPackage.COVERAGE_GROUPING__SUB_PLAN, null, msgs);
			if (newSubPlan != null)
				msgs = ((InternalEObject)newSubPlan).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FhirPackage.COVERAGE_GROUPING__SUB_PLAN, null, msgs);
			msgs = basicSetSubPlan(newSubPlan, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FhirPackage.COVERAGE_GROUPING__SUB_PLAN, newSubPlan, newSubPlan));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@XmlJavaTypeAdapter(StringImplAdapter.class)
	public org.hl7.fhir.String getSubPlanDisplay() {
		return subPlanDisplay;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetSubPlanDisplay(org.hl7.fhir.String newSubPlanDisplay, NotificationChain msgs) {
		org.hl7.fhir.String oldSubPlanDisplay = subPlanDisplay;
		subPlanDisplay = newSubPlanDisplay;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FhirPackage.COVERAGE_GROUPING__SUB_PLAN_DISPLAY, oldSubPlanDisplay, newSubPlanDisplay);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setSubPlanDisplay(org.hl7.fhir.String newSubPlanDisplay) {
		if (newSubPlanDisplay != subPlanDisplay) {
			NotificationChain msgs = null;
			if (subPlanDisplay != null)
				msgs = ((InternalEObject)subPlanDisplay).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FhirPackage.COVERAGE_GROUPING__SUB_PLAN_DISPLAY, null, msgs);
			if (newSubPlanDisplay != null)
				msgs = ((InternalEObject)newSubPlanDisplay).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FhirPackage.COVERAGE_GROUPING__SUB_PLAN_DISPLAY, null, msgs);
			msgs = basicSetSubPlanDisplay(newSubPlanDisplay, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FhirPackage.COVERAGE_GROUPING__SUB_PLAN_DISPLAY, newSubPlanDisplay, newSubPlanDisplay));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public org.hl7.fhir.String getClass_() {
		return class_;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetClass(org.hl7.fhir.String newClass, NotificationChain msgs) {
		org.hl7.fhir.String oldClass = class_;
		class_ = newClass;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FhirPackage.COVERAGE_GROUPING__CLASS, oldClass, newClass);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setClass(org.hl7.fhir.String newClass) {
		if (newClass != class_) {
			NotificationChain msgs = null;
			if (class_ != null)
				msgs = ((InternalEObject)class_).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FhirPackage.COVERAGE_GROUPING__CLASS, null, msgs);
			if (newClass != null)
				msgs = ((InternalEObject)newClass).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FhirPackage.COVERAGE_GROUPING__CLASS, null, msgs);
			msgs = basicSetClass(newClass, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FhirPackage.COVERAGE_GROUPING__CLASS, newClass, newClass));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@XmlJavaTypeAdapter(StringImplAdapter.class)
	public org.hl7.fhir.String getClassDisplay() {
		return classDisplay;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetClassDisplay(org.hl7.fhir.String newClassDisplay, NotificationChain msgs) {
		org.hl7.fhir.String oldClassDisplay = classDisplay;
		classDisplay = newClassDisplay;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FhirPackage.COVERAGE_GROUPING__CLASS_DISPLAY, oldClassDisplay, newClassDisplay);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setClassDisplay(org.hl7.fhir.String newClassDisplay) {
		if (newClassDisplay != classDisplay) {
			NotificationChain msgs = null;
			if (classDisplay != null)
				msgs = ((InternalEObject)classDisplay).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FhirPackage.COVERAGE_GROUPING__CLASS_DISPLAY, null, msgs);
			if (newClassDisplay != null)
				msgs = ((InternalEObject)newClassDisplay).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FhirPackage.COVERAGE_GROUPING__CLASS_DISPLAY, null, msgs);
			msgs = basicSetClassDisplay(newClassDisplay, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FhirPackage.COVERAGE_GROUPING__CLASS_DISPLAY, newClassDisplay, newClassDisplay));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@XmlJavaTypeAdapter(StringImplAdapter.class)
	public org.hl7.fhir.String getSubClass() {
		return subClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetSubClass(org.hl7.fhir.String newSubClass, NotificationChain msgs) {
		org.hl7.fhir.String oldSubClass = subClass;
		subClass = newSubClass;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FhirPackage.COVERAGE_GROUPING__SUB_CLASS, oldSubClass, newSubClass);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setSubClass(org.hl7.fhir.String newSubClass) {
		if (newSubClass != subClass) {
			NotificationChain msgs = null;
			if (subClass != null)
				msgs = ((InternalEObject)subClass).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FhirPackage.COVERAGE_GROUPING__SUB_CLASS, null, msgs);
			if (newSubClass != null)
				msgs = ((InternalEObject)newSubClass).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FhirPackage.COVERAGE_GROUPING__SUB_CLASS, null, msgs);
			msgs = basicSetSubClass(newSubClass, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FhirPackage.COVERAGE_GROUPING__SUB_CLASS, newSubClass, newSubClass));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@XmlJavaTypeAdapter(StringImplAdapter.class)
	public org.hl7.fhir.String getSubClassDisplay() {
		return subClassDisplay;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetSubClassDisplay(org.hl7.fhir.String newSubClassDisplay, NotificationChain msgs) {
		org.hl7.fhir.String oldSubClassDisplay = subClassDisplay;
		subClassDisplay = newSubClassDisplay;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FhirPackage.COVERAGE_GROUPING__SUB_CLASS_DISPLAY, oldSubClassDisplay, newSubClassDisplay);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setSubClassDisplay(org.hl7.fhir.String newSubClassDisplay) {
		if (newSubClassDisplay != subClassDisplay) {
			NotificationChain msgs = null;
			if (subClassDisplay != null)
				msgs = ((InternalEObject)subClassDisplay).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FhirPackage.COVERAGE_GROUPING__SUB_CLASS_DISPLAY, null, msgs);
			if (newSubClassDisplay != null)
				msgs = ((InternalEObject)newSubClassDisplay).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FhirPackage.COVERAGE_GROUPING__SUB_CLASS_DISPLAY, null, msgs);
			msgs = basicSetSubClassDisplay(newSubClassDisplay, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FhirPackage.COVERAGE_GROUPING__SUB_CLASS_DISPLAY, newSubClassDisplay, newSubClassDisplay));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case FhirPackage.COVERAGE_GROUPING__GROUP:
				return basicSetGroup(null, msgs);
			case FhirPackage.COVERAGE_GROUPING__GROUP_DISPLAY:
				return basicSetGroupDisplay(null, msgs);
			case FhirPackage.COVERAGE_GROUPING__SUB_GROUP:
				return basicSetSubGroup(null, msgs);
			case FhirPackage.COVERAGE_GROUPING__SUB_GROUP_DISPLAY:
				return basicSetSubGroupDisplay(null, msgs);
			case FhirPackage.COVERAGE_GROUPING__PLAN:
				return basicSetPlan(null, msgs);
			case FhirPackage.COVERAGE_GROUPING__PLAN_DISPLAY:
				return basicSetPlanDisplay(null, msgs);
			case FhirPackage.COVERAGE_GROUPING__SUB_PLAN:
				return basicSetSubPlan(null, msgs);
			case FhirPackage.COVERAGE_GROUPING__SUB_PLAN_DISPLAY:
				return basicSetSubPlanDisplay(null, msgs);
			case FhirPackage.COVERAGE_GROUPING__CLASS:
				return basicSetClass(null, msgs);
			case FhirPackage.COVERAGE_GROUPING__CLASS_DISPLAY:
				return basicSetClassDisplay(null, msgs);
			case FhirPackage.COVERAGE_GROUPING__SUB_CLASS:
				return basicSetSubClass(null, msgs);
			case FhirPackage.COVERAGE_GROUPING__SUB_CLASS_DISPLAY:
				return basicSetSubClassDisplay(null, msgs);
		}
		return super.eInverseRemove(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case FhirPackage.COVERAGE_GROUPING__GROUP:
				return getGroup();
			case FhirPackage.COVERAGE_GROUPING__GROUP_DISPLAY:
				return getGroupDisplay();
			case FhirPackage.COVERAGE_GROUPING__SUB_GROUP:
				return getSubGroup();
			case FhirPackage.COVERAGE_GROUPING__SUB_GROUP_DISPLAY:
				return getSubGroupDisplay();
			case FhirPackage.COVERAGE_GROUPING__PLAN:
				return getPlan();
			case FhirPackage.COVERAGE_GROUPING__PLAN_DISPLAY:
				return getPlanDisplay();
			case FhirPackage.COVERAGE_GROUPING__SUB_PLAN:
				return getSubPlan();
			case FhirPackage.COVERAGE_GROUPING__SUB_PLAN_DISPLAY:
				return getSubPlanDisplay();
			case FhirPackage.COVERAGE_GROUPING__CLASS:
				return getClass_();
			case FhirPackage.COVERAGE_GROUPING__CLASS_DISPLAY:
				return getClassDisplay();
			case FhirPackage.COVERAGE_GROUPING__SUB_CLASS:
				return getSubClass();
			case FhirPackage.COVERAGE_GROUPING__SUB_CLASS_DISPLAY:
				return getSubClassDisplay();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case FhirPackage.COVERAGE_GROUPING__GROUP:
				setGroup((org.hl7.fhir.String)newValue);
				return;
			case FhirPackage.COVERAGE_GROUPING__GROUP_DISPLAY:
				setGroupDisplay((org.hl7.fhir.String)newValue);
				return;
			case FhirPackage.COVERAGE_GROUPING__SUB_GROUP:
				setSubGroup((org.hl7.fhir.String)newValue);
				return;
			case FhirPackage.COVERAGE_GROUPING__SUB_GROUP_DISPLAY:
				setSubGroupDisplay((org.hl7.fhir.String)newValue);
				return;
			case FhirPackage.COVERAGE_GROUPING__PLAN:
				setPlan((org.hl7.fhir.String)newValue);
				return;
			case FhirPackage.COVERAGE_GROUPING__PLAN_DISPLAY:
				setPlanDisplay((org.hl7.fhir.String)newValue);
				return;
			case FhirPackage.COVERAGE_GROUPING__SUB_PLAN:
				setSubPlan((org.hl7.fhir.String)newValue);
				return;
			case FhirPackage.COVERAGE_GROUPING__SUB_PLAN_DISPLAY:
				setSubPlanDisplay((org.hl7.fhir.String)newValue);
				return;
			case FhirPackage.COVERAGE_GROUPING__CLASS:
				setClass((org.hl7.fhir.String)newValue);
				return;
			case FhirPackage.COVERAGE_GROUPING__CLASS_DISPLAY:
				setClassDisplay((org.hl7.fhir.String)newValue);
				return;
			case FhirPackage.COVERAGE_GROUPING__SUB_CLASS:
				setSubClass((org.hl7.fhir.String)newValue);
				return;
			case FhirPackage.COVERAGE_GROUPING__SUB_CLASS_DISPLAY:
				setSubClassDisplay((org.hl7.fhir.String)newValue);
				return;
		}
		super.eSet(featureID, newValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eUnset(int featureID) {
		switch (featureID) {
			case FhirPackage.COVERAGE_GROUPING__GROUP:
				setGroup((org.hl7.fhir.String)null);
				return;
			case FhirPackage.COVERAGE_GROUPING__GROUP_DISPLAY:
				setGroupDisplay((org.hl7.fhir.String)null);
				return;
			case FhirPackage.COVERAGE_GROUPING__SUB_GROUP:
				setSubGroup((org.hl7.fhir.String)null);
				return;
			case FhirPackage.COVERAGE_GROUPING__SUB_GROUP_DISPLAY:
				setSubGroupDisplay((org.hl7.fhir.String)null);
				return;
			case FhirPackage.COVERAGE_GROUPING__PLAN:
				setPlan((org.hl7.fhir.String)null);
				return;
			case FhirPackage.COVERAGE_GROUPING__PLAN_DISPLAY:
				setPlanDisplay((org.hl7.fhir.String)null);
				return;
			case FhirPackage.COVERAGE_GROUPING__SUB_PLAN:
				setSubPlan((org.hl7.fhir.String)null);
				return;
			case FhirPackage.COVERAGE_GROUPING__SUB_PLAN_DISPLAY:
				setSubPlanDisplay((org.hl7.fhir.String)null);
				return;
			case FhirPackage.COVERAGE_GROUPING__CLASS:
				setClass((org.hl7.fhir.String)null);
				return;
			case FhirPackage.COVERAGE_GROUPING__CLASS_DISPLAY:
				setClassDisplay((org.hl7.fhir.String)null);
				return;
			case FhirPackage.COVERAGE_GROUPING__SUB_CLASS:
				setSubClass((org.hl7.fhir.String)null);
				return;
			case FhirPackage.COVERAGE_GROUPING__SUB_CLASS_DISPLAY:
				setSubClassDisplay((org.hl7.fhir.String)null);
				return;
		}
		super.eUnset(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean eIsSet(int featureID) {
		switch (featureID) {
			case FhirPackage.COVERAGE_GROUPING__GROUP:
				return group != null;
			case FhirPackage.COVERAGE_GROUPING__GROUP_DISPLAY:
				return groupDisplay != null;
			case FhirPackage.COVERAGE_GROUPING__SUB_GROUP:
				return subGroup != null;
			case FhirPackage.COVERAGE_GROUPING__SUB_GROUP_DISPLAY:
				return subGroupDisplay != null;
			case FhirPackage.COVERAGE_GROUPING__PLAN:
				return plan != null;
			case FhirPackage.COVERAGE_GROUPING__PLAN_DISPLAY:
				return planDisplay != null;
			case FhirPackage.COVERAGE_GROUPING__SUB_PLAN:
				return subPlan != null;
			case FhirPackage.COVERAGE_GROUPING__SUB_PLAN_DISPLAY:
				return subPlanDisplay != null;
			case FhirPackage.COVERAGE_GROUPING__CLASS:
				return class_ != null;
			case FhirPackage.COVERAGE_GROUPING__CLASS_DISPLAY:
				return classDisplay != null;
			case FhirPackage.COVERAGE_GROUPING__SUB_CLASS:
				return subClass != null;
			case FhirPackage.COVERAGE_GROUPING__SUB_CLASS_DISPLAY:
				return subClassDisplay != null;
		}
		return super.eIsSet(featureID);
	}

} //CoverageGroupingImpl
