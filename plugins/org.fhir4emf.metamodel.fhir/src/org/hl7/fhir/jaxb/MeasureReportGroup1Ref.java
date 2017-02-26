package org.hl7.fhir.jaxb;

import javax.xml.bind.annotation.*;
import org.eclipse.emf.ecore.jaxb.*;

import org.hl7.fhir.FhirFactory;
import org.hl7.fhir.MeasureReportGroup1;

@XmlRootElement(name = "MeasureReportGroup1RefElement")
public class MeasureReportGroup1Ref extends org.hl7.fhir.jaxb.BackboneElementRef  {

	

	
	@Override
	public MeasureReportGroup1 createInstance() {
		return FhirFactory.eINSTANCE.createMeasureReportGroup1();
	}
	
	public static MeasureReportGroup1Ref valueOf(String id) {
		MeasureReportGroup1Ref result = new MeasureReportGroup1Ref();
		result.setID(id);
		return result;
	}

	@Override
	public String toString() {
		return getID();
	}
	

}