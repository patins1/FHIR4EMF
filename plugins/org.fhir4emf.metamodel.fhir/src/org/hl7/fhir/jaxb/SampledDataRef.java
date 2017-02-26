package org.hl7.fhir.jaxb;

import javax.xml.bind.annotation.*;
import org.eclipse.emf.ecore.jaxb.*;

import org.hl7.fhir.FhirFactory;
import org.hl7.fhir.SampledData;

@XmlRootElement(name = "SampledDataRefElement")
public class SampledDataRef extends org.hl7.fhir.jaxb.ElementRef  {

	

	
	@Override
	public SampledData createInstance() {
		return FhirFactory.eINSTANCE.createSampledData();
	}
	
	public static SampledDataRef valueOf(String id) {
		SampledDataRef result = new SampledDataRef();
		result.setID(id);
		return result;
	}

	@Override
	public String toString() {
		return getID();
	}
	

}