package org.hl7.fhir.jaxb;

import javax.xml.bind.annotation.*;
import org.eclipse.emf.ecore.jaxb.*;

import org.hl7.fhir.CompositeMeasureScoring;
import org.hl7.fhir.FhirFactory;

@XmlRootElement(name = "CompositeMeasureScoringRefElement")
public class CompositeMeasureScoringRef extends org.hl7.fhir.jaxb.ElementRef  {

	

	
	@Override
	public CompositeMeasureScoring createInstance() {
		return FhirFactory.eINSTANCE.createCompositeMeasureScoring();
	}
	
	public static CompositeMeasureScoringRef valueOf(String id) {
		CompositeMeasureScoringRef result = new CompositeMeasureScoringRef();
		result.setID(id);
		return result;
	}

	@Override
	public String toString() {
		return getID();
	}
	

}