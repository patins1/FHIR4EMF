package org.hl7.fhir.jaxb;

import org.hl7.fhir.AllergyIntoleranceType;
import org.hl7.fhir.FhirFactory;

import javax.xml.bind.annotation.adapters.XmlAdapter;
	
import org.hl7.fhir.AllergyIntoleranceTypeList;
	
	
	
	

public class AllergyIntoleranceTypeImplAdapter extends XmlAdapter<String, AllergyIntoleranceType> {

	@Override
	public AllergyIntoleranceType unmarshal(String v) throws Exception {
		AllergyIntoleranceType result = FhirFactory.eINSTANCE.createAllergyIntoleranceType();
		result.setValue(AllergyIntoleranceTypeList.get(v));
		return result;
	}

	@Override
	public String marshal(AllergyIntoleranceType v) throws Exception {
		return v.getValue().getLiteral();
	}

}
