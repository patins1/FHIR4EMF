package org.hl7.fhir.jaxb;

import javax.xml.bind.annotation.*;
import org.eclipse.emf.ecore.jaxb.*;

import org.hl7.fhir.ConditionalDeleteStatus;
import org.hl7.fhir.FhirFactory;

@XmlRootElement(name = "ConditionalDeleteStatusRefElement")
public class ConditionalDeleteStatusRef extends org.hl7.fhir.jaxb.ElementRef  {

	

	
	@Override
	public ConditionalDeleteStatus createInstance() {
		return FhirFactory.eINSTANCE.createConditionalDeleteStatus();
	}
	
	public static ConditionalDeleteStatusRef valueOf(String id) {
		ConditionalDeleteStatusRef result = new ConditionalDeleteStatusRef();
		result.setID(id);
		return result;
	}

	@Override
	public String toString() {
		return getID();
	}
	

}