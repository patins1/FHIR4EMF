package org.hl7.fhir.jaxb;

import javax.xml.bind.annotation.*;
import org.eclipse.emf.ecore.jaxb.*;

import org.hl7.fhir.FhirFactory;
import org.hl7.fhir.Money;

@XmlRootElement(name = "MoneyRefElement")
public class MoneyRef extends org.hl7.fhir.jaxb.QuantityRef  {

	

	
	@Override
	public Money createInstance() {
		return FhirFactory.eINSTANCE.createMoney();
	}
	
	public static MoneyRef valueOf(String id) {
		MoneyRef result = new MoneyRef();
		result.setID(id);
		return result;
	}

	@Override
	public String toString() {
		return getID();
	}
	

}