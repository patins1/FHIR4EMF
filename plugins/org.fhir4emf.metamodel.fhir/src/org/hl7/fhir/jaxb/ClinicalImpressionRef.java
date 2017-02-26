package org.hl7.fhir.jaxb;

import javax.xml.bind.annotation.*;
import org.eclipse.emf.ecore.jaxb.*;

import org.hl7.fhir.ClinicalImpression;
import org.hl7.fhir.FhirFactory;

@XmlRootElement(name = "ClinicalImpressionRefElement")
public class ClinicalImpressionRef extends org.hl7.fhir.jaxb.DomainResourceRef  {

	

	
	@Override
	public ClinicalImpression createInstance() {
		return FhirFactory.eINSTANCE.createClinicalImpression();
	}
	
	public static ClinicalImpressionRef valueOf(String id) {
		ClinicalImpressionRef result = new ClinicalImpressionRef();
		result.setID(id);
		return result;
	}

	@Override
	public String toString() {
		return getID();
	}
	

}