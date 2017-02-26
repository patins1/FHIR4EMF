package fhirrest.jaxb;

import javax.xml.bind.annotation.*;
import org.eclipse.emf.ecore.jaxb.*;

import fhirrest.FhirrestFactory;
import fhirrest.ReadResponse;

@XmlRootElement(name = "ReadResponseRefElement")
public class ReadResponseRef extends org.eclipse.emf.ecore.jaxb.EObjectRef  {

	

	
	@Override
	public ReadResponse createInstance() {
		return FhirrestFactory.eINSTANCE.createReadResponse();
	}
	
	public static ReadResponseRef valueOf(String id) {
		ReadResponseRef result = new ReadResponseRef();
		result.setID(id);
		return result;
	}

	@Override
	public String toString() {
		return getID();
	}
	

}