package org.hl7.fhir.jaxb;

import javax.xml.bind.annotation.*;
import org.eclipse.emf.ecore.jaxb.*;

import org.hl7.fhir.FhirFactory;
import org.hl7.fhir.StructureMapInput;

@XmlRootElement(name = "StructureMapInputRefElement")
public class StructureMapInputRef extends org.hl7.fhir.jaxb.BackboneElementRef  {

	

	
	@Override
	public StructureMapInput createInstance() {
		return FhirFactory.eINSTANCE.createStructureMapInput();
	}
	
	public static StructureMapInputRef valueOf(String id) {
		StructureMapInputRef result = new StructureMapInputRef();
		result.setID(id);
		return result;
	}

	@Override
	public String toString() {
		return getID();
	}
	

}