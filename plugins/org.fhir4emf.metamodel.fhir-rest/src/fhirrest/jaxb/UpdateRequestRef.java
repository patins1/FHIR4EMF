package fhirrest.jaxb;

import javax.xml.bind.annotation.*;
import org.eclipse.emf.ecore.jaxb.*;

import fhirrest.FhirrestFactory;
import fhirrest.UpdateRequest;

@XmlRootElement(name = "UpdateRequestRefElement")
public class UpdateRequestRef extends org.eclipse.emf.ecore.jaxb.EObjectRef  {

	

	
	@Override
	public UpdateRequest createInstance() {
		return FhirrestFactory.eINSTANCE.createUpdateRequest();
	}
	
	public static UpdateRequestRef valueOf(String id) {
		UpdateRequestRef result = new UpdateRequestRef();
		result.setID(id);
		return result;
	}

	@Override
	public String toString() {
		return getID();
	}
	

}