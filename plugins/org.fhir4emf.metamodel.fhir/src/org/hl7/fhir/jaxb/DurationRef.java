package org.hl7.fhir.jaxb;

import javax.xml.bind.annotation.*;
import org.eclipse.emf.ecore.jaxb.*;

import org.hl7.fhir.Duration;
import org.hl7.fhir.FhirFactory;

@XmlRootElement(name = "DurationRefElement")
public class DurationRef extends org.hl7.fhir.jaxb.QuantityRef  {

	

	
	@Override
	public Duration createInstance() {
		return FhirFactory.eINSTANCE.createDuration();
	}
	
	public static DurationRef valueOf(String id) {
		DurationRef result = new DurationRef();
		result.setID(id);
		return result;
	}

	@Override
	public String toString() {
		return getID();
	}
	

}