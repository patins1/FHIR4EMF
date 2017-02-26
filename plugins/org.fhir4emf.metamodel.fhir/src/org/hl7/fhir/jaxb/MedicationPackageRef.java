package org.hl7.fhir.jaxb;

import javax.xml.bind.annotation.*;
import org.eclipse.emf.ecore.jaxb.*;

import org.hl7.fhir.FhirFactory;
import org.hl7.fhir.MedicationPackage;

@XmlRootElement(name = "MedicationPackageRefElement")
public class MedicationPackageRef extends org.hl7.fhir.jaxb.BackboneElementRef  {

	

	
	@Override
	public MedicationPackage createInstance() {
		return FhirFactory.eINSTANCE.createMedicationPackage();
	}
	
	public static MedicationPackageRef valueOf(String id) {
		MedicationPackageRef result = new MedicationPackageRef();
		result.setID(id);
		return result;
	}

	@Override
	public String toString() {
		return getID();
	}
	

}