package org.hl7.fhir.jaxb;

import javax.xml.bind.annotation.*;
import org.eclipse.emf.ecore.jaxb.*;

import org.hl7.fhir.FhirFactory;
import org.hl7.fhir.Meta;

@XmlRootElement(name = "MetaRefElement")
public class MetaRef extends org.hl7.fhir.jaxb.ElementRef  {

	

	
	@Override
	public Meta createInstance() {
		return FhirFactory.eINSTANCE.createMeta();
	}
	
	public static MetaRef valueOf(String id) {
		MetaRef result = new MetaRef();
		result.setID(id);
		return result;
	}

	@Override
	public String toString() {
		return getID();
	}
	

}