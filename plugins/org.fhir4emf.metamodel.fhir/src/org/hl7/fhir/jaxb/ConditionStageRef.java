package org.hl7.fhir.jaxb;

import javax.xml.bind.annotation.*;
import org.eclipse.emf.ecore.jaxb.*;

import org.hl7.fhir.ConditionStage;
import org.hl7.fhir.FhirFactory;

@XmlRootElement(name = "ConditionStageRefElement")
public class ConditionStageRef extends org.hl7.fhir.jaxb.BackboneElementRef  {

	

	
	@Override
	public ConditionStage createInstance() {
		return FhirFactory.eINSTANCE.createConditionStage();
	}
	
	public static ConditionStageRef valueOf(String id) {
		ConditionStageRef result = new ConditionStageRef();
		result.setID(id);
		return result;
	}

	@Override
	public String toString() {
		return getID();
	}
	

}