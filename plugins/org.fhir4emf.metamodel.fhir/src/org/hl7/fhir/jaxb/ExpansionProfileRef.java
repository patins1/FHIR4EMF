package org.hl7.fhir.jaxb;

import javax.xml.bind.annotation.*;
import org.eclipse.emf.ecore.jaxb.*;

import org.hl7.fhir.ExpansionProfile;
import org.hl7.fhir.FhirFactory;

@XmlRootElement(name = "ExpansionProfileRefElement")
public class ExpansionProfileRef extends org.hl7.fhir.jaxb.DomainResourceRef  {

	

	
	@Override
	public ExpansionProfile createInstance() {
		return FhirFactory.eINSTANCE.createExpansionProfile();
	}
	
	public static ExpansionProfileRef valueOf(String id) {
		ExpansionProfileRef result = new ExpansionProfileRef();
		result.setID(id);
		return result;
	}

	@Override
	public String toString() {
		return getID();
	}
	

}