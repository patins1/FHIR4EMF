package org.hl7.fhir.jaxb;

import javax.xml.bind.annotation.*;
import org.eclipse.emf.ecore.jaxb.*;

import org.hl7.fhir.DataRequirementDateFilter;
import org.hl7.fhir.FhirFactory;

@XmlRootElement(name = "DataRequirementDateFilterRefElement")
public class DataRequirementDateFilterRef extends org.hl7.fhir.jaxb.ElementRef  {

	

	
	@Override
	public DataRequirementDateFilter createInstance() {
		return FhirFactory.eINSTANCE.createDataRequirementDateFilter();
	}
	
	public static DataRequirementDateFilterRef valueOf(String id) {
		DataRequirementDateFilterRef result = new DataRequirementDateFilterRef();
		result.setID(id);
		return result;
	}

	@Override
	public String toString() {
		return getID();
	}
	

}