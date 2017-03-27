package org.hl7.fhir.jaxb;

import javax.xml.bind.annotation.*;
import org.eclipse.emf.ecore.jaxb.*;

import org.hl7.fhir.FhirFactory;
import org.hl7.fhir.FinancialResourceStatusCodes;

@XmlRootElement(name = "FinancialResourceStatusCodesRefElement")
public class FinancialResourceStatusCodesRef extends org.hl7.fhir.jaxb.ElementRef  {

	

	
	@Override
	public FinancialResourceStatusCodes createInstance() {
		return FhirFactory.eINSTANCE.createFinancialResourceStatusCodes();
	}
	
	public static FinancialResourceStatusCodesRef valueOf(String id) {
		FinancialResourceStatusCodesRef result = new FinancialResourceStatusCodesRef();
		result.setID(id);
		return result;
	}

	@Override
	public String toString() {
		return getID();
	}
	

}