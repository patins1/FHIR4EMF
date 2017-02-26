package org.hl7.fhir.jaxb;

import javax.xml.bind.annotation.*;
import org.eclipse.emf.ecore.jaxb.*;

import org.hl7.fhir.FhirFactory;
import org.hl7.fhir.ValueSetDesignation;

@XmlRootElement(name = "ValueSetDesignationRefElement")
public class ValueSetDesignationRef extends org.hl7.fhir.jaxb.BackboneElementRef  {

	

	
	@Override
	public ValueSetDesignation createInstance() {
		return FhirFactory.eINSTANCE.createValueSetDesignation();
	}
	
	public static ValueSetDesignationRef valueOf(String id) {
		ValueSetDesignationRef result = new ValueSetDesignationRef();
		result.setID(id);
		return result;
	}

	@Override
	public String toString() {
		return getID();
	}
	

}