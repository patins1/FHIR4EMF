package org.hl7.fhir.jaxb;

import javax.xml.bind.annotation.*;
import org.eclipse.emf.ecore.jaxb.*;

import org.hl7.fhir.FhirFactory;
import org.hl7.fhir.MeasureGroup;

@XmlRootElement(name = "MeasureGroupRefElement")
public class MeasureGroupRef extends org.hl7.fhir.jaxb.BackboneElementRef  {

	

	
	@Override
	public MeasureGroup createInstance() {
		return FhirFactory.eINSTANCE.createMeasureGroup();
	}
	
	public static MeasureGroupRef valueOf(String id) {
		MeasureGroupRef result = new MeasureGroupRef();
		result.setID(id);
		return result;
	}

	@Override
	public String toString() {
		return getID();
	}
	

}