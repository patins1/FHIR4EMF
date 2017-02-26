package org.hl7.fhir.jaxb;

import javax.xml.bind.annotation.*;
import org.eclipse.emf.ecore.jaxb.*;

import org.hl7.fhir.DocumentMode;
import org.hl7.fhir.FhirFactory;

@XmlRootElement(name = "DocumentModeRefElement")
public class DocumentModeRef extends org.hl7.fhir.jaxb.ElementRef  {

	

	
	@Override
	public DocumentMode createInstance() {
		return FhirFactory.eINSTANCE.createDocumentMode();
	}
	
	public static DocumentModeRef valueOf(String id) {
		DocumentModeRef result = new DocumentModeRef();
		result.setID(id);
		return result;
	}

	@Override
	public String toString() {
		return getID();
	}
	

}