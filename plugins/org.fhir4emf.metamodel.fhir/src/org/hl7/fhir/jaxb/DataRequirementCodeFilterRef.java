package org.hl7.fhir.jaxb;

import javax.xml.bind.annotation.*;
import org.eclipse.emf.ecore.jaxb.*;

import org.hl7.fhir.DataRequirementCodeFilter;
import org.hl7.fhir.FhirFactory;

@XmlRootElement(name = "DataRequirementCodeFilterRefElement")
public class DataRequirementCodeFilterRef extends org.hl7.fhir.jaxb.ElementRef  {

	

	
	@Override
	public DataRequirementCodeFilter createInstance() {
		return FhirFactory.eINSTANCE.createDataRequirementCodeFilter();
	}
	
	public static DataRequirementCodeFilterRef valueOf(String id) {
		DataRequirementCodeFilterRef result = new DataRequirementCodeFilterRef();
		result.setID(id);
		return result;
	}

	@Override
	public String toString() {
		return getID();
	}
	

}