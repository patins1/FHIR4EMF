package org.hl7.fhir.jaxb;

import javax.xml.bind.annotation.*;
import org.eclipse.emf.ecore.jaxb.*;

import org.hl7.fhir.AdverseEventCategory;
import org.hl7.fhir.FhirFactory;

@XmlRootElement(name = "AdverseEventCategoryRefElement")
public class AdverseEventCategoryRef extends org.hl7.fhir.jaxb.ElementRef  {

	

	
	@Override
	public AdverseEventCategory createInstance() {
		return FhirFactory.eINSTANCE.createAdverseEventCategory();
	}
	
	public static AdverseEventCategoryRef valueOf(String id) {
		AdverseEventCategoryRef result = new AdverseEventCategoryRef();
		result.setID(id);
		return result;
	}

	@Override
	public String toString() {
		return getID();
	}
	

}