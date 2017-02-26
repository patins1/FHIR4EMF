package org.hl7.fhir.jaxb;

import javax.xml.bind.annotation.*;
import org.eclipse.emf.ecore.jaxb.*;

import org.hl7.fhir.CareTeam;
import org.hl7.fhir.FhirFactory;

@XmlRootElement(name = "CareTeamRefElement")
public class CareTeamRef extends org.hl7.fhir.jaxb.DomainResourceRef  {

	

	
	@Override
	public CareTeam createInstance() {
		return FhirFactory.eINSTANCE.createCareTeam();
	}
	
	public static CareTeamRef valueOf(String id) {
		CareTeamRef result = new CareTeamRef();
		result.setID(id);
		return result;
	}

	@Override
	public String toString() {
		return getID();
	}
	

}