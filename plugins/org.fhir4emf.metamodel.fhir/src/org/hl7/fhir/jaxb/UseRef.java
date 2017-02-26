package org.hl7.fhir.jaxb;

import javax.xml.bind.annotation.*;
import org.eclipse.emf.ecore.jaxb.*;

import org.hl7.fhir.FhirFactory;
import org.hl7.fhir.Use;

@XmlRootElement(name = "UseRefElement")
public class UseRef extends org.hl7.fhir.jaxb.ElementRef  {

	

	
	@Override
	public Use createInstance() {
		return FhirFactory.eINSTANCE.createUse();
	}
	
	public static UseRef valueOf(String id) {
		UseRef result = new UseRef();
		result.setID(id);
		return result;
	}

	@Override
	public String toString() {
		return getID();
	}
	

}