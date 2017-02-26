package org.hl7.fhir.jaxb;

import javax.xml.bind.annotation.*;
import org.eclipse.emf.ecore.jaxb.*;

import org.hl7.fhir.FhirFactory;
import org.hl7.fhir.ResearchStudy;

@XmlRootElement(name = "ResearchStudyRefElement")
public class ResearchStudyRef extends org.hl7.fhir.jaxb.DomainResourceRef  {

	

	
	@Override
	public ResearchStudy createInstance() {
		return FhirFactory.eINSTANCE.createResearchStudy();
	}
	
	public static ResearchStudyRef valueOf(String id) {
		ResearchStudyRef result = new ResearchStudyRef();
		result.setID(id);
		return result;
	}

	@Override
	public String toString() {
		return getID();
	}
	

}