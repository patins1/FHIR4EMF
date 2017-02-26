package org.hl7.fhir.jaxb;

import javax.xml.bind.annotation.*;
import org.eclipse.emf.ecore.jaxb.*;

import org.hl7.fhir.ClaimDiagnosis;
import org.hl7.fhir.FhirFactory;

@XmlRootElement(name = "ClaimDiagnosisRefElement")
public class ClaimDiagnosisRef extends org.hl7.fhir.jaxb.BackboneElementRef  {

	

	
	@Override
	public ClaimDiagnosis createInstance() {
		return FhirFactory.eINSTANCE.createClaimDiagnosis();
	}
	
	public static ClaimDiagnosisRef valueOf(String id) {
		ClaimDiagnosisRef result = new ClaimDiagnosisRef();
		result.setID(id);
		return result;
	}

	@Override
	public String toString() {
		return getID();
	}
	

}