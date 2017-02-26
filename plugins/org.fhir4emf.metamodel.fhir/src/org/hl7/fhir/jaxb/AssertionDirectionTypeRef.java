package org.hl7.fhir.jaxb;

import javax.xml.bind.annotation.*;
import org.eclipse.emf.ecore.jaxb.*;

import org.hl7.fhir.AssertionDirectionType;
import org.hl7.fhir.FhirFactory;

@XmlRootElement(name = "AssertionDirectionTypeRefElement")
public class AssertionDirectionTypeRef extends org.hl7.fhir.jaxb.ElementRef  {

	

	
	@Override
	public AssertionDirectionType createInstance() {
		return FhirFactory.eINSTANCE.createAssertionDirectionType();
	}
	
	public static AssertionDirectionTypeRef valueOf(String id) {
		AssertionDirectionTypeRef result = new AssertionDirectionTypeRef();
		result.setID(id);
		return result;
	}

	@Override
	public String toString() {
		return getID();
	}
	

}