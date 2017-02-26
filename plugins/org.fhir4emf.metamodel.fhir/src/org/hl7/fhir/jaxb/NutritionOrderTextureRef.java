package org.hl7.fhir.jaxb;

import javax.xml.bind.annotation.*;
import org.eclipse.emf.ecore.jaxb.*;

import org.hl7.fhir.FhirFactory;
import org.hl7.fhir.NutritionOrderTexture;

@XmlRootElement(name = "NutritionOrderTextureRefElement")
public class NutritionOrderTextureRef extends org.hl7.fhir.jaxb.BackboneElementRef  {

	

	
	@Override
	public NutritionOrderTexture createInstance() {
		return FhirFactory.eINSTANCE.createNutritionOrderTexture();
	}
	
	public static NutritionOrderTextureRef valueOf(String id) {
		NutritionOrderTextureRef result = new NutritionOrderTextureRef();
		result.setID(id);
		return result;
	}

	@Override
	public String toString() {
		return getID();
	}
	

}