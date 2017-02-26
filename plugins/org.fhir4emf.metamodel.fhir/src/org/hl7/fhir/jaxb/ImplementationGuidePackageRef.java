package org.hl7.fhir.jaxb;

import javax.xml.bind.annotation.*;
import org.eclipse.emf.ecore.jaxb.*;

import org.hl7.fhir.FhirFactory;
import org.hl7.fhir.ImplementationGuidePackage;

@XmlRootElement(name = "ImplementationGuidePackageRefElement")
public class ImplementationGuidePackageRef extends org.hl7.fhir.jaxb.BackboneElementRef  {

	

	
	@Override
	public ImplementationGuidePackage createInstance() {
		return FhirFactory.eINSTANCE.createImplementationGuidePackage();
	}
	
	public static ImplementationGuidePackageRef valueOf(String id) {
		ImplementationGuidePackageRef result = new ImplementationGuidePackageRef();
		result.setID(id);
		return result;
	}

	@Override
	public String toString() {
		return getID();
	}
	

}