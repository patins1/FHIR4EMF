package org.hl7.fhir.jaxb;

import javax.xml.bind.annotation.*;
import org.eclipse.emf.ecore.jaxb.*;

import org.hl7.fhir.FhirFactory;
import org.hl7.fhir.Oid;

@XmlRootElement(name = "OidRefElement")
public class OidRef extends org.hl7.fhir.jaxb.ElementRef  {

	

	
	@Override
	public Oid createInstance() {
		return FhirFactory.eINSTANCE.createOid();
	}
	
	public static OidRef valueOf(String id) {
		OidRef result = new OidRef();
		result.setID(id);
		return result;
	}

	@Override
	public String toString() {
		return getID();
	}
	

}