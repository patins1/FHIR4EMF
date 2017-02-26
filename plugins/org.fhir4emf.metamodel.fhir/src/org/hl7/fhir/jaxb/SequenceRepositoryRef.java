package org.hl7.fhir.jaxb;

import javax.xml.bind.annotation.*;
import org.eclipse.emf.ecore.jaxb.*;

import org.hl7.fhir.FhirFactory;
import org.hl7.fhir.SequenceRepository;

@XmlRootElement(name = "SequenceRepositoryRefElement")
public class SequenceRepositoryRef extends org.hl7.fhir.jaxb.BackboneElementRef  {

	

	
	@Override
	public SequenceRepository createInstance() {
		return FhirFactory.eINSTANCE.createSequenceRepository();
	}
	
	public static SequenceRepositoryRef valueOf(String id) {
		SequenceRepositoryRef result = new SequenceRepositoryRef();
		result.setID(id);
		return result;
	}

	@Override
	public String toString() {
		return getID();
	}
	

}