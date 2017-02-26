package org.hl7.fhir.jaxb;

import javax.xml.bind.annotation.*;
import org.eclipse.emf.ecore.jaxb.*;

import org.hl7.fhir.FhirFactory;
import org.hl7.fhir.ProcedureRequestRequester;

@XmlRootElement(name = "ProcedureRequestRequesterRefElement")
public class ProcedureRequestRequesterRef extends org.hl7.fhir.jaxb.BackboneElementRef  {

	

	
	@Override
	public ProcedureRequestRequester createInstance() {
		return FhirFactory.eINSTANCE.createProcedureRequestRequester();
	}
	
	public static ProcedureRequestRequesterRef valueOf(String id) {
		ProcedureRequestRequesterRef result = new ProcedureRequestRequesterRef();
		result.setID(id);
		return result;
	}

	@Override
	public String toString() {
		return getID();
	}
	

}