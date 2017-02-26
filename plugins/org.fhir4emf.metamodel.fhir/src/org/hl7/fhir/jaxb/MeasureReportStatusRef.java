package org.hl7.fhir.jaxb;

import javax.xml.bind.annotation.*;
import org.eclipse.emf.ecore.jaxb.*;

import org.hl7.fhir.FhirFactory;
import org.hl7.fhir.MeasureReportStatus;

@XmlRootElement(name = "MeasureReportStatusRefElement")
public class MeasureReportStatusRef extends org.hl7.fhir.jaxb.ElementRef  {

	

	
	@Override
	public MeasureReportStatus createInstance() {
		return FhirFactory.eINSTANCE.createMeasureReportStatus();
	}
	
	public static MeasureReportStatusRef valueOf(String id) {
		MeasureReportStatusRef result = new MeasureReportStatusRef();
		result.setID(id);
		return result;
	}

	@Override
	public String toString() {
		return getID();
	}
	

}