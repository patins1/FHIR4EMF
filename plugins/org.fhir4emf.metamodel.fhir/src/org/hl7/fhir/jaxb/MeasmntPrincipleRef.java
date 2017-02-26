package org.hl7.fhir.jaxb;

import javax.xml.bind.annotation.*;
import org.eclipse.emf.ecore.jaxb.*;

import org.hl7.fhir.FhirFactory;
import org.hl7.fhir.MeasmntPrinciple;

@XmlRootElement(name = "MeasmntPrincipleRefElement")
public class MeasmntPrincipleRef extends org.hl7.fhir.jaxb.ElementRef  {

	

	
	@Override
	public MeasmntPrinciple createInstance() {
		return FhirFactory.eINSTANCE.createMeasmntPrinciple();
	}
	
	public static MeasmntPrincipleRef valueOf(String id) {
		MeasmntPrincipleRef result = new MeasmntPrincipleRef();
		result.setID(id);
		return result;
	}

	@Override
	public String toString() {
		return getID();
	}
	

}