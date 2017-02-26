package org.hl7.fhir.jaxb;

import javax.xml.bind.annotation.*;
import org.eclipse.emf.ecore.jaxb.*;

import org.hl7.fhir.ExpansionProfileExcludedSystem;
import org.hl7.fhir.FhirFactory;

@XmlRootElement(name = "ExpansionProfileExcludedSystemRefElement")
public class ExpansionProfileExcludedSystemRef extends org.hl7.fhir.jaxb.BackboneElementRef  {

	

	
	@Override
	public ExpansionProfileExcludedSystem createInstance() {
		return FhirFactory.eINSTANCE.createExpansionProfileExcludedSystem();
	}
	
	public static ExpansionProfileExcludedSystemRef valueOf(String id) {
		ExpansionProfileExcludedSystemRef result = new ExpansionProfileExcludedSystemRef();
		result.setID(id);
		return result;
	}

	@Override
	public String toString() {
		return getID();
	}
	

}