package org.hl7.fhir.jaxb;

import org.hl7.fhir.ContributorType;
import org.hl7.fhir.FhirFactory;

import javax.xml.bind.annotation.adapters.XmlAdapter;
	
import org.hl7.fhir.ContributorTypeList;
	
	
	
	

public class ContributorTypeImplAdapter extends XmlAdapter<String, ContributorType> {

	@Override
	public ContributorType unmarshal(String v) throws Exception {
		ContributorType result = FhirFactory.eINSTANCE.createContributorType();
		result.setValue(ContributorTypeList.get(v));
		return result;
	}

	@Override
	public String marshal(ContributorType v) throws Exception {
		return v.getValue().getLiteral();
	}

}
