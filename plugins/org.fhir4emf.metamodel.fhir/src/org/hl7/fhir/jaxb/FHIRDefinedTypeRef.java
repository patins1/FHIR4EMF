package org.hl7.fhir.jaxb;

import javax.xml.bind.annotation.*;
import org.eclipse.emf.ecore.jaxb.*;

import org.hl7.fhir.FHIRDefinedType;
import org.hl7.fhir.FhirFactory;

@XmlRootElement(name = "FHIRDefinedTypeRefElement")
public class FHIRDefinedTypeRef extends org.hl7.fhir.jaxb.ElementRef  {

	

	
	@Override
	public FHIRDefinedType createInstance() {
		return FhirFactory.eINSTANCE.createFHIRDefinedType();
	}
	
	public static FHIRDefinedTypeRef valueOf(String id) {
		FHIRDefinedTypeRef result = new FHIRDefinedTypeRef();
		result.setID(id);
		return result;
	}

	@Override
	public String toString() {
		return getID();
	}
	

}