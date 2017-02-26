package org.hl7.fhir.jaxb;

import javax.xml.bind.annotation.*;
import org.eclipse.emf.ecore.jaxb.*;

import org.hl7.fhir.DataElement;
import org.hl7.fhir.FhirFactory;

@XmlRootElement(name = "DataElementRefElement")
public class DataElementRef extends org.hl7.fhir.jaxb.DomainResourceRef  {

	

	
	@Override
	public DataElement createInstance() {
		return FhirFactory.eINSTANCE.createDataElement();
	}
	
	public static DataElementRef valueOf(String id) {
		DataElementRef result = new DataElementRef();
		result.setID(id);
		return result;
	}

	@Override
	public String toString() {
		return getID();
	}
	

}