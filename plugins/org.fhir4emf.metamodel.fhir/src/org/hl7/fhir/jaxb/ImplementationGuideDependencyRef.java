package org.hl7.fhir.jaxb;

import javax.xml.bind.annotation.*;
import org.eclipse.emf.ecore.jaxb.*;

import org.hl7.fhir.FhirFactory;
import org.hl7.fhir.ImplementationGuideDependency;

@XmlRootElement(name = "ImplementationGuideDependencyRefElement")
public class ImplementationGuideDependencyRef extends org.hl7.fhir.jaxb.BackboneElementRef  {

	

	
	@Override
	public ImplementationGuideDependency createInstance() {
		return FhirFactory.eINSTANCE.createImplementationGuideDependency();
	}
	
	public static ImplementationGuideDependencyRef valueOf(String id) {
		ImplementationGuideDependencyRef result = new ImplementationGuideDependencyRef();
		result.setID(id);
		return result;
	}

	@Override
	public String toString() {
		return getID();
	}
	

}