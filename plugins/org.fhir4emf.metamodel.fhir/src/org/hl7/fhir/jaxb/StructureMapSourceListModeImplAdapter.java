package org.hl7.fhir.jaxb;

import org.hl7.fhir.FhirFactory;
import org.hl7.fhir.StructureMapSourceListMode;

import javax.xml.bind.annotation.adapters.XmlAdapter;
	
import org.hl7.fhir.StructureMapSourceListModeList;
	
	
	
	

public class StructureMapSourceListModeImplAdapter extends XmlAdapter<String, StructureMapSourceListMode> {

	@Override
	public StructureMapSourceListMode unmarshal(String v) throws Exception {
		StructureMapSourceListMode result = FhirFactory.eINSTANCE.createStructureMapSourceListMode();
		result.setValue(StructureMapSourceListModeList.get(v));
		return result;
	}

	@Override
	public String marshal(StructureMapSourceListMode v) throws Exception {
		return v.getValue().getLiteral();
	}

}
