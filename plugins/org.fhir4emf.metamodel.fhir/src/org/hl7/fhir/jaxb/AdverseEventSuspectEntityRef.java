package org.hl7.fhir.jaxb;

import javax.xml.bind.annotation.*;
import org.eclipse.emf.ecore.jaxb.*;

import org.hl7.fhir.AdverseEventSuspectEntity;
import org.hl7.fhir.FhirFactory;

@XmlRootElement(name = "AdverseEventSuspectEntityRefElement")
public class AdverseEventSuspectEntityRef extends org.hl7.fhir.jaxb.BackboneElementRef  {

	

	
	@Override
	public AdverseEventSuspectEntity createInstance() {
		return FhirFactory.eINSTANCE.createAdverseEventSuspectEntity();
	}
	
	public static AdverseEventSuspectEntityRef valueOf(String id) {
		AdverseEventSuspectEntityRef result = new AdverseEventSuspectEntityRef();
		result.setID(id);
		return result;
	}

	@Override
	public String toString() {
		return getID();
	}
	

}