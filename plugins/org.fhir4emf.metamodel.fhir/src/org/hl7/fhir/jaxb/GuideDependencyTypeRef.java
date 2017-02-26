package org.hl7.fhir.jaxb;

import javax.xml.bind.annotation.*;
import org.eclipse.emf.ecore.jaxb.*;

import org.hl7.fhir.FhirFactory;
import org.hl7.fhir.GuideDependencyType;

@XmlRootElement(name = "GuideDependencyTypeRefElement")
public class GuideDependencyTypeRef extends org.hl7.fhir.jaxb.ElementRef  {

	

	
	@Override
	public GuideDependencyType createInstance() {
		return FhirFactory.eINSTANCE.createGuideDependencyType();
	}
	
	public static GuideDependencyTypeRef valueOf(String id) {
		GuideDependencyTypeRef result = new GuideDependencyTypeRef();
		result.setID(id);
		return result;
	}

	@Override
	public String toString() {
		return getID();
	}
	

}