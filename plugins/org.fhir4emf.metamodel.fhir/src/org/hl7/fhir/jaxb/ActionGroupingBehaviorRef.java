package org.hl7.fhir.jaxb;

import javax.xml.bind.annotation.*;
import org.eclipse.emf.ecore.jaxb.*;

import org.hl7.fhir.ActionGroupingBehavior;
import org.hl7.fhir.FhirFactory;

@XmlRootElement(name = "ActionGroupingBehaviorRefElement")
public class ActionGroupingBehaviorRef extends org.hl7.fhir.jaxb.ElementRef  {

	

	
	@Override
	public ActionGroupingBehavior createInstance() {
		return FhirFactory.eINSTANCE.createActionGroupingBehavior();
	}
	
	public static ActionGroupingBehaviorRef valueOf(String id) {
		ActionGroupingBehaviorRef result = new ActionGroupingBehaviorRef();
		result.setID(id);
		return result;
	}

	@Override
	public String toString() {
		return getID();
	}
	

}