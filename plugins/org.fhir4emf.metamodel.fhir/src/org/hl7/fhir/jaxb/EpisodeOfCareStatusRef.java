package org.hl7.fhir.jaxb;

import javax.xml.bind.annotation.*;
import org.eclipse.emf.ecore.jaxb.*;

import org.hl7.fhir.EpisodeOfCareStatus;
import org.hl7.fhir.FhirFactory;

@XmlRootElement(name = "EpisodeOfCareStatusRefElement")
public class EpisodeOfCareStatusRef extends org.hl7.fhir.jaxb.ElementRef  {

	

	
	@Override
	public EpisodeOfCareStatus createInstance() {
		return FhirFactory.eINSTANCE.createEpisodeOfCareStatus();
	}
	
	public static EpisodeOfCareStatusRef valueOf(String id) {
		EpisodeOfCareStatusRef result = new EpisodeOfCareStatusRef();
		result.setID(id);
		return result;
	}

	@Override
	public String toString() {
		return getID();
	}
	

}