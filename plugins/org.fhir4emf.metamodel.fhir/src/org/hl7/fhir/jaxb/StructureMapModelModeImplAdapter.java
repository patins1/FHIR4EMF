package org.hl7.fhir.jaxb;

import org.hl7.fhir.FhirFactory;
import org.hl7.fhir.StructureMapModelMode;

import javax.xml.bind.annotation.adapters.XmlAdapter;
	
import org.hl7.fhir.StructureMapModelModeList;
	
	
	
	

public class StructureMapModelModeImplAdapter extends XmlAdapter<String, StructureMapModelMode> {

	@Override
	public StructureMapModelMode unmarshal(String v) throws Exception {
		StructureMapModelMode result = FhirFactory.eINSTANCE.createStructureMapModelMode();
		result.setValue(StructureMapModelModeList.get(v));
		return result;
	}

	@Override
	public String marshal(StructureMapModelMode v) throws Exception {
		return v.getValue().getLiteral();
	}

}
