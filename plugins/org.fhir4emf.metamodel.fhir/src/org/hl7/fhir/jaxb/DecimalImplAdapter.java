package org.hl7.fhir.jaxb;

import org.hl7.fhir.Decimal;
import org.hl7.fhir.FhirFactory;

import javax.xml.bind.annotation.adapters.XmlAdapter;
	
import java.math.BigDecimal;
	
	
	
	

public class DecimalImplAdapter extends XmlAdapter<BigDecimal, Decimal> {

	@Override
	public Decimal unmarshal(BigDecimal v) throws Exception {
		Decimal result = FhirFactory.eINSTANCE.createDecimal();
		result.setValue(v);
		return result;
	}

	@Override
	public BigDecimal marshal(Decimal v) throws Exception {
		return v.getValue();
	}

}
