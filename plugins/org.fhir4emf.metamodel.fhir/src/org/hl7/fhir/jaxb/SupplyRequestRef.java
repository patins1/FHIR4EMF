package org.hl7.fhir.jaxb;

import javax.xml.bind.annotation.*;
import org.eclipse.emf.ecore.jaxb.*;

import org.hl7.fhir.FhirFactory;
import org.hl7.fhir.SupplyRequest;

@XmlRootElement(name = "SupplyRequestRefElement")
public class SupplyRequestRef extends org.hl7.fhir.jaxb.DomainResourceRef  {

	

	
	@Override
	public SupplyRequest createInstance() {
		return FhirFactory.eINSTANCE.createSupplyRequest();
	}
	
	public static SupplyRequestRef valueOf(String id) {
		SupplyRequestRef result = new SupplyRequestRef();
		result.setID(id);
		return result;
	}

	@Override
	public String toString() {
		return getID();
	}
	

}