package org.hl7.fhir.jaxb;

import javax.xml.bind.annotation.*;
import org.eclipse.emf.ecore.jaxb.*;

import org.hl7.fhir.FhirFactory;
import org.hl7.fhir.MeasureType;

@XmlRootElement(name = "MeasureTypeRefElement")
public class MeasureTypeRef extends org.hl7.fhir.jaxb.ElementRef  {

	

	
	@Override
	public MeasureType createInstance() {
		return FhirFactory.eINSTANCE.createMeasureType();
	}
	
	public static MeasureTypeRef valueOf(String id) {
		MeasureTypeRef result = new MeasureTypeRef();
		result.setID(id);
		return result;
	}

	@Override
	public String toString() {
		return getID();
	}
	

}