package org.hl7.fhir.jaxb;

import org.hl7.fhir.AllergyIntoleranceCriticality;
import org.hl7.fhir.FhirFactory;

import javax.xml.bind.annotation.adapters.XmlAdapter;
	
import org.hl7.fhir.AllergyIntoleranceCriticalityList;
	
	
	
	

public class AllergyIntoleranceCriticalityImplAdapter extends XmlAdapter<String, AllergyIntoleranceCriticality> {

	@Override
	public AllergyIntoleranceCriticality unmarshal(String v) throws Exception {
		AllergyIntoleranceCriticality result = FhirFactory.eINSTANCE.createAllergyIntoleranceCriticality();
		result.setValue(AllergyIntoleranceCriticalityList.get(v));
		return result;
	}

	@Override
	public String marshal(AllergyIntoleranceCriticality v) throws Exception {
		return v.getValue().getLiteral();
	}

}
