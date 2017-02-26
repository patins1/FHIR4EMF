package org.hl7.fhir.jaxb;

import javax.xml.bind.annotation.*;
import org.eclipse.emf.ecore.jaxb.*;

import org.hl7.fhir.CoverageGrouping;
import org.hl7.fhir.FhirFactory;

@XmlRootElement(name = "CoverageGroupingRefElement")
public class CoverageGroupingRef extends org.hl7.fhir.jaxb.BackboneElementRef  {

	

	
	@Override
	public CoverageGrouping createInstance() {
		return FhirFactory.eINSTANCE.createCoverageGrouping();
	}
	
	public static CoverageGroupingRef valueOf(String id) {
		CoverageGroupingRef result = new CoverageGroupingRef();
		result.setID(id);
		return result;
	}

	@Override
	public String toString() {
		return getID();
	}
	

}