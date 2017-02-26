package org.hl7.fhir.jaxb;

import javax.xml.bind.annotation.*;
import org.eclipse.emf.ecore.jaxb.*;

import org.hl7.fhir.FhirFactory;
import org.hl7.fhir.SequenceType;

@XmlRootElement(name = "SequenceTypeRefElement")
public class SequenceTypeRef extends org.hl7.fhir.jaxb.ElementRef  {

	

	
	@Override
	public SequenceType createInstance() {
		return FhirFactory.eINSTANCE.createSequenceType();
	}
	
	public static SequenceTypeRef valueOf(String id) {
		SequenceTypeRef result = new SequenceTypeRef();
		result.setID(id);
		return result;
	}

	@Override
	public String toString() {
		return getID();
	}
	

}