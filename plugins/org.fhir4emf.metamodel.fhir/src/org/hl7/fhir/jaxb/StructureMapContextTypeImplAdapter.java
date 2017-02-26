package org.hl7.fhir.jaxb;

import org.hl7.fhir.FhirFactory;
import org.hl7.fhir.StructureMapContextType;

import javax.xml.bind.annotation.adapters.XmlAdapter;
	
import org.hl7.fhir.StructureMapContextTypeList;
	
	
	
	

public class StructureMapContextTypeImplAdapter extends XmlAdapter<String, StructureMapContextType> {

	@Override
	public StructureMapContextType unmarshal(String v) throws Exception {
		StructureMapContextType result = FhirFactory.eINSTANCE.createStructureMapContextType();
		result.setValue(StructureMapContextTypeList.get(v));
		return result;
	}

	@Override
	public String marshal(StructureMapContextType v) throws Exception {
		return v.getValue().getLiteral();
	}

}
