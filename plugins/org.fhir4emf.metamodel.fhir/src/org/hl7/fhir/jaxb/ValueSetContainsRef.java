package org.hl7.fhir.jaxb;

import javax.xml.bind.annotation.*;
import org.eclipse.emf.ecore.jaxb.*;

import org.hl7.fhir.FhirFactory;
import org.hl7.fhir.ValueSetContains;

@XmlRootElement(name = "ValueSetContainsRefElement")
public class ValueSetContainsRef extends org.hl7.fhir.jaxb.BackboneElementRef  {

	

	
	@Override
	public ValueSetContains createInstance() {
		return FhirFactory.eINSTANCE.createValueSetContains();
	}
	
	public static ValueSetContainsRef valueOf(String id) {
		ValueSetContainsRef result = new ValueSetContainsRef();
		result.setID(id);
		return result;
	}

	@Override
	public String toString() {
		return getID();
	}
	

}