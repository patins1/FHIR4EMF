package org.hl7.fhir.jaxb;

import javax.xml.bind.annotation.*;
import org.eclipse.emf.ecore.jaxb.*;

import org.hl7.fhir.FhirFactory;
import org.hl7.fhir.SubstanceIngredient;

@XmlRootElement(name = "SubstanceIngredientRefElement")
public class SubstanceIngredientRef extends org.hl7.fhir.jaxb.BackboneElementRef  {

	

	
	@Override
	public SubstanceIngredient createInstance() {
		return FhirFactory.eINSTANCE.createSubstanceIngredient();
	}
	
	public static SubstanceIngredientRef valueOf(String id) {
		SubstanceIngredientRef result = new SubstanceIngredientRef();
		result.setID(id);
		return result;
	}

	@Override
	public String toString() {
		return getID();
	}
	

}