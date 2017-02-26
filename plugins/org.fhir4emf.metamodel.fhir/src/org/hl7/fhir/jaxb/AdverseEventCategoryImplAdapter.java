package org.hl7.fhir.jaxb;

import org.hl7.fhir.AdverseEventCategory;
import org.hl7.fhir.FhirFactory;

import javax.xml.bind.annotation.adapters.XmlAdapter;
	
import org.hl7.fhir.AdverseEventCategoryList;
	
	
	
	

public class AdverseEventCategoryImplAdapter extends XmlAdapter<String, AdverseEventCategory> {

	@Override
	public AdverseEventCategory unmarshal(String v) throws Exception {
		AdverseEventCategory result = FhirFactory.eINSTANCE.createAdverseEventCategory();
		result.setValue(AdverseEventCategoryList.get(v));
		return result;
	}

	@Override
	public String marshal(AdverseEventCategory v) throws Exception {
		return v.getValue().getLiteral();
	}

}
