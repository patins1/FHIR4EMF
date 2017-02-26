package org.hl7.fhir.jaxb;

import org.hl7.fhir.AdministrativeGender;
import org.hl7.fhir.FhirFactory;

import javax.xml.bind.annotation.adapters.XmlAdapter;
	
import org.hl7.fhir.AdministrativeGenderList;
	
	
	
	

public class AdministrativeGenderImplAdapter extends XmlAdapter<String, AdministrativeGender> {

	@Override
	public AdministrativeGender unmarshal(String v) throws Exception {
		AdministrativeGender result = FhirFactory.eINSTANCE.createAdministrativeGender();
		result.setValue(AdministrativeGenderList.get(v));
		return result;
	}

	@Override
	public String marshal(AdministrativeGender v) throws Exception {
		return v.getValue().getLiteral();
	}

}
