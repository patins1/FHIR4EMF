package org.hl7.fhir.jaxb;

import javax.xml.bind.annotation.*;
import org.eclipse.emf.ecore.jaxb.*;

import org.hl7.fhir.FhirFactory;
import org.hl7.fhir.SequenceReferenceSeq;

@XmlRootElement(name = "SequenceReferenceSeqRefElement")
public class SequenceReferenceSeqRef extends org.hl7.fhir.jaxb.BackboneElementRef  {

	

	
	@Override
	public SequenceReferenceSeq createInstance() {
		return FhirFactory.eINSTANCE.createSequenceReferenceSeq();
	}
	
	public static SequenceReferenceSeqRef valueOf(String id) {
		SequenceReferenceSeqRef result = new SequenceReferenceSeqRef();
		result.setID(id);
		return result;
	}

	@Override
	public String toString() {
		return getID();
	}
	

}