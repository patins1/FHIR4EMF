package org.hl7.fhir.jaxb;

import javax.xml.bind.annotation.*;
import org.eclipse.emf.ecore.jaxb.*;

import org.hl7.fhir.CodeSystemProperty1;
import org.hl7.fhir.FhirFactory;

@XmlRootElement(name = "CodeSystemProperty1RefElement")
public class CodeSystemProperty1Ref extends org.hl7.fhir.jaxb.BackboneElementRef  {

	

	
	@Override
	public CodeSystemProperty1 createInstance() {
		return FhirFactory.eINSTANCE.createCodeSystemProperty1();
	}
	
	public static CodeSystemProperty1Ref valueOf(String id) {
		CodeSystemProperty1Ref result = new CodeSystemProperty1Ref();
		result.setID(id);
		return result;
	}

	@Override
	public String toString() {
		return getID();
	}
	

}