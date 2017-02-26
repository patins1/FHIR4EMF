package org.hl7.fhir.jaxb;

import javax.xml.bind.annotation.*;
import org.eclipse.emf.ecore.jaxb.*;

import org.hl7.fhir.FhirFactory;
import org.hl7.fhir.Signature;

@XmlRootElement(name = "SignatureRefElement")
public class SignatureRef extends org.hl7.fhir.jaxb.ElementRef  {

	

	
	@Override
	public Signature createInstance() {
		return FhirFactory.eINSTANCE.createSignature();
	}
	
	public static SignatureRef valueOf(String id) {
		SignatureRef result = new SignatureRef();
		result.setID(id);
		return result;
	}

	@Override
	public String toString() {
		return getID();
	}
	

}