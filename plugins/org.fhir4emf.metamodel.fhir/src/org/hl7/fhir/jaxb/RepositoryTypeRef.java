package org.hl7.fhir.jaxb;

import javax.xml.bind.annotation.*;
import org.eclipse.emf.ecore.jaxb.*;

import org.hl7.fhir.FhirFactory;
import org.hl7.fhir.RepositoryType;

@XmlRootElement(name = "RepositoryTypeRefElement")
public class RepositoryTypeRef extends org.hl7.fhir.jaxb.ElementRef  {

	

	
	@Override
	public RepositoryType createInstance() {
		return FhirFactory.eINSTANCE.createRepositoryType();
	}
	
	public static RepositoryTypeRef valueOf(String id) {
		RepositoryTypeRef result = new RepositoryTypeRef();
		result.setID(id);
		return result;
	}

	@Override
	public String toString() {
		return getID();
	}
	

}