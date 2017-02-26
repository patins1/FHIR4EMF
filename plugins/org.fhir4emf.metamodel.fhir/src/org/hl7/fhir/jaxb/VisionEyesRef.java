package org.hl7.fhir.jaxb;

import javax.xml.bind.annotation.*;
import org.eclipse.emf.ecore.jaxb.*;

import org.hl7.fhir.FhirFactory;
import org.hl7.fhir.VisionEyes;

@XmlRootElement(name = "VisionEyesRefElement")
public class VisionEyesRef extends org.hl7.fhir.jaxb.ElementRef  {

	

	
	@Override
	public VisionEyes createInstance() {
		return FhirFactory.eINSTANCE.createVisionEyes();
	}
	
	public static VisionEyesRef valueOf(String id) {
		VisionEyesRef result = new VisionEyesRef();
		result.setID(id);
		return result;
	}

	@Override
	public String toString() {
		return getID();
	}
	

}