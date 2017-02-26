package org.hl7.fhir.jaxb;

import javax.xml.bind.annotation.*;
import org.eclipse.emf.ecore.jaxb.*;

import org.hl7.fhir.FhirFactory;
import org.hl7.fhir.Sequence;

@XmlRootElement(name = "SequenceRefElement")
public class SequenceRef extends org.hl7.fhir.jaxb.DomainResourceRef  {

	

	
	@Override
	public Sequence createInstance() {
		return FhirFactory.eINSTANCE.createSequence();
	}
	
	public static SequenceRef valueOf(String id) {
		SequenceRef result = new SequenceRef();
		result.setID(id);
		return result;
	}

	@Override
	public String toString() {
		return getID();
	}
	

}