package org.hl7.fhir.jaxb;

import javax.xml.bind.annotation.*;
import org.eclipse.emf.ecore.jaxb.*;

import org.hl7.fhir.FhirFactory;
import org.hl7.fhir.ImmunizationRecommendation;

@XmlRootElement(name = "ImmunizationRecommendationRefElement")
public class ImmunizationRecommendationRef extends org.hl7.fhir.jaxb.DomainResourceRef  {

	

	
	@Override
	public ImmunizationRecommendation createInstance() {
		return FhirFactory.eINSTANCE.createImmunizationRecommendation();
	}
	
	public static ImmunizationRecommendationRef valueOf(String id) {
		ImmunizationRecommendationRef result = new ImmunizationRecommendationRef();
		result.setID(id);
		return result;
	}

	@Override
	public String toString() {
		return getID();
	}
	

}