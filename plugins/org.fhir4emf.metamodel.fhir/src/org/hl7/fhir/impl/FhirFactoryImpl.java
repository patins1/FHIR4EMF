/**
 */
package org.hl7.fhir.impl;

import java.math.BigDecimal;
import java.math.BigInteger;

import javax.xml.datatype.XMLGregorianCalendar;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EDataType;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.impl.EFactoryImpl;

import org.eclipse.emf.ecore.plugin.EcorePlugin;

import org.eclipse.emf.ecore.util.Diagnostician;

import org.eclipse.emf.ecore.xml.type.XMLTypeFactory;
import org.eclipse.emf.ecore.xml.type.XMLTypePackage;

import org.hl7.fhir.Account;
import org.hl7.fhir.AccountCoverage;
import org.hl7.fhir.AccountGuarantor;
import org.hl7.fhir.AccountStatus;
import org.hl7.fhir.AccountStatusList;
import org.hl7.fhir.ActionCardinalityBehavior;
import org.hl7.fhir.ActionCardinalityBehaviorList;
import org.hl7.fhir.ActionConditionKind;
import org.hl7.fhir.ActionConditionKindList;
import org.hl7.fhir.ActionGroupingBehavior;
import org.hl7.fhir.ActionGroupingBehaviorList;
import org.hl7.fhir.ActionList;
import org.hl7.fhir.ActionListList;
import org.hl7.fhir.ActionParticipantType;
import org.hl7.fhir.ActionParticipantTypeList;
import org.hl7.fhir.ActionPrecheckBehavior;
import org.hl7.fhir.ActionPrecheckBehaviorList;
import org.hl7.fhir.ActionRelationshipType;
import org.hl7.fhir.ActionRelationshipTypeList;
import org.hl7.fhir.ActionRequiredBehavior;
import org.hl7.fhir.ActionRequiredBehaviorList;
import org.hl7.fhir.ActionSelectionBehavior;
import org.hl7.fhir.ActionSelectionBehaviorList;
import org.hl7.fhir.ActivityDefinition;
import org.hl7.fhir.ActivityDefinitionDynamicValue;
import org.hl7.fhir.ActivityDefinitionParticipant;
import org.hl7.fhir.Address;
import org.hl7.fhir.AddressType;
import org.hl7.fhir.AddressTypeList;
import org.hl7.fhir.AddressUse;
import org.hl7.fhir.AddressUseList;
import org.hl7.fhir.AdministrativeGender;
import org.hl7.fhir.AdministrativeGenderList;
import org.hl7.fhir.AdverseEvent;
import org.hl7.fhir.AdverseEventCategory;
import org.hl7.fhir.AdverseEventCategoryList;
import org.hl7.fhir.AdverseEventCausality;
import org.hl7.fhir.AdverseEventCausalityList;
import org.hl7.fhir.AdverseEventSuspectEntity;
import org.hl7.fhir.Age;
import org.hl7.fhir.AggregationMode;
import org.hl7.fhir.AggregationModeList;
import org.hl7.fhir.AllergyIntolerance;
import org.hl7.fhir.AllergyIntoleranceCategory;
import org.hl7.fhir.AllergyIntoleranceCategoryList;
import org.hl7.fhir.AllergyIntoleranceClinicalStatus;
import org.hl7.fhir.AllergyIntoleranceClinicalStatusList;
import org.hl7.fhir.AllergyIntoleranceCriticality;
import org.hl7.fhir.AllergyIntoleranceCriticalityList;
import org.hl7.fhir.AllergyIntoleranceReaction;
import org.hl7.fhir.AllergyIntoleranceSeverity;
import org.hl7.fhir.AllergyIntoleranceSeverityList;
import org.hl7.fhir.AllergyIntoleranceType;
import org.hl7.fhir.AllergyIntoleranceTypeList;
import org.hl7.fhir.AllergyIntoleranceVerificationStatus;
import org.hl7.fhir.AllergyIntoleranceVerificationStatusList;
import org.hl7.fhir.Annotation;
import org.hl7.fhir.Appointment;
import org.hl7.fhir.AppointmentParticipant;
import org.hl7.fhir.AppointmentResponse;
import org.hl7.fhir.AppointmentStatus;
import org.hl7.fhir.AppointmentStatusList;
import org.hl7.fhir.AssertionDirectionType;
import org.hl7.fhir.AssertionDirectionTypeList;
import org.hl7.fhir.AssertionOperatorType;
import org.hl7.fhir.AssertionOperatorTypeList;
import org.hl7.fhir.AssertionResponseTypes;
import org.hl7.fhir.AssertionResponseTypesList;
import org.hl7.fhir.Attachment;
import org.hl7.fhir.AuditEvent;
import org.hl7.fhir.AuditEventAction;
import org.hl7.fhir.AuditEventActionList;
import org.hl7.fhir.AuditEventAgent;
import org.hl7.fhir.AuditEventAgentNetworkType;
import org.hl7.fhir.AuditEventAgentNetworkTypeList;
import org.hl7.fhir.AuditEventDetail;
import org.hl7.fhir.AuditEventEntity;
import org.hl7.fhir.AuditEventNetwork;
import org.hl7.fhir.AuditEventOutcome;
import org.hl7.fhir.AuditEventOutcomeList;
import org.hl7.fhir.AuditEventSource;
import org.hl7.fhir.BackboneElement;
import org.hl7.fhir.Base64Binary;
import org.hl7.fhir.Basic;
import org.hl7.fhir.Binary;
import org.hl7.fhir.BindingStrength;
import org.hl7.fhir.BindingStrengthList;
import org.hl7.fhir.BodySite;
import org.hl7.fhir.Bundle;
import org.hl7.fhir.BundleEntry;
import org.hl7.fhir.BundleLink;
import org.hl7.fhir.BundleRequest;
import org.hl7.fhir.BundleResponse;
import org.hl7.fhir.BundleSearch;
import org.hl7.fhir.BundleType;
import org.hl7.fhir.BundleTypeList;
import org.hl7.fhir.CapabilityStatement;
import org.hl7.fhir.CapabilityStatementCertificate;
import org.hl7.fhir.CapabilityStatementDocument;
import org.hl7.fhir.CapabilityStatementEndpoint;
import org.hl7.fhir.CapabilityStatementEvent;
import org.hl7.fhir.CapabilityStatementImplementation;
import org.hl7.fhir.CapabilityStatementInteraction;
import org.hl7.fhir.CapabilityStatementInteraction1;
import org.hl7.fhir.CapabilityStatementKind;
import org.hl7.fhir.CapabilityStatementKindList;
import org.hl7.fhir.CapabilityStatementMessaging;
import org.hl7.fhir.CapabilityStatementOperation;
import org.hl7.fhir.CapabilityStatementResource;
import org.hl7.fhir.CapabilityStatementRest;
import org.hl7.fhir.CapabilityStatementSearchParam;
import org.hl7.fhir.CapabilityStatementSecurity;
import org.hl7.fhir.CapabilityStatementSoftware;
import org.hl7.fhir.CapabilityStatementSupportedMessage;
import org.hl7.fhir.CarePlan;
import org.hl7.fhir.CarePlanActivity;
import org.hl7.fhir.CarePlanActivityStatus;
import org.hl7.fhir.CarePlanActivityStatusList;
import org.hl7.fhir.CarePlanDetail;
import org.hl7.fhir.CarePlanIntent;
import org.hl7.fhir.CarePlanIntentList;
import org.hl7.fhir.CarePlanStatus;
import org.hl7.fhir.CarePlanStatusList;
import org.hl7.fhir.CareTeam;
import org.hl7.fhir.CareTeamParticipant;
import org.hl7.fhir.CareTeamStatus;
import org.hl7.fhir.CareTeamStatusList;
import org.hl7.fhir.ChargeItem;
import org.hl7.fhir.ChargeItemParticipant;
import org.hl7.fhir.ChargeItemStatus;
import org.hl7.fhir.ChargeItemStatusList;
import org.hl7.fhir.Claim;
import org.hl7.fhir.ClaimAccident;
import org.hl7.fhir.ClaimCareTeam;
import org.hl7.fhir.ClaimDetail;
import org.hl7.fhir.ClaimDiagnosis;
import org.hl7.fhir.ClaimInformation;
import org.hl7.fhir.ClaimInsurance;
import org.hl7.fhir.ClaimItem;
import org.hl7.fhir.ClaimPayee;
import org.hl7.fhir.ClaimProcedure;
import org.hl7.fhir.ClaimRelated;
import org.hl7.fhir.ClaimResponse;
import org.hl7.fhir.ClaimResponseAddItem;
import org.hl7.fhir.ClaimResponseAdjudication;
import org.hl7.fhir.ClaimResponseDetail;
import org.hl7.fhir.ClaimResponseDetail1;
import org.hl7.fhir.ClaimResponseError;
import org.hl7.fhir.ClaimResponseInsurance;
import org.hl7.fhir.ClaimResponseItem;
import org.hl7.fhir.ClaimResponsePayment;
import org.hl7.fhir.ClaimResponseProcessNote;
import org.hl7.fhir.ClaimResponseSubDetail;
import org.hl7.fhir.ClaimSubDetail;
import org.hl7.fhir.ClinicalImpression;
import org.hl7.fhir.ClinicalImpressionFinding;
import org.hl7.fhir.ClinicalImpressionInvestigation;
import org.hl7.fhir.ClinicalImpressionStatus;
import org.hl7.fhir.ClinicalImpressionStatusList;
import org.hl7.fhir.Code;
import org.hl7.fhir.CodeSystem;
import org.hl7.fhir.CodeSystemConcept;
import org.hl7.fhir.CodeSystemContentMode;
import org.hl7.fhir.CodeSystemContentModeList;
import org.hl7.fhir.CodeSystemDesignation;
import org.hl7.fhir.CodeSystemFilter;
import org.hl7.fhir.CodeSystemHierarchyMeaning;
import org.hl7.fhir.CodeSystemHierarchyMeaningList;
import org.hl7.fhir.CodeSystemProperty;
import org.hl7.fhir.CodeSystemProperty1;
import org.hl7.fhir.CodeableConcept;
import org.hl7.fhir.Coding;
import org.hl7.fhir.Communication;
import org.hl7.fhir.CommunicationPayload;
import org.hl7.fhir.CommunicationRequest;
import org.hl7.fhir.CommunicationRequestPayload;
import org.hl7.fhir.CommunicationRequestRequester;
import org.hl7.fhir.CompartmentDefinition;
import org.hl7.fhir.CompartmentDefinitionResource;
import org.hl7.fhir.CompartmentType;
import org.hl7.fhir.CompartmentTypeList;
import org.hl7.fhir.Composition;
import org.hl7.fhir.CompositionAttestationMode;
import org.hl7.fhir.CompositionAttestationModeList;
import org.hl7.fhir.CompositionAttester;
import org.hl7.fhir.CompositionEvent;
import org.hl7.fhir.CompositionRelatesTo;
import org.hl7.fhir.CompositionSection;
import org.hl7.fhir.CompositionStatus;
import org.hl7.fhir.CompositionStatusList;
import org.hl7.fhir.ConceptMap;
import org.hl7.fhir.ConceptMapDependsOn;
import org.hl7.fhir.ConceptMapElement;
import org.hl7.fhir.ConceptMapEquivalence;
import org.hl7.fhir.ConceptMapEquivalenceList;
import org.hl7.fhir.ConceptMapGroup;
import org.hl7.fhir.ConceptMapGroupUnmappedMode;
import org.hl7.fhir.ConceptMapGroupUnmappedModeList;
import org.hl7.fhir.ConceptMapTarget;
import org.hl7.fhir.ConceptMapUnmapped;
import org.hl7.fhir.Condition;
import org.hl7.fhir.ConditionClinicalStatusCodes;
import org.hl7.fhir.ConditionClinicalStatusCodesList;
import org.hl7.fhir.ConditionEvidence;
import org.hl7.fhir.ConditionStage;
import org.hl7.fhir.ConditionVerificationStatus;
import org.hl7.fhir.ConditionVerificationStatusList;
import org.hl7.fhir.ConditionalDeleteStatus;
import org.hl7.fhir.ConditionalDeleteStatusList;
import org.hl7.fhir.ConditionalReadStatus;
import org.hl7.fhir.ConditionalReadStatusList;
import org.hl7.fhir.ConfidentialityClassification;
import org.hl7.fhir.ConfidentialityClassificationList;
import org.hl7.fhir.Consent;
import org.hl7.fhir.ConsentActor;
import org.hl7.fhir.ConsentActor1;
import org.hl7.fhir.ConsentData;
import org.hl7.fhir.ConsentData1;
import org.hl7.fhir.ConsentDataMeaning;
import org.hl7.fhir.ConsentDataMeaningList;
import org.hl7.fhir.ConsentExcept;
import org.hl7.fhir.ConsentExceptType;
import org.hl7.fhir.ConsentExceptTypeList;
import org.hl7.fhir.ConsentPolicy;
import org.hl7.fhir.ConsentState;
import org.hl7.fhir.ConsentStateList;
import org.hl7.fhir.ConstraintSeverity;
import org.hl7.fhir.ConstraintSeverityList;
import org.hl7.fhir.ContactDetail;
import org.hl7.fhir.ContactPoint;
import org.hl7.fhir.ContactPointSystem;
import org.hl7.fhir.ContactPointSystemList;
import org.hl7.fhir.ContactPointUse;
import org.hl7.fhir.ContactPointUseList;
import org.hl7.fhir.ContentType;
import org.hl7.fhir.ContentTypeList;
import org.hl7.fhir.Contract;
import org.hl7.fhir.ContractAgent;
import org.hl7.fhir.ContractAgent1;
import org.hl7.fhir.ContractFriendly;
import org.hl7.fhir.ContractLegal;
import org.hl7.fhir.ContractResourceStatusCodes;
import org.hl7.fhir.ContractResourceStatusCodesList;
import org.hl7.fhir.ContractRule;
import org.hl7.fhir.ContractSigner;
import org.hl7.fhir.ContractTerm;
import org.hl7.fhir.ContractValuedItem;
import org.hl7.fhir.ContractValuedItem1;
import org.hl7.fhir.Contributor;
import org.hl7.fhir.ContributorType;
import org.hl7.fhir.ContributorTypeList;
import org.hl7.fhir.Count;
import org.hl7.fhir.Coverage;
import org.hl7.fhir.CoverageGrouping;
import org.hl7.fhir.DataElement;
import org.hl7.fhir.DataElementMapping;
import org.hl7.fhir.DataElementStringency;
import org.hl7.fhir.DataElementStringencyList;
import org.hl7.fhir.DataRequirement;
import org.hl7.fhir.DataRequirementCodeFilter;
import org.hl7.fhir.DataRequirementDateFilter;
import org.hl7.fhir.Date;
import org.hl7.fhir.DateTime;
import org.hl7.fhir.DaysOfWeek;
import org.hl7.fhir.DaysOfWeekList;
import org.hl7.fhir.Decimal;
import org.hl7.fhir.DetectedIssue;
import org.hl7.fhir.DetectedIssueMitigation;
import org.hl7.fhir.DetectedIssueSeverity;
import org.hl7.fhir.DetectedIssueSeverityList;
import org.hl7.fhir.Device;
import org.hl7.fhir.DeviceComponent;
import org.hl7.fhir.DeviceComponentProductionSpecification;
import org.hl7.fhir.DeviceMetric;
import org.hl7.fhir.DeviceMetricCalibration;
import org.hl7.fhir.DeviceMetricCalibrationState;
import org.hl7.fhir.DeviceMetricCalibrationStateList;
import org.hl7.fhir.DeviceMetricCalibrationType;
import org.hl7.fhir.DeviceMetricCalibrationTypeList;
import org.hl7.fhir.DeviceMetricCategory;
import org.hl7.fhir.DeviceMetricCategoryList;
import org.hl7.fhir.DeviceMetricColor;
import org.hl7.fhir.DeviceMetricColorList;
import org.hl7.fhir.DeviceMetricOperationalStatus;
import org.hl7.fhir.DeviceMetricOperationalStatusList;
import org.hl7.fhir.DeviceRequest;
import org.hl7.fhir.DeviceRequestRequester;
import org.hl7.fhir.DeviceUdi;
import org.hl7.fhir.DeviceUseStatement;
import org.hl7.fhir.DeviceUseStatementStatus;
import org.hl7.fhir.DeviceUseStatementStatusList;
import org.hl7.fhir.DiagnosticReport;
import org.hl7.fhir.DiagnosticReportImage;
import org.hl7.fhir.DiagnosticReportPerformer;
import org.hl7.fhir.DiagnosticReportStatus;
import org.hl7.fhir.DiagnosticReportStatusList;
import org.hl7.fhir.DigitalMediaType;
import org.hl7.fhir.DigitalMediaTypeList;
import org.hl7.fhir.DiscriminatorType;
import org.hl7.fhir.DiscriminatorTypeList;
import org.hl7.fhir.Distance;
import org.hl7.fhir.DocumentManifest;
import org.hl7.fhir.DocumentManifestContent;
import org.hl7.fhir.DocumentManifestRelated;
import org.hl7.fhir.DocumentMode;
import org.hl7.fhir.DocumentModeList;
import org.hl7.fhir.DocumentReference;
import org.hl7.fhir.DocumentReferenceContent;
import org.hl7.fhir.DocumentReferenceContext;
import org.hl7.fhir.DocumentReferenceRelated;
import org.hl7.fhir.DocumentReferenceRelatesTo;
import org.hl7.fhir.DocumentReferenceStatus;
import org.hl7.fhir.DocumentReferenceStatusList;
import org.hl7.fhir.DocumentRelationshipType;
import org.hl7.fhir.DocumentRelationshipTypeList;
import org.hl7.fhir.DocumentRoot;
import org.hl7.fhir.DomainResource;
import org.hl7.fhir.Dosage;
import org.hl7.fhir.Duration;
import org.hl7.fhir.Element;
import org.hl7.fhir.ElementDefinition;
import org.hl7.fhir.ElementDefinitionBase;
import org.hl7.fhir.ElementDefinitionBinding;
import org.hl7.fhir.ElementDefinitionConstraint;
import org.hl7.fhir.ElementDefinitionDiscriminator;
import org.hl7.fhir.ElementDefinitionExample;
import org.hl7.fhir.ElementDefinitionMapping;
import org.hl7.fhir.ElementDefinitionSlicing;
import org.hl7.fhir.ElementDefinitionType;
import org.hl7.fhir.EligibilityRequest;
import org.hl7.fhir.EligibilityResponse;
import org.hl7.fhir.EligibilityResponseBenefitBalance;
import org.hl7.fhir.EligibilityResponseError;
import org.hl7.fhir.EligibilityResponseFinancial;
import org.hl7.fhir.EligibilityResponseInsurance;
import org.hl7.fhir.Encounter;
import org.hl7.fhir.EncounterClassHistory;
import org.hl7.fhir.EncounterDiagnosis;
import org.hl7.fhir.EncounterHospitalization;
import org.hl7.fhir.EncounterLocation;
import org.hl7.fhir.EncounterLocationStatus;
import org.hl7.fhir.EncounterLocationStatusList;
import org.hl7.fhir.EncounterParticipant;
import org.hl7.fhir.EncounterStatus;
import org.hl7.fhir.EncounterStatusHistory;
import org.hl7.fhir.EncounterStatusList;
import org.hl7.fhir.Endpoint;
import org.hl7.fhir.EndpointStatus;
import org.hl7.fhir.EndpointStatusList;
import org.hl7.fhir.EnrollmentRequest;
import org.hl7.fhir.EnrollmentResponse;
import org.hl7.fhir.EpisodeOfCare;
import org.hl7.fhir.EpisodeOfCareDiagnosis;
import org.hl7.fhir.EpisodeOfCareStatus;
import org.hl7.fhir.EpisodeOfCareStatusHistory;
import org.hl7.fhir.EpisodeOfCareStatusList;
import org.hl7.fhir.EventCapabilityMode;
import org.hl7.fhir.EventCapabilityModeList;
import org.hl7.fhir.EventStatus;
import org.hl7.fhir.EventStatusList;
import org.hl7.fhir.EventTiming;
import org.hl7.fhir.EventTimingList;
import org.hl7.fhir.ExpansionProfile;
import org.hl7.fhir.ExpansionProfileDesignation;
import org.hl7.fhir.ExpansionProfileDesignation1;
import org.hl7.fhir.ExpansionProfileDesignation2;
import org.hl7.fhir.ExpansionProfileExclude;
import org.hl7.fhir.ExpansionProfileExcludedSystem;
import org.hl7.fhir.ExpansionProfileFixedVersion;
import org.hl7.fhir.ExpansionProfileInclude;
import org.hl7.fhir.ExplanationOfBenefit;
import org.hl7.fhir.ExplanationOfBenefitAccident;
import org.hl7.fhir.ExplanationOfBenefitAddItem;
import org.hl7.fhir.ExplanationOfBenefitAdjudication;
import org.hl7.fhir.ExplanationOfBenefitBenefitBalance;
import org.hl7.fhir.ExplanationOfBenefitCareTeam;
import org.hl7.fhir.ExplanationOfBenefitDetail;
import org.hl7.fhir.ExplanationOfBenefitDetail1;
import org.hl7.fhir.ExplanationOfBenefitDiagnosis;
import org.hl7.fhir.ExplanationOfBenefitFinancial;
import org.hl7.fhir.ExplanationOfBenefitInformation;
import org.hl7.fhir.ExplanationOfBenefitInsurance;
import org.hl7.fhir.ExplanationOfBenefitItem;
import org.hl7.fhir.ExplanationOfBenefitPayee;
import org.hl7.fhir.ExplanationOfBenefitPayment;
import org.hl7.fhir.ExplanationOfBenefitProcedure;
import org.hl7.fhir.ExplanationOfBenefitProcessNote;
import org.hl7.fhir.ExplanationOfBenefitRelated;
import org.hl7.fhir.ExplanationOfBenefitStatus;
import org.hl7.fhir.ExplanationOfBenefitStatusList;
import org.hl7.fhir.ExplanationOfBenefitSubDetail;
import org.hl7.fhir.Extension;
import org.hl7.fhir.ExtensionContext;
import org.hl7.fhir.ExtensionContextList;
import org.hl7.fhir.FHIRAllTypes;
import org.hl7.fhir.FHIRAllTypesList;
import org.hl7.fhir.FHIRDefinedType;
import org.hl7.fhir.FHIRDefinedTypeList;
import org.hl7.fhir.FHIRDeviceStatus;
import org.hl7.fhir.FHIRDeviceStatusList;
import org.hl7.fhir.FHIRSubstanceStatus;
import org.hl7.fhir.FHIRSubstanceStatusList;
import org.hl7.fhir.FamilyHistoryStatus;
import org.hl7.fhir.FamilyHistoryStatusList;
import org.hl7.fhir.FamilyMemberHistory;
import org.hl7.fhir.FamilyMemberHistoryCondition;
import org.hl7.fhir.FhirFactory;
import org.hl7.fhir.FhirPackage;
import org.hl7.fhir.FilterOperator;
import org.hl7.fhir.FilterOperatorList;
import org.hl7.fhir.FinancialResourceStatusCodes;
import org.hl7.fhir.FinancialResourceStatusCodesList;
import org.hl7.fhir.Flag;
import org.hl7.fhir.FlagStatus;
import org.hl7.fhir.FlagStatusList;
import org.hl7.fhir.Goal;
import org.hl7.fhir.GoalStatus;
import org.hl7.fhir.GoalStatusList;
import org.hl7.fhir.GoalTarget;
import org.hl7.fhir.GraphCompartmentRule;
import org.hl7.fhir.GraphCompartmentRuleList;
import org.hl7.fhir.GraphDefinition;
import org.hl7.fhir.GraphDefinitionCompartment;
import org.hl7.fhir.GraphDefinitionLink;
import org.hl7.fhir.GraphDefinitionTarget;
import org.hl7.fhir.Group;
import org.hl7.fhir.GroupCharacteristic;
import org.hl7.fhir.GroupMember;
import org.hl7.fhir.GroupType;
import org.hl7.fhir.GroupTypeList;
import org.hl7.fhir.GuidanceResponse;
import org.hl7.fhir.GuidanceResponseStatus;
import org.hl7.fhir.GuidanceResponseStatusList;
import org.hl7.fhir.GuideDependencyType;
import org.hl7.fhir.GuideDependencyTypeList;
import org.hl7.fhir.GuidePageKind;
import org.hl7.fhir.GuidePageKindList;
import org.hl7.fhir.HTTPVerb;
import org.hl7.fhir.HTTPVerbList;
import org.hl7.fhir.HealthcareService;
import org.hl7.fhir.HealthcareServiceAvailableTime;
import org.hl7.fhir.HealthcareServiceNotAvailable;
import org.hl7.fhir.HumanName;
import org.hl7.fhir.Id;
import org.hl7.fhir.Identifier;
import org.hl7.fhir.IdentifierUse;
import org.hl7.fhir.IdentifierUseList;
import org.hl7.fhir.IdentityAssuranceLevel;
import org.hl7.fhir.IdentityAssuranceLevelList;
import org.hl7.fhir.ImagingManifest;
import org.hl7.fhir.ImagingManifestInstance;
import org.hl7.fhir.ImagingManifestSeries;
import org.hl7.fhir.ImagingManifestStudy;
import org.hl7.fhir.ImagingStudy;
import org.hl7.fhir.ImagingStudyInstance;
import org.hl7.fhir.ImagingStudySeries;
import org.hl7.fhir.Immunization;
import org.hl7.fhir.ImmunizationExplanation;
import org.hl7.fhir.ImmunizationPractitioner;
import org.hl7.fhir.ImmunizationReaction;
import org.hl7.fhir.ImmunizationRecommendation;
import org.hl7.fhir.ImmunizationRecommendationDateCriterion;
import org.hl7.fhir.ImmunizationRecommendationProtocol;
import org.hl7.fhir.ImmunizationRecommendationRecommendation;
import org.hl7.fhir.ImmunizationStatusCodes;
import org.hl7.fhir.ImmunizationStatusCodesList;
import org.hl7.fhir.ImmunizationVaccinationProtocol;
import org.hl7.fhir.ImplementationGuide;
import org.hl7.fhir.ImplementationGuideDependency;
import org.hl7.fhir.ImplementationGuideGlobal;
import org.hl7.fhir.ImplementationGuidePackage;
import org.hl7.fhir.ImplementationGuidePage;
import org.hl7.fhir.ImplementationGuideResource;
import org.hl7.fhir.InstanceAvailability;
import org.hl7.fhir.InstanceAvailabilityList;
import org.hl7.fhir.Instant;
import org.hl7.fhir.IssueSeverity;
import org.hl7.fhir.IssueSeverityList;
import org.hl7.fhir.IssueType;
import org.hl7.fhir.IssueTypeList;
import org.hl7.fhir.Library;
import org.hl7.fhir.LinkType;
import org.hl7.fhir.LinkTypeList;
import org.hl7.fhir.Linkage;
import org.hl7.fhir.LinkageItem;
import org.hl7.fhir.LinkageType;
import org.hl7.fhir.LinkageTypeList;
import org.hl7.fhir.List;
import org.hl7.fhir.ListEntry;
import org.hl7.fhir.ListMode;
import org.hl7.fhir.ListModeList;
import org.hl7.fhir.ListStatus;
import org.hl7.fhir.ListStatusList;
import org.hl7.fhir.Location;
import org.hl7.fhir.LocationMode;
import org.hl7.fhir.LocationModeList;
import org.hl7.fhir.LocationPosition;
import org.hl7.fhir.LocationStatus;
import org.hl7.fhir.LocationStatusList;
import org.hl7.fhir.Markdown;
import org.hl7.fhir.MeasmntPrinciple;
import org.hl7.fhir.MeasmntPrincipleList;
import org.hl7.fhir.Measure;
import org.hl7.fhir.MeasureGroup;
import org.hl7.fhir.MeasurePopulation;
import org.hl7.fhir.MeasureReport;
import org.hl7.fhir.MeasureReportGroup;
import org.hl7.fhir.MeasureReportPopulation;
import org.hl7.fhir.MeasureReportPopulation1;
import org.hl7.fhir.MeasureReportStatus;
import org.hl7.fhir.MeasureReportStatusList;
import org.hl7.fhir.MeasureReportStratifier;
import org.hl7.fhir.MeasureReportStratum;
import org.hl7.fhir.MeasureReportType;
import org.hl7.fhir.MeasureReportTypeList;
import org.hl7.fhir.MeasureStratifier;
import org.hl7.fhir.MeasureSupplementalData;
import org.hl7.fhir.Media;
import org.hl7.fhir.Medication;
import org.hl7.fhir.MedicationAdministration;
import org.hl7.fhir.MedicationAdministrationDosage;
import org.hl7.fhir.MedicationAdministrationPerformer;
import org.hl7.fhir.MedicationAdministrationStatus;
import org.hl7.fhir.MedicationAdministrationStatusList;
import org.hl7.fhir.MedicationBatch;
import org.hl7.fhir.MedicationContent;
import org.hl7.fhir.MedicationDispense;
import org.hl7.fhir.MedicationDispensePerformer;
import org.hl7.fhir.MedicationDispenseStatus;
import org.hl7.fhir.MedicationDispenseStatusList;
import org.hl7.fhir.MedicationDispenseSubstitution;
import org.hl7.fhir.MedicationIngredient;
import org.hl7.fhir.MedicationPackage;
import org.hl7.fhir.MedicationRequest;
import org.hl7.fhir.MedicationRequestDispenseRequest;
import org.hl7.fhir.MedicationRequestIntent;
import org.hl7.fhir.MedicationRequestIntentList;
import org.hl7.fhir.MedicationRequestPriority;
import org.hl7.fhir.MedicationRequestPriorityList;
import org.hl7.fhir.MedicationRequestRequester;
import org.hl7.fhir.MedicationRequestStatus;
import org.hl7.fhir.MedicationRequestStatusList;
import org.hl7.fhir.MedicationRequestSubstitution;
import org.hl7.fhir.MedicationStatement;
import org.hl7.fhir.MedicationStatementStatus;
import org.hl7.fhir.MedicationStatementStatusList;
import org.hl7.fhir.MedicationStatementTaken;
import org.hl7.fhir.MedicationStatementTakenList;
import org.hl7.fhir.MedicationStatus;
import org.hl7.fhir.MedicationStatusList;
import org.hl7.fhir.MessageDefinition;
import org.hl7.fhir.MessageDefinitionAllowedResponse;
import org.hl7.fhir.MessageDefinitionFocus;
import org.hl7.fhir.MessageHeader;
import org.hl7.fhir.MessageHeaderDestination;
import org.hl7.fhir.MessageHeaderResponse;
import org.hl7.fhir.MessageHeaderSource;
import org.hl7.fhir.MessageSignificanceCategory;
import org.hl7.fhir.MessageSignificanceCategoryList;
import org.hl7.fhir.Meta;
import org.hl7.fhir.Money;
import org.hl7.fhir.NameUse;
import org.hl7.fhir.NameUseList;
import org.hl7.fhir.NamingSystem;
import org.hl7.fhir.NamingSystemIdentifierType;
import org.hl7.fhir.NamingSystemIdentifierTypeList;
import org.hl7.fhir.NamingSystemType;
import org.hl7.fhir.NamingSystemTypeList;
import org.hl7.fhir.NamingSystemUniqueId;
import org.hl7.fhir.Narrative;
import org.hl7.fhir.NarrativeStatus;
import org.hl7.fhir.NarrativeStatusList;
import org.hl7.fhir.NoteType;
import org.hl7.fhir.NoteTypeList;
import org.hl7.fhir.NutritionOrder;
import org.hl7.fhir.NutritionOrderAdministration;
import org.hl7.fhir.NutritionOrderEnteralFormula;
import org.hl7.fhir.NutritionOrderNutrient;
import org.hl7.fhir.NutritionOrderOralDiet;
import org.hl7.fhir.NutritionOrderStatus;
import org.hl7.fhir.NutritionOrderStatusList;
import org.hl7.fhir.NutritionOrderSupplement;
import org.hl7.fhir.NutritionOrderTexture;
import org.hl7.fhir.Observation;
import org.hl7.fhir.ObservationComponent;
import org.hl7.fhir.ObservationReferenceRange;
import org.hl7.fhir.ObservationRelated;
import org.hl7.fhir.ObservationRelationshipType;
import org.hl7.fhir.ObservationRelationshipTypeList;
import org.hl7.fhir.ObservationStatus;
import org.hl7.fhir.ObservationStatusList;
import org.hl7.fhir.Oid;
import org.hl7.fhir.OperationDefinition;
import org.hl7.fhir.OperationDefinitionBinding;
import org.hl7.fhir.OperationDefinitionOverload;
import org.hl7.fhir.OperationDefinitionParameter;
import org.hl7.fhir.OperationKind;
import org.hl7.fhir.OperationKindList;
import org.hl7.fhir.OperationOutcome;
import org.hl7.fhir.OperationOutcomeIssue;
import org.hl7.fhir.OperationParameterUse;
import org.hl7.fhir.OperationParameterUseList;
import org.hl7.fhir.Organization;
import org.hl7.fhir.OrganizationContact;
import org.hl7.fhir.ParameterDefinition;
import org.hl7.fhir.Parameters;
import org.hl7.fhir.ParametersParameter;
import org.hl7.fhir.ParticipantRequired;
import org.hl7.fhir.ParticipantRequiredList;
import org.hl7.fhir.ParticipationStatus;
import org.hl7.fhir.ParticipationStatusList;
import org.hl7.fhir.Patient;
import org.hl7.fhir.PatientAnimal;
import org.hl7.fhir.PatientCommunication;
import org.hl7.fhir.PatientContact;
import org.hl7.fhir.PatientLink;
import org.hl7.fhir.PaymentNotice;
import org.hl7.fhir.PaymentReconciliation;
import org.hl7.fhir.PaymentReconciliationDetail;
import org.hl7.fhir.PaymentReconciliationProcessNote;
import org.hl7.fhir.Period;
import org.hl7.fhir.Person;
import org.hl7.fhir.PersonLink;
import org.hl7.fhir.PlanDefinition;
import org.hl7.fhir.PlanDefinitionAction;
import org.hl7.fhir.PlanDefinitionCondition;
import org.hl7.fhir.PlanDefinitionDynamicValue;
import org.hl7.fhir.PlanDefinitionGoal;
import org.hl7.fhir.PlanDefinitionParticipant;
import org.hl7.fhir.PlanDefinitionRelatedAction;
import org.hl7.fhir.PlanDefinitionTarget;
import org.hl7.fhir.PositiveInt;
import org.hl7.fhir.Practitioner;
import org.hl7.fhir.PractitionerQualification;
import org.hl7.fhir.PractitionerRole;
import org.hl7.fhir.PractitionerRoleAvailableTime;
import org.hl7.fhir.PractitionerRoleNotAvailable;
import org.hl7.fhir.Procedure;
import org.hl7.fhir.ProcedureFocalDevice;
import org.hl7.fhir.ProcedurePerformer;
import org.hl7.fhir.ProcedureRequest;
import org.hl7.fhir.ProcedureRequestRequester;
import org.hl7.fhir.ProcessRequest;
import org.hl7.fhir.ProcessRequestItem;
import org.hl7.fhir.ProcessResponse;
import org.hl7.fhir.ProcessResponseProcessNote;
import org.hl7.fhir.PropertyRepresentation;
import org.hl7.fhir.PropertyRepresentationList;
import org.hl7.fhir.PropertyType;
import org.hl7.fhir.PropertyTypeList;
import org.hl7.fhir.Provenance;
import org.hl7.fhir.ProvenanceAgent;
import org.hl7.fhir.ProvenanceEntity;
import org.hl7.fhir.ProvenanceEntityRole;
import org.hl7.fhir.ProvenanceEntityRoleList;
import org.hl7.fhir.PublicationStatus;
import org.hl7.fhir.PublicationStatusList;
import org.hl7.fhir.QualityType;
import org.hl7.fhir.QualityTypeList;
import org.hl7.fhir.Quantity;
import org.hl7.fhir.QuantityComparator;
import org.hl7.fhir.QuantityComparatorList;
import org.hl7.fhir.Questionnaire;
import org.hl7.fhir.QuestionnaireEnableWhen;
import org.hl7.fhir.QuestionnaireItem;
import org.hl7.fhir.QuestionnaireItemType;
import org.hl7.fhir.QuestionnaireItemTypeList;
import org.hl7.fhir.QuestionnaireOption;
import org.hl7.fhir.QuestionnaireResponse;
import org.hl7.fhir.QuestionnaireResponseAnswer;
import org.hl7.fhir.QuestionnaireResponseItem;
import org.hl7.fhir.QuestionnaireResponseStatus;
import org.hl7.fhir.QuestionnaireResponseStatusList;
import org.hl7.fhir.Range;
import org.hl7.fhir.Ratio;
import org.hl7.fhir.Reference;
import org.hl7.fhir.ReferenceHandlingPolicy;
import org.hl7.fhir.ReferenceHandlingPolicyList;
import org.hl7.fhir.ReferenceVersionRules;
import org.hl7.fhir.ReferenceVersionRulesList;
import org.hl7.fhir.ReferralRequest;
import org.hl7.fhir.ReferralRequestRequester;
import org.hl7.fhir.RelatedArtifact;
import org.hl7.fhir.RelatedArtifactType;
import org.hl7.fhir.RelatedArtifactTypeList;
import org.hl7.fhir.RelatedPerson;
import org.hl7.fhir.RemittanceOutcome;
import org.hl7.fhir.RemittanceOutcomeList;
import org.hl7.fhir.RepositoryType;
import org.hl7.fhir.RepositoryTypeList;
import org.hl7.fhir.RequestGroup;
import org.hl7.fhir.RequestGroupAction;
import org.hl7.fhir.RequestGroupCondition;
import org.hl7.fhir.RequestGroupRelatedAction;
import org.hl7.fhir.RequestIntent;
import org.hl7.fhir.RequestIntentList;
import org.hl7.fhir.RequestPriority;
import org.hl7.fhir.RequestPriorityList;
import org.hl7.fhir.RequestStatus;
import org.hl7.fhir.RequestStatusList;
import org.hl7.fhir.ResearchStudy;
import org.hl7.fhir.ResearchStudyArm;
import org.hl7.fhir.ResearchStudyStatus;
import org.hl7.fhir.ResearchStudyStatusList;
import org.hl7.fhir.ResearchSubject;
import org.hl7.fhir.ResearchSubjectStatus;
import org.hl7.fhir.ResearchSubjectStatusList;
import org.hl7.fhir.Resource;
import org.hl7.fhir.ResourceContainer;
import org.hl7.fhir.ResourceType;
import org.hl7.fhir.ResourceTypeList;
import org.hl7.fhir.ResourceVersionPolicy;
import org.hl7.fhir.ResourceVersionPolicyList;
import org.hl7.fhir.ResponseType;
import org.hl7.fhir.ResponseTypeList;
import org.hl7.fhir.RestfulCapabilityMode;
import org.hl7.fhir.RestfulCapabilityModeList;
import org.hl7.fhir.RiskAssessment;
import org.hl7.fhir.RiskAssessmentPrediction;
import org.hl7.fhir.SampledData;
import org.hl7.fhir.SampledDataDataType;
import org.hl7.fhir.Schedule;
import org.hl7.fhir.SearchComparator;
import org.hl7.fhir.SearchComparatorList;
import org.hl7.fhir.SearchEntryMode;
import org.hl7.fhir.SearchEntryModeList;
import org.hl7.fhir.SearchModifierCode;
import org.hl7.fhir.SearchModifierCodeList;
import org.hl7.fhir.SearchParamType;
import org.hl7.fhir.SearchParamTypeList;
import org.hl7.fhir.SearchParameter;
import org.hl7.fhir.SearchParameterComponent;
import org.hl7.fhir.Sequence;
import org.hl7.fhir.SequenceQuality;
import org.hl7.fhir.SequenceReferenceSeq;
import org.hl7.fhir.SequenceRepository;
import org.hl7.fhir.SequenceVariant;
import org.hl7.fhir.ServiceDefinition;
import org.hl7.fhir.Signature;
import org.hl7.fhir.SlicingRules;
import org.hl7.fhir.SlicingRulesList;
import org.hl7.fhir.Slot;
import org.hl7.fhir.SlotStatus;
import org.hl7.fhir.SlotStatusList;
import org.hl7.fhir.Specimen;
import org.hl7.fhir.SpecimenCollection;
import org.hl7.fhir.SpecimenContainer;
import org.hl7.fhir.SpecimenProcessing;
import org.hl7.fhir.SpecimenStatus;
import org.hl7.fhir.SpecimenStatusList;
import org.hl7.fhir.StructureDefinition;
import org.hl7.fhir.StructureDefinitionDifferential;
import org.hl7.fhir.StructureDefinitionKind;
import org.hl7.fhir.StructureDefinitionKindList;
import org.hl7.fhir.StructureDefinitionMapping;
import org.hl7.fhir.StructureDefinitionSnapshot;
import org.hl7.fhir.StructureMap;
import org.hl7.fhir.StructureMapContextType;
import org.hl7.fhir.StructureMapContextTypeList;
import org.hl7.fhir.StructureMapDependent;
import org.hl7.fhir.StructureMapGroup;
import org.hl7.fhir.StructureMapGroupTypeMode;
import org.hl7.fhir.StructureMapGroupTypeModeList;
import org.hl7.fhir.StructureMapInput;
import org.hl7.fhir.StructureMapInputMode;
import org.hl7.fhir.StructureMapInputModeList;
import org.hl7.fhir.StructureMapModelMode;
import org.hl7.fhir.StructureMapModelModeList;
import org.hl7.fhir.StructureMapParameter;
import org.hl7.fhir.StructureMapRule;
import org.hl7.fhir.StructureMapSource;
import org.hl7.fhir.StructureMapSourceListMode;
import org.hl7.fhir.StructureMapSourceListModeList;
import org.hl7.fhir.StructureMapStructure;
import org.hl7.fhir.StructureMapTarget;
import org.hl7.fhir.StructureMapTargetListMode;
import org.hl7.fhir.StructureMapTargetListModeList;
import org.hl7.fhir.StructureMapTransform;
import org.hl7.fhir.StructureMapTransformList;
import org.hl7.fhir.Subscription;
import org.hl7.fhir.SubscriptionChannel;
import org.hl7.fhir.SubscriptionChannelType;
import org.hl7.fhir.SubscriptionChannelTypeList;
import org.hl7.fhir.SubscriptionStatus;
import org.hl7.fhir.SubscriptionStatusList;
import org.hl7.fhir.Substance;
import org.hl7.fhir.SubstanceIngredient;
import org.hl7.fhir.SubstanceInstance;
import org.hl7.fhir.SupplyDelivery;
import org.hl7.fhir.SupplyDeliveryStatus;
import org.hl7.fhir.SupplyDeliveryStatusList;
import org.hl7.fhir.SupplyDeliverySuppliedItem;
import org.hl7.fhir.SupplyRequest;
import org.hl7.fhir.SupplyRequestOrderedItem;
import org.hl7.fhir.SupplyRequestRequester;
import org.hl7.fhir.SupplyRequestStatus;
import org.hl7.fhir.SupplyRequestStatusList;
import org.hl7.fhir.SystemRestfulInteraction;
import org.hl7.fhir.SystemRestfulInteractionList;
import org.hl7.fhir.SystemVersionProcessingMode;
import org.hl7.fhir.SystemVersionProcessingModeList;
import org.hl7.fhir.Task;
import org.hl7.fhir.TaskInput;
import org.hl7.fhir.TaskOutput;
import org.hl7.fhir.TaskRequester;
import org.hl7.fhir.TaskRestriction;
import org.hl7.fhir.TaskStatus;
import org.hl7.fhir.TaskStatusList;
import org.hl7.fhir.TestReport;
import org.hl7.fhir.TestReportAction;
import org.hl7.fhir.TestReportAction1;
import org.hl7.fhir.TestReportAction2;
import org.hl7.fhir.TestReportActionResult;
import org.hl7.fhir.TestReportActionResultList;
import org.hl7.fhir.TestReportAssert;
import org.hl7.fhir.TestReportOperation;
import org.hl7.fhir.TestReportParticipant;
import org.hl7.fhir.TestReportParticipantType;
import org.hl7.fhir.TestReportParticipantTypeList;
import org.hl7.fhir.TestReportResult;
import org.hl7.fhir.TestReportResultList;
import org.hl7.fhir.TestReportSetup;
import org.hl7.fhir.TestReportStatus;
import org.hl7.fhir.TestReportStatusList;
import org.hl7.fhir.TestReportTeardown;
import org.hl7.fhir.TestReportTest;
import org.hl7.fhir.TestScript;
import org.hl7.fhir.TestScriptAction;
import org.hl7.fhir.TestScriptAction1;
import org.hl7.fhir.TestScriptAction2;
import org.hl7.fhir.TestScriptAssert;
import org.hl7.fhir.TestScriptCapability;
import org.hl7.fhir.TestScriptDestination;
import org.hl7.fhir.TestScriptFixture;
import org.hl7.fhir.TestScriptLink;
import org.hl7.fhir.TestScriptMetadata;
import org.hl7.fhir.TestScriptOperation;
import org.hl7.fhir.TestScriptOrigin;
import org.hl7.fhir.TestScriptParam;
import org.hl7.fhir.TestScriptParam1;
import org.hl7.fhir.TestScriptParam2;
import org.hl7.fhir.TestScriptParam3;
import org.hl7.fhir.TestScriptRequestHeader;
import org.hl7.fhir.TestScriptRequestMethodCode;
import org.hl7.fhir.TestScriptRequestMethodCodeList;
import org.hl7.fhir.TestScriptRule;
import org.hl7.fhir.TestScriptRule1;
import org.hl7.fhir.TestScriptRule2;
import org.hl7.fhir.TestScriptRule3;
import org.hl7.fhir.TestScriptRuleset;
import org.hl7.fhir.TestScriptRuleset1;
import org.hl7.fhir.TestScriptSetup;
import org.hl7.fhir.TestScriptTeardown;
import org.hl7.fhir.TestScriptTest;
import org.hl7.fhir.TestScriptVariable;
import org.hl7.fhir.Time;
import org.hl7.fhir.Timing;
import org.hl7.fhir.TimingRepeat;
import org.hl7.fhir.TriggerDefinition;
import org.hl7.fhir.TriggerType;
import org.hl7.fhir.TriggerTypeList;
import org.hl7.fhir.TypeDerivationRule;
import org.hl7.fhir.TypeDerivationRuleList;
import org.hl7.fhir.TypeRestfulInteraction;
import org.hl7.fhir.TypeRestfulInteractionList;
import org.hl7.fhir.UDIEntryType;
import org.hl7.fhir.UDIEntryTypeList;
import org.hl7.fhir.UnitsOfTime;
import org.hl7.fhir.UnitsOfTimeList;
import org.hl7.fhir.UnknownContentCode;
import org.hl7.fhir.UnknownContentCodeList;
import org.hl7.fhir.UnsignedInt;
import org.hl7.fhir.Uri;
import org.hl7.fhir.UsageContext;
import org.hl7.fhir.Use;
import org.hl7.fhir.UseList;
import org.hl7.fhir.Uuid;
import org.hl7.fhir.ValueSet;
import org.hl7.fhir.ValueSetCompose;
import org.hl7.fhir.ValueSetConcept;
import org.hl7.fhir.ValueSetContains;
import org.hl7.fhir.ValueSetDesignation;
import org.hl7.fhir.ValueSetExpansion;
import org.hl7.fhir.ValueSetFilter;
import org.hl7.fhir.ValueSetInclude;
import org.hl7.fhir.ValueSetParameter;
import org.hl7.fhir.VisionBase;
import org.hl7.fhir.VisionBaseList;
import org.hl7.fhir.VisionEyes;
import org.hl7.fhir.VisionEyesList;
import org.hl7.fhir.VisionPrescription;
import org.hl7.fhir.VisionPrescriptionDispense;
import org.hl7.fhir.XPathUsageType;
import org.hl7.fhir.XPathUsageTypeList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Factory</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class FhirFactoryImpl extends EFactoryImpl implements FhirFactory {
	/**
	 * Creates the default factory implementation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static FhirFactory init() {
		try {
			FhirFactory theFhirFactory = (FhirFactory)EPackage.Registry.INSTANCE.getEFactory(FhirPackage.eNS_URI);
			if (theFhirFactory != null) {
				return theFhirFactory;
			}
		}
		catch (Exception exception) {
			EcorePlugin.INSTANCE.log(exception);
		}
		return new FhirFactoryImpl();
	}

	/**
	 * Creates an instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public FhirFactoryImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EObject create(EClass eClass) {
		switch (eClass.getClassifierID()) {
			case FhirPackage.ACCOUNT: return createAccount();
			case FhirPackage.ACCOUNT_COVERAGE: return createAccountCoverage();
			case FhirPackage.ACCOUNT_GUARANTOR: return createAccountGuarantor();
			case FhirPackage.ACCOUNT_STATUS: return createAccountStatus();
			case FhirPackage.ACTION_CARDINALITY_BEHAVIOR: return createActionCardinalityBehavior();
			case FhirPackage.ACTION_CONDITION_KIND: return createActionConditionKind();
			case FhirPackage.ACTION_GROUPING_BEHAVIOR: return createActionGroupingBehavior();
			case FhirPackage.ACTION_LIST: return createActionList();
			case FhirPackage.ACTION_PARTICIPANT_TYPE: return createActionParticipantType();
			case FhirPackage.ACTION_PRECHECK_BEHAVIOR: return createActionPrecheckBehavior();
			case FhirPackage.ACTION_RELATIONSHIP_TYPE: return createActionRelationshipType();
			case FhirPackage.ACTION_REQUIRED_BEHAVIOR: return createActionRequiredBehavior();
			case FhirPackage.ACTION_SELECTION_BEHAVIOR: return createActionSelectionBehavior();
			case FhirPackage.ACTIVITY_DEFINITION: return createActivityDefinition();
			case FhirPackage.ACTIVITY_DEFINITION_DYNAMIC_VALUE: return createActivityDefinitionDynamicValue();
			case FhirPackage.ACTIVITY_DEFINITION_PARTICIPANT: return createActivityDefinitionParticipant();
			case FhirPackage.ADDRESS: return createAddress();
			case FhirPackage.ADDRESS_TYPE: return createAddressType();
			case FhirPackage.ADDRESS_USE: return createAddressUse();
			case FhirPackage.ADMINISTRATIVE_GENDER: return createAdministrativeGender();
			case FhirPackage.ADVERSE_EVENT: return createAdverseEvent();
			case FhirPackage.ADVERSE_EVENT_CATEGORY: return createAdverseEventCategory();
			case FhirPackage.ADVERSE_EVENT_CAUSALITY: return createAdverseEventCausality();
			case FhirPackage.ADVERSE_EVENT_SUSPECT_ENTITY: return createAdverseEventSuspectEntity();
			case FhirPackage.AGE: return createAge();
			case FhirPackage.AGGREGATION_MODE: return createAggregationMode();
			case FhirPackage.ALLERGY_INTOLERANCE: return createAllergyIntolerance();
			case FhirPackage.ALLERGY_INTOLERANCE_CATEGORY: return createAllergyIntoleranceCategory();
			case FhirPackage.ALLERGY_INTOLERANCE_CLINICAL_STATUS: return createAllergyIntoleranceClinicalStatus();
			case FhirPackage.ALLERGY_INTOLERANCE_CRITICALITY: return createAllergyIntoleranceCriticality();
			case FhirPackage.ALLERGY_INTOLERANCE_REACTION: return createAllergyIntoleranceReaction();
			case FhirPackage.ALLERGY_INTOLERANCE_SEVERITY: return createAllergyIntoleranceSeverity();
			case FhirPackage.ALLERGY_INTOLERANCE_TYPE: return createAllergyIntoleranceType();
			case FhirPackage.ALLERGY_INTOLERANCE_VERIFICATION_STATUS: return createAllergyIntoleranceVerificationStatus();
			case FhirPackage.ANNOTATION: return createAnnotation();
			case FhirPackage.APPOINTMENT: return createAppointment();
			case FhirPackage.APPOINTMENT_PARTICIPANT: return createAppointmentParticipant();
			case FhirPackage.APPOINTMENT_RESPONSE: return createAppointmentResponse();
			case FhirPackage.APPOINTMENT_STATUS: return createAppointmentStatus();
			case FhirPackage.ASSERTION_DIRECTION_TYPE: return createAssertionDirectionType();
			case FhirPackage.ASSERTION_OPERATOR_TYPE: return createAssertionOperatorType();
			case FhirPackage.ASSERTION_RESPONSE_TYPES: return createAssertionResponseTypes();
			case FhirPackage.ATTACHMENT: return createAttachment();
			case FhirPackage.AUDIT_EVENT: return createAuditEvent();
			case FhirPackage.AUDIT_EVENT_ACTION: return createAuditEventAction();
			case FhirPackage.AUDIT_EVENT_AGENT: return createAuditEventAgent();
			case FhirPackage.AUDIT_EVENT_AGENT_NETWORK_TYPE: return createAuditEventAgentNetworkType();
			case FhirPackage.AUDIT_EVENT_DETAIL: return createAuditEventDetail();
			case FhirPackage.AUDIT_EVENT_ENTITY: return createAuditEventEntity();
			case FhirPackage.AUDIT_EVENT_NETWORK: return createAuditEventNetwork();
			case FhirPackage.AUDIT_EVENT_OUTCOME: return createAuditEventOutcome();
			case FhirPackage.AUDIT_EVENT_SOURCE: return createAuditEventSource();
			case FhirPackage.BACKBONE_ELEMENT: return createBackboneElement();
			case FhirPackage.BASE64_BINARY: return createBase64Binary();
			case FhirPackage.BASIC: return createBasic();
			case FhirPackage.BINARY: return createBinary();
			case FhirPackage.BINDING_STRENGTH: return createBindingStrength();
			case FhirPackage.BODY_SITE: return createBodySite();
			case FhirPackage.BOOLEAN: return createBoolean();
			case FhirPackage.BUNDLE: return createBundle();
			case FhirPackage.BUNDLE_ENTRY: return createBundleEntry();
			case FhirPackage.BUNDLE_LINK: return createBundleLink();
			case FhirPackage.BUNDLE_REQUEST: return createBundleRequest();
			case FhirPackage.BUNDLE_RESPONSE: return createBundleResponse();
			case FhirPackage.BUNDLE_SEARCH: return createBundleSearch();
			case FhirPackage.BUNDLE_TYPE: return createBundleType();
			case FhirPackage.CAPABILITY_STATEMENT: return createCapabilityStatement();
			case FhirPackage.CAPABILITY_STATEMENT_CERTIFICATE: return createCapabilityStatementCertificate();
			case FhirPackage.CAPABILITY_STATEMENT_DOCUMENT: return createCapabilityStatementDocument();
			case FhirPackage.CAPABILITY_STATEMENT_ENDPOINT: return createCapabilityStatementEndpoint();
			case FhirPackage.CAPABILITY_STATEMENT_EVENT: return createCapabilityStatementEvent();
			case FhirPackage.CAPABILITY_STATEMENT_IMPLEMENTATION: return createCapabilityStatementImplementation();
			case FhirPackage.CAPABILITY_STATEMENT_INTERACTION: return createCapabilityStatementInteraction();
			case FhirPackage.CAPABILITY_STATEMENT_INTERACTION1: return createCapabilityStatementInteraction1();
			case FhirPackage.CAPABILITY_STATEMENT_KIND: return createCapabilityStatementKind();
			case FhirPackage.CAPABILITY_STATEMENT_MESSAGING: return createCapabilityStatementMessaging();
			case FhirPackage.CAPABILITY_STATEMENT_OPERATION: return createCapabilityStatementOperation();
			case FhirPackage.CAPABILITY_STATEMENT_RESOURCE: return createCapabilityStatementResource();
			case FhirPackage.CAPABILITY_STATEMENT_REST: return createCapabilityStatementRest();
			case FhirPackage.CAPABILITY_STATEMENT_SEARCH_PARAM: return createCapabilityStatementSearchParam();
			case FhirPackage.CAPABILITY_STATEMENT_SECURITY: return createCapabilityStatementSecurity();
			case FhirPackage.CAPABILITY_STATEMENT_SOFTWARE: return createCapabilityStatementSoftware();
			case FhirPackage.CAPABILITY_STATEMENT_SUPPORTED_MESSAGE: return createCapabilityStatementSupportedMessage();
			case FhirPackage.CARE_PLAN: return createCarePlan();
			case FhirPackage.CARE_PLAN_ACTIVITY: return createCarePlanActivity();
			case FhirPackage.CARE_PLAN_ACTIVITY_STATUS: return createCarePlanActivityStatus();
			case FhirPackage.CARE_PLAN_DETAIL: return createCarePlanDetail();
			case FhirPackage.CARE_PLAN_INTENT: return createCarePlanIntent();
			case FhirPackage.CARE_PLAN_STATUS: return createCarePlanStatus();
			case FhirPackage.CARE_TEAM: return createCareTeam();
			case FhirPackage.CARE_TEAM_PARTICIPANT: return createCareTeamParticipant();
			case FhirPackage.CARE_TEAM_STATUS: return createCareTeamStatus();
			case FhirPackage.CHARGE_ITEM: return createChargeItem();
			case FhirPackage.CHARGE_ITEM_PARTICIPANT: return createChargeItemParticipant();
			case FhirPackage.CHARGE_ITEM_STATUS: return createChargeItemStatus();
			case FhirPackage.CLAIM: return createClaim();
			case FhirPackage.CLAIM_ACCIDENT: return createClaimAccident();
			case FhirPackage.CLAIM_CARE_TEAM: return createClaimCareTeam();
			case FhirPackage.CLAIM_DETAIL: return createClaimDetail();
			case FhirPackage.CLAIM_DIAGNOSIS: return createClaimDiagnosis();
			case FhirPackage.CLAIM_INFORMATION: return createClaimInformation();
			case FhirPackage.CLAIM_INSURANCE: return createClaimInsurance();
			case FhirPackage.CLAIM_ITEM: return createClaimItem();
			case FhirPackage.CLAIM_PAYEE: return createClaimPayee();
			case FhirPackage.CLAIM_PROCEDURE: return createClaimProcedure();
			case FhirPackage.CLAIM_RELATED: return createClaimRelated();
			case FhirPackage.CLAIM_RESPONSE: return createClaimResponse();
			case FhirPackage.CLAIM_RESPONSE_ADD_ITEM: return createClaimResponseAddItem();
			case FhirPackage.CLAIM_RESPONSE_ADJUDICATION: return createClaimResponseAdjudication();
			case FhirPackage.CLAIM_RESPONSE_DETAIL: return createClaimResponseDetail();
			case FhirPackage.CLAIM_RESPONSE_DETAIL1: return createClaimResponseDetail1();
			case FhirPackage.CLAIM_RESPONSE_ERROR: return createClaimResponseError();
			case FhirPackage.CLAIM_RESPONSE_INSURANCE: return createClaimResponseInsurance();
			case FhirPackage.CLAIM_RESPONSE_ITEM: return createClaimResponseItem();
			case FhirPackage.CLAIM_RESPONSE_PAYMENT: return createClaimResponsePayment();
			case FhirPackage.CLAIM_RESPONSE_PROCESS_NOTE: return createClaimResponseProcessNote();
			case FhirPackage.CLAIM_RESPONSE_SUB_DETAIL: return createClaimResponseSubDetail();
			case FhirPackage.CLAIM_SUB_DETAIL: return createClaimSubDetail();
			case FhirPackage.CLINICAL_IMPRESSION: return createClinicalImpression();
			case FhirPackage.CLINICAL_IMPRESSION_FINDING: return createClinicalImpressionFinding();
			case FhirPackage.CLINICAL_IMPRESSION_INVESTIGATION: return createClinicalImpressionInvestigation();
			case FhirPackage.CLINICAL_IMPRESSION_STATUS: return createClinicalImpressionStatus();
			case FhirPackage.CODE: return createCode();
			case FhirPackage.CODEABLE_CONCEPT: return createCodeableConcept();
			case FhirPackage.CODE_SYSTEM: return createCodeSystem();
			case FhirPackage.CODE_SYSTEM_CONCEPT: return createCodeSystemConcept();
			case FhirPackage.CODE_SYSTEM_CONTENT_MODE: return createCodeSystemContentMode();
			case FhirPackage.CODE_SYSTEM_DESIGNATION: return createCodeSystemDesignation();
			case FhirPackage.CODE_SYSTEM_FILTER: return createCodeSystemFilter();
			case FhirPackage.CODE_SYSTEM_HIERARCHY_MEANING: return createCodeSystemHierarchyMeaning();
			case FhirPackage.CODE_SYSTEM_PROPERTY: return createCodeSystemProperty();
			case FhirPackage.CODE_SYSTEM_PROPERTY1: return createCodeSystemProperty1();
			case FhirPackage.CODING: return createCoding();
			case FhirPackage.COMMUNICATION: return createCommunication();
			case FhirPackage.COMMUNICATION_PAYLOAD: return createCommunicationPayload();
			case FhirPackage.COMMUNICATION_REQUEST: return createCommunicationRequest();
			case FhirPackage.COMMUNICATION_REQUEST_PAYLOAD: return createCommunicationRequestPayload();
			case FhirPackage.COMMUNICATION_REQUEST_REQUESTER: return createCommunicationRequestRequester();
			case FhirPackage.COMPARTMENT_DEFINITION: return createCompartmentDefinition();
			case FhirPackage.COMPARTMENT_DEFINITION_RESOURCE: return createCompartmentDefinitionResource();
			case FhirPackage.COMPARTMENT_TYPE: return createCompartmentType();
			case FhirPackage.COMPOSITION: return createComposition();
			case FhirPackage.COMPOSITION_ATTESTATION_MODE: return createCompositionAttestationMode();
			case FhirPackage.COMPOSITION_ATTESTER: return createCompositionAttester();
			case FhirPackage.COMPOSITION_EVENT: return createCompositionEvent();
			case FhirPackage.COMPOSITION_RELATES_TO: return createCompositionRelatesTo();
			case FhirPackage.COMPOSITION_SECTION: return createCompositionSection();
			case FhirPackage.COMPOSITION_STATUS: return createCompositionStatus();
			case FhirPackage.CONCEPT_MAP: return createConceptMap();
			case FhirPackage.CONCEPT_MAP_DEPENDS_ON: return createConceptMapDependsOn();
			case FhirPackage.CONCEPT_MAP_ELEMENT: return createConceptMapElement();
			case FhirPackage.CONCEPT_MAP_EQUIVALENCE: return createConceptMapEquivalence();
			case FhirPackage.CONCEPT_MAP_GROUP: return createConceptMapGroup();
			case FhirPackage.CONCEPT_MAP_GROUP_UNMAPPED_MODE: return createConceptMapGroupUnmappedMode();
			case FhirPackage.CONCEPT_MAP_TARGET: return createConceptMapTarget();
			case FhirPackage.CONCEPT_MAP_UNMAPPED: return createConceptMapUnmapped();
			case FhirPackage.CONDITION: return createCondition();
			case FhirPackage.CONDITIONAL_DELETE_STATUS: return createConditionalDeleteStatus();
			case FhirPackage.CONDITIONAL_READ_STATUS: return createConditionalReadStatus();
			case FhirPackage.CONDITION_CLINICAL_STATUS_CODES: return createConditionClinicalStatusCodes();
			case FhirPackage.CONDITION_EVIDENCE: return createConditionEvidence();
			case FhirPackage.CONDITION_STAGE: return createConditionStage();
			case FhirPackage.CONDITION_VERIFICATION_STATUS: return createConditionVerificationStatus();
			case FhirPackage.CONFIDENTIALITY_CLASSIFICATION: return createConfidentialityClassification();
			case FhirPackage.CONSENT: return createConsent();
			case FhirPackage.CONSENT_ACTOR: return createConsentActor();
			case FhirPackage.CONSENT_ACTOR1: return createConsentActor1();
			case FhirPackage.CONSENT_DATA: return createConsentData();
			case FhirPackage.CONSENT_DATA1: return createConsentData1();
			case FhirPackage.CONSENT_DATA_MEANING: return createConsentDataMeaning();
			case FhirPackage.CONSENT_EXCEPT: return createConsentExcept();
			case FhirPackage.CONSENT_EXCEPT_TYPE: return createConsentExceptType();
			case FhirPackage.CONSENT_POLICY: return createConsentPolicy();
			case FhirPackage.CONSENT_STATE: return createConsentState();
			case FhirPackage.CONSTRAINT_SEVERITY: return createConstraintSeverity();
			case FhirPackage.CONTACT_DETAIL: return createContactDetail();
			case FhirPackage.CONTACT_POINT: return createContactPoint();
			case FhirPackage.CONTACT_POINT_SYSTEM: return createContactPointSystem();
			case FhirPackage.CONTACT_POINT_USE: return createContactPointUse();
			case FhirPackage.CONTENT_TYPE: return createContentType();
			case FhirPackage.CONTRACT: return createContract();
			case FhirPackage.CONTRACT_AGENT: return createContractAgent();
			case FhirPackage.CONTRACT_AGENT1: return createContractAgent1();
			case FhirPackage.CONTRACT_FRIENDLY: return createContractFriendly();
			case FhirPackage.CONTRACT_LEGAL: return createContractLegal();
			case FhirPackage.CONTRACT_RESOURCE_STATUS_CODES: return createContractResourceStatusCodes();
			case FhirPackage.CONTRACT_RULE: return createContractRule();
			case FhirPackage.CONTRACT_SIGNER: return createContractSigner();
			case FhirPackage.CONTRACT_TERM: return createContractTerm();
			case FhirPackage.CONTRACT_VALUED_ITEM: return createContractValuedItem();
			case FhirPackage.CONTRACT_VALUED_ITEM1: return createContractValuedItem1();
			case FhirPackage.CONTRIBUTOR: return createContributor();
			case FhirPackage.CONTRIBUTOR_TYPE: return createContributorType();
			case FhirPackage.COUNT: return createCount();
			case FhirPackage.COVERAGE: return createCoverage();
			case FhirPackage.COVERAGE_GROUPING: return createCoverageGrouping();
			case FhirPackage.DATA_ELEMENT: return createDataElement();
			case FhirPackage.DATA_ELEMENT_MAPPING: return createDataElementMapping();
			case FhirPackage.DATA_ELEMENT_STRINGENCY: return createDataElementStringency();
			case FhirPackage.DATA_REQUIREMENT: return createDataRequirement();
			case FhirPackage.DATA_REQUIREMENT_CODE_FILTER: return createDataRequirementCodeFilter();
			case FhirPackage.DATA_REQUIREMENT_DATE_FILTER: return createDataRequirementDateFilter();
			case FhirPackage.DATE: return createDate();
			case FhirPackage.DATE_TIME: return createDateTime();
			case FhirPackage.DAYS_OF_WEEK: return createDaysOfWeek();
			case FhirPackage.DECIMAL: return createDecimal();
			case FhirPackage.DETECTED_ISSUE: return createDetectedIssue();
			case FhirPackage.DETECTED_ISSUE_MITIGATION: return createDetectedIssueMitigation();
			case FhirPackage.DETECTED_ISSUE_SEVERITY: return createDetectedIssueSeverity();
			case FhirPackage.DEVICE: return createDevice();
			case FhirPackage.DEVICE_COMPONENT: return createDeviceComponent();
			case FhirPackage.DEVICE_COMPONENT_PRODUCTION_SPECIFICATION: return createDeviceComponentProductionSpecification();
			case FhirPackage.DEVICE_METRIC: return createDeviceMetric();
			case FhirPackage.DEVICE_METRIC_CALIBRATION: return createDeviceMetricCalibration();
			case FhirPackage.DEVICE_METRIC_CALIBRATION_STATE: return createDeviceMetricCalibrationState();
			case FhirPackage.DEVICE_METRIC_CALIBRATION_TYPE: return createDeviceMetricCalibrationType();
			case FhirPackage.DEVICE_METRIC_CATEGORY: return createDeviceMetricCategory();
			case FhirPackage.DEVICE_METRIC_COLOR: return createDeviceMetricColor();
			case FhirPackage.DEVICE_METRIC_OPERATIONAL_STATUS: return createDeviceMetricOperationalStatus();
			case FhirPackage.DEVICE_REQUEST: return createDeviceRequest();
			case FhirPackage.DEVICE_REQUEST_REQUESTER: return createDeviceRequestRequester();
			case FhirPackage.DEVICE_UDI: return createDeviceUdi();
			case FhirPackage.DEVICE_USE_STATEMENT: return createDeviceUseStatement();
			case FhirPackage.DEVICE_USE_STATEMENT_STATUS: return createDeviceUseStatementStatus();
			case FhirPackage.DIAGNOSTIC_REPORT: return createDiagnosticReport();
			case FhirPackage.DIAGNOSTIC_REPORT_IMAGE: return createDiagnosticReportImage();
			case FhirPackage.DIAGNOSTIC_REPORT_PERFORMER: return createDiagnosticReportPerformer();
			case FhirPackage.DIAGNOSTIC_REPORT_STATUS: return createDiagnosticReportStatus();
			case FhirPackage.DIGITAL_MEDIA_TYPE: return createDigitalMediaType();
			case FhirPackage.DISCRIMINATOR_TYPE: return createDiscriminatorType();
			case FhirPackage.DISTANCE: return createDistance();
			case FhirPackage.DOCUMENT_MANIFEST: return createDocumentManifest();
			case FhirPackage.DOCUMENT_MANIFEST_CONTENT: return createDocumentManifestContent();
			case FhirPackage.DOCUMENT_MANIFEST_RELATED: return createDocumentManifestRelated();
			case FhirPackage.DOCUMENT_MODE: return createDocumentMode();
			case FhirPackage.DOCUMENT_REFERENCE: return createDocumentReference();
			case FhirPackage.DOCUMENT_REFERENCE_CONTENT: return createDocumentReferenceContent();
			case FhirPackage.DOCUMENT_REFERENCE_CONTEXT: return createDocumentReferenceContext();
			case FhirPackage.DOCUMENT_REFERENCE_RELATED: return createDocumentReferenceRelated();
			case FhirPackage.DOCUMENT_REFERENCE_RELATES_TO: return createDocumentReferenceRelatesTo();
			case FhirPackage.DOCUMENT_REFERENCE_STATUS: return createDocumentReferenceStatus();
			case FhirPackage.DOCUMENT_RELATIONSHIP_TYPE: return createDocumentRelationshipType();
			case FhirPackage.DOCUMENT_ROOT: return createDocumentRoot();
			case FhirPackage.DOMAIN_RESOURCE: return createDomainResource();
			case FhirPackage.DOSAGE: return createDosage();
			case FhirPackage.DURATION: return createDuration();
			case FhirPackage.ELEMENT: return createElement();
			case FhirPackage.ELEMENT_DEFINITION: return createElementDefinition();
			case FhirPackage.ELEMENT_DEFINITION_BASE: return createElementDefinitionBase();
			case FhirPackage.ELEMENT_DEFINITION_BINDING: return createElementDefinitionBinding();
			case FhirPackage.ELEMENT_DEFINITION_CONSTRAINT: return createElementDefinitionConstraint();
			case FhirPackage.ELEMENT_DEFINITION_DISCRIMINATOR: return createElementDefinitionDiscriminator();
			case FhirPackage.ELEMENT_DEFINITION_EXAMPLE: return createElementDefinitionExample();
			case FhirPackage.ELEMENT_DEFINITION_MAPPING: return createElementDefinitionMapping();
			case FhirPackage.ELEMENT_DEFINITION_SLICING: return createElementDefinitionSlicing();
			case FhirPackage.ELEMENT_DEFINITION_TYPE: return createElementDefinitionType();
			case FhirPackage.ELIGIBILITY_REQUEST: return createEligibilityRequest();
			case FhirPackage.ELIGIBILITY_RESPONSE: return createEligibilityResponse();
			case FhirPackage.ELIGIBILITY_RESPONSE_BENEFIT_BALANCE: return createEligibilityResponseBenefitBalance();
			case FhirPackage.ELIGIBILITY_RESPONSE_ERROR: return createEligibilityResponseError();
			case FhirPackage.ELIGIBILITY_RESPONSE_FINANCIAL: return createEligibilityResponseFinancial();
			case FhirPackage.ELIGIBILITY_RESPONSE_INSURANCE: return createEligibilityResponseInsurance();
			case FhirPackage.ENCOUNTER: return createEncounter();
			case FhirPackage.ENCOUNTER_CLASS_HISTORY: return createEncounterClassHistory();
			case FhirPackage.ENCOUNTER_DIAGNOSIS: return createEncounterDiagnosis();
			case FhirPackage.ENCOUNTER_HOSPITALIZATION: return createEncounterHospitalization();
			case FhirPackage.ENCOUNTER_LOCATION: return createEncounterLocation();
			case FhirPackage.ENCOUNTER_LOCATION_STATUS: return createEncounterLocationStatus();
			case FhirPackage.ENCOUNTER_PARTICIPANT: return createEncounterParticipant();
			case FhirPackage.ENCOUNTER_STATUS: return createEncounterStatus();
			case FhirPackage.ENCOUNTER_STATUS_HISTORY: return createEncounterStatusHistory();
			case FhirPackage.ENDPOINT: return createEndpoint();
			case FhirPackage.ENDPOINT_STATUS: return createEndpointStatus();
			case FhirPackage.ENROLLMENT_REQUEST: return createEnrollmentRequest();
			case FhirPackage.ENROLLMENT_RESPONSE: return createEnrollmentResponse();
			case FhirPackage.EPISODE_OF_CARE: return createEpisodeOfCare();
			case FhirPackage.EPISODE_OF_CARE_DIAGNOSIS: return createEpisodeOfCareDiagnosis();
			case FhirPackage.EPISODE_OF_CARE_STATUS: return createEpisodeOfCareStatus();
			case FhirPackage.EPISODE_OF_CARE_STATUS_HISTORY: return createEpisodeOfCareStatusHistory();
			case FhirPackage.EVENT_CAPABILITY_MODE: return createEventCapabilityMode();
			case FhirPackage.EVENT_STATUS: return createEventStatus();
			case FhirPackage.EVENT_TIMING: return createEventTiming();
			case FhirPackage.EXPANSION_PROFILE: return createExpansionProfile();
			case FhirPackage.EXPANSION_PROFILE_DESIGNATION: return createExpansionProfileDesignation();
			case FhirPackage.EXPANSION_PROFILE_DESIGNATION1: return createExpansionProfileDesignation1();
			case FhirPackage.EXPANSION_PROFILE_DESIGNATION2: return createExpansionProfileDesignation2();
			case FhirPackage.EXPANSION_PROFILE_EXCLUDE: return createExpansionProfileExclude();
			case FhirPackage.EXPANSION_PROFILE_EXCLUDED_SYSTEM: return createExpansionProfileExcludedSystem();
			case FhirPackage.EXPANSION_PROFILE_FIXED_VERSION: return createExpansionProfileFixedVersion();
			case FhirPackage.EXPANSION_PROFILE_INCLUDE: return createExpansionProfileInclude();
			case FhirPackage.EXPLANATION_OF_BENEFIT: return createExplanationOfBenefit();
			case FhirPackage.EXPLANATION_OF_BENEFIT_ACCIDENT: return createExplanationOfBenefitAccident();
			case FhirPackage.EXPLANATION_OF_BENEFIT_ADD_ITEM: return createExplanationOfBenefitAddItem();
			case FhirPackage.EXPLANATION_OF_BENEFIT_ADJUDICATION: return createExplanationOfBenefitAdjudication();
			case FhirPackage.EXPLANATION_OF_BENEFIT_BENEFIT_BALANCE: return createExplanationOfBenefitBenefitBalance();
			case FhirPackage.EXPLANATION_OF_BENEFIT_CARE_TEAM: return createExplanationOfBenefitCareTeam();
			case FhirPackage.EXPLANATION_OF_BENEFIT_DETAIL: return createExplanationOfBenefitDetail();
			case FhirPackage.EXPLANATION_OF_BENEFIT_DETAIL1: return createExplanationOfBenefitDetail1();
			case FhirPackage.EXPLANATION_OF_BENEFIT_DIAGNOSIS: return createExplanationOfBenefitDiagnosis();
			case FhirPackage.EXPLANATION_OF_BENEFIT_FINANCIAL: return createExplanationOfBenefitFinancial();
			case FhirPackage.EXPLANATION_OF_BENEFIT_INFORMATION: return createExplanationOfBenefitInformation();
			case FhirPackage.EXPLANATION_OF_BENEFIT_INSURANCE: return createExplanationOfBenefitInsurance();
			case FhirPackage.EXPLANATION_OF_BENEFIT_ITEM: return createExplanationOfBenefitItem();
			case FhirPackage.EXPLANATION_OF_BENEFIT_PAYEE: return createExplanationOfBenefitPayee();
			case FhirPackage.EXPLANATION_OF_BENEFIT_PAYMENT: return createExplanationOfBenefitPayment();
			case FhirPackage.EXPLANATION_OF_BENEFIT_PROCEDURE: return createExplanationOfBenefitProcedure();
			case FhirPackage.EXPLANATION_OF_BENEFIT_PROCESS_NOTE: return createExplanationOfBenefitProcessNote();
			case FhirPackage.EXPLANATION_OF_BENEFIT_RELATED: return createExplanationOfBenefitRelated();
			case FhirPackage.EXPLANATION_OF_BENEFIT_STATUS: return createExplanationOfBenefitStatus();
			case FhirPackage.EXPLANATION_OF_BENEFIT_SUB_DETAIL: return createExplanationOfBenefitSubDetail();
			case FhirPackage.EXTENSION: return createExtension();
			case FhirPackage.EXTENSION_CONTEXT: return createExtensionContext();
			case FhirPackage.FAMILY_HISTORY_STATUS: return createFamilyHistoryStatus();
			case FhirPackage.FAMILY_MEMBER_HISTORY: return createFamilyMemberHistory();
			case FhirPackage.FAMILY_MEMBER_HISTORY_CONDITION: return createFamilyMemberHistoryCondition();
			case FhirPackage.FHIR_ALL_TYPES: return createFHIRAllTypes();
			case FhirPackage.FHIR_DEFINED_TYPE: return createFHIRDefinedType();
			case FhirPackage.FHIR_DEVICE_STATUS: return createFHIRDeviceStatus();
			case FhirPackage.FHIR_SUBSTANCE_STATUS: return createFHIRSubstanceStatus();
			case FhirPackage.FILTER_OPERATOR: return createFilterOperator();
			case FhirPackage.FINANCIAL_RESOURCE_STATUS_CODES: return createFinancialResourceStatusCodes();
			case FhirPackage.FLAG: return createFlag();
			case FhirPackage.FLAG_STATUS: return createFlagStatus();
			case FhirPackage.GOAL: return createGoal();
			case FhirPackage.GOAL_STATUS: return createGoalStatus();
			case FhirPackage.GOAL_TARGET: return createGoalTarget();
			case FhirPackage.GRAPH_COMPARTMENT_RULE: return createGraphCompartmentRule();
			case FhirPackage.GRAPH_DEFINITION: return createGraphDefinition();
			case FhirPackage.GRAPH_DEFINITION_COMPARTMENT: return createGraphDefinitionCompartment();
			case FhirPackage.GRAPH_DEFINITION_LINK: return createGraphDefinitionLink();
			case FhirPackage.GRAPH_DEFINITION_TARGET: return createGraphDefinitionTarget();
			case FhirPackage.GROUP: return createGroup();
			case FhirPackage.GROUP_CHARACTERISTIC: return createGroupCharacteristic();
			case FhirPackage.GROUP_MEMBER: return createGroupMember();
			case FhirPackage.GROUP_TYPE: return createGroupType();
			case FhirPackage.GUIDANCE_RESPONSE: return createGuidanceResponse();
			case FhirPackage.GUIDANCE_RESPONSE_STATUS: return createGuidanceResponseStatus();
			case FhirPackage.GUIDE_DEPENDENCY_TYPE: return createGuideDependencyType();
			case FhirPackage.GUIDE_PAGE_KIND: return createGuidePageKind();
			case FhirPackage.HEALTHCARE_SERVICE: return createHealthcareService();
			case FhirPackage.HEALTHCARE_SERVICE_AVAILABLE_TIME: return createHealthcareServiceAvailableTime();
			case FhirPackage.HEALTHCARE_SERVICE_NOT_AVAILABLE: return createHealthcareServiceNotAvailable();
			case FhirPackage.HTTP_VERB: return createHTTPVerb();
			case FhirPackage.HUMAN_NAME: return createHumanName();
			case FhirPackage.ID: return createId();
			case FhirPackage.IDENTIFIER: return createIdentifier();
			case FhirPackage.IDENTIFIER_USE: return createIdentifierUse();
			case FhirPackage.IDENTITY_ASSURANCE_LEVEL: return createIdentityAssuranceLevel();
			case FhirPackage.IMAGING_MANIFEST: return createImagingManifest();
			case FhirPackage.IMAGING_MANIFEST_INSTANCE: return createImagingManifestInstance();
			case FhirPackage.IMAGING_MANIFEST_SERIES: return createImagingManifestSeries();
			case FhirPackage.IMAGING_MANIFEST_STUDY: return createImagingManifestStudy();
			case FhirPackage.IMAGING_STUDY: return createImagingStudy();
			case FhirPackage.IMAGING_STUDY_INSTANCE: return createImagingStudyInstance();
			case FhirPackage.IMAGING_STUDY_SERIES: return createImagingStudySeries();
			case FhirPackage.IMMUNIZATION: return createImmunization();
			case FhirPackage.IMMUNIZATION_EXPLANATION: return createImmunizationExplanation();
			case FhirPackage.IMMUNIZATION_PRACTITIONER: return createImmunizationPractitioner();
			case FhirPackage.IMMUNIZATION_REACTION: return createImmunizationReaction();
			case FhirPackage.IMMUNIZATION_RECOMMENDATION: return createImmunizationRecommendation();
			case FhirPackage.IMMUNIZATION_RECOMMENDATION_DATE_CRITERION: return createImmunizationRecommendationDateCriterion();
			case FhirPackage.IMMUNIZATION_RECOMMENDATION_PROTOCOL: return createImmunizationRecommendationProtocol();
			case FhirPackage.IMMUNIZATION_RECOMMENDATION_RECOMMENDATION: return createImmunizationRecommendationRecommendation();
			case FhirPackage.IMMUNIZATION_STATUS_CODES: return createImmunizationStatusCodes();
			case FhirPackage.IMMUNIZATION_VACCINATION_PROTOCOL: return createImmunizationVaccinationProtocol();
			case FhirPackage.IMPLEMENTATION_GUIDE: return createImplementationGuide();
			case FhirPackage.IMPLEMENTATION_GUIDE_DEPENDENCY: return createImplementationGuideDependency();
			case FhirPackage.IMPLEMENTATION_GUIDE_GLOBAL: return createImplementationGuideGlobal();
			case FhirPackage.IMPLEMENTATION_GUIDE_PACKAGE: return createImplementationGuidePackage();
			case FhirPackage.IMPLEMENTATION_GUIDE_PAGE: return createImplementationGuidePage();
			case FhirPackage.IMPLEMENTATION_GUIDE_RESOURCE: return createImplementationGuideResource();
			case FhirPackage.INSTANCE_AVAILABILITY: return createInstanceAvailability();
			case FhirPackage.INSTANT: return createInstant();
			case FhirPackage.INTEGER: return createInteger();
			case FhirPackage.ISSUE_SEVERITY: return createIssueSeverity();
			case FhirPackage.ISSUE_TYPE: return createIssueType();
			case FhirPackage.LIBRARY: return createLibrary();
			case FhirPackage.LINKAGE: return createLinkage();
			case FhirPackage.LINKAGE_ITEM: return createLinkageItem();
			case FhirPackage.LINKAGE_TYPE: return createLinkageType();
			case FhirPackage.LINK_TYPE: return createLinkType();
			case FhirPackage.LIST: return createList();
			case FhirPackage.LIST_ENTRY: return createListEntry();
			case FhirPackage.LIST_MODE: return createListMode();
			case FhirPackage.LIST_STATUS: return createListStatus();
			case FhirPackage.LOCATION: return createLocation();
			case FhirPackage.LOCATION_MODE: return createLocationMode();
			case FhirPackage.LOCATION_POSITION: return createLocationPosition();
			case FhirPackage.LOCATION_STATUS: return createLocationStatus();
			case FhirPackage.MARKDOWN: return createMarkdown();
			case FhirPackage.MEASMNT_PRINCIPLE: return createMeasmntPrinciple();
			case FhirPackage.MEASURE: return createMeasure();
			case FhirPackage.MEASURE_GROUP: return createMeasureGroup();
			case FhirPackage.MEASURE_POPULATION: return createMeasurePopulation();
			case FhirPackage.MEASURE_REPORT: return createMeasureReport();
			case FhirPackage.MEASURE_REPORT_GROUP: return createMeasureReportGroup();
			case FhirPackage.MEASURE_REPORT_POPULATION: return createMeasureReportPopulation();
			case FhirPackage.MEASURE_REPORT_POPULATION1: return createMeasureReportPopulation1();
			case FhirPackage.MEASURE_REPORT_STATUS: return createMeasureReportStatus();
			case FhirPackage.MEASURE_REPORT_STRATIFIER: return createMeasureReportStratifier();
			case FhirPackage.MEASURE_REPORT_STRATUM: return createMeasureReportStratum();
			case FhirPackage.MEASURE_REPORT_TYPE: return createMeasureReportType();
			case FhirPackage.MEASURE_STRATIFIER: return createMeasureStratifier();
			case FhirPackage.MEASURE_SUPPLEMENTAL_DATA: return createMeasureSupplementalData();
			case FhirPackage.MEDIA: return createMedia();
			case FhirPackage.MEDICATION: return createMedication();
			case FhirPackage.MEDICATION_ADMINISTRATION: return createMedicationAdministration();
			case FhirPackage.MEDICATION_ADMINISTRATION_DOSAGE: return createMedicationAdministrationDosage();
			case FhirPackage.MEDICATION_ADMINISTRATION_PERFORMER: return createMedicationAdministrationPerformer();
			case FhirPackage.MEDICATION_ADMINISTRATION_STATUS: return createMedicationAdministrationStatus();
			case FhirPackage.MEDICATION_BATCH: return createMedicationBatch();
			case FhirPackage.MEDICATION_CONTENT: return createMedicationContent();
			case FhirPackage.MEDICATION_DISPENSE: return createMedicationDispense();
			case FhirPackage.MEDICATION_DISPENSE_PERFORMER: return createMedicationDispensePerformer();
			case FhirPackage.MEDICATION_DISPENSE_STATUS: return createMedicationDispenseStatus();
			case FhirPackage.MEDICATION_DISPENSE_SUBSTITUTION: return createMedicationDispenseSubstitution();
			case FhirPackage.MEDICATION_INGREDIENT: return createMedicationIngredient();
			case FhirPackage.MEDICATION_PACKAGE: return createMedicationPackage();
			case FhirPackage.MEDICATION_REQUEST: return createMedicationRequest();
			case FhirPackage.MEDICATION_REQUEST_DISPENSE_REQUEST: return createMedicationRequestDispenseRequest();
			case FhirPackage.MEDICATION_REQUEST_INTENT: return createMedicationRequestIntent();
			case FhirPackage.MEDICATION_REQUEST_PRIORITY: return createMedicationRequestPriority();
			case FhirPackage.MEDICATION_REQUEST_REQUESTER: return createMedicationRequestRequester();
			case FhirPackage.MEDICATION_REQUEST_STATUS: return createMedicationRequestStatus();
			case FhirPackage.MEDICATION_REQUEST_SUBSTITUTION: return createMedicationRequestSubstitution();
			case FhirPackage.MEDICATION_STATEMENT: return createMedicationStatement();
			case FhirPackage.MEDICATION_STATEMENT_STATUS: return createMedicationStatementStatus();
			case FhirPackage.MEDICATION_STATEMENT_TAKEN: return createMedicationStatementTaken();
			case FhirPackage.MEDICATION_STATUS: return createMedicationStatus();
			case FhirPackage.MESSAGE_DEFINITION: return createMessageDefinition();
			case FhirPackage.MESSAGE_DEFINITION_ALLOWED_RESPONSE: return createMessageDefinitionAllowedResponse();
			case FhirPackage.MESSAGE_DEFINITION_FOCUS: return createMessageDefinitionFocus();
			case FhirPackage.MESSAGE_HEADER: return createMessageHeader();
			case FhirPackage.MESSAGE_HEADER_DESTINATION: return createMessageHeaderDestination();
			case FhirPackage.MESSAGE_HEADER_RESPONSE: return createMessageHeaderResponse();
			case FhirPackage.MESSAGE_HEADER_SOURCE: return createMessageHeaderSource();
			case FhirPackage.MESSAGE_SIGNIFICANCE_CATEGORY: return createMessageSignificanceCategory();
			case FhirPackage.META: return createMeta();
			case FhirPackage.MONEY: return createMoney();
			case FhirPackage.NAME_USE: return createNameUse();
			case FhirPackage.NAMING_SYSTEM: return createNamingSystem();
			case FhirPackage.NAMING_SYSTEM_IDENTIFIER_TYPE: return createNamingSystemIdentifierType();
			case FhirPackage.NAMING_SYSTEM_TYPE: return createNamingSystemType();
			case FhirPackage.NAMING_SYSTEM_UNIQUE_ID: return createNamingSystemUniqueId();
			case FhirPackage.NARRATIVE: return createNarrative();
			case FhirPackage.NARRATIVE_STATUS: return createNarrativeStatus();
			case FhirPackage.NOTE_TYPE: return createNoteType();
			case FhirPackage.NUTRITION_ORDER: return createNutritionOrder();
			case FhirPackage.NUTRITION_ORDER_ADMINISTRATION: return createNutritionOrderAdministration();
			case FhirPackage.NUTRITION_ORDER_ENTERAL_FORMULA: return createNutritionOrderEnteralFormula();
			case FhirPackage.NUTRITION_ORDER_NUTRIENT: return createNutritionOrderNutrient();
			case FhirPackage.NUTRITION_ORDER_ORAL_DIET: return createNutritionOrderOralDiet();
			case FhirPackage.NUTRITION_ORDER_STATUS: return createNutritionOrderStatus();
			case FhirPackage.NUTRITION_ORDER_SUPPLEMENT: return createNutritionOrderSupplement();
			case FhirPackage.NUTRITION_ORDER_TEXTURE: return createNutritionOrderTexture();
			case FhirPackage.OBSERVATION: return createObservation();
			case FhirPackage.OBSERVATION_COMPONENT: return createObservationComponent();
			case FhirPackage.OBSERVATION_REFERENCE_RANGE: return createObservationReferenceRange();
			case FhirPackage.OBSERVATION_RELATED: return createObservationRelated();
			case FhirPackage.OBSERVATION_RELATIONSHIP_TYPE: return createObservationRelationshipType();
			case FhirPackage.OBSERVATION_STATUS: return createObservationStatus();
			case FhirPackage.OID: return createOid();
			case FhirPackage.OPERATION_DEFINITION: return createOperationDefinition();
			case FhirPackage.OPERATION_DEFINITION_BINDING: return createOperationDefinitionBinding();
			case FhirPackage.OPERATION_DEFINITION_OVERLOAD: return createOperationDefinitionOverload();
			case FhirPackage.OPERATION_DEFINITION_PARAMETER: return createOperationDefinitionParameter();
			case FhirPackage.OPERATION_KIND: return createOperationKind();
			case FhirPackage.OPERATION_OUTCOME: return createOperationOutcome();
			case FhirPackage.OPERATION_OUTCOME_ISSUE: return createOperationOutcomeIssue();
			case FhirPackage.OPERATION_PARAMETER_USE: return createOperationParameterUse();
			case FhirPackage.ORGANIZATION: return createOrganization();
			case FhirPackage.ORGANIZATION_CONTACT: return createOrganizationContact();
			case FhirPackage.PARAMETER_DEFINITION: return createParameterDefinition();
			case FhirPackage.PARAMETERS: return createParameters();
			case FhirPackage.PARAMETERS_PARAMETER: return createParametersParameter();
			case FhirPackage.PARTICIPANT_REQUIRED: return createParticipantRequired();
			case FhirPackage.PARTICIPATION_STATUS: return createParticipationStatus();
			case FhirPackage.PATIENT: return createPatient();
			case FhirPackage.PATIENT_ANIMAL: return createPatientAnimal();
			case FhirPackage.PATIENT_COMMUNICATION: return createPatientCommunication();
			case FhirPackage.PATIENT_CONTACT: return createPatientContact();
			case FhirPackage.PATIENT_LINK: return createPatientLink();
			case FhirPackage.PAYMENT_NOTICE: return createPaymentNotice();
			case FhirPackage.PAYMENT_RECONCILIATION: return createPaymentReconciliation();
			case FhirPackage.PAYMENT_RECONCILIATION_DETAIL: return createPaymentReconciliationDetail();
			case FhirPackage.PAYMENT_RECONCILIATION_PROCESS_NOTE: return createPaymentReconciliationProcessNote();
			case FhirPackage.PERIOD: return createPeriod();
			case FhirPackage.PERSON: return createPerson();
			case FhirPackage.PERSON_LINK: return createPersonLink();
			case FhirPackage.PLAN_DEFINITION: return createPlanDefinition();
			case FhirPackage.PLAN_DEFINITION_ACTION: return createPlanDefinitionAction();
			case FhirPackage.PLAN_DEFINITION_CONDITION: return createPlanDefinitionCondition();
			case FhirPackage.PLAN_DEFINITION_DYNAMIC_VALUE: return createPlanDefinitionDynamicValue();
			case FhirPackage.PLAN_DEFINITION_GOAL: return createPlanDefinitionGoal();
			case FhirPackage.PLAN_DEFINITION_PARTICIPANT: return createPlanDefinitionParticipant();
			case FhirPackage.PLAN_DEFINITION_RELATED_ACTION: return createPlanDefinitionRelatedAction();
			case FhirPackage.PLAN_DEFINITION_TARGET: return createPlanDefinitionTarget();
			case FhirPackage.POSITIVE_INT: return createPositiveInt();
			case FhirPackage.PRACTITIONER: return createPractitioner();
			case FhirPackage.PRACTITIONER_QUALIFICATION: return createPractitionerQualification();
			case FhirPackage.PRACTITIONER_ROLE: return createPractitionerRole();
			case FhirPackage.PRACTITIONER_ROLE_AVAILABLE_TIME: return createPractitionerRoleAvailableTime();
			case FhirPackage.PRACTITIONER_ROLE_NOT_AVAILABLE: return createPractitionerRoleNotAvailable();
			case FhirPackage.PROCEDURE: return createProcedure();
			case FhirPackage.PROCEDURE_FOCAL_DEVICE: return createProcedureFocalDevice();
			case FhirPackage.PROCEDURE_PERFORMER: return createProcedurePerformer();
			case FhirPackage.PROCEDURE_REQUEST: return createProcedureRequest();
			case FhirPackage.PROCEDURE_REQUEST_REQUESTER: return createProcedureRequestRequester();
			case FhirPackage.PROCESS_REQUEST: return createProcessRequest();
			case FhirPackage.PROCESS_REQUEST_ITEM: return createProcessRequestItem();
			case FhirPackage.PROCESS_RESPONSE: return createProcessResponse();
			case FhirPackage.PROCESS_RESPONSE_PROCESS_NOTE: return createProcessResponseProcessNote();
			case FhirPackage.PROPERTY_REPRESENTATION: return createPropertyRepresentation();
			case FhirPackage.PROPERTY_TYPE: return createPropertyType();
			case FhirPackage.PROVENANCE: return createProvenance();
			case FhirPackage.PROVENANCE_AGENT: return createProvenanceAgent();
			case FhirPackage.PROVENANCE_ENTITY: return createProvenanceEntity();
			case FhirPackage.PROVENANCE_ENTITY_ROLE: return createProvenanceEntityRole();
			case FhirPackage.PUBLICATION_STATUS: return createPublicationStatus();
			case FhirPackage.QUALITY_TYPE: return createQualityType();
			case FhirPackage.QUANTITY: return createQuantity();
			case FhirPackage.QUANTITY_COMPARATOR: return createQuantityComparator();
			case FhirPackage.QUESTIONNAIRE: return createQuestionnaire();
			case FhirPackage.QUESTIONNAIRE_ENABLE_WHEN: return createQuestionnaireEnableWhen();
			case FhirPackage.QUESTIONNAIRE_ITEM: return createQuestionnaireItem();
			case FhirPackage.QUESTIONNAIRE_ITEM_TYPE: return createQuestionnaireItemType();
			case FhirPackage.QUESTIONNAIRE_OPTION: return createQuestionnaireOption();
			case FhirPackage.QUESTIONNAIRE_RESPONSE: return createQuestionnaireResponse();
			case FhirPackage.QUESTIONNAIRE_RESPONSE_ANSWER: return createQuestionnaireResponseAnswer();
			case FhirPackage.QUESTIONNAIRE_RESPONSE_ITEM: return createQuestionnaireResponseItem();
			case FhirPackage.QUESTIONNAIRE_RESPONSE_STATUS: return createQuestionnaireResponseStatus();
			case FhirPackage.RANGE: return createRange();
			case FhirPackage.RATIO: return createRatio();
			case FhirPackage.REFERENCE: return createReference();
			case FhirPackage.REFERENCE_HANDLING_POLICY: return createReferenceHandlingPolicy();
			case FhirPackage.REFERENCE_VERSION_RULES: return createReferenceVersionRules();
			case FhirPackage.REFERRAL_REQUEST: return createReferralRequest();
			case FhirPackage.REFERRAL_REQUEST_REQUESTER: return createReferralRequestRequester();
			case FhirPackage.RELATED_ARTIFACT: return createRelatedArtifact();
			case FhirPackage.RELATED_ARTIFACT_TYPE: return createRelatedArtifactType();
			case FhirPackage.RELATED_PERSON: return createRelatedPerson();
			case FhirPackage.REMITTANCE_OUTCOME: return createRemittanceOutcome();
			case FhirPackage.REPOSITORY_TYPE: return createRepositoryType();
			case FhirPackage.REQUEST_GROUP: return createRequestGroup();
			case FhirPackage.REQUEST_GROUP_ACTION: return createRequestGroupAction();
			case FhirPackage.REQUEST_GROUP_CONDITION: return createRequestGroupCondition();
			case FhirPackage.REQUEST_GROUP_RELATED_ACTION: return createRequestGroupRelatedAction();
			case FhirPackage.REQUEST_INTENT: return createRequestIntent();
			case FhirPackage.REQUEST_PRIORITY: return createRequestPriority();
			case FhirPackage.REQUEST_STATUS: return createRequestStatus();
			case FhirPackage.RESEARCH_STUDY: return createResearchStudy();
			case FhirPackage.RESEARCH_STUDY_ARM: return createResearchStudyArm();
			case FhirPackage.RESEARCH_STUDY_STATUS: return createResearchStudyStatus();
			case FhirPackage.RESEARCH_SUBJECT: return createResearchSubject();
			case FhirPackage.RESEARCH_SUBJECT_STATUS: return createResearchSubjectStatus();
			case FhirPackage.RESOURCE: return createResource();
			case FhirPackage.RESOURCE_CONTAINER: return createResourceContainer();
			case FhirPackage.RESOURCE_TYPE: return createResourceType();
			case FhirPackage.RESOURCE_VERSION_POLICY: return createResourceVersionPolicy();
			case FhirPackage.RESPONSE_TYPE: return createResponseType();
			case FhirPackage.RESTFUL_CAPABILITY_MODE: return createRestfulCapabilityMode();
			case FhirPackage.RISK_ASSESSMENT: return createRiskAssessment();
			case FhirPackage.RISK_ASSESSMENT_PREDICTION: return createRiskAssessmentPrediction();
			case FhirPackage.SAMPLED_DATA: return createSampledData();
			case FhirPackage.SAMPLED_DATA_DATA_TYPE: return createSampledDataDataType();
			case FhirPackage.SCHEDULE: return createSchedule();
			case FhirPackage.SEARCH_COMPARATOR: return createSearchComparator();
			case FhirPackage.SEARCH_ENTRY_MODE: return createSearchEntryMode();
			case FhirPackage.SEARCH_MODIFIER_CODE: return createSearchModifierCode();
			case FhirPackage.SEARCH_PARAMETER: return createSearchParameter();
			case FhirPackage.SEARCH_PARAMETER_COMPONENT: return createSearchParameterComponent();
			case FhirPackage.SEARCH_PARAM_TYPE: return createSearchParamType();
			case FhirPackage.SEQUENCE: return createSequence();
			case FhirPackage.SEQUENCE_QUALITY: return createSequenceQuality();
			case FhirPackage.SEQUENCE_REFERENCE_SEQ: return createSequenceReferenceSeq();
			case FhirPackage.SEQUENCE_REPOSITORY: return createSequenceRepository();
			case FhirPackage.SEQUENCE_VARIANT: return createSequenceVariant();
			case FhirPackage.SERVICE_DEFINITION: return createServiceDefinition();
			case FhirPackage.SIGNATURE: return createSignature();
			case FhirPackage.SLICING_RULES: return createSlicingRules();
			case FhirPackage.SLOT: return createSlot();
			case FhirPackage.SLOT_STATUS: return createSlotStatus();
			case FhirPackage.SPECIMEN: return createSpecimen();
			case FhirPackage.SPECIMEN_COLLECTION: return createSpecimenCollection();
			case FhirPackage.SPECIMEN_CONTAINER: return createSpecimenContainer();
			case FhirPackage.SPECIMEN_PROCESSING: return createSpecimenProcessing();
			case FhirPackage.SPECIMEN_STATUS: return createSpecimenStatus();
			case FhirPackage.STRING: return createString();
			case FhirPackage.STRUCTURE_DEFINITION: return createStructureDefinition();
			case FhirPackage.STRUCTURE_DEFINITION_DIFFERENTIAL: return createStructureDefinitionDifferential();
			case FhirPackage.STRUCTURE_DEFINITION_KIND: return createStructureDefinitionKind();
			case FhirPackage.STRUCTURE_DEFINITION_MAPPING: return createStructureDefinitionMapping();
			case FhirPackage.STRUCTURE_DEFINITION_SNAPSHOT: return createStructureDefinitionSnapshot();
			case FhirPackage.STRUCTURE_MAP: return createStructureMap();
			case FhirPackage.STRUCTURE_MAP_CONTEXT_TYPE: return createStructureMapContextType();
			case FhirPackage.STRUCTURE_MAP_DEPENDENT: return createStructureMapDependent();
			case FhirPackage.STRUCTURE_MAP_GROUP: return createStructureMapGroup();
			case FhirPackage.STRUCTURE_MAP_GROUP_TYPE_MODE: return createStructureMapGroupTypeMode();
			case FhirPackage.STRUCTURE_MAP_INPUT: return createStructureMapInput();
			case FhirPackage.STRUCTURE_MAP_INPUT_MODE: return createStructureMapInputMode();
			case FhirPackage.STRUCTURE_MAP_MODEL_MODE: return createStructureMapModelMode();
			case FhirPackage.STRUCTURE_MAP_PARAMETER: return createStructureMapParameter();
			case FhirPackage.STRUCTURE_MAP_RULE: return createStructureMapRule();
			case FhirPackage.STRUCTURE_MAP_SOURCE: return createStructureMapSource();
			case FhirPackage.STRUCTURE_MAP_SOURCE_LIST_MODE: return createStructureMapSourceListMode();
			case FhirPackage.STRUCTURE_MAP_STRUCTURE: return createStructureMapStructure();
			case FhirPackage.STRUCTURE_MAP_TARGET: return createStructureMapTarget();
			case FhirPackage.STRUCTURE_MAP_TARGET_LIST_MODE: return createStructureMapTargetListMode();
			case FhirPackage.STRUCTURE_MAP_TRANSFORM: return createStructureMapTransform();
			case FhirPackage.SUBSCRIPTION: return createSubscription();
			case FhirPackage.SUBSCRIPTION_CHANNEL: return createSubscriptionChannel();
			case FhirPackage.SUBSCRIPTION_CHANNEL_TYPE: return createSubscriptionChannelType();
			case FhirPackage.SUBSCRIPTION_STATUS: return createSubscriptionStatus();
			case FhirPackage.SUBSTANCE: return createSubstance();
			case FhirPackage.SUBSTANCE_INGREDIENT: return createSubstanceIngredient();
			case FhirPackage.SUBSTANCE_INSTANCE: return createSubstanceInstance();
			case FhirPackage.SUPPLY_DELIVERY: return createSupplyDelivery();
			case FhirPackage.SUPPLY_DELIVERY_STATUS: return createSupplyDeliveryStatus();
			case FhirPackage.SUPPLY_DELIVERY_SUPPLIED_ITEM: return createSupplyDeliverySuppliedItem();
			case FhirPackage.SUPPLY_REQUEST: return createSupplyRequest();
			case FhirPackage.SUPPLY_REQUEST_ORDERED_ITEM: return createSupplyRequestOrderedItem();
			case FhirPackage.SUPPLY_REQUEST_REQUESTER: return createSupplyRequestRequester();
			case FhirPackage.SUPPLY_REQUEST_STATUS: return createSupplyRequestStatus();
			case FhirPackage.SYSTEM_RESTFUL_INTERACTION: return createSystemRestfulInteraction();
			case FhirPackage.SYSTEM_VERSION_PROCESSING_MODE: return createSystemVersionProcessingMode();
			case FhirPackage.TASK: return createTask();
			case FhirPackage.TASK_INPUT: return createTaskInput();
			case FhirPackage.TASK_OUTPUT: return createTaskOutput();
			case FhirPackage.TASK_REQUESTER: return createTaskRequester();
			case FhirPackage.TASK_RESTRICTION: return createTaskRestriction();
			case FhirPackage.TASK_STATUS: return createTaskStatus();
			case FhirPackage.TEST_REPORT: return createTestReport();
			case FhirPackage.TEST_REPORT_ACTION: return createTestReportAction();
			case FhirPackage.TEST_REPORT_ACTION1: return createTestReportAction1();
			case FhirPackage.TEST_REPORT_ACTION2: return createTestReportAction2();
			case FhirPackage.TEST_REPORT_ACTION_RESULT: return createTestReportActionResult();
			case FhirPackage.TEST_REPORT_ASSERT: return createTestReportAssert();
			case FhirPackage.TEST_REPORT_OPERATION: return createTestReportOperation();
			case FhirPackage.TEST_REPORT_PARTICIPANT: return createTestReportParticipant();
			case FhirPackage.TEST_REPORT_PARTICIPANT_TYPE: return createTestReportParticipantType();
			case FhirPackage.TEST_REPORT_RESULT: return createTestReportResult();
			case FhirPackage.TEST_REPORT_SETUP: return createTestReportSetup();
			case FhirPackage.TEST_REPORT_STATUS: return createTestReportStatus();
			case FhirPackage.TEST_REPORT_TEARDOWN: return createTestReportTeardown();
			case FhirPackage.TEST_REPORT_TEST: return createTestReportTest();
			case FhirPackage.TEST_SCRIPT: return createTestScript();
			case FhirPackage.TEST_SCRIPT_ACTION: return createTestScriptAction();
			case FhirPackage.TEST_SCRIPT_ACTION1: return createTestScriptAction1();
			case FhirPackage.TEST_SCRIPT_ACTION2: return createTestScriptAction2();
			case FhirPackage.TEST_SCRIPT_ASSERT: return createTestScriptAssert();
			case FhirPackage.TEST_SCRIPT_CAPABILITY: return createTestScriptCapability();
			case FhirPackage.TEST_SCRIPT_DESTINATION: return createTestScriptDestination();
			case FhirPackage.TEST_SCRIPT_FIXTURE: return createTestScriptFixture();
			case FhirPackage.TEST_SCRIPT_LINK: return createTestScriptLink();
			case FhirPackage.TEST_SCRIPT_METADATA: return createTestScriptMetadata();
			case FhirPackage.TEST_SCRIPT_OPERATION: return createTestScriptOperation();
			case FhirPackage.TEST_SCRIPT_ORIGIN: return createTestScriptOrigin();
			case FhirPackage.TEST_SCRIPT_PARAM: return createTestScriptParam();
			case FhirPackage.TEST_SCRIPT_PARAM1: return createTestScriptParam1();
			case FhirPackage.TEST_SCRIPT_PARAM2: return createTestScriptParam2();
			case FhirPackage.TEST_SCRIPT_PARAM3: return createTestScriptParam3();
			case FhirPackage.TEST_SCRIPT_REQUEST_HEADER: return createTestScriptRequestHeader();
			case FhirPackage.TEST_SCRIPT_REQUEST_METHOD_CODE: return createTestScriptRequestMethodCode();
			case FhirPackage.TEST_SCRIPT_RULE: return createTestScriptRule();
			case FhirPackage.TEST_SCRIPT_RULE1: return createTestScriptRule1();
			case FhirPackage.TEST_SCRIPT_RULE2: return createTestScriptRule2();
			case FhirPackage.TEST_SCRIPT_RULE3: return createTestScriptRule3();
			case FhirPackage.TEST_SCRIPT_RULESET: return createTestScriptRuleset();
			case FhirPackage.TEST_SCRIPT_RULESET1: return createTestScriptRuleset1();
			case FhirPackage.TEST_SCRIPT_SETUP: return createTestScriptSetup();
			case FhirPackage.TEST_SCRIPT_TEARDOWN: return createTestScriptTeardown();
			case FhirPackage.TEST_SCRIPT_TEST: return createTestScriptTest();
			case FhirPackage.TEST_SCRIPT_VARIABLE: return createTestScriptVariable();
			case FhirPackage.TIME: return createTime();
			case FhirPackage.TIMING: return createTiming();
			case FhirPackage.TIMING_REPEAT: return createTimingRepeat();
			case FhirPackage.TRIGGER_DEFINITION: return createTriggerDefinition();
			case FhirPackage.TRIGGER_TYPE: return createTriggerType();
			case FhirPackage.TYPE_DERIVATION_RULE: return createTypeDerivationRule();
			case FhirPackage.TYPE_RESTFUL_INTERACTION: return createTypeRestfulInteraction();
			case FhirPackage.UDI_ENTRY_TYPE: return createUDIEntryType();
			case FhirPackage.UNITS_OF_TIME: return createUnitsOfTime();
			case FhirPackage.UNKNOWN_CONTENT_CODE: return createUnknownContentCode();
			case FhirPackage.UNSIGNED_INT: return createUnsignedInt();
			case FhirPackage.URI: return createUri();
			case FhirPackage.USAGE_CONTEXT: return createUsageContext();
			case FhirPackage.USE: return createUse();
			case FhirPackage.UUID: return createUuid();
			case FhirPackage.VALUE_SET: return createValueSet();
			case FhirPackage.VALUE_SET_COMPOSE: return createValueSetCompose();
			case FhirPackage.VALUE_SET_CONCEPT: return createValueSetConcept();
			case FhirPackage.VALUE_SET_CONTAINS: return createValueSetContains();
			case FhirPackage.VALUE_SET_DESIGNATION: return createValueSetDesignation();
			case FhirPackage.VALUE_SET_EXPANSION: return createValueSetExpansion();
			case FhirPackage.VALUE_SET_FILTER: return createValueSetFilter();
			case FhirPackage.VALUE_SET_INCLUDE: return createValueSetInclude();
			case FhirPackage.VALUE_SET_PARAMETER: return createValueSetParameter();
			case FhirPackage.VISION_BASE: return createVisionBase();
			case FhirPackage.VISION_EYES: return createVisionEyes();
			case FhirPackage.VISION_PRESCRIPTION: return createVisionPrescription();
			case FhirPackage.VISION_PRESCRIPTION_DISPENSE: return createVisionPrescriptionDispense();
			case FhirPackage.XPATH_USAGE_TYPE: return createXPathUsageType();
			default:
				throw new IllegalArgumentException("The class '" + eClass.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object createFromString(EDataType eDataType, String initialValue) {
		switch (eDataType.getClassifierID()) {
			case FhirPackage.ACCOUNT_STATUS_LIST:
				return createAccountStatusListFromString(eDataType, initialValue);
			case FhirPackage.ACTION_CARDINALITY_BEHAVIOR_LIST:
				return createActionCardinalityBehaviorListFromString(eDataType, initialValue);
			case FhirPackage.ACTION_CONDITION_KIND_LIST:
				return createActionConditionKindListFromString(eDataType, initialValue);
			case FhirPackage.ACTION_GROUPING_BEHAVIOR_LIST:
				return createActionGroupingBehaviorListFromString(eDataType, initialValue);
			case FhirPackage.ACTION_LIST_LIST:
				return createActionListListFromString(eDataType, initialValue);
			case FhirPackage.ACTION_PARTICIPANT_TYPE_LIST:
				return createActionParticipantTypeListFromString(eDataType, initialValue);
			case FhirPackage.ACTION_PRECHECK_BEHAVIOR_LIST:
				return createActionPrecheckBehaviorListFromString(eDataType, initialValue);
			case FhirPackage.ACTION_RELATIONSHIP_TYPE_LIST:
				return createActionRelationshipTypeListFromString(eDataType, initialValue);
			case FhirPackage.ACTION_REQUIRED_BEHAVIOR_LIST:
				return createActionRequiredBehaviorListFromString(eDataType, initialValue);
			case FhirPackage.ACTION_SELECTION_BEHAVIOR_LIST:
				return createActionSelectionBehaviorListFromString(eDataType, initialValue);
			case FhirPackage.ADDRESS_TYPE_LIST:
				return createAddressTypeListFromString(eDataType, initialValue);
			case FhirPackage.ADDRESS_USE_LIST:
				return createAddressUseListFromString(eDataType, initialValue);
			case FhirPackage.ADMINISTRATIVE_GENDER_LIST:
				return createAdministrativeGenderListFromString(eDataType, initialValue);
			case FhirPackage.ADVERSE_EVENT_CATEGORY_LIST:
				return createAdverseEventCategoryListFromString(eDataType, initialValue);
			case FhirPackage.ADVERSE_EVENT_CAUSALITY_LIST:
				return createAdverseEventCausalityListFromString(eDataType, initialValue);
			case FhirPackage.AGGREGATION_MODE_LIST:
				return createAggregationModeListFromString(eDataType, initialValue);
			case FhirPackage.ALLERGY_INTOLERANCE_CATEGORY_LIST:
				return createAllergyIntoleranceCategoryListFromString(eDataType, initialValue);
			case FhirPackage.ALLERGY_INTOLERANCE_CLINICAL_STATUS_LIST:
				return createAllergyIntoleranceClinicalStatusListFromString(eDataType, initialValue);
			case FhirPackage.ALLERGY_INTOLERANCE_CRITICALITY_LIST:
				return createAllergyIntoleranceCriticalityListFromString(eDataType, initialValue);
			case FhirPackage.ALLERGY_INTOLERANCE_SEVERITY_LIST:
				return createAllergyIntoleranceSeverityListFromString(eDataType, initialValue);
			case FhirPackage.ALLERGY_INTOLERANCE_TYPE_LIST:
				return createAllergyIntoleranceTypeListFromString(eDataType, initialValue);
			case FhirPackage.ALLERGY_INTOLERANCE_VERIFICATION_STATUS_LIST:
				return createAllergyIntoleranceVerificationStatusListFromString(eDataType, initialValue);
			case FhirPackage.APPOINTMENT_STATUS_LIST:
				return createAppointmentStatusListFromString(eDataType, initialValue);
			case FhirPackage.ASSERTION_DIRECTION_TYPE_LIST:
				return createAssertionDirectionTypeListFromString(eDataType, initialValue);
			case FhirPackage.ASSERTION_OPERATOR_TYPE_LIST:
				return createAssertionOperatorTypeListFromString(eDataType, initialValue);
			case FhirPackage.ASSERTION_RESPONSE_TYPES_LIST:
				return createAssertionResponseTypesListFromString(eDataType, initialValue);
			case FhirPackage.AUDIT_EVENT_ACTION_LIST:
				return createAuditEventActionListFromString(eDataType, initialValue);
			case FhirPackage.AUDIT_EVENT_AGENT_NETWORK_TYPE_LIST:
				return createAuditEventAgentNetworkTypeListFromString(eDataType, initialValue);
			case FhirPackage.AUDIT_EVENT_OUTCOME_LIST:
				return createAuditEventOutcomeListFromString(eDataType, initialValue);
			case FhirPackage.BINDING_STRENGTH_LIST:
				return createBindingStrengthListFromString(eDataType, initialValue);
			case FhirPackage.BUNDLE_TYPE_LIST:
				return createBundleTypeListFromString(eDataType, initialValue);
			case FhirPackage.CAPABILITY_STATEMENT_KIND_LIST:
				return createCapabilityStatementKindListFromString(eDataType, initialValue);
			case FhirPackage.CARE_PLAN_ACTIVITY_STATUS_LIST:
				return createCarePlanActivityStatusListFromString(eDataType, initialValue);
			case FhirPackage.CARE_PLAN_INTENT_LIST:
				return createCarePlanIntentListFromString(eDataType, initialValue);
			case FhirPackage.CARE_PLAN_STATUS_LIST:
				return createCarePlanStatusListFromString(eDataType, initialValue);
			case FhirPackage.CARE_TEAM_STATUS_LIST:
				return createCareTeamStatusListFromString(eDataType, initialValue);
			case FhirPackage.CHARGE_ITEM_STATUS_LIST:
				return createChargeItemStatusListFromString(eDataType, initialValue);
			case FhirPackage.CLINICAL_IMPRESSION_STATUS_LIST:
				return createClinicalImpressionStatusListFromString(eDataType, initialValue);
			case FhirPackage.CODE_SYSTEM_CONTENT_MODE_LIST:
				return createCodeSystemContentModeListFromString(eDataType, initialValue);
			case FhirPackage.CODE_SYSTEM_HIERARCHY_MEANING_LIST:
				return createCodeSystemHierarchyMeaningListFromString(eDataType, initialValue);
			case FhirPackage.COMPARTMENT_TYPE_LIST:
				return createCompartmentTypeListFromString(eDataType, initialValue);
			case FhirPackage.COMPOSITION_ATTESTATION_MODE_LIST:
				return createCompositionAttestationModeListFromString(eDataType, initialValue);
			case FhirPackage.COMPOSITION_STATUS_LIST:
				return createCompositionStatusListFromString(eDataType, initialValue);
			case FhirPackage.CONCEPT_MAP_EQUIVALENCE_LIST:
				return createConceptMapEquivalenceListFromString(eDataType, initialValue);
			case FhirPackage.CONCEPT_MAP_GROUP_UNMAPPED_MODE_LIST:
				return createConceptMapGroupUnmappedModeListFromString(eDataType, initialValue);
			case FhirPackage.CONDITIONAL_DELETE_STATUS_LIST:
				return createConditionalDeleteStatusListFromString(eDataType, initialValue);
			case FhirPackage.CONDITIONAL_READ_STATUS_LIST:
				return createConditionalReadStatusListFromString(eDataType, initialValue);
			case FhirPackage.CONDITION_CLINICAL_STATUS_CODES_LIST:
				return createConditionClinicalStatusCodesListFromString(eDataType, initialValue);
			case FhirPackage.CONDITION_VERIFICATION_STATUS_LIST:
				return createConditionVerificationStatusListFromString(eDataType, initialValue);
			case FhirPackage.CONFIDENTIALITY_CLASSIFICATION_LIST:
				return createConfidentialityClassificationListFromString(eDataType, initialValue);
			case FhirPackage.CONSENT_DATA_MEANING_LIST:
				return createConsentDataMeaningListFromString(eDataType, initialValue);
			case FhirPackage.CONSENT_EXCEPT_TYPE_LIST:
				return createConsentExceptTypeListFromString(eDataType, initialValue);
			case FhirPackage.CONSENT_STATE_LIST:
				return createConsentStateListFromString(eDataType, initialValue);
			case FhirPackage.CONSTRAINT_SEVERITY_LIST:
				return createConstraintSeverityListFromString(eDataType, initialValue);
			case FhirPackage.CONTACT_POINT_SYSTEM_LIST:
				return createContactPointSystemListFromString(eDataType, initialValue);
			case FhirPackage.CONTACT_POINT_USE_LIST:
				return createContactPointUseListFromString(eDataType, initialValue);
			case FhirPackage.CONTENT_TYPE_LIST:
				return createContentTypeListFromString(eDataType, initialValue);
			case FhirPackage.CONTRACT_RESOURCE_STATUS_CODES_LIST:
				return createContractResourceStatusCodesListFromString(eDataType, initialValue);
			case FhirPackage.CONTRIBUTOR_TYPE_LIST:
				return createContributorTypeListFromString(eDataType, initialValue);
			case FhirPackage.DATA_ELEMENT_STRINGENCY_LIST:
				return createDataElementStringencyListFromString(eDataType, initialValue);
			case FhirPackage.DAYS_OF_WEEK_LIST:
				return createDaysOfWeekListFromString(eDataType, initialValue);
			case FhirPackage.DETECTED_ISSUE_SEVERITY_LIST:
				return createDetectedIssueSeverityListFromString(eDataType, initialValue);
			case FhirPackage.DEVICE_METRIC_CALIBRATION_STATE_LIST:
				return createDeviceMetricCalibrationStateListFromString(eDataType, initialValue);
			case FhirPackage.DEVICE_METRIC_CALIBRATION_TYPE_LIST:
				return createDeviceMetricCalibrationTypeListFromString(eDataType, initialValue);
			case FhirPackage.DEVICE_METRIC_CATEGORY_LIST:
				return createDeviceMetricCategoryListFromString(eDataType, initialValue);
			case FhirPackage.DEVICE_METRIC_COLOR_LIST:
				return createDeviceMetricColorListFromString(eDataType, initialValue);
			case FhirPackage.DEVICE_METRIC_OPERATIONAL_STATUS_LIST:
				return createDeviceMetricOperationalStatusListFromString(eDataType, initialValue);
			case FhirPackage.DEVICE_USE_STATEMENT_STATUS_LIST:
				return createDeviceUseStatementStatusListFromString(eDataType, initialValue);
			case FhirPackage.DIAGNOSTIC_REPORT_STATUS_LIST:
				return createDiagnosticReportStatusListFromString(eDataType, initialValue);
			case FhirPackage.DIGITAL_MEDIA_TYPE_LIST:
				return createDigitalMediaTypeListFromString(eDataType, initialValue);
			case FhirPackage.DISCRIMINATOR_TYPE_LIST:
				return createDiscriminatorTypeListFromString(eDataType, initialValue);
			case FhirPackage.DOCUMENT_MODE_LIST:
				return createDocumentModeListFromString(eDataType, initialValue);
			case FhirPackage.DOCUMENT_REFERENCE_STATUS_LIST:
				return createDocumentReferenceStatusListFromString(eDataType, initialValue);
			case FhirPackage.DOCUMENT_RELATIONSHIP_TYPE_LIST:
				return createDocumentRelationshipTypeListFromString(eDataType, initialValue);
			case FhirPackage.ENCOUNTER_LOCATION_STATUS_LIST:
				return createEncounterLocationStatusListFromString(eDataType, initialValue);
			case FhirPackage.ENCOUNTER_STATUS_LIST:
				return createEncounterStatusListFromString(eDataType, initialValue);
			case FhirPackage.ENDPOINT_STATUS_LIST:
				return createEndpointStatusListFromString(eDataType, initialValue);
			case FhirPackage.EPISODE_OF_CARE_STATUS_LIST:
				return createEpisodeOfCareStatusListFromString(eDataType, initialValue);
			case FhirPackage.EVENT_CAPABILITY_MODE_LIST:
				return createEventCapabilityModeListFromString(eDataType, initialValue);
			case FhirPackage.EVENT_STATUS_LIST:
				return createEventStatusListFromString(eDataType, initialValue);
			case FhirPackage.EVENT_TIMING_LIST:
				return createEventTimingListFromString(eDataType, initialValue);
			case FhirPackage.EXPLANATION_OF_BENEFIT_STATUS_LIST:
				return createExplanationOfBenefitStatusListFromString(eDataType, initialValue);
			case FhirPackage.EXTENSION_CONTEXT_LIST:
				return createExtensionContextListFromString(eDataType, initialValue);
			case FhirPackage.FAMILY_HISTORY_STATUS_LIST:
				return createFamilyHistoryStatusListFromString(eDataType, initialValue);
			case FhirPackage.FHIR_ALL_TYPES_LIST:
				return createFHIRAllTypesListFromString(eDataType, initialValue);
			case FhirPackage.FHIR_DEFINED_TYPE_LIST:
				return createFHIRDefinedTypeListFromString(eDataType, initialValue);
			case FhirPackage.FHIR_DEVICE_STATUS_LIST:
				return createFHIRDeviceStatusListFromString(eDataType, initialValue);
			case FhirPackage.FHIR_SUBSTANCE_STATUS_LIST:
				return createFHIRSubstanceStatusListFromString(eDataType, initialValue);
			case FhirPackage.FILTER_OPERATOR_LIST:
				return createFilterOperatorListFromString(eDataType, initialValue);
			case FhirPackage.FINANCIAL_RESOURCE_STATUS_CODES_LIST:
				return createFinancialResourceStatusCodesListFromString(eDataType, initialValue);
			case FhirPackage.FLAG_STATUS_LIST:
				return createFlagStatusListFromString(eDataType, initialValue);
			case FhirPackage.GOAL_STATUS_LIST:
				return createGoalStatusListFromString(eDataType, initialValue);
			case FhirPackage.GRAPH_COMPARTMENT_RULE_LIST:
				return createGraphCompartmentRuleListFromString(eDataType, initialValue);
			case FhirPackage.GROUP_TYPE_LIST:
				return createGroupTypeListFromString(eDataType, initialValue);
			case FhirPackage.GUIDANCE_RESPONSE_STATUS_LIST:
				return createGuidanceResponseStatusListFromString(eDataType, initialValue);
			case FhirPackage.GUIDE_DEPENDENCY_TYPE_LIST:
				return createGuideDependencyTypeListFromString(eDataType, initialValue);
			case FhirPackage.GUIDE_PAGE_KIND_LIST:
				return createGuidePageKindListFromString(eDataType, initialValue);
			case FhirPackage.HTTP_VERB_LIST:
				return createHTTPVerbListFromString(eDataType, initialValue);
			case FhirPackage.IDENTIFIER_USE_LIST:
				return createIdentifierUseListFromString(eDataType, initialValue);
			case FhirPackage.IDENTITY_ASSURANCE_LEVEL_LIST:
				return createIdentityAssuranceLevelListFromString(eDataType, initialValue);
			case FhirPackage.IMMUNIZATION_STATUS_CODES_LIST:
				return createImmunizationStatusCodesListFromString(eDataType, initialValue);
			case FhirPackage.INSTANCE_AVAILABILITY_LIST:
				return createInstanceAvailabilityListFromString(eDataType, initialValue);
			case FhirPackage.ISSUE_SEVERITY_LIST:
				return createIssueSeverityListFromString(eDataType, initialValue);
			case FhirPackage.ISSUE_TYPE_LIST:
				return createIssueTypeListFromString(eDataType, initialValue);
			case FhirPackage.LINKAGE_TYPE_LIST:
				return createLinkageTypeListFromString(eDataType, initialValue);
			case FhirPackage.LINK_TYPE_LIST:
				return createLinkTypeListFromString(eDataType, initialValue);
			case FhirPackage.LIST_MODE_LIST:
				return createListModeListFromString(eDataType, initialValue);
			case FhirPackage.LIST_STATUS_LIST:
				return createListStatusListFromString(eDataType, initialValue);
			case FhirPackage.LOCATION_MODE_LIST:
				return createLocationModeListFromString(eDataType, initialValue);
			case FhirPackage.LOCATION_STATUS_LIST:
				return createLocationStatusListFromString(eDataType, initialValue);
			case FhirPackage.MEASMNT_PRINCIPLE_LIST:
				return createMeasmntPrincipleListFromString(eDataType, initialValue);
			case FhirPackage.MEASURE_REPORT_STATUS_LIST:
				return createMeasureReportStatusListFromString(eDataType, initialValue);
			case FhirPackage.MEASURE_REPORT_TYPE_LIST:
				return createMeasureReportTypeListFromString(eDataType, initialValue);
			case FhirPackage.MEDICATION_ADMINISTRATION_STATUS_LIST:
				return createMedicationAdministrationStatusListFromString(eDataType, initialValue);
			case FhirPackage.MEDICATION_DISPENSE_STATUS_LIST:
				return createMedicationDispenseStatusListFromString(eDataType, initialValue);
			case FhirPackage.MEDICATION_REQUEST_INTENT_LIST:
				return createMedicationRequestIntentListFromString(eDataType, initialValue);
			case FhirPackage.MEDICATION_REQUEST_PRIORITY_LIST:
				return createMedicationRequestPriorityListFromString(eDataType, initialValue);
			case FhirPackage.MEDICATION_REQUEST_STATUS_LIST:
				return createMedicationRequestStatusListFromString(eDataType, initialValue);
			case FhirPackage.MEDICATION_STATEMENT_STATUS_LIST:
				return createMedicationStatementStatusListFromString(eDataType, initialValue);
			case FhirPackage.MEDICATION_STATEMENT_TAKEN_LIST:
				return createMedicationStatementTakenListFromString(eDataType, initialValue);
			case FhirPackage.MEDICATION_STATUS_LIST:
				return createMedicationStatusListFromString(eDataType, initialValue);
			case FhirPackage.MESSAGE_SIGNIFICANCE_CATEGORY_LIST:
				return createMessageSignificanceCategoryListFromString(eDataType, initialValue);
			case FhirPackage.NAME_USE_LIST:
				return createNameUseListFromString(eDataType, initialValue);
			case FhirPackage.NAMING_SYSTEM_IDENTIFIER_TYPE_LIST:
				return createNamingSystemIdentifierTypeListFromString(eDataType, initialValue);
			case FhirPackage.NAMING_SYSTEM_TYPE_LIST:
				return createNamingSystemTypeListFromString(eDataType, initialValue);
			case FhirPackage.NARRATIVE_STATUS_LIST:
				return createNarrativeStatusListFromString(eDataType, initialValue);
			case FhirPackage.NOTE_TYPE_LIST:
				return createNoteTypeListFromString(eDataType, initialValue);
			case FhirPackage.NUTRITION_ORDER_STATUS_LIST:
				return createNutritionOrderStatusListFromString(eDataType, initialValue);
			case FhirPackage.OBSERVATION_RELATIONSHIP_TYPE_LIST:
				return createObservationRelationshipTypeListFromString(eDataType, initialValue);
			case FhirPackage.OBSERVATION_STATUS_LIST:
				return createObservationStatusListFromString(eDataType, initialValue);
			case FhirPackage.OPERATION_KIND_LIST:
				return createOperationKindListFromString(eDataType, initialValue);
			case FhirPackage.OPERATION_PARAMETER_USE_LIST:
				return createOperationParameterUseListFromString(eDataType, initialValue);
			case FhirPackage.PARTICIPANT_REQUIRED_LIST:
				return createParticipantRequiredListFromString(eDataType, initialValue);
			case FhirPackage.PARTICIPATION_STATUS_LIST:
				return createParticipationStatusListFromString(eDataType, initialValue);
			case FhirPackage.PROPERTY_REPRESENTATION_LIST:
				return createPropertyRepresentationListFromString(eDataType, initialValue);
			case FhirPackage.PROPERTY_TYPE_LIST:
				return createPropertyTypeListFromString(eDataType, initialValue);
			case FhirPackage.PROVENANCE_ENTITY_ROLE_LIST:
				return createProvenanceEntityRoleListFromString(eDataType, initialValue);
			case FhirPackage.PUBLICATION_STATUS_LIST:
				return createPublicationStatusListFromString(eDataType, initialValue);
			case FhirPackage.QUALITY_TYPE_LIST:
				return createQualityTypeListFromString(eDataType, initialValue);
			case FhirPackage.QUANTITY_COMPARATOR_LIST:
				return createQuantityComparatorListFromString(eDataType, initialValue);
			case FhirPackage.QUESTIONNAIRE_ITEM_TYPE_LIST:
				return createQuestionnaireItemTypeListFromString(eDataType, initialValue);
			case FhirPackage.QUESTIONNAIRE_RESPONSE_STATUS_LIST:
				return createQuestionnaireResponseStatusListFromString(eDataType, initialValue);
			case FhirPackage.REFERENCE_HANDLING_POLICY_LIST:
				return createReferenceHandlingPolicyListFromString(eDataType, initialValue);
			case FhirPackage.REFERENCE_VERSION_RULES_LIST:
				return createReferenceVersionRulesListFromString(eDataType, initialValue);
			case FhirPackage.RELATED_ARTIFACT_TYPE_LIST:
				return createRelatedArtifactTypeListFromString(eDataType, initialValue);
			case FhirPackage.REMITTANCE_OUTCOME_LIST:
				return createRemittanceOutcomeListFromString(eDataType, initialValue);
			case FhirPackage.REPOSITORY_TYPE_LIST:
				return createRepositoryTypeListFromString(eDataType, initialValue);
			case FhirPackage.REQUEST_INTENT_LIST:
				return createRequestIntentListFromString(eDataType, initialValue);
			case FhirPackage.REQUEST_PRIORITY_LIST:
				return createRequestPriorityListFromString(eDataType, initialValue);
			case FhirPackage.REQUEST_STATUS_LIST:
				return createRequestStatusListFromString(eDataType, initialValue);
			case FhirPackage.RESEARCH_STUDY_STATUS_LIST:
				return createResearchStudyStatusListFromString(eDataType, initialValue);
			case FhirPackage.RESEARCH_SUBJECT_STATUS_LIST:
				return createResearchSubjectStatusListFromString(eDataType, initialValue);
			case FhirPackage.RESOURCE_TYPE_LIST:
				return createResourceTypeListFromString(eDataType, initialValue);
			case FhirPackage.RESOURCE_VERSION_POLICY_LIST:
				return createResourceVersionPolicyListFromString(eDataType, initialValue);
			case FhirPackage.RESPONSE_TYPE_LIST:
				return createResponseTypeListFromString(eDataType, initialValue);
			case FhirPackage.RESTFUL_CAPABILITY_MODE_LIST:
				return createRestfulCapabilityModeListFromString(eDataType, initialValue);
			case FhirPackage.SEARCH_COMPARATOR_LIST:
				return createSearchComparatorListFromString(eDataType, initialValue);
			case FhirPackage.SEARCH_ENTRY_MODE_LIST:
				return createSearchEntryModeListFromString(eDataType, initialValue);
			case FhirPackage.SEARCH_MODIFIER_CODE_LIST:
				return createSearchModifierCodeListFromString(eDataType, initialValue);
			case FhirPackage.SEARCH_PARAM_TYPE_LIST:
				return createSearchParamTypeListFromString(eDataType, initialValue);
			case FhirPackage.SLICING_RULES_LIST:
				return createSlicingRulesListFromString(eDataType, initialValue);
			case FhirPackage.SLOT_STATUS_LIST:
				return createSlotStatusListFromString(eDataType, initialValue);
			case FhirPackage.SPECIMEN_STATUS_LIST:
				return createSpecimenStatusListFromString(eDataType, initialValue);
			case FhirPackage.STRUCTURE_DEFINITION_KIND_LIST:
				return createStructureDefinitionKindListFromString(eDataType, initialValue);
			case FhirPackage.STRUCTURE_MAP_CONTEXT_TYPE_LIST:
				return createStructureMapContextTypeListFromString(eDataType, initialValue);
			case FhirPackage.STRUCTURE_MAP_GROUP_TYPE_MODE_LIST:
				return createStructureMapGroupTypeModeListFromString(eDataType, initialValue);
			case FhirPackage.STRUCTURE_MAP_INPUT_MODE_LIST:
				return createStructureMapInputModeListFromString(eDataType, initialValue);
			case FhirPackage.STRUCTURE_MAP_MODEL_MODE_LIST:
				return createStructureMapModelModeListFromString(eDataType, initialValue);
			case FhirPackage.STRUCTURE_MAP_SOURCE_LIST_MODE_LIST:
				return createStructureMapSourceListModeListFromString(eDataType, initialValue);
			case FhirPackage.STRUCTURE_MAP_TARGET_LIST_MODE_LIST:
				return createStructureMapTargetListModeListFromString(eDataType, initialValue);
			case FhirPackage.STRUCTURE_MAP_TRANSFORM_LIST:
				return createStructureMapTransformListFromString(eDataType, initialValue);
			case FhirPackage.SUBSCRIPTION_CHANNEL_TYPE_LIST:
				return createSubscriptionChannelTypeListFromString(eDataType, initialValue);
			case FhirPackage.SUBSCRIPTION_STATUS_LIST:
				return createSubscriptionStatusListFromString(eDataType, initialValue);
			case FhirPackage.SUPPLY_DELIVERY_STATUS_LIST:
				return createSupplyDeliveryStatusListFromString(eDataType, initialValue);
			case FhirPackage.SUPPLY_REQUEST_STATUS_LIST:
				return createSupplyRequestStatusListFromString(eDataType, initialValue);
			case FhirPackage.SYSTEM_RESTFUL_INTERACTION_LIST:
				return createSystemRestfulInteractionListFromString(eDataType, initialValue);
			case FhirPackage.SYSTEM_VERSION_PROCESSING_MODE_LIST:
				return createSystemVersionProcessingModeListFromString(eDataType, initialValue);
			case FhirPackage.TASK_STATUS_LIST:
				return createTaskStatusListFromString(eDataType, initialValue);
			case FhirPackage.TEST_REPORT_ACTION_RESULT_LIST:
				return createTestReportActionResultListFromString(eDataType, initialValue);
			case FhirPackage.TEST_REPORT_PARTICIPANT_TYPE_LIST:
				return createTestReportParticipantTypeListFromString(eDataType, initialValue);
			case FhirPackage.TEST_REPORT_RESULT_LIST:
				return createTestReportResultListFromString(eDataType, initialValue);
			case FhirPackage.TEST_REPORT_STATUS_LIST:
				return createTestReportStatusListFromString(eDataType, initialValue);
			case FhirPackage.TEST_SCRIPT_REQUEST_METHOD_CODE_LIST:
				return createTestScriptRequestMethodCodeListFromString(eDataType, initialValue);
			case FhirPackage.TRIGGER_TYPE_LIST:
				return createTriggerTypeListFromString(eDataType, initialValue);
			case FhirPackage.TYPE_DERIVATION_RULE_LIST:
				return createTypeDerivationRuleListFromString(eDataType, initialValue);
			case FhirPackage.TYPE_RESTFUL_INTERACTION_LIST:
				return createTypeRestfulInteractionListFromString(eDataType, initialValue);
			case FhirPackage.UDI_ENTRY_TYPE_LIST:
				return createUDIEntryTypeListFromString(eDataType, initialValue);
			case FhirPackage.UNITS_OF_TIME_LIST:
				return createUnitsOfTimeListFromString(eDataType, initialValue);
			case FhirPackage.UNKNOWN_CONTENT_CODE_LIST:
				return createUnknownContentCodeListFromString(eDataType, initialValue);
			case FhirPackage.USE_LIST:
				return createUseListFromString(eDataType, initialValue);
			case FhirPackage.VISION_BASE_LIST:
				return createVisionBaseListFromString(eDataType, initialValue);
			case FhirPackage.VISION_EYES_LIST:
				return createVisionEyesListFromString(eDataType, initialValue);
			case FhirPackage.XPATH_USAGE_TYPE_LIST:
				return createXPathUsageTypeListFromString(eDataType, initialValue);
			case FhirPackage.ACCOUNT_STATUS_LIST_OBJECT:
				return createAccountStatusListObjectFromString(eDataType, initialValue);
			case FhirPackage.ACTION_CARDINALITY_BEHAVIOR_LIST_OBJECT:
				return createActionCardinalityBehaviorListObjectFromString(eDataType, initialValue);
			case FhirPackage.ACTION_CONDITION_KIND_LIST_OBJECT:
				return createActionConditionKindListObjectFromString(eDataType, initialValue);
			case FhirPackage.ACTION_GROUPING_BEHAVIOR_LIST_OBJECT:
				return createActionGroupingBehaviorListObjectFromString(eDataType, initialValue);
			case FhirPackage.ACTION_LIST_LIST_OBJECT:
				return createActionListListObjectFromString(eDataType, initialValue);
			case FhirPackage.ACTION_PARTICIPANT_TYPE_LIST_OBJECT:
				return createActionParticipantTypeListObjectFromString(eDataType, initialValue);
			case FhirPackage.ACTION_PRECHECK_BEHAVIOR_LIST_OBJECT:
				return createActionPrecheckBehaviorListObjectFromString(eDataType, initialValue);
			case FhirPackage.ACTION_RELATIONSHIP_TYPE_LIST_OBJECT:
				return createActionRelationshipTypeListObjectFromString(eDataType, initialValue);
			case FhirPackage.ACTION_REQUIRED_BEHAVIOR_LIST_OBJECT:
				return createActionRequiredBehaviorListObjectFromString(eDataType, initialValue);
			case FhirPackage.ACTION_SELECTION_BEHAVIOR_LIST_OBJECT:
				return createActionSelectionBehaviorListObjectFromString(eDataType, initialValue);
			case FhirPackage.ADDRESS_TYPE_LIST_OBJECT:
				return createAddressTypeListObjectFromString(eDataType, initialValue);
			case FhirPackage.ADDRESS_USE_LIST_OBJECT:
				return createAddressUseListObjectFromString(eDataType, initialValue);
			case FhirPackage.ADMINISTRATIVE_GENDER_LIST_OBJECT:
				return createAdministrativeGenderListObjectFromString(eDataType, initialValue);
			case FhirPackage.ADVERSE_EVENT_CATEGORY_LIST_OBJECT:
				return createAdverseEventCategoryListObjectFromString(eDataType, initialValue);
			case FhirPackage.ADVERSE_EVENT_CAUSALITY_LIST_OBJECT:
				return createAdverseEventCausalityListObjectFromString(eDataType, initialValue);
			case FhirPackage.AGGREGATION_MODE_LIST_OBJECT:
				return createAggregationModeListObjectFromString(eDataType, initialValue);
			case FhirPackage.ALLERGY_INTOLERANCE_CATEGORY_LIST_OBJECT:
				return createAllergyIntoleranceCategoryListObjectFromString(eDataType, initialValue);
			case FhirPackage.ALLERGY_INTOLERANCE_CLINICAL_STATUS_LIST_OBJECT:
				return createAllergyIntoleranceClinicalStatusListObjectFromString(eDataType, initialValue);
			case FhirPackage.ALLERGY_INTOLERANCE_CRITICALITY_LIST_OBJECT:
				return createAllergyIntoleranceCriticalityListObjectFromString(eDataType, initialValue);
			case FhirPackage.ALLERGY_INTOLERANCE_SEVERITY_LIST_OBJECT:
				return createAllergyIntoleranceSeverityListObjectFromString(eDataType, initialValue);
			case FhirPackage.ALLERGY_INTOLERANCE_TYPE_LIST_OBJECT:
				return createAllergyIntoleranceTypeListObjectFromString(eDataType, initialValue);
			case FhirPackage.ALLERGY_INTOLERANCE_VERIFICATION_STATUS_LIST_OBJECT:
				return createAllergyIntoleranceVerificationStatusListObjectFromString(eDataType, initialValue);
			case FhirPackage.APPOINTMENT_STATUS_LIST_OBJECT:
				return createAppointmentStatusListObjectFromString(eDataType, initialValue);
			case FhirPackage.ASSERTION_DIRECTION_TYPE_LIST_OBJECT:
				return createAssertionDirectionTypeListObjectFromString(eDataType, initialValue);
			case FhirPackage.ASSERTION_OPERATOR_TYPE_LIST_OBJECT:
				return createAssertionOperatorTypeListObjectFromString(eDataType, initialValue);
			case FhirPackage.ASSERTION_RESPONSE_TYPES_LIST_OBJECT:
				return createAssertionResponseTypesListObjectFromString(eDataType, initialValue);
			case FhirPackage.AUDIT_EVENT_ACTION_LIST_OBJECT:
				return createAuditEventActionListObjectFromString(eDataType, initialValue);
			case FhirPackage.AUDIT_EVENT_AGENT_NETWORK_TYPE_LIST_OBJECT:
				return createAuditEventAgentNetworkTypeListObjectFromString(eDataType, initialValue);
			case FhirPackage.AUDIT_EVENT_OUTCOME_LIST_OBJECT:
				return createAuditEventOutcomeListObjectFromString(eDataType, initialValue);
			case FhirPackage.BASE64_BINARY_PRIMITIVE:
				return createBase64BinaryPrimitiveFromString(eDataType, initialValue);
			case FhirPackage.BINDING_STRENGTH_LIST_OBJECT:
				return createBindingStrengthListObjectFromString(eDataType, initialValue);
			case FhirPackage.BOOLEAN_PRIMITIVE:
				return createBooleanPrimitiveFromString(eDataType, initialValue);
			case FhirPackage.BOOLEAN_PRIMITIVE_OBJECT:
				return createBooleanPrimitiveObjectFromString(eDataType, initialValue);
			case FhirPackage.BUNDLE_TYPE_LIST_OBJECT:
				return createBundleTypeListObjectFromString(eDataType, initialValue);
			case FhirPackage.CAPABILITY_STATEMENT_KIND_LIST_OBJECT:
				return createCapabilityStatementKindListObjectFromString(eDataType, initialValue);
			case FhirPackage.CARE_PLAN_ACTIVITY_STATUS_LIST_OBJECT:
				return createCarePlanActivityStatusListObjectFromString(eDataType, initialValue);
			case FhirPackage.CARE_PLAN_INTENT_LIST_OBJECT:
				return createCarePlanIntentListObjectFromString(eDataType, initialValue);
			case FhirPackage.CARE_PLAN_STATUS_LIST_OBJECT:
				return createCarePlanStatusListObjectFromString(eDataType, initialValue);
			case FhirPackage.CARE_TEAM_STATUS_LIST_OBJECT:
				return createCareTeamStatusListObjectFromString(eDataType, initialValue);
			case FhirPackage.CHARGE_ITEM_STATUS_LIST_OBJECT:
				return createChargeItemStatusListObjectFromString(eDataType, initialValue);
			case FhirPackage.CLINICAL_IMPRESSION_STATUS_LIST_OBJECT:
				return createClinicalImpressionStatusListObjectFromString(eDataType, initialValue);
			case FhirPackage.CODE_PRIMITIVE:
				return createCodePrimitiveFromString(eDataType, initialValue);
			case FhirPackage.CODE_SYSTEM_CONTENT_MODE_LIST_OBJECT:
				return createCodeSystemContentModeListObjectFromString(eDataType, initialValue);
			case FhirPackage.CODE_SYSTEM_HIERARCHY_MEANING_LIST_OBJECT:
				return createCodeSystemHierarchyMeaningListObjectFromString(eDataType, initialValue);
			case FhirPackage.COMPARTMENT_TYPE_LIST_OBJECT:
				return createCompartmentTypeListObjectFromString(eDataType, initialValue);
			case FhirPackage.COMPOSITION_ATTESTATION_MODE_LIST_OBJECT:
				return createCompositionAttestationModeListObjectFromString(eDataType, initialValue);
			case FhirPackage.COMPOSITION_STATUS_LIST_OBJECT:
				return createCompositionStatusListObjectFromString(eDataType, initialValue);
			case FhirPackage.CONCEPT_MAP_EQUIVALENCE_LIST_OBJECT:
				return createConceptMapEquivalenceListObjectFromString(eDataType, initialValue);
			case FhirPackage.CONCEPT_MAP_GROUP_UNMAPPED_MODE_LIST_OBJECT:
				return createConceptMapGroupUnmappedModeListObjectFromString(eDataType, initialValue);
			case FhirPackage.CONDITIONAL_DELETE_STATUS_LIST_OBJECT:
				return createConditionalDeleteStatusListObjectFromString(eDataType, initialValue);
			case FhirPackage.CONDITIONAL_READ_STATUS_LIST_OBJECT:
				return createConditionalReadStatusListObjectFromString(eDataType, initialValue);
			case FhirPackage.CONDITION_CLINICAL_STATUS_CODES_LIST_OBJECT:
				return createConditionClinicalStatusCodesListObjectFromString(eDataType, initialValue);
			case FhirPackage.CONDITION_VERIFICATION_STATUS_LIST_OBJECT:
				return createConditionVerificationStatusListObjectFromString(eDataType, initialValue);
			case FhirPackage.CONFIDENTIALITY_CLASSIFICATION_LIST_OBJECT:
				return createConfidentialityClassificationListObjectFromString(eDataType, initialValue);
			case FhirPackage.CONSENT_DATA_MEANING_LIST_OBJECT:
				return createConsentDataMeaningListObjectFromString(eDataType, initialValue);
			case FhirPackage.CONSENT_EXCEPT_TYPE_LIST_OBJECT:
				return createConsentExceptTypeListObjectFromString(eDataType, initialValue);
			case FhirPackage.CONSENT_STATE_LIST_OBJECT:
				return createConsentStateListObjectFromString(eDataType, initialValue);
			case FhirPackage.CONSTRAINT_SEVERITY_LIST_OBJECT:
				return createConstraintSeverityListObjectFromString(eDataType, initialValue);
			case FhirPackage.CONTACT_POINT_SYSTEM_LIST_OBJECT:
				return createContactPointSystemListObjectFromString(eDataType, initialValue);
			case FhirPackage.CONTACT_POINT_USE_LIST_OBJECT:
				return createContactPointUseListObjectFromString(eDataType, initialValue);
			case FhirPackage.CONTENT_TYPE_LIST_OBJECT:
				return createContentTypeListObjectFromString(eDataType, initialValue);
			case FhirPackage.CONTRACT_RESOURCE_STATUS_CODES_LIST_OBJECT:
				return createContractResourceStatusCodesListObjectFromString(eDataType, initialValue);
			case FhirPackage.CONTRIBUTOR_TYPE_LIST_OBJECT:
				return createContributorTypeListObjectFromString(eDataType, initialValue);
			case FhirPackage.DATA_ELEMENT_STRINGENCY_LIST_OBJECT:
				return createDataElementStringencyListObjectFromString(eDataType, initialValue);
			case FhirPackage.DATE_PRIMITIVE:
				return createDatePrimitiveFromString(eDataType, initialValue);
			case FhirPackage.DATE_PRIMITIVE_BASE:
				return createDatePrimitiveBaseFromString(eDataType, initialValue);
			case FhirPackage.DATE_TIME_PRIMITIVE:
				return createDateTimePrimitiveFromString(eDataType, initialValue);
			case FhirPackage.DATE_TIME_PRIMITIVE_BASE:
				return createDateTimePrimitiveBaseFromString(eDataType, initialValue);
			case FhirPackage.DAYS_OF_WEEK_LIST_OBJECT:
				return createDaysOfWeekListObjectFromString(eDataType, initialValue);
			case FhirPackage.DECIMAL_PRIMITIVE:
				return createDecimalPrimitiveFromString(eDataType, initialValue);
			case FhirPackage.DETECTED_ISSUE_SEVERITY_LIST_OBJECT:
				return createDetectedIssueSeverityListObjectFromString(eDataType, initialValue);
			case FhirPackage.DEVICE_METRIC_CALIBRATION_STATE_LIST_OBJECT:
				return createDeviceMetricCalibrationStateListObjectFromString(eDataType, initialValue);
			case FhirPackage.DEVICE_METRIC_CALIBRATION_TYPE_LIST_OBJECT:
				return createDeviceMetricCalibrationTypeListObjectFromString(eDataType, initialValue);
			case FhirPackage.DEVICE_METRIC_CATEGORY_LIST_OBJECT:
				return createDeviceMetricCategoryListObjectFromString(eDataType, initialValue);
			case FhirPackage.DEVICE_METRIC_COLOR_LIST_OBJECT:
				return createDeviceMetricColorListObjectFromString(eDataType, initialValue);
			case FhirPackage.DEVICE_METRIC_OPERATIONAL_STATUS_LIST_OBJECT:
				return createDeviceMetricOperationalStatusListObjectFromString(eDataType, initialValue);
			case FhirPackage.DEVICE_USE_STATEMENT_STATUS_LIST_OBJECT:
				return createDeviceUseStatementStatusListObjectFromString(eDataType, initialValue);
			case FhirPackage.DIAGNOSTIC_REPORT_STATUS_LIST_OBJECT:
				return createDiagnosticReportStatusListObjectFromString(eDataType, initialValue);
			case FhirPackage.DIGITAL_MEDIA_TYPE_LIST_OBJECT:
				return createDigitalMediaTypeListObjectFromString(eDataType, initialValue);
			case FhirPackage.DISCRIMINATOR_TYPE_LIST_OBJECT:
				return createDiscriminatorTypeListObjectFromString(eDataType, initialValue);
			case FhirPackage.DOCUMENT_MODE_LIST_OBJECT:
				return createDocumentModeListObjectFromString(eDataType, initialValue);
			case FhirPackage.DOCUMENT_REFERENCE_STATUS_LIST_OBJECT:
				return createDocumentReferenceStatusListObjectFromString(eDataType, initialValue);
			case FhirPackage.DOCUMENT_RELATIONSHIP_TYPE_LIST_OBJECT:
				return createDocumentRelationshipTypeListObjectFromString(eDataType, initialValue);
			case FhirPackage.ENCOUNTER_LOCATION_STATUS_LIST_OBJECT:
				return createEncounterLocationStatusListObjectFromString(eDataType, initialValue);
			case FhirPackage.ENCOUNTER_STATUS_LIST_OBJECT:
				return createEncounterStatusListObjectFromString(eDataType, initialValue);
			case FhirPackage.ENDPOINT_STATUS_LIST_OBJECT:
				return createEndpointStatusListObjectFromString(eDataType, initialValue);
			case FhirPackage.EPISODE_OF_CARE_STATUS_LIST_OBJECT:
				return createEpisodeOfCareStatusListObjectFromString(eDataType, initialValue);
			case FhirPackage.EVENT_CAPABILITY_MODE_LIST_OBJECT:
				return createEventCapabilityModeListObjectFromString(eDataType, initialValue);
			case FhirPackage.EVENT_STATUS_LIST_OBJECT:
				return createEventStatusListObjectFromString(eDataType, initialValue);
			case FhirPackage.EVENT_TIMING_LIST_OBJECT:
				return createEventTimingListObjectFromString(eDataType, initialValue);
			case FhirPackage.EXPLANATION_OF_BENEFIT_STATUS_LIST_OBJECT:
				return createExplanationOfBenefitStatusListObjectFromString(eDataType, initialValue);
			case FhirPackage.EXTENSION_CONTEXT_LIST_OBJECT:
				return createExtensionContextListObjectFromString(eDataType, initialValue);
			case FhirPackage.FAMILY_HISTORY_STATUS_LIST_OBJECT:
				return createFamilyHistoryStatusListObjectFromString(eDataType, initialValue);
			case FhirPackage.FHIR_ALL_TYPES_LIST_OBJECT:
				return createFHIRAllTypesListObjectFromString(eDataType, initialValue);
			case FhirPackage.FHIR_DEFINED_TYPE_LIST_OBJECT:
				return createFHIRDefinedTypeListObjectFromString(eDataType, initialValue);
			case FhirPackage.FHIR_DEVICE_STATUS_LIST_OBJECT:
				return createFHIRDeviceStatusListObjectFromString(eDataType, initialValue);
			case FhirPackage.FHIR_SUBSTANCE_STATUS_LIST_OBJECT:
				return createFHIRSubstanceStatusListObjectFromString(eDataType, initialValue);
			case FhirPackage.FILTER_OPERATOR_LIST_OBJECT:
				return createFilterOperatorListObjectFromString(eDataType, initialValue);
			case FhirPackage.FINANCIAL_RESOURCE_STATUS_CODES_LIST_OBJECT:
				return createFinancialResourceStatusCodesListObjectFromString(eDataType, initialValue);
			case FhirPackage.FLAG_STATUS_LIST_OBJECT:
				return createFlagStatusListObjectFromString(eDataType, initialValue);
			case FhirPackage.GOAL_STATUS_LIST_OBJECT:
				return createGoalStatusListObjectFromString(eDataType, initialValue);
			case FhirPackage.GRAPH_COMPARTMENT_RULE_LIST_OBJECT:
				return createGraphCompartmentRuleListObjectFromString(eDataType, initialValue);
			case FhirPackage.GROUP_TYPE_LIST_OBJECT:
				return createGroupTypeListObjectFromString(eDataType, initialValue);
			case FhirPackage.GUIDANCE_RESPONSE_STATUS_LIST_OBJECT:
				return createGuidanceResponseStatusListObjectFromString(eDataType, initialValue);
			case FhirPackage.GUIDE_DEPENDENCY_TYPE_LIST_OBJECT:
				return createGuideDependencyTypeListObjectFromString(eDataType, initialValue);
			case FhirPackage.GUIDE_PAGE_KIND_LIST_OBJECT:
				return createGuidePageKindListObjectFromString(eDataType, initialValue);
			case FhirPackage.HTTP_VERB_LIST_OBJECT:
				return createHTTPVerbListObjectFromString(eDataType, initialValue);
			case FhirPackage.IDENTIFIER_USE_LIST_OBJECT:
				return createIdentifierUseListObjectFromString(eDataType, initialValue);
			case FhirPackage.IDENTITY_ASSURANCE_LEVEL_LIST_OBJECT:
				return createIdentityAssuranceLevelListObjectFromString(eDataType, initialValue);
			case FhirPackage.ID_PRIMITIVE:
				return createIdPrimitiveFromString(eDataType, initialValue);
			case FhirPackage.IMMUNIZATION_STATUS_CODES_LIST_OBJECT:
				return createImmunizationStatusCodesListObjectFromString(eDataType, initialValue);
			case FhirPackage.INSTANCE_AVAILABILITY_LIST_OBJECT:
				return createInstanceAvailabilityListObjectFromString(eDataType, initialValue);
			case FhirPackage.INSTANT_PRIMITIVE:
				return createInstantPrimitiveFromString(eDataType, initialValue);
			case FhirPackage.INTEGER_PRIMITIVE:
				return createIntegerPrimitiveFromString(eDataType, initialValue);
			case FhirPackage.INTEGER_PRIMITIVE_OBJECT:
				return createIntegerPrimitiveObjectFromString(eDataType, initialValue);
			case FhirPackage.ISSUE_SEVERITY_LIST_OBJECT:
				return createIssueSeverityListObjectFromString(eDataType, initialValue);
			case FhirPackage.ISSUE_TYPE_LIST_OBJECT:
				return createIssueTypeListObjectFromString(eDataType, initialValue);
			case FhirPackage.LINKAGE_TYPE_LIST_OBJECT:
				return createLinkageTypeListObjectFromString(eDataType, initialValue);
			case FhirPackage.LINK_TYPE_LIST_OBJECT:
				return createLinkTypeListObjectFromString(eDataType, initialValue);
			case FhirPackage.LIST_MODE_LIST_OBJECT:
				return createListModeListObjectFromString(eDataType, initialValue);
			case FhirPackage.LIST_STATUS_LIST_OBJECT:
				return createListStatusListObjectFromString(eDataType, initialValue);
			case FhirPackage.LOCATION_MODE_LIST_OBJECT:
				return createLocationModeListObjectFromString(eDataType, initialValue);
			case FhirPackage.LOCATION_STATUS_LIST_OBJECT:
				return createLocationStatusListObjectFromString(eDataType, initialValue);
			case FhirPackage.MARKDOWN_PRIMITIVE:
				return createMarkdownPrimitiveFromString(eDataType, initialValue);
			case FhirPackage.MEASMNT_PRINCIPLE_LIST_OBJECT:
				return createMeasmntPrincipleListObjectFromString(eDataType, initialValue);
			case FhirPackage.MEASURE_REPORT_STATUS_LIST_OBJECT:
				return createMeasureReportStatusListObjectFromString(eDataType, initialValue);
			case FhirPackage.MEASURE_REPORT_TYPE_LIST_OBJECT:
				return createMeasureReportTypeListObjectFromString(eDataType, initialValue);
			case FhirPackage.MEDICATION_ADMINISTRATION_STATUS_LIST_OBJECT:
				return createMedicationAdministrationStatusListObjectFromString(eDataType, initialValue);
			case FhirPackage.MEDICATION_DISPENSE_STATUS_LIST_OBJECT:
				return createMedicationDispenseStatusListObjectFromString(eDataType, initialValue);
			case FhirPackage.MEDICATION_REQUEST_INTENT_LIST_OBJECT:
				return createMedicationRequestIntentListObjectFromString(eDataType, initialValue);
			case FhirPackage.MEDICATION_REQUEST_PRIORITY_LIST_OBJECT:
				return createMedicationRequestPriorityListObjectFromString(eDataType, initialValue);
			case FhirPackage.MEDICATION_REQUEST_STATUS_LIST_OBJECT:
				return createMedicationRequestStatusListObjectFromString(eDataType, initialValue);
			case FhirPackage.MEDICATION_STATEMENT_STATUS_LIST_OBJECT:
				return createMedicationStatementStatusListObjectFromString(eDataType, initialValue);
			case FhirPackage.MEDICATION_STATEMENT_TAKEN_LIST_OBJECT:
				return createMedicationStatementTakenListObjectFromString(eDataType, initialValue);
			case FhirPackage.MEDICATION_STATUS_LIST_OBJECT:
				return createMedicationStatusListObjectFromString(eDataType, initialValue);
			case FhirPackage.MESSAGE_SIGNIFICANCE_CATEGORY_LIST_OBJECT:
				return createMessageSignificanceCategoryListObjectFromString(eDataType, initialValue);
			case FhirPackage.NAME_USE_LIST_OBJECT:
				return createNameUseListObjectFromString(eDataType, initialValue);
			case FhirPackage.NAMING_SYSTEM_IDENTIFIER_TYPE_LIST_OBJECT:
				return createNamingSystemIdentifierTypeListObjectFromString(eDataType, initialValue);
			case FhirPackage.NAMING_SYSTEM_TYPE_LIST_OBJECT:
				return createNamingSystemTypeListObjectFromString(eDataType, initialValue);
			case FhirPackage.NARRATIVE_STATUS_LIST_OBJECT:
				return createNarrativeStatusListObjectFromString(eDataType, initialValue);
			case FhirPackage.NOTE_TYPE_LIST_OBJECT:
				return createNoteTypeListObjectFromString(eDataType, initialValue);
			case FhirPackage.NUTRITION_ORDER_STATUS_LIST_OBJECT:
				return createNutritionOrderStatusListObjectFromString(eDataType, initialValue);
			case FhirPackage.OBSERVATION_RELATIONSHIP_TYPE_LIST_OBJECT:
				return createObservationRelationshipTypeListObjectFromString(eDataType, initialValue);
			case FhirPackage.OBSERVATION_STATUS_LIST_OBJECT:
				return createObservationStatusListObjectFromString(eDataType, initialValue);
			case FhirPackage.OID_PRIMITIVE:
				return createOidPrimitiveFromString(eDataType, initialValue);
			case FhirPackage.OPERATION_KIND_LIST_OBJECT:
				return createOperationKindListObjectFromString(eDataType, initialValue);
			case FhirPackage.OPERATION_PARAMETER_USE_LIST_OBJECT:
				return createOperationParameterUseListObjectFromString(eDataType, initialValue);
			case FhirPackage.PARTICIPANT_REQUIRED_LIST_OBJECT:
				return createParticipantRequiredListObjectFromString(eDataType, initialValue);
			case FhirPackage.PARTICIPATION_STATUS_LIST_OBJECT:
				return createParticipationStatusListObjectFromString(eDataType, initialValue);
			case FhirPackage.POSITIVE_INT_PRIMITIVE:
				return createPositiveIntPrimitiveFromString(eDataType, initialValue);
			case FhirPackage.PROPERTY_REPRESENTATION_LIST_OBJECT:
				return createPropertyRepresentationListObjectFromString(eDataType, initialValue);
			case FhirPackage.PROPERTY_TYPE_LIST_OBJECT:
				return createPropertyTypeListObjectFromString(eDataType, initialValue);
			case FhirPackage.PROVENANCE_ENTITY_ROLE_LIST_OBJECT:
				return createProvenanceEntityRoleListObjectFromString(eDataType, initialValue);
			case FhirPackage.PUBLICATION_STATUS_LIST_OBJECT:
				return createPublicationStatusListObjectFromString(eDataType, initialValue);
			case FhirPackage.QUALITY_TYPE_LIST_OBJECT:
				return createQualityTypeListObjectFromString(eDataType, initialValue);
			case FhirPackage.QUANTITY_COMPARATOR_LIST_OBJECT:
				return createQuantityComparatorListObjectFromString(eDataType, initialValue);
			case FhirPackage.QUESTIONNAIRE_ITEM_TYPE_LIST_OBJECT:
				return createQuestionnaireItemTypeListObjectFromString(eDataType, initialValue);
			case FhirPackage.QUESTIONNAIRE_RESPONSE_STATUS_LIST_OBJECT:
				return createQuestionnaireResponseStatusListObjectFromString(eDataType, initialValue);
			case FhirPackage.REFERENCE_HANDLING_POLICY_LIST_OBJECT:
				return createReferenceHandlingPolicyListObjectFromString(eDataType, initialValue);
			case FhirPackage.REFERENCE_VERSION_RULES_LIST_OBJECT:
				return createReferenceVersionRulesListObjectFromString(eDataType, initialValue);
			case FhirPackage.RELATED_ARTIFACT_TYPE_LIST_OBJECT:
				return createRelatedArtifactTypeListObjectFromString(eDataType, initialValue);
			case FhirPackage.REMITTANCE_OUTCOME_LIST_OBJECT:
				return createRemittanceOutcomeListObjectFromString(eDataType, initialValue);
			case FhirPackage.REPOSITORY_TYPE_LIST_OBJECT:
				return createRepositoryTypeListObjectFromString(eDataType, initialValue);
			case FhirPackage.REQUEST_INTENT_LIST_OBJECT:
				return createRequestIntentListObjectFromString(eDataType, initialValue);
			case FhirPackage.REQUEST_PRIORITY_LIST_OBJECT:
				return createRequestPriorityListObjectFromString(eDataType, initialValue);
			case FhirPackage.REQUEST_STATUS_LIST_OBJECT:
				return createRequestStatusListObjectFromString(eDataType, initialValue);
			case FhirPackage.RESEARCH_STUDY_STATUS_LIST_OBJECT:
				return createResearchStudyStatusListObjectFromString(eDataType, initialValue);
			case FhirPackage.RESEARCH_SUBJECT_STATUS_LIST_OBJECT:
				return createResearchSubjectStatusListObjectFromString(eDataType, initialValue);
			case FhirPackage.RESOURCE_TYPE_LIST_OBJECT:
				return createResourceTypeListObjectFromString(eDataType, initialValue);
			case FhirPackage.RESOURCE_VERSION_POLICY_LIST_OBJECT:
				return createResourceVersionPolicyListObjectFromString(eDataType, initialValue);
			case FhirPackage.RESPONSE_TYPE_LIST_OBJECT:
				return createResponseTypeListObjectFromString(eDataType, initialValue);
			case FhirPackage.RESTFUL_CAPABILITY_MODE_LIST_OBJECT:
				return createRestfulCapabilityModeListObjectFromString(eDataType, initialValue);
			case FhirPackage.SAMPLED_DATA_DATA_TYPE_PRIMITIVE:
				return createSampledDataDataTypePrimitiveFromString(eDataType, initialValue);
			case FhirPackage.SEARCH_COMPARATOR_LIST_OBJECT:
				return createSearchComparatorListObjectFromString(eDataType, initialValue);
			case FhirPackage.SEARCH_ENTRY_MODE_LIST_OBJECT:
				return createSearchEntryModeListObjectFromString(eDataType, initialValue);
			case FhirPackage.SEARCH_MODIFIER_CODE_LIST_OBJECT:
				return createSearchModifierCodeListObjectFromString(eDataType, initialValue);
			case FhirPackage.SEARCH_PARAM_TYPE_LIST_OBJECT:
				return createSearchParamTypeListObjectFromString(eDataType, initialValue);
			case FhirPackage.SLICING_RULES_LIST_OBJECT:
				return createSlicingRulesListObjectFromString(eDataType, initialValue);
			case FhirPackage.SLOT_STATUS_LIST_OBJECT:
				return createSlotStatusListObjectFromString(eDataType, initialValue);
			case FhirPackage.SPECIMEN_STATUS_LIST_OBJECT:
				return createSpecimenStatusListObjectFromString(eDataType, initialValue);
			case FhirPackage.STRING_PRIMITIVE:
				return createStringPrimitiveFromString(eDataType, initialValue);
			case FhirPackage.STRUCTURE_DEFINITION_KIND_LIST_OBJECT:
				return createStructureDefinitionKindListObjectFromString(eDataType, initialValue);
			case FhirPackage.STRUCTURE_MAP_CONTEXT_TYPE_LIST_OBJECT:
				return createStructureMapContextTypeListObjectFromString(eDataType, initialValue);
			case FhirPackage.STRUCTURE_MAP_GROUP_TYPE_MODE_LIST_OBJECT:
				return createStructureMapGroupTypeModeListObjectFromString(eDataType, initialValue);
			case FhirPackage.STRUCTURE_MAP_INPUT_MODE_LIST_OBJECT:
				return createStructureMapInputModeListObjectFromString(eDataType, initialValue);
			case FhirPackage.STRUCTURE_MAP_MODEL_MODE_LIST_OBJECT:
				return createStructureMapModelModeListObjectFromString(eDataType, initialValue);
			case FhirPackage.STRUCTURE_MAP_SOURCE_LIST_MODE_LIST_OBJECT:
				return createStructureMapSourceListModeListObjectFromString(eDataType, initialValue);
			case FhirPackage.STRUCTURE_MAP_TARGET_LIST_MODE_LIST_OBJECT:
				return createStructureMapTargetListModeListObjectFromString(eDataType, initialValue);
			case FhirPackage.STRUCTURE_MAP_TRANSFORM_LIST_OBJECT:
				return createStructureMapTransformListObjectFromString(eDataType, initialValue);
			case FhirPackage.SUBSCRIPTION_CHANNEL_TYPE_LIST_OBJECT:
				return createSubscriptionChannelTypeListObjectFromString(eDataType, initialValue);
			case FhirPackage.SUBSCRIPTION_STATUS_LIST_OBJECT:
				return createSubscriptionStatusListObjectFromString(eDataType, initialValue);
			case FhirPackage.SUPPLY_DELIVERY_STATUS_LIST_OBJECT:
				return createSupplyDeliveryStatusListObjectFromString(eDataType, initialValue);
			case FhirPackage.SUPPLY_REQUEST_STATUS_LIST_OBJECT:
				return createSupplyRequestStatusListObjectFromString(eDataType, initialValue);
			case FhirPackage.SYSTEM_RESTFUL_INTERACTION_LIST_OBJECT:
				return createSystemRestfulInteractionListObjectFromString(eDataType, initialValue);
			case FhirPackage.SYSTEM_VERSION_PROCESSING_MODE_LIST_OBJECT:
				return createSystemVersionProcessingModeListObjectFromString(eDataType, initialValue);
			case FhirPackage.TASK_STATUS_LIST_OBJECT:
				return createTaskStatusListObjectFromString(eDataType, initialValue);
			case FhirPackage.TEST_REPORT_ACTION_RESULT_LIST_OBJECT:
				return createTestReportActionResultListObjectFromString(eDataType, initialValue);
			case FhirPackage.TEST_REPORT_PARTICIPANT_TYPE_LIST_OBJECT:
				return createTestReportParticipantTypeListObjectFromString(eDataType, initialValue);
			case FhirPackage.TEST_REPORT_RESULT_LIST_OBJECT:
				return createTestReportResultListObjectFromString(eDataType, initialValue);
			case FhirPackage.TEST_REPORT_STATUS_LIST_OBJECT:
				return createTestReportStatusListObjectFromString(eDataType, initialValue);
			case FhirPackage.TEST_SCRIPT_REQUEST_METHOD_CODE_LIST_OBJECT:
				return createTestScriptRequestMethodCodeListObjectFromString(eDataType, initialValue);
			case FhirPackage.TIME_PRIMITIVE:
				return createTimePrimitiveFromString(eDataType, initialValue);
			case FhirPackage.TRIGGER_TYPE_LIST_OBJECT:
				return createTriggerTypeListObjectFromString(eDataType, initialValue);
			case FhirPackage.TYPE_DERIVATION_RULE_LIST_OBJECT:
				return createTypeDerivationRuleListObjectFromString(eDataType, initialValue);
			case FhirPackage.TYPE_RESTFUL_INTERACTION_LIST_OBJECT:
				return createTypeRestfulInteractionListObjectFromString(eDataType, initialValue);
			case FhirPackage.UDI_ENTRY_TYPE_LIST_OBJECT:
				return createUDIEntryTypeListObjectFromString(eDataType, initialValue);
			case FhirPackage.UNITS_OF_TIME_LIST_OBJECT:
				return createUnitsOfTimeListObjectFromString(eDataType, initialValue);
			case FhirPackage.UNKNOWN_CONTENT_CODE_LIST_OBJECT:
				return createUnknownContentCodeListObjectFromString(eDataType, initialValue);
			case FhirPackage.UNSIGNED_INT_PRIMITIVE:
				return createUnsignedIntPrimitiveFromString(eDataType, initialValue);
			case FhirPackage.URI_PRIMITIVE:
				return createUriPrimitiveFromString(eDataType, initialValue);
			case FhirPackage.USE_LIST_OBJECT:
				return createUseListObjectFromString(eDataType, initialValue);
			case FhirPackage.UUID_PRIMITIVE:
				return createUuidPrimitiveFromString(eDataType, initialValue);
			case FhirPackage.VISION_BASE_LIST_OBJECT:
				return createVisionBaseListObjectFromString(eDataType, initialValue);
			case FhirPackage.VISION_EYES_LIST_OBJECT:
				return createVisionEyesListObjectFromString(eDataType, initialValue);
			case FhirPackage.XPATH_USAGE_TYPE_LIST_OBJECT:
				return createXPathUsageTypeListObjectFromString(eDataType, initialValue);
			default:
				throw new IllegalArgumentException("The datatype '" + eDataType.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String convertToString(EDataType eDataType, Object instanceValue) {
		switch (eDataType.getClassifierID()) {
			case FhirPackage.ACCOUNT_STATUS_LIST:
				return convertAccountStatusListToString(eDataType, instanceValue);
			case FhirPackage.ACTION_CARDINALITY_BEHAVIOR_LIST:
				return convertActionCardinalityBehaviorListToString(eDataType, instanceValue);
			case FhirPackage.ACTION_CONDITION_KIND_LIST:
				return convertActionConditionKindListToString(eDataType, instanceValue);
			case FhirPackage.ACTION_GROUPING_BEHAVIOR_LIST:
				return convertActionGroupingBehaviorListToString(eDataType, instanceValue);
			case FhirPackage.ACTION_LIST_LIST:
				return convertActionListListToString(eDataType, instanceValue);
			case FhirPackage.ACTION_PARTICIPANT_TYPE_LIST:
				return convertActionParticipantTypeListToString(eDataType, instanceValue);
			case FhirPackage.ACTION_PRECHECK_BEHAVIOR_LIST:
				return convertActionPrecheckBehaviorListToString(eDataType, instanceValue);
			case FhirPackage.ACTION_RELATIONSHIP_TYPE_LIST:
				return convertActionRelationshipTypeListToString(eDataType, instanceValue);
			case FhirPackage.ACTION_REQUIRED_BEHAVIOR_LIST:
				return convertActionRequiredBehaviorListToString(eDataType, instanceValue);
			case FhirPackage.ACTION_SELECTION_BEHAVIOR_LIST:
				return convertActionSelectionBehaviorListToString(eDataType, instanceValue);
			case FhirPackage.ADDRESS_TYPE_LIST:
				return convertAddressTypeListToString(eDataType, instanceValue);
			case FhirPackage.ADDRESS_USE_LIST:
				return convertAddressUseListToString(eDataType, instanceValue);
			case FhirPackage.ADMINISTRATIVE_GENDER_LIST:
				return convertAdministrativeGenderListToString(eDataType, instanceValue);
			case FhirPackage.ADVERSE_EVENT_CATEGORY_LIST:
				return convertAdverseEventCategoryListToString(eDataType, instanceValue);
			case FhirPackage.ADVERSE_EVENT_CAUSALITY_LIST:
				return convertAdverseEventCausalityListToString(eDataType, instanceValue);
			case FhirPackage.AGGREGATION_MODE_LIST:
				return convertAggregationModeListToString(eDataType, instanceValue);
			case FhirPackage.ALLERGY_INTOLERANCE_CATEGORY_LIST:
				return convertAllergyIntoleranceCategoryListToString(eDataType, instanceValue);
			case FhirPackage.ALLERGY_INTOLERANCE_CLINICAL_STATUS_LIST:
				return convertAllergyIntoleranceClinicalStatusListToString(eDataType, instanceValue);
			case FhirPackage.ALLERGY_INTOLERANCE_CRITICALITY_LIST:
				return convertAllergyIntoleranceCriticalityListToString(eDataType, instanceValue);
			case FhirPackage.ALLERGY_INTOLERANCE_SEVERITY_LIST:
				return convertAllergyIntoleranceSeverityListToString(eDataType, instanceValue);
			case FhirPackage.ALLERGY_INTOLERANCE_TYPE_LIST:
				return convertAllergyIntoleranceTypeListToString(eDataType, instanceValue);
			case FhirPackage.ALLERGY_INTOLERANCE_VERIFICATION_STATUS_LIST:
				return convertAllergyIntoleranceVerificationStatusListToString(eDataType, instanceValue);
			case FhirPackage.APPOINTMENT_STATUS_LIST:
				return convertAppointmentStatusListToString(eDataType, instanceValue);
			case FhirPackage.ASSERTION_DIRECTION_TYPE_LIST:
				return convertAssertionDirectionTypeListToString(eDataType, instanceValue);
			case FhirPackage.ASSERTION_OPERATOR_TYPE_LIST:
				return convertAssertionOperatorTypeListToString(eDataType, instanceValue);
			case FhirPackage.ASSERTION_RESPONSE_TYPES_LIST:
				return convertAssertionResponseTypesListToString(eDataType, instanceValue);
			case FhirPackage.AUDIT_EVENT_ACTION_LIST:
				return convertAuditEventActionListToString(eDataType, instanceValue);
			case FhirPackage.AUDIT_EVENT_AGENT_NETWORK_TYPE_LIST:
				return convertAuditEventAgentNetworkTypeListToString(eDataType, instanceValue);
			case FhirPackage.AUDIT_EVENT_OUTCOME_LIST:
				return convertAuditEventOutcomeListToString(eDataType, instanceValue);
			case FhirPackage.BINDING_STRENGTH_LIST:
				return convertBindingStrengthListToString(eDataType, instanceValue);
			case FhirPackage.BUNDLE_TYPE_LIST:
				return convertBundleTypeListToString(eDataType, instanceValue);
			case FhirPackage.CAPABILITY_STATEMENT_KIND_LIST:
				return convertCapabilityStatementKindListToString(eDataType, instanceValue);
			case FhirPackage.CARE_PLAN_ACTIVITY_STATUS_LIST:
				return convertCarePlanActivityStatusListToString(eDataType, instanceValue);
			case FhirPackage.CARE_PLAN_INTENT_LIST:
				return convertCarePlanIntentListToString(eDataType, instanceValue);
			case FhirPackage.CARE_PLAN_STATUS_LIST:
				return convertCarePlanStatusListToString(eDataType, instanceValue);
			case FhirPackage.CARE_TEAM_STATUS_LIST:
				return convertCareTeamStatusListToString(eDataType, instanceValue);
			case FhirPackage.CHARGE_ITEM_STATUS_LIST:
				return convertChargeItemStatusListToString(eDataType, instanceValue);
			case FhirPackage.CLINICAL_IMPRESSION_STATUS_LIST:
				return convertClinicalImpressionStatusListToString(eDataType, instanceValue);
			case FhirPackage.CODE_SYSTEM_CONTENT_MODE_LIST:
				return convertCodeSystemContentModeListToString(eDataType, instanceValue);
			case FhirPackage.CODE_SYSTEM_HIERARCHY_MEANING_LIST:
				return convertCodeSystemHierarchyMeaningListToString(eDataType, instanceValue);
			case FhirPackage.COMPARTMENT_TYPE_LIST:
				return convertCompartmentTypeListToString(eDataType, instanceValue);
			case FhirPackage.COMPOSITION_ATTESTATION_MODE_LIST:
				return convertCompositionAttestationModeListToString(eDataType, instanceValue);
			case FhirPackage.COMPOSITION_STATUS_LIST:
				return convertCompositionStatusListToString(eDataType, instanceValue);
			case FhirPackage.CONCEPT_MAP_EQUIVALENCE_LIST:
				return convertConceptMapEquivalenceListToString(eDataType, instanceValue);
			case FhirPackage.CONCEPT_MAP_GROUP_UNMAPPED_MODE_LIST:
				return convertConceptMapGroupUnmappedModeListToString(eDataType, instanceValue);
			case FhirPackage.CONDITIONAL_DELETE_STATUS_LIST:
				return convertConditionalDeleteStatusListToString(eDataType, instanceValue);
			case FhirPackage.CONDITIONAL_READ_STATUS_LIST:
				return convertConditionalReadStatusListToString(eDataType, instanceValue);
			case FhirPackage.CONDITION_CLINICAL_STATUS_CODES_LIST:
				return convertConditionClinicalStatusCodesListToString(eDataType, instanceValue);
			case FhirPackage.CONDITION_VERIFICATION_STATUS_LIST:
				return convertConditionVerificationStatusListToString(eDataType, instanceValue);
			case FhirPackage.CONFIDENTIALITY_CLASSIFICATION_LIST:
				return convertConfidentialityClassificationListToString(eDataType, instanceValue);
			case FhirPackage.CONSENT_DATA_MEANING_LIST:
				return convertConsentDataMeaningListToString(eDataType, instanceValue);
			case FhirPackage.CONSENT_EXCEPT_TYPE_LIST:
				return convertConsentExceptTypeListToString(eDataType, instanceValue);
			case FhirPackage.CONSENT_STATE_LIST:
				return convertConsentStateListToString(eDataType, instanceValue);
			case FhirPackage.CONSTRAINT_SEVERITY_LIST:
				return convertConstraintSeverityListToString(eDataType, instanceValue);
			case FhirPackage.CONTACT_POINT_SYSTEM_LIST:
				return convertContactPointSystemListToString(eDataType, instanceValue);
			case FhirPackage.CONTACT_POINT_USE_LIST:
				return convertContactPointUseListToString(eDataType, instanceValue);
			case FhirPackage.CONTENT_TYPE_LIST:
				return convertContentTypeListToString(eDataType, instanceValue);
			case FhirPackage.CONTRACT_RESOURCE_STATUS_CODES_LIST:
				return convertContractResourceStatusCodesListToString(eDataType, instanceValue);
			case FhirPackage.CONTRIBUTOR_TYPE_LIST:
				return convertContributorTypeListToString(eDataType, instanceValue);
			case FhirPackage.DATA_ELEMENT_STRINGENCY_LIST:
				return convertDataElementStringencyListToString(eDataType, instanceValue);
			case FhirPackage.DAYS_OF_WEEK_LIST:
				return convertDaysOfWeekListToString(eDataType, instanceValue);
			case FhirPackage.DETECTED_ISSUE_SEVERITY_LIST:
				return convertDetectedIssueSeverityListToString(eDataType, instanceValue);
			case FhirPackage.DEVICE_METRIC_CALIBRATION_STATE_LIST:
				return convertDeviceMetricCalibrationStateListToString(eDataType, instanceValue);
			case FhirPackage.DEVICE_METRIC_CALIBRATION_TYPE_LIST:
				return convertDeviceMetricCalibrationTypeListToString(eDataType, instanceValue);
			case FhirPackage.DEVICE_METRIC_CATEGORY_LIST:
				return convertDeviceMetricCategoryListToString(eDataType, instanceValue);
			case FhirPackage.DEVICE_METRIC_COLOR_LIST:
				return convertDeviceMetricColorListToString(eDataType, instanceValue);
			case FhirPackage.DEVICE_METRIC_OPERATIONAL_STATUS_LIST:
				return convertDeviceMetricOperationalStatusListToString(eDataType, instanceValue);
			case FhirPackage.DEVICE_USE_STATEMENT_STATUS_LIST:
				return convertDeviceUseStatementStatusListToString(eDataType, instanceValue);
			case FhirPackage.DIAGNOSTIC_REPORT_STATUS_LIST:
				return convertDiagnosticReportStatusListToString(eDataType, instanceValue);
			case FhirPackage.DIGITAL_MEDIA_TYPE_LIST:
				return convertDigitalMediaTypeListToString(eDataType, instanceValue);
			case FhirPackage.DISCRIMINATOR_TYPE_LIST:
				return convertDiscriminatorTypeListToString(eDataType, instanceValue);
			case FhirPackage.DOCUMENT_MODE_LIST:
				return convertDocumentModeListToString(eDataType, instanceValue);
			case FhirPackage.DOCUMENT_REFERENCE_STATUS_LIST:
				return convertDocumentReferenceStatusListToString(eDataType, instanceValue);
			case FhirPackage.DOCUMENT_RELATIONSHIP_TYPE_LIST:
				return convertDocumentRelationshipTypeListToString(eDataType, instanceValue);
			case FhirPackage.ENCOUNTER_LOCATION_STATUS_LIST:
				return convertEncounterLocationStatusListToString(eDataType, instanceValue);
			case FhirPackage.ENCOUNTER_STATUS_LIST:
				return convertEncounterStatusListToString(eDataType, instanceValue);
			case FhirPackage.ENDPOINT_STATUS_LIST:
				return convertEndpointStatusListToString(eDataType, instanceValue);
			case FhirPackage.EPISODE_OF_CARE_STATUS_LIST:
				return convertEpisodeOfCareStatusListToString(eDataType, instanceValue);
			case FhirPackage.EVENT_CAPABILITY_MODE_LIST:
				return convertEventCapabilityModeListToString(eDataType, instanceValue);
			case FhirPackage.EVENT_STATUS_LIST:
				return convertEventStatusListToString(eDataType, instanceValue);
			case FhirPackage.EVENT_TIMING_LIST:
				return convertEventTimingListToString(eDataType, instanceValue);
			case FhirPackage.EXPLANATION_OF_BENEFIT_STATUS_LIST:
				return convertExplanationOfBenefitStatusListToString(eDataType, instanceValue);
			case FhirPackage.EXTENSION_CONTEXT_LIST:
				return convertExtensionContextListToString(eDataType, instanceValue);
			case FhirPackage.FAMILY_HISTORY_STATUS_LIST:
				return convertFamilyHistoryStatusListToString(eDataType, instanceValue);
			case FhirPackage.FHIR_ALL_TYPES_LIST:
				return convertFHIRAllTypesListToString(eDataType, instanceValue);
			case FhirPackage.FHIR_DEFINED_TYPE_LIST:
				return convertFHIRDefinedTypeListToString(eDataType, instanceValue);
			case FhirPackage.FHIR_DEVICE_STATUS_LIST:
				return convertFHIRDeviceStatusListToString(eDataType, instanceValue);
			case FhirPackage.FHIR_SUBSTANCE_STATUS_LIST:
				return convertFHIRSubstanceStatusListToString(eDataType, instanceValue);
			case FhirPackage.FILTER_OPERATOR_LIST:
				return convertFilterOperatorListToString(eDataType, instanceValue);
			case FhirPackage.FINANCIAL_RESOURCE_STATUS_CODES_LIST:
				return convertFinancialResourceStatusCodesListToString(eDataType, instanceValue);
			case FhirPackage.FLAG_STATUS_LIST:
				return convertFlagStatusListToString(eDataType, instanceValue);
			case FhirPackage.GOAL_STATUS_LIST:
				return convertGoalStatusListToString(eDataType, instanceValue);
			case FhirPackage.GRAPH_COMPARTMENT_RULE_LIST:
				return convertGraphCompartmentRuleListToString(eDataType, instanceValue);
			case FhirPackage.GROUP_TYPE_LIST:
				return convertGroupTypeListToString(eDataType, instanceValue);
			case FhirPackage.GUIDANCE_RESPONSE_STATUS_LIST:
				return convertGuidanceResponseStatusListToString(eDataType, instanceValue);
			case FhirPackage.GUIDE_DEPENDENCY_TYPE_LIST:
				return convertGuideDependencyTypeListToString(eDataType, instanceValue);
			case FhirPackage.GUIDE_PAGE_KIND_LIST:
				return convertGuidePageKindListToString(eDataType, instanceValue);
			case FhirPackage.HTTP_VERB_LIST:
				return convertHTTPVerbListToString(eDataType, instanceValue);
			case FhirPackage.IDENTIFIER_USE_LIST:
				return convertIdentifierUseListToString(eDataType, instanceValue);
			case FhirPackage.IDENTITY_ASSURANCE_LEVEL_LIST:
				return convertIdentityAssuranceLevelListToString(eDataType, instanceValue);
			case FhirPackage.IMMUNIZATION_STATUS_CODES_LIST:
				return convertImmunizationStatusCodesListToString(eDataType, instanceValue);
			case FhirPackage.INSTANCE_AVAILABILITY_LIST:
				return convertInstanceAvailabilityListToString(eDataType, instanceValue);
			case FhirPackage.ISSUE_SEVERITY_LIST:
				return convertIssueSeverityListToString(eDataType, instanceValue);
			case FhirPackage.ISSUE_TYPE_LIST:
				return convertIssueTypeListToString(eDataType, instanceValue);
			case FhirPackage.LINKAGE_TYPE_LIST:
				return convertLinkageTypeListToString(eDataType, instanceValue);
			case FhirPackage.LINK_TYPE_LIST:
				return convertLinkTypeListToString(eDataType, instanceValue);
			case FhirPackage.LIST_MODE_LIST:
				return convertListModeListToString(eDataType, instanceValue);
			case FhirPackage.LIST_STATUS_LIST:
				return convertListStatusListToString(eDataType, instanceValue);
			case FhirPackage.LOCATION_MODE_LIST:
				return convertLocationModeListToString(eDataType, instanceValue);
			case FhirPackage.LOCATION_STATUS_LIST:
				return convertLocationStatusListToString(eDataType, instanceValue);
			case FhirPackage.MEASMNT_PRINCIPLE_LIST:
				return convertMeasmntPrincipleListToString(eDataType, instanceValue);
			case FhirPackage.MEASURE_REPORT_STATUS_LIST:
				return convertMeasureReportStatusListToString(eDataType, instanceValue);
			case FhirPackage.MEASURE_REPORT_TYPE_LIST:
				return convertMeasureReportTypeListToString(eDataType, instanceValue);
			case FhirPackage.MEDICATION_ADMINISTRATION_STATUS_LIST:
				return convertMedicationAdministrationStatusListToString(eDataType, instanceValue);
			case FhirPackage.MEDICATION_DISPENSE_STATUS_LIST:
				return convertMedicationDispenseStatusListToString(eDataType, instanceValue);
			case FhirPackage.MEDICATION_REQUEST_INTENT_LIST:
				return convertMedicationRequestIntentListToString(eDataType, instanceValue);
			case FhirPackage.MEDICATION_REQUEST_PRIORITY_LIST:
				return convertMedicationRequestPriorityListToString(eDataType, instanceValue);
			case FhirPackage.MEDICATION_REQUEST_STATUS_LIST:
				return convertMedicationRequestStatusListToString(eDataType, instanceValue);
			case FhirPackage.MEDICATION_STATEMENT_STATUS_LIST:
				return convertMedicationStatementStatusListToString(eDataType, instanceValue);
			case FhirPackage.MEDICATION_STATEMENT_TAKEN_LIST:
				return convertMedicationStatementTakenListToString(eDataType, instanceValue);
			case FhirPackage.MEDICATION_STATUS_LIST:
				return convertMedicationStatusListToString(eDataType, instanceValue);
			case FhirPackage.MESSAGE_SIGNIFICANCE_CATEGORY_LIST:
				return convertMessageSignificanceCategoryListToString(eDataType, instanceValue);
			case FhirPackage.NAME_USE_LIST:
				return convertNameUseListToString(eDataType, instanceValue);
			case FhirPackage.NAMING_SYSTEM_IDENTIFIER_TYPE_LIST:
				return convertNamingSystemIdentifierTypeListToString(eDataType, instanceValue);
			case FhirPackage.NAMING_SYSTEM_TYPE_LIST:
				return convertNamingSystemTypeListToString(eDataType, instanceValue);
			case FhirPackage.NARRATIVE_STATUS_LIST:
				return convertNarrativeStatusListToString(eDataType, instanceValue);
			case FhirPackage.NOTE_TYPE_LIST:
				return convertNoteTypeListToString(eDataType, instanceValue);
			case FhirPackage.NUTRITION_ORDER_STATUS_LIST:
				return convertNutritionOrderStatusListToString(eDataType, instanceValue);
			case FhirPackage.OBSERVATION_RELATIONSHIP_TYPE_LIST:
				return convertObservationRelationshipTypeListToString(eDataType, instanceValue);
			case FhirPackage.OBSERVATION_STATUS_LIST:
				return convertObservationStatusListToString(eDataType, instanceValue);
			case FhirPackage.OPERATION_KIND_LIST:
				return convertOperationKindListToString(eDataType, instanceValue);
			case FhirPackage.OPERATION_PARAMETER_USE_LIST:
				return convertOperationParameterUseListToString(eDataType, instanceValue);
			case FhirPackage.PARTICIPANT_REQUIRED_LIST:
				return convertParticipantRequiredListToString(eDataType, instanceValue);
			case FhirPackage.PARTICIPATION_STATUS_LIST:
				return convertParticipationStatusListToString(eDataType, instanceValue);
			case FhirPackage.PROPERTY_REPRESENTATION_LIST:
				return convertPropertyRepresentationListToString(eDataType, instanceValue);
			case FhirPackage.PROPERTY_TYPE_LIST:
				return convertPropertyTypeListToString(eDataType, instanceValue);
			case FhirPackage.PROVENANCE_ENTITY_ROLE_LIST:
				return convertProvenanceEntityRoleListToString(eDataType, instanceValue);
			case FhirPackage.PUBLICATION_STATUS_LIST:
				return convertPublicationStatusListToString(eDataType, instanceValue);
			case FhirPackage.QUALITY_TYPE_LIST:
				return convertQualityTypeListToString(eDataType, instanceValue);
			case FhirPackage.QUANTITY_COMPARATOR_LIST:
				return convertQuantityComparatorListToString(eDataType, instanceValue);
			case FhirPackage.QUESTIONNAIRE_ITEM_TYPE_LIST:
				return convertQuestionnaireItemTypeListToString(eDataType, instanceValue);
			case FhirPackage.QUESTIONNAIRE_RESPONSE_STATUS_LIST:
				return convertQuestionnaireResponseStatusListToString(eDataType, instanceValue);
			case FhirPackage.REFERENCE_HANDLING_POLICY_LIST:
				return convertReferenceHandlingPolicyListToString(eDataType, instanceValue);
			case FhirPackage.REFERENCE_VERSION_RULES_LIST:
				return convertReferenceVersionRulesListToString(eDataType, instanceValue);
			case FhirPackage.RELATED_ARTIFACT_TYPE_LIST:
				return convertRelatedArtifactTypeListToString(eDataType, instanceValue);
			case FhirPackage.REMITTANCE_OUTCOME_LIST:
				return convertRemittanceOutcomeListToString(eDataType, instanceValue);
			case FhirPackage.REPOSITORY_TYPE_LIST:
				return convertRepositoryTypeListToString(eDataType, instanceValue);
			case FhirPackage.REQUEST_INTENT_LIST:
				return convertRequestIntentListToString(eDataType, instanceValue);
			case FhirPackage.REQUEST_PRIORITY_LIST:
				return convertRequestPriorityListToString(eDataType, instanceValue);
			case FhirPackage.REQUEST_STATUS_LIST:
				return convertRequestStatusListToString(eDataType, instanceValue);
			case FhirPackage.RESEARCH_STUDY_STATUS_LIST:
				return convertResearchStudyStatusListToString(eDataType, instanceValue);
			case FhirPackage.RESEARCH_SUBJECT_STATUS_LIST:
				return convertResearchSubjectStatusListToString(eDataType, instanceValue);
			case FhirPackage.RESOURCE_TYPE_LIST:
				return convertResourceTypeListToString(eDataType, instanceValue);
			case FhirPackage.RESOURCE_VERSION_POLICY_LIST:
				return convertResourceVersionPolicyListToString(eDataType, instanceValue);
			case FhirPackage.RESPONSE_TYPE_LIST:
				return convertResponseTypeListToString(eDataType, instanceValue);
			case FhirPackage.RESTFUL_CAPABILITY_MODE_LIST:
				return convertRestfulCapabilityModeListToString(eDataType, instanceValue);
			case FhirPackage.SEARCH_COMPARATOR_LIST:
				return convertSearchComparatorListToString(eDataType, instanceValue);
			case FhirPackage.SEARCH_ENTRY_MODE_LIST:
				return convertSearchEntryModeListToString(eDataType, instanceValue);
			case FhirPackage.SEARCH_MODIFIER_CODE_LIST:
				return convertSearchModifierCodeListToString(eDataType, instanceValue);
			case FhirPackage.SEARCH_PARAM_TYPE_LIST:
				return convertSearchParamTypeListToString(eDataType, instanceValue);
			case FhirPackage.SLICING_RULES_LIST:
				return convertSlicingRulesListToString(eDataType, instanceValue);
			case FhirPackage.SLOT_STATUS_LIST:
				return convertSlotStatusListToString(eDataType, instanceValue);
			case FhirPackage.SPECIMEN_STATUS_LIST:
				return convertSpecimenStatusListToString(eDataType, instanceValue);
			case FhirPackage.STRUCTURE_DEFINITION_KIND_LIST:
				return convertStructureDefinitionKindListToString(eDataType, instanceValue);
			case FhirPackage.STRUCTURE_MAP_CONTEXT_TYPE_LIST:
				return convertStructureMapContextTypeListToString(eDataType, instanceValue);
			case FhirPackage.STRUCTURE_MAP_GROUP_TYPE_MODE_LIST:
				return convertStructureMapGroupTypeModeListToString(eDataType, instanceValue);
			case FhirPackage.STRUCTURE_MAP_INPUT_MODE_LIST:
				return convertStructureMapInputModeListToString(eDataType, instanceValue);
			case FhirPackage.STRUCTURE_MAP_MODEL_MODE_LIST:
				return convertStructureMapModelModeListToString(eDataType, instanceValue);
			case FhirPackage.STRUCTURE_MAP_SOURCE_LIST_MODE_LIST:
				return convertStructureMapSourceListModeListToString(eDataType, instanceValue);
			case FhirPackage.STRUCTURE_MAP_TARGET_LIST_MODE_LIST:
				return convertStructureMapTargetListModeListToString(eDataType, instanceValue);
			case FhirPackage.STRUCTURE_MAP_TRANSFORM_LIST:
				return convertStructureMapTransformListToString(eDataType, instanceValue);
			case FhirPackage.SUBSCRIPTION_CHANNEL_TYPE_LIST:
				return convertSubscriptionChannelTypeListToString(eDataType, instanceValue);
			case FhirPackage.SUBSCRIPTION_STATUS_LIST:
				return convertSubscriptionStatusListToString(eDataType, instanceValue);
			case FhirPackage.SUPPLY_DELIVERY_STATUS_LIST:
				return convertSupplyDeliveryStatusListToString(eDataType, instanceValue);
			case FhirPackage.SUPPLY_REQUEST_STATUS_LIST:
				return convertSupplyRequestStatusListToString(eDataType, instanceValue);
			case FhirPackage.SYSTEM_RESTFUL_INTERACTION_LIST:
				return convertSystemRestfulInteractionListToString(eDataType, instanceValue);
			case FhirPackage.SYSTEM_VERSION_PROCESSING_MODE_LIST:
				return convertSystemVersionProcessingModeListToString(eDataType, instanceValue);
			case FhirPackage.TASK_STATUS_LIST:
				return convertTaskStatusListToString(eDataType, instanceValue);
			case FhirPackage.TEST_REPORT_ACTION_RESULT_LIST:
				return convertTestReportActionResultListToString(eDataType, instanceValue);
			case FhirPackage.TEST_REPORT_PARTICIPANT_TYPE_LIST:
				return convertTestReportParticipantTypeListToString(eDataType, instanceValue);
			case FhirPackage.TEST_REPORT_RESULT_LIST:
				return convertTestReportResultListToString(eDataType, instanceValue);
			case FhirPackage.TEST_REPORT_STATUS_LIST:
				return convertTestReportStatusListToString(eDataType, instanceValue);
			case FhirPackage.TEST_SCRIPT_REQUEST_METHOD_CODE_LIST:
				return convertTestScriptRequestMethodCodeListToString(eDataType, instanceValue);
			case FhirPackage.TRIGGER_TYPE_LIST:
				return convertTriggerTypeListToString(eDataType, instanceValue);
			case FhirPackage.TYPE_DERIVATION_RULE_LIST:
				return convertTypeDerivationRuleListToString(eDataType, instanceValue);
			case FhirPackage.TYPE_RESTFUL_INTERACTION_LIST:
				return convertTypeRestfulInteractionListToString(eDataType, instanceValue);
			case FhirPackage.UDI_ENTRY_TYPE_LIST:
				return convertUDIEntryTypeListToString(eDataType, instanceValue);
			case FhirPackage.UNITS_OF_TIME_LIST:
				return convertUnitsOfTimeListToString(eDataType, instanceValue);
			case FhirPackage.UNKNOWN_CONTENT_CODE_LIST:
				return convertUnknownContentCodeListToString(eDataType, instanceValue);
			case FhirPackage.USE_LIST:
				return convertUseListToString(eDataType, instanceValue);
			case FhirPackage.VISION_BASE_LIST:
				return convertVisionBaseListToString(eDataType, instanceValue);
			case FhirPackage.VISION_EYES_LIST:
				return convertVisionEyesListToString(eDataType, instanceValue);
			case FhirPackage.XPATH_USAGE_TYPE_LIST:
				return convertXPathUsageTypeListToString(eDataType, instanceValue);
			case FhirPackage.ACCOUNT_STATUS_LIST_OBJECT:
				return convertAccountStatusListObjectToString(eDataType, instanceValue);
			case FhirPackage.ACTION_CARDINALITY_BEHAVIOR_LIST_OBJECT:
				return convertActionCardinalityBehaviorListObjectToString(eDataType, instanceValue);
			case FhirPackage.ACTION_CONDITION_KIND_LIST_OBJECT:
				return convertActionConditionKindListObjectToString(eDataType, instanceValue);
			case FhirPackage.ACTION_GROUPING_BEHAVIOR_LIST_OBJECT:
				return convertActionGroupingBehaviorListObjectToString(eDataType, instanceValue);
			case FhirPackage.ACTION_LIST_LIST_OBJECT:
				return convertActionListListObjectToString(eDataType, instanceValue);
			case FhirPackage.ACTION_PARTICIPANT_TYPE_LIST_OBJECT:
				return convertActionParticipantTypeListObjectToString(eDataType, instanceValue);
			case FhirPackage.ACTION_PRECHECK_BEHAVIOR_LIST_OBJECT:
				return convertActionPrecheckBehaviorListObjectToString(eDataType, instanceValue);
			case FhirPackage.ACTION_RELATIONSHIP_TYPE_LIST_OBJECT:
				return convertActionRelationshipTypeListObjectToString(eDataType, instanceValue);
			case FhirPackage.ACTION_REQUIRED_BEHAVIOR_LIST_OBJECT:
				return convertActionRequiredBehaviorListObjectToString(eDataType, instanceValue);
			case FhirPackage.ACTION_SELECTION_BEHAVIOR_LIST_OBJECT:
				return convertActionSelectionBehaviorListObjectToString(eDataType, instanceValue);
			case FhirPackage.ADDRESS_TYPE_LIST_OBJECT:
				return convertAddressTypeListObjectToString(eDataType, instanceValue);
			case FhirPackage.ADDRESS_USE_LIST_OBJECT:
				return convertAddressUseListObjectToString(eDataType, instanceValue);
			case FhirPackage.ADMINISTRATIVE_GENDER_LIST_OBJECT:
				return convertAdministrativeGenderListObjectToString(eDataType, instanceValue);
			case FhirPackage.ADVERSE_EVENT_CATEGORY_LIST_OBJECT:
				return convertAdverseEventCategoryListObjectToString(eDataType, instanceValue);
			case FhirPackage.ADVERSE_EVENT_CAUSALITY_LIST_OBJECT:
				return convertAdverseEventCausalityListObjectToString(eDataType, instanceValue);
			case FhirPackage.AGGREGATION_MODE_LIST_OBJECT:
				return convertAggregationModeListObjectToString(eDataType, instanceValue);
			case FhirPackage.ALLERGY_INTOLERANCE_CATEGORY_LIST_OBJECT:
				return convertAllergyIntoleranceCategoryListObjectToString(eDataType, instanceValue);
			case FhirPackage.ALLERGY_INTOLERANCE_CLINICAL_STATUS_LIST_OBJECT:
				return convertAllergyIntoleranceClinicalStatusListObjectToString(eDataType, instanceValue);
			case FhirPackage.ALLERGY_INTOLERANCE_CRITICALITY_LIST_OBJECT:
				return convertAllergyIntoleranceCriticalityListObjectToString(eDataType, instanceValue);
			case FhirPackage.ALLERGY_INTOLERANCE_SEVERITY_LIST_OBJECT:
				return convertAllergyIntoleranceSeverityListObjectToString(eDataType, instanceValue);
			case FhirPackage.ALLERGY_INTOLERANCE_TYPE_LIST_OBJECT:
				return convertAllergyIntoleranceTypeListObjectToString(eDataType, instanceValue);
			case FhirPackage.ALLERGY_INTOLERANCE_VERIFICATION_STATUS_LIST_OBJECT:
				return convertAllergyIntoleranceVerificationStatusListObjectToString(eDataType, instanceValue);
			case FhirPackage.APPOINTMENT_STATUS_LIST_OBJECT:
				return convertAppointmentStatusListObjectToString(eDataType, instanceValue);
			case FhirPackage.ASSERTION_DIRECTION_TYPE_LIST_OBJECT:
				return convertAssertionDirectionTypeListObjectToString(eDataType, instanceValue);
			case FhirPackage.ASSERTION_OPERATOR_TYPE_LIST_OBJECT:
				return convertAssertionOperatorTypeListObjectToString(eDataType, instanceValue);
			case FhirPackage.ASSERTION_RESPONSE_TYPES_LIST_OBJECT:
				return convertAssertionResponseTypesListObjectToString(eDataType, instanceValue);
			case FhirPackage.AUDIT_EVENT_ACTION_LIST_OBJECT:
				return convertAuditEventActionListObjectToString(eDataType, instanceValue);
			case FhirPackage.AUDIT_EVENT_AGENT_NETWORK_TYPE_LIST_OBJECT:
				return convertAuditEventAgentNetworkTypeListObjectToString(eDataType, instanceValue);
			case FhirPackage.AUDIT_EVENT_OUTCOME_LIST_OBJECT:
				return convertAuditEventOutcomeListObjectToString(eDataType, instanceValue);
			case FhirPackage.BASE64_BINARY_PRIMITIVE:
				return convertBase64BinaryPrimitiveToString(eDataType, instanceValue);
			case FhirPackage.BINDING_STRENGTH_LIST_OBJECT:
				return convertBindingStrengthListObjectToString(eDataType, instanceValue);
			case FhirPackage.BOOLEAN_PRIMITIVE:
				return convertBooleanPrimitiveToString(eDataType, instanceValue);
			case FhirPackage.BOOLEAN_PRIMITIVE_OBJECT:
				return convertBooleanPrimitiveObjectToString(eDataType, instanceValue);
			case FhirPackage.BUNDLE_TYPE_LIST_OBJECT:
				return convertBundleTypeListObjectToString(eDataType, instanceValue);
			case FhirPackage.CAPABILITY_STATEMENT_KIND_LIST_OBJECT:
				return convertCapabilityStatementKindListObjectToString(eDataType, instanceValue);
			case FhirPackage.CARE_PLAN_ACTIVITY_STATUS_LIST_OBJECT:
				return convertCarePlanActivityStatusListObjectToString(eDataType, instanceValue);
			case FhirPackage.CARE_PLAN_INTENT_LIST_OBJECT:
				return convertCarePlanIntentListObjectToString(eDataType, instanceValue);
			case FhirPackage.CARE_PLAN_STATUS_LIST_OBJECT:
				return convertCarePlanStatusListObjectToString(eDataType, instanceValue);
			case FhirPackage.CARE_TEAM_STATUS_LIST_OBJECT:
				return convertCareTeamStatusListObjectToString(eDataType, instanceValue);
			case FhirPackage.CHARGE_ITEM_STATUS_LIST_OBJECT:
				return convertChargeItemStatusListObjectToString(eDataType, instanceValue);
			case FhirPackage.CLINICAL_IMPRESSION_STATUS_LIST_OBJECT:
				return convertClinicalImpressionStatusListObjectToString(eDataType, instanceValue);
			case FhirPackage.CODE_PRIMITIVE:
				return convertCodePrimitiveToString(eDataType, instanceValue);
			case FhirPackage.CODE_SYSTEM_CONTENT_MODE_LIST_OBJECT:
				return convertCodeSystemContentModeListObjectToString(eDataType, instanceValue);
			case FhirPackage.CODE_SYSTEM_HIERARCHY_MEANING_LIST_OBJECT:
				return convertCodeSystemHierarchyMeaningListObjectToString(eDataType, instanceValue);
			case FhirPackage.COMPARTMENT_TYPE_LIST_OBJECT:
				return convertCompartmentTypeListObjectToString(eDataType, instanceValue);
			case FhirPackage.COMPOSITION_ATTESTATION_MODE_LIST_OBJECT:
				return convertCompositionAttestationModeListObjectToString(eDataType, instanceValue);
			case FhirPackage.COMPOSITION_STATUS_LIST_OBJECT:
				return convertCompositionStatusListObjectToString(eDataType, instanceValue);
			case FhirPackage.CONCEPT_MAP_EQUIVALENCE_LIST_OBJECT:
				return convertConceptMapEquivalenceListObjectToString(eDataType, instanceValue);
			case FhirPackage.CONCEPT_MAP_GROUP_UNMAPPED_MODE_LIST_OBJECT:
				return convertConceptMapGroupUnmappedModeListObjectToString(eDataType, instanceValue);
			case FhirPackage.CONDITIONAL_DELETE_STATUS_LIST_OBJECT:
				return convertConditionalDeleteStatusListObjectToString(eDataType, instanceValue);
			case FhirPackage.CONDITIONAL_READ_STATUS_LIST_OBJECT:
				return convertConditionalReadStatusListObjectToString(eDataType, instanceValue);
			case FhirPackage.CONDITION_CLINICAL_STATUS_CODES_LIST_OBJECT:
				return convertConditionClinicalStatusCodesListObjectToString(eDataType, instanceValue);
			case FhirPackage.CONDITION_VERIFICATION_STATUS_LIST_OBJECT:
				return convertConditionVerificationStatusListObjectToString(eDataType, instanceValue);
			case FhirPackage.CONFIDENTIALITY_CLASSIFICATION_LIST_OBJECT:
				return convertConfidentialityClassificationListObjectToString(eDataType, instanceValue);
			case FhirPackage.CONSENT_DATA_MEANING_LIST_OBJECT:
				return convertConsentDataMeaningListObjectToString(eDataType, instanceValue);
			case FhirPackage.CONSENT_EXCEPT_TYPE_LIST_OBJECT:
				return convertConsentExceptTypeListObjectToString(eDataType, instanceValue);
			case FhirPackage.CONSENT_STATE_LIST_OBJECT:
				return convertConsentStateListObjectToString(eDataType, instanceValue);
			case FhirPackage.CONSTRAINT_SEVERITY_LIST_OBJECT:
				return convertConstraintSeverityListObjectToString(eDataType, instanceValue);
			case FhirPackage.CONTACT_POINT_SYSTEM_LIST_OBJECT:
				return convertContactPointSystemListObjectToString(eDataType, instanceValue);
			case FhirPackage.CONTACT_POINT_USE_LIST_OBJECT:
				return convertContactPointUseListObjectToString(eDataType, instanceValue);
			case FhirPackage.CONTENT_TYPE_LIST_OBJECT:
				return convertContentTypeListObjectToString(eDataType, instanceValue);
			case FhirPackage.CONTRACT_RESOURCE_STATUS_CODES_LIST_OBJECT:
				return convertContractResourceStatusCodesListObjectToString(eDataType, instanceValue);
			case FhirPackage.CONTRIBUTOR_TYPE_LIST_OBJECT:
				return convertContributorTypeListObjectToString(eDataType, instanceValue);
			case FhirPackage.DATA_ELEMENT_STRINGENCY_LIST_OBJECT:
				return convertDataElementStringencyListObjectToString(eDataType, instanceValue);
			case FhirPackage.DATE_PRIMITIVE:
				return convertDatePrimitiveToString(eDataType, instanceValue);
			case FhirPackage.DATE_PRIMITIVE_BASE:
				return convertDatePrimitiveBaseToString(eDataType, instanceValue);
			case FhirPackage.DATE_TIME_PRIMITIVE:
				return convertDateTimePrimitiveToString(eDataType, instanceValue);
			case FhirPackage.DATE_TIME_PRIMITIVE_BASE:
				return convertDateTimePrimitiveBaseToString(eDataType, instanceValue);
			case FhirPackage.DAYS_OF_WEEK_LIST_OBJECT:
				return convertDaysOfWeekListObjectToString(eDataType, instanceValue);
			case FhirPackage.DECIMAL_PRIMITIVE:
				return convertDecimalPrimitiveToString(eDataType, instanceValue);
			case FhirPackage.DETECTED_ISSUE_SEVERITY_LIST_OBJECT:
				return convertDetectedIssueSeverityListObjectToString(eDataType, instanceValue);
			case FhirPackage.DEVICE_METRIC_CALIBRATION_STATE_LIST_OBJECT:
				return convertDeviceMetricCalibrationStateListObjectToString(eDataType, instanceValue);
			case FhirPackage.DEVICE_METRIC_CALIBRATION_TYPE_LIST_OBJECT:
				return convertDeviceMetricCalibrationTypeListObjectToString(eDataType, instanceValue);
			case FhirPackage.DEVICE_METRIC_CATEGORY_LIST_OBJECT:
				return convertDeviceMetricCategoryListObjectToString(eDataType, instanceValue);
			case FhirPackage.DEVICE_METRIC_COLOR_LIST_OBJECT:
				return convertDeviceMetricColorListObjectToString(eDataType, instanceValue);
			case FhirPackage.DEVICE_METRIC_OPERATIONAL_STATUS_LIST_OBJECT:
				return convertDeviceMetricOperationalStatusListObjectToString(eDataType, instanceValue);
			case FhirPackage.DEVICE_USE_STATEMENT_STATUS_LIST_OBJECT:
				return convertDeviceUseStatementStatusListObjectToString(eDataType, instanceValue);
			case FhirPackage.DIAGNOSTIC_REPORT_STATUS_LIST_OBJECT:
				return convertDiagnosticReportStatusListObjectToString(eDataType, instanceValue);
			case FhirPackage.DIGITAL_MEDIA_TYPE_LIST_OBJECT:
				return convertDigitalMediaTypeListObjectToString(eDataType, instanceValue);
			case FhirPackage.DISCRIMINATOR_TYPE_LIST_OBJECT:
				return convertDiscriminatorTypeListObjectToString(eDataType, instanceValue);
			case FhirPackage.DOCUMENT_MODE_LIST_OBJECT:
				return convertDocumentModeListObjectToString(eDataType, instanceValue);
			case FhirPackage.DOCUMENT_REFERENCE_STATUS_LIST_OBJECT:
				return convertDocumentReferenceStatusListObjectToString(eDataType, instanceValue);
			case FhirPackage.DOCUMENT_RELATIONSHIP_TYPE_LIST_OBJECT:
				return convertDocumentRelationshipTypeListObjectToString(eDataType, instanceValue);
			case FhirPackage.ENCOUNTER_LOCATION_STATUS_LIST_OBJECT:
				return convertEncounterLocationStatusListObjectToString(eDataType, instanceValue);
			case FhirPackage.ENCOUNTER_STATUS_LIST_OBJECT:
				return convertEncounterStatusListObjectToString(eDataType, instanceValue);
			case FhirPackage.ENDPOINT_STATUS_LIST_OBJECT:
				return convertEndpointStatusListObjectToString(eDataType, instanceValue);
			case FhirPackage.EPISODE_OF_CARE_STATUS_LIST_OBJECT:
				return convertEpisodeOfCareStatusListObjectToString(eDataType, instanceValue);
			case FhirPackage.EVENT_CAPABILITY_MODE_LIST_OBJECT:
				return convertEventCapabilityModeListObjectToString(eDataType, instanceValue);
			case FhirPackage.EVENT_STATUS_LIST_OBJECT:
				return convertEventStatusListObjectToString(eDataType, instanceValue);
			case FhirPackage.EVENT_TIMING_LIST_OBJECT:
				return convertEventTimingListObjectToString(eDataType, instanceValue);
			case FhirPackage.EXPLANATION_OF_BENEFIT_STATUS_LIST_OBJECT:
				return convertExplanationOfBenefitStatusListObjectToString(eDataType, instanceValue);
			case FhirPackage.EXTENSION_CONTEXT_LIST_OBJECT:
				return convertExtensionContextListObjectToString(eDataType, instanceValue);
			case FhirPackage.FAMILY_HISTORY_STATUS_LIST_OBJECT:
				return convertFamilyHistoryStatusListObjectToString(eDataType, instanceValue);
			case FhirPackage.FHIR_ALL_TYPES_LIST_OBJECT:
				return convertFHIRAllTypesListObjectToString(eDataType, instanceValue);
			case FhirPackage.FHIR_DEFINED_TYPE_LIST_OBJECT:
				return convertFHIRDefinedTypeListObjectToString(eDataType, instanceValue);
			case FhirPackage.FHIR_DEVICE_STATUS_LIST_OBJECT:
				return convertFHIRDeviceStatusListObjectToString(eDataType, instanceValue);
			case FhirPackage.FHIR_SUBSTANCE_STATUS_LIST_OBJECT:
				return convertFHIRSubstanceStatusListObjectToString(eDataType, instanceValue);
			case FhirPackage.FILTER_OPERATOR_LIST_OBJECT:
				return convertFilterOperatorListObjectToString(eDataType, instanceValue);
			case FhirPackage.FINANCIAL_RESOURCE_STATUS_CODES_LIST_OBJECT:
				return convertFinancialResourceStatusCodesListObjectToString(eDataType, instanceValue);
			case FhirPackage.FLAG_STATUS_LIST_OBJECT:
				return convertFlagStatusListObjectToString(eDataType, instanceValue);
			case FhirPackage.GOAL_STATUS_LIST_OBJECT:
				return convertGoalStatusListObjectToString(eDataType, instanceValue);
			case FhirPackage.GRAPH_COMPARTMENT_RULE_LIST_OBJECT:
				return convertGraphCompartmentRuleListObjectToString(eDataType, instanceValue);
			case FhirPackage.GROUP_TYPE_LIST_OBJECT:
				return convertGroupTypeListObjectToString(eDataType, instanceValue);
			case FhirPackage.GUIDANCE_RESPONSE_STATUS_LIST_OBJECT:
				return convertGuidanceResponseStatusListObjectToString(eDataType, instanceValue);
			case FhirPackage.GUIDE_DEPENDENCY_TYPE_LIST_OBJECT:
				return convertGuideDependencyTypeListObjectToString(eDataType, instanceValue);
			case FhirPackage.GUIDE_PAGE_KIND_LIST_OBJECT:
				return convertGuidePageKindListObjectToString(eDataType, instanceValue);
			case FhirPackage.HTTP_VERB_LIST_OBJECT:
				return convertHTTPVerbListObjectToString(eDataType, instanceValue);
			case FhirPackage.IDENTIFIER_USE_LIST_OBJECT:
				return convertIdentifierUseListObjectToString(eDataType, instanceValue);
			case FhirPackage.IDENTITY_ASSURANCE_LEVEL_LIST_OBJECT:
				return convertIdentityAssuranceLevelListObjectToString(eDataType, instanceValue);
			case FhirPackage.ID_PRIMITIVE:
				return convertIdPrimitiveToString(eDataType, instanceValue);
			case FhirPackage.IMMUNIZATION_STATUS_CODES_LIST_OBJECT:
				return convertImmunizationStatusCodesListObjectToString(eDataType, instanceValue);
			case FhirPackage.INSTANCE_AVAILABILITY_LIST_OBJECT:
				return convertInstanceAvailabilityListObjectToString(eDataType, instanceValue);
			case FhirPackage.INSTANT_PRIMITIVE:
				return convertInstantPrimitiveToString(eDataType, instanceValue);
			case FhirPackage.INTEGER_PRIMITIVE:
				return convertIntegerPrimitiveToString(eDataType, instanceValue);
			case FhirPackage.INTEGER_PRIMITIVE_OBJECT:
				return convertIntegerPrimitiveObjectToString(eDataType, instanceValue);
			case FhirPackage.ISSUE_SEVERITY_LIST_OBJECT:
				return convertIssueSeverityListObjectToString(eDataType, instanceValue);
			case FhirPackage.ISSUE_TYPE_LIST_OBJECT:
				return convertIssueTypeListObjectToString(eDataType, instanceValue);
			case FhirPackage.LINKAGE_TYPE_LIST_OBJECT:
				return convertLinkageTypeListObjectToString(eDataType, instanceValue);
			case FhirPackage.LINK_TYPE_LIST_OBJECT:
				return convertLinkTypeListObjectToString(eDataType, instanceValue);
			case FhirPackage.LIST_MODE_LIST_OBJECT:
				return convertListModeListObjectToString(eDataType, instanceValue);
			case FhirPackage.LIST_STATUS_LIST_OBJECT:
				return convertListStatusListObjectToString(eDataType, instanceValue);
			case FhirPackage.LOCATION_MODE_LIST_OBJECT:
				return convertLocationModeListObjectToString(eDataType, instanceValue);
			case FhirPackage.LOCATION_STATUS_LIST_OBJECT:
				return convertLocationStatusListObjectToString(eDataType, instanceValue);
			case FhirPackage.MARKDOWN_PRIMITIVE:
				return convertMarkdownPrimitiveToString(eDataType, instanceValue);
			case FhirPackage.MEASMNT_PRINCIPLE_LIST_OBJECT:
				return convertMeasmntPrincipleListObjectToString(eDataType, instanceValue);
			case FhirPackage.MEASURE_REPORT_STATUS_LIST_OBJECT:
				return convertMeasureReportStatusListObjectToString(eDataType, instanceValue);
			case FhirPackage.MEASURE_REPORT_TYPE_LIST_OBJECT:
				return convertMeasureReportTypeListObjectToString(eDataType, instanceValue);
			case FhirPackage.MEDICATION_ADMINISTRATION_STATUS_LIST_OBJECT:
				return convertMedicationAdministrationStatusListObjectToString(eDataType, instanceValue);
			case FhirPackage.MEDICATION_DISPENSE_STATUS_LIST_OBJECT:
				return convertMedicationDispenseStatusListObjectToString(eDataType, instanceValue);
			case FhirPackage.MEDICATION_REQUEST_INTENT_LIST_OBJECT:
				return convertMedicationRequestIntentListObjectToString(eDataType, instanceValue);
			case FhirPackage.MEDICATION_REQUEST_PRIORITY_LIST_OBJECT:
				return convertMedicationRequestPriorityListObjectToString(eDataType, instanceValue);
			case FhirPackage.MEDICATION_REQUEST_STATUS_LIST_OBJECT:
				return convertMedicationRequestStatusListObjectToString(eDataType, instanceValue);
			case FhirPackage.MEDICATION_STATEMENT_STATUS_LIST_OBJECT:
				return convertMedicationStatementStatusListObjectToString(eDataType, instanceValue);
			case FhirPackage.MEDICATION_STATEMENT_TAKEN_LIST_OBJECT:
				return convertMedicationStatementTakenListObjectToString(eDataType, instanceValue);
			case FhirPackage.MEDICATION_STATUS_LIST_OBJECT:
				return convertMedicationStatusListObjectToString(eDataType, instanceValue);
			case FhirPackage.MESSAGE_SIGNIFICANCE_CATEGORY_LIST_OBJECT:
				return convertMessageSignificanceCategoryListObjectToString(eDataType, instanceValue);
			case FhirPackage.NAME_USE_LIST_OBJECT:
				return convertNameUseListObjectToString(eDataType, instanceValue);
			case FhirPackage.NAMING_SYSTEM_IDENTIFIER_TYPE_LIST_OBJECT:
				return convertNamingSystemIdentifierTypeListObjectToString(eDataType, instanceValue);
			case FhirPackage.NAMING_SYSTEM_TYPE_LIST_OBJECT:
				return convertNamingSystemTypeListObjectToString(eDataType, instanceValue);
			case FhirPackage.NARRATIVE_STATUS_LIST_OBJECT:
				return convertNarrativeStatusListObjectToString(eDataType, instanceValue);
			case FhirPackage.NOTE_TYPE_LIST_OBJECT:
				return convertNoteTypeListObjectToString(eDataType, instanceValue);
			case FhirPackage.NUTRITION_ORDER_STATUS_LIST_OBJECT:
				return convertNutritionOrderStatusListObjectToString(eDataType, instanceValue);
			case FhirPackage.OBSERVATION_RELATIONSHIP_TYPE_LIST_OBJECT:
				return convertObservationRelationshipTypeListObjectToString(eDataType, instanceValue);
			case FhirPackage.OBSERVATION_STATUS_LIST_OBJECT:
				return convertObservationStatusListObjectToString(eDataType, instanceValue);
			case FhirPackage.OID_PRIMITIVE:
				return convertOidPrimitiveToString(eDataType, instanceValue);
			case FhirPackage.OPERATION_KIND_LIST_OBJECT:
				return convertOperationKindListObjectToString(eDataType, instanceValue);
			case FhirPackage.OPERATION_PARAMETER_USE_LIST_OBJECT:
				return convertOperationParameterUseListObjectToString(eDataType, instanceValue);
			case FhirPackage.PARTICIPANT_REQUIRED_LIST_OBJECT:
				return convertParticipantRequiredListObjectToString(eDataType, instanceValue);
			case FhirPackage.PARTICIPATION_STATUS_LIST_OBJECT:
				return convertParticipationStatusListObjectToString(eDataType, instanceValue);
			case FhirPackage.POSITIVE_INT_PRIMITIVE:
				return convertPositiveIntPrimitiveToString(eDataType, instanceValue);
			case FhirPackage.PROPERTY_REPRESENTATION_LIST_OBJECT:
				return convertPropertyRepresentationListObjectToString(eDataType, instanceValue);
			case FhirPackage.PROPERTY_TYPE_LIST_OBJECT:
				return convertPropertyTypeListObjectToString(eDataType, instanceValue);
			case FhirPackage.PROVENANCE_ENTITY_ROLE_LIST_OBJECT:
				return convertProvenanceEntityRoleListObjectToString(eDataType, instanceValue);
			case FhirPackage.PUBLICATION_STATUS_LIST_OBJECT:
				return convertPublicationStatusListObjectToString(eDataType, instanceValue);
			case FhirPackage.QUALITY_TYPE_LIST_OBJECT:
				return convertQualityTypeListObjectToString(eDataType, instanceValue);
			case FhirPackage.QUANTITY_COMPARATOR_LIST_OBJECT:
				return convertQuantityComparatorListObjectToString(eDataType, instanceValue);
			case FhirPackage.QUESTIONNAIRE_ITEM_TYPE_LIST_OBJECT:
				return convertQuestionnaireItemTypeListObjectToString(eDataType, instanceValue);
			case FhirPackage.QUESTIONNAIRE_RESPONSE_STATUS_LIST_OBJECT:
				return convertQuestionnaireResponseStatusListObjectToString(eDataType, instanceValue);
			case FhirPackage.REFERENCE_HANDLING_POLICY_LIST_OBJECT:
				return convertReferenceHandlingPolicyListObjectToString(eDataType, instanceValue);
			case FhirPackage.REFERENCE_VERSION_RULES_LIST_OBJECT:
				return convertReferenceVersionRulesListObjectToString(eDataType, instanceValue);
			case FhirPackage.RELATED_ARTIFACT_TYPE_LIST_OBJECT:
				return convertRelatedArtifactTypeListObjectToString(eDataType, instanceValue);
			case FhirPackage.REMITTANCE_OUTCOME_LIST_OBJECT:
				return convertRemittanceOutcomeListObjectToString(eDataType, instanceValue);
			case FhirPackage.REPOSITORY_TYPE_LIST_OBJECT:
				return convertRepositoryTypeListObjectToString(eDataType, instanceValue);
			case FhirPackage.REQUEST_INTENT_LIST_OBJECT:
				return convertRequestIntentListObjectToString(eDataType, instanceValue);
			case FhirPackage.REQUEST_PRIORITY_LIST_OBJECT:
				return convertRequestPriorityListObjectToString(eDataType, instanceValue);
			case FhirPackage.REQUEST_STATUS_LIST_OBJECT:
				return convertRequestStatusListObjectToString(eDataType, instanceValue);
			case FhirPackage.RESEARCH_STUDY_STATUS_LIST_OBJECT:
				return convertResearchStudyStatusListObjectToString(eDataType, instanceValue);
			case FhirPackage.RESEARCH_SUBJECT_STATUS_LIST_OBJECT:
				return convertResearchSubjectStatusListObjectToString(eDataType, instanceValue);
			case FhirPackage.RESOURCE_TYPE_LIST_OBJECT:
				return convertResourceTypeListObjectToString(eDataType, instanceValue);
			case FhirPackage.RESOURCE_VERSION_POLICY_LIST_OBJECT:
				return convertResourceVersionPolicyListObjectToString(eDataType, instanceValue);
			case FhirPackage.RESPONSE_TYPE_LIST_OBJECT:
				return convertResponseTypeListObjectToString(eDataType, instanceValue);
			case FhirPackage.RESTFUL_CAPABILITY_MODE_LIST_OBJECT:
				return convertRestfulCapabilityModeListObjectToString(eDataType, instanceValue);
			case FhirPackage.SAMPLED_DATA_DATA_TYPE_PRIMITIVE:
				return convertSampledDataDataTypePrimitiveToString(eDataType, instanceValue);
			case FhirPackage.SEARCH_COMPARATOR_LIST_OBJECT:
				return convertSearchComparatorListObjectToString(eDataType, instanceValue);
			case FhirPackage.SEARCH_ENTRY_MODE_LIST_OBJECT:
				return convertSearchEntryModeListObjectToString(eDataType, instanceValue);
			case FhirPackage.SEARCH_MODIFIER_CODE_LIST_OBJECT:
				return convertSearchModifierCodeListObjectToString(eDataType, instanceValue);
			case FhirPackage.SEARCH_PARAM_TYPE_LIST_OBJECT:
				return convertSearchParamTypeListObjectToString(eDataType, instanceValue);
			case FhirPackage.SLICING_RULES_LIST_OBJECT:
				return convertSlicingRulesListObjectToString(eDataType, instanceValue);
			case FhirPackage.SLOT_STATUS_LIST_OBJECT:
				return convertSlotStatusListObjectToString(eDataType, instanceValue);
			case FhirPackage.SPECIMEN_STATUS_LIST_OBJECT:
				return convertSpecimenStatusListObjectToString(eDataType, instanceValue);
			case FhirPackage.STRING_PRIMITIVE:
				return convertStringPrimitiveToString(eDataType, instanceValue);
			case FhirPackage.STRUCTURE_DEFINITION_KIND_LIST_OBJECT:
				return convertStructureDefinitionKindListObjectToString(eDataType, instanceValue);
			case FhirPackage.STRUCTURE_MAP_CONTEXT_TYPE_LIST_OBJECT:
				return convertStructureMapContextTypeListObjectToString(eDataType, instanceValue);
			case FhirPackage.STRUCTURE_MAP_GROUP_TYPE_MODE_LIST_OBJECT:
				return convertStructureMapGroupTypeModeListObjectToString(eDataType, instanceValue);
			case FhirPackage.STRUCTURE_MAP_INPUT_MODE_LIST_OBJECT:
				return convertStructureMapInputModeListObjectToString(eDataType, instanceValue);
			case FhirPackage.STRUCTURE_MAP_MODEL_MODE_LIST_OBJECT:
				return convertStructureMapModelModeListObjectToString(eDataType, instanceValue);
			case FhirPackage.STRUCTURE_MAP_SOURCE_LIST_MODE_LIST_OBJECT:
				return convertStructureMapSourceListModeListObjectToString(eDataType, instanceValue);
			case FhirPackage.STRUCTURE_MAP_TARGET_LIST_MODE_LIST_OBJECT:
				return convertStructureMapTargetListModeListObjectToString(eDataType, instanceValue);
			case FhirPackage.STRUCTURE_MAP_TRANSFORM_LIST_OBJECT:
				return convertStructureMapTransformListObjectToString(eDataType, instanceValue);
			case FhirPackage.SUBSCRIPTION_CHANNEL_TYPE_LIST_OBJECT:
				return convertSubscriptionChannelTypeListObjectToString(eDataType, instanceValue);
			case FhirPackage.SUBSCRIPTION_STATUS_LIST_OBJECT:
				return convertSubscriptionStatusListObjectToString(eDataType, instanceValue);
			case FhirPackage.SUPPLY_DELIVERY_STATUS_LIST_OBJECT:
				return convertSupplyDeliveryStatusListObjectToString(eDataType, instanceValue);
			case FhirPackage.SUPPLY_REQUEST_STATUS_LIST_OBJECT:
				return convertSupplyRequestStatusListObjectToString(eDataType, instanceValue);
			case FhirPackage.SYSTEM_RESTFUL_INTERACTION_LIST_OBJECT:
				return convertSystemRestfulInteractionListObjectToString(eDataType, instanceValue);
			case FhirPackage.SYSTEM_VERSION_PROCESSING_MODE_LIST_OBJECT:
				return convertSystemVersionProcessingModeListObjectToString(eDataType, instanceValue);
			case FhirPackage.TASK_STATUS_LIST_OBJECT:
				return convertTaskStatusListObjectToString(eDataType, instanceValue);
			case FhirPackage.TEST_REPORT_ACTION_RESULT_LIST_OBJECT:
				return convertTestReportActionResultListObjectToString(eDataType, instanceValue);
			case FhirPackage.TEST_REPORT_PARTICIPANT_TYPE_LIST_OBJECT:
				return convertTestReportParticipantTypeListObjectToString(eDataType, instanceValue);
			case FhirPackage.TEST_REPORT_RESULT_LIST_OBJECT:
				return convertTestReportResultListObjectToString(eDataType, instanceValue);
			case FhirPackage.TEST_REPORT_STATUS_LIST_OBJECT:
				return convertTestReportStatusListObjectToString(eDataType, instanceValue);
			case FhirPackage.TEST_SCRIPT_REQUEST_METHOD_CODE_LIST_OBJECT:
				return convertTestScriptRequestMethodCodeListObjectToString(eDataType, instanceValue);
			case FhirPackage.TIME_PRIMITIVE:
				return convertTimePrimitiveToString(eDataType, instanceValue);
			case FhirPackage.TRIGGER_TYPE_LIST_OBJECT:
				return convertTriggerTypeListObjectToString(eDataType, instanceValue);
			case FhirPackage.TYPE_DERIVATION_RULE_LIST_OBJECT:
				return convertTypeDerivationRuleListObjectToString(eDataType, instanceValue);
			case FhirPackage.TYPE_RESTFUL_INTERACTION_LIST_OBJECT:
				return convertTypeRestfulInteractionListObjectToString(eDataType, instanceValue);
			case FhirPackage.UDI_ENTRY_TYPE_LIST_OBJECT:
				return convertUDIEntryTypeListObjectToString(eDataType, instanceValue);
			case FhirPackage.UNITS_OF_TIME_LIST_OBJECT:
				return convertUnitsOfTimeListObjectToString(eDataType, instanceValue);
			case FhirPackage.UNKNOWN_CONTENT_CODE_LIST_OBJECT:
				return convertUnknownContentCodeListObjectToString(eDataType, instanceValue);
			case FhirPackage.UNSIGNED_INT_PRIMITIVE:
				return convertUnsignedIntPrimitiveToString(eDataType, instanceValue);
			case FhirPackage.URI_PRIMITIVE:
				return convertUriPrimitiveToString(eDataType, instanceValue);
			case FhirPackage.USE_LIST_OBJECT:
				return convertUseListObjectToString(eDataType, instanceValue);
			case FhirPackage.UUID_PRIMITIVE:
				return convertUuidPrimitiveToString(eDataType, instanceValue);
			case FhirPackage.VISION_BASE_LIST_OBJECT:
				return convertVisionBaseListObjectToString(eDataType, instanceValue);
			case FhirPackage.VISION_EYES_LIST_OBJECT:
				return convertVisionEyesListObjectToString(eDataType, instanceValue);
			case FhirPackage.XPATH_USAGE_TYPE_LIST_OBJECT:
				return convertXPathUsageTypeListObjectToString(eDataType, instanceValue);
			default:
				throw new IllegalArgumentException("The datatype '" + eDataType.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Account createAccount() {
		AccountImpl account = new AccountImpl();
		return account;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AccountCoverage createAccountCoverage() {
		AccountCoverageImpl accountCoverage = new AccountCoverageImpl();
		return accountCoverage;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AccountGuarantor createAccountGuarantor() {
		AccountGuarantorImpl accountGuarantor = new AccountGuarantorImpl();
		return accountGuarantor;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AccountStatus createAccountStatus() {
		AccountStatusImpl accountStatus = new AccountStatusImpl();
		return accountStatus;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ActionCardinalityBehavior createActionCardinalityBehavior() {
		ActionCardinalityBehaviorImpl actionCardinalityBehavior = new ActionCardinalityBehaviorImpl();
		return actionCardinalityBehavior;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ActionConditionKind createActionConditionKind() {
		ActionConditionKindImpl actionConditionKind = new ActionConditionKindImpl();
		return actionConditionKind;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ActionGroupingBehavior createActionGroupingBehavior() {
		ActionGroupingBehaviorImpl actionGroupingBehavior = new ActionGroupingBehaviorImpl();
		return actionGroupingBehavior;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ActionList createActionList() {
		ActionListImpl actionList = new ActionListImpl();
		return actionList;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ActionParticipantType createActionParticipantType() {
		ActionParticipantTypeImpl actionParticipantType = new ActionParticipantTypeImpl();
		return actionParticipantType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ActionPrecheckBehavior createActionPrecheckBehavior() {
		ActionPrecheckBehaviorImpl actionPrecheckBehavior = new ActionPrecheckBehaviorImpl();
		return actionPrecheckBehavior;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ActionRelationshipType createActionRelationshipType() {
		ActionRelationshipTypeImpl actionRelationshipType = new ActionRelationshipTypeImpl();
		return actionRelationshipType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ActionRequiredBehavior createActionRequiredBehavior() {
		ActionRequiredBehaviorImpl actionRequiredBehavior = new ActionRequiredBehaviorImpl();
		return actionRequiredBehavior;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ActionSelectionBehavior createActionSelectionBehavior() {
		ActionSelectionBehaviorImpl actionSelectionBehavior = new ActionSelectionBehaviorImpl();
		return actionSelectionBehavior;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ActivityDefinition createActivityDefinition() {
		ActivityDefinitionImpl activityDefinition = new ActivityDefinitionImpl();
		return activityDefinition;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ActivityDefinitionDynamicValue createActivityDefinitionDynamicValue() {
		ActivityDefinitionDynamicValueImpl activityDefinitionDynamicValue = new ActivityDefinitionDynamicValueImpl();
		return activityDefinitionDynamicValue;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ActivityDefinitionParticipant createActivityDefinitionParticipant() {
		ActivityDefinitionParticipantImpl activityDefinitionParticipant = new ActivityDefinitionParticipantImpl();
		return activityDefinitionParticipant;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Address createAddress() {
		AddressImpl address = new AddressImpl();
		return address;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AddressType createAddressType() {
		AddressTypeImpl addressType = new AddressTypeImpl();
		return addressType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AddressUse createAddressUse() {
		AddressUseImpl addressUse = new AddressUseImpl();
		return addressUse;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AdministrativeGender createAdministrativeGender() {
		AdministrativeGenderImpl administrativeGender = new AdministrativeGenderImpl();
		return administrativeGender;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AdverseEvent createAdverseEvent() {
		AdverseEventImpl adverseEvent = new AdverseEventImpl();
		return adverseEvent;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AdverseEventCategory createAdverseEventCategory() {
		AdverseEventCategoryImpl adverseEventCategory = new AdverseEventCategoryImpl();
		return adverseEventCategory;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AdverseEventCausality createAdverseEventCausality() {
		AdverseEventCausalityImpl adverseEventCausality = new AdverseEventCausalityImpl();
		return adverseEventCausality;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AdverseEventSuspectEntity createAdverseEventSuspectEntity() {
		AdverseEventSuspectEntityImpl adverseEventSuspectEntity = new AdverseEventSuspectEntityImpl();
		return adverseEventSuspectEntity;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Age createAge() {
		AgeImpl age = new AgeImpl();
		return age;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AggregationMode createAggregationMode() {
		AggregationModeImpl aggregationMode = new AggregationModeImpl();
		return aggregationMode;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AllergyIntolerance createAllergyIntolerance() {
		AllergyIntoleranceImpl allergyIntolerance = new AllergyIntoleranceImpl();
		return allergyIntolerance;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AllergyIntoleranceCategory createAllergyIntoleranceCategory() {
		AllergyIntoleranceCategoryImpl allergyIntoleranceCategory = new AllergyIntoleranceCategoryImpl();
		return allergyIntoleranceCategory;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AllergyIntoleranceClinicalStatus createAllergyIntoleranceClinicalStatus() {
		AllergyIntoleranceClinicalStatusImpl allergyIntoleranceClinicalStatus = new AllergyIntoleranceClinicalStatusImpl();
		return allergyIntoleranceClinicalStatus;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AllergyIntoleranceCriticality createAllergyIntoleranceCriticality() {
		AllergyIntoleranceCriticalityImpl allergyIntoleranceCriticality = new AllergyIntoleranceCriticalityImpl();
		return allergyIntoleranceCriticality;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AllergyIntoleranceReaction createAllergyIntoleranceReaction() {
		AllergyIntoleranceReactionImpl allergyIntoleranceReaction = new AllergyIntoleranceReactionImpl();
		return allergyIntoleranceReaction;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AllergyIntoleranceSeverity createAllergyIntoleranceSeverity() {
		AllergyIntoleranceSeverityImpl allergyIntoleranceSeverity = new AllergyIntoleranceSeverityImpl();
		return allergyIntoleranceSeverity;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AllergyIntoleranceType createAllergyIntoleranceType() {
		AllergyIntoleranceTypeImpl allergyIntoleranceType = new AllergyIntoleranceTypeImpl();
		return allergyIntoleranceType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AllergyIntoleranceVerificationStatus createAllergyIntoleranceVerificationStatus() {
		AllergyIntoleranceVerificationStatusImpl allergyIntoleranceVerificationStatus = new AllergyIntoleranceVerificationStatusImpl();
		return allergyIntoleranceVerificationStatus;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Annotation createAnnotation() {
		AnnotationImpl annotation = new AnnotationImpl();
		return annotation;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Appointment createAppointment() {
		AppointmentImpl appointment = new AppointmentImpl();
		return appointment;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AppointmentParticipant createAppointmentParticipant() {
		AppointmentParticipantImpl appointmentParticipant = new AppointmentParticipantImpl();
		return appointmentParticipant;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AppointmentResponse createAppointmentResponse() {
		AppointmentResponseImpl appointmentResponse = new AppointmentResponseImpl();
		return appointmentResponse;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AppointmentStatus createAppointmentStatus() {
		AppointmentStatusImpl appointmentStatus = new AppointmentStatusImpl();
		return appointmentStatus;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AssertionDirectionType createAssertionDirectionType() {
		AssertionDirectionTypeImpl assertionDirectionType = new AssertionDirectionTypeImpl();
		return assertionDirectionType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AssertionOperatorType createAssertionOperatorType() {
		AssertionOperatorTypeImpl assertionOperatorType = new AssertionOperatorTypeImpl();
		return assertionOperatorType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AssertionResponseTypes createAssertionResponseTypes() {
		AssertionResponseTypesImpl assertionResponseTypes = new AssertionResponseTypesImpl();
		return assertionResponseTypes;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Attachment createAttachment() {
		AttachmentImpl attachment = new AttachmentImpl();
		return attachment;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AuditEvent createAuditEvent() {
		AuditEventImpl auditEvent = new AuditEventImpl();
		return auditEvent;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AuditEventAction createAuditEventAction() {
		AuditEventActionImpl auditEventAction = new AuditEventActionImpl();
		return auditEventAction;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AuditEventAgent createAuditEventAgent() {
		AuditEventAgentImpl auditEventAgent = new AuditEventAgentImpl();
		return auditEventAgent;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AuditEventAgentNetworkType createAuditEventAgentNetworkType() {
		AuditEventAgentNetworkTypeImpl auditEventAgentNetworkType = new AuditEventAgentNetworkTypeImpl();
		return auditEventAgentNetworkType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AuditEventDetail createAuditEventDetail() {
		AuditEventDetailImpl auditEventDetail = new AuditEventDetailImpl();
		return auditEventDetail;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AuditEventEntity createAuditEventEntity() {
		AuditEventEntityImpl auditEventEntity = new AuditEventEntityImpl();
		return auditEventEntity;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AuditEventNetwork createAuditEventNetwork() {
		AuditEventNetworkImpl auditEventNetwork = new AuditEventNetworkImpl();
		return auditEventNetwork;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AuditEventOutcome createAuditEventOutcome() {
		AuditEventOutcomeImpl auditEventOutcome = new AuditEventOutcomeImpl();
		return auditEventOutcome;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AuditEventSource createAuditEventSource() {
		AuditEventSourceImpl auditEventSource = new AuditEventSourceImpl();
		return auditEventSource;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public BackboneElement createBackboneElement() {
		BackboneElementImpl backboneElement = new BackboneElementImpl();
		return backboneElement;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Base64Binary createBase64Binary() {
		Base64BinaryImpl base64Binary = new Base64BinaryImpl();
		return base64Binary;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Basic createBasic() {
		BasicImpl basic = new BasicImpl();
		return basic;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Binary createBinary() {
		BinaryImpl binary = new BinaryImpl();
		return binary;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public BindingStrength createBindingStrength() {
		BindingStrengthImpl bindingStrength = new BindingStrengthImpl();
		return bindingStrength;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public BodySite createBodySite() {
		BodySiteImpl bodySite = new BodySiteImpl();
		return bodySite;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public org.hl7.fhir.Boolean createBoolean() {
		BooleanImpl boolean_ = new BooleanImpl();
		return boolean_;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Bundle createBundle() {
		BundleImpl bundle = new BundleImpl();
		return bundle;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public BundleEntry createBundleEntry() {
		BundleEntryImpl bundleEntry = new BundleEntryImpl();
		return bundleEntry;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public BundleLink createBundleLink() {
		BundleLinkImpl bundleLink = new BundleLinkImpl();
		return bundleLink;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public BundleRequest createBundleRequest() {
		BundleRequestImpl bundleRequest = new BundleRequestImpl();
		return bundleRequest;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public BundleResponse createBundleResponse() {
		BundleResponseImpl bundleResponse = new BundleResponseImpl();
		return bundleResponse;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public BundleSearch createBundleSearch() {
		BundleSearchImpl bundleSearch = new BundleSearchImpl();
		return bundleSearch;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public BundleType createBundleType() {
		BundleTypeImpl bundleType = new BundleTypeImpl();
		return bundleType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CapabilityStatement createCapabilityStatement() {
		CapabilityStatementImpl capabilityStatement = new CapabilityStatementImpl();
		return capabilityStatement;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CapabilityStatementCertificate createCapabilityStatementCertificate() {
		CapabilityStatementCertificateImpl capabilityStatementCertificate = new CapabilityStatementCertificateImpl();
		return capabilityStatementCertificate;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CapabilityStatementDocument createCapabilityStatementDocument() {
		CapabilityStatementDocumentImpl capabilityStatementDocument = new CapabilityStatementDocumentImpl();
		return capabilityStatementDocument;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CapabilityStatementEndpoint createCapabilityStatementEndpoint() {
		CapabilityStatementEndpointImpl capabilityStatementEndpoint = new CapabilityStatementEndpointImpl();
		return capabilityStatementEndpoint;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CapabilityStatementEvent createCapabilityStatementEvent() {
		CapabilityStatementEventImpl capabilityStatementEvent = new CapabilityStatementEventImpl();
		return capabilityStatementEvent;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CapabilityStatementImplementation createCapabilityStatementImplementation() {
		CapabilityStatementImplementationImpl capabilityStatementImplementation = new CapabilityStatementImplementationImpl();
		return capabilityStatementImplementation;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CapabilityStatementInteraction createCapabilityStatementInteraction() {
		CapabilityStatementInteractionImpl capabilityStatementInteraction = new CapabilityStatementInteractionImpl();
		return capabilityStatementInteraction;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CapabilityStatementInteraction1 createCapabilityStatementInteraction1() {
		CapabilityStatementInteraction1Impl capabilityStatementInteraction1 = new CapabilityStatementInteraction1Impl();
		return capabilityStatementInteraction1;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CapabilityStatementKind createCapabilityStatementKind() {
		CapabilityStatementKindImpl capabilityStatementKind = new CapabilityStatementKindImpl();
		return capabilityStatementKind;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CapabilityStatementMessaging createCapabilityStatementMessaging() {
		CapabilityStatementMessagingImpl capabilityStatementMessaging = new CapabilityStatementMessagingImpl();
		return capabilityStatementMessaging;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CapabilityStatementOperation createCapabilityStatementOperation() {
		CapabilityStatementOperationImpl capabilityStatementOperation = new CapabilityStatementOperationImpl();
		return capabilityStatementOperation;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CapabilityStatementResource createCapabilityStatementResource() {
		CapabilityStatementResourceImpl capabilityStatementResource = new CapabilityStatementResourceImpl();
		return capabilityStatementResource;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CapabilityStatementRest createCapabilityStatementRest() {
		CapabilityStatementRestImpl capabilityStatementRest = new CapabilityStatementRestImpl();
		return capabilityStatementRest;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CapabilityStatementSearchParam createCapabilityStatementSearchParam() {
		CapabilityStatementSearchParamImpl capabilityStatementSearchParam = new CapabilityStatementSearchParamImpl();
		return capabilityStatementSearchParam;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CapabilityStatementSecurity createCapabilityStatementSecurity() {
		CapabilityStatementSecurityImpl capabilityStatementSecurity = new CapabilityStatementSecurityImpl();
		return capabilityStatementSecurity;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CapabilityStatementSoftware createCapabilityStatementSoftware() {
		CapabilityStatementSoftwareImpl capabilityStatementSoftware = new CapabilityStatementSoftwareImpl();
		return capabilityStatementSoftware;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CapabilityStatementSupportedMessage createCapabilityStatementSupportedMessage() {
		CapabilityStatementSupportedMessageImpl capabilityStatementSupportedMessage = new CapabilityStatementSupportedMessageImpl();
		return capabilityStatementSupportedMessage;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CarePlan createCarePlan() {
		CarePlanImpl carePlan = new CarePlanImpl();
		return carePlan;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CarePlanActivity createCarePlanActivity() {
		CarePlanActivityImpl carePlanActivity = new CarePlanActivityImpl();
		return carePlanActivity;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CarePlanActivityStatus createCarePlanActivityStatus() {
		CarePlanActivityStatusImpl carePlanActivityStatus = new CarePlanActivityStatusImpl();
		return carePlanActivityStatus;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CarePlanDetail createCarePlanDetail() {
		CarePlanDetailImpl carePlanDetail = new CarePlanDetailImpl();
		return carePlanDetail;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CarePlanIntent createCarePlanIntent() {
		CarePlanIntentImpl carePlanIntent = new CarePlanIntentImpl();
		return carePlanIntent;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CarePlanStatus createCarePlanStatus() {
		CarePlanStatusImpl carePlanStatus = new CarePlanStatusImpl();
		return carePlanStatus;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CareTeam createCareTeam() {
		CareTeamImpl careTeam = new CareTeamImpl();
		return careTeam;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CareTeamParticipant createCareTeamParticipant() {
		CareTeamParticipantImpl careTeamParticipant = new CareTeamParticipantImpl();
		return careTeamParticipant;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CareTeamStatus createCareTeamStatus() {
		CareTeamStatusImpl careTeamStatus = new CareTeamStatusImpl();
		return careTeamStatus;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ChargeItem createChargeItem() {
		ChargeItemImpl chargeItem = new ChargeItemImpl();
		return chargeItem;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ChargeItemParticipant createChargeItemParticipant() {
		ChargeItemParticipantImpl chargeItemParticipant = new ChargeItemParticipantImpl();
		return chargeItemParticipant;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ChargeItemStatus createChargeItemStatus() {
		ChargeItemStatusImpl chargeItemStatus = new ChargeItemStatusImpl();
		return chargeItemStatus;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Claim createClaim() {
		ClaimImpl claim = new ClaimImpl();
		return claim;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ClaimAccident createClaimAccident() {
		ClaimAccidentImpl claimAccident = new ClaimAccidentImpl();
		return claimAccident;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ClaimCareTeam createClaimCareTeam() {
		ClaimCareTeamImpl claimCareTeam = new ClaimCareTeamImpl();
		return claimCareTeam;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ClaimDetail createClaimDetail() {
		ClaimDetailImpl claimDetail = new ClaimDetailImpl();
		return claimDetail;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ClaimDiagnosis createClaimDiagnosis() {
		ClaimDiagnosisImpl claimDiagnosis = new ClaimDiagnosisImpl();
		return claimDiagnosis;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ClaimInformation createClaimInformation() {
		ClaimInformationImpl claimInformation = new ClaimInformationImpl();
		return claimInformation;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ClaimInsurance createClaimInsurance() {
		ClaimInsuranceImpl claimInsurance = new ClaimInsuranceImpl();
		return claimInsurance;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ClaimItem createClaimItem() {
		ClaimItemImpl claimItem = new ClaimItemImpl();
		return claimItem;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ClaimPayee createClaimPayee() {
		ClaimPayeeImpl claimPayee = new ClaimPayeeImpl();
		return claimPayee;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ClaimProcedure createClaimProcedure() {
		ClaimProcedureImpl claimProcedure = new ClaimProcedureImpl();
		return claimProcedure;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ClaimRelated createClaimRelated() {
		ClaimRelatedImpl claimRelated = new ClaimRelatedImpl();
		return claimRelated;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ClaimResponse createClaimResponse() {
		ClaimResponseImpl claimResponse = new ClaimResponseImpl();
		return claimResponse;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ClaimResponseAddItem createClaimResponseAddItem() {
		ClaimResponseAddItemImpl claimResponseAddItem = new ClaimResponseAddItemImpl();
		return claimResponseAddItem;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ClaimResponseAdjudication createClaimResponseAdjudication() {
		ClaimResponseAdjudicationImpl claimResponseAdjudication = new ClaimResponseAdjudicationImpl();
		return claimResponseAdjudication;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ClaimResponseDetail createClaimResponseDetail() {
		ClaimResponseDetailImpl claimResponseDetail = new ClaimResponseDetailImpl();
		return claimResponseDetail;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ClaimResponseDetail1 createClaimResponseDetail1() {
		ClaimResponseDetail1Impl claimResponseDetail1 = new ClaimResponseDetail1Impl();
		return claimResponseDetail1;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ClaimResponseError createClaimResponseError() {
		ClaimResponseErrorImpl claimResponseError = new ClaimResponseErrorImpl();
		return claimResponseError;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ClaimResponseInsurance createClaimResponseInsurance() {
		ClaimResponseInsuranceImpl claimResponseInsurance = new ClaimResponseInsuranceImpl();
		return claimResponseInsurance;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ClaimResponseItem createClaimResponseItem() {
		ClaimResponseItemImpl claimResponseItem = new ClaimResponseItemImpl();
		return claimResponseItem;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ClaimResponsePayment createClaimResponsePayment() {
		ClaimResponsePaymentImpl claimResponsePayment = new ClaimResponsePaymentImpl();
		return claimResponsePayment;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ClaimResponseProcessNote createClaimResponseProcessNote() {
		ClaimResponseProcessNoteImpl claimResponseProcessNote = new ClaimResponseProcessNoteImpl();
		return claimResponseProcessNote;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ClaimResponseSubDetail createClaimResponseSubDetail() {
		ClaimResponseSubDetailImpl claimResponseSubDetail = new ClaimResponseSubDetailImpl();
		return claimResponseSubDetail;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ClaimSubDetail createClaimSubDetail() {
		ClaimSubDetailImpl claimSubDetail = new ClaimSubDetailImpl();
		return claimSubDetail;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ClinicalImpression createClinicalImpression() {
		ClinicalImpressionImpl clinicalImpression = new ClinicalImpressionImpl();
		return clinicalImpression;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ClinicalImpressionFinding createClinicalImpressionFinding() {
		ClinicalImpressionFindingImpl clinicalImpressionFinding = new ClinicalImpressionFindingImpl();
		return clinicalImpressionFinding;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ClinicalImpressionInvestigation createClinicalImpressionInvestigation() {
		ClinicalImpressionInvestigationImpl clinicalImpressionInvestigation = new ClinicalImpressionInvestigationImpl();
		return clinicalImpressionInvestigation;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ClinicalImpressionStatus createClinicalImpressionStatus() {
		ClinicalImpressionStatusImpl clinicalImpressionStatus = new ClinicalImpressionStatusImpl();
		return clinicalImpressionStatus;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Code createCode() {
		CodeImpl code = new CodeImpl();
		return code;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CodeableConcept createCodeableConcept() {
		CodeableConceptImpl codeableConcept = new CodeableConceptImpl();
		return codeableConcept;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CodeSystem createCodeSystem() {
		CodeSystemImpl codeSystem = new CodeSystemImpl();
		return codeSystem;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CodeSystemConcept createCodeSystemConcept() {
		CodeSystemConceptImpl codeSystemConcept = new CodeSystemConceptImpl();
		return codeSystemConcept;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CodeSystemContentMode createCodeSystemContentMode() {
		CodeSystemContentModeImpl codeSystemContentMode = new CodeSystemContentModeImpl();
		return codeSystemContentMode;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CodeSystemDesignation createCodeSystemDesignation() {
		CodeSystemDesignationImpl codeSystemDesignation = new CodeSystemDesignationImpl();
		return codeSystemDesignation;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CodeSystemFilter createCodeSystemFilter() {
		CodeSystemFilterImpl codeSystemFilter = new CodeSystemFilterImpl();
		return codeSystemFilter;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CodeSystemHierarchyMeaning createCodeSystemHierarchyMeaning() {
		CodeSystemHierarchyMeaningImpl codeSystemHierarchyMeaning = new CodeSystemHierarchyMeaningImpl();
		return codeSystemHierarchyMeaning;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CodeSystemProperty createCodeSystemProperty() {
		CodeSystemPropertyImpl codeSystemProperty = new CodeSystemPropertyImpl();
		return codeSystemProperty;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CodeSystemProperty1 createCodeSystemProperty1() {
		CodeSystemProperty1Impl codeSystemProperty1 = new CodeSystemProperty1Impl();
		return codeSystemProperty1;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Coding createCoding() {
		CodingImpl coding = new CodingImpl();
		return coding;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Communication createCommunication() {
		CommunicationImpl communication = new CommunicationImpl();
		return communication;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CommunicationPayload createCommunicationPayload() {
		CommunicationPayloadImpl communicationPayload = new CommunicationPayloadImpl();
		return communicationPayload;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CommunicationRequest createCommunicationRequest() {
		CommunicationRequestImpl communicationRequest = new CommunicationRequestImpl();
		return communicationRequest;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CommunicationRequestPayload createCommunicationRequestPayload() {
		CommunicationRequestPayloadImpl communicationRequestPayload = new CommunicationRequestPayloadImpl();
		return communicationRequestPayload;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CommunicationRequestRequester createCommunicationRequestRequester() {
		CommunicationRequestRequesterImpl communicationRequestRequester = new CommunicationRequestRequesterImpl();
		return communicationRequestRequester;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CompartmentDefinition createCompartmentDefinition() {
		CompartmentDefinitionImpl compartmentDefinition = new CompartmentDefinitionImpl();
		return compartmentDefinition;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CompartmentDefinitionResource createCompartmentDefinitionResource() {
		CompartmentDefinitionResourceImpl compartmentDefinitionResource = new CompartmentDefinitionResourceImpl();
		return compartmentDefinitionResource;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CompartmentType createCompartmentType() {
		CompartmentTypeImpl compartmentType = new CompartmentTypeImpl();
		return compartmentType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Composition createComposition() {
		CompositionImpl composition = new CompositionImpl();
		return composition;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CompositionAttestationMode createCompositionAttestationMode() {
		CompositionAttestationModeImpl compositionAttestationMode = new CompositionAttestationModeImpl();
		return compositionAttestationMode;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CompositionAttester createCompositionAttester() {
		CompositionAttesterImpl compositionAttester = new CompositionAttesterImpl();
		return compositionAttester;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CompositionEvent createCompositionEvent() {
		CompositionEventImpl compositionEvent = new CompositionEventImpl();
		return compositionEvent;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CompositionRelatesTo createCompositionRelatesTo() {
		CompositionRelatesToImpl compositionRelatesTo = new CompositionRelatesToImpl();
		return compositionRelatesTo;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CompositionSection createCompositionSection() {
		CompositionSectionImpl compositionSection = new CompositionSectionImpl();
		return compositionSection;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CompositionStatus createCompositionStatus() {
		CompositionStatusImpl compositionStatus = new CompositionStatusImpl();
		return compositionStatus;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ConceptMap createConceptMap() {
		ConceptMapImpl conceptMap = new ConceptMapImpl();
		return conceptMap;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ConceptMapDependsOn createConceptMapDependsOn() {
		ConceptMapDependsOnImpl conceptMapDependsOn = new ConceptMapDependsOnImpl();
		return conceptMapDependsOn;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ConceptMapElement createConceptMapElement() {
		ConceptMapElementImpl conceptMapElement = new ConceptMapElementImpl();
		return conceptMapElement;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ConceptMapEquivalence createConceptMapEquivalence() {
		ConceptMapEquivalenceImpl conceptMapEquivalence = new ConceptMapEquivalenceImpl();
		return conceptMapEquivalence;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ConceptMapGroup createConceptMapGroup() {
		ConceptMapGroupImpl conceptMapGroup = new ConceptMapGroupImpl();
		return conceptMapGroup;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ConceptMapGroupUnmappedMode createConceptMapGroupUnmappedMode() {
		ConceptMapGroupUnmappedModeImpl conceptMapGroupUnmappedMode = new ConceptMapGroupUnmappedModeImpl();
		return conceptMapGroupUnmappedMode;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ConceptMapTarget createConceptMapTarget() {
		ConceptMapTargetImpl conceptMapTarget = new ConceptMapTargetImpl();
		return conceptMapTarget;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ConceptMapUnmapped createConceptMapUnmapped() {
		ConceptMapUnmappedImpl conceptMapUnmapped = new ConceptMapUnmappedImpl();
		return conceptMapUnmapped;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Condition createCondition() {
		ConditionImpl condition = new ConditionImpl();
		return condition;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ConditionalDeleteStatus createConditionalDeleteStatus() {
		ConditionalDeleteStatusImpl conditionalDeleteStatus = new ConditionalDeleteStatusImpl();
		return conditionalDeleteStatus;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ConditionalReadStatus createConditionalReadStatus() {
		ConditionalReadStatusImpl conditionalReadStatus = new ConditionalReadStatusImpl();
		return conditionalReadStatus;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ConditionClinicalStatusCodes createConditionClinicalStatusCodes() {
		ConditionClinicalStatusCodesImpl conditionClinicalStatusCodes = new ConditionClinicalStatusCodesImpl();
		return conditionClinicalStatusCodes;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ConditionEvidence createConditionEvidence() {
		ConditionEvidenceImpl conditionEvidence = new ConditionEvidenceImpl();
		return conditionEvidence;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ConditionStage createConditionStage() {
		ConditionStageImpl conditionStage = new ConditionStageImpl();
		return conditionStage;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ConditionVerificationStatus createConditionVerificationStatus() {
		ConditionVerificationStatusImpl conditionVerificationStatus = new ConditionVerificationStatusImpl();
		return conditionVerificationStatus;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ConfidentialityClassification createConfidentialityClassification() {
		ConfidentialityClassificationImpl confidentialityClassification = new ConfidentialityClassificationImpl();
		return confidentialityClassification;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Consent createConsent() {
		ConsentImpl consent = new ConsentImpl();
		return consent;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ConsentActor createConsentActor() {
		ConsentActorImpl consentActor = new ConsentActorImpl();
		return consentActor;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ConsentActor1 createConsentActor1() {
		ConsentActor1Impl consentActor1 = new ConsentActor1Impl();
		return consentActor1;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ConsentData createConsentData() {
		ConsentDataImpl consentData = new ConsentDataImpl();
		return consentData;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ConsentData1 createConsentData1() {
		ConsentData1Impl consentData1 = new ConsentData1Impl();
		return consentData1;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ConsentDataMeaning createConsentDataMeaning() {
		ConsentDataMeaningImpl consentDataMeaning = new ConsentDataMeaningImpl();
		return consentDataMeaning;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ConsentExcept createConsentExcept() {
		ConsentExceptImpl consentExcept = new ConsentExceptImpl();
		return consentExcept;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ConsentExceptType createConsentExceptType() {
		ConsentExceptTypeImpl consentExceptType = new ConsentExceptTypeImpl();
		return consentExceptType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ConsentPolicy createConsentPolicy() {
		ConsentPolicyImpl consentPolicy = new ConsentPolicyImpl();
		return consentPolicy;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ConsentState createConsentState() {
		ConsentStateImpl consentState = new ConsentStateImpl();
		return consentState;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ConstraintSeverity createConstraintSeverity() {
		ConstraintSeverityImpl constraintSeverity = new ConstraintSeverityImpl();
		return constraintSeverity;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ContactDetail createContactDetail() {
		ContactDetailImpl contactDetail = new ContactDetailImpl();
		return contactDetail;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ContactPoint createContactPoint() {
		ContactPointImpl contactPoint = new ContactPointImpl();
		return contactPoint;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ContactPointSystem createContactPointSystem() {
		ContactPointSystemImpl contactPointSystem = new ContactPointSystemImpl();
		return contactPointSystem;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ContactPointUse createContactPointUse() {
		ContactPointUseImpl contactPointUse = new ContactPointUseImpl();
		return contactPointUse;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ContentType createContentType() {
		ContentTypeImpl contentType = new ContentTypeImpl();
		return contentType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Contract createContract() {
		ContractImpl contract = new ContractImpl();
		return contract;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ContractAgent createContractAgent() {
		ContractAgentImpl contractAgent = new ContractAgentImpl();
		return contractAgent;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ContractAgent1 createContractAgent1() {
		ContractAgent1Impl contractAgent1 = new ContractAgent1Impl();
		return contractAgent1;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ContractFriendly createContractFriendly() {
		ContractFriendlyImpl contractFriendly = new ContractFriendlyImpl();
		return contractFriendly;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ContractLegal createContractLegal() {
		ContractLegalImpl contractLegal = new ContractLegalImpl();
		return contractLegal;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ContractResourceStatusCodes createContractResourceStatusCodes() {
		ContractResourceStatusCodesImpl contractResourceStatusCodes = new ContractResourceStatusCodesImpl();
		return contractResourceStatusCodes;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ContractRule createContractRule() {
		ContractRuleImpl contractRule = new ContractRuleImpl();
		return contractRule;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ContractSigner createContractSigner() {
		ContractSignerImpl contractSigner = new ContractSignerImpl();
		return contractSigner;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ContractTerm createContractTerm() {
		ContractTermImpl contractTerm = new ContractTermImpl();
		return contractTerm;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ContractValuedItem createContractValuedItem() {
		ContractValuedItemImpl contractValuedItem = new ContractValuedItemImpl();
		return contractValuedItem;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ContractValuedItem1 createContractValuedItem1() {
		ContractValuedItem1Impl contractValuedItem1 = new ContractValuedItem1Impl();
		return contractValuedItem1;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Contributor createContributor() {
		ContributorImpl contributor = new ContributorImpl();
		return contributor;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ContributorType createContributorType() {
		ContributorTypeImpl contributorType = new ContributorTypeImpl();
		return contributorType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Count createCount() {
		CountImpl count = new CountImpl();
		return count;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Coverage createCoverage() {
		CoverageImpl coverage = new CoverageImpl();
		return coverage;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CoverageGrouping createCoverageGrouping() {
		CoverageGroupingImpl coverageGrouping = new CoverageGroupingImpl();
		return coverageGrouping;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DataElement createDataElement() {
		DataElementImpl dataElement = new DataElementImpl();
		return dataElement;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DataElementMapping createDataElementMapping() {
		DataElementMappingImpl dataElementMapping = new DataElementMappingImpl();
		return dataElementMapping;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DataElementStringency createDataElementStringency() {
		DataElementStringencyImpl dataElementStringency = new DataElementStringencyImpl();
		return dataElementStringency;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DataRequirement createDataRequirement() {
		DataRequirementImpl dataRequirement = new DataRequirementImpl();
		return dataRequirement;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DataRequirementCodeFilter createDataRequirementCodeFilter() {
		DataRequirementCodeFilterImpl dataRequirementCodeFilter = new DataRequirementCodeFilterImpl();
		return dataRequirementCodeFilter;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DataRequirementDateFilter createDataRequirementDateFilter() {
		DataRequirementDateFilterImpl dataRequirementDateFilter = new DataRequirementDateFilterImpl();
		return dataRequirementDateFilter;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Date createDate() {
		DateImpl date = new DateImpl();
		return date;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DateTime createDateTime() {
		DateTimeImpl dateTime = new DateTimeImpl();
		return dateTime;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DaysOfWeek createDaysOfWeek() {
		DaysOfWeekImpl daysOfWeek = new DaysOfWeekImpl();
		return daysOfWeek;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Decimal createDecimal() {
		DecimalImpl decimal = new DecimalImpl();
		return decimal;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DetectedIssue createDetectedIssue() {
		DetectedIssueImpl detectedIssue = new DetectedIssueImpl();
		return detectedIssue;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DetectedIssueMitigation createDetectedIssueMitigation() {
		DetectedIssueMitigationImpl detectedIssueMitigation = new DetectedIssueMitigationImpl();
		return detectedIssueMitigation;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DetectedIssueSeverity createDetectedIssueSeverity() {
		DetectedIssueSeverityImpl detectedIssueSeverity = new DetectedIssueSeverityImpl();
		return detectedIssueSeverity;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Device createDevice() {
		DeviceImpl device = new DeviceImpl();
		return device;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DeviceComponent createDeviceComponent() {
		DeviceComponentImpl deviceComponent = new DeviceComponentImpl();
		return deviceComponent;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DeviceComponentProductionSpecification createDeviceComponentProductionSpecification() {
		DeviceComponentProductionSpecificationImpl deviceComponentProductionSpecification = new DeviceComponentProductionSpecificationImpl();
		return deviceComponentProductionSpecification;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DeviceMetric createDeviceMetric() {
		DeviceMetricImpl deviceMetric = new DeviceMetricImpl();
		return deviceMetric;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DeviceMetricCalibration createDeviceMetricCalibration() {
		DeviceMetricCalibrationImpl deviceMetricCalibration = new DeviceMetricCalibrationImpl();
		return deviceMetricCalibration;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DeviceMetricCalibrationState createDeviceMetricCalibrationState() {
		DeviceMetricCalibrationStateImpl deviceMetricCalibrationState = new DeviceMetricCalibrationStateImpl();
		return deviceMetricCalibrationState;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DeviceMetricCalibrationType createDeviceMetricCalibrationType() {
		DeviceMetricCalibrationTypeImpl deviceMetricCalibrationType = new DeviceMetricCalibrationTypeImpl();
		return deviceMetricCalibrationType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DeviceMetricCategory createDeviceMetricCategory() {
		DeviceMetricCategoryImpl deviceMetricCategory = new DeviceMetricCategoryImpl();
		return deviceMetricCategory;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DeviceMetricColor createDeviceMetricColor() {
		DeviceMetricColorImpl deviceMetricColor = new DeviceMetricColorImpl();
		return deviceMetricColor;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DeviceMetricOperationalStatus createDeviceMetricOperationalStatus() {
		DeviceMetricOperationalStatusImpl deviceMetricOperationalStatus = new DeviceMetricOperationalStatusImpl();
		return deviceMetricOperationalStatus;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DeviceRequest createDeviceRequest() {
		DeviceRequestImpl deviceRequest = new DeviceRequestImpl();
		return deviceRequest;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DeviceRequestRequester createDeviceRequestRequester() {
		DeviceRequestRequesterImpl deviceRequestRequester = new DeviceRequestRequesterImpl();
		return deviceRequestRequester;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DeviceUdi createDeviceUdi() {
		DeviceUdiImpl deviceUdi = new DeviceUdiImpl();
		return deviceUdi;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DeviceUseStatement createDeviceUseStatement() {
		DeviceUseStatementImpl deviceUseStatement = new DeviceUseStatementImpl();
		return deviceUseStatement;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DeviceUseStatementStatus createDeviceUseStatementStatus() {
		DeviceUseStatementStatusImpl deviceUseStatementStatus = new DeviceUseStatementStatusImpl();
		return deviceUseStatementStatus;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DiagnosticReport createDiagnosticReport() {
		DiagnosticReportImpl diagnosticReport = new DiagnosticReportImpl();
		return diagnosticReport;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DiagnosticReportImage createDiagnosticReportImage() {
		DiagnosticReportImageImpl diagnosticReportImage = new DiagnosticReportImageImpl();
		return diagnosticReportImage;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DiagnosticReportPerformer createDiagnosticReportPerformer() {
		DiagnosticReportPerformerImpl diagnosticReportPerformer = new DiagnosticReportPerformerImpl();
		return diagnosticReportPerformer;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DiagnosticReportStatus createDiagnosticReportStatus() {
		DiagnosticReportStatusImpl diagnosticReportStatus = new DiagnosticReportStatusImpl();
		return diagnosticReportStatus;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DigitalMediaType createDigitalMediaType() {
		DigitalMediaTypeImpl digitalMediaType = new DigitalMediaTypeImpl();
		return digitalMediaType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DiscriminatorType createDiscriminatorType() {
		DiscriminatorTypeImpl discriminatorType = new DiscriminatorTypeImpl();
		return discriminatorType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Distance createDistance() {
		DistanceImpl distance = new DistanceImpl();
		return distance;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DocumentManifest createDocumentManifest() {
		DocumentManifestImpl documentManifest = new DocumentManifestImpl();
		return documentManifest;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DocumentManifestContent createDocumentManifestContent() {
		DocumentManifestContentImpl documentManifestContent = new DocumentManifestContentImpl();
		return documentManifestContent;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DocumentManifestRelated createDocumentManifestRelated() {
		DocumentManifestRelatedImpl documentManifestRelated = new DocumentManifestRelatedImpl();
		return documentManifestRelated;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DocumentMode createDocumentMode() {
		DocumentModeImpl documentMode = new DocumentModeImpl();
		return documentMode;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DocumentReference createDocumentReference() {
		DocumentReferenceImpl documentReference = new DocumentReferenceImpl();
		return documentReference;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DocumentReferenceContent createDocumentReferenceContent() {
		DocumentReferenceContentImpl documentReferenceContent = new DocumentReferenceContentImpl();
		return documentReferenceContent;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DocumentReferenceContext createDocumentReferenceContext() {
		DocumentReferenceContextImpl documentReferenceContext = new DocumentReferenceContextImpl();
		return documentReferenceContext;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DocumentReferenceRelated createDocumentReferenceRelated() {
		DocumentReferenceRelatedImpl documentReferenceRelated = new DocumentReferenceRelatedImpl();
		return documentReferenceRelated;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DocumentReferenceRelatesTo createDocumentReferenceRelatesTo() {
		DocumentReferenceRelatesToImpl documentReferenceRelatesTo = new DocumentReferenceRelatesToImpl();
		return documentReferenceRelatesTo;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DocumentReferenceStatus createDocumentReferenceStatus() {
		DocumentReferenceStatusImpl documentReferenceStatus = new DocumentReferenceStatusImpl();
		return documentReferenceStatus;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DocumentRelationshipType createDocumentRelationshipType() {
		DocumentRelationshipTypeImpl documentRelationshipType = new DocumentRelationshipTypeImpl();
		return documentRelationshipType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DocumentRoot createDocumentRoot() {
		DocumentRootImpl documentRoot = new DocumentRootImpl();
		return documentRoot;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DomainResource createDomainResource() {
		DomainResourceImpl domainResource = new DomainResourceImpl();
		return domainResource;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Dosage createDosage() {
		DosageImpl dosage = new DosageImpl();
		return dosage;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Duration createDuration() {
		DurationImpl duration = new DurationImpl();
		return duration;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Element createElement() {
		ElementImpl element = new ElementImpl();
		return element;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ElementDefinition createElementDefinition() {
		ElementDefinitionImpl elementDefinition = new ElementDefinitionImpl();
		return elementDefinition;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ElementDefinitionBase createElementDefinitionBase() {
		ElementDefinitionBaseImpl elementDefinitionBase = new ElementDefinitionBaseImpl();
		return elementDefinitionBase;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ElementDefinitionBinding createElementDefinitionBinding() {
		ElementDefinitionBindingImpl elementDefinitionBinding = new ElementDefinitionBindingImpl();
		return elementDefinitionBinding;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ElementDefinitionConstraint createElementDefinitionConstraint() {
		ElementDefinitionConstraintImpl elementDefinitionConstraint = new ElementDefinitionConstraintImpl();
		return elementDefinitionConstraint;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ElementDefinitionDiscriminator createElementDefinitionDiscriminator() {
		ElementDefinitionDiscriminatorImpl elementDefinitionDiscriminator = new ElementDefinitionDiscriminatorImpl();
		return elementDefinitionDiscriminator;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ElementDefinitionExample createElementDefinitionExample() {
		ElementDefinitionExampleImpl elementDefinitionExample = new ElementDefinitionExampleImpl();
		return elementDefinitionExample;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ElementDefinitionMapping createElementDefinitionMapping() {
		ElementDefinitionMappingImpl elementDefinitionMapping = new ElementDefinitionMappingImpl();
		return elementDefinitionMapping;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ElementDefinitionSlicing createElementDefinitionSlicing() {
		ElementDefinitionSlicingImpl elementDefinitionSlicing = new ElementDefinitionSlicingImpl();
		return elementDefinitionSlicing;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ElementDefinitionType createElementDefinitionType() {
		ElementDefinitionTypeImpl elementDefinitionType = new ElementDefinitionTypeImpl();
		return elementDefinitionType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EligibilityRequest createEligibilityRequest() {
		EligibilityRequestImpl eligibilityRequest = new EligibilityRequestImpl();
		return eligibilityRequest;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EligibilityResponse createEligibilityResponse() {
		EligibilityResponseImpl eligibilityResponse = new EligibilityResponseImpl();
		return eligibilityResponse;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EligibilityResponseBenefitBalance createEligibilityResponseBenefitBalance() {
		EligibilityResponseBenefitBalanceImpl eligibilityResponseBenefitBalance = new EligibilityResponseBenefitBalanceImpl();
		return eligibilityResponseBenefitBalance;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EligibilityResponseError createEligibilityResponseError() {
		EligibilityResponseErrorImpl eligibilityResponseError = new EligibilityResponseErrorImpl();
		return eligibilityResponseError;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EligibilityResponseFinancial createEligibilityResponseFinancial() {
		EligibilityResponseFinancialImpl eligibilityResponseFinancial = new EligibilityResponseFinancialImpl();
		return eligibilityResponseFinancial;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EligibilityResponseInsurance createEligibilityResponseInsurance() {
		EligibilityResponseInsuranceImpl eligibilityResponseInsurance = new EligibilityResponseInsuranceImpl();
		return eligibilityResponseInsurance;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Encounter createEncounter() {
		EncounterImpl encounter = new EncounterImpl();
		return encounter;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EncounterClassHistory createEncounterClassHistory() {
		EncounterClassHistoryImpl encounterClassHistory = new EncounterClassHistoryImpl();
		return encounterClassHistory;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EncounterDiagnosis createEncounterDiagnosis() {
		EncounterDiagnosisImpl encounterDiagnosis = new EncounterDiagnosisImpl();
		return encounterDiagnosis;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EncounterHospitalization createEncounterHospitalization() {
		EncounterHospitalizationImpl encounterHospitalization = new EncounterHospitalizationImpl();
		return encounterHospitalization;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EncounterLocation createEncounterLocation() {
		EncounterLocationImpl encounterLocation = new EncounterLocationImpl();
		return encounterLocation;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EncounterLocationStatus createEncounterLocationStatus() {
		EncounterLocationStatusImpl encounterLocationStatus = new EncounterLocationStatusImpl();
		return encounterLocationStatus;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EncounterParticipant createEncounterParticipant() {
		EncounterParticipantImpl encounterParticipant = new EncounterParticipantImpl();
		return encounterParticipant;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EncounterStatus createEncounterStatus() {
		EncounterStatusImpl encounterStatus = new EncounterStatusImpl();
		return encounterStatus;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EncounterStatusHistory createEncounterStatusHistory() {
		EncounterStatusHistoryImpl encounterStatusHistory = new EncounterStatusHistoryImpl();
		return encounterStatusHistory;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Endpoint createEndpoint() {
		EndpointImpl endpoint = new EndpointImpl();
		return endpoint;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EndpointStatus createEndpointStatus() {
		EndpointStatusImpl endpointStatus = new EndpointStatusImpl();
		return endpointStatus;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EnrollmentRequest createEnrollmentRequest() {
		EnrollmentRequestImpl enrollmentRequest = new EnrollmentRequestImpl();
		return enrollmentRequest;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EnrollmentResponse createEnrollmentResponse() {
		EnrollmentResponseImpl enrollmentResponse = new EnrollmentResponseImpl();
		return enrollmentResponse;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EpisodeOfCare createEpisodeOfCare() {
		EpisodeOfCareImpl episodeOfCare = new EpisodeOfCareImpl();
		return episodeOfCare;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EpisodeOfCareDiagnosis createEpisodeOfCareDiagnosis() {
		EpisodeOfCareDiagnosisImpl episodeOfCareDiagnosis = new EpisodeOfCareDiagnosisImpl();
		return episodeOfCareDiagnosis;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EpisodeOfCareStatus createEpisodeOfCareStatus() {
		EpisodeOfCareStatusImpl episodeOfCareStatus = new EpisodeOfCareStatusImpl();
		return episodeOfCareStatus;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EpisodeOfCareStatusHistory createEpisodeOfCareStatusHistory() {
		EpisodeOfCareStatusHistoryImpl episodeOfCareStatusHistory = new EpisodeOfCareStatusHistoryImpl();
		return episodeOfCareStatusHistory;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EventCapabilityMode createEventCapabilityMode() {
		EventCapabilityModeImpl eventCapabilityMode = new EventCapabilityModeImpl();
		return eventCapabilityMode;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EventStatus createEventStatus() {
		EventStatusImpl eventStatus = new EventStatusImpl();
		return eventStatus;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EventTiming createEventTiming() {
		EventTimingImpl eventTiming = new EventTimingImpl();
		return eventTiming;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ExpansionProfile createExpansionProfile() {
		ExpansionProfileImpl expansionProfile = new ExpansionProfileImpl();
		return expansionProfile;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ExpansionProfileDesignation createExpansionProfileDesignation() {
		ExpansionProfileDesignationImpl expansionProfileDesignation = new ExpansionProfileDesignationImpl();
		return expansionProfileDesignation;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ExpansionProfileDesignation1 createExpansionProfileDesignation1() {
		ExpansionProfileDesignation1Impl expansionProfileDesignation1 = new ExpansionProfileDesignation1Impl();
		return expansionProfileDesignation1;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ExpansionProfileDesignation2 createExpansionProfileDesignation2() {
		ExpansionProfileDesignation2Impl expansionProfileDesignation2 = new ExpansionProfileDesignation2Impl();
		return expansionProfileDesignation2;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ExpansionProfileExclude createExpansionProfileExclude() {
		ExpansionProfileExcludeImpl expansionProfileExclude = new ExpansionProfileExcludeImpl();
		return expansionProfileExclude;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ExpansionProfileExcludedSystem createExpansionProfileExcludedSystem() {
		ExpansionProfileExcludedSystemImpl expansionProfileExcludedSystem = new ExpansionProfileExcludedSystemImpl();
		return expansionProfileExcludedSystem;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ExpansionProfileFixedVersion createExpansionProfileFixedVersion() {
		ExpansionProfileFixedVersionImpl expansionProfileFixedVersion = new ExpansionProfileFixedVersionImpl();
		return expansionProfileFixedVersion;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ExpansionProfileInclude createExpansionProfileInclude() {
		ExpansionProfileIncludeImpl expansionProfileInclude = new ExpansionProfileIncludeImpl();
		return expansionProfileInclude;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ExplanationOfBenefit createExplanationOfBenefit() {
		ExplanationOfBenefitImpl explanationOfBenefit = new ExplanationOfBenefitImpl();
		return explanationOfBenefit;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ExplanationOfBenefitAccident createExplanationOfBenefitAccident() {
		ExplanationOfBenefitAccidentImpl explanationOfBenefitAccident = new ExplanationOfBenefitAccidentImpl();
		return explanationOfBenefitAccident;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ExplanationOfBenefitAddItem createExplanationOfBenefitAddItem() {
		ExplanationOfBenefitAddItemImpl explanationOfBenefitAddItem = new ExplanationOfBenefitAddItemImpl();
		return explanationOfBenefitAddItem;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ExplanationOfBenefitAdjudication createExplanationOfBenefitAdjudication() {
		ExplanationOfBenefitAdjudicationImpl explanationOfBenefitAdjudication = new ExplanationOfBenefitAdjudicationImpl();
		return explanationOfBenefitAdjudication;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ExplanationOfBenefitBenefitBalance createExplanationOfBenefitBenefitBalance() {
		ExplanationOfBenefitBenefitBalanceImpl explanationOfBenefitBenefitBalance = new ExplanationOfBenefitBenefitBalanceImpl();
		return explanationOfBenefitBenefitBalance;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ExplanationOfBenefitCareTeam createExplanationOfBenefitCareTeam() {
		ExplanationOfBenefitCareTeamImpl explanationOfBenefitCareTeam = new ExplanationOfBenefitCareTeamImpl();
		return explanationOfBenefitCareTeam;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ExplanationOfBenefitDetail createExplanationOfBenefitDetail() {
		ExplanationOfBenefitDetailImpl explanationOfBenefitDetail = new ExplanationOfBenefitDetailImpl();
		return explanationOfBenefitDetail;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ExplanationOfBenefitDetail1 createExplanationOfBenefitDetail1() {
		ExplanationOfBenefitDetail1Impl explanationOfBenefitDetail1 = new ExplanationOfBenefitDetail1Impl();
		return explanationOfBenefitDetail1;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ExplanationOfBenefitDiagnosis createExplanationOfBenefitDiagnosis() {
		ExplanationOfBenefitDiagnosisImpl explanationOfBenefitDiagnosis = new ExplanationOfBenefitDiagnosisImpl();
		return explanationOfBenefitDiagnosis;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ExplanationOfBenefitFinancial createExplanationOfBenefitFinancial() {
		ExplanationOfBenefitFinancialImpl explanationOfBenefitFinancial = new ExplanationOfBenefitFinancialImpl();
		return explanationOfBenefitFinancial;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ExplanationOfBenefitInformation createExplanationOfBenefitInformation() {
		ExplanationOfBenefitInformationImpl explanationOfBenefitInformation = new ExplanationOfBenefitInformationImpl();
		return explanationOfBenefitInformation;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ExplanationOfBenefitInsurance createExplanationOfBenefitInsurance() {
		ExplanationOfBenefitInsuranceImpl explanationOfBenefitInsurance = new ExplanationOfBenefitInsuranceImpl();
		return explanationOfBenefitInsurance;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ExplanationOfBenefitItem createExplanationOfBenefitItem() {
		ExplanationOfBenefitItemImpl explanationOfBenefitItem = new ExplanationOfBenefitItemImpl();
		return explanationOfBenefitItem;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ExplanationOfBenefitPayee createExplanationOfBenefitPayee() {
		ExplanationOfBenefitPayeeImpl explanationOfBenefitPayee = new ExplanationOfBenefitPayeeImpl();
		return explanationOfBenefitPayee;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ExplanationOfBenefitPayment createExplanationOfBenefitPayment() {
		ExplanationOfBenefitPaymentImpl explanationOfBenefitPayment = new ExplanationOfBenefitPaymentImpl();
		return explanationOfBenefitPayment;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ExplanationOfBenefitProcedure createExplanationOfBenefitProcedure() {
		ExplanationOfBenefitProcedureImpl explanationOfBenefitProcedure = new ExplanationOfBenefitProcedureImpl();
		return explanationOfBenefitProcedure;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ExplanationOfBenefitProcessNote createExplanationOfBenefitProcessNote() {
		ExplanationOfBenefitProcessNoteImpl explanationOfBenefitProcessNote = new ExplanationOfBenefitProcessNoteImpl();
		return explanationOfBenefitProcessNote;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ExplanationOfBenefitRelated createExplanationOfBenefitRelated() {
		ExplanationOfBenefitRelatedImpl explanationOfBenefitRelated = new ExplanationOfBenefitRelatedImpl();
		return explanationOfBenefitRelated;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ExplanationOfBenefitStatus createExplanationOfBenefitStatus() {
		ExplanationOfBenefitStatusImpl explanationOfBenefitStatus = new ExplanationOfBenefitStatusImpl();
		return explanationOfBenefitStatus;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ExplanationOfBenefitSubDetail createExplanationOfBenefitSubDetail() {
		ExplanationOfBenefitSubDetailImpl explanationOfBenefitSubDetail = new ExplanationOfBenefitSubDetailImpl();
		return explanationOfBenefitSubDetail;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Extension createExtension() {
		ExtensionImpl extension = new ExtensionImpl();
		return extension;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ExtensionContext createExtensionContext() {
		ExtensionContextImpl extensionContext = new ExtensionContextImpl();
		return extensionContext;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public FamilyHistoryStatus createFamilyHistoryStatus() {
		FamilyHistoryStatusImpl familyHistoryStatus = new FamilyHistoryStatusImpl();
		return familyHistoryStatus;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public FamilyMemberHistory createFamilyMemberHistory() {
		FamilyMemberHistoryImpl familyMemberHistory = new FamilyMemberHistoryImpl();
		return familyMemberHistory;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public FamilyMemberHistoryCondition createFamilyMemberHistoryCondition() {
		FamilyMemberHistoryConditionImpl familyMemberHistoryCondition = new FamilyMemberHistoryConditionImpl();
		return familyMemberHistoryCondition;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public FHIRAllTypes createFHIRAllTypes() {
		FHIRAllTypesImpl fhirAllTypes = new FHIRAllTypesImpl();
		return fhirAllTypes;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public FHIRDefinedType createFHIRDefinedType() {
		FHIRDefinedTypeImpl fhirDefinedType = new FHIRDefinedTypeImpl();
		return fhirDefinedType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public FHIRDeviceStatus createFHIRDeviceStatus() {
		FHIRDeviceStatusImpl fhirDeviceStatus = new FHIRDeviceStatusImpl();
		return fhirDeviceStatus;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public FHIRSubstanceStatus createFHIRSubstanceStatus() {
		FHIRSubstanceStatusImpl fhirSubstanceStatus = new FHIRSubstanceStatusImpl();
		return fhirSubstanceStatus;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public FilterOperator createFilterOperator() {
		FilterOperatorImpl filterOperator = new FilterOperatorImpl();
		return filterOperator;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public FinancialResourceStatusCodes createFinancialResourceStatusCodes() {
		FinancialResourceStatusCodesImpl financialResourceStatusCodes = new FinancialResourceStatusCodesImpl();
		return financialResourceStatusCodes;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Flag createFlag() {
		FlagImpl flag = new FlagImpl();
		return flag;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public FlagStatus createFlagStatus() {
		FlagStatusImpl flagStatus = new FlagStatusImpl();
		return flagStatus;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Goal createGoal() {
		GoalImpl goal = new GoalImpl();
		return goal;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public GoalStatus createGoalStatus() {
		GoalStatusImpl goalStatus = new GoalStatusImpl();
		return goalStatus;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public GoalTarget createGoalTarget() {
		GoalTargetImpl goalTarget = new GoalTargetImpl();
		return goalTarget;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public GraphCompartmentRule createGraphCompartmentRule() {
		GraphCompartmentRuleImpl graphCompartmentRule = new GraphCompartmentRuleImpl();
		return graphCompartmentRule;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public GraphDefinition createGraphDefinition() {
		GraphDefinitionImpl graphDefinition = new GraphDefinitionImpl();
		return graphDefinition;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public GraphDefinitionCompartment createGraphDefinitionCompartment() {
		GraphDefinitionCompartmentImpl graphDefinitionCompartment = new GraphDefinitionCompartmentImpl();
		return graphDefinitionCompartment;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public GraphDefinitionLink createGraphDefinitionLink() {
		GraphDefinitionLinkImpl graphDefinitionLink = new GraphDefinitionLinkImpl();
		return graphDefinitionLink;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public GraphDefinitionTarget createGraphDefinitionTarget() {
		GraphDefinitionTargetImpl graphDefinitionTarget = new GraphDefinitionTargetImpl();
		return graphDefinitionTarget;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Group createGroup() {
		GroupImpl group = new GroupImpl();
		return group;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public GroupCharacteristic createGroupCharacteristic() {
		GroupCharacteristicImpl groupCharacteristic = new GroupCharacteristicImpl();
		return groupCharacteristic;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public GroupMember createGroupMember() {
		GroupMemberImpl groupMember = new GroupMemberImpl();
		return groupMember;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public GroupType createGroupType() {
		GroupTypeImpl groupType = new GroupTypeImpl();
		return groupType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public GuidanceResponse createGuidanceResponse() {
		GuidanceResponseImpl guidanceResponse = new GuidanceResponseImpl();
		return guidanceResponse;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public GuidanceResponseStatus createGuidanceResponseStatus() {
		GuidanceResponseStatusImpl guidanceResponseStatus = new GuidanceResponseStatusImpl();
		return guidanceResponseStatus;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public GuideDependencyType createGuideDependencyType() {
		GuideDependencyTypeImpl guideDependencyType = new GuideDependencyTypeImpl();
		return guideDependencyType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public GuidePageKind createGuidePageKind() {
		GuidePageKindImpl guidePageKind = new GuidePageKindImpl();
		return guidePageKind;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public HealthcareService createHealthcareService() {
		HealthcareServiceImpl healthcareService = new HealthcareServiceImpl();
		return healthcareService;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public HealthcareServiceAvailableTime createHealthcareServiceAvailableTime() {
		HealthcareServiceAvailableTimeImpl healthcareServiceAvailableTime = new HealthcareServiceAvailableTimeImpl();
		return healthcareServiceAvailableTime;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public HealthcareServiceNotAvailable createHealthcareServiceNotAvailable() {
		HealthcareServiceNotAvailableImpl healthcareServiceNotAvailable = new HealthcareServiceNotAvailableImpl();
		return healthcareServiceNotAvailable;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public HTTPVerb createHTTPVerb() {
		HTTPVerbImpl httpVerb = new HTTPVerbImpl();
		return httpVerb;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public HumanName createHumanName() {
		HumanNameImpl humanName = new HumanNameImpl();
		return humanName;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Id createId() {
		IdImpl id = new IdImpl();
		return id;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Identifier createIdentifier() {
		IdentifierImpl identifier = new IdentifierImpl();
		return identifier;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public IdentifierUse createIdentifierUse() {
		IdentifierUseImpl identifierUse = new IdentifierUseImpl();
		return identifierUse;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public IdentityAssuranceLevel createIdentityAssuranceLevel() {
		IdentityAssuranceLevelImpl identityAssuranceLevel = new IdentityAssuranceLevelImpl();
		return identityAssuranceLevel;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ImagingManifest createImagingManifest() {
		ImagingManifestImpl imagingManifest = new ImagingManifestImpl();
		return imagingManifest;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ImagingManifestInstance createImagingManifestInstance() {
		ImagingManifestInstanceImpl imagingManifestInstance = new ImagingManifestInstanceImpl();
		return imagingManifestInstance;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ImagingManifestSeries createImagingManifestSeries() {
		ImagingManifestSeriesImpl imagingManifestSeries = new ImagingManifestSeriesImpl();
		return imagingManifestSeries;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ImagingManifestStudy createImagingManifestStudy() {
		ImagingManifestStudyImpl imagingManifestStudy = new ImagingManifestStudyImpl();
		return imagingManifestStudy;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ImagingStudy createImagingStudy() {
		ImagingStudyImpl imagingStudy = new ImagingStudyImpl();
		return imagingStudy;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ImagingStudyInstance createImagingStudyInstance() {
		ImagingStudyInstanceImpl imagingStudyInstance = new ImagingStudyInstanceImpl();
		return imagingStudyInstance;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ImagingStudySeries createImagingStudySeries() {
		ImagingStudySeriesImpl imagingStudySeries = new ImagingStudySeriesImpl();
		return imagingStudySeries;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Immunization createImmunization() {
		ImmunizationImpl immunization = new ImmunizationImpl();
		return immunization;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ImmunizationExplanation createImmunizationExplanation() {
		ImmunizationExplanationImpl immunizationExplanation = new ImmunizationExplanationImpl();
		return immunizationExplanation;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ImmunizationPractitioner createImmunizationPractitioner() {
		ImmunizationPractitionerImpl immunizationPractitioner = new ImmunizationPractitionerImpl();
		return immunizationPractitioner;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ImmunizationReaction createImmunizationReaction() {
		ImmunizationReactionImpl immunizationReaction = new ImmunizationReactionImpl();
		return immunizationReaction;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ImmunizationRecommendation createImmunizationRecommendation() {
		ImmunizationRecommendationImpl immunizationRecommendation = new ImmunizationRecommendationImpl();
		return immunizationRecommendation;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ImmunizationRecommendationDateCriterion createImmunizationRecommendationDateCriterion() {
		ImmunizationRecommendationDateCriterionImpl immunizationRecommendationDateCriterion = new ImmunizationRecommendationDateCriterionImpl();
		return immunizationRecommendationDateCriterion;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ImmunizationRecommendationProtocol createImmunizationRecommendationProtocol() {
		ImmunizationRecommendationProtocolImpl immunizationRecommendationProtocol = new ImmunizationRecommendationProtocolImpl();
		return immunizationRecommendationProtocol;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ImmunizationRecommendationRecommendation createImmunizationRecommendationRecommendation() {
		ImmunizationRecommendationRecommendationImpl immunizationRecommendationRecommendation = new ImmunizationRecommendationRecommendationImpl();
		return immunizationRecommendationRecommendation;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ImmunizationStatusCodes createImmunizationStatusCodes() {
		ImmunizationStatusCodesImpl immunizationStatusCodes = new ImmunizationStatusCodesImpl();
		return immunizationStatusCodes;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ImmunizationVaccinationProtocol createImmunizationVaccinationProtocol() {
		ImmunizationVaccinationProtocolImpl immunizationVaccinationProtocol = new ImmunizationVaccinationProtocolImpl();
		return immunizationVaccinationProtocol;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ImplementationGuide createImplementationGuide() {
		ImplementationGuideImpl implementationGuide = new ImplementationGuideImpl();
		return implementationGuide;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ImplementationGuideDependency createImplementationGuideDependency() {
		ImplementationGuideDependencyImpl implementationGuideDependency = new ImplementationGuideDependencyImpl();
		return implementationGuideDependency;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ImplementationGuideGlobal createImplementationGuideGlobal() {
		ImplementationGuideGlobalImpl implementationGuideGlobal = new ImplementationGuideGlobalImpl();
		return implementationGuideGlobal;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ImplementationGuidePackage createImplementationGuidePackage() {
		ImplementationGuidePackageImpl implementationGuidePackage = new ImplementationGuidePackageImpl();
		return implementationGuidePackage;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ImplementationGuidePage createImplementationGuidePage() {
		ImplementationGuidePageImpl implementationGuidePage = new ImplementationGuidePageImpl();
		return implementationGuidePage;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ImplementationGuideResource createImplementationGuideResource() {
		ImplementationGuideResourceImpl implementationGuideResource = new ImplementationGuideResourceImpl();
		return implementationGuideResource;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public InstanceAvailability createInstanceAvailability() {
		InstanceAvailabilityImpl instanceAvailability = new InstanceAvailabilityImpl();
		return instanceAvailability;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Instant createInstant() {
		InstantImpl instant = new InstantImpl();
		return instant;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public org.hl7.fhir.Integer createInteger() {
		IntegerImpl integer = new IntegerImpl();
		return integer;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public IssueSeverity createIssueSeverity() {
		IssueSeverityImpl issueSeverity = new IssueSeverityImpl();
		return issueSeverity;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public IssueType createIssueType() {
		IssueTypeImpl issueType = new IssueTypeImpl();
		return issueType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Library createLibrary() {
		LibraryImpl library = new LibraryImpl();
		return library;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Linkage createLinkage() {
		LinkageImpl linkage = new LinkageImpl();
		return linkage;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public LinkageItem createLinkageItem() {
		LinkageItemImpl linkageItem = new LinkageItemImpl();
		return linkageItem;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public LinkageType createLinkageType() {
		LinkageTypeImpl linkageType = new LinkageTypeImpl();
		return linkageType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public LinkType createLinkType() {
		LinkTypeImpl linkType = new LinkTypeImpl();
		return linkType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public List createList() {
		ListImpl list = new ListImpl();
		return list;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ListEntry createListEntry() {
		ListEntryImpl listEntry = new ListEntryImpl();
		return listEntry;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ListMode createListMode() {
		ListModeImpl listMode = new ListModeImpl();
		return listMode;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ListStatus createListStatus() {
		ListStatusImpl listStatus = new ListStatusImpl();
		return listStatus;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Location createLocation() {
		LocationImpl location = new LocationImpl();
		return location;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public LocationMode createLocationMode() {
		LocationModeImpl locationMode = new LocationModeImpl();
		return locationMode;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public LocationPosition createLocationPosition() {
		LocationPositionImpl locationPosition = new LocationPositionImpl();
		return locationPosition;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public LocationStatus createLocationStatus() {
		LocationStatusImpl locationStatus = new LocationStatusImpl();
		return locationStatus;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Markdown createMarkdown() {
		MarkdownImpl markdown = new MarkdownImpl();
		return markdown;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public MeasmntPrinciple createMeasmntPrinciple() {
		MeasmntPrincipleImpl measmntPrinciple = new MeasmntPrincipleImpl();
		return measmntPrinciple;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Measure createMeasure() {
		MeasureImpl measure = new MeasureImpl();
		return measure;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public MeasureGroup createMeasureGroup() {
		MeasureGroupImpl measureGroup = new MeasureGroupImpl();
		return measureGroup;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public MeasurePopulation createMeasurePopulation() {
		MeasurePopulationImpl measurePopulation = new MeasurePopulationImpl();
		return measurePopulation;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public MeasureReport createMeasureReport() {
		MeasureReportImpl measureReport = new MeasureReportImpl();
		return measureReport;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public MeasureReportGroup createMeasureReportGroup() {
		MeasureReportGroupImpl measureReportGroup = new MeasureReportGroupImpl();
		return measureReportGroup;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public MeasureReportPopulation createMeasureReportPopulation() {
		MeasureReportPopulationImpl measureReportPopulation = new MeasureReportPopulationImpl();
		return measureReportPopulation;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public MeasureReportPopulation1 createMeasureReportPopulation1() {
		MeasureReportPopulation1Impl measureReportPopulation1 = new MeasureReportPopulation1Impl();
		return measureReportPopulation1;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public MeasureReportStatus createMeasureReportStatus() {
		MeasureReportStatusImpl measureReportStatus = new MeasureReportStatusImpl();
		return measureReportStatus;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public MeasureReportStratifier createMeasureReportStratifier() {
		MeasureReportStratifierImpl measureReportStratifier = new MeasureReportStratifierImpl();
		return measureReportStratifier;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public MeasureReportStratum createMeasureReportStratum() {
		MeasureReportStratumImpl measureReportStratum = new MeasureReportStratumImpl();
		return measureReportStratum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public MeasureReportType createMeasureReportType() {
		MeasureReportTypeImpl measureReportType = new MeasureReportTypeImpl();
		return measureReportType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public MeasureStratifier createMeasureStratifier() {
		MeasureStratifierImpl measureStratifier = new MeasureStratifierImpl();
		return measureStratifier;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public MeasureSupplementalData createMeasureSupplementalData() {
		MeasureSupplementalDataImpl measureSupplementalData = new MeasureSupplementalDataImpl();
		return measureSupplementalData;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Media createMedia() {
		MediaImpl media = new MediaImpl();
		return media;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Medication createMedication() {
		MedicationImpl medication = new MedicationImpl();
		return medication;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public MedicationAdministration createMedicationAdministration() {
		MedicationAdministrationImpl medicationAdministration = new MedicationAdministrationImpl();
		return medicationAdministration;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public MedicationAdministrationDosage createMedicationAdministrationDosage() {
		MedicationAdministrationDosageImpl medicationAdministrationDosage = new MedicationAdministrationDosageImpl();
		return medicationAdministrationDosage;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public MedicationAdministrationPerformer createMedicationAdministrationPerformer() {
		MedicationAdministrationPerformerImpl medicationAdministrationPerformer = new MedicationAdministrationPerformerImpl();
		return medicationAdministrationPerformer;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public MedicationAdministrationStatus createMedicationAdministrationStatus() {
		MedicationAdministrationStatusImpl medicationAdministrationStatus = new MedicationAdministrationStatusImpl();
		return medicationAdministrationStatus;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public MedicationBatch createMedicationBatch() {
		MedicationBatchImpl medicationBatch = new MedicationBatchImpl();
		return medicationBatch;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public MedicationContent createMedicationContent() {
		MedicationContentImpl medicationContent = new MedicationContentImpl();
		return medicationContent;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public MedicationDispense createMedicationDispense() {
		MedicationDispenseImpl medicationDispense = new MedicationDispenseImpl();
		return medicationDispense;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public MedicationDispensePerformer createMedicationDispensePerformer() {
		MedicationDispensePerformerImpl medicationDispensePerformer = new MedicationDispensePerformerImpl();
		return medicationDispensePerformer;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public MedicationDispenseStatus createMedicationDispenseStatus() {
		MedicationDispenseStatusImpl medicationDispenseStatus = new MedicationDispenseStatusImpl();
		return medicationDispenseStatus;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public MedicationDispenseSubstitution createMedicationDispenseSubstitution() {
		MedicationDispenseSubstitutionImpl medicationDispenseSubstitution = new MedicationDispenseSubstitutionImpl();
		return medicationDispenseSubstitution;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public MedicationIngredient createMedicationIngredient() {
		MedicationIngredientImpl medicationIngredient = new MedicationIngredientImpl();
		return medicationIngredient;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public MedicationPackage createMedicationPackage() {
		MedicationPackageImpl medicationPackage = new MedicationPackageImpl();
		return medicationPackage;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public MedicationRequest createMedicationRequest() {
		MedicationRequestImpl medicationRequest = new MedicationRequestImpl();
		return medicationRequest;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public MedicationRequestDispenseRequest createMedicationRequestDispenseRequest() {
		MedicationRequestDispenseRequestImpl medicationRequestDispenseRequest = new MedicationRequestDispenseRequestImpl();
		return medicationRequestDispenseRequest;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public MedicationRequestIntent createMedicationRequestIntent() {
		MedicationRequestIntentImpl medicationRequestIntent = new MedicationRequestIntentImpl();
		return medicationRequestIntent;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public MedicationRequestPriority createMedicationRequestPriority() {
		MedicationRequestPriorityImpl medicationRequestPriority = new MedicationRequestPriorityImpl();
		return medicationRequestPriority;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public MedicationRequestRequester createMedicationRequestRequester() {
		MedicationRequestRequesterImpl medicationRequestRequester = new MedicationRequestRequesterImpl();
		return medicationRequestRequester;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public MedicationRequestStatus createMedicationRequestStatus() {
		MedicationRequestStatusImpl medicationRequestStatus = new MedicationRequestStatusImpl();
		return medicationRequestStatus;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public MedicationRequestSubstitution createMedicationRequestSubstitution() {
		MedicationRequestSubstitutionImpl medicationRequestSubstitution = new MedicationRequestSubstitutionImpl();
		return medicationRequestSubstitution;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public MedicationStatement createMedicationStatement() {
		MedicationStatementImpl medicationStatement = new MedicationStatementImpl();
		return medicationStatement;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public MedicationStatementStatus createMedicationStatementStatus() {
		MedicationStatementStatusImpl medicationStatementStatus = new MedicationStatementStatusImpl();
		return medicationStatementStatus;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public MedicationStatementTaken createMedicationStatementTaken() {
		MedicationStatementTakenImpl medicationStatementTaken = new MedicationStatementTakenImpl();
		return medicationStatementTaken;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public MedicationStatus createMedicationStatus() {
		MedicationStatusImpl medicationStatus = new MedicationStatusImpl();
		return medicationStatus;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public MessageDefinition createMessageDefinition() {
		MessageDefinitionImpl messageDefinition = new MessageDefinitionImpl();
		return messageDefinition;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public MessageDefinitionAllowedResponse createMessageDefinitionAllowedResponse() {
		MessageDefinitionAllowedResponseImpl messageDefinitionAllowedResponse = new MessageDefinitionAllowedResponseImpl();
		return messageDefinitionAllowedResponse;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public MessageDefinitionFocus createMessageDefinitionFocus() {
		MessageDefinitionFocusImpl messageDefinitionFocus = new MessageDefinitionFocusImpl();
		return messageDefinitionFocus;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public MessageHeader createMessageHeader() {
		MessageHeaderImpl messageHeader = new MessageHeaderImpl();
		return messageHeader;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public MessageHeaderDestination createMessageHeaderDestination() {
		MessageHeaderDestinationImpl messageHeaderDestination = new MessageHeaderDestinationImpl();
		return messageHeaderDestination;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public MessageHeaderResponse createMessageHeaderResponse() {
		MessageHeaderResponseImpl messageHeaderResponse = new MessageHeaderResponseImpl();
		return messageHeaderResponse;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public MessageHeaderSource createMessageHeaderSource() {
		MessageHeaderSourceImpl messageHeaderSource = new MessageHeaderSourceImpl();
		return messageHeaderSource;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public MessageSignificanceCategory createMessageSignificanceCategory() {
		MessageSignificanceCategoryImpl messageSignificanceCategory = new MessageSignificanceCategoryImpl();
		return messageSignificanceCategory;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Meta createMeta() {
		MetaImpl meta = new MetaImpl();
		return meta;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Money createMoney() {
		MoneyImpl money = new MoneyImpl();
		return money;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NameUse createNameUse() {
		NameUseImpl nameUse = new NameUseImpl();
		return nameUse;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NamingSystem createNamingSystem() {
		NamingSystemImpl namingSystem = new NamingSystemImpl();
		return namingSystem;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NamingSystemIdentifierType createNamingSystemIdentifierType() {
		NamingSystemIdentifierTypeImpl namingSystemIdentifierType = new NamingSystemIdentifierTypeImpl();
		return namingSystemIdentifierType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NamingSystemType createNamingSystemType() {
		NamingSystemTypeImpl namingSystemType = new NamingSystemTypeImpl();
		return namingSystemType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NamingSystemUniqueId createNamingSystemUniqueId() {
		NamingSystemUniqueIdImpl namingSystemUniqueId = new NamingSystemUniqueIdImpl();
		return namingSystemUniqueId;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Narrative createNarrative() {
		NarrativeImpl narrative = new NarrativeImpl();
		return narrative;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NarrativeStatus createNarrativeStatus() {
		NarrativeStatusImpl narrativeStatus = new NarrativeStatusImpl();
		return narrativeStatus;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NoteType createNoteType() {
		NoteTypeImpl noteType = new NoteTypeImpl();
		return noteType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NutritionOrder createNutritionOrder() {
		NutritionOrderImpl nutritionOrder = new NutritionOrderImpl();
		return nutritionOrder;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NutritionOrderAdministration createNutritionOrderAdministration() {
		NutritionOrderAdministrationImpl nutritionOrderAdministration = new NutritionOrderAdministrationImpl();
		return nutritionOrderAdministration;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NutritionOrderEnteralFormula createNutritionOrderEnteralFormula() {
		NutritionOrderEnteralFormulaImpl nutritionOrderEnteralFormula = new NutritionOrderEnteralFormulaImpl();
		return nutritionOrderEnteralFormula;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NutritionOrderNutrient createNutritionOrderNutrient() {
		NutritionOrderNutrientImpl nutritionOrderNutrient = new NutritionOrderNutrientImpl();
		return nutritionOrderNutrient;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NutritionOrderOralDiet createNutritionOrderOralDiet() {
		NutritionOrderOralDietImpl nutritionOrderOralDiet = new NutritionOrderOralDietImpl();
		return nutritionOrderOralDiet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NutritionOrderStatus createNutritionOrderStatus() {
		NutritionOrderStatusImpl nutritionOrderStatus = new NutritionOrderStatusImpl();
		return nutritionOrderStatus;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NutritionOrderSupplement createNutritionOrderSupplement() {
		NutritionOrderSupplementImpl nutritionOrderSupplement = new NutritionOrderSupplementImpl();
		return nutritionOrderSupplement;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NutritionOrderTexture createNutritionOrderTexture() {
		NutritionOrderTextureImpl nutritionOrderTexture = new NutritionOrderTextureImpl();
		return nutritionOrderTexture;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Observation createObservation() {
		ObservationImpl observation = new ObservationImpl();
		return observation;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ObservationComponent createObservationComponent() {
		ObservationComponentImpl observationComponent = new ObservationComponentImpl();
		return observationComponent;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ObservationReferenceRange createObservationReferenceRange() {
		ObservationReferenceRangeImpl observationReferenceRange = new ObservationReferenceRangeImpl();
		return observationReferenceRange;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ObservationRelated createObservationRelated() {
		ObservationRelatedImpl observationRelated = new ObservationRelatedImpl();
		return observationRelated;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ObservationRelationshipType createObservationRelationshipType() {
		ObservationRelationshipTypeImpl observationRelationshipType = new ObservationRelationshipTypeImpl();
		return observationRelationshipType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ObservationStatus createObservationStatus() {
		ObservationStatusImpl observationStatus = new ObservationStatusImpl();
		return observationStatus;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Oid createOid() {
		OidImpl oid = new OidImpl();
		return oid;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public OperationDefinition createOperationDefinition() {
		OperationDefinitionImpl operationDefinition = new OperationDefinitionImpl();
		return operationDefinition;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public OperationDefinitionBinding createOperationDefinitionBinding() {
		OperationDefinitionBindingImpl operationDefinitionBinding = new OperationDefinitionBindingImpl();
		return operationDefinitionBinding;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public OperationDefinitionOverload createOperationDefinitionOverload() {
		OperationDefinitionOverloadImpl operationDefinitionOverload = new OperationDefinitionOverloadImpl();
		return operationDefinitionOverload;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public OperationDefinitionParameter createOperationDefinitionParameter() {
		OperationDefinitionParameterImpl operationDefinitionParameter = new OperationDefinitionParameterImpl();
		return operationDefinitionParameter;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public OperationKind createOperationKind() {
		OperationKindImpl operationKind = new OperationKindImpl();
		return operationKind;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public OperationOutcome createOperationOutcome() {
		OperationOutcomeImpl operationOutcome = new OperationOutcomeImpl();
		return operationOutcome;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public OperationOutcomeIssue createOperationOutcomeIssue() {
		OperationOutcomeIssueImpl operationOutcomeIssue = new OperationOutcomeIssueImpl();
		return operationOutcomeIssue;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public OperationParameterUse createOperationParameterUse() {
		OperationParameterUseImpl operationParameterUse = new OperationParameterUseImpl();
		return operationParameterUse;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Organization createOrganization() {
		OrganizationImpl organization = new OrganizationImpl();
		return organization;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public OrganizationContact createOrganizationContact() {
		OrganizationContactImpl organizationContact = new OrganizationContactImpl();
		return organizationContact;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ParameterDefinition createParameterDefinition() {
		ParameterDefinitionImpl parameterDefinition = new ParameterDefinitionImpl();
		return parameterDefinition;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Parameters createParameters() {
		ParametersImpl parameters = new ParametersImpl();
		return parameters;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ParametersParameter createParametersParameter() {
		ParametersParameterImpl parametersParameter = new ParametersParameterImpl();
		return parametersParameter;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ParticipantRequired createParticipantRequired() {
		ParticipantRequiredImpl participantRequired = new ParticipantRequiredImpl();
		return participantRequired;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ParticipationStatus createParticipationStatus() {
		ParticipationStatusImpl participationStatus = new ParticipationStatusImpl();
		return participationStatus;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Patient createPatient() {
		PatientImpl patient = new PatientImpl();
		return patient;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PatientAnimal createPatientAnimal() {
		PatientAnimalImpl patientAnimal = new PatientAnimalImpl();
		return patientAnimal;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PatientCommunication createPatientCommunication() {
		PatientCommunicationImpl patientCommunication = new PatientCommunicationImpl();
		return patientCommunication;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PatientContact createPatientContact() {
		PatientContactImpl patientContact = new PatientContactImpl();
		return patientContact;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PatientLink createPatientLink() {
		PatientLinkImpl patientLink = new PatientLinkImpl();
		return patientLink;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PaymentNotice createPaymentNotice() {
		PaymentNoticeImpl paymentNotice = new PaymentNoticeImpl();
		return paymentNotice;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PaymentReconciliation createPaymentReconciliation() {
		PaymentReconciliationImpl paymentReconciliation = new PaymentReconciliationImpl();
		return paymentReconciliation;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PaymentReconciliationDetail createPaymentReconciliationDetail() {
		PaymentReconciliationDetailImpl paymentReconciliationDetail = new PaymentReconciliationDetailImpl();
		return paymentReconciliationDetail;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PaymentReconciliationProcessNote createPaymentReconciliationProcessNote() {
		PaymentReconciliationProcessNoteImpl paymentReconciliationProcessNote = new PaymentReconciliationProcessNoteImpl();
		return paymentReconciliationProcessNote;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Period createPeriod() {
		PeriodImpl period = new PeriodImpl();
		return period;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Person createPerson() {
		PersonImpl person = new PersonImpl();
		return person;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PersonLink createPersonLink() {
		PersonLinkImpl personLink = new PersonLinkImpl();
		return personLink;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PlanDefinition createPlanDefinition() {
		PlanDefinitionImpl planDefinition = new PlanDefinitionImpl();
		return planDefinition;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PlanDefinitionAction createPlanDefinitionAction() {
		PlanDefinitionActionImpl planDefinitionAction = new PlanDefinitionActionImpl();
		return planDefinitionAction;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PlanDefinitionCondition createPlanDefinitionCondition() {
		PlanDefinitionConditionImpl planDefinitionCondition = new PlanDefinitionConditionImpl();
		return planDefinitionCondition;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PlanDefinitionDynamicValue createPlanDefinitionDynamicValue() {
		PlanDefinitionDynamicValueImpl planDefinitionDynamicValue = new PlanDefinitionDynamicValueImpl();
		return planDefinitionDynamicValue;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PlanDefinitionGoal createPlanDefinitionGoal() {
		PlanDefinitionGoalImpl planDefinitionGoal = new PlanDefinitionGoalImpl();
		return planDefinitionGoal;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PlanDefinitionParticipant createPlanDefinitionParticipant() {
		PlanDefinitionParticipantImpl planDefinitionParticipant = new PlanDefinitionParticipantImpl();
		return planDefinitionParticipant;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PlanDefinitionRelatedAction createPlanDefinitionRelatedAction() {
		PlanDefinitionRelatedActionImpl planDefinitionRelatedAction = new PlanDefinitionRelatedActionImpl();
		return planDefinitionRelatedAction;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PlanDefinitionTarget createPlanDefinitionTarget() {
		PlanDefinitionTargetImpl planDefinitionTarget = new PlanDefinitionTargetImpl();
		return planDefinitionTarget;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PositiveInt createPositiveInt() {
		PositiveIntImpl positiveInt = new PositiveIntImpl();
		return positiveInt;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Practitioner createPractitioner() {
		PractitionerImpl practitioner = new PractitionerImpl();
		return practitioner;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PractitionerQualification createPractitionerQualification() {
		PractitionerQualificationImpl practitionerQualification = new PractitionerQualificationImpl();
		return practitionerQualification;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PractitionerRole createPractitionerRole() {
		PractitionerRoleImpl practitionerRole = new PractitionerRoleImpl();
		return practitionerRole;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PractitionerRoleAvailableTime createPractitionerRoleAvailableTime() {
		PractitionerRoleAvailableTimeImpl practitionerRoleAvailableTime = new PractitionerRoleAvailableTimeImpl();
		return practitionerRoleAvailableTime;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PractitionerRoleNotAvailable createPractitionerRoleNotAvailable() {
		PractitionerRoleNotAvailableImpl practitionerRoleNotAvailable = new PractitionerRoleNotAvailableImpl();
		return practitionerRoleNotAvailable;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Procedure createProcedure() {
		ProcedureImpl procedure = new ProcedureImpl();
		return procedure;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ProcedureFocalDevice createProcedureFocalDevice() {
		ProcedureFocalDeviceImpl procedureFocalDevice = new ProcedureFocalDeviceImpl();
		return procedureFocalDevice;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ProcedurePerformer createProcedurePerformer() {
		ProcedurePerformerImpl procedurePerformer = new ProcedurePerformerImpl();
		return procedurePerformer;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ProcedureRequest createProcedureRequest() {
		ProcedureRequestImpl procedureRequest = new ProcedureRequestImpl();
		return procedureRequest;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ProcedureRequestRequester createProcedureRequestRequester() {
		ProcedureRequestRequesterImpl procedureRequestRequester = new ProcedureRequestRequesterImpl();
		return procedureRequestRequester;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ProcessRequest createProcessRequest() {
		ProcessRequestImpl processRequest = new ProcessRequestImpl();
		return processRequest;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ProcessRequestItem createProcessRequestItem() {
		ProcessRequestItemImpl processRequestItem = new ProcessRequestItemImpl();
		return processRequestItem;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ProcessResponse createProcessResponse() {
		ProcessResponseImpl processResponse = new ProcessResponseImpl();
		return processResponse;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ProcessResponseProcessNote createProcessResponseProcessNote() {
		ProcessResponseProcessNoteImpl processResponseProcessNote = new ProcessResponseProcessNoteImpl();
		return processResponseProcessNote;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PropertyRepresentation createPropertyRepresentation() {
		PropertyRepresentationImpl propertyRepresentation = new PropertyRepresentationImpl();
		return propertyRepresentation;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PropertyType createPropertyType() {
		PropertyTypeImpl propertyType = new PropertyTypeImpl();
		return propertyType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Provenance createProvenance() {
		ProvenanceImpl provenance = new ProvenanceImpl();
		return provenance;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ProvenanceAgent createProvenanceAgent() {
		ProvenanceAgentImpl provenanceAgent = new ProvenanceAgentImpl();
		return provenanceAgent;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ProvenanceEntity createProvenanceEntity() {
		ProvenanceEntityImpl provenanceEntity = new ProvenanceEntityImpl();
		return provenanceEntity;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ProvenanceEntityRole createProvenanceEntityRole() {
		ProvenanceEntityRoleImpl provenanceEntityRole = new ProvenanceEntityRoleImpl();
		return provenanceEntityRole;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PublicationStatus createPublicationStatus() {
		PublicationStatusImpl publicationStatus = new PublicationStatusImpl();
		return publicationStatus;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public QualityType createQualityType() {
		QualityTypeImpl qualityType = new QualityTypeImpl();
		return qualityType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Quantity createQuantity() {
		QuantityImpl quantity = new QuantityImpl();
		return quantity;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public QuantityComparator createQuantityComparator() {
		QuantityComparatorImpl quantityComparator = new QuantityComparatorImpl();
		return quantityComparator;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Questionnaire createQuestionnaire() {
		QuestionnaireImpl questionnaire = new QuestionnaireImpl();
		return questionnaire;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public QuestionnaireEnableWhen createQuestionnaireEnableWhen() {
		QuestionnaireEnableWhenImpl questionnaireEnableWhen = new QuestionnaireEnableWhenImpl();
		return questionnaireEnableWhen;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public QuestionnaireItem createQuestionnaireItem() {
		QuestionnaireItemImpl questionnaireItem = new QuestionnaireItemImpl();
		return questionnaireItem;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public QuestionnaireItemType createQuestionnaireItemType() {
		QuestionnaireItemTypeImpl questionnaireItemType = new QuestionnaireItemTypeImpl();
		return questionnaireItemType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public QuestionnaireOption createQuestionnaireOption() {
		QuestionnaireOptionImpl questionnaireOption = new QuestionnaireOptionImpl();
		return questionnaireOption;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public QuestionnaireResponse createQuestionnaireResponse() {
		QuestionnaireResponseImpl questionnaireResponse = new QuestionnaireResponseImpl();
		return questionnaireResponse;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public QuestionnaireResponseAnswer createQuestionnaireResponseAnswer() {
		QuestionnaireResponseAnswerImpl questionnaireResponseAnswer = new QuestionnaireResponseAnswerImpl();
		return questionnaireResponseAnswer;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public QuestionnaireResponseItem createQuestionnaireResponseItem() {
		QuestionnaireResponseItemImpl questionnaireResponseItem = new QuestionnaireResponseItemImpl();
		return questionnaireResponseItem;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public QuestionnaireResponseStatus createQuestionnaireResponseStatus() {
		QuestionnaireResponseStatusImpl questionnaireResponseStatus = new QuestionnaireResponseStatusImpl();
		return questionnaireResponseStatus;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Range createRange() {
		RangeImpl range = new RangeImpl();
		return range;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Ratio createRatio() {
		RatioImpl ratio = new RatioImpl();
		return ratio;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Reference createReference() {
		ReferenceImpl reference = new ReferenceImpl();
		return reference;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ReferenceHandlingPolicy createReferenceHandlingPolicy() {
		ReferenceHandlingPolicyImpl referenceHandlingPolicy = new ReferenceHandlingPolicyImpl();
		return referenceHandlingPolicy;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ReferenceVersionRules createReferenceVersionRules() {
		ReferenceVersionRulesImpl referenceVersionRules = new ReferenceVersionRulesImpl();
		return referenceVersionRules;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ReferralRequest createReferralRequest() {
		ReferralRequestImpl referralRequest = new ReferralRequestImpl();
		return referralRequest;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ReferralRequestRequester createReferralRequestRequester() {
		ReferralRequestRequesterImpl referralRequestRequester = new ReferralRequestRequesterImpl();
		return referralRequestRequester;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public RelatedArtifact createRelatedArtifact() {
		RelatedArtifactImpl relatedArtifact = new RelatedArtifactImpl();
		return relatedArtifact;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public RelatedArtifactType createRelatedArtifactType() {
		RelatedArtifactTypeImpl relatedArtifactType = new RelatedArtifactTypeImpl();
		return relatedArtifactType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public RelatedPerson createRelatedPerson() {
		RelatedPersonImpl relatedPerson = new RelatedPersonImpl();
		return relatedPerson;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public RemittanceOutcome createRemittanceOutcome() {
		RemittanceOutcomeImpl remittanceOutcome = new RemittanceOutcomeImpl();
		return remittanceOutcome;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public RepositoryType createRepositoryType() {
		RepositoryTypeImpl repositoryType = new RepositoryTypeImpl();
		return repositoryType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public RequestGroup createRequestGroup() {
		RequestGroupImpl requestGroup = new RequestGroupImpl();
		return requestGroup;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public RequestGroupAction createRequestGroupAction() {
		RequestGroupActionImpl requestGroupAction = new RequestGroupActionImpl();
		return requestGroupAction;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public RequestGroupCondition createRequestGroupCondition() {
		RequestGroupConditionImpl requestGroupCondition = new RequestGroupConditionImpl();
		return requestGroupCondition;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public RequestGroupRelatedAction createRequestGroupRelatedAction() {
		RequestGroupRelatedActionImpl requestGroupRelatedAction = new RequestGroupRelatedActionImpl();
		return requestGroupRelatedAction;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public RequestIntent createRequestIntent() {
		RequestIntentImpl requestIntent = new RequestIntentImpl();
		return requestIntent;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public RequestPriority createRequestPriority() {
		RequestPriorityImpl requestPriority = new RequestPriorityImpl();
		return requestPriority;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public RequestStatus createRequestStatus() {
		RequestStatusImpl requestStatus = new RequestStatusImpl();
		return requestStatus;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ResearchStudy createResearchStudy() {
		ResearchStudyImpl researchStudy = new ResearchStudyImpl();
		return researchStudy;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ResearchStudyArm createResearchStudyArm() {
		ResearchStudyArmImpl researchStudyArm = new ResearchStudyArmImpl();
		return researchStudyArm;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ResearchStudyStatus createResearchStudyStatus() {
		ResearchStudyStatusImpl researchStudyStatus = new ResearchStudyStatusImpl();
		return researchStudyStatus;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ResearchSubject createResearchSubject() {
		ResearchSubjectImpl researchSubject = new ResearchSubjectImpl();
		return researchSubject;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ResearchSubjectStatus createResearchSubjectStatus() {
		ResearchSubjectStatusImpl researchSubjectStatus = new ResearchSubjectStatusImpl();
		return researchSubjectStatus;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Resource createResource() {
		ResourceImpl resource = new ResourceImpl();
		return resource;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ResourceContainer createResourceContainer() {
		ResourceContainerImpl resourceContainer = new ResourceContainerImpl();
		return resourceContainer;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ResourceType createResourceType() {
		ResourceTypeImpl resourceType = new ResourceTypeImpl();
		return resourceType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ResourceVersionPolicy createResourceVersionPolicy() {
		ResourceVersionPolicyImpl resourceVersionPolicy = new ResourceVersionPolicyImpl();
		return resourceVersionPolicy;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ResponseType createResponseType() {
		ResponseTypeImpl responseType = new ResponseTypeImpl();
		return responseType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public RestfulCapabilityMode createRestfulCapabilityMode() {
		RestfulCapabilityModeImpl restfulCapabilityMode = new RestfulCapabilityModeImpl();
		return restfulCapabilityMode;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public RiskAssessment createRiskAssessment() {
		RiskAssessmentImpl riskAssessment = new RiskAssessmentImpl();
		return riskAssessment;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public RiskAssessmentPrediction createRiskAssessmentPrediction() {
		RiskAssessmentPredictionImpl riskAssessmentPrediction = new RiskAssessmentPredictionImpl();
		return riskAssessmentPrediction;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SampledData createSampledData() {
		SampledDataImpl sampledData = new SampledDataImpl();
		return sampledData;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SampledDataDataType createSampledDataDataType() {
		SampledDataDataTypeImpl sampledDataDataType = new SampledDataDataTypeImpl();
		return sampledDataDataType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Schedule createSchedule() {
		ScheduleImpl schedule = new ScheduleImpl();
		return schedule;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SearchComparator createSearchComparator() {
		SearchComparatorImpl searchComparator = new SearchComparatorImpl();
		return searchComparator;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SearchEntryMode createSearchEntryMode() {
		SearchEntryModeImpl searchEntryMode = new SearchEntryModeImpl();
		return searchEntryMode;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SearchModifierCode createSearchModifierCode() {
		SearchModifierCodeImpl searchModifierCode = new SearchModifierCodeImpl();
		return searchModifierCode;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SearchParameter createSearchParameter() {
		SearchParameterImpl searchParameter = new SearchParameterImpl();
		return searchParameter;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SearchParameterComponent createSearchParameterComponent() {
		SearchParameterComponentImpl searchParameterComponent = new SearchParameterComponentImpl();
		return searchParameterComponent;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SearchParamType createSearchParamType() {
		SearchParamTypeImpl searchParamType = new SearchParamTypeImpl();
		return searchParamType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Sequence createSequence() {
		SequenceImpl sequence = new SequenceImpl();
		return sequence;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SequenceQuality createSequenceQuality() {
		SequenceQualityImpl sequenceQuality = new SequenceQualityImpl();
		return sequenceQuality;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SequenceReferenceSeq createSequenceReferenceSeq() {
		SequenceReferenceSeqImpl sequenceReferenceSeq = new SequenceReferenceSeqImpl();
		return sequenceReferenceSeq;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SequenceRepository createSequenceRepository() {
		SequenceRepositoryImpl sequenceRepository = new SequenceRepositoryImpl();
		return sequenceRepository;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SequenceVariant createSequenceVariant() {
		SequenceVariantImpl sequenceVariant = new SequenceVariantImpl();
		return sequenceVariant;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ServiceDefinition createServiceDefinition() {
		ServiceDefinitionImpl serviceDefinition = new ServiceDefinitionImpl();
		return serviceDefinition;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Signature createSignature() {
		SignatureImpl signature = new SignatureImpl();
		return signature;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SlicingRules createSlicingRules() {
		SlicingRulesImpl slicingRules = new SlicingRulesImpl();
		return slicingRules;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Slot createSlot() {
		SlotImpl slot = new SlotImpl();
		return slot;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SlotStatus createSlotStatus() {
		SlotStatusImpl slotStatus = new SlotStatusImpl();
		return slotStatus;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Specimen createSpecimen() {
		SpecimenImpl specimen = new SpecimenImpl();
		return specimen;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SpecimenCollection createSpecimenCollection() {
		SpecimenCollectionImpl specimenCollection = new SpecimenCollectionImpl();
		return specimenCollection;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SpecimenContainer createSpecimenContainer() {
		SpecimenContainerImpl specimenContainer = new SpecimenContainerImpl();
		return specimenContainer;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SpecimenProcessing createSpecimenProcessing() {
		SpecimenProcessingImpl specimenProcessing = new SpecimenProcessingImpl();
		return specimenProcessing;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SpecimenStatus createSpecimenStatus() {
		SpecimenStatusImpl specimenStatus = new SpecimenStatusImpl();
		return specimenStatus;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public org.hl7.fhir.String createString() {
		StringImpl string = new StringImpl();
		return string;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public StructureDefinition createStructureDefinition() {
		StructureDefinitionImpl structureDefinition = new StructureDefinitionImpl();
		return structureDefinition;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public StructureDefinitionDifferential createStructureDefinitionDifferential() {
		StructureDefinitionDifferentialImpl structureDefinitionDifferential = new StructureDefinitionDifferentialImpl();
		return structureDefinitionDifferential;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public StructureDefinitionKind createStructureDefinitionKind() {
		StructureDefinitionKindImpl structureDefinitionKind = new StructureDefinitionKindImpl();
		return structureDefinitionKind;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public StructureDefinitionMapping createStructureDefinitionMapping() {
		StructureDefinitionMappingImpl structureDefinitionMapping = new StructureDefinitionMappingImpl();
		return structureDefinitionMapping;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public StructureDefinitionSnapshot createStructureDefinitionSnapshot() {
		StructureDefinitionSnapshotImpl structureDefinitionSnapshot = new StructureDefinitionSnapshotImpl();
		return structureDefinitionSnapshot;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public StructureMap createStructureMap() {
		StructureMapImpl structureMap = new StructureMapImpl();
		return structureMap;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public StructureMapContextType createStructureMapContextType() {
		StructureMapContextTypeImpl structureMapContextType = new StructureMapContextTypeImpl();
		return structureMapContextType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public StructureMapDependent createStructureMapDependent() {
		StructureMapDependentImpl structureMapDependent = new StructureMapDependentImpl();
		return structureMapDependent;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public StructureMapGroup createStructureMapGroup() {
		StructureMapGroupImpl structureMapGroup = new StructureMapGroupImpl();
		return structureMapGroup;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public StructureMapGroupTypeMode createStructureMapGroupTypeMode() {
		StructureMapGroupTypeModeImpl structureMapGroupTypeMode = new StructureMapGroupTypeModeImpl();
		return structureMapGroupTypeMode;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public StructureMapInput createStructureMapInput() {
		StructureMapInputImpl structureMapInput = new StructureMapInputImpl();
		return structureMapInput;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public StructureMapInputMode createStructureMapInputMode() {
		StructureMapInputModeImpl structureMapInputMode = new StructureMapInputModeImpl();
		return structureMapInputMode;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public StructureMapModelMode createStructureMapModelMode() {
		StructureMapModelModeImpl structureMapModelMode = new StructureMapModelModeImpl();
		return structureMapModelMode;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public StructureMapParameter createStructureMapParameter() {
		StructureMapParameterImpl structureMapParameter = new StructureMapParameterImpl();
		return structureMapParameter;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public StructureMapRule createStructureMapRule() {
		StructureMapRuleImpl structureMapRule = new StructureMapRuleImpl();
		return structureMapRule;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public StructureMapSource createStructureMapSource() {
		StructureMapSourceImpl structureMapSource = new StructureMapSourceImpl();
		return structureMapSource;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public StructureMapSourceListMode createStructureMapSourceListMode() {
		StructureMapSourceListModeImpl structureMapSourceListMode = new StructureMapSourceListModeImpl();
		return structureMapSourceListMode;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public StructureMapStructure createStructureMapStructure() {
		StructureMapStructureImpl structureMapStructure = new StructureMapStructureImpl();
		return structureMapStructure;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public StructureMapTarget createStructureMapTarget() {
		StructureMapTargetImpl structureMapTarget = new StructureMapTargetImpl();
		return structureMapTarget;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public StructureMapTargetListMode createStructureMapTargetListMode() {
		StructureMapTargetListModeImpl structureMapTargetListMode = new StructureMapTargetListModeImpl();
		return structureMapTargetListMode;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public StructureMapTransform createStructureMapTransform() {
		StructureMapTransformImpl structureMapTransform = new StructureMapTransformImpl();
		return structureMapTransform;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Subscription createSubscription() {
		SubscriptionImpl subscription = new SubscriptionImpl();
		return subscription;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SubscriptionChannel createSubscriptionChannel() {
		SubscriptionChannelImpl subscriptionChannel = new SubscriptionChannelImpl();
		return subscriptionChannel;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SubscriptionChannelType createSubscriptionChannelType() {
		SubscriptionChannelTypeImpl subscriptionChannelType = new SubscriptionChannelTypeImpl();
		return subscriptionChannelType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SubscriptionStatus createSubscriptionStatus() {
		SubscriptionStatusImpl subscriptionStatus = new SubscriptionStatusImpl();
		return subscriptionStatus;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Substance createSubstance() {
		SubstanceImpl substance = new SubstanceImpl();
		return substance;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SubstanceIngredient createSubstanceIngredient() {
		SubstanceIngredientImpl substanceIngredient = new SubstanceIngredientImpl();
		return substanceIngredient;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SubstanceInstance createSubstanceInstance() {
		SubstanceInstanceImpl substanceInstance = new SubstanceInstanceImpl();
		return substanceInstance;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SupplyDelivery createSupplyDelivery() {
		SupplyDeliveryImpl supplyDelivery = new SupplyDeliveryImpl();
		return supplyDelivery;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SupplyDeliveryStatus createSupplyDeliveryStatus() {
		SupplyDeliveryStatusImpl supplyDeliveryStatus = new SupplyDeliveryStatusImpl();
		return supplyDeliveryStatus;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SupplyDeliverySuppliedItem createSupplyDeliverySuppliedItem() {
		SupplyDeliverySuppliedItemImpl supplyDeliverySuppliedItem = new SupplyDeliverySuppliedItemImpl();
		return supplyDeliverySuppliedItem;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SupplyRequest createSupplyRequest() {
		SupplyRequestImpl supplyRequest = new SupplyRequestImpl();
		return supplyRequest;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SupplyRequestOrderedItem createSupplyRequestOrderedItem() {
		SupplyRequestOrderedItemImpl supplyRequestOrderedItem = new SupplyRequestOrderedItemImpl();
		return supplyRequestOrderedItem;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SupplyRequestRequester createSupplyRequestRequester() {
		SupplyRequestRequesterImpl supplyRequestRequester = new SupplyRequestRequesterImpl();
		return supplyRequestRequester;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SupplyRequestStatus createSupplyRequestStatus() {
		SupplyRequestStatusImpl supplyRequestStatus = new SupplyRequestStatusImpl();
		return supplyRequestStatus;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SystemRestfulInteraction createSystemRestfulInteraction() {
		SystemRestfulInteractionImpl systemRestfulInteraction = new SystemRestfulInteractionImpl();
		return systemRestfulInteraction;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SystemVersionProcessingMode createSystemVersionProcessingMode() {
		SystemVersionProcessingModeImpl systemVersionProcessingMode = new SystemVersionProcessingModeImpl();
		return systemVersionProcessingMode;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Task createTask() {
		TaskImpl task = new TaskImpl();
		return task;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TaskInput createTaskInput() {
		TaskInputImpl taskInput = new TaskInputImpl();
		return taskInput;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TaskOutput createTaskOutput() {
		TaskOutputImpl taskOutput = new TaskOutputImpl();
		return taskOutput;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TaskRequester createTaskRequester() {
		TaskRequesterImpl taskRequester = new TaskRequesterImpl();
		return taskRequester;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TaskRestriction createTaskRestriction() {
		TaskRestrictionImpl taskRestriction = new TaskRestrictionImpl();
		return taskRestriction;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TaskStatus createTaskStatus() {
		TaskStatusImpl taskStatus = new TaskStatusImpl();
		return taskStatus;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TestReport createTestReport() {
		TestReportImpl testReport = new TestReportImpl();
		return testReport;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TestReportAction createTestReportAction() {
		TestReportActionImpl testReportAction = new TestReportActionImpl();
		return testReportAction;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TestReportAction1 createTestReportAction1() {
		TestReportAction1Impl testReportAction1 = new TestReportAction1Impl();
		return testReportAction1;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TestReportAction2 createTestReportAction2() {
		TestReportAction2Impl testReportAction2 = new TestReportAction2Impl();
		return testReportAction2;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TestReportActionResult createTestReportActionResult() {
		TestReportActionResultImpl testReportActionResult = new TestReportActionResultImpl();
		return testReportActionResult;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TestReportAssert createTestReportAssert() {
		TestReportAssertImpl testReportAssert = new TestReportAssertImpl();
		return testReportAssert;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TestReportOperation createTestReportOperation() {
		TestReportOperationImpl testReportOperation = new TestReportOperationImpl();
		return testReportOperation;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TestReportParticipant createTestReportParticipant() {
		TestReportParticipantImpl testReportParticipant = new TestReportParticipantImpl();
		return testReportParticipant;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TestReportParticipantType createTestReportParticipantType() {
		TestReportParticipantTypeImpl testReportParticipantType = new TestReportParticipantTypeImpl();
		return testReportParticipantType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TestReportResult createTestReportResult() {
		TestReportResultImpl testReportResult = new TestReportResultImpl();
		return testReportResult;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TestReportSetup createTestReportSetup() {
		TestReportSetupImpl testReportSetup = new TestReportSetupImpl();
		return testReportSetup;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TestReportStatus createTestReportStatus() {
		TestReportStatusImpl testReportStatus = new TestReportStatusImpl();
		return testReportStatus;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TestReportTeardown createTestReportTeardown() {
		TestReportTeardownImpl testReportTeardown = new TestReportTeardownImpl();
		return testReportTeardown;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TestReportTest createTestReportTest() {
		TestReportTestImpl testReportTest = new TestReportTestImpl();
		return testReportTest;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TestScript createTestScript() {
		TestScriptImpl testScript = new TestScriptImpl();
		return testScript;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TestScriptAction createTestScriptAction() {
		TestScriptActionImpl testScriptAction = new TestScriptActionImpl();
		return testScriptAction;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TestScriptAction1 createTestScriptAction1() {
		TestScriptAction1Impl testScriptAction1 = new TestScriptAction1Impl();
		return testScriptAction1;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TestScriptAction2 createTestScriptAction2() {
		TestScriptAction2Impl testScriptAction2 = new TestScriptAction2Impl();
		return testScriptAction2;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TestScriptAssert createTestScriptAssert() {
		TestScriptAssertImpl testScriptAssert = new TestScriptAssertImpl();
		return testScriptAssert;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TestScriptCapability createTestScriptCapability() {
		TestScriptCapabilityImpl testScriptCapability = new TestScriptCapabilityImpl();
		return testScriptCapability;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TestScriptDestination createTestScriptDestination() {
		TestScriptDestinationImpl testScriptDestination = new TestScriptDestinationImpl();
		return testScriptDestination;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TestScriptFixture createTestScriptFixture() {
		TestScriptFixtureImpl testScriptFixture = new TestScriptFixtureImpl();
		return testScriptFixture;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TestScriptLink createTestScriptLink() {
		TestScriptLinkImpl testScriptLink = new TestScriptLinkImpl();
		return testScriptLink;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TestScriptMetadata createTestScriptMetadata() {
		TestScriptMetadataImpl testScriptMetadata = new TestScriptMetadataImpl();
		return testScriptMetadata;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TestScriptOperation createTestScriptOperation() {
		TestScriptOperationImpl testScriptOperation = new TestScriptOperationImpl();
		return testScriptOperation;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TestScriptOrigin createTestScriptOrigin() {
		TestScriptOriginImpl testScriptOrigin = new TestScriptOriginImpl();
		return testScriptOrigin;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TestScriptParam createTestScriptParam() {
		TestScriptParamImpl testScriptParam = new TestScriptParamImpl();
		return testScriptParam;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TestScriptParam1 createTestScriptParam1() {
		TestScriptParam1Impl testScriptParam1 = new TestScriptParam1Impl();
		return testScriptParam1;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TestScriptParam2 createTestScriptParam2() {
		TestScriptParam2Impl testScriptParam2 = new TestScriptParam2Impl();
		return testScriptParam2;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TestScriptParam3 createTestScriptParam3() {
		TestScriptParam3Impl testScriptParam3 = new TestScriptParam3Impl();
		return testScriptParam3;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TestScriptRequestHeader createTestScriptRequestHeader() {
		TestScriptRequestHeaderImpl testScriptRequestHeader = new TestScriptRequestHeaderImpl();
		return testScriptRequestHeader;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TestScriptRequestMethodCode createTestScriptRequestMethodCode() {
		TestScriptRequestMethodCodeImpl testScriptRequestMethodCode = new TestScriptRequestMethodCodeImpl();
		return testScriptRequestMethodCode;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TestScriptRule createTestScriptRule() {
		TestScriptRuleImpl testScriptRule = new TestScriptRuleImpl();
		return testScriptRule;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TestScriptRule1 createTestScriptRule1() {
		TestScriptRule1Impl testScriptRule1 = new TestScriptRule1Impl();
		return testScriptRule1;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TestScriptRule2 createTestScriptRule2() {
		TestScriptRule2Impl testScriptRule2 = new TestScriptRule2Impl();
		return testScriptRule2;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TestScriptRule3 createTestScriptRule3() {
		TestScriptRule3Impl testScriptRule3 = new TestScriptRule3Impl();
		return testScriptRule3;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TestScriptRuleset createTestScriptRuleset() {
		TestScriptRulesetImpl testScriptRuleset = new TestScriptRulesetImpl();
		return testScriptRuleset;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TestScriptRuleset1 createTestScriptRuleset1() {
		TestScriptRuleset1Impl testScriptRuleset1 = new TestScriptRuleset1Impl();
		return testScriptRuleset1;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TestScriptSetup createTestScriptSetup() {
		TestScriptSetupImpl testScriptSetup = new TestScriptSetupImpl();
		return testScriptSetup;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TestScriptTeardown createTestScriptTeardown() {
		TestScriptTeardownImpl testScriptTeardown = new TestScriptTeardownImpl();
		return testScriptTeardown;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TestScriptTest createTestScriptTest() {
		TestScriptTestImpl testScriptTest = new TestScriptTestImpl();
		return testScriptTest;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TestScriptVariable createTestScriptVariable() {
		TestScriptVariableImpl testScriptVariable = new TestScriptVariableImpl();
		return testScriptVariable;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Time createTime() {
		TimeImpl time = new TimeImpl();
		return time;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Timing createTiming() {
		TimingImpl timing = new TimingImpl();
		return timing;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TimingRepeat createTimingRepeat() {
		TimingRepeatImpl timingRepeat = new TimingRepeatImpl();
		return timingRepeat;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TriggerDefinition createTriggerDefinition() {
		TriggerDefinitionImpl triggerDefinition = new TriggerDefinitionImpl();
		return triggerDefinition;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TriggerType createTriggerType() {
		TriggerTypeImpl triggerType = new TriggerTypeImpl();
		return triggerType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TypeDerivationRule createTypeDerivationRule() {
		TypeDerivationRuleImpl typeDerivationRule = new TypeDerivationRuleImpl();
		return typeDerivationRule;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TypeRestfulInteraction createTypeRestfulInteraction() {
		TypeRestfulInteractionImpl typeRestfulInteraction = new TypeRestfulInteractionImpl();
		return typeRestfulInteraction;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public UDIEntryType createUDIEntryType() {
		UDIEntryTypeImpl udiEntryType = new UDIEntryTypeImpl();
		return udiEntryType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public UnitsOfTime createUnitsOfTime() {
		UnitsOfTimeImpl unitsOfTime = new UnitsOfTimeImpl();
		return unitsOfTime;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public UnknownContentCode createUnknownContentCode() {
		UnknownContentCodeImpl unknownContentCode = new UnknownContentCodeImpl();
		return unknownContentCode;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public UnsignedInt createUnsignedInt() {
		UnsignedIntImpl unsignedInt = new UnsignedIntImpl();
		return unsignedInt;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Uri createUri() {
		UriImpl uri = new UriImpl();
		return uri;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public UsageContext createUsageContext() {
		UsageContextImpl usageContext = new UsageContextImpl();
		return usageContext;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Use createUse() {
		UseImpl use = new UseImpl();
		return use;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Uuid createUuid() {
		UuidImpl uuid = new UuidImpl();
		return uuid;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ValueSet createValueSet() {
		ValueSetImpl valueSet = new ValueSetImpl();
		return valueSet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ValueSetCompose createValueSetCompose() {
		ValueSetComposeImpl valueSetCompose = new ValueSetComposeImpl();
		return valueSetCompose;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ValueSetConcept createValueSetConcept() {
		ValueSetConceptImpl valueSetConcept = new ValueSetConceptImpl();
		return valueSetConcept;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ValueSetContains createValueSetContains() {
		ValueSetContainsImpl valueSetContains = new ValueSetContainsImpl();
		return valueSetContains;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ValueSetDesignation createValueSetDesignation() {
		ValueSetDesignationImpl valueSetDesignation = new ValueSetDesignationImpl();
		return valueSetDesignation;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ValueSetExpansion createValueSetExpansion() {
		ValueSetExpansionImpl valueSetExpansion = new ValueSetExpansionImpl();
		return valueSetExpansion;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ValueSetFilter createValueSetFilter() {
		ValueSetFilterImpl valueSetFilter = new ValueSetFilterImpl();
		return valueSetFilter;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ValueSetInclude createValueSetInclude() {
		ValueSetIncludeImpl valueSetInclude = new ValueSetIncludeImpl();
		return valueSetInclude;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ValueSetParameter createValueSetParameter() {
		ValueSetParameterImpl valueSetParameter = new ValueSetParameterImpl();
		return valueSetParameter;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public VisionBase createVisionBase() {
		VisionBaseImpl visionBase = new VisionBaseImpl();
		return visionBase;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public VisionEyes createVisionEyes() {
		VisionEyesImpl visionEyes = new VisionEyesImpl();
		return visionEyes;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public VisionPrescription createVisionPrescription() {
		VisionPrescriptionImpl visionPrescription = new VisionPrescriptionImpl();
		return visionPrescription;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public VisionPrescriptionDispense createVisionPrescriptionDispense() {
		VisionPrescriptionDispenseImpl visionPrescriptionDispense = new VisionPrescriptionDispenseImpl();
		return visionPrescriptionDispense;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public XPathUsageType createXPathUsageType() {
		XPathUsageTypeImpl xPathUsageType = new XPathUsageTypeImpl();
		return xPathUsageType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AccountStatusList createAccountStatusListFromString(EDataType eDataType, String initialValue) {
		AccountStatusList result = AccountStatusList.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertAccountStatusListToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ActionCardinalityBehaviorList createActionCardinalityBehaviorListFromString(EDataType eDataType, String initialValue) {
		ActionCardinalityBehaviorList result = ActionCardinalityBehaviorList.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertActionCardinalityBehaviorListToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ActionConditionKindList createActionConditionKindListFromString(EDataType eDataType, String initialValue) {
		ActionConditionKindList result = ActionConditionKindList.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertActionConditionKindListToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ActionGroupingBehaviorList createActionGroupingBehaviorListFromString(EDataType eDataType, String initialValue) {
		ActionGroupingBehaviorList result = ActionGroupingBehaviorList.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertActionGroupingBehaviorListToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ActionListList createActionListListFromString(EDataType eDataType, String initialValue) {
		ActionListList result = ActionListList.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertActionListListToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ActionParticipantTypeList createActionParticipantTypeListFromString(EDataType eDataType, String initialValue) {
		ActionParticipantTypeList result = ActionParticipantTypeList.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertActionParticipantTypeListToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ActionPrecheckBehaviorList createActionPrecheckBehaviorListFromString(EDataType eDataType, String initialValue) {
		ActionPrecheckBehaviorList result = ActionPrecheckBehaviorList.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertActionPrecheckBehaviorListToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ActionRelationshipTypeList createActionRelationshipTypeListFromString(EDataType eDataType, String initialValue) {
		ActionRelationshipTypeList result = ActionRelationshipTypeList.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertActionRelationshipTypeListToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ActionRequiredBehaviorList createActionRequiredBehaviorListFromString(EDataType eDataType, String initialValue) {
		ActionRequiredBehaviorList result = ActionRequiredBehaviorList.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertActionRequiredBehaviorListToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ActionSelectionBehaviorList createActionSelectionBehaviorListFromString(EDataType eDataType, String initialValue) {
		ActionSelectionBehaviorList result = ActionSelectionBehaviorList.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertActionSelectionBehaviorListToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AddressTypeList createAddressTypeListFromString(EDataType eDataType, String initialValue) {
		AddressTypeList result = AddressTypeList.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertAddressTypeListToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AddressUseList createAddressUseListFromString(EDataType eDataType, String initialValue) {
		AddressUseList result = AddressUseList.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertAddressUseListToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AdministrativeGenderList createAdministrativeGenderListFromString(EDataType eDataType, String initialValue) {
		AdministrativeGenderList result = AdministrativeGenderList.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertAdministrativeGenderListToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AdverseEventCategoryList createAdverseEventCategoryListFromString(EDataType eDataType, String initialValue) {
		AdverseEventCategoryList result = AdverseEventCategoryList.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertAdverseEventCategoryListToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AdverseEventCausalityList createAdverseEventCausalityListFromString(EDataType eDataType, String initialValue) {
		AdverseEventCausalityList result = AdverseEventCausalityList.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertAdverseEventCausalityListToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AggregationModeList createAggregationModeListFromString(EDataType eDataType, String initialValue) {
		AggregationModeList result = AggregationModeList.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertAggregationModeListToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AllergyIntoleranceCategoryList createAllergyIntoleranceCategoryListFromString(EDataType eDataType, String initialValue) {
		AllergyIntoleranceCategoryList result = AllergyIntoleranceCategoryList.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertAllergyIntoleranceCategoryListToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AllergyIntoleranceClinicalStatusList createAllergyIntoleranceClinicalStatusListFromString(EDataType eDataType, String initialValue) {
		AllergyIntoleranceClinicalStatusList result = AllergyIntoleranceClinicalStatusList.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertAllergyIntoleranceClinicalStatusListToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AllergyIntoleranceCriticalityList createAllergyIntoleranceCriticalityListFromString(EDataType eDataType, String initialValue) {
		AllergyIntoleranceCriticalityList result = AllergyIntoleranceCriticalityList.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertAllergyIntoleranceCriticalityListToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AllergyIntoleranceSeverityList createAllergyIntoleranceSeverityListFromString(EDataType eDataType, String initialValue) {
		AllergyIntoleranceSeverityList result = AllergyIntoleranceSeverityList.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertAllergyIntoleranceSeverityListToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AllergyIntoleranceTypeList createAllergyIntoleranceTypeListFromString(EDataType eDataType, String initialValue) {
		AllergyIntoleranceTypeList result = AllergyIntoleranceTypeList.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertAllergyIntoleranceTypeListToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AllergyIntoleranceVerificationStatusList createAllergyIntoleranceVerificationStatusListFromString(EDataType eDataType, String initialValue) {
		AllergyIntoleranceVerificationStatusList result = AllergyIntoleranceVerificationStatusList.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertAllergyIntoleranceVerificationStatusListToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AppointmentStatusList createAppointmentStatusListFromString(EDataType eDataType, String initialValue) {
		AppointmentStatusList result = AppointmentStatusList.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertAppointmentStatusListToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AssertionDirectionTypeList createAssertionDirectionTypeListFromString(EDataType eDataType, String initialValue) {
		AssertionDirectionTypeList result = AssertionDirectionTypeList.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertAssertionDirectionTypeListToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AssertionOperatorTypeList createAssertionOperatorTypeListFromString(EDataType eDataType, String initialValue) {
		AssertionOperatorTypeList result = AssertionOperatorTypeList.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertAssertionOperatorTypeListToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AssertionResponseTypesList createAssertionResponseTypesListFromString(EDataType eDataType, String initialValue) {
		AssertionResponseTypesList result = AssertionResponseTypesList.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertAssertionResponseTypesListToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AuditEventActionList createAuditEventActionListFromString(EDataType eDataType, String initialValue) {
		AuditEventActionList result = AuditEventActionList.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertAuditEventActionListToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AuditEventAgentNetworkTypeList createAuditEventAgentNetworkTypeListFromString(EDataType eDataType, String initialValue) {
		AuditEventAgentNetworkTypeList result = AuditEventAgentNetworkTypeList.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertAuditEventAgentNetworkTypeListToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AuditEventOutcomeList createAuditEventOutcomeListFromString(EDataType eDataType, String initialValue) {
		AuditEventOutcomeList result = AuditEventOutcomeList.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertAuditEventOutcomeListToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public BindingStrengthList createBindingStrengthListFromString(EDataType eDataType, String initialValue) {
		BindingStrengthList result = BindingStrengthList.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertBindingStrengthListToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public BundleTypeList createBundleTypeListFromString(EDataType eDataType, String initialValue) {
		BundleTypeList result = BundleTypeList.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertBundleTypeListToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CapabilityStatementKindList createCapabilityStatementKindListFromString(EDataType eDataType, String initialValue) {
		CapabilityStatementKindList result = CapabilityStatementKindList.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertCapabilityStatementKindListToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CarePlanActivityStatusList createCarePlanActivityStatusListFromString(EDataType eDataType, String initialValue) {
		CarePlanActivityStatusList result = CarePlanActivityStatusList.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertCarePlanActivityStatusListToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CarePlanIntentList createCarePlanIntentListFromString(EDataType eDataType, String initialValue) {
		CarePlanIntentList result = CarePlanIntentList.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertCarePlanIntentListToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CarePlanStatusList createCarePlanStatusListFromString(EDataType eDataType, String initialValue) {
		CarePlanStatusList result = CarePlanStatusList.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertCarePlanStatusListToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CareTeamStatusList createCareTeamStatusListFromString(EDataType eDataType, String initialValue) {
		CareTeamStatusList result = CareTeamStatusList.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertCareTeamStatusListToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ChargeItemStatusList createChargeItemStatusListFromString(EDataType eDataType, String initialValue) {
		ChargeItemStatusList result = ChargeItemStatusList.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertChargeItemStatusListToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ClinicalImpressionStatusList createClinicalImpressionStatusListFromString(EDataType eDataType, String initialValue) {
		ClinicalImpressionStatusList result = ClinicalImpressionStatusList.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertClinicalImpressionStatusListToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CodeSystemContentModeList createCodeSystemContentModeListFromString(EDataType eDataType, String initialValue) {
		CodeSystemContentModeList result = CodeSystemContentModeList.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertCodeSystemContentModeListToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CodeSystemHierarchyMeaningList createCodeSystemHierarchyMeaningListFromString(EDataType eDataType, String initialValue) {
		CodeSystemHierarchyMeaningList result = CodeSystemHierarchyMeaningList.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertCodeSystemHierarchyMeaningListToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CompartmentTypeList createCompartmentTypeListFromString(EDataType eDataType, String initialValue) {
		CompartmentTypeList result = CompartmentTypeList.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertCompartmentTypeListToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CompositionAttestationModeList createCompositionAttestationModeListFromString(EDataType eDataType, String initialValue) {
		CompositionAttestationModeList result = CompositionAttestationModeList.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertCompositionAttestationModeListToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CompositionStatusList createCompositionStatusListFromString(EDataType eDataType, String initialValue) {
		CompositionStatusList result = CompositionStatusList.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertCompositionStatusListToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ConceptMapEquivalenceList createConceptMapEquivalenceListFromString(EDataType eDataType, String initialValue) {
		ConceptMapEquivalenceList result = ConceptMapEquivalenceList.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertConceptMapEquivalenceListToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ConceptMapGroupUnmappedModeList createConceptMapGroupUnmappedModeListFromString(EDataType eDataType, String initialValue) {
		ConceptMapGroupUnmappedModeList result = ConceptMapGroupUnmappedModeList.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertConceptMapGroupUnmappedModeListToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ConditionalDeleteStatusList createConditionalDeleteStatusListFromString(EDataType eDataType, String initialValue) {
		ConditionalDeleteStatusList result = ConditionalDeleteStatusList.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertConditionalDeleteStatusListToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ConditionalReadStatusList createConditionalReadStatusListFromString(EDataType eDataType, String initialValue) {
		ConditionalReadStatusList result = ConditionalReadStatusList.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertConditionalReadStatusListToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ConditionClinicalStatusCodesList createConditionClinicalStatusCodesListFromString(EDataType eDataType, String initialValue) {
		ConditionClinicalStatusCodesList result = ConditionClinicalStatusCodesList.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertConditionClinicalStatusCodesListToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ConditionVerificationStatusList createConditionVerificationStatusListFromString(EDataType eDataType, String initialValue) {
		ConditionVerificationStatusList result = ConditionVerificationStatusList.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertConditionVerificationStatusListToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ConfidentialityClassificationList createConfidentialityClassificationListFromString(EDataType eDataType, String initialValue) {
		ConfidentialityClassificationList result = ConfidentialityClassificationList.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertConfidentialityClassificationListToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ConsentDataMeaningList createConsentDataMeaningListFromString(EDataType eDataType, String initialValue) {
		ConsentDataMeaningList result = ConsentDataMeaningList.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertConsentDataMeaningListToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ConsentExceptTypeList createConsentExceptTypeListFromString(EDataType eDataType, String initialValue) {
		ConsentExceptTypeList result = ConsentExceptTypeList.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertConsentExceptTypeListToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ConsentStateList createConsentStateListFromString(EDataType eDataType, String initialValue) {
		ConsentStateList result = ConsentStateList.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertConsentStateListToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ConstraintSeverityList createConstraintSeverityListFromString(EDataType eDataType, String initialValue) {
		ConstraintSeverityList result = ConstraintSeverityList.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertConstraintSeverityListToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ContactPointSystemList createContactPointSystemListFromString(EDataType eDataType, String initialValue) {
		ContactPointSystemList result = ContactPointSystemList.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertContactPointSystemListToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ContactPointUseList createContactPointUseListFromString(EDataType eDataType, String initialValue) {
		ContactPointUseList result = ContactPointUseList.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertContactPointUseListToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ContentTypeList createContentTypeListFromString(EDataType eDataType, String initialValue) {
		ContentTypeList result = ContentTypeList.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertContentTypeListToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ContractResourceStatusCodesList createContractResourceStatusCodesListFromString(EDataType eDataType, String initialValue) {
		ContractResourceStatusCodesList result = ContractResourceStatusCodesList.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertContractResourceStatusCodesListToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ContributorTypeList createContributorTypeListFromString(EDataType eDataType, String initialValue) {
		ContributorTypeList result = ContributorTypeList.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertContributorTypeListToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DataElementStringencyList createDataElementStringencyListFromString(EDataType eDataType, String initialValue) {
		DataElementStringencyList result = DataElementStringencyList.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertDataElementStringencyListToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DaysOfWeekList createDaysOfWeekListFromString(EDataType eDataType, String initialValue) {
		DaysOfWeekList result = DaysOfWeekList.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertDaysOfWeekListToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DetectedIssueSeverityList createDetectedIssueSeverityListFromString(EDataType eDataType, String initialValue) {
		DetectedIssueSeverityList result = DetectedIssueSeverityList.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertDetectedIssueSeverityListToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DeviceMetricCalibrationStateList createDeviceMetricCalibrationStateListFromString(EDataType eDataType, String initialValue) {
		DeviceMetricCalibrationStateList result = DeviceMetricCalibrationStateList.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertDeviceMetricCalibrationStateListToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DeviceMetricCalibrationTypeList createDeviceMetricCalibrationTypeListFromString(EDataType eDataType, String initialValue) {
		DeviceMetricCalibrationTypeList result = DeviceMetricCalibrationTypeList.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertDeviceMetricCalibrationTypeListToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DeviceMetricCategoryList createDeviceMetricCategoryListFromString(EDataType eDataType, String initialValue) {
		DeviceMetricCategoryList result = DeviceMetricCategoryList.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertDeviceMetricCategoryListToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DeviceMetricColorList createDeviceMetricColorListFromString(EDataType eDataType, String initialValue) {
		DeviceMetricColorList result = DeviceMetricColorList.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertDeviceMetricColorListToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DeviceMetricOperationalStatusList createDeviceMetricOperationalStatusListFromString(EDataType eDataType, String initialValue) {
		DeviceMetricOperationalStatusList result = DeviceMetricOperationalStatusList.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertDeviceMetricOperationalStatusListToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DeviceUseStatementStatusList createDeviceUseStatementStatusListFromString(EDataType eDataType, String initialValue) {
		DeviceUseStatementStatusList result = DeviceUseStatementStatusList.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertDeviceUseStatementStatusListToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DiagnosticReportStatusList createDiagnosticReportStatusListFromString(EDataType eDataType, String initialValue) {
		DiagnosticReportStatusList result = DiagnosticReportStatusList.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertDiagnosticReportStatusListToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DigitalMediaTypeList createDigitalMediaTypeListFromString(EDataType eDataType, String initialValue) {
		DigitalMediaTypeList result = DigitalMediaTypeList.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertDigitalMediaTypeListToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DiscriminatorTypeList createDiscriminatorTypeListFromString(EDataType eDataType, String initialValue) {
		DiscriminatorTypeList result = DiscriminatorTypeList.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertDiscriminatorTypeListToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DocumentModeList createDocumentModeListFromString(EDataType eDataType, String initialValue) {
		DocumentModeList result = DocumentModeList.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertDocumentModeListToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DocumentReferenceStatusList createDocumentReferenceStatusListFromString(EDataType eDataType, String initialValue) {
		DocumentReferenceStatusList result = DocumentReferenceStatusList.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertDocumentReferenceStatusListToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DocumentRelationshipTypeList createDocumentRelationshipTypeListFromString(EDataType eDataType, String initialValue) {
		DocumentRelationshipTypeList result = DocumentRelationshipTypeList.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertDocumentRelationshipTypeListToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EncounterLocationStatusList createEncounterLocationStatusListFromString(EDataType eDataType, String initialValue) {
		EncounterLocationStatusList result = EncounterLocationStatusList.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertEncounterLocationStatusListToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EncounterStatusList createEncounterStatusListFromString(EDataType eDataType, String initialValue) {
		EncounterStatusList result = EncounterStatusList.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertEncounterStatusListToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EndpointStatusList createEndpointStatusListFromString(EDataType eDataType, String initialValue) {
		EndpointStatusList result = EndpointStatusList.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertEndpointStatusListToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EpisodeOfCareStatusList createEpisodeOfCareStatusListFromString(EDataType eDataType, String initialValue) {
		EpisodeOfCareStatusList result = EpisodeOfCareStatusList.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertEpisodeOfCareStatusListToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EventCapabilityModeList createEventCapabilityModeListFromString(EDataType eDataType, String initialValue) {
		EventCapabilityModeList result = EventCapabilityModeList.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertEventCapabilityModeListToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EventStatusList createEventStatusListFromString(EDataType eDataType, String initialValue) {
		EventStatusList result = EventStatusList.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertEventStatusListToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EventTimingList createEventTimingListFromString(EDataType eDataType, String initialValue) {
		EventTimingList result = EventTimingList.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertEventTimingListToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ExplanationOfBenefitStatusList createExplanationOfBenefitStatusListFromString(EDataType eDataType, String initialValue) {
		ExplanationOfBenefitStatusList result = ExplanationOfBenefitStatusList.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertExplanationOfBenefitStatusListToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ExtensionContextList createExtensionContextListFromString(EDataType eDataType, String initialValue) {
		ExtensionContextList result = ExtensionContextList.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertExtensionContextListToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public FamilyHistoryStatusList createFamilyHistoryStatusListFromString(EDataType eDataType, String initialValue) {
		FamilyHistoryStatusList result = FamilyHistoryStatusList.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertFamilyHistoryStatusListToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public FHIRAllTypesList createFHIRAllTypesListFromString(EDataType eDataType, String initialValue) {
		FHIRAllTypesList result = FHIRAllTypesList.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertFHIRAllTypesListToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public FHIRDefinedTypeList createFHIRDefinedTypeListFromString(EDataType eDataType, String initialValue) {
		FHIRDefinedTypeList result = FHIRDefinedTypeList.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertFHIRDefinedTypeListToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public FHIRDeviceStatusList createFHIRDeviceStatusListFromString(EDataType eDataType, String initialValue) {
		FHIRDeviceStatusList result = FHIRDeviceStatusList.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertFHIRDeviceStatusListToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public FHIRSubstanceStatusList createFHIRSubstanceStatusListFromString(EDataType eDataType, String initialValue) {
		FHIRSubstanceStatusList result = FHIRSubstanceStatusList.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertFHIRSubstanceStatusListToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public FilterOperatorList createFilterOperatorListFromString(EDataType eDataType, String initialValue) {
		FilterOperatorList result = FilterOperatorList.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertFilterOperatorListToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public FinancialResourceStatusCodesList createFinancialResourceStatusCodesListFromString(EDataType eDataType, String initialValue) {
		FinancialResourceStatusCodesList result = FinancialResourceStatusCodesList.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertFinancialResourceStatusCodesListToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public FlagStatusList createFlagStatusListFromString(EDataType eDataType, String initialValue) {
		FlagStatusList result = FlagStatusList.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertFlagStatusListToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public GoalStatusList createGoalStatusListFromString(EDataType eDataType, String initialValue) {
		GoalStatusList result = GoalStatusList.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertGoalStatusListToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public GraphCompartmentRuleList createGraphCompartmentRuleListFromString(EDataType eDataType, String initialValue) {
		GraphCompartmentRuleList result = GraphCompartmentRuleList.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertGraphCompartmentRuleListToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public GroupTypeList createGroupTypeListFromString(EDataType eDataType, String initialValue) {
		GroupTypeList result = GroupTypeList.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertGroupTypeListToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public GuidanceResponseStatusList createGuidanceResponseStatusListFromString(EDataType eDataType, String initialValue) {
		GuidanceResponseStatusList result = GuidanceResponseStatusList.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertGuidanceResponseStatusListToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public GuideDependencyTypeList createGuideDependencyTypeListFromString(EDataType eDataType, String initialValue) {
		GuideDependencyTypeList result = GuideDependencyTypeList.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertGuideDependencyTypeListToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public GuidePageKindList createGuidePageKindListFromString(EDataType eDataType, String initialValue) {
		GuidePageKindList result = GuidePageKindList.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertGuidePageKindListToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public HTTPVerbList createHTTPVerbListFromString(EDataType eDataType, String initialValue) {
		HTTPVerbList result = HTTPVerbList.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertHTTPVerbListToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public IdentifierUseList createIdentifierUseListFromString(EDataType eDataType, String initialValue) {
		IdentifierUseList result = IdentifierUseList.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertIdentifierUseListToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public IdentityAssuranceLevelList createIdentityAssuranceLevelListFromString(EDataType eDataType, String initialValue) {
		IdentityAssuranceLevelList result = IdentityAssuranceLevelList.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertIdentityAssuranceLevelListToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ImmunizationStatusCodesList createImmunizationStatusCodesListFromString(EDataType eDataType, String initialValue) {
		ImmunizationStatusCodesList result = ImmunizationStatusCodesList.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertImmunizationStatusCodesListToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public InstanceAvailabilityList createInstanceAvailabilityListFromString(EDataType eDataType, String initialValue) {
		InstanceAvailabilityList result = InstanceAvailabilityList.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertInstanceAvailabilityListToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public IssueSeverityList createIssueSeverityListFromString(EDataType eDataType, String initialValue) {
		IssueSeverityList result = IssueSeverityList.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertIssueSeverityListToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public IssueTypeList createIssueTypeListFromString(EDataType eDataType, String initialValue) {
		IssueTypeList result = IssueTypeList.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertIssueTypeListToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public LinkageTypeList createLinkageTypeListFromString(EDataType eDataType, String initialValue) {
		LinkageTypeList result = LinkageTypeList.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertLinkageTypeListToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public LinkTypeList createLinkTypeListFromString(EDataType eDataType, String initialValue) {
		LinkTypeList result = LinkTypeList.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertLinkTypeListToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ListModeList createListModeListFromString(EDataType eDataType, String initialValue) {
		ListModeList result = ListModeList.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertListModeListToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ListStatusList createListStatusListFromString(EDataType eDataType, String initialValue) {
		ListStatusList result = ListStatusList.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertListStatusListToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public LocationModeList createLocationModeListFromString(EDataType eDataType, String initialValue) {
		LocationModeList result = LocationModeList.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertLocationModeListToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public LocationStatusList createLocationStatusListFromString(EDataType eDataType, String initialValue) {
		LocationStatusList result = LocationStatusList.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertLocationStatusListToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public MeasmntPrincipleList createMeasmntPrincipleListFromString(EDataType eDataType, String initialValue) {
		MeasmntPrincipleList result = MeasmntPrincipleList.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertMeasmntPrincipleListToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public MeasureReportStatusList createMeasureReportStatusListFromString(EDataType eDataType, String initialValue) {
		MeasureReportStatusList result = MeasureReportStatusList.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertMeasureReportStatusListToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public MeasureReportTypeList createMeasureReportTypeListFromString(EDataType eDataType, String initialValue) {
		MeasureReportTypeList result = MeasureReportTypeList.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertMeasureReportTypeListToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public MedicationAdministrationStatusList createMedicationAdministrationStatusListFromString(EDataType eDataType, String initialValue) {
		MedicationAdministrationStatusList result = MedicationAdministrationStatusList.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertMedicationAdministrationStatusListToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public MedicationDispenseStatusList createMedicationDispenseStatusListFromString(EDataType eDataType, String initialValue) {
		MedicationDispenseStatusList result = MedicationDispenseStatusList.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertMedicationDispenseStatusListToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public MedicationRequestIntentList createMedicationRequestIntentListFromString(EDataType eDataType, String initialValue) {
		MedicationRequestIntentList result = MedicationRequestIntentList.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertMedicationRequestIntentListToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public MedicationRequestPriorityList createMedicationRequestPriorityListFromString(EDataType eDataType, String initialValue) {
		MedicationRequestPriorityList result = MedicationRequestPriorityList.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertMedicationRequestPriorityListToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public MedicationRequestStatusList createMedicationRequestStatusListFromString(EDataType eDataType, String initialValue) {
		MedicationRequestStatusList result = MedicationRequestStatusList.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertMedicationRequestStatusListToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public MedicationStatementStatusList createMedicationStatementStatusListFromString(EDataType eDataType, String initialValue) {
		MedicationStatementStatusList result = MedicationStatementStatusList.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertMedicationStatementStatusListToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public MedicationStatementTakenList createMedicationStatementTakenListFromString(EDataType eDataType, String initialValue) {
		MedicationStatementTakenList result = MedicationStatementTakenList.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertMedicationStatementTakenListToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public MedicationStatusList createMedicationStatusListFromString(EDataType eDataType, String initialValue) {
		MedicationStatusList result = MedicationStatusList.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertMedicationStatusListToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public MessageSignificanceCategoryList createMessageSignificanceCategoryListFromString(EDataType eDataType, String initialValue) {
		MessageSignificanceCategoryList result = MessageSignificanceCategoryList.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertMessageSignificanceCategoryListToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NameUseList createNameUseListFromString(EDataType eDataType, String initialValue) {
		NameUseList result = NameUseList.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertNameUseListToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NamingSystemIdentifierTypeList createNamingSystemIdentifierTypeListFromString(EDataType eDataType, String initialValue) {
		NamingSystemIdentifierTypeList result = NamingSystemIdentifierTypeList.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertNamingSystemIdentifierTypeListToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NamingSystemTypeList createNamingSystemTypeListFromString(EDataType eDataType, String initialValue) {
		NamingSystemTypeList result = NamingSystemTypeList.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertNamingSystemTypeListToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NarrativeStatusList createNarrativeStatusListFromString(EDataType eDataType, String initialValue) {
		NarrativeStatusList result = NarrativeStatusList.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertNarrativeStatusListToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NoteTypeList createNoteTypeListFromString(EDataType eDataType, String initialValue) {
		NoteTypeList result = NoteTypeList.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertNoteTypeListToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NutritionOrderStatusList createNutritionOrderStatusListFromString(EDataType eDataType, String initialValue) {
		NutritionOrderStatusList result = NutritionOrderStatusList.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertNutritionOrderStatusListToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ObservationRelationshipTypeList createObservationRelationshipTypeListFromString(EDataType eDataType, String initialValue) {
		ObservationRelationshipTypeList result = ObservationRelationshipTypeList.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertObservationRelationshipTypeListToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ObservationStatusList createObservationStatusListFromString(EDataType eDataType, String initialValue) {
		ObservationStatusList result = ObservationStatusList.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertObservationStatusListToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public OperationKindList createOperationKindListFromString(EDataType eDataType, String initialValue) {
		OperationKindList result = OperationKindList.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertOperationKindListToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public OperationParameterUseList createOperationParameterUseListFromString(EDataType eDataType, String initialValue) {
		OperationParameterUseList result = OperationParameterUseList.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertOperationParameterUseListToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ParticipantRequiredList createParticipantRequiredListFromString(EDataType eDataType, String initialValue) {
		ParticipantRequiredList result = ParticipantRequiredList.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertParticipantRequiredListToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ParticipationStatusList createParticipationStatusListFromString(EDataType eDataType, String initialValue) {
		ParticipationStatusList result = ParticipationStatusList.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertParticipationStatusListToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PropertyRepresentationList createPropertyRepresentationListFromString(EDataType eDataType, String initialValue) {
		PropertyRepresentationList result = PropertyRepresentationList.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertPropertyRepresentationListToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PropertyTypeList createPropertyTypeListFromString(EDataType eDataType, String initialValue) {
		PropertyTypeList result = PropertyTypeList.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertPropertyTypeListToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ProvenanceEntityRoleList createProvenanceEntityRoleListFromString(EDataType eDataType, String initialValue) {
		ProvenanceEntityRoleList result = ProvenanceEntityRoleList.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertProvenanceEntityRoleListToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PublicationStatusList createPublicationStatusListFromString(EDataType eDataType, String initialValue) {
		PublicationStatusList result = PublicationStatusList.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertPublicationStatusListToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public QualityTypeList createQualityTypeListFromString(EDataType eDataType, String initialValue) {
		QualityTypeList result = QualityTypeList.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertQualityTypeListToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public QuantityComparatorList createQuantityComparatorListFromString(EDataType eDataType, String initialValue) {
		QuantityComparatorList result = QuantityComparatorList.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertQuantityComparatorListToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public QuestionnaireItemTypeList createQuestionnaireItemTypeListFromString(EDataType eDataType, String initialValue) {
		QuestionnaireItemTypeList result = QuestionnaireItemTypeList.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertQuestionnaireItemTypeListToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public QuestionnaireResponseStatusList createQuestionnaireResponseStatusListFromString(EDataType eDataType, String initialValue) {
		QuestionnaireResponseStatusList result = QuestionnaireResponseStatusList.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertQuestionnaireResponseStatusListToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ReferenceHandlingPolicyList createReferenceHandlingPolicyListFromString(EDataType eDataType, String initialValue) {
		ReferenceHandlingPolicyList result = ReferenceHandlingPolicyList.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertReferenceHandlingPolicyListToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ReferenceVersionRulesList createReferenceVersionRulesListFromString(EDataType eDataType, String initialValue) {
		ReferenceVersionRulesList result = ReferenceVersionRulesList.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertReferenceVersionRulesListToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public RelatedArtifactTypeList createRelatedArtifactTypeListFromString(EDataType eDataType, String initialValue) {
		RelatedArtifactTypeList result = RelatedArtifactTypeList.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertRelatedArtifactTypeListToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public RemittanceOutcomeList createRemittanceOutcomeListFromString(EDataType eDataType, String initialValue) {
		RemittanceOutcomeList result = RemittanceOutcomeList.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertRemittanceOutcomeListToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public RepositoryTypeList createRepositoryTypeListFromString(EDataType eDataType, String initialValue) {
		RepositoryTypeList result = RepositoryTypeList.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertRepositoryTypeListToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public RequestIntentList createRequestIntentListFromString(EDataType eDataType, String initialValue) {
		RequestIntentList result = RequestIntentList.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertRequestIntentListToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public RequestPriorityList createRequestPriorityListFromString(EDataType eDataType, String initialValue) {
		RequestPriorityList result = RequestPriorityList.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertRequestPriorityListToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public RequestStatusList createRequestStatusListFromString(EDataType eDataType, String initialValue) {
		RequestStatusList result = RequestStatusList.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertRequestStatusListToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ResearchStudyStatusList createResearchStudyStatusListFromString(EDataType eDataType, String initialValue) {
		ResearchStudyStatusList result = ResearchStudyStatusList.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertResearchStudyStatusListToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ResearchSubjectStatusList createResearchSubjectStatusListFromString(EDataType eDataType, String initialValue) {
		ResearchSubjectStatusList result = ResearchSubjectStatusList.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertResearchSubjectStatusListToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ResourceTypeList createResourceTypeListFromString(EDataType eDataType, String initialValue) {
		ResourceTypeList result = ResourceTypeList.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertResourceTypeListToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ResourceVersionPolicyList createResourceVersionPolicyListFromString(EDataType eDataType, String initialValue) {
		ResourceVersionPolicyList result = ResourceVersionPolicyList.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertResourceVersionPolicyListToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ResponseTypeList createResponseTypeListFromString(EDataType eDataType, String initialValue) {
		ResponseTypeList result = ResponseTypeList.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertResponseTypeListToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public RestfulCapabilityModeList createRestfulCapabilityModeListFromString(EDataType eDataType, String initialValue) {
		RestfulCapabilityModeList result = RestfulCapabilityModeList.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertRestfulCapabilityModeListToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SearchComparatorList createSearchComparatorListFromString(EDataType eDataType, String initialValue) {
		SearchComparatorList result = SearchComparatorList.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertSearchComparatorListToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SearchEntryModeList createSearchEntryModeListFromString(EDataType eDataType, String initialValue) {
		SearchEntryModeList result = SearchEntryModeList.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertSearchEntryModeListToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SearchModifierCodeList createSearchModifierCodeListFromString(EDataType eDataType, String initialValue) {
		SearchModifierCodeList result = SearchModifierCodeList.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertSearchModifierCodeListToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SearchParamTypeList createSearchParamTypeListFromString(EDataType eDataType, String initialValue) {
		SearchParamTypeList result = SearchParamTypeList.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertSearchParamTypeListToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SlicingRulesList createSlicingRulesListFromString(EDataType eDataType, String initialValue) {
		SlicingRulesList result = SlicingRulesList.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertSlicingRulesListToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SlotStatusList createSlotStatusListFromString(EDataType eDataType, String initialValue) {
		SlotStatusList result = SlotStatusList.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertSlotStatusListToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SpecimenStatusList createSpecimenStatusListFromString(EDataType eDataType, String initialValue) {
		SpecimenStatusList result = SpecimenStatusList.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertSpecimenStatusListToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public StructureDefinitionKindList createStructureDefinitionKindListFromString(EDataType eDataType, String initialValue) {
		StructureDefinitionKindList result = StructureDefinitionKindList.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertStructureDefinitionKindListToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public StructureMapContextTypeList createStructureMapContextTypeListFromString(EDataType eDataType, String initialValue) {
		StructureMapContextTypeList result = StructureMapContextTypeList.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertStructureMapContextTypeListToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public StructureMapGroupTypeModeList createStructureMapGroupTypeModeListFromString(EDataType eDataType, String initialValue) {
		StructureMapGroupTypeModeList result = StructureMapGroupTypeModeList.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertStructureMapGroupTypeModeListToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public StructureMapInputModeList createStructureMapInputModeListFromString(EDataType eDataType, String initialValue) {
		StructureMapInputModeList result = StructureMapInputModeList.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertStructureMapInputModeListToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public StructureMapModelModeList createStructureMapModelModeListFromString(EDataType eDataType, String initialValue) {
		StructureMapModelModeList result = StructureMapModelModeList.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertStructureMapModelModeListToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public StructureMapSourceListModeList createStructureMapSourceListModeListFromString(EDataType eDataType, String initialValue) {
		StructureMapSourceListModeList result = StructureMapSourceListModeList.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertStructureMapSourceListModeListToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public StructureMapTargetListModeList createStructureMapTargetListModeListFromString(EDataType eDataType, String initialValue) {
		StructureMapTargetListModeList result = StructureMapTargetListModeList.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertStructureMapTargetListModeListToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public StructureMapTransformList createStructureMapTransformListFromString(EDataType eDataType, String initialValue) {
		StructureMapTransformList result = StructureMapTransformList.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertStructureMapTransformListToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SubscriptionChannelTypeList createSubscriptionChannelTypeListFromString(EDataType eDataType, String initialValue) {
		SubscriptionChannelTypeList result = SubscriptionChannelTypeList.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertSubscriptionChannelTypeListToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SubscriptionStatusList createSubscriptionStatusListFromString(EDataType eDataType, String initialValue) {
		SubscriptionStatusList result = SubscriptionStatusList.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertSubscriptionStatusListToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SupplyDeliveryStatusList createSupplyDeliveryStatusListFromString(EDataType eDataType, String initialValue) {
		SupplyDeliveryStatusList result = SupplyDeliveryStatusList.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertSupplyDeliveryStatusListToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SupplyRequestStatusList createSupplyRequestStatusListFromString(EDataType eDataType, String initialValue) {
		SupplyRequestStatusList result = SupplyRequestStatusList.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertSupplyRequestStatusListToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SystemRestfulInteractionList createSystemRestfulInteractionListFromString(EDataType eDataType, String initialValue) {
		SystemRestfulInteractionList result = SystemRestfulInteractionList.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertSystemRestfulInteractionListToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SystemVersionProcessingModeList createSystemVersionProcessingModeListFromString(EDataType eDataType, String initialValue) {
		SystemVersionProcessingModeList result = SystemVersionProcessingModeList.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertSystemVersionProcessingModeListToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TaskStatusList createTaskStatusListFromString(EDataType eDataType, String initialValue) {
		TaskStatusList result = TaskStatusList.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertTaskStatusListToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TestReportActionResultList createTestReportActionResultListFromString(EDataType eDataType, String initialValue) {
		TestReportActionResultList result = TestReportActionResultList.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertTestReportActionResultListToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TestReportParticipantTypeList createTestReportParticipantTypeListFromString(EDataType eDataType, String initialValue) {
		TestReportParticipantTypeList result = TestReportParticipantTypeList.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertTestReportParticipantTypeListToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TestReportResultList createTestReportResultListFromString(EDataType eDataType, String initialValue) {
		TestReportResultList result = TestReportResultList.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertTestReportResultListToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TestReportStatusList createTestReportStatusListFromString(EDataType eDataType, String initialValue) {
		TestReportStatusList result = TestReportStatusList.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertTestReportStatusListToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TestScriptRequestMethodCodeList createTestScriptRequestMethodCodeListFromString(EDataType eDataType, String initialValue) {
		TestScriptRequestMethodCodeList result = TestScriptRequestMethodCodeList.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertTestScriptRequestMethodCodeListToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TriggerTypeList createTriggerTypeListFromString(EDataType eDataType, String initialValue) {
		TriggerTypeList result = TriggerTypeList.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertTriggerTypeListToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TypeDerivationRuleList createTypeDerivationRuleListFromString(EDataType eDataType, String initialValue) {
		TypeDerivationRuleList result = TypeDerivationRuleList.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertTypeDerivationRuleListToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TypeRestfulInteractionList createTypeRestfulInteractionListFromString(EDataType eDataType, String initialValue) {
		TypeRestfulInteractionList result = TypeRestfulInteractionList.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertTypeRestfulInteractionListToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public UDIEntryTypeList createUDIEntryTypeListFromString(EDataType eDataType, String initialValue) {
		UDIEntryTypeList result = UDIEntryTypeList.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertUDIEntryTypeListToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public UnitsOfTimeList createUnitsOfTimeListFromString(EDataType eDataType, String initialValue) {
		UnitsOfTimeList result = UnitsOfTimeList.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertUnitsOfTimeListToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public UnknownContentCodeList createUnknownContentCodeListFromString(EDataType eDataType, String initialValue) {
		UnknownContentCodeList result = UnknownContentCodeList.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertUnknownContentCodeListToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public UseList createUseListFromString(EDataType eDataType, String initialValue) {
		UseList result = UseList.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertUseListToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public VisionBaseList createVisionBaseListFromString(EDataType eDataType, String initialValue) {
		VisionBaseList result = VisionBaseList.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertVisionBaseListToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public VisionEyesList createVisionEyesListFromString(EDataType eDataType, String initialValue) {
		VisionEyesList result = VisionEyesList.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertVisionEyesListToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public XPathUsageTypeList createXPathUsageTypeListFromString(EDataType eDataType, String initialValue) {
		XPathUsageTypeList result = XPathUsageTypeList.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertXPathUsageTypeListToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AccountStatusList createAccountStatusListObjectFromString(EDataType eDataType, String initialValue) {
		return createAccountStatusListFromString(FhirPackage.eINSTANCE.getAccountStatusList(), initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertAccountStatusListObjectToString(EDataType eDataType, Object instanceValue) {
		return convertAccountStatusListToString(FhirPackage.eINSTANCE.getAccountStatusList(), instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ActionCardinalityBehaviorList createActionCardinalityBehaviorListObjectFromString(EDataType eDataType, String initialValue) {
		return createActionCardinalityBehaviorListFromString(FhirPackage.eINSTANCE.getActionCardinalityBehaviorList(), initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertActionCardinalityBehaviorListObjectToString(EDataType eDataType, Object instanceValue) {
		return convertActionCardinalityBehaviorListToString(FhirPackage.eINSTANCE.getActionCardinalityBehaviorList(), instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ActionConditionKindList createActionConditionKindListObjectFromString(EDataType eDataType, String initialValue) {
		return createActionConditionKindListFromString(FhirPackage.eINSTANCE.getActionConditionKindList(), initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertActionConditionKindListObjectToString(EDataType eDataType, Object instanceValue) {
		return convertActionConditionKindListToString(FhirPackage.eINSTANCE.getActionConditionKindList(), instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ActionGroupingBehaviorList createActionGroupingBehaviorListObjectFromString(EDataType eDataType, String initialValue) {
		return createActionGroupingBehaviorListFromString(FhirPackage.eINSTANCE.getActionGroupingBehaviorList(), initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertActionGroupingBehaviorListObjectToString(EDataType eDataType, Object instanceValue) {
		return convertActionGroupingBehaviorListToString(FhirPackage.eINSTANCE.getActionGroupingBehaviorList(), instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ActionListList createActionListListObjectFromString(EDataType eDataType, String initialValue) {
		return createActionListListFromString(FhirPackage.eINSTANCE.getActionListList(), initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertActionListListObjectToString(EDataType eDataType, Object instanceValue) {
		return convertActionListListToString(FhirPackage.eINSTANCE.getActionListList(), instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ActionParticipantTypeList createActionParticipantTypeListObjectFromString(EDataType eDataType, String initialValue) {
		return createActionParticipantTypeListFromString(FhirPackage.eINSTANCE.getActionParticipantTypeList(), initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertActionParticipantTypeListObjectToString(EDataType eDataType, Object instanceValue) {
		return convertActionParticipantTypeListToString(FhirPackage.eINSTANCE.getActionParticipantTypeList(), instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ActionPrecheckBehaviorList createActionPrecheckBehaviorListObjectFromString(EDataType eDataType, String initialValue) {
		return createActionPrecheckBehaviorListFromString(FhirPackage.eINSTANCE.getActionPrecheckBehaviorList(), initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertActionPrecheckBehaviorListObjectToString(EDataType eDataType, Object instanceValue) {
		return convertActionPrecheckBehaviorListToString(FhirPackage.eINSTANCE.getActionPrecheckBehaviorList(), instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ActionRelationshipTypeList createActionRelationshipTypeListObjectFromString(EDataType eDataType, String initialValue) {
		return createActionRelationshipTypeListFromString(FhirPackage.eINSTANCE.getActionRelationshipTypeList(), initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertActionRelationshipTypeListObjectToString(EDataType eDataType, Object instanceValue) {
		return convertActionRelationshipTypeListToString(FhirPackage.eINSTANCE.getActionRelationshipTypeList(), instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ActionRequiredBehaviorList createActionRequiredBehaviorListObjectFromString(EDataType eDataType, String initialValue) {
		return createActionRequiredBehaviorListFromString(FhirPackage.eINSTANCE.getActionRequiredBehaviorList(), initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertActionRequiredBehaviorListObjectToString(EDataType eDataType, Object instanceValue) {
		return convertActionRequiredBehaviorListToString(FhirPackage.eINSTANCE.getActionRequiredBehaviorList(), instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ActionSelectionBehaviorList createActionSelectionBehaviorListObjectFromString(EDataType eDataType, String initialValue) {
		return createActionSelectionBehaviorListFromString(FhirPackage.eINSTANCE.getActionSelectionBehaviorList(), initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertActionSelectionBehaviorListObjectToString(EDataType eDataType, Object instanceValue) {
		return convertActionSelectionBehaviorListToString(FhirPackage.eINSTANCE.getActionSelectionBehaviorList(), instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AddressTypeList createAddressTypeListObjectFromString(EDataType eDataType, String initialValue) {
		return createAddressTypeListFromString(FhirPackage.eINSTANCE.getAddressTypeList(), initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertAddressTypeListObjectToString(EDataType eDataType, Object instanceValue) {
		return convertAddressTypeListToString(FhirPackage.eINSTANCE.getAddressTypeList(), instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AddressUseList createAddressUseListObjectFromString(EDataType eDataType, String initialValue) {
		return createAddressUseListFromString(FhirPackage.eINSTANCE.getAddressUseList(), initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertAddressUseListObjectToString(EDataType eDataType, Object instanceValue) {
		return convertAddressUseListToString(FhirPackage.eINSTANCE.getAddressUseList(), instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AdministrativeGenderList createAdministrativeGenderListObjectFromString(EDataType eDataType, String initialValue) {
		return createAdministrativeGenderListFromString(FhirPackage.eINSTANCE.getAdministrativeGenderList(), initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertAdministrativeGenderListObjectToString(EDataType eDataType, Object instanceValue) {
		return convertAdministrativeGenderListToString(FhirPackage.eINSTANCE.getAdministrativeGenderList(), instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AdverseEventCategoryList createAdverseEventCategoryListObjectFromString(EDataType eDataType, String initialValue) {
		return createAdverseEventCategoryListFromString(FhirPackage.eINSTANCE.getAdverseEventCategoryList(), initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertAdverseEventCategoryListObjectToString(EDataType eDataType, Object instanceValue) {
		return convertAdverseEventCategoryListToString(FhirPackage.eINSTANCE.getAdverseEventCategoryList(), instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AdverseEventCausalityList createAdverseEventCausalityListObjectFromString(EDataType eDataType, String initialValue) {
		return createAdverseEventCausalityListFromString(FhirPackage.eINSTANCE.getAdverseEventCausalityList(), initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertAdverseEventCausalityListObjectToString(EDataType eDataType, Object instanceValue) {
		return convertAdverseEventCausalityListToString(FhirPackage.eINSTANCE.getAdverseEventCausalityList(), instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AggregationModeList createAggregationModeListObjectFromString(EDataType eDataType, String initialValue) {
		return createAggregationModeListFromString(FhirPackage.eINSTANCE.getAggregationModeList(), initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertAggregationModeListObjectToString(EDataType eDataType, Object instanceValue) {
		return convertAggregationModeListToString(FhirPackage.eINSTANCE.getAggregationModeList(), instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AllergyIntoleranceCategoryList createAllergyIntoleranceCategoryListObjectFromString(EDataType eDataType, String initialValue) {
		return createAllergyIntoleranceCategoryListFromString(FhirPackage.eINSTANCE.getAllergyIntoleranceCategoryList(), initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertAllergyIntoleranceCategoryListObjectToString(EDataType eDataType, Object instanceValue) {
		return convertAllergyIntoleranceCategoryListToString(FhirPackage.eINSTANCE.getAllergyIntoleranceCategoryList(), instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AllergyIntoleranceClinicalStatusList createAllergyIntoleranceClinicalStatusListObjectFromString(EDataType eDataType, String initialValue) {
		return createAllergyIntoleranceClinicalStatusListFromString(FhirPackage.eINSTANCE.getAllergyIntoleranceClinicalStatusList(), initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertAllergyIntoleranceClinicalStatusListObjectToString(EDataType eDataType, Object instanceValue) {
		return convertAllergyIntoleranceClinicalStatusListToString(FhirPackage.eINSTANCE.getAllergyIntoleranceClinicalStatusList(), instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AllergyIntoleranceCriticalityList createAllergyIntoleranceCriticalityListObjectFromString(EDataType eDataType, String initialValue) {
		return createAllergyIntoleranceCriticalityListFromString(FhirPackage.eINSTANCE.getAllergyIntoleranceCriticalityList(), initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertAllergyIntoleranceCriticalityListObjectToString(EDataType eDataType, Object instanceValue) {
		return convertAllergyIntoleranceCriticalityListToString(FhirPackage.eINSTANCE.getAllergyIntoleranceCriticalityList(), instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AllergyIntoleranceSeverityList createAllergyIntoleranceSeverityListObjectFromString(EDataType eDataType, String initialValue) {
		return createAllergyIntoleranceSeverityListFromString(FhirPackage.eINSTANCE.getAllergyIntoleranceSeverityList(), initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertAllergyIntoleranceSeverityListObjectToString(EDataType eDataType, Object instanceValue) {
		return convertAllergyIntoleranceSeverityListToString(FhirPackage.eINSTANCE.getAllergyIntoleranceSeverityList(), instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AllergyIntoleranceTypeList createAllergyIntoleranceTypeListObjectFromString(EDataType eDataType, String initialValue) {
		return createAllergyIntoleranceTypeListFromString(FhirPackage.eINSTANCE.getAllergyIntoleranceTypeList(), initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertAllergyIntoleranceTypeListObjectToString(EDataType eDataType, Object instanceValue) {
		return convertAllergyIntoleranceTypeListToString(FhirPackage.eINSTANCE.getAllergyIntoleranceTypeList(), instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AllergyIntoleranceVerificationStatusList createAllergyIntoleranceVerificationStatusListObjectFromString(EDataType eDataType, String initialValue) {
		return createAllergyIntoleranceVerificationStatusListFromString(FhirPackage.eINSTANCE.getAllergyIntoleranceVerificationStatusList(), initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertAllergyIntoleranceVerificationStatusListObjectToString(EDataType eDataType, Object instanceValue) {
		return convertAllergyIntoleranceVerificationStatusListToString(FhirPackage.eINSTANCE.getAllergyIntoleranceVerificationStatusList(), instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AppointmentStatusList createAppointmentStatusListObjectFromString(EDataType eDataType, String initialValue) {
		return createAppointmentStatusListFromString(FhirPackage.eINSTANCE.getAppointmentStatusList(), initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertAppointmentStatusListObjectToString(EDataType eDataType, Object instanceValue) {
		return convertAppointmentStatusListToString(FhirPackage.eINSTANCE.getAppointmentStatusList(), instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AssertionDirectionTypeList createAssertionDirectionTypeListObjectFromString(EDataType eDataType, String initialValue) {
		return createAssertionDirectionTypeListFromString(FhirPackage.eINSTANCE.getAssertionDirectionTypeList(), initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertAssertionDirectionTypeListObjectToString(EDataType eDataType, Object instanceValue) {
		return convertAssertionDirectionTypeListToString(FhirPackage.eINSTANCE.getAssertionDirectionTypeList(), instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AssertionOperatorTypeList createAssertionOperatorTypeListObjectFromString(EDataType eDataType, String initialValue) {
		return createAssertionOperatorTypeListFromString(FhirPackage.eINSTANCE.getAssertionOperatorTypeList(), initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertAssertionOperatorTypeListObjectToString(EDataType eDataType, Object instanceValue) {
		return convertAssertionOperatorTypeListToString(FhirPackage.eINSTANCE.getAssertionOperatorTypeList(), instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AssertionResponseTypesList createAssertionResponseTypesListObjectFromString(EDataType eDataType, String initialValue) {
		return createAssertionResponseTypesListFromString(FhirPackage.eINSTANCE.getAssertionResponseTypesList(), initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertAssertionResponseTypesListObjectToString(EDataType eDataType, Object instanceValue) {
		return convertAssertionResponseTypesListToString(FhirPackage.eINSTANCE.getAssertionResponseTypesList(), instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AuditEventActionList createAuditEventActionListObjectFromString(EDataType eDataType, String initialValue) {
		return createAuditEventActionListFromString(FhirPackage.eINSTANCE.getAuditEventActionList(), initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertAuditEventActionListObjectToString(EDataType eDataType, Object instanceValue) {
		return convertAuditEventActionListToString(FhirPackage.eINSTANCE.getAuditEventActionList(), instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AuditEventAgentNetworkTypeList createAuditEventAgentNetworkTypeListObjectFromString(EDataType eDataType, String initialValue) {
		return createAuditEventAgentNetworkTypeListFromString(FhirPackage.eINSTANCE.getAuditEventAgentNetworkTypeList(), initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertAuditEventAgentNetworkTypeListObjectToString(EDataType eDataType, Object instanceValue) {
		return convertAuditEventAgentNetworkTypeListToString(FhirPackage.eINSTANCE.getAuditEventAgentNetworkTypeList(), instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AuditEventOutcomeList createAuditEventOutcomeListObjectFromString(EDataType eDataType, String initialValue) {
		return createAuditEventOutcomeListFromString(FhirPackage.eINSTANCE.getAuditEventOutcomeList(), initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertAuditEventOutcomeListObjectToString(EDataType eDataType, Object instanceValue) {
		return convertAuditEventOutcomeListToString(FhirPackage.eINSTANCE.getAuditEventOutcomeList(), instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public byte[] createBase64BinaryPrimitiveFromString(EDataType eDataType, String initialValue) {
		return (byte[])XMLTypeFactory.eINSTANCE.createFromString(XMLTypePackage.Literals.BASE64_BINARY, initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertBase64BinaryPrimitiveToString(EDataType eDataType, Object instanceValue) {
		return XMLTypeFactory.eINSTANCE.convertToString(XMLTypePackage.Literals.BASE64_BINARY, instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public BindingStrengthList createBindingStrengthListObjectFromString(EDataType eDataType, String initialValue) {
		return createBindingStrengthListFromString(FhirPackage.eINSTANCE.getBindingStrengthList(), initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertBindingStrengthListObjectToString(EDataType eDataType, Object instanceValue) {
		return convertBindingStrengthListToString(FhirPackage.eINSTANCE.getBindingStrengthList(), instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Boolean createBooleanPrimitiveFromString(EDataType eDataType, String initialValue) {
		return (Boolean)XMLTypeFactory.eINSTANCE.createFromString(XMLTypePackage.Literals.BOOLEAN, initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertBooleanPrimitiveToString(EDataType eDataType, Object instanceValue) {
		return XMLTypeFactory.eINSTANCE.convertToString(XMLTypePackage.Literals.BOOLEAN, instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Boolean createBooleanPrimitiveObjectFromString(EDataType eDataType, String initialValue) {
		return createBooleanPrimitiveFromString(FhirPackage.eINSTANCE.getBooleanPrimitive(), initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertBooleanPrimitiveObjectToString(EDataType eDataType, Object instanceValue) {
		return convertBooleanPrimitiveToString(FhirPackage.eINSTANCE.getBooleanPrimitive(), instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public BundleTypeList createBundleTypeListObjectFromString(EDataType eDataType, String initialValue) {
		return createBundleTypeListFromString(FhirPackage.eINSTANCE.getBundleTypeList(), initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertBundleTypeListObjectToString(EDataType eDataType, Object instanceValue) {
		return convertBundleTypeListToString(FhirPackage.eINSTANCE.getBundleTypeList(), instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CapabilityStatementKindList createCapabilityStatementKindListObjectFromString(EDataType eDataType, String initialValue) {
		return createCapabilityStatementKindListFromString(FhirPackage.eINSTANCE.getCapabilityStatementKindList(), initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertCapabilityStatementKindListObjectToString(EDataType eDataType, Object instanceValue) {
		return convertCapabilityStatementKindListToString(FhirPackage.eINSTANCE.getCapabilityStatementKindList(), instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CarePlanActivityStatusList createCarePlanActivityStatusListObjectFromString(EDataType eDataType, String initialValue) {
		return createCarePlanActivityStatusListFromString(FhirPackage.eINSTANCE.getCarePlanActivityStatusList(), initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertCarePlanActivityStatusListObjectToString(EDataType eDataType, Object instanceValue) {
		return convertCarePlanActivityStatusListToString(FhirPackage.eINSTANCE.getCarePlanActivityStatusList(), instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CarePlanIntentList createCarePlanIntentListObjectFromString(EDataType eDataType, String initialValue) {
		return createCarePlanIntentListFromString(FhirPackage.eINSTANCE.getCarePlanIntentList(), initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertCarePlanIntentListObjectToString(EDataType eDataType, Object instanceValue) {
		return convertCarePlanIntentListToString(FhirPackage.eINSTANCE.getCarePlanIntentList(), instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CarePlanStatusList createCarePlanStatusListObjectFromString(EDataType eDataType, String initialValue) {
		return createCarePlanStatusListFromString(FhirPackage.eINSTANCE.getCarePlanStatusList(), initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertCarePlanStatusListObjectToString(EDataType eDataType, Object instanceValue) {
		return convertCarePlanStatusListToString(FhirPackage.eINSTANCE.getCarePlanStatusList(), instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CareTeamStatusList createCareTeamStatusListObjectFromString(EDataType eDataType, String initialValue) {
		return createCareTeamStatusListFromString(FhirPackage.eINSTANCE.getCareTeamStatusList(), initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertCareTeamStatusListObjectToString(EDataType eDataType, Object instanceValue) {
		return convertCareTeamStatusListToString(FhirPackage.eINSTANCE.getCareTeamStatusList(), instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ChargeItemStatusList createChargeItemStatusListObjectFromString(EDataType eDataType, String initialValue) {
		return createChargeItemStatusListFromString(FhirPackage.eINSTANCE.getChargeItemStatusList(), initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertChargeItemStatusListObjectToString(EDataType eDataType, Object instanceValue) {
		return convertChargeItemStatusListToString(FhirPackage.eINSTANCE.getChargeItemStatusList(), instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ClinicalImpressionStatusList createClinicalImpressionStatusListObjectFromString(EDataType eDataType, String initialValue) {
		return createClinicalImpressionStatusListFromString(FhirPackage.eINSTANCE.getClinicalImpressionStatusList(), initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertClinicalImpressionStatusListObjectToString(EDataType eDataType, Object instanceValue) {
		return convertClinicalImpressionStatusListToString(FhirPackage.eINSTANCE.getClinicalImpressionStatusList(), instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String createCodePrimitiveFromString(EDataType eDataType, String initialValue) {
		return (String)XMLTypeFactory.eINSTANCE.createFromString(XMLTypePackage.Literals.TOKEN, initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertCodePrimitiveToString(EDataType eDataType, Object instanceValue) {
		return XMLTypeFactory.eINSTANCE.convertToString(XMLTypePackage.Literals.TOKEN, instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CodeSystemContentModeList createCodeSystemContentModeListObjectFromString(EDataType eDataType, String initialValue) {
		return createCodeSystemContentModeListFromString(FhirPackage.eINSTANCE.getCodeSystemContentModeList(), initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertCodeSystemContentModeListObjectToString(EDataType eDataType, Object instanceValue) {
		return convertCodeSystemContentModeListToString(FhirPackage.eINSTANCE.getCodeSystemContentModeList(), instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CodeSystemHierarchyMeaningList createCodeSystemHierarchyMeaningListObjectFromString(EDataType eDataType, String initialValue) {
		return createCodeSystemHierarchyMeaningListFromString(FhirPackage.eINSTANCE.getCodeSystemHierarchyMeaningList(), initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertCodeSystemHierarchyMeaningListObjectToString(EDataType eDataType, Object instanceValue) {
		return convertCodeSystemHierarchyMeaningListToString(FhirPackage.eINSTANCE.getCodeSystemHierarchyMeaningList(), instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CompartmentTypeList createCompartmentTypeListObjectFromString(EDataType eDataType, String initialValue) {
		return createCompartmentTypeListFromString(FhirPackage.eINSTANCE.getCompartmentTypeList(), initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertCompartmentTypeListObjectToString(EDataType eDataType, Object instanceValue) {
		return convertCompartmentTypeListToString(FhirPackage.eINSTANCE.getCompartmentTypeList(), instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CompositionAttestationModeList createCompositionAttestationModeListObjectFromString(EDataType eDataType, String initialValue) {
		return createCompositionAttestationModeListFromString(FhirPackage.eINSTANCE.getCompositionAttestationModeList(), initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertCompositionAttestationModeListObjectToString(EDataType eDataType, Object instanceValue) {
		return convertCompositionAttestationModeListToString(FhirPackage.eINSTANCE.getCompositionAttestationModeList(), instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CompositionStatusList createCompositionStatusListObjectFromString(EDataType eDataType, String initialValue) {
		return createCompositionStatusListFromString(FhirPackage.eINSTANCE.getCompositionStatusList(), initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertCompositionStatusListObjectToString(EDataType eDataType, Object instanceValue) {
		return convertCompositionStatusListToString(FhirPackage.eINSTANCE.getCompositionStatusList(), instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ConceptMapEquivalenceList createConceptMapEquivalenceListObjectFromString(EDataType eDataType, String initialValue) {
		return createConceptMapEquivalenceListFromString(FhirPackage.eINSTANCE.getConceptMapEquivalenceList(), initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertConceptMapEquivalenceListObjectToString(EDataType eDataType, Object instanceValue) {
		return convertConceptMapEquivalenceListToString(FhirPackage.eINSTANCE.getConceptMapEquivalenceList(), instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ConceptMapGroupUnmappedModeList createConceptMapGroupUnmappedModeListObjectFromString(EDataType eDataType, String initialValue) {
		return createConceptMapGroupUnmappedModeListFromString(FhirPackage.eINSTANCE.getConceptMapGroupUnmappedModeList(), initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertConceptMapGroupUnmappedModeListObjectToString(EDataType eDataType, Object instanceValue) {
		return convertConceptMapGroupUnmappedModeListToString(FhirPackage.eINSTANCE.getConceptMapGroupUnmappedModeList(), instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ConditionalDeleteStatusList createConditionalDeleteStatusListObjectFromString(EDataType eDataType, String initialValue) {
		return createConditionalDeleteStatusListFromString(FhirPackage.eINSTANCE.getConditionalDeleteStatusList(), initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertConditionalDeleteStatusListObjectToString(EDataType eDataType, Object instanceValue) {
		return convertConditionalDeleteStatusListToString(FhirPackage.eINSTANCE.getConditionalDeleteStatusList(), instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ConditionalReadStatusList createConditionalReadStatusListObjectFromString(EDataType eDataType, String initialValue) {
		return createConditionalReadStatusListFromString(FhirPackage.eINSTANCE.getConditionalReadStatusList(), initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertConditionalReadStatusListObjectToString(EDataType eDataType, Object instanceValue) {
		return convertConditionalReadStatusListToString(FhirPackage.eINSTANCE.getConditionalReadStatusList(), instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ConditionClinicalStatusCodesList createConditionClinicalStatusCodesListObjectFromString(EDataType eDataType, String initialValue) {
		return createConditionClinicalStatusCodesListFromString(FhirPackage.eINSTANCE.getConditionClinicalStatusCodesList(), initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertConditionClinicalStatusCodesListObjectToString(EDataType eDataType, Object instanceValue) {
		return convertConditionClinicalStatusCodesListToString(FhirPackage.eINSTANCE.getConditionClinicalStatusCodesList(), instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ConditionVerificationStatusList createConditionVerificationStatusListObjectFromString(EDataType eDataType, String initialValue) {
		return createConditionVerificationStatusListFromString(FhirPackage.eINSTANCE.getConditionVerificationStatusList(), initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertConditionVerificationStatusListObjectToString(EDataType eDataType, Object instanceValue) {
		return convertConditionVerificationStatusListToString(FhirPackage.eINSTANCE.getConditionVerificationStatusList(), instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ConfidentialityClassificationList createConfidentialityClassificationListObjectFromString(EDataType eDataType, String initialValue) {
		return createConfidentialityClassificationListFromString(FhirPackage.eINSTANCE.getConfidentialityClassificationList(), initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertConfidentialityClassificationListObjectToString(EDataType eDataType, Object instanceValue) {
		return convertConfidentialityClassificationListToString(FhirPackage.eINSTANCE.getConfidentialityClassificationList(), instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ConsentDataMeaningList createConsentDataMeaningListObjectFromString(EDataType eDataType, String initialValue) {
		return createConsentDataMeaningListFromString(FhirPackage.eINSTANCE.getConsentDataMeaningList(), initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertConsentDataMeaningListObjectToString(EDataType eDataType, Object instanceValue) {
		return convertConsentDataMeaningListToString(FhirPackage.eINSTANCE.getConsentDataMeaningList(), instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ConsentExceptTypeList createConsentExceptTypeListObjectFromString(EDataType eDataType, String initialValue) {
		return createConsentExceptTypeListFromString(FhirPackage.eINSTANCE.getConsentExceptTypeList(), initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertConsentExceptTypeListObjectToString(EDataType eDataType, Object instanceValue) {
		return convertConsentExceptTypeListToString(FhirPackage.eINSTANCE.getConsentExceptTypeList(), instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ConsentStateList createConsentStateListObjectFromString(EDataType eDataType, String initialValue) {
		return createConsentStateListFromString(FhirPackage.eINSTANCE.getConsentStateList(), initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertConsentStateListObjectToString(EDataType eDataType, Object instanceValue) {
		return convertConsentStateListToString(FhirPackage.eINSTANCE.getConsentStateList(), instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ConstraintSeverityList createConstraintSeverityListObjectFromString(EDataType eDataType, String initialValue) {
		return createConstraintSeverityListFromString(FhirPackage.eINSTANCE.getConstraintSeverityList(), initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertConstraintSeverityListObjectToString(EDataType eDataType, Object instanceValue) {
		return convertConstraintSeverityListToString(FhirPackage.eINSTANCE.getConstraintSeverityList(), instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ContactPointSystemList createContactPointSystemListObjectFromString(EDataType eDataType, String initialValue) {
		return createContactPointSystemListFromString(FhirPackage.eINSTANCE.getContactPointSystemList(), initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertContactPointSystemListObjectToString(EDataType eDataType, Object instanceValue) {
		return convertContactPointSystemListToString(FhirPackage.eINSTANCE.getContactPointSystemList(), instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ContactPointUseList createContactPointUseListObjectFromString(EDataType eDataType, String initialValue) {
		return createContactPointUseListFromString(FhirPackage.eINSTANCE.getContactPointUseList(), initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertContactPointUseListObjectToString(EDataType eDataType, Object instanceValue) {
		return convertContactPointUseListToString(FhirPackage.eINSTANCE.getContactPointUseList(), instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ContentTypeList createContentTypeListObjectFromString(EDataType eDataType, String initialValue) {
		return createContentTypeListFromString(FhirPackage.eINSTANCE.getContentTypeList(), initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertContentTypeListObjectToString(EDataType eDataType, Object instanceValue) {
		return convertContentTypeListToString(FhirPackage.eINSTANCE.getContentTypeList(), instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ContractResourceStatusCodesList createContractResourceStatusCodesListObjectFromString(EDataType eDataType, String initialValue) {
		return createContractResourceStatusCodesListFromString(FhirPackage.eINSTANCE.getContractResourceStatusCodesList(), initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertContractResourceStatusCodesListObjectToString(EDataType eDataType, Object instanceValue) {
		return convertContractResourceStatusCodesListToString(FhirPackage.eINSTANCE.getContractResourceStatusCodesList(), instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ContributorTypeList createContributorTypeListObjectFromString(EDataType eDataType, String initialValue) {
		return createContributorTypeListFromString(FhirPackage.eINSTANCE.getContributorTypeList(), initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertContributorTypeListObjectToString(EDataType eDataType, Object instanceValue) {
		return convertContributorTypeListToString(FhirPackage.eINSTANCE.getContributorTypeList(), instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DataElementStringencyList createDataElementStringencyListObjectFromString(EDataType eDataType, String initialValue) {
		return createDataElementStringencyListFromString(FhirPackage.eINSTANCE.getDataElementStringencyList(), initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertDataElementStringencyListObjectToString(EDataType eDataType, Object instanceValue) {
		return convertDataElementStringencyListToString(FhirPackage.eINSTANCE.getDataElementStringencyList(), instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public XMLGregorianCalendar createDatePrimitiveFromString(EDataType eDataType, String initialValue) {
		return createDatePrimitiveBaseFromString(FhirPackage.eINSTANCE.getDatePrimitiveBase(), initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertDatePrimitiveToString(EDataType eDataType, Object instanceValue) {
		return convertDatePrimitiveBaseToString(FhirPackage.eINSTANCE.getDatePrimitiveBase(), instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public XMLGregorianCalendar createDatePrimitiveBaseFromString(EDataType eDataType, String initialValue) {
		if (initialValue == null) return null;
		XMLGregorianCalendar result = null;
		RuntimeException exception = null;
		try {
			result = (XMLGregorianCalendar)XMLTypeFactory.eINSTANCE.createFromString(XMLTypePackage.Literals.GYEAR, initialValue);
			if (result != null && Diagnostician.INSTANCE.validate(eDataType, result, null, null)) {
				return result;
			}
		}
		catch (RuntimeException e) {
			exception = e;
		}
		try {
			result = (XMLGregorianCalendar)XMLTypeFactory.eINSTANCE.createFromString(XMLTypePackage.Literals.GYEAR_MONTH, initialValue);
			if (result != null && Diagnostician.INSTANCE.validate(eDataType, result, null, null)) {
				return result;
			}
		}
		catch (RuntimeException e) {
			exception = e;
		}
		try {
			result = (XMLGregorianCalendar)XMLTypeFactory.eINSTANCE.createFromString(XMLTypePackage.Literals.DATE, initialValue);
			if (result != null && Diagnostician.INSTANCE.validate(eDataType, result, null, null)) {
				return result;
			}
		}
		catch (RuntimeException e) {
			exception = e;
		}
		if (result != null || exception == null) return result;
    
		throw exception;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertDatePrimitiveBaseToString(EDataType eDataType, Object instanceValue) {
		if (instanceValue == null) return null;
		if (XMLTypePackage.Literals.GYEAR.isInstance(instanceValue)) {
			try {
				String value = XMLTypeFactory.eINSTANCE.convertToString(XMLTypePackage.Literals.GYEAR, instanceValue);
				if (value != null) return value;
			}
			catch (Exception e) {
				// Keep trying other member types until all have failed.
			}
		}
		if (XMLTypePackage.Literals.GYEAR_MONTH.isInstance(instanceValue)) {
			try {
				String value = XMLTypeFactory.eINSTANCE.convertToString(XMLTypePackage.Literals.GYEAR_MONTH, instanceValue);
				if (value != null) return value;
			}
			catch (Exception e) {
				// Keep trying other member types until all have failed.
			}
		}
		if (XMLTypePackage.Literals.DATE.isInstance(instanceValue)) {
			try {
				String value = XMLTypeFactory.eINSTANCE.convertToString(XMLTypePackage.Literals.DATE, instanceValue);
				if (value != null) return value;
			}
			catch (Exception e) {
				// Keep trying other member types until all have failed.
			}
		}
		throw new IllegalArgumentException("Invalid value: '"+instanceValue+"' for datatype :"+eDataType.getName());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public XMLGregorianCalendar createDateTimePrimitiveFromString(EDataType eDataType, String initialValue) {
		return createDateTimePrimitiveBaseFromString(FhirPackage.eINSTANCE.getDateTimePrimitiveBase(), initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertDateTimePrimitiveToString(EDataType eDataType, Object instanceValue) {
		return convertDateTimePrimitiveBaseToString(FhirPackage.eINSTANCE.getDateTimePrimitiveBase(), instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public XMLGregorianCalendar createDateTimePrimitiveBaseFromString(EDataType eDataType, String initialValue) {
		if (initialValue == null) return null;
		XMLGregorianCalendar result = null;
		RuntimeException exception = null;
		try {
			result = (XMLGregorianCalendar)XMLTypeFactory.eINSTANCE.createFromString(XMLTypePackage.Literals.GYEAR, initialValue);
			if (result != null && Diagnostician.INSTANCE.validate(eDataType, result, null, null)) {
				return result;
			}
		}
		catch (RuntimeException e) {
			exception = e;
		}
		try {
			result = (XMLGregorianCalendar)XMLTypeFactory.eINSTANCE.createFromString(XMLTypePackage.Literals.GYEAR_MONTH, initialValue);
			if (result != null && Diagnostician.INSTANCE.validate(eDataType, result, null, null)) {
				return result;
			}
		}
		catch (RuntimeException e) {
			exception = e;
		}
		try {
			result = (XMLGregorianCalendar)XMLTypeFactory.eINSTANCE.createFromString(XMLTypePackage.Literals.DATE, initialValue);
			if (result != null && Diagnostician.INSTANCE.validate(eDataType, result, null, null)) {
				return result;
			}
		}
		catch (RuntimeException e) {
			exception = e;
		}
		try {
			result = (XMLGregorianCalendar)XMLTypeFactory.eINSTANCE.createFromString(XMLTypePackage.Literals.DATE_TIME, initialValue);
			if (result != null && Diagnostician.INSTANCE.validate(eDataType, result, null, null)) {
				return result;
			}
		}
		catch (RuntimeException e) {
			exception = e;
		}
		if (result != null || exception == null) return result;
    
		throw exception;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertDateTimePrimitiveBaseToString(EDataType eDataType, Object instanceValue) {
		if (instanceValue == null) return null;
		if (XMLTypePackage.Literals.GYEAR.isInstance(instanceValue)) {
			try {
				String value = XMLTypeFactory.eINSTANCE.convertToString(XMLTypePackage.Literals.GYEAR, instanceValue);
				if (value != null) return value;
			}
			catch (Exception e) {
				// Keep trying other member types until all have failed.
			}
		}
		if (XMLTypePackage.Literals.GYEAR_MONTH.isInstance(instanceValue)) {
			try {
				String value = XMLTypeFactory.eINSTANCE.convertToString(XMLTypePackage.Literals.GYEAR_MONTH, instanceValue);
				if (value != null) return value;
			}
			catch (Exception e) {
				// Keep trying other member types until all have failed.
			}
		}
		if (XMLTypePackage.Literals.DATE.isInstance(instanceValue)) {
			try {
				String value = XMLTypeFactory.eINSTANCE.convertToString(XMLTypePackage.Literals.DATE, instanceValue);
				if (value != null) return value;
			}
			catch (Exception e) {
				// Keep trying other member types until all have failed.
			}
		}
		if (XMLTypePackage.Literals.DATE_TIME.isInstance(instanceValue)) {
			try {
				String value = XMLTypeFactory.eINSTANCE.convertToString(XMLTypePackage.Literals.DATE_TIME, instanceValue);
				if (value != null) return value;
			}
			catch (Exception e) {
				// Keep trying other member types until all have failed.
			}
		}
		throw new IllegalArgumentException("Invalid value: '"+instanceValue+"' for datatype :"+eDataType.getName());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DaysOfWeekList createDaysOfWeekListObjectFromString(EDataType eDataType, String initialValue) {
		return createDaysOfWeekListFromString(FhirPackage.eINSTANCE.getDaysOfWeekList(), initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertDaysOfWeekListObjectToString(EDataType eDataType, Object instanceValue) {
		return convertDaysOfWeekListToString(FhirPackage.eINSTANCE.getDaysOfWeekList(), instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public BigDecimal createDecimalPrimitiveFromString(EDataType eDataType, String initialValue) {
		return (BigDecimal)XMLTypeFactory.eINSTANCE.createFromString(XMLTypePackage.Literals.DECIMAL, initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertDecimalPrimitiveToString(EDataType eDataType, Object instanceValue) {
		return XMLTypeFactory.eINSTANCE.convertToString(XMLTypePackage.Literals.DECIMAL, instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DetectedIssueSeverityList createDetectedIssueSeverityListObjectFromString(EDataType eDataType, String initialValue) {
		return createDetectedIssueSeverityListFromString(FhirPackage.eINSTANCE.getDetectedIssueSeverityList(), initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertDetectedIssueSeverityListObjectToString(EDataType eDataType, Object instanceValue) {
		return convertDetectedIssueSeverityListToString(FhirPackage.eINSTANCE.getDetectedIssueSeverityList(), instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DeviceMetricCalibrationStateList createDeviceMetricCalibrationStateListObjectFromString(EDataType eDataType, String initialValue) {
		return createDeviceMetricCalibrationStateListFromString(FhirPackage.eINSTANCE.getDeviceMetricCalibrationStateList(), initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertDeviceMetricCalibrationStateListObjectToString(EDataType eDataType, Object instanceValue) {
		return convertDeviceMetricCalibrationStateListToString(FhirPackage.eINSTANCE.getDeviceMetricCalibrationStateList(), instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DeviceMetricCalibrationTypeList createDeviceMetricCalibrationTypeListObjectFromString(EDataType eDataType, String initialValue) {
		return createDeviceMetricCalibrationTypeListFromString(FhirPackage.eINSTANCE.getDeviceMetricCalibrationTypeList(), initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertDeviceMetricCalibrationTypeListObjectToString(EDataType eDataType, Object instanceValue) {
		return convertDeviceMetricCalibrationTypeListToString(FhirPackage.eINSTANCE.getDeviceMetricCalibrationTypeList(), instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DeviceMetricCategoryList createDeviceMetricCategoryListObjectFromString(EDataType eDataType, String initialValue) {
		return createDeviceMetricCategoryListFromString(FhirPackage.eINSTANCE.getDeviceMetricCategoryList(), initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertDeviceMetricCategoryListObjectToString(EDataType eDataType, Object instanceValue) {
		return convertDeviceMetricCategoryListToString(FhirPackage.eINSTANCE.getDeviceMetricCategoryList(), instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DeviceMetricColorList createDeviceMetricColorListObjectFromString(EDataType eDataType, String initialValue) {
		return createDeviceMetricColorListFromString(FhirPackage.eINSTANCE.getDeviceMetricColorList(), initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertDeviceMetricColorListObjectToString(EDataType eDataType, Object instanceValue) {
		return convertDeviceMetricColorListToString(FhirPackage.eINSTANCE.getDeviceMetricColorList(), instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DeviceMetricOperationalStatusList createDeviceMetricOperationalStatusListObjectFromString(EDataType eDataType, String initialValue) {
		return createDeviceMetricOperationalStatusListFromString(FhirPackage.eINSTANCE.getDeviceMetricOperationalStatusList(), initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertDeviceMetricOperationalStatusListObjectToString(EDataType eDataType, Object instanceValue) {
		return convertDeviceMetricOperationalStatusListToString(FhirPackage.eINSTANCE.getDeviceMetricOperationalStatusList(), instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DeviceUseStatementStatusList createDeviceUseStatementStatusListObjectFromString(EDataType eDataType, String initialValue) {
		return createDeviceUseStatementStatusListFromString(FhirPackage.eINSTANCE.getDeviceUseStatementStatusList(), initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertDeviceUseStatementStatusListObjectToString(EDataType eDataType, Object instanceValue) {
		return convertDeviceUseStatementStatusListToString(FhirPackage.eINSTANCE.getDeviceUseStatementStatusList(), instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DiagnosticReportStatusList createDiagnosticReportStatusListObjectFromString(EDataType eDataType, String initialValue) {
		return createDiagnosticReportStatusListFromString(FhirPackage.eINSTANCE.getDiagnosticReportStatusList(), initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertDiagnosticReportStatusListObjectToString(EDataType eDataType, Object instanceValue) {
		return convertDiagnosticReportStatusListToString(FhirPackage.eINSTANCE.getDiagnosticReportStatusList(), instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DigitalMediaTypeList createDigitalMediaTypeListObjectFromString(EDataType eDataType, String initialValue) {
		return createDigitalMediaTypeListFromString(FhirPackage.eINSTANCE.getDigitalMediaTypeList(), initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertDigitalMediaTypeListObjectToString(EDataType eDataType, Object instanceValue) {
		return convertDigitalMediaTypeListToString(FhirPackage.eINSTANCE.getDigitalMediaTypeList(), instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DiscriminatorTypeList createDiscriminatorTypeListObjectFromString(EDataType eDataType, String initialValue) {
		return createDiscriminatorTypeListFromString(FhirPackage.eINSTANCE.getDiscriminatorTypeList(), initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertDiscriminatorTypeListObjectToString(EDataType eDataType, Object instanceValue) {
		return convertDiscriminatorTypeListToString(FhirPackage.eINSTANCE.getDiscriminatorTypeList(), instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DocumentModeList createDocumentModeListObjectFromString(EDataType eDataType, String initialValue) {
		return createDocumentModeListFromString(FhirPackage.eINSTANCE.getDocumentModeList(), initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertDocumentModeListObjectToString(EDataType eDataType, Object instanceValue) {
		return convertDocumentModeListToString(FhirPackage.eINSTANCE.getDocumentModeList(), instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DocumentReferenceStatusList createDocumentReferenceStatusListObjectFromString(EDataType eDataType, String initialValue) {
		return createDocumentReferenceStatusListFromString(FhirPackage.eINSTANCE.getDocumentReferenceStatusList(), initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertDocumentReferenceStatusListObjectToString(EDataType eDataType, Object instanceValue) {
		return convertDocumentReferenceStatusListToString(FhirPackage.eINSTANCE.getDocumentReferenceStatusList(), instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DocumentRelationshipTypeList createDocumentRelationshipTypeListObjectFromString(EDataType eDataType, String initialValue) {
		return createDocumentRelationshipTypeListFromString(FhirPackage.eINSTANCE.getDocumentRelationshipTypeList(), initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertDocumentRelationshipTypeListObjectToString(EDataType eDataType, Object instanceValue) {
		return convertDocumentRelationshipTypeListToString(FhirPackage.eINSTANCE.getDocumentRelationshipTypeList(), instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EncounterLocationStatusList createEncounterLocationStatusListObjectFromString(EDataType eDataType, String initialValue) {
		return createEncounterLocationStatusListFromString(FhirPackage.eINSTANCE.getEncounterLocationStatusList(), initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertEncounterLocationStatusListObjectToString(EDataType eDataType, Object instanceValue) {
		return convertEncounterLocationStatusListToString(FhirPackage.eINSTANCE.getEncounterLocationStatusList(), instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EncounterStatusList createEncounterStatusListObjectFromString(EDataType eDataType, String initialValue) {
		return createEncounterStatusListFromString(FhirPackage.eINSTANCE.getEncounterStatusList(), initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertEncounterStatusListObjectToString(EDataType eDataType, Object instanceValue) {
		return convertEncounterStatusListToString(FhirPackage.eINSTANCE.getEncounterStatusList(), instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EndpointStatusList createEndpointStatusListObjectFromString(EDataType eDataType, String initialValue) {
		return createEndpointStatusListFromString(FhirPackage.eINSTANCE.getEndpointStatusList(), initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertEndpointStatusListObjectToString(EDataType eDataType, Object instanceValue) {
		return convertEndpointStatusListToString(FhirPackage.eINSTANCE.getEndpointStatusList(), instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EpisodeOfCareStatusList createEpisodeOfCareStatusListObjectFromString(EDataType eDataType, String initialValue) {
		return createEpisodeOfCareStatusListFromString(FhirPackage.eINSTANCE.getEpisodeOfCareStatusList(), initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertEpisodeOfCareStatusListObjectToString(EDataType eDataType, Object instanceValue) {
		return convertEpisodeOfCareStatusListToString(FhirPackage.eINSTANCE.getEpisodeOfCareStatusList(), instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EventCapabilityModeList createEventCapabilityModeListObjectFromString(EDataType eDataType, String initialValue) {
		return createEventCapabilityModeListFromString(FhirPackage.eINSTANCE.getEventCapabilityModeList(), initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertEventCapabilityModeListObjectToString(EDataType eDataType, Object instanceValue) {
		return convertEventCapabilityModeListToString(FhirPackage.eINSTANCE.getEventCapabilityModeList(), instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EventStatusList createEventStatusListObjectFromString(EDataType eDataType, String initialValue) {
		return createEventStatusListFromString(FhirPackage.eINSTANCE.getEventStatusList(), initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertEventStatusListObjectToString(EDataType eDataType, Object instanceValue) {
		return convertEventStatusListToString(FhirPackage.eINSTANCE.getEventStatusList(), instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EventTimingList createEventTimingListObjectFromString(EDataType eDataType, String initialValue) {
		return createEventTimingListFromString(FhirPackage.eINSTANCE.getEventTimingList(), initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertEventTimingListObjectToString(EDataType eDataType, Object instanceValue) {
		return convertEventTimingListToString(FhirPackage.eINSTANCE.getEventTimingList(), instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ExplanationOfBenefitStatusList createExplanationOfBenefitStatusListObjectFromString(EDataType eDataType, String initialValue) {
		return createExplanationOfBenefitStatusListFromString(FhirPackage.eINSTANCE.getExplanationOfBenefitStatusList(), initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertExplanationOfBenefitStatusListObjectToString(EDataType eDataType, Object instanceValue) {
		return convertExplanationOfBenefitStatusListToString(FhirPackage.eINSTANCE.getExplanationOfBenefitStatusList(), instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ExtensionContextList createExtensionContextListObjectFromString(EDataType eDataType, String initialValue) {
		return createExtensionContextListFromString(FhirPackage.eINSTANCE.getExtensionContextList(), initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertExtensionContextListObjectToString(EDataType eDataType, Object instanceValue) {
		return convertExtensionContextListToString(FhirPackage.eINSTANCE.getExtensionContextList(), instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public FamilyHistoryStatusList createFamilyHistoryStatusListObjectFromString(EDataType eDataType, String initialValue) {
		return createFamilyHistoryStatusListFromString(FhirPackage.eINSTANCE.getFamilyHistoryStatusList(), initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertFamilyHistoryStatusListObjectToString(EDataType eDataType, Object instanceValue) {
		return convertFamilyHistoryStatusListToString(FhirPackage.eINSTANCE.getFamilyHistoryStatusList(), instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public FHIRAllTypesList createFHIRAllTypesListObjectFromString(EDataType eDataType, String initialValue) {
		return createFHIRAllTypesListFromString(FhirPackage.eINSTANCE.getFHIRAllTypesList(), initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertFHIRAllTypesListObjectToString(EDataType eDataType, Object instanceValue) {
		return convertFHIRAllTypesListToString(FhirPackage.eINSTANCE.getFHIRAllTypesList(), instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public FHIRDefinedTypeList createFHIRDefinedTypeListObjectFromString(EDataType eDataType, String initialValue) {
		return createFHIRDefinedTypeListFromString(FhirPackage.eINSTANCE.getFHIRDefinedTypeList(), initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertFHIRDefinedTypeListObjectToString(EDataType eDataType, Object instanceValue) {
		return convertFHIRDefinedTypeListToString(FhirPackage.eINSTANCE.getFHIRDefinedTypeList(), instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public FHIRDeviceStatusList createFHIRDeviceStatusListObjectFromString(EDataType eDataType, String initialValue) {
		return createFHIRDeviceStatusListFromString(FhirPackage.eINSTANCE.getFHIRDeviceStatusList(), initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertFHIRDeviceStatusListObjectToString(EDataType eDataType, Object instanceValue) {
		return convertFHIRDeviceStatusListToString(FhirPackage.eINSTANCE.getFHIRDeviceStatusList(), instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public FHIRSubstanceStatusList createFHIRSubstanceStatusListObjectFromString(EDataType eDataType, String initialValue) {
		return createFHIRSubstanceStatusListFromString(FhirPackage.eINSTANCE.getFHIRSubstanceStatusList(), initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertFHIRSubstanceStatusListObjectToString(EDataType eDataType, Object instanceValue) {
		return convertFHIRSubstanceStatusListToString(FhirPackage.eINSTANCE.getFHIRSubstanceStatusList(), instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public FilterOperatorList createFilterOperatorListObjectFromString(EDataType eDataType, String initialValue) {
		return createFilterOperatorListFromString(FhirPackage.eINSTANCE.getFilterOperatorList(), initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertFilterOperatorListObjectToString(EDataType eDataType, Object instanceValue) {
		return convertFilterOperatorListToString(FhirPackage.eINSTANCE.getFilterOperatorList(), instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public FinancialResourceStatusCodesList createFinancialResourceStatusCodesListObjectFromString(EDataType eDataType, String initialValue) {
		return createFinancialResourceStatusCodesListFromString(FhirPackage.eINSTANCE.getFinancialResourceStatusCodesList(), initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertFinancialResourceStatusCodesListObjectToString(EDataType eDataType, Object instanceValue) {
		return convertFinancialResourceStatusCodesListToString(FhirPackage.eINSTANCE.getFinancialResourceStatusCodesList(), instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public FlagStatusList createFlagStatusListObjectFromString(EDataType eDataType, String initialValue) {
		return createFlagStatusListFromString(FhirPackage.eINSTANCE.getFlagStatusList(), initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertFlagStatusListObjectToString(EDataType eDataType, Object instanceValue) {
		return convertFlagStatusListToString(FhirPackage.eINSTANCE.getFlagStatusList(), instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public GoalStatusList createGoalStatusListObjectFromString(EDataType eDataType, String initialValue) {
		return createGoalStatusListFromString(FhirPackage.eINSTANCE.getGoalStatusList(), initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertGoalStatusListObjectToString(EDataType eDataType, Object instanceValue) {
		return convertGoalStatusListToString(FhirPackage.eINSTANCE.getGoalStatusList(), instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public GraphCompartmentRuleList createGraphCompartmentRuleListObjectFromString(EDataType eDataType, String initialValue) {
		return createGraphCompartmentRuleListFromString(FhirPackage.eINSTANCE.getGraphCompartmentRuleList(), initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertGraphCompartmentRuleListObjectToString(EDataType eDataType, Object instanceValue) {
		return convertGraphCompartmentRuleListToString(FhirPackage.eINSTANCE.getGraphCompartmentRuleList(), instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public GroupTypeList createGroupTypeListObjectFromString(EDataType eDataType, String initialValue) {
		return createGroupTypeListFromString(FhirPackage.eINSTANCE.getGroupTypeList(), initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertGroupTypeListObjectToString(EDataType eDataType, Object instanceValue) {
		return convertGroupTypeListToString(FhirPackage.eINSTANCE.getGroupTypeList(), instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public GuidanceResponseStatusList createGuidanceResponseStatusListObjectFromString(EDataType eDataType, String initialValue) {
		return createGuidanceResponseStatusListFromString(FhirPackage.eINSTANCE.getGuidanceResponseStatusList(), initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertGuidanceResponseStatusListObjectToString(EDataType eDataType, Object instanceValue) {
		return convertGuidanceResponseStatusListToString(FhirPackage.eINSTANCE.getGuidanceResponseStatusList(), instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public GuideDependencyTypeList createGuideDependencyTypeListObjectFromString(EDataType eDataType, String initialValue) {
		return createGuideDependencyTypeListFromString(FhirPackage.eINSTANCE.getGuideDependencyTypeList(), initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertGuideDependencyTypeListObjectToString(EDataType eDataType, Object instanceValue) {
		return convertGuideDependencyTypeListToString(FhirPackage.eINSTANCE.getGuideDependencyTypeList(), instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public GuidePageKindList createGuidePageKindListObjectFromString(EDataType eDataType, String initialValue) {
		return createGuidePageKindListFromString(FhirPackage.eINSTANCE.getGuidePageKindList(), initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertGuidePageKindListObjectToString(EDataType eDataType, Object instanceValue) {
		return convertGuidePageKindListToString(FhirPackage.eINSTANCE.getGuidePageKindList(), instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public HTTPVerbList createHTTPVerbListObjectFromString(EDataType eDataType, String initialValue) {
		return createHTTPVerbListFromString(FhirPackage.eINSTANCE.getHTTPVerbList(), initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertHTTPVerbListObjectToString(EDataType eDataType, Object instanceValue) {
		return convertHTTPVerbListToString(FhirPackage.eINSTANCE.getHTTPVerbList(), instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public IdentifierUseList createIdentifierUseListObjectFromString(EDataType eDataType, String initialValue) {
		return createIdentifierUseListFromString(FhirPackage.eINSTANCE.getIdentifierUseList(), initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertIdentifierUseListObjectToString(EDataType eDataType, Object instanceValue) {
		return convertIdentifierUseListToString(FhirPackage.eINSTANCE.getIdentifierUseList(), instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public IdentityAssuranceLevelList createIdentityAssuranceLevelListObjectFromString(EDataType eDataType, String initialValue) {
		return createIdentityAssuranceLevelListFromString(FhirPackage.eINSTANCE.getIdentityAssuranceLevelList(), initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertIdentityAssuranceLevelListObjectToString(EDataType eDataType, Object instanceValue) {
		return convertIdentityAssuranceLevelListToString(FhirPackage.eINSTANCE.getIdentityAssuranceLevelList(), instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String createIdPrimitiveFromString(EDataType eDataType, String initialValue) {
		return (String)XMLTypeFactory.eINSTANCE.createFromString(XMLTypePackage.Literals.STRING, initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertIdPrimitiveToString(EDataType eDataType, Object instanceValue) {
		return XMLTypeFactory.eINSTANCE.convertToString(XMLTypePackage.Literals.STRING, instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ImmunizationStatusCodesList createImmunizationStatusCodesListObjectFromString(EDataType eDataType, String initialValue) {
		return createImmunizationStatusCodesListFromString(FhirPackage.eINSTANCE.getImmunizationStatusCodesList(), initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertImmunizationStatusCodesListObjectToString(EDataType eDataType, Object instanceValue) {
		return convertImmunizationStatusCodesListToString(FhirPackage.eINSTANCE.getImmunizationStatusCodesList(), instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public InstanceAvailabilityList createInstanceAvailabilityListObjectFromString(EDataType eDataType, String initialValue) {
		return createInstanceAvailabilityListFromString(FhirPackage.eINSTANCE.getInstanceAvailabilityList(), initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertInstanceAvailabilityListObjectToString(EDataType eDataType, Object instanceValue) {
		return convertInstanceAvailabilityListToString(FhirPackage.eINSTANCE.getInstanceAvailabilityList(), instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public XMLGregorianCalendar createInstantPrimitiveFromString(EDataType eDataType, String initialValue) {
		return (XMLGregorianCalendar)XMLTypeFactory.eINSTANCE.createFromString(XMLTypePackage.Literals.DATE_TIME, initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertInstantPrimitiveToString(EDataType eDataType, Object instanceValue) {
		return XMLTypeFactory.eINSTANCE.convertToString(XMLTypePackage.Literals.DATE_TIME, instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Integer createIntegerPrimitiveFromString(EDataType eDataType, String initialValue) {
		return (Integer)XMLTypeFactory.eINSTANCE.createFromString(XMLTypePackage.Literals.INT, initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertIntegerPrimitiveToString(EDataType eDataType, Object instanceValue) {
		return XMLTypeFactory.eINSTANCE.convertToString(XMLTypePackage.Literals.INT, instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Integer createIntegerPrimitiveObjectFromString(EDataType eDataType, String initialValue) {
		return createIntegerPrimitiveFromString(FhirPackage.eINSTANCE.getIntegerPrimitive(), initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertIntegerPrimitiveObjectToString(EDataType eDataType, Object instanceValue) {
		return convertIntegerPrimitiveToString(FhirPackage.eINSTANCE.getIntegerPrimitive(), instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public IssueSeverityList createIssueSeverityListObjectFromString(EDataType eDataType, String initialValue) {
		return createIssueSeverityListFromString(FhirPackage.eINSTANCE.getIssueSeverityList(), initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertIssueSeverityListObjectToString(EDataType eDataType, Object instanceValue) {
		return convertIssueSeverityListToString(FhirPackage.eINSTANCE.getIssueSeverityList(), instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public IssueTypeList createIssueTypeListObjectFromString(EDataType eDataType, String initialValue) {
		return createIssueTypeListFromString(FhirPackage.eINSTANCE.getIssueTypeList(), initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertIssueTypeListObjectToString(EDataType eDataType, Object instanceValue) {
		return convertIssueTypeListToString(FhirPackage.eINSTANCE.getIssueTypeList(), instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public LinkageTypeList createLinkageTypeListObjectFromString(EDataType eDataType, String initialValue) {
		return createLinkageTypeListFromString(FhirPackage.eINSTANCE.getLinkageTypeList(), initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertLinkageTypeListObjectToString(EDataType eDataType, Object instanceValue) {
		return convertLinkageTypeListToString(FhirPackage.eINSTANCE.getLinkageTypeList(), instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public LinkTypeList createLinkTypeListObjectFromString(EDataType eDataType, String initialValue) {
		return createLinkTypeListFromString(FhirPackage.eINSTANCE.getLinkTypeList(), initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertLinkTypeListObjectToString(EDataType eDataType, Object instanceValue) {
		return convertLinkTypeListToString(FhirPackage.eINSTANCE.getLinkTypeList(), instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ListModeList createListModeListObjectFromString(EDataType eDataType, String initialValue) {
		return createListModeListFromString(FhirPackage.eINSTANCE.getListModeList(), initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertListModeListObjectToString(EDataType eDataType, Object instanceValue) {
		return convertListModeListToString(FhirPackage.eINSTANCE.getListModeList(), instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ListStatusList createListStatusListObjectFromString(EDataType eDataType, String initialValue) {
		return createListStatusListFromString(FhirPackage.eINSTANCE.getListStatusList(), initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertListStatusListObjectToString(EDataType eDataType, Object instanceValue) {
		return convertListStatusListToString(FhirPackage.eINSTANCE.getListStatusList(), instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public LocationModeList createLocationModeListObjectFromString(EDataType eDataType, String initialValue) {
		return createLocationModeListFromString(FhirPackage.eINSTANCE.getLocationModeList(), initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertLocationModeListObjectToString(EDataType eDataType, Object instanceValue) {
		return convertLocationModeListToString(FhirPackage.eINSTANCE.getLocationModeList(), instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public LocationStatusList createLocationStatusListObjectFromString(EDataType eDataType, String initialValue) {
		return createLocationStatusListFromString(FhirPackage.eINSTANCE.getLocationStatusList(), initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertLocationStatusListObjectToString(EDataType eDataType, Object instanceValue) {
		return convertLocationStatusListToString(FhirPackage.eINSTANCE.getLocationStatusList(), instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String createMarkdownPrimitiveFromString(EDataType eDataType, String initialValue) {
		return (String)XMLTypeFactory.eINSTANCE.createFromString(XMLTypePackage.Literals.STRING, initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertMarkdownPrimitiveToString(EDataType eDataType, Object instanceValue) {
		return XMLTypeFactory.eINSTANCE.convertToString(XMLTypePackage.Literals.STRING, instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public MeasmntPrincipleList createMeasmntPrincipleListObjectFromString(EDataType eDataType, String initialValue) {
		return createMeasmntPrincipleListFromString(FhirPackage.eINSTANCE.getMeasmntPrincipleList(), initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertMeasmntPrincipleListObjectToString(EDataType eDataType, Object instanceValue) {
		return convertMeasmntPrincipleListToString(FhirPackage.eINSTANCE.getMeasmntPrincipleList(), instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public MeasureReportStatusList createMeasureReportStatusListObjectFromString(EDataType eDataType, String initialValue) {
		return createMeasureReportStatusListFromString(FhirPackage.eINSTANCE.getMeasureReportStatusList(), initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertMeasureReportStatusListObjectToString(EDataType eDataType, Object instanceValue) {
		return convertMeasureReportStatusListToString(FhirPackage.eINSTANCE.getMeasureReportStatusList(), instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public MeasureReportTypeList createMeasureReportTypeListObjectFromString(EDataType eDataType, String initialValue) {
		return createMeasureReportTypeListFromString(FhirPackage.eINSTANCE.getMeasureReportTypeList(), initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertMeasureReportTypeListObjectToString(EDataType eDataType, Object instanceValue) {
		return convertMeasureReportTypeListToString(FhirPackage.eINSTANCE.getMeasureReportTypeList(), instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public MedicationAdministrationStatusList createMedicationAdministrationStatusListObjectFromString(EDataType eDataType, String initialValue) {
		return createMedicationAdministrationStatusListFromString(FhirPackage.eINSTANCE.getMedicationAdministrationStatusList(), initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertMedicationAdministrationStatusListObjectToString(EDataType eDataType, Object instanceValue) {
		return convertMedicationAdministrationStatusListToString(FhirPackage.eINSTANCE.getMedicationAdministrationStatusList(), instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public MedicationDispenseStatusList createMedicationDispenseStatusListObjectFromString(EDataType eDataType, String initialValue) {
		return createMedicationDispenseStatusListFromString(FhirPackage.eINSTANCE.getMedicationDispenseStatusList(), initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertMedicationDispenseStatusListObjectToString(EDataType eDataType, Object instanceValue) {
		return convertMedicationDispenseStatusListToString(FhirPackage.eINSTANCE.getMedicationDispenseStatusList(), instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public MedicationRequestIntentList createMedicationRequestIntentListObjectFromString(EDataType eDataType, String initialValue) {
		return createMedicationRequestIntentListFromString(FhirPackage.eINSTANCE.getMedicationRequestIntentList(), initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertMedicationRequestIntentListObjectToString(EDataType eDataType, Object instanceValue) {
		return convertMedicationRequestIntentListToString(FhirPackage.eINSTANCE.getMedicationRequestIntentList(), instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public MedicationRequestPriorityList createMedicationRequestPriorityListObjectFromString(EDataType eDataType, String initialValue) {
		return createMedicationRequestPriorityListFromString(FhirPackage.eINSTANCE.getMedicationRequestPriorityList(), initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertMedicationRequestPriorityListObjectToString(EDataType eDataType, Object instanceValue) {
		return convertMedicationRequestPriorityListToString(FhirPackage.eINSTANCE.getMedicationRequestPriorityList(), instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public MedicationRequestStatusList createMedicationRequestStatusListObjectFromString(EDataType eDataType, String initialValue) {
		return createMedicationRequestStatusListFromString(FhirPackage.eINSTANCE.getMedicationRequestStatusList(), initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertMedicationRequestStatusListObjectToString(EDataType eDataType, Object instanceValue) {
		return convertMedicationRequestStatusListToString(FhirPackage.eINSTANCE.getMedicationRequestStatusList(), instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public MedicationStatementStatusList createMedicationStatementStatusListObjectFromString(EDataType eDataType, String initialValue) {
		return createMedicationStatementStatusListFromString(FhirPackage.eINSTANCE.getMedicationStatementStatusList(), initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertMedicationStatementStatusListObjectToString(EDataType eDataType, Object instanceValue) {
		return convertMedicationStatementStatusListToString(FhirPackage.eINSTANCE.getMedicationStatementStatusList(), instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public MedicationStatementTakenList createMedicationStatementTakenListObjectFromString(EDataType eDataType, String initialValue) {
		return createMedicationStatementTakenListFromString(FhirPackage.eINSTANCE.getMedicationStatementTakenList(), initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertMedicationStatementTakenListObjectToString(EDataType eDataType, Object instanceValue) {
		return convertMedicationStatementTakenListToString(FhirPackage.eINSTANCE.getMedicationStatementTakenList(), instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public MedicationStatusList createMedicationStatusListObjectFromString(EDataType eDataType, String initialValue) {
		return createMedicationStatusListFromString(FhirPackage.eINSTANCE.getMedicationStatusList(), initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertMedicationStatusListObjectToString(EDataType eDataType, Object instanceValue) {
		return convertMedicationStatusListToString(FhirPackage.eINSTANCE.getMedicationStatusList(), instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public MessageSignificanceCategoryList createMessageSignificanceCategoryListObjectFromString(EDataType eDataType, String initialValue) {
		return createMessageSignificanceCategoryListFromString(FhirPackage.eINSTANCE.getMessageSignificanceCategoryList(), initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertMessageSignificanceCategoryListObjectToString(EDataType eDataType, Object instanceValue) {
		return convertMessageSignificanceCategoryListToString(FhirPackage.eINSTANCE.getMessageSignificanceCategoryList(), instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NameUseList createNameUseListObjectFromString(EDataType eDataType, String initialValue) {
		return createNameUseListFromString(FhirPackage.eINSTANCE.getNameUseList(), initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertNameUseListObjectToString(EDataType eDataType, Object instanceValue) {
		return convertNameUseListToString(FhirPackage.eINSTANCE.getNameUseList(), instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NamingSystemIdentifierTypeList createNamingSystemIdentifierTypeListObjectFromString(EDataType eDataType, String initialValue) {
		return createNamingSystemIdentifierTypeListFromString(FhirPackage.eINSTANCE.getNamingSystemIdentifierTypeList(), initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertNamingSystemIdentifierTypeListObjectToString(EDataType eDataType, Object instanceValue) {
		return convertNamingSystemIdentifierTypeListToString(FhirPackage.eINSTANCE.getNamingSystemIdentifierTypeList(), instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NamingSystemTypeList createNamingSystemTypeListObjectFromString(EDataType eDataType, String initialValue) {
		return createNamingSystemTypeListFromString(FhirPackage.eINSTANCE.getNamingSystemTypeList(), initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertNamingSystemTypeListObjectToString(EDataType eDataType, Object instanceValue) {
		return convertNamingSystemTypeListToString(FhirPackage.eINSTANCE.getNamingSystemTypeList(), instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NarrativeStatusList createNarrativeStatusListObjectFromString(EDataType eDataType, String initialValue) {
		return createNarrativeStatusListFromString(FhirPackage.eINSTANCE.getNarrativeStatusList(), initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertNarrativeStatusListObjectToString(EDataType eDataType, Object instanceValue) {
		return convertNarrativeStatusListToString(FhirPackage.eINSTANCE.getNarrativeStatusList(), instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NoteTypeList createNoteTypeListObjectFromString(EDataType eDataType, String initialValue) {
		return createNoteTypeListFromString(FhirPackage.eINSTANCE.getNoteTypeList(), initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertNoteTypeListObjectToString(EDataType eDataType, Object instanceValue) {
		return convertNoteTypeListToString(FhirPackage.eINSTANCE.getNoteTypeList(), instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NutritionOrderStatusList createNutritionOrderStatusListObjectFromString(EDataType eDataType, String initialValue) {
		return createNutritionOrderStatusListFromString(FhirPackage.eINSTANCE.getNutritionOrderStatusList(), initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertNutritionOrderStatusListObjectToString(EDataType eDataType, Object instanceValue) {
		return convertNutritionOrderStatusListToString(FhirPackage.eINSTANCE.getNutritionOrderStatusList(), instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ObservationRelationshipTypeList createObservationRelationshipTypeListObjectFromString(EDataType eDataType, String initialValue) {
		return createObservationRelationshipTypeListFromString(FhirPackage.eINSTANCE.getObservationRelationshipTypeList(), initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertObservationRelationshipTypeListObjectToString(EDataType eDataType, Object instanceValue) {
		return convertObservationRelationshipTypeListToString(FhirPackage.eINSTANCE.getObservationRelationshipTypeList(), instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ObservationStatusList createObservationStatusListObjectFromString(EDataType eDataType, String initialValue) {
		return createObservationStatusListFromString(FhirPackage.eINSTANCE.getObservationStatusList(), initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertObservationStatusListObjectToString(EDataType eDataType, Object instanceValue) {
		return convertObservationStatusListToString(FhirPackage.eINSTANCE.getObservationStatusList(), instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String createOidPrimitiveFromString(EDataType eDataType, String initialValue) {
		return (String)XMLTypeFactory.eINSTANCE.createFromString(XMLTypePackage.Literals.ANY_URI, initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertOidPrimitiveToString(EDataType eDataType, Object instanceValue) {
		return XMLTypeFactory.eINSTANCE.convertToString(XMLTypePackage.Literals.ANY_URI, instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public OperationKindList createOperationKindListObjectFromString(EDataType eDataType, String initialValue) {
		return createOperationKindListFromString(FhirPackage.eINSTANCE.getOperationKindList(), initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertOperationKindListObjectToString(EDataType eDataType, Object instanceValue) {
		return convertOperationKindListToString(FhirPackage.eINSTANCE.getOperationKindList(), instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public OperationParameterUseList createOperationParameterUseListObjectFromString(EDataType eDataType, String initialValue) {
		return createOperationParameterUseListFromString(FhirPackage.eINSTANCE.getOperationParameterUseList(), initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertOperationParameterUseListObjectToString(EDataType eDataType, Object instanceValue) {
		return convertOperationParameterUseListToString(FhirPackage.eINSTANCE.getOperationParameterUseList(), instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ParticipantRequiredList createParticipantRequiredListObjectFromString(EDataType eDataType, String initialValue) {
		return createParticipantRequiredListFromString(FhirPackage.eINSTANCE.getParticipantRequiredList(), initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertParticipantRequiredListObjectToString(EDataType eDataType, Object instanceValue) {
		return convertParticipantRequiredListToString(FhirPackage.eINSTANCE.getParticipantRequiredList(), instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ParticipationStatusList createParticipationStatusListObjectFromString(EDataType eDataType, String initialValue) {
		return createParticipationStatusListFromString(FhirPackage.eINSTANCE.getParticipationStatusList(), initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertParticipationStatusListObjectToString(EDataType eDataType, Object instanceValue) {
		return convertParticipationStatusListToString(FhirPackage.eINSTANCE.getParticipationStatusList(), instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public BigInteger createPositiveIntPrimitiveFromString(EDataType eDataType, String initialValue) {
		return (BigInteger)XMLTypeFactory.eINSTANCE.createFromString(XMLTypePackage.Literals.POSITIVE_INTEGER, initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertPositiveIntPrimitiveToString(EDataType eDataType, Object instanceValue) {
		return XMLTypeFactory.eINSTANCE.convertToString(XMLTypePackage.Literals.POSITIVE_INTEGER, instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PropertyRepresentationList createPropertyRepresentationListObjectFromString(EDataType eDataType, String initialValue) {
		return createPropertyRepresentationListFromString(FhirPackage.eINSTANCE.getPropertyRepresentationList(), initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertPropertyRepresentationListObjectToString(EDataType eDataType, Object instanceValue) {
		return convertPropertyRepresentationListToString(FhirPackage.eINSTANCE.getPropertyRepresentationList(), instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PropertyTypeList createPropertyTypeListObjectFromString(EDataType eDataType, String initialValue) {
		return createPropertyTypeListFromString(FhirPackage.eINSTANCE.getPropertyTypeList(), initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertPropertyTypeListObjectToString(EDataType eDataType, Object instanceValue) {
		return convertPropertyTypeListToString(FhirPackage.eINSTANCE.getPropertyTypeList(), instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ProvenanceEntityRoleList createProvenanceEntityRoleListObjectFromString(EDataType eDataType, String initialValue) {
		return createProvenanceEntityRoleListFromString(FhirPackage.eINSTANCE.getProvenanceEntityRoleList(), initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertProvenanceEntityRoleListObjectToString(EDataType eDataType, Object instanceValue) {
		return convertProvenanceEntityRoleListToString(FhirPackage.eINSTANCE.getProvenanceEntityRoleList(), instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PublicationStatusList createPublicationStatusListObjectFromString(EDataType eDataType, String initialValue) {
		return createPublicationStatusListFromString(FhirPackage.eINSTANCE.getPublicationStatusList(), initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertPublicationStatusListObjectToString(EDataType eDataType, Object instanceValue) {
		return convertPublicationStatusListToString(FhirPackage.eINSTANCE.getPublicationStatusList(), instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public QualityTypeList createQualityTypeListObjectFromString(EDataType eDataType, String initialValue) {
		return createQualityTypeListFromString(FhirPackage.eINSTANCE.getQualityTypeList(), initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertQualityTypeListObjectToString(EDataType eDataType, Object instanceValue) {
		return convertQualityTypeListToString(FhirPackage.eINSTANCE.getQualityTypeList(), instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public QuantityComparatorList createQuantityComparatorListObjectFromString(EDataType eDataType, String initialValue) {
		return createQuantityComparatorListFromString(FhirPackage.eINSTANCE.getQuantityComparatorList(), initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertQuantityComparatorListObjectToString(EDataType eDataType, Object instanceValue) {
		return convertQuantityComparatorListToString(FhirPackage.eINSTANCE.getQuantityComparatorList(), instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public QuestionnaireItemTypeList createQuestionnaireItemTypeListObjectFromString(EDataType eDataType, String initialValue) {
		return createQuestionnaireItemTypeListFromString(FhirPackage.eINSTANCE.getQuestionnaireItemTypeList(), initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertQuestionnaireItemTypeListObjectToString(EDataType eDataType, Object instanceValue) {
		return convertQuestionnaireItemTypeListToString(FhirPackage.eINSTANCE.getQuestionnaireItemTypeList(), instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public QuestionnaireResponseStatusList createQuestionnaireResponseStatusListObjectFromString(EDataType eDataType, String initialValue) {
		return createQuestionnaireResponseStatusListFromString(FhirPackage.eINSTANCE.getQuestionnaireResponseStatusList(), initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertQuestionnaireResponseStatusListObjectToString(EDataType eDataType, Object instanceValue) {
		return convertQuestionnaireResponseStatusListToString(FhirPackage.eINSTANCE.getQuestionnaireResponseStatusList(), instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ReferenceHandlingPolicyList createReferenceHandlingPolicyListObjectFromString(EDataType eDataType, String initialValue) {
		return createReferenceHandlingPolicyListFromString(FhirPackage.eINSTANCE.getReferenceHandlingPolicyList(), initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertReferenceHandlingPolicyListObjectToString(EDataType eDataType, Object instanceValue) {
		return convertReferenceHandlingPolicyListToString(FhirPackage.eINSTANCE.getReferenceHandlingPolicyList(), instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ReferenceVersionRulesList createReferenceVersionRulesListObjectFromString(EDataType eDataType, String initialValue) {
		return createReferenceVersionRulesListFromString(FhirPackage.eINSTANCE.getReferenceVersionRulesList(), initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertReferenceVersionRulesListObjectToString(EDataType eDataType, Object instanceValue) {
		return convertReferenceVersionRulesListToString(FhirPackage.eINSTANCE.getReferenceVersionRulesList(), instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public RelatedArtifactTypeList createRelatedArtifactTypeListObjectFromString(EDataType eDataType, String initialValue) {
		return createRelatedArtifactTypeListFromString(FhirPackage.eINSTANCE.getRelatedArtifactTypeList(), initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertRelatedArtifactTypeListObjectToString(EDataType eDataType, Object instanceValue) {
		return convertRelatedArtifactTypeListToString(FhirPackage.eINSTANCE.getRelatedArtifactTypeList(), instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public RemittanceOutcomeList createRemittanceOutcomeListObjectFromString(EDataType eDataType, String initialValue) {
		return createRemittanceOutcomeListFromString(FhirPackage.eINSTANCE.getRemittanceOutcomeList(), initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertRemittanceOutcomeListObjectToString(EDataType eDataType, Object instanceValue) {
		return convertRemittanceOutcomeListToString(FhirPackage.eINSTANCE.getRemittanceOutcomeList(), instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public RepositoryTypeList createRepositoryTypeListObjectFromString(EDataType eDataType, String initialValue) {
		return createRepositoryTypeListFromString(FhirPackage.eINSTANCE.getRepositoryTypeList(), initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertRepositoryTypeListObjectToString(EDataType eDataType, Object instanceValue) {
		return convertRepositoryTypeListToString(FhirPackage.eINSTANCE.getRepositoryTypeList(), instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public RequestIntentList createRequestIntentListObjectFromString(EDataType eDataType, String initialValue) {
		return createRequestIntentListFromString(FhirPackage.eINSTANCE.getRequestIntentList(), initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertRequestIntentListObjectToString(EDataType eDataType, Object instanceValue) {
		return convertRequestIntentListToString(FhirPackage.eINSTANCE.getRequestIntentList(), instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public RequestPriorityList createRequestPriorityListObjectFromString(EDataType eDataType, String initialValue) {
		return createRequestPriorityListFromString(FhirPackage.eINSTANCE.getRequestPriorityList(), initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertRequestPriorityListObjectToString(EDataType eDataType, Object instanceValue) {
		return convertRequestPriorityListToString(FhirPackage.eINSTANCE.getRequestPriorityList(), instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public RequestStatusList createRequestStatusListObjectFromString(EDataType eDataType, String initialValue) {
		return createRequestStatusListFromString(FhirPackage.eINSTANCE.getRequestStatusList(), initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertRequestStatusListObjectToString(EDataType eDataType, Object instanceValue) {
		return convertRequestStatusListToString(FhirPackage.eINSTANCE.getRequestStatusList(), instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ResearchStudyStatusList createResearchStudyStatusListObjectFromString(EDataType eDataType, String initialValue) {
		return createResearchStudyStatusListFromString(FhirPackage.eINSTANCE.getResearchStudyStatusList(), initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertResearchStudyStatusListObjectToString(EDataType eDataType, Object instanceValue) {
		return convertResearchStudyStatusListToString(FhirPackage.eINSTANCE.getResearchStudyStatusList(), instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ResearchSubjectStatusList createResearchSubjectStatusListObjectFromString(EDataType eDataType, String initialValue) {
		return createResearchSubjectStatusListFromString(FhirPackage.eINSTANCE.getResearchSubjectStatusList(), initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertResearchSubjectStatusListObjectToString(EDataType eDataType, Object instanceValue) {
		return convertResearchSubjectStatusListToString(FhirPackage.eINSTANCE.getResearchSubjectStatusList(), instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ResourceTypeList createResourceTypeListObjectFromString(EDataType eDataType, String initialValue) {
		return createResourceTypeListFromString(FhirPackage.eINSTANCE.getResourceTypeList(), initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertResourceTypeListObjectToString(EDataType eDataType, Object instanceValue) {
		return convertResourceTypeListToString(FhirPackage.eINSTANCE.getResourceTypeList(), instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ResourceVersionPolicyList createResourceVersionPolicyListObjectFromString(EDataType eDataType, String initialValue) {
		return createResourceVersionPolicyListFromString(FhirPackage.eINSTANCE.getResourceVersionPolicyList(), initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertResourceVersionPolicyListObjectToString(EDataType eDataType, Object instanceValue) {
		return convertResourceVersionPolicyListToString(FhirPackage.eINSTANCE.getResourceVersionPolicyList(), instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ResponseTypeList createResponseTypeListObjectFromString(EDataType eDataType, String initialValue) {
		return createResponseTypeListFromString(FhirPackage.eINSTANCE.getResponseTypeList(), initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertResponseTypeListObjectToString(EDataType eDataType, Object instanceValue) {
		return convertResponseTypeListToString(FhirPackage.eINSTANCE.getResponseTypeList(), instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public RestfulCapabilityModeList createRestfulCapabilityModeListObjectFromString(EDataType eDataType, String initialValue) {
		return createRestfulCapabilityModeListFromString(FhirPackage.eINSTANCE.getRestfulCapabilityModeList(), initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertRestfulCapabilityModeListObjectToString(EDataType eDataType, Object instanceValue) {
		return convertRestfulCapabilityModeListToString(FhirPackage.eINSTANCE.getRestfulCapabilityModeList(), instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String createSampledDataDataTypePrimitiveFromString(EDataType eDataType, String initialValue) {
		return (String)XMLTypeFactory.eINSTANCE.createFromString(XMLTypePackage.Literals.STRING, initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertSampledDataDataTypePrimitiveToString(EDataType eDataType, Object instanceValue) {
		return XMLTypeFactory.eINSTANCE.convertToString(XMLTypePackage.Literals.STRING, instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SearchComparatorList createSearchComparatorListObjectFromString(EDataType eDataType, String initialValue) {
		return createSearchComparatorListFromString(FhirPackage.eINSTANCE.getSearchComparatorList(), initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertSearchComparatorListObjectToString(EDataType eDataType, Object instanceValue) {
		return convertSearchComparatorListToString(FhirPackage.eINSTANCE.getSearchComparatorList(), instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SearchEntryModeList createSearchEntryModeListObjectFromString(EDataType eDataType, String initialValue) {
		return createSearchEntryModeListFromString(FhirPackage.eINSTANCE.getSearchEntryModeList(), initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertSearchEntryModeListObjectToString(EDataType eDataType, Object instanceValue) {
		return convertSearchEntryModeListToString(FhirPackage.eINSTANCE.getSearchEntryModeList(), instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SearchModifierCodeList createSearchModifierCodeListObjectFromString(EDataType eDataType, String initialValue) {
		return createSearchModifierCodeListFromString(FhirPackage.eINSTANCE.getSearchModifierCodeList(), initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertSearchModifierCodeListObjectToString(EDataType eDataType, Object instanceValue) {
		return convertSearchModifierCodeListToString(FhirPackage.eINSTANCE.getSearchModifierCodeList(), instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SearchParamTypeList createSearchParamTypeListObjectFromString(EDataType eDataType, String initialValue) {
		return createSearchParamTypeListFromString(FhirPackage.eINSTANCE.getSearchParamTypeList(), initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertSearchParamTypeListObjectToString(EDataType eDataType, Object instanceValue) {
		return convertSearchParamTypeListToString(FhirPackage.eINSTANCE.getSearchParamTypeList(), instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SlicingRulesList createSlicingRulesListObjectFromString(EDataType eDataType, String initialValue) {
		return createSlicingRulesListFromString(FhirPackage.eINSTANCE.getSlicingRulesList(), initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertSlicingRulesListObjectToString(EDataType eDataType, Object instanceValue) {
		return convertSlicingRulesListToString(FhirPackage.eINSTANCE.getSlicingRulesList(), instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SlotStatusList createSlotStatusListObjectFromString(EDataType eDataType, String initialValue) {
		return createSlotStatusListFromString(FhirPackage.eINSTANCE.getSlotStatusList(), initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertSlotStatusListObjectToString(EDataType eDataType, Object instanceValue) {
		return convertSlotStatusListToString(FhirPackage.eINSTANCE.getSlotStatusList(), instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SpecimenStatusList createSpecimenStatusListObjectFromString(EDataType eDataType, String initialValue) {
		return createSpecimenStatusListFromString(FhirPackage.eINSTANCE.getSpecimenStatusList(), initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertSpecimenStatusListObjectToString(EDataType eDataType, Object instanceValue) {
		return convertSpecimenStatusListToString(FhirPackage.eINSTANCE.getSpecimenStatusList(), instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String createStringPrimitiveFromString(EDataType eDataType, String initialValue) {
		return (String)XMLTypeFactory.eINSTANCE.createFromString(XMLTypePackage.Literals.STRING, initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertStringPrimitiveToString(EDataType eDataType, Object instanceValue) {
		return XMLTypeFactory.eINSTANCE.convertToString(XMLTypePackage.Literals.STRING, instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public StructureDefinitionKindList createStructureDefinitionKindListObjectFromString(EDataType eDataType, String initialValue) {
		return createStructureDefinitionKindListFromString(FhirPackage.eINSTANCE.getStructureDefinitionKindList(), initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertStructureDefinitionKindListObjectToString(EDataType eDataType, Object instanceValue) {
		return convertStructureDefinitionKindListToString(FhirPackage.eINSTANCE.getStructureDefinitionKindList(), instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public StructureMapContextTypeList createStructureMapContextTypeListObjectFromString(EDataType eDataType, String initialValue) {
		return createStructureMapContextTypeListFromString(FhirPackage.eINSTANCE.getStructureMapContextTypeList(), initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertStructureMapContextTypeListObjectToString(EDataType eDataType, Object instanceValue) {
		return convertStructureMapContextTypeListToString(FhirPackage.eINSTANCE.getStructureMapContextTypeList(), instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public StructureMapGroupTypeModeList createStructureMapGroupTypeModeListObjectFromString(EDataType eDataType, String initialValue) {
		return createStructureMapGroupTypeModeListFromString(FhirPackage.eINSTANCE.getStructureMapGroupTypeModeList(), initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertStructureMapGroupTypeModeListObjectToString(EDataType eDataType, Object instanceValue) {
		return convertStructureMapGroupTypeModeListToString(FhirPackage.eINSTANCE.getStructureMapGroupTypeModeList(), instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public StructureMapInputModeList createStructureMapInputModeListObjectFromString(EDataType eDataType, String initialValue) {
		return createStructureMapInputModeListFromString(FhirPackage.eINSTANCE.getStructureMapInputModeList(), initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertStructureMapInputModeListObjectToString(EDataType eDataType, Object instanceValue) {
		return convertStructureMapInputModeListToString(FhirPackage.eINSTANCE.getStructureMapInputModeList(), instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public StructureMapModelModeList createStructureMapModelModeListObjectFromString(EDataType eDataType, String initialValue) {
		return createStructureMapModelModeListFromString(FhirPackage.eINSTANCE.getStructureMapModelModeList(), initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertStructureMapModelModeListObjectToString(EDataType eDataType, Object instanceValue) {
		return convertStructureMapModelModeListToString(FhirPackage.eINSTANCE.getStructureMapModelModeList(), instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public StructureMapSourceListModeList createStructureMapSourceListModeListObjectFromString(EDataType eDataType, String initialValue) {
		return createStructureMapSourceListModeListFromString(FhirPackage.eINSTANCE.getStructureMapSourceListModeList(), initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertStructureMapSourceListModeListObjectToString(EDataType eDataType, Object instanceValue) {
		return convertStructureMapSourceListModeListToString(FhirPackage.eINSTANCE.getStructureMapSourceListModeList(), instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public StructureMapTargetListModeList createStructureMapTargetListModeListObjectFromString(EDataType eDataType, String initialValue) {
		return createStructureMapTargetListModeListFromString(FhirPackage.eINSTANCE.getStructureMapTargetListModeList(), initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertStructureMapTargetListModeListObjectToString(EDataType eDataType, Object instanceValue) {
		return convertStructureMapTargetListModeListToString(FhirPackage.eINSTANCE.getStructureMapTargetListModeList(), instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public StructureMapTransformList createStructureMapTransformListObjectFromString(EDataType eDataType, String initialValue) {
		return createStructureMapTransformListFromString(FhirPackage.eINSTANCE.getStructureMapTransformList(), initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertStructureMapTransformListObjectToString(EDataType eDataType, Object instanceValue) {
		return convertStructureMapTransformListToString(FhirPackage.eINSTANCE.getStructureMapTransformList(), instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SubscriptionChannelTypeList createSubscriptionChannelTypeListObjectFromString(EDataType eDataType, String initialValue) {
		return createSubscriptionChannelTypeListFromString(FhirPackage.eINSTANCE.getSubscriptionChannelTypeList(), initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertSubscriptionChannelTypeListObjectToString(EDataType eDataType, Object instanceValue) {
		return convertSubscriptionChannelTypeListToString(FhirPackage.eINSTANCE.getSubscriptionChannelTypeList(), instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SubscriptionStatusList createSubscriptionStatusListObjectFromString(EDataType eDataType, String initialValue) {
		return createSubscriptionStatusListFromString(FhirPackage.eINSTANCE.getSubscriptionStatusList(), initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertSubscriptionStatusListObjectToString(EDataType eDataType, Object instanceValue) {
		return convertSubscriptionStatusListToString(FhirPackage.eINSTANCE.getSubscriptionStatusList(), instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SupplyDeliveryStatusList createSupplyDeliveryStatusListObjectFromString(EDataType eDataType, String initialValue) {
		return createSupplyDeliveryStatusListFromString(FhirPackage.eINSTANCE.getSupplyDeliveryStatusList(), initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertSupplyDeliveryStatusListObjectToString(EDataType eDataType, Object instanceValue) {
		return convertSupplyDeliveryStatusListToString(FhirPackage.eINSTANCE.getSupplyDeliveryStatusList(), instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SupplyRequestStatusList createSupplyRequestStatusListObjectFromString(EDataType eDataType, String initialValue) {
		return createSupplyRequestStatusListFromString(FhirPackage.eINSTANCE.getSupplyRequestStatusList(), initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertSupplyRequestStatusListObjectToString(EDataType eDataType, Object instanceValue) {
		return convertSupplyRequestStatusListToString(FhirPackage.eINSTANCE.getSupplyRequestStatusList(), instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SystemRestfulInteractionList createSystemRestfulInteractionListObjectFromString(EDataType eDataType, String initialValue) {
		return createSystemRestfulInteractionListFromString(FhirPackage.eINSTANCE.getSystemRestfulInteractionList(), initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertSystemRestfulInteractionListObjectToString(EDataType eDataType, Object instanceValue) {
		return convertSystemRestfulInteractionListToString(FhirPackage.eINSTANCE.getSystemRestfulInteractionList(), instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SystemVersionProcessingModeList createSystemVersionProcessingModeListObjectFromString(EDataType eDataType, String initialValue) {
		return createSystemVersionProcessingModeListFromString(FhirPackage.eINSTANCE.getSystemVersionProcessingModeList(), initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertSystemVersionProcessingModeListObjectToString(EDataType eDataType, Object instanceValue) {
		return convertSystemVersionProcessingModeListToString(FhirPackage.eINSTANCE.getSystemVersionProcessingModeList(), instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TaskStatusList createTaskStatusListObjectFromString(EDataType eDataType, String initialValue) {
		return createTaskStatusListFromString(FhirPackage.eINSTANCE.getTaskStatusList(), initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertTaskStatusListObjectToString(EDataType eDataType, Object instanceValue) {
		return convertTaskStatusListToString(FhirPackage.eINSTANCE.getTaskStatusList(), instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TestReportActionResultList createTestReportActionResultListObjectFromString(EDataType eDataType, String initialValue) {
		return createTestReportActionResultListFromString(FhirPackage.eINSTANCE.getTestReportActionResultList(), initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertTestReportActionResultListObjectToString(EDataType eDataType, Object instanceValue) {
		return convertTestReportActionResultListToString(FhirPackage.eINSTANCE.getTestReportActionResultList(), instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TestReportParticipantTypeList createTestReportParticipantTypeListObjectFromString(EDataType eDataType, String initialValue) {
		return createTestReportParticipantTypeListFromString(FhirPackage.eINSTANCE.getTestReportParticipantTypeList(), initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertTestReportParticipantTypeListObjectToString(EDataType eDataType, Object instanceValue) {
		return convertTestReportParticipantTypeListToString(FhirPackage.eINSTANCE.getTestReportParticipantTypeList(), instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TestReportResultList createTestReportResultListObjectFromString(EDataType eDataType, String initialValue) {
		return createTestReportResultListFromString(FhirPackage.eINSTANCE.getTestReportResultList(), initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertTestReportResultListObjectToString(EDataType eDataType, Object instanceValue) {
		return convertTestReportResultListToString(FhirPackage.eINSTANCE.getTestReportResultList(), instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TestReportStatusList createTestReportStatusListObjectFromString(EDataType eDataType, String initialValue) {
		return createTestReportStatusListFromString(FhirPackage.eINSTANCE.getTestReportStatusList(), initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertTestReportStatusListObjectToString(EDataType eDataType, Object instanceValue) {
		return convertTestReportStatusListToString(FhirPackage.eINSTANCE.getTestReportStatusList(), instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TestScriptRequestMethodCodeList createTestScriptRequestMethodCodeListObjectFromString(EDataType eDataType, String initialValue) {
		return createTestScriptRequestMethodCodeListFromString(FhirPackage.eINSTANCE.getTestScriptRequestMethodCodeList(), initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertTestScriptRequestMethodCodeListObjectToString(EDataType eDataType, Object instanceValue) {
		return convertTestScriptRequestMethodCodeListToString(FhirPackage.eINSTANCE.getTestScriptRequestMethodCodeList(), instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public XMLGregorianCalendar createTimePrimitiveFromString(EDataType eDataType, String initialValue) {
		return (XMLGregorianCalendar)XMLTypeFactory.eINSTANCE.createFromString(XMLTypePackage.Literals.TIME, initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertTimePrimitiveToString(EDataType eDataType, Object instanceValue) {
		return XMLTypeFactory.eINSTANCE.convertToString(XMLTypePackage.Literals.TIME, instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TriggerTypeList createTriggerTypeListObjectFromString(EDataType eDataType, String initialValue) {
		return createTriggerTypeListFromString(FhirPackage.eINSTANCE.getTriggerTypeList(), initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertTriggerTypeListObjectToString(EDataType eDataType, Object instanceValue) {
		return convertTriggerTypeListToString(FhirPackage.eINSTANCE.getTriggerTypeList(), instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TypeDerivationRuleList createTypeDerivationRuleListObjectFromString(EDataType eDataType, String initialValue) {
		return createTypeDerivationRuleListFromString(FhirPackage.eINSTANCE.getTypeDerivationRuleList(), initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertTypeDerivationRuleListObjectToString(EDataType eDataType, Object instanceValue) {
		return convertTypeDerivationRuleListToString(FhirPackage.eINSTANCE.getTypeDerivationRuleList(), instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TypeRestfulInteractionList createTypeRestfulInteractionListObjectFromString(EDataType eDataType, String initialValue) {
		return createTypeRestfulInteractionListFromString(FhirPackage.eINSTANCE.getTypeRestfulInteractionList(), initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertTypeRestfulInteractionListObjectToString(EDataType eDataType, Object instanceValue) {
		return convertTypeRestfulInteractionListToString(FhirPackage.eINSTANCE.getTypeRestfulInteractionList(), instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public UDIEntryTypeList createUDIEntryTypeListObjectFromString(EDataType eDataType, String initialValue) {
		return createUDIEntryTypeListFromString(FhirPackage.eINSTANCE.getUDIEntryTypeList(), initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertUDIEntryTypeListObjectToString(EDataType eDataType, Object instanceValue) {
		return convertUDIEntryTypeListToString(FhirPackage.eINSTANCE.getUDIEntryTypeList(), instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public UnitsOfTimeList createUnitsOfTimeListObjectFromString(EDataType eDataType, String initialValue) {
		return createUnitsOfTimeListFromString(FhirPackage.eINSTANCE.getUnitsOfTimeList(), initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertUnitsOfTimeListObjectToString(EDataType eDataType, Object instanceValue) {
		return convertUnitsOfTimeListToString(FhirPackage.eINSTANCE.getUnitsOfTimeList(), instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public UnknownContentCodeList createUnknownContentCodeListObjectFromString(EDataType eDataType, String initialValue) {
		return createUnknownContentCodeListFromString(FhirPackage.eINSTANCE.getUnknownContentCodeList(), initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertUnknownContentCodeListObjectToString(EDataType eDataType, Object instanceValue) {
		return convertUnknownContentCodeListToString(FhirPackage.eINSTANCE.getUnknownContentCodeList(), instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public BigInteger createUnsignedIntPrimitiveFromString(EDataType eDataType, String initialValue) {
		return (BigInteger)XMLTypeFactory.eINSTANCE.createFromString(XMLTypePackage.Literals.NON_NEGATIVE_INTEGER, initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertUnsignedIntPrimitiveToString(EDataType eDataType, Object instanceValue) {
		return XMLTypeFactory.eINSTANCE.convertToString(XMLTypePackage.Literals.NON_NEGATIVE_INTEGER, instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String createUriPrimitiveFromString(EDataType eDataType, String initialValue) {
		return (String)XMLTypeFactory.eINSTANCE.createFromString(XMLTypePackage.Literals.ANY_URI, initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertUriPrimitiveToString(EDataType eDataType, Object instanceValue) {
		return XMLTypeFactory.eINSTANCE.convertToString(XMLTypePackage.Literals.ANY_URI, instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public UseList createUseListObjectFromString(EDataType eDataType, String initialValue) {
		return createUseListFromString(FhirPackage.eINSTANCE.getUseList(), initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertUseListObjectToString(EDataType eDataType, Object instanceValue) {
		return convertUseListToString(FhirPackage.eINSTANCE.getUseList(), instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String createUuidPrimitiveFromString(EDataType eDataType, String initialValue) {
		return (String)XMLTypeFactory.eINSTANCE.createFromString(XMLTypePackage.Literals.ANY_URI, initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertUuidPrimitiveToString(EDataType eDataType, Object instanceValue) {
		return XMLTypeFactory.eINSTANCE.convertToString(XMLTypePackage.Literals.ANY_URI, instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public VisionBaseList createVisionBaseListObjectFromString(EDataType eDataType, String initialValue) {
		return createVisionBaseListFromString(FhirPackage.eINSTANCE.getVisionBaseList(), initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertVisionBaseListObjectToString(EDataType eDataType, Object instanceValue) {
		return convertVisionBaseListToString(FhirPackage.eINSTANCE.getVisionBaseList(), instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public VisionEyesList createVisionEyesListObjectFromString(EDataType eDataType, String initialValue) {
		return createVisionEyesListFromString(FhirPackage.eINSTANCE.getVisionEyesList(), initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertVisionEyesListObjectToString(EDataType eDataType, Object instanceValue) {
		return convertVisionEyesListToString(FhirPackage.eINSTANCE.getVisionEyesList(), instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public XPathUsageTypeList createXPathUsageTypeListObjectFromString(EDataType eDataType, String initialValue) {
		return createXPathUsageTypeListFromString(FhirPackage.eINSTANCE.getXPathUsageTypeList(), initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertXPathUsageTypeListObjectToString(EDataType eDataType, Object instanceValue) {
		return convertXPathUsageTypeListToString(FhirPackage.eINSTANCE.getXPathUsageTypeList(), instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public FhirPackage getFhirPackage() {
		return (FhirPackage)getEPackage();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @deprecated
	 * @generated
	 */
	@Deprecated
	public static FhirPackage getPackage() {
		return FhirPackage.eINSTANCE;
	}

} //FhirFactoryImpl
