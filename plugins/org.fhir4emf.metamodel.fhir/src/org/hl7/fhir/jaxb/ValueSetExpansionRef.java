package org.hl7.fhir.jaxb;

import javax.xml.bind.annotation.*;
import org.eclipse.emf.ecore.jaxb.*;

import org.hl7.fhir.FhirFactory;
import org.hl7.fhir.ValueSetExpansion;

@XmlRootElement(name = "ValueSetExpansionRefElement")
public class ValueSetExpansionRef extends org.hl7.fhir.jaxb.BackboneElementRef  {

	

	
	@Override
	public ValueSetExpansion createInstance() {
		return FhirFactory.eINSTANCE.createValueSetExpansion();
	}
	
	public static ValueSetExpansionRef valueOf(String id) {
		ValueSetExpansionRef result = new ValueSetExpansionRef();
		result.setID(id);
		return result;
	}

	@Override
	public String toString() {
		return getID();
	}
	

}