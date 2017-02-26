package org.hl7.fhir.jaxb;

import javax.xml.bind.annotation.*;
import org.eclipse.emf.ecore.jaxb.*;

import org.hl7.fhir.FhirFactory;
import org.hl7.fhir.SearchComparator;

@XmlRootElement(name = "SearchComparatorRefElement")
public class SearchComparatorRef extends org.hl7.fhir.jaxb.ElementRef  {

	

	
	@Override
	public SearchComparator createInstance() {
		return FhirFactory.eINSTANCE.createSearchComparator();
	}
	
	public static SearchComparatorRef valueOf(String id) {
		SearchComparatorRef result = new SearchComparatorRef();
		result.setID(id);
		return result;
	}

	@Override
	public String toString() {
		return getID();
	}
	

}