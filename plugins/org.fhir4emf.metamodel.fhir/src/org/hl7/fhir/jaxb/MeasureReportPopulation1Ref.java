package org.hl7.fhir.jaxb;

import javax.xml.bind.annotation.*;
import org.eclipse.emf.ecore.jaxb.*;

import org.hl7.fhir.FhirFactory;
import org.hl7.fhir.MeasureReportPopulation1;

@XmlRootElement(name = "MeasureReportPopulation1RefElement")
public class MeasureReportPopulation1Ref extends org.hl7.fhir.jaxb.BackboneElementRef  {

	

	
	@Override
	public MeasureReportPopulation1 createInstance() {
		return FhirFactory.eINSTANCE.createMeasureReportPopulation1();
	}
	
	public static MeasureReportPopulation1Ref valueOf(String id) {
		MeasureReportPopulation1Ref result = new MeasureReportPopulation1Ref();
		result.setID(id);
		return result;
	}

	@Override
	public String toString() {
		return getID();
	}
	

}