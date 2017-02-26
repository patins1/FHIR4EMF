package org.hl7.fhir.jaxb;

import javax.xml.bind.annotation.*;
import org.eclipse.emf.ecore.jaxb.*;

import org.hl7.fhir.FhirFactory;
import org.hl7.fhir.TriggerDefinition;

@XmlRootElement(name = "TriggerDefinitionRefElement")
public class TriggerDefinitionRef extends org.hl7.fhir.jaxb.ElementRef  {

	

	
	@Override
	public TriggerDefinition createInstance() {
		return FhirFactory.eINSTANCE.createTriggerDefinition();
	}
	
	public static TriggerDefinitionRef valueOf(String id) {
		TriggerDefinitionRef result = new TriggerDefinitionRef();
		result.setID(id);
		return result;
	}

	@Override
	public String toString() {
		return getID();
	}
	

}