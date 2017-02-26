package org.hl7.fhir.jaxb;

import javax.xml.bind.annotation.*;
import org.eclipse.emf.ecore.jaxb.*;

import org.hl7.fhir.FhirFactory;
import org.hl7.fhir.MeasureReportGroup2;

@XmlRootElement(name = "MeasureReportGroup2RefElement")
public class MeasureReportGroup2Ref extends org.hl7.fhir.jaxb.BackboneElementRef  {

	

	
	@Override
	public MeasureReportGroup2 createInstance() {
		return FhirFactory.eINSTANCE.createMeasureReportGroup2();
	}
	
	public static MeasureReportGroup2Ref valueOf(String id) {
		MeasureReportGroup2Ref result = new MeasureReportGroup2Ref();
		result.setID(id);
		return result;
	}

	@Override
	public String toString() {
		return getID();
	}
	

}