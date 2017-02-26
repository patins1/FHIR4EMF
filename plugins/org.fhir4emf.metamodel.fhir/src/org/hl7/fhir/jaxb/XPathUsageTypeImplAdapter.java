package org.hl7.fhir.jaxb;

import org.hl7.fhir.FhirFactory;
import org.hl7.fhir.XPathUsageType;

import javax.xml.bind.annotation.adapters.XmlAdapter;
	
import org.hl7.fhir.XPathUsageTypeList;
	
	
	
	

public class XPathUsageTypeImplAdapter extends XmlAdapter<String, XPathUsageType> {

	@Override
	public XPathUsageType unmarshal(String v) throws Exception {
		XPathUsageType result = FhirFactory.eINSTANCE.createXPathUsageType();
		result.setValue(XPathUsageTypeList.get(v));
		return result;
	}

	@Override
	public String marshal(XPathUsageType v) throws Exception {
		return v.getValue().getLiteral();
	}

}
