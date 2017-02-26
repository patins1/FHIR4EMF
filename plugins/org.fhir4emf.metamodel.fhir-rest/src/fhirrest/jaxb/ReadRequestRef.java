package fhirrest.jaxb;

import javax.xml.bind.annotation.*;
import org.eclipse.emf.ecore.jaxb.*;

import fhirrest.FhirrestFactory;
import fhirrest.ReadRequest;

@XmlRootElement(name = "ReadRequestRefElement")
public class ReadRequestRef extends org.eclipse.emf.ecore.jaxb.EObjectRef  {

	

	
	@Override
	public ReadRequest createInstance() {
		return FhirrestFactory.eINSTANCE.createReadRequest();
	}
	
	public static ReadRequestRef valueOf(String id) {
		ReadRequestRef result = new ReadRequestRef();
		result.setID(id);
		return result;
	}

	@Override
	public String toString() {
		return getID();
	}
	

}