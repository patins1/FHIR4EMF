package org.hl7.fhir.jaxb;

import javax.xml.bind.annotation.*;
import org.eclipse.emf.ecore.jaxb.*;

import org.hl7.fhir.FhirFactory;
import org.hl7.fhir.ListEntry;

@XmlRootElement(name = "ListEntryRefElement")
public class ListEntryRef extends org.hl7.fhir.jaxb.BackboneElementRef  {

	

	
	@Override
	public ListEntry createInstance() {
		return FhirFactory.eINSTANCE.createListEntry();
	}
	
	public static ListEntryRef valueOf(String id) {
		ListEntryRef result = new ListEntryRef();
		result.setID(id);
		return result;
	}

	@Override
	public String toString() {
		return getID();
	}
	

}