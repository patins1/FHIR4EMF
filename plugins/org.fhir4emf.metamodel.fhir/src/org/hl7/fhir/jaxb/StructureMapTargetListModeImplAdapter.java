package org.hl7.fhir.jaxb;

import org.hl7.fhir.FhirFactory;
import org.hl7.fhir.StructureMapTargetListMode;

import javax.xml.bind.annotation.adapters.XmlAdapter;
	
import org.hl7.fhir.StructureMapTargetListModeList;
	
	
	
	

public class StructureMapTargetListModeImplAdapter extends XmlAdapter<String, StructureMapTargetListMode> {

	@Override
	public StructureMapTargetListMode unmarshal(String v) throws Exception {
		StructureMapTargetListMode result = FhirFactory.eINSTANCE.createStructureMapTargetListMode();
		result.setValue(StructureMapTargetListModeList.get(v));
		return result;
	}

	@Override
	public String marshal(StructureMapTargetListMode v) throws Exception {
		return v.getValue().getLiteral();
	}

}
