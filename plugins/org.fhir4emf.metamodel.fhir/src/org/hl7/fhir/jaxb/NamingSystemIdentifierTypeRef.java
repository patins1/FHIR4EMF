package org.hl7.fhir.jaxb;

import javax.xml.bind.annotation.*;
import org.eclipse.emf.ecore.jaxb.*;

import org.hl7.fhir.FhirFactory;
import org.hl7.fhir.NamingSystemIdentifierType;

@XmlRootElement(name = "NamingSystemIdentifierTypeRefElement")
public class NamingSystemIdentifierTypeRef extends org.hl7.fhir.jaxb.ElementRef  {

	

	
	@Override
	public NamingSystemIdentifierType createInstance() {
		return FhirFactory.eINSTANCE.createNamingSystemIdentifierType();
	}
	
	public static NamingSystemIdentifierTypeRef valueOf(String id) {
		NamingSystemIdentifierTypeRef result = new NamingSystemIdentifierTypeRef();
		result.setID(id);
		return result;
	}

	@Override
	public String toString() {
		return getID();
	}
	

}