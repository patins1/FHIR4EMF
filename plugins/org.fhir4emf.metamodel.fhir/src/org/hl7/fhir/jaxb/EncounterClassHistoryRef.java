package org.hl7.fhir.jaxb;

import javax.xml.bind.annotation.*;
import org.eclipse.emf.ecore.jaxb.*;

import org.hl7.fhir.EncounterClassHistory;
import org.hl7.fhir.FhirFactory;

@XmlRootElement(name = "EncounterClassHistoryRefElement")
public class EncounterClassHistoryRef extends org.hl7.fhir.jaxb.BackboneElementRef  {

	

	
	@Override
	public EncounterClassHistory createInstance() {
		return FhirFactory.eINSTANCE.createEncounterClassHistory();
	}
	
	public static EncounterClassHistoryRef valueOf(String id) {
		EncounterClassHistoryRef result = new EncounterClassHistoryRef();
		result.setID(id);
		return result;
	}

	@Override
	public String toString() {
		return getID();
	}
	

}