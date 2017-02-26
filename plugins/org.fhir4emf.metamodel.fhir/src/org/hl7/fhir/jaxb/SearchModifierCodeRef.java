package org.hl7.fhir.jaxb;

import javax.xml.bind.annotation.*;
import org.eclipse.emf.ecore.jaxb.*;

import org.hl7.fhir.FhirFactory;
import org.hl7.fhir.SearchModifierCode;

@XmlRootElement(name = "SearchModifierCodeRefElement")
public class SearchModifierCodeRef extends org.hl7.fhir.jaxb.ElementRef  {

	

	
	@Override
	public SearchModifierCode createInstance() {
		return FhirFactory.eINSTANCE.createSearchModifierCode();
	}
	
	public static SearchModifierCodeRef valueOf(String id) {
		SearchModifierCodeRef result = new SearchModifierCodeRef();
		result.setID(id);
		return result;
	}

	@Override
	public String toString() {
		return getID();
	}
	

}