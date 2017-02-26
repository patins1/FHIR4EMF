package org.hl7.fhir.jaxb;

import javax.xml.bind.annotation.*;
import org.eclipse.emf.ecore.jaxb.*;

import org.hl7.fhir.FhirFactory;
import org.hl7.fhir.ResearchSubjectStatus;

@XmlRootElement(name = "ResearchSubjectStatusRefElement")
public class ResearchSubjectStatusRef extends org.hl7.fhir.jaxb.ElementRef  {

	

	
	@Override
	public ResearchSubjectStatus createInstance() {
		return FhirFactory.eINSTANCE.createResearchSubjectStatus();
	}
	
	public static ResearchSubjectStatusRef valueOf(String id) {
		ResearchSubjectStatusRef result = new ResearchSubjectStatusRef();
		result.setID(id);
		return result;
	}

	@Override
	public String toString() {
		return getID();
	}
	

}