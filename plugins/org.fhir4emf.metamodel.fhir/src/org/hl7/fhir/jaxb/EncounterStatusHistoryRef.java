package org.hl7.fhir.jaxb;

import javax.xml.bind.annotation.*;
import org.eclipse.emf.ecore.jaxb.*;

import org.hl7.fhir.EncounterStatusHistory;
import org.hl7.fhir.FhirFactory;

@XmlRootElement(name = "EncounterStatusHistoryRefElement")
public class EncounterStatusHistoryRef extends org.hl7.fhir.jaxb.BackboneElementRef  {

	

	
	@Override
	public EncounterStatusHistory createInstance() {
		return FhirFactory.eINSTANCE.createEncounterStatusHistory();
	}
	
	public static EncounterStatusHistoryRef valueOf(String id) {
		EncounterStatusHistoryRef result = new EncounterStatusHistoryRef();
		result.setID(id);
		return result;
	}

	@Override
	public String toString() {
		return getID();
	}
	

}