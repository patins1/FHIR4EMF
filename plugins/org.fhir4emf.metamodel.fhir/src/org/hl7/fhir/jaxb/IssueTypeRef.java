package org.hl7.fhir.jaxb;

import javax.xml.bind.annotation.*;
import org.eclipse.emf.ecore.jaxb.*;

import org.hl7.fhir.FhirFactory;
import org.hl7.fhir.IssueType;

@XmlRootElement(name = "IssueTypeRefElement")
public class IssueTypeRef extends org.hl7.fhir.jaxb.ElementRef  {

	

	
	@Override
	public IssueType createInstance() {
		return FhirFactory.eINSTANCE.createIssueType();
	}
	
	public static IssueTypeRef valueOf(String id) {
		IssueTypeRef result = new IssueTypeRef();
		result.setID(id);
		return result;
	}

	@Override
	public String toString() {
		return getID();
	}
	

}