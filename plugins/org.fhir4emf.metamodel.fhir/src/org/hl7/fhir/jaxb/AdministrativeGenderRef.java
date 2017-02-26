package org.hl7.fhir.jaxb;

import javax.xml.bind.annotation.*;
import org.eclipse.emf.ecore.jaxb.*;

import org.hl7.fhir.AdministrativeGender;
import org.hl7.fhir.FhirFactory;

@XmlRootElement(name = "AdministrativeGenderRefElement")
public class AdministrativeGenderRef extends org.hl7.fhir.jaxb.ElementRef  {

	

	
	@Override
	public AdministrativeGender createInstance() {
		return FhirFactory.eINSTANCE.createAdministrativeGender();
	}
	
	public static AdministrativeGenderRef valueOf(String id) {
		AdministrativeGenderRef result = new AdministrativeGenderRef();
		result.setID(id);
		return result;
	}

	@Override
	public String toString() {
		return getID();
	}
	

}