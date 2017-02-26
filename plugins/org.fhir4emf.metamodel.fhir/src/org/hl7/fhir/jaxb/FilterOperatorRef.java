package org.hl7.fhir.jaxb;

import javax.xml.bind.annotation.*;
import org.eclipse.emf.ecore.jaxb.*;

import org.hl7.fhir.FhirFactory;
import org.hl7.fhir.FilterOperator;

@XmlRootElement(name = "FilterOperatorRefElement")
public class FilterOperatorRef extends org.hl7.fhir.jaxb.ElementRef  {

	

	
	@Override
	public FilterOperator createInstance() {
		return FhirFactory.eINSTANCE.createFilterOperator();
	}
	
	public static FilterOperatorRef valueOf(String id) {
		FilterOperatorRef result = new FilterOperatorRef();
		result.setID(id);
		return result;
	}

	@Override
	public String toString() {
		return getID();
	}
	

}