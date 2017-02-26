package org.hl7.fhir.jaxb;

import javax.xml.bind.annotation.*;
import org.eclipse.emf.ecore.jaxb.*;

import org.hl7.fhir.AdverseEvent;
import org.hl7.fhir.FhirFactory;

@XmlRootElement(name = "AdverseEventRefElement")
public class AdverseEventRef extends org.hl7.fhir.jaxb.DomainResourceRef  {

	

	
	@Override
	public AdverseEvent createInstance() {
		return FhirFactory.eINSTANCE.createAdverseEvent();
	}
	
	public static AdverseEventRef valueOf(String id) {
		AdverseEventRef result = new AdverseEventRef();
		result.setID(id);
		return result;
	}

	@Override
	public String toString() {
		return getID();
	}
	

}