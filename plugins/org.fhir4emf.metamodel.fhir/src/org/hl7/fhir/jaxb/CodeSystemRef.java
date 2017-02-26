package org.hl7.fhir.jaxb;

import javax.xml.bind.annotation.*;
import org.eclipse.emf.ecore.jaxb.*;

import org.hl7.fhir.CodeSystem;
import org.hl7.fhir.FhirFactory;

@XmlRootElement(name = "CodeSystemRefElement")
public class CodeSystemRef extends org.hl7.fhir.jaxb.DomainResourceRef  {

	

	
	@Override
	public CodeSystem createInstance() {
		return FhirFactory.eINSTANCE.createCodeSystem();
	}
	
	public static CodeSystemRef valueOf(String id) {
		CodeSystemRef result = new CodeSystemRef();
		result.setID(id);
		return result;
	}

	@Override
	public String toString() {
		return getID();
	}
	

}