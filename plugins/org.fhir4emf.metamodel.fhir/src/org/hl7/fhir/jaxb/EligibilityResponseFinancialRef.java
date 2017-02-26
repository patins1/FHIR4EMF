package org.hl7.fhir.jaxb;

import javax.xml.bind.annotation.*;
import org.eclipse.emf.ecore.jaxb.*;

import org.hl7.fhir.EligibilityResponseFinancial;
import org.hl7.fhir.FhirFactory;

@XmlRootElement(name = "EligibilityResponseFinancialRefElement")
public class EligibilityResponseFinancialRef extends org.hl7.fhir.jaxb.BackboneElementRef  {

	

	
	@Override
	public EligibilityResponseFinancial createInstance() {
		return FhirFactory.eINSTANCE.createEligibilityResponseFinancial();
	}
	
	public static EligibilityResponseFinancialRef valueOf(String id) {
		EligibilityResponseFinancialRef result = new EligibilityResponseFinancialRef();
		result.setID(id);
		return result;
	}

	@Override
	public String toString() {
		return getID();
	}
	

}