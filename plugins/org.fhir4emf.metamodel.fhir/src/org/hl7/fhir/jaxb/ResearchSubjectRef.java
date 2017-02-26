package org.hl7.fhir.jaxb;

import javax.xml.bind.annotation.*;
import org.eclipse.emf.ecore.jaxb.*;

import org.hl7.fhir.FhirFactory;
import org.hl7.fhir.ResearchSubject;

@XmlRootElement(name = "ResearchSubjectRefElement")
public class ResearchSubjectRef extends org.hl7.fhir.jaxb.DomainResourceRef  {

	

	
	@Override
	public ResearchSubject createInstance() {
		return FhirFactory.eINSTANCE.createResearchSubject();
	}
	
	public static ResearchSubjectRef valueOf(String id) {
		ResearchSubjectRef result = new ResearchSubjectRef();
		result.setID(id);
		return result;
	}

	@Override
	public String toString() {
		return getID();
	}
	

}