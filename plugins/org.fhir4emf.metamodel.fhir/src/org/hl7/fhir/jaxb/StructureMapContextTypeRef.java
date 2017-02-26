package org.hl7.fhir.jaxb;

import javax.xml.bind.annotation.*;
import org.eclipse.emf.ecore.jaxb.*;

import org.hl7.fhir.FhirFactory;
import org.hl7.fhir.StructureMapContextType;

@XmlRootElement(name = "StructureMapContextTypeRefElement")
public class StructureMapContextTypeRef extends org.hl7.fhir.jaxb.ElementRef  {

	

	
	@Override
	public StructureMapContextType createInstance() {
		return FhirFactory.eINSTANCE.createStructureMapContextType();
	}
	
	public static StructureMapContextTypeRef valueOf(String id) {
		StructureMapContextTypeRef result = new StructureMapContextTypeRef();
		result.setID(id);
		return result;
	}

	@Override
	public String toString() {
		return getID();
	}
	

}