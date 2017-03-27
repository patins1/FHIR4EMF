package org.hl7.fhir.jaxb;

import org.hl7.fhir.FHIRAllTypes;
import org.hl7.fhir.FhirFactory;

import javax.xml.bind.annotation.adapters.XmlAdapter;
	
import org.hl7.fhir.FHIRAllTypesList;
	
	
	
	

public class FHIRAllTypesImplAdapter extends XmlAdapter<String, FHIRAllTypes> {

	@Override
	public FHIRAllTypes unmarshal(String v) throws Exception {
		FHIRAllTypes result = FhirFactory.eINSTANCE.createFHIRAllTypes();
		result.setValue(FHIRAllTypesList.get(v));
		return result;
	}

	@Override
	public String marshal(FHIRAllTypes v) throws Exception {
		return v.getValue().getLiteral();
	}

}
