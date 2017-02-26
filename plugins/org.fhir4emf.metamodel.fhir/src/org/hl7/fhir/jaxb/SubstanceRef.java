package org.hl7.fhir.jaxb;

import javax.xml.bind.annotation.*;
import org.eclipse.emf.ecore.jaxb.*;

import org.hl7.fhir.FhirFactory;
import org.hl7.fhir.Substance;

@XmlRootElement(name = "SubstanceRefElement")
public class SubstanceRef extends org.hl7.fhir.jaxb.DomainResourceRef  {

	

	
	@Override
	public Substance createInstance() {
		return FhirFactory.eINSTANCE.createSubstance();
	}
	
	public static SubstanceRef valueOf(String id) {
		SubstanceRef result = new SubstanceRef();
		result.setID(id);
		return result;
	}

	@Override
	public String toString() {
		return getID();
	}
	

}