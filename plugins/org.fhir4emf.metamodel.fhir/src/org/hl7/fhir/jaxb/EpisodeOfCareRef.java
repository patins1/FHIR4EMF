package org.hl7.fhir.jaxb;

import javax.xml.bind.annotation.*;
import org.eclipse.emf.ecore.jaxb.*;

import org.hl7.fhir.EpisodeOfCare;
import org.hl7.fhir.FhirFactory;

@XmlRootElement(name = "EpisodeOfCareRefElement")
public class EpisodeOfCareRef extends org.hl7.fhir.jaxb.DomainResourceRef  {

	

	
	@Override
	public EpisodeOfCare createInstance() {
		return FhirFactory.eINSTANCE.createEpisodeOfCare();
	}
	
	public static EpisodeOfCareRef valueOf(String id) {
		EpisodeOfCareRef result = new EpisodeOfCareRef();
		result.setID(id);
		return result;
	}

	@Override
	public String toString() {
		return getID();
	}
	

}