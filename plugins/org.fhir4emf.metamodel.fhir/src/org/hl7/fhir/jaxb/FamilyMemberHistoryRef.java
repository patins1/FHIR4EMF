package org.hl7.fhir.jaxb;

import javax.xml.bind.annotation.*;
import org.eclipse.emf.ecore.jaxb.*;

import org.hl7.fhir.FamilyMemberHistory;
import org.hl7.fhir.FhirFactory;

@XmlRootElement(name = "FamilyMemberHistoryRefElement")
public class FamilyMemberHistoryRef extends org.hl7.fhir.jaxb.DomainResourceRef  {

	

	
	@Override
	public FamilyMemberHistory createInstance() {
		return FhirFactory.eINSTANCE.createFamilyMemberHistory();
	}
	
	public static FamilyMemberHistoryRef valueOf(String id) {
		FamilyMemberHistoryRef result = new FamilyMemberHistoryRef();
		result.setID(id);
		return result;
	}

	@Override
	public String toString() {
		return getID();
	}
	

}