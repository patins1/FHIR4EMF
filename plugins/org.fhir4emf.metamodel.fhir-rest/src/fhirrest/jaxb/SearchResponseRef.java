package fhirrest.jaxb;

import javax.xml.bind.annotation.*;
import org.eclipse.emf.ecore.jaxb.*;

import fhirrest.FhirrestFactory;
import fhirrest.SearchResponse;

@XmlRootElement(name = "SearchResponseRefElement")
public class SearchResponseRef extends org.eclipse.emf.ecore.jaxb.EObjectRef  {

	

	
	@Override
	public SearchResponse createInstance() {
		return FhirrestFactory.eINSTANCE.createSearchResponse();
	}
	
	public static SearchResponseRef valueOf(String id) {
		SearchResponseRef result = new SearchResponseRef();
		result.setID(id);
		return result;
	}

	@Override
	public String toString() {
		return getID();
	}
	

}