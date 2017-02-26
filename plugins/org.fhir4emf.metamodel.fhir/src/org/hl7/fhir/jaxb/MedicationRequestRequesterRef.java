package org.hl7.fhir.jaxb;

import javax.xml.bind.annotation.*;
import org.eclipse.emf.ecore.jaxb.*;

import org.hl7.fhir.FhirFactory;
import org.hl7.fhir.MedicationRequestRequester;

@XmlRootElement(name = "MedicationRequestRequesterRefElement")
public class MedicationRequestRequesterRef extends org.hl7.fhir.jaxb.BackboneElementRef  {

	

	
	@Override
	public MedicationRequestRequester createInstance() {
		return FhirFactory.eINSTANCE.createMedicationRequestRequester();
	}
	
	public static MedicationRequestRequesterRef valueOf(String id) {
		MedicationRequestRequesterRef result = new MedicationRequestRequesterRef();
		result.setID(id);
		return result;
	}

	@Override
	public String toString() {
		return getID();
	}
	

}