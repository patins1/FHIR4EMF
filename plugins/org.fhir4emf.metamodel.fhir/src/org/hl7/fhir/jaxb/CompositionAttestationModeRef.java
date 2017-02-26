package org.hl7.fhir.jaxb;

import javax.xml.bind.annotation.*;
import org.eclipse.emf.ecore.jaxb.*;

import org.hl7.fhir.CompositionAttestationMode;
import org.hl7.fhir.FhirFactory;

@XmlRootElement(name = "CompositionAttestationModeRefElement")
public class CompositionAttestationModeRef extends org.hl7.fhir.jaxb.ElementRef  {

	

	
	@Override
	public CompositionAttestationMode createInstance() {
		return FhirFactory.eINSTANCE.createCompositionAttestationMode();
	}
	
	public static CompositionAttestationModeRef valueOf(String id) {
		CompositionAttestationModeRef result = new CompositionAttestationModeRef();
		result.setID(id);
		return result;
	}

	@Override
	public String toString() {
		return getID();
	}
	

}