package org.hl7.fhir.jaxb;

import javax.xml.bind.annotation.*;
import org.eclipse.emf.ecore.jaxb.*;

import org.hl7.fhir.FhirFactory;
import org.hl7.fhir.MedicationIngredient;

@XmlRootElement(name = "MedicationIngredientRefElement")
public class MedicationIngredientRef extends org.hl7.fhir.jaxb.BackboneElementRef  {

	

	
	@Override
	public MedicationIngredient createInstance() {
		return FhirFactory.eINSTANCE.createMedicationIngredient();
	}
	
	public static MedicationIngredientRef valueOf(String id) {
		MedicationIngredientRef result = new MedicationIngredientRef();
		result.setID(id);
		return result;
	}

	@Override
	public String toString() {
		return getID();
	}
	

}