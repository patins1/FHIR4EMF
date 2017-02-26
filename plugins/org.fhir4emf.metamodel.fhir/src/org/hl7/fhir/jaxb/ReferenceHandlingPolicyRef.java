package org.hl7.fhir.jaxb;

import javax.xml.bind.annotation.*;
import org.eclipse.emf.ecore.jaxb.*;

import org.hl7.fhir.FhirFactory;
import org.hl7.fhir.ReferenceHandlingPolicy;

@XmlRootElement(name = "ReferenceHandlingPolicyRefElement")
public class ReferenceHandlingPolicyRef extends org.hl7.fhir.jaxb.ElementRef  {

	

	
	@Override
	public ReferenceHandlingPolicy createInstance() {
		return FhirFactory.eINSTANCE.createReferenceHandlingPolicy();
	}
	
	public static ReferenceHandlingPolicyRef valueOf(String id) {
		ReferenceHandlingPolicyRef result = new ReferenceHandlingPolicyRef();
		result.setID(id);
		return result;
	}

	@Override
	public String toString() {
		return getID();
	}
	

}