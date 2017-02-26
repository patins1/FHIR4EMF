package org.hl7.fhir.jaxb;

import javax.xml.bind.annotation.*;
import org.eclipse.emf.ecore.jaxb.*;

import org.hl7.fhir.FhirFactory;
import org.hl7.fhir.LocationPosition;

@XmlRootElement(name = "LocationPositionRefElement")
public class LocationPositionRef extends org.hl7.fhir.jaxb.BackboneElementRef  {

	

	
	@Override
	public LocationPosition createInstance() {
		return FhirFactory.eINSTANCE.createLocationPosition();
	}
	
	public static LocationPositionRef valueOf(String id) {
		LocationPositionRef result = new LocationPositionRef();
		result.setID(id);
		return result;
	}

	@Override
	public String toString() {
		return getID();
	}
	

}