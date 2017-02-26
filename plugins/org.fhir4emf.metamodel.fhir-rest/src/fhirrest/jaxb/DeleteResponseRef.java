package fhirrest.jaxb;

import javax.xml.bind.annotation.*;
import org.eclipse.emf.ecore.jaxb.*;

import fhirrest.DeleteResponse;
import fhirrest.FhirrestFactory;

@XmlRootElement(name = "DeleteResponseRefElement")
public class DeleteResponseRef extends org.eclipse.emf.ecore.jaxb.EObjectRef  {

	

	
	@Override
	public DeleteResponse createInstance() {
		return FhirrestFactory.eINSTANCE.createDeleteResponse();
	}
	
	public static DeleteResponseRef valueOf(String id) {
		DeleteResponseRef result = new DeleteResponseRef();
		result.setID(id);
		return result;
	}

	@Override
	public String toString() {
		return getID();
	}
	

}