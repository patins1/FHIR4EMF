package org.hl7.fhir.jaxb;

import javax.xml.bind.annotation.*;
import org.eclipse.emf.ecore.jaxb.*;

import org.hl7.fhir.FhirFactory;
import org.hl7.fhir.SupplyRequestStatus;

@XmlRootElement(name = "SupplyRequestStatusRefElement")
public class SupplyRequestStatusRef extends org.hl7.fhir.jaxb.ElementRef  {

	

	
	@Override
	public SupplyRequestStatus createInstance() {
		return FhirFactory.eINSTANCE.createSupplyRequestStatus();
	}
	
	public static SupplyRequestStatusRef valueOf(String id) {
		SupplyRequestStatusRef result = new SupplyRequestStatusRef();
		result.setID(id);
		return result;
	}

	@Override
	public String toString() {
		return getID();
	}
	

}