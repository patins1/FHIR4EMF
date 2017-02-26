package org.hl7.fhir.jaxb;

import org.hl7.fhir.FhirFactory;
import org.hl7.fhir.QualityType;

import javax.xml.bind.annotation.adapters.XmlAdapter;
	
import org.hl7.fhir.QualityTypeList;
	
	
	
	

public class QualityTypeImplAdapter extends XmlAdapter<String, QualityType> {

	@Override
	public QualityType unmarshal(String v) throws Exception {
		QualityType result = FhirFactory.eINSTANCE.createQualityType();
		result.setValue(QualityTypeList.get(v));
		return result;
	}

	@Override
	public String marshal(QualityType v) throws Exception {
		return v.getValue().getLiteral();
	}

}
