package org.hl7.fhir.jaxb;

import javax.xml.bind.annotation.*;
import org.eclipse.emf.ecore.jaxb.*;

import org.hl7.fhir.FhirFactory;
import org.hl7.fhir.SubstanceStatus;

@XmlRootElement(name = "SubstanceStatusRefElement")
public class SubstanceStatusRef extends org.hl7.fhir.jaxb.ElementRef  {

	

	
	@Override
	public SubstanceStatus createInstance() {
		return FhirFactory.eINSTANCE.createSubstanceStatus();
	}
	
	public static SubstanceStatusRef valueOf(String id) {
		SubstanceStatusRef result = new SubstanceStatusRef();
		result.setID(id);
		return result;
	}

	@Override
	public String toString() {
		return getID();
	}
	

}