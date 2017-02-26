package org.hl7.fhir.jaxb;

import org.hl7.fhir.FhirFactory;
import org.hl7.fhir.PositiveInt;

import javax.xml.bind.annotation.adapters.XmlAdapter;
	
import java.math.BigInteger;
	
	
	
	

public class PositiveIntImplAdapter extends XmlAdapter<BigInteger, PositiveInt> {

	@Override
	public PositiveInt unmarshal(BigInteger v) throws Exception {
		PositiveInt result = FhirFactory.eINSTANCE.createPositiveInt();
		result.setValue(v);
		return result;
	}

	@Override
	public BigInteger marshal(PositiveInt v) throws Exception {
		return v.getValue();
	}

}
