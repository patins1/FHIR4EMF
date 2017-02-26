package org.hl7.fhir.jaxb;

import org.hl7.fhir.FhirFactory;
import org.hl7.fhir.StructureDefinitionKind;

import javax.xml.bind.annotation.adapters.XmlAdapter;
	
import org.hl7.fhir.StructureDefinitionKindList;
	
	
	
	

public class StructureDefinitionKindImplAdapter extends XmlAdapter<String, StructureDefinitionKind> {

	@Override
	public StructureDefinitionKind unmarshal(String v) throws Exception {
		StructureDefinitionKind result = FhirFactory.eINSTANCE.createStructureDefinitionKind();
		result.setValue(StructureDefinitionKindList.get(v));
		return result;
	}

	@Override
	public String marshal(StructureDefinitionKind v) throws Exception {
		return v.getValue().getLiteral();
	}

}
