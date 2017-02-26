package org.hl7.fhir.jaxb;

import javax.xml.bind.annotation.*;
import org.eclipse.emf.ecore.jaxb.*;

import org.hl7.fhir.FhirFactory;
import org.hl7.fhir.ProcessRequestItem;

@XmlRootElement(name = "ProcessRequestItemRefElement")
public class ProcessRequestItemRef extends org.hl7.fhir.jaxb.BackboneElementRef  {

	

	
	@Override
	public ProcessRequestItem createInstance() {
		return FhirFactory.eINSTANCE.createProcessRequestItem();
	}
	
	public static ProcessRequestItemRef valueOf(String id) {
		ProcessRequestItemRef result = new ProcessRequestItemRef();
		result.setID(id);
		return result;
	}

	@Override
	public String toString() {
		return getID();
	}
	

}