package org.hl7.fhir.jaxb;

import javax.xml.bind.annotation.*;
import org.eclipse.emf.ecore.jaxb.*;

import org.hl7.fhir.ExpansionProfileFixedVersion;
import org.hl7.fhir.FhirFactory;

@XmlRootElement(name = "ExpansionProfileFixedVersionRefElement")
public class ExpansionProfileFixedVersionRef extends org.hl7.fhir.jaxb.BackboneElementRef  {

	

	
	@Override
	public ExpansionProfileFixedVersion createInstance() {
		return FhirFactory.eINSTANCE.createExpansionProfileFixedVersion();
	}
	
	public static ExpansionProfileFixedVersionRef valueOf(String id) {
		ExpansionProfileFixedVersionRef result = new ExpansionProfileFixedVersionRef();
		result.setID(id);
		return result;
	}

	@Override
	public String toString() {
		return getID();
	}
	

}