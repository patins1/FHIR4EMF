package org.hl7.fhir.jaxb;

import javax.xml.bind.annotation.*;
import org.eclipse.emf.ecore.jaxb.*;

import org.hl7.fhir.FhirFactory;
import org.hl7.fhir.ValueSet;

@XmlRootElement(name = "ValueSetRefElement")
public class ValueSetRef extends org.hl7.fhir.jaxb.DomainResourceRef  {

	

	
	@Override
	public ValueSet createInstance() {
		return FhirFactory.eINSTANCE.createValueSet();
	}
	
	public static ValueSetRef valueOf(String id) {
		ValueSetRef result = new ValueSetRef();
		result.setID(id);
		return result;
	}

	@Override
	public String toString() {
		return getID();
	}
	

}