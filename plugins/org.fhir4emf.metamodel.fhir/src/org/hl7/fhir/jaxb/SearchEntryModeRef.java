package org.hl7.fhir.jaxb;

import javax.xml.bind.annotation.*;
import org.eclipse.emf.ecore.jaxb.*;

import org.hl7.fhir.FhirFactory;
import org.hl7.fhir.SearchEntryMode;

@XmlRootElement(name = "SearchEntryModeRefElement")
public class SearchEntryModeRef extends org.hl7.fhir.jaxb.ElementRef  {

	

	
	@Override
	public SearchEntryMode createInstance() {
		return FhirFactory.eINSTANCE.createSearchEntryMode();
	}
	
	public static SearchEntryModeRef valueOf(String id) {
		SearchEntryModeRef result = new SearchEntryModeRef();
		result.setID(id);
		return result;
	}

	@Override
	public String toString() {
		return getID();
	}
	

}