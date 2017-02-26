package org.hl7.fhir.jaxb;

import javax.xml.bind.annotation.*;
import org.eclipse.emf.ecore.jaxb.*;

import org.hl7.fhir.FhirFactory;
import org.hl7.fhir.HumanName;

@XmlRootElement(name = "HumanNameRefElement")
public class HumanNameRef extends org.hl7.fhir.jaxb.ElementRef  {

	

	
	@Override
	public HumanName createInstance() {
		return FhirFactory.eINSTANCE.createHumanName();
	}
	
	public static HumanNameRef valueOf(String id) {
		HumanNameRef result = new HumanNameRef();
		result.setID(id);
		return result;
	}

	@Override
	public String toString() {
		return getID();
	}
	

}