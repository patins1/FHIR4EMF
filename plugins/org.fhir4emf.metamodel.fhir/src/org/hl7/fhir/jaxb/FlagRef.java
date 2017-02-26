package org.hl7.fhir.jaxb;

import javax.xml.bind.annotation.*;
import org.eclipse.emf.ecore.jaxb.*;

import org.hl7.fhir.FhirFactory;
import org.hl7.fhir.Flag;

@XmlRootElement(name = "FlagRefElement")
public class FlagRef extends org.hl7.fhir.jaxb.DomainResourceRef  {

	

	
	@Override
	public Flag createInstance() {
		return FhirFactory.eINSTANCE.createFlag();
	}
	
	public static FlagRef valueOf(String id) {
		FlagRef result = new FlagRef();
		result.setID(id);
		return result;
	}

	@Override
	public String toString() {
		return getID();
	}
	

}