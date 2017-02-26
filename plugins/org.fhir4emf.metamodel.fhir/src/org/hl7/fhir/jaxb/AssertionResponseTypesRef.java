package org.hl7.fhir.jaxb;

import javax.xml.bind.annotation.*;
import org.eclipse.emf.ecore.jaxb.*;

import org.hl7.fhir.AssertionResponseTypes;
import org.hl7.fhir.FhirFactory;

@XmlRootElement(name = "AssertionResponseTypesRefElement")
public class AssertionResponseTypesRef extends org.hl7.fhir.jaxb.ElementRef  {

	

	
	@Override
	public AssertionResponseTypes createInstance() {
		return FhirFactory.eINSTANCE.createAssertionResponseTypes();
	}
	
	public static AssertionResponseTypesRef valueOf(String id) {
		AssertionResponseTypesRef result = new AssertionResponseTypesRef();
		result.setID(id);
		return result;
	}

	@Override
	public String toString() {
		return getID();
	}
	

}