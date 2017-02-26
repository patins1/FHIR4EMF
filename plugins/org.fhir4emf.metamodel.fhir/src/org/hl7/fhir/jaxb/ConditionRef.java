package org.hl7.fhir.jaxb;

import javax.xml.bind.annotation.*;
import org.eclipse.emf.ecore.jaxb.*;

import org.hl7.fhir.Condition;
import org.hl7.fhir.FhirFactory;

@XmlRootElement(name = "ConditionRefElement")
public class ConditionRef extends org.hl7.fhir.jaxb.DomainResourceRef  {

	

	
	@Override
	public Condition createInstance() {
		return FhirFactory.eINSTANCE.createCondition();
	}
	
	public static ConditionRef valueOf(String id) {
		ConditionRef result = new ConditionRef();
		result.setID(id);
		return result;
	}

	@Override
	public String toString() {
		return getID();
	}
	

}