package org.hl7.fhir.jaxb;

import javax.xml.bind.annotation.*;
import org.eclipse.emf.ecore.jaxb.*;

import org.hl7.fhir.Binary;
import org.hl7.fhir.FhirFactory;

@XmlRootElement(name = "BinaryRefElement")
public class BinaryRef extends org.hl7.fhir.jaxb.ResourceRef  {

	

	
	@Override
	public Binary createInstance() {
		return FhirFactory.eINSTANCE.createBinary();
	}
	
	public static BinaryRef valueOf(String id) {
		BinaryRef result = new BinaryRef();
		result.setID(id);
		return result;
	}

	@Override
	public String toString() {
		return getID();
	}
	

}