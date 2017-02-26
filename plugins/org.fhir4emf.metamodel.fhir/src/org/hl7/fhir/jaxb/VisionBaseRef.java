package org.hl7.fhir.jaxb;

import javax.xml.bind.annotation.*;
import org.eclipse.emf.ecore.jaxb.*;

import org.hl7.fhir.FhirFactory;
import org.hl7.fhir.VisionBase;

@XmlRootElement(name = "VisionBaseRefElement")
public class VisionBaseRef extends org.hl7.fhir.jaxb.ElementRef  {

	

	
	@Override
	public VisionBase createInstance() {
		return FhirFactory.eINSTANCE.createVisionBase();
	}
	
	public static VisionBaseRef valueOf(String id) {
		VisionBaseRef result = new VisionBaseRef();
		result.setID(id);
		return result;
	}

	@Override
	public String toString() {
		return getID();
	}
	

}