package org.hl7.fhir.jaxb;

import javax.xml.bind.annotation.*;
import org.eclipse.emf.ecore.jaxb.*;

import org.hl7.fhir.ActionConditionKind;
import org.hl7.fhir.FhirFactory;

@XmlRootElement(name = "ActionConditionKindRefElement")
public class ActionConditionKindRef extends org.hl7.fhir.jaxb.ElementRef  {

	

	
	@Override
	public ActionConditionKind createInstance() {
		return FhirFactory.eINSTANCE.createActionConditionKind();
	}
	
	public static ActionConditionKindRef valueOf(String id) {
		ActionConditionKindRef result = new ActionConditionKindRef();
		result.setID(id);
		return result;
	}

	@Override
	public String toString() {
		return getID();
	}
	

}