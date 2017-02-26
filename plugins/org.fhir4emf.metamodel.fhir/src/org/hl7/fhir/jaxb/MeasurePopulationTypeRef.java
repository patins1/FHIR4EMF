package org.hl7.fhir.jaxb;

import javax.xml.bind.annotation.*;
import org.eclipse.emf.ecore.jaxb.*;

import org.hl7.fhir.FhirFactory;
import org.hl7.fhir.MeasurePopulationType;

@XmlRootElement(name = "MeasurePopulationTypeRefElement")
public class MeasurePopulationTypeRef extends org.hl7.fhir.jaxb.ElementRef  {

	

	
	@Override
	public MeasurePopulationType createInstance() {
		return FhirFactory.eINSTANCE.createMeasurePopulationType();
	}
	
	public static MeasurePopulationTypeRef valueOf(String id) {
		MeasurePopulationTypeRef result = new MeasurePopulationTypeRef();
		result.setID(id);
		return result;
	}

	@Override
	public String toString() {
		return getID();
	}
	

}