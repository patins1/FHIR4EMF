package org.hl7.fhir.jaxb;

import org.hl7.fhir.FhirFactory;
import org.hl7.fhir.SubstanceStatus;

import javax.xml.bind.annotation.adapters.XmlAdapter;
	
import org.hl7.fhir.SubstanceStatusList;
	
	
	
	

public class SubstanceStatusImplAdapter extends XmlAdapter<String, SubstanceStatus> {

	@Override
	public SubstanceStatus unmarshal(String v) throws Exception {
		SubstanceStatus result = FhirFactory.eINSTANCE.createSubstanceStatus();
		result.setValue(SubstanceStatusList.get(v));
		return result;
	}

	@Override
	public String marshal(SubstanceStatus v) throws Exception {
		return v.getValue().getLiteral();
	}

}
