package org.hl7.fhir.jaxb;

import javax.xml.bind.annotation.*;
import org.eclipse.emf.ecore.jaxb.*;

import org.hl7.fhir.AllergyIntoleranceSeverity;
import org.hl7.fhir.FhirFactory;

@XmlRootElement(name = "AllergyIntoleranceSeverityRefElement")
public class AllergyIntoleranceSeverityRef extends org.hl7.fhir.jaxb.ElementRef  {

	

	
	@Override
	public AllergyIntoleranceSeverity createInstance() {
		return FhirFactory.eINSTANCE.createAllergyIntoleranceSeverity();
	}
	
	public static AllergyIntoleranceSeverityRef valueOf(String id) {
		AllergyIntoleranceSeverityRef result = new AllergyIntoleranceSeverityRef();
		result.setID(id);
		return result;
	}

	@Override
	public String toString() {
		return getID();
	}
	

}