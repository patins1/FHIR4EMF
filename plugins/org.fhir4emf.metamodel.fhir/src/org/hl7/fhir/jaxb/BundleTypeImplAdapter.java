package org.hl7.fhir.jaxb;

import org.hl7.fhir.BundleType;
import org.hl7.fhir.FhirFactory;

import javax.xml.bind.annotation.adapters.XmlAdapter;
	
import org.hl7.fhir.BundleTypeList;
	
	
	
	

public class BundleTypeImplAdapter extends XmlAdapter<String, BundleType> {

	@Override
	public BundleType unmarshal(String v) throws Exception {
		BundleType result = FhirFactory.eINSTANCE.createBundleType();
		result.setValue(BundleTypeList.get(v));
		return result;
	}

	@Override
	public String marshal(BundleType v) throws Exception {
		return v.getValue().getLiteral();
	}

}
