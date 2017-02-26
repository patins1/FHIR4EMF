package org.hl7.fhir.jaxb;

import javax.xml.bind.annotation.*;
import org.eclipse.emf.ecore.jaxb.*;

import org.hl7.fhir.FhirFactory;
import org.hl7.fhir.IssueSeverity;

@XmlRootElement(name = "IssueSeverityRefElement")
public class IssueSeverityRef extends org.hl7.fhir.jaxb.ElementRef  {

	

	
	@Override
	public IssueSeverity createInstance() {
		return FhirFactory.eINSTANCE.createIssueSeverity();
	}
	
	public static IssueSeverityRef valueOf(String id) {
		IssueSeverityRef result = new IssueSeverityRef();
		result.setID(id);
		return result;
	}

	@Override
	public String toString() {
		return getID();
	}
	

}