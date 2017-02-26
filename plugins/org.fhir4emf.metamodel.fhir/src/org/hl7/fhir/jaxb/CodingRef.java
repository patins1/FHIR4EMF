package org.hl7.fhir.jaxb;

import javax.xml.bind.annotation.*;
import org.eclipse.emf.ecore.jaxb.*;

import org.hl7.fhir.Coding;
import org.hl7.fhir.FhirFactory;

@XmlRootElement(name = "CodingRefElement")
public class CodingRef extends org.hl7.fhir.jaxb.ElementRef  {

	

	
	@Override
	public Coding createInstance() {
		return FhirFactory.eINSTANCE.createCoding();
	}
	
	public static CodingRef valueOf(String id) {
		CodingRef result = new CodingRef();
		result.setID(id);
		return result;
	}

	@Override
	public String toString() {
		return getID();
	}
	

}