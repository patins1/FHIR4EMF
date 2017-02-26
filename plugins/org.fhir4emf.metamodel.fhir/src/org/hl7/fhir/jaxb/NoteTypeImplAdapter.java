package org.hl7.fhir.jaxb;

import org.hl7.fhir.FhirFactory;
import org.hl7.fhir.NoteType;

import javax.xml.bind.annotation.adapters.XmlAdapter;
	
import org.hl7.fhir.NoteTypeList;
	
	
	
	

public class NoteTypeImplAdapter extends XmlAdapter<String, NoteType> {

	@Override
	public NoteType unmarshal(String v) throws Exception {
		NoteType result = FhirFactory.eINSTANCE.createNoteType();
		result.setValue(NoteTypeList.get(v));
		return result;
	}

	@Override
	public String marshal(NoteType v) throws Exception {
		return v.getValue().getLiteral();
	}

}
