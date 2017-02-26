package org.hl7.fhir.jaxb;

import javax.xml.bind.annotation.*;
import org.eclipse.emf.ecore.jaxb.*;

import org.hl7.fhir.FhirFactory;
import org.hl7.fhir.SearchParamType;

@XmlRootElement(name = "SearchParamTypeRefElement")
public class SearchParamTypeRef extends org.hl7.fhir.jaxb.ElementRef  {

	

	
	@Override
	public SearchParamType createInstance() {
		return FhirFactory.eINSTANCE.createSearchParamType();
	}
	
	public static SearchParamTypeRef valueOf(String id) {
		SearchParamTypeRef result = new SearchParamTypeRef();
		result.setID(id);
		return result;
	}

	@Override
	public String toString() {
		return getID();
	}
	

}