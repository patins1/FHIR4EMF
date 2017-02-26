package org.hl7.fhir.jaxb;

import javax.xml.bind.annotation.*;
import org.eclipse.emf.ecore.jaxb.*;

import org.hl7.fhir.Basic;
import org.hl7.fhir.FhirFactory;

@XmlRootElement(name = "BasicRefElement")
public class BasicRef extends org.hl7.fhir.jaxb.DomainResourceRef  {

	

	
	@Override
	public Basic createInstance() {
		return FhirFactory.eINSTANCE.createBasic();
	}
	
	public static BasicRef valueOf(String id) {
		BasicRef result = new BasicRef();
		result.setID(id);
		return result;
	}

	@Override
	public String toString() {
		return getID();
	}
	

}