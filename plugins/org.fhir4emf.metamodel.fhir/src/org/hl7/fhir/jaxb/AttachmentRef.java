package org.hl7.fhir.jaxb;

import javax.xml.bind.annotation.*;
import org.eclipse.emf.ecore.jaxb.*;

import org.hl7.fhir.Attachment;
import org.hl7.fhir.FhirFactory;

@XmlRootElement(name = "AttachmentRefElement")
public class AttachmentRef extends org.hl7.fhir.jaxb.ElementRef  {

	

	
	@Override
	public Attachment createInstance() {
		return FhirFactory.eINSTANCE.createAttachment();
	}
	
	public static AttachmentRef valueOf(String id) {
		AttachmentRef result = new AttachmentRef();
		result.setID(id);
		return result;
	}

	@Override
	public String toString() {
		return getID();
	}
	

}