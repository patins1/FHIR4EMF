package org.hl7.fhir.jaxb;

import javax.xml.bind.annotation.*;
import org.eclipse.emf.ecore.jaxb.*;

import org.hl7.fhir.FhirFactory;
import org.hl7.fhir.MeasureSupplementalData;

@XmlRootElement(name = "MeasureSupplementalDataRefElement")
public class MeasureSupplementalDataRef extends org.hl7.fhir.jaxb.BackboneElementRef  {

	

	
	@Override
	public MeasureSupplementalData createInstance() {
		return FhirFactory.eINSTANCE.createMeasureSupplementalData();
	}
	
	public static MeasureSupplementalDataRef valueOf(String id) {
		MeasureSupplementalDataRef result = new MeasureSupplementalDataRef();
		result.setID(id);
		return result;
	}

	@Override
	public String toString() {
		return getID();
	}
	

}