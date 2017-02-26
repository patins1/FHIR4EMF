package org.hl7.fhir.jaxb;

import javax.xml.bind.annotation.*;
import org.eclipse.emf.ecore.jaxb.*;

import org.hl7.fhir.FhirFactory;
import org.hl7.fhir.ValueSetCompose;

@XmlRootElement(name = "ValueSetComposeRefElement")
public class ValueSetComposeRef extends org.hl7.fhir.jaxb.BackboneElementRef  {

	

	
	@Override
	public ValueSetCompose createInstance() {
		return FhirFactory.eINSTANCE.createValueSetCompose();
	}
	
	public static ValueSetComposeRef valueOf(String id) {
		ValueSetComposeRef result = new ValueSetComposeRef();
		result.setID(id);
		return result;
	}

	@Override
	public String toString() {
		return getID();
	}
	

}