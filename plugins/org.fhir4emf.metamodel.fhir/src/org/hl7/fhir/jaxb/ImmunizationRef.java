package org.hl7.fhir.jaxb;

import javax.xml.bind.annotation.*;
import org.eclipse.emf.ecore.jaxb.*;

import org.hl7.fhir.FhirFactory;
import org.hl7.fhir.Immunization;

@XmlRootElement(name = "ImmunizationRefElement")
public class ImmunizationRef extends org.hl7.fhir.jaxb.DomainResourceRef  {

	

	
	@Override
	public Immunization createInstance() {
		return FhirFactory.eINSTANCE.createImmunization();
	}
	
	public static ImmunizationRef valueOf(String id) {
		ImmunizationRef result = new ImmunizationRef();
		result.setID(id);
		return result;
	}

	@Override
	public String toString() {
		return getID();
	}
	

}