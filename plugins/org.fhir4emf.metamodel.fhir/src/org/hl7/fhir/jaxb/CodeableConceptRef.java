package org.hl7.fhir.jaxb;

import javax.xml.bind.annotation.*;
import org.eclipse.emf.ecore.jaxb.*;

import org.hl7.fhir.CodeableConcept;
import org.hl7.fhir.FhirFactory;

@XmlRootElement(name = "CodeableConceptRefElement")
public class CodeableConceptRef extends org.hl7.fhir.jaxb.ElementRef  {

	

	
	@Override
	public CodeableConcept createInstance() {
		return FhirFactory.eINSTANCE.createCodeableConcept();
	}
	
	public static CodeableConceptRef valueOf(String id) {
		CodeableConceptRef result = new CodeableConceptRef();
		result.setID(id);
		return result;
	}

	@Override
	public String toString() {
		return getID();
	}
	

}