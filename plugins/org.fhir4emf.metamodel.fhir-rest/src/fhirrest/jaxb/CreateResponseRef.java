package fhirrest.jaxb;

import javax.xml.bind.annotation.*;
import org.eclipse.emf.ecore.jaxb.*;

import fhirrest.CreateResponse;
import fhirrest.FhirrestFactory;

@XmlRootElement(name = "CreateResponseRefElement")
public class CreateResponseRef extends org.eclipse.emf.ecore.jaxb.EObjectRef  {

	

	
	@Override
	public CreateResponse createInstance() {
		return FhirrestFactory.eINSTANCE.createCreateResponse();
	}
	
	public static CreateResponseRef valueOf(String id) {
		CreateResponseRef result = new CreateResponseRef();
		result.setID(id);
		return result;
	}

	@Override
	public String toString() {
		return getID();
	}
	

}