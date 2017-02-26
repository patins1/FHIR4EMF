package fhirrest.jaxb;

import javax.xml.bind.annotation.*;
import org.eclipse.emf.ecore.jaxb.*;

import fhirrest.FhirrestFactory;
import fhirrest.VReadResponse;

@XmlRootElement(name = "VReadResponseRefElement")
public class VReadResponseRef extends fhirrest.jaxb.ReadResponseRef  {

	

	
	@Override
	public VReadResponse createInstance() {
		return FhirrestFactory.eINSTANCE.createVReadResponse();
	}
	
	public static VReadResponseRef valueOf(String id) {
		VReadResponseRef result = new VReadResponseRef();
		result.setID(id);
		return result;
	}

	@Override
	public String toString() {
		return getID();
	}
	

}