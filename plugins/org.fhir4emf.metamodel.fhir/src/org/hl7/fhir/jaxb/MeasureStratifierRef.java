package org.hl7.fhir.jaxb;

import javax.xml.bind.annotation.*;
import org.eclipse.emf.ecore.jaxb.*;

import org.hl7.fhir.FhirFactory;
import org.hl7.fhir.MeasureStratifier;

@XmlRootElement(name = "MeasureStratifierRefElement")
public class MeasureStratifierRef extends org.hl7.fhir.jaxb.BackboneElementRef  {

	

	
	@Override
	public MeasureStratifier createInstance() {
		return FhirFactory.eINSTANCE.createMeasureStratifier();
	}
	
	public static MeasureStratifierRef valueOf(String id) {
		MeasureStratifierRef result = new MeasureStratifierRef();
		result.setID(id);
		return result;
	}

	@Override
	public String toString() {
		return getID();
	}
	

}