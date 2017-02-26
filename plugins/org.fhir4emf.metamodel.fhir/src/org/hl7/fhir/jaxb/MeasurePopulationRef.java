package org.hl7.fhir.jaxb;

import javax.xml.bind.annotation.*;
import org.eclipse.emf.ecore.jaxb.*;

import org.hl7.fhir.FhirFactory;
import org.hl7.fhir.MeasurePopulation;

@XmlRootElement(name = "MeasurePopulationRefElement")
public class MeasurePopulationRef extends org.hl7.fhir.jaxb.BackboneElementRef  {

	

	
	@Override
	public MeasurePopulation createInstance() {
		return FhirFactory.eINSTANCE.createMeasurePopulation();
	}
	
	public static MeasurePopulationRef valueOf(String id) {
		MeasurePopulationRef result = new MeasurePopulationRef();
		result.setID(id);
		return result;
	}

	@Override
	public String toString() {
		return getID();
	}
	

}