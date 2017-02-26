package org.hl7.fhir.jaxb;

import org.hl7.fhir.FhirFactory;
import org.hl7.fhir.MeasmntPrinciple;

import javax.xml.bind.annotation.adapters.XmlAdapter;
	
import org.hl7.fhir.MeasmntPrincipleList;
	
	
	
	

public class MeasmntPrincipleImplAdapter extends XmlAdapter<String, MeasmntPrinciple> {

	@Override
	public MeasmntPrinciple unmarshal(String v) throws Exception {
		MeasmntPrinciple result = FhirFactory.eINSTANCE.createMeasmntPrinciple();
		result.setValue(MeasmntPrincipleList.get(v));
		return result;
	}

	@Override
	public String marshal(MeasmntPrinciple v) throws Exception {
		return v.getValue().getLiteral();
	}

}
