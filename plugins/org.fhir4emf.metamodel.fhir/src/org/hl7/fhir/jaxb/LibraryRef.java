package org.hl7.fhir.jaxb;

import javax.xml.bind.annotation.*;
import org.eclipse.emf.ecore.jaxb.*;

import org.hl7.fhir.FhirFactory;
import org.hl7.fhir.Library;

@XmlRootElement(name = "LibraryRefElement")
public class LibraryRef extends org.hl7.fhir.jaxb.DomainResourceRef  {

	

	
	@Override
	public Library createInstance() {
		return FhirFactory.eINSTANCE.createLibrary();
	}
	
	public static LibraryRef valueOf(String id) {
		LibraryRef result = new LibraryRef();
		result.setID(id);
		return result;
	}

	@Override
	public String toString() {
		return getID();
	}
	

}