package org.hl7.fhir.jaxb;

import javax.xml.bind.annotation.*;
import org.eclipse.emf.ecore.jaxb.*;

import org.hl7.fhir.AllergyIntoleranceClinicalStatus;
import org.hl7.fhir.FhirFactory;

@XmlRootElement(name = "AllergyIntoleranceClinicalStatusRefElement")
public class AllergyIntoleranceClinicalStatusRef extends org.hl7.fhir.jaxb.ElementRef  {

	

	
	@Override
	public AllergyIntoleranceClinicalStatus createInstance() {
		return FhirFactory.eINSTANCE.createAllergyIntoleranceClinicalStatus();
	}
	
	public static AllergyIntoleranceClinicalStatusRef valueOf(String id) {
		AllergyIntoleranceClinicalStatusRef result = new AllergyIntoleranceClinicalStatusRef();
		result.setID(id);
		return result;
	}

	@Override
	public String toString() {
		return getID();
	}
	

}