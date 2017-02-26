package fhirrest.jaxb;

import javax.xml.bind.annotation.*;
import org.eclipse.emf.ecore.jaxb.*;

import fhirrest.DeleteRequest;
import fhirrest.FhirrestFactory;

@XmlRootElement(name = "DeleteRequestRefElement")
public class DeleteRequestRef extends org.eclipse.emf.ecore.jaxb.EObjectRef  {

	

	
	@Override
	public DeleteRequest createInstance() {
		return FhirrestFactory.eINSTANCE.createDeleteRequest();
	}
	
	public static DeleteRequestRef valueOf(String id) {
		DeleteRequestRef result = new DeleteRequestRef();
		result.setID(id);
		return result;
	}

	@Override
	public String toString() {
		return getID();
	}
	

}