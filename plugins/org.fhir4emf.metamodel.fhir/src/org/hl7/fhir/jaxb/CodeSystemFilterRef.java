package org.hl7.fhir.jaxb;

import javax.xml.bind.annotation.*;
import org.eclipse.emf.ecore.jaxb.*;

import org.hl7.fhir.CodeSystemFilter;
import org.hl7.fhir.FhirFactory;

@XmlRootElement(name = "CodeSystemFilterRefElement")
public class CodeSystemFilterRef extends org.hl7.fhir.jaxb.BackboneElementRef  {

	

	
	@Override
	public CodeSystemFilter createInstance() {
		return FhirFactory.eINSTANCE.createCodeSystemFilter();
	}
	
	public static CodeSystemFilterRef valueOf(String id) {
		CodeSystemFilterRef result = new CodeSystemFilterRef();
		result.setID(id);
		return result;
	}

	@Override
	public String toString() {
		return getID();
	}
	

}