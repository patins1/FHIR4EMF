package org.hl7.fhir.jaxb;

import javax.xml.bind.annotation.*;
import org.eclipse.emf.ecore.jaxb.*;

import org.hl7.fhir.FamilyMemberHistoryCondition;
import org.hl7.fhir.FhirFactory;

@XmlRootElement(name = "FamilyMemberHistoryConditionRefElement")
public class FamilyMemberHistoryConditionRef extends org.hl7.fhir.jaxb.BackboneElementRef  {

	

	
	@Override
	public FamilyMemberHistoryCondition createInstance() {
		return FhirFactory.eINSTANCE.createFamilyMemberHistoryCondition();
	}
	
	public static FamilyMemberHistoryConditionRef valueOf(String id) {
		FamilyMemberHistoryConditionRef result = new FamilyMemberHistoryConditionRef();
		result.setID(id);
		return result;
	}

	@Override
	public String toString() {
		return getID();
	}
	

}