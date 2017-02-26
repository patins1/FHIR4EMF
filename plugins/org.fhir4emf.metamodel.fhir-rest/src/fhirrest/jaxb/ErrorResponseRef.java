package fhirrest.jaxb;

import javax.xml.bind.annotation.*;
import org.eclipse.emf.ecore.jaxb.*;

import fhirrest.ErrorResponse;
import fhirrest.FhirrestFactory;

@XmlRootElement(name = "ErrorResponseRefElement")
public class ErrorResponseRef extends org.eclipse.emf.ecore.jaxb.EObjectRef  {

	

	
	@Override
	public ErrorResponse createInstance() {
		return FhirrestFactory.eINSTANCE.createErrorResponse();
	}
	
	public static ErrorResponseRef valueOf(String id) {
		ErrorResponseRef result = new ErrorResponseRef();
		result.setID(id);
		return result;
	}

	@Override
	public String toString() {
		return getID();
	}
	

}