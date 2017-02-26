package org.hl7.fhir.jaxb;

import javax.xml.bind.annotation.*;
import org.eclipse.emf.ecore.jaxb.*;

import org.hl7.fhir.EligibilityRequest;
import org.hl7.fhir.FhirFactory;

@XmlRootElement(name = "EligibilityRequestRefElement")
public class EligibilityRequestRef extends org.hl7.fhir.jaxb.DomainResourceRef  {

	

	
	@Override
	public EligibilityRequest createInstance() {
		return FhirFactory.eINSTANCE.createEligibilityRequest();
	}
	
	public static EligibilityRequestRef valueOf(String id) {
		EligibilityRequestRef result = new EligibilityRequestRef();
		result.setID(id);
		return result;
	}

	@Override
	public String toString() {
		return getID();
	}
	

}