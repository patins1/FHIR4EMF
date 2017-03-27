package org.hl7.fhir.jaxb;

import javax.xml.bind.annotation.*;
import org.eclipse.emf.ecore.jaxb.*;

import org.hl7.fhir.ConfidentialityClassification;
import org.hl7.fhir.FhirFactory;

@XmlRootElement(name = "ConfidentialityClassificationRefElement")
public class ConfidentialityClassificationRef extends org.hl7.fhir.jaxb.ElementRef  {

	

	
	@Override
	public ConfidentialityClassification createInstance() {
		return FhirFactory.eINSTANCE.createConfidentialityClassification();
	}
	
	public static ConfidentialityClassificationRef valueOf(String id) {
		ConfidentialityClassificationRef result = new ConfidentialityClassificationRef();
		result.setID(id);
		return result;
	}

	@Override
	public String toString() {
		return getID();
	}
	

}