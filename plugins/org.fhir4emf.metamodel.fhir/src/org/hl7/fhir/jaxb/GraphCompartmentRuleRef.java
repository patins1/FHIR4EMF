package org.hl7.fhir.jaxb;

import javax.xml.bind.annotation.*;
import org.eclipse.emf.ecore.jaxb.*;

import org.hl7.fhir.FhirFactory;
import org.hl7.fhir.GraphCompartmentRule;

@XmlRootElement(name = "GraphCompartmentRuleRefElement")
public class GraphCompartmentRuleRef extends org.hl7.fhir.jaxb.ElementRef  {

	

	
	@Override
	public GraphCompartmentRule createInstance() {
		return FhirFactory.eINSTANCE.createGraphCompartmentRule();
	}
	
	public static GraphCompartmentRuleRef valueOf(String id) {
		GraphCompartmentRuleRef result = new GraphCompartmentRuleRef();
		result.setID(id);
		return result;
	}

	@Override
	public String toString() {
		return getID();
	}
	

}