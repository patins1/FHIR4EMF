package org.hl7.fhir.jaxb;

import javax.xml.bind.annotation.*;
import org.eclipse.emf.ecore.jaxb.*;

import org.hl7.fhir.FhirFactory;
import org.hl7.fhir.OperationParameterUse;

@XmlRootElement(name = "OperationParameterUseRefElement")
public class OperationParameterUseRef extends org.hl7.fhir.jaxb.ElementRef  {

	

	
	@Override
	public OperationParameterUse createInstance() {
		return FhirFactory.eINSTANCE.createOperationParameterUse();
	}
	
	public static OperationParameterUseRef valueOf(String id) {
		OperationParameterUseRef result = new OperationParameterUseRef();
		result.setID(id);
		return result;
	}

	@Override
	public String toString() {
		return getID();
	}
	

}