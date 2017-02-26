package org.hl7.fhir.jaxb;

import javax.xml.bind.annotation.*;
import org.eclipse.emf.ecore.jaxb.*;

import org.hl7.fhir.FhirFactory;
import org.hl7.fhir.SequenceVariant;

@XmlRootElement(name = "SequenceVariantRefElement")
public class SequenceVariantRef extends org.hl7.fhir.jaxb.BackboneElementRef  {

	

	
	@Override
	public SequenceVariant createInstance() {
		return FhirFactory.eINSTANCE.createSequenceVariant();
	}
	
	public static SequenceVariantRef valueOf(String id) {
		SequenceVariantRef result = new SequenceVariantRef();
		result.setID(id);
		return result;
	}

	@Override
	public String toString() {
		return getID();
	}
	

}