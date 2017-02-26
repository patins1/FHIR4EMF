package org.hl7.fhir.jaxb;

import javax.xml.bind.annotation.*;
import org.eclipse.emf.ecore.jaxb.*;

import org.hl7.fhir.FhirFactory;
import org.hl7.fhir.NoteType;

@XmlRootElement(name = "NoteTypeRefElement")
public class NoteTypeRef extends org.hl7.fhir.jaxb.ElementRef  {

	

	
	@Override
	public NoteType createInstance() {
		return FhirFactory.eINSTANCE.createNoteType();
	}
	
	public static NoteTypeRef valueOf(String id) {
		NoteTypeRef result = new NoteTypeRef();
		result.setID(id);
		return result;
	}

	@Override
	public String toString() {
		return getID();
	}
	

}