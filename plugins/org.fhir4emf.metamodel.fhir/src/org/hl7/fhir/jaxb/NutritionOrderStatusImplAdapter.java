package org.hl7.fhir.jaxb;

import org.hl7.fhir.FhirFactory;
import org.hl7.fhir.NutritionOrderStatus;

import javax.xml.bind.annotation.adapters.XmlAdapter;
	
import org.hl7.fhir.NutritionOrderStatusList;
	
	
	
	

public class NutritionOrderStatusImplAdapter extends XmlAdapter<String, NutritionOrderStatus> {

	@Override
	public NutritionOrderStatus unmarshal(String v) throws Exception {
		NutritionOrderStatus result = FhirFactory.eINSTANCE.createNutritionOrderStatus();
		result.setValue(NutritionOrderStatusList.get(v));
		return result;
	}

	@Override
	public String marshal(NutritionOrderStatus v) throws Exception {
		return v.getValue().getLiteral();
	}

}
