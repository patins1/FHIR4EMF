package org.hl7.fhir.jaxb;

import org.hl7.fhir.FhirFactory;
import org.hl7.fhir.StructureMapInputMode;

import javax.xml.bind.annotation.adapters.XmlAdapter;
	
import org.hl7.fhir.StructureMapInputModeList;
	
	
	
	

public class StructureMapInputModeImplAdapter extends XmlAdapter<String, StructureMapInputMode> {

	@Override
	public StructureMapInputMode unmarshal(String v) throws Exception {
		StructureMapInputMode result = FhirFactory.eINSTANCE.createStructureMapInputMode();
		result.setValue(StructureMapInputModeList.get(v));
		return result;
	}

	@Override
	public String marshal(StructureMapInputMode v) throws Exception {
		return v.getValue().getLiteral();
	}

}
