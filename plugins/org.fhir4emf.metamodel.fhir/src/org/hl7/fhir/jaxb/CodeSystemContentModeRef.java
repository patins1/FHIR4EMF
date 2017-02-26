package org.hl7.fhir.jaxb;

import javax.xml.bind.annotation.*;
import org.eclipse.emf.ecore.jaxb.*;

import org.hl7.fhir.CodeSystemContentMode;
import org.hl7.fhir.FhirFactory;

@XmlRootElement(name = "CodeSystemContentModeRefElement")
public class CodeSystemContentModeRef extends org.hl7.fhir.jaxb.ElementRef  {

	

	
	@Override
	public CodeSystemContentMode createInstance() {
		return FhirFactory.eINSTANCE.createCodeSystemContentMode();
	}
	
	public static CodeSystemContentModeRef valueOf(String id) {
		CodeSystemContentModeRef result = new CodeSystemContentModeRef();
		result.setID(id);
		return result;
	}

	@Override
	public String toString() {
		return getID();
	}
	

}