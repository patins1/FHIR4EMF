package org.hl7.fhir.jaxb;

import javax.xml.bind.annotation.*;
import org.eclipse.emf.ecore.jaxb.*;

import org.hl7.fhir.FhirFactory;
import org.hl7.fhir.TypeDerivationRule;

@XmlRootElement(name = "TypeDerivationRuleRefElement")
public class TypeDerivationRuleRef extends org.hl7.fhir.jaxb.ElementRef  {

	

	
	@Override
	public TypeDerivationRule createInstance() {
		return FhirFactory.eINSTANCE.createTypeDerivationRule();
	}
	
	public static TypeDerivationRuleRef valueOf(String id) {
		TypeDerivationRuleRef result = new TypeDerivationRuleRef();
		result.setID(id);
		return result;
	}

	@Override
	public String toString() {
		return getID();
	}
	

}