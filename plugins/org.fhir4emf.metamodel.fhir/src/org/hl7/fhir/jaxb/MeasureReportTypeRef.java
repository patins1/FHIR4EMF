package org.hl7.fhir.jaxb;

import javax.xml.bind.annotation.*;
import org.eclipse.emf.ecore.jaxb.*;

import org.hl7.fhir.FhirFactory;
import org.hl7.fhir.MeasureReportType;

@XmlRootElement(name = "MeasureReportTypeRefElement")
public class MeasureReportTypeRef extends org.hl7.fhir.jaxb.ElementRef  {

	

	
	@Override
	public MeasureReportType createInstance() {
		return FhirFactory.eINSTANCE.createMeasureReportType();
	}
	
	public static MeasureReportTypeRef valueOf(String id) {
		MeasureReportTypeRef result = new MeasureReportTypeRef();
		result.setID(id);
		return result;
	}

	@Override
	public String toString() {
		return getID();
	}
	

}