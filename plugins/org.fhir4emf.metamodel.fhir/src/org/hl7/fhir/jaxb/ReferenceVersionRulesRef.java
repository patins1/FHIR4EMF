package org.hl7.fhir.jaxb;

import javax.xml.bind.annotation.*;
import org.eclipse.emf.ecore.jaxb.*;

import org.hl7.fhir.FhirFactory;
import org.hl7.fhir.ReferenceVersionRules;

@XmlRootElement(name = "ReferenceVersionRulesRefElement")
public class ReferenceVersionRulesRef extends org.hl7.fhir.jaxb.ElementRef  {

	

	
	@Override
	public ReferenceVersionRules createInstance() {
		return FhirFactory.eINSTANCE.createReferenceVersionRules();
	}
	
	public static ReferenceVersionRulesRef valueOf(String id) {
		ReferenceVersionRulesRef result = new ReferenceVersionRulesRef();
		result.setID(id);
		return result;
	}

	@Override
	public String toString() {
		return getID();
	}
	

}