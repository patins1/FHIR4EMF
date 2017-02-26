package org.hl7.fhir.jaxb;

import javax.xml.bind.annotation.*;
import org.eclipse.emf.ecore.jaxb.*;

import org.hl7.fhir.FhirFactory;
import org.hl7.fhir.UsageContext;

@XmlRootElement(name = "UsageContextRefElement")
public class UsageContextRef extends org.hl7.fhir.jaxb.ElementRef  {

	

	
	@Override
	public UsageContext createInstance() {
		return FhirFactory.eINSTANCE.createUsageContext();
	}
	
	public static UsageContextRef valueOf(String id) {
		UsageContextRef result = new UsageContextRef();
		result.setID(id);
		return result;
	}

	@Override
	public String toString() {
		return getID();
	}
	

}