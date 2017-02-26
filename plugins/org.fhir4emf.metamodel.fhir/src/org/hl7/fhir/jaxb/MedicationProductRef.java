package org.hl7.fhir.jaxb;

import javax.xml.bind.annotation.*;
import org.eclipse.emf.ecore.jaxb.*;

import org.hl7.fhir.FhirFactory;
import org.hl7.fhir.MedicationProduct;

@XmlRootElement(name = "MedicationProductRefElement")
public class MedicationProductRef extends org.hl7.fhir.jaxb.BackboneElementRef  {

	

	
	@Override
	public MedicationProduct createInstance() {
		return FhirFactory.eINSTANCE.createMedicationProduct();
	}
	
	public static MedicationProductRef valueOf(String id) {
		MedicationProductRef result = new MedicationProductRef();
		result.setID(id);
		return result;
	}

	@Override
	public String toString() {
		return getID();
	}
	

}