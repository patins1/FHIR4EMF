package org.hl7.fhir.jaxb;

import javax.xml.bind.annotation.*;
import org.eclipse.emf.ecore.jaxb.*;

import org.hl7.fhir.AdverseEventCausality;
import org.hl7.fhir.FhirFactory;

@XmlRootElement(name = "AdverseEventCausalityRefElement")
public class AdverseEventCausalityRef extends org.hl7.fhir.jaxb.ElementRef  {

	

	
	@Override
	public AdverseEventCausality createInstance() {
		return FhirFactory.eINSTANCE.createAdverseEventCausality();
	}
	
	public static AdverseEventCausalityRef valueOf(String id) {
		AdverseEventCausalityRef result = new AdverseEventCausalityRef();
		result.setID(id);
		return result;
	}

	@Override
	public String toString() {
		return getID();
	}
	

}