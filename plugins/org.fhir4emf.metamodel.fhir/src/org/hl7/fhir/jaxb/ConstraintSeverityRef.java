package org.hl7.fhir.jaxb;

import javax.xml.bind.annotation.*;
import org.eclipse.emf.ecore.jaxb.*;

import org.hl7.fhir.ConstraintSeverity;
import org.hl7.fhir.FhirFactory;

@XmlRootElement(name = "ConstraintSeverityRefElement")
public class ConstraintSeverityRef extends org.hl7.fhir.jaxb.ElementRef  {

	

	
	@Override
	public ConstraintSeverity createInstance() {
		return FhirFactory.eINSTANCE.createConstraintSeverity();
	}
	
	public static ConstraintSeverityRef valueOf(String id) {
		ConstraintSeverityRef result = new ConstraintSeverityRef();
		result.setID(id);
		return result;
	}

	@Override
	public String toString() {
		return getID();
	}
	

}