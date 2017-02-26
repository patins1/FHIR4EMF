package org.hl7.fhir.jaxb;

import javax.xml.bind.annotation.*;
import org.eclipse.emf.ecore.jaxb.*;

import org.hl7.fhir.ConsentExcept;
import org.hl7.fhir.FhirFactory;

@XmlRootElement(name = "ConsentExceptRefElement")
public class ConsentExceptRef extends org.hl7.fhir.jaxb.BackboneElementRef  {

	

	
	@Override
	public ConsentExcept createInstance() {
		return FhirFactory.eINSTANCE.createConsentExcept();
	}
	
	public static ConsentExceptRef valueOf(String id) {
		ConsentExceptRef result = new ConsentExceptRef();
		result.setID(id);
		return result;
	}

	@Override
	public String toString() {
		return getID();
	}
	

}