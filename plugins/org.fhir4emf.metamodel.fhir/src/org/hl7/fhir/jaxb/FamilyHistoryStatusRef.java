package org.hl7.fhir.jaxb;

import javax.xml.bind.annotation.*;
import org.eclipse.emf.ecore.jaxb.*;

import org.hl7.fhir.FamilyHistoryStatus;
import org.hl7.fhir.FhirFactory;

@XmlRootElement(name = "FamilyHistoryStatusRefElement")
public class FamilyHistoryStatusRef extends org.hl7.fhir.jaxb.ElementRef  {

	

	
	@Override
	public FamilyHistoryStatus createInstance() {
		return FhirFactory.eINSTANCE.createFamilyHistoryStatus();
	}
	
	public static FamilyHistoryStatusRef valueOf(String id) {
		FamilyHistoryStatusRef result = new FamilyHistoryStatusRef();
		result.setID(id);
		return result;
	}

	@Override
	public String toString() {
		return getID();
	}
	

}