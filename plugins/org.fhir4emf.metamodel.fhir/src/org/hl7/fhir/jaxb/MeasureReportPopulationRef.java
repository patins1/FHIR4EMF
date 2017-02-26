package org.hl7.fhir.jaxb;

import javax.xml.bind.annotation.*;
import org.eclipse.emf.ecore.jaxb.*;

import org.hl7.fhir.FhirFactory;
import org.hl7.fhir.MeasureReportPopulation;

@XmlRootElement(name = "MeasureReportPopulationRefElement")
public class MeasureReportPopulationRef extends org.hl7.fhir.jaxb.BackboneElementRef  {

	

	
	@Override
	public MeasureReportPopulation createInstance() {
		return FhirFactory.eINSTANCE.createMeasureReportPopulation();
	}
	
	public static MeasureReportPopulationRef valueOf(String id) {
		MeasureReportPopulationRef result = new MeasureReportPopulationRef();
		result.setID(id);
		return result;
	}

	@Override
	public String toString() {
		return getID();
	}
	

}