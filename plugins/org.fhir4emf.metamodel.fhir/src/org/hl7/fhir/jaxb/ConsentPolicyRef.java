package org.hl7.fhir.jaxb;

import javax.xml.bind.annotation.*;
import org.eclipse.emf.ecore.jaxb.*;

import org.hl7.fhir.ConsentPolicy;
import org.hl7.fhir.FhirFactory;

@XmlRootElement(name = "ConsentPolicyRefElement")
public class ConsentPolicyRef extends org.hl7.fhir.jaxb.BackboneElementRef  {

	

	
	@Override
	public ConsentPolicy createInstance() {
		return FhirFactory.eINSTANCE.createConsentPolicy();
	}
	
	public static ConsentPolicyRef valueOf(String id) {
		ConsentPolicyRef result = new ConsentPolicyRef();
		result.setID(id);
		return result;
	}

	@Override
	public String toString() {
		return getID();
	}
	

}