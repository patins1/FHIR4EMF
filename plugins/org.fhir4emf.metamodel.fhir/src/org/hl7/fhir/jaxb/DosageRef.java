package org.hl7.fhir.jaxb;

import javax.xml.bind.annotation.*;
import org.eclipse.emf.ecore.jaxb.*;

import org.hl7.fhir.Dosage;
import org.hl7.fhir.FhirFactory;

@XmlRootElement(name = "DosageRefElement")
public class DosageRef extends org.hl7.fhir.jaxb.ElementRef  {

	

	
	@Override
	public Dosage createInstance() {
		return FhirFactory.eINSTANCE.createDosage();
	}
	
	public static DosageRef valueOf(String id) {
		DosageRef result = new DosageRef();
		result.setID(id);
		return result;
	}

	@Override
	public String toString() {
		return getID();
	}
	

}