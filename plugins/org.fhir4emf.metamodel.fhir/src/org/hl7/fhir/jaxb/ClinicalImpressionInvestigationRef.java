package org.hl7.fhir.jaxb;

import javax.xml.bind.annotation.*;
import org.eclipse.emf.ecore.jaxb.*;

import org.hl7.fhir.ClinicalImpressionInvestigation;
import org.hl7.fhir.FhirFactory;

@XmlRootElement(name = "ClinicalImpressionInvestigationRefElement")
public class ClinicalImpressionInvestigationRef extends org.hl7.fhir.jaxb.BackboneElementRef  {

	

	
	@Override
	public ClinicalImpressionInvestigation createInstance() {
		return FhirFactory.eINSTANCE.createClinicalImpressionInvestigation();
	}
	
	public static ClinicalImpressionInvestigationRef valueOf(String id) {
		ClinicalImpressionInvestigationRef result = new ClinicalImpressionInvestigationRef();
		result.setID(id);
		return result;
	}

	@Override
	public String toString() {
		return getID();
	}
	

}