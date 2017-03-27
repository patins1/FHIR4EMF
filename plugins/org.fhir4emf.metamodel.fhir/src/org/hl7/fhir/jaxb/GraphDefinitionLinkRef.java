package org.hl7.fhir.jaxb;

import javax.xml.bind.annotation.*;
import org.eclipse.emf.ecore.jaxb.*;

import org.hl7.fhir.FhirFactory;
import org.hl7.fhir.GraphDefinitionLink;

@XmlRootElement(name = "GraphDefinitionLinkRefElement")
public class GraphDefinitionLinkRef extends org.hl7.fhir.jaxb.BackboneElementRef  {

	

	
	@Override
	public GraphDefinitionLink createInstance() {
		return FhirFactory.eINSTANCE.createGraphDefinitionLink();
	}
	
	public static GraphDefinitionLinkRef valueOf(String id) {
		GraphDefinitionLinkRef result = new GraphDefinitionLinkRef();
		result.setID(id);
		return result;
	}

	@Override
	public String toString() {
		return getID();
	}
	

}