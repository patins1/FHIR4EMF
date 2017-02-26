package org.hl7.fhir.jaxb;

import javax.xml.bind.annotation.*;
import org.eclipse.emf.ecore.jaxb.*;

import org.hl7.fhir.AssertionOperatorType;
import org.hl7.fhir.FhirFactory;

@XmlRootElement(name = "AssertionOperatorTypeRefElement")
public class AssertionOperatorTypeRef extends org.hl7.fhir.jaxb.ElementRef  {

	

	
	@Override
	public AssertionOperatorType createInstance() {
		return FhirFactory.eINSTANCE.createAssertionOperatorType();
	}
	
	public static AssertionOperatorTypeRef valueOf(String id) {
		AssertionOperatorTypeRef result = new AssertionOperatorTypeRef();
		result.setID(id);
		return result;
	}

	@Override
	public String toString() {
		return getID();
	}
	

}