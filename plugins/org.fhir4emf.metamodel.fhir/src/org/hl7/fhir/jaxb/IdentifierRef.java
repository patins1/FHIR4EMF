package org.hl7.fhir.jaxb;

import javax.xml.bind.annotation.*;
import org.eclipse.emf.ecore.jaxb.*;

import org.hl7.fhir.FhirFactory;
import org.hl7.fhir.Identifier;

@XmlRootElement(name = "IdentifierRefElement")
public class IdentifierRef extends org.hl7.fhir.jaxb.ElementRef  {

	

	
	@Override
	public Identifier createInstance() {
		return FhirFactory.eINSTANCE.createIdentifier();
	}
	
	public static IdentifierRef valueOf(String id) {
		IdentifierRef result = new IdentifierRef();
		result.setID(id);
		return result;
	}

	@Override
	public String toString() {
		return getID();
	}
	

}