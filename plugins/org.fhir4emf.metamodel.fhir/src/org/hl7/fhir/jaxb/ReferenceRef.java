package org.hl7.fhir.jaxb;

import javax.xml.bind.annotation.*;
import org.eclipse.emf.ecore.jaxb.*;

import org.hl7.fhir.FhirFactory;
import org.hl7.fhir.Reference;

@XmlRootElement(name = "ReferenceRefElement")
public class ReferenceRef extends org.hl7.fhir.jaxb.ElementRef  {

	

	
	@Override
	public Reference createInstance() {
		return FhirFactory.eINSTANCE.createReference();
	}
	
	public static ReferenceRef valueOf(String id) {
		ReferenceRef result = new ReferenceRef();
		result.setID(id);
		return result;
	}

	@Override
	public String toString() {
		return getID();
	}
	

}