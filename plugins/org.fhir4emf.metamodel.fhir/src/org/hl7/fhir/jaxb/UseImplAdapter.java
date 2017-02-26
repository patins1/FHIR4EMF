package org.hl7.fhir.jaxb;

import org.hl7.fhir.FhirFactory;
import org.hl7.fhir.Use;

import javax.xml.bind.annotation.adapters.XmlAdapter;
	
import org.hl7.fhir.UseList;
	
	
	
	

public class UseImplAdapter extends XmlAdapter<String, Use> {

	@Override
	public Use unmarshal(String v) throws Exception {
		Use result = FhirFactory.eINSTANCE.createUse();
		result.setValue(UseList.get(v));
		return result;
	}

	@Override
	public String marshal(Use v) throws Exception {
		return v.getValue().getLiteral();
	}

}
