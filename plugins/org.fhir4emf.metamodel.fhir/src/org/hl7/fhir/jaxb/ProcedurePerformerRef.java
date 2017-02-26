package org.hl7.fhir.jaxb;

import javax.xml.bind.annotation.*;
import org.eclipse.emf.ecore.jaxb.*;

import org.hl7.fhir.FhirFactory;
import org.hl7.fhir.ProcedurePerformer;

@XmlRootElement(name = "ProcedurePerformerRefElement")
public class ProcedurePerformerRef extends org.hl7.fhir.jaxb.BackboneElementRef  {

	

	
	@Override
	public ProcedurePerformer createInstance() {
		return FhirFactory.eINSTANCE.createProcedurePerformer();
	}
	
	public static ProcedurePerformerRef valueOf(String id) {
		ProcedurePerformerRef result = new ProcedurePerformerRef();
		result.setID(id);
		return result;
	}

	@Override
	public String toString() {
		return getID();
	}
	

}