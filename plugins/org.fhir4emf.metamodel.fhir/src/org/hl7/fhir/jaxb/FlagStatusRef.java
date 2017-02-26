package org.hl7.fhir.jaxb;

import javax.xml.bind.annotation.*;
import org.eclipse.emf.ecore.jaxb.*;

import org.hl7.fhir.FhirFactory;
import org.hl7.fhir.FlagStatus;

@XmlRootElement(name = "FlagStatusRefElement")
public class FlagStatusRef extends org.hl7.fhir.jaxb.ElementRef  {

	

	
	@Override
	public FlagStatus createInstance() {
		return FhirFactory.eINSTANCE.createFlagStatus();
	}
	
	public static FlagStatusRef valueOf(String id) {
		FlagStatusRef result = new FlagStatusRef();
		result.setID(id);
		return result;
	}

	@Override
	public String toString() {
		return getID();
	}
	

}