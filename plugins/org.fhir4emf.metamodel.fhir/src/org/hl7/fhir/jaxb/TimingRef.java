package org.hl7.fhir.jaxb;

import javax.xml.bind.annotation.*;
import org.eclipse.emf.ecore.jaxb.*;

import org.hl7.fhir.FhirFactory;
import org.hl7.fhir.Timing;

@XmlRootElement(name = "TimingRefElement")
public class TimingRef extends org.hl7.fhir.jaxb.ElementRef  {

	

	
	@Override
	public Timing createInstance() {
		return FhirFactory.eINSTANCE.createTiming();
	}
	
	public static TimingRef valueOf(String id) {
		TimingRef result = new TimingRef();
		result.setID(id);
		return result;
	}

	@Override
	public String toString() {
		return getID();
	}
	

}