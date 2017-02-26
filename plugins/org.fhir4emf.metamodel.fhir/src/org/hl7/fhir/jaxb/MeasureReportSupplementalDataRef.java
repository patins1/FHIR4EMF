package org.hl7.fhir.jaxb;

import javax.xml.bind.annotation.*;
import org.eclipse.emf.ecore.jaxb.*;

import org.hl7.fhir.FhirFactory;
import org.hl7.fhir.MeasureReportSupplementalData;

@XmlRootElement(name = "MeasureReportSupplementalDataRefElement")
public class MeasureReportSupplementalDataRef extends org.hl7.fhir.jaxb.BackboneElementRef  {

	

	
	@Override
	public MeasureReportSupplementalData createInstance() {
		return FhirFactory.eINSTANCE.createMeasureReportSupplementalData();
	}
	
	public static MeasureReportSupplementalDataRef valueOf(String id) {
		MeasureReportSupplementalDataRef result = new MeasureReportSupplementalDataRef();
		result.setID(id);
		return result;
	}

	@Override
	public String toString() {
		return getID();
	}
	

}