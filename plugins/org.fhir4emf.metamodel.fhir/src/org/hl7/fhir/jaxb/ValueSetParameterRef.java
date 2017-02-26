package org.hl7.fhir.jaxb;

import javax.xml.bind.annotation.*;
import org.eclipse.emf.ecore.jaxb.*;

import org.hl7.fhir.FhirFactory;
import org.hl7.fhir.ValueSetParameter;

@XmlRootElement(name = "ValueSetParameterRefElement")
public class ValueSetParameterRef extends org.hl7.fhir.jaxb.BackboneElementRef  {

	

	
	@Override
	public ValueSetParameter createInstance() {
		return FhirFactory.eINSTANCE.createValueSetParameter();
	}
	
	public static ValueSetParameterRef valueOf(String id) {
		ValueSetParameterRef result = new ValueSetParameterRef();
		result.setID(id);
		return result;
	}

	@Override
	public String toString() {
		return getID();
	}
	

}