package org.hl7.fhir.jaxb;

import org.hl7.fhir.FhirFactory;
import org.hl7.fhir.SampledDataDataType;

import javax.xml.bind.annotation.adapters.XmlAdapter;
	
import java.lang.String;
	
	
	
	

public class SampledDataDataTypeImplAdapter extends XmlAdapter<String, SampledDataDataType> {

	@Override
	public SampledDataDataType unmarshal(String v) throws Exception {
		SampledDataDataType result = FhirFactory.eINSTANCE.createSampledDataDataType();
		result.setValue(v);
		return result;
	}

	@Override
	public String marshal(SampledDataDataType v) throws Exception {
		return v.getValue();
	}

}
