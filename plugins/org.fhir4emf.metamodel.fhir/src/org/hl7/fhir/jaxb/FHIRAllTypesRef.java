package org.hl7.fhir.jaxb;

import javax.xml.bind.annotation.*;
import org.eclipse.emf.ecore.jaxb.*;

import org.hl7.fhir.FHIRAllTypes;
import org.hl7.fhir.FhirFactory;

@XmlRootElement(name = "FHIRAllTypesRefElement")
public class FHIRAllTypesRef extends org.hl7.fhir.jaxb.ElementRef  {

	

	
	@Override
	public FHIRAllTypes createInstance() {
		return FhirFactory.eINSTANCE.createFHIRAllTypes();
	}
	
	public static FHIRAllTypesRef valueOf(String id) {
		FHIRAllTypesRef result = new FHIRAllTypesRef();
		result.setID(id);
		return result;
	}

	@Override
	public String toString() {
		return getID();
	}
	

}