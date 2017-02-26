package org.hl7.fhir.jaxb;

import javax.xml.bind.annotation.*;
import org.eclipse.emf.ecore.jaxb.*;

import org.hl7.fhir.EpisodeOfCareStatusHistory;
import org.hl7.fhir.FhirFactory;

@XmlRootElement(name = "EpisodeOfCareStatusHistoryRefElement")
public class EpisodeOfCareStatusHistoryRef extends org.hl7.fhir.jaxb.BackboneElementRef  {

	

	
	@Override
	public EpisodeOfCareStatusHistory createInstance() {
		return FhirFactory.eINSTANCE.createEpisodeOfCareStatusHistory();
	}
	
	public static EpisodeOfCareStatusHistoryRef valueOf(String id) {
		EpisodeOfCareStatusHistoryRef result = new EpisodeOfCareStatusHistoryRef();
		result.setID(id);
		return result;
	}

	@Override
	public String toString() {
		return getID();
	}
	

}