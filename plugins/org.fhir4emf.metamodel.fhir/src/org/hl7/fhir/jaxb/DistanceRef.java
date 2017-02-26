package org.hl7.fhir.jaxb;

import javax.xml.bind.annotation.*;
import org.eclipse.emf.ecore.jaxb.*;

import org.hl7.fhir.Distance;
import org.hl7.fhir.FhirFactory;

@XmlRootElement(name = "DistanceRefElement")
public class DistanceRef extends org.hl7.fhir.jaxb.QuantityRef  {

	

	
	@Override
	public Distance createInstance() {
		return FhirFactory.eINSTANCE.createDistance();
	}
	
	public static DistanceRef valueOf(String id) {
		DistanceRef result = new DistanceRef();
		result.setID(id);
		return result;
	}

	@Override
	public String toString() {
		return getID();
	}
	

}