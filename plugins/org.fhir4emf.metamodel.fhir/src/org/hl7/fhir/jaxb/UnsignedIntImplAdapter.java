package org.hl7.fhir.jaxb;

import org.hl7.fhir.FhirFactory;
import org.hl7.fhir.UnsignedInt;

import javax.xml.bind.annotation.adapters.XmlAdapter;
	
import java.math.BigInteger;
	
	
	
	

public class UnsignedIntImplAdapter extends XmlAdapter<BigInteger, UnsignedInt> {

	@Override
	public UnsignedInt unmarshal(BigInteger v) throws Exception {
		UnsignedInt result = FhirFactory.eINSTANCE.createUnsignedInt();
		result.setValue(v);
		return result;
	}

	@Override
	public BigInteger marshal(UnsignedInt v) throws Exception {
		return v.getValue();
	}

}
