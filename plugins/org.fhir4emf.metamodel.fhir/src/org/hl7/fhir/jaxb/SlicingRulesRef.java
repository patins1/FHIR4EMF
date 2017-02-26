package org.hl7.fhir.jaxb;

import javax.xml.bind.annotation.*;
import org.eclipse.emf.ecore.jaxb.*;

import org.hl7.fhir.FhirFactory;
import org.hl7.fhir.SlicingRules;

@XmlRootElement(name = "SlicingRulesRefElement")
public class SlicingRulesRef extends org.hl7.fhir.jaxb.ElementRef  {

	

	
	@Override
	public SlicingRules createInstance() {
		return FhirFactory.eINSTANCE.createSlicingRules();
	}
	
	public static SlicingRulesRef valueOf(String id) {
		SlicingRulesRef result = new SlicingRulesRef();
		result.setID(id);
		return result;
	}

	@Override
	public String toString() {
		return getID();
	}
	

}