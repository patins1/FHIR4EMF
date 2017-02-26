package org.hl7.fhir.jaxb;

import org.hl7.fhir.AllergyIntoleranceSeverity;
import org.hl7.fhir.FhirFactory;

import javax.xml.bind.annotation.adapters.XmlAdapter;
	
import org.hl7.fhir.AllergyIntoleranceSeverityList;
	
	
	
	

public class AllergyIntoleranceSeverityImplAdapter extends XmlAdapter<String, AllergyIntoleranceSeverity> {

	@Override
	public AllergyIntoleranceSeverity unmarshal(String v) throws Exception {
		AllergyIntoleranceSeverity result = FhirFactory.eINSTANCE.createAllergyIntoleranceSeverity();
		result.setValue(AllergyIntoleranceSeverityList.get(v));
		return result;
	}

	@Override
	public String marshal(AllergyIntoleranceSeverity v) throws Exception {
		return v.getValue().getLiteral();
	}

}
