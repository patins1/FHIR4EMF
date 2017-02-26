package org.hl7.fhir.jaxb;

import javax.xml.bind.annotation.*;
import org.eclipse.emf.ecore.jaxb.*;

import org.hl7.fhir.FhirFactory;
import org.hl7.fhir.ImmunizationRecommendationDateCriterion;

@XmlRootElement(name = "ImmunizationRecommendationDateCriterionRefElement")
public class ImmunizationRecommendationDateCriterionRef extends org.hl7.fhir.jaxb.BackboneElementRef  {

	

	
	@Override
	public ImmunizationRecommendationDateCriterion createInstance() {
		return FhirFactory.eINSTANCE.createImmunizationRecommendationDateCriterion();
	}
	
	public static ImmunizationRecommendationDateCriterionRef valueOf(String id) {
		ImmunizationRecommendationDateCriterionRef result = new ImmunizationRecommendationDateCriterionRef();
		result.setID(id);
		return result;
	}

	@Override
	public String toString() {
		return getID();
	}
	

}