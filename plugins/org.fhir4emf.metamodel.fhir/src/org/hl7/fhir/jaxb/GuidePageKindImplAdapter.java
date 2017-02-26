package org.hl7.fhir.jaxb;

import org.hl7.fhir.FhirFactory;
import org.hl7.fhir.GuidePageKind;

import javax.xml.bind.annotation.adapters.XmlAdapter;
	
import org.hl7.fhir.GuidePageKindList;
	
	
	
	

public class GuidePageKindImplAdapter extends XmlAdapter<String, GuidePageKind> {

	@Override
	public GuidePageKind unmarshal(String v) throws Exception {
		GuidePageKind result = FhirFactory.eINSTANCE.createGuidePageKind();
		result.setValue(GuidePageKindList.get(v));
		return result;
	}

	@Override
	public String marshal(GuidePageKind v) throws Exception {
		return v.getValue().getLiteral();
	}

}
