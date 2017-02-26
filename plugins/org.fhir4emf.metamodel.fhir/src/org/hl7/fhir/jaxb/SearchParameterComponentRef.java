package org.hl7.fhir.jaxb;

import javax.xml.bind.annotation.*;
import org.eclipse.emf.ecore.jaxb.*;

import org.hl7.fhir.FhirFactory;
import org.hl7.fhir.SearchParameterComponent;

@XmlRootElement(name = "SearchParameterComponentRefElement")
public class SearchParameterComponentRef extends org.hl7.fhir.jaxb.BackboneElementRef  {

	

	
	@Override
	public SearchParameterComponent createInstance() {
		return FhirFactory.eINSTANCE.createSearchParameterComponent();
	}
	
	public static SearchParameterComponentRef valueOf(String id) {
		SearchParameterComponentRef result = new SearchParameterComponentRef();
		result.setID(id);
		return result;
	}

	@Override
	public String toString() {
		return getID();
	}
	

}