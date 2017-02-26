package org.hl7.fhir.jaxb;

import org.hl7.fhir.FhirFactory;
import org.hl7.fhir.Markdown;

import javax.xml.bind.annotation.adapters.XmlAdapter;
	
import java.lang.String;
	
	
	
	

public class MarkdownImplAdapter extends XmlAdapter<String, Markdown> {

	@Override
	public Markdown unmarshal(String v) throws Exception {
		Markdown result = FhirFactory.eINSTANCE.createMarkdown();
		result.setValue(v);
		return result;
	}

	@Override
	public String marshal(Markdown v) throws Exception {
		return v.getValue();
	}

}
