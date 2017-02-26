package org.hl7.fhir.jaxb;

import javax.xml.bind.annotation.*;
import org.eclipse.emf.ecore.jaxb.*;

import org.hl7.fhir.FhirFactory;
import org.hl7.fhir.PropertyType;

@XmlRootElement(name = "PropertyTypeRefElement")
public class PropertyTypeRef extends org.hl7.fhir.jaxb.ElementRef  {

	

	
	@Override
	public PropertyType createInstance() {
		return FhirFactory.eINSTANCE.createPropertyType();
	}
	
	public static PropertyTypeRef valueOf(String id) {
		PropertyTypeRef result = new PropertyTypeRef();
		result.setID(id);
		return result;
	}

	@Override
	public String toString() {
		return getID();
	}
	

}