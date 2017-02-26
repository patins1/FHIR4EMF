package org.hl7.fhir.jaxb;

import javax.xml.bind.annotation.*;
import org.eclipse.emf.ecore.jaxb.*;

import org.hl7.fhir.FhirFactory;
import org.hl7.fhir.UnsignedInt;

@XmlRootElement(name = "UnsignedIntRefElement")
public class UnsignedIntRef extends org.hl7.fhir.jaxb.ElementRef  {

	

	
	@Override
	public UnsignedInt createInstance() {
		return FhirFactory.eINSTANCE.createUnsignedInt();
	}
	
	public static UnsignedIntRef valueOf(String id) {
		UnsignedIntRef result = new UnsignedIntRef();
		result.setID(id);
		return result;
	}

	@Override
	public String toString() {
		return getID();
	}
	

}