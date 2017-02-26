package fhirrest.jaxb;

import javax.xml.bind.annotation.*;
import org.eclipse.emf.ecore.jaxb.*;

import fhirrest.FhirrestFactory;
import fhirrest.TransformResponse;

@XmlRootElement(name = "TransformResponseRefElement")
public class TransformResponseRef extends org.eclipse.emf.ecore.jaxb.EObjectRef  {

	

	
	@Override
	public TransformResponse createInstance() {
		return FhirrestFactory.eINSTANCE.createTransformResponse();
	}
	
	public static TransformResponseRef valueOf(String id) {
		TransformResponseRef result = new TransformResponseRef();
		result.setID(id);
		return result;
	}

	@Override
	public String toString() {
		return getID();
	}
	

}