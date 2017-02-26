package org.hl7.fhir.jaxb;

import javax.xml.bind.annotation.*;
import org.eclipse.emf.ecore.jaxb.*;

import org.hl7.fhir.DiagnosticReportImage;
import org.hl7.fhir.FhirFactory;

@XmlRootElement(name = "DiagnosticReportImageRefElement")
public class DiagnosticReportImageRef extends org.hl7.fhir.jaxb.BackboneElementRef  {

	

	
	@Override
	public DiagnosticReportImage createInstance() {
		return FhirFactory.eINSTANCE.createDiagnosticReportImage();
	}
	
	public static DiagnosticReportImageRef valueOf(String id) {
		DiagnosticReportImageRef result = new DiagnosticReportImageRef();
		result.setID(id);
		return result;
	}

	@Override
	public String toString() {
		return getID();
	}
	

}