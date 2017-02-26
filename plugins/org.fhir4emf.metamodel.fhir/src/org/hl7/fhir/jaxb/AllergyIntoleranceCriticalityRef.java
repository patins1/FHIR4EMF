package org.hl7.fhir.jaxb;

import javax.xml.bind.annotation.*;
import org.eclipse.emf.ecore.jaxb.*;

import org.hl7.fhir.AllergyIntoleranceCriticality;
import org.hl7.fhir.FhirFactory;

@XmlRootElement(name = "AllergyIntoleranceCriticalityRefElement")
public class AllergyIntoleranceCriticalityRef extends org.hl7.fhir.jaxb.ElementRef  {

	

	
	@Override
	public AllergyIntoleranceCriticality createInstance() {
		return FhirFactory.eINSTANCE.createAllergyIntoleranceCriticality();
	}
	
	public static AllergyIntoleranceCriticalityRef valueOf(String id) {
		AllergyIntoleranceCriticalityRef result = new AllergyIntoleranceCriticalityRef();
		result.setID(id);
		return result;
	}

	@Override
	public String toString() {
		return getID();
	}
	

}