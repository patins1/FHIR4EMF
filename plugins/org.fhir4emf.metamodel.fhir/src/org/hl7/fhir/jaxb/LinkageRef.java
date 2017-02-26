package org.hl7.fhir.jaxb;

import javax.xml.bind.annotation.*;
import org.eclipse.emf.ecore.jaxb.*;

import org.hl7.fhir.FhirFactory;
import org.hl7.fhir.Linkage;

@XmlRootElement(name = "LinkageRefElement")
public class LinkageRef extends org.hl7.fhir.jaxb.DomainResourceRef  {

	

	
	@Override
	public Linkage createInstance() {
		return FhirFactory.eINSTANCE.createLinkage();
	}
	
	public static LinkageRef valueOf(String id) {
		LinkageRef result = new LinkageRef();
		result.setID(id);
		return result;
	}

	@Override
	public String toString() {
		return getID();
	}
	

}