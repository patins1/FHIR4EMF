package org.hl7.fhir.jaxb;

import javax.xml.bind.annotation.*;
import org.eclipse.emf.ecore.jaxb.*;

import org.hl7.fhir.FhirFactory;
import org.hl7.fhir.ImmunizationReaction;

@XmlRootElement(name = "ImmunizationReactionRefElement")
public class ImmunizationReactionRef extends org.hl7.fhir.jaxb.BackboneElementRef  {

	

	
	@Override
	public ImmunizationReaction createInstance() {
		return FhirFactory.eINSTANCE.createImmunizationReaction();
	}
	
	public static ImmunizationReactionRef valueOf(String id) {
		ImmunizationReactionRef result = new ImmunizationReactionRef();
		result.setID(id);
		return result;
	}

	@Override
	public String toString() {
		return getID();
	}
	

}