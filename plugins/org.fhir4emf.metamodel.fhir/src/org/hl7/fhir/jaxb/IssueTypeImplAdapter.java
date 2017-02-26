package org.hl7.fhir.jaxb;

import org.hl7.fhir.FhirFactory;
import org.hl7.fhir.IssueType;

import javax.xml.bind.annotation.adapters.XmlAdapter;
	
import org.hl7.fhir.IssueTypeList;
	
	
	
	

public class IssueTypeImplAdapter extends XmlAdapter<String, IssueType> {

	@Override
	public IssueType unmarshal(String v) throws Exception {
		IssueType result = FhirFactory.eINSTANCE.createIssueType();
		result.setValue(IssueTypeList.get(v));
		return result;
	}

	@Override
	public String marshal(IssueType v) throws Exception {
		return v.getValue().getLiteral();
	}

}
