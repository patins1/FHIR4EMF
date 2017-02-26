package org.hl7.fhir.jaxb;

import javax.xml.bind.annotation.*;
import org.eclipse.emf.ecore.jaxb.*;

import org.hl7.fhir.ConsentDataMeaning;
import org.hl7.fhir.FhirFactory;

@XmlRootElement(name = "ConsentDataMeaningRefElement")
public class ConsentDataMeaningRef extends org.hl7.fhir.jaxb.ElementRef  {

	

	
	@Override
	public ConsentDataMeaning createInstance() {
		return FhirFactory.eINSTANCE.createConsentDataMeaning();
	}
	
	public static ConsentDataMeaningRef valueOf(String id) {
		ConsentDataMeaningRef result = new ConsentDataMeaningRef();
		result.setID(id);
		return result;
	}

	@Override
	public String toString() {
		return getID();
	}
	

}