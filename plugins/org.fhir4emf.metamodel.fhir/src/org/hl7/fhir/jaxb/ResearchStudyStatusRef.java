package org.hl7.fhir.jaxb;

import javax.xml.bind.annotation.*;
import org.eclipse.emf.ecore.jaxb.*;

import org.hl7.fhir.FhirFactory;
import org.hl7.fhir.ResearchStudyStatus;

@XmlRootElement(name = "ResearchStudyStatusRefElement")
public class ResearchStudyStatusRef extends org.hl7.fhir.jaxb.ElementRef  {

	

	
	@Override
	public ResearchStudyStatus createInstance() {
		return FhirFactory.eINSTANCE.createResearchStudyStatus();
	}
	
	public static ResearchStudyStatusRef valueOf(String id) {
		ResearchStudyStatusRef result = new ResearchStudyStatusRef();
		result.setID(id);
		return result;
	}

	@Override
	public String toString() {
		return getID();
	}
	

}