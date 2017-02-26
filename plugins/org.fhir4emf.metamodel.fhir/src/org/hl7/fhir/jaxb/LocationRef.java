package org.hl7.fhir.jaxb;

import javax.xml.bind.annotation.*;
import org.eclipse.emf.ecore.jaxb.*;

import org.hl7.fhir.FhirFactory;
import org.hl7.fhir.Location;

@XmlRootElement(name = "LocationRefElement")
public class LocationRef extends org.hl7.fhir.jaxb.DomainResourceRef  {

	

	
	@Override
	public Location createInstance() {
		return FhirFactory.eINSTANCE.createLocation();
	}
	
	public static LocationRef valueOf(String id) {
		LocationRef result = new LocationRef();
		result.setID(id);
		return result;
	}

	@Override
	public String toString() {
		return getID();
	}
	

}