package org.hl7.fhir.jaxb;

import javax.xml.bind.annotation.*;
import org.eclipse.emf.ecore.jaxb.*;

import org.hl7.fhir.CompositionAttester;
import org.hl7.fhir.FhirFactory;

@XmlRootElement(name = "CompositionAttesterRefElement")
public class CompositionAttesterRef extends org.hl7.fhir.jaxb.BackboneElementRef  {

	

	
	@Override
	public CompositionAttester createInstance() {
		return FhirFactory.eINSTANCE.createCompositionAttester();
	}
	
	public static CompositionAttesterRef valueOf(String id) {
		CompositionAttesterRef result = new CompositionAttesterRef();
		result.setID(id);
		return result;
	}

	@Override
	public String toString() {
		return getID();
	}
	

}