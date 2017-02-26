package org.hl7.fhir.jaxb;

import org.hl7.fhir.CompositionAttestationMode;
import org.hl7.fhir.FhirFactory;

import javax.xml.bind.annotation.adapters.XmlAdapter;
	
import org.hl7.fhir.CompositionAttestationModeList;
	
	
	
	

public class CompositionAttestationModeImplAdapter extends XmlAdapter<String, CompositionAttestationMode> {

	@Override
	public CompositionAttestationMode unmarshal(String v) throws Exception {
		CompositionAttestationMode result = FhirFactory.eINSTANCE.createCompositionAttestationMode();
		result.setValue(CompositionAttestationModeList.get(v));
		return result;
	}

	@Override
	public String marshal(CompositionAttestationMode v) throws Exception {
		return v.getValue().getLiteral();
	}

}
