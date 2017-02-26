package org.hl7.fhir.jaxb;

import javax.xml.bind.annotation.*;
import org.eclipse.emf.ecore.jaxb.*;

import org.hl7.fhir.FhirFactory;
import org.hl7.fhir.Ratio;

@XmlRootElement(name = "RatioRefElement")
public class RatioRef extends org.hl7.fhir.jaxb.ElementRef  {

	

	
	@Override
	public Ratio createInstance() {
		return FhirFactory.eINSTANCE.createRatio();
	}
	
	public static RatioRef valueOf(String id) {
		RatioRef result = new RatioRef();
		result.setID(id);
		return result;
	}

	@Override
	public String toString() {
		return getID();
	}
	

}