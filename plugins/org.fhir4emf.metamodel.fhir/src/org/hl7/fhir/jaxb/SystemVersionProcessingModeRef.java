package org.hl7.fhir.jaxb;

import javax.xml.bind.annotation.*;
import org.eclipse.emf.ecore.jaxb.*;

import org.hl7.fhir.FhirFactory;
import org.hl7.fhir.SystemVersionProcessingMode;

@XmlRootElement(name = "SystemVersionProcessingModeRefElement")
public class SystemVersionProcessingModeRef extends org.hl7.fhir.jaxb.ElementRef  {

	

	
	@Override
	public SystemVersionProcessingMode createInstance() {
		return FhirFactory.eINSTANCE.createSystemVersionProcessingMode();
	}
	
	public static SystemVersionProcessingModeRef valueOf(String id) {
		SystemVersionProcessingModeRef result = new SystemVersionProcessingModeRef();
		result.setID(id);
		return result;
	}

	@Override
	public String toString() {
		return getID();
	}
	

}