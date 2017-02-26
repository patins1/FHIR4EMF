package org.hl7.fhir.jaxb;

import javax.xml.bind.annotation.*;
import org.eclipse.emf.ecore.jaxb.*;

import org.hl7.fhir.ExpansionProfileExclude;
import org.hl7.fhir.FhirFactory;

@XmlRootElement(name = "ExpansionProfileExcludeRefElement")
public class ExpansionProfileExcludeRef extends org.hl7.fhir.jaxb.BackboneElementRef  {

	

	
	@Override
	public ExpansionProfileExclude createInstance() {
		return FhirFactory.eINSTANCE.createExpansionProfileExclude();
	}
	
	public static ExpansionProfileExcludeRef valueOf(String id) {
		ExpansionProfileExcludeRef result = new ExpansionProfileExcludeRef();
		result.setID(id);
		return result;
	}

	@Override
	public String toString() {
		return getID();
	}
	

}