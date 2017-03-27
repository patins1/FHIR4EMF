package org.hl7.fhir.jaxb;

import org.hl7.fhir.AllergyIntoleranceCategory;
import org.hl7.fhir.FhirFactory;

import javax.xml.bind.annotation.adapters.XmlAdapter;
	
import org.hl7.fhir.AllergyIntoleranceCategoryList;
	
	
	
	

public class AllergyIntoleranceCategoryImplAdapter extends XmlAdapter<String, AllergyIntoleranceCategory> {

	@Override
	public AllergyIntoleranceCategory unmarshal(String v) throws Exception {
		AllergyIntoleranceCategory result = FhirFactory.eINSTANCE.createAllergyIntoleranceCategory();
		result.setValue(AllergyIntoleranceCategoryList.get(v));
		return result;
	}

	@Override
	public String marshal(AllergyIntoleranceCategory v) throws Exception {
		return v.getValue().getLiteral();
	}

}
