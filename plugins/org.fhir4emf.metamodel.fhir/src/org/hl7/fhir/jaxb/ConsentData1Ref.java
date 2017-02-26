package org.hl7.fhir.jaxb;

import javax.xml.bind.annotation.*;
import org.eclipse.emf.ecore.jaxb.*;

import org.hl7.fhir.ConsentData1;
import org.hl7.fhir.FhirFactory;

@XmlRootElement(name = "ConsentData1RefElement")
public class ConsentData1Ref extends org.hl7.fhir.jaxb.BackboneElementRef  {

	

	
	@Override
	public ConsentData1 createInstance() {
		return FhirFactory.eINSTANCE.createConsentData1();
	}
	
	public static ConsentData1Ref valueOf(String id) {
		ConsentData1Ref result = new ConsentData1Ref();
		result.setID(id);
		return result;
	}

	@Override
	public String toString() {
		return getID();
	}
	

}