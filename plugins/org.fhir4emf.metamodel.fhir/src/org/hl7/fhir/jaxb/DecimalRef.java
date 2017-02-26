package org.hl7.fhir.jaxb;

import javax.xml.bind.annotation.*;
import org.eclipse.emf.ecore.jaxb.*;

import org.hl7.fhir.Decimal;
import org.hl7.fhir.FhirFactory;

@XmlRootElement(name = "DecimalRefElement")
public class DecimalRef extends org.hl7.fhir.jaxb.ElementRef  {

	

	
	@Override
	public Decimal createInstance() {
		return FhirFactory.eINSTANCE.createDecimal();
	}
	
	public static DecimalRef valueOf(String id) {
		DecimalRef result = new DecimalRef();
		result.setID(id);
		return result;
	}

	@Override
	public String toString() {
		return getID();
	}
	

}