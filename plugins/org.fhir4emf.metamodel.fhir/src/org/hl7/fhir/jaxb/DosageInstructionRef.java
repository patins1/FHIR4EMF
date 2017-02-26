package org.hl7.fhir.jaxb;

import javax.xml.bind.annotation.*;
import org.eclipse.emf.ecore.jaxb.*;

import org.hl7.fhir.DosageInstruction;
import org.hl7.fhir.FhirFactory;

@XmlRootElement(name = "DosageInstructionRefElement")
public class DosageInstructionRef extends org.hl7.fhir.jaxb.ElementRef  {

	

	
	@Override
	public DosageInstruction createInstance() {
		return FhirFactory.eINSTANCE.createDosageInstruction();
	}
	
	public static DosageInstructionRef valueOf(String id) {
		DosageInstructionRef result = new DosageInstructionRef();
		result.setID(id);
		return result;
	}

	@Override
	public String toString() {
		return getID();
	}
	

}