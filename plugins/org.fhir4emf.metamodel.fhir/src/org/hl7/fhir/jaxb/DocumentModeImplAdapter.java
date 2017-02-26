package org.hl7.fhir.jaxb;

import org.hl7.fhir.DocumentMode;
import org.hl7.fhir.FhirFactory;

import javax.xml.bind.annotation.adapters.XmlAdapter;
	
import org.hl7.fhir.DocumentModeList;
	
	
	
	

public class DocumentModeImplAdapter extends XmlAdapter<String, DocumentMode> {

	@Override
	public DocumentMode unmarshal(String v) throws Exception {
		DocumentMode result = FhirFactory.eINSTANCE.createDocumentMode();
		result.setValue(DocumentModeList.get(v));
		return result;
	}

	@Override
	public String marshal(DocumentMode v) throws Exception {
		return v.getValue().getLiteral();
	}

}
