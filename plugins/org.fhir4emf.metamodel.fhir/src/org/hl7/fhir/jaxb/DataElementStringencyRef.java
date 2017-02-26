package org.hl7.fhir.jaxb;

import javax.xml.bind.annotation.*;
import org.eclipse.emf.ecore.jaxb.*;

import org.hl7.fhir.DataElementStringency;
import org.hl7.fhir.FhirFactory;

@XmlRootElement(name = "DataElementStringencyRefElement")
public class DataElementStringencyRef extends org.hl7.fhir.jaxb.ElementRef  {

	

	
	@Override
	public DataElementStringency createInstance() {
		return FhirFactory.eINSTANCE.createDataElementStringency();
	}
	
	public static DataElementStringencyRef valueOf(String id) {
		DataElementStringencyRef result = new DataElementStringencyRef();
		result.setID(id);
		return result;
	}

	@Override
	public String toString() {
		return getID();
	}
	

}