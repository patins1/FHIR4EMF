package org.hl7.fhir.jaxb;

import javax.xml.bind.annotation.*;
import org.eclipse.emf.ecore.jaxb.*;

import org.hl7.fhir.Coverage;
import org.hl7.fhir.FhirFactory;

@XmlRootElement(name = "CoverageRefElement")
public class CoverageRef extends org.hl7.fhir.jaxb.DomainResourceRef  {

	

	
	@Override
	public Coverage createInstance() {
		return FhirFactory.eINSTANCE.createCoverage();
	}
	
	public static CoverageRef valueOf(String id) {
		CoverageRef result = new CoverageRef();
		result.setID(id);
		return result;
	}

	@Override
	public String toString() {
		return getID();
	}
	

}