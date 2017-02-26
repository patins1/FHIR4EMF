package org.hl7.fhir.jaxb;

import javax.xml.bind.annotation.*;
import org.eclipse.emf.ecore.jaxb.*;

import org.hl7.fhir.Contributor;
import org.hl7.fhir.FhirFactory;

@XmlRootElement(name = "ContributorRefElement")
public class ContributorRef extends org.hl7.fhir.jaxb.ElementRef  {

	

	
	@Override
	public Contributor createInstance() {
		return FhirFactory.eINSTANCE.createContributor();
	}
	
	public static ContributorRef valueOf(String id) {
		ContributorRef result = new ContributorRef();
		result.setID(id);
		return result;
	}

	@Override
	public String toString() {
		return getID();
	}
	

}