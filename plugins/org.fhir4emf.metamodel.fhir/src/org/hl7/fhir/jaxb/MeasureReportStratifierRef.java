package org.hl7.fhir.jaxb;

import javax.xml.bind.annotation.*;
import org.eclipse.emf.ecore.jaxb.*;

import org.hl7.fhir.FhirFactory;
import org.hl7.fhir.MeasureReportStratifier;

@XmlRootElement(name = "MeasureReportStratifierRefElement")
public class MeasureReportStratifierRef extends org.hl7.fhir.jaxb.BackboneElementRef  {

	

	
	@Override
	public MeasureReportStratifier createInstance() {
		return FhirFactory.eINSTANCE.createMeasureReportStratifier();
	}
	
	public static MeasureReportStratifierRef valueOf(String id) {
		MeasureReportStratifierRef result = new MeasureReportStratifierRef();
		result.setID(id);
		return result;
	}

	@Override
	public String toString() {
		return getID();
	}
	

}