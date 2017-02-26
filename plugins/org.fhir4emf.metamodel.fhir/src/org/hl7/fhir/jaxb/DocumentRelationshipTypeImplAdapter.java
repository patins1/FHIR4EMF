package org.hl7.fhir.jaxb;

import org.hl7.fhir.DocumentRelationshipType;
import org.hl7.fhir.FhirFactory;

import javax.xml.bind.annotation.adapters.XmlAdapter;
	
import org.hl7.fhir.DocumentRelationshipTypeList;
	
	
	
	

public class DocumentRelationshipTypeImplAdapter extends XmlAdapter<String, DocumentRelationshipType> {

	@Override
	public DocumentRelationshipType unmarshal(String v) throws Exception {
		DocumentRelationshipType result = FhirFactory.eINSTANCE.createDocumentRelationshipType();
		result.setValue(DocumentRelationshipTypeList.get(v));
		return result;
	}

	@Override
	public String marshal(DocumentRelationshipType v) throws Exception {
		return v.getValue().getLiteral();
	}

}
