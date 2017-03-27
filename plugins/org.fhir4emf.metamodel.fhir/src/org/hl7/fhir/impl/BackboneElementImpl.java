/**
 */
package org.hl7.fhir.impl;

import java.util.Collection;
import java.util.List;

import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.bind.annotation.XmlType;

import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

import org.hl7.fhir.BackboneElement;
import org.hl7.fhir.Extension;
import org.hl7.fhir.FhirPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Backbone Element</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.hl7.fhir.impl.BackboneElementImpl#getModifierExtension <em>Modifier Extension</em>}</li>
 * </ul>
 *
 * @generated
 */
@XmlType(name = "BackboneElement", namespace = "http://hl7.org/fhir")
@XmlSeeAlso({ TestScriptVariableImpl.class, DocumentManifestContentImpl.class, ExpansionProfileExcludeImpl.class, RequestGroupRelatedActionImpl.class, ProcedurePerformerImpl.class, ValueSetContainsImpl.class, TestScriptRule3Impl.class, PractitionerRoleNotAvailableImpl.class, ImmunizationReactionImpl.class,
		MedicationRequestDispenseRequestImpl.class, LinkageItemImpl.class, ConsentData1Impl.class, TestScriptAction1Impl.class, MeasureStratifierImpl.class, CapabilityStatementInteraction1Impl.class, ClaimItemImpl.class, ContractAgentImpl.class, ExpansionProfileDesignationImpl.class, CompartmentDefinitionResourceImpl.class,
		ExplanationOfBenefitDiagnosisImpl.class, ClaimResponseDetailImpl.class, ImagingStudyInstanceImpl.class, MedicationBatchImpl.class, ClaimResponseAdjudicationImpl.class, ProcedureRequestRequesterImpl.class, GroupCharacteristicImpl.class, ValueSetFilterImpl.class, QuestionnaireResponseItemImpl.class,
		RiskAssessmentPredictionImpl.class, ExplanationOfBenefitAccidentImpl.class, CodeSystemPropertyImpl.class, AdverseEventSuspectEntityImpl.class, CapabilityStatementCertificateImpl.class, ClaimDiagnosisImpl.class, RequestGroupActionImpl.class, ExplanationOfBenefitFinancialImpl.class, CoverageGroupingImpl.class,
		ClaimResponseDetail1Impl.class, DetectedIssueMitigationImpl.class, StructureDefinitionSnapshotImpl.class, OperationDefinitionParameterImpl.class, TaskInputImpl.class, TestReportOperationImpl.class, PlanDefinitionDynamicValueImpl.class, PlanDefinitionGoalImpl.class, TestScriptMetadataImpl.class,
		SearchParameterComponentImpl.class, ExplanationOfBenefitInformationImpl.class, ImplementationGuidePackageImpl.class, ValueSetParameterImpl.class, StructureMapGroupImpl.class, ObservationReferenceRangeImpl.class, EpisodeOfCareDiagnosisImpl.class, EncounterClassHistoryImpl.class, ClaimResponsePaymentImpl.class,
		TestScriptAssertImpl.class, ExplanationOfBenefitSubDetailImpl.class, ExpansionProfileExcludedSystemImpl.class, ImplementationGuidePageImpl.class, ImmunizationRecommendationRecommendationImpl.class, ProcedureFocalDeviceImpl.class, ValueSetComposeImpl.class, StructureDefinitionMappingImpl.class,
		EligibilityResponseErrorImpl.class, DeviceComponentProductionSpecificationImpl.class, ConceptMapElementImpl.class, ImagingStudySeriesImpl.class, MeasureReportStratifierImpl.class, ContractAgent1Impl.class, OperationDefinitionBindingImpl.class, FamilyMemberHistoryConditionImpl.class, CareTeamParticipantImpl.class,
		BundleResponseImpl.class, CodeSystemDesignationImpl.class, ExplanationOfBenefitAddItemImpl.class, PlanDefinitionActionImpl.class, PaymentReconciliationProcessNoteImpl.class, ExplanationOfBenefitBenefitBalanceImpl.class, NutritionOrderNutrientImpl.class, ExplanationOfBenefitPayeeImpl.class, ContractLegalImpl.class,
		DocumentReferenceContextImpl.class, MedicationIngredientImpl.class, TestReportParticipantImpl.class, ClaimResponseErrorImpl.class, MedicationContentImpl.class, PractitionerQualificationImpl.class, ClaimResponseItemImpl.class, EligibilityResponseInsuranceImpl.class, ImmunizationRecommendationProtocolImpl.class,
		AuditEventEntityImpl.class, ActivityDefinitionParticipantImpl.class, TestReportAction2Impl.class, TestReportAssertImpl.class, EncounterDiagnosisImpl.class, StructureMapRuleImpl.class, MessageHeaderResponseImpl.class, ClaimDetailImpl.class, ProcessRequestItemImpl.class, TestReportTeardownImpl.class, PatientContactImpl.class,
		ExplanationOfBenefitProcedureImpl.class, TestScriptTestImpl.class, AccountGuarantorImpl.class, MedicationAdministrationPerformerImpl.class, TaskRequesterImpl.class, TestScriptParam3Impl.class, ObservationRelatedImpl.class, ImmunizationRecommendationDateCriterionImpl.class, ConditionEvidenceImpl.class,
		PlanDefinitionParticipantImpl.class, CarePlanDetailImpl.class, ExplanationOfBenefitItemImpl.class, ClaimResponseProcessNoteImpl.class, TestScriptOperationImpl.class, HealthcareServiceNotAvailableImpl.class, TestScriptDestinationImpl.class, ConceptMapTargetImpl.class, MeasureReportGroupImpl.class, ResearchStudyArmImpl.class,
		ImmunizationExplanationImpl.class, ConditionStageImpl.class, ListEntryImpl.class, ChargeItemParticipantImpl.class, TestReportSetupImpl.class, GoalTargetImpl.class, TaskRestrictionImpl.class, DeviceUdiImpl.class, AuditEventNetworkImpl.class, MedicationDispenseSubstitutionImpl.class, ClinicalImpressionFindingImpl.class,
		ExplanationOfBenefitCareTeamImpl.class, MedicationRequestRequesterImpl.class, TestScriptCapabilityImpl.class, PlanDefinitionConditionImpl.class, DeviceRequestRequesterImpl.class, ImplementationGuideDependencyImpl.class, CodeSystemFilterImpl.class, MeasureGroupImpl.class, ExpansionProfileFixedVersionImpl.class,
		StructureMapDependentImpl.class, SpecimenCollectionImpl.class, ClaimRelatedImpl.class, AccountCoverageImpl.class, CommunicationRequestPayloadImpl.class, LocationPositionImpl.class, ContractValuedItem1Impl.class, QuestionnaireEnableWhenImpl.class, EncounterStatusHistoryImpl.class, DocumentReferenceRelatesToImpl.class,
		NutritionOrderSupplementImpl.class, PersonLinkImpl.class, TestScriptRulesetImpl.class, CapabilityStatementEventImpl.class, TestScriptParam2Impl.class, TestScriptRuleImpl.class, CompositionSectionImpl.class, CapabilityStatementRestImpl.class, CapabilityStatementSecurityImpl.class, ConceptMapDependsOnImpl.class,
		ClaimResponseSubDetailImpl.class, SupplyRequestRequesterImpl.class, EncounterLocationImpl.class, TestReportAction1Impl.class, MeasureReportStratumImpl.class, DeviceMetricCalibrationImpl.class, ExplanationOfBenefitInsuranceImpl.class, MeasureSupplementalDataImpl.class, TestScriptOriginImpl.class,
		ExplanationOfBenefitPaymentImpl.class, CapabilityStatementMessagingImpl.class, ExpansionProfileIncludeImpl.class, NutritionOrderOralDietImpl.class, ConceptMapUnmappedImpl.class, ImmunizationVaccinationProtocolImpl.class, MessageDefinitionAllowedResponseImpl.class, ImmunizationPractitionerImpl.class,
		EncounterHospitalizationImpl.class, ConsentExceptImpl.class, ImagingManifestSeriesImpl.class, MessageHeaderSourceImpl.class, HealthcareServiceAvailableTimeImpl.class, ConceptMapGroupImpl.class, CapabilityStatementImplementationImpl.class, ExplanationOfBenefitAdjudicationImpl.class, DocumentManifestRelatedImpl.class,
		ImplementationGuideResourceImpl.class, MedicationAdministrationDosageImpl.class, TaskOutputImpl.class, NutritionOrderEnteralFormulaImpl.class, ExplanationOfBenefitDetail1Impl.class, ClaimInformationImpl.class, SequenceRepositoryImpl.class, CodeSystemProperty1Impl.class, MessageDefinitionFocusImpl.class,
		ImagingManifestInstanceImpl.class, OrganizationContactImpl.class, ExplanationOfBenefitDetailImpl.class, AuditEventAgentImpl.class, TestScriptFixtureImpl.class, SequenceQualityImpl.class, ValueSetIncludeImpl.class, GraphDefinitionLinkImpl.class, TestScriptTeardownImpl.class, CommunicationRequestRequesterImpl.class,
		CommunicationPayloadImpl.class, CompositionEventImpl.class, SubscriptionChannelImpl.class, DataElementMappingImpl.class, OperationOutcomeIssueImpl.class, ConsentPolicyImpl.class, NutritionOrderAdministrationImpl.class, GraphDefinitionTargetImpl.class, ConsentDataImpl.class, SpecimenContainerImpl.class,
		ImplementationGuideGlobalImpl.class, StructureMapStructureImpl.class, AuditEventDetailImpl.class, TestReportTestImpl.class, ClaimResponseAddItemImpl.class, ContractSignerImpl.class, AppointmentParticipantImpl.class, TestScriptSetupImpl.class, ClaimPayeeImpl.class, ContractTermImpl.class,
		ExpansionProfileDesignation2Impl.class, ExplanationOfBenefitRelatedImpl.class, ObservationComponentImpl.class, CapabilityStatementOperationImpl.class, PlanDefinitionRelatedActionImpl.class, CapabilityStatementSoftwareImpl.class, AllergyIntoleranceReactionImpl.class, StructureMapInputImpl.class,
		ExplanationOfBenefitProcessNoteImpl.class, TestScriptRule1Impl.class, EligibilityResponseBenefitBalanceImpl.class, ClaimInsuranceImpl.class, MeasurePopulationImpl.class, ClinicalImpressionInvestigationImpl.class, PatientCommunicationImpl.class, ClaimAccidentImpl.class, ContractValuedItemImpl.class,
		ValueSetExpansionImpl.class, BundleRequestImpl.class, PatientLinkImpl.class, TestScriptRequestHeaderImpl.class, ConsentActorImpl.class, SupplyDeliverySuppliedItemImpl.class, TestScriptParam1Impl.class, MedicationPackageImpl.class, CompositionRelatesToImpl.class, EpisodeOfCareStatusHistoryImpl.class,
		ClaimResponseInsuranceImpl.class, TestScriptActionImpl.class, CapabilityStatementSupportedMessageImpl.class, ActivityDefinitionDynamicValueImpl.class, GraphDefinitionCompartmentImpl.class, ProcessResponseProcessNoteImpl.class, PractitionerRoleAvailableTimeImpl.class, ParametersParameterImpl.class,
		ImagingManifestStudyImpl.class, ConsentActor1Impl.class, AuditEventSourceImpl.class, CapabilityStatementEndpointImpl.class, DocumentReferenceContentImpl.class, RequestGroupConditionImpl.class, StructureDefinitionDifferentialImpl.class, SequenceVariantImpl.class, TestScriptAction2Impl.class, ClaimProcedureImpl.class,
		MeasureReportPopulation1Impl.class, TestScriptRuleset1Impl.class, QuestionnaireOptionImpl.class, GroupMemberImpl.class, TestScriptLinkImpl.class, ContractFriendlyImpl.class, StructureMapParameterImpl.class, PlanDefinitionTargetImpl.class, CarePlanActivityImpl.class, CapabilityStatementDocumentImpl.class,
		OperationDefinitionOverloadImpl.class, CompositionAttesterImpl.class, SubstanceIngredientImpl.class, SequenceReferenceSeqImpl.class, StructureMapTargetImpl.class, BundleEntryImpl.class, VisionPrescriptionDispenseImpl.class, SupplyRequestOrderedItemImpl.class, ClaimSubDetailImpl.class, CodeSystemConceptImpl.class,
		ClaimCareTeamImpl.class, MedicationDispensePerformerImpl.class, EncounterParticipantImpl.class, EligibilityResponseFinancialImpl.class, TestReportActionImpl.class, ProvenanceEntityImpl.class, QuestionnaireItemImpl.class, CapabilityStatementSearchParamImpl.class, SpecimenProcessingImpl.class, BundleSearchImpl.class,
		QuestionnaireResponseAnswerImpl.class, ValueSetConceptImpl.class, NutritionOrderTextureImpl.class, StructureMapSourceImpl.class, DiagnosticReportImageImpl.class, MessageHeaderDestinationImpl.class, ReferralRequestRequesterImpl.class, SubstanceInstanceImpl.class, PaymentReconciliationDetailImpl.class,
		ValueSetDesignationImpl.class, CapabilityStatementInteractionImpl.class, CapabilityStatementResourceImpl.class, NamingSystemUniqueIdImpl.class, MeasureReportPopulationImpl.class, ProvenanceAgentImpl.class, DiagnosticReportPerformerImpl.class, DocumentReferenceRelatedImpl.class, MedicationRequestSubstitutionImpl.class,
		ExpansionProfileDesignation1Impl.class, TestScriptParamImpl.class, BundleLinkImpl.class, ContractRuleImpl.class, PatientAnimalImpl.class, TestScriptRule2Impl.class })
