package org.hl7.fhir.jaxb;

import javax.xml.bind.annotation.*;
import org.eclipse.emf.ecore.jaxb.*;

import org.hl7.fhir.DataElementMapping;
import org.hl7.fhir.FhirFactory;

@XmlRootElement(name = "DataElementMappingRefElement")
public class DataElementMappingRef extends org.hl7.fhir.jaxb.BackboneElementRef  {

	

	
	@Override
	public DataElementMapping createInstance() {
		return FhirFactory.eINSTANCE.createDataElementMapping();
	}
	
	public static DataElementMappingRef valueOf(String id) {
		DataElementMappingRef result = new DataElementMappingRef();
		result.setID(id);
		return result;
	}

	@Override
	public String toString() {
		return getID();
	}
	

}