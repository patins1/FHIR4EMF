package org.hl7.fhir.jaxb;

import javax.xml.bind.annotation.*;
import org.eclipse.emf.ecore.jaxb.*;

import org.hl7.fhir.Code;
import org.hl7.fhir.FhirFactory;

@XmlRootElement(name = "CodeRefElement")
public class CodeRef extends org.hl7.fhir.jaxb.ElementRef  {

	

	
	@Override
	public Code createInstance() {
		return FhirFactory.eINSTANCE.createCode();
	}
	
	public static CodeRef valueOf(String id) {
		CodeRef result = new CodeRef();
		result.setID(id);
		return result;
	}

	@Override
	public String toString() {
		return getID();
	}
	

}