@XmlRootElement(name = "fhir.BackboneElement")
public class BackboneElementImpl extends ElementImpl implements BackboneElement {
	/**
	 * The cached value of the '{@link #getModifierExtension() <em>Modifier Extension</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getModifierExtension()
	 * @generated
	 * @ordered
	 */
	protected EList<Extension> modifierExtension;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected BackboneElementImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return FhirPackage.eINSTANCE.getBackboneElement();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@XmlElement
	public List<Extension> getModifierExtension() {
		if (modifierExtension == null) {
			modifierExtension = new EObjectContainmentEList<Extension>(Extension.class, this, FhirPackage.BACKBONE_ELEMENT__MODIFIER_EXTENSION);
		}
		return modifierExtension;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case FhirPackage.BACKBONE_ELEMENT__MODIFIER_EXTENSION:
				return ((InternalEList<?>)getModifierExtension()).basicRemove(otherEnd, msgs);
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
			case FhirPackage.BACKBONE_ELEMENT__MODIFIER_EXTENSION:
				return getModifierExtension();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case FhirPackage.BACKBONE_ELEMENT__MODIFIER_EXTENSION:
				getModifierExtension().clear();
				getModifierExtension().addAll((Collection<? extends Extension>)newValue);
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
			case FhirPackage.BACKBONE_ELEMENT__MODIFIER_EXTENSION:
				getModifierExtension().clear();
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
			case FhirPackage.BACKBONE_ELEMENT__MODIFIER_EXTENSION:
				return modifierExtension != null && !modifierExtension.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //BackboneElementImpl
