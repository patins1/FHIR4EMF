package org.hl7.fhir.jaxb;

import javax.xml.bind.annotation.*;
import org.eclipse.emf.ecore.jaxb.*;

import org.hl7.fhir.FhirFactory;
import org.hl7.fhir.ImmunizationVaccinationProtocol;

@XmlRootElement(name = "ImmunizationVaccinationProtocolRefElement")
public class ImmunizationVaccinationProtocolRef extends org.hl7.fhir.jaxb.BackboneElementRef  {

	

	
	@Override
	public ImmunizationVaccinationProtocol createInstance() {
		return FhirFactory.eINSTANCE.createImmunizationVaccinationProtocol();
	}
	
	public static ImmunizationVaccinationProtocolRef valueOf(String id) {
		ImmunizationVaccinationProtocolRef result = new ImmunizationVaccinationProtocolRef();
		result.setID(id);
		return result;
	}

	@Override
	public String toString() {
		return getID();
	}
	

}