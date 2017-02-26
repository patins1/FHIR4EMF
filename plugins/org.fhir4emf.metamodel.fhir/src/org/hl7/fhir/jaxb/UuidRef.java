package org.hl7.fhir.jaxb;

import javax.xml.bind.annotation.*;
import org.eclipse.emf.ecore.jaxb.*;

import org.hl7.fhir.FhirFactory;
import org.hl7.fhir.Uuid;

@XmlRootElement(name = "UuidRefElement")
public class UuidRef extends org.hl7.fhir.jaxb.ElementRef  {

	

	
	@Override
	public Uuid createInstance() {
		return FhirFactory.eINSTANCE.createUuid();
	}
	
	public static UuidRef valueOf(String id) {
		UuidRef result = new UuidRef();
		result.setID(id);
		return result;
	}

	@Override
	public String toString() {
		return getID();
	}
	

}