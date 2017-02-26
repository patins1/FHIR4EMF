package org.hl7.fhir.jaxb;

import javax.xml.bind.annotation.*;
import org.eclipse.emf.ecore.jaxb.*;

import org.hl7.fhir.ExpansionProfileDesignation1;
import org.hl7.fhir.FhirFactory;

@XmlRootElement(name = "ExpansionProfileDesignation1RefElement")
public class ExpansionProfileDesignation1Ref extends org.hl7.fhir.jaxb.BackboneElementRef  {

	

	
	@Override
	public ExpansionProfileDesignation1 createInstance() {
		return FhirFactory.eINSTANCE.createExpansionProfileDesignation1();
	}
	
	public static ExpansionProfileDesignation1Ref valueOf(String id) {
		ExpansionProfileDesignation1Ref result = new ExpansionProfileDesignation1Ref();
		result.setID(id);
		return result;
	}

	@Override
	public String toString() {
		return getID();
	}
	

}