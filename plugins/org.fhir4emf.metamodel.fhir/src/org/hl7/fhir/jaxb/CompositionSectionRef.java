package org.hl7.fhir.jaxb;

import javax.xml.bind.annotation.*;
import org.eclipse.emf.ecore.jaxb.*;

import org.hl7.fhir.CompositionSection;
import org.hl7.fhir.FhirFactory;

@XmlRootElement(name = "CompositionSectionRefElement")
public class CompositionSectionRef extends org.hl7.fhir.jaxb.BackboneElementRef  {

	

	
	@Override
	public CompositionSection createInstance() {
		return FhirFactory.eINSTANCE.createCompositionSection();
	}
	
	public static CompositionSectionRef valueOf(String id) {
		CompositionSectionRef result = new CompositionSectionRef();
		result.setID(id);
		return result;
	}

	@Override
	public String toString() {
		return getID();
	}
	

}