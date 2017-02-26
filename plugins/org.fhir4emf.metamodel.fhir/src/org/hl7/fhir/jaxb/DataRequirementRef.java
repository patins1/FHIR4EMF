package org.hl7.fhir.jaxb;

import javax.xml.bind.annotation.*;
import org.eclipse.emf.ecore.jaxb.*;

import org.hl7.fhir.DataRequirement;
import org.hl7.fhir.FhirFactory;

@XmlRootElement(name = "DataRequirementRefElement")
public class DataRequirementRef extends org.hl7.fhir.jaxb.ElementRef  {

	

	
	@Override
	public DataRequirement createInstance() {
		return FhirFactory.eINSTANCE.createDataRequirement();
	}
	
	public static DataRequirementRef valueOf(String id) {
		DataRequirementRef result = new DataRequirementRef();
		result.setID(id);
		return result;
	}

	@Override
	public String toString() {
		return getID();
	}
	

}