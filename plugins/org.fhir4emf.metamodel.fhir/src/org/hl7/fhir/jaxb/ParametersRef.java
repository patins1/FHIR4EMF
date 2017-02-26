package org.hl7.fhir.jaxb;

import javax.xml.bind.annotation.*;
import org.eclipse.emf.ecore.jaxb.*;

import org.hl7.fhir.FhirFactory;
import org.hl7.fhir.Parameters;

@XmlRootElement(name = "ParametersRefElement")
public class ParametersRef extends org.hl7.fhir.jaxb.ResourceRef  {

	

	
	@Override
	public Parameters createInstance() {
		return FhirFactory.eINSTANCE.createParameters();
	}
	
	public static ParametersRef valueOf(String id) {
		ParametersRef result = new ParametersRef();
		result.setID(id);
		return result;
	}

	@Override
	public String toString() {
		return getID();
	}
	

}