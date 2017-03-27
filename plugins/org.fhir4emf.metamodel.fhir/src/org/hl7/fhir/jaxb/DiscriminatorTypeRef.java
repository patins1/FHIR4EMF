package org.hl7.fhir.jaxb;

import javax.xml.bind.annotation.*;
import org.eclipse.emf.ecore.jaxb.*;

import org.hl7.fhir.DiscriminatorType;
import org.hl7.fhir.FhirFactory;

@XmlRootElement(name = "DiscriminatorTypeRefElement")
public class DiscriminatorTypeRef extends org.hl7.fhir.jaxb.ElementRef  {

	

	
	@Override
	public DiscriminatorType createInstance() {
		return FhirFactory.eINSTANCE.createDiscriminatorType();
	}
	
	public static DiscriminatorTypeRef valueOf(String id) {
		DiscriminatorTypeRef result = new DiscriminatorTypeRef();
		result.setID(id);
		return result;
	}

	@Override
	public String toString() {
		return getID();
	}
	

}