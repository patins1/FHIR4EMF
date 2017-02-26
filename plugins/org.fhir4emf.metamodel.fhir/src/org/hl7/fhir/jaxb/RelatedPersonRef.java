package org.hl7.fhir.jaxb;

import javax.xml.bind.annotation.*;
import org.eclipse.emf.ecore.jaxb.*;

import org.hl7.fhir.FhirFactory;
import org.hl7.fhir.RelatedPerson;

@XmlRootElement(name = "RelatedPersonRefElement")
public class RelatedPersonRef extends org.hl7.fhir.jaxb.DomainResourceRef  {

	

	
	@Override
	public RelatedPerson createInstance() {
		return FhirFactory.eINSTANCE.createRelatedPerson();
	}
	
	public static RelatedPersonRef valueOf(String id) {
		RelatedPersonRef result = new RelatedPersonRef();
		result.setID(id);
		return result;
	}

	@Override
	public String toString() {
		return getID();
	}
	

}