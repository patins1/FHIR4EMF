package org.hl7.fhir.jaxb;

import org.hl7.fhir.FhirFactory;
import org.hl7.fhir.Uri;

import javax.xml.bind.annotation.adapters.XmlAdapter;
	
import java.lang.String;
	
	
	
	

public class UriImplAdapter extends XmlAdapter<String, Uri> {

	@Override
	public Uri unmarshal(String v) throws Exception {
		Uri result = FhirFactory.eINSTANCE.createUri();
		result.setValue(v);
		return result;
	}

	@Override
	public String marshal(Uri v) throws Exception {
		return v.getValue();
	}

}
