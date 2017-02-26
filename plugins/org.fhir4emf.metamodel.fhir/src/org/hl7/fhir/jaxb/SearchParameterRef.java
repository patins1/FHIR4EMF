package org.hl7.fhir.jaxb;

import javax.xml.bind.annotation.*;
import org.eclipse.emf.ecore.jaxb.*;

import org.hl7.fhir.FhirFactory;
import org.hl7.fhir.SearchParameter;

@XmlRootElement(name = "SearchParameterRefElement")
public class SearchParameterRef extends org.hl7.fhir.jaxb.DomainResourceRef  {

	

	
	@Override
	public SearchParameter createInstance() {
		return FhirFactory.eINSTANCE.createSearchParameter();
	}
	
	public static SearchParameterRef valueOf(String id) {
		SearchParameterRef result = new SearchParameterRef();
		result.setID(id);
		return result;
	}

	@Override
	public String toString() {
		return getID();
	}
	

}