package org.hl7.fhir.jaxb;

import javax.xml.bind.annotation.*;
import org.eclipse.emf.ecore.jaxb.*;

import org.hl7.fhir.ConsentData;
import org.hl7.fhir.FhirFactory;

@XmlRootElement(name = "ConsentDataRefElement")
public class ConsentDataRef extends org.hl7.fhir.jaxb.BackboneElementRef  {

	

	
	@Override
	public ConsentData createInstance() {
		return FhirFactory.eINSTANCE.createConsentData();
	}
	
	public static ConsentDataRef valueOf(String id) {
		ConsentDataRef result = new ConsentDataRef();
		result.setID(id);
		return result;
	}

	@Override
	public String toString() {
		return getID();
	}
	

}