package org.hl7.fhir.jaxb;

import javax.xml.bind.annotation.*;
import org.eclipse.emf.ecore.jaxb.*;

import org.hl7.fhir.AllergyIntoleranceReaction;
import org.hl7.fhir.FhirFactory;

@XmlRootElement(name = "AllergyIntoleranceReactionRefElement")
public class AllergyIntoleranceReactionRef extends org.hl7.fhir.jaxb.BackboneElementRef  {

	

	
	@Override
	public AllergyIntoleranceReaction createInstance() {
		return FhirFactory.eINSTANCE.createAllergyIntoleranceReaction();
	}
	
	public static AllergyIntoleranceReactionRef valueOf(String id) {
		AllergyIntoleranceReactionRef result = new AllergyIntoleranceReactionRef();
		result.setID(id);
		return result;
	}

	@Override
	public String toString() {
		return getID();
	}
	

}