package org.hl7.fhir.jaxb;

import javax.xml.bind.annotation.*;
import org.eclipse.emf.ecore.jaxb.*;

import org.hl7.fhir.FhirFactory;
import org.hl7.fhir.MedicationContent;

@XmlRootElement(name = "MedicationContentRefElement")
public class MedicationContentRef extends org.hl7.fhir.jaxb.BackboneElementRef  {

	

	
	@Override
	public MedicationContent createInstance() {
		return FhirFactory.eINSTANCE.createMedicationContent();
	}
	
	public static MedicationContentRef valueOf(String id) {
		MedicationContentRef result = new MedicationContentRef();
		result.setID(id);
		return result;
	}

	@Override
	public String toString() {
		return getID();
	}
	

}