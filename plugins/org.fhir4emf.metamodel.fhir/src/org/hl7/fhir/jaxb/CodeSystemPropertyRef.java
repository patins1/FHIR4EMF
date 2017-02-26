package org.hl7.fhir.jaxb;

import javax.xml.bind.annotation.*;
import org.eclipse.emf.ecore.jaxb.*;

import org.hl7.fhir.CodeSystemProperty;
import org.hl7.fhir.FhirFactory;

@XmlRootElement(name = "CodeSystemPropertyRefElement")
public class CodeSystemPropertyRef extends org.hl7.fhir.jaxb.BackboneElementRef  {

	

	
	@Override
	public CodeSystemProperty createInstance() {
		return FhirFactory.eINSTANCE.createCodeSystemProperty();
	}
	
	public static CodeSystemPropertyRef valueOf(String id) {
		CodeSystemPropertyRef result = new CodeSystemPropertyRef();
		result.setID(id);
		return result;
	}

	@Override
	public String toString() {
		return getID();
	}
	

}