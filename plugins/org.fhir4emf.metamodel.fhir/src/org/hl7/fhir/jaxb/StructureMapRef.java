package org.hl7.fhir.jaxb;

import javax.xml.bind.annotation.*;
import org.eclipse.emf.ecore.jaxb.*;

import org.hl7.fhir.FhirFactory;
import org.hl7.fhir.StructureMap;

@XmlRootElement(name = "StructureMapRefElement")
public class StructureMapRef extends org.hl7.fhir.jaxb.DomainResourceRef  {

	

	
	@Override
	public StructureMap createInstance() {
		return FhirFactory.eINSTANCE.createStructureMap();
	}
	
	public static StructureMapRef valueOf(String id) {
		StructureMapRef result = new StructureMapRef();
		result.setID(id);
		return result;
	}

	@Override
	public String toString() {
		return getID();
	}
	

}