package org.hl7.fhir.jaxb;

import javax.xml.bind.annotation.*;
import org.eclipse.emf.ecore.jaxb.*;

import org.hl7.fhir.FhirFactory;
import org.hl7.fhir.MedicationRequestSubstitution;

@XmlRootElement(name = "MedicationRequestSubstitutionRefElement")
public class MedicationRequestSubstitutionRef extends org.hl7.fhir.jaxb.BackboneElementRef  {

	

	
	@Override
	public MedicationRequestSubstitution createInstance() {
		return FhirFactory.eINSTANCE.createMedicationRequestSubstitution();
	}
	
	public static MedicationRequestSubstitutionRef valueOf(String id) {
		MedicationRequestSubstitutionRef result = new MedicationRequestSubstitutionRef();
		result.setID(id);
		return result;
	}

	@Override
	public String toString() {
		return getID();
	}
	

}