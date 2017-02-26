package org.hl7.fhir.jaxb;

import javax.xml.bind.annotation.*;
import org.eclipse.emf.ecore.jaxb.*;

import org.hl7.fhir.FhirFactory;
import org.hl7.fhir.RequestGroup;

@XmlRootElement(name = "RequestGroupRefElement")
public class RequestGroupRef extends org.hl7.fhir.jaxb.DomainResourceRef  {

	

	
	@Override
	public RequestGroup createInstance() {
		return FhirFactory.eINSTANCE.createRequestGroup();
	}
	
	public static RequestGroupRef valueOf(String id) {
		RequestGroupRef result = new RequestGroupRef();
		result.setID(id);
		return result;
	}

	@Override
	public String toString() {
		return getID();
	}
	

}