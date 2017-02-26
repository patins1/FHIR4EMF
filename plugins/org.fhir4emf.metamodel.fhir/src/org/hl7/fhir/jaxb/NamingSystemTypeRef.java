package org.hl7.fhir.jaxb;

import javax.xml.bind.annotation.*;
import org.eclipse.emf.ecore.jaxb.*;

import org.hl7.fhir.FhirFactory;
import org.hl7.fhir.NamingSystemType;

@XmlRootElement(name = "NamingSystemTypeRefElement")
public class NamingSystemTypeRef extends org.hl7.fhir.jaxb.ElementRef  {

	

	
	@Override
	public NamingSystemType createInstance() {
		return FhirFactory.eINSTANCE.createNamingSystemType();
	}
	
	public static NamingSystemTypeRef valueOf(String id) {
		NamingSystemTypeRef result = new NamingSystemTypeRef();
		result.setID(id);
		return result;
	}

	@Override
	public String toString() {
		return getID();
	}
	

}