package org.hl7.fhir.jaxb;

import javax.xml.bind.annotation.*;
import org.eclipse.emf.ecore.jaxb.*;

import org.hl7.fhir.FhirFactory;
import org.hl7.fhir.NutritionOrderAdministration;

@XmlRootElement(name = "NutritionOrderAdministrationRefElement")
public class NutritionOrderAdministrationRef extends org.hl7.fhir.jaxb.BackboneElementRef  {

	

	
	@Override
	public NutritionOrderAdministration createInstance() {
		return FhirFactory.eINSTANCE.createNutritionOrderAdministration();
	}
	
	public static NutritionOrderAdministrationRef valueOf(String id) {
		NutritionOrderAdministrationRef result = new NutritionOrderAdministrationRef();
		result.setID(id);
		return result;
	}

	@Override
	public String toString() {
		return getID();
	}
	

}