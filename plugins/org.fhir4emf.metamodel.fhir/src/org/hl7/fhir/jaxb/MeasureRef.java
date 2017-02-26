package org.hl7.fhir.jaxb;

import javax.xml.bind.annotation.*;
import org.eclipse.emf.ecore.jaxb.*;

import org.hl7.fhir.FhirFactory;
import org.hl7.fhir.Measure;

@XmlRootElement(name = "MeasureRefElement")
public class MeasureRef extends org.hl7.fhir.jaxb.DomainResourceRef  {

	

	
	@Override
	public Measure createInstance() {
		return FhirFactory.eINSTANCE.createMeasure();
	}
	
	public static MeasureRef valueOf(String id) {
		MeasureRef result = new MeasureRef();
		result.setID(id);
		return result;
	}

	@Override
	public String toString() {
		return getID();
	}
	

}