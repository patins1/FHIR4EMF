package org.hl7.fhir.jaxb;

import javax.xml.bind.annotation.*;
import org.eclipse.emf.ecore.jaxb.*;

import org.hl7.fhir.FhirFactory;
import org.hl7.fhir.OrganizationContact;

@XmlRootElement(name = "OrganizationContactRefElement")
public class OrganizationContactRef extends org.hl7.fhir.jaxb.BackboneElementRef  {

	

	
	@Override
	public OrganizationContact createInstance() {
		return FhirFactory.eINSTANCE.createOrganizationContact();
	}
	
	public static OrganizationContactRef valueOf(String id) {
		OrganizationContactRef result = new OrganizationContactRef();
		result.setID(id);
		return result;
	}

	@Override
	public String toString() {
		return getID();
	}
	

}