package fhirrest.jaxb;

import javax.xml.bind.annotation.*;
import org.eclipse.emf.ecore.jaxb.*;

import fhirrest.FhirrestFactory;
import fhirrest.TransformRequest;

@XmlRootElement(name = "TransformRequestRefElement")
public class TransformRequestRef extends org.eclipse.emf.ecore.jaxb.EObjectRef  {

	

	
	@Override
	public TransformRequest createInstance() {
		return FhirrestFactory.eINSTANCE.createTransformRequest();
	}
	
	public static TransformRequestRef valueOf(String id) {
		TransformRequestRef result = new TransformRequestRef();
		result.setID(id);
		return result;
	}

	@Override
	public String toString() {
		return getID();
	}
	

}