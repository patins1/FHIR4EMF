package fhirrest.jaxb;

import javax.xml.bind.annotation.*;
import org.eclipse.emf.ecore.jaxb.*;

import fhirrest.FhirrestFactory;
import fhirrest.SearchRequest;

@XmlRootElement(name = "SearchRequestRefElement")
public class SearchRequestRef extends org.eclipse.emf.ecore.jaxb.EObjectRef  {

	

	
	@Override
	public SearchRequest createInstance() {
		return FhirrestFactory.eINSTANCE.createSearchRequest();
	}
	
	public static SearchRequestRef valueOf(String id) {
		SearchRequestRef result = new SearchRequestRef();
		result.setID(id);
		return result;
	}

	@Override
	public String toString() {
		return getID();
	}
	

}