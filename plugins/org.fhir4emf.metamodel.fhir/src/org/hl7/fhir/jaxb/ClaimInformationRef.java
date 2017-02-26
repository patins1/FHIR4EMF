package org.hl7.fhir.jaxb;

import javax.xml.bind.annotation.*;
import org.eclipse.emf.ecore.jaxb.*;

import org.hl7.fhir.ClaimInformation;
import org.hl7.fhir.FhirFactory;

@XmlRootElement(name = "ClaimInformationRefElement")
public class ClaimInformationRef extends org.hl7.fhir.jaxb.BackboneElementRef  {

	

	
	@Override
	public ClaimInformation createInstance() {
		return FhirFactory.eINSTANCE.createClaimInformation();
	}
	
	public static ClaimInformationRef valueOf(String id) {
		ClaimInformationRef result = new ClaimInformationRef();
		result.setID(id);
		return result;
	}

	@Override
	public String toString() {
		return getID();
	}
	

}