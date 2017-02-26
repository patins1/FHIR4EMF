package org.hl7.fhir.jaxb;

import org.hl7.fhir.FhirFactory;
import org.hl7.fhir.VisionBase;

import javax.xml.bind.annotation.adapters.XmlAdapter;
	
import org.hl7.fhir.VisionBaseList;
	
	
	
	

public class VisionBaseImplAdapter extends XmlAdapter<String, VisionBase> {

	@Override
	public VisionBase unmarshal(String v) throws Exception {
		VisionBase result = FhirFactory.eINSTANCE.createVisionBase();
		result.setValue(VisionBaseList.get(v));
		return result;
	}

	@Override
	public String marshal(VisionBase v) throws Exception {
		return v.getValue().getLiteral();
	}

}
