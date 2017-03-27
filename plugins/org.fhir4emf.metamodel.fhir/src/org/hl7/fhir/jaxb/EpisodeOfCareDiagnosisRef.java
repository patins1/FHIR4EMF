package org.hl7.fhir.jaxb;

import javax.xml.bind.annotation.*;
import org.eclipse.emf.ecore.jaxb.*;

import org.hl7.fhir.EpisodeOfCareDiagnosis;
import org.hl7.fhir.FhirFactory;

@XmlRootElement(name = "EpisodeOfCareDiagnosisRefElement")
public class EpisodeOfCareDiagnosisRef extends org.hl7.fhir.jaxb.BackboneElementRef  {

	

	
	@Override
	public EpisodeOfCareDiagnosis createInstance() {
		return FhirFactory.eINSTANCE.createEpisodeOfCareDiagnosis();
	}
	
	public static EpisodeOfCareDiagnosisRef valueOf(String id) {
		EpisodeOfCareDiagnosisRef result = new EpisodeOfCareDiagnosisRef();
		result.setID(id);
		return result;
	}

	@Override
	public String toString() {
		return getID();
	}
	

}