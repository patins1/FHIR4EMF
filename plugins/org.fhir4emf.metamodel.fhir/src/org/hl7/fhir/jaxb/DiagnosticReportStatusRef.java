package org.hl7.fhir.jaxb;

import javax.xml.bind.annotation.*;
import org.eclipse.emf.ecore.jaxb.*;

import org.hl7.fhir.DiagnosticReportStatus;
import org.hl7.fhir.FhirFactory;

@XmlRootElement(name = "DiagnosticReportStatusRefElement")
public class DiagnosticReportStatusRef extends org.hl7.fhir.jaxb.ElementRef  {

	

	
	@Override
	public DiagnosticReportStatus createInstance() {
		return FhirFactory.eINSTANCE.createDiagnosticReportStatus();
	}
	
	public static DiagnosticReportStatusRef valueOf(String id) {
		DiagnosticReportStatusRef result = new DiagnosticReportStatusRef();
		result.setID(id);
		return result;
	}

	@Override
	public String toString() {
		return getID();
	}
	

}