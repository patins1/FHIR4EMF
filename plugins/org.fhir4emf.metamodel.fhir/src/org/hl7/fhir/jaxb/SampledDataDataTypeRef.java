package org.hl7.fhir.jaxb;

import javax.xml.bind.annotation.*;
import org.eclipse.emf.ecore.jaxb.*;

import org.hl7.fhir.FhirFactory;
import org.hl7.fhir.SampledDataDataType;

@XmlRootElement(name = "SampledDataDataTypeRefElement")
public class SampledDataDataTypeRef extends org.hl7.fhir.jaxb.ElementRef  {

	

	
	@Override
	public SampledDataDataType createInstance() {
		return FhirFactory.eINSTANCE.createSampledDataDataType();
	}
	
	public static SampledDataDataTypeRef valueOf(String id) {
		SampledDataDataTypeRef result = new SampledDataDataTypeRef();
		result.setID(id);
		return result;
	}

	@Override
	public String toString() {
		return getID();
	}
	

}