package org.hl7.fhir.jaxb;

import javax.xml.bind.annotation.*;
import org.eclipse.emf.ecore.jaxb.*;

import org.hl7.fhir.ExpansionProfileDesignation;
import org.hl7.fhir.FhirFactory;

@XmlRootElement(name = "ExpansionProfileDesignationRefElement")
public class ExpansionProfileDesignationRef extends org.hl7.fhir.jaxb.BackboneElementRef  {

	

	
	@Override
	public ExpansionProfileDesignation createInstance() {
		return FhirFactory.eINSTANCE.createExpansionProfileDesignation();
	}
	
	public static ExpansionProfileDesignationRef valueOf(String id) {
		ExpansionProfileDesignationRef result = new ExpansionProfileDesignationRef();
		result.setID(id);
		return result;
	}

	@Override
	public String toString() {
		return getID();
	}
	

}