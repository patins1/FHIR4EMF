package org.hl7.fhir.jaxb;

import javax.xml.bind.annotation.*;
import org.eclipse.emf.ecore.jaxb.*;

import org.hl7.fhir.ConditionEvidence;
import org.hl7.fhir.FhirFactory;

@XmlRootElement(name = "ConditionEvidenceRefElement")
public class ConditionEvidenceRef extends org.hl7.fhir.jaxb.BackboneElementRef  {

	

	
	@Override
	public ConditionEvidence createInstance() {
		return FhirFactory.eINSTANCE.createConditionEvidence();
	}
	
	public static ConditionEvidenceRef valueOf(String id) {
		ConditionEvidenceRef result = new ConditionEvidenceRef();
		result.setID(id);
		return result;
	}

	@Override
	public String toString() {
		return getID();
	}
	

}