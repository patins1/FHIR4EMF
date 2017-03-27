package org.hl7.fhir.jaxb;

import javax.xml.bind.annotation.*;
import org.eclipse.emf.ecore.jaxb.*;

import org.hl7.fhir.AllergyIntoleranceCategory;
import org.hl7.fhir.FhirFactory;

@XmlRootElement(name = "AllergyIntoleranceCategoryRefElement")
public class AllergyIntoleranceCategoryRef extends org.hl7.fhir.jaxb.ElementRef  {

	

	
	@Override
	public AllergyIntoleranceCategory createInstance() {
		return FhirFactory.eINSTANCE.createAllergyIntoleranceCategory();
	}
	
	public static AllergyIntoleranceCategoryRef valueOf(String id) {
		AllergyIntoleranceCategoryRef result = new AllergyIntoleranceCategoryRef();
		result.setID(id);
		return result;
	}

	@Override
	public String toString() {
		return getID();
	}
	

}