package org.hl7.fhir.jaxb;

import javax.xml.bind.annotation.*;
import org.eclipse.emf.ecore.jaxb.*;

import org.hl7.fhir.FhirFactory;
import org.hl7.fhir.ValueSetFilter;

@XmlRootElement(name = "ValueSetFilterRefElement")
public class ValueSetFilterRef extends org.hl7.fhir.jaxb.BackboneElementRef  {

	

	
	@Override
	public ValueSetFilter createInstance() {
		return FhirFactory.eINSTANCE.createValueSetFilter();
	}
	
	public static ValueSetFilterRef valueOf(String id) {
		ValueSetFilterRef result = new ValueSetFilterRef();
		result.setID(id);
		return result;
	}

	@Override
	public String toString() {
		return getID();
	}
	

}