package org.hl7.fhir.jaxb;

import org.hl7.fhir.FhirFactory;
import org.hl7.fhir.StructureMapTransform;

import javax.xml.bind.annotation.adapters.XmlAdapter;
	
import org.hl7.fhir.StructureMapTransformList;
	
	
	
	

public class StructureMapTransformImplAdapter extends XmlAdapter<String, StructureMapTransform> {

	@Override
	public StructureMapTransform unmarshal(String v) throws Exception {
		StructureMapTransform result = FhirFactory.eINSTANCE.createStructureMapTransform();
		result.setValue(StructureMapTransformList.get(v));
		return result;
	}

	@Override
	public String marshal(StructureMapTransform v) throws Exception {
		return v.getValue().getLiteral();
	}

}
