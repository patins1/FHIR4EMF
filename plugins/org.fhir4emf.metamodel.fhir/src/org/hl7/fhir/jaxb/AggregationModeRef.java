package org.hl7.fhir.jaxb;

import javax.xml.bind.annotation.*;
import org.eclipse.emf.ecore.jaxb.*;

import org.hl7.fhir.AggregationMode;
import org.hl7.fhir.FhirFactory;

@XmlRootElement(name = "AggregationModeRefElement")
public class AggregationModeRef extends org.hl7.fhir.jaxb.ElementRef  {

	

	
	@Override
	public AggregationMode createInstance() {
		return FhirFactory.eINSTANCE.createAggregationMode();
	}
	
	public static AggregationModeRef valueOf(String id) {
		AggregationModeRef result = new AggregationModeRef();
		result.setID(id);
		return result;
	}

	@Override
	public String toString() {
		return getID();
	}
	

}