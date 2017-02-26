package org.hl7.fhir.jaxb;

import org.hl7.fhir.FhirFactory;
import org.hl7.fhir.VisionEyes;

import javax.xml.bind.annotation.adapters.XmlAdapter;
	
import org.hl7.fhir.VisionEyesList;
	
	
	
	

public class VisionEyesImplAdapter extends XmlAdapter<String, VisionEyes> {

	@Override
	public VisionEyes unmarshal(String v) throws Exception {
		VisionEyes result = FhirFactory.eINSTANCE.createVisionEyes();
		result.setValue(VisionEyesList.get(v));
		return result;
	}

	@Override
	public String marshal(VisionEyes v) throws Exception {
		return v.getValue().getLiteral();
	}

}
