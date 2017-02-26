package org.hl7.fhir.jaxb;

import javax.xml.bind.annotation.*;
import org.eclipse.emf.ecore.jaxb.*;

import org.hl7.fhir.FhirFactory;
import org.hl7.fhir.Markdown;

@XmlRootElement(name = "MarkdownRefElement")
public class MarkdownRef extends org.hl7.fhir.jaxb.ElementRef  {

	

	
	@Override
	public Markdown createInstance() {
		return FhirFactory.eINSTANCE.createMarkdown();
	}
	
	public static MarkdownRef valueOf(String id) {
		MarkdownRef result = new MarkdownRef();
		result.setID(id);
		return result;
	}

	@Override
	public String toString() {
		return getID();
	}
	

}