package org.hl7.fhir.jaxb;

import org.hl7.fhir.CodeSystemContentMode;
import org.hl7.fhir.FhirFactory;

import javax.xml.bind.annotation.adapters.XmlAdapter;
	
import org.hl7.fhir.CodeSystemContentModeList;
	
	
	
	

public class CodeSystemContentModeImplAdapter extends XmlAdapter<String, CodeSystemContentMode> {

	@Override
	public CodeSystemContentMode unmarshal(String v) throws Exception {
		CodeSystemContentMode result = FhirFactory.eINSTANCE.createCodeSystemContentMode();
		result.setValue(CodeSystemContentModeList.get(v));
		return result;
	}

	@Override
	public String marshal(CodeSystemContentMode v) throws Exception {
		return v.getValue().getLiteral();
	}

}
