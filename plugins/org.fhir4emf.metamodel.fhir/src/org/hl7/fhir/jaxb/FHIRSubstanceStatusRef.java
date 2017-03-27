package org.hl7.fhir.jaxb;

import javax.xml.bind.annotation.*;
import org.eclipse.emf.ecore.jaxb.*;

import org.hl7.fhir.FHIRSubstanceStatus;
import org.hl7.fhir.FhirFactory;

@XmlRootElement(name = "FHIRSubstanceStatusRefElement")
public class FHIRSubstanceStatusRef extends org.hl7.fhir.jaxb.ElementRef  {

	

	
	@Override
	public FHIRSubstanceStatus createInstance() {
		return FhirFactory.eINSTANCE.createFHIRSubstanceStatus();
	}
	
	public static FHIRSubstanceStatusRef valueOf(String id) {
		FHIRSubstanceStatusRef result = new FHIRSubstanceStatusRef();
		result.setID(id);
		return result;
	}

	@Override
	public String toString() {
		return getID();
	}
	

}