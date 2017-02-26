package org.hl7.fhir.jaxb;

import javax.xml.bind.annotation.*;
import org.eclipse.emf.ecore.jaxb.*;

import org.hl7.fhir.FhirFactory;
import org.hl7.fhir.SupplyRequestWhen;

@XmlRootElement(name = "SupplyRequestWhenRefElement")
public class SupplyRequestWhenRef extends org.hl7.fhir.jaxb.BackboneElementRef  {

	

	
	@Override
	public SupplyRequestWhen createInstance() {
		return FhirFactory.eINSTANCE.createSupplyRequestWhen();
	}
	
	public static SupplyRequestWhenRef valueOf(String id) {
		SupplyRequestWhenRef result = new SupplyRequestWhenRef();
		result.setID(id);
		return result;
	}

	@Override
	public String toString() {
		return getID();
	}
	

}