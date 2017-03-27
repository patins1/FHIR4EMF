package org.hl7.fhir.jaxb;

import javax.xml.bind.annotation.*;
import org.eclipse.emf.ecore.jaxb.*;

import org.hl7.fhir.FhirFactory;
import org.hl7.fhir.SupplyRequestRequester;

@XmlRootElement(name = "SupplyRequestRequesterRefElement")
public class SupplyRequestRequesterRef extends org.hl7.fhir.jaxb.BackboneElementRef  {

	

	
	@Override
	public SupplyRequestRequester createInstance() {
		return FhirFactory.eINSTANCE.createSupplyRequestRequester();
	}
	
	public static SupplyRequestRequesterRef valueOf(String id) {
		SupplyRequestRequesterRef result = new SupplyRequestRequesterRef();
		result.setID(id);
		return result;
	}

	@Override
	public String toString() {
		return getID();
	}
	

}