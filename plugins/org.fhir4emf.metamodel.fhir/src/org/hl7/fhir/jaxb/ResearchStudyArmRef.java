package org.hl7.fhir.jaxb;

import javax.xml.bind.annotation.*;
import org.eclipse.emf.ecore.jaxb.*;

import org.hl7.fhir.FhirFactory;
import org.hl7.fhir.ResearchStudyArm;

@XmlRootElement(name = "ResearchStudyArmRefElement")
public class ResearchStudyArmRef extends org.hl7.fhir.jaxb.BackboneElementRef  {

	

	
	@Override
	public ResearchStudyArm createInstance() {
		return FhirFactory.eINSTANCE.createResearchStudyArm();
	}
	
	public static ResearchStudyArmRef valueOf(String id) {
		ResearchStudyArmRef result = new ResearchStudyArmRef();
		result.setID(id);
		return result;
	}

	@Override
	public String toString() {
		return getID();
	}
	

}