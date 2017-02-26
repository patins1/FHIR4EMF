package org.hl7.fhir.jaxb;

import javax.xml.bind.annotation.*;
import org.eclipse.emf.ecore.jaxb.*;

import org.hl7.fhir.FhirFactory;
import org.hl7.fhir.MessageSignificanceCategory;

@XmlRootElement(name = "MessageSignificanceCategoryRefElement")
public class MessageSignificanceCategoryRef extends org.hl7.fhir.jaxb.ElementRef  {

	

	
	@Override
	public MessageSignificanceCategory createInstance() {
		return FhirFactory.eINSTANCE.createMessageSignificanceCategory();
	}
	
	public static MessageSignificanceCategoryRef valueOf(String id) {
		MessageSignificanceCategoryRef result = new MessageSignificanceCategoryRef();
		result.setID(id);
		return result;
	}

	@Override
	public String toString() {
		return getID();
	}
	

}