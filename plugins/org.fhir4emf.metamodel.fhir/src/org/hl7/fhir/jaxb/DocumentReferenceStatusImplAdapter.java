package org.hl7.fhir.jaxb;

import org.hl7.fhir.DocumentReferenceStatus;
import org.hl7.fhir.FhirFactory;

import javax.xml.bind.annotation.adapters.XmlAdapter;
	
import org.hl7.fhir.DocumentReferenceStatusList;
	
	
	
	

public class DocumentReferenceStatusImplAdapter extends XmlAdapter<String, DocumentReferenceStatus> {

	@Override
	public DocumentReferenceStatus unmarshal(String v) throws Exception {
		DocumentReferenceStatus result = FhirFactory.eINSTANCE.createDocumentReferenceStatus();
		result.setValue(DocumentReferenceStatusList.get(v));
		return result;
	}

	@Override
	public String marshal(DocumentReferenceStatus v) throws Exception {
		return v.getValue().getLiteral();
	}

}
