package org.hl7.fhir.jaxb;

import javax.xml.bind.annotation.*;
import org.eclipse.emf.ecore.jaxb.*;

import org.hl7.fhir.FhirFactory;
import org.hl7.fhir.MeasureReport;

@XmlRootElement(name = "MeasureReportRefElement")
public class MeasureReportRef extends org.hl7.fhir.jaxb.DomainResourceRef  {

	

	
	@Override
	public MeasureReport createInstance() {
		return FhirFactory.eINSTANCE.createMeasureReport();
	}
	
	public static MeasureReportRef valueOf(String id) {
		MeasureReportRef result = new MeasureReportRef();
		result.setID(id);
		return result;
	}

	@Override
	public String toString() {
		return getID();
	}
	

}