package org.hl7.fhir.jaxb;

import javax.xml.bind.annotation.*;
import org.eclipse.emf.ecore.jaxb.*;

import org.hl7.fhir.DetectedIssueMitigation;
import org.hl7.fhir.FhirFactory;

@XmlRootElement(name = "DetectedIssueMitigationRefElement")
public class DetectedIssueMitigationRef extends org.hl7.fhir.jaxb.BackboneElementRef  {

	

	
	@Override
	public DetectedIssueMitigation createInstance() {
		return FhirFactory.eINSTANCE.createDetectedIssueMitigation();
	}
	
	public static DetectedIssueMitigationRef valueOf(String id) {
		DetectedIssueMitigationRef result = new DetectedIssueMitigationRef();
		result.setID(id);
		return result;
	}

	@Override
	public String toString() {
		return getID();
	}
	

}