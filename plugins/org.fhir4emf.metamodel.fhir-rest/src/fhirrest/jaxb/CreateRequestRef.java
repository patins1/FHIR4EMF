package fhirrest.jaxb;

import javax.xml.bind.annotation.*;
import org.eclipse.emf.ecore.jaxb.*;

import fhirrest.CreateRequest;
import fhirrest.FhirrestFactory;

@XmlRootElement(name = "CreateRequestRefElement")
public class CreateRequestRef extends org.eclipse.emf.ecore.jaxb.EObjectRef  {

	

	
	@Override
	public CreateRequest createInstance() {
		return FhirrestFactory.eINSTANCE.createCreateRequest();
	}
	
	public static CreateRequestRef valueOf(String id) {
		CreateRequestRef result = new CreateRequestRef();
		result.setID(id);
		return result;
	}

	@Override
	public String toString() {
		return getID();
	}
	

}