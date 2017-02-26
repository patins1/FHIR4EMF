package org.hl7.fhir.jaxb;

import javax.xml.bind.annotation.*;
import org.eclipse.emf.ecore.jaxb.*;

import org.hl7.fhir.FhirFactory;
import org.hl7.fhir.IdentityAssuranceLevel;

@XmlRootElement(name = "IdentityAssuranceLevelRefElement")
public class IdentityAssuranceLevelRef extends org.hl7.fhir.jaxb.ElementRef  {

	

	
	@Override
	public IdentityAssuranceLevel createInstance() {
		return FhirFactory.eINSTANCE.createIdentityAssuranceLevel();
	}
	
	public static IdentityAssuranceLevelRef valueOf(String id) {
		IdentityAssuranceLevelRef result = new IdentityAssuranceLevelRef();
		result.setID(id);
		return result;
	}

	@Override
	public String toString() {
		return getID();
	}
	

}