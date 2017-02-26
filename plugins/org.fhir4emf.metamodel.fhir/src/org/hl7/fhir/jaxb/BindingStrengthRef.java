package org.hl7.fhir.jaxb;

import javax.xml.bind.annotation.*;
import org.eclipse.emf.ecore.jaxb.*;

import org.hl7.fhir.BindingStrength;
import org.hl7.fhir.FhirFactory;

@XmlRootElement(name = "BindingStrengthRefElement")
public class BindingStrengthRef extends org.hl7.fhir.jaxb.ElementRef  {

	

	
	@Override
	public BindingStrength createInstance() {
		return FhirFactory.eINSTANCE.createBindingStrength();
	}
	
	public static BindingStrengthRef valueOf(String id) {
		BindingStrengthRef result = new BindingStrengthRef();
		result.setID(id);
		return result;
	}

	@Override
	public String toString() {
		return getID();
	}
	

}