package org.hl7.fhir.jaxb;

import javax.xml.bind.annotation.*;
import org.eclipse.emf.ecore.jaxb.*;

import org.hl7.fhir.FhirFactory;
import org.hl7.fhir.ProcedureStatus;

@XmlRootElement(name = "ProcedureStatusRefElement")
public class ProcedureStatusRef extends org.hl7.fhir.jaxb.ElementRef  {

	

	
	@Override
	public ProcedureStatus createInstance() {
		return FhirFactory.eINSTANCE.createProcedureStatus();
	}
	
	public static ProcedureStatusRef valueOf(String id) {
		ProcedureStatusRef result = new ProcedureStatusRef();
		result.setID(id);
		return result;
	}

	@Override
	public String toString() {
		return getID();
	}
	

}