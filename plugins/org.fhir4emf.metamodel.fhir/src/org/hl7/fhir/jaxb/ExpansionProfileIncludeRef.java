package org.hl7.fhir.jaxb;

import javax.xml.bind.annotation.*;
import org.eclipse.emf.ecore.jaxb.*;

import org.hl7.fhir.ExpansionProfileInclude;
import org.hl7.fhir.FhirFactory;

@XmlRootElement(name = "ExpansionProfileIncludeRefElement")
public class ExpansionProfileIncludeRef extends org.hl7.fhir.jaxb.BackboneElementRef  {

	

	
	@Override
	public ExpansionProfileInclude createInstance() {
		return FhirFactory.eINSTANCE.createExpansionProfileInclude();
	}
	
	public static ExpansionProfileIncludeRef valueOf(String id) {
		ExpansionProfileIncludeRef result = new ExpansionProfileIncludeRef();
		result.setID(id);
		return result;
	}

	@Override
	public String toString() {
		return getID();
	}
	

}