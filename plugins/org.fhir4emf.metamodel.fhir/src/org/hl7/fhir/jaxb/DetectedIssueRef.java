package org.hl7.fhir.jaxb;

import javax.xml.bind.annotation.*;
import org.eclipse.emf.ecore.jaxb.*;

import org.hl7.fhir.DetectedIssue;
import org.hl7.fhir.FhirFactory;

@XmlRootElement(name = "DetectedIssueRefElement")
public class DetectedIssueRef extends org.hl7.fhir.jaxb.DomainResourceRef  {

	

	
	@Override
	public DetectedIssue createInstance() {
		return FhirFactory.eINSTANCE.createDetectedIssue();
	}
	
	public static DetectedIssueRef valueOf(String id) {
		DetectedIssueRef result = new DetectedIssueRef();
		result.setID(id);
		return result;
	}

	@Override
	public String toString() {
		return getID();
	}
	

}