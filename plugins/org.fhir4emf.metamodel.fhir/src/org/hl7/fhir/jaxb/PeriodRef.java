package org.hl7.fhir.jaxb;

import javax.xml.bind.annotation.*;
import org.eclipse.emf.ecore.jaxb.*;

import org.hl7.fhir.FhirFactory;
import org.hl7.fhir.Period;

@XmlRootElement(name = "PeriodRefElement")
public class PeriodRef extends org.hl7.fhir.jaxb.ElementRef  {

	

	
	@Override
	public Period createInstance() {
		return FhirFactory.eINSTANCE.createPeriod();
	}
	
	public static PeriodRef valueOf(String id) {
		PeriodRef result = new PeriodRef();
		result.setID(id);
		return result;
	}

	@Override
	public String toString() {
		return getID();
	}
	

}