package org.hl7.fhir.jaxb;

import javax.xml.bind.annotation.*;
import org.eclipse.emf.ecore.jaxb.*;

import org.hl7.fhir.FhirFactory;
import org.hl7.fhir.OperationKind;

@XmlRootElement(name = "OperationKindRefElement")
public class OperationKindRef extends org.hl7.fhir.jaxb.ElementRef  {

	

	
	@Override
	public OperationKind createInstance() {
		return FhirFactory.eINSTANCE.createOperationKind();
	}
	
	public static OperationKindRef valueOf(String id) {
		OperationKindRef result = new OperationKindRef();
		result.setID(id);
		return result;
	}

	@Override
	public String toString() {
		return getID();
	}
	

}