package org.hl7.fhir.jaxb;

import javax.xml.bind.annotation.*;
import org.eclipse.emf.ecore.jaxb.*;

import org.hl7.fhir.ClinicalImpressionStatus;
import org.hl7.fhir.FhirFactory;

@XmlRootElement(name = "ClinicalImpressionStatusRefElement")
public class ClinicalImpressionStatusRef extends org.hl7.fhir.jaxb.ElementRef  {

	

	
	@Override
	public ClinicalImpressionStatus createInstance() {
		return FhirFactory.eINSTANCE.createClinicalImpressionStatus();
	}
	
	public static ClinicalImpressionStatusRef valueOf(String id) {
		ClinicalImpressionStatusRef result = new ClinicalImpressionStatusRef();
		result.setID(id);
		return result;
	}

	@Override
	public String toString() {
		return getID();
	}
	

}