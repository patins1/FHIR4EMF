package org.hl7.fhir.jaxb;

import javax.xml.bind.annotation.*;
import org.eclipse.emf.ecore.jaxb.*;

import org.hl7.fhir.DetectedIssueSeverity;
import org.hl7.fhir.FhirFactory;

@XmlRootElement(name = "DetectedIssueSeverityRefElement")
public class DetectedIssueSeverityRef extends org.hl7.fhir.jaxb.ElementRef  {

	

	
	@Override
	public DetectedIssueSeverity createInstance() {
		return FhirFactory.eINSTANCE.createDetectedIssueSeverity();
	}
	
	public static DetectedIssueSeverityRef valueOf(String id) {
		DetectedIssueSeverityRef result = new DetectedIssueSeverityRef();
		result.setID(id);
		return result;
	}

	@Override
	public String toString() {
		return getID();
	}
	

}