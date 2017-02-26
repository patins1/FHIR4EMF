package org.hl7.fhir.jaxb;

import javax.xml.bind.annotation.*;
import org.eclipse.emf.ecore.jaxb.*;

import org.hl7.fhir.FhirFactory;
import org.hl7.fhir.VisionPrescriptionDispense;

@XmlRootElement(name = "VisionPrescriptionDispenseRefElement")
public class VisionPrescriptionDispenseRef extends org.hl7.fhir.jaxb.BackboneElementRef  {

	

	
	@Override
	public VisionPrescriptionDispense createInstance() {
		return FhirFactory.eINSTANCE.createVisionPrescriptionDispense();
	}
	
	public static VisionPrescriptionDispenseRef valueOf(String id) {
		VisionPrescriptionDispenseRef result = new VisionPrescriptionDispenseRef();
		result.setID(id);
		return result;
	}

	@Override
	public String toString() {
		return getID();
	}
	

}