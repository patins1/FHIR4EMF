package org.hl7.fhir.jaxb;

import javax.xml.bind.annotation.*;
import org.eclipse.emf.ecore.jaxb.*;

import org.hl7.fhir.DiagnosticReportPerformer;
import org.hl7.fhir.FhirFactory;

@XmlRootElement(name = "DiagnosticReportPerformerRefElement")
public class DiagnosticReportPerformerRef extends org.hl7.fhir.jaxb.BackboneElementRef  {

	

	
	@Override
	public DiagnosticReportPerformer createInstance() {
		return FhirFactory.eINSTANCE.createDiagnosticReportPerformer();
	}
	
	public static DiagnosticReportPerformerRef valueOf(String id) {
		DiagnosticReportPerformerRef result = new DiagnosticReportPerformerRef();
		result.setID(id);
		return result;
	}

	@Override
	public String toString() {
		return getID();
	}
	

}