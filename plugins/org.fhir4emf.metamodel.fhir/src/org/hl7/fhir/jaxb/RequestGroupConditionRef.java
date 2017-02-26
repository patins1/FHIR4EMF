package org.hl7.fhir.jaxb;

import javax.xml.bind.annotation.*;
import org.eclipse.emf.ecore.jaxb.*;

import org.hl7.fhir.FhirFactory;
import org.hl7.fhir.RequestGroupCondition;

@XmlRootElement(name = "RequestGroupConditionRefElement")
public class RequestGroupConditionRef extends org.hl7.fhir.jaxb.BackboneElementRef  {

	

	
	@Override
	public RequestGroupCondition createInstance() {
		return FhirFactory.eINSTANCE.createRequestGroupCondition();
	}
	
	public static RequestGroupConditionRef valueOf(String id) {
		RequestGroupConditionRef result = new RequestGroupConditionRef();
		result.setID(id);
		return result;
	}

	@Override
	public String toString() {
		return getID();
	}
	

}