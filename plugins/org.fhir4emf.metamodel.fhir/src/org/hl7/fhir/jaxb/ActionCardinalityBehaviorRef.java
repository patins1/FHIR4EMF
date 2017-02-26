package org.hl7.fhir.jaxb;

import javax.xml.bind.annotation.*;
import org.eclipse.emf.ecore.jaxb.*;

import org.hl7.fhir.ActionCardinalityBehavior;
import org.hl7.fhir.FhirFactory;

@XmlRootElement(name = "ActionCardinalityBehaviorRefElement")
public class ActionCardinalityBehaviorRef extends org.hl7.fhir.jaxb.ElementRef  {

	

	
	@Override
	public ActionCardinalityBehavior createInstance() {
		return FhirFactory.eINSTANCE.createActionCardinalityBehavior();
	}
	
	public static ActionCardinalityBehaviorRef valueOf(String id) {
		ActionCardinalityBehaviorRef result = new ActionCardinalityBehaviorRef();
		result.setID(id);
		return result;
	}

	@Override
	public String toString() {
		return getID();
	}
	

}