package org.hl7.fhir.jaxb;

import javax.xml.bind.annotation.*;
import org.eclipse.emf.ecore.jaxb.*;

import org.hl7.fhir.FhirFactory;
import org.hl7.fhir.ListStatus;

@XmlRootElement(name = "ListStatusRefElement")
public class ListStatusRef extends org.hl7.fhir.jaxb.ElementRef  {

	

	
	@Override
	public ListStatus createInstance() {
		return FhirFactory.eINSTANCE.createListStatus();
	}
	
	public static ListStatusRef valueOf(String id) {
		ListStatusRef result = new ListStatusRef();
		result.setID(id);
		return result;
	}

	@Override
	public String toString() {
		return getID();
	}
	

}