package org.hl7.fhir.jaxb;

import javax.xml.bind.annotation.*;
import org.eclipse.emf.ecore.jaxb.*;

import org.hl7.fhir.FhirFactory;
import org.hl7.fhir.Organization;

@XmlRootElement(name = "OrganizationRefElement")
public class OrganizationRef extends org.hl7.fhir.jaxb.DomainResourceRef  {

	

	
	@Override
	public Organization createInstance() {
		return FhirFactory.eINSTANCE.createOrganization();
	}
	
	public static OrganizationRef valueOf(String id) {
		OrganizationRef result = new OrganizationRef();
		result.setID(id);
		return result;
	}

	@Override
	public String toString() {
		return getID();
	}
	

}