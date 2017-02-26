package org.hl7.fhir.jaxb;

import javax.xml.bind.annotation.*;
import org.eclipse.emf.ecore.jaxb.*;

import org.hl7.fhir.FhirFactory;
import org.hl7.fhir.MeasureScoring;

@XmlRootElement(name = "MeasureScoringRefElement")
public class MeasureScoringRef extends org.hl7.fhir.jaxb.ElementRef  {

	

	
	@Override
	public MeasureScoring createInstance() {
		return FhirFactory.eINSTANCE.createMeasureScoring();
	}
	
	public static MeasureScoringRef valueOf(String id) {
		MeasureScoringRef result = new MeasureScoringRef();
		result.setID(id);
		return result;
	}

	@Override
	public String toString() {
		return getID();
	}
	

}