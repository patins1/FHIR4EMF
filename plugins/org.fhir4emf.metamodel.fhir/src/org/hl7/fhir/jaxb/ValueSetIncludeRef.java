package org.hl7.fhir.jaxb;

import javax.xml.bind.annotation.*;
import org.eclipse.emf.ecore.jaxb.*;

import org.hl7.fhir.FhirFactory;
import org.hl7.fhir.ValueSetInclude;

@XmlRootElement(name = "ValueSetIncludeRefElement")
public class ValueSetIncludeRef extends org.hl7.fhir.jaxb.BackboneElementRef  {

	

	
	@Override
	public ValueSetInclude createInstance() {
		return FhirFactory.eINSTANCE.createValueSetInclude();
	}
	
	public static ValueSetIncludeRef valueOf(String id) {
		ValueSetIncludeRef result = new ValueSetIncludeRef();
		result.setID(id);
		return result;
	}

	@Override
	public String toString() {
		return getID();
	}
	

}