package org.hl7.fhir.jaxb;

import javax.xml.bind.annotation.*;
import org.eclipse.emf.ecore.jaxb.*;

import org.hl7.fhir.FhirFactory;
import org.hl7.fhir.VisionPrescription;

@XmlRootElement(name = "VisionPrescriptionRefElement")
public class VisionPrescriptionRef extends org.hl7.fhir.jaxb.DomainResourceRef  {

	

	
	@Override
	public VisionPrescription createInstance() {
		return FhirFactory.eINSTANCE.createVisionPrescription();
	}
	
	public static VisionPrescriptionRef valueOf(String id) {
		VisionPrescriptionRef result = new VisionPrescriptionRef();
		result.setID(id);
		return result;
	}

	@Override
	public String toString() {
		return getID();
	}
	

}