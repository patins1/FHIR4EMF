package org.hl7.fhir.jaxb;

import javax.xml.bind.annotation.*;
import org.eclipse.emf.ecore.jaxb.*;

import org.hl7.fhir.FhirFactory;
import org.hl7.fhir.SubstanceInstance;

@XmlRootElement(name = "SubstanceInstanceRefElement")
public class SubstanceInstanceRef extends org.hl7.fhir.jaxb.BackboneElementRef  {

	

	
	@Override
	public SubstanceInstance createInstance() {
		return FhirFactory.eINSTANCE.createSubstanceInstance();
	}
	
	public static SubstanceInstanceRef valueOf(String id) {
		SubstanceInstanceRef result = new SubstanceInstanceRef();
		result.setID(id);
		return result;
	}

	@Override
	public String toString() {
		return getID();
	}
	

}