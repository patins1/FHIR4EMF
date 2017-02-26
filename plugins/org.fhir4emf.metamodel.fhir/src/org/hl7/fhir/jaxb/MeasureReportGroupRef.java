package org.hl7.fhir.jaxb;

import javax.xml.bind.annotation.*;
import org.eclipse.emf.ecore.jaxb.*;

import org.hl7.fhir.FhirFactory;
import org.hl7.fhir.MeasureReportGroup;

@XmlRootElement(name = "MeasureReportGroupRefElement")
public class MeasureReportGroupRef extends org.hl7.fhir.jaxb.BackboneElementRef  {

	

	
	@Override
	public MeasureReportGroup createInstance() {
		return FhirFactory.eINSTANCE.createMeasureReportGroup();
	}
	
	public static MeasureReportGroupRef valueOf(String id) {
		MeasureReportGroupRef result = new MeasureReportGroupRef();
		result.setID(id);
		return result;
	}

	@Override
	public String toString() {
		return getID();
	}
	

}