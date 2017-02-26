package org.hl7.fhir.jaxb;

import javax.xml.bind.annotation.*;
import org.eclipse.emf.ecore.jaxb.*;

import org.hl7.fhir.FhirFactory;
import org.hl7.fhir.NutritionOrder;

@XmlRootElement(name = "NutritionOrderRefElement")
public class NutritionOrderRef extends org.hl7.fhir.jaxb.DomainResourceRef  {

	

	
	@Override
	public NutritionOrder createInstance() {
		return FhirFactory.eINSTANCE.createNutritionOrder();
	}
	
	public static NutritionOrderRef valueOf(String id) {
		NutritionOrderRef result = new NutritionOrderRef();
		result.setID(id);
		return result;
	}

	@Override
	public String toString() {
		return getID();
	}
	

}