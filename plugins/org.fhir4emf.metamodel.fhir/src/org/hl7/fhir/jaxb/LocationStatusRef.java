package org.hl7.fhir.jaxb;

import javax.xml.bind.annotation.*;
import org.eclipse.emf.ecore.jaxb.*;

import org.hl7.fhir.FhirFactory;
import org.hl7.fhir.LocationStatus;

@XmlRootElement(name = "LocationStatusRefElement")
public class LocationStatusRef extends org.hl7.fhir.jaxb.ElementRef  {

	

	
	@Override
	public LocationStatus createInstance() {
		return FhirFactory.eINSTANCE.createLocationStatus();
	}
	
	public static LocationStatusRef valueOf(String id) {
		LocationStatusRef result = new LocationStatusRef();
		result.setID(id);
		return result;
	}

	@Override
	public String toString() {
		return getID();
	}
	

}