package org.hl7.fhir.jaxb;

import javax.xml.bind.annotation.*;
import org.eclipse.emf.ecore.jaxb.*;

import org.hl7.fhir.FhirFactory;
import org.hl7.fhir.UnitsOfTime;

@XmlRootElement(name = "UnitsOfTimeRefElement")
public class UnitsOfTimeRef extends org.hl7.fhir.jaxb.ElementRef  {

	

	
	@Override
	public UnitsOfTime createInstance() {
		return FhirFactory.eINSTANCE.createUnitsOfTime();
	}
	
	public static UnitsOfTimeRef valueOf(String id) {
		UnitsOfTimeRef result = new UnitsOfTimeRef();
		result.setID(id);
		return result;
	}

	@Override
	public String toString() {
		return getID();
	}
	

}