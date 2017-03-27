/**
 */
package org.hl7.fhir.impl;

import java.lang.String;

import java.util.Collection;
import java.util.List;

import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.bind.annotation.XmlType;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

import org.hl7.fhir.Element;
import org.hl7.fhir.Extension;
import org.hl7.fhir.FhirPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Element</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.hl7.fhir.impl.ElementImpl#getExtension <em>Extension</em>}</li>
 *   <li>{@link org.hl7.fhir.impl.ElementImpl#getId <em>Id</em>}</li>
 * </ul>
 *
 * @generated
 */
@XmlType(name = "Element", namespace = "http://hl7.org/fhir")
@XmlSeeAlso({ TestScriptVariableImpl.class, DocumentManifestContentImpl.class, LinkTypeImpl.class, TestScriptRule3Impl.class, ImmunizationReactionImpl.class, DeviceMetricColorImpl.class, TestScriptRequestMethodCodeImpl.class, LinkageItemImpl.class, RepositoryTypeImpl.class, ConsentData1Impl.class, TestScriptAction1Impl.class,
		CarePlanActivityStatusImpl.class, CapabilityStatementInteraction1Impl.class, ContractAgentImpl.class, ActionCardinalityBehaviorImpl.class, ExplanationOfBenefitDiagnosisImpl.class, ClaimResponseDetailImpl.class, MedicationBatchImpl.class, ProcedureRequestRequesterImpl.class, Base64BinaryImpl.class,
		ConsentExceptTypeImpl.class, DosageImpl.class, UnsignedIntImpl.class, ParticipationStatusImpl.class, DetectedIssueSeverityImpl.class, CapabilityStatementCertificateImpl.class, DeviceMetricOperationalStatusImpl.class, RequestGroupActionImpl.class, UseImpl.class, ExplanationOfBenefitFinancialImpl.class,
		MedicationRequestIntentImpl.class, CoverageGroupingImpl.class, ResourceTypeImpl.class, StructureDefinitionSnapshotImpl.class, OperationDefinitionParameterImpl.class, TestReportOperationImpl.class, PlanDefinitionDynamicValueImpl.class, SearchParameterComponentImpl.class, ExplanationOfBenefitInformationImpl.class,
		ValueSetParameterImpl.class, StructureMapGroupImpl.class, ObservationReferenceRangeImpl.class, ActionRelationshipTypeImpl.class, TestScriptAssertImpl.class, PublicationStatusImpl.class, ImmunizationRecommendationRecommendationImpl.class, ValueSetComposeImpl.class, ExtensionContextImpl.class,
		EligibilityResponseErrorImpl.class, ConceptMapElementImpl.class, SpecimenStatusImpl.class, ImagingStudySeriesImpl.class, QualityTypeImpl.class, MeasureReportStratifierImpl.class, PeriodImpl.class, AdverseEventCausalityImpl.class, BundleResponseImpl.class, HumanNameImpl.class, SlicingRulesImpl.class,
		ExplanationOfBenefitAddItemImpl.class, MetaImpl.class, ExplanationOfBenefitBenefitBalanceImpl.class, ContractLegalImpl.class, SampledDataDataTypeImpl.class, AddressTypeImpl.class, DocumentReferenceContextImpl.class, ObservationRelationshipTypeImpl.class, ClaimResponseErrorImpl.class, AssertionOperatorTypeImpl.class,
		PractitionerQualificationImpl.class, ClaimResponseItemImpl.class, EligibilityResponseInsuranceImpl.class, ImmunizationRecommendationProtocolImpl.class, RemittanceOutcomeImpl.class, StringImpl.class, ConsentDataMeaningImpl.class, AuditEventEntityImpl.class, TestReportAction2Impl.class, TestReportAssertImpl.class,
		NutritionOrderStatusImpl.class, GoalStatusImpl.class, StructureMapRuleImpl.class, IntegerImpl.class, ClaimDetailImpl.class, PatientContactImpl.class, ExplanationOfBenefitProcedureImpl.class, ConditionalDeleteStatusImpl.class, QuestionnaireItemTypeImpl.class, MeasureReportTypeImpl.class,
		MedicationAdministrationPerformerImpl.class, RequestIntentImpl.class, FinancialResourceStatusCodesImpl.class, ImmunizationRecommendationDateCriterionImpl.class, PlanDefinitionParticipantImpl.class, CarePlanDetailImpl.class, ExplanationOfBenefitItemImpl.class, TestScriptOperationImpl.class,
		HealthcareServiceNotAvailableImpl.class, TestScriptDestinationImpl.class, CarePlanStatusImpl.class, ResearchStudyArmImpl.class, ObservationStatusImpl.class, ImmunizationExplanationImpl.class, ChargeItemParticipantImpl.class, ActionConditionKindImpl.class, TestReportSetupImpl.class, GoalTargetImpl.class, DeviceUdiImpl.class,
		ContributorTypeImpl.class, RatioImpl.class, ResponseTypeImpl.class, ClinicalImpressionFindingImpl.class, DeviceRequestRequesterImpl.class, ImplementationGuideDependencyImpl.class, CodeSystemFilterImpl.class, FHIRDefinedTypeImpl.class, MeasureGroupImpl.class, SearchParamTypeImpl.class, SpecimenCollectionImpl.class,
		ClaimRelatedImpl.class, AccountCoverageImpl.class, ContractValuedItem1Impl.class, QuestionnaireEnableWhenImpl.class, MoneyImpl.class, HTTPVerbImpl.class, CapabilityStatementEventImpl.class, TestScriptParam2Impl.class, TestScriptRuleImpl.class, ActionSelectionBehaviorImpl.class, ConceptMapDependsOnImpl.class,
		ClaimResponseSubDetailImpl.class, CapabilityStatementRestImpl.class, ElementDefinitionTypeImpl.class, SupplyRequestRequesterImpl.class, EncounterLocationImpl.class, ElementDefinitionConstraintImpl.class, DeviceMetricCalibrationImpl.class, AppointmentStatusImpl.class, ExplanationOfBenefitInsuranceImpl.class,
		DiscriminatorTypeImpl.class, CountImpl.class, OperationParameterUseImpl.class, TestScriptOriginImpl.class, ExpansionProfileIncludeImpl.class, CodeSystemHierarchyMeaningImpl.class, IdentifierUseImpl.class, TypeDerivationRuleImpl.class, ActionListImpl.class, TestReportStatusImpl.class, ImagingManifestSeriesImpl.class,
		MessageHeaderSourceImpl.class, DateImpl.class, TriggerDefinitionImpl.class, ConceptMapGroupImpl.class, AddressImpl.class, CodeableConceptImpl.class, MessageSignificanceCategoryImpl.class, TaskOutputImpl.class, TimeImpl.class, ExplanationOfBenefitDetail1Impl.class, ConditionalReadStatusImpl.class,
		OrganizationContactImpl.class, ExplanationOfBenefitDetailImpl.class, AuditEventAgentImpl.class, ChargeItemStatusImpl.class, ValueSetIncludeImpl.class, TestScriptTeardownImpl.class, GraphDefinitionLinkImpl.class, CompositionEventImpl.class, SystemRestfulInteractionImpl.class, QuantityImpl.class,
		EventCapabilityModeImpl.class, OperationOutcomeIssueImpl.class, NutritionOrderAdministrationImpl.class, GraphDefinitionTargetImpl.class, AuditEventDetailImpl.class, StructureMapStructureImpl.class, MeasmntPrincipleImpl.class, ClaimPayeeImpl.class, CarePlanIntentImpl.class, ExplanationOfBenefitRelatedImpl.class,
		CapabilityStatementOperationImpl.class, TestScriptRule1Impl.class, PositiveIntImpl.class, OidImpl.class, ClaimInsuranceImpl.class, VisionEyesImpl.class, PatientCommunicationImpl.class, DocumentModeImpl.class, ContractValuedItemImpl.class, BundleRequestImpl.class, TestScriptRequestHeaderImpl.class, PatientLinkImpl.class,
		GraphCompartmentRuleImpl.class, ConsentActorImpl.class, DeviceMetricCalibrationStateImpl.class, SupplyDeliverySuppliedItemImpl.class, CodingImpl.class, MedicationPackageImpl.class, TestScriptParam1Impl.class, FHIRAllTypesImpl.class, EpisodeOfCareStatusHistoryImpl.class, ContentTypeImpl.class,
		ClaimResponseInsuranceImpl.class, AllergyIntoleranceCriticalityImpl.class, AssertionDirectionTypeImpl.class, DistanceImpl.class, ActionRequiredBehaviorImpl.class, StructureMapSourceListModeImpl.class, FamilyHistoryStatusImpl.class, ProcessResponseProcessNoteImpl.class, PropertyRepresentationImpl.class,
		StructureDefinitionKindImpl.class, ImmunizationStatusCodesImpl.class, PractitionerRoleAvailableTimeImpl.class, AccountStatusImpl.class, InstantImpl.class, AssertionResponseTypesImpl.class, ConsentActor1Impl.class, ConditionVerificationStatusImpl.class, AllergyIntoleranceSeverityImpl.class, EncounterStatusImpl.class,
		StructureMapTargetListModeImpl.class, PropertyTypeImpl.class, AttachmentImpl.class, RequestGroupConditionImpl.class, ProvenanceEntityRoleImpl.class, DiagnosticReportStatusImpl.class, StructureDefinitionDifferentialImpl.class, ListModeImpl.class, SequenceVariantImpl.class, ClaimProcedureImpl.class,
		MedicationRequestPriorityImpl.class, ExtensionImpl.class, GroupTypeImpl.class, BundleTypeImpl.class, IdentityAssuranceLevelImpl.class, TestScriptLinkImpl.class, ContractFriendlyImpl.class, PlanDefinitionTargetImpl.class, CarePlanActivityImpl.class, CompositionAttesterImpl.class, SequenceReferenceSeqImpl.class,
		VisionPrescriptionDispenseImpl.class, ClaimSubDetailImpl.class, CodeSystemConceptImpl.class, RequestPriorityImpl.class, CodeImpl.class, DeviceUseStatementStatusImpl.class, ContractResourceStatusCodesImpl.class, UriImpl.class, BackboneElementImpl.class, TestReportActionImpl.class, QuestionnaireItemImpl.class,
		ParameterDefinitionImpl.class, MedicationStatementStatusImpl.class, CapabilityStatementSearchParamImpl.class, RelatedArtifactTypeImpl.class, SampledDataImpl.class, AddressUseImpl.class, QuestionnaireResponseAnswerImpl.class, ValueSetConceptImpl.class, NutritionOrderTextureImpl.class, MeasureReportStatusImpl.class,
		StructureMapSourceImpl.class, ReferralRequestRequesterImpl.class, QuestionnaireResponseStatusImpl.class, CapabilityStatementInteractionImpl.class, CapabilityStatementResourceImpl.class, MeasureReportPopulationImpl.class, RangeImpl.class, DiagnosticReportPerformerImpl.class, DecimalImpl.class,
		MedicationRequestSubstitutionImpl.class, DataRequirementCodeFilterImpl.class, TestScriptParamImpl.class, MedicationAdministrationStatusImpl.class, BundleLinkImpl.class, ExplanationOfBenefitStatusImpl.class, ContractRuleImpl.class, TestScriptRule2Impl.class, StructureMapInputModeImpl.class, AnnotationImpl.class,
		NarrativeStatusImpl.class, ExpansionProfileExcludeImpl.class, StructureMapContextTypeImpl.class, RequestGroupRelatedActionImpl.class, ProcedurePerformerImpl.class, ValueSetContainsImpl.class, PractitionerRoleNotAvailableImpl.class, MedicationRequestStatusImpl.class, AllergyIntoleranceCategoryImpl.class,
		ConsentStateImpl.class, DeviceMetricCategoryImpl.class, MedicationRequestDispenseRequestImpl.class, SupplyDeliveryStatusImpl.class, MeasureStratifierImpl.class, ElementDefinitionSlicingImpl.class, ClaimItemImpl.class, ExpansionProfileDesignationImpl.class, CompartmentDefinitionResourceImpl.class, MarkdownImpl.class,
		DateTimeImpl.class, ConfidentialityClassificationImpl.class, ImagingStudyInstanceImpl.class, StructureMapGroupTypeModeImpl.class, NamingSystemTypeImpl.class, ClaimResponseAdjudicationImpl.class, GroupCharacteristicImpl.class, QuestionnaireResponseItemImpl.class, ValueSetFilterImpl.class, RiskAssessmentPredictionImpl.class,
		OperationKindImpl.class, ExplanationOfBenefitAccidentImpl.class, CodeSystemPropertyImpl.class, AdverseEventSuspectEntityImpl.class, AgeImpl.class, ClaimDiagnosisImpl.class, ElementDefinitionExampleImpl.class, ClaimResponseDetail1Impl.class, DetectedIssueMitigationImpl.class, CodeSystemContentModeImpl.class,
		TaskInputImpl.class, AllergyIntoleranceClinicalStatusImpl.class, PlanDefinitionGoalImpl.class, TestScriptMetadataImpl.class, ImplementationGuidePackageImpl.class, ConceptMapEquivalenceImpl.class, EpisodeOfCareDiagnosisImpl.class, ElementDefinitionMappingImpl.class, EncounterClassHistoryImpl.class,
		ClaimResponsePaymentImpl.class, VisionBaseImpl.class, ExplanationOfBenefitSubDetailImpl.class, TimingRepeatImpl.class, ExpansionProfileExcludedSystemImpl.class, ImplementationGuidePageImpl.class, ProcedureFocalDeviceImpl.class, EpisodeOfCareStatusImpl.class, StructureDefinitionMappingImpl.class,
		DeviceComponentProductionSpecificationImpl.class, ReferenceImpl.class, GuideDependencyTypeImpl.class, SubscriptionChannelTypeImpl.class, AggregationModeImpl.class, ContractAgent1Impl.class, DocumentRelationshipTypeImpl.class, EventStatusImpl.class, OperationDefinitionBindingImpl.class,
		FamilyMemberHistoryConditionImpl.class, CareTeamParticipantImpl.class, ClinicalImpressionStatusImpl.class, AuditEventOutcomeImpl.class, FHIRSubstanceStatusImpl.class, CodeSystemDesignationImpl.class, SearchEntryModeImpl.class, PlanDefinitionActionImpl.class, PaymentReconciliationProcessNoteImpl.class,
		NutritionOrderNutrientImpl.class, AuditEventAgentNetworkTypeImpl.class, ExplanationOfBenefitPayeeImpl.class, MedicationIngredientImpl.class, RequestStatusImpl.class, TestReportParticipantImpl.class, MedicationContentImpl.class, QuantityComparatorImpl.class, EncounterLocationStatusImpl.class,
		ActivityDefinitionParticipantImpl.class, EncounterDiagnosisImpl.class, ContactPointUseImpl.class, EndpointStatusImpl.class, MessageHeaderResponseImpl.class, ProcessRequestItemImpl.class, TestReportTeardownImpl.class, ContactPointImpl.class, MedicationStatusImpl.class, StructureMapTransformImpl.class,
		ReferenceVersionRulesImpl.class, TestScriptTestImpl.class, AccountGuarantorImpl.class, TaskRequesterImpl.class, RelatedArtifactImpl.class, TestScriptParam3Impl.class, ObservationRelatedImpl.class, DataElementStringencyImpl.class, ConditionEvidenceImpl.class, ClaimResponseProcessNoteImpl.class, ConceptMapTargetImpl.class,
		SupplyRequestStatusImpl.class, ReferenceHandlingPolicyImpl.class, MeasureReportGroupImpl.class, SignatureImpl.class, ConditionStageImpl.class, ListEntryImpl.class, TestReportParticipantTypeImpl.class, ResourceVersionPolicyImpl.class, RestfulCapabilityModeImpl.class, TaskRestrictionImpl.class, AuditEventNetworkImpl.class,
		MedicationDispenseSubstitutionImpl.class, ExplanationOfBenefitCareTeamImpl.class, MedicationRequestRequesterImpl.class, AllergyIntoleranceTypeImpl.class, TestScriptCapabilityImpl.class, AuditEventActionImpl.class, ActionPrecheckBehaviorImpl.class, PlanDefinitionConditionImpl.class, ElementDefinitionImpl.class,
		DataRequirementImpl.class, ExpansionProfileFixedVersionImpl.class, ResearchSubjectStatusImpl.class, StructureMapDependentImpl.class, ElementDefinitionBindingImpl.class, CommunicationRequestPayloadImpl.class, LocationPositionImpl.class, MedicationDispenseStatusImpl.class, EncounterStatusHistoryImpl.class,
		DigitalMediaTypeImpl.class, DocumentReferenceRelatesToImpl.class, GuidanceResponseStatusImpl.class, NutritionOrderSupplementImpl.class, PersonLinkImpl.class, TestScriptRulesetImpl.class, DeviceMetricCalibrationTypeImpl.class, CompositionSectionImpl.class, CapabilityStatementSecurityImpl.class,
		MeasureReportStratumImpl.class, TestReportAction1Impl.class, NoteTypeImpl.class, NamingSystemIdentifierTypeImpl.class, SubscriptionStatusImpl.class, MeasureSupplementalDataImpl.class, ResearchStudyStatusImpl.class, ContributorImpl.class, CapabilityStatementMessagingImpl.class, ExplanationOfBenefitPaymentImpl.class,
		EventTimingImpl.class, NutritionOrderOralDietImpl.class, MessageDefinitionAllowedResponseImpl.class, ConceptMapUnmappedImpl.class, ImmunizationVaccinationProtocolImpl.class, EncounterHospitalizationImpl.class, ConsentExceptImpl.class, ImmunizationPractitionerImpl.class, HealthcareServiceAvailableTimeImpl.class,
		CapabilityStatementImplementationImpl.class, ExplanationOfBenefitAdjudicationImpl.class, TimingImpl.class, DocumentManifestRelatedImpl.class, ImplementationGuideResourceImpl.class, MedicationAdministrationDosageImpl.class, ContactDetailImpl.class, NutritionOrderEnteralFormulaImpl.class, LinkageTypeImpl.class,
		ClaimInformationImpl.class, CodeSystemProperty1Impl.class, SequenceRepositoryImpl.class, MessageDefinitionFocusImpl.class, ImagingManifestInstanceImpl.class, FHIRDeviceStatusImpl.class, ConditionClinicalStatusCodesImpl.class, TestScriptFixtureImpl.class, SearchModifierCodeImpl.class, GuidePageKindImpl.class,
		SequenceQualityImpl.class, CommunicationRequestRequesterImpl.class, ActionParticipantTypeImpl.class, LocationModeImpl.class, CommunicationPayloadImpl.class, ListStatusImpl.class, SubscriptionChannelImpl.class, DataElementMappingImpl.class, ParticipantRequiredImpl.class, ConsentPolicyImpl.class, ConsentDataImpl.class,
		SpecimenContainerImpl.class, SlotStatusImpl.class, ImplementationGuideGlobalImpl.class, IssueSeverityImpl.class, TestReportTestImpl.class, ClaimResponseAddItemImpl.class, ContractSignerImpl.class, DocumentReferenceStatusImpl.class, AppointmentParticipantImpl.class, ConstraintSeverityImpl.class, TestScriptSetupImpl.class,
		CompositionStatusImpl.class, ContractTermImpl.class, ExpansionProfileDesignation2Impl.class, PlanDefinitionRelatedActionImpl.class, ObservationComponentImpl.class, TaskStatusImpl.class, UuidImpl.class, SystemVersionProcessingModeImpl.class, CapabilityStatementSoftwareImpl.class, TestReportActionResultImpl.class,
		AllergyIntoleranceReactionImpl.class, StructureMapInputImpl.class, ExplanationOfBenefitProcessNoteImpl.class, NarrativeImpl.class, EligibilityResponseBenefitBalanceImpl.class, MeasurePopulationImpl.class, ClinicalImpressionInvestigationImpl.class, MedicationStatementTakenImpl.class, CompositionAttestationModeImpl.class,
		ClaimAccidentImpl.class, DurationImpl.class, ValueSetExpansionImpl.class, CompositionRelatesToImpl.class, AllergyIntoleranceVerificationStatusImpl.class, DataRequirementDateFilterImpl.class, TestScriptActionImpl.class, CapabilityStatementSupportedMessageImpl.class, CareTeamStatusImpl.class, TriggerTypeImpl.class,
		ActivityDefinitionDynamicValueImpl.class, InstanceAvailabilityImpl.class, GraphDefinitionCompartmentImpl.class, TypeRestfulInteractionImpl.class, ElementDefinitionBaseImpl.class, UDIEntryTypeImpl.class, ParametersParameterImpl.class, AdverseEventCategoryImpl.class, ImagingManifestStudyImpl.class,
		ContactPointSystemImpl.class, AuditEventSourceImpl.class, CapabilityStatementEndpointImpl.class, ConceptMapGroupUnmappedModeImpl.class, DocumentReferenceContentImpl.class, ElementDefinitionDiscriminatorImpl.class, TestScriptAction2Impl.class, MeasureReportPopulation1Impl.class, LocationStatusImpl.class,
		TestScriptRuleset1Impl.class, QuestionnaireOptionImpl.class, GroupMemberImpl.class, StructureMapParameterImpl.class, DaysOfWeekImpl.class, CapabilityStatementDocumentImpl.class, ActionGroupingBehaviorImpl.class, OperationDefinitionOverloadImpl.class, SubstanceIngredientImpl.class, StructureMapTargetImpl.class,
		BundleEntryImpl.class, SupplyRequestOrderedItemImpl.class, ClaimCareTeamImpl.class, MedicationDispensePerformerImpl.class, EncounterParticipantImpl.class, UsageContextImpl.class, EligibilityResponseFinancialImpl.class, FilterOperatorImpl.class, NameUseImpl.class, CompartmentTypeImpl.class, ProvenanceEntityImpl.class,
		CapabilityStatementKindImpl.class, IdImpl.class, BundleSearchImpl.class, SpecimenProcessingImpl.class, BooleanImpl.class, IdentifierImpl.class, UnitsOfTimeImpl.class, DiagnosticReportImageImpl.class, MessageHeaderDestinationImpl.class, UnknownContentCodeImpl.class, BindingStrengthImpl.class, SubstanceInstanceImpl.class,
		PaymentReconciliationDetailImpl.class, ValueSetDesignationImpl.class, NamingSystemUniqueIdImpl.class, XPathUsageTypeImpl.class, AdministrativeGenderImpl.class, ProvenanceAgentImpl.class, StructureMapModelModeImpl.class, IssueTypeImpl.class, DocumentReferenceRelatedImpl.class, SearchComparatorImpl.class,
		ExpansionProfileDesignation1Impl.class, PatientAnimalImpl.class, TestReportResultImpl.class, FlagStatusImpl.class })
@XmlRootElement(name = "fhir.Element")
public class ElementImpl extends MinimalEObjectImpl.Container implements Element {
	/**
	 * The cached value of the '{@link #getExtension() <em>Extension</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getExtension()
	 * @generated
	 * @ordered
	 */
	protected EList<Extension> extension;

	/**
	 * The default value of the '{@link #getId() <em>Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getId()
	 * @generated
	 * @ordered
	 */
	protected static final String ID_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getId() <em>Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getId()
	 * @generated
	 * @ordered
	 */
	protected String id = ID_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ElementImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return FhirPackage.eINSTANCE.getElement();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@XmlElement
	public List<Extension> getExtension() {
		if (extension == null) {
			extension = new EObjectContainmentEList<Extension>(Extension.class, this, FhirPackage.ELEMENT__EXTENSION);
		}
		return extension;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getId() {
		return id;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setId(String newId) {
		String oldId = id;
		id = newId;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FhirPackage.ELEMENT__ID, oldId, id));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case FhirPackage.ELEMENT__EXTENSION:
				return ((InternalEList<?>)getExtension()).basicRemove(otherEnd, msgs);
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
			case FhirPackage.ELEMENT__EXTENSION:
				return getExtension();
			case FhirPackage.ELEMENT__ID:
				return getId();
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
			case FhirPackage.ELEMENT__EXTENSION:
				getExtension().clear();
				getExtension().addAll((Collection<? extends Extension>)newValue);
				return;
			case FhirPackage.ELEMENT__ID:
				setId((String)newValue);
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
			case FhirPackage.ELEMENT__EXTENSION:
				getExtension().clear();
				return;
			case FhirPackage.ELEMENT__ID:
				setId(ID_EDEFAULT);
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
			case FhirPackage.ELEMENT__EXTENSION:
				return extension != null && !extension.isEmpty();
			case FhirPackage.ELEMENT__ID:
				return ID_EDEFAULT == null ? id != null : !ID_EDEFAULT.equals(id);
		}
		return super.eIsSet(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String toString() {
		if (eIsProxy()) return super.toString();

		StringBuffer result = new StringBuffer(super.toString());
		result.append(" (id: ");
		result.append(id);
		result.append(')');
		return result.toString();
	}

} //ElementImpl
