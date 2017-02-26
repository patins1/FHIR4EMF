package org.hl7.fhir.jaxb;

import javax.xml.bind.annotation.*;
import org.eclipse.emf.ecore.jaxb.*;

import org.hl7.fhir.BackboneElement;
import org.hl7.fhir.FhirFactory;

@XmlRootElement(name = "BackboneElementRefElement")
public class BackboneElementRef extends org.hl7.fhir.jaxb.ElementRef  {

	

	
	@Override
	public BackboneElement createInstance() {
		return FhirFactory.eINSTANCE.createBackboneElement();
	}
	
	public static BackboneElementRef valueOf(String id) {
		BackboneElementRef result = new BackboneElementRef();
		result.setID(id);
		return result;
	}

	@Override
	public String toString() {
		return getID();
	}
	

}