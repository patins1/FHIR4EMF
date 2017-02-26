package org.hl7.fhir.jaxb;

import javax.xml.bind.annotation.*;
import org.eclipse.emf.ecore.jaxb.*;

import org.hl7.fhir.FhirFactory;
import org.hl7.fhir.ProcedureFocalDevice;

@XmlRootElement(name = "ProcedureFocalDeviceRefElement")
public class ProcedureFocalDeviceRef extends org.hl7.fhir.jaxb.BackboneElementRef  {

	

	
	@Override
	public ProcedureFocalDevice createInstance() {
		return FhirFactory.eINSTANCE.createProcedureFocalDevice();
	}
	
	public static ProcedureFocalDeviceRef valueOf(String id) {
		ProcedureFocalDeviceRef result = new ProcedureFocalDeviceRef();
		result.setID(id);
		return result;
	}

	@Override
	public String toString() {
		return getID();
	}
	

}