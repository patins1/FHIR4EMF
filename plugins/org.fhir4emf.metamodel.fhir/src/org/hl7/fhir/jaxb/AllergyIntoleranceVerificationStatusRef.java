package org.hl7.fhir.jaxb;

import javax.xml.bind.annotation.*;
import org.eclipse.emf.ecore.jaxb.*;

import org.hl7.fhir.AllergyIntoleranceVerificationStatus;
import org.hl7.fhir.FhirFactory;

@XmlRootElement(name = "AllergyIntoleranceVerificationStatusRefElement")
public class AllergyIntoleranceVerificationStatusRef extends org.hl7.fhir.jaxb.ElementRef  {

	

	
	@Override
	public AllergyIntoleranceVerificationStatus createInstance() {
		return FhirFactory.eINSTANCE.createAllergyIntoleranceVerificationStatus();
	}
	
	public static AllergyIntoleranceVerificationStatusRef valueOf(String id) {
		AllergyIntoleranceVerificationStatusRef result = new AllergyIntoleranceVerificationStatusRef();
		result.setID(id);
		return result;
	}

	@Override
	public String toString() {
		return getID();
	}
	

}