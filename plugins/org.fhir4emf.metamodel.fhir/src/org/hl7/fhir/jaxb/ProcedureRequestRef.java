package org.hl7.fhir.jaxb;

import javax.xml.bind.annotation.*;
import org.eclipse.emf.ecore.jaxb.*;

import org.hl7.fhir.FhirFactory;
import org.hl7.fhir.ProcedureRequest;

@XmlRootElement(name = "ProcedureRequestRefElement")
public class ProcedureRequestRef extends org.hl7.fhir.jaxb.DomainResourceRef  {

	

	
	@Override
	public ProcedureRequest createInstance() {
		return FhirFactory.eINSTANCE.createProcedureRequest();
	}
	
	public static ProcedureRequestRef valueOf(String id) {
		ProcedureRequestRef result = new ProcedureRequestRef();
		result.setID(id);
		return result;
	}

	@Override
	public String toString() {
		return getID();
	}
	

}