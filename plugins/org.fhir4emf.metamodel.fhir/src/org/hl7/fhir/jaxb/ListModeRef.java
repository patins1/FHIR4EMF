package org.hl7.fhir.jaxb;

import javax.xml.bind.annotation.*;
import org.eclipse.emf.ecore.jaxb.*;

import org.hl7.fhir.FhirFactory;
import org.hl7.fhir.ListMode;

@XmlRootElement(name = "ListModeRefElement")
public class ListModeRef extends org.hl7.fhir.jaxb.ElementRef  {

	

	
	@Override
	public ListMode createInstance() {
		return FhirFactory.eINSTANCE.createListMode();
	}
	
	public static ListModeRef valueOf(String id) {
		ListModeRef result = new ListModeRef();
		result.setID(id);
		return result;
	}

	@Override
	public String toString() {
		return getID();
	}
	

}