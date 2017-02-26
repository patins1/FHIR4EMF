package org.hl7.fhir.jaxb;

import javax.xml.bind.annotation.*;
import org.eclipse.emf.ecore.jaxb.*;

import org.hl7.fhir.FhirFactory;
import org.hl7.fhir.IdentifierUse;

@XmlRootElement(name = "IdentifierUseRefElement")
public class IdentifierUseRef extends org.hl7.fhir.jaxb.ElementRef  {

	

	
	@Override
	public IdentifierUse createInstance() {
		return FhirFactory.eINSTANCE.createIdentifierUse();
	}
	
	public static IdentifierUseRef valueOf(String id) {
		IdentifierUseRef result = new IdentifierUseRef();
		result.setID(id);
		return result;
	}

	@Override
	public String toString() {
		return getID();
	}
	

}