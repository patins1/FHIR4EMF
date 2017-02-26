package org.hl7.fhir.jaxb;

import javax.xml.bind.annotation.*;
import org.eclipse.emf.ecore.jaxb.*;

import org.hl7.fhir.ClinicalImpressionFinding;
import org.hl7.fhir.FhirFactory;

@XmlRootElement(name = "ClinicalImpressionFindingRefElement")
public class ClinicalImpressionFindingRef extends org.hl7.fhir.jaxb.BackboneElementRef  {

	

	
	@Override
	public ClinicalImpressionFinding createInstance() {
		return FhirFactory.eINSTANCE.createClinicalImpressionFinding();
	}
	
	public static ClinicalImpressionFindingRef valueOf(String id) {
		ClinicalImpressionFindingRef result = new ClinicalImpressionFindingRef();
		result.setID(id);
		return result;
	}

	@Override
	public String toString() {
		return getID();
	}
	

}