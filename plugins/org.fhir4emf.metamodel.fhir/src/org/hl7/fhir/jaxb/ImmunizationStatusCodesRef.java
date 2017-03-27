package org.hl7.fhir.jaxb;

import javax.xml.bind.annotation.*;
import org.eclipse.emf.ecore.jaxb.*;

import org.hl7.fhir.FhirFactory;
import org.hl7.fhir.ImmunizationStatusCodes;

@XmlRootElement(name = "ImmunizationStatusCodesRefElement")
public class ImmunizationStatusCodesRef extends org.hl7.fhir.jaxb.ElementRef  {

	

	
	@Override
	public ImmunizationStatusCodes createInstance() {
		return FhirFactory.eINSTANCE.createImmunizationStatusCodes();
	}
	
	public static ImmunizationStatusCodesRef valueOf(String id) {
		ImmunizationStatusCodesRef result = new ImmunizationStatusCodesRef();
		result.setID(id);
		return result;
	}

	@Override
	public String toString() {
		return getID();
	}
	

}