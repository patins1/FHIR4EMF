package org.hl7.fhir.jaxb;

import org.hl7.fhir.DataElementStringency;
import org.hl7.fhir.FhirFactory;

import javax.xml.bind.annotation.adapters.XmlAdapter;
	
import org.hl7.fhir.DataElementStringencyList;
	
	
	
	

public class DataElementStringencyImplAdapter extends XmlAdapter<String, DataElementStringency> {

	@Override
	public DataElementStringency unmarshal(String v) throws Exception {
		DataElementStringency result = FhirFactory.eINSTANCE.createDataElementStringency();
		result.setValue(DataElementStringencyList.get(v));
		return result;
	}

	@Override
	public String marshal(DataElementStringency v) throws Exception {
		return v.getValue().getLiteral();
	}

}
