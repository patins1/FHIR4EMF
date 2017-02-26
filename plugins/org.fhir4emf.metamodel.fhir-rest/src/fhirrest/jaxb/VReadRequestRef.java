package fhirrest.jaxb;

import javax.xml.bind.annotation.*;
import org.eclipse.emf.ecore.jaxb.*;

import fhirrest.FhirrestFactory;
import fhirrest.VReadRequest;

@XmlRootElement(name = "VReadRequestRefElement")
public class VReadRequestRef extends fhirrest.jaxb.ReadRequestRef  {

	

	
	@Override
	public VReadRequest createInstance() {
		return FhirrestFactory.eINSTANCE.createVReadRequest();
	}
	
	public static VReadRequestRef valueOf(String id) {
		VReadRequestRef result = new VReadRequestRef();
		result.setID(id);
		return result;
	}

	@Override
	public String toString() {
		return getID();
	}
	

}