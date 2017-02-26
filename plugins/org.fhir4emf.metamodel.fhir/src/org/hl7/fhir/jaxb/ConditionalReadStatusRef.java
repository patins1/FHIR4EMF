package org.hl7.fhir.jaxb;

import javax.xml.bind.annotation.*;
import org.eclipse.emf.ecore.jaxb.*;

import org.hl7.fhir.ConditionalReadStatus;
import org.hl7.fhir.FhirFactory;

@XmlRootElement(name = "ConditionalReadStatusRefElement")
public class ConditionalReadStatusRef extends org.hl7.fhir.jaxb.ElementRef  {

	

	
	@Override
	public ConditionalReadStatus createInstance() {
		return FhirFactory.eINSTANCE.createConditionalReadStatus();
	}
	
	public static ConditionalReadStatusRef valueOf(String id) {
		ConditionalReadStatusRef result = new ConditionalReadStatusRef();
		result.setID(id);
		return result;
	}

	@Override
	public String toString() {
		return getID();
	}
	

}