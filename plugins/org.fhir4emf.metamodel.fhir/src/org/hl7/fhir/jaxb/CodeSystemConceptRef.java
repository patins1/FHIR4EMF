package org.hl7.fhir.jaxb;

import javax.xml.bind.annotation.*;
import org.eclipse.emf.ecore.jaxb.*;

import org.hl7.fhir.CodeSystemConcept;
import org.hl7.fhir.FhirFactory;

@XmlRootElement(name = "CodeSystemConceptRefElement")
public class CodeSystemConceptRef extends org.hl7.fhir.jaxb.BackboneElementRef  {

	

	
	@Override
	public CodeSystemConcept createInstance() {
		return FhirFactory.eINSTANCE.createCodeSystemConcept();
	}
	
	public static CodeSystemConceptRef valueOf(String id) {
		CodeSystemConceptRef result = new CodeSystemConceptRef();
		result.setID(id);
		return result;
	}

	@Override
	public String toString() {
		return getID();
	}
	

}