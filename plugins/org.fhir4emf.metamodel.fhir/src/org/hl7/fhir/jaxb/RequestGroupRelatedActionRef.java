package org.hl7.fhir.jaxb;

import javax.xml.bind.annotation.*;
import org.eclipse.emf.ecore.jaxb.*;

import org.hl7.fhir.FhirFactory;
import org.hl7.fhir.RequestGroupRelatedAction;

@XmlRootElement(name = "RequestGroupRelatedActionRefElement")
public class RequestGroupRelatedActionRef extends org.hl7.fhir.jaxb.BackboneElementRef  {

	

	
	@Override
	public RequestGroupRelatedAction createInstance() {
		return FhirFactory.eINSTANCE.createRequestGroupRelatedAction();
	}
	
	public static RequestGroupRelatedActionRef valueOf(String id) {
		RequestGroupRelatedActionRef result = new RequestGroupRelatedActionRef();
		result.setID(id);
		return result;
	}

	@Override
	public String toString() {
		return getID();
	}
	

}