package org.hl7.fhir.jaxb;

import javax.xml.bind.annotation.*;
import org.eclipse.emf.ecore.jaxb.*;

import org.hl7.fhir.FhirFactory;
import org.hl7.fhir.List;

@XmlRootElement(name = "ListRefElement")
public class ListRef extends org.hl7.fhir.jaxb.DomainResourceRef  {

	

	
	@Override
	public List createInstance() {
		return FhirFactory.eINSTANCE.createList();
	}
	
	public static ListRef valueOf(String id) {
		ListRef result = new ListRef();
		result.setID(id);
		return result;
	}

	@Override
	public String toString() {
		return getID();
	}
	

}