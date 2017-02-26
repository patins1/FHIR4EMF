package org.hl7.fhir.jaxb;

import org.hl7.fhir.FhirFactory;
import org.hl7.fhir.StructureMapGroupTypeMode;

import javax.xml.bind.annotation.adapters.XmlAdapter;
	
import org.hl7.fhir.StructureMapGroupTypeModeList;
	
	
	
	

public class StructureMapGroupTypeModeImplAdapter extends XmlAdapter<String, StructureMapGroupTypeMode> {

	@Override
	public StructureMapGroupTypeMode unmarshal(String v) throws Exception {
		StructureMapGroupTypeMode result = FhirFactory.eINSTANCE.createStructureMapGroupTypeMode();
		result.setValue(StructureMapGroupTypeModeList.get(v));
		return result;
	}

	@Override
	public String marshal(StructureMapGroupTypeMode v) throws Exception {
		return v.getValue().getLiteral();
	}

}
