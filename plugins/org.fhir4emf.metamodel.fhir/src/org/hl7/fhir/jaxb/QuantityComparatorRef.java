package org.hl7.fhir.jaxb;

import javax.xml.bind.annotation.*;
import org.eclipse.emf.ecore.jaxb.*;

import org.hl7.fhir.FhirFactory;
import org.hl7.fhir.QuantityComparator;

@XmlRootElement(name = "QuantityComparatorRefElement")
public class QuantityComparatorRef extends org.hl7.fhir.jaxb.ElementRef  {

	

	
	@Override
	public QuantityComparator createInstance() {
		return FhirFactory.eINSTANCE.createQuantityComparator();
	}
	
	public static QuantityComparatorRef valueOf(String id) {
		QuantityComparatorRef result = new QuantityComparatorRef();
		result.setID(id);
		return result;
	}

	@Override
	public String toString() {
		return getID();
	}
	

}