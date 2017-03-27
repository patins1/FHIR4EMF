package org.hl7.fhir.jaxb;

import javax.xml.bind.annotation.*;
import org.eclipse.emf.ecore.jaxb.*;

import org.hl7.fhir.CompositionRelatesTo;
import org.hl7.fhir.FhirFactory;

@XmlRootElement(name = "CompositionRelatesToRefElement")
public class CompositionRelatesToRef extends org.hl7.fhir.jaxb.BackboneElementRef  {

	

	
	@Override
	public CompositionRelatesTo createInstance() {
		return FhirFactory.eINSTANCE.createCompositionRelatesTo();
	}
	
	public static CompositionRelatesToRef valueOf(String id) {
		CompositionRelatesToRef result = new CompositionRelatesToRef();
		result.setID(id);
		return result;
	}

	@Override
	public String toString() {
		return getID();
	}
	

}