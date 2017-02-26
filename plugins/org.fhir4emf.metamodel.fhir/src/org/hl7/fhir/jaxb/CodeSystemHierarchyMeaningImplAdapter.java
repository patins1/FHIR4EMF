package org.hl7.fhir.jaxb;

import org.hl7.fhir.CodeSystemHierarchyMeaning;
import org.hl7.fhir.FhirFactory;

import javax.xml.bind.annotation.adapters.XmlAdapter;
	
import org.hl7.fhir.CodeSystemHierarchyMeaningList;
	
	
	
	

public class CodeSystemHierarchyMeaningImplAdapter extends XmlAdapter<String, CodeSystemHierarchyMeaning> {

	@Override
	public CodeSystemHierarchyMeaning unmarshal(String v) throws Exception {
		CodeSystemHierarchyMeaning result = FhirFactory.eINSTANCE.createCodeSystemHierarchyMeaning();
		result.setValue(CodeSystemHierarchyMeaningList.get(v));
		return result;
	}

	@Override
	public String marshal(CodeSystemHierarchyMeaning v) throws Exception {
		return v.getValue().getLiteral();
	}

}
