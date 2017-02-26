package org.hl7.fhir.jaxb;

import javax.xml.bind.annotation.*;
import org.eclipse.emf.ecore.jaxb.*;

import org.hl7.fhir.ExpansionProfileDesignation2;
import org.hl7.fhir.FhirFactory;

@XmlRootElement(name = "ExpansionProfileDesignation2RefElement")
public class ExpansionProfileDesignation2Ref extends org.hl7.fhir.jaxb.BackboneElementRef  {

	

	
	@Override
	public ExpansionProfileDesignation2 createInstance() {
		return FhirFactory.eINSTANCE.createExpansionProfileDesignation2();
	}
	
	public static ExpansionProfileDesignation2Ref valueOf(String id) {
		ExpansionProfileDesignation2Ref result = new ExpansionProfileDesignation2Ref();
		result.setID(id);
		return result;
	}

	@Override
	public String toString() {
		return getID();
	}
	

}