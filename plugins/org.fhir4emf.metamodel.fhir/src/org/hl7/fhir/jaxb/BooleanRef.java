package org.hl7.fhir.jaxb;

import javax.xml.bind.annotation.*;
import org.eclipse.emf.ecore.jaxb.*;

import org.hl7.fhir.FhirFactory;

@XmlRootElement(name = "BooleanRefElement")
public class BooleanRef extends org.hl7.fhir.jaxb.ElementRef  {

	

	
	@Override
	public org.hl7.fhir.Boolean createInstance() {
		return FhirFactory.eINSTANCE.createBoolean();
	}
	
	public static BooleanRef valueOf(String id) {
		BooleanRef result = new BooleanRef();
		result.setID(id);
		return result;
	}

	@Override
	public String toString() {
		return getID();
	}
	

}