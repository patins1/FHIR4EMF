package org.hl7.fhir.jaxb;

import javax.xml.bind.annotation.*;
import org.eclipse.emf.ecore.jaxb.*;

import org.hl7.fhir.FhirFactory;
import org.hl7.fhir.LocationMode;

@XmlRootElement(name = "LocationModeRefElement")
public class LocationModeRef extends org.hl7.fhir.jaxb.ElementRef  {

	

	
	@Override
	public LocationMode createInstance() {
		return FhirFactory.eINSTANCE.createLocationMode();
	}
	
	public static LocationModeRef valueOf(String id) {
		LocationModeRef result = new LocationModeRef();
		result.setID(id);
		return result;
	}

	@Override
	public String toString() {
		return getID();
	}
	

}