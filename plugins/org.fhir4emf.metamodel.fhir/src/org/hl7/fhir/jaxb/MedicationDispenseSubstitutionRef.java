package org.hl7.fhir.jaxb;

import javax.xml.bind.annotation.*;
import org.eclipse.emf.ecore.jaxb.*;

import org.hl7.fhir.FhirFactory;
import org.hl7.fhir.MedicationDispenseSubstitution;

@XmlRootElement(name = "MedicationDispenseSubstitutionRefElement")
public class MedicationDispenseSubstitutionRef extends org.hl7.fhir.jaxb.BackboneElementRef  {

	

	
	@Override
	public MedicationDispenseSubstitution createInstance() {
		return FhirFactory.eINSTANCE.createMedicationDispenseSubstitution();
	}
	
	public static MedicationDispenseSubstitutionRef valueOf(String id) {
		MedicationDispenseSubstitutionRef result = new MedicationDispenseSubstitutionRef();
		result.setID(id);
		return result;
	}

	@Override
	public String toString() {
		return getID();
	}
	

}