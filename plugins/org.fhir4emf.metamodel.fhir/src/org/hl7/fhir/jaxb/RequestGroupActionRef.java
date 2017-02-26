package org.hl7.fhir.jaxb;

import javax.xml.bind.annotation.*;
import org.eclipse.emf.ecore.jaxb.*;

import org.hl7.fhir.FhirFactory;
import org.hl7.fhir.RequestGroupAction;

@XmlRootElement(name = "RequestGroupActionRefElement")
public class RequestGroupActionRef extends org.hl7.fhir.jaxb.BackboneElementRef  {

	

	
	@Override
	public RequestGroupAction createInstance() {
		return FhirFactory.eINSTANCE.createRequestGroupAction();
	}
	
	public static RequestGroupActionRef valueOf(String id) {
		RequestGroupActionRef result = new RequestGroupActionRef();
		result.setID(id);
		return result;
	}

	@Override
	public String toString() {
		return getID();
	}
	

}