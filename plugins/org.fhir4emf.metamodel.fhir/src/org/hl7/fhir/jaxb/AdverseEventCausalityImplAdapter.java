package org.hl7.fhir.jaxb;

import org.hl7.fhir.AdverseEventCausality;
import org.hl7.fhir.FhirFactory;

import javax.xml.bind.annotation.adapters.XmlAdapter;
	
import org.hl7.fhir.AdverseEventCausalityList;
	
	
	
	

public class AdverseEventCausalityImplAdapter extends XmlAdapter<String, AdverseEventCausality> {

	@Override
	public AdverseEventCausality unmarshal(String v) throws Exception {
		AdverseEventCausality result = FhirFactory.eINSTANCE.createAdverseEventCausality();
		result.setValue(AdverseEventCausalityList.get(v));
		return result;
	}

	@Override
	public String marshal(AdverseEventCausality v) throws Exception {
		return v.getValue().getLiteral();
	}

}
