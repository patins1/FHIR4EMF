package org.hl7.fhir.jaxb;

import javax.xml.bind.annotation.*;
import org.eclipse.emf.ecore.jaxb.*;

import org.hl7.fhir.FhirFactory;
import org.hl7.fhir.MeasureDataUsage;

@XmlRootElement(name = "MeasureDataUsageRefElement")
public class MeasureDataUsageRef extends org.hl7.fhir.jaxb.ElementRef  {

	

	
	@Override
	public MeasureDataUsage createInstance() {
		return FhirFactory.eINSTANCE.createMeasureDataUsage();
	}
	
	public static MeasureDataUsageRef valueOf(String id) {
		MeasureDataUsageRef result = new MeasureDataUsageRef();
		result.setID(id);
		return result;
	}

	@Override
	public String toString() {
		return getID();
	}
	

}