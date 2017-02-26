package org.hl7.fhir.jaxb;

import javax.xml.bind.annotation.*;
import org.eclipse.emf.ecore.jaxb.*;

import org.hl7.fhir.FhirFactory;
import org.hl7.fhir.StructureMapRule;

@XmlRootElement(name = "StructureMapRuleRefElement")
public class StructureMapRuleRef extends org.hl7.fhir.jaxb.BackboneElementRef  {

	

	
	@Override
	public StructureMapRule createInstance() {
		return FhirFactory.eINSTANCE.createStructureMapRule();
	}
	
	public static StructureMapRuleRef valueOf(String id) {
		StructureMapRuleRef result = new StructureMapRuleRef();
		result.setID(id);
		return result;
	}

	@Override
	public String toString() {
		return getID();
	}
	

}