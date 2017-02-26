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
@XmlSeeAlso({ TestScriptVariableImpl.class, CatalogRelatedItemImpl.class, DocumentManifestContentImpl.class,
		LinkTypeImpl.class, TestScriptRule3Impl.class, ImmunizationReactionImpl.class, DeviceMetricColorImpl.class,
		LinkageItemImpl.class, RepositoryTypeImpl.class, ConsentData1Impl.class, TestScriptAction1Impl.class,
		CarePlanActivityStatusImpl.class, CapabilityStatementInteraction1Impl.class, ContractAgentImpl.class,
		PractitionerRole1Impl.class, ActionCardinalityBehaviorImpl.class, ExplanationOfBenefitDiagnosisImpl.class,
		ClaimResponseDetailImpl.class, MedicationBatchImpl.class, ProcedureRequestRequesterImpl.class,
		Base64BinaryImpl.class, ConsentExceptTypeImpl.class, UnsignedIntImpl.class, ParticipationStatusImpl.class,
		DetectedIssueSeverityImpl.class, DeviceMetricOperationalStatusImpl.class,
		CapabilityStatementCertificateImpl.class, RequestGroupActionImpl.class, UseImpl.class,
		ExplanationOfBenefitFinancialImpl.class, MedicationRequestIntentImpl.class, CoverageGroupingImpl.class,
		OperationDefinitionParameterImpl.class, StructureDefinitionSnapshotImpl.class, TestReportOperationImpl.class,
		PlanDefinitionDynamicValueImpl.class, SearchParameterComponentImpl.class,
		ExplanationOfBenefitInformationImpl.class, ValueSetParameterImpl.class, StructureMapGroupImpl.class,
		ObservationReferenceRangeImpl.class, ActionRelationshipTypeImpl.class, TestScriptAssertImpl.class,
		PublicationStatusImpl.class, ImmunizationRecommendationRecommendationImpl.class, ValueSetComposeImpl.class,
		ExtensionContextImpl.class, EligibilityResponseErrorImpl.class, SpecimenStatusImpl.class,
		ConceptMapElementImpl.class, ImagingStudySeriesImpl.class, MeasureReportGroup1Impl.class, QualityTypeImpl.class,
		MeasureReportStratifierImpl.class, PeriodImpl.class, AdverseEventCausalityImpl.class, BundleResponseImpl.class,
		HumanNameImpl.class, SlicingRulesImpl.class, ExplanationOfBenefitAddItemImpl.class, MetaImpl.class,
		ExplanationOfBenefitBenefitBalanceImpl.class, ContractLegalImpl.class, DocumentReferenceContextImpl.class,
		AddressTypeImpl.class, SampledDataDataTypeImpl.class, ObservationRelationshipTypeImpl.class,
		ClaimResponseErrorImpl.class, PractitionerQualificationImpl.class, AssertionOperatorTypeImpl.class,
		ClaimResponseItemImpl.class, ImmunizationRecommendationProtocolImpl.class,
		EligibilityResponseInsuranceImpl.class, RemittanceOutcomeImpl.class, StringImpl.class,
		ConsentDataMeaningImpl.class, AuditEventEntityImpl.class, TestReportAction2Impl.class,
		ReferralRequestStatusImpl.class, TestReportAssertImpl.class, NutritionOrderStatusImpl.class,
		MeasureTypeImpl.class, GoalStatusImpl.class, StructureMapRuleImpl.class, IntegerImpl.class,
		ClaimDetailImpl.class, PatientContactImpl.class, ExplanationOfBenefitProcedureImpl.class,
		ConditionalDeleteStatusImpl.class, QuestionnaireItemTypeImpl.class, MeasureReportTypeImpl.class,
		MedicationAdministrationPerformerImpl.class, ImmunizationRecommendationDateCriterionImpl.class,
		CarePlanDetailImpl.class, ExplanationOfBenefitItemImpl.class, HealthcareServiceNotAvailableImpl.class,
		TestScriptOperationImpl.class, TestScriptDestinationImpl.class, ConsentStatusImpl.class,
		CarePlanStatusImpl.class, ResearchStudyArmImpl.class, ObservationStatusImpl.class,
		ImmunizationExplanationImpl.class, ActionConditionKindImpl.class, ChargeItemParticipantImpl.class,
		TestReportSetupImpl.class, GoalTargetImpl.class, CompositeMeasureScoringImpl.class, ContributorTypeImpl.class,
		RatioImpl.class, ResponseTypeImpl.class, ClinicalImpressionFindingImpl.class, DeviceRequestRequesterImpl.class,
		MeasurePopulationTypeImpl.class, ImplementationGuideDependencyImpl.class, CodeSystemFilterImpl.class,
		MeasureGroupImpl.class, SearchParamTypeImpl.class, ClaimRelatedImpl.class, SpecimenCollectionImpl.class,
		DeviceStatusImpl.class, ContractValuedItem1Impl.class, QuestionnaireEnableWhenImpl.class, MoneyImpl.class,
		HTTPVerbImpl.class, DosageInstructionImpl.class, CapabilityStatementEventImpl.class, TestScriptParam2Impl.class,
		TestScriptRuleImpl.class, ActionSelectionBehaviorImpl.class, ConceptMapDependsOnImpl.class,
		CapabilityStatementRestImpl.class, ElementDefinitionTypeImpl.class, ClaimResponseSubDetailImpl.class,
		EncounterLocationImpl.class, ElementDefinitionConstraintImpl.class, DeviceMetricCalibrationImpl.class,
		AppointmentStatusImpl.class, ExplanationOfBenefitInsuranceImpl.class, CountImpl.class,
		OperationParameterUseImpl.class, TestScriptOriginImpl.class, ExpansionProfileIncludeImpl.class,
		CodeSystemHierarchyMeaningImpl.class, IdentifierUseImpl.class, TestReportStatusImpl.class, ActionListImpl.class,
		TypeDerivationRuleImpl.class, ImagingManifestSeriesImpl.class, MessageHeaderSourceImpl.class, DateImpl.class,
		TriggerDefinitionImpl.class, AddressImpl.class, ConceptMapGroupImpl.class, CodeableConceptImpl.class,
		MessageSignificanceCategoryImpl.class, TaskOutputImpl.class, TimeImpl.class,
		ExplanationOfBenefitDetail1Impl.class, ConditionalReadStatusImpl.class, OrganizationContactImpl.class,
		ExplanationOfBenefitDetailImpl.class, AuditEventAgentImpl.class, ChargeItemStatusImpl.class,
		ValueSetIncludeImpl.class, TestScriptTeardownImpl.class, CompositionEventImpl.class,
		SystemRestfulInteractionImpl.class, QuantityImpl.class, EventCapabilityModeImpl.class,
		OperationOutcomeIssueImpl.class, ActivityDefinitionCategoryImpl.class, NutritionOrderAdministrationImpl.class,
		StructureMapStructureImpl.class, AuditEventDetailImpl.class, MeasmntPrincipleImpl.class, ClaimPayeeImpl.class,
		CarePlanIntentImpl.class, ExplanationOfBenefitRelatedImpl.class, SubstanceStatusImpl.class,
		CapabilityStatementOperationImpl.class, TestScriptRule1Impl.class, PositiveIntImpl.class,
		ClaimInsuranceImpl.class, OidImpl.class, PatientCommunicationImpl.class, VisionEyesImpl.class,
		DocumentModeImpl.class, ContractValuedItemImpl.class, BundleRequestImpl.class, PatientLinkImpl.class,
		TestScriptRequestHeaderImpl.class, ConsentActorImpl.class, SupplyDeliverySuppliedItemImpl.class,
		DeviceMetricCalibrationStateImpl.class, CodingImpl.class, TestScriptParam1Impl.class,
		MedicationPackageImpl.class, EpisodeOfCareStatusHistoryImpl.class, ContentTypeImpl.class,
		AllergyIntoleranceCriticalityImpl.class, ClaimResponseInsuranceImpl.class, AssertionDirectionTypeImpl.class,
		DistanceImpl.class, StructureMapSourceListModeImpl.class, ActionRequiredBehaviorImpl.class,
		FamilyHistoryStatusImpl.class, PropertyRepresentationImpl.class, ProcessResponseProcessNoteImpl.class,
		StructureDefinitionKindImpl.class, PractitionerRoleAvailableTimeImpl.class, AccountStatusImpl.class,
		InstantImpl.class, QuestionnaireStatusImpl.class, AssertionResponseTypesImpl.class, ConsentActor1Impl.class,
		ConditionVerificationStatusImpl.class, AllergyIntoleranceSeverityImpl.class, EncounterStatusImpl.class,
		StructureMapTargetListModeImpl.class, PropertyTypeImpl.class, AttachmentImpl.class,
		ProvenanceEntityRoleImpl.class, RequestGroupConditionImpl.class, DiagnosticReportStatusImpl.class,
		StructureDefinitionDifferentialImpl.class, ListModeImpl.class, SequenceVariantImpl.class,
		ClaimProcedureImpl.class, MedicationRequestPriorityImpl.class, ExtensionImpl.class, GroupTypeImpl.class,
		BundleTypeImpl.class, IdentityAssuranceLevelImpl.class, TestScriptLinkImpl.class, ContractFriendlyImpl.class,
		CarePlanActivityImpl.class, CompositionAttesterImpl.class, SequenceReferenceSeqImpl.class,
		VisionPrescriptionDispenseImpl.class, ClaimSubDetailImpl.class, CodeSystemConceptImpl.class, CodeImpl.class,
		UriImpl.class, BackboneElementImpl.class, TestReportActionImpl.class, ParameterDefinitionImpl.class,
		QuestionnaireItemImpl.class, CapabilityStatementSearchParamImpl.class, MedicationStatementStatusImpl.class,
		RelatedArtifactTypeImpl.class, SampledDataImpl.class, MeasureReportGroup2Impl.class, AddressUseImpl.class,
		QuestionnaireResponseAnswerImpl.class, ValueSetConceptImpl.class, NutritionOrderTextureImpl.class,
		MeasureReportStatusImpl.class, StructureMapSourceImpl.class, QuestionnaireResponseStatusImpl.class,
		CapabilityStatementInteractionImpl.class, CapabilityStatementResourceImpl.class,
		MeasureReportPopulationImpl.class, RangeImpl.class, DiagnosticReportPerformerImpl.class,
		MedicationRequestSubstitutionImpl.class, DecimalImpl.class, DataRequirementCodeFilterImpl.class,
		TestScriptParamImpl.class, MedicationAdministrationStatusImpl.class, ExplanationOfBenefitStatusImpl.class,
		BundleLinkImpl.class, ContractRuleImpl.class, TestScriptRule2Impl.class, AnnotationImpl.class,
		StructureMapInputModeImpl.class, NarrativeStatusImpl.class, ExpansionProfileExcludeImpl.class,
		StructureMapContextTypeImpl.class, RequestGroupRelatedActionImpl.class, ProcedurePerformerImpl.class,
		ValueSetContainsImpl.class, PractitionerRoleNotAvailableImpl.class, MedicationRequestStatusImpl.class,
		MedicationRequestDispenseRequestImpl.class, DeviceMetricCategoryImpl.class, SupplyDeliveryStatusImpl.class,
		MeasureStratifierImpl.class, ElementDefinitionSlicingImpl.class, ClaimItemImpl.class,
		ExpansionProfileDesignationImpl.class, CompartmentDefinitionResourceImpl.class, MarkdownImpl.class,
		DateTimeImpl.class, ImagingStudyInstanceImpl.class, NamingSystemTypeImpl.class,
		StructureMapGroupTypeModeImpl.class, ClaimResponseAdjudicationImpl.class, GroupCharacteristicImpl.class,
		QuestionnaireResponseItemImpl.class, ValueSetFilterImpl.class, RiskAssessmentPredictionImpl.class,
		OperationKindImpl.class, ExplanationOfBenefitAccidentImpl.class, CodeSystemPropertyImpl.class,
		AdverseEventSuspectEntityImpl.class, AgeImpl.class, ClaimDiagnosisImpl.class,
		ElementDefinitionExampleImpl.class, ClaimResponseDetail1Impl.class, DetectedIssueMitigationImpl.class,
		SequenceTypeImpl.class, CodeSystemContentModeImpl.class, TaskInputImpl.class,
		AllergyIntoleranceClinicalStatusImpl.class, MeasureDataUsageImpl.class, TestScriptMetadataImpl.class,
		ImplementationGuidePackageImpl.class, ConceptMapEquivalenceImpl.class, ElementDefinitionMappingImpl.class,
		EncounterClassHistoryImpl.class, ClaimResponsePaymentImpl.class, VisionBaseImpl.class,
		ExplanationOfBenefitSubDetailImpl.class, TimingRepeatImpl.class, ExpansionProfileExcludedSystemImpl.class,
		ImplementationGuidePageImpl.class, MedicationProductImpl.class, ProcedureFocalDeviceImpl.class,
		EpisodeOfCareStatusImpl.class, StructureDefinitionMappingImpl.class,
		DeviceComponentProductionSpecificationImpl.class, ReferenceImpl.class, GuideDependencyTypeImpl.class,
		SubscriptionChannelTypeImpl.class, AggregationModeImpl.class, ContractAgent1Impl.class,
		DocumentRelationshipTypeImpl.class, OperationDefinitionBindingImpl.class,
		FamilyMemberHistoryConditionImpl.class, CareTeamParticipantImpl.class, ClinicalImpressionStatusImpl.class,
		AuditEventOutcomeImpl.class, CodeSystemDesignationImpl.class, SearchEntryModeImpl.class,
		PaymentReconciliationProcessNoteImpl.class, NutritionOrderNutrientImpl.class,
		AuditEventAgentNetworkTypeImpl.class, ExplanationOfBenefitPayeeImpl.class, MedicationIngredientImpl.class,
		TestReportParticipantImpl.class, MedicationContentImpl.class, CatalogEntryImpl.class,
		QuantityComparatorImpl.class, EncounterLocationStatusImpl.class, ContactPointUseImpl.class,
		EndpointStatusImpl.class, MessageHeaderResponseImpl.class, ProcessRequestItemImpl.class, ContactPointImpl.class,
		MedicationStatusImpl.class, TestReportTeardownImpl.class, StructureMapTransformImpl.class,
		ReferenceVersionRulesImpl.class, TestScriptTestImpl.class, AccountGuarantorImpl.class, TaskRequesterImpl.class,
		RelatedArtifactImpl.class, TestScriptParam3Impl.class, DataElementStringencyImpl.class,
		ObservationRelatedImpl.class, ConditionEvidenceImpl.class, ClaimResponseProcessNoteImpl.class,
		MeasureReportGroupImpl.class, ReferenceHandlingPolicyImpl.class, SupplyRequestStatusImpl.class,
		ConceptMapTargetImpl.class, SignatureImpl.class, ListEntryImpl.class, ConditionStageImpl.class,
		TestReportParticipantTypeImpl.class, MeasureReportSupplementalDataImpl.class, ResourceVersionPolicyImpl.class,
		RestfulCapabilityModeImpl.class, TaskRestrictionImpl.class, AuditEventNetworkImpl.class,
		MedicationDispenseSubstitutionImpl.class, ExplanationOfBenefitCareTeamImpl.class,
		MedicationRequestRequesterImpl.class, AllergyIntoleranceTypeImpl.class, ActionPrecheckBehaviorImpl.class,
		AuditEventActionImpl.class, TestScriptCapabilityImpl.class, PlanDefinitionConditionImpl.class,
		ElementDefinitionImpl.class, ExpansionProfileFixedVersionImpl.class, DataRequirementImpl.class,
		ResearchSubjectStatusImpl.class, StructureMapDependentImpl.class, ElementDefinitionBindingImpl.class,
		CommunicationRequestPayloadImpl.class, PlanDefinitionActionDefinitionImpl.class, LocationPositionImpl.class,
		MedicationDispenseStatusImpl.class, EncounterStatusHistoryImpl.class, DocumentReferenceRelatesToImpl.class,
		DigitalMediaTypeImpl.class, GuidanceResponseStatusImpl.class, NutritionOrderSupplementImpl.class,
		PersonLinkImpl.class, TestScriptRulesetImpl.class, DeviceMetricCalibrationTypeImpl.class,
		CompositionSectionImpl.class, CapabilityStatementSecurityImpl.class, TestReportAction1Impl.class,
		NoteTypeImpl.class, SubscriptionStatusImpl.class, NamingSystemIdentifierTypeImpl.class,
		MeasureSupplementalDataImpl.class, ResearchStudyStatusImpl.class, ContributorImpl.class,
		ExplanationOfBenefitPaymentImpl.class, CapabilityStatementMessagingImpl.class, EventTimingImpl.class,
		NutritionOrderOralDietImpl.class, MessageDefinitionAllowedResponseImpl.class,
		ImmunizationVaccinationProtocolImpl.class, EncounterHospitalizationImpl.class, ConsentExceptImpl.class,
		HealthcareServiceAvailableTimeImpl.class, CapabilityStatementImplementationImpl.class, MeasureScoringImpl.class,
		ExplanationOfBenefitAdjudicationImpl.class, TimingImpl.class, DocumentManifestRelatedImpl.class,
		ImplementationGuideResourceImpl.class, MedicationAdministrationDosageImpl.class, ContactDetailImpl.class,
		NutritionOrderEnteralFormulaImpl.class, LinkageTypeImpl.class, ClaimInformationImpl.class,
		CodeSystemProperty1Impl.class, SequenceRepositoryImpl.class, MessageDefinitionFocusImpl.class,
		ImagingManifestInstanceImpl.class, TestScriptFixtureImpl.class, GuidePageKindImpl.class,
		SearchModifierCodeImpl.class, SequenceQualityImpl.class, ActionParticipantTypeImpl.class, ListStatusImpl.class,
		LocationModeImpl.class, CommunicationPayloadImpl.class, SubscriptionChannelImpl.class,
		ProcedureStatusImpl.class, DataElementMappingImpl.class, ParticipantRequiredImpl.class, ConsentDataImpl.class,
		SpecimenContainerImpl.class, ImplementationGuideGlobalImpl.class, SlotStatusImpl.class, IssueSeverityImpl.class,
		TestReportTestImpl.class, ClaimResponseAddItemImpl.class, ContractSignerImpl.class,
		DocumentReferenceStatusImpl.class, ConstraintSeverityImpl.class, AppointmentParticipantImpl.class,
		TestScriptSetupImpl.class, CompositionStatusImpl.class, ContractTermImpl.class,
		ExpansionProfileDesignation2Impl.class, PlanDefinitionRelatedActionImpl.class, ObservationComponentImpl.class,
		TaskStatusImpl.class, SystemVersionProcessingModeImpl.class, UuidImpl.class,
		CapabilityStatementSoftwareImpl.class, TestReportActionResultImpl.class, SupplyRequestWhenImpl.class,
		AllergyIntoleranceReactionImpl.class, StructureMapInputImpl.class, ExplanationOfBenefitProcessNoteImpl.class,
		NarrativeImpl.class, EligibilityResponseBenefitBalanceImpl.class, MeasurePopulationImpl.class,
		ClinicalImpressionInvestigationImpl.class, CompositionAttestationModeImpl.class, ClaimAccidentImpl.class,
		MedicationStatementTakenImpl.class, DurationImpl.class, ValueSetExpansionImpl.class,
		AllergyIntoleranceVerificationStatusImpl.class, TestScriptActionImpl.class, DataRequirementDateFilterImpl.class,
		TriggerTypeImpl.class, CareTeamStatusImpl.class, ActivityDefinitionDynamicValueImpl.class,
		InstanceAvailabilityImpl.class, TypeRestfulInteractionImpl.class, ElementDefinitionBaseImpl.class,
		AdverseEventCategoryImpl.class, ParametersParameterImpl.class, ImagingManifestStudyImpl.class,
		ContactPointSystemImpl.class, AuditEventSourceImpl.class, CapabilityStatementEndpointImpl.class,
		DocumentReferenceContentImpl.class, TestScriptAction2Impl.class, MeasureReportPopulation1Impl.class,
		LocationStatusImpl.class, TestScriptRuleset1Impl.class, GroupMemberImpl.class, QuestionnaireOptionImpl.class,
		StructureMapParameterImpl.class, DaysOfWeekImpl.class, CapabilityStatementDocumentImpl.class,
		ActionGroupingBehaviorImpl.class, OperationDefinitionOverloadImpl.class, SubstanceIngredientImpl.class,
		StructureMapTargetImpl.class, BundleEntryImpl.class, ClaimCareTeamImpl.class,
		MedicationDispensePerformerImpl.class, EncounterParticipantImpl.class, UsageContextImpl.class,
		EligibilityResponseFinancialImpl.class, FilterOperatorImpl.class, NameUseImpl.class, ProvenanceEntityImpl.class,
		CompartmentTypeImpl.class, IdImpl.class, CapabilityStatementKindImpl.class, SpecimenProcessingImpl.class,
		BundleSearchImpl.class, CatalogDocumentImpl.class, BooleanImpl.class, IdentifierImpl.class,
		UnitsOfTimeImpl.class, DiagnosticReportImageImpl.class, MessageHeaderDestinationImpl.class,
		UnknownContentCodeImpl.class, BindingStrengthImpl.class, SubstanceInstanceImpl.class,
		PaymentReconciliationDetailImpl.class, ValueSetDesignationImpl.class, XPathUsageTypeImpl.class,
		AdministrativeGenderImpl.class, NamingSystemUniqueIdImpl.class, ProvenanceAgentImpl.class,
		StructureMapModelModeImpl.class, IssueTypeImpl.class, DocumentReferenceRelatedImpl.class,
		SearchComparatorImpl.class, ExpansionProfileDesignation1Impl.class, PatientAnimalImpl.class,
		TestReportResultImpl.class, FlagStatusImpl.class })
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
