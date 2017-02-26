package org.hl7.fhir.jaxb;

import javax.xml.bind.annotation.*;
import org.eclipse.emf.ecore.jaxb.*;

import org.hl7.fhir.FhirFactory;
import org.hl7.fhir.PositiveInt;

@XmlRootElement(name = "PositiveIntRefElement")
public class PositiveIntRef extends org.hl7.fhir.jaxb.ElementRef  {

	

	
	@Override
	public PositiveInt createInstance() {
		return FhirFactory.eINSTANCE.createPositiveInt();
	}
	
	public static PositiveIntRef valueOf(String id) {
		PositiveIntRef result = new PositiveIntRef();
		result.setID(id);
		return result;
	}

	@Override
	public String toString() {
		return getID();
	}
	

}