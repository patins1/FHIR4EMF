package org.hl7.fhir.jaxb;

import javax.xml.bind.annotation.*;
import org.eclipse.emf.ecore.jaxb.*;

import org.hl7.fhir.ContributorType;
import org.hl7.fhir.FhirFactory;

@XmlRootElement(name = "ContributorTypeRefElement")
public class ContributorTypeRef extends org.hl7.fhir.jaxb.ElementRef  {

	

	
	@Override
	public ContributorType createInstance() {
		return FhirFactory.eINSTANCE.createContributorType();
	}
	
	public static ContributorTypeRef valueOf(String id) {
		ContributorTypeRef result = new ContributorTypeRef();
		result.setID(id);
		return result;
	}

	@Override
	public String toString() {
		return getID();
	}
	

}