package org.hl7.fhir.jaxb;

import javax.xml.bind.annotation.*;
import org.eclipse.emf.ecore.jaxb.*;

import org.hl7.fhir.FhirFactory;
import org.hl7.fhir.NamingSystemUniqueId;

@XmlRootElement(name = "NamingSystemUniqueIdRefElement")
public class NamingSystemUniqueIdRef extends org.hl7.fhir.jaxb.BackboneElementRef  {

	

	
	@Override
	public NamingSystemUniqueId createInstance() {
		return FhirFactory.eINSTANCE.createNamingSystemUniqueId();
	}
	
	public static NamingSystemUniqueIdRef valueOf(String id) {
		NamingSystemUniqueIdRef result = new NamingSystemUniqueIdRef();
		result.setID(id);
		return result;
	}

	@Override
	public String toString() {
		return getID();
	}
	

}