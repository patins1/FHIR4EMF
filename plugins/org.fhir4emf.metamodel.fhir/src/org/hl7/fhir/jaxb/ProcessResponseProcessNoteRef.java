package org.hl7.fhir.jaxb;

import javax.xml.bind.annotation.*;
import org.eclipse.emf.ecore.jaxb.*;

import org.hl7.fhir.FhirFactory;
import org.hl7.fhir.ProcessResponseProcessNote;

@XmlRootElement(name = "ProcessResponseProcessNoteRefElement")
public class ProcessResponseProcessNoteRef extends org.hl7.fhir.jaxb.BackboneElementRef  {

	

	
	@Override
	public ProcessResponseProcessNote createInstance() {
		return FhirFactory.eINSTANCE.createProcessResponseProcessNote();
	}
	
	public static ProcessResponseProcessNoteRef valueOf(String id) {
		ProcessResponseProcessNoteRef result = new ProcessResponseProcessNoteRef();
		result.setID(id);
		return result;
	}

	@Override
	public String toString() {
		return getID();
	}
	

}