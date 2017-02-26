package org.hl7.fhir.jaxb;

import javax.xml.bind.annotation.*;
import org.eclipse.emf.ecore.jaxb.*;

import org.hl7.fhir.FhirFactory;
import org.hl7.fhir.Range;

@XmlRootElement(name = "RangeRefElement")
public class RangeRef extends org.hl7.fhir.jaxb.ElementRef  {

	

	
	@Override
	public Range createInstance() {
		return FhirFactory.eINSTANCE.createRange();
	}
	
	public static RangeRef valueOf(String id) {
		RangeRef result = new RangeRef();
		result.setID(id);
		return result;
	}

	@Override
	public String toString() {
		return getID();
	}
	

}