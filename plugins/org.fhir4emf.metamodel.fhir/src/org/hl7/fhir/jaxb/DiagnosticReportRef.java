package org.hl7.fhir.jaxb;

import javax.xml.bind.annotation.*;
import org.eclipse.emf.ecore.jaxb.*;

import org.hl7.fhir.DiagnosticReport;
import org.hl7.fhir.FhirFactory;

@XmlRootElement(name = "DiagnosticReportRefElement")
public class DiagnosticReportRef extends org.hl7.fhir.jaxb.DomainResourceRef  {

	

	
	@Override
	public DiagnosticReport createInstance() {
		return FhirFactory.eINSTANCE.createDiagnosticReport();
	}
	
	public static DiagnosticReportRef valueOf(String id) {
		DiagnosticReportRef result = new DiagnosticReportRef();
		result.setID(id);
		return result;
	}

	@Override
	public String toString() {
		return getID();
	}
	

}