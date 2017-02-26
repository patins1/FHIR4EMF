package fhirrest.jaxb;

import javax.xml.bind.annotation.*;
import org.eclipse.emf.ecore.jaxb.*;

import fhirrest.FhirrestFactory;
import fhirrest.UpdateResponse;

@XmlRootElement(name = "UpdateResponseRefElement")
public class UpdateResponseRef extends org.eclipse.emf.ecore.jaxb.EObjectRef  {

	

	
	@Override
	public UpdateResponse createInstance() {
		return FhirrestFactory.eINSTANCE.createUpdateResponse();
	}
	
	public static UpdateResponseRef valueOf(String id) {
		UpdateResponseRef result = new UpdateResponseRef();
		result.setID(id);
		return result;
	}

	@Override
	public String toString() {
		return getID();
	}
	

}