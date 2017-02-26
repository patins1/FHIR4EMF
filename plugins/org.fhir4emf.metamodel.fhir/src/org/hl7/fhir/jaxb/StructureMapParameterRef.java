package org.hl7.fhir.jaxb;

import javax.xml.bind.annotation.*;
import org.eclipse.emf.ecore.jaxb.*;

import org.hl7.fhir.FhirFactory;
import org.hl7.fhir.StructureMapParameter;

@XmlRootElement(name = "StructureMapParameterRefElement")
public class StructureMapParameterRef extends org.hl7.fhir.jaxb.BackboneElementRef  {

	

	
	@Override
	public StructureMapParameter createInstance() {
		return FhirFactory.eINSTANCE.createStructureMapParameter();
	}
	
	public static StructureMapParameterRef valueOf(String id) {
		StructureMapParameterRef result = new StructureMapParameterRef();
		result.setID(id);
		return result;
	}

	@Override
	public String toString() {
		return getID();
	}
	

}