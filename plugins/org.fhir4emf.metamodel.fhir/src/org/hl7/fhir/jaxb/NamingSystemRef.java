package org.hl7.fhir.jaxb;

import javax.xml.bind.annotation.*;
import org.eclipse.emf.ecore.jaxb.*;

import org.hl7.fhir.FhirFactory;
import org.hl7.fhir.NamingSystem;

@XmlRootElement(name = "NamingSystemRefElement")
public class NamingSystemRef extends org.hl7.fhir.jaxb.DomainResourceRef  {

	

	
	@Override
	public NamingSystem createInstance() {
		return FhirFactory.eINSTANCE.createNamingSystem();
	}
	
	public static NamingSystemRef valueOf(String id) {
		NamingSystemRef result = new NamingSystemRef();
		result.setID(id);
		return result;
	}

	@Override
	public String toString() {
		return getID();
	}
	

}