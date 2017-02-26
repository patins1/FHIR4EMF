package org.hl7.fhir.jaxb;

import javax.xml.bind.annotation.*;
import org.eclipse.emf.ecore.jaxb.*;

import org.hl7.fhir.CodeSystemHierarchyMeaning;
import org.hl7.fhir.FhirFactory;

@XmlRootElement(name = "CodeSystemHierarchyMeaningRefElement")
public class CodeSystemHierarchyMeaningRef extends org.hl7.fhir.jaxb.ElementRef  {

	

	
	@Override
	public CodeSystemHierarchyMeaning createInstance() {
		return FhirFactory.eINSTANCE.createCodeSystemHierarchyMeaning();
	}
	
	public static CodeSystemHierarchyMeaningRef valueOf(String id) {
		CodeSystemHierarchyMeaningRef result = new CodeSystemHierarchyMeaningRef();
		result.setID(id);
		return result;
	}

	@Override
	public String toString() {
		return getID();
	}
	

}