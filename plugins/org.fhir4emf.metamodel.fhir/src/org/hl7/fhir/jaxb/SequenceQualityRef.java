package org.hl7.fhir.jaxb;

import javax.xml.bind.annotation.*;
import org.eclipse.emf.ecore.jaxb.*;

import org.hl7.fhir.FhirFactory;
import org.hl7.fhir.SequenceQuality;

@XmlRootElement(name = "SequenceQualityRefElement")
public class SequenceQualityRef extends org.hl7.fhir.jaxb.BackboneElementRef  {

	

	
	@Override
	public SequenceQuality createInstance() {
		return FhirFactory.eINSTANCE.createSequenceQuality();
	}
	
	public static SequenceQualityRef valueOf(String id) {
		SequenceQualityRef result = new SequenceQualityRef();
		result.setID(id);
		return result;
	}

	@Override
	public String toString() {
		return getID();
	}
	

}