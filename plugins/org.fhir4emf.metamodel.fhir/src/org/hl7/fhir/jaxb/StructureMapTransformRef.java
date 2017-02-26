package org.hl7.fhir.jaxb;

import javax.xml.bind.annotation.*;
import org.eclipse.emf.ecore.jaxb.*;

import org.hl7.fhir.FhirFactory;
import org.hl7.fhir.StructureMapTransform;

@XmlRootElement(name = "StructureMapTransformRefElement")
public class StructureMapTransformRef extends org.hl7.fhir.jaxb.ElementRef  {

	

	
	@Override
	public StructureMapTransform createInstance() {
		return FhirFactory.eINSTANCE.createStructureMapTransform();
	}
	
	public static StructureMapTransformRef valueOf(String id) {
		StructureMapTransformRef result = new StructureMapTransformRef();
		result.setID(id);
		return result;
	}

	@Override
	public String toString() {
		return getID();
	}
	

}