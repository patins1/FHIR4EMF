package org.hl7.fhir.jaxb;

import org.hl7.fhir.FHIRDefinedType;
import org.hl7.fhir.FhirFactory;

import javax.xml.bind.annotation.adapters.XmlAdapter;
	
import org.hl7.fhir.FHIRDefinedTypeList;
	
	
	
	

public class FHIRDefinedTypeImplAdapter extends XmlAdapter<String, FHIRDefinedType> {

	@Override
	public FHIRDefinedType unmarshal(String v) throws Exception {
		FHIRDefinedType result = FhirFactory.eINSTANCE.createFHIRDefinedType();
		result.setValue(FHIRDefinedTypeList.get(v));
		return result;
	}

	@Override
	public String marshal(FHIRDefinedType v) throws Exception {
		return v.getValue().getLiteral();
	}

}
