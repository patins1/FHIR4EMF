package org.hl7.fhir.jaxb;

import javax.xml.bind.annotation.*;
import org.eclipse.emf.ecore.jaxb.*;

import org.hl7.fhir.AllergyIntoleranceType;
import org.hl7.fhir.FhirFactory;

@XmlRootElement(name = "AllergyIntoleranceTypeRefElement")
public class AllergyIntoleranceTypeRef extends org.hl7.fhir.jaxb.ElementRef  {

	

	
	@Override
	public AllergyIntoleranceType createInstance() {
		return FhirFactory.eINSTANCE.createAllergyIntoleranceType();
	}
	
	public static AllergyIntoleranceTypeRef valueOf(String id) {
		AllergyIntoleranceTypeRef result = new AllergyIntoleranceTypeRef();
		result.setID(id);
		return result;
	}

	@Override
	public String toString() {
		return getID();
	}
	

}