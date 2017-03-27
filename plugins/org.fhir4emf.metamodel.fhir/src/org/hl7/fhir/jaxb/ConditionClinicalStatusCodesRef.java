package org.hl7.fhir.jaxb;

import javax.xml.bind.annotation.*;
import org.eclipse.emf.ecore.jaxb.*;

import org.hl7.fhir.ConditionClinicalStatusCodes;
import org.hl7.fhir.FhirFactory;

@XmlRootElement(name = "ConditionClinicalStatusCodesRefElement")
public class ConditionClinicalStatusCodesRef extends org.hl7.fhir.jaxb.ElementRef  {

	

	
	@Override
	public ConditionClinicalStatusCodes createInstance() {
		return FhirFactory.eINSTANCE.createConditionClinicalStatusCodes();
	}
	
	public static ConditionClinicalStatusCodesRef valueOf(String id) {
		ConditionClinicalStatusCodesRef result = new ConditionClinicalStatusCodesRef();
		result.setID(id);
		return result;
	}

	@Override
	public String toString() {
		return getID();
	}
	

}