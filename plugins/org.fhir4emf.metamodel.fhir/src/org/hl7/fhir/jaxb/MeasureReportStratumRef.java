package org.hl7.fhir.jaxb;

import javax.xml.bind.annotation.*;
import org.eclipse.emf.ecore.jaxb.*;

import org.hl7.fhir.FhirFactory;
import org.hl7.fhir.MeasureReportStratum;

@XmlRootElement(name = "MeasureReportStratumRefElement")
public class MeasureReportStratumRef extends org.hl7.fhir.jaxb.BackboneElementRef  {

	

	
	@Override
	public MeasureReportStratum createInstance() {
		return FhirFactory.eINSTANCE.createMeasureReportStratum();
	}
	
	public static MeasureReportStratumRef valueOf(String id) {
		MeasureReportStratumRef result = new MeasureReportStratumRef();
		result.setID(id);
		return result;
	}

	@Override
	public String toString() {
		return getID();
	}
	

}