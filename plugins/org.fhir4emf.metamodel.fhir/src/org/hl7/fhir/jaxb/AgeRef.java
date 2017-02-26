package org.hl7.fhir.jaxb;

import javax.xml.bind.annotation.*;
import org.eclipse.emf.ecore.jaxb.*;

import org.hl7.fhir.Age;
import org.hl7.fhir.FhirFactory;

@XmlRootElement(name = "AgeRefElement")
public class AgeRef extends org.hl7.fhir.jaxb.QuantityRef  {

	

	
	@Override
	public Age createInstance() {
		return FhirFactory.eINSTANCE.createAge();
	}
	
	public static AgeRef valueOf(String id) {
		AgeRef result = new AgeRef();
		result.setID(id);
		return result;
	}

	@Override
	public String toString() {
		return getID();
	}
	

}