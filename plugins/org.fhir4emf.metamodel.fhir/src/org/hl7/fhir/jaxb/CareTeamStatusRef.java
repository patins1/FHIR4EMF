package org.hl7.fhir.jaxb;

import javax.xml.bind.annotation.*;
import org.eclipse.emf.ecore.jaxb.*;

import org.hl7.fhir.CareTeamStatus;
import org.hl7.fhir.FhirFactory;

@XmlRootElement(name = "CareTeamStatusRefElement")
public class CareTeamStatusRef extends org.hl7.fhir.jaxb.ElementRef  {

	

	
	@Override
	public CareTeamStatus createInstance() {
		return FhirFactory.eINSTANCE.createCareTeamStatus();
	}
	
	public static CareTeamStatusRef valueOf(String id) {
		CareTeamStatusRef result = new CareTeamStatusRef();
		result.setID(id);
		return result;
	}

	@Override
	public String toString() {
		return getID();
	}
	

}