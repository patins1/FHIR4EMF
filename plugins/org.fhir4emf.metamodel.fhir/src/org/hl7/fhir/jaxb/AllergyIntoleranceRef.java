package org.hl7.fhir.jaxb;

import javax.xml.bind.annotation.*;
import org.eclipse.emf.ecore.jaxb.*;

import org.hl7.fhir.AllergyIntolerance;
import org.hl7.fhir.FhirFactory;

@XmlRootElement(name = "AllergyIntoleranceRefElement")
public class AllergyIntoleranceRef extends org.hl7.fhir.jaxb.DomainResourceRef  {

	

	
	@Override
	public AllergyIntolerance createInstance() {
		return FhirFactory.eINSTANCE.createAllergyIntolerance();
	}
	
	public static AllergyIntoleranceRef valueOf(String id) {
		AllergyIntoleranceRef result = new AllergyIntoleranceRef();
		result.setID(id);
		return result;
	}

	@Override
	public String toString() {
		return getID();
	}
	

}