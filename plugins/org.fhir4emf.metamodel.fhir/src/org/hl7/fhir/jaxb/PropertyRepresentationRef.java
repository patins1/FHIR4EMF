package org.hl7.fhir.jaxb;

import javax.xml.bind.annotation.*;
import org.eclipse.emf.ecore.jaxb.*;

import org.hl7.fhir.FhirFactory;
import org.hl7.fhir.PropertyRepresentation;

@XmlRootElement(name = "PropertyRepresentationRefElement")
public class PropertyRepresentationRef extends org.hl7.fhir.jaxb.ElementRef  {

	

	
	@Override
	public PropertyRepresentation createInstance() {
		return FhirFactory.eINSTANCE.createPropertyRepresentation();
	}
	
	public static PropertyRepresentationRef valueOf(String id) {
		PropertyRepresentationRef result = new PropertyRepresentationRef();
		result.setID(id);
		return result;
	}

	@Override
	public String toString() {
		return getID();
	}
	

}