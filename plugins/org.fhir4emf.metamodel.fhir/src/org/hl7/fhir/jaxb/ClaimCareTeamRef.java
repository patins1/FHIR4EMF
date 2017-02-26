package org.hl7.fhir.jaxb;

import javax.xml.bind.annotation.*;
import org.eclipse.emf.ecore.jaxb.*;

import org.hl7.fhir.ClaimCareTeam;
import org.hl7.fhir.FhirFactory;

@XmlRootElement(name = "ClaimCareTeamRefElement")
public class ClaimCareTeamRef extends org.hl7.fhir.jaxb.BackboneElementRef  {

	

	
	@Override
	public ClaimCareTeam createInstance() {
		return FhirFactory.eINSTANCE.createClaimCareTeam();
	}
	
	public static ClaimCareTeamRef valueOf(String id) {
		ClaimCareTeamRef result = new ClaimCareTeamRef();
		result.setID(id);
		return result;
	}

	@Override
	public String toString() {
		return getID();
	}
	

}