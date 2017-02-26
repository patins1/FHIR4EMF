package org.hl7.fhir.jaxb;

import org.hl7.fhir.ExtensionContext;
import org.hl7.fhir.FhirFactory;

import javax.xml.bind.annotation.adapters.XmlAdapter;
	
import org.hl7.fhir.ExtensionContextList;
	
	
	
	

public class ExtensionContextImplAdapter extends XmlAdapter<String, ExtensionContext> {

	@Override
	public ExtensionContext unmarshal(String v) throws Exception {
		ExtensionContext result = FhirFactory.eINSTANCE.createExtensionContext();
		result.setValue(ExtensionContextList.get(v));
		return result;
	}

	@Override
	public String marshal(ExtensionContext v) throws Exception {
		return v.getValue().getLiteral();
	}

}